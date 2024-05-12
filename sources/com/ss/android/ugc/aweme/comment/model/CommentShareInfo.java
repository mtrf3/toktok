package com.ss.android.ugc.aweme.comment.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class CommentShareInfo implements Serializable {

    @InterfaceC65349Pkn("acl")
    public final CommentShareACL acl;

    @InterfaceC65349Pkn("url")
    public final String url = "";

    @InterfaceC65349Pkn("desc")
    public final String desc = "";

    @InterfaceC65349Pkn("title")
    public final String title = "";

    public final CommentShareACL getAcl() {
        return this.acl;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }
}
