package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WHU implements InterfaceC81972WFc {
    public final /* synthetic */ WID LIZ;

    @Override // X.InterfaceC81972WFc
    public final void LIZIZ(C81975WFf c81975WFf) {
    }

    @Override // X.InterfaceC81972WFc
    public final boolean LIZJ(C81975WFf c81975WFf) {
        return false;
    }

    public WHU(WID wid) {
        this.LIZ = wid;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZ(C81975WFf c81975WFf) {
        if (this.LIZ.LIZJ().LLJIJIL() && C83732Wtc.LJIIJ(this.LIZ.LIZ())) {
            C5S1 c5s1 = new C5S1(this.LIZ.LIZ());
            c5s1.LIZJ(R.string.ein);
            c5s1.LJ();
        }
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        String str;
        String str2;
        int i;
        o.LJIIIZ(view, "view");
        int nextFlashMode = this.LIZ.LIZJ().getNextFlashMode();
        if (this.LIZ.LIZJ().LLFZ()) {
            WHV whv = (WHV) this.LIZ.LJJIIZI.getValue();
            if (whv != null) {
                nextFlashMode = whv.getNextFlashMode();
                whv.s9(nextFlashMode);
                whv.VD();
                if (nextFlashMode == 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                c81975WFf.LJLJI = WI2.LIZIZ(i);
            }
        } else {
            this.LIZ.LIZJ().s9(nextFlashMode);
            WHV whv2 = (WHV) this.LIZ.LJJIIZI.getValue();
            if (whv2 != null) {
                whv2.q90(nextFlashMode);
            }
            c81975WFf.LJLJI = WI2.LIZIZ(nextFlashMode);
        }
        c81975WFf.LJLLLL = true;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LIZ.LJIILIIL().LJI());
        c145995oB.LJI("shoot_way", this.LIZ.LJIILIIL().shootWay);
        if (nextFlashMode == 0) {
            str = "off";
        } else {
            str = "on";
        }
        c145995oB.LJI("to_status", str);
        if (this.LIZ.LIZJ().LLFZ()) {
            str2 = "front";
        } else {
            str2 = "back";
        }
        c145995oB.LJI("camera_status", str2);
        if (this.LIZ.LJIILIIL().draftId != 0) {
            c145995oB.LIZ(this.LIZ.LJIILIIL().draftId, "draft_id");
        }
        String str3 = this.LIZ.LJIILIIL().newDraftId;
        o.LJIIIIZZ(str3, "shortVideoContext.newDraftId");
        if (str3.length() > 0) {
            c145995oB.LIZLLL("new_draft_id", this.LIZ.LJIILIIL().newDraftId);
        }
        c145995oB.LIZLLL("shoot_page", "video_shoot_page");
        c145995oB.LIZLLL("shoot_tab_name", this.LIZ.LJIILIIL().LJIJI());
        FMX.LJIIL("light", c145995oB.LIZ);
    }
}
