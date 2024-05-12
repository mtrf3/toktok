package com.ss.android.ugc.aweme.ecommerce.search.result.vertical;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C2L4;
import X.C3C5;
import X.C51218K8g;
import X.C51233K8v;
import X.C51363KDv;
import X.C55096Ljo;
import X.C55230Lly;
import X.C76800UCe;
import X.C76965UIn;
import X.C8VV;
import X.C90903hW;
import X.EF7;
import X.KAK;
import X.KE3;
import X.KFW;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class HalfVerticalAdapter extends AmeBaseFragment implements ISearchVerticalContext, C2L4 {
    public SearchResultParam LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final void aQ(KFW kfw) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final int getCurrentIndex() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final KE3 H2() {
        String str;
        String LJJIFFI;
        ICommonFeedApiService LIZ = CommonFeedApiService.LIZ();
        String str2 = "";
        if (LIZ == null || (str = LIZ.LJJIFFI()) == null) {
            str = "";
        }
        ICommonFeedApiService LIZ2 = CommonFeedApiService.LIZ();
        if (LIZ2 != null && (LJJIFFI = LIZ2.LJJIFFI()) != null) {
            str2 = LJJIFFI;
        }
        return new KE3(str, str2, 7);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final C51363KDv g8() {
        return new C51363KDv(null, null, null, null, null, null, null, null, "half_shop", null, C51233K8v.LIZ().LIZIZ(), 7935);
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(SearchVerticalScope.class);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C55096Ljo.LJIILL(C55230Lly.LIZJ(this, null), ISearchVerticalContext.class, null);
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        VerticalSearchAbility verticalSearchAbility = (VerticalSearchAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), VerticalSearchAbility.class, null);
        if (verticalSearchAbility != null) {
            verticalSearchAbility.tt(false);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        VerticalSearchAbility verticalSearchAbility = (VerticalSearchAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), VerticalSearchAbility.class, null);
        if (verticalSearchAbility != null) {
            verticalSearchAbility.tt(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final SearchResultParam k5() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        SearchResultParam searchResultParam;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("search_key");
            if (serializable instanceof SearchResultParam) {
                searchResultParam = (SearchResultParam) serializable;
            } else {
                searchResultParam = null;
            }
            this.LJLIL = searchResultParam;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), this, ISearchVerticalContext.class, null);
        if (o.LJ(EF7.LJIILIIL, "local_test")) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
            View view2 = (View) linkedHashMap.get(Integer.valueOf(R.id.c4_));
            if (view2 == null) {
                View view3 = getView();
                if (view3 != null && (view2 = view3.findViewById(R.id.c4_)) != null) {
                    linkedHashMap.put(Integer.valueOf(R.id.c4_), view2);
                } else {
                    view2 = null;
                }
            }
            view2.setVisibility(0);
        }
        C8VV.LIZ(this, false, new AqS174S0100000_8(this, 25));
        C8VV.LIZ(this, false, new AqS174S0100000_8(this, 26));
        VerticalSearchAbility verticalSearchAbility = (VerticalSearchAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), VerticalSearchAbility.class, null);
        if (verticalSearchAbility != null) {
            verticalSearchAbility.refreshData();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext
    public final void Bf(String str, SearchApiResult apiResult, KAK searchTab) {
        String str2;
        String str3;
        String str4;
        o.LJIIIZ(apiResult, "apiResult");
        o.LJIIIZ(searchTab, "searchTab");
        C51218K8g LIZ = C51233K8v.LIZ();
        LogPbBean logPbBean = apiResult.logPb;
        Long l = null;
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
        }
        LIZ.LIZJ(new LastSearch(str, str2, str3, str4, l));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater.cloneInContext(getContext()), R.layout.ape, viewGroup, false);
        C29S c29s = null;
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
