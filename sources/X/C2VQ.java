package X;

import Y.ACallableS104S0100000_1;
import Y.ARunnableS37S0100000_1;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.2VQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2VQ {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static void LIZ(InterfaceC65784Pro action) {
        ExecutorService BACKGROUND_EXECUTOR = C10K.LJI;
        o.LJIIIIZZ(BACKGROUND_EXECUTOR, "BACKGROUND_EXECUTOR");
        o.LJIIIZ(action, "action");
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            C10K.LIZIZ(new ACallableS104S0100000_1(action, (InterfaceC65784Pro<C76800UCe>) 18), BACKGROUND_EXECUTOR, null);
        } else {
            action.invoke();
        }
    }

    public static final void LIZIZ(InterfaceC65784Pro interfaceC65784Pro, long j) {
        if (j <= 0) {
            if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                interfaceC65784Pro.invoke();
                return;
            } else {
                LIZ.post(new ARunnableS37S0100000_1(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 137));
                return;
            }
        }
        LIZ.postDelayed(new ARunnableS37S0100000_1(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 137), j);
    }
}
