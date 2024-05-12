package X;

import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_tcp_kr")
/* renamed from: X.Ftt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40433Ftt extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC88472Yns<Long, C76800UCe> LJLILLLLZI;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 0;
    }

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    public C40433Ftt(ActivityC45651qj activity, AqS172S0100000_6 aqS172S0100000_6) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = aqS172S0100000_6;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        ActivityC45651qj LIZJ = context.LIZJ();
        if (LIZJ != null) {
            C39271Fb9.LIZ(LIZJ, this.LJLILLLLZI);
        }
    }
}
