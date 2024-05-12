package X;

import Y.ACallableS107S0100000_4;
import Y.ARunnableS40S0100000_4;
import android.os.Handler;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.o;

/* renamed from: X.9qp */
/* loaded from: classes5.dex */
public class C249559qp implements InterfaceC250059rd, InterfaceC249499qj {
    public long LJLILLLLZI;
    public long LJLJI;
    public ActivityTask LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public Keva LJLIL = Keva.getRepo("referral_default_keva");
    public List<ActivityTask> LJLJJI = new ArrayList();
    public String LJLJLJ = "";
    public String LJLJLLL = "";
    public String LJLL = "";
    public String LJLLI = "";
    public String LJLLILLLL = "";
    public String LJLLJ = "";
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(C249669r0.LJLIL);

    public boolean LJI() {
        throw null;
    }

    public ActivityTask LJIIIIZZ() {
        throw null;
    }

    public final C249639qx LJIIIZ() {
        return (C249639qx) this.LJLLL.getValue();
    }

    public void LJIIJJI() {
    }

    public void LJIIL() {
    }

    public void LJIILIIL() {
    }

    public void LJIILJJIL() {
    }

    public void LJIILL(ActivityTask activityTask) {
    }

    public void LJIILLIIL() {
    }

    @Override // X.InterfaceC250059rd
    public final void LJIIZILJ() {
        this.LJLJJL = null;
        this.LJLILLLLZI = 0L;
        this.LJLJI = 0L;
        this.LJLJJLL = 0;
        this.LJLIL.storeLong(C247509nW.LIZ(this.LJLJLJ), this.LJLILLLLZI);
        this.LJLIL.storeLong(C247509nW.LIZ(this.LJLJLLL), this.LJLJI);
        this.LJLIL.storeInt(C247509nW.LIZ(this.LJLLI), this.LJLJJLL);
        C247649nk c247649nk = C247659nl.LIZ;
        c247649nk.LIZ(String.valueOf(this.LJLILLLLZI), C247509nW.LIZ(this.LJLL));
        c247649nk.LIZ(String.valueOf(this.LJLJJLL), C247509nW.LIZ(this.LJLLI));
        LJIIL();
        this.LJLIL.storeLong(C247509nW.LIZ(this.LJLLILLLL), C245559kN.LIZ());
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS40S0100000_4(this, 143), new Random().nextInt(5) * 1000);
    }

    public void LJIJ() {
    }

    public void LJIJJ(List<ActivityTask> list) {
        throw null;
    }

    public boolean LJJ() {
        return !(this instanceof C249599qt);
    }

    public void LJJI() {
    }

    public boolean LJJIFFI() {
        return true;
    }

    public void LJJII() {
    }

    @Override // X.InterfaceC250059rd
    public final void LIZLLL() {
        ActivityTask activityTask;
        java.util.Map<String, String> map;
        if (!(!(this instanceof C249389qY)) || LJI() || !this.LJLJL || this.LJLJJL == null) {
            return;
        }
        C249689r2 c249689r2 = (C249689r2) C95J.LIZ(11);
        if ((c249689r2 == null || c249689r2.LIZJ(LJJ())) && LJJIFFI() && (activityTask = this.LJLJJL) != null) {
            int i = activityTask.time;
            long j = this.LJLILLLLZI;
            if (j >= i) {
                ActivityTask activityTask2 = new ActivityTask(activityTask.taskKey, activityTask.taskType, activityTask.isAuto, activityTask.finishPush, i, activityTask.roundTime, activityTask.rewardLayer, activityTask.count, activityTask.scoreAmount, activityTask.notificationId, activityTask.uploadSwitch, activityTask.stopAutoDays, activityTask.awardCount, activityTask.autoDone, activityTask.roundTimeDone, activityTask.displayCashAmount);
                ActivityTask activityTask3 = this.LJLJJL;
                String str = null;
                if (activityTask3 != null) {
                    map = activityTask3.LJ;
                } else {
                    map = null;
                }
                activityTask2.LJ = map;
                this.LJLJJL = null;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("task_type", String.valueOf(Integer.valueOf(activityTask2.taskType)));
                linkedHashMap.put("task_key", activityTask2.taskKey);
                linkedHashMap.put("activity_name", activityTask2.taskKey);
                AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
                if (abstractC247499nV != null) {
                    str = abstractC247499nV.LJIIJ();
                }
                linkedHashMap.put("region", str);
                linkedHashMap.put("lottery_cnt", String.valueOf(activityTask2.awardCount));
                java.util.Map<String, String> map2 = activityTask2.LJ;
                if (map2 != null) {
                    linkedHashMap.putAll(map2);
                }
                InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
                if (interfaceC247459nR != null) {
                    interfaceC247459nR.LIZIZ("timed_task_time_up", linkedHashMap);
                }
                LJIILL(activityTask2);
            } else {
                this.LJLILLLLZI = j + 1;
                this.LJLJI++;
                LJIILIIL();
            }
            if (LJI()) {
                LJII();
                ActivityTask LJIIIIZZ = LJIIIIZZ();
                if (LJIIIIZZ != null && !LJIIIIZZ.isAuto) {
                    this.LJLJL = false;
                    this.LJLIL.storeBoolean(C247509nW.LIZ(this.LJLLJ), false);
                }
            }
        }
    }

    @Override // X.InterfaceC250059rd
    public void LJFF() {
        this.LJLIL.storeLong(C247509nW.LIZ(this.LJLJLJ), this.LJLILLLLZI);
        this.LJLIL.storeLong(C247509nW.LIZ(this.LJLJLLL), this.LJLJI);
        C247649nk c247649nk = C247659nl.LIZ;
        c247649nk.LIZ(String.valueOf(this.LJLILLLLZI), C247509nW.LIZ(this.LJLL));
        this.LJLIL.storeInt(C247509nW.LIZ(this.LJLLI), this.LJLJJLL);
        c247649nk.LIZ(String.valueOf(this.LJLJJLL), C247509nW.LIZ(this.LJLLI));
        this.LJLIL.storeLong(C247509nW.LIZ(this.LJLLILLLL), C245559kN.LIZ());
    }

    public void LJII() {
        String str;
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (!this.LJLJJI.isEmpty()) {
                str = String.valueOf(((ActivityTask) ListProtector.get(this.LJLJJI, 0)).taskType);
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("task_type", str);
            interfaceC247459nR.LIZIZ("finish_activity_task", linkedHashMap);
        }
    }

    public void LJIIJ() {
        if ((!this.LJLJJI.isEmpty()) && ((ActivityTask) ListProtector.get(this.LJLJJI, 0)).isAuto) {
            LJ(this, true, 30);
        }
    }

    public final boolean LJIJJLI() {
        if (C245559kN.LIZ() == this.LJLIL.getLong(C247509nW.LIZ(this.LJLLILLLL), 0L)) {
            return true;
        }
        return false;
    }

    public void clear() {
        this.LJLJJI.clear();
    }

    @Override // X.InterfaceC250059rd
    public final void LIZ() {
        LJIILLIIL();
    }

    public final void LJIL(List<ActivityTask> list) {
        List<ActivityTask> list2;
        try {
            LJIJJ(list);
            if ((C247509nW.LIZIZ() || !LJJ()) && (list2 = this.LJLJJI) != null && !list2.isEmpty()) {
                this.LJLILLLLZI = this.LJLIL.getLong(C247509nW.LIZ(this.LJLJLJ), 0L);
                this.LJLJI = this.LJLIL.getLong(C247509nW.LIZ(this.LJLJLLL), 0L);
                this.LJLJJLL = this.LJLIL.getInt(C247509nW.LIZ(this.LJLLI), 0);
                this.LJLJL = this.LJLIL.getBoolean(C247509nW.LIZ(this.LJLLJ), false);
                LJIJ();
                if (!this.LJLJJI.isEmpty()) {
                    if (!LJI() && !LJIJJLI()) {
                        this.LJLILLLLZI = 0L;
                        this.LJLJI = 0L;
                        this.LJLJJLL = 0;
                        this.LJLJL = false;
                        this.LJLIL.storeBoolean(C247509nW.LIZ(this.LJLLJ), false);
                        this.LJLIL.storeLong(C247509nW.LIZ(this.LJLLILLLL), C245559kN.LIZ());
                        this.LJLIL.storeInt(C247509nW.LIZ(this.LJLLI), 0);
                        this.LJLIL.storeLong(C247509nW.LIZ(this.LJLJLJ), 0L);
                        this.LJLIL.storeLong(C247509nW.LIZ(this.LJLJLLL), 0L);
                        C247659nl.LIZ.LIZ(String.valueOf(this.LJLILLLLZI), C247509nW.LIZ(this.LJLL));
                        LJJI();
                    }
                    LJJII();
                    C249849rI.LIZ(this);
                    ActivityTask LJIIIIZZ = LJIIIIZZ();
                    if (LJIIIIZZ != null) {
                        this.LJLJJL = LJIIIIZZ;
                    }
                    LJIIJ();
                }
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void LJ(C249559qp c249559qp, boolean z, int i) {
        String str;
        if ((i & 4) != 0) {
            str = "";
        } else {
            str = null;
        }
        c249559qp.LIZJ(0, 0, str, z, false);
    }

    public final void LIZJ(int i, int i2, String taskKey, boolean z, boolean z2) {
        ActivityTask activityTask;
        Boolean bool;
        o.LJIIIZ(taskKey, "taskKey");
        LJIIJJI();
        if (this.LJLJJI.isEmpty()) {
            if (z2) {
                C247749nu.LIZLLL(0, i, i2, taskKey);
                return;
            }
            return;
        }
        if (z2) {
            C247749nu.LIZLLL(1, i, i2, taskKey);
        }
        if ((!this.LJLJJI.isEmpty()) && (bool = (activityTask = (ActivityTask) ListProtector.get(this.LJLJJI, 0)).uploadSwitch) != null && bool.booleanValue()) {
            C10K.LIZJ(new ACallableS107S0100000_4(activityTask, 11));
        }
        if (!this.LJLJL && z && !LJI()) {
            this.LJLJL = true;
            this.LJLIL.storeBoolean(C247509nW.LIZ(this.LJLLJ), true);
            LJIILJJIL();
            ActivityTask LJIIIIZZ = LJIIIIZZ();
            if (LJIIIIZZ != null) {
                this.LJLJJL = LJIIIIZZ;
            }
            InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
            if (interfaceC247459nR != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("task_type", String.valueOf(((ActivityTask) ListProtector.get(this.LJLJJI, 0)).taskType));
                interfaceC247459nR.LIZIZ("start_activity_task", linkedHashMap);
            }
        }
    }

    public final void LJIJI(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.LJLJLJ = str3;
        this.LJLL = str4;
        this.LJLLI = str5;
        this.LJLLILLLL = str6;
        this.LJLLJ = str7;
        this.LJLJLLL = "";
        this.LJLIL = Keva.getRepo(str2);
    }
}
