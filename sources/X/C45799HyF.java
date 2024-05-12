package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.HyF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45799HyF implements InterfaceC81972WFc {
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

    public C45799HyF(WID wid) {
        this.LIZ = wid;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        o.LJIIIZ(view, "view");
        boolean z = !this.LIZ.LJIILIIL().isAIEnhanceOn;
        this.LIZ.LIZJ().Om(z);
        this.LIZ.LJIILIIL().isAIEnhanceOn = z;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LIZ.LJIILIIL().LJI());
        c145995oB.LJI("shoot_way", this.LIZ.LJIILIIL().shootWay);
        c145995oB.LJI("content_source", this.LIZ.LJIILIIL().LIZLLL().getContentSource());
        c145995oB.LJI("content_type", this.LIZ.LJIILIIL().LIZLLL().getContentType());
        c145995oB.LIZ(z ? 1 : 0, "status");
        c145995oB.LJI("enter_from", "video_shoot_page");
        FMX.LJIIL("click_quality_improve", c145995oB.LIZ);
    }
}
