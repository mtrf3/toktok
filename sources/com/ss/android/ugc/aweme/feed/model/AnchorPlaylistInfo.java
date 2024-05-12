package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AnchorPlaylistInfo implements Serializable {

    @InterfaceC65349Pkn("is_authorized")
    public boolean isAuthorized;

    @InterfaceC65349Pkn("third_auth_url")
    public String thirdAuthUrl = "";

    @InterfaceC65349Pkn("inner_auth_url")
    public String innerAuthUrl = "";

    @InterfaceC65349Pkn("selection_url")
    public String selectionUrl = "";

    public final String getInnerAuthUrl() {
        return this.innerAuthUrl;
    }

    public final String getSelectionUrl() {
        return this.selectionUrl;
    }

    public final String getThirdAuthUrl() {
        return this.thirdAuthUrl;
    }

    public final boolean isAuthorized() {
        return this.isAuthorized;
    }

    public final void setAuthorized(boolean z) {
        this.isAuthorized = z;
    }

    public final void setInnerAuthUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.innerAuthUrl = str;
    }

    public final void setSelectionUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.selectionUrl = str;
    }

    public final void setThirdAuthUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.thirdAuthUrl = str;
    }
}
