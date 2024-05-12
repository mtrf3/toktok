package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.Ju0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50632Ju0 implements KE0 {
    public final LifecycleOwner LIZ;
    public final ActivityC45651qj LIZIZ;
    public final SearchStateViewModel LIZJ;

    @Override // X.KE0
    public final String LIZ() {
        C50469JrN searchVideoModel;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        LifecycleOwner lifecycleOwner = this.LIZ;
        c50651JuJ.getClass();
        C50650JuI LJII = C50651JuJ.LJII(lifecycleOwner);
        if (LJII != null && (searchVideoModel = LJII.getSearchVideoModel()) != null) {
            return searchVideoModel.getGroupId();
        }
        return null;
    }

    @Override // X.KE0
    public final Integer LIZIZ() {
        AbsSearchBaseFragment absSearchBaseFragment;
        C50321Joz c50321Joz;
        LifecycleOwner lifecycleOwner = this.LIZ;
        if (!(lifecycleOwner instanceof AbsSearchBaseFragment) || (absSearchBaseFragment = (AbsSearchBaseFragment) lifecycleOwner) == null || (c50321Joz = absSearchBaseFragment.LJLJJI) == null) {
            return null;
        }
        return Integer.valueOf(c50321Joz.getTabIndex());
    }

    @Override // X.KE0
    public final String LIZLLL() {
        C51110K4c singleSearchEcommerceModel;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        LifecycleOwner lifecycleOwner = this.LIZ;
        c50651JuJ.getClass();
        C50650JuI LJII = C50651JuJ.LJII(lifecycleOwner);
        if (LJII != null && (singleSearchEcommerceModel = LJII.getSingleSearchEcommerceModel()) != null) {
            return singleSearchEcommerceModel.getEnterGroupId();
        }
        return null;
    }

    @Override // X.KE0
    public final String LJ() {
        C50433Jqn searchCommonModel;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        LifecycleOwner lifecycleOwner = this.LIZ;
        c50651JuJ.getClass();
        C50650JuI LJII = C50651JuJ.LJII(lifecycleOwner);
        if (LJII != null && (searchCommonModel = LJII.getSearchCommonModel()) != null) {
            return searchCommonModel.isFromComment();
        }
        return null;
    }

    @Override // X.KE0
    public final String LJFF() {
        AbsSearchBaseFragment absSearchBaseFragment;
        C50321Joz c50321Joz;
        LifecycleOwner lifecycleOwner = this.LIZ;
        if (!(lifecycleOwner instanceof AbsSearchBaseFragment) || (absSearchBaseFragment = (AbsSearchBaseFragment) lifecycleOwner) == null || (c50321Joz = absSearchBaseFragment.LJLJJI) == null) {
            return null;
        }
        return c50321Joz.getSearchId();
    }

    @Override // X.KE0
    public final ECSearchEntranceData LJI() {
        C50948Jz6 LIZIZ = JTO.LIZIZ(this.LIZIZ);
        if (LIZIZ != null) {
            return LIZIZ.getEcSearchEntranceData();
        }
        return null;
    }

    @Override // X.KE0
    public final int LJII() {
        return KB1.LIZ(JTO.LIZIZ(this.LIZIZ));
    }

    @Override // X.KE0
    public final String LJIIIZ() {
        String blankPageEnterMethod;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj activityC45651qj = this.LIZIZ;
        c50651JuJ.getClass();
        C50431Jql LJFF = C50651JuJ.LJFF(activityC45651qj);
        if (LJFF == null || (blankPageEnterMethod = LJFF.getBlankPageEnterMethod()) == null) {
            return "";
        }
        return blankPageEnterMethod;
    }

    @Override // X.KE0
    public final void LJIIJ() {
        SearchStateViewModel searchStateViewModel = this.LIZJ;
        if (searchStateViewModel != null) {
            searchStateViewModel.setIsRefreshingData(false);
        }
    }

    @Override // X.KE0
    public final String LJIIJJI() {
        K5P searchEcommerceModel;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        LifecycleOwner lifecycleOwner = this.LIZ;
        c50651JuJ.getClass();
        C50650JuI LJII = C50651JuJ.LJII(lifecycleOwner);
        if (LJII != null && (searchEcommerceModel = LJII.getSearchEcommerceModel()) != null) {
            return searchEcommerceModel.getClickRecomSearchEntrance();
        }
        return null;
    }

    @Override // X.KE0
    public final Object LJIIL() {
        C50948Jz6 LIZIZ = JTO.LIZIZ(this.LIZIZ);
        if (LIZIZ != null) {
            return LIZIZ.obtainLogData("is_from_video");
        }
        return null;
    }

    @Override // X.KE0
    public final void LJIILIIL() {
        ISearchContextAbility LJJJJJL;
        AbstractC50059Jkl<C50428Jqi> Te;
        C50428Jqi LIZJ;
        ActivityC45651qj activityC45651qj = this.LIZIZ;
        if (activityC45651qj != null && (LJJJJJL = C17N.LJJJJJL(activityC45651qj)) != null && (Te = LJJJJJL.Te()) != null && (LIZJ = Te.LIZJ()) != null) {
            C50651JuJ c50651JuJ = C50652JuK.Companion;
            ActivityC45651qj activityC45651qj2 = this.LIZIZ;
            c50651JuJ.getClass();
            TMC.LJIIJ(C50651JuJ.LJIIJ(activityC45651qj2), LIZJ, "EcDynamicSearchFragment 420");
        }
    }

    @Override // X.KE0
    public final String LJIILJJIL() {
        C50948Jz6 LIZIZ = JTO.LIZIZ(this.LIZIZ);
        if (LIZIZ != null) {
            return LIZIZ.getEnterSearchFrom();
        }
        return null;
    }

    @Override // X.KE0
    public final Integer LJIILL() {
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        LifecycleOwner lifecycleOwner = this.LIZ;
        c50651JuJ.getClass();
        C50431Jql LJFF = C50651JuJ.LJFF(lifecycleOwner);
        if (LJFF != null) {
            return Integer.valueOf(LJFF.getSearchLastShowPageIndex());
        }
        return null;
    }

    @Override // X.KE0
    public final String LJIILLIIL() {
        String blankPageEnterForm;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj activityC45651qj = this.LIZIZ;
        c50651JuJ.getClass();
        C50431Jql LJFF = C50651JuJ.LJFF(activityC45651qj);
        if (LJFF == null || (blankPageEnterForm = LJFF.getBlankPageEnterForm()) == null) {
            return "";
        }
        return blankPageEnterForm;
    }

    @Override // X.KE0
    public final String LJIIZILJ() {
        K5P searchEcommerceModel;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        LifecycleOwner lifecycleOwner = this.LIZ;
        c50651JuJ.getClass();
        C50650JuI LJII = C50651JuJ.LJII(lifecycleOwner);
        if (LJII != null && (searchEcommerceModel = LJII.getSearchEcommerceModel()) != null) {
            return searchEcommerceModel.getSourceProductId();
        }
        return null;
    }

    @Override // X.KE0
    public final String LJIJ() {
        C51110K4c singleSearchEcommerceModel;
        String srcMaterialId;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        LifecycleOwner lifecycleOwner = this.LIZ;
        c50651JuJ.getClass();
        C50650JuI LJII = C50651JuJ.LJII(lifecycleOwner);
        if (LJII == null || (singleSearchEcommerceModel = LJII.getSingleSearchEcommerceModel()) == null || (srcMaterialId = singleSearchEcommerceModel.getSrcMaterialId()) == null) {
            return "";
        }
        return srcMaterialId;
    }

    @Override // X.KE0
    public final Integer LJIJI() {
        C50948Jz6 LIZIZ = JTO.LIZIZ(this.LIZIZ);
        if (LIZIZ != null) {
            return Integer.valueOf(LIZIZ.getEcSearchEntranceValue());
        }
        return null;
    }

    @Override // X.KE0
    public final String LJIJJ() {
        C51110K4c singleSearchEcommerceModel;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        LifecycleOwner lifecycleOwner = this.LIZ;
        c50651JuJ.getClass();
        C50650JuI LJII = C50651JuJ.LJII(lifecycleOwner);
        if (LJII != null && (singleSearchEcommerceModel = LJII.getSingleSearchEcommerceModel()) != null) {
            return singleSearchEcommerceModel.getProductPanelType();
        }
        return null;
    }

    @Override // X.KE0
    public final String getGroupId() {
        C50948Jz6 LIZIZ = JTO.LIZIZ(this.LIZIZ);
        if (LIZIZ != null) {
            return LIZIZ.getGroupId();
        }
        return null;
    }

    @Override // X.KE0
    public final void LJIIIIZZ(GlobalDoodleConfig globalDoodleConfig) {
        AbsSearchBaseFragment absSearchBaseFragment;
        C50321Joz c50321Joz;
        LifecycleOwner lifecycleOwner = this.LIZ;
        if ((lifecycleOwner instanceof AbsSearchBaseFragment) && (absSearchBaseFragment = (AbsSearchBaseFragment) lifecycleOwner) != null && (c50321Joz = absSearchBaseFragment.LJLJJI) != null) {
            c50321Joz.setFeedbackSurvey(globalDoodleConfig.getFeedbackSurvey());
        }
        C17N.LJJJJJL(this.LIZ).j4(new C50324Jp2(globalDoodleConfig.getFeedbackSurvey(), 2));
    }

    public C50632Ju0(ActivityC45651qj activityC45651qj, LifecycleOwner lifecycleOwner) {
        SearchStateViewModel searchStateViewModel;
        ViewModelProvider of;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = lifecycleOwner;
        this.LIZIZ = activityC45651qj;
        if (activityC45651qj != null && (of = ViewModelProviders.of(activityC45651qj)) != null) {
            searchStateViewModel = (SearchStateViewModel) of.get(SearchStateViewModel.class);
        } else {
            searchStateViewModel = null;
        }
        this.LIZJ = searchStateViewModel;
    }

    @Override // X.KE0
    public final void LIZJ(SearchResultParam searchResultParam, String str) {
        AbsSearchBaseFragment absSearchBaseFragment;
        C50321Joz c50321Joz;
        o.LJIIIZ(searchResultParam, "searchResultParam");
        LifecycleOwner lifecycleOwner = this.LIZ;
        if (lifecycleOwner instanceof AbsSearchBaseFragment) {
            absSearchBaseFragment = (AbsSearchBaseFragment) lifecycleOwner;
        } else {
            absSearchBaseFragment = null;
        }
        if (absSearchBaseFragment != null && (c50321Joz = absSearchBaseFragment.LJLJJI) != null) {
            c50321Joz.setSearchId(str);
            String keyword = searchResultParam.getKeyword();
            o.LJIIIIZZ(keyword, "searchResultParam.keyword");
            c50321Joz.setSearchKeyword(keyword);
        }
        ISearchContextAbility LJJJJJL = C17N.LJJJJJL(this.LIZ);
        String keyword2 = searchResultParam.getKeyword();
        o.LJIIIIZZ(keyword2, "searchResultParam.keyword");
        LJJJJJL.j4(new C50323Jp1(keyword2, str));
    }
}
