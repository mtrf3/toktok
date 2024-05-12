package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes10.dex */
public class FriendTabStruct {

    @InterfaceC65349Pkn("default_follow_tab")
    public Boolean defaultFollowTab;

    @InterfaceC65349Pkn("friend_tab_desc")
    public String friendTabDesc;

    public Boolean getDefaultFollowTab() {
        Boolean bool = this.defaultFollowTab;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public String getFriendTabDesc() {
        String str = this.friendTabDesc;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }
}
