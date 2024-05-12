package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.bytedance.touchpoint.core.task.TasksViewModel;
import com.bytedance.touchpoint.core.viewmodel.BaseTouchPointDataVM;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.List;
import kotlin.jvm.internal.AqS186S0100000_4;

/* renamed from: X.9qh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249479qh extends AbstractC244999jT {
    public static final C5H3 LJLJJL = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C249509qk.LJLIL);
    public SpecActPendantManager LJLIL;
    public boolean LJLILLLLZI;
    public final List<? extends InterfaceC249499qj> LJLJI;
    public final C214378bB LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C249479qh() {
        C248109oU.LJLZ.getClass();
        this.LJLJI = C47261Igj.LJII(C249579qr.LJLLLL.getValue(), C249589qs.LJZ.getValue(), C249609qu.LJLLLLLL.getValue(), C249419qb.LJLZ.getValue(), C249569qq.LJLLLL.getValue(), C249449qe.LJLLLLLL.getValue(), C247539nZ.LIZ(), C249389qY.LJZ.getValue(), C247599nf.LIZ(), C249599qt.LL.getValue(), C9OS.LIZ());
        C214378bB c214378bB = new C214378bB(C65352Pkq.LIZ(TasksViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(C246049lA.LJLILLLLZI, false), C184077Kh.LJLIL, C249489qi.INSTANCE, null, null);
        this.LJLJJI = c214378bB;
        C8YN.LJII(this, (AssemViewModel) c214378bB.getValue(), new TBT() { // from class: X.9Or
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Long.valueOf(((C236009Oa) obj).LJLIL);
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 281), 4);
        C8YN.LJII(this, (AssemViewModel) c214378bB.getValue(), new TBT() { // from class: X.9P5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C236009Oa) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 282), 4);
    }

    public static void LJJII() {
        C95J.LIZ(11);
    }

    @Override // X.AbstractC244999jT
    public final BaseTouchPointDataVM LJJ() {
        return (BaseTouchPointDataVM) this.LJLJJI.getValue();
    }

    public static String LJJIFFI() {
        LJJII();
        if (!C247539nZ.LIZ().LJJIIJZLJL()) {
            if (C247539nZ.LIZ().LJI()) {
                return "complete";
            }
            return "timing";
        }
        if (!C247599nf.LIZ().LJJIIJ()) {
            if (C247599nf.LIZ().LJI()) {
                return "complete";
            }
            return "timing";
        }
        return "";
    }

    public static boolean LJJIIJ() {
        LJJII();
        if (!C247539nZ.LIZ().LJJIIJZLJL()) {
            return C247539nZ.LIZ().LJLJL;
        }
        if (!C247599nf.LIZ().LJJIIJ()) {
            return C247599nf.LIZ().LJLJL;
        }
        return false;
    }

    public static boolean LJJIIJZLJL() {
        LJJII();
        if (!C247539nZ.LIZ().LJJIIJZLJL()) {
            return C247539nZ.LIZ().LJI();
        }
        if (!C247599nf.LIZ().LJJIIJ()) {
            return C247599nf.LIZ().LJI();
        }
        return false;
    }

    public static final void LJJIII(boolean z) {
        LJJII();
        if (!C247539nZ.LIZ().LJJIIJZLJL()) {
            C249519ql LIZ = C247539nZ.LIZ();
            LIZ.LLD = z;
            LIZ.LJLIL.storeBoolean(C247509nW.LIZ("is_reward_state"), z);
        } else {
            if (C247599nf.LIZ().LJJIIJ()) {
                return;
            }
            C249549qo LIZ2 = C247599nf.LIZ();
            LIZ2.LLD = z;
            LIZ2.LJLIL.storeBoolean(C247509nW.LIZ("is_reward_state"), z);
        }
    }

    public final void LJJI(String str, int i, boolean z, boolean z2, boolean z3, int i2) {
        SpecActPendantManager specActPendantManager;
        SpecActPendantManager specActPendantManager2;
        SpecActPendantManager specActPendantManager3 = this.LJLIL;
        if (specActPendantManager3 != null && specActPendantManager3.LJJIJL() && (specActPendantManager = this.LJLIL) != null && specActPendantManager.LJJIJLIJ() && z2 && !z && (specActPendantManager2 = this.LJLIL) != null) {
            specActPendantManager2.LJJJJI();
        }
        C249559qp.LJ((C249559qp) C249609qu.LJLLLLLL.getValue(), z, 28);
        C249559qp.LJ((C249559qp) C249579qr.LJLLLL.getValue(), z, 28);
        switch (i) {
            case 6:
                ((C249559qp) C249419qb.LJLZ.getValue()).LIZJ(6, i2, str, true, true);
                return;
            case 7:
                ((C249559qp) C249569qq.LJLLLL.getValue()).LIZJ(7, i2, str, true, true);
                return;
            case 8:
                C5H3 c5h3 = C249449qe.LJLLLLLL;
                C249559qp c249559qp = (C249559qp) c5h3.getValue();
                c249559qp.getClass();
                List<ActivityTask> list = c249559qp.LJLJJI;
                if (list != null && !list.isEmpty()) {
                    c249559qp.LJLJL = false;
                    ((ActivityTask) ListProtector.get(c249559qp.LJLJJI, 0)).isAuto = false;
                    ((ActivityTask) ListProtector.get(c249559qp.LJLJJI, 0)).time = i2;
                    ActivityTask activityTask = (ActivityTask) ListProtector.get(c249559qp.LJLJJI, 0);
                    activityTask.getClass();
                    activityTask.taskKey = str;
                    c249559qp.LJLIL.storeLong(C247509nW.LIZ("activated_task_time"), i2);
                    c249559qp.LJLIL.storeString(C247509nW.LIZ("activated_task_name"), str);
                }
                ((C249559qp) c5h3.getValue()).LIZJ(8, i2, str, true, true);
                return;
            case 9:
                if (!z3) {
                    C247539nZ.LIZ().LIZJ(9, i2, str, true, true);
                    return;
                }
                C249519ql LIZ = C247539nZ.LIZ();
                if (!LIZ.LJLJL || !LIZ.LLD) {
                    return;
                }
                if (!LIZ.LJI()) {
                    InterfaceC249619qv interfaceC249619qv = LIZ.LJLLLLLL;
                    if (interfaceC249619qv == null) {
                        return;
                    }
                    interfaceC249619qv.LJI(LIZ.LJJIII());
                    return;
                }
                InterfaceC249619qv interfaceC249619qv2 = LIZ.LJLLLLLL;
                if (interfaceC249619qv2 != null) {
                    interfaceC249619qv2.LJIILL("non_tracker", "finished", LIZ.LJLZ ? 1 : 0, false, false);
                }
                LIZ.LLD = false;
                LIZ.LJLIL.storeBoolean(C247509nW.LIZ("is_reward_state"), false);
                return;
            case 10:
                ((C249559qp) C249389qY.LJZ.getValue()).LIZJ(10, i2, str, true, true);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            default:
                return;
            case 12:
                if (!z3) {
                    C247599nf.LIZ().LIZJ(12, i2, str, true, true);
                    return;
                }
                C249549qo LIZ2 = C247599nf.LIZ();
                if (!LIZ2.LJLJL || !LIZ2.LLD) {
                    return;
                }
                if (!LIZ2.LJI()) {
                    InterfaceC249619qv interfaceC249619qv3 = LIZ2.LJLLLLLL;
                    if (interfaceC249619qv3 == null) {
                        return;
                    }
                    interfaceC249619qv3.LJI(LIZ2.LJJIII());
                    return;
                }
                InterfaceC249619qv interfaceC249619qv4 = LIZ2.LJLLLLLL;
                if (interfaceC249619qv4 != null) {
                    interfaceC249619qv4.LJIILL("non_tracker", "finished", LIZ2.LJLZ ? 1 : 0, false, false);
                }
                LIZ2.LLD = false;
                LIZ2.LJLIL.storeBoolean(C247509nW.LIZ("is_reward_state"), false);
                return;
        }
    }
}
