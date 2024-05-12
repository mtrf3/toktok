package X;

import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("upload_success_popup")
/* renamed from: X.7I2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7I2 extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final int LJLJI = 0;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (activityC45651qj != null) {
            return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
        }
        return null;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJI;
    }

    public C7I2(ActivityC45651qj activityC45651qj, InterfaceC65784Pro interfaceC65784Pro) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = interfaceC65784Pro;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        this.LJLILLLLZI.invoke();
    }
}
