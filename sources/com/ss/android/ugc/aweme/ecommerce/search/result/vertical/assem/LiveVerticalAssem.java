package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem;

import X.ActivityC45651qj;
import X.C141335gf;
import X.C199097rd;
import X.C212428Vi;
import X.C214298b3;
import X.C214528bQ;
import X.C2K0;
import X.C35613DyL;
import X.C36015EBn;
import X.C36033ECf;
import X.C3C5;
import X.C48658J7u;
import X.C50039JkR;
import X.C50865Jxl;
import X.C50948Jz6;
import X.C51240K9c;
import X.C51363KDv;
import X.C51394KFa;
import X.C51396KFc;
import X.C51413KFt;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65777Prh;
import X.C72818Shy;
import X.C76800UCe;
import X.C78461Uqn;
import X.C78926UyI;
import X.C78983UzD;
import X.C84763XOl;
import X.EnumC58928NAu;
import X.InterfaceC36553EWf;
import X.InterfaceC55102Lju;
import X.InterfaceC65350Pko;
import X.InterfaceC67352kd;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.KAK;
import X.KB1;
import X.KE3;
import X.KFN;
import X.KFR;
import X.KFV;
import X.KFW;
import X.KFY;
import X.KG1;
import X.KGI;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.TBT;
import Y.ARunnableS27S0200000_8;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.google.android.play.core.appupdate.u;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ab.RomaSchemaGroupSearchSettings;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.lynx.spark.core.ui.SearchBaseSparkView;
import com.ss.android.ugc.aweme.result.common.core.ui.LiveInnerFlowAbility;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class LiveVerticalAssem extends UIContentAssem implements VerticalSearchAbility, KG1, InterfaceC72822Si2, LiveInnerFlowAbility, InterfaceC55102Lju {
    public C50865Jxl LJLIL;
    public final Gson LJLILLLLZI;
    public final C214298b3 LJLJI;
    public KFW LJLJJI;
    public KFR LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJJLL;
        Integer valueOf = Integer.valueOf(R.id.jif);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(R.id.jif)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -1245798836 || hashCode == 482288883) {
            return this;
        }
        return null;
    }

    public LiveVerticalAssem() {
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        o.LJIIIIZZ(LIZ, "get().gson");
        this.LJLILLLLZI = LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(LiveVerticalViewModel.class);
        this.LJLJI = new C214298b3(new AqS158S0100000_8((InterfaceC65350Pko) LIZ2, 63), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C51413KFt.INSTANCE, LIZ2);
    }

    public final LiveVerticalViewModel v3() {
        return (LiveVerticalViewModel) this.LJLJI.getValue();
    }

    @Override // X.KG1
    public final boolean X1() {
        return o.LJ(v3().LJLJI, Boolean.TRUE);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        this.LJLJJL = new KFR(KAK.ECOM_LIVE);
        v3().LJLLILLLL = this.LJLJJL;
        v3().LJLLI = C55096Ljo.LJIIZILJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C50865Jxl c50865Jxl = this.LJLIL;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = null;
        if (c50865Jxl != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50865Jxl.LJIIJ;
        }
        if ((sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJFF(true);
        }
        KFR kfr = this.LJLJJL;
        if (kfr != null) {
            kfr.LJ("search_exit");
        }
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8W0
    public final void onPause() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        super.onPause();
        C50865Jxl c50865Jxl = this.LJLIL;
        if (c50865Jxl != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50865Jxl.LJIIJ) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.post(new ARunnableS27S0200000_8(this, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, 14));
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        super.onResume();
        C50865Jxl c50865Jxl = this.LJLIL;
        if (c50865Jxl != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50865Jxl.LJIIJ) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.post(new ARunnableS27S0200000_8(this, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, 15));
        }
    }

    @Override // X.C8W0
    public final void onStart() {
        super.onStart();
        C72818Shy.LIZLLL("ec_search_result_page_scroll_to_top", this);
    }

    @Override // X.C8W0
    public final void onStop() {
        super.onStop();
        C72818Shy.LJII("ec_search_result_page_scroll_to_top", this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void refreshData() {
        SearchResultParam k5;
        JSONObject jSONObject;
        C51363KDv c51363KDv;
        String str;
        int i;
        Map map;
        String str2;
        String productList;
        if (KGI.LIZ()) {
            C50865Jxl c50865Jxl = this.LJLIL;
            if (c50865Jxl == null) {
                return;
            } else {
                x3(c50865Jxl);
            }
        }
        KFR kfr = this.LJLJJL;
        if (kfr != null) {
            kfr.LIZIZ = System.currentTimeMillis();
        }
        KFW kfw = this.LJLJJI;
        if (kfw != null) {
            kfw.LJ();
        }
        Object obj = null;
        ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchVerticalContext.class, null);
        if (iSearchVerticalContext == null || (k5 = iSearchVerticalContext.k5()) == null) {
            return;
        }
        VerticalParamsBuildAbility verticalParamsBuildAbility = (VerticalParamsBuildAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), VerticalParamsBuildAbility.class, null);
        if (verticalParamsBuildAbility != null) {
            jSONObject = verticalParamsBuildAbility.jr();
        } else {
            jSONObject = null;
        }
        ISearchVerticalContext iSearchVerticalContext2 = (ISearchVerticalContext) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchVerticalContext.class, null);
        if (iSearchVerticalContext2 != null) {
            c51363KDv = iSearchVerticalContext2.g8();
        } else {
            c51363KDv = null;
        }
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
                return;
            }
        }
        jSONObject.put("source", "mall_live_tab");
        jSONObject.put("search_channel", "tiktok_mall_live_tab");
        C35613DyL attachProductsInfo = k5.getAttachProductsInfo();
        if (attachProductsInfo != null && (productList = attachProductsInfo.getProductList()) != null) {
            jSONObject.put("attach_products", productList);
        }
        jSONObject.put("traffic_source_list", C51240K9c.LIZ(k5.getSearchEnterParam()));
        JSONObject jSONObject2 = new JSONObject();
        if (c51363KDv != null && (str2 = c51363KDv.LIZJ) != null) {
            jSONObject2.put("enter_product_id", str2);
        }
        if (KB1.LJII(KB1.LIZ(k5.getSearchEnterParam()))) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject2.put("is_ecom_search", str);
        if (c51363KDv != null) {
            String str3 = c51363KDv.LIZLLL;
            if (str3 != null) {
                jSONObject2.put("source_product_id", str3);
            }
            String str4 = c51363KDv.LJ;
            if (str4 != null) {
                jSONObject2.put("click_recom_search_entrance", str4);
            }
            String str5 = c51363KDv.LJIIJJI;
            if (str5 != null) {
                jSONObject2.put("enter_group_id", str5);
            }
            String str6 = c51363KDv.LJIIL;
            if (str6 != null) {
                jSONObject2.put("product_panel_type", str6);
            }
        }
        C50948Jz6 searchEnterParam = k5.getSearchEnterParam();
        if (searchEnterParam != null) {
            obj = searchEnterParam.obtainEcLogData("ec_result_extra_log_params");
        }
        if (C65777Prh.LJII(obj) && (map = (Map) obj) != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
        }
        jSONObject.put("extraLogParams", jSONObject2.toString());
        Map<String, Object> ecomRecomSearchParamMap = k5.getEcomRecomSearchParamMap();
        if (ecomRecomSearchParamMap != null) {
            for (Map.Entry<String, Object> entry2 : ecomRecomSearchParamMap.entrySet()) {
                jSONObject.put(entry2.getKey(), entry2.getValue());
            }
        }
        String trendingWordsId = k5.getTrendingWordsId();
        if (trendingWordsId != null) {
            jSONObject.put("trending_words_id", trendingWordsId);
        }
        long j = 1000;
        String valueOf = String.valueOf(System.currentTimeMillis() / j);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String optString = jSONObject.optString("keyword");
        o.LJIIIIZZ(optString, "baseParams.optString(\"keyword\")");
        linkedHashMap.put("query", optString);
        linkedHashMap.put("channel", "tiktok_mall_live_tab");
        String optString2 = jSONObject.optString("search_type");
        o.LJIIIIZZ(optString2, "baseParams.optString(\"search_type\")");
        linkedHashMap.put("search_method", optString2);
        linkedHashMap.put("timestamp", Integer.valueOf((int) (System.currentTimeMillis() / j)));
        C36033ECf.LIZLLL("search_action", valueOf, linkedHashMap);
        String optString3 = jSONObject.optString("enter_from");
        o.LJIIIIZZ(optString3, "baseParams.optString(\"enter_from\")");
        if (optString3.length() == 0) {
            KFR kfr2 = this.LJLJJL;
            if (kfr2 != null) {
                kfr2.LJ("page_error");
                return;
            }
            return;
        }
        KFR kfr3 = this.LJLJJL;
        if (kfr3 != null) {
            String optString4 = jSONObject.optString("enter_method");
            o.LJIIIIZZ(optString4, "baseParams.optString(\"enter_method\")");
            String optString5 = jSONObject.optString("enter_from");
            o.LJIIIIZZ(optString5, "baseParams.optString(\"enter_from\")");
            if (C36015EBn.LIZ()) {
                i = 12;
            } else {
                i = 6;
            }
            KFR.LIZ(kfr3, optString4, optString5, i);
        }
        KFR kfr4 = this.LJLJJL;
        if (kfr4 != null) {
            kfr4.LIZLLL(k5.getSearchEnterParam());
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("searchInitParams", jSONObject);
        jSONObject.put("tab_name", "live");
        C48658J7u.LIZIZ("rd_ec_fe_params", jSONObject);
        C50865Jxl c50865Jxl2 = this.LJLIL;
        if (c50865Jxl2 != null) {
            String jSONObject4 = jSONObject3.toString();
            o.LJIIIIZZ(jSONObject4, "searchInitParams.toString()");
            c50865Jxl2.LIZJ(jSONObject4);
        }
        v3().hv0(k5, jSONObject);
    }

    @Override // X.KG1
    public final void LJLLJ(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", str);
            C50865Jxl c50865Jxl = this.LJLIL;
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
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            str = Integer.valueOf(LIZ.hashCode()).toString();
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
                KFW kfw = this.LJLJJI;
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

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C50865Jxl c50865Jxl;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Context context = getContext();
        if (context != null) {
            c50865Jxl = new C50865Jxl(context, C212428Vi.LIZLLL(this));
        } else {
            c50865Jxl = null;
        }
        this.LJLIL = c50865Jxl;
        if (c50865Jxl != null) {
            ViewGroup search_vertical_page = (ViewGroup) _$_findCachedViewById(R.id.jif);
            o.LJIIIIZZ(search_vertical_page, "search_vertical_page");
            c50865Jxl.LIZLLL(0, new ViewGroup.LayoutParams(-1, -1), search_vertical_page);
        }
        _$_findCachedViewById(R.id.jif).setVisibility(0);
        if (!KGI.LIZ()) {
            C50865Jxl c50865Jxl2 = this.LJLIL;
            if (c50865Jxl2 == null) {
                return;
            } else {
                x3(c50865Jxl2);
            }
        }
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.KFi
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C35651Dyx) obj).LJLILLLLZI;
            }
        }, null, new AqS174S0100000_8(this, 27), null, new AqS174S0100000_8(this, 28), 10, null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void tt(boolean z) {
        int i;
        KE3 H2;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("active", i);
            if (z) {
                String str = null;
                ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchVerticalContext.class, null);
                if (iSearchVerticalContext != null && (H2 = iSearchVerticalContext.H2()) != null) {
                    str = H2.LIZ;
                }
                jSONObject.put("from_search_subtab", str);
            }
            C50865Jxl c50865Jxl = this.LJLIL;
            if (c50865Jxl != null) {
                c50865Jxl.LIZ("changePageActive", jSONObject);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }

    public final void x3(KFY kfy) {
        int i;
        String str;
        SearchBaseSparkView searchBaseSparkView;
        if ((kfy instanceof SearchBaseSparkView) && (searchBaseSparkView = (SearchBaseSparkView) kfy) != null) {
            searchBaseSparkView.LIZLLL = new KFV(this);
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            i = LIZ.hashCode();
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

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.LiveInnerFlowAbility
    public final void Fc(EnterRoomConfig enterRoomConfig, String str) {
        HashMap<String, String> hashMap;
        if (C212428Vi.LIZ(this) != null) {
            LiveVerticalViewModel v3 = v3();
            v3.getClass();
            C51394KFa c51394KFa = new C51394KFa(this, Long.valueOf(v3.LJLJJLL));
            v3.LJLJLLL = String.valueOf(c51394KFa.hashCode());
            EnterRoomConfig.ECWrapData eCWrapData = enterRoomConfig.mECData;
            if (eCWrapData != null) {
                hashMap = eCWrapData.ecCommonExtraParam;
            } else {
                hashMap = null;
            }
            v3.LJLJLJ = hashMap;
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            C78461Uqn LJIILL = LiveOuterService.LJJJLL().LJIILL();
            Iterator it = ((ArrayList) v3.LJLILLLLZI).iterator();
            while (it.hasNext()) {
                Aweme aweme = (Aweme) it.next();
                if (o.LJ(aweme.getAid(), str)) {
                    LJIILL.LIZJ(LJIIIIZZ, enterRoomConfig, aweme, v3.LJLILLLLZI, c51394KFa, v3.LJLLJ);
                    return;
                }
            }
            LJIILL.LIZJ(LJIIIIZZ, enterRoomConfig, (Aweme) ListProtector.get(v3.LJLILLLLZI, 0), v3.LJLILLLLZI, c51394KFa, v3.LJLLJ);
        }
    }

    @Override // X.KG1
    public final void H0(C50039JkR c50039JkR, Long l) {
        if (l != null) {
            if (l.longValue() != v3().LJLJJLL) {
                List<Aweme> list = v3().LJLJL;
                if (list != null) {
                    c50039JkR.LIZ(list, v3().LJLLJ);
                    v3().LJLJL = null;
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                }
                v3().LJLJJI = c50039JkR;
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "loadMore");
            C50865Jxl c50865Jxl = this.LJLIL;
            if (c50865Jxl != null) {
                c50865Jxl.LIZ("needUpdateData", jSONObject);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        v3().LJLJJI = c50039JkR;
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.LiveInnerFlowAbility
    public final Object rk0(String str, KFN kfn, CompletionBlock<InterfaceC36553EWf> completionBlock, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        if (C212428Vi.LIZ(this) != null) {
            LiveVerticalViewModel v3 = v3();
            SearchResultParam searchResultParam = null;
            ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchVerticalContext.class, null);
            if (iSearchVerticalContext != null) {
                searchResultParam = iSearchVerticalContext.k5();
            }
            Object iv0 = v3.iv0(searchResultParam, str, kfn, completionBlock, interfaceC67352kd);
            if (iv0 == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return iv0;
            }
            return C76800UCe.LIZ;
        }
        return C76800UCe.LIZ;
    }
}
