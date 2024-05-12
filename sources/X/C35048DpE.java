package X;

/* renamed from: X.DpE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35048DpE {
    public static long LIZ = -1;

    public static boolean LIZ() {
        if (!((Boolean) C34166Db0.LIZIZ.getValue()).booleanValue()) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = LIZ;
        if (j == -1 || currentTimeMillis - j > 400) {
            LIZ = currentTimeMillis;
            return true;
        }
        return false;
    }
}
