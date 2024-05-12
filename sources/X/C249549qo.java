package X;

import Y.ARunnableS40S0100000_4;
import android.os.Handler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.model.TimerPendant;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.9qo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249549qo extends C249559qp {
    public static final C5H3 LLFF = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C249719r5.LJLIL);
    public int LJLLLL;
    public InterfaceC249619qv LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public List<String> LJZI = new ArrayList();
    public String LJZL = "";
    public boolean LL;
    public boolean LLD;
    public boolean LLF;

    @Override // X.C249559qp
    public final void LJII() {
        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
        if (abstractC247499nV != null && abstractC247499nV.LJIILLIIL()) {
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS40S0100000_4(this, 144), 5000L);
        }
        InterfaceC249619qv interfaceC249619qv = this.LJLLLLLL;
        if (interfaceC249619qv != null) {
            interfaceC249619qv.LJIJJLI();
        }
    }

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
        AbstractC247499nV abstractC247499nV;
        long j;
        int i;
        int i2;
        List<Integer> list;
        Integer num;
        int i3;
        int i4;
        int i5 = 0;
        try {
            if (!this.LJLJJI.isEmpty() && ((abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0)) == null || abstractC247499nV.LJIILLIIL())) {
                int LJJIIJ = ((C249599qt) C249599qt.LL.getValue()).LJJIIJ();
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
                    return i6 + LJJIIJ;
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
                    return i9 + LJJIIJ;
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
                return i6 + i5 + LJJIIJ;
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    @Override // X.C249559qp
    public final boolean LJI() {
        if (((ArrayList) this.LJZI).size() == this.LJLJJI.size() && LJIJJLI()) {
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
                if (!this.LJZI.contains(activityTask.taskKey)) {
                }
            }
            return activityTask;
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
            }
            InterfaceC249619qv interfaceC249619qv2 = this.LJLLLLLL;
            if (interfaceC249619qv2 != null) {
                interfaceC249619qv2.LJIIIIZZ(false);
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

    @Override // X.C249559qp
    public final void LJIILIIL() {
        InterfaceC249619qv interfaceC249619qv;
        int i;
        final boolean z;
        InterfaceC249619qv interfaceC249619qv2;
        final boolean z2;
        final boolean z3;
        C9OT c9ot;
        TimerPendant timerPendant;
        String str;
        TimerPendant timerPendant2;
        String str2;
        InterfaceC249619qv interfaceC249619qv3;
        int i2;
        InterfaceC249619qv interfaceC249619qv4;
        ActivityTask activityTask = this.LJLJJL;
        if (activityTask != null) {
            final Integer num = activityTask.roundTime;
            if (num != null) {
                if (activityTask.time - ((int) this.LJLILLLLZI) == 2 && (interfaceC249619qv4 = this.LJLLLLLL) != null) {
                    interfaceC249619qv4.LJIILIIL();
                }
                int intValue = ((int) this.LJLILLLLZI) % num.intValue();
                InterfaceC249619qv interfaceC249619qv5 = this.LJLLLLLL;
                if (interfaceC249619qv5 != null) {
                    if (intValue == 0) {
                        i2 = num.intValue();
                    } else {
                        i2 = intValue;
                    }
                    interfaceC249619qv5.LJIIL(i2, num.intValue());
                }
                if (intValue == 0) {
                    Boolean bool = activityTask.autoDone;
                    Boolean bool2 = Boolean.TRUE;
                    if (o.LJ(bool, bool2) && o.LJ(activityTask.roundTimeDone, bool2)) {
                        this.LLF = true;
                        C249639qx LJIIIZ = LJIIIZ();
                        String str3 = activityTask.taskKey;
                        int i3 = activityTask.time;
                        long j = this.LJLILLLLZI;
                        AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(this, activityTask, 243);
                        AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this, 1317);
                        LJIIIZ.getClass();
                        C249639qx.LIZ(str3, i3, j, aqS135S0200000_4, aqS170S0100000_4);
                    }
                    ActivityTask activityTask2 = this.LJLJJL;
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
                    C9OT c9ot2 = C2MW.LIZ().LJ;
                    if (c9ot2 == null || (timerPendant2 = c9ot2.LJLILLLLZI) == null || (str2 = timerPendant2.rewardLottieName) == null || str2.length() == 0 ? !((interfaceC249619qv2 = this.LJLLLLLL) == null || !interfaceC249619qv2.LJIIJJI()) : !(z || (interfaceC249619qv3 = this.LJLLLLLL) == null || !interfaceC249619qv3.LJIIJJI())) {
                        z2 = true;
                        this.LL = true;
                    } else {
                        z2 = false;
                    }
                    final AqS170S0100000_4 aqS170S0100000_42 = new AqS170S0100000_4(this, 1315);
                    AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                    if (abstractC247499nV != null && !abstractC247499nV.LJIILLIIL() && (c9ot = C2MW.LIZ().LJ) != null && (timerPendant = c9ot.LJLILLLLZI) != null && (str = timerPendant.bottomText) != null && str.length() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    new Handler(C16880lQ.LLJJJJ()).postDelayed(new Runnable() { // from class: X.9qn
                        public final void LIZ() {
                            C249549qo c249549qo = this;
                            InterfaceC249619qv interfaceC249619qv6 = c249549qo.LJLLLLLL;
                            if (interfaceC249619qv6 != null) {
                                interfaceC249619qv6.LJII(z2, c249549qo.LJJIII(), aqS170S0100000_42, z, z3);
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
        if (!this.LL && !this.LLF) {
            return true;
        }
        return false;
    }

    public final boolean LJJIIJ() {
        List<ActivityTask> list = this.LJLJJI;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void LJJIIJZLJL() {
        boolean z;
        String str;
        if (!this.LJLJJI.isEmpty()) {
            if (this.LJLJL) {
                InterfaceC249619qv interfaceC249619qv = this.LJLLLLLL;
                if (interfaceC249619qv != null) {
                    boolean z2 = this.LJLZ;
                    if (!LJI()) {
                        str = "ongoing";
                    } else {
                        str = "finished";
                    }
                    interfaceC249619qv.LJIILL("tracker", str, z2 ? 1 : 0, true, this.LLD);
                }
                AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                if (abstractC247499nV != null) {
                    z = abstractC247499nV.LJIILLIIL();
                } else {
                    z = false;
                }
                if (!LJI()) {
                    InterfaceC249619qv interfaceC249619qv2 = this.LJLLLLLL;
                    if (interfaceC249619qv2 != null) {
                        interfaceC249619qv2.LIZJ(LJJIII());
                    }
                    InterfaceC249619qv interfaceC249619qv3 = this.LJLLLLLL;
                    if (interfaceC249619qv3 != null) {
                        interfaceC249619qv3.LJIIIIZZ(false);
                        return;
                    }
                    return;
                }
                InterfaceC249619qv interfaceC249619qv4 = this.LJLLLLLL;
                if (interfaceC249619qv4 != null) {
                    interfaceC249619qv4.LJIIIZ(!z, false);
                }
                InterfaceC249619qv interfaceC249619qv5 = this.LJLLLLLL;
                if (interfaceC249619qv5 == null) {
                    return;
                }
                interfaceC249619qv5.LJIIIIZZ(z);
                return;
            }
            InterfaceC249619qv interfaceC249619qv6 = this.LJLLLLLL;
            if (interfaceC249619qv6 == null) {
                return;
            }
            interfaceC249619qv6.LJIILL("non_tracker", "finished", this.LJLZ ? 1 : 0, false, false);
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
        String str = activityTask.taskKey;
        int i = activityTask.time;
        if (o.LJ(activityTask.autoDone, Boolean.TRUE) && o.LJ(activityTask.roundTimeDone, Boolean.FALSE)) {
            AqS58S1100000_4 aqS58S1100000_4 = new AqS58S1100000_4(this, str, 42);
            AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this, 1316);
            C249639qx LJIIIZ = LJIIIZ();
            long j = this.LJLILLLLZI;
            LJIIIZ.getClass();
            C249639qx.LIZ(str, i, j, aqS58S1100000_4, aqS170S0100000_4);
        }
        this.LJLLLL++;
        this.LJLIL.storeInt(C247509nW.LIZ("current_stage"), this.LJLLLL);
        boolean z = false;
        if (this.LJZL.length() == 0) {
            LIZ = str;
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ = C0MT.LIZ(LIZ2, this.LJZL, ',', str, LIZ2);
        }
        this.LJZL = LIZ;
        ((ArrayList) this.LJZI).add(str);
        this.LJLIL.storeString(C247509nW.LIZ("completed_task_id_list"), this.LJZL);
        InterfaceC249619qv interfaceC249619qv = this.LJLLLLLL;
        if (interfaceC249619qv != null) {
            interfaceC249619qv.LJIILJJIL();
        }
        if (((ArrayList) this.LJZI).size() < this.LJLJJI.size()) {
            ActivityTask LJIIIIZZ = LJIIIIZZ();
            if (LJIIIIZZ != null) {
                this.LJLJJL = LJIIIIZZ;
                return;
            }
            return;
        }
        this.LJLIL.storeLong("all_task_finish_date", C245559kN.LIZ());
        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
        if (abstractC247499nV != null) {
            z = abstractC247499nV.LJIILLIIL();
        }
        InterfaceC249619qv interfaceC249619qv2 = this.LJLLLLLL;
        if (interfaceC249619qv2 == null) {
            return;
        }
        interfaceC249619qv2.LJIIIIZZ(z);
    }

    @Override // X.C249559qp
    public final void LJIJJ(List<ActivityTask> list) {
        this.LJLJJI = C249919rP.LIZIZ(12, list);
    }

    @Override // X.InterfaceC249499qj
    public final void LIZIZ(List list, SpecActPendantManager uIListener) {
        o.LJIIIZ(uIListener, "uIListener");
        if (uIListener.LJJIJL()) {
            this.LJLLLLLL = uIListener;
        }
        this.LL = false;
        LJIJI("MultiStageWithUITaskManager", "multi_stage_ui_task", "activation_multi_stage_task_time", "activation_multi_stage_task_time", "", "background_task_date", "has_active_manually");
        LJIL(list);
        this.LJZ = true;
    }
}
