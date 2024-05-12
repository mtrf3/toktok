package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CallToActionBarInfo implements Serializable {

    @InterfaceC65349Pkn("text")
    public String text = "";

    @InterfaceC65349Pkn("button_text")
    public String buttonText = "";

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getText() {
        return this.text;
    }

    public final void setButtonText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.buttonText = str;
    }

    public final void setText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.text = str;
    }
}
