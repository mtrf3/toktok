package com.ss.android.ugc.aweme.setting.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes10.dex */
public class FriendTabStruct {

    @InterfaceC65349Pkn("default_follow_tab")
    public boolean defaultFollowTab;

    @InterfaceC65349Pkn("friend_tab_desc")
    public String friendTabDesc;

    public FriendTabStruct setDefaultFollowTab(boolean z) {
        this.defaultFollowTab = z;
        return this;
    }

    public FriendTabStruct setFriendTabDesc(String str) {
        this.friendTabDesc = str;
        return this;
    }
}
