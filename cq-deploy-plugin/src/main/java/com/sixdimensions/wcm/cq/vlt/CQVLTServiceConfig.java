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
package com.sixdimensions.wcm.cq.vlt;

import java.io.File;

import com.sixdimensions.wcm.cq.service.CQServiceConfig;

/**
 * Service configuration object for interacting with VLT.
 * 
 * @author dklco
 */
public class CQVLTServiceConfig extends CQServiceConfig {

	/**
	 * Root of the files for VLT to act upon.
	 */
	private String root;

	/**
	 * A file reference to the VLT Executable.
	 */
	private File vltExe;

	/**
	 * The root of the files for VLT to act upon, relative to the project root.
	 * 
	 * @return the root
	 */
	public String getRoot() {
		return root;
	}

	/**
	 * A file reference to the VLT executable.
	 * 
	 * @return the vlt executable
	 */
	public File getVltExe() {
		return vltExe;
	}

	/**
	 * Set the root of the files for VLT to act upon, relative to the project
	 * root.
	 * 
	 * @param root
	 */
	public void setRoot(String root) {
		this.root = root;
	}

	/**
	 * Sets the VLT Executable file.
	 * 
	 * @param vltExe
	 *            a reference to the VLT executable
	 */
	public void setVltExe(File vltExe) {
		this.vltExe = vltExe;
	}

}
