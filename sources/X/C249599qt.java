package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.9qt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249599qt extends C249559qp {
    public static final C5H3 LL = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C249699r3.LJLIL);
    public int LJLLLL;
    public InterfaceC249619qv LJLLLLLL;
    public List<String> LJLZ = new ArrayList();
    public String LJZ = "";
    public boolean LJZI;
    public boolean LJZL;

    @Override // X.C249559qp
    public final void LJIIL() {
        this.LJLLLL = 0;
        this.LJZ = "";
        ((ArrayList) this.LJLZ).clear();
        this.LJLIL.storeString(C247509nW.LIZ("completed_task_id_list"), "");
        this.LJLIL.storeInt(C247509nW.LIZ("current_stage"), 0);
    }

    @Override // X.C249559qp
    public final void LJJI() {
        this.LJLLLL = 0;
        this.LJLIL.storeInt(C247509nW.LIZ("current_stage"), 0);
        this.LJZ = "";
        ((ArrayList) this.LJLZ).clear();
        this.LJLIL.storeString(C247509nW.LIZ("completed_task_id_list"), "");
    }

    public final int LJJIIJ() {
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
        if (((ArrayList) this.LJLZ).size() == this.LJLJJI.size() && LJIJJLI()) {
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
                if (!this.LJLZ.contains(activityTask.taskKey)) {
                }
            }
            return activityTask;
        }
        return null;
    }

    @Override // X.C249559qp
    public final void LJIJ() {
        this.LJLLLL = this.LJLIL.getInt(C247509nW.LIZ("current_stage"), 0);
        String string = this.LJLIL.getString(C247509nW.LIZ("completed_task_id_list"), "");
        o.LJIIIIZZ(string, "keva.getString(UserIdUti…PLETED_TASK_ID_LIST), \"\")");
        this.LJZ = string;
        if (string.length() > 0) {
            this.LJLZ = ORZ.LLJILJILJ(s.LJLJJL(this.LJZ, new String[]{","}, 0, 6));
        }
    }

    @Override // X.C249559qp
    public final boolean LJJIFFI() {
        return !this.LJZL;
    }

    @Override // X.C249559qp
    public final void LJIILIIL() {
        Integer num;
        String LJJIII;
        InterfaceC249619qv interfaceC249619qv;
        InterfaceC249619qv interfaceC249619qv2;
        ActivityTask LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            if (this.LJLLLL == 0) {
                if (C249659qz.LIZIZ == null) {
                    C249659qz.LIZIZ = Boolean.valueOf(((Keva) C249659qz.LIZ.getValue()).getBoolean(C247509nW.LIZ("need_show"), true));
                }
                if (o.LJ(C249659qz.LIZIZ, Boolean.TRUE) && C250349s6.LIZ(13, LJIIIIZZ.taskKey) != null) {
                    String LJJIII2 = LJJIII(LJIIIIZZ);
                    if (LJJIII2 != null && (interfaceC249619qv2 = this.LJLLLLLL) != null) {
                        C247739nt.LIZ(interfaceC249619qv2, 13, LJIIIIZZ.taskKey, LJJIII2, 24);
                    }
                }
            }
            Integer num2 = LJIIIIZZ.awardCount;
            if (num2 != null && num2.intValue() > 0 && (LJJIII = LJJIII(LJIIIIZZ)) != null && (interfaceC249619qv = this.LJLLLLLL) != null) {
                C247739nt.LIZ(interfaceC249619qv, 15, LJIIIIZZ.taskKey, LJJIII, 24);
            }
        }
        ActivityTask LJIIIIZZ2 = LJIIIIZZ();
        if (LJIIIIZZ2 != null && (num = LJIIIIZZ2.roundTime) != null) {
            int intValue = num.intValue();
            Boolean bool = LJIIIIZZ2.autoDone;
            Boolean bool2 = Boolean.TRUE;
            if (o.LJ(bool, bool2) && o.LJ(LJIIIIZZ2.roundTimeDone, bool2) && ((int) this.LJLILLLLZI) % intValue == 0) {
                this.LJZL = true;
                C249639qx LJIIIZ = LJIIIZ();
                String str = LJIIIIZZ2.taskKey;
                int i = LJIIIIZZ2.time;
                long j = this.LJLILLLLZI;
                AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(this, LJIIIIZZ2, 241);
                AqS135S0200000_4 aqS135S0200000_42 = new AqS135S0200000_4(this, LJIIIIZZ2, 242);
                LJIIIZ.getClass();
                C249639qx.LIZ(str, i, j, aqS135S0200000_4, aqS135S0200000_42);
            }
        }
    }

    @Override // X.C249559qp
    public final void LJIILL(ActivityTask activityTask) {
        int i;
        float f;
        Float f2;
        float f3;
        Float f4;
        boolean z;
        if (this.LJLLLL == 0) {
            C249659qz.LIZIZ = Boolean.FALSE;
            Keva keva = (Keva) C249659qz.LIZ.getValue();
            String LIZ = C247509nW.LIZ("need_show");
            Boolean bool = C249659qz.LIZIZ;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            keva.storeBoolean(LIZ, z);
        }
        String str = activityTask.taskKey;
        Boolean bool2 = activityTask.roundTimeDone;
        Boolean bool3 = Boolean.TRUE;
        if (o.LJ(bool2, bool3)) {
            LJJIIJZLJL(str);
            return;
        }
        if (o.LJ(activityTask.autoDone, bool3)) {
            int i2 = activityTask.time;
            AqS47S1200000_4 aqS47S1200000_4 = new AqS47S1200000_4(this, activityTask, str, 25);
            AqS47S1200000_4 aqS47S1200000_42 = new AqS47S1200000_4(this, activityTask, str, 24);
            C249639qx LJIIIZ = LJIIIZ();
            long j = this.LJLILLLLZI;
            LJIIIZ.getClass();
            C249639qx.LIZ(str, i2, j, aqS47S1200000_4, aqS47S1200000_42);
            return;
        }
        LJJIIJZLJL(str);
        Integer num = activityTask.awardCount;
        if (num == null || (i = num.intValue()) <= 0) {
            int i3 = this.LJLLLL;
            float f5 = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                ActivityTask activityTask2 = (ActivityTask) ORZ.LJLLLLLL(i4, this.LJLJJI);
                if (activityTask2 != null && (f4 = activityTask2.displayCashAmount) != null) {
                    f3 = f4.floatValue();
                } else {
                    f3 = 0.0f;
                }
                f5 += f3;
            }
            C249549qo LIZ2 = C247599nf.LIZ();
            int i5 = LIZ2.LJLLLL;
            float f6 = 0.0f;
            for (int i6 = 0; i6 < i5; i6++) {
                ActivityTask activityTask3 = (ActivityTask) ORZ.LJLLLLLL(i6, LIZ2.LJLJJI);
                if (activityTask3 != null && (f2 = activityTask3.displayCashAmount) != null) {
                    f = f2.floatValue();
                } else {
                    f = 0.0f;
                }
                f6 += f;
            }
            i = (int) ((f5 + f6) / 100);
            if (i <= 0) {
                return;
            }
        }
        InterfaceC249619qv interfaceC249619qv = this.LJLLLLLL;
        if (interfaceC249619qv == null) {
            return;
        }
        C247739nt.LIZ(interfaceC249619qv, 12, activityTask.taskKey, String.valueOf(i), 24);
    }

    @Override // X.C249559qp
    public final void LJIJJ(List<ActivityTask> list) {
        this.LJLJJI = C249919rP.LIZIZ(11, list);
    }

    public final String LJJIII(ActivityTask activityTask) {
        long j = activityTask.time - this.LJLILLLLZI;
        if (j < 0) {
            return null;
        }
        return new SimpleDateFormat("mm:ss", Locale.US).format(Long.valueOf(j * 1000));
    }

    public final void LJJIIJZLJL(String str) {
        String LIZ;
        ActivityTask LJIIIIZZ;
        this.LJLLLL++;
        this.LJLIL.storeInt(C247509nW.LIZ("current_stage"), this.LJLLLL);
        if (this.LJZ.length() == 0) {
            LIZ = str;
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ = C0MT.LIZ(LIZ2, this.LJZ, ',', str, LIZ2);
        }
        this.LJZ = LIZ;
        ((ArrayList) this.LJLZ).add(str);
        this.LJLIL.storeString(C247509nW.LIZ("completed_task_id_list"), this.LJZ);
        if (((ArrayList) this.LJLZ).size() < this.LJLJJI.size() && (LJIIIIZZ = LJIIIIZZ()) != null) {
            this.LJLJJL = LJIIIIZZ;
        }
    }

    public final boolean LJJIIZ(ActivityTask activityTask) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ActivityTask activityTask2;
        if (((int) this.LJLILLLLZI) >= activityTask.time) {
            z = true;
        } else {
            z = false;
        }
        Integer num = activityTask.awardCount;
        if (num != null && num.intValue() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        List<ActivityTask> list = this.LJLJJI;
        if (list == null || (activityTask2 = (ActivityTask) ORZ.LJLLLLLL(this.LJLLLL + 1, list)) == null) {
            z3 = true;
        } else {
            z3 = false;
            Integer num2 = activityTask2.awardCount;
            if (num2 != null && num2.intValue() > 0) {
                z4 = true;
                if (!z && (z3 || z4 || z2)) {
                    return true;
                }
                return false;
            }
        }
        z4 = false;
        if (!z) {
        }
        return false;
    }

    public final void LJJIIZI(ActivityTask activityTask) {
        Context LJ;
        String string;
        InterfaceC249619qv interfaceC249619qv;
        Integer num = activityTask.awardCount;
        if (num != null) {
            int intValue = num.intValue();
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null && (LJ = abstractC247499nV.LJ()) != null && (string = LJ.getString(R.string.ng)) != null && intValue > 0 && (interfaceC249619qv = this.LJLLLLLL) != null) {
                interfaceC249619qv.LJIILLIIL(12, activityTask.taskKey, LJJIIZ(activityTask), "", string);
            }
        }
    }

    @Override // X.InterfaceC249499qj
    public final void LIZIZ(List list, SpecActPendantManager uIListener) {
        o.LJIIIZ(uIListener, "uIListener");
        if (uIListener.LJJIJL()) {
            this.LJLLLLLL = uIListener;
        }
        LJIJI("HighRewardTaskManager", "high_reward_task", "activation_high_reward_task_time", "activation_high_reward_task_time", "", "background_task_date", "has_active_manually");
        LJIL(list);
        this.LJZI = true;
    }
}
