package X;

import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.Sqw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73374Sqw {
    public static final HandlerC212798Wt LIZ;
    public static final C73964T1c LIZIZ;

    static {
        Looper LLJJJJ = C16880lQ.LLJJJJ();
        o.LJIIIIZZ(LLJJJJ, "getMainLooper()");
        HandlerC212798Wt handlerC212798Wt = new HandlerC212798Wt(LLJJJJ);
        LIZ = handlerC212798Wt;
        LIZIZ = new C73964T1c(handlerC212798Wt);
    }

    public static final boolean LIZ() {
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            return true;
        }
        return false;
    }
}
