package com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C10K;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C223338pd;
import X.C29S;
import X.C2NU;
import X.C3A5;
import X.C3C5;
import X.C40264FrA;
import X.C46360IHk;
import X.C48054ItW;
import X.C49503Jbn;
import X.C49567Jcp;
import X.C49804Jge;
import X.C49814Jgo;
import X.C49920JiW;
import X.C49921JiX;
import X.C50131Jlv;
import X.C50139Jm3;
import X.C50143Jm7;
import X.C50145Jm9;
import X.C50146JmA;
import X.C50160JmO;
import X.C50163JmR;
import X.C50167JmV;
import X.C50170JmY;
import X.C50171JmZ;
import X.C50236Jnc;
import X.C50287JoR;
import X.C50321Joz;
import X.C50323Jp1;
import X.C50324Jp2;
import X.C50356JpY;
import X.C50407JqN;
import X.C50428Jqi;
import X.C50431Jql;
import X.C50433Jqn;
import X.C50440Jqu;
import X.C50469JrN;
import X.C50589JtJ;
import X.C50605JtZ;
import X.C50619Jtn;
import X.C50642JuA;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50675Juh;
import X.C50676Jui;
import X.C50799Jwh;
import X.C50937Jyv;
import X.C50948Jz6;
import X.C51105K3x;
import X.C51107K3z;
import X.C56662Kg;
import X.C5H3;
import X.C65300Pk0;
import X.C68182ly;
import X.C76800UCe;
import X.C81335Vw3;
import X.C90903hW;
import X.HG3;
import X.InterfaceC49816Jgq;
import X.InterfaceC49928Jie;
import X.InterfaceC50067Jkt;
import X.InterfaceC50157JmL;
import X.InterfaceC50173Jmb;
import X.JTO;
import X.JY2;
import X.K0M;
import X.K1X;
import X.K56;
import X.KEZ;
import X.QD3;
import X.RBX;
import X.TMC;
import X.V16;
import X.X1D;
import Y.ACallableS111S0100000_8;
import Y.AObserverS76S0100000_8;
import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager2.adapter.AdapterStateViewModel;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.FeedbackContents;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchSurveyConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchEnterViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel.SearchResultStayHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.viewmodel.FeedbackHelper$startObserver$1;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import com.ss.android.ugc.aweme.search.pages.result.core.viewmodel.SearchResultViewModel;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class DynamicSearchFragment extends SearchBaseFragment implements InterfaceC49928Jie, InterfaceC50173Jmb {
    public C81335Vw3 LLIFFJFJJ;
    public C223338pd LLII;
    public SearchStartViewModel LLIIII;
    public boolean LLIIIJ;
    public AdapterStateViewModel LLIIIL;
    public SearchGlobalViewModel LLIIIZ;
    public SearchStateViewModel LLIIJI;
    public boolean LLIIJLIL;
    public long LLIIL;
    public SearchEnterViewModel LLIILII;
    public SurveyViewModel LLIILZL;
    public C50937Jyv LLIIZ;
    public C50356JpY LLIL;
    public InterfaceC50067Jkt LLILIL;
    public ViewGroup LLILL;
    public final Map<Integer, View> LLILLIZIL = new LinkedHashMap();
    public boolean LLIIIILZ = true;
    public final C5H3 LLILII = V16.LJJJJLL(new AqS158S0100000_8(this, 222));

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final Object Al(View view) {
        o.LJIIIZ(view, "view");
        return null;
    }

    @Override // X.InterfaceC49928Jie
    public final void Pk() {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLILLIZIL).clear();
    }

    public abstract void fm();

    @Override // X.InterfaceC49928Jie
    public final void oa(GlobalDoodleConfig globalDoodleConfig) {
    }

    @QD3
    public final void onWebViewActivityCloseEvent(C40264FrA event) {
        o.LJIIIZ(event, "event");
    }

    @Override // X.InterfaceC49928Jie
    public final void pa(SearchApiResult searchApiResult) {
    }

    @Override // X.InterfaceC49928Jie
    public final void qa(SearchApiResult searchApiResult) {
    }

    @Override // X.InterfaceC49928Jie
    public final void ta(SearchApiResult searchApiResult) {
    }

    @Override // X.InterfaceC49928Jie
    public final void ua(SearchApiResult searchApiResult) {
    }

    @Override // X.InterfaceC49928Jie
    public final void va(SearchApiResult searchApiResult) {
    }

    @Override // X.InterfaceC49928Jie
    public final void wa(QueryCorrectInfo queryCorrectInfo) {
    }

    @Override // X.InterfaceC49928Jie
    public final void xa(DynamicPatch dynamicPatch, String str) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    /* renamed from: Il */
    public final C51105K3x vl() {
        return (C51105K3x) this.LLILII.getValue();
    }

    public final void LJIJ() {
        C223338pd c223338pd = this.LLII;
        if (c223338pd != null) {
            if (c223338pd.LJLJLJ) {
                c223338pd.LIZJ();
            }
            Xl().setRefreshing(false);
            return;
        }
        o.LJIJI("centerLoadingView");
        throw null;
    }

    public final InterfaceC50067Jkt Tl() {
        InterfaceC50067Jkt interfaceC50067Jkt = this.LLILIL;
        if (interfaceC50067Jkt != null) {
            return interfaceC50067Jkt;
        }
        o.LJIJI("dynamicViewsContainer");
        throw null;
    }

    public final String Vl() {
        C50469JrN searchVideoModel;
        String groupId;
        C50652JuK.Companion.getClass();
        C50650JuI LJII = C50651JuJ.LJII(this);
        if (LJII == null || (searchVideoModel = LJII.getSearchVideoModel()) == null || (groupId = searchVideoModel.getGroupId()) == null || groupId.length() == 0) {
            return "";
        }
        return groupId;
    }

    public final ViewGroup Wl() {
        ViewGroup viewGroup = this.LLILL;
        if (viewGroup != null) {
            return viewGroup;
        }
        o.LJIJI("mDynamicFragment");
        throw null;
    }

    public final C81335Vw3 Xl() {
        C81335Vw3 c81335Vw3 = this.LLIFFJFJJ;
        if (c81335Vw3 != null) {
            return c81335Vw3;
        }
        o.LJIJI("mRefreshLayout");
        throw null;
    }

    public final SearchStateViewModel Yl() {
        SearchStateViewModel searchStateViewModel = this.LLIIJI;
        if (searchStateViewModel != null) {
            return searchStateViewModel;
        }
        o.LJIJI("mStateViewModel");
        throw null;
    }

    @Override // X.InterfaceC49928Jie
    public final void bk() {
        C50356JpY c50356JpY = this.LLIL;
        if (c50356JpY != null) {
            c50356JpY.LIZ(this);
        }
    }

    public final void em() {
        if (this.LLFFF) {
            C223338pd c223338pd = this.LLII;
            if (c223338pd != null) {
                c223338pd.LIZIZ();
                return;
            } else {
                o.LJIJI("centerLoadingView");
                throw null;
            }
        }
        Xl().setRefreshing(true);
    }

    @Override // X.InterfaceC49928Jie
    public final WeakReference<ActivityC45651qj> il() {
        return new WeakReference<>(mo49getActivity());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        if (r1.equals("search_sug") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ba, code lost:
    
        if (r4 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d0, code lost:
    
        if (r1.equals("search_sug") == false) goto L62;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x002e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x00b5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String om() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment.om():java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final Object vl() {
        return this.LLILII.getValue();
    }

    public final void dm() {
        Yl().setIsRefreshingData(false);
        new C50171JmZ().LJIILIIL();
        C49503Jbn.LIZIZ = false;
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c50651JuJ.getClass();
        C50431Jql LJFF = C50651JuJ.LJFF(mo49getActivity);
        if (LJFF != null) {
            LJFF.setLastShowingPageIndex(this.LLF);
        }
        C17N.LJJJJJL(this).j4(new K1X(this.LLF));
        this.LLFFF = false;
    }

    public final void hm() {
        Integer num;
        String str;
        SearchResultParam searchResultParam;
        long uptimeMillis = SystemClock.uptimeMillis() - this.LLIIL;
        SearchResultParam searchResultParam2 = this.LJLLILLLL;
        if (searchResultParam2 != null) {
            num = Integer.valueOf(searchResultParam2.getIndex());
        } else {
            num = null;
        }
        String str2 = "";
        if (num == null || ((searchResultParam = this.LJLLILLLL) != null && this.LLF == searchResultParam.getIndex())) {
            str = "";
        } else {
            str = C50605JtZ.LJFF(num.intValue());
        }
        String searchId = this.LJLJJI.getSearchId();
        if (searchId != null) {
            str2 = searchId;
        }
        if (str2.length() > 0) {
            SearchResultStayHelper.Companion.LIZ(this).LJ = str2;
        }
        C50167JmV c50167JmV = new C50167JmV();
        c50167JmV.LJIIZILJ("duration", String.valueOf(uptimeMillis));
        c50167JmV.LJIIZILJ("search_type", C50605JtZ.LJFF(this.LLF));
        c50167JmV.LJIIZILJ("search_id", str2);
        c50167JmV.LJIIZILJ("impr_id", str2);
        c50167JmV.LJIIZILJ("log_pb", C3A5.LIZ.LIZIZ(str2));
        c50167JmV.LJIIZILJ("next_tab", str);
        c50167JmV.LJIIZILJ("search_keyword", Kl());
        c50167JmV.LJIILIIL();
    }

    public void initView() {
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        this.LLILIL = new C50799Jwh(requireContext, this, 12);
        Tl().LIZLLL(0, new ViewGroup.LayoutParams(-1, -1), Wl());
        Wl().setVisibility(0);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (C48054ItW.LIZ()) {
            AdapterStateViewModel adapterStateViewModel = this.LLIIIL;
            if (adapterStateViewModel != null) {
                adapterStateViewModel.LJLIL.removeObservers(this);
            } else {
                o.LJIJI("adapterStateViewModel");
                throw null;
            }
        }
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view = getView();
        if (view != null) {
            JY2.LIZJ(view);
        }
        Wl().removeAllViews();
        if (Wl().getParent() != null && (Wl().getParent() instanceof ViewGroup)) {
            ViewParent parent = Wl().getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(Wl(), (ViewGroup) parent);
        }
        super.onDestroyView();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (C48054ItW.LIZ() || this.LLIIJLIL) {
            hm();
        }
        Tl().LIZ("onLynxVerticalSearchDisappeared", new JSONObject());
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        View view;
        View view2;
        if (C48054ItW.LIZ() && (view = getView()) != null && view.isLayoutRequested() && (view2 = getView()) != null) {
            view2.requestLayout();
        }
        super.onResume();
        this.LLIIL = SystemClock.uptimeMillis();
        Tl().LIZ("onLynxVerticalSearchAppeared", new JSONObject());
    }

    @Override // X.InterfaceC49928Jie
    public final InterfaceC49816Jgq sa() {
        return Ll();
    }

    @Override // X.InterfaceC49928Jie
    public final SearchResultParam LJLJLLL() {
        return this.LJLLJ;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void Gl(SearchResultParam searchResultParam) {
        o.LJIIIZ(searchResultParam, "searchResultParam");
        super.Gl(searchResultParam);
        this.LLIIIILZ = true;
        if (!isViewValid()) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putSerializable("search_key", searchResultParam);
                return;
            }
            return;
        }
        lm(searchResultParam);
        Context context = getContext();
        o.LJI(context);
        C50642JuA.LIZ(context, searchResultParam);
        pm(false);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final void Pl(boolean z) {
        super.Pl(z);
        C50937Jyv c50937Jyv = this.LLIIZ;
        if (c50937Jyv != null) {
            c50937Jyv.LJ(z, this, Tl());
        }
    }

    public JSONObject Sl(C50948Jz6 c50948Jz6) {
        String str;
        boolean z;
        boolean z2;
        int i;
        String str2;
        int i2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C50469JrN searchVideoModel;
        C50433Jqn searchCommonModel;
        String isFromComment;
        C50287JoR filterOption;
        C50287JoR filterOption2;
        C50287JoR filterOption3;
        Object obj = null;
        if (c50948Jz6 != null) {
            str = c50948Jz6.getGroupId();
        } else {
            str = null;
        }
        int i3 = 1;
        int i4 = 0;
        if (str == null || ujb.o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = Vl();
        }
        C50428Jqi LIZJ = C17N.LJJJJJL(this).Te().LIZJ();
        C50652JuK.Companion.getClass();
        TMC.LJIIJ(C50651JuJ.LJIIJ(this), LIZJ, "DynamicSearchFragment 602");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("keyword", Kl());
            String str9 = this.LJLLL;
            String str10 = "";
            if (str9 == null) {
                str9 = "";
            }
            jSONObject.put("tag_text", str9);
            jSONObject.put("search_source", this.LJZ);
            jSONObject.put("search_time", System.currentTimeMillis());
            jSONObject.put("query_correct_type", this.LLFF);
            SearchResultParam searchResultParam = this.LJLLILLLL;
            if (searchResultParam == null || (filterOption3 = searchResultParam.getFilterOption()) == null || filterOption3.isDefaultOption()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                i3 = 0;
            }
            jSONObject.put("is_filter_search", i3);
            SearchResultParam searchResultParam2 = this.LJLLILLLL;
            if (searchResultParam2 != null && (filterOption2 = searchResultParam2.getFilterOption()) != null) {
                i = filterOption2.getFilterBy();
            } else {
                i = 0;
            }
            jSONObject.put("filter_by", i);
            SearchResultParam searchResultParam3 = this.LJLLILLLL;
            if (searchResultParam3 != null && (filterOption = searchResultParam3.getFilterOption()) != null) {
                i4 = filterOption.getSortType();
            }
            jSONObject.put("sort_type", i4);
            jSONObject.put("search_context", C50236Jnc.LIZ().LIZIZ());
            if (c50948Jz6 != null) {
                str2 = c50948Jz6.getEnterSearchFrom();
            } else {
                str2 = null;
            }
            jSONObject.put("enter_from", str2);
            jSONObject.put("group_id", str);
            jSONObject.put("current_uid", ((RBX) HG3.LJIILL()).getCurUserId());
            C50431Jql LJFF = C50651JuJ.LJFF(mo49getActivity());
            if (LJFF != null) {
                i2 = LJFF.getLastShowingPageIndex();
            } else {
                i2 = -1;
            }
            if (i2 != -1 && i2 != this.LLF) {
                String LIZIZ = C50676Jui.LIZIZ(i2);
                if (o.LJ(LIZIZ, "general_search")) {
                    LIZIZ = "general";
                }
                jSONObject.put("from_search_subtab", LIZIZ);
            }
            jSONObject.put("enter_method", this.LJZ);
            jSONObject.put("last_search_id", C50440Jqu.LIZIZ);
            SearchResultParam searchResultParam4 = this.LJLLILLLL;
            if (searchResultParam4 != null) {
                str3 = searchResultParam4.getSugType();
            } else {
                str3 = null;
            }
            jSONObject.put("sug_type", str3);
            SearchResultParam searchResultParam5 = this.LJLLILLLL;
            if (searchResultParam5 != null) {
                str4 = searchResultParam5.getSugGenerateType();
            } else {
                str4 = null;
            }
            jSONObject.put("sug_generate_type", str4);
            jSONObject.put("sug_session_id", K56.LIZ(mo49getActivity()));
            jSONObject.put("is_first_search", C50139Jm3.LIZ);
            jSONObject.put("launch_time", C56662Kg.LIZ().LJIIJ);
            C50650JuI LJII = C50651JuJ.LJII(this);
            if (LJII != null && (searchCommonModel = LJII.getSearchCommonModel()) != null && (isFromComment = searchCommonModel.isFromComment()) != null) {
                str10 = isFromComment;
            }
            jSONObject.put("is_from_comment", str10);
            C50650JuI LJII2 = C50651JuJ.LJII(this);
            if (LJII2 != null && (searchVideoModel = LJII2.getSearchVideoModel()) != null) {
                str5 = searchVideoModel.getGroupId();
            } else {
                str5 = null;
            }
            jSONObject.put("lastFromGroupId", str5);
            SearchStartViewModel searchStartViewModel = this.LLIIII;
            if (searchStartViewModel != null && searchStartViewModel.LJLJJI) {
                str6 = "1";
            } else {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("from_middle_back_from_result", str6);
            SearchResultParam searchResultParam6 = this.LJLLILLLL;
            if (searchResultParam6 != null) {
                str7 = searchResultParam6.getSugUserId();
            } else {
                str7 = null;
            }
            jSONObject.put("sug_creator_id", str7);
            SearchResultParam searchResultParam7 = this.LJLLILLLL;
            if (searchResultParam7 != null) {
                str8 = searchResultParam7.getQueryState();
            } else {
                str8 = null;
            }
            jSONObject.put("sug_query_state", str8);
            C50948Jz6 c50948Jz62 = JTO.LIZ(mo49getActivity()).LJLIL;
            if (c50948Jz62 != null) {
                obj = c50948Jz62.obtainLogData("is_from_video");
            }
            jSONObject.put("is_from_video", obj);
            jSONObject.put("personal_context_info", C50589JtJ.LIZ(mo49getActivity(), this.LJLLILLLL));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final void Zl(GlobalDoodleConfig globalDoodleConfig) {
        boolean z;
        SurveyViewModel surveyViewModel;
        NextLiveData<SearchSurveyConfig> nextLiveData;
        if (globalDoodleConfig != null) {
            SearchSurveyConfig surveyConfig = globalDoodleConfig.getSurveyConfig();
            if (surveyConfig != null && (surveyViewModel = this.LLIILZL) != null && (nextLiveData = surveyViewModel.LJLILLLLZI) != null) {
                nextLiveData.postValue(surveyConfig);
            }
            boolean z2 = false;
            if (o.LJ(globalDoodleConfig.getSearchChannel(), "tiktok_mall") || o.LJ(globalDoodleConfig.getSearchChannel(), "tiktok_ecom")) {
                z = true;
            } else {
                z = false;
            }
            this.LLIIIJ = z;
            if (globalDoodleConfig.getDisplayFilterBar() == 1) {
                z2 = true;
            }
            ra(z2);
            this.LJLJJI.setFeedbackSurvey(globalDoodleConfig.getFeedbackSurvey());
            this.LJLJJI.getFeelGoodToken().clear();
            HashMap<String, Object> feelGood = globalDoodleConfig.getFeelGood();
            if (feelGood != null) {
                this.LJLJJI.getFeelGoodToken().putAll(feelGood);
            }
            ISearchContextAbility LJJJJJL = C17N.LJJJJJL(this);
            List<FeedbackContents> feedbackSurvey = globalDoodleConfig.getFeedbackSurvey();
            HashMap<String, Object> feelGood2 = globalDoodleConfig.getFeelGood();
            if (feelGood2 == null) {
                feelGood2 = new HashMap<>();
            }
            LJJJJJL.j4(new C50324Jp2(feelGood2, feedbackSurvey));
        }
    }

    public final void cm(LogPbBean logPbBean) {
        String imprId;
        int i;
        if (logPbBean != null && (imprId = logPbBean.getImprId()) != null) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            int i2 = 0;
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
                }
                K0M.LIZLLL(i2, c50145Jm9);
                interfaceC50157JmL = c50145Jm9;
            }
            int i3 = this.LLF;
            C50160JmO c50160JmO = new C50160JmO();
            c50160JmO.LIZ = imprId;
            String Kl = Kl();
            o.LJIIIZ(Kl, "<set-?>");
            c50160JmO.LIZIZ = Kl;
            interfaceC50157JmL.LJFF(i3, c50160JmO);
            C50321Joz c50321Joz = this.LJLJJI;
            c50321Joz.setSearchId(imprId);
            c50321Joz.setSearchKeyword(Kl());
            C17N.LJJJJJL(this).j4(new C50323Jp1(Kl(), imprId));
            C50440Jqu.LIZIZ = this.LJLJJI.getSearchId();
            C3A5.LIZ.LJFF(imprId, logPbBean);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void hideLoadingBall(C46360IHk event) {
        o.LJIIIZ(event, "event");
        if ((o.LJ(event.LJLIL, "vertical-sounds") || o.LJ(event.LJLIL, "vertical-shopping") || o.LJ(event.LJLIL, "vertical-poi")) && isViewValid()) {
            LJIJ();
        }
    }

    public final void lm(SearchResultParam param) {
        boolean z;
        String str;
        o.LJIIIZ(param, "param");
        this.LJLLILLLL = param;
        String keyword = param.getKeyword();
        o.LJIIIIZZ(keyword, "param.keyword");
        Ll().LIZ(new C49814Jgo(keyword, 2));
        String sugHint = param.getSugHint();
        if (sugHint == null) {
            sugHint = "";
        }
        this.LJLLL = sugHint;
        String searchFrom = param.getSearchFrom();
        o.LJIIIIZZ(searchFrom, "param.searchFrom");
        this.LJLZ = searchFrom;
        this.LLFF = param.getNeedCorrect();
        String enterMethod = param.getEnterMethod();
        if (enterMethod == null || enterMethod.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "channel_unknown";
        } else {
            str = param.getEnterMethod();
            o.LJIIIIZZ(str, "{\n            param.enterMethod\n        }");
        }
        Ql(str);
        if (o.LJ(this.LJZ, "channel_unknown")) {
            this.LJLJJI.setRecentRequestSearchSourceUnknown(true);
            C17N.LJJJJJL(this).j4(new C50407JqN());
        }
        if (o.LJ(this.LJLZ, "search_sug")) {
            this.LLD = param.getSugType();
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            ((SearchResultViewModel) ViewModelProviders.of(mo49getActivity).get(SearchResultViewModel.class)).LJLIL.postValue(param);
        }
    }

    public final void mm(Throwable e) {
        o.LJIIIZ(e, "e");
        C49920JiW LJ = C49921JiX.LJ(this.LJLLJ);
        LJ.LJI();
        LJ.LJIIJJI(1);
        String message = e.getMessage();
        if (!o.LJ(LJ, C49567Jcp.LIZ)) {
            LJ.LJIJJ = message;
        }
        LJ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NextLiveData nextLiveData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("search_key");
            o.LJII(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.model.SearchResultParam");
            lm((SearchResultParam) serializable);
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) ViewModelProviders.of(mo49getActivity).get(SearchStateViewModel.class);
        o.LJIIIZ(searchStateViewModel, "<set-?>");
        this.LLIIJI = searchStateViewModel;
        Yl().searchState.observe(this, new AObserverS76S0100000_8(this, 127));
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            this.LLIIII = (SearchStartViewModel) ViewModelProviders.of(mo49getActivity2).get(SearchStartViewModel.class);
            this.LLIIIZ = (SearchGlobalViewModel) ViewModelProviders.of(mo49getActivity2).get(SearchGlobalViewModel.class);
            if (C48054ItW.LIZ()) {
                AdapterStateViewModel adapterStateViewModel = (AdapterStateViewModel) ViewModelProviders.of(mo49getActivity2).get(AdapterStateViewModel.class);
                o.LJIIIZ(adapterStateViewModel, "<set-?>");
                this.LLIIIL = adapterStateViewModel;
                adapterStateViewModel.LJLIL.observe(this, new AObserverS76S0100000_8(this, 44));
            }
            SearchGlobalViewModel searchGlobalViewModel = this.LLIIIZ;
            if (searchGlobalViewModel != null && (nextLiveData = searchGlobalViewModel.LJLLLLLL) != null) {
                nextLiveData.observe(this, new AObserverS76S0100000_8(this, 45));
            }
        }
        if (this.LJLJI == null) {
            ((C51105K3x) this.LLILII.getValue()).LIZJ();
        }
        this.LJLJLJ.add(new C50163JmR(this));
    }

    @QD3
    public final void onFeedbackSubmitSuccess(C50170JmY event) {
        Boolean bool;
        NextLiveData<Boolean> nextLiveData;
        NextLiveData<Boolean> nextLiveData2;
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFeedbackSubmitSuccess, vm: ");
        LIZ.append(this.LLIILZL);
        LIZ.append(", observer: ");
        SurveyViewModel surveyViewModel = this.LLIILZL;
        if (surveyViewModel != null && (nextLiveData2 = surveyViewModel.LJLIL) != null) {
            bool = Boolean.valueOf(nextLiveData2.hasObservers());
        } else {
            bool = null;
        }
        LIZ.append(bool);
        X1D.LIZIZ(LIZ);
        SurveyViewModel surveyViewModel2 = this.LLIILZL;
        if (surveyViewModel2 != null && (nextLiveData = surveyViewModel2.LJLIL) != null) {
            nextLiveData.postValue(Boolean.TRUE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, "guide_search_cancel") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pm(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.isViewValid()
            if (r0 == 0) goto L7a
            boolean r0 = r4.getUserVisibleHint()
            if (r0 == 0) goto L7a
            boolean r0 = r4.LLFII
            if (r0 == 0) goto L7a
            boolean r0 = r4.LLIIIILZ
            if (r0 == 0) goto Lab
            int r1 = r4.LLF
            com.ss.android.ugc.aweme.search.model.SearchResultParam r0 = r4.LJLLILLLL
            X.C49921JiX.LJI(r1, r0)
            boolean r0 = X.C49503Jbn.LIZLLL
            r2 = 0
            if (r0 == 0) goto L8a
            java.lang.String r1 = "click_more_general_list"
            r4.Ql(r1)
            com.ss.android.ugc.aweme.search.model.SearchResultParam r0 = r4.LJLLILLLL
            if (r0 == 0) goto L2c
            r0.setEnterMethod(r1, r2)
        L2c:
            com.ss.android.ugc.aweme.search.model.SearchResultParam r0 = r4.LJLLILLLL
            r3 = 0
            if (r0 == 0) goto L88
            java.lang.String r1 = r0.getSearchFrom()
        L35:
            java.lang.String r0 = "guide_search"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L4d
            com.ss.android.ugc.aweme.search.model.SearchResultParam r0 = r4.LJLLILLLL
            if (r0 == 0) goto L86
            java.lang.String r1 = r0.getSearchFrom()
        L45:
            java.lang.String r0 = "guide_search_cancel"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L55
        L4d:
            com.ss.android.ugc.aweme.search.model.SearchResultParam r0 = r4.LJLLILLLL
            if (r0 == 0) goto L55
            X.JoR r3 = r0.getFilterOption()
        L55:
            r4.nm(r5, r3)
            r4.LLIIIILZ = r2
            boolean r0 = X.C49503Jbn.LIZJ
            if (r0 == 0) goto L60
            X.C49503Jbn.LIZJ = r2
        L60:
            int r1 = r4.LJLLLLLL
            int r0 = X.C50605JtZ.LJIIJJI()
            if (r1 == r0) goto L70
            r4.fm()
            int r0 = r4.LJLLLLLL
            X.C50139Jm3.LIZJ(r0)
        L70:
            java.lang.String r0 = r4.Kl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L7b
        L7a:
            return
        L7b:
            Y.ACallableS111S0100000_8 r1 = new Y.ACallableS111S0100000_8
            r0 = 24
            r1.<init>(r4, r0)
            X.C10K.LIZJ(r1)
            goto L7a
        L86:
            r1 = r3
            goto L45
        L88:
            r1 = r3
            goto L35
        L8a:
            X.JuJ r0 = X.C50652JuK.Companion
            r0.getClass()
            X.Jql r0 = X.C50651JuJ.LJFF(r4)
            if (r0 == 0) goto L9e
            int r1 = r0.getSearchLastShowPageIndex()
            int r0 = r4.LLF
            if (r1 != r0) goto L9e
            goto L2c
        L9e:
            java.lang.String r1 = "switch_tab"
            r4.Ql(r1)
            com.ss.android.ugc.aweme.search.model.SearchResultParam r0 = r4.LJLLILLLL
            if (r0 == 0) goto L2c
            r0.setEnterMethod(r1, r2)
            goto L2c
        Lab:
            X.JuJ r1 = X.C50652JuK.Companion
            X.1qj r0 = r4.mo49getActivity()
            r1.getClass()
            X.Jql r1 = X.C50651JuJ.LJFF(r0)
            if (r1 != 0) goto Lc9
        Lba:
            com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r2 = X.C17N.LJJJJJL(r4)
            X.K1X r1 = new X.K1X
            int r0 = r4.LLF
            r1.<init>(r0)
            r2.j4(r1)
            goto L70
        Lc9:
            int r0 = r4.LLF
            r1.setLastShowingPageIndex(r0)
            goto Lba
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.DynamicSearchFragment.pm(boolean):void");
    }

    @Override // X.InterfaceC49928Jie
    public final void ra(boolean z) {
        SearchStartViewModel searchStartViewModel;
        com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<Boolean> jv0;
        com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<Boolean> gv0;
        com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<Boolean> gv02;
        com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<Boolean> gv03;
        if (!C50675Juh.LIZ || !wl()) {
            return;
        }
        SearchResultParam searchResultParam = this.LJLLILLLL;
        if ((searchResultParam == null || searchResultParam.getFilterOption() == null) && (searchStartViewModel = this.LLIIII) != null && (jv0 = searchStartViewModel.jv0()) != null) {
            jv0.setValue(Boolean.FALSE);
        }
        if (z) {
            if (this.LLIIIJ || C51107K3z.LIZ(((C51105K3x) this.LLILII.getValue()).LIZ())) {
                SearchStartViewModel searchStartViewModel2 = this.LLIIII;
                if (searchStartViewModel2 != null && (gv02 = searchStartViewModel2.gv0()) != null) {
                    gv02.setValue(Boolean.TRUE);
                }
                this.LJLILLLLZI = true;
                return;
            }
            SearchStartViewModel searchStartViewModel3 = this.LLIIII;
            if (searchStartViewModel3 != null && (gv03 = searchStartViewModel3.gv0()) != null) {
                gv03.setValue(Boolean.FALSE);
            }
            this.LJLILLLLZI = false;
            return;
        }
        SearchStartViewModel searchStartViewModel4 = this.LLIIII;
        if (searchStartViewModel4 != null && (gv0 = searchStartViewModel4.gv0()) != null) {
            gv0.setValue(Boolean.FALSE);
        }
        this.LJLILLLLZI = false;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void recordViewDrawEnd(C50146JmA event) {
        String str;
        C50160JmO LJ;
        o.LJIIIZ(event, "event");
        InterfaceC50157JmL LIZ = K0M.LIZ();
        if (LIZ == null || (LJ = LIZ.LJ(this.LLF)) == null || (str = LJ.LIZ) == null) {
            str = "";
        }
        if (str.length() > 0) {
            SearchResultStayHelper.Companion.LIZ(this).LJ = str;
        }
        C49920JiW LJ2 = C49921JiX.LJ(this.LJLLILLLL);
        LJ2.LJIIJJI(event.LJLJJI);
        long j = event.LJLILLLLZI;
        if (!o.LJ(LJ2, C49567Jcp.LIZ)) {
            long j2 = LJ2.LIZJ;
            if (j2 == 0) {
                j2 = LJ2.LIZIZ;
            }
            LJ2.LJIIIZ = j;
            LJ2.LJIILL = (int) (j - j2);
        }
        LJ2.LIZJ(event.LJLJI);
        LJ2.LJFF(str);
        LJ2.LIZJ = event.LJLIL;
        LJ2.LJIIIIZZ = event.LJLJJL;
        LJ2.LJJIIJZLJL = true;
        View view = getView();
        if (view != null) {
            view.post(new ARunnableS44S0100000_8(LJ2, 39));
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void setRequestSuccessConfig(C50143Jm7 event) {
        o.LJIIIZ(event, "event");
        Zl(event.LJLIL);
        cm(event.LJLILLLLZI);
        dm();
        bk();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "8689677522196718496");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/search/pages/result/common/core/ui/fragment/DynamicSearchFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/common/core/ui/fragment/DynamicSearchFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        pm(true);
        if (z) {
            C50652JuK.Companion.getClass();
            C50431Jql LJFF = C50651JuJ.LJFF(this);
            if (LJFF != null) {
                LJFF.setSearchLastShowPageIndex(this.LLF);
            }
            C17N.LJJJJJL(this).j4(new KEZ(this.LLF));
            C49503Jbn.LIZLLL = false;
            C49503Jbn.LJIIIZ = false;
            SearchResultParam searchResultParam = this.LJLLILLLL;
            if (searchResultParam != null) {
                searchResultParam.setIndex(this.LLF);
            }
        }
        if (!C48054ItW.LIZ()) {
            if (z) {
                this.LLIIL = SystemClock.uptimeMillis();
            }
            if (this.LLIIJLIL && !z) {
                hm();
            }
            this.LLIIJLIL = z;
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/common/core/ui/fragment/DynamicSearchFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // X.InterfaceC49928Jie
    public final void yf(boolean z) {
        this.LLFFF = z;
    }

    public final void km(int i, SearchApiResult apiResult) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(apiResult, "apiResult");
        LJIJ();
        C50619Jtn LIZ = C50236Jnc.LIZ();
        String Kl = Kl();
        LogPbBean logPbBean = apiResult.logPb;
        Long l = null;
        if (logPbBean == null || (str = logPbBean.getImprId()) == null) {
            str = "";
        }
        GlobalDoodleConfig globalDoodleConfig = apiResult.globalDoodleConfig;
        if (globalDoodleConfig != null) {
            str2 = globalDoodleConfig.getSearchChannel();
        } else {
            str2 = null;
        }
        GlobalDoodleConfig globalDoodleConfig2 = apiResult.globalDoodleConfig;
        if (globalDoodleConfig2 != null) {
            str3 = globalDoodleConfig2.getNewSource();
        } else {
            str3 = null;
        }
        BaseResponse.ServerTimeExtra serverTimeExtra = apiResult.extra;
        if (serverTimeExtra != null) {
            l = Long.valueOf(serverTimeExtra.now);
        }
        LIZ.LIZJ(new LastSearch(Kl, str, str2, str3, l));
        Zl(apiResult.globalDoodleConfig);
        cm(apiResult.logPb);
        dm();
        C49920JiW LJ = C49921JiX.LJ(this.LJLLJ);
        LJ.LIZJ(i);
        LJ.LJI();
        LJ.LJFF(apiResult.getRequestId());
        LJ.LJIIJ(apiResult);
        LJ.LJIIJJI(0);
        LJ.LIZLLL();
        bk();
    }

    public void nm(int i, C50287JoR c50287JoR) {
        C50948Jz6 c50948Jz6;
        String str;
        String Vl;
        C50287JoR c50287JoR2;
        this.LJLLJ = this.LJLLILLLL;
        C50948Jz6 c50948Jz62 = null;
        if (c50287JoR == null) {
            this.LJLJI = null;
            ((C51105K3x) this.LLILII.getValue()).LIZJ();
        }
        SearchResultParam searchResultParam = this.LJLLILLLL;
        if (searchResultParam != null && searchResultParam.getIsFilterFromSchema()) {
            SearchResultParam searchResultParam2 = this.LJLLILLLL;
            if (searchResultParam2 != null) {
                c50287JoR2 = searchResultParam2.getFilterOption();
            } else {
                c50287JoR2 = null;
            }
            this.LJLJI = c50287JoR2;
            if (c50287JoR2 != null) {
                c50287JoR2.setFromSchema(true);
            }
            SearchResultParam searchResultParam3 = this.LJLLILLLL;
            if (searchResultParam3 != null) {
                searchResultParam3.setIsFilterFromSchema(false);
            }
        }
        SearchResultParam searchResultParam4 = this.LJLLILLLL;
        if (searchResultParam4 != null) {
            searchResultParam4.setFilterOption(c50287JoR);
        }
        Yl().setIsRefreshingData(true);
        Ql(om());
        C50440Jqu.LIZ = C50440Jqu.LIZIZ;
        SearchEnterViewModel searchEnterViewModel = this.LLIILII;
        if (searchEnterViewModel != null) {
            c50948Jz6 = searchEnterViewModel.LJLIL;
        } else {
            c50948Jz6 = null;
        }
        Tl().LIZ("changeSearchParams", Sl(c50948Jz6));
        fm();
        C49921JiX.LJ(this.LJLLJ).LJII();
        C50139Jm3.LIZ = false;
        C50937Jyv c50937Jyv = this.LLIIZ;
        if (c50937Jyv != null) {
            c50937Jyv.LJLJJI = false;
            c50937Jyv.LJLJJL = false;
            ((LinkedHashMap) c50937Jyv.LJLJJLL).clear();
        }
        SearchEnterViewModel searchEnterViewModel2 = this.LLIILII;
        if (searchEnterViewModel2 != null) {
            c50948Jz62 = searchEnterViewModel2.LJLIL;
        }
        SearchResultStayHelper LIZ = SearchResultStayHelper.Companion.LIZ(this);
        if (c50948Jz62 == null || (str = c50948Jz62.getEnterSearchFrom()) == null) {
            str = "";
        }
        LIZ.LIZIZ = str;
        String str2 = this.LJZ;
        o.LJIIIZ(str2, "<set-?>");
        LIZ.LIZJ = str2;
        LIZ.LIZLLL = C50605JtZ.LJFF(this.LLF);
        String Kl = Kl();
        o.LJIIIZ(Kl, "<set-?>");
        LIZ.LJFF = Kl;
        if (c50948Jz62 == null || (Vl = c50948Jz62.getGroupId()) == null) {
            Vl = Vl();
        }
        o.LJIIIZ(Vl, "<set-?>");
        LIZ.LJI = Vl;
        C10K.LIZJ(new ACallableS111S0100000_8(this, 25));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.itq);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.refresh_layout)");
        this.LLIFFJFJJ = (C81335Vw3) findViewById;
        boolean z = false;
        Xl().setEnabled(false);
        View findViewById2 = view.findViewById(R.id.jem);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.search_center_loading_view)");
        this.LLII = (C223338pd) findViewById2;
        initView();
        SearchResultParam searchResultParam = this.LJLLILLLL;
        if (searchResultParam != null) {
            Gl(searchResultParam);
        }
        EventBus.LIZJ().LJIILJJIL(this);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LLIILII = (SearchEnterViewModel) ViewModelProviders.of(mo49getActivity).get(SearchEnterViewModel.class);
            this.LLIILZL = (SurveyViewModel) ViewModelProviders.of(mo49getActivity).get(SurveyViewModel.class);
            if (C49804Jge.LJJIZ()) {
                this.LJLLI = (SearchContainerHeaderVM) ViewModelProviders.of(mo49getActivity).get(SearchContainerHeaderVM.class);
            }
        }
        Rl(view);
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        C68182ly.LIZ(mo49getActivity2, new FeedbackHelper$startObserver$1(mo49getActivity2));
        Ql(om());
        if (this.LLILIL != null) {
            T2(Tl());
        }
        mo49getActivity();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
        }
        if (z) {
            em();
        }
        if (C50131Jlv.LIZ()) {
            C50937Jyv c50937Jyv = new C50937Jyv();
            c50937Jyv.LIZLLL(this);
            this.LLIIZ = c50937Jyv;
            C50356JpY c50356JpY = new C50356JpY();
            C50937Jyv c50937Jyv2 = this.LLIIZ;
            if (c50937Jyv2 != null) {
                ((ArrayList) c50356JpY.LIZ).add(c50937Jyv2);
            }
            this.LLIL = c50356JpY;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        if (C49804Jge.LJJIZ()) {
            i = R.layout.cg3;
        } else {
            i = R.layout.cfz;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater.cloneInContext(getContext()), i, viewGroup, false);
        View findViewById = LLLLIILL.findViewById(R.id.ck3);
        o.LJIIIIZZ(findViewById, "root.findViewById(R.id.dynamic_fragment)");
        this.LLILL = (ViewGroup) findViewById;
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
