package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.GcP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41897GcP {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41897GcP)) {
            return false;
        }
        C41897GcP c41897GcP = (C41897GcP) obj;
        return o.LJ(this.LIZ, c41897GcP.LIZ) && o.LJ(this.LIZIZ, c41897GcP.LIZIZ) && o.LJ(this.LIZJ, c41897GcP.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return this.LIZJ.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhotoData(srcPath=");
        LIZ.append(this.LIZ);
        LIZ.append(", watermarkPath=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", toastText=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C41897GcP(String srcPath, String str, String str2) {
        o.LJIIIZ(srcPath, "srcPath");
        this.LIZ = srcPath;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
