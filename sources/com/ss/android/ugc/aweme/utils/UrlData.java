package com.ss.android.ugc.aweme.utils;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UrlData extends F9E {

    @InterfaceC65349Pkn("link")
    public final String link;

    /* JADX WARN: Multi-variable type inference failed */
    public UrlData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.link};
    }

    public UrlData(String link) {
        o.LJIIIZ(link, "link");
        this.link = link;
    }

    public /* synthetic */ UrlData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
