package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JIw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48946JIw {
    public final JJ2 LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final C49153JQv LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48946JIw)) {
            return false;
        }
        C48946JIw c48946JIw = (C48946JIw) obj;
        return o.LJ(this.LIZ, c48946JIw.LIZ) && this.LIZIZ == c48946JIw.LIZIZ && this.LIZJ == c48946JIw.LIZJ && o.LJ(this.LIZLLL, c48946JIw.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode + i) * 31) + (this.LIZJ ? 1 : 0)) * 31;
        C49153JQv c49153JQv = this.LIZLLL;
        return i2 + (c49153JQv == null ? 0 : c49153JQv.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoConfiguration(size=");
        LIZ.append(this.LIZ);
        LIZ.append(", autoPlay=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", muteSound=");
        LIZ.append(this.LIZJ);
        LIZ.append(", scrollManager=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C48946JIw(C48947JIx c48947JIx) {
        this(c48947JIx, false, null);
    }

    public C48946JIw(JJ2 size, boolean z, C49153JQv c49153JQv) {
        o.LJIIIZ(size, "size");
        this.LIZ = size;
        this.LIZIZ = z;
        this.LIZJ = false;
        this.LIZLLL = c49153JQv;
    }
}
