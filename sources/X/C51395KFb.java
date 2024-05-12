package X;

import Y.ARunnableS44S0100000_8;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.KFb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51395KFb {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static void LIZ(InterfaceC65784Pro interfaceC65784Pro) {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            interfaceC65784Pro.invoke();
        } else {
            LIZ.post(new ARunnableS44S0100000_8(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 82));
        }
    }
}
