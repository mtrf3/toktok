package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Rrg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70872Rrg {
    public final String LIZ;
    public boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70872Rrg)) {
            return false;
        }
        C70872Rrg c70872Rrg = (C70872Rrg) obj;
        return o.LJ(this.LIZ, c70872Rrg.LIZ) && this.LIZIZ == c70872Rrg.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PageImageModel(uri=");
        LIZ.append(this.LIZ);
        LIZ.append(", complete=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C70872Rrg(String uri) {
        o.LJIIIZ(uri, "uri");
        this.LIZ = uri;
        this.LIZIZ = false;
    }
}
