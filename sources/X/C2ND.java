package X;

import Y.ARunnableS37S0100000_1;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.2ND, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2ND {
    public static final C68332mD LIZ = new C68332mD(new Handler(C16880lQ.LLJJJJ()));

    public static final void LIZ(InterfaceC65784Pro interfaceC65784Pro, long j) {
        if (j > 0) {
            ((Handler) LIZ.getValue()).postDelayed(new ARunnableS37S0100000_1(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 166), j);
        } else {
            ((Handler) LIZ.getValue()).post(new ARunnableS37S0100000_1(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 167));
        }
    }

    public static final void LIZIZ(InterfaceC65784Pro interfaceC65784Pro, long j) {
        if (j > 0) {
            ((Handler) LIZ.getValue()).postDelayed(new ARunnableS37S0100000_1(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 168), j);
        } else if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            interfaceC65784Pro.invoke();
        } else {
            ((Handler) LIZ.getValue()).post(new ARunnableS37S0100000_1(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 169));
        }
    }
}
