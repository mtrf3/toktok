package X;

import kotlin.jvm.internal.AqS98S0300000_9;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_nearby_feed_permission_pop_for_check_location")
/* renamed from: X.LaM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54510LaM extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final int LJLJI;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJI;
    }

    public C54510LaM(ActivityC45651qj activity, AqS98S0300000_9 aqS98S0300000_9) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = aqS98S0300000_9;
        this.LJLJI = 221;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLILLLLZI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }
}
