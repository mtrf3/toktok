package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes10.dex */
public class FriendNotice {

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("schema_url")
    public String openUrl;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("from_user")
    public User user;

    public String getContent() {
        return this.content;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public int getType() {
        return this.type;
    }

    public User getUser() {
        return this.user;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
