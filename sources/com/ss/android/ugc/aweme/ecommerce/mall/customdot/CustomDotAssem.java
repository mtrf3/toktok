package com.ss.android.ugc.aweme.ecommerce.mall.customdot;

import X.AbstractC55930LxG;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C141335gf;
import X.C16880lQ;
import X.C174036sJ;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C2K0;
import X.C36746EbW;
import X.C3C5;
import X.C54262LRi;
import X.C55933LxJ;
import X.C55934LxK;
import X.C55937LxN;
import X.C55948LxY;
import X.C56662Kg;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78565UsT;
import X.C78926UyI;
import X.C78983UzD;
import X.C9BD;
import X.EHZ;
import X.EnumC55811LvL;
import X.InterfaceC55102Lju;
import X.LE4;
import X.LRX;
import X.QD3;
import X.TBT;
import X.X1D;
import X.XJL;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.Notice;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.DiversionTargetData;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class CustomDotAssem extends BaseMainContainerAssem implements CustomDotAbilityCommon, InterfaceC55102Lju {
    public final AbstractC55930LxG LJLIL;
    public final C214298b3 LJLILLLLZI;
    public boolean LJLJI;
    public final C62822Ol8 LJLJJI;

    @Override // X.C8W0
    public final void onCreate() {
        boolean z;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(CustomDotAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        if (!EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            Hox.LJLLI.LIZ(LIZ).hv0("page_profile", (C55933LxJ) this.LJLJJI.getValue());
        }
        v3().LJLJI = this.LJLIL.LIZ();
        v3().LJLJLLL = this.LJLIL.LIZIZ();
        v3().LJLJJI = this.LJLIL.LIZLLL;
        CustomDotVM v3 = v3();
        Context context = getContext();
        if (context != null) {
            z = AnonymousClass636.LJIILJJIL(context);
        } else {
            z = false;
        }
        v3.LJLLI = z;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ShopTab Tooltip isDarkMode ");
        LIZ2.append(v3().LJLLI);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ2));
        v3().LJLLILLLL = new C55948LxY(this);
        this.LJLIL.LIZ = C212428Vi.LIZ(this);
        this.LJLIL.LIZIZ = getContext();
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.LxO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C55940LxQ) obj).LJLJI;
            }
        }, null, null, null, new AqS175S0100000_9(this, 52), 14, null);
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.LxP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C55940LxQ) obj).LJLIL;
            }
        }, null, null, null, new AqS175S0100000_9(this, 53), 14, null);
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.LxX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C55940LxQ) obj).LJLILLLLZI;
            }
        }, null, null, null, new AqS175S0100000_9(this, 54), 14, null);
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.C8W0
    public final void onResume() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(CustomDotAssem.class), "onResume"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onResume();
        C36746EbW.LIZ(3, "ShopTab Tooltip TooltipAvoid onResume");
        v3().LJLLLL = true;
        if (this.LJLJI) {
            this.LJLJI = false;
        } else {
            v3().rv0(this.LJLIL.LJII());
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 428147899) {
            return null;
        }
        return this;
    }

    public final CustomDotVM v3() {
        return (CustomDotVM) this.LJLILLLLZI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon
    public final Notice C6() {
        return v3().LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon
    public final void Fh() {
        v3().LJLILLLLZI = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon
    public final CustomDotResponse b9() {
        return v3().LJLJJLL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon
    public final DiversionTargetData jl0() {
        return v3().LJLILLLLZI;
    }

    @Override // X.C8W0
    public final void onDestroy() {
        if (EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIJ(this);
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            Hox.LJLLI.LIZ(LIZ).zv0("page_profile", (C55933LxJ) this.LJLJJI.getValue());
        }
        super.onDestroy();
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        C36746EbW.LIZ(3, "ShopTab Tooltip TooltipAvoid onPause");
        v3().LJLLLL = false;
    }

    public CustomDotAssem(AbstractC55930LxG abstractC55930LxG) {
        this.LJLIL = abstractC55930LxG;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CustomDotVM.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9bd, new AqS159S0100000_9(LIZ, 119), C55934LxK.INSTANCE, null);
        this.LJLJI = true;
        this.LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 118));
        try {
            abstractC55930LxG.LIZJ = this;
            abstractC55930LxG.LJIIIZ(this);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onCommendDialogEvent(C174036sJ event) {
        o.LJIIIZ(event, "event");
        boolean z = true;
        if (event.LJLIL != 1) {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopTab Tooltip TooltipAvoid isCommendDialogShowing: ");
        LIZ.append(z);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
        v3().LJLLLLLL = z;
        this.LJLIL.LJIIJ(z);
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEcVideoGuideEvent(C55937LxN event) {
        boolean z;
        o.LJIIIZ(event, "event");
        CustomDotVM v3 = v3();
        if (event.LJLIL == LE4.SHOW) {
            z = true;
        } else {
            z = false;
        }
        v3.LJZ = z;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onInboxPopupVisibilityChange(LRX event) {
        o.LJIIIZ(event, "event");
        CustomDotVM v3 = v3();
        v3.getClass();
        int i = event.LJLIL;
        if (i == 0) {
            v3.LJLLJ = true;
            return;
        }
        if (i != 1) {
            return;
        }
        v3.LJLLJ = false;
        XJL<? super C76800UCe> xjl = v3.LJZI;
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
        boolean LJII = this.LJLIL.LJII();
        v3.getClass();
        C78565UsT.LJJIJL(v3, new EHZ(v3, event, LJII, null));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon
    public final void rj(EnumC55811LvL bubbleDisappearType) {
        o.LJIIIZ(bubbleDisappearType, "bubbleDisappearType");
        this.LJLIL.LJI(bubbleDisappearType);
    }
}
