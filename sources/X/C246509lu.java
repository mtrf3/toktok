package X;

import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_contact_permission")
/* renamed from: X.9lu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C246509lu extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final int LJLJI = 310;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.M74
    public final boolean canShow() {
        return HG3.LJIILL().isLogin();
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJI;
    }

    public C246509lu(ActivityC45651qj activityC45651qj, InterfaceC65784Pro interfaceC65784Pro) {
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
        C188727au LIZJ = C78920UyC.LIZJ(i, "errorcode");
        LIZJ.LJIIIZ("errorMsg", errMsg);
        FMX.LJIIL("social_pop_fail_reason", LIZJ.LIZ);
    }
}
