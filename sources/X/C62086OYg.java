package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OYg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62086OYg {
    public final android.net.Uri LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62086OYg)) {
            return false;
        }
        C62086OYg c62086OYg = (C62086OYg) obj;
        return o.LJ(this.LIZ, c62086OYg.LIZ) && o.LJ(this.LIZIZ, c62086OYg.LIZIZ) && this.LIZJ == c62086OYg.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        android.net.Uri uri = this.LIZ;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageWrapperVo(uri=");
        LIZ.append(this.LIZ);
        LIZ.append(", path=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isLocalCache=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C62086OYg(android.net.Uri uri, String str, boolean z) {
        this.LIZ = uri;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
