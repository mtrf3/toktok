package com.ss.android.ugc.aweme.result.common.core.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C199097rd;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C29S;
import X.C36015EBn;
import X.C36033ECf;
import X.C37593EpB;
import X.C37831Et1;
import X.C3C5;
import X.C48658J7u;
import X.C50039JkR;
import X.C50865Jxl;
import X.C51396KFc;
import X.C51414KFu;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C71868SIm;
import X.C72818Shy;
import X.C76800UCe;
import X.C78926UyI;
import X.C8YN;
import X.C90903hW;
import X.InterfaceC65784Pro;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.KFQ;
import X.KFW;
import X.KFX;
import X.KFY;
import X.KG1;
import X.TBT;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletRechargeExchangeStrengthen;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.ab.RomaSchemaGroupSearchSettings;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lynx.spark.core.ui.SearchBaseSparkView;
import com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultLiveViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class EcDynamicSearchLiveFragment extends EcSearchBaseRefactorFragment implements KG1, InterfaceC72822Si2 {
    public final C214298b3 LLFFF;
    public final Map<Integer, View> LLFII = new LinkedHashMap();
    public final C62822Ol8 LLFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 100));

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFII).clear();
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLFII;
        Integer valueOf = Integer.valueOf(R.id.ck3);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.ck3)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public EcDynamicSearchLiveFragment() {
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(this, 101);
        AqS158S0100000_8 aqS158S0100000_82 = new AqS158S0100000_8(this, 102);
        this.LLFFF = new C214298b3(C65352Pkq.LIZ(EcSearchResultLiveViewModel.class), aqS158S0100000_8, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), aqS158S0100000_82, C51414KFu.INSTANCE, (InterfaceC65784Pro) null, 384);
    }

    public final EcSearchResultLiveViewModel Ll() {
        return (EcSearchResultLiveViewModel) this.LLFFF.getValue();
    }

    @Override // X.KG1
    public final boolean X1() {
        return o.LJ(Ll().LJLJL, Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C72818Shy.LJII("ec_search_result_page_scroll_to_top", this);
        C55096Ljo.LJIILL(C55230Lly.LIZJ(this, null), LiveInnerFlowAbility.class, null);
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragment
    public final void refreshData() {
        int i;
        super.refreshData();
        EcSearchResultLiveViewModel Ll = Ll();
        SearchResultParam searchResultParam = this.LJZI;
        if (searchResultParam == null) {
            return;
        }
        Ll.getClass();
        try {
            JSONObject LIZ = Ll.LJLIL.LIZ(searchResultParam);
            LIZ.put("source", "mall_live_tab");
            LIZ.put("search_channel", "tiktok_mall_live_tab");
            long j = 1000;
            String valueOf = String.valueOf(System.currentTimeMillis() / j);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String optString = LIZ.optString("keyword");
            o.LJIIIIZZ(optString, "baseParams.optString(\"keyword\")");
            linkedHashMap.put("query", optString);
            linkedHashMap.put("channel", "tiktok_mall_live_tab");
            String optString2 = LIZ.optString("search_type");
            o.LJIIIIZZ(optString2, "baseParams.optString(\"search_type\")");
            linkedHashMap.put("search_method", optString2);
            linkedHashMap.put("timestamp", Integer.valueOf((int) (System.currentTimeMillis() / j)));
            C36033ECf.LIZLLL("search_action", valueOf, linkedHashMap);
            String optString3 = LIZ.optString("enter_from");
            o.LJIIIIZZ(optString3, "baseParams.optString(\"enter_from\")");
            if (optString3.length() == 0) {
                KFQ kfq = Ll.LJLJJI;
                if (kfq != null) {
                    kfq.LJ("page_error");
                    return;
                }
                return;
            }
            KFQ kfq2 = Ll.LJLJJI;
            if (kfq2 != null) {
                String optString4 = LIZ.optString("enter_method");
                o.LJIIIIZZ(optString4, "baseParams.optString(\"enter_method\")");
                String optString5 = LIZ.optString("enter_from");
                o.LJIIIIZZ(optString5, "baseParams.optString(\"enter_from\")");
                if (C36015EBn.LIZ()) {
                    i = 12;
                } else {
                    i = 6;
                }
                KFQ.LIZ(kfq2, optString4, optString5, i);
            }
            KFQ kfq3 = Ll.LJLJJI;
            if (kfq3 != null) {
                kfq3.LIZLLL();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("searchInitParams", LIZ);
            LIZ.put("tab_name", "live");
            LIZ.put("type", LiveWalletRechargeExchangeStrengthen.DEFAULT);
            C48658J7u.LIZIZ("rd_ec_fe_params", LIZ);
            Ll.setState(new AqS172S0100000_6(jSONObject, 55));
            Ll.hv0(searchResultParam);
        } catch (Exception e) {
            Ll.setState(new AqS172S0100000_6(e, 56));
        }
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragment
    public final void Il(KFY kfy) {
        int i;
        String str;
        SearchBaseSparkView searchBaseSparkView;
        if ((kfy instanceof SearchBaseSparkView) && (searchBaseSparkView = (SearchBaseSparkView) kfy) != null) {
            searchBaseSparkView.LIZLLL = new KFX(this);
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            i = mo49getActivity.hashCode();
        } else {
            i = 0;
        }
        String valueOf = String.valueOf(i);
        try {
            Uri.Builder buildUpon = UriProtector.parse(RomaSchemaGroupSearchSettings.LIZ().romaSchemaPageLiveTab).buildUpon();
            o.LJIIIIZZ(buildUpon, "parse(schema).buildUpon()");
            if (valueOf == null) {
                valueOf = "";
            }
            buildUpon.appendQueryParameter("container_unique_id", valueOf);
            buildUpon.appendQueryParameter("use_forest", "1");
            buildUpon.appendQueryParameter("enable_memory_cache", "1");
            buildUpon.appendQueryParameter("enable_code_cache", "1");
            str = buildUpon.toString();
            o.LJIIIIZZ(str, "{\n            val schema…lder.toString()\n        }");
        } catch (Throwable unused) {
            str = "sslocal://lynxview?url=https%3A%2F%2Flf77-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_live_tab%2Fpages%2Fsearch-live-tab%2Ftemplate.js&use_spark=1&use_new_container=1";
        }
        DynamicPatch dynamicPatch = new DynamicPatch();
        dynamicPatch.schema = str;
        C51396KFc.LIZIZ(kfy, dynamicPatch, null, 6);
    }

    @Override // X.KG1
    public final void LJLLJ(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", str);
            C50865Jxl c50865Jxl = this.LJLLL;
            if (c50865Jxl != null) {
                c50865Jxl.LIZ("leaveInnerFlow", jSONObject);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        Object obj;
        String LJJIJIL;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            str = Integer.valueOf(mo49getActivity.hashCode()).toString();
        } else {
            str = null;
        }
        InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
        String str2 = "";
        if (interfaceC78280Uns != null && (LJJIJIL = u.LJJIJIL(interfaceC78280Uns, "container_unique_id", "")) != null) {
            str2 = LJJIJIL;
        }
        if (!o.LJ(str, str2)) {
            return;
        }
        try {
            if (o.LJ(c199097rd.LJLIL, "ec_search_result_page_scroll_to_top")) {
                KFW kfw = this.LL;
                if (kfw != null) {
                    kfw.LJ();
                }
                obj = Integer.valueOf(Log.i("SearchFragment", "live page receive js event(ec_search_result_page_scroll_to_top)"));
            } else {
                obj = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(obj);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // X.KG1
    public final void H0(C50039JkR c50039JkR, Long l) {
        if (l != null) {
            if (l.longValue() != Ll().LJLL) {
                List<Aweme> list = Ll().LJLLI;
                if (list != null) {
                    c50039JkR.LIZ(list, Ll().LJLLLL);
                    Ll().LJLLI = null;
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                }
                Ll().LJLJLJ = c50039JkR;
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "loadMore");
            C50865Jxl c50865Jxl = this.LJLLL;
            if (c50865Jxl != null) {
                c50865Jxl.LIZ("needUpdateData", jSONObject);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        Ll().LJLJLJ = c50039JkR;
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        C37831Et1.LIZIZ(C71868SIm.class, null, 6);
        C37831Et1.LIZIZ(C37593EpB.class, null, 6);
        super.onViewCreated(view, bundle);
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), (EcDynamicSearchLiveFragment$fetchLoadMoreData$2$1) this.LLFF.getValue(), LiveInnerFlowAbility.class, null);
        C8YN.LJII(this, Ll(), new TBT() { // from class: X.KFg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C35651Dyx) obj).LJLIL;
            }
        }, null, new AqS190S0100000_8(this, 13), 6);
        AssemViewModel.asyncSubscribe$default(Ll(), new TBT() { // from class: X.KFh
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C35651Dyx) obj).LJLILLLLZI;
            }
        }, null, new AqS174S0100000_8(this, 53), null, new AqS174S0100000_8(this, 54), 10, null);
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C72818Shy.LIZLLL("ec_search_result_page_scroll_to_top", this);
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(onCreateView instanceof View)) {
            onCreateView = null;
        }
        if (onCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(onCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(onCreateView, this);
                C10A.LIZIZ(onCreateView, this);
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
        return onCreateView;
    }
}
