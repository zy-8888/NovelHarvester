package com.unclezs.novel.app.jfx.plugin.packager.utils;

/**
 * Icon utils
 */
public class IconUtils {

	public static String getIconFileExtensionByPlatform(Platform platform) {
		switch (platform) {
		case linux: 	return ".png";
		case mac: 		return ".icns";
		case windows: 	return ".ico";
		default:		return null;
		}
	}

}
