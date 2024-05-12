package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class RelationLabelExtra implements Serializable {

    @InterfaceC65349Pkn("after_text")
    public String afterText = "";

    @InterfaceC65349Pkn("comment_id")
    public String cid = "";

    @InterfaceC65349Pkn("tab_text")
    public String tabText = "";

    public final String getAfterText() {
        return this.afterText;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getTabText() {
        return this.tabText;
    }

    public final void setAfterText(String str) {
        this.afterText = str;
    }

    public final void setCid(String str) {
        this.cid = str;
    }

    public final void setTabText(String str) {
        this.tabText = str;
    }
}
