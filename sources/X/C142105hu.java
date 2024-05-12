package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.5hu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142105hu {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C142105hu)) {
            return false;
        }
        C142105hu c142105hu = (C142105hu) obj;
        return o.LJ(this.LIZ, c142105hu.LIZ) && this.LIZIZ == c142105hu.LIZIZ && o.LJ(this.LIZJ, c142105hu.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31;
        String str2 = this.LIZJ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AEDModelResult(localPath=");
        LIZ.append(this.LIZ);
        LIZ.append(", errorCode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", errorMsg=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C142105hu(String str, int i, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
    }
}
