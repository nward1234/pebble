/*******************************************************************************
 * This file is part of Pebble.
 * 
 * Original work Copyright (c) 2009-2013 by the Twig Team
 * Modified work Copyright (c) 2013 by Mitchell Bösecke
 * 
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 ******************************************************************************/
package com.mitchellbosecke.pebble.test;

import java.util.List;

import com.mitchellbosecke.pebble.utils.Command;

public class TestFunction implements Test {

	private final String tag;

	private final Command<Boolean, List<Object>> function;

	public TestFunction(String tag, Command<Boolean, List<Object>> function) {
		this.tag = tag;
		this.function = function;
	}

	@Override
	public String getTag() {
		return tag;
	}

	@Override
	public Boolean apply(List<Object> args) {
		return function.execute(args);
	}

}