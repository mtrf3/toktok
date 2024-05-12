package ms.bd.o;

/* loaded from: classes7.dex */
public class v2 {
    public static volatile v2 LIZJ;
    public int LIZ = 0;
    public Throwable LIZIZ = null;

    public static v2 LIZ() {
        if (LIZJ == null) {
            synchronized (v2.class) {
                if (LIZJ == null) {
                    LIZJ = new v2();
                }
            }
        }
        return LIZJ;
    }
}
