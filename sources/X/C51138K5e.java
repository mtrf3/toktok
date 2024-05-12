package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;

/* renamed from: X.K5e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51138K5e implements InterfaceC178696zp {
    public final /* synthetic */ SearchResultFragmentNew LIZ;

    @Override // X.InterfaceC178696zp
    public final int LIZIZ() {
        NextLiveData<Integer> iv0;
        Integer value;
        SearchStartViewModel searchStartViewModel = this.LIZ.LLFZ;
        if (searchStartViewModel == null || (iv0 = searchStartViewModel.iv0()) == null || (value = iv0.getValue()) == null) {
            return -1;
        }
        return value.intValue();
    }

    public C51138K5e(SearchResultFragmentNew searchResultFragmentNew) {
        this.LIZ = searchResultFragmentNew;
    }
}
