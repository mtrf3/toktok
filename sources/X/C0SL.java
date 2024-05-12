package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0SL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SL {
    public InterfaceC12040dc LIZ;
    public InterfaceC11750d9 LIZIZ;
    public C43011mT LIZJ;
    public InterfaceC11610cv LIZLLL;

    public C0SL() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SL)) {
            return false;
        }
        C0SL c0sl = (C0SL) obj;
        return o.LJ(this.LIZ, c0sl.LIZ) && o.LJ(this.LIZIZ, c0sl.LIZIZ) && o.LJ(this.LIZJ, c0sl.LIZJ) && o.LJ(this.LIZLLL, c0sl.LIZLLL);
    }

    public final int hashCode() {
        InterfaceC12040dc interfaceC12040dc = this.LIZ;
        int hashCode = (interfaceC12040dc == null ? 0 : interfaceC12040dc.hashCode()) * 31;
        InterfaceC11750d9 interfaceC11750d9 = this.LIZIZ;
        int hashCode2 = (hashCode + (interfaceC11750d9 == null ? 0 : interfaceC11750d9.hashCode())) * 31;
        C43011mT c43011mT = this.LIZJ;
        int hashCode3 = (hashCode2 + (c43011mT == null ? 0 : c43011mT.hashCode())) * 31;
        InterfaceC11610cv interfaceC11610cv = this.LIZLLL;
        return hashCode3 + (interfaceC11610cv != null ? interfaceC11610cv.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BorderCache(imageBitmap=");
        LIZ.append(this.LIZ);
        LIZ.append(", canvas=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", canvasDrawScope=");
        LIZ.append(this.LIZJ);
        LIZ.append(", borderPath=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C0SL(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
    }
}
