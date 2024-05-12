package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GKE {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GKE)) {
            return false;
        }
        GKE gke = (GKE) obj;
        return o.LJ(this.LIZ, gke.LIZ) && o.LJ(this.LIZIZ, gke.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Choice(videoChoice=");
        LIZ.append(this.LIZ);
        LIZ.append(", adChoice=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public GKE(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
