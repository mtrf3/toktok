package X;

/* loaded from: classes15.dex */
public final class W9V {
    public static final int LIZ;
    public static final int LIZIZ;
    public static volatile C81803W8p LIZJ;

    static {
        int i;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            i = (min / 4) * 3;
        } else {
            i = min / 2;
        }
        LIZ = i;
        LIZIZ = 384;
    }
}
