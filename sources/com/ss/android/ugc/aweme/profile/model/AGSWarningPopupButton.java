package com.ss.android.ugc.aweme.profile.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AGSWarningPopupButton extends F9E implements Serializable {

    @InterfaceC65349Pkn("btn_content")
    public final String content;

    @InterfaceC65349Pkn("btn_url")
    public final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public AGSWarningPopupButton() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AGSWarningPopupButton copy$default(AGSWarningPopupButton aGSWarningPopupButton, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aGSWarningPopupButton.content;
        }
        if ((i & 2) != 0) {
            str2 = aGSWarningPopupButton.url;
        }
        return aGSWarningPopupButton.copy(str, str2);
    }

    public final AGSWarningPopupButton copy(String content, String url) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(url, "url");
        return new AGSWarningPopupButton(content, url);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.content, this.url};
    }

    public final String getContent() {
        return this.content;
    }

    public final String getUrl() {
        return this.url;
    }

    public AGSWarningPopupButton(String content, String url) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(url, "url");
        this.content = content;
        this.url = url;
    }

    public /* synthetic */ AGSWarningPopupButton(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
