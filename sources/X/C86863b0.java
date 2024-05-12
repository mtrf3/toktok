package X;

/* renamed from: X.3b0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86863b0 implements InterfaceC86893b3 {
    public final long LIZ;

    public C86863b0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C86863b0) && this.LIZ == ((C86863b0) obj).LIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BrowsingToEditingTransition(animationStartTimeMillis=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C86863b0(int i) {
        this.LIZ = System.currentTimeMillis();
    }
}
