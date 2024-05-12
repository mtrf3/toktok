package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.ui.DynamicSearchLiveFragment;

/* renamed from: X.Jjm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49998Jjm implements InterfaceC50046JkY {
    public final /* synthetic */ DynamicSearchLiveFragment LIZ;

    public C49998Jjm(DynamicSearchLiveFragment dynamicSearchLiveFragment) {
        this.LIZ = dynamicSearchLiveFragment;
    }

    @Override // X.InterfaceC50046JkY
    public final /* synthetic */ void LIZ() {
    }

    @Override // X.InterfaceC50046JkY
    public final /* synthetic */ void LIZJ() {
    }

    @Override // X.InterfaceC50046JkY
    public final void LIZIZ(boolean z) {
        SearchStartViewModel searchStartViewModel;
        NextLiveData<Integer> iv0;
        if (z && (searchStartViewModel = this.LIZ.LLIIII) != null && (iv0 = searchStartViewModel.iv0()) != null) {
            Integer value = iv0.getValue();
            int LJ = C50605JtZ.LJ();
            if (value != null && value.intValue() == LJ) {
                this.LIZ.LLIZLLLIL = true;
                JLU.LIZIZ();
                return;
            }
        }
        this.LIZ.LLIZLLLIL = false;
        JLU.LIZ();
    }
}
