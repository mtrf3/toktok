package X;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.EpV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37613EpV {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C37616EpY.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C37614EpW.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C37615EpX.INSTANCE);

    public static Handler LIZ() {
        return (Handler) LIZIZ.getValue();
    }

    public static final void LIZIZ(Runnable runnable) {
        C62822Ol8 c62822Ol8 = LIZJ;
        if (o.LJ(((Handler) c62822Ol8.getValue()).getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            ((Handler) c62822Ol8.getValue()).post(runnable);
        }
    }

    public static final void LIZJ(Runnable runnable) {
        if (o.LJ(LIZ().getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            LIZ().post(runnable);
        }
    }
}
