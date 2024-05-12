package com.ss.android.ugc.aweme.compliance.business.banappeal.popup.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PopAccessory extends F9E implements Serializable {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("accessory_text")
    public final String text;

    @InterfaceC65349Pkn("accessory_url")
    public final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public PopAccessory() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PopAccessory copy$default(PopAccessory popAccessory, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = popAccessory.text;
        }
        if ((i & 2) != 0) {
            str2 = popAccessory.url;
        }
        return popAccessory.copy(str, str2);
    }

    public final PopAccessory copy(String text, String url) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(url, "url");
        return new PopAccessory(text, url);
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

    public PopAccessory(String text, String url) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(url, "url");
        this.text = text;
        this.url = url;
    }

    public /* synthetic */ PopAccessory(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
