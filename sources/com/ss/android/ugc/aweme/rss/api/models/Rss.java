package com.ss.android.ugc.aweme.rss.api.models;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Rss {

    @InterfaceC65349Pkn("url")
    public final String rssUrl;

    @InterfaceC65349Pkn("status")
    public final int status;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rss)) {
            return false;
        }
        Rss rss = (Rss) obj;
        return o.LJ(this.rssUrl, rss.rssUrl) && this.status == rss.status;
    }

    public final int hashCode() {
        String str = this.rssUrl;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.status;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Rss(rssUrl=");
        LIZ.append(this.rssUrl);
        LIZ.append(", status=");
        return b0.LIZJ(LIZ, this.status, ')', LIZ);
    }

    public Rss(String str, int i) {
        this.rssUrl = str;
        this.status = i;
    }
}
