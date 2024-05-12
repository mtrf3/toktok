package X;

import java.util.logging.Level;

/* loaded from: classes12.dex */
public class P9H implements P9G {
    public static final boolean LIZ;

    static {
        boolean z;
        try {
            Class.forName("android.util.Log");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        LIZ = z;
    }

    @Override // X.P9G
    public final void LIZIZ(Level level, String str) {
    }

    @Override // X.P9G
    public final void LIZ(Level level, String str, Throwable th) {
    }
}
