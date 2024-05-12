package X;

import android.os.Handler;
import kotlin.jvm.internal.o;

/* renamed from: X.91a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2300291a {
    public static final C2300291a LIZ = new C2300291a();
    public static Handler LIZIZ;
    public static boolean LIZJ;

    public final void LIZ(RunnableC37185Eib runnableC37185Eib) {
        if (!LIZJ) {
            synchronized (this) {
                if (!LIZJ) {
                    LIZJ = true;
                    LIZIZ = C37179EiV.LJFF;
                }
            }
        }
        Handler handler = LIZIZ;
        if (handler != null) {
            handler.post(runnableC37185Eib);
        } else {
            o.LJIJI("mWorkHandler");
            throw null;
        }
    }
}
