package com.ss.android.ugc.aweme.ecommerce.search.result.vertical;

import X.AbstractC50059Jkl;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C29S;
import X.C2L4;
import X.C2U8;
import X.C3A5;
import X.C3C5;
import X.C48054ItW;
import X.C48658J7u;
import X.C49814Jgo;
import X.C50145Jm9;
import X.C50160JmO;
import X.C50287JoR;
import X.C50321Joz;
import X.C50323Jp1;
import X.C50324Jp2;
import X.C50407JqN;
import X.C50428Jqi;
import X.C50431Jql;
import X.C50469JrN;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50675Juh;
import X.C50948Jz6;
import X.C51110K4c;
import X.C51363KDv;
import X.C51379KEl;
import X.C55096Ljo;
import X.C55230Lly;
import X.C65232Piu;
import X.C65300Pk0;
import X.C76800UCe;
import X.C76965UIn;
import X.C8VV;
import X.C90903hW;
import X.EF7;
import X.IGH;
import X.InterfaceC49816Jgq;
import X.InterfaceC50157JmL;
import X.InterfaceC51365KDx;
import X.K0M;
import X.K1X;
import X.K5P;
import X.KAK;
import X.KBA;
import X.KE3;
import X.KE6;
import X.KEA;
import X.KEP;
import X.KET;
import X.KEW;
import X.KEX;
import X.KEZ;
import X.KFW;
import X.TMC;
import X.WM7;
import X.Z9N;
import Y.AObserverS76S0100000_8;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.discover.model.FeedbackContents;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class GeneralSearchAdapter extends EcSearchBaseFragment implements ISearchVerticalContext, C2L4 {
    public boolean LLFZ;
    public SearchStateViewModel LLI;
    public final boolean LLIFFJFJJ;
    public final Map<Integer, View> LLII = new LinkedHashMap();
    public boolean LLFII = true;

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLII).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final void aQ(KFW kfw) {
    }

    public GeneralSearchAdapter() {
        int i;
        KEA LIZIZ;
        KEP kep = this.LJLLI;
        if (kep != null && (LIZIZ = kep.LIZIZ()) != null) {
            i = LIZIZ.LJIIIIZZ(KAK.SHOP);
        } else {
            i = 0;
        }
        this.LJLLLLLL = i;
        this.LLIFFJFJJ = true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final KE3 H2() {
        int i;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        C50469JrN searchVideoModel;
        C50469JrN searchVideoModel2;
        InterfaceC51365KDx LIZ;
        InterfaceC51365KDx LIZ2;
        KEA LIZIZ;
        KEA LIZIZ2;
        ISearchContextAbility LJJJJJL;
        AbstractC50059Jkl<C50428Jqi> Te;
        C50428Jqi LIZJ;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c50651JuJ.getClass();
        C50431Jql LJFF = C50651JuJ.LJFF(mo49getActivity);
        if (LJFF != null) {
            i = LJFF.getLastShowingPageIndex();
        } else {
            i = -1;
        }
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null && (LJJJJJL = C17N.LJJJJJL(mo49getActivity2)) != null && (Te = LJJJJJL.Te()) != null && (LIZJ = Te.LIZJ()) != null) {
            TMC.LJIIJ(C50651JuJ.LJIIJ(mo49getActivity()), LIZJ, "EcDynamicSearchFragment 420");
        }
        KEP kep = this.LJLLI;
        if (kep != null && (LIZIZ2 = kep.LIZIZ()) != null && i == LIZIZ2.LJII()) {
            z = true;
        } else {
            z = false;
        }
        String str5 = null;
        if (!z && i != this.LJZL) {
            KEP kep2 = this.LJLLI;
            if (kep2 != null && (LIZIZ = kep2.LIZIZ()) != null) {
                str = LIZIZ.LJ(i);
            } else {
                str = null;
            }
            if (o.LJ(str, "general_search")) {
                str = "general";
            }
        } else {
            str = null;
        }
        KEP kep3 = this.LJLLI;
        if (kep3 != null && (LIZ2 = kep3.LIZ()) != null) {
            str2 = LIZ2.LIZ();
        } else {
            str2 = null;
        }
        KEP kep4 = this.LJLLI;
        if (kep4 == null || (LIZ = kep4.LIZ()) == null || (str3 = LIZ.LJFF()) == null) {
            str3 = "";
        }
        C50650JuI LJII = C50651JuJ.LJII(this);
        if (LJII != null && (searchVideoModel2 = LJII.getSearchVideoModel()) != null) {
            str4 = searchVideoModel2.getGroupId();
        } else {
            str4 = null;
        }
        C50650JuI LJII2 = C50651JuJ.LJII(this);
        if (LJII2 != null && (searchVideoModel = LJII2.getSearchVideoModel()) != null) {
            str5 = searchVideoModel.getGroupId();
        }
        return new KE3(str, str2, str3, str4, str5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008b, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0091, code lost:
    
        if (r1.length() != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
    
        r1 = "normal_search";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00aa, code lost:
    
        if (r2.equals("search_sug") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b3, code lost:
    
        if (r2.equals("related_search_keyword") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bc, code lost:
    
        if (r2.equals("recom_search") == false) goto L37;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x007a. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Ol() {
        /*
            r4 = this;
            X.KEP r0 = r4.LJLLI
            r1 = 0
            if (r0 == 0) goto Lf
            X.KDx r0 = r0.LIZ()
            if (r0 == 0) goto Lf
            X.Jz6 r1 = r0.ha()
        Lf:
            int r0 = X.KB1.LIZ(r1)
            boolean r3 = X.KB1.LJII(r0)
            X.KEP r0 = r4.LJLLI
            r2 = 1
            if (r0 == 0) goto L39
            X.KDx r1 = r0.LIZ()
            if (r1 == 0) goto L39
            X.KE6 r0 = X.KE6.FROM_CLICK_MORE
            boolean r0 = r1.LJII(r0)
            if (r0 != r2) goto L39
            java.lang.String r1 = "click_more_general_list"
        L2c:
            java.lang.String r2 = r4.LJLZ
            java.lang.String r0 = "tab_search"
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 == 0) goto L38
            java.lang.String r1 = r4.LJLZ
        L38:
            return r1
        L39:
            X.KEP r0 = r4.LJLLI
            if (r0 == 0) goto L4e
            X.KDx r1 = r0.LIZ()
            if (r1 == 0) goto L4e
            X.KE6 r0 = X.KE6.SEARCH_SWIPE_MORE
            boolean r0 = r1.LJII(r0)
            if (r0 != r2) goto L4e
            java.lang.String r1 = "swipe_more_general_list"
            goto L2c
        L4e:
            X.JuJ r1 = X.C50652JuK.Companion
            X.1qj r0 = r4.mo49getActivity()
            r1.getClass()
            X.Jql r0 = X.C50651JuJ.LJFF(r0)
            if (r0 == 0) goto Lbf
            int r1 = r0.getSearchLastShowPageIndex()
            r0 = -1
            if (r1 != r0) goto Lbf
        L64:
            com.ss.android.ugc.aweme.search.model.SearchResultParam r0 = r4.LJLLJ
            if (r0 == 0) goto L74
            java.lang.String r0 = r0.getEnterMethod()
            if (r0 == 0) goto L74
            int r0 = r0.length()
            if (r0 != 0) goto Ld2
        L74:
            java.lang.String r2 = r4.LJLZ
            int r0 = r2.hashCode()
            switch(r0) {
                case -1816950631: goto Lb6;
                case -1191929626: goto Lad;
                case -710131922: goto La4;
                case 3452698: goto L99;
                default: goto L7d;
            }
        L7d:
            if (r3 == 0) goto L96
            java.lang.String r0 = r4.LJLZ
            if (r0 == 0) goto L89
            int r0 = r0.length()
            if (r0 != 0) goto L96
        L89:
            java.lang.String r1 = r4.LJZ
        L8b:
            if (r1 == 0) goto L93
        L8d:
            int r0 = r1.length()
            if (r0 != 0) goto L2c
        L93:
            java.lang.String r1 = "normal_search"
            goto L2c
        L96:
            java.lang.String r1 = r4.LJLZ
            goto L8b
        L99:
            java.lang.String r0 = "push"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7d
            java.lang.String r1 = r4.LJZ
            goto L8b
        La4:
            java.lang.String r1 = "search_sug"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L8d
            goto L7d
        Lad:
            java.lang.String r1 = "related_search_keyword"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L8d
            goto L7d
        Lb6:
            java.lang.String r1 = "recom_search"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L8d
            goto L7d
        Lbf:
            X.1qj r0 = r4.mo49getActivity()
            X.Jql r0 = X.C50651JuJ.LJFF(r0)
            if (r0 == 0) goto Le0
            int r1 = r0.getSearchLastShowPageIndex()
            int r0 = r4.LJZL
            if (r1 != r0) goto Le0
            goto L64
        Ld2:
            com.ss.android.ugc.aweme.search.model.SearchResultParam r0 = r4.LJLLJ
            if (r0 == 0) goto Ldc
            java.lang.String r1 = r0.getEnterMethod()
            if (r1 != 0) goto L2c
        Ldc:
            java.lang.String r1 = ""
            goto L2c
        Le0:
            java.lang.String r1 = "switch_tab"
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.GeneralSearchAdapter.Ol():java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final C51363KDv g8() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C50650JuI immutableData;
        K5P searchEcommerceModel;
        C50650JuI immutableData2;
        K5P searchEcommerceModel2;
        C50650JuI immutableData3;
        K5P searchEcommerceModel3;
        C50650JuI immutableData4;
        C51110K4c singleSearchEcommerceModel;
        String str6 = C17N.LJJJJJL(this).cs().LIZJ().LJLJJLL;
        String str7 = C17N.LJJJJJL(this).cs().LIZJ().LJLJL;
        C50652JuK.Companion.getClass();
        C50652JuK LJIIJ = C50651JuJ.LJIIJ(this);
        KBA kba = null;
        if (LJIIJ != null && (immutableData4 = LJIIJ.getImmutableData()) != null && (singleSearchEcommerceModel = immutableData4.getSingleSearchEcommerceModel()) != null) {
            str = singleSearchEcommerceModel.getSrcMaterialId();
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
        }
        return new C51363KDv(str6, str7, str, str2, str3, str4, str5, kba, "normal", KAK.SHOP.getTabName(), Z9N.LIZIZ.LLJZ(), 7168);
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(SearchVerticalScope.class);
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C55096Ljo.LJIILL(C55230Lly.LIZJ(this, null), ISearchVerticalContext.class, null);
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        VerticalSearchAbility verticalSearchAbility = (VerticalSearchAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), VerticalSearchAbility.class, null);
        if (verticalSearchAbility != null) {
            verticalSearchAbility.tt(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        VerticalSearchAbility verticalSearchAbility;
        View view;
        View view2;
        if (C48054ItW.LIZ() && (view = getView()) != null && view.isLayoutRequested() && (view2 = getView()) != null) {
            view2.requestLayout();
        }
        super.onResume();
        if (getUserVisibleHint() && (verticalSearchAbility = (VerticalSearchAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), VerticalSearchAbility.class, null)) != null) {
            verticalSearchAbility.tt(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final int getCurrentIndex() {
        return this.LJZL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final SearchResultParam k5() {
        return this.LJLLILLLL;
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final boolean wl() {
        return this.LLIFFJFJJ;
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void Gl(SearchResultParam searchResultParam) {
        String str;
        String str2;
        KEP kep;
        InterfaceC51365KDx LIZ;
        String str3;
        o.LJIIIZ(searchResultParam, "searchResultParam");
        super.Gl(searchResultParam);
        this.LLFII = true;
        String str4 = "";
        if (C51379KEl.LIZ()) {
            if (!isViewValid() || (searchResultParam.getForceIndex() != -1 && searchResultParam.getForceIndex() != this.LJZL)) {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    arguments.putSerializable("search_key", searchResultParam);
                }
                JSONObject LIZJ = C65232Piu.LIZJ(WM7.SCENE_SERVICE, "setSearchKeyword_1");
                C50948Jz6 searchEnterParam = searchResultParam.getSearchEnterParam();
                if (searchEnterParam == null || (str3 = searchEnterParam.getEnterSearchFrom()) == null) {
                    str3 = "";
                }
                LIZJ.put("enter_from", str3);
                String enterMethod = searchResultParam.getEnterMethod();
                if (enterMethod != null) {
                    str4 = enterMethod;
                }
                LIZJ.put("enter_method", str4);
                LIZJ.put("tab_name", "shop");
                C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZJ);
                return;
            }
        } else if (!isViewValid()) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arguments2.putSerializable("search_key", searchResultParam);
            }
            JSONObject LIZJ2 = C65232Piu.LIZJ(WM7.SCENE_SERVICE, "setSearchKeyword_2");
            C50948Jz6 searchEnterParam2 = searchResultParam.getSearchEnterParam();
            if (searchEnterParam2 == null || (str = searchEnterParam2.getEnterSearchFrom()) == null) {
                str = "";
            }
            LIZJ2.put("enter_from", str);
            String enterMethod2 = searchResultParam.getEnterMethod();
            if (enterMethod2 != null) {
                str4 = enterMethod2;
            }
            LIZJ2.put("enter_method", str4);
            LIZJ2.put("tab_name", "shop");
            C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZJ2);
            return;
        }
        Nl(searchResultParam);
        Context context = getContext();
        if (context != null && (kep = this.LJLLI) != null && (LIZ = kep.LIZ()) != null) {
            LIZ.LJIIJ(context, searchResultParam);
        }
        JSONObject LIZJ3 = C65232Piu.LIZJ(WM7.SCENE_SERVICE, "setSearchKeyword_3");
        C50948Jz6 searchEnterParam3 = searchResultParam.getSearchEnterParam();
        if (searchEnterParam3 == null || (str2 = searchEnterParam3.getEnterSearchFrom()) == null) {
            str2 = "";
        }
        LIZJ3.put("enter_from", str2);
        String enterMethod3 = searchResultParam.getEnterMethod();
        if (enterMethod3 != null) {
            str4 = enterMethod3;
        }
        LIZJ3.put("enter_method", str4);
        LIZJ3.put("tab_name", "shop");
        C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZJ3);
        Pl(false);
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment
    public final void Ll(boolean z) {
        VerticalSearchAbility verticalSearchAbility;
        super.Ll(z);
        if (!z && (verticalSearchAbility = (VerticalSearchAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), VerticalSearchAbility.class, null)) != null) {
            verticalSearchAbility.tt(false);
        }
    }

    public final void Nl(SearchResultParam searchResultParam) {
        boolean z;
        String str;
        this.LJLLILLLL = searchResultParam;
        String keyword = searchResultParam.getKeyword();
        o.LJIIIIZZ(keyword, "param.keyword");
        ((InterfaceC49816Jgq) this.LJLLLL.getValue()).LIZ(new C49814Jgo(keyword, 2));
        String sugHint = searchResultParam.getSugHint();
        if (sugHint == null) {
            sugHint = "";
        }
        this.LJLLL = sugHint;
        String searchFrom = searchResultParam.getSearchFrom();
        o.LJIIIIZZ(searchFrom, "param.searchFrom");
        this.LJLZ = searchFrom;
        this.LL = searchResultParam.getNeedCorrect();
        String enterMethod = searchResultParam.getEnterMethod();
        if (enterMethod == null || enterMethod.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "channel_unknown";
        } else {
            str = searchResultParam.getEnterMethod();
            o.LJIIIIZZ(str, "{\n            param.enterMethod\n        }");
        }
        Ml(str);
        if (o.LJ(this.LJZ, "channel_unknown")) {
            this.LJLJJI.setRecentRequestSearchSourceUnknown(true);
            C17N.LJJJJJL(this).j4(new C50407JqN());
        }
        if (o.LJ(this.LJLZ, "search_sug")) {
            searchResultParam.getSugType();
        }
    }

    public final void Pl(boolean z) {
        boolean z2;
        KEA LIZIZ;
        InterfaceC51365KDx LIZ;
        KEP kep;
        InterfaceC51365KDx LIZ2;
        InterfaceC51365KDx LIZ3;
        C50287JoR c50287JoR;
        InterfaceC51365KDx LIZ4;
        KEX LIZLLL;
        if (isViewValid() && getUserVisibleHint() && this.LLF) {
            KEP kep2 = this.LJLLI;
            if (kep2 != null && (LIZLLL = kep2.LIZLLL()) != null) {
                LIZLLL.LIZJ(false);
            }
            if (this.LLFII) {
                KEP kep3 = this.LJLLI;
                if (kep3 != null && (LIZ4 = kep3.LIZ()) != null && LIZ4.LJII(KE6.SEARCH_CLICK_MORE)) {
                    Ml("click_more_general_list");
                    SearchResultParam searchResultParam = this.LJLLILLLL;
                    if (searchResultParam != null) {
                        searchResultParam.setEnterMethod("click_more_general_list", false);
                    }
                } else {
                    C50652JuK.Companion.getClass();
                    C50431Jql LJFF = C50651JuJ.LJFF(this);
                    if (LJFF == null || LJFF.getSearchLastShowPageIndex() != this.LJZL) {
                        Ml("switch_tab");
                        SearchResultParam searchResultParam2 = this.LJLLILLLL;
                        if (searchResultParam2 != null) {
                            searchResultParam2.setEnterMethod("switch_tab", false);
                        }
                    }
                }
                SearchResultParam searchResultParam3 = this.LJLLILLLL;
                this.LJLLJ = searchResultParam3;
                if (searchResultParam3 != null && searchResultParam3.getIsFilterFromSchema()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    SearchResultParam searchResultParam4 = this.LJLLILLLL;
                    if (searchResultParam4 != null) {
                        c50287JoR = searchResultParam4.getFilterOption();
                    } else {
                        c50287JoR = null;
                    }
                    this.LJLJI = c50287JoR;
                    if (c50287JoR != null) {
                        c50287JoR.setFromSchema(true);
                    }
                    SearchResultParam searchResultParam5 = this.LJLLILLLL;
                    if (searchResultParam5 != null) {
                        searchResultParam5.setIsFilterFromSchema(false);
                    }
                }
                SearchResultParam searchResultParam6 = this.LJLLILLLL;
                if (searchResultParam6 != null) {
                    searchResultParam6.setFilterOption(null);
                }
                SearchStateViewModel searchStateViewModel = this.LLI;
                if (searchStateViewModel != null) {
                    searchStateViewModel.setIsRefreshingData(true);
                    Ml(Ol());
                    SearchResultParam searchResultParam7 = this.LJLLILLLL;
                    if (searchResultParam7 != null) {
                        searchResultParam7.setEnterMethod(this.LJZ);
                    }
                    VerticalSearchAbility verticalSearchAbility = (VerticalSearchAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), VerticalSearchAbility.class, null);
                    if (verticalSearchAbility != null) {
                        verticalSearchAbility.refreshData();
                    }
                    KEP kep4 = this.LJLLI;
                    if (kep4 != null && (LIZ3 = kep4.LIZ()) != null) {
                        LIZ3.LIZLLL();
                    }
                    this.LLFII = false;
                    KEP kep5 = this.LJLLI;
                    if (kep5 != null && (LIZ = kep5.LIZ()) != null && LIZ.LJII(KE6.CLICK_MORE) && (kep = this.LJLLI) != null && (LIZ2 = kep.LIZ()) != null) {
                        LIZ2.LJIIJJI(KE6.CLICK_MORE);
                    }
                    KEP kep6 = this.LJLLI;
                    if (kep6 != null && (LIZIZ = kep6.LIZIZ()) != null && this.LJLLLLLL == LIZIZ.LJIIIIZZ(KAK.TOP)) {
                        return;
                    }
                    System.currentTimeMillis();
                    return;
                }
                o.LJIJI("stateViewModel");
                throw null;
            }
            C50651JuJ c50651JuJ = C50652JuK.Companion;
            ActivityC45651qj mo49getActivity = mo49getActivity();
            c50651JuJ.getClass();
            C50431Jql LJFF2 = C50651JuJ.LJFF(mo49getActivity);
            if (LJFF2 != null) {
                LJFF2.setLastShowingPageIndex(this.LJZL);
            }
            C17N.LJJJJJL(this).j4(new K1X(this.LJZL));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        KEP kep;
        KEA LIZIZ;
        NextLiveData<Integer> LJI;
        KEP kep2;
        KEW LIZJ;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("search_key");
            o.LJII(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.model.SearchResultParam");
            Nl((SearchResultParam) serializable);
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            SearchStateViewModel searchStateViewModel = (SearchStateViewModel) ViewModelProviders.of(mo49getActivity).get(SearchStateViewModel.class);
            o.LJIIIZ(searchStateViewModel, "<set-?>");
            this.LLI = searchStateViewModel;
        }
        SearchStateViewModel searchStateViewModel2 = this.LLI;
        if (searchStateViewModel2 != null) {
            searchStateViewModel2.searchState.observe(this, new AObserverS76S0100000_8(this, 134));
            if (mo49getActivity() != null && (kep2 = this.LJLLI) != null && (LIZJ = kep2.LIZJ()) != null) {
                LIZJ.LIZ(this.LJZL, this);
            }
            this.LJLJLJ.add(new KET(this));
            if (mo49getActivity() != null && (kep = this.LJLLI) != null && (LIZIZ = kep.LIZIZ()) != null && (LJI = LIZIZ.LJI()) != null) {
                LJI.observe(this, new AObserverS76S0100000_8(this, 10));
            }
            EcomSearchServiceImpl.LJJJJZI().LIZ(null, this.LJLLILLLL, "shop_result_on_create");
            return;
        }
        o.LJIJI("stateViewModel");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        VerticalSearchAbility verticalSearchAbility;
        InterfaceC51365KDx LIZ;
        InterfaceC51365KDx LIZ2;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-8063513492624766313");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/ecommerce/search/result/vertical/GeneralSearchAdapter", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/ecommerce/search/result/vertical/GeneralSearchAdapter", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        Pl(true);
        if (z) {
            C50652JuK.Companion.getClass();
            C50431Jql LJFF = C50651JuJ.LJFF(this);
            if (LJFF != null) {
                LJFF.setSearchLastShowPageIndex(this.LJZL);
            }
            C17N.LJJJJJL(this).j4(new KEZ(this.LJZL));
            KEP kep = this.LJLLI;
            if (kep != null && (LIZ2 = kep.LIZ()) != null) {
                LIZ2.LJIIJJI(KE6.SEARCH_CLICK_MORE);
            }
            KEP kep2 = this.LJLLI;
            if (kep2 != null && (LIZ = kep2.LIZ()) != null) {
                LIZ.LJIIJJI(KE6.SEARCH_SWIPE_MORE);
            }
            SearchResultParam searchResultParam = this.LJLLILLLL;
            if (searchResultParam != null) {
                searchResultParam.setIndex(this.LJZL);
            }
        }
        if (!C48054ItW.LIZ() && isActive() && (verticalSearchAbility = (VerticalSearchAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), VerticalSearchAbility.class, null)) != null) {
            verticalSearchAbility.tt(z);
        }
        C2U8.LIZ(new IGH(z));
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/ecommerce/search/result/vertical/GeneralSearchAdapter", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SearchResultParam searchResultParam;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View view2 = null;
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), this, ISearchVerticalContext.class, null);
        if (o.LJ(EF7.LJIILIIL, "local_test")) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLII;
            View view3 = (View) linkedHashMap.get(Integer.valueOf(R.id.c4_));
            if (view3 == null) {
                View view4 = getView();
                if (view4 != null && (view3 = view4.findViewById(R.id.c4_)) != null) {
                    linkedHashMap.put(Integer.valueOf(R.id.c4_), view3);
                }
                view2.setVisibility(0);
            }
            view2 = view3;
            view2.setVisibility(0);
        }
        if (bundle == null && (searchResultParam = this.LJLLILLLL) != null) {
            Gl(searchResultParam);
        }
        Ml(Ol());
        C8VV.LIZ(this, false, new AqS174S0100000_8(this, 24));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final void Bf(String str, SearchApiResult apiResult, KAK searchTab) {
        String str2;
        String str3;
        String str4;
        Long l;
        InterfaceC51365KDx LIZ;
        String imprId;
        int i;
        int i2;
        boolean z;
        boolean z2;
        KEP kep;
        KEX LIZLLL;
        KEX LIZLLL2;
        KEX LIZLLL3;
        KEX LIZLLL4;
        o.LJIIIZ(apiResult, "apiResult");
        o.LJIIIZ(searchTab, "searchTab");
        Z9N z9n = Z9N.LIZIZ;
        LogPbBean logPbBean = apiResult.logPb;
        if (logPbBean == null || (str2 = logPbBean.getImprId()) == null) {
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
        z9n.LIZ.LIZJ(new LastSearch(str, str2, str3, str4, l));
        GlobalDoodleConfig globalDoodleConfig3 = apiResult.globalDoodleConfig;
        if (globalDoodleConfig3 != null) {
            boolean z3 = true;
            if (o.LJ(globalDoodleConfig3.getSearchChannel(), "tiktok_mall") || o.LJ(globalDoodleConfig3.getSearchChannel(), "tiktok_ecom")) {
                z = true;
            } else {
                z = false;
            }
            this.LLFZ = z;
            if (globalDoodleConfig3.getDisplayFilterBar() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (C50675Juh.LIZ && this.LLIFFJFJJ) {
                SearchResultParam searchResultParam = this.LJLLILLLL;
                if ((searchResultParam == null || searchResultParam.getFilterOption() == null) && (kep = this.LJLLI) != null && (LIZLLL = kep.LIZLLL()) != null) {
                    LIZLLL.LIZ(false);
                }
                if (z2) {
                    if (this.LLFZ) {
                        KEP kep2 = this.LJLLI;
                        if (kep2 != null && (LIZLLL4 = kep2.LIZLLL()) != null) {
                            LIZLLL4.LIZIZ(true);
                        }
                        this.LJLILLLLZI = z3;
                    } else {
                        KEP kep3 = this.LJLLI;
                        if (kep3 != null && (LIZLLL3 = kep3.LIZLLL()) != null) {
                            LIZLLL3.LIZIZ(false);
                        }
                    }
                } else {
                    KEP kep4 = this.LJLLI;
                    if (kep4 != null && (LIZLLL2 = kep4.LIZLLL()) != null) {
                        LIZLLL2.LIZIZ(false);
                    }
                }
                z3 = false;
                this.LJLILLLLZI = z3;
            }
            this.LJLJJI.setFeedbackSurvey(globalDoodleConfig3.getFeedbackSurvey());
            this.LJLJJI.getFeelGoodToken().clear();
            HashMap<String, Object> feelGood = globalDoodleConfig3.getFeelGood();
            if (feelGood != null) {
                this.LJLJJI.getFeelGoodToken().putAll(feelGood);
            }
            ISearchContextAbility LJJJJJL = C17N.LJJJJJL(this);
            List<FeedbackContents> feedbackSurvey = globalDoodleConfig3.getFeedbackSurvey();
            HashMap<String, Object> feelGood2 = globalDoodleConfig3.getFeelGood();
            if (feelGood2 == null) {
                feelGood2 = new HashMap<>();
            }
            LJJJJJL.j4(new C50324Jp2(feelGood2, feedbackSurvey));
        }
        LogPbBean logPbBean2 = apiResult.logPb;
        if (logPbBean2 != null && (imprId = logPbBean2.getImprId()) != null) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                i = mo49getActivity.hashCode();
            } else {
                i = 0;
            }
            InterfaceC50157JmL LIZIZ = K0M.LIZIZ(i);
            InterfaceC50157JmL interfaceC50157JmL = LIZIZ;
            if (LIZIZ == null) {
                C50145Jm9 c50145Jm9 = new C50145Jm9();
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 != null) {
                    i2 = mo49getActivity2.hashCode();
                } else {
                    i2 = 0;
                }
                K0M.LIZLLL(i2, c50145Jm9);
                interfaceC50157JmL = c50145Jm9;
            }
            int i3 = this.LJZL;
            C50160JmO c50160JmO = new C50160JmO();
            c50160JmO.LIZ = imprId;
            String Jl = Jl();
            o.LJIIIZ(Jl, "<set-?>");
            c50160JmO.LIZIZ = Jl;
            interfaceC50157JmL.LJFF(i3, c50160JmO);
            C50321Joz c50321Joz = this.LJLJJI;
            c50321Joz.setSearchId(imprId);
            c50321Joz.setSearchKeyword(Jl());
            C17N.LJJJJJL(this).j4(new C50323Jp1(Jl(), imprId));
            SearchServiceImpl.LLLZI().LLIIIJ(imprId);
            C3A5.LIZ.LJFF(imprId, logPbBean2);
        }
        SearchStateViewModel searchStateViewModel = this.LLI;
        if (searchStateViewModel != null) {
            searchStateViewModel.setIsRefreshingData(false);
            KEP kep5 = this.LJLLI;
            if (kep5 != null && (LIZ = kep5.LIZ()) != null) {
                LIZ.LJIIJJI(KE6.FROM_CLICK_MORE);
            }
            C50651JuJ c50651JuJ = C50652JuK.Companion;
            ActivityC45651qj mo49getActivity3 = mo49getActivity();
            c50651JuJ.getClass();
            C50431Jql LJFF = C50651JuJ.LJFF(mo49getActivity3);
            if (LJFF != null) {
                LJFF.setLastShowingPageIndex(this.LJZL);
            }
            C17N.LJJJJJL(this).j4(new K1X(this.LJZL));
            return;
        }
        o.LJIJI("stateViewModel");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        C50948Jz6 searchEnterParam;
        ECSearchEntranceData ecSearchEntranceData;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater.cloneInContext(getContext()), R.layout.ape, viewGroup, false);
        SearchResultParam searchResultParam = this.LJLLILLLL;
        C29S c29s = null;
        if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null && (ecSearchEntranceData = searchEnterParam.getEcSearchEntranceData()) != null) {
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
}
