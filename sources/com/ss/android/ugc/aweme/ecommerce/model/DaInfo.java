package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DaInfo {

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("name")
    public final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public DaInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DaInfo)) {
            return false;
        }
        DaInfo daInfo = (DaInfo) obj;
        return o.LJ(this.name, daInfo.name) && o.LJ(this.extra, daInfo.extra);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.extra;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DaInfo(name=");
        LIZ.append(this.name);
        LIZ.append(", extra=");
        return q.LIZIZ(LIZ, this.extra, ')', LIZ);
    }

    public DaInfo(String str, String str2) {
        this.name = str;
        this.extra = str2;
    }

    public /* synthetic */ DaInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
