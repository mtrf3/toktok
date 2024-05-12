package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9qe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249449qe extends C249559qp {
    public static final C5H3 LJLLLLLL = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C249459qf.LJLIL);
    public int LJLLLL;

    @Override // X.C249559qp
    public final void LJIIL() {
        this.LJLLLL = 0;
        this.LJLIL.storeInt(C247509nW.LIZ("current_stage"), 0);
    }

    @Override // X.C249559qp
    public final void LJJI() {
        this.LJLLLL = 0;
        this.LJLIL.storeLong(C247509nW.LIZ("activated_task_time"), 0L);
        this.LJLIL.storeString(C247509nW.LIZ("activated_task_name"), "");
        this.LJLIL.storeInt(C247509nW.LIZ("current_stage"), 0);
    }

    @Override // X.C249559qp
    public final boolean LJI() {
        List<ActivityTask> list = this.LJLJJI;
        if (list == null || list.isEmpty()) {
            return true;
        }
        if (this.LJLLLL != this.LJLJJI.size() || !LJIJJLI()) {
            return false;
        }
        return true;
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
        ActivityTask activityTask = (ActivityTask) ListProtector.get(this.LJLJJI, 0);
        if (!activityTask.isAuto) {
            activityTask.time = (int) this.LJLIL.getLong(C247509nW.LIZ("activated_task_time"), 0L);
            String string = this.LJLIL.getString(C247509nW.LIZ("activated_task_name"), "");
            o.LJIIIIZZ(string, "keva.getString(UserIdUti…ACTIVATED_TASK_NAME), \"\")");
            activityTask.taskKey = string;
            if (activityTask.time == 0 || string.length() == 0) {
                return null;
            }
            return activityTask;
        }
        if (this.LJLLLL >= this.LJLJJI.size()) {
            return null;
        }
        return (ActivityTask) ListProtector.get(this.LJLJJI, this.LJLLLL);
    }

    @Override // X.C249559qp
    public final void LJIIJJI() {
        this.LJLILLLLZI = 0L;
        this.LJLLLL = 0;
        this.LJLIL.storeInt(C247509nW.LIZ("current_stage"), 0);
    }

    @Override // X.C249559qp
    public final void LJIJ() {
        this.LJLLLL = this.LJLIL.getInt(C247509nW.LIZ("current_stage"), 0);
    }

    @Override // X.C249559qp
    public final void LJIILL(ActivityTask activityTask) {
        String taskName;
        ActivityTask LJIIIIZZ;
        this.LJLLLL++;
        this.LJLIL.storeInt(C247509nW.LIZ("current_stage"), this.LJLLLL);
        if (((ActivityTask) ListProtector.get(this.LJLJJI, 0)).isAuto) {
            taskName = activityTask.taskKey;
        } else {
            taskName = this.LJLIL.getString(C247509nW.LIZ("activated_task_name"), "");
        }
        C250549sQ LIZ = C247689no.LIZ();
        o.LJIIIIZZ(taskName, "taskName");
        LIZ.LJJII(6, taskName);
        if (this.LJLLLL < this.LJLJJI.size() && (LJIIIIZZ = LJIIIIZZ()) != null) {
            this.LJLJJL = LJIIIIZZ;
        }
    }

    @Override // X.C249559qp
    public final void LJIJJ(List<ActivityTask> list) {
        this.LJLJJI = C249919rP.LIZIZ(8, list);
    }

    @Override // X.InterfaceC249499qj
    public final void LIZIZ(List list, SpecActPendantManager uIListener) {
        o.LJIIIZ(uIListener, "uIListener");
        LJIJI("ReplenishSignInTaskManager", "replenish_sign_in_time_task", "background_task_time", "sign_in_video_time", "", "background_task_date", "has_active_manually");
        LJIL(list);
    }
}
