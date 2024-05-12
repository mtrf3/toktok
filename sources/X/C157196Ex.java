package X;

/* renamed from: X.6Ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157196Ex {
    public static long LIZ;

    public static boolean LIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - LIZ) < 1200) {
            return true;
        }
        LIZ = currentTimeMillis;
        return false;
    }
}
