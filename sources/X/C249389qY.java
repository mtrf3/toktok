package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.9qY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249389qY extends C249559qp {
    public static final C5H3 LJZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C249399qZ.LJLIL);
    public int LJLLLL;
    public List<String> LJLLLLLL = new ArrayList();
    public String LJLZ = "";

    @Override // X.C249559qp
    public final void LJIIL() {
        this.LJLLLL = 0;
        this.LJLZ = "";
        ((ArrayList) this.LJLLLLLL).clear();
        this.LJLIL.storeString(C247509nW.LIZ("digg_video_id_list"), "");
        C247659nl.LIZ.LIZ(String.valueOf(this.LJLLLL), C247509nW.LIZ("referral_like_video_count"));
    }

    @Override // X.C249559qp
    public final void LJJI() {
        this.LJLLLL = 0;
        this.LJLZ = "";
        ((ArrayList) this.LJLLLLLL).clear();
        this.LJLIL.storeString(C247509nW.LIZ("digg_video_id_list"), "");
        C247659nl.LIZ.LIZ(String.valueOf(this.LJLLLL), C247509nW.LIZ("referral_like_video_count"));
    }

    @Override // X.C249559qp
    public final boolean LJI() {
        List<ActivityTask> list = this.LJLJJI;
        if (list == null || list.isEmpty()) {
            return true;
        }
        if (((ActivityTask) ListProtector.get(this.LJLJJI, 0)).count != this.LJLLLL || !LJIJJLI()) {
            return false;
        }
        return true;
    }

    @Override // X.C249559qp
    public final ActivityTask LJIIIIZZ() {
        List<ActivityTask> list = this.LJLJJI;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (ActivityTask) ListProtector.get(this.LJLJJI, 0);
    }

    @Override // X.C249559qp
    public final void LJIJ() {
        String string = this.LJLIL.getString(C247509nW.LIZ("digg_video_id_list"), "");
        o.LJIIIIZZ(string, "keva.getString(UserIdUti…(DIGG_VIDEO_ID_LIST), \"\")");
        this.LJLZ = string;
        if (string.length() > 0) {
            this.LJLLLLLL = ORZ.LLJILJILJ(s.LJLJJL(this.LJLZ, new String[]{","}, 0, 6));
        }
        this.LJLLLL = ((ArrayList) this.LJLLLLLL).size();
    }

    @Override // X.C249559qp
    public final void LJIJJ(List<ActivityTask> list) {
        this.LJLJJI = C249919rP.LIZIZ(10, list);
    }

    @Override // X.InterfaceC249499qj
    public final void LIZIZ(List list, SpecActPendantManager uIListener) {
        o.LJIIIZ(uIListener, "uIListener");
        LJIJI("DigVideoTaskManager", "digg_video_task", "", "", "", "background_task_date", "has_active_manually");
        LJIL(list);
    }
}
