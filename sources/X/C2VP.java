package X;

import Y.ACallableS104S0100000_1;
import Y.ARunnableS37S0100000_1;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.2VP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2VP {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static void LIZ(InterfaceC65784Pro interfaceC65784Pro) {
        ExecutorService BACKGROUND_EXECUTOR = C10K.LJI;
        o.LJIIIIZZ(BACKGROUND_EXECUTOR, "BACKGROUND_EXECUTOR");
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            C10K.LIZIZ(new ACallableS104S0100000_1(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 14), BACKGROUND_EXECUTOR, null);
        } else {
            interfaceC65784Pro.invoke();
        }
    }

    public static void LIZIZ(InterfaceC65784Pro interfaceC65784Pro) {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            interfaceC65784Pro.invoke();
        } else {
            LIZ.post(new ARunnableS37S0100000_1(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 122));
        }
    }
}
