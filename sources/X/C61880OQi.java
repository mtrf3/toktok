package X;

/* renamed from: X.OQi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61880OQi {
    public static void LIZ(int i, int i2) {
        if (i >= 0 && i < i2) {
        } else {
            throw new IndexOutOfBoundsException(C48263Iwt.LIZLLL("index: ", i, ", size: ", i2));
        }
    }

    public static void LIZIZ(int i, int i2) {
        if (i >= 0 && i <= i2) {
        } else {
            throw new IndexOutOfBoundsException(C48263Iwt.LIZLLL("index: ", i, ", size: ", i2));
        }
    }

    public static void LIZJ(int i, int i2, int i3) {
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
