package com.ss.android.ugc.aweme.dsp.data;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TTMStoreLinkLynx extends F9E implements Serializable {

    @InterfaceC65349Pkn("data")
    public final HashMap<String, String> data;

    @InterfaceC65349Pkn("link")
    public final String link;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TTMStoreLinkLynx copy$default(TTMStoreLinkLynx tTMStoreLinkLynx, String str, HashMap hashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tTMStoreLinkLynx.link;
        }
        if ((i & 2) != 0) {
            hashMap = tTMStoreLinkLynx.data;
        }
        return tTMStoreLinkLynx.copy(str, hashMap);
    }

    public final TTMStoreLinkLynx copy(String link, HashMap<String, String> data) {
        o.LJIIIZ(link, "link");
        o.LJIIIZ(data, "data");
        return new TTMStoreLinkLynx(link, data);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.link, this.data};
    }

    public final HashMap<String, String> getData() {
        return this.data;
    }

    public final String getLink() {
        return this.link;
    }

    public TTMStoreLinkLynx(String link, HashMap<String, String> data) {
        o.LJIIIZ(link, "link");
        o.LJIIIZ(data, "data");
        this.link = link;
        this.data = data;
    }
}
