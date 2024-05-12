package X;

import android.os.Build;
import android.view.Choreographer;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EWN {
    public static void LIZ(Choreographer choreographer, Choreographer.FrameCallback callback) {
        o.LJIIIZ(callback, "callback");
        if (Build.VERSION.SDK_INT >= 23) {
            C5H3 c5h3 = EWM.LIZJ;
            if (c5h3.getValue() != null) {
                Object value = c5h3.getValue();
                if (EWM.LIZIZ) {
                    C5H3 c5h32 = EWM.LIZLLL;
                    if (c5h32.getValue() != null) {
                        try {
                            Method method = (Method) c5h32.getValue();
                            if (method != null) {
                                EWM.LIZ(choreographer, method, new Object[]{Integer.valueOf(EWM.LIZ), callback, value, 0L});
                            }
                        } catch (Exception unused) {
                            EWM.LIZIZ = false;
                        }
                        if (EWM.LIZIZ) {
                            return;
                        }
                    }
                }
            }
        }
        choreographer.postFrameCallbackDelayed(callback, 0L);
    }
}
