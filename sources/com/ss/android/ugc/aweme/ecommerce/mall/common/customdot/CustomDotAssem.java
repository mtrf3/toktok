package com.ss.android.ugc.aweme.ecommerce.mall.common.customdot;

import X.C16880lQ;
import X.C214298b3;
import X.C2K0;
import X.C36158EHa;
import X.C3C5;
import X.C54262LRi;
import X.C56662Kg;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78565UsT;
import X.C78926UyI;
import X.C9BD;
import X.EC2;
import X.InterfaceC55102Lju;
import X.LRX;
import X.M12;
import X.M1X;
import X.QD3;
import X.TBT;
import X.XJL;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.bottomtab.BottomTabCustomDotHandler;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class CustomDotAssem extends BaseMainContainerAssem implements CustomDotAbilityCommon, InterfaceC55102Lju {
    public final M12 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public boolean LJLJI;

    @Override // X.C8W0
    public final void onCreate() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(CustomDotAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        if (!EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
        v3().LJLJI = this.LJLIL.LIZ();
        CustomDotVM v3 = v3();
        this.LJLIL.LIZIZ();
        v3.LJLLJ = 0;
        v3().LJLJJI = this.LJLIL.LIZIZ;
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.M1N
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((M13) obj).LJLIL;
            }
        }, null, null, null, new AqS175S0100000_9(this, 44), 14, null);
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.M1O
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((M13) obj).LJLILLLLZI;
            }
        }, null, null, null, new AqS175S0100000_9(this, 45), 14, null);
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.C8W0
    public final void onResume() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(CustomDotAssem.class), "onResume"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onResume();
        if (this.LJLJI) {
            this.LJLJI = false;
        } else {
            CustomDotVM v3 = v3();
            boolean LJI = this.LJLIL.LJI();
            v3.getClass();
            v3.lv0(new EC2(LJI, v3, null), LJI, false);
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 616597518) {
            return null;
        }
        return this;
    }

    public final CustomDotVM v3() {
        return (CustomDotVM) this.LJLILLLLZI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotAbilityCommon
    public final Notice C6() {
        return v3().LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotAbilityCommon
    public final CustomDotResponse b9() {
        return v3().LJLL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotAbilityCommon
    public final Map<String, Boolean> oG() {
        return v3().LJLLI;
    }

    @Override // X.C8W0
    public final void onDestroy() {
        if (EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIJ(this);
        }
        super.onDestroy();
    }

    public CustomDotAssem(BottomTabCustomDotHandler bottomTabCustomDotHandler) {
        this.LJLIL = bottomTabCustomDotHandler;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CustomDotVM.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 1576), M1X.INSTANCE, null);
        this.LJLJI = true;
        bottomTabCustomDotHandler.LIZ = this;
        bottomTabCustomDotHandler.LJIIL(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onInboxPopupVisibilityChange(LRX event) {
        o.LJIIIZ(event, "event");
        CustomDotVM v3 = v3();
        v3.getClass();
        int i = event.LJLIL;
        if (i == 0) {
            v3.LJLJJL = true;
            return;
        }
        if (i != 1) {
            return;
        }
        v3.LJLJJL = false;
        XJL<? super C76800UCe> xjl = v3.LJLJJLL;
        if (xjl == null) {
            return;
        }
        C76800UCe c76800UCe = C76800UCe.LIZ;
        C3C5.m7constructorimpl(c76800UCe);
        xjl.resumeWith(c76800UCe);
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRedPointUpdateRefactor(C54262LRi event) {
        o.LJIIIZ(event, "event");
        CustomDotVM v3 = v3();
        boolean LJI = this.LJLIL.LJI();
        v3.getClass();
        C78565UsT.LJJIJL(v3, new C36158EHa(v3, event, LJI, null));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotAbilityCommon
    public final void ty(String str) {
        v3().LJLLI.put(str, Boolean.TRUE);
    }
}
