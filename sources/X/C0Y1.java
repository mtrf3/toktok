package X;

import Y.IDRunnableS85S0100000;
import android.os.Handler;

/* renamed from: X.0Y1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Y1 {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static final void LIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        try {
            interfaceC65784Pro.invoke();
        } catch (Throwable th) {
            LIZ.post(new IDRunnableS85S0100000(th, 81));
            throw th;
        }
    }
}
