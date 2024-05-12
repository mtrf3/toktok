package com.ss.android.ugc.aweme.recommendationcard.view;

import X.AbstractC51590KMo;
import X.ActivityC45651qj;
import X.C221108m2;
import X.C47044IdE;
import X.C62822Ol8;
import X.C79853Bl;
import X.C80043Ce;
import X.C80053Cf;
import X.C84193Sd;
import X.IWH;
import X.InterfaceC36571c5;
import X.InterfaceC88472Yns;
import X.KNP;
import X.LNI;
import X.V1M;
import X.XKX;
import X.XLL;
import Y.IDeS153S0200000_15;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.services.BaseUserService;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class EffectRecommendationBaseViewModel<T, S> extends ViewModel {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C47044IdE.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(KNP.LJLIL);
    public ScrollSwitchStateManager LJLJI;
    public final XLL LJLJJI;
    public final MutableLiveData<S> LJLJJL;
    public final MutableLiveData LJLJJLL;

    public abstract void iv0(T t);

    public final IWH hv0() {
        return (IWH) this.LJLIL.getValue();
    }

    public EffectRecommendationBaseViewModel() {
        XLL LIZ = C79853Bl.LIZ(0, 0, null, 7);
        this.LJLJJI = LIZ;
        MutableLiveData<S> mutableLiveData = new MutableLiveData<>();
        this.LJLJJL = mutableLiveData;
        this.LJLJJLL = mutableLiveData;
        V1M.LJJIJIIJIL(new IDeS153S0200000_15(LIZ, new C80053Cf(this, null), 0), ViewModelKt.getViewModelScope(this));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        hv0().release();
    }

    public final void gv0(AbstractC51590KMo abstractC51590KMo) {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C80043Ce(this, abstractC51590KMo, null), 3);
    }

    public final void jv0(ActivityC45651qj activityC45651qj, Aweme aweme, InterfaceC88472Yns<? super Boolean, Boolean> isPagingEnabled) {
        InterfaceC36571c5 interfaceC36571c5;
        LNI lni;
        o.LJIIIZ(isPagingEnabled, "isPagingEnabled");
        if (activityC45651qj != null) {
            this.LJLJI = C84193Sd.LIZ(activityC45651qj);
        }
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin.isLogin()) {
            ScrollSwitchStateManager scrollSwitchStateManager = this.LJLJI;
            if (scrollSwitchStateManager != null) {
                interfaceC36571c5 = scrollSwitchStateManager.jv0(scrollSwitchStateManager.nv0("page_profile"));
            } else {
                interfaceC36571c5 = null;
            }
            if ((interfaceC36571c5 instanceof LNI) && (lni = (LNI) interfaceC36571c5) != null) {
                lni.LJJLIIIJ(null);
            }
        }
        ScrollSwitchStateManager scrollSwitchStateManager2 = this.LJLJI;
        if (scrollSwitchStateManager2 != null) {
            scrollSwitchStateManager2.tv0(isPagingEnabled.invoke(Boolean.valueOf(createIUserServicebyMonsterPlugin.isLogin())).booleanValue());
        }
    }
}
