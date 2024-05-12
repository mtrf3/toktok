package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WHW implements InterfaceC81972WFc {
    public final /* synthetic */ WID LIZ;

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

    public WHW(WID wid) {
        this.LIZ = wid;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        o.LJIIIZ(view, "view");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LIZ.LJIILIIL().LJI());
        c145995oB.LJI("shoot_way", this.LIZ.LJIILIIL().shootWay);
        c145995oB.LIZ(this.LIZ.LJIILIIL().draftId, "draft_id");
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("shoot_page", "video_shoot_page");
        c145995oB.LJI("shoot_tab_name", this.LIZ.LJIILIIL().LJIJI());
        FMX.LJIIL("count_down", c145995oB.LIZ);
        ((WHX) this.LIZ.LIZ.LJ(WHX.class, null)).f2(true);
    }
}
