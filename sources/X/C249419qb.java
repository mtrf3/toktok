package X;

import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.9qb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249419qb extends C249559qp {
    public static final C5H3 LJLZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C249429qc.LJLIL);
    public List<String> LJLLLL = new ArrayList();
    public String LJLLLLLL = "";

    @Override // X.C249559qp
    public final boolean LJI() {
        if (((ArrayList) this.LJLLLL).size() == this.LJLJJI.size() && LJIJJLI()) {
            return true;
        }
        return false;
    }

    @Override // X.C249559qp
    public final ActivityTask LJIIIIZZ() {
        boolean z;
        List<ActivityTask> list = this.LJLJJI;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        for (ActivityTask activityTask : this.LJLJJI) {
            if (activityTask.time <= this.LJLILLLLZI) {
                if (!this.LJLLLL.contains(activityTask.taskKey)) {
                }
            }
            return activityTask;
        }
        return null;
    }

    @Override // X.C249559qp
    public final void LJIIL() {
        this.LJLLLLLL = "";
        ((ArrayList) this.LJLLLL).clear();
        this.LJLIL.storeString(C247509nW.LIZ("completed_task_id_list"), "");
    }

    @Override // X.C249559qp
    public final void LJIJ() {
        String string = this.LJLIL.getString(C247509nW.LIZ("completed_task_id_list"), "");
        o.LJIIIIZZ(string, "keva.getString(UserIdUti…PLETED_TASK_ID_LIST), \"\")");
        this.LJLLLLLL = string;
        if (string.length() > 0) {
            this.LJLLLL = ORZ.LLJILJILJ(s.LJLJJL(this.LJLLLLLL, new String[]{","}, 0, 6));
        }
    }

    @Override // X.C249559qp
    public final void LJJI() {
        this.LJLLLLLL = "";
        ((ArrayList) this.LJLLLL).clear();
        this.LJLIL.storeString(C247509nW.LIZ("completed_task_id_list"), "");
        C247659nl.LIZ.LIZ(String.valueOf(this.LJLILLLLZI), C247509nW.LIZ("inapppush_watch_video_time"));
    }

    @Override // X.C249559qp
    public final void LJIILL(ActivityTask activityTask) {
        String LIZ;
        ActivityTask LJIIIIZZ;
        String str = activityTask.taskKey;
        if (this.LJLLLLLL.length() == 0) {
            LIZ = str;
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ = C0MT.LIZ(LIZ2, this.LJLLLLLL, ',', str, LIZ2);
        }
        this.LJLLLLLL = LIZ;
        ((ArrayList) this.LJLLLL).add(str);
        this.LJLIL.storeString(C247509nW.LIZ("completed_task_id_list"), this.LJLLLLLL);
        C247689no.LIZ().LJJII(activityTask.taskType, str);
        if (((ArrayList) this.LJLLLL).size() < this.LJLJJI.size() && (LJIIIIZZ = LJIIIIZZ()) != null) {
            this.LJLJJL = LJIIIIZZ;
        }
    }

    @Override // X.C249559qp
    public final void LJIJJ(List<ActivityTask> list) {
        this.LJLJJI = C249919rP.LIZIZ(6, list);
    }

    @Override // X.InterfaceC249499qj
    public final void LIZIZ(List list, SpecActPendantManager uIListener) {
        o.LJIIIZ(uIListener, "uIListener");
        LJIJI("VideoTimeTaskManager", "video_time_task", "background_task_time", "inapppush_watch_video_time", "", "background_task_date", "has_active_manually");
        LJIL(list);
    }
}
