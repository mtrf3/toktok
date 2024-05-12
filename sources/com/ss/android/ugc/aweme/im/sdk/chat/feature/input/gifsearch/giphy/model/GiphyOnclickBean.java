package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GiphyOnclickBean {

    @InterfaceC65349Pkn("url")
    public final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public GiphyOnclickBean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GiphyOnclickBean) && o.LJ(this.url, ((GiphyOnclickBean) obj).url);
    }

    public final int hashCode() {
        String str = this.url;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiphyOnclickBean(url=");
        return q.LIZIZ(LIZ, this.url, ')', LIZ);
    }

    public GiphyOnclickBean(String str) {
        this.url = str;
    }

    public /* synthetic */ GiphyOnclickBean(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
