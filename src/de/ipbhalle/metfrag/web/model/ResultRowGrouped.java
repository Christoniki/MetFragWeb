/*
*
* Copyright (C) 2009-2010 IPB Halle, Sebastian Wolf
*
* Contact: swolf@ipb-halle.de
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*
*/
package de.ipbhalle.metfrag.web.model;

import java.util.ArrayList;
import java.util.List;

import de.ipbhalle.metfrag.web.controller.ResultRowGroupedBean;

public class ResultRowGrouped extends ResultRow{
	
	protected List<ResultRowGroupedBean> childResultRows = new ArrayList<ResultRowGroupedBean>();
	
	public List<ResultRowGroupedBean> getChildResultRows(){
		return childResultRows;
	}

}
