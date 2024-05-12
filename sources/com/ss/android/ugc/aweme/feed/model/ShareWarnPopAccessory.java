package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareWarnPopAccessory extends F9E implements Serializable {

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("url")
    public final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public ShareWarnPopAccessory() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ShareWarnPopAccessory copy$default(ShareWarnPopAccessory shareWarnPopAccessory, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareWarnPopAccessory.text;
        }
        if ((i & 2) != 0) {
            str2 = shareWarnPopAccessory.url;
        }
        return shareWarnPopAccessory.copy(str, str2);
    }

    public final ShareWarnPopAccessory copy(String text, String url) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(url, "url");
        return new ShareWarnPopAccessory(text, url);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.text, this.url};
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public ShareWarnPopAccessory(String text, String url) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(url, "url");
        this.text = text;
        this.url = url;
    }

    public /* synthetic */ ShareWarnPopAccessory(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
