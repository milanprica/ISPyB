/*******************************************************************************
 * This file is part of ISPyB.
 * 
 * ISPyB is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * ISPyB is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with ISPyB.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors : S. Delageniere, R. Leal, L. Launer, K. Levik, S. Veyrier, P. Brenchereau, M. Bodin, A. De Maria Antolinos
 ******************************************************************************/
/*
 * viewExportSessionForm.java
 * @author ludovic.launer@esrf.fr
 * Oct 18, 2005
 */

package ispyb.client.mx.collection;

import java.io.Serializable;

import org.apache.struts.action.ActionForm;

/**
 * @struts.form name="viewExportSessionForm"
 */

public class viewExportSessionForm extends ActionForm implements Serializable {

static final long serialVersionUID = 0;
private String dumpLink = new String();




public String getDumpLink()					{return dumpLink;}
public void setDumpLink(String dumpLink)	{this.dumpLink = dumpLink;}
}
