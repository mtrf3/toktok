package com.ss.android.ugc.aweme.shortvideo;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class PostPrompts implements Serializable {

    @InterfaceC65349Pkn("title")
    public String dialogTitle;

    @InterfaceC65349Pkn("go_back")
    public String goBack;

    @InterfaceC65349Pkn("post_anyway")
    public String postAnyway;

    @InterfaceC65349Pkn("text")
    public String text;

    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    public final String getGoBack() {
        return this.goBack;
    }

    public final String getPostAnyway() {
        return this.postAnyway;
    }

    public final String getText() {
        return this.text;
    }

    public final void setDialogTitle(String str) {
        this.dialogTitle = str;
    }

    public final void setGoBack(String str) {
        this.goBack = str;
    }

    public final void setPostAnyway(String str) {
        this.postAnyway = str;
    }

    public final void setText(String str) {
        this.text = str;
    }
}
