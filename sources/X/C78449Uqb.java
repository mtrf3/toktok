package X;

import android.os.Bundle;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("proactive_triggers_popup")
/* renamed from: X.Uqb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78449Uqb extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final boolean LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final InterfaceC65784Pro<C76800UCe> LJLJL;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 203;
    }

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        Bundle LJ = V3N.LJ(new OSZ[0]);
        if (this.LJLILLLLZI) {
            LJ.putString("proactive_design_type", "small_icon");
        } else {
            LJ.putString("proactive_design_type", "full_list");
        }
        LJ.putString("group_id", this.LJLJJLL);
        InterfaceC65895Ptb LJIIIIZZ = HG3.LJIIIIZZ();
        C78450Uqc c78450Uqc = new C78450Uqc();
        c78450Uqc.LIZ = this.LJLIL;
        c78450Uqc.LJIIIZ = true;
        c78450Uqc.LJIIIIZZ = 0.95d;
        c78450Uqc.LJII = this.LJLILLLLZI;
        c78450Uqc.LIZIZ = this.LJLJI;
        c78450Uqc.LIZJ = "homepage_hot_proactive";
        c78450Uqc.LJIIJ = this.LJLJJI;
        c78450Uqc.LJIIJJI = this.LJLJJL;
        c78450Uqc.LIZLLL = LJ;
        LJIIIIZZ.showLoginAndRegisterView(c78450Uqc.LIZ());
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public C78449Uqb(ActivityC45651qj activity, boolean z, String str, String str2, String str3, AqS160S0100000_10 aqS160S0100000_10) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = z;
        this.LJLJI = "homepage_hot";
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
        this.LJLJL = aqS160S0100000_10;
    }
}
