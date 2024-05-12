package com.ss.android.ugc.aweme.ecommerce.search.result.vertical;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C186627Uc;
import X.C29S;
import X.C2L4;
import X.C3C5;
import X.C50431Jql;
import X.C50469JrN;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50948Jz6;
import X.C51110K4c;
import X.C51218K8g;
import X.C51233K8v;
import X.C51307KBr;
import X.C51363KDv;
import X.C55096Ljo;
import X.C55230Lly;
import X.C76800UCe;
import X.C76965UIn;
import X.C8VV;
import X.C8ZK;
import X.C90903hW;
import X.EF7;
import X.InterfaceC57784Mm4;
import X.K5P;
import X.K8T;
import X.K9A;
import X.K9C;
import X.KAJ;
import X.KAK;
import X.KBA;
import X.KE3;
import X.KE4;
import X.KFW;
import X.KGP;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity;
import com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.result.pagermodel.VerticalPagerData;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultActivity;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchStartViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EcSearchPagerItem extends AmeBaseFragment implements C8ZK, ISearchVerticalContext, C2L4 {
    public KAK LJLIL;
    public int LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // X.C8ZK
    public final void Od() {
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final SearchResultParam k5() {
        SearchResultParam searchResultParam = null;
        ISearchResultSubPageAbility iSearchResultSubPageAbility = (ISearchResultSubPageAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), ISearchResultSubPageAbility.class, null);
        if (iSearchResultSubPageAbility != null && (searchResultParam = iSearchResultSubPageAbility.k5()) != null && searchResultParam.getEcomTargetTab() != null && searchResultParam.getEcomTargetTab() != this.LJLIL) {
            SearchResultParam copy = searchResultParam.copy();
            o.LJIIIIZZ(copy, "searchResultParam.copy()");
            copy.setEnterMethod("switch_tab");
            return copy;
        }
        return searchResultParam;
    }

    public final void vl() {
        ISearchResultSubPageAbility iSearchResultSubPageAbility;
        VerticalSearchAbility verticalSearchAbility = (VerticalSearchAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), VerticalSearchAbility.class, null);
        if (verticalSearchAbility != null) {
            verticalSearchAbility.refreshData();
        }
        KAK kak = this.LJLIL;
        if (kak != null && (iSearchResultSubPageAbility = (ISearchResultSubPageAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), ISearchResultSubPageAbility.class, null)) != null) {
            iSearchResultSubPageAbility.Pd0(kak);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final C51363KDv g8() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        KBA kba;
        String str6;
        String str7;
        String str8;
        C51110K4c singleSearchEcommerceModel;
        C51110K4c singleSearchEcommerceModel2;
        C50650JuI immutableData;
        K5P searchEcommerceModel;
        C50650JuI immutableData2;
        K5P searchEcommerceModel2;
        C50650JuI immutableData3;
        K5P searchEcommerceModel3;
        C50650JuI immutableData4;
        C51110K4c singleSearchEcommerceModel3;
        String str9 = C17N.LJJJJJL(this).cs().LIZJ().LJLJJLL;
        String str10 = C17N.LJJJJJL(this).cs().LIZJ().LJLJL;
        C50652JuK.Companion.getClass();
        C50652JuK LJIIJ = C50651JuJ.LJIIJ(this);
        String str11 = null;
        if (LJIIJ != null && (immutableData4 = LJIIJ.getImmutableData()) != null && (singleSearchEcommerceModel3 = immutableData4.getSingleSearchEcommerceModel()) != null) {
            str = singleSearchEcommerceModel3.getSrcMaterialId();
        } else {
            str = null;
        }
        C50652JuK LJIIJ2 = C50651JuJ.LJIIJ(this);
        if (LJIIJ2 != null && (immutableData3 = LJIIJ2.getImmutableData()) != null && (searchEcommerceModel3 = immutableData3.getSearchEcommerceModel()) != null) {
            str2 = searchEcommerceModel3.getSourceProductId();
        } else {
            str2 = null;
        }
        C50652JuK LJIIJ3 = C50651JuJ.LJIIJ(this);
        if (LJIIJ3 != null && (immutableData2 = LJIIJ3.getImmutableData()) != null && (searchEcommerceModel2 = immutableData2.getSearchEcommerceModel()) != null) {
            str3 = searchEcommerceModel2.getClickRecomSearchEntrance();
        } else {
            str3 = null;
        }
        C50431Jql LJFF = C50651JuJ.LJFF(mo49getActivity());
        if (LJFF != null) {
            str4 = LJFF.getBlankPageEnterForm();
        } else {
            str4 = null;
        }
        C50431Jql LJFF2 = C50651JuJ.LJFF(mo49getActivity());
        if (LJFF2 != null) {
            str5 = LJFF2.getBlankPageEnterMethod();
        } else {
            str5 = null;
        }
        C50652JuK LJIIJ4 = C50651JuJ.LJIIJ(this);
        if (LJIIJ4 != null && (immutableData = LJIIJ4.getImmutableData()) != null && (searchEcommerceModel = immutableData.getSearchEcommerceModel()) != null) {
            kba = searchEcommerceModel.getDeepLinkEcParams();
        } else {
            kba = null;
        }
        if ((mo49getActivity() instanceof EcSearchActivity) || (mo49getActivity() instanceof EcSearchResultActivity)) {
            str6 = "simple";
        } else {
            str6 = "normal";
        }
        KAK kak = this.LJLIL;
        if (kak != null) {
            str7 = kak.getTabName();
        } else {
            str7 = null;
        }
        Integer valueOf = Integer.valueOf(this.LJLILLLLZI);
        C50650JuI LJII = C50651JuJ.LJII(this);
        if (LJII != null && (singleSearchEcommerceModel2 = LJII.getSingleSearchEcommerceModel()) != null) {
            str8 = singleSearchEcommerceModel2.getEnterGroupId();
        } else {
            str8 = null;
        }
        C50650JuI LJII2 = C50651JuJ.LJII(this);
        if (LJII2 != null && (singleSearchEcommerceModel = LJII2.getSingleSearchEcommerceModel()) != null) {
            str11 = singleSearchEcommerceModel.getProductPanelType();
        }
        return new C51363KDv(str9, str10, str, str2, str3, str4, str5, kba, str6, str7, valueOf, str8, str11, C51233K8v.LIZ().LIZIZ());
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(SearchVerticalScope.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final KE3 H2() {
        String str;
        String str2;
        String str3;
        C50469JrN searchVideoModel;
        C50469JrN searchVideoModel2;
        KAK Gi0;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && ((EcSearchStartViewModel) ViewModelProviders.of(mo49getActivity).get(EcSearchStartViewModel.class)).LJLJI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        String str4 = null;
        ISearchResultSubPageAbility iSearchResultSubPageAbility = (ISearchResultSubPageAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), ISearchResultSubPageAbility.class, null);
        if (iSearchResultSubPageAbility != null && (Gi0 = iSearchResultSubPageAbility.Gi0()) != null) {
            str2 = Gi0.getTabName();
        } else {
            str2 = null;
        }
        String str5 = C51307KBr.LIZ;
        C50652JuK.Companion.getClass();
        C50650JuI LJII = C50651JuJ.LJII(this);
        if (LJII != null && (searchVideoModel2 = LJII.getSearchVideoModel()) != null) {
            str3 = searchVideoModel2.getGroupId();
        } else {
            str3 = null;
        }
        C50650JuI LJII2 = C50651JuJ.LJII(this);
        if (LJII2 != null && (searchVideoModel = LJII2.getSearchVideoModel()) != null) {
            str4 = searchVideoModel.getGroupId();
        }
        return new KE3(str2, str5, str, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C55096Ljo.LJIILL(C55230Lly.LIZJ(this, null), ISearchVerticalContext.class, null);
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final int getCurrentIndex() {
        return this.LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final void aQ(KFW kfw) {
        ((KGP) _$_findCachedViewById(R.id.jfq)).LJLJJLL = kfw;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        VerticalPagerData verticalPagerData;
        int i;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        KAK kak = null;
        if (arguments != null) {
            verticalPagerData = (VerticalPagerData) arguments.getParcelable("power_viewpager_default_key");
            if (verticalPagerData != null) {
                kak = verticalPagerData.pageName;
            }
        } else {
            verticalPagerData = null;
        }
        this.LJLIL = kak;
        if (verticalPagerData != null) {
            i = verticalPagerData.pageIndex;
        } else {
            i = 0;
        }
        this.LJLILLLLZI = i;
    }

    @Override // X.C8ZK
    public final void onPageSelected(int i) {
        ISearchResultSubPageAbility iSearchResultSubPageAbility;
        K9C LIZ = K8T.LIZ(C55230Lly.LIZJ(this, null));
        if (LIZ != null) {
            LIZ.LJLJI = this.LJLIL;
        }
        ISearchResultSubPageAbility iSearchResultSubPageAbility2 = (ISearchResultSubPageAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), ISearchResultSubPageAbility.class, null);
        if (iSearchResultSubPageAbility2 != null && !iSearchResultSubPageAbility2.Gg(this.LJLIL)) {
            ISearchResultSubPageAbility iSearchResultSubPageAbility3 = (ISearchResultSubPageAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), ISearchResultSubPageAbility.class, null);
            if (iSearchResultSubPageAbility3 != null) {
                iSearchResultSubPageAbility3.dr0(this.LJLIL);
            }
            VerticalSearchAbility verticalSearchAbility = (VerticalSearchAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), VerticalSearchAbility.class, null);
            if (verticalSearchAbility != null) {
                verticalSearchAbility.refreshData();
            }
        }
        KAK kak = this.LJLIL;
        if (kak != null && (iSearchResultSubPageAbility = (ISearchResultSubPageAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), ISearchResultSubPageAbility.class, null)) != null) {
            iSearchResultSubPageAbility.Pd0(kak);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), this, ISearchVerticalContext.class, null);
        if (o.LJ(EF7.LJIILIIL, "local_test")) {
            _$_findCachedViewById(R.id.c4_).setVisibility(0);
        }
        KAK kak = this.LJLIL;
        if (kak != null) {
            int i = KE4.LIZ[kak.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C8VV.LIZ(this, false, new AqS174S0100000_8(this, 22));
                        }
                    } else {
                        C8VV.LIZ(this, false, new AqS174S0100000_8(this, 21));
                    }
                } else {
                    C8VV.LIZ(this, false, new AqS174S0100000_8(this, 20));
                }
            } else {
                C8VV.LIZ(this, false, new AqS174S0100000_8(this, 19));
            }
        }
        C8VV.LIZ(this, false, new AqS174S0100000_8(this, 23));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final void Bf(String str, SearchApiResult apiResult, KAK searchTab) {
        String str2;
        String str3;
        String str4;
        Long l;
        String imprId;
        o.LJIIIZ(apiResult, "apiResult");
        o.LJIIIZ(searchTab, "searchTab");
        C51218K8g LIZ = C51233K8v.LIZ();
        LogPbBean logPbBean = apiResult.logPb;
        if (logPbBean != null) {
            str2 = logPbBean.getImprId();
        } else {
            str2 = null;
        }
        String str5 = "";
        if (str2 == null) {
            str2 = "";
        }
        GlobalDoodleConfig globalDoodleConfig = apiResult.globalDoodleConfig;
        if (globalDoodleConfig != null) {
            str3 = globalDoodleConfig.getSearchChannel();
        } else {
            str3 = null;
        }
        GlobalDoodleConfig globalDoodleConfig2 = apiResult.globalDoodleConfig;
        if (globalDoodleConfig2 != null) {
            str4 = globalDoodleConfig2.getNewSource();
        } else {
            str4 = null;
        }
        BaseResponse.ServerTimeExtra serverTimeExtra = apiResult.extra;
        if (serverTimeExtra != null) {
            l = Long.valueOf(serverTimeExtra.now);
        } else {
            l = null;
        }
        LIZ.LIZJ(new LastSearch(str, str2, str3, str4, l));
        K9C LIZ2 = K8T.LIZ(C55230Lly.LIZJ(this, null));
        if (LIZ2 != null) {
            KAJ kaj = KAJ.SHOP;
            if (searchTab == KAK.ECOM_LIVE) {
                kaj = KAJ.ECOM_LIVE;
            } else if (searchTab == KAK.STORE) {
                kaj = KAJ.STORE;
            }
            LogPbBean logPbBean2 = apiResult.logPb;
            if (logPbBean2 != null && (imprId = logPbBean2.getImprId()) != null) {
                str5 = imprId;
            }
            LIZ2.LIZIZ(new K9A(kaj, str5));
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        C50948Jz6 Wa0;
        ECSearchEntranceData ecSearchEntranceData;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater.cloneInContext(getContext()), R.layout.ape, viewGroup, false);
        C29S c29s = null;
        ISearchResultSubPageContextAbility iSearchResultSubPageContextAbility = (ISearchResultSubPageContextAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), ISearchResultSubPageContextAbility.class, null);
        if (iSearchResultSubPageContextAbility != null && (Wa0 = iSearchResultSubPageContextAbility.Wa0()) != null && (ecSearchEntranceData = Wa0.getEcSearchEntranceData()) != null) {
            str = ecSearchEntranceData.getResultBgUrl();
        } else {
            str = null;
        }
        if (str != null) {
            LLLLIILL.setBackgroundColor(0);
        }
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    @Override // X.C8ZK
    public final void u7(InterfaceC57784Mm4 interfaceC57784Mm4, Lifecycle.State state, List<? extends Object> list) {
        C186627Uc.LIZ(interfaceC57784Mm4, state, list);
    }
}
