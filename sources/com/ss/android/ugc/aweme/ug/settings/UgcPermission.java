package com.ss.android.ugc.aweme.ug.settings;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UgcPermission {

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("url")
    public final String url;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UgcPermission)) {
            return false;
        }
        UgcPermission ugcPermission = (UgcPermission) obj;
        return o.LJ(this.desc, ugcPermission.desc) && o.LJ(this.url, ugcPermission.url);
    }

    public final int hashCode() {
        String str = this.desc;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UgcPermission(desc=");
        LIZ.append(this.desc);
        LIZ.append(", url=");
        return q.LIZIZ(LIZ, this.url, ')', LIZ);
    }

    public UgcPermission(String str, String str2) {
        this.desc = str;
        this.url = str2;
    }
}
