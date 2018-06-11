package com.bajdcc.LALR1.interpret.os.user.routine.file;

import com.bajdcc.LALR1.interpret.os.IOSCodePage;
import com.bajdcc.util.ResourceLoader;

/**
 * 【用户态】读文件
 *
 * @author bajdcc
 */
public class URFileLoad implements IOSCodePage {
	@Override
	public String getName() {
		return "/usr/p/<";
	}

	@Override
	public String getCode() {
		return ResourceLoader.load(getClass());
	}
}