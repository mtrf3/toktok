package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TKF implements InterfaceC81972WFc {
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

    public TKF(WI6 wi6) {
        this.LIZ = wi6;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        o.LJIIIZ(view, "view");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LIZ.LJI().LJI());
        c145995oB.LJI("shoot_way", this.LIZ.LJI().shootWay);
        c145995oB.LIZ(this.LIZ.LJI().draftId, "draft_id");
        FMX.LJIIL("count_down", c145995oB.LIZ);
        ((InterfaceC164226cU) this.LIZ.LIZ.LJ(InterfaceC164226cU.class, null)).f2(true);
    }
}
