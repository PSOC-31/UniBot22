package com.unibot.ui.listener;

import com.unibot.core.Context;
import com.unibot.ui.OpenblocksFrame;

import edu.mit.blocks.workspace.WorkspaceEvent;
import edu.mit.blocks.workspace.WorkspaceListener;

public class UniBotWorkspaceListener implements WorkspaceListener
{
	private Context context;
	private OpenblocksFrame frame;
	public UniBotWorkspaceListener(OpenblocksFrame frame)
	{
		context = Context.getContext();
		this.frame = frame;
	}
	
	public void workspaceEventOccurred(WorkspaceEvent event)
	{
		if (!context.isWorkspaceChanged())
		{
			context.setWorkspaceChanged(true);
			String title = frame.makeFrameTitle();
			if (frame != null)
			{
				frame.setTitle(title);
			}
		}
		else
		

		context.resetHightlightBlock();
		
		
		
		
	}
}
