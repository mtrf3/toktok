package X;

import Y.ARunnableS40S0100000_4;
import android.os.Handler;
import kotlin.jvm.internal.o;

/* renamed from: X.9gR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243119gR {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C243129gS.INSTANCE);

    public static void LIZ(InterfaceC65784Pro action) {
        o.LJIIIZ(action, "action");
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            action.invoke();
        } else {
            ((Handler) LIZ.getValue()).post(new ARunnableS40S0100000_4(action, 127));
        }
    }

    public static void LIZIZ(InterfaceC65784Pro interfaceC65784Pro) {
        if (!C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            ((Handler) LIZ.getValue()).post(new ARunnableS40S0100000_4(interfaceC65784Pro, 126));
        } else {
            interfaceC65784Pro.invoke();
        }
    }
}
