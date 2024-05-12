package X;

/* renamed from: X.KrU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53024KrU {
    public static int LIZ;
    public static int LIZIZ;
    public static boolean LIZJ;

    public static void LIZ(boolean z) {
        int i;
        if (((Boolean) C53023KrT.LIZ.getValue()).booleanValue() && !LIZJ && (i = LIZ) < 30) {
            LIZ = i + 1;
            if (z) {
                int i2 = LIZIZ + 1;
                LIZIZ = i2;
                if (i2 == 10) {
                    LIZJ = true;
                }
            }
        }
    }
}
