package X;

/* renamed from: X.00B, reason: invalid class name */
/* loaded from: classes.dex */
public final class C00B {
    public static final void LIZ(int i, int i2) {
        if (i >= 0 && i < i2) {
        } else {
            throw new IndexOutOfBoundsException(C48263Iwt.LIZLLL("index: ", i, ", size: ", i2));
        }
    }

    public static final void LIZIZ(int i, int i2) {
        if (i >= 0 && i <= i2) {
        } else {
            throw new IndexOutOfBoundsException(C48263Iwt.LIZLLL("index: ", i, ", size: ", i2));
        }
    }

    public static final void LIZJ(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
            } else {
                throw new IllegalArgumentException(C48263Iwt.LIZLLL("fromIndex: ", i, " > toIndex: ", i2));
            }
        } else {
            StringBuilder LIZJ = C06460Ne.LIZJ("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
            LIZJ.append(i3);
            throw new IndexOutOfBoundsException(X1D.LIZIZ(LIZJ));
        }
    }
}
