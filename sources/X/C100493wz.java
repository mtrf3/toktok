package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.lang.ref.Reference;

/* renamed from: X.3wz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100493wz extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C100493wz LJLIL = new C100493wz();

    public C100493wz() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Activity activity;
        Context LIZIZ = EF7.LIZIZ();
        C34B.LIZIZ("IMChatPerfLogger", "register touch callback");
        C100903xe c100903xe = C100723xM.LIZLLL;
        Reference reference = (Reference) ORZ.LJLLLL(C2YY.LIZ);
        if (reference != null) {
            activity = (Activity) reference.get();
        } else {
            activity = null;
        }
        c100903xe.LIZ(activity);
        ((Application) LIZIZ).registerActivityLifecycleCallbacks(c100903xe);
        return C76800UCe.LIZ;
    }
}
