package X;

/* renamed from: X.6n9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170836n9 {
    public static int LIZ = -1;

    public static void LIZ(int i) {
        if (i >= 0 && i < 2) {
            if (LIZ != -1) {
                return;
            }
            LIZ = i;
        } else {
            String LIZIZ = C0NY.LIZIZ("wrong flavor, value: ", i, ". ");
            LIZIZ.toString();
            throw new IllegalArgumentException(LIZIZ);
        }
    }
}
