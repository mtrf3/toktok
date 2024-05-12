package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FDP {
    public final android.net.Uri LIZ;
    public final Boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FDP)) {
            return false;
        }
        FDP fdp = (FDP) obj;
        return o.LJ(this.LIZ, fdp.LIZ) && o.LJ(this.LIZIZ, fdp.LIZIZ);
    }

    public final int hashCode() {
        android.net.Uri uri = this.LIZ;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        Boolean bool = this.LIZIZ;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Input(uri=");
        LIZ.append(this.LIZ);
        LIZ.append(", fromPush=");
        return C78920UyC.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public FDP(android.net.Uri uri, Boolean bool) {
        this.LIZ = uri;
        this.LIZIZ = bool;
    }
}
