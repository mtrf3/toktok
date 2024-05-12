package com.ss.android.ugc.aweme.ecommerce.mall.ui;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C212428Vi;
import X.C214298b3;
import X.C54412LXc;
import X.C54741Le5;
import X.C55096Ljo;
import X.C55983Ly7;
import X.C61712OJw;
import X.C61713OJx;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78847Ux1;
import X.C78926UyI;
import X.C8W0;
import X.C9BE;
import X.InterfaceC53896LDg;
import X.InterfaceC55235Lm3;
import X.L7P;
import X.LLQ;
import X.LNZ;
import X.TBT;
import android.os.Bundle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMainFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MallThemeAssem extends C8W0 implements InterfaceC53896LDg {
    public final C214298b3 LJLIL;

    public MallThemeAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ShopMainLynxViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 133), C54412LXc.INSTANCE, null);
    }

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        String str;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        ShopMainFragment.LJZ.getClass();
        if (C54741Le5.LIZIZ()) {
            str = "Shop";
        } else {
            str = "SHOP_MALL";
        }
        Hox.LJLLI.LIZ(LIZ).hv0(str, this);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.LXd
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C55983Ly7) obj).LJLJJLL;
            }
        }, null, null, null, new AqS140S0200000_9(LIZ, this, 5), 14, null);
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        TopTabAbility LJJLIIIJL;
        if (o.LJ(bundle.getString("fromStart"), "MainFragment") && !o.LJ(bundle.getString("toPage"), "homepage_explore") && (LJJLIIIJL = C78847Ux1.LJJLIIIJL(C55096Ljo.LJIIZILJ(this))) != null) {
            LJJLIIIJL.Cg0(true, true);
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        String LIZ = ((C55983Ly7) ((AssemViewModel) this.LJLIL.getValue()).getState()).LJLJJLL.LIZ();
        if (LIZ == null) {
            LIZ = "adaptive";
        }
        v3(LIZ, true);
    }

    public final void v3(String str, boolean z) {
        boolean z2;
        int i;
        L7P l7p;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        boolean LJIILJJIL = AnonymousClass636.LJIILJJIL(LIZ);
        if (o.LJ(str, "light")) {
            z2 = true;
        } else if (o.LJ(str, "adaptive")) {
            z2 = LJIILJJIL;
        } else {
            z2 = false;
        }
        ShopMainFragment.LJZ.getClass();
        if (C54741Le5.LIZIZ()) {
            if (z2) {
                InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
                o.LJIIIZ(LJIIZILJ, "<this>");
                IMFToolBarAbility iMFToolBarAbility = (IMFToolBarAbility) C55096Ljo.LIZ(LJIIZILJ, IMFToolBarAbility.class, null);
                if (iMFToolBarAbility != null) {
                    iMFToolBarAbility.La(false);
                }
            } else {
                InterfaceC55235Lm3 LJIIZILJ2 = C55096Ljo.LJIIZILJ(this);
                o.LJIIIZ(LJIIZILJ2, "<this>");
                IMFToolBarAbility iMFToolBarAbility2 = (IMFToolBarAbility) C55096Ljo.LIZ(LJIIZILJ2, IMFToolBarAbility.class, null);
                if (iMFToolBarAbility2 != null) {
                    iMFToolBarAbility2.Dk0(false);
                }
            }
        }
        if (z) {
            if (LJIILJJIL) {
                l7p = L7P.DARK;
            } else {
                l7p = L7P.LIGHT;
            }
            LLQ Xm0 = LNZ.LIZIZ.getHomeTabViewModel(LIZ).Xm0();
            if (Xm0 != null) {
                Xm0.LJJIL(null, l7p);
            }
        }
        C61713OJx LIZJ = C61712OJw.LIZJ(LIZ);
        LIZJ.LIZIZ.LJIIL();
        LIZJ.LIZIZ.LJIIJ(!z2);
        LIZJ.LIZ(false);
        if (z) {
            if (LJIILJJIL) {
                i = R.attr.d4;
            } else {
                i = R.attr.cl;
            }
            LIZJ.LJ(i);
        }
        LIZJ.LIZJ();
    }
}
