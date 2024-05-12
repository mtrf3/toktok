package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C215498cz;
import X.C221718n1;
import X.C221748n4;
import X.C223698qD;
import X.C223708qE;
import X.C223798qN;
import X.C223818qP;
import X.C223838qR;
import X.C223848qS;
import X.C245649kW;
import X.C39557Ffl;
import X.C3C8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C68322mC;
import X.C76800UCe;
import X.C8NH;
import X.C8NL;
import X.C8VK;
import X.C8W0;
import X.C8XD;
import X.C8XE;
import X.C8XO;
import X.InterfaceC214978c9;
import X.InterfaceC215558d5;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.LRD;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.touchpoint.core.model.InviteBanner;
import com.ss.android.ugc.aweme.nows.feed.ui.guide.NowShareModuleCell;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class AqS63S0400000_3 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS63S0400000_3 aqS63S0400000_3) {
        return new C223838qR((Context) aqS63S0400000_3.l0, (C223848qS) aqS63S0400000_3.l1, (InteractStickerStruct) aqS63S0400000_3.l2, (C245649kW) aqS63S0400000_3.l3);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Class] */
    public static final Object invoke$1(AqS63S0400000_3 aqS63S0400000_3) {
        boolean z;
        InterfaceC65350Pko<? extends C8W0> interfaceC65350Pko;
        AssemSupervisor lv0;
        View findViewById;
        C8NH c8nh = new C8NH();
        ((InterfaceC88472Yns) aqS63S0400000_3.l0).invoke(c8nh);
        if (c8nh.LIZIZ == C8VK.LAZY) {
            z = true;
        } else {
            z = false;
        }
        ReusedUISlotAssem<? extends C3C8> LIZJ = c8nh.LIZJ();
        if (LIZJ != null) {
            interfaceC65350Pko = C65352Pkq.LIZ(LIZJ.getClass());
        } else {
            interfaceC65350Pko = c8nh.LIZ;
            if (interfaceC65350Pko == null) {
                o.LJIJI("type");
                throw null;
            }
        }
        if (z && (lv0 = ((Assembler) aqS63S0400000_3.l1).lv0((ReusedUIAssem) aqS63S0400000_3.l2)) != null) {
            View view = lv0.LJLLL;
            if (view != null && c8nh.LJFF == null && c8nh.LIZLLL != 0 && (findViewById = view.findViewById(c8nh.LIZLLL)) != null) {
                c8nh.LJFF = findViewById;
            }
            lv0.LJLLILLLL.put(interfaceC65350Pko, c8nh);
        }
        ((C68322mC) aqS63S0400000_3.l3).element = C39557Ffl.LIZ(interfaceC65350Pko);
        return c8nh;
    }

    public static final Object invoke$10(AqS63S0400000_3 aqS63S0400000_3) {
        Context context = (Context) aqS63S0400000_3.l0;
        C223708qE c223708qE = (C223708qE) aqS63S0400000_3.l1;
        return new C223698qD(context, c223708qE, (InteractStickerStruct) aqS63S0400000_3.l2, (C245649kW) aqS63S0400000_3.l3, c223708qE.LJLLI);
    }

    public static final Object invoke$2(AqS63S0400000_3 aqS63S0400000_3) {
        C8XE c8xe;
        if (!C63081OpJ.LJLIIL(((ReusedAssem) aqS63S0400000_3.l0).getLifecycle())) {
            AssemSupervisor assemSupervisor = (AssemSupervisor) aqS63S0400000_3.l1;
            ReusedAssem reusedAssem = (ReusedAssem) aqS63S0400000_3.l2;
            ((C8NL) aqS63S0400000_3.l3).getClass();
            if (assemSupervisor.LJI(reusedAssem, null) && (c8xe = ((ReusedAssem) aqS63S0400000_3.l0).LJLJLJ) != null) {
                c8xe.LJIIJ((ReusedAssem) aqS63S0400000_3.l2, c8xe.LJLJLJ);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS63S0400000_3 aqS63S0400000_3) {
        LRD.LIZ((ActivityC45651qj) aqS63S0400000_3.l0).LJIIJ("show_danmaku_rethink", false, null);
        ((C215498cz) aqS63S0400000_3.l1).LIZIZ((InterfaceC215558d5) aqS63S0400000_3.l2);
        ((InterfaceC214978c9) aqS63S0400000_3.l3).LIZ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS63S0400000_3 aqS63S0400000_3) {
        Context context = (Context) aqS63S0400000_3.l0;
        C221718n1 c221718n1 = (C221718n1) aqS63S0400000_3.l1;
        return new C221748n4(context, c221718n1, (InteractStickerStruct) aqS63S0400000_3.l2, (C245649kW) aqS63S0400000_3.l3, c221718n1.LJLLI);
    }

    public static final Object invoke$5(AqS63S0400000_3 aqS63S0400000_3) {
        List<? extends Object> list;
        ((ReusedAssem) aqS63S0400000_3.l0).A3();
        C8XO c8xo = (C8XO) aqS63S0400000_3.l1;
        if (c8xo != null) {
            c8xo.n3(((C8XD) aqS63S0400000_3.l2).LJLIL);
        }
        List list2 = (List) aqS63S0400000_3.l3;
        if (list2 == null || list2.isEmpty()) {
            list = (List) aqS63S0400000_3.l3;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) aqS63S0400000_3.l3);
            list = arrayList;
        }
        ((ReusedAssem) aqS63S0400000_3.l0).LJLJL.LIZIZ(((C8XD) aqS63S0400000_3.l2).LJLIL, list, 0L);
        C8XD c8xd = (C8XD) aqS63S0400000_3.l2;
        for (Map.Entry<InterfaceC65350Pko<?>, Object> entry : c8xd.LJLLLL.entrySet()) {
            AssemViewModel<?> assemViewModel = c8xd.LJLLLLLL.get(entry.getKey());
            if (assemViewModel != null) {
                AssemViewModel.syncItem2State$default(assemViewModel, c8xd.LJLIL, list, entry.getValue(), null, 8, null);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS63S0400000_3 aqS63S0400000_3) {
        Context context = (Context) aqS63S0400000_3.l0;
        C223798qN c223798qN = (C223798qN) aqS63S0400000_3.l1;
        return new C223818qP(context, c223798qN, (InteractStickerStruct) aqS63S0400000_3.l2, (C245649kW) aqS63S0400000_3.l3, c223798qN.LJLLI);
    }

    public static final Object invoke$7(AqS63S0400000_3 aqS63S0400000_3) {
        ((InterfaceC88473Ynt) aqS63S0400000_3.l0).invoke((C3C8) aqS63S0400000_3.l1, aqS63S0400000_3.l2, aqS63S0400000_3.l3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS63S0400000_3 aqS63S0400000_3) {
        ((InterfaceC88473Ynt) aqS63S0400000_3.l0).invoke((C3C8) aqS63S0400000_3.l1, aqS63S0400000_3.l2, aqS63S0400000_3.l3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS63S0400000_3 aqS63S0400000_3) {
        int i = ((InviteBanner) aqS63S0400000_3.l0).clickActionType;
        if (i == 0) {
            ISpecActService iSpecActService = (ISpecActService) aqS63S0400000_3.l1;
            Context context = ((View) aqS63S0400000_3.l2).getContext();
            o.LJIIIIZZ(context, "v.context");
            InviteBanner inviteBanner = (InviteBanner) aqS63S0400000_3.l0;
            iSpecActService.LJJIZ(context, inviteBanner.jumpLink, inviteBanner.LIZIZ, inviteBanner.LJ);
        } else if (i == 1) {
            ((NowShareModuleCell) aqS63S0400000_3.l3).getClass();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S0400000_3(ActivityC45651qj activityC45651qj, C215498cz c215498cz, InterfaceC215558d5 interfaceC215558d5, InterfaceC214978c9 interfaceC214978c9, int i) {
        super(0);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = c215498cz;
        this.l2 = interfaceC215558d5;
        this.l3 = interfaceC214978c9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS63S0400000_3(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super C8NH, C76800UCe> interfaceC88472Yns2, Assembler assembler, REUSED reused, C68322mC<Class<?>> c68322mC) {
        super(0);
        this.$t = c68322mC;
        this.l0 = interfaceC88472Yns;
        this.l1 = interfaceC88472Yns2;
        this.l2 = assembler;
        this.l3 = reused;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS63S0400000_3(InterfaceC88473Ynt interfaceC88473Ynt, InterfaceC88473Ynt<C3C8, Object, Object, C76800UCe> interfaceC88473Ynt2, C3C8 c3c8, Object obj, Object obj2) {
        super(0);
        this.$t = obj2;
        this.l0 = interfaceC88473Ynt;
        this.l1 = interfaceC88473Ynt2;
        this.l2 = c3c8;
        this.l3 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S0400000_3(Context context, C221718n1 c221718n1, InteractStickerStruct interactStickerStruct, C245649kW c245649kW, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c221718n1;
        this.l2 = interactStickerStruct;
        this.l3 = c245649kW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S0400000_3(Context context, C223708qE c223708qE, InteractStickerStruct interactStickerStruct, C245649kW c245649kW, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c223708qE;
        this.l2 = interactStickerStruct;
        this.l3 = c245649kW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S0400000_3(Context context, C223798qN c223798qN, InteractStickerStruct interactStickerStruct, C245649kW c245649kW, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c223798qN;
        this.l2 = interactStickerStruct;
        this.l3 = c245649kW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S0400000_3(Context context, C223848qS c223848qS, InteractStickerStruct interactStickerStruct, C245649kW c245649kW, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c223848qS;
        this.l2 = interactStickerStruct;
        this.l3 = c245649kW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS63S0400000_3(ReusedAssem reusedAssem, ReusedAssem<? extends C3C8> reusedAssem2, C8XO<Object> c8xo, C8XD c8xd, List<? extends Object> list) {
        super(0);
        this.$t = list;
        this.l0 = reusedAssem;
        this.l1 = reusedAssem2;
        this.l2 = c8xo;
        this.l3 = c8xd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS63S0400000_3(ReusedAssem reusedAssem, Object obj, AssemSupervisor assemSupervisor, ReusedAssem<?> reusedAssem2, C8NL<?> c8nl) {
        super(0);
        this.$t = c8nl;
        this.l0 = reusedAssem;
        this.l1 = obj;
        this.l2 = assemSupervisor;
        this.l3 = reusedAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS63S0400000_3(InviteBanner inviteBanner, ISpecActService iSpecActService, View view, NowShareModuleCell nowShareModuleCell, int i) {
        super(0);
        this.$t = i;
        this.l0 = inviteBanner;
        this.l1 = iSpecActService;
        this.l2 = view;
        this.l3 = nowShareModuleCell;
    }
}
