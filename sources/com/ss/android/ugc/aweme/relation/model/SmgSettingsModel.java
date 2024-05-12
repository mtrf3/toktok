package com.ss.android.ugc.aweme.relation.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class SmgSettingsModel implements Serializable {

    @InterfaceC65349Pkn("footer_invite_all")
    public boolean isFloatInviteAll;

    @InterfaceC65349Pkn("show_invite_all")
    public boolean isShowInviteAll;

    @InterfaceC65349Pkn("limit_invite_all")
    public final int limitInviteAllCount;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("url")
    public String url;

    public final int getLimitInviteAllCount() {
        return this.limitInviteAllCount;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isFloatInviteAll() {
        return this.isFloatInviteAll;
    }

    public final boolean isShowInviteAll() {
        return this.isShowInviteAll;
    }

    public final void setFloatInviteAll(boolean z) {
        this.isFloatInviteAll = z;
    }

    public final void setShowInviteAll(boolean z) {
        this.isShowInviteAll = z;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
