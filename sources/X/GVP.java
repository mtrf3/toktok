package X;

import android.content.Context;

/* loaded from: classes8.dex */
public final class GVP extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ ActivityC45651qj LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LJLJJLL;
    public final /* synthetic */ boolean LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GVP(int i, int i2, ActivityC45651qj activityC45651qj, InterfaceC65784Pro interfaceC65784Pro, boolean z, boolean z2, boolean z3) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = z2;
        this.LJLJJLL = interfaceC65784Pro;
        this.LJLJL = z3;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C41620GVc.LIZJ();
        if (C41620GVc.LIZ == null) {
            Context LIZIZ = EF7.LIZIZ();
            C42041Gej c42041Gej = C41620GVc.LIZLLL;
            if (c42041Gej != null) {
                C41620GVc.LIZ = new C41634GVq(LIZIZ, c42041Gej);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C41634GVq c41634GVq = C41620GVc.LIZ;
        if (c41634GVq != null) {
            boolean z = true;
            if (!this.LJLIL && C00F.LIZ(31744, 0, "studio_global_publish_progress", true) <= 0) {
                z = false;
            }
            c41634GVq.LJIILL = z;
        }
        C41634GVq c41634GVq2 = C41620GVc.LIZ;
        if (c41634GVq2 != null) {
            c41634GVq2.LJJIJL = new C41619GVb(this.LJLILLLLZI);
            ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
            c41634GVq2.LIZ(activityC45651qj, this.LJLJI, this.LJLJJI, new GVG(activityC45651qj, this.LJLJJL, this.LJLJJLL, this.LJLJL), false, C41620GVc.LJII);
        }
        return C76800UCe.LIZ;
    }
}
