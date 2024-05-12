package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.9qs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249589qs extends C249559qp {
    public static final C5H3 LJZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C249729r6.LJLIL);
    public int LJLLLL;
    public List<String> LJLLLLLL = new ArrayList();
    public String LJLZ = "";

    @Override // X.C249559qp
    public final void LJIIL() {
        this.LJLLLL = 0;
        this.LJLZ = "";
        ((ArrayList) this.LJLLLLLL).clear();
        this.LJLIL.storeString(C247509nW.LIZ("completed_task_id_list"), "");
        this.LJLIL.storeInt(C247509nW.LIZ("background_task_finished_stage"), -1);
        this.LJLIL.storeBoolean(C247509nW.LIZ("do_like_or_comment_tribute_action"), false);
        this.LJLIL.storeBoolean(C247509nW.LIZ("has_report_like_and_comment_tribute"), false);
    }

    @Override // X.C249559qp
    public final void LJJI() {
        this.LJLLLL = 0;
        this.LJLZ = "";
        ((ArrayList) this.LJLLLLLL).clear();
        this.LJLIL.storeString(C247509nW.LIZ("completed_task_id_list"), "");
        this.LJLIL.storeInt(C247509nW.LIZ("background_task_finished_stage"), -1);
        C247659nl.LIZ.LIZ(String.valueOf(this.LJLILLLLZI), C247509nW.LIZ("background_task_total_time"));
        this.LJLIL.storeBoolean(C247509nW.LIZ("do_like_or_comment_tribute_action"), false);
        this.LJLIL.storeBoolean(C247509nW.LIZ("has_report_like_and_comment_tribute"), false);
    }

    @Override // X.C249559qp
    public final boolean LJI() {
        if (((ArrayList) this.LJLLLLLL).size() == this.LJLJJI.size() && LJIJJLI()) {
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
                if (!this.LJLLLLLL.contains(activityTask.taskKey)) {
                }
            }
            return activityTask;
        }
        return null;
    }

    @Override // X.C249559qp
    public final void LJIJ() {
        this.LJLLLL = this.LJLIL.getInt(C247509nW.LIZ("background_task_finished_stage"), -1) + 1;
        String string = this.LJLIL.getString(C247509nW.LIZ("completed_task_id_list"), "");
        o.LJIIIIZZ(string, "keva.getString(UserIdUti…PLETED_TASK_ID_LIST), \"\")");
        this.LJLZ = string;
        if (string.length() > 0) {
            this.LJLLLLLL = ORZ.LLJILJILJ(s.LJLJJL(this.LJLZ, new String[]{","}, 0, 6));
        }
    }

    @Override // X.C249559qp
    public final void LJIILL(ActivityTask activityTask) {
        int i = activityTask.time;
        String str = activityTask.taskKey;
        if (!TextUtils.isEmpty(str)) {
            AqS58S1100000_4 aqS58S1100000_4 = new AqS58S1100000_4(this, str, 44);
            AqS58S1100000_4 aqS58S1100000_42 = new AqS58S1100000_4(this, str, 43);
            if (!o.LJ(str, "like_comment_tribute")) {
                C249639qx LJIIIZ = LJIIIZ();
                long j = this.LJLILLLLZI;
                LJIIIZ.getClass();
                C249639qx.LIZ(str, i, j, aqS58S1100000_4, aqS58S1100000_42);
                return;
            }
            if (this.LJLIL.getBoolean(C247509nW.LIZ("do_like_or_comment_tribute_action"), false)) {
                C249639qx LJIIIZ2 = LJIIIZ();
                long j2 = this.LJLILLLLZI;
                LJIIIZ2.getClass();
                C249639qx.LIZ(str, i, j2, aqS58S1100000_4, aqS58S1100000_42);
                this.LJLIL.storeBoolean(C247509nW.LIZ("has_report_like_and_comment_tribute"), true);
                InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                if (interfaceC247459nR == null) {
                    return;
                }
                interfaceC247459nR.LIZIZ("interact_task_complete", JF1.LIZIZ("task_name", "complete", "task_id", str));
                return;
            }
            InterfaceC247459nR interfaceC247459nR2 = C95J.LIZ;
            if (interfaceC247459nR2 == null) {
                return;
            }
            interfaceC247459nR2.LIZIZ("interact_task_complete", JF1.LIZIZ("task_name", "watch_video", "task_id", str));
        }
    }

    @Override // X.C249559qp
    public final void LJIJJ(List<ActivityTask> list) {
        this.LJLJJI = C249919rP.LIZIZ(2, list);
    }

    public final void LJJIII(String str) {
        String LIZ;
        String str2;
        this.LJLIL.storeInt(C247509nW.LIZ("background_task_finished_stage"), this.LJLLLL);
        this.LJLLLL++;
        if (this.LJLZ.length() == 0) {
            LIZ = str;
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ = C0MT.LIZ(LIZ2, this.LJLZ, ',', str, LIZ2);
        }
        this.LJLZ = LIZ;
        ((ArrayList) this.LJLLLLLL).add(str);
        this.LJLIL.storeString(C247509nW.LIZ("completed_task_id_list"), this.LJLZ);
        if (((ArrayList) this.LJLLLLLL).size() < this.LJLJJI.size()) {
            ActivityTask LJIIIIZZ = LJIIIIZZ();
            if (LJIIIIZZ != null) {
                this.LJLJJL = LJIIIIZZ;
                return;
            }
            return;
        }
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!this.LJLJJI.isEmpty()) {
            str2 = String.valueOf(((ActivityTask) ListProtector.get(this.LJLJJI, 0)).taskType);
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("task_type", str2);
        interfaceC247459nR.LIZIZ("finish_activity_task", linkedHashMap);
    }

    @Override // X.InterfaceC249499qj
    public final void LIZIZ(List list, SpecActPendantManager uIListener) {
        o.LJIIIZ(uIListener, "uIListener");
        C2MW.LIZ();
        LJIJI("SpecActBackgroundTask", "pendant_global_timer_reducer", "background_task_time", "background_task_total_time", "", "background_task_date", "has_active_manually");
        LJIL(list);
    }
}
