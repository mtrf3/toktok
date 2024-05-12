package X;

import android.os.Handler;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.model.TimerPendant;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.9ql, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249519ql extends C249559qp {
    public static final C5H3 LLF = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C249749r8.LJLIL);
    public int LJLLLL;
    public InterfaceC249619qv LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public List<String> LJZI = new ArrayList();
    public String LJZL = "";
    public boolean LL;
    public boolean LLD;

    @Override // X.C249559qp
    public final boolean LJJ() {
        return false;
    }

    @Override // X.C249559qp
    public final void LJJI() {
        this.LJLLLL = 0;
        this.LJLIL.storeInt(C247509nW.LIZ("current_stage"), 0);
        this.LLD = false;
        this.LJLIL.storeBoolean(C247509nW.LIZ("is_reward_state"), false);
        this.LJZL = "";
        ((ArrayList) this.LJZI).clear();
        this.LJLIL.storeString(C247509nW.LIZ("completed_task_id_list"), "");
    }

    public final int LJJIII() {
        long j;
        int i;
        int i2;
        List<Integer> list;
        Integer num;
        int i3;
        int i4;
        int i5 = 0;
        try {
            if (this.LJLJJI.isEmpty()) {
                return 0;
            }
            int i6 = 0;
            for (int i7 = this.LJLLLL - 1; i7 >= 0; i7--) {
                Integer num2 = ((ActivityTask) ListProtector.get(this.LJLJJI, i7)).scoreAmount;
                if (num2 != null) {
                    i4 = num2.intValue();
                } else {
                    i4 = 0;
                }
                i6 += i4;
            }
            if (LJI()) {
                return i6;
            }
            int i8 = (int) this.LJLILLLLZI;
            List<ActivityTask> list2 = this.LJLJJI;
            if (i8 >= ((ActivityTask) ListProtector.get(list2, list2.size() - 1)).time) {
                int i9 = 0;
                for (int size = this.LJLJJI.size() - 1; size >= 0; size--) {
                    Integer num3 = ((ActivityTask) ListProtector.get(this.LJLJJI, size)).scoreAmount;
                    if (num3 != null) {
                        i3 = num3.intValue();
                    } else {
                        i3 = 0;
                    }
                    i9 += i3;
                }
                return i9;
            }
            if (this.LJLLLL == 0) {
                j = this.LJLILLLLZI;
            } else {
                j = this.LJLILLLLZI - ((ActivityTask) ListProtector.get(this.LJLJJI, r2 - 1)).time;
            }
            int i10 = this.LJLLLL;
            if (i10 == 0) {
                i = ((ActivityTask) ListProtector.get(this.LJLJJI, 0)).time;
            } else {
                i = ((ActivityTask) ListProtector.get(this.LJLJJI, i10)).time - ((ActivityTask) ListProtector.get(this.LJLJJI, this.LJLLLL - 1)).time;
            }
            ActivityTask activityTask = this.LJLJJL;
            if (activityTask != null && (num = activityTask.scoreAmount) != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            ActivityTask activityTask2 = this.LJLJJL;
            if (activityTask2 != null && (list = activityTask2.rewardLayer) != null && !list.isEmpty()) {
                int size2 = i / list.size();
                int i11 = ((int) j) / size2;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    i12 += (int) ((((Number) ListProtector.get(list, i13)).intValue() / 100) * i2);
                }
                float f = (((float) (j - (size2 * i11))) / size2) * i2;
                if (i11 >= list.size()) {
                    i11--;
                }
                i5 = ((int) ((f * ((Number) ListProtector.get(list, i11)).intValue()) / 100)) + i12;
            }
            return i6 + i5;
        } catch (Exception unused) {
            return 0;
        }
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
    public final void LJIIL() {
        if (this.LJLLLL == this.LJLJJI.size() && !this.LJLZ) {
            this.LJLJL = false;
            this.LJLIL.storeBoolean(C247509nW.LIZ("has_active_manually"), false);
        }
        this.LJLLLL = 0;
        this.LJLIL.storeInt(C247509nW.LIZ("current_stage"), 0);
        this.LLD = false;
        this.LJLIL.storeBoolean(C247509nW.LIZ("is_reward_state"), false);
        this.LJZL = "";
        ((ArrayList) this.LJZI).clear();
        this.LJLIL.storeString(C247509nW.LIZ("completed_task_id_list"), "");
        if (this.LJLJL) {
            InterfaceC249619qv interfaceC249619qv = this.LJLLLLLL;
            if (interfaceC249619qv != null) {
                interfaceC249619qv.LIZIZ();
                return;
            }
            return;
        }
        InterfaceC249619qv interfaceC249619qv2 = this.LJLLLLLL;
        if (interfaceC249619qv2 == null) {
            return;
        }
        interfaceC249619qv2.LJIILL("non_tracker", "finished", this.LJLZ ? 1 : 0, false, false);
    }

    @Override // X.C249559qp
    public final void LJIILIIL() {
        InterfaceC249619qv interfaceC249619qv;
        int i;
        final boolean z;
        InterfaceC249619qv interfaceC249619qv2;
        TimerPendant timerPendant;
        String str;
        InterfaceC249619qv interfaceC249619qv3;
        int i2;
        InterfaceC249619qv interfaceC249619qv4;
        String LJIL;
        ActivityTask activityTask = this.LJLJJL;
        if (activityTask != null) {
            final Integer num = activityTask.roundTime;
            if (num != null) {
                int i3 = activityTask.time - ((int) this.LJLILLLLZI);
                if (i3 != 2) {
                    if (i3 == 5 && (interfaceC249619qv4 = this.LJLLLLLL) != null && (LJIL = interfaceC249619qv4.LJIL()) != null) {
                        C247779nx.LIZ(LJIL, "timer");
                    }
                } else {
                    InterfaceC249619qv interfaceC249619qv5 = this.LJLLLLLL;
                    if (interfaceC249619qv5 != null) {
                        interfaceC249619qv5.LJIILIIL();
                    }
                }
                int intValue = ((int) this.LJLILLLLZI) % num.intValue();
                InterfaceC249619qv interfaceC249619qv6 = this.LJLLLLLL;
                if (interfaceC249619qv6 != null) {
                    if (intValue == 0) {
                        i2 = num.intValue();
                    } else {
                        i2 = intValue;
                    }
                    interfaceC249619qv6.LJIIL(i2, num.intValue());
                }
                if (intValue == 0) {
                    ActivityTask activityTask2 = this.LJLJJL;
                    final boolean z2 = false;
                    if (activityTask2 != null) {
                        i = activityTask2.time;
                    } else {
                        i = 0;
                    }
                    if (this.LJLILLLLZI == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C9OT c9ot = C2MW.LIZ().LJ;
                    if (c9ot == null || (timerPendant = c9ot.LJLILLLLZI) == null || (str = timerPendant.rewardLottieName) == null || str.length() == 0 ? !((interfaceC249619qv2 = this.LJLLLLLL) == null || !interfaceC249619qv2.LJIIJJI()) : !(z || (interfaceC249619qv3 = this.LJLLLLLL) == null || !interfaceC249619qv3.LJIIJJI())) {
                        z2 = true;
                        this.LL = true;
                    }
                    final AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this, 1318);
                    new Handler(C16880lQ.LLJJJJ()).postDelayed(new Runnable() { // from class: X.9qm
                        public final void LIZ() {
                            C249519ql c249519ql = this;
                            InterfaceC249619qv interfaceC249619qv7 = c249519ql.LJLLLLLL;
                            if (interfaceC249619qv7 != null) {
                                interfaceC249619qv7.LJII(z2, c249519ql.LJJIII(), aqS170S0100000_4, z, false);
                            }
                            long intValue2 = this.LJLILLLLZI / num.intValue();
                            InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                            if (interfaceC247459nR != null) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("score_amount", String.valueOf(this.LJJIII()));
                                linkedHashMap.put("cash_amount", CardStruct.IStatusCode.DEFAULT);
                                linkedHashMap.put("num", String.valueOf(intValue2));
                                linkedHashMap.put("duration", String.valueOf(this.LJLILLLLZI));
                                interfaceC247459nR.LIZIZ("widget_time_tracker_1round", linkedHashMap);
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ;
                            try {
                                LIZ();
                            } finally {
                                if (LIZ) {
                                }
                            }
                        }
                    }, 1000L);
                }
            }
            int i4 = activityTask.time;
            if (i4 > 180 && ((int) this.LJLILLLLZI) == i4 / 2 && (interfaceC249619qv = this.LJLLLLLL) != null) {
                C247739nt.LIZ(interfaceC249619qv, 8, activityTask.taskKey, null, 28);
            }
        }
    }

    @Override // X.C249559qp
    public final void LJIILJJIL() {
        String str;
        InterfaceC249619qv interfaceC249619qv = this.LJLLLLLL;
        if (interfaceC249619qv != null) {
            boolean z = this.LJLZ;
            if (!LJI()) {
                str = "ongoing";
            } else {
                str = "finished";
            }
            interfaceC249619qv.LJIILL("tracker", str, z ? 1 : 0, true, this.LLD);
        }
        InterfaceC249619qv interfaceC249619qv2 = this.LJLLLLLL;
        if (interfaceC249619qv2 != null) {
            C247739nt.LIZ(interfaceC249619qv2, 7, "", null, 28);
        }
    }

    @Override // X.C249559qp
    public final void LJIJ() {
        this.LJLLLL = this.LJLIL.getInt(C247509nW.LIZ("current_stage"), 0);
        this.LLD = this.LJLIL.getBoolean(C247509nW.LIZ("is_reward_state"), false);
        C2MW.LIZ();
        if (!this.LJLJJI.isEmpty()) {
            this.LJLZ = ((ActivityTask) ListProtector.get(this.LJLJJI, 0)).isAuto;
        }
        String string = this.LJLIL.getString(C247509nW.LIZ("completed_task_id_list"), "");
        o.LJIIIIZZ(string, "keva.getString(UserIdUti…PLETED_TASK_ID_LIST), \"\")");
        this.LJZL = string;
        if (string.length() > 0) {
            this.LJZI = ORZ.LLJILJILJ(s.LJLJJL(this.LJZL, new String[]{","}, 0, 6));
        }
    }

    @Override // X.C249559qp
    public final boolean LJJIFFI() {
        return !this.LL;
    }

    public final boolean LJJIIJ() {
        if (this.LJLIL.getLong("all_task_finish_date", 0L) == C245559kN.LIZ()) {
            return true;
        }
        return false;
    }

    public final boolean LJJIIJZLJL() {
        List<ActivityTask> list = this.LJLJJI;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void LJJIIZ() {
        boolean z;
        String str;
        if (!this.LJLJJI.isEmpty()) {
            if (this.LJLJL) {
                InterfaceC249619qv interfaceC249619qv = this.LJLLLLLL;
                if (interfaceC249619qv != null) {
                    if (!LJI() || this.LLD) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z2 = this.LJLZ;
                    if (!LJI()) {
                        str = "ongoing";
                    } else {
                        str = "finished";
                    }
                    interfaceC249619qv.LJIILL("tracker", str, z2 ? 1 : 0, z, this.LLD);
                }
                InterfaceC249619qv interfaceC249619qv2 = this.LJLLLLLL;
                if (interfaceC249619qv2 != null) {
                    interfaceC249619qv2.LIZJ(LJJIII());
                    return;
                }
                return;
            }
            InterfaceC249619qv interfaceC249619qv3 = this.LJLLLLLL;
            if (interfaceC249619qv3 == null) {
                return;
            }
            interfaceC249619qv3.LJIILL("non_tracker", "finished", this.LJLZ ? 1 : 0, false, false);
        }
    }

    @Override // X.C249559qp
    public final void LJIIJ() {
        if ((C247509nW.LIZIZ() || !LJJIIJ()) && (!this.LJLJJI.isEmpty()) && ((ActivityTask) ListProtector.get(this.LJLJJI, 0)).isAuto) {
            C249559qp.LJ(this, true, 30);
        }
    }

    @Override // X.C249559qp
    public final void LJJII() {
        if (C247509nW.LIZIZ()) {
            long j = this.LJLIL.getLong(this.LJLJLJ, 0L);
            if (j > 0) {
                this.LJLJL = true;
            }
            if (LJJIIJ()) {
                this.LLD = true;
                this.LJLIL.storeBoolean(C247509nW.LIZ("is_reward_state"), this.LLD);
            }
            this.LJLILLLLZI += j;
            this.LJLLLL = 0;
            List<ActivityTask> list = this.LJLJJI;
            if (list != null) {
                Iterator<ActivityTask> it = list.iterator();
                while (it.hasNext()) {
                    if (this.LJLILLLLZI >= it.next().time) {
                        this.LJLLLL++;
                    }
                }
            }
            Keva keva = this.LJLIL;
            keva.storeLong(C247509nW.LIZ(this.LJLJLJ), this.LJLILLLLZI);
            keva.storeInt(C247509nW.LIZ("current_stage"), this.LJLLLL);
            keva.storeBoolean(C247509nW.LIZ(this.LJLLJ), this.LJLJL);
            keva.storeLong(this.LJLJLJ, 0L);
            keva.storeInt("current_stage", 0);
        }
        if (!C247509nW.LIZIZ() && LJJIIJ()) {
            this.LJLJL = false;
        }
    }

    @Override // X.C249559qp, X.InterfaceC249499qj
    public final void clear() {
        super.clear();
        this.LJLJL = false;
        this.LJZ = false;
        this.LJLLLL = 0;
        this.LJLZ = false;
        this.LLD = false;
    }

    @Override // X.C249559qp
    public final void LJIILL(ActivityTask activityTask) {
        String LIZ;
        this.LJLLLL++;
        this.LJLIL.storeInt(C247509nW.LIZ("current_stage"), this.LJLLLL);
        String str = activityTask.taskKey;
        if (this.LJZL.length() == 0) {
            LIZ = str;
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ = C0MT.LIZ(LIZ2, this.LJZL, ',', str, LIZ2);
        }
        this.LJZL = LIZ;
        ((ArrayList) this.LJZI).add(str);
        this.LJLIL.storeString(C247509nW.LIZ("completed_task_id_list"), this.LJZL);
        C247689no.LIZ().LJJII(6, str);
        InterfaceC249619qv interfaceC249619qv = this.LJLLLLLL;
        if (interfaceC249619qv != null) {
            interfaceC249619qv.LJIILJJIL();
        }
        if (this.LJLLLL < this.LJLJJI.size()) {
            ActivityTask LJIIIIZZ = LJIIIIZZ();
            if (LJIIIIZZ != null) {
                this.LJLJJL = LJIIIIZZ;
                return;
            }
            return;
        }
        this.LJLIL.storeLong("all_task_finish_date", C245559kN.LIZ());
    }

    @Override // X.C249559qp
    public final void LJIJJ(List<ActivityTask> list) {
        this.LJLJJI = C249919rP.LIZIZ(9, list);
    }

    @Override // X.InterfaceC249499qj
    public final void LIZIZ(List list, SpecActPendantManager uIListener) {
        o.LJIIIZ(uIListener, "uIListener");
        if (uIListener.LJJIJL()) {
            this.LJLLLLLL = uIListener;
        }
        LJIJI("VideoTimeWithUITaskManager", "video_time_ui_task", "background_task_time", "activation_task_total_time", "", "background_task_date", "has_active_manually");
        LJIL(list);
        this.LJZ = true;
    }
}
