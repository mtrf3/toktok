package X;

import Y.IDRunnableS92S0100000_42;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.aVo, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93744aVo {
    public static final C68332mD LIZ = new C68332mD(new Handler(C16880lQ.LLJJJJ()));

    public static void LIZ(InterfaceC65784Pro interfaceC65784Pro) {
        ((Handler) LIZ.getValue()).post(new IDRunnableS92S0100000_42(interfaceC65784Pro, 2));
    }

    public static final void LIZIZ(InterfaceC65784Pro interfaceC65784Pro, long j) {
        if (j > 0) {
            ((Handler) LIZ.getValue()).postDelayed(new IDRunnableS92S0100000_42(interfaceC65784Pro, 3), j);
        } else if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            interfaceC65784Pro.invoke();
        } else {
            ((Handler) LIZ.getValue()).post(new IDRunnableS92S0100000_42(interfaceC65784Pro, 4));
        }
    }
}
