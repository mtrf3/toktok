package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HVC {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HVC)) {
            return false;
        }
        HVC hvc = (HVC) obj;
        return o.LJ(this.LIZ, hvc.LIZ) && o.LJ(this.LIZIZ, hvc.LIZIZ) && o.LJ(this.LIZJ, hvc.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AlbumCoreParams(shootWay=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enterMethod=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public HVC(String str, String enterFrom, String enterMethod) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LIZ = str;
        this.LIZIZ = enterFrom;
        this.LIZJ = enterMethod;
    }
}
