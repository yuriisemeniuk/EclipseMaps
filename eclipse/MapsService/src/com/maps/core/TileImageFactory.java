package com.maps.core;

import java.io.InputStream;

public interface TileImageFactory {
	public TileImage getTileImage(InputStream stram);

	public TileImage getTileImage(int type);
}
