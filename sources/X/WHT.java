package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WHT implements InterfaceC81972WFc {
    public final /* synthetic */ WI6 LIZ;

    @Override // X.InterfaceC81972WFc
    public final void LIZ(C81975WFf c81975WFf) {
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZIZ(C81975WFf c81975WFf) {
    }

    @Override // X.InterfaceC81972WFc
    public final boolean LIZJ(C81975WFf c81975WFf) {
        return false;
    }

    public WHT(WI6 wi6) {
        this.LIZ = wi6;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        String str;
        o.LJIIIZ(view, "view");
        if (C76917UGr.LJLIL) {
            return;
        }
        boolean z = !C82127WLb.LIZ(this.LIZ.LIZ());
        this.LIZ.LIZIZ().Za(z, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.FTC_OPEN_SHAKE_FREE_TOOL_BAR, null));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LIZ.LJI().LJI());
        c145995oB.LJI("shoot_way", this.LIZ.LJI().shootWay);
        c145995oB.LJI("enter_from", "video_shoot_page");
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c145995oB.LJI("to_status", str);
        c145995oB.LIZ(this.LIZ.LJI().draftId, "draft_id");
        FMX.LJIIL("click_anti_shake", c145995oB.LIZ);
    }
}
