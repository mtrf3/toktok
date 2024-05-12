package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ljx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55105Ljx extends SZD {
    public final C8W0 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C55105Ljx) && o.LJ(this.LIZJ, ((C55105Ljx) obj).LIZJ);
    }

    public final int hashCode() {
        C8W0 c8w0 = this.LIZJ;
        if (c8w0 == null) {
            return 0;
        }
        return c8w0.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BindAbilityPerformanceTrackParams(host=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C55105Ljx(C8W0 c8w0) {
        this.LIZJ = c8w0;
    }
}
