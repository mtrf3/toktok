package X;

import defpackage.b0;

/* renamed from: X.1L2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1L2 extends AbstractC07660Ru {
    public final long LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1L2)) {
            return false;
        }
        C1L2 c1l2 = (C1L2) obj;
        return this.LIZ == c1l2.LIZ && this.LIZIZ == c1l2.LIZIZ;
    }

    public final int hashCode() {
        return (C16880lQ.LLJIJIL(this.LIZ) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DownloadProgressChange(songId=");
        LIZ.append(this.LIZ);
        LIZ.append(", progress=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C1L2(long j, int i) {
        this.LIZ = j;
        this.LIZIZ = i;
    }
}
