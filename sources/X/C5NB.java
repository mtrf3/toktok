package X;

import Y.ARunnableS38S0100000_2;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.5NB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5NB {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static final void LIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        Looper LLJJJJ = C16880lQ.LLJJJJ();
        o.LJIIIIZZ(LLJJJJ, "Looper.getMainLooper()");
        if (o.LJ(LLLLIIIILLL, LLJJJJ.getThread())) {
            interfaceC65784Pro.invoke();
        } else {
            LIZ.post(new ARunnableS38S0100000_2(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 152));
        }
    }
}
