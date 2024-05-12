package X;

import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("email_pop_up_sheet")
/* renamed from: X.XkY, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85718XkY extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        int i = this.LJLILLLLZI;
        if (i != 1) {
            if (i != 2) {
                return 229;
            }
            return 447;
        }
        return 450;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        C61851OPf.LIZJ(Integer.valueOf(this.LJLILLLLZI));
        C85719XkZ.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, wrapper).show();
    }

    public C85718XkY(ActivityC45651qj activity, int i, boolean z) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
        this.LJLJJI = false;
    }
}
