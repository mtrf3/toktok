package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LinkInfo extends F9E {

    @InterfaceC65349Pkn("action_type")
    public final int actionType;

    @InterfaceC65349Pkn("link_url")
    public final String linkUrl;

    public static /* synthetic */ LinkInfo copy$default(LinkInfo linkInfo, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = linkInfo.linkUrl;
        }
        if ((i2 & 2) != 0) {
            i = linkInfo.actionType;
        }
        return linkInfo.copy(str, i);
    }

    public final LinkInfo copy(String linkUrl, int i) {
        o.LJIIIZ(linkUrl, "linkUrl");
        return new LinkInfo(linkUrl, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.linkUrl, Integer.valueOf(this.actionType)};
    }

    public final int getActionType() {
        return this.actionType;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public LinkInfo(String linkUrl, int i) {
        o.LJIIIZ(linkUrl, "linkUrl");
        this.linkUrl = linkUrl;
        this.actionType = i;
    }
}
