package X;

import Y.IDDListenerS103S0200000_9;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("inbox_guide_user_out_push")
/* loaded from: classes10.dex */
public final class MS0 extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final ViewOnClickListenerC57173McD LJLILLLLZI;
    public final MS3 LJLJI;
    public final MS4 LJLJJI;
    public final int LJLJJL = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJJL;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        ASL asl = new ASL();
        asl.LIZ(this.LJLILLLLZI);
        asl.LIZ.LJLILLLLZI = new IDDListenerS103S0200000_9(this, wrapper, 2);
        asl.LJI(1);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLJ = true;
        C1DG.LJII(this.LJLIL, "activity.supportFragmentManager", tuxSheet, "");
        ViewOnClickListenerC57173McD viewOnClickListenerC57173McD = this.LJLILLLLZI;
        viewOnClickListenerC57173McD.LJLLL = true;
        if (o.LJ(viewOnClickListenerC57173McD.LJLIL.trigger, "dm")) {
            viewOnClickListenerC57173McD.LJZI = true;
            C38776FJs.LJIIL().LJI(viewOnClickListenerC57173McD.getContext(), "key_opt_dm_dialog_show", false);
        }
        ViewOnClickListenerC57173McD.LJFF(viewOnClickListenerC57173McD, "show_push_permission_pop_up", null, null, null, 14);
        MS4 ms4 = this.LJLJJI;
        if (ms4 != null) {
            ms4.s2();
        }
        C56827MRz.LIZIZ(this.LJLIL);
    }

    public MS0(ActivityC45651qj activityC45651qj, ViewOnClickListenerC57173McD viewOnClickListenerC57173McD, MS3 ms3, MS4 ms4) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = viewOnClickListenerC57173McD;
        this.LJLJI = ms3;
        this.LJLJJI = ms4;
    }
}
