package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.I1d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45937I1d implements InterfaceC81972WFc {
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

    public C45937I1d(WID wid) {
        this.LIZ = wid;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        o.LJIIIZ(view, "view");
        InterfaceC81454Vxy interfaceC81454Vxy = (InterfaceC81454Vxy) this.LIZ.LJJIIJ.getValue();
        if (interfaceC81454Vxy != null) {
            interfaceC81454Vxy.W9();
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", this.LIZ.LJIILIIL().shootWay);
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("creation_id", this.LIZ.LJIILIIL().LJI());
        c145995oB.LJI("user_id", C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
        c145995oB.LJI("content_source", "shoot");
        c145995oB.LJI("content_type", "video");
        GXR.LIZ("click_reply_entrance", c145995oB.LIZ);
    }
}
