package com.ss.android.ugc.aweme.homepage.ui.view.tab;

import X.ActivityC45651qj;
import X.C116694i1;
import X.C221108m2;
import X.C53320KwG;
import X.C55096Ljo;
import X.C55230Lly;
import X.C5H3;
import X.C61878OQg;
import X.C84193Sd;
import X.EnumC221088m0;
import X.InterfaceC54080LKi;
import X.InterfaceC54132LMi;
import X.L7P;
import X.LH3;
import X.LLQ;
import X.LTT;
import Y.AObserverS77S0100000_9;
import android.view.View;
import androidx.lifecycle.ViewModel;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class HomeTabViewModel extends ViewModel implements InterfaceC54132LMi {
    public static final LH3 LJLJLLL = new LH3();
    public final ActivityC45651qj LJLIL;
    public final HashMap<String, InterfaceC54080LKi> LJLILLLLZI = new HashMap<>();
    public final HashMap<InterfaceC54080LKi, View> LJLJI = new HashMap<>();
    public final C5H3 LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public LLQ LJLJLJ;

    @Override // X.InterfaceC54132LMi
    public final View Vd() {
        int i;
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (activityC45651qj != null) {
            if (C53320KwG.LIZIZ()) {
                i = R.id.gbw;
            } else {
                i = R.id.gc8;
            }
            return activityC45651qj.findViewById(i);
        }
        return null;
    }

    public final List<InterfaceC54080LKi> gv0() {
        List<InterfaceC54080LKi> fd;
        HomeTabAbility homeTabAbility = (HomeTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(this.LJLIL, null), HomeTabAbility.class, null);
        if (homeTabAbility == null || (fd = homeTabAbility.fd()) == null) {
            return C61878OQg.INSTANCE;
        }
        return fd;
    }

    @Override // X.InterfaceC54132LMi
    public final List<InterfaceC54080LKi> pU() {
        List<InterfaceC54080LKi> p5;
        HomeTabAbility homeTabAbility = (HomeTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(this.LJLIL, null), HomeTabAbility.class, null);
        if (homeTabAbility == null || (p5 = homeTabAbility.p5()) == null) {
            return C61878OQg.INSTANCE;
        }
        return p5;
    }

    @Override // X.InterfaceC54132LMi
    public final LLQ Xm0() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC54132LMi
    public final boolean md() {
        return this.LJLJL;
    }

    public HomeTabViewModel(ActivityC45651qj activityC45651qj) {
        this.LJLJJI = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, new AqS151S0100000_1(activityC45651qj, 67));
        o.LJI(activityC45651qj);
        this.LJLIL = activityC45651qj;
        if (C53320KwG.LIZIZ()) {
            ScrollSwitchStateManager LIZ = C84193Sd.LIZ(activityC45651qj);
            AObserverS77S0100000_9 aObserverS77S0100000_9 = new AObserverS77S0100000_9(this, 13);
            LIZ.getClass();
            LIZ.LJLIL.observe(activityC45651qj, aObserverS77S0100000_9);
            LIZ.qv0(activityC45651qj, new AObserverS77S0100000_9(this, 14));
        }
    }

    @Override // X.InterfaceC54132LMi
    public final void Gb0(LLQ llq) {
        this.LJLJLJ = llq;
    }

    @Override // X.InterfaceC54132LMi
    public final <T extends InterfaceC54080LKi> T H70(String tabName) {
        o.LJIIIZ(tabName, "tabName");
        InterfaceC54080LKi interfaceC54080LKi = this.LJLILLLLZI.get(tabName);
        if (interfaceC54080LKi instanceof InterfaceC54080LKi) {
            return (T) interfaceC54080LKi;
        }
        return null;
    }

    @Override // X.InterfaceC54132LMi
    public final void e(int i, boolean z) {
        boolean z2;
        L7P l7p;
        if (!C53320KwG.LIZIZ()) {
            return;
        }
        this.LJLJL = false;
        if (!this.LJLJJLL && !z) {
            return;
        }
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLJJL = z2;
        String str = "HOME";
        if (!o.LJ(C116694i1.LIZ(this.LJLIL).nv0(), "HOME")) {
            return;
        }
        IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (i != 0) {
            str = "USER";
        }
        createIMainServicebyMonsterPlugin.changeStatusBarMainTab(activityC45651qj, str);
        if (i == 0) {
            LTT.LIZJ(this.LJLIL);
            LLQ llq = this.LJLJLJ;
            if (llq != null) {
                llq.LIZLLL(true);
            }
        } else {
            ActivityC45651qj activityC45651qj2 = this.LJLIL;
            o.LJIIIZ(activityC45651qj2, "<this>");
            LTT.LJ(activityC45651qj2);
            LLQ llq2 = this.LJLJLJ;
            if (llq2 != null) {
                llq2.LIZLLL(false);
            }
        }
        LLQ llq3 = this.LJLJLJ;
        if (llq3 != null) {
            if (i == 0) {
                l7p = L7P.DARK;
            } else {
                l7p = L7P.LIGHT;
            }
            llq3.LJJIL(null, l7p);
        }
    }
}
