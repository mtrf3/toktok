package X;

import Y.ARunnableS39S0100000_3;
import android.os.Handler;

/* renamed from: X.8WI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8WI {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C8WJ.INSTANCE);

    public static final void LIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        try {
            interfaceC65784Pro.invoke();
        } catch (Throwable th) {
            if (C214368bA.LIZ) {
                ((Handler) LIZ.getValue()).post(new ARunnableS39S0100000_3(th, 186));
                return;
            }
            C8V7 c8v7 = C214368bA.LIZIZ;
            if (c8v7 != null) {
                c8v7.LIZ(new Exception(th), "assem catch exception");
            }
            throw th;
        }
    }
}
