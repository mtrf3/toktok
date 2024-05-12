package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WHS implements InterfaceC81972WFc {
    public final /* synthetic */ WI6 LIZ;

    @Override // X.InterfaceC81972WFc
    public final void LIZIZ(C81975WFf c81975WFf) {
    }

    @Override // X.InterfaceC81972WFc
    public final boolean LIZJ(C81975WFf c81975WFf) {
        return false;
    }

    public WHS(WI6 wi6) {
        this.LIZ = wi6;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZ(C81975WFf c81975WFf) {
        if (this.LIZ.LIZIZ().LLJIJIL() && C83732Wtc.LJIIJ(this.LIZ.LIZ())) {
            C5S1 c5s1 = new C5S1(this.LIZ.LIZ());
            c5s1.LIZJ(R.string.ein);
            c5s1.LJ();
        }
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        String str;
        o.LJIIIZ(view, "view");
        int nextFlashMode = this.LIZ.LIZIZ().getNextFlashMode();
        this.LIZ.LIZIZ().s9(nextFlashMode);
        c81975WFf.LJLLLL = true;
        c81975WFf.LJLJI = WI2.LIZIZ(nextFlashMode);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LIZ.LJI().LJI());
        c145995oB.LJI("shoot_way", this.LIZ.LJI().shootWay);
        c145995oB.LIZ(this.LIZ.LJI().draftId, "draft_id");
        if (nextFlashMode == 0) {
            str = "off";
        } else {
            str = "on";
        }
        c145995oB.LJI("to_status", str);
        FMX.LJIIL("light", c145995oB.LIZ);
    }
}
