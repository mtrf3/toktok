package X;

/* renamed from: X.30Y, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30Y {
    public static String LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("wss://");
        LIZ2.append("frontier-va.tiktokv.com");
        LIZ2.append("/ws/v2");
        X1D.LIZIZ(LIZ2);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("https://");
        LIZ = JBR.LJFF(LIZ3, EF7.LJI.LIZ, "/aweme/v1/", LIZ3);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("https://");
        LIZIZ = JBR.LJFF(LIZ4, EF7.LJI.LIZ, "/tiktok/v1/", LIZ4);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("https://");
        LIZ5.append(EF7.LJI.LIZ);
        LIZJ = X1D.LIZIZ(LIZ5);
    }
}
