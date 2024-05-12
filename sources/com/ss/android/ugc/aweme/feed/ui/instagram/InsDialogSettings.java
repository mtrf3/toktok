package com.ss.android.ugc.aweme.feed.ui.instagram;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InsDialogSettings {

    @InterfaceC65349Pkn("title")
    public String title = "title";

    @InterfaceC65349Pkn("body")
    public String body = "body";

    @InterfaceC65349Pkn("ok_btn_text")
    public String okBtnText = "ok";

    @InterfaceC65349Pkn("cancel_btn_text")
    public String cancelBtnText = "not now";

    @InterfaceC65349Pkn("jump_url")
    public String jumpUrl = "";

    public final String getBody() {
        return this.body;
    }

    public final String getCancelBtnText() {
        return this.cancelBtnText;
    }

    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final String getOkBtnText() {
        return this.okBtnText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBody(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.body = str;
    }

    public final void setCancelBtnText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.cancelBtnText = str;
    }

    public final void setJumpUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.jumpUrl = str;
    }

    public final void setOkBtnText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.okBtnText = str;
    }

    public final void setTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.title = str;
    }
}
