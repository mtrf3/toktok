package com.ss.android.ugc.aweme.main.assems;

import X.ActivityC45651qj;
import X.C116694i1;
import X.C1JD;
import X.C212428Vi;
import X.C2K0;
import X.C54030LIk;
import X.C54153LNd;
import X.C54154LNe;
import X.C55096Ljo;
import X.C55230Lly;
import X.C78929UyL;
import X.FFL;
import X.InterfaceC54150LNa;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.LJF;
import X.LNZ;
import X.LO7;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFFeedAbility;
import com.ss.android.ugc.aweme.base.BackRefreshStrategyAbility;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;

/* loaded from: classes10.dex */
public final class BackRefreshStrategyAssem extends BaseMainContainerAssem implements BackRefreshStrategyAbility, InterfaceC55102Lju {
    public InterfaceC54150LNa LJLIL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -700243652) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void LJIIJ() {
        MainBusinessAbility LJIL;
        InterfaceC54150LNa interfaceC54150LNa;
        ActivityC45651qj LIZ;
        TabChangeManager LIZ2;
        String nv0;
        TabChangeManager LIZ3;
        Fragment mv0;
        IMFFeedAbility LJII;
        HomeViewPagerAbility homeViewPagerAbility;
        MainBusinessAbility LJIL2;
        TabChangeManager LIZ4;
        Fragment mv02;
        IMFFeedAbility LJII2;
        InterfaceC54150LNa interfaceC54150LNa2 = this.LJLIL;
        if (interfaceC54150LNa2 != null && !interfaceC54150LNa2.onBackPressed() && (interfaceC54150LNa = this.LJLIL) != null && (LIZ = C212428Vi.LIZ(this)) != null) {
            ActivityC45651qj LIZ5 = C212428Vi.LIZ(this);
            if (LIZ5 == null || (LIZ2 = C116694i1.LIZ(LIZ5)) == null || (nv0 = LIZ2.nv0()) == null) {
                nv0 = "";
            }
            interfaceC54150LNa.LIZIZ(nv0);
            FFL.LJIIIZ().getClass();
            int LJIIJ = FFL.LJIIJ(31744, 0, "back_refresh_strategy", false);
            if (LJIIJ != 0) {
                if (interfaceC54150LNa.LIZ()) {
                    interfaceC54150LNa.LIZLLL();
                } else if (!((MainBusinessAbility) C55096Ljo.LIZIZ(C55230Lly.LIZLLL(LIZ, null), MainBusinessAbility.class)).K0() && !((MainBusinessAbility) C55096Ljo.LIZIZ(C55230Lly.LIZLLL(LIZ, null), MainBusinessAbility.class)).E2()) {
                    if (!C54153LNd.LIZIZ(LIZ)) {
                        LJF ljf = LJF.GOBACK_ICON;
                        C54030LIk.LIZIZ = ljf.getValue();
                        ActivityC45651qj LIZ6 = C212428Vi.LIZ(this);
                        if (LIZ6 != null && (LJIL2 = C1JD.LJIL(C55230Lly.LIZLLL(LIZ6, null))) != null) {
                            LJIL2.VU(LIZ6, "performClickTab", "HOME");
                        }
                        ActivityC45651qj LIZ7 = C212428Vi.LIZ(this);
                        if (LIZ7 != null && (LIZ4 = C116694i1.LIZ(LIZ7)) != null && (mv02 = LIZ4.mv0()) != null && (mv02 instanceof MainFragment)) {
                            if (LNZ.LIZIZ.isProfileActiveInMain(LIZ)) {
                                Bundle bundle = new Bundle();
                                bundle.putString("fromStart", "MainPage");
                                Hox.LJLLI.LIZ(LIZ).Cv0(bundle, "HOME");
                            }
                            MainFragment mainFragment = (MainFragment) mv02;
                            if (!mainFragment.Oe()) {
                                C54030LIk.LIZIZ = ljf.getValue();
                                mainFragment.wl(1);
                            }
                            if (LJIIJ == 1 && (LJII2 = C78929UyL.LJII(mv02)) != null) {
                                LJII2.refreshWhenBack();
                            }
                        }
                    } else {
                        ActivityC45651qj LIZ8 = C212428Vi.LIZ(this);
                        if (LIZ8 != null && (LIZ3 = C116694i1.LIZ(LIZ8)) != null && (mv0 = LIZ3.mv0()) != null && (mv0 instanceof MainFragment)) {
                            MainFragment mainFragment2 = (MainFragment) mv0;
                            if (!mainFragment2.Oe()) {
                                if (mainFragment2.lj()) {
                                    C54154LNe.LIZJ(LIZ, "homepage_follow");
                                } else if (LO7.LIZIZ.J1(mainFragment2.LLLLLZ())) {
                                    C54154LNe.LIZJ(LIZ, mainFragment2.LLLLLZ());
                                } else if (mainFragment2.uk()) {
                                    C54154LNe.LIZJ(LIZ, "homepage_popular");
                                } else if (mainFragment2.K2()) {
                                    C54154LNe.LIZJ(LIZ, "homepage_friends");
                                } else if (mainFragment2.oc()) {
                                    C54154LNe.LIZJ(LIZ, "homepage_nearby");
                                } else if (mainFragment2.jg()) {
                                    C54154LNe.LIZJ(LIZ, "homepage_explore");
                                }
                                InterfaceC55235Lm3 interfaceC55235Lm3 = mainFragment2.LJLLILLLL;
                                if (interfaceC55235Lm3 != null && (homeViewPagerAbility = (HomeViewPagerAbility) C55096Ljo.LIZ(interfaceC55235Lm3, HomeViewPagerAbility.class, null)) != null) {
                                    homeViewPagerAbility.B(3);
                                }
                                C54030LIk.LIZIZ = LJF.GOBACK_ICON.getValue();
                                mainFragment2.wl(1);
                            } else {
                                C54154LNe.LIZJ(LIZ, "homepage_hot");
                            }
                            if (LJIIJ == 1 && (LJII = C78929UyL.LJII(mv0)) != null) {
                                LJII.refreshWhenBack();
                            }
                        }
                    }
                }
            }
        }
        Boolean bool = Boolean.FALSE;
        ActivityC45651qj LIZ9 = C212428Vi.LIZ(this);
        if (LIZ9 == null || (LJIL = C1JD.LJIL(C55230Lly.LIZLLL(LIZ9, null))) == null) {
            return;
        }
        LJIL.VU(LIZ9, "exitGuideView", bool);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void S5() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        InterfaceC54150LNa mainHelper = LNZ.LIZIZ.getMainHelper(LIZ);
        mainHelper.onCreate();
        this.LJLIL = mainHelper;
    }

    @Override // com.ss.android.ugc.aweme.base.BackRefreshStrategyAbility
    public final InterfaceC54150LNa getMainHelper() {
        return this.LJLIL;
    }
}
