package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Csw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32730Csw {
    public final C32694CsM LIZ;
    public final int LIZIZ = C32694CsM.LIZIZ;
    public final String LIZJ = C32694CsM.LIZJ;
    public final int LIZLLL = C32694CsM.LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32730Csw) && o.LJ(this.LIZ, ((C32730Csw) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ErrorInfo(panelTracker=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C32730Csw(C32694CsM c32694CsM) {
        this.LIZ = c32694CsM;
    }
}
