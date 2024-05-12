package X;

import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_social_new_friends_rec")
/* loaded from: classes5.dex */
public final class A7U extends AbstractC55363Lo7 {
    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        return C54081LKj.LIZ(null, null);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 0;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        throw null;
    }

    @Override // X.M74
    public final void showPopupFailed(int i, String errMsg) {
        o.LJIIIZ(errMsg, "errMsg");
        super.showPopupFailed(i, errMsg);
        UQ4.LJIILJJIL(i, errMsg);
    }
}
