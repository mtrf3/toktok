package com.ss.android.ugc.aweme.result.common.core.ui.fragment;

import X.ActivityC45651qj;
import X.C00F;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C184077Kh;
import X.C199097rd;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C29S;
import X.C2U8;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C45804HyK;
import X.C47261Igj;
import X.C48054ItW;
import X.C48658J7u;
import X.C50855Jxb;
import X.C50865Jxl;
import X.C50948Jz6;
import X.C51222K8k;
import X.C51240K9c;
import X.C51244K9g;
import X.C51411KFr;
import X.C55230Lly;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65232Piu;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72818Shy;
import X.C76800UCe;
import X.C770830u;
import X.C78926UyI;
import X.C8YZ;
import X.C90903hW;
import X.EnumC51281KAr;
import X.EnumC51287KAx;
import X.IGH;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC51365KDx;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.K8T;
import X.K9C;
import X.KAK;
import X.KB1;
import X.KBE;
import X.KBG;
import X.KEA;
import X.KEP;
import X.KFJ;
import X.KFW;
import X.KFY;
import X.KG0;
import X.KGN;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.T2R;
import X.TBT;
import X.TBW;
import X.WM7;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.play.core.appupdate.u;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ab.RomaSchemaGroupSearchSettings;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchStartViewModel;
import com.ss.android.ugc.aweme.lynx.core.model.DynamicData;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
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
public final class DynamicSearchStoreFragmentNew extends EcDynamicSearchFragment implements KPL, InterfaceC72822Si2 {
    public final C214298b3 LLIIL;
    public EcSearchStartViewModel LLIILII;
    public final Gson LLIILZL;
    public long LLIIZ;
    public long LLIL;
    public boolean LLILII;
    public JSONObject LLILIL;
    public String LLILL;
    public String LLILLIZIL;
    public int LLILLJJLI;
    public int LLILLL;
    public long LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public final C62822Ol8 LLIZLLLIL;
    public final Map<String, Long> LLJ;
    public final boolean LLJI;
    public final Map<Integer, View> LLJIJIL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment
    public final String Il() {
        return "store";
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment
    public final void Tl() {
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLJIJIL).clear();
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public DynamicSearchStoreFragmentNew() {
        KEA LIZIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(DynamicSearchStoreVM.class);
        int i = 0;
        this.LLIIL = new C214298b3(LIZ, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 107), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, KG0.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LLIILZL = GsonHolder.LIZLLL().LIZ();
        this.LLILII = true;
        this.LLILL = "";
        this.LLILLIZIL = "";
        this.LLIZLLLIL = C221108m2.LIZIZ(C51411KFr.LJLIL);
        this.LLJ = new LinkedHashMap();
        KEP kep = this.LJLLI;
        if (kep != null && (LIZIZ = kep.LIZIZ()) != null) {
            i = LIZIZ.LJIIIIZZ(KAK.STORE);
        }
        this.LJLLLLLL = i;
        this.LLJI = true;
    }

    public final String fm() {
        C50948Jz6 c50948Jz6;
        InterfaceC51365KDx LIZ;
        KEP kep = this.LJLLI;
        List<Object> list = null;
        if (kep != null && (LIZ = kep.LIZ()) != null) {
            c50948Jz6 = LIZ.ha();
        } else {
            c50948Jz6 = null;
        }
        JSONArray LJJII = T2R.LJJII(C51240K9c.LIZ(c50948Jz6));
        if (LJJII != null) {
            list = JsonExtKt.toList(LJJII);
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

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment
    public final void Vl() {
        Wl(Ol());
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment
    public final void initView() {
        KFY kfy;
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        if (((Boolean) this.LLIZLLLIL.getValue()).booleanValue()) {
            kfy = new C50855Jxb(requireContext, this);
        } else {
            C50865Jxl c50865Jxl = new C50865Jxl(requireContext, this);
            c50865Jxl.LIZLLL = new KGN(this);
            c50865Jxl.LJIIJJI = new AqS158S0100000_8(this, 452);
            kfy = c50865Jxl;
        }
        this.LLIIIILZ = kfy;
        if (((Boolean) this.LLIZLLLIL.getValue()).booleanValue()) {
            return;
        }
        Ol().LIZLLL(0, new ViewGroup.LayoutParams(-1, -1), Pl());
        if (this.LLIIIJ != null) {
            Pl().setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ = Ol().LIZIZ();
        if ((LIZIZ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && LIZIZ != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(LIZIZ);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(WM7.SCENE_SERVICE, "search_exit");
        jSONObject.put("is_native_request", true);
        jSONObject.put("trace_type", 0);
        jSONObject.put("request_count", this.LLILLJJLI);
        jSONObject.put("native_request_count", this.LLILLL);
        jSONObject.put("enter_method", this.LLILL);
        jSONObject.put("has_result", this.LLILZIL ? 1 : 0);
        jSONObject.put("exit_duration", System.currentTimeMillis() - this.LLILZ);
        jSONObject.put("enter_from", this.LLILLIZIL);
        jSONObject.put("visiable", this.LLILZLL ? 1 : 0);
        jSONObject.put("null_type", this.LLIZ);
        jSONObject.put("tab_name", KAK.STORE.getTabName());
        C48658J7u.LIZIZ("rd_ec_search_request_trace", jSONObject);
        C72818Shy.LJII("ec_search_result_page_scroll_to_top", this);
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        lm(false);
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (getUserVisibleHint()) {
            lm(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final boolean wl() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment
    public final void Ll(boolean z) {
        super.Ll(z);
        if (!z) {
            lm(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment
    public final JSONObject Nl(C50948Jz6 c50948Jz6) {
        C51244K9g resultAttachCard;
        int i;
        C51222K8k attachStoreCardValue;
        InterfaceC51365KDx LIZ;
        String trendingWordsId;
        Map<String, Object> ecomRecomSearchParamMap;
        JSONObject Nl = super.Nl(c50948Jz6);
        Nl.put("traffic_source_list", C51240K9c.LIZ(c50948Jz6));
        SearchResultParam searchResultParam = this.LJLLILLLL;
        String str = null;
        if (searchResultParam != null && (ecomRecomSearchParamMap = searchResultParam.getEcomRecomSearchParamMap()) != null) {
            for (Map.Entry<String, Object> entry : ecomRecomSearchParamMap.entrySet()) {
                Nl.put(entry.getKey(), entry.getValue());
            }
        }
        SearchResultParam searchResultParam2 = this.LJLLILLLL;
        if (searchResultParam2 != null && (trendingWordsId = searchResultParam2.getTrendingWordsId()) != null) {
            Nl.put("trending_words_id", trendingWordsId);
        }
        if (!Nl.isNull("enter_from")) {
            String optString = Nl.optString("enter_from");
            optString.toString();
            this.LLILLIZIL = optString;
        }
        Nl.put("source", "store_tab");
        Nl.put("search_channel", "tiktok_store_tab");
        KEP kep = this.LJLLI;
        if (kep != null && (LIZ = kep.LIZ()) != null) {
            str = LIZ.LIZIZ();
        }
        Nl.put("page_type", str);
        SearchResultParam searchResultParam3 = this.LJLLILLLL;
        if (searchResultParam3 != null && (resultAttachCard = searchResultParam3.getResultAttachCard()) != null) {
            KBE cardType = resultAttachCard.getCardType();
            if (cardType == null) {
                i = -1;
            } else {
                i = KFJ.LIZ[cardType.ordinal()];
                if (i == 1) {
                    String attachProductCardValue = resultAttachCard.getAttachProductCardValue();
                    if (attachProductCardValue != null) {
                        Nl.put("attach_products", attachProductCardValue);
                    }
                }
            }
            if (i != 2) {
                if (i == 3 && (attachStoreCardValue = resultAttachCard.getAttachStoreCardValue()) != null) {
                    Nl.put("sug_shop_id", attachStoreCardValue.getShopId());
                    Nl.put("sug_creator_id", attachStoreCardValue.getCreatorId());
                }
            } else {
                KBG attachTalentLiveCardValue = resultAttachCard.getAttachTalentLiveCardValue();
                if (attachTalentLiveCardValue != null) {
                    Nl.put("sug_creator_id", attachTalentLiveCardValue.getCreatorId());
                }
            }
        }
        this.LLILIL = Nl;
        return Nl;
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment
    public final void Wl(KFY kfy) {
        String str;
        Activity activity;
        int i;
        String str2;
        InterfaceC51365KDx LIZ;
        String Jl = Jl();
        String str3 = this.LJZ;
        KEP kep = this.LJLLI;
        if (kep != null && (LIZ = kep.LIZ()) != null) {
            str = LIZ.LJIILJJIL();
        } else {
            str = null;
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
            Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("keyword", Jl).appendQueryParameter("search_context", str).appendQueryParameter("search_source", str3);
            if (valueOf == null) {
                valueOf = "";
            }
            appendQueryParameter.appendQueryParameter("container_unique_id", valueOf);
            buildUpon.appendQueryParameter("use_forest", "1");
            buildUpon.appendQueryParameter("enable_memory_cache", "1");
            buildUpon.appendQueryParameter("enable_code_cache", "1");
            str2 = buildUpon.toString();
            o.LJIIIIZZ(str2, "{\n            val schema…lder.toString()\n        }");
        } catch (Throwable unused) {
            str2 = "sslocal://webcast_lynxview?use_new_container=1&url=https%3A%2F%2Flf77-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_store_tab%2Fpages%2Fstore-search-tab-page.js&use_spark=1";
        }
        try {
            Uri.Builder buildUpon2 = UriProtector.parse(str2).buildUpon();
            buildUpon2.appendQueryParameter("hasFilterPanel", "1");
            String builder = buildUpon2.toString();
            o.LJIIIIZZ(builder, "builder.toString()");
            str2 = builder;
        } catch (Exception unused2) {
        }
        DynamicPatch dynamicPatch = new DynamicPatch();
        dynamicPatch.schema = str2;
        kfy.LJ(new AqS174S0100000_8(this, 60), C47261Igj.LJJIJIL(new DynamicData(0, dynamicPatch, 1, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0213 A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:23:0x0129, B:27:0x0139, B:29:0x0145, B:31:0x014d, B:33:0x0151, B:34:0x015b, B:37:0x016c, B:38:0x0172, B:40:0x0176, B:41:0x017c, B:43:0x0180, B:44:0x0186, B:47:0x0195, B:48:0x019b, B:50:0x019f, B:51:0x01a5, B:53:0x01a9, B:54:0x01af, B:56:0x01b3, B:58:0x01b7, B:61:0x01c4, B:63:0x01c8, B:65:0x01cc, B:66:0x01db, B:68:0x01df, B:69:0x01e5, B:71:0x01e9, B:73:0x01ed, B:75:0x01f1, B:77:0x01fe, B:79:0x0202, B:81:0x0206, B:83:0x020a, B:84:0x0219, B:88:0x0258, B:90:0x026f, B:93:0x027b, B:95:0x02d3, B:96:0x02d6, B:98:0x02da, B:99:0x02e1, B:107:0x020f, B:109:0x0213, B:112:0x01d1, B:114:0x01d5, B:123:0x0133), top: B:22:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01df A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:23:0x0129, B:27:0x0139, B:29:0x0145, B:31:0x014d, B:33:0x0151, B:34:0x015b, B:37:0x016c, B:38:0x0172, B:40:0x0176, B:41:0x017c, B:43:0x0180, B:44:0x0186, B:47:0x0195, B:48:0x019b, B:50:0x019f, B:51:0x01a5, B:53:0x01a9, B:54:0x01af, B:56:0x01b3, B:58:0x01b7, B:61:0x01c4, B:63:0x01c8, B:65:0x01cc, B:66:0x01db, B:68:0x01df, B:69:0x01e5, B:71:0x01e9, B:73:0x01ed, B:75:0x01f1, B:77:0x01fe, B:79:0x0202, B:81:0x0206, B:83:0x020a, B:84:0x0219, B:88:0x0258, B:90:0x026f, B:93:0x027b, B:95:0x02d3, B:96:0x02d6, B:98:0x02da, B:99:0x02e1, B:107:0x020f, B:109:0x0213, B:112:0x01d1, B:114:0x01d5, B:123:0x0133), top: B:22:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e9 A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:23:0x0129, B:27:0x0139, B:29:0x0145, B:31:0x014d, B:33:0x0151, B:34:0x015b, B:37:0x016c, B:38:0x0172, B:40:0x0176, B:41:0x017c, B:43:0x0180, B:44:0x0186, B:47:0x0195, B:48:0x019b, B:50:0x019f, B:51:0x01a5, B:53:0x01a9, B:54:0x01af, B:56:0x01b3, B:58:0x01b7, B:61:0x01c4, B:63:0x01c8, B:65:0x01cc, B:66:0x01db, B:68:0x01df, B:69:0x01e5, B:71:0x01e9, B:73:0x01ed, B:75:0x01f1, B:77:0x01fe, B:79:0x0202, B:81:0x0206, B:83:0x020a, B:84:0x0219, B:88:0x0258, B:90:0x026f, B:93:0x027b, B:95:0x02d3, B:96:0x02d6, B:98:0x02da, B:99:0x02e1, B:107:0x020f, B:109:0x0213, B:112:0x01d1, B:114:0x01d5, B:123:0x0133), top: B:22:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026f A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:23:0x0129, B:27:0x0139, B:29:0x0145, B:31:0x014d, B:33:0x0151, B:34:0x015b, B:37:0x016c, B:38:0x0172, B:40:0x0176, B:41:0x017c, B:43:0x0180, B:44:0x0186, B:47:0x0195, B:48:0x019b, B:50:0x019f, B:51:0x01a5, B:53:0x01a9, B:54:0x01af, B:56:0x01b3, B:58:0x01b7, B:61:0x01c4, B:63:0x01c8, B:65:0x01cc, B:66:0x01db, B:68:0x01df, B:69:0x01e5, B:71:0x01e9, B:73:0x01ed, B:75:0x01f1, B:77:0x01fe, B:79:0x0202, B:81:0x0206, B:83:0x020a, B:84:0x0219, B:88:0x0258, B:90:0x026f, B:93:0x027b, B:95:0x02d3, B:96:0x02d6, B:98:0x02da, B:99:0x02e1, B:107:0x020f, B:109:0x0213, B:112:0x01d1, B:114:0x01d5, B:123:0x0133), top: B:22:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d3 A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:23:0x0129, B:27:0x0139, B:29:0x0145, B:31:0x014d, B:33:0x0151, B:34:0x015b, B:37:0x016c, B:38:0x0172, B:40:0x0176, B:41:0x017c, B:43:0x0180, B:44:0x0186, B:47:0x0195, B:48:0x019b, B:50:0x019f, B:51:0x01a5, B:53:0x01a9, B:54:0x01af, B:56:0x01b3, B:58:0x01b7, B:61:0x01c4, B:63:0x01c8, B:65:0x01cc, B:66:0x01db, B:68:0x01df, B:69:0x01e5, B:71:0x01e9, B:73:0x01ed, B:75:0x01f1, B:77:0x01fe, B:79:0x0202, B:81:0x0206, B:83:0x020a, B:84:0x0219, B:88:0x0258, B:90:0x026f, B:93:0x027b, B:95:0x02d3, B:96:0x02d6, B:98:0x02da, B:99:0x02e1, B:107:0x020f, B:109:0x0213, B:112:0x01d1, B:114:0x01d5, B:123:0x0133), top: B:22:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02da A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:23:0x0129, B:27:0x0139, B:29:0x0145, B:31:0x014d, B:33:0x0151, B:34:0x015b, B:37:0x016c, B:38:0x0172, B:40:0x0176, B:41:0x017c, B:43:0x0180, B:44:0x0186, B:47:0x0195, B:48:0x019b, B:50:0x019f, B:51:0x01a5, B:53:0x01a9, B:54:0x01af, B:56:0x01b3, B:58:0x01b7, B:61:0x01c4, B:63:0x01c8, B:65:0x01cc, B:66:0x01db, B:68:0x01df, B:69:0x01e5, B:71:0x01e9, B:73:0x01ed, B:75:0x01f1, B:77:0x01fe, B:79:0x0202, B:81:0x0206, B:83:0x020a, B:84:0x0219, B:88:0x0258, B:90:0x026f, B:93:0x027b, B:95:0x02d3, B:96:0x02d6, B:98:0x02da, B:99:0x02e1, B:107:0x020f, B:109:0x0213, B:112:0x01d1, B:114:0x01d5, B:123:0x0133), top: B:22:0x0129 }] */
    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Zl(int r57) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchStoreFragmentNew.Zl(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e6  */
    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dm(X.C50948Jz6 r7) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchStoreFragmentNew.dm(X.Jz6):void");
    }

    public final void lm(boolean z) {
        K9C LIZ;
        if (z && (LIZ = K8T.LIZ(C55230Lly.LIZJ(this, null))) != null) {
            LIZ.LJLJI = KAK.STORE;
        }
        Ol().LIZ("changePageActive", C770830u.LIZLLL("active", z ? 1 : 0));
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJ.put("start_navigation", Long.valueOf(System.currentTimeMillis()));
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LLIILII = (EcSearchStartViewModel) ViewModelProviders.of(mo49getActivity).get(EcSearchStartViewModel.class);
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
                KFW kfw = this.LLIIJI;
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

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "8598542754886746523");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/result/common/core/ui/fragment/DynamicSearchStoreFragmentNew", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/result/common/core/ui/fragment/DynamicSearchStoreFragmentNew", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        this.LLILZLL = z;
        super.setUserVisibleHint(z);
        if (!C48054ItW.LIZ() && isActive()) {
            lm(z);
        }
        C2U8.LIZ(new IGH(z));
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/result/common/core/ui/fragment/DynamicSearchStoreFragmentNew", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    public final void hm(long j, String str) {
        int value;
        Object value2;
        JSONObject LIZJ;
        KEP kep;
        KEP kep2;
        InterfaceC51365KDx LIZ;
        C50948Jz6 ha;
        Integer valueOf;
        InterfaceC51365KDx LIZ2;
        C50948Jz6 ha2;
        InterfaceC51365KDx LIZ3;
        C50948Jz6 ha3;
        KEP kep3 = this.LJLLI;
        String str2 = null;
        if (kep3 != null && (LIZ3 = kep3.LIZ()) != null && (ha3 = LIZ3.ha()) != null) {
            value = ha3.getEcSearchEntranceValue();
            if (ha3.getEcSearchEntranceData() != null) {
                ECSearchEntranceData ecSearchEntranceData = ha3.getEcSearchEntranceData();
                if (ecSearchEntranceData == null || (value2 = ecSearchEntranceData.getResultType()) == null) {
                    value2 = EnumC51287KAx.TYPE_SHOP;
                }
                LIZJ = C65232Piu.LIZJ("phase", str);
                LIZJ.put("cost", String.valueOf(j));
                kep = this.LJLLI;
                if (kep != null && (LIZ2 = kep.LIZ()) != null && (ha2 = LIZ2.ha()) != null) {
                    str2 = ha2.getEnterSearchFrom();
                }
                LIZJ.put("enter_search_from", str2);
                LIZJ.put("search_type", value2);
                LIZJ.put("enter_method", this.LJZ);
                LIZJ.put("search_id", this.LJLJJI.getSearchId());
                LIZJ.put("tab_name", KAK.STORE.getTabName());
                kep2 = this.LJLLI;
                if (kep2 != null && (LIZ = kep2.LIZ()) != null && (ha = LIZ.ha()) != null && (valueOf = Integer.valueOf(ha.getEcSearchEntranceValue())) != null) {
                    LIZJ.put("root_enter_from_type", valueOf.intValue());
                }
                C48658J7u.LIZIZ("rd_ec_search_page_load_detail", LIZJ);
            }
        } else {
            value = EnumC51281KAr.DEFAULT.getValue();
        }
        value2 = KB1.LIZLLL(value).getValue();
        LIZJ = C65232Piu.LIZJ("phase", str);
        LIZJ.put("cost", String.valueOf(j));
        kep = this.LJLLI;
        if (kep != null) {
            str2 = ha2.getEnterSearchFrom();
        }
        LIZJ.put("enter_search_from", str2);
        LIZJ.put("search_type", value2);
        LIZJ.put("enter_method", this.LJZ);
        LIZJ.put("search_id", this.LJLJJI.getSearchId());
        LIZJ.put("tab_name", KAK.STORE.getTabName());
        kep2 = this.LJLLI;
        if (kep2 != null) {
            LIZJ.put("root_enter_from_type", valueOf.intValue());
        }
        C48658J7u.LIZIZ("rd_ec_search_page_load_detail", LIZJ);
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        try {
            AssemViewModel.asyncSubscribe$default((DynamicSearchStoreVM) this.LLIIL.getValue(), new TBT() { // from class: X.KFn
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C35649Dyv) obj).LJLIL;
                }
            }, null, new AqS174S0100000_8(this, 61), null, new AqS174S0100000_8(this, 62), 10, null);
        } catch (Exception unused) {
        }
        super.onViewCreated(view, bundle);
    }

    public final void km(int i, int i2, boolean z) {
        String str;
        int i3;
        String optString;
        InterfaceC51365KDx LIZ;
        C50948Jz6 ha;
        Integer valueOf;
        if (z) {
            try {
                this.LLIIZ = System.currentTimeMillis();
            } catch (Exception unused) {
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LLIIZ;
        IECommerceService createIECommerceServicebyMonsterPlugin = ECommerceService.createIECommerceServicebyMonsterPlugin(false);
        if (z) {
            str = "rd_ec_request_send";
        } else {
            str = "rd_ec_request_result";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("request_method", "template");
        jSONObject.put("start_click_to_now", System.currentTimeMillis() - this.LLIL);
        if (this.LLILII) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        jSONObject.put("request_type", i3);
        JSONObject jSONObject2 = this.LLILIL;
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
        KEP kep = this.LJLLI;
        if (kep != null && (LIZ = kep.LIZ()) != null && (ha = LIZ.ha()) != null && (valueOf = Integer.valueOf(ha.getEcSearchEntranceValue())) != null) {
            jSONObject.put("root_enter_from_type", valueOf.intValue());
        }
        createIECommerceServicebyMonsterPlugin.reportVerticalSearchApiLog(str, jSONObject);
        if (!z) {
            this.LLILII = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        C72818Shy.LIZLLL("ec_search_result_page_scroll_to_top", this);
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        try {
            ViewTreeLifecycleOwner.set(onCreateView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(onCreateView, this);
            C10A.LIZIZ(onCreateView, this);
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
        return onCreateView;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
