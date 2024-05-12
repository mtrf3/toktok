package X;

import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_rec_friends_consent")
/* loaded from: classes5.dex */
public final class A7V extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final int LJLJI = 230;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJI;
    }

    public A7V(ActivityC45651qj activityC45651qj, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = interfaceC65784Pro;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        this.LJLILLLLZI.invoke();
    }

    @Override // X.M74
    public final void showPopupFailed(int i, String errMsg) {
        o.LJIIIZ(errMsg, "errMsg");
        super.showPopupFailed(i, errMsg);
        UQ4.LJIILJJIL(i, errMsg);
    }
}
