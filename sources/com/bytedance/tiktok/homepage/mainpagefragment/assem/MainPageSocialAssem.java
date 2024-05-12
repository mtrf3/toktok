package com.bytedance.tiktok.homepage.mainpagefragment.assem;

import X.C212428Vi;
import X.C221108m2;
import X.C2K0;
import X.C53985LGr;
import X.C62822Ol8;
import X.C77266UUc;
import X.C8DO;
import X.C90M;
import X.InterfaceC55102Lju;
import X.LIF;
import X.LK8;
import X.LK9;
import X.LKA;
import X.LKB;
import X.LKD;
import X.LKE;
import X.QD3;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentUIAssem;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageSocialAbility;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.MainFragment;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class MainPageSocialAssem extends BaseMainPageFragmentUIAssem implements MainPageSocialAbility, InterfaceC55102Lju {
    public C53985LGr LJLIL;
    public LKA LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -825782664) {
            return null;
        }
        return this;
    }

    public MainPageSocialAssem() {
        new LinkedHashMap();
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 53));
        this.LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 52));
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageSocialAbility
    public final String cg0() {
        Fragment fragment;
        FeedFragment w2;
        BaseScrollSwitchStateManager baseScrollSwitchStateManager = (BaseScrollSwitchStateManager) this.LJLJI.getValue();
        if (baseScrollSwitchStateManager != null) {
            fragment = baseScrollSwitchStateManager.gv0();
        } else {
            fragment = null;
        }
        if (!(fragment instanceof MainFragment)) {
            return null;
        }
        MainFragment mainFragment = (MainFragment) fragment;
        FeedFragment w22 = mainFragment.w2();
        if (w22 instanceof FeedFollowFragment) {
            return "homepage_follow";
        }
        if (w22 instanceof FeedRecommendFragment) {
            return "homepage_hot";
        }
        if (w22 instanceof C90M) {
            return "homepage_popular";
        }
        if (w22 instanceof LIF) {
            return "homepage_friends";
        }
        if (w22 instanceof C8DO) {
            return "homepage_nearby";
        }
        if (!(w22 instanceof LKB) || (w2 = mainFragment.w2()) == null) {
            return null;
        }
        return w2.LJLJI;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        LKA lka = this.LJLILLLLZI;
        if (lka != null) {
            lka.onDestroyView();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onShowSocialRecFriendsDialogEvent(LK8 event) {
        o.LJIIIZ(event, "event");
        LKA lka = this.LJLILLLLZI;
        if (lka != null) {
            lka.LIZ(event.LJLIL, event.LJLILLLLZI);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ScrollSwitchStateManager scrollSwitchStateManager;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL == null || (scrollSwitchStateManager = (ScrollSwitchStateManager) this.LJLJI.getValue()) == null) {
            return;
        }
        this.LJLIL = new C53985LGr(new LK9(this), LIZLLL, scrollSwitchStateManager);
        this.LJLILLLLZI = C77266UUc.LIZIZ.LIZ.LJJIJIL(LIZLLL, (HomePageDataViewModel) this.LJLJJI.getValue(), new AqS159S0100000_9(scrollSwitchStateManager, 1013));
    }

    @Override // com.ss.android.ugc.aweme.base.mainpagefragment.MainPageSocialAbility
    public final void r2(String curTabName, String bottomTabName) {
        o.LJIIIZ(curTabName, "curTabName");
        o.LJIIIZ(bottomTabName, "bottomTabName");
        C53985LGr c53985LGr = this.LJLIL;
        if (c53985LGr != null) {
            LKE lke = LKE.LIZIZ;
            if (lke.LJI(curTabName, bottomTabName) && lke.LIZLLL(bottomTabName)) {
                lke.LIZ.LIZ(new LKD(new WeakReference(c53985LGr.LIZIZ.mo49getActivity()), c53985LGr.LIZ(bottomTabName), c53985LGr.LIZ(curTabName)));
            }
        }
    }
}
