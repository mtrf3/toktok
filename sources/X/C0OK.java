package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.0OK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0OK {
    public final C17540mU LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OK)) {
            return false;
        }
        C0OK c0ok = (C0OK) obj;
        return o.LJ(this.LIZ, c0ok.LIZ) && this.LIZIZ == c0ok.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageVectorEntry(imageVector=");
        LIZ.append(this.LIZ);
        LIZ.append(", configFlags=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C0OK(C17540mU c17540mU, int i) {
        this.LIZ = c17540mU;
        this.LIZIZ = i;
    }
}
