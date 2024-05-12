package X;

import android.view.View;
import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TKE implements InterfaceC81972WFc {
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

    public TKE(WI6 wi6) {
        this.LIZ = wi6;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        Integer num;
        o.LJIIIZ(view, "view");
        String str = null;
        ((THT) this.LIZ.LIZ.LJ(THT.class, null)).vc0(true);
        FilterBean LIZ = ((WRP) this.LIZ.LJIILIIL.getValue()).getCurSelectedFilter().LIZ();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", this.LIZ.LJI().shootWay);
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("creation_id", this.LIZ.LJI().LJI());
        if (LIZ != null) {
            num = Integer.valueOf(LIZ.getId());
        } else {
            num = null;
        }
        c145995oB.LIZJ(num, "filter_id");
        if (LIZ != null) {
            str = LIZ.getEnName();
        }
        c145995oB.LJI("filter_name", str);
        if (this.LIZ.LJI().draftId != 0) {
            c145995oB.LIZ(this.LIZ.LJI().draftId, "draft_id");
        }
        FMX.LJIIL("click_modify_entrance", c145995oB.LIZ);
    }
}
