package X;

import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.bytedance.touchpoint.core.redpacketpendant.manager.RedPacketPendantManager;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9oU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C248109oU extends C249559qp {
    public RedPacketPendantManager LJLLLL;
    public static final C9OS LJLZ = new C9OS();
    public static final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(C248119oV.LJLIL);

    @Override // X.C249559qp
    public final boolean LJJ() {
        return false;
    }

    @Override // X.C249559qp
    public final boolean LJJIFFI() {
        C248039oN c248039oN;
        RedPacketPendantManager LIZ = C247619nh.LIZ();
        if (LIZ.LJLJJL && (c248039oN = LIZ.LJLJJI) != null && c248039oN.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C249559qp
    public final ActivityTask LJIIIIZZ() {
        return (ActivityTask) ORZ.LJLLLLLL(0, this.LJLJJI);
    }

    @Override // X.C249559qp
    public final boolean LJI() {
        ActivityTask LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ == null) {
            return true;
        }
        if (LJIIIIZZ.time != -1 && LJIJJLI() && this.LJLILLLLZI >= LJIIIIZZ.time) {
            return true;
        }
        return false;
    }

    @Override // X.C249559qp
    public final void LJIILIIL() {
        if (LJIIIIZZ() != null) {
            long j = r0.time - this.LJLILLLLZI;
            if (j < 0) {
                return;
            }
            if (j == 0) {
                this.LJLIL.storeLong("countdown_finish_date", C245559kN.LIZ());
            }
            RedPacketPendantManager redPacketPendantManager = this.LJLLLL;
            if (redPacketPendantManager != null) {
                redPacketPendantManager.LJJIIZI(j);
            }
        }
    }

    @Override // X.C249559qp
    public final void LJJII() {
        if (!C247509nW.LIZIZ()) {
            return;
        }
        this.LJLILLLLZI += this.LJLIL.getLong(this.LJLJLJ, 0L);
        this.LJLIL.storeLong(C247509nW.LIZ(this.LJLJLJ), this.LJLILLLLZI);
        this.LJLIL.storeLong(this.LJLJLJ, 0L);
    }

    @Override // X.C249559qp
    public final void LJIJJ(List<ActivityTask> list) {
        this.LJLJJI = C249919rP.LIZIZ(999, list);
    }

    @Override // X.InterfaceC249499qj
    public final void LIZIZ(List list, SpecActPendantManager uIListener) {
        o.LJIIIZ(uIListener, "uIListener");
        LJIJI("RedPacketFakeTaskManager", "red_packet_fake_task", "current_time", "", "", "background_task_date", "has_active_manually");
        LJIL(list);
    }
}
