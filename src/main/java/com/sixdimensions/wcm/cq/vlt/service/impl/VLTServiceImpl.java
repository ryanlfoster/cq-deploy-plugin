/*
 * Copyright 2012 - Six Dimensions
 * 
 * This file is part of the CQ Deploy Plugin.
 * 
 * The CQ Deploy Plugin is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * The CQ Deploy Plugin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with the CQ Deploy Plugin.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.sixdimensions.wcm.cq.vlt.service.impl;

import org.apache.maven.plugin.logging.Log;

import com.sixdimensions.wcm.cq.vlt.CQVLTServiceConfig;
import com.sixdimensions.wcm.cq.vlt.service.VLTService;

public class VLTServiceImpl implements VLTService {
	private CQVLTServiceConfig config;
	private Log log;

	public VLTServiceImpl(CQVLTServiceConfig config) {
		this.config = config;
		this.log = config.getLog();
	}

	public void importFiles(String[] paths) {
		// TODO Auto-generated method stub
		
	}

}
