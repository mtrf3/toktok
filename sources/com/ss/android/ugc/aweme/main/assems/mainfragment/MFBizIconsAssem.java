package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.AbstractC54129LMf;
import X.ActivityC45651qj;
import X.C212428Vi;
import X.C221108m2;
import X.C2K0;
import X.C40471FuV;
import X.C42124Gg4;
import X.C47261Igj;
import X.C53134KtG;
import X.C54096LKy;
import X.C55096Ljo;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C76800UCe;
import X.InterfaceC54151LNb;
import X.InterfaceC54152LNc;
import X.InterfaceC55102Lju;
import X.InterfaceC88472Yns;
import X.LK3;
import X.LL4;
import X.LM4;
import X.LM6;
import X.LM7;
import X.LMA;
import X.LMB;
import X.LMC;
import X.LMD;
import X.LML;
import X.LNP;
import X.LPY;
import X.LQB;
import Y.AObserverS77S0100000_9;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFShopAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.search.SearchIconTipsHelper;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.main.assems.mainfragment.protocol.IMFIconsProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MFBizIconsAssem extends UIContentAssem implements InterfaceC54151LNb, InterfaceC54152LNc, IMFIconsProtocol, IMFShopAbility, InterfaceC55102Lju {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public LML LJLJJLL;
    public final LM7 LJLJL;
    public final LM6 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final AObserverS77S0100000_9 LJLLJ;

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.protocol.IMFIconsProtocol
    public final List<LML> F2() {
        List<LML> LJJIJIL = C47261Igj.LJJIJIL(this.LJLJL, this.LJLJLJ);
        List<? extends LML> LIZ = ((C54096LKy) this.LJLILLLLZI.getValue()).LIZ(false);
        if (LIZ != null && !((ArrayList) LIZ).isEmpty()) {
            Iterator it = ((ArrayList) LIZ).iterator();
            while (it.hasNext()) {
                LML lml = (LML) it.next();
                String LJFF = lml.LJFF();
                if (LJFF == null) {
                    LJFF = "";
                }
                if (o.LJ(LJFF, "USER")) {
                    this.LJLJJLL = lml;
                }
                LJJIJIL.add(lml);
            }
        }
        return LJJIJIL;
    }

    @Override // X.InterfaceC54151LNb
    public final void LLJJJJJIL(int i, Fragment fragment) {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1573931489) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC54151LNb
    public final void y(int i, boolean z) {
    }

    public MFBizIconsAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, BuildConfig.VERSION_CODE));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 289));
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 296));
        this.LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 295));
        this.LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 291));
        this.LJLJL = new LM7(this);
        this.LJLJLJ = new LM6(this);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 293));
        this.LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 294));
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 297));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 292));
        this.LJLLJ = new AObserverS77S0100000_9(this, 21);
    }

    public final AbstractC54129LMf A3() {
        return (AbstractC54129LMf) this.LJLJI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.protocol.IMFIconsProtocol
    public final List<LML> X() {
        List arrayList;
        if (((Boolean) C53134KtG.LIZ.getValue()).booleanValue()) {
            arrayList = (List) this.LJLLILLLL.getValue();
        } else {
            Object value = this.LJLL.getValue();
            if (value != null) {
                arrayList = C47261Igj.LJJIJIL(value);
            } else {
                arrayList = new ArrayList();
            }
        }
        if (C40471FuV.LIZ()) {
            arrayList.add(this.LJLJL);
        }
        List<? extends LML> LIZ = ((C54096LKy) this.LJLILLLLZI.getValue()).LIZ(true);
        if (LIZ != null && !((ArrayList) LIZ).isEmpty()) {
            Iterator it = ((ArrayList) LIZ).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    public final LNP v3() {
        return (LNP) this.LJLIL.getValue();
    }

    public final LQB x3() {
        return (LQB) this.LJLJLLL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), IMFIconsProtocol.class, C47261Igj.LJJIJIL(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        LM4 LIZLLL;
        super.onDestroy();
        LQB x3 = x3();
        if (x3 != null) {
            x3.onDestroyView();
        }
        LML lml = this.LJLJJLL;
        if (lml != null && (LIZLLL = lml.LIZLLL()) != null) {
            LIZLLL.onCreate();
        }
        C3(LMA.LJLIL);
        A3().LJI();
        C42124Gg4.LIZJ.clear();
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8W0
    public final void onPause() {
        LM4 LIZLLL;
        super.onPause();
        x3();
        LML lml = this.LJLJJLL;
        if (lml != null && (LIZLLL = lml.LIZLLL()) != null) {
            LIZLLL.onCreate();
        }
        C3(LMB.LJLIL);
    }

    @Override // X.C8W0
    public final void onResume() {
        LM4 LIZLLL;
        super.onResume();
        LQB x3 = x3();
        if (x3 != null) {
            x3.onResume();
        }
        LML lml = this.LJLJJLL;
        if (lml != null && (LIZLLL = lml.LIZLLL()) != null) {
            LIZLLL.onCreate();
        }
        C3(LMC.LJLIL);
    }

    public final void C3(InterfaceC88472Yns<? super LM4, C76800UCe> interfaceC88472Yns) {
        Iterator it = ((List) this.LJLLILLLL.getValue()).iterator();
        while (it.hasNext()) {
            interfaceC88472Yns.invoke(((LML) it.next()).LIZLLL());
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFShopAbility
    public final void Jb(String str) {
        if (TextUtils.equals("Shop", str)) {
            IMFToolBarAbility iMFToolBarAbility = (IMFToolBarAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IMFToolBarAbility.class, null);
            if (iMFToolBarAbility != null) {
                iMFToolBarAbility.A6((LL4) this.LJLLI.getValue());
            }
            IMFToolBarAbility iMFToolBarAbility2 = (IMFToolBarAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IMFToolBarAbility.class, null);
            if (iMFToolBarAbility2 != null) {
                iMFToolBarAbility2.rt();
            }
        }
    }

    @Override // X.InterfaceC54151LNb
    public final void LLLLILI(Bundle bundle) {
        LM4 LIZLLL;
        SearchIconTipsHelper searchIconTipsHelper = SearchIconTipsHelper.LJLIL;
        searchIconTipsHelper.getClass();
        SearchIconTipsHelper.LJLJI.LIZIZ(SearchIconTipsHelper.LJLILLLLZI[0], searchIconTipsHelper, Boolean.FALSE);
        LML lml = this.LJLJJLL;
        if (lml != null && (LIZLLL = lml.LIZLLL()) != null) {
            LIZLLL.LJIIL();
        }
    }

    @Override // X.InterfaceC54151LNb
    public final void LLLLLLZ(Bundle args) {
        LM4 LIZLLL;
        o.LJIIIZ(args, "args");
        SearchIconTipsHelper searchIconTipsHelper = SearchIconTipsHelper.LJLIL;
        searchIconTipsHelper.getClass();
        SearchIconTipsHelper.LJLJI.LIZIZ(SearchIconTipsHelper.LJLILLLLZI[0], searchIconTipsHelper, Boolean.TRUE);
        LML lml = this.LJLJJLL;
        if (lml != null && (LIZLLL = lml.LIZLLL()) != null) {
            LIZLLL.LJIIZILJ();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        LM4 LIZLLL;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        LQB x3 = x3();
        if (x3 != null) {
            x3.onCreate();
        }
        LML lml = this.LJLJJLL;
        if (lml != null && (LIZLLL = lml.LIZLLL()) != null) {
            LIZLLL.onCreate();
        }
        C3(LMD.LJLIL);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            LPY.LIZ(LIZ).LJLILLLLZI.observe(this, this.LJLLJ);
        }
        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LJLJJL.getValue();
        if (homeViewPagerAbility != null) {
            homeViewPagerAbility.addOnPageChangeListener(new LK3(this));
        }
    }

    @Override // X.InterfaceC54152LNc
    public final void LJJJJI(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
    }
}
