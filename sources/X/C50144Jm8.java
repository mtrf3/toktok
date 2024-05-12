package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment;

/* renamed from: X.Jm8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50144Jm8 implements InterfaceC50133Jlx {
    public final /* synthetic */ DynamicSearchFragment LIZ;

    public C50144Jm8(DynamicSearchFragment dynamicSearchFragment) {
        this.LIZ = dynamicSearchFragment;
    }

    @Override // X.InterfaceC50133Jlx
    public final void LIZ(C50287JoR c50287JoR) {
        NextLiveData<Boolean> jv0;
        this.LIZ.nm(1, c50287JoR);
        SearchStartViewModel searchStartViewModel = this.LIZ.LLIIII;
        if (searchStartViewModel == null || (jv0 = searchStartViewModel.jv0()) == null) {
            return;
        }
        jv0.setValue(Boolean.valueOf(!c50287JoR.isDefaultOption()));
    }

    @Override // X.InterfaceC50133Jlx
    public final void LIZIZ(C50287JoR c50287JoR) {
        DynamicSearchFragment dynamicSearchFragment = this.LIZ;
        dynamicSearchFragment.getClass();
        dynamicSearchFragment.LJLZ = "tab_search";
        this.LIZ.LJLJI = c50287JoR;
    }
}
