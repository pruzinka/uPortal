/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jasig.portal;

/**
 * Contains common ErrorIDs.
 * @author Howard Gilbert
 * @version $Revision$
 */
public class Errors {
	public static final ErrorID noResourceFile = new ErrorID("deploy","NoResource","Missing Resource file");
	public static final ErrorID noPropertyFile = new ErrorID("deploy","NoPropertyFile","Missing Property file");
	public static final ErrorID noProperty     = new ErrorID("config","NoProperty","Missing Property file");
	public static final ErrorID propInit       = new ErrorID("config","PropertyInit","Error initializing from Properties");
	public static final ErrorID startServices  = new ErrorID("config","StartServicesFail","Failed to start Portal services");
	public static final ErrorID connectDB      = new ErrorID("config","NoDatabaseConn","Unable to connect to database");
	public static final ErrorID execDB         = new ErrorID("database","SQLError","Database request failed");
	public static final ErrorID noUserInfo     = new ErrorID("database","NoUserInfo","No portal data for userid");           
	public static final ErrorID noTemplateInfo = new ErrorID("database","NoTemplateInfo","No portal data for template");           
	public static final ErrorID bug            = new ErrorID("programming","Bug","Programming error");
	public static final ErrorID badarg         = new ErrorID("programming","badarg","Invalid argument in function call");
	public static final ErrorID badstate       = new ErrorID("programming","badstate","Object is closed, not initialized, or in an incorrect state for request");
	public static final ErrorID missingdata    = new ErrorID("programming","missingdata","Data missing from an internal collection or object");
	public static final ErrorID inconsistency  = new ErrorID("programming","inconsistent","Data is internally inconsistent or malformed");
	public static final ErrorID badrequest     = new ErrorID("programming","badrequest","Program internally generated an invalid request");
	public static final ErrorID newInstance    = new ErrorID("config","newInstance","Problem loading class or creating instance");
	public static final ErrorID browserGone    = new ErrorID("user","disconnect","Browser disconnected from Servlet");
	public static final ErrorID persistout     = new ErrorID("persistance","writing","Unable to save information to disk/database");
	public static final ErrorID persistin      = new ErrorID("persistance","reading","Unable to read information from disk/database");
	public static final ErrorID remote         = new ErrorID("remote","remote","Error in Remote Server");
	public static final ErrorID XMLparse	   = new ErrorID("XML","parse","Error parsing XML");
	public static final ErrorID legacy         = new ErrorID("legacy","legacy","PortalException has no ErrorID");
}