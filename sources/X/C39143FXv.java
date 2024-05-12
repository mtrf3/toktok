package X;

import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.FXv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39143FXv implements InterfaceC39145FXx {
    public static long[] LIZ;
    public static final C39143FXv LIZIZ = new C39143FXv();

    @Override // X.InterfaceC39145FXx
    public final void LIZ(Thread thread, long[] jArr) {
        Looper LLJJJJ = C16880lQ.LLJJJJ();
        o.LJIIIIZZ(LLJJJJ, "Looper.getMainLooper()");
        if (o.LJ(thread, LLJJJJ.getThread())) {
            LIZ = jArr;
        }
    }
}
