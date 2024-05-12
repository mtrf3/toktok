package X;

import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_shop_tab_tooltip")
/* loaded from: classes10.dex */
public final class M0Q extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC56130M1e LJLILLLLZI;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 1800;
    }

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    public M0Q(ActivityC45651qj activityC45651qj, M10 m10) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = m10;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        this.LJLILLLLZI.LIZ();
    }

    @Override // X.M74
    public final void onPopupStateChanged(M7A fromState, M7A toState) {
        o.LJIIIZ(fromState, "fromState");
        o.LJIIIZ(toState, "toState");
        super.onPopupStateChanged(fromState, toState);
        if (toState == M7A.SHOWED) {
            C2U8.LIZ(new LRJ(0));
        }
    }
}
