package org.area515.resinprinter.security;

import java.util.List;

import org.area515.resinprinter.plugin.Feature;

public interface FriendshipFeature<T> extends Feature {
	public Friend sendFriendRequest(PhotonicUser me, PhotonicUser myNewFriend) throws UserManagementException;
	public List<Friend> getFriendRequests() throws UserManagementException;
	public void acceptFriendRequest(Friend newFriend);
	public String getName();
}
