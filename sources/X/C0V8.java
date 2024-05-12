package X;

/* renamed from: X.0V8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0V8 {
    public static final C0V8 LIZIZ = new C0V8();
    public final boolean LIZ;

    public C0V8() {
        this(true);
    }

    public final int hashCode() {
        return C16880lQ.LLJILJIL(this.LIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlatformParagraphStyle(includeFontPadding=");
        return C48339Iy7.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C0V8(boolean z) {
        this.LIZ = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0V8) && this.LIZ == ((C0V8) obj).LIZ) {
            return true;
        }
        return false;
    }
}
