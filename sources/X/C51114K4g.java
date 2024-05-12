package X;

import com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.pages.sug.core.viewmodel.SearchSugMobHelper;
import kotlin.jvm.internal.o;

/* renamed from: X.K4g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51114K4g implements InterfaceC51122K4o {
    public final /* synthetic */ AbstractSearchIntermediateFragmentNew LJLIL;

    public C51114K4g(AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew) {
        this.LJLIL = abstractSearchIntermediateFragmentNew;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        String t = str;
        o.LJIIIZ(t, "t");
        SearchSugMobHelper searchSugMobHelper = this.LJLIL.LJLLI;
        if (searchSugMobHelper == null) {
            return;
        }
        searchSugMobHelper.LJLILLLLZI = t;
    }
}
