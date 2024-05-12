package X;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ISearchSuggestContextAbility;
import com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcDynamicSingleIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.keyword.SearchEditTextViewModel;
import com.ss.android.ugc.aweme.search.keyword.SugKeywordPresenter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.K9q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51254K9q {
    public final ISearchSuggestContextAbility LIZ;
    public EcDynamicSingleIntermediateFragmentNew LIZIZ;
    public final SugKeywordPresenter LIZJ;
    public final SearchEditTextViewModel LIZLLL;
    public final KAF LJ;

    public final void LIZ() {
        KAF kaf = this.LJ;
        EcDynamicSingleIntermediateFragmentNew ecDynamicSingleIntermediateFragmentNew = this.LIZIZ;
        if (ecDynamicSingleIntermediateFragmentNew == null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (C51345KDd.LIZ <= 0) {
                C51345KDd.LIZ = currentTimeMillis;
            }
            this.LIZ.getFragment().mo49getActivity();
            C51248K9k.LIZLLL();
            EcDynamicSingleIntermediateFragmentNew ecDynamicSingleIntermediateFragmentNew2 = new EcDynamicSingleIntermediateFragmentNew();
            ecDynamicSingleIntermediateFragmentNew2.LJLZ = kaf;
            this.LIZIZ = ecDynamicSingleIntermediateFragmentNew2;
            FragmentManager fragmentManager = this.LIZ.getFragmentManager();
            C1B3 LIZ = C1B6.LIZ(fragmentManager, fragmentManager);
            EcDynamicSingleIntermediateFragmentNew ecDynamicSingleIntermediateFragmentNew3 = this.LIZIZ;
            if (ecDynamicSingleIntermediateFragmentNew3 != null) {
                LIZ.LJIIJ(ecDynamicSingleIntermediateFragmentNew3, "tag_intermediate_ec", R.id.ksg);
                LIZ.LJI();
                return;
            }
            return;
        }
        ecDynamicSingleIntermediateFragmentNew.LJLZ = kaf;
        if (ecDynamicSingleIntermediateFragmentNew.LJLILLLLZI == null) {
            return;
        }
        ecDynamicSingleIntermediateFragmentNew.Ql();
    }

    public C51254K9q(ISearchSuggestContextAbility suggestContextAbility, ActivityC45651qj activityC45651qj) {
        o.LJIIIZ(suggestContextAbility, "suggestContextAbility");
        this.LIZ = suggestContextAbility;
        this.LIZJ = new SugKeywordPresenter(activityC45651qj);
        this.LIZLLL = (SearchEditTextViewModel) ViewModelProviders.of(activityC45651qj).get(SearchEditTextViewModel.class);
        KA7 u9 = suggestContextAbility.u9();
        if (u9 != null) {
            JTO.LIZ(activityC45651qj).jv0(activityC45651qj, u9.LIZ);
        }
        this.LJ = new KAF(this);
    }
}
