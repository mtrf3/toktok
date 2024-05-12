package X;

import com.ss.android.ugc.aweme.app.AwemeAppData;

/* loaded from: classes7.dex */
public abstract class FJU {
    public static volatile AwemeAppData LIZJ;
    public final int LIZIZ = 2;
    public int LIZ = (int) EF7.LIZJ();

    public static AwemeAppData LIZIZ() {
        if (LIZJ == null) {
            synchronized (FJU.class) {
                if (LIZJ == null) {
                    LIZJ = new AwemeAppData();
                }
            }
        }
        return LIZJ;
    }

    public FJU() {
        EF7.LIZIZ();
    }
}
