package com.ss.android.ugc.trill.setting;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ImagesData {

    @InterfaceC65349Pkn("light")
    public String lightUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public ImagesData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImagesData) && o.LJ(this.lightUrl, ((ImagesData) obj).lightUrl);
    }

    public final int hashCode() {
        String str = this.lightUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImagesData(lightUrl=");
        return q.LIZIZ(LIZ, this.lightUrl, ')', LIZ);
    }

    public ImagesData(String str) {
        this.lightUrl = str;
    }

    public /* synthetic */ ImagesData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
