package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9qu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249609qu extends C249559qp {
    public static final C5H3 LJLLLLLL = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C249709r4.LJLIL);
    public int LJLLLL;

    @Override // X.C249559qp
    public final void LJIIL() {
        this.LJLLLL = 0;
        this.LJLIL.storeInt(C247509nW.LIZ("finished_task_stage"), -1);
        this.LJLIL.storeBoolean(C247509nW.LIZ("do_like_or_comment_action"), false);
        this.LJLIL.storeBoolean(C247509nW.LIZ("has_report_read_and_like_task"), false);
        C247659nl.LIZ.LIZ("false", C247509nW.LIZ("do_like_or_comment_action"));
    }

    @Override // X.C249559qp
    public final void LJJI() {
        this.LJLLLL = 0;
        this.LJLIL.storeInt(C247509nW.LIZ("finished_task_stage"), -1);
        this.LJLIL.storeBoolean(C247509nW.LIZ("do_like_or_comment_action"), false);
        this.LJLIL.storeBoolean(C247509nW.LIZ("has_report_read_and_like_task"), false);
    }

    @Override // X.C249559qp, X.InterfaceC250059rd
    public final void LJFF() {
        this.LJLIL.storeLong(C247509nW.LIZ("pendant_time_name"), this.LJLILLLLZI);
        C247659nl.LIZ.LIZ(String.valueOf(this.LJLILLLLZI), C247509nW.LIZ("referral_video_task_time_left"));
        this.LJLIL.storeLong(C247509nW.LIZ("direct_show_pendant"), C245559kN.LIZ());
    }

    @Override // X.C249559qp
    public final boolean LJI() {
        if (this.LJLLLL == this.LJLJJI.size() && LJIJJLI()) {
            return true;
        }
        return false;
    }

    @Override // X.C249559qp
    public final ActivityTask LJIIIIZZ() {
        if (this.LJLLLL < this.LJLJJI.size()) {
            return (ActivityTask) ListProtector.get(this.LJLJJI, this.LJLLLL);
        }
        return null;
    }

    @Override // X.C249559qp
    public final void LJIJ() {
        this.LJLLLL = this.LJLIL.getInt(C247509nW.LIZ("finished_task_stage"), -1) + 1;
    }

    public final void LJJIII() {
        String str;
        LJFF();
        this.LJLIL.storeInt(C247509nW.LIZ("finished_task_stage"), this.LJLLLL);
        int i = this.LJLLLL + 1;
        this.LJLLLL = i;
        if (i < this.LJLJJI.size()) {
            ActivityTask LJIIIIZZ = LJIIIIZZ();
            if (LJIIIIZZ != null) {
                this.LJLJJL = LJIIIIZZ;
                return;
            }
            return;
        }
        this.LJLJL = false;
        this.LJLIL.storeBoolean(C247509nW.LIZ("pendant_has_active"), false);
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!this.LJLJJI.isEmpty()) {
            str = String.valueOf(((ActivityTask) ListProtector.get(this.LJLJJI, 0)).taskType);
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("task_type", str);
        interfaceC247459nR.LIZIZ("finish_activity_task", linkedHashMap);
    }

    @Override // X.C249559qp
    public final void LJIILL(ActivityTask activityTask) {
        int i = activityTask.time;
        String str = activityTask.taskKey;
        if (!TextUtils.isEmpty(str)) {
            AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this, 1314);
            AqS170S0100000_4 aqS170S0100000_42 = new AqS170S0100000_4(this, 1313);
            if (!o.LJ(str, "read_and_like_video")) {
                C249639qx LJIIIZ = LJIIIZ();
                long j = this.LJLILLLLZI;
                LJIIIZ.getClass();
                C249639qx.LIZ(str, i, j, aqS170S0100000_4, aqS170S0100000_42);
                return;
            }
            if (this.LJLIL.getBoolean(C247509nW.LIZ("do_like_or_comment_action"), false)) {
                C249639qx LJIIIZ2 = LJIIIZ();
                long j2 = this.LJLILLLLZI;
                LJIIIZ2.getClass();
                C249639qx.LIZ(str, i, j2, aqS170S0100000_4, aqS170S0100000_42);
                this.LJLIL.storeBoolean(C247509nW.LIZ("has_report_read_and_like_task"), true);
                InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                if (interfaceC247459nR == null) {
                    return;
                }
                interfaceC247459nR.LIZIZ("interact_task_complete", C0JU.LIZ("task_name", "complete"));
                return;
            }
            InterfaceC247459nR interfaceC247459nR2 = C95J.LIZ;
            if (interfaceC247459nR2 == null) {
                return;
            }
            interfaceC247459nR2.LIZIZ("interact_task_complete", C0JU.LIZ("task_name", "watch_video"));
        }
    }

    @Override // X.C249559qp
    public final void LJIJJ(List<ActivityTask> list) {
        this.LJLJJI = C249919rP.LIZIZ(1, list);
    }

    @Override // X.InterfaceC249499qj
    public final void LIZIZ(List list, SpecActPendantManager uIListener) {
        o.LJIIIZ(uIListener, "uIListener");
        LJIJI("ManualWatchVideoTaskManager", "pendant_global_timer_reducer", "pendant_time_name", "referral_video_task_time_left", "", "direct_show_pendant", "pendant_has_active");
        LJIL(list);
    }
}
