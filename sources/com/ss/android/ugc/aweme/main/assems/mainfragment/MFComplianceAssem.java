package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C212428Vi;
import X.C221108m2;
import X.C35138Dqg;
import X.C51588KMm;
import X.C54329LTx;
import X.C54330LTy;
import X.C55096Ljo;
import X.C62822Ol8;
import X.C68252m5;
import X.C73272uB;
import X.C73411SrX;
import X.C84763XOl;
import X.FAJ;
import X.InterfaceC215378cn;
import X.InterfaceC36571c5;
import X.InterfaceC39268Fb6;
import X.InterfaceC54152LNc;
import X.InterfaceC72642tA;
import X.LL7;
import X.LNP;
import X.LU0;
import X.LU1;
import X.LU2;
import X.T16;
import Y.ARunnableS45S0100000_9;
import Y.AfS61S0100000_9;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.compliance.protection.serviceimpl.ProtectionServiceImpl;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes10.dex */
public final class MFComplianceAssem extends UIContentAssem implements InterfaceC39268Fb6, InterfaceC54152LNc {
    public boolean LJLIL;
    public C73411SrX LJLILLLLZI;
    public View LJLJI;
    public ViewStub LJLJJI;
    public LL7 LJLJJL;
    public C51588KMm LJLJJLL;
    public final C62822Ol8 LJLJL;

    @Override // X.InterfaceC39268Fb6
    public final void LLJJL() {
        v3(true);
    }

    @Override // X.InterfaceC39268Fb6
    public final void LLJZIJLIL() {
        v3(false);
    }

    public MFComplianceAssem() {
        new LinkedHashMap();
        this.LJLJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 298));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        this.LJLJJL = ProtectionServiceImpl.LJJ().LJIILL();
        super.onCreate();
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        this.LJLILLLLZI = (C73411SrX) AbstractC73672Svk.LJJLL(AbstractC73672Svk.LJJIJIL(a.LJIJJ()), C84763XOl.LJFF(), LU0.LJLIL).LJJL(T16.LIZ()).LJJJJZI(new AfS61S0100000_9(this, 5));
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        x3();
        this.LJLILLLLZI = (C73411SrX) AbstractC73672Svk.LJJIJIL(a.LJIJJ()).LJJL(T16.LIZ()).LJJJJZI(new AfS61S0100000_9(this, 6));
    }

    public final void x3() {
        ActivityC45651qj LIZ;
        IMFAbility iMFAbility;
        InterfaceC36571c5 currentFragment;
        if (a.LJIJJ().LJ(null) && (LIZ = C212428Vi.LIZ(this)) != null && (iMFAbility = (IMFAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IMFAbility.class, null)) != null && (currentFragment = iMFAbility.getCurrentFragment()) != null && (currentFragment instanceof InterfaceC215378cn)) {
            InterfaceC72642tA cl = ((InterfaceC215378cn) currentFragment).cl();
            if (cl instanceof LU2) {
                LU2 lu2 = (LU2) cl;
                lu2.LIZJ(new C54329LTx(this, lu2));
                lu2.w3();
                if (!this.LJLIL) {
                    this.LJLIL = a.LJIJJ().LJII(LIZ, "homepage_hot");
                    return;
                }
                return;
            }
            if (!(cl instanceof DetailFragmentPanel)) {
                return;
            }
            LU1 lu1 = (LU1) cl;
            lu1.qe(new C54330LTy(this, lu1));
            lu1.w3();
            if (LIZ.isFinishing() || this.LJLIL) {
                return;
            }
            this.LJLIL = a.LJIJJ().LJII(LIZ, "deeplink");
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (C35138Dqg.LIZJ()) {
            this.LJLJJI = (ViewStub) getContainerView().findViewById(R.id.l25);
        }
        if (this.LJLJJI == null) {
            this.LJLJI = getContainerView().findViewById(R.id.l24);
            this.LJLJJLL = (C51588KMm) getContainerView().findViewById(R.id.l22);
        }
        if (a.LJIILL().LJIJ()) {
            if (C35138Dqg.LIZJ()) {
                if (this.LJLJI == null && this.LJLJJI != null) {
                    FAJ.LJIIIIZZ(new ARunnableS45S0100000_9(this, 215));
                }
                this.LJLJJLL = (C51588KMm) getContainerView().findViewById(R.id.l22);
            }
            LL7 ll7 = this.LJLJJL;
            if (ll7 != null) {
                ll7.LIZ((LNP) this.LJLJL.getValue(), this.LJLJI, this.LJLJJLL, getContainerView().findViewById(R.id.j5x));
            }
        }
        C68252m5.LIZ(this, new C73272uB(this, null));
    }

    public final void v3(boolean z) {
        InterfaceC36571c5 currentFragment;
        IMFAbility iMFAbility = (IMFAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IMFAbility.class, null);
        if (iMFAbility != null && (currentFragment = iMFAbility.getCurrentFragment()) != null && (currentFragment instanceof InterfaceC215378cn)) {
            InterfaceC72642tA cl = ((InterfaceC215378cn) currentFragment).cl();
            if (cl instanceof LU2) {
                LU2 lu2 = (LU2) cl;
                if (z) {
                    lu2.LLJJL();
                    return;
                } else {
                    lu2.LLJZIJLIL();
                    return;
                }
            }
            if (!(currentFragment instanceof LU1) || !(cl instanceof LU1)) {
                return;
            }
            LU1 lu1 = (LU1) cl;
            if (z) {
                lu1.LLJJL();
            } else {
                lu1.LLJZIJLIL();
            }
        }
    }

    @Override // X.InterfaceC54152LNc
    public final void LJJJJI(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
    }
}
