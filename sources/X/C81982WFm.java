package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.WFm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81982WFm implements InterfaceC81972WFc {
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

    public C81982WFm(WID wid) {
        this.LIZ = wid;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        String str;
        o.LJIIIZ(view, "view");
        if (C76917UGr.LJLIL) {
            return;
        }
        boolean Jx = this.LIZ.LIZJ().Jx();
        C83627Wrv Bc = this.LIZ.LIZJ().Bc();
        C78862UxG LIZIZ = C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.OPEN_CAMERA_WIDE, null);
        Bc.getClass();
        C83627Wrv.LIZIZ(Bc, "action_name_switch_wide_camera", LIZIZ, null);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LIZ.LJIILIIL().LJI());
        c145995oB.LJI("shoot_way", this.LIZ.LJIILIIL().shootWay);
        c145995oB.LJI("enter_from", "video_shoot_page");
        if (Jx) {
            str = "off";
        } else {
            str = "on";
        }
        c145995oB.LJI("to_status", str);
        FMX.LJIIL("wide_angle", c145995oB.LIZ);
    }
}
