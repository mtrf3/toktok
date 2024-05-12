package X;

import android.os.Looper;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A9V {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(A9U.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(A9T.INSTANCE);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(A9W.LJLIL);

    public static final void LIZ(int i, String str, String message) {
        o.LJIIIZ(message, "message");
        if (((Boolean) LIZ.getValue()).booleanValue()) {
            C62822Ol8 c62822Ol8 = LIZIZ;
            if ((!((java.util.Set) c62822Ol8.getValue()).isEmpty()) && !((java.util.Set) c62822Ol8.getValue()).contains(str)) {
                return;
            }
            C16880lQ.LLLLIIIILLL().getId();
            o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ());
            new C66019Pvb();
            LIZJ.getValue().getClass();
        }
    }
}
