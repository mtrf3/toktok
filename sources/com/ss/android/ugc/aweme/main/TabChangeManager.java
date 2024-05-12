package com.ss.android.ugc.aweme.main;

import X.AbstractC53895LDf;
import X.ActivityC45651qj;
import X.C10K;
import X.C36922EeM;
import X.C37179EiV;
import X.C45804HyK;
import X.C56662Kg;
import X.C8RO;
import X.LLC;
import X.LLD;
import X.LLE;
import X.LLF;
import X.X1D;
import X.YE1;
import Y.ACallableS26S1300000_9;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Space;
import android.widget.TabHost;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.homepage.ui.experiment.EasyNavigationExperimentServiceImpl;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.ui.FragmentTabHost;
import defpackage.q;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TabChangeManager extends ViewModel {
    public static final /* synthetic */ int LJLLJ = 0;
    public FragmentTabHost LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public Fragment LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public final List<LLE> LJLJL = new CopyOnWriteArrayList();
    public final C8RO LJLJLJ = new C8RO("BottomTab");
    public String LJLJLLL;
    public int LJLL;
    public FragmentManager LJLLI;
    public LLF LJLLILLLL;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LJLIL = null;
        ((CopyOnWriteArrayList) this.LJLJL).clear();
    }

    public final String nv0() {
        if (this.LJLJI) {
            return this.LJLJJL;
        }
        return this.LJLJLLL;
    }

    public final boolean pv0() {
        if (this.LJLIL != null) {
            return true;
        }
        return false;
    }

    public final Fragment mv0() {
        if (!pv0()) {
            return null;
        }
        if (this.LJLILLLLZI) {
            return this.LJLJJI;
        }
        FragmentTabHost fragmentTabHost = this.LJLIL;
        if (fragmentTabHost == null) {
            return null;
        }
        return fragmentTabHost.getCurrentFragment();
    }

    public final Fragment ov0() {
        FragmentTabHost fragmentTabHost;
        if (!pv0() || (fragmentTabHost = this.LJLIL) == null) {
            return null;
        }
        return fragmentTabHost.getCurrentFragment();
    }

    public final Fragment Ja(String str) {
        FragmentManager fragmentManager;
        if (!pv0() || (fragmentManager = this.LJLLI) == null) {
            return null;
        }
        o.LJI(fragmentManager);
        return fragmentManager.LJJJIL(str);
    }

    public final void hv0(final LLE listener) {
        o.LJIIIZ(listener, "listener");
        ((CopyOnWriteArrayList) this.LJLJL).add(listener);
        if (listener instanceof LifecycleOwner) {
            ((LifecycleOwner) listener).getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.main.TabChangeManager$addListener$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        ((CopyOnWriteArrayList) TabChangeManager.this.LJLJL).remove(listener);
                    }
                }
            });
        }
    }

    public final void qv0(LLE lle) {
        if (lle != null && ((CopyOnWriteArrayList) this.LJLJL).contains(lle)) {
            ((CopyOnWriteArrayList) this.LJLJL).remove(lle);
        }
    }

    public final void gv0(Bundle bundle, String str, Class cls) {
        if (!pv0()) {
            C10K.LIZIZ(new ACallableS26S1300000_9(this, cls, str, bundle, 0), C10K.LJIIIIZZ, null);
            return;
        }
        FragmentTabHost fragmentTabHost = this.LJLIL;
        o.LJI(fragmentTabHost);
        o.LJI(str);
        TabHost.TabSpec newTabSpec = fragmentTabHost.newTabSpec(str);
        o.LJIIIIZZ(newTabSpec, "mTabHost!!.newTabSpec(tag!!)");
        FragmentTabHost fragmentTabHost2 = this.LJLIL;
        o.LJI(fragmentTabHost2);
        Space space = new Space(fragmentTabHost2.getContext());
        space.setMinimumHeight(0);
        space.setMinimumWidth(0);
        newTabSpec.setIndicator(space);
        try {
            FragmentTabHost fragmentTabHost3 = this.LJLIL;
            o.LJI(fragmentTabHost3);
            fragmentTabHost3.LIZ(newTabSpec, cls, bundle);
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
    }

    public static /* synthetic */ void jv0(TabChangeManager tabChangeManager, String str, boolean z, int i) {
        boolean z2 = z;
        if ((i & 4) != 0) {
            z2 = false;
        }
        tabChangeManager.iv0(str, false, z2, null, null);
    }

    public final void iv0(String str, boolean z, boolean z2, Bundle bundle, String str2) {
        FragmentTabHost fragmentTabHost;
        Context context;
        ActivityC45651qj LJJIFFI;
        if (str == null) {
            return;
        }
        if (EasyNavigationExperimentServiceImpl.LJFF().LJ() && o.LJ(str, "HOME") && (fragmentTabHost = this.LJLIL) != null && (context = fragmentTabHost.getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (!z2)) {
            EasyNavigationExperimentServiceImpl.LJFF().LIZJ(LJJIFFI);
        }
        int i = this.LJLL + 1;
        this.LJLL = i;
        kv0(str, z, i, false, bundle, str2);
    }

    public final void kv0(String str, boolean z, int i, boolean z2, Bundle bundle, String str2) {
        ScrollSwitchStateManager scrollSwitchStateManager;
        Context context;
        ActivityC45651qj LJJIFFI;
        AbstractC53895LDf rv0;
        Bundle LJIIIZ;
        if (!TextUtils.equals("HOME", str)) {
            C56662Kg.LIZ().LIZLLL = false;
            C56662Kg.LIZ().LJIIIZ = false;
        }
        C8RO c8ro = this.LJLJLJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isSafeTabHost:");
        LIZ.append(pv0());
        LIZ.append(", mLastFragment:");
        YE1.LIZLLL(LIZ, this.LJLJJLL, ", enterMethod:", str2, ", tag:");
        c8ro.LIZ(null, q.LIZIZ(LIZ, str, ' ', LIZ));
        if (!pv0() && TextUtils.equals("HOME", str) && nv0() == null) {
            this.LJLJJLL = nv0();
            this.LJLJLLL = str;
        }
        if (!pv0()) {
            C37179EiV.LIZ().post(new LLD(this, str, z, i, z2, bundle, str2));
            return;
        }
        if (this.LJLL > i) {
            return;
        }
        HomePageUIFrameService LIZ2 = HomePageUIFrameServiceImpl.LIZ();
        FragmentTabHost fragmentTabHost = this.LJLIL;
        o.LJI(fragmentTabHost);
        String tagForCurrentTabInMainPageFragment = LIZ2.getTagForCurrentTabInMainPageFragment(this, fragmentTabHost.getCurrentTabTag(), str);
        if (bundle != null) {
            FragmentTabHost fragmentTabHost2 = this.LJLIL;
            if (fragmentTabHost2 != null && (context = fragmentTabHost2.getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
                Hox LIZ3 = Hox.LJLLI.LIZ(LJJIFFI);
                if (LIZ3.Ja(str) == null && (rv0 = LIZ3.rv0(str)) != null && (LJIIIZ = rv0.LJIIIZ()) != null) {
                    bundle.putAll(LJIIIZ);
                }
            }
            FragmentTabHost fragmentTabHost3 = this.LJLIL;
            o.LJI(fragmentTabHost3);
            Iterator<LLC> it = fragmentTabHost3.LJLILLLLZI.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                LLC next = it.next();
                if (next != null && TextUtils.equals(next.LIZ, tagForCurrentTabInMainPageFragment)) {
                    next.LIZJ = bundle;
                    break;
                }
            }
        }
        FragmentTabHost fragmentTabHost4 = this.LJLIL;
        o.LJI(fragmentTabHost4);
        fragmentTabHost4.setCurrentTabByTag(tagForCurrentTabInMainPageFragment);
        this.LJLJJLL = nv0();
        this.LJLJLLL = str;
        LLF llf = this.LJLLILLLL;
        if (llf != null && (scrollSwitchStateManager = llf.LIZ.LIZJ) != null) {
            scrollSwitchStateManager.LJLZ = str;
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LJLJL).iterator();
        while (it2.hasNext()) {
            ((LLE) it2.next()).LJLJJLL(str, this.LJLJJLL, z, z2, bundle, str2);
        }
        HomePageUIFrameServiceImpl.LIZ().afterTabChangedInMainPageFragment(str);
    }
}
