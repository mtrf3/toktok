package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Hyf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45825Hyf implements InterfaceC81972WFc {
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

    public C45825Hyf(WID wid) {
        this.LIZ = wid;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        String str;
        o.LJIIIZ(view, "view");
        if (C76917UGr.LJLIL) {
            return;
        }
        boolean z = !C82127WLb.LIZ(this.LIZ.LIZ());
        this.LIZ.LIZJ().Za(z, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.OPEN_SHAKE_FREE_TOOL_BAR, null));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LIZ.LJIILIIL().LJI());
        c145995oB.LJI("shoot_way", this.LIZ.LJIILIIL().shootWay);
        c145995oB.LJI("enter_from", "video_shoot_page");
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c145995oB.LJI("to_status", str);
        if (this.LIZ.LJIILIIL().draftId != 0) {
            c145995oB.LIZ(this.LIZ.LJIILIIL().draftId, "draft_id");
        }
        String str2 = this.LIZ.LJIILIIL().newDraftId;
        o.LJIIIIZZ(str2, "shortVideoContext.newDraftId");
        if (str2.length() > 0) {
            c145995oB.LIZLLL("new_draft_id", this.LIZ.LJIILIIL().newDraftId);
        }
        FMX.LJIIL("click_anti_shake", c145995oB.LIZ);
    }
}
