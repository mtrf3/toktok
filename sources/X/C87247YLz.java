package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.YLz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87247YLz {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C87247YLz)) {
            return false;
        }
        C87247YLz c87247YLz = (C87247YLz) obj;
        return o.LJ(this.LIZ, c87247YLz.LIZ) && o.LJ(this.LIZIZ, c87247YLz.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Header(key=");
        LIZ.append(this.LIZ);
        LIZ.append(", value=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C87247YLz(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
