package X;

import kotlin.jvm.internal.o;
import yq4.a;

@InterfaceC55642Lsc("global_compliance_subscription_standard_plan")
/* loaded from: classes5.dex */
public final class AAW extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final int LJLILLLLZI = 131;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLILLLLZI;
    }

    public AAW(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        ActivityC45651qj LIZJ = context.LIZJ();
        if (LIZJ != null) {
            a.LJIIJ().LJIILJJIL(LIZJ, wrapper);
        }
    }
}
