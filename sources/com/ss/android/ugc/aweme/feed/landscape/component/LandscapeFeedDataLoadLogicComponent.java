package com.ss.android.ugc.aweme.feed.landscape.component;

import X.AbstractC72278SYg;
import X.C221108m2;
import X.C2K0;
import X.C2KF;
import X.C32I;
import X.C55083Ljb;
import X.C62822Ol8;
import X.C76800UCe;
import X.C80796VnM;
import X.InterfaceC55102Lju;
import X.InterfaceC88471Ynr;
import X.KQA;
import X.ORZ;
import X.OSZ;
import X.SYL;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedDataLoadLogicAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeFeedViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class LandscapeFeedDataLoadLogicComponent extends BasePanelComponent implements LandscapeFeedDataLoadLogicAbility, KQA, InterfaceC55102Lju {
    public volatile boolean LJLIL;
    public BaseDetailShareVM<?, ?, ?> LJLJI;
    public C55083Ljb LJLJJLL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 83));
    public boolean LJLJJI = true;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 82));
    public final Map<Integer, List<InterfaceC88471Ynr<List<? extends Aweme>, Boolean, C76800UCe>>> LJLJL = new LinkedHashMap();

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception exc) {
    }

    @Override // X.InterfaceC224378rJ
    public final /* synthetic */ void VC() {
    }

    @Override // X.InterfaceC50666JuY
    public final void Yv(Exception exc) {
    }

    @Override // X.InterfaceC224378rJ
    public final void ZF(OSZ<Integer, ? extends Aweme> osz) {
    }

    @Override // X.InterfaceC51032K1c
    public final void c0(boolean z) {
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception exc) {
    }

    @Override // X.InterfaceC224378rJ
    public final void fC(Exception exc) {
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
    }

    @Override // X.InterfaceC51033K1d
    public final void onItemDeleted(int i) {
    }

    @Override // X.InterfaceC51033K1d
    public final void onItemInserted(List<Aweme> list, int i) {
    }

    @Override // X.InterfaceC51033K1d
    public final /* synthetic */ boolean onItemInsertedNew(C2KF<Aweme> c2kf) {
        return false;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1611563263) {
            return null;
        }
        return this;
    }

    @Override // X.KQA
    public final void px() {
    }

    @Override // X.InterfaceC50666JuY
    public final void s00(List<Aweme> list) {
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
    }

    @Override // X.KQA
    public final Fragment getFragment() {
        return getPanelContext().LJ;
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        PagerAdapter pagerAdapter;
        C55083Ljb c55083Ljb;
        C80796VnM lH;
        AbstractC72278SYg<?> config;
        SYL syl;
        super.onParentViewCreated();
        getPanelContext();
        List<Aweme> list = null;
        SharedViewModelProvider sharedViewModelProvider = new SharedViewModelProvider((ViewModelProvider.Factory) null, 1, (DefaultConstructorMarker) null);
        Lifecycle lifecycle = getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
        ViewModel viewModel = sharedViewModelProvider.get(lifecycle, "landscapefeed", LandscapeFeedViewModel.class);
        BaseDetailShareVM baseDetailShareVM = (BaseDetailShareVM) viewModel;
        if (!baseDetailShareVM._initialized) {
            baseDetailShareVM.initialize(this);
        }
        BaseDetailShareVM<?, ?, ?> baseDetailShareVM2 = (BaseDetailShareVM) viewModel;
        this.LJLJI = baseDetailShareVM2;
        if (baseDetailShareVM2 != null) {
            baseDetailShareVM2.bindView(this);
        }
        BaseDetailShareVM<?, ?, ?> baseDetailShareVM3 = this.LJLJI;
        if (baseDetailShareVM3 != null && (config = baseDetailShareVM3.getConfig()) != null && (syl = (SYL) this.LJLJJL.getValue()) != null) {
            syl.LJLJLLL(config);
        }
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) this.LJLILLLLZI.getValue();
        if (landscapeFeedViewPagerAbility != null && (lH = landscapeFeedViewPagerAbility.lH()) != null) {
            pagerAdapter = lH.getAdapter();
        } else {
            pagerAdapter = null;
        }
        if (pagerAdapter instanceof C55083Ljb) {
            c55083Ljb = (C55083Ljb) pagerAdapter;
        } else {
            c55083Ljb = null;
        }
        this.LJLJJLL = c55083Ljb;
        if (c55083Ljb != null) {
            BaseDetailShareVM<?, ?, ?> baseDetailShareVM4 = this.LJLJI;
            if (baseDetailShareVM4 != null) {
                list = baseDetailShareVM4.getAwemeList();
            }
            c55083Ljb.setData(list);
        }
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility2 = (LandscapeFeedViewPagerAbility) this.LJLILLLLZI.getValue();
        if (landscapeFeedViewPagerAbility2 != null) {
            landscapeFeedViewPagerAbility2.Zn(this, new AqS174S0100000_8(this, 39));
        }
    }

    public static List v3(List list, List list2) {
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Aweme) it.next()).getAid());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (!arrayList.contains(((Aweme) obj).getAid())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<Aweme> list, boolean z) {
        List<Aweme> list2;
        this.LJLJJI = z;
        C55083Ljb c55083Ljb = this.LJLJJLL;
        if (c55083Ljb != null) {
            c55083Ljb.setData(list);
        }
        C55083Ljb c55083Ljb2 = this.LJLJJLL;
        if (c55083Ljb2 != null) {
            list2 = c55083Ljb2.LJJIL();
        } else {
            list2 = null;
        }
        x3(0, z, list2);
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<Aweme> list, boolean z) {
        List<Aweme> list2;
        C55083Ljb c55083Ljb;
        List<Aweme> LJJIL;
        C55083Ljb c55083Ljb2;
        this.LJLJJI = z;
        this.LJLIL = false;
        if (list != null && (c55083Ljb = this.LJLJJLL) != null && (LJJIL = c55083Ljb.LJJIL()) != null && (c55083Ljb2 = this.LJLJJLL) != null) {
            c55083Ljb2.setData(ORZ.LLIIIZ(v3(LJJIL, list), LJJIL));
        }
        C55083Ljb c55083Ljb3 = this.LJLJJLL;
        if (c55083Ljb3 != null) {
            list2 = c55083Ljb3.LJJIL();
        } else {
            list2 = null;
        }
        x3(1, z, list2);
    }

    @Override // X.InterfaceC223218pR
    public final void jh(List<Aweme> list, boolean z) {
        List<Aweme> list2;
        C55083Ljb c55083Ljb;
        List<Aweme> LJJIL;
        C55083Ljb c55083Ljb2;
        if (list != null && (c55083Ljb = this.LJLJJLL) != null && (LJJIL = c55083Ljb.LJJIL()) != null && (c55083Ljb2 = this.LJLJJLL) != null) {
            c55083Ljb2.setData(ORZ.LLIIIZ(LJJIL, v3(LJJIL, list)));
        }
        C55083Ljb c55083Ljb3 = this.LJLJJLL;
        if (c55083Ljb3 != null) {
            list2 = c55083Ljb3.LJJIL();
        } else {
            list2 = null;
        }
        x3(2, z, list2);
    }

    public final void x3(int i, boolean z, List list) {
        List list2 = (List) ((LinkedHashMap) this.LJLJL).get(Integer.valueOf(i));
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ((InterfaceC88471Ynr) it.next()).invoke(list, Boolean.valueOf(z));
            }
        }
    }
}
