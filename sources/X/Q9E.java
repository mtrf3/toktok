package X;

/* loaded from: classes12.dex */
public final class Q9E {
    public static volatile Q9E LIZJ;
    public final C73318Sq2 LIZ = new C73318Sq2();
    public volatile boolean LIZIZ = false;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    public static Q3Y LIZ(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1052618729:
                if (str.equals("native")) {
                    return Q3Y.NATIVE;
                }
                return Q3Y.PSS;
            case 2277:
                if (str.equals("GL")) {
                    return Q3Y.GL;
                }
                return Q3Y.PSS;
            case 3254818:
                if (str.equals("java")) {
                    return Q3Y.JAVA;
                }
                return Q3Y.PSS;
            default:
                return Q3Y.PSS;
        }
    }
}
