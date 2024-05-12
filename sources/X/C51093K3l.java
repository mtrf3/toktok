package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.K3l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51093K3l {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51093K3l)) {
            return false;
        }
        C51093K3l c51093K3l = (C51093K3l) obj;
        return o.LJ(this.LIZ, c51093K3l.LIZ) && o.LJ(this.LIZIZ, c51093K3l.LIZIZ) && o.LJ(this.LIZJ, c51093K3l.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LivePlayerEntranceParam(enterFromMerge=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enterAction=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C51093K3l(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
