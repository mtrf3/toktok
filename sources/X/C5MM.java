package X;

/* renamed from: X.5MM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5MM {
    public final int LIZ;
    public final long LIZIZ;
    public final InterfaceC133865Ne LIZJ;

    public C5MM() {
        throw null;
    }

    public static C5MM LIZ() {
        return new C5MM(0);
    }

    public static C5MM LIZJ() {
        return new C5MM(1);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEPreviewControlOp{mType=");
        LIZ.append(this.LIZ);
        LIZ.append(", mSeekTo=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, '}', LIZ);
    }

    public C5MM(int i) {
        this(i, 0L, null);
    }

    public static C5MM LIZIZ(long j) {
        return new C5MM(2, j, null);
    }

    public static C5MM LIZLLL(long j) {
        return new C5MM(3, j, null);
    }

    public C5MM(int i, long j, InterfaceC133865Ne interfaceC133865Ne) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = interfaceC133865Ne;
    }
}
