package X;

/* renamed from: X.0VW, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0VW {
    public static C0VW LIZ;

    public static synchronized C0VW LIZ() {
        C0VW c0vw;
        synchronized (C0VW.class) {
            if (LIZ == null) {
                LIZ = new C1NJ(3);
            }
            c0vw = LIZ;
        }
        return c0vw;
    }

    public static String LIZIZ(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
