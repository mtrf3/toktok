package com.ss.android.ugc.aweme.result.common.core.ui.fragment;

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
import X.C37831Et1;
import X.C39469FeL;
import X.C3A5;
import X.C3C5;
import X.C46360IHk;
import X.C48054ItW;
import X.C48658J7u;
import X.C49814Jgo;
import X.C50143Jm7;
import X.C50145Jm9;
import X.C50160JmO;
import X.C50287JoR;
import X.C50321Joz;
import X.C50323Jp1;
import X.C50324Jp2;
import X.C50407JqN;
import X.C50431Jql;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50675Juh;
import X.C50948Jz6;
import X.C51379KEl;
import X.C65232Piu;
import X.C65300Pk0;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC49816Jgq;
import X.InterfaceC50157JmL;
import X.InterfaceC51365KDx;
import X.K0M;
import X.K1X;
import X.KAK;
import X.KE6;
import X.KEA;
import X.KEP;
import X.KET;
import X.KEW;
import X.KEX;
import X.KEZ;
import X.KFN;
import X.KFW;
import X.KFY;
import X.KGI;
import X.KGP;
import X.QD3;
import X.WM7;
import Y.ACallableS111S0100000_8;
import Y.AObserverS76S0100000_8;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.discover.model.FeedbackContents;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class EcDynamicSearchFragment extends EcSearchBaseFragment {
    public C223338pd LLFII;
    public boolean LLI;
    public SearchStateViewModel LLIFFJFJJ;
    public long LLII;
    public boolean LLIIII;
    public KFY LLIIIILZ;
    public ViewGroup LLIIIJ;
    public KFN LLIIIL;
    public KGP LLIIIZ;
    public KFW LLIIJI;
    public final Map<Integer, View> LLIIJLIL = new LinkedHashMap();
    public boolean LLFZ = true;

    public abstract void Tl();

    public void Wl(KFY kfy) {
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIJLIL).clear();
    }

    public void initView() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008b, code lost:
    
        if (r2 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0091, code lost:
    
        if (r2.length() != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0093, code lost:
    
        r2 = "normal_search";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00aa, code lost:
    
        if (r1.equals("search_sug") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b3, code lost:
    
        if (r1.equals("related_search_keyword") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bc, code lost:
    
        if (r1.equals("recom_search") == false) goto L37;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x007a. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String cm() {
        /*
            r5 = this;
            X.KEP r0 = r5.LJLLI
            r2 = 0
            if (r0 == 0) goto Le3
            X.KDx r0 = r0.LIZ()
            if (r0 == 0) goto Le3
            X.Jz6 r0 = r0.ha()
        Lf:
            int r0 = X.KB1.LIZ(r0)
            boolean r4 = X.KB1.LJII(r0)
            X.KEP r0 = r5.LJLLI
            r3 = 1
            if (r0 == 0) goto L39
            X.KDx r1 = r0.LIZ()
            if (r1 == 0) goto L39
            X.KE6 r0 = X.KE6.FROM_CLICK_MORE
            boolean r0 = r1.LJII(r0)
            if (r0 != r3) goto L39
            java.lang.String r2 = "click_more_general_list"
        L2c:
            java.lang.String r1 = r5.LJLZ
            java.lang.String r0 = "tab_search"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L38
            java.lang.String r2 = r5.LJLZ
        L38:
            return r2
        L39:
            X.KEP r0 = r5.LJLLI
            if (r0 == 0) goto L4e
            X.KDx r1 = r0.LIZ()
            if (r1 == 0) goto L4e
            X.KE6 r0 = X.KE6.SEARCH_SWIPE_MORE
            boolean r0 = r1.LJII(r0)
            if (r0 != r3) goto L4e
            java.lang.String r2 = "swipe_more_general_list"
            goto L2c
        L4e:
            X.JuJ r1 = X.C50652JuK.Companion
            X.1qj r0 = r5.mo49getActivity()
            r1.getClass()
            X.Jql r0 = X.C50651JuJ.LJFF(r0)
            if (r0 == 0) goto Lbf
            int r1 = r0.getSearchLastShowPageIndex()
            r0 = -1
            if (r1 != r0) goto Lbf
        L64:
            com.ss.android.ugc.aweme.search.model.SearchResultParam r0 = r5.LJLLJ
            if (r0 == 0) goto L74
            java.lang.String r0 = r0.getEnterMethod()
            if (r0 == 0) goto L74
            int r0 = r0.length()
            if (r0 != 0) goto Ld2
        L74:
            java.lang.String r1 = r5.LJLZ
            int r0 = r1.hashCode()
            switch(r0) {
                case -1816950631: goto Lb6;
                case -1191929626: goto Lad;
                case -710131922: goto La4;
                case 3452698: goto L99;
                default: goto L7d;
            }
        L7d:
            if (r4 == 0) goto L96
            java.lang.String r0 = r5.LJLZ
            if (r0 == 0) goto L89
            int r0 = r0.length()
            if (r0 != 0) goto L96
        L89:
            java.lang.String r2 = r5.LJZ
        L8b:
            if (r2 == 0) goto L93
        L8d:
            int r0 = r2.length()
            if (r0 != 0) goto L2c
        L93:
            java.lang.String r2 = "normal_search"
            goto L2c
        L96:
            java.lang.String r2 = r5.LJLZ
            goto L8b
        L99:
            java.lang.String r0 = "push"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7d
            java.lang.String r2 = r5.LJZ
            goto L8b
        La4:
            java.lang.String r2 = "search_sug"
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L8d
            goto L7d
        Lad:
            java.lang.String r2 = "related_search_keyword"
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L8d
            goto L7d
        Lb6:
            java.lang.String r2 = "recom_search"
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L8d
            goto L7d
        Lbf:
            X.1qj r0 = r5.mo49getActivity()
            X.Jql r0 = X.C50651JuJ.LJFF(r0)
            if (r0 == 0) goto Ldf
            int r1 = r0.getSearchLastShowPageIndex()
            int r0 = r5.LJZL
            if (r1 != r0) goto Ldf
            goto L64
        Ld2:
            com.ss.android.ugc.aweme.search.model.SearchResultParam r0 = r5.LJLLJ
            if (r0 == 0) goto Lda
            java.lang.String r2 = r0.getEnterMethod()
        Lda:
            kotlin.jvm.internal.o.LJI(r2)
            goto L2c
        Ldf:
            java.lang.String r2 = "switch_tab"
            goto L2c
        Le3:
            r0 = r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment.cm():java.lang.String");
    }

    public final void LJIJ() {
        C223338pd c223338pd = this.LLFII;
        if (c223338pd != null) {
            if (c223338pd.LJLJLJ) {
                c223338pd.LIZJ();
                return;
            }
            return;
        }
        o.LJIJI("centerLoadingView");
        throw null;
    }

    public final KFY Ol() {
        KFY kfy = this.LLIIIILZ;
        if (kfy != null) {
            return kfy;
        }
        o.LJIJI("dynamicViewsContainer");
        throw null;
    }

    public final ViewGroup Pl() {
        ViewGroup viewGroup = this.LLIIIJ;
        if (viewGroup != null) {
            return viewGroup;
        }
        o.LJIJI("mDynamicFragment");
        throw null;
    }

    public final void Sl() {
        InterfaceC51365KDx LIZ;
        SearchStateViewModel searchStateViewModel = this.LLIFFJFJJ;
        if (searchStateViewModel != null) {
            searchStateViewModel.setIsRefreshingData(false);
            KEP kep = this.LJLLI;
            if (kep != null && (LIZ = kep.LIZ()) != null) {
                LIZ.LJIIJJI(KE6.FROM_CLICK_MORE);
            }
            C50651JuJ c50651JuJ = C50652JuK.Companion;
            ActivityC45651qj mo49getActivity = mo49getActivity();
            c50651JuJ.getClass();
            C50431Jql LJFF = C50651JuJ.LJFF(mo49getActivity);
            if (LJFF != null) {
                LJFF.setLastShowingPageIndex(this.LJZL);
            }
            C17N.LJJJJJL(this).j4(new K1X(this.LJZL));
            return;
        }
        o.LJIJI("mStateViewModel");
        throw null;
    }

    public void Vl() {
        if (this.LLIIIILZ == null) {
            return;
        }
        Wl(Ol());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        KEW LIZJ;
        KEP kep = this.LJLLI;
        if (kep != null && (LIZJ = kep.LIZJ()) != null) {
            LIZJ.LIZIZ(this);
        }
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Pl().removeAllViews();
        if (Pl().getParent() != null && (Pl().getParent() instanceof ViewGroup)) {
            ViewParent parent = Pl().getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            C16880lQ.LJLLL(Pl(), (ViewGroup) parent);
        }
        super.onDestroyView();
        EventBus.LIZJ().LJIJ(this);
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        View view;
        View view2;
        if (C48054ItW.LIZ() && (view = getView()) != null && view.isLayoutRequested() && (view2 = getView()) != null) {
            view2.requestLayout();
        }
        super.onResume();
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
        this.LLFZ = true;
        String str4 = "shop";
        String str5 = "";
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
                    str5 = enterMethod;
                }
                LIZJ.put("enter_method", str5);
                if (!this.LLIIII) {
                    str4 = "other";
                }
                LIZJ.put("tab_name", str4);
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
                str5 = enterMethod2;
            }
            LIZJ2.put("enter_method", str5);
            if (!this.LLIIII) {
                str4 = "other";
            }
            LIZJ2.put("tab_name", str4);
            C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZJ2);
            return;
        }
        Yl(searchResultParam);
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
            str5 = enterMethod3;
        }
        LIZJ3.put("enter_method", str5);
        if (!this.LLIIII) {
            str4 = "other";
        }
        LIZJ3.put("tab_name", str4);
        C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZJ3);
        em(false);
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment
    public void Ll(boolean z) {
        super.Ll(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005b, code lost:
    
        if (r0 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0067, code lost:
    
        if (r8 != null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject Nl(X.C50948Jz6 r12) {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment.Nl(X.Jz6):org.json.JSONObject");
    }

    public final void Ql(GlobalDoodleConfig globalDoodleConfig) {
        boolean z;
        boolean z2;
        KEP kep;
        KEX LIZLLL;
        KEX LIZLLL2;
        KEX LIZLLL3;
        KEX LIZLLL4;
        if (globalDoodleConfig != null) {
            boolean z3 = false;
            if (o.LJ(globalDoodleConfig.getSearchChannel(), "tiktok_mall") || o.LJ(globalDoodleConfig.getSearchChannel(), "tiktok_ecom")) {
                z = true;
            } else {
                z = false;
            }
            this.LLI = z;
            if (globalDoodleConfig.getDisplayFilterBar() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (C50675Juh.LIZ && wl()) {
                SearchResultParam searchResultParam = this.LJLLILLLL;
                if ((searchResultParam == null || searchResultParam.getFilterOption() == null) && (kep = this.LJLLI) != null && (LIZLLL = kep.LIZLLL()) != null) {
                    LIZLLL.LIZ(false);
                }
                if (z2) {
                    if (this.LLI) {
                        KEP kep2 = this.LJLLI;
                        if (kep2 != null && (LIZLLL4 = kep2.LIZLLL()) != null) {
                            LIZLLL4.LIZIZ(true);
                        }
                        z3 = true;
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
                this.LJLILLLLZI = z3;
            }
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

    public final void Rl(LogPbBean logPbBean) {
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
            C3A5.LIZ.LJFF(imprId, logPbBean);
        }
    }

    public final void Yl(SearchResultParam param) {
        boolean z;
        String str;
        o.LJIIIZ(param, "param");
        this.LJLLILLLL = param;
        String keyword = param.getKeyword();
        o.LJIIIIZZ(keyword, "param.keyword");
        ((InterfaceC49816Jgq) this.LJLLLL.getValue()).LIZ(new C49814Jgo(keyword, 2));
        String sugHint = param.getSugHint();
        if (sugHint == null) {
            sugHint = "";
        }
        this.LJLLL = sugHint;
        String searchFrom = param.getSearchFrom();
        o.LJIIIIZZ(searchFrom, "param.searchFrom");
        this.LJLZ = searchFrom;
        this.LL = param.getNeedCorrect();
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
        Ml(str);
        if (o.LJ(this.LJZ, "channel_unknown")) {
            this.LJLJJI.setRecentRequestSearchSourceUnknown(true);
            C17N.LJJJJJL(this).j4(new C50407JqN());
        }
        if (o.LJ(this.LJLZ, "search_sug")) {
            param.getSugType();
        }
    }

    public void Zl(int i) {
        InterfaceC51365KDx LIZ;
        InterfaceC51365KDx LIZ2;
        C50287JoR c50287JoR;
        SearchResultParam searchResultParam;
        C50948Jz6 c50948Jz6 = null;
        if (KGI.LIZ() || ((searchResultParam = this.LJLLILLLL) != null && searchResultParam.getCapsuleWords() != null)) {
            Vl();
        }
        SearchResultParam searchResultParam2 = this.LJLLILLLL;
        this.LJLLJ = searchResultParam2;
        if (searchResultParam2 != null && searchResultParam2.getIsFilterFromSchema()) {
            SearchResultParam searchResultParam3 = this.LJLLILLLL;
            if (searchResultParam3 != null) {
                c50287JoR = searchResultParam3.getFilterOption();
            } else {
                c50287JoR = null;
            }
            this.LJLJI = c50287JoR;
            if (c50287JoR != null) {
                c50287JoR.setFromSchema(true);
            }
            SearchResultParam searchResultParam4 = this.LJLLILLLL;
            if (searchResultParam4 != null) {
                searchResultParam4.setIsFilterFromSchema(false);
            }
        }
        SearchResultParam searchResultParam5 = this.LJLLILLLL;
        if (searchResultParam5 != null) {
            searchResultParam5.setFilterOption(null);
        }
        SearchStateViewModel searchStateViewModel = this.LLIFFJFJJ;
        if (searchStateViewModel != null) {
            searchStateViewModel.setIsRefreshingData(true);
            Ml(cm());
            KEP kep = this.LJLLI;
            if (kep != null && (LIZ2 = kep.LIZ()) != null) {
                c50948Jz6 = LIZ2.ha();
            }
            dm(c50948Jz6);
            KEP kep2 = this.LJLLI;
            if (kep2 != null && (LIZ = kep2.LIZ()) != null) {
                LIZ.LIZLLL();
            }
            KFW kfw = this.LLIIJI;
            if (kfw != null) {
                kfw.LJ();
                return;
            }
            return;
        }
        o.LJIJI("mStateViewModel");
        throw null;
    }

    public void dm(C50948Jz6 c50948Jz6) {
        Ol().LIZ("changeSearchParams", Nl(c50948Jz6));
    }

    public final void em(boolean z) {
        KEA LIZIZ;
        InterfaceC51365KDx LIZ;
        KEP kep;
        InterfaceC51365KDx LIZ2;
        InterfaceC51365KDx LIZ3;
        KEX LIZLLL;
        if (isViewValid() && getUserVisibleHint() && this.LLF) {
            KEP kep2 = this.LJLLI;
            if (kep2 != null && (LIZLLL = kep2.LIZLLL()) != null) {
                LIZLLL.LIZJ(false);
            }
            if (this.LLFZ) {
                KEP kep3 = this.LJLLI;
                if (kep3 != null && (LIZ3 = kep3.LIZ()) != null && LIZ3.LJII(KE6.SEARCH_CLICK_MORE)) {
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
                Zl(z ? 1 : 0);
                this.LLFZ = false;
                KEP kep4 = this.LJLLI;
                if (kep4 != null && (LIZ = kep4.LIZ()) != null && LIZ.LJII(KE6.CLICK_MORE) && (kep = this.LJLLI) != null && (LIZ2 = kep.LIZ()) != null) {
                    LIZ2.LJIIJJI(KE6.CLICK_MORE);
                }
                KEP kep5 = this.LJLLI;
                if (kep5 == null || (LIZIZ = kep5.LIZIZ()) == null || this.LJLLLLLL != LIZIZ.LJIIIIZZ(KAK.TOP)) {
                    Tl();
                    this.LLII = System.currentTimeMillis();
                }
            } else {
                C50651JuJ c50651JuJ = C50652JuK.Companion;
                ActivityC45651qj mo49getActivity = mo49getActivity();
                c50651JuJ.getClass();
                C50431Jql LJFF2 = C50651JuJ.LJFF(mo49getActivity);
                if (LJFF2 != null) {
                    LJFF2.setLastShowingPageIndex(this.LJZL);
                }
                C17N.LJJJJJL(this).j4(new K1X(this.LJZL));
            }
            if (TextUtils.isEmpty(Jl())) {
                return;
            }
            C10K.LIZJ(new ACallableS111S0100000_8(this, 12));
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void hideLoadingBall(C46360IHk event) {
        o.LJIIIZ(event, "event");
        if ((o.LJ(event.LJLIL, "vertical-sounds") || o.LJ(event.LJLIL, "vertical-shopping") || o.LJ(event.LJLIL, "vertical-poi") || o.LJ(event.LJLIL, "vertical-store")) && isViewValid()) {
            LJIJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        KEP kep;
        KEW LIZJ;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("search_key");
            o.LJII(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.model.SearchResultParam");
            Yl((SearchResultParam) serializable);
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) ViewModelProviders.of(mo49getActivity).get(SearchStateViewModel.class);
        o.LJIIIZ(searchStateViewModel, "<set-?>");
        this.LLIFFJFJJ = searchStateViewModel;
        searchStateViewModel.searchState.observe(this, new AObserverS76S0100000_8(this, 80));
        if (mo49getActivity() != null && (kep = this.LJLLI) != null && (LIZJ = kep.LIZJ()) != null) {
            LIZJ.LIZ(this.LJZL, this);
        }
        this.LJLJLJ.add(new KET(this));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void setRequestSuccessConfig(C50143Jm7 event) {
        o.LJIIIZ(event, "event");
        Ql(event.LJLIL);
        Rl(event.LJLILLLLZI);
        Sl();
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        InterfaceC51365KDx LIZ;
        InterfaceC51365KDx LIZ2;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-4723282657967196386");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/result/common/core/ui/fragment/EcDynamicSearchFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/result/common/core/ui/fragment/EcDynamicSearchFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        em(true);
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
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/result/common/core/ui/fragment/EcDynamicSearchFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        SearchResultParam searchResultParam;
        SearchResultParam searchResultParam2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.jem);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.search_center_loading_view)");
        this.LLFII = (C223338pd) findViewById;
        initView();
        if (bundle == null && (searchResultParam2 = this.LJLLILLLL) != null) {
            Gl(searchResultParam2);
        }
        EventBus.LIZJ().LJIILJJIL(this);
        Ml(cm());
        C37831Et1.LIZIZ(C39469FeL.class, null, 6);
        if (!KGI.LIZ() && ((searchResultParam = this.LJLLILLLL) == null || searchResultParam.getCapsuleWords() == null)) {
            Vl();
        }
        mo49getActivity();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                C223338pd c223338pd = this.LLFII;
                if (c223338pd != null) {
                    c223338pd.LIZIZ();
                } else {
                    o.LJIJI("centerLoadingView");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void Xl(SearchApiResult searchApiResult, String str, KAK searchType) {
        InterfaceC51365KDx LIZ;
        String imprId;
        InterfaceC51365KDx LIZ2;
        String str2;
        String str3;
        String str4;
        o.LJIIIZ(searchType, "searchType");
        Ol().LIZJ(str);
        LJIJ();
        KEP kep = this.LJLLI;
        String str5 = "";
        Long l = null;
        if (kep != null && (LIZ2 = kep.LIZ()) != null) {
            String Jl = Jl();
            LogPbBean logPbBean = searchApiResult.logPb;
            if (logPbBean == null || (str2 = logPbBean.getImprId()) == null) {
                str2 = "";
            }
            GlobalDoodleConfig globalDoodleConfig = searchApiResult.globalDoodleConfig;
            if (globalDoodleConfig != null) {
                str3 = globalDoodleConfig.getSearchChannel();
            } else {
                str3 = null;
            }
            GlobalDoodleConfig globalDoodleConfig2 = searchApiResult.globalDoodleConfig;
            if (globalDoodleConfig2 != null) {
                str4 = globalDoodleConfig2.getNewSource();
            } else {
                str4 = null;
            }
            BaseResponse.ServerTimeExtra serverTimeExtra = searchApiResult.extra;
            if (serverTimeExtra != null) {
                l = Long.valueOf(serverTimeExtra.now);
            }
            LIZ2.LJ(new LastSearch(Jl, str2, str3, str4, l));
        }
        Ql(searchApiResult.globalDoodleConfig);
        Rl(searchApiResult.logPb);
        Sl();
        SearchResultParam searchResultParam = this.LJLLILLLL;
        if (searchResultParam != null) {
            LogPbBean logPbBean2 = searchApiResult.logPb;
            if (logPbBean2 != null && (imprId = logPbBean2.getImprId()) != null) {
                str5 = imprId;
            }
            KEP kep2 = this.LJLLI;
            if (kep2 != null && (LIZ = kep2.LIZ()) != null) {
                LIZ.LJIIIZ(searchResultParam, str5, searchType);
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LLLLIILL;
        String str;
        C50948Jz6 searchEnterParam;
        ECSearchEntranceData ecSearchEntranceData;
        o.LJIIIZ(inflater, "inflater");
        if (C48054ItW.LIZ()) {
            LLLLIILL = C16880lQ.LLLLIILL(inflater.cloneInContext(getContext()), R.layout.aor, viewGroup, false);
        } else if (viewGroup != null) {
            LLLLIILL = C16880lQ.LLLLIILL(inflater.cloneInContext(viewGroup.getContext()), R.layout.aor, viewGroup, false);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
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
        View findViewById = LLLLIILL.findViewById(R.id.ck3);
        o.LJIIIIZZ(findViewById, "root.findViewById(R.id.dynamic_fragment)");
        this.LLIIIJ = (ViewGroup) findViewById;
        this.LLIIIZ = (KGP) LLLLIILL.findViewById(R.id.jfq);
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
