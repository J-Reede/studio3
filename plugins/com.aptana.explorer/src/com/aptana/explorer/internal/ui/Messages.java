/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.explorer.internal.ui;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS
{
	private static final String BUNDLE_NAME = "com.aptana.explorer.internal.ui.messages"; //$NON-NLS-1$

	public static String FilteringProjectView_LBL_FilteringFor;

	public static String FilteringProjectView_SearchByFilenameLabel;

	public static String FilteringProjectView_SearchContentLabel;

	public static String GitProjectView_BranchDirtyTooltipMessage;
	public static String GitProjectView_ChangedFilesFilterTooltip;
	public static String GitProjectView_createNewBranchOption;
	public static String GitProjectView_PullChangesTooltipMessage;
	public static String GitProjectView_PushChangesTooltipMessage;

	public static String SingleProjectView_OpenBrowserItem;
	public static String SingleProjectView_OpenSSHSubmenuLabel;
	public static String SingleProjectView_RecipesSubmenuLabel;
	public static String SingleProjectView_DeleteProjectMenuItem_LBL;
	public static String SingleProjectView_DeploymentSubmenuLabel;
	public static String SingleProjectView_SharingSubmenuLabel;
	public static String SingleProjectView_DatabaseSubmenuLabel;
	public static String SingleProjectView_DownloadItem;
	public static String SingleProjectView_MaintenanceSubmenuLabel;
	public static String SingleProjectView_RemoteSubmenuLabel;
	public static String SingleProjectView_ConfigVarsSubmenuLabel;
	public static String SingleProjectView_FTPSettingItem;
	public static String SingleProjectView_TTP_Commands;
	public static String SingleProjectView_TTP_Deploy;
	public static String SingleProjectView_UploadItem;
	
	static
	{
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages()
	{
	}
}
