package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem;

import X.ActivityC45651qj;
import X.C00F;
import X.C141335gf;
import X.C199097rd;
import X.C212428Vi;
import X.C214298b3;
import X.C214528bQ;
import X.C2K0;
import X.C3C5;
import X.C45804HyK;
import X.C47261Igj;
import X.C48658J7u;
import X.C50865Jxl;
import X.C50948Jz6;
import X.C51240K9c;
import X.C51363KDv;
import X.C51419KFz;
import X.C55096Ljo;
import X.C65232Piu;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72818Shy;
import X.C76800UCe;
import X.C770830u;
import X.C78926UyI;
import X.EnumC51281KAr;
import X.EnumC51287KAx;
import X.InterfaceC55102Lju;
import X.InterfaceC65350Pko;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.KAK;
import X.KB1;
import X.KFW;
import X.KG5;
import X.KGI;
import X.KGL;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.T2R;
import X.TBT;
import X.WM7;
import X.Z9N;
import Y.ARunnableS27S0200000_8;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.play.core.appupdate.u;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ab.RomaSchemaGroupSearchSettings;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.lynx.core.model.DynamicData;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchStoreVM;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class StoreVerticalAssem extends UIContentAssem implements VerticalSearchAbility, InterfaceC72822Si2, InterfaceC55102Lju {
    public KFW LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final Gson LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public boolean LJLJJLL;
    public JSONObject LJLJL;
    public final String LJLJLJ;
    public String LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public long LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public C50865Jxl LJLLLL;
    public final Map<String, Long> LJLLLLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLZ;
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
        if (str.hashCode() != -1245798836) {
            return null;
        }
        return this;
    }

    public StoreVerticalAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(DynamicSearchStoreVM.class);
        this.LJLILLLLZI = new C214298b3(new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 67), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), C51419KFz.INSTANCE, LIZ);
        this.LJLJI = GsonHolder.LIZLLL().LIZ();
        this.LJLJJLL = true;
        this.LJLJLJ = "";
        this.LJLJLLL = "";
        this.LJLLLLLL = new LinkedHashMap();
    }

    public final void A3() {
        String str;
        String str2;
        String str3;
        Activity activity;
        int i;
        String str4;
        C51363KDv g8;
        SearchResultParam v3 = v3();
        if (v3 != null) {
            str = v3.getKeyword();
        } else {
            str = null;
        }
        SearchResultParam v32 = v3();
        if (v32 != null) {
            str2 = v32.getEnterMethod();
        } else {
            str2 = null;
        }
        ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchVerticalContext.class, null);
        if (iSearchVerticalContext != null && (g8 = iSearchVerticalContext.g8()) != null) {
            str3 = g8.LJIILIIL;
        } else {
            str3 = null;
        }
        Context context = getContext();
        if (context != null) {
            activity = C45804HyK.LJIJJ(context);
        } else {
            activity = null;
        }
        if (activity != null) {
            i = activity.hashCode();
        } else {
            i = 0;
        }
        String valueOf = String.valueOf(i);
        try {
            Uri.Builder buildUpon = UriProtector.parse(RomaSchemaGroupSearchSettings.LIZ().romaSchemaPageStoreTab).buildUpon();
            o.LJIIIIZZ(buildUpon, "parse(schema).buildUpon()");
            Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("keyword", str).appendQueryParameter("search_context", str3).appendQueryParameter("search_source", str2);
            if (valueOf == null) {
                valueOf = "";
            }
            appendQueryParameter.appendQueryParameter("container_unique_id", valueOf);
            buildUpon.appendQueryParameter("use_forest", "1");
            buildUpon.appendQueryParameter("enable_memory_cache", "1");
            buildUpon.appendQueryParameter("enable_code_cache", "1");
            str4 = buildUpon.toString();
            o.LJIIIIZZ(str4, "{\n            val schema…lder.toString()\n        }");
        } catch (Throwable unused) {
            str4 = "sslocal://webcast_lynxview?use_new_container=1&url=https%3A%2F%2Flf77-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_store_tab%2Fpages%2Fstore-search-tab-page.js&use_spark=1";
        }
        try {
            Uri.Builder buildUpon2 = UriProtector.parse(str4).buildUpon();
            buildUpon2.appendQueryParameter("hasFilterPanel", "1");
            String builder = buildUpon2.toString();
            o.LJIIIIZZ(builder, "builder.toString()");
            str4 = builder;
        } catch (Exception unused2) {
        }
        DynamicPatch dynamicPatch = new DynamicPatch();
        dynamicPatch.schema = str4;
        List LJJIJIL = C47261Igj.LJJIJIL(new DynamicData(0, dynamicPatch, 1, null));
        C50865Jxl c50865Jxl = this.LJLLLL;
        if (c50865Jxl != null) {
            c50865Jxl.LJ(KG5.LJLIL, LJJIJIL);
        }
    }

    public final C50948Jz6 Wa0() {
        SearchResultParam v3 = v3();
        if (v3 != null) {
            return v3.getSearchEnterParam();
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C50865Jxl c50865Jxl = this.LJLLLL;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = null;
        if (c50865Jxl != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50865Jxl.LJIIJ;
        }
        if ((sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(WM7.SCENE_SERVICE, "search_exit");
        jSONObject.put("is_native_request", true);
        jSONObject.put("trace_type", 0);
        jSONObject.put("request_count", this.LJLL);
        jSONObject.put("native_request_count", this.LJLLI);
        jSONObject.put("enter_method", this.LJLJLJ);
        jSONObject.put("has_result", this.LJLLJ ? 1 : 0);
        jSONObject.put("exit_duration", System.currentTimeMillis() - this.LJLLILLLL);
        jSONObject.put("enter_from", this.LJLJLLL);
        jSONObject.put("visiable", this.LJLLL ? 1 : 0);
        jSONObject.put("null_type", 0);
        jSONObject.put("tab_name", KAK.STORE.getTabName());
        C48658J7u.LIZIZ("rd_ec_search_request_trace", jSONObject);
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
        C50865Jxl c50865Jxl = this.LJLLLL;
        if (c50865Jxl != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50865Jxl.LJIIJ) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.post(new ARunnableS27S0200000_8(this, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, 20));
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        super.onResume();
        C50865Jxl c50865Jxl = this.LJLLLL;
        if (c50865Jxl != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50865Jxl.LJIIJ) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.post(new ARunnableS27S0200000_8(this, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, 21));
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

    /* JADX WARN: Removed duplicated region for block: B:152:0x035a A[Catch: Exception -> 0x047f, TryCatch #0 {Exception -> 0x047f, blocks: (B:106:0x0295, B:110:0x02a5, B:112:0x02b1, B:114:0x02b9, B:116:0x02bd, B:117:0x02c7, B:119:0x02cd, B:120:0x02d3, B:122:0x02d7, B:123:0x02dd, B:125:0x02e1, B:126:0x02e7, B:129:0x02ff, B:130:0x0305, B:132:0x0309, B:133:0x030f, B:135:0x0313, B:136:0x0319, B:137:0x0326, B:139:0x032f, B:141:0x0335, B:143:0x0339, B:145:0x0348, B:147:0x034e, B:149:0x0352, B:150:0x0356, B:152:0x035a, B:153:0x035e, B:155:0x036d, B:157:0x0373, B:159:0x0377, B:161:0x038d, B:163:0x039b, B:165:0x03a1, B:167:0x03a5, B:168:0x03b2, B:172:0x03e1, B:174:0x03f8, B:177:0x0404, B:179:0x0470, B:180:0x0473, B:187:0x03aa, B:189:0x03ae, B:192:0x037f, B:194:0x0383, B:203:0x029f), top: B:105:0x0295 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x036d A[Catch: Exception -> 0x047f, TryCatch #0 {Exception -> 0x047f, blocks: (B:106:0x0295, B:110:0x02a5, B:112:0x02b1, B:114:0x02b9, B:116:0x02bd, B:117:0x02c7, B:119:0x02cd, B:120:0x02d3, B:122:0x02d7, B:123:0x02dd, B:125:0x02e1, B:126:0x02e7, B:129:0x02ff, B:130:0x0305, B:132:0x0309, B:133:0x030f, B:135:0x0313, B:136:0x0319, B:137:0x0326, B:139:0x032f, B:141:0x0335, B:143:0x0339, B:145:0x0348, B:147:0x034e, B:149:0x0352, B:150:0x0356, B:152:0x035a, B:153:0x035e, B:155:0x036d, B:157:0x0373, B:159:0x0377, B:161:0x038d, B:163:0x039b, B:165:0x03a1, B:167:0x03a5, B:168:0x03b2, B:172:0x03e1, B:174:0x03f8, B:177:0x0404, B:179:0x0470, B:180:0x0473, B:187:0x03aa, B:189:0x03ae, B:192:0x037f, B:194:0x0383, B:203:0x029f), top: B:105:0x0295 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f8 A[Catch: Exception -> 0x047f, TryCatch #0 {Exception -> 0x047f, blocks: (B:106:0x0295, B:110:0x02a5, B:112:0x02b1, B:114:0x02b9, B:116:0x02bd, B:117:0x02c7, B:119:0x02cd, B:120:0x02d3, B:122:0x02d7, B:123:0x02dd, B:125:0x02e1, B:126:0x02e7, B:129:0x02ff, B:130:0x0305, B:132:0x0309, B:133:0x030f, B:135:0x0313, B:136:0x0319, B:137:0x0326, B:139:0x032f, B:141:0x0335, B:143:0x0339, B:145:0x0348, B:147:0x034e, B:149:0x0352, B:150:0x0356, B:152:0x035a, B:153:0x035e, B:155:0x036d, B:157:0x0373, B:159:0x0377, B:161:0x038d, B:163:0x039b, B:165:0x03a1, B:167:0x03a5, B:168:0x03b2, B:172:0x03e1, B:174:0x03f8, B:177:0x0404, B:179:0x0470, B:180:0x0473, B:187:0x03aa, B:189:0x03ae, B:192:0x037f, B:194:0x0383, B:203:0x029f), top: B:105:0x0295 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0470 A[Catch: Exception -> 0x047f, TryCatch #0 {Exception -> 0x047f, blocks: (B:106:0x0295, B:110:0x02a5, B:112:0x02b1, B:114:0x02b9, B:116:0x02bd, B:117:0x02c7, B:119:0x02cd, B:120:0x02d3, B:122:0x02d7, B:123:0x02dd, B:125:0x02e1, B:126:0x02e7, B:129:0x02ff, B:130:0x0305, B:132:0x0309, B:133:0x030f, B:135:0x0313, B:136:0x0319, B:137:0x0326, B:139:0x032f, B:141:0x0335, B:143:0x0339, B:145:0x0348, B:147:0x034e, B:149:0x0352, B:150:0x0356, B:152:0x035a, B:153:0x035e, B:155:0x036d, B:157:0x0373, B:159:0x0377, B:161:0x038d, B:163:0x039b, B:165:0x03a1, B:167:0x03a5, B:168:0x03b2, B:172:0x03e1, B:174:0x03f8, B:177:0x0404, B:179:0x0470, B:180:0x0473, B:187:0x03aa, B:189:0x03ae, B:192:0x037f, B:194:0x0383, B:203:0x029f), top: B:105:0x0295 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03ae A[Catch: Exception -> 0x047f, TryCatch #0 {Exception -> 0x047f, blocks: (B:106:0x0295, B:110:0x02a5, B:112:0x02b1, B:114:0x02b9, B:116:0x02bd, B:117:0x02c7, B:119:0x02cd, B:120:0x02d3, B:122:0x02d7, B:123:0x02dd, B:125:0x02e1, B:126:0x02e7, B:129:0x02ff, B:130:0x0305, B:132:0x0309, B:133:0x030f, B:135:0x0313, B:136:0x0319, B:137:0x0326, B:139:0x032f, B:141:0x0335, B:143:0x0339, B:145:0x0348, B:147:0x034e, B:149:0x0352, B:150:0x0356, B:152:0x035a, B:153:0x035e, B:155:0x036d, B:157:0x0373, B:159:0x0377, B:161:0x038d, B:163:0x039b, B:165:0x03a1, B:167:0x03a5, B:168:0x03b2, B:172:0x03e1, B:174:0x03f8, B:177:0x0404, B:179:0x0470, B:180:0x0473, B:187:0x03aa, B:189:0x03ae, B:192:0x037f, B:194:0x0383, B:203:0x029f), top: B:105:0x0295 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x037c  */
    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void refreshData() {
        /*
            Method dump skipped, instructions count: 1263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.StoreVerticalAssem.refreshData():void");
    }

    public final SearchResultParam v3() {
        ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchVerticalContext.class, null);
        if (iSearchVerticalContext == null) {
            return null;
        }
        return iSearchVerticalContext.k5();
    }

    public final String x3() {
        List<Object> list;
        JSONArray LJJII = T2R.LJJII(C51240K9c.LIZ(Wa0()));
        if (LJJII != null) {
            list = JsonExtKt.toList(LJJII);
        } else {
            list = null;
        }
        String str = "";
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                String obj = it.next().toString();
                if (str.length() == 0) {
                    str = obj;
                } else {
                    str = C00F.LIZIZ(str, ',', obj);
                }
            }
        }
        return str;
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
                KFW kfw = this.LJLIL;
                if (kfw != null) {
                    kfw.LJ();
                }
                obj = Integer.valueOf(Log.i("SearchFragment", "store page receive js event(ec_search_result_page_scroll_to_top)"));
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
        try {
            AssemViewModel.asyncSubscribe$default((DynamicSearchStoreVM) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.KFo
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C35649Dyv) obj).LJLIL;
                }
            }, null, new AqS174S0100000_8(this, 31), null, new AqS174S0100000_8(this, 32), 10, null);
        } catch (Exception unused) {
        }
        super.onViewCreated(view);
        Context context = getContext();
        if (context != null) {
            c50865Jxl = new C50865Jxl(context, C212428Vi.LIZLLL(this));
            c50865Jxl.LIZLLL = new KGL(this);
            c50865Jxl.LJIIJJI = new AqS158S0100000_8(this, 680);
        } else {
            c50865Jxl = null;
        }
        this.LJLLLL = c50865Jxl;
        if (c50865Jxl != null) {
            ViewGroup search_vertical_page = (ViewGroup) _$_findCachedViewById(R.id.jif);
            o.LJIIIIZZ(search_vertical_page, "search_vertical_page");
            c50865Jxl.LIZLLL(0, new ViewGroup.LayoutParams(-1, -1), search_vertical_page);
        }
        _$_findCachedViewById(R.id.jif).setVisibility(0);
        if (!KGI.LIZ()) {
            A3();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility
    public final void tt(boolean z) {
        this.LJLLL = z;
        JSONObject LIZLLL = C770830u.LIZLLL("active", z ? 1 : 0);
        C50865Jxl c50865Jxl = this.LJLLLL;
        if (c50865Jxl != null) {
            c50865Jxl.LIZ("changePageActive", LIZLLL);
        }
    }

    public final void E3(long j, String str) {
        int value;
        Object value2;
        String str2;
        Integer valueOf;
        C50948Jz6 searchEnterParam;
        C50948Jz6 Wa0 = Wa0();
        if (Wa0 != null) {
            value = Wa0.getEcSearchEntranceValue();
        } else {
            value = EnumC51281KAr.DEFAULT.getValue();
        }
        String str3 = null;
        if (Wa0 != null && Wa0.getEcSearchEntranceData() != null) {
            ECSearchEntranceData ecSearchEntranceData = Wa0.getEcSearchEntranceData();
            if (ecSearchEntranceData == null || (value2 = ecSearchEntranceData.getResultType()) == null) {
                value2 = EnumC51287KAx.TYPE_SHOP;
            }
        } else {
            value2 = KB1.LIZLLL(value).getValue();
        }
        JSONObject LIZJ = C65232Piu.LIZJ("phase", str);
        LIZJ.put("cost", String.valueOf(j));
        SearchResultParam v3 = v3();
        if (v3 != null && (searchEnterParam = v3.getSearchEnterParam()) != null) {
            str2 = searchEnterParam.getEnterSearchFrom();
        } else {
            str2 = null;
        }
        LIZJ.put("enter_search_from", str2);
        LIZJ.put("search_type", value2);
        SearchResultParam v32 = v3();
        if (v32 != null) {
            str3 = v32.getEnterMethod();
        }
        LIZJ.put("enter_method", str3);
        LIZJ.put("search_id", Z9N.LIZIZ.LIZ());
        LIZJ.put("tab_name", KAK.STORE.getTabName());
        C50948Jz6 Wa02 = Wa0();
        if (Wa02 != null && (valueOf = Integer.valueOf(Wa02.getEcSearchEntranceValue())) != null) {
            LIZJ.put("root_enter_from_type", valueOf.intValue());
        }
        C48658J7u.LIZIZ("rd_ec_search_page_load_detail", LIZJ);
    }

    public final void C3(SearchApiResult searchApiResult, String str, KAK searchType) {
        o.LJIIIZ(searchType, "searchType");
        C50865Jxl c50865Jxl = this.LJLLLL;
        if (c50865Jxl != null) {
            c50865Jxl.LIZJ(str);
        }
        String str2 = null;
        ISearchVerticalContext iSearchVerticalContext = (ISearchVerticalContext) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ISearchVerticalContext.class, null);
        if (iSearchVerticalContext != null) {
            SearchResultParam v3 = v3();
            if (v3 != null) {
                str2 = v3.getKeyword();
            }
            iSearchVerticalContext.Bf(str2, searchApiResult, KAK.STORE);
        }
    }

    public final void F3(int i, int i2, boolean z) {
        String str;
        int i3;
        String optString;
        Integer valueOf;
        if (z) {
            try {
                this.LJLJJI = System.currentTimeMillis();
            } catch (Exception unused) {
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJJI;
        IECommerceService createIECommerceServicebyMonsterPlugin = ECommerceService.createIECommerceServicebyMonsterPlugin(false);
        if (z) {
            str = "rd_ec_request_send";
        } else {
            str = "rd_ec_request_result";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("request_method", "template");
        jSONObject.put("start_click_to_now", System.currentTimeMillis() - this.LJLJJL);
        if (this.LJLJJLL) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        jSONObject.put("request_type", i3);
        JSONObject jSONObject2 = this.LJLJL;
        if (jSONObject2 == null || (optString = jSONObject2.optString("enter_from")) == null) {
            optString = "";
        }
        jSONObject.put("enter_from", optString);
        if (!z) {
            jSONObject.put("api_duration", currentTimeMillis);
            jSONObject.put("is_success", i);
            jSONObject.put("item_count", i2);
            jSONObject.put("params", 0);
        }
        jSONObject.put("api_path", "/aweme/v1/search/mall_store/ecom/");
        C50948Jz6 Wa0 = Wa0();
        if (Wa0 != null && (valueOf = Integer.valueOf(Wa0.getEcSearchEntranceValue())) != null) {
            jSONObject.put("root_enter_from_type", valueOf.intValue());
        }
        createIECommerceServicebyMonsterPlugin.reportVerticalSearchApiLog(str, jSONObject);
        if (!z) {
            this.LJLJJLL = false;
        }
    }
}
