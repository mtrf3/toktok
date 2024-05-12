package com.ss.android.ugc.aweme.music.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TTMStoreLink extends F9E implements Serializable {

    @InterfaceC65349Pkn("data")
    public String data;

    @InterfaceC65349Pkn("link")
    public String link;

    public TTMStoreLink() {
    }

    public static /* synthetic */ TTMStoreLink copy$default(TTMStoreLink tTMStoreLink, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tTMStoreLink.link;
        }
        if ((i & 2) != 0) {
            str2 = tTMStoreLink.data;
        }
        return tTMStoreLink.copy(str, str2);
    }

    public final TTMStoreLink copy(String link, String data) {
        o.LJIIIZ(link, "link");
        o.LJIIIZ(data, "data");
        return new TTMStoreLink(link, data);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.link, this.data};
    }

    public final String getData() {
        return this.data;
    }

    public final String getLink() {
        return this.link;
    }

    public TTMStoreLink(String link, String data) {
        o.LJIIIZ(link, "link");
        o.LJIIIZ(data, "data");
        this.link = link;
        this.data = data;
    }
}
