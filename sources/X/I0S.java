package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I0S implements InterfaceC81972WFc {
    public final /* synthetic */ C82622Wbi LIZ;
    public final /* synthetic */ WID LIZIZ;

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

    public I0S(C82622Wbi c82622Wbi, WID wid) {
        this.LIZ = c82622Wbi;
        this.LIZIZ = wid;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        o.LJIIIZ(view, "view");
        ((InterfaceC45921I0n) this.LIZ.LJ(InterfaceC45921I0n.class, null)).show(true);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LIZIZ.LJIILIIL().LJI());
        c145995oB.LJI("shoot_way", this.LIZIZ.LJIILIIL().shootWay);
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("content_type", this.LIZIZ.LJIILIIL().LIZLLL().getContentType());
        c145995oB.LJI("content_source", this.LIZIZ.LJIILIIL().LIZLLL().getContentSource());
        FMX.LJIIL("click_layout_entrance", c145995oB.LIZ);
    }
}
