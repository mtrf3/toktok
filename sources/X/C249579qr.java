package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9qr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249579qr extends C249559qp {
    public static final C5H3 LJLLLL = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C249759r9.LJLIL);

    @Override // X.C249559qp
    public final boolean LJI() {
        List<ActivityTask> list = this.LJLJJI;
        if (list == null || list.isEmpty()) {
            return true;
        }
        if (this.LJLJJLL < ((ActivityTask) ListProtector.get(this.LJLJJI, 0)).count || !LJIJJLI()) {
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
    public final void LJIILLIIL() {
        this.LJLILLLLZI = 0L;
        ActivityTask LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            this.LJLJJL = LJIIIIZZ;
        }
    }

    @Override // X.C249559qp
    public final void LJIJ() {
        this.LJLILLLLZI = 0L;
    }

    @Override // X.C249559qp
    public final void LJIILL(ActivityTask activityTask) {
        this.LJLJJLL++;
    }

    @Override // X.C249559qp
    public final void LJIJJ(List<ActivityTask> list) {
        this.LJLJJI = C249919rP.LIZIZ(5, list);
    }

    @Override // X.InterfaceC249499qj
    public final void LIZIZ(List list, SpecActPendantManager uIListener) {
        o.LJIIIZ(uIListener, "uIListener");
        LJIJI("WatchMultiVideoTaskManager", "watch_multi_video_timer", "", "", "referral_watch_video_count", "excute_task_date", "has_active_manually");
        LJIL(list);
    }
}
