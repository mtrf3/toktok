package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K3Z {
    public final int LIZ = 0;
    public final int LIZIZ = 0;
    public final int LIZJ = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K3Z)) {
            return false;
        }
        K3Z k3z = (K3Z) obj;
        return this.LIZ == k3z.LIZ && this.LIZIZ == k3z.LIZIZ && this.LIZJ == k3z.LIZJ && o.LJ(null, null);
    }

    public final int hashCode() {
        return C0EH.LIZ(((this.LIZ * 31) + this.LIZIZ) * 31, this.LIZJ, 31, 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicDownloadStatus(status=");
        LIZ.append(this.LIZ);
        LIZ.append(", percent=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", errorMsg=");
        LIZ.append(this.LIZJ);
        LIZ.append(", toVideoProgress=");
        LIZ.append((Object) null);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }
}
