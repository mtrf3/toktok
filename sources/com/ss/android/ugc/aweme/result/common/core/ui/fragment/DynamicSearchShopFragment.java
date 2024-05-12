package com.ss.android.ugc.aweme.result.common.core.ui.fragment;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10H;
import X.C10K;
import X.C141335gf;
import X.C17N;
import X.C184077Kh;
import X.C199097rd;
import X.C1B8;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C2313095y;
import X.C2NU;
import X.C2U8;
import X.C36033ECf;
import X.C36581c6;
import X.C3C5;
import X.C45804HyK;
import X.C47261Igj;
import X.C48054ItW;
import X.C48658J7u;
import X.C50287JoR;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50855Jxb;
import X.C50865Jxl;
import X.C50948Jz6;
import X.C51222K8k;
import X.C51240K9c;
import X.C51244K9g;
import X.C51395KFb;
import X.C51410KFq;
import X.C51418KFy;
import X.C55230Lly;
import X.C62822Ol8;
import X.C65232Piu;
import X.C65300Pk0;
import X.C65314PkE;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72242sW;
import X.C72818Shy;
import X.C76542zS;
import X.C76800UCe;
import X.C770830u;
import X.C78685UuP;
import X.C78926UyI;
import X.DY3;
import X.EnumC51281KAr;
import X.IGH;
import X.InterfaceC51365KDx;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.JI6;
import X.K5P;
import X.K8T;
import X.K9C;
import X.KAK;
import X.KB1;
import X.KBA;
import X.KBE;
import X.KBG;
import X.KEA;
import X.KEP;
import X.KEX;
import X.KFI;
import X.KFM;
import X.KFN;
import X.KFS;
import X.KFW;
import X.KFY;
import X.KG3;
import X.KGM;
import X.ORY;
import X.ORZ;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.TBT;
import X.WM7;
import Y.AObserverS76S0100000_8;
import Y.AgS74S0300000_6;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletRechargeExchangeStrengthen;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.play.core.appupdate.u;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.search.ab.ECSearchVerticalChunkSizeListSettings;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.ecomsearch.utils.EcSearchShopResultPreload;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchStartViewModel;
import com.ss.android.ugc.aweme.lynx.core.model.DynamicData;
import com.ss.android.ugc.aweme.result.common.core.repo.EcSearchApi;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS75S1100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes9.dex */
public final class DynamicSearchShopFragment extends EcDynamicSearchFragment implements InterfaceC72822Si2 {
    public static final /* synthetic */ int LLJILLL = 0;
    public final C214298b3 LLIILII;
    public EcSearchStartViewModel LLIILZL;
    public final Gson LLIIZ;
    public long LLIL;
    public long LLILII;
    public boolean LLILIL;
    public JSONObject LLILL;
    public String LLILLIZIL;
    public String LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public C10H LLJ;
    public final C62822Ol8 LLJI;
    public final Map<String, Long> LLJIJIL;
    public final boolean LLJILJIL;
    public final Map<Integer, View> LLJILJILJ = new LinkedHashMap();
    public final C62822Ol8 LLIIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 105));

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment
    public final String Il() {
        return "shop";
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment
    public final void Tl() {
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLJILJILJ).clear();
    }

    public DynamicSearchShopFragment() {
        KEA LIZIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(DynamicSearchShopVM.class);
        int i = 0;
        this.LLIILII = new C214298b3(LIZ, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 106), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C51418KFy.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LLIIZ = GsonHolder.LIZLLL().LIZ();
        this.LLILIL = true;
        this.LLILLIZIL = "";
        this.LLILLJJLI = "";
        this.LLIZLLLIL = true;
        this.LLJI = C221108m2.LIZIZ(C51410KFq.LJLIL);
        this.LLJIJIL = new LinkedHashMap();
        KEP kep = this.LJLLI;
        if (kep != null && (LIZIZ = kep.LIZIZ()) != null) {
            i = LIZIZ.LJIIIIZZ(KAK.SHOP);
        }
        this.LJLLLLLL = i;
        if (!DY3.LIZ()) {
            C72818Shy.LIZLLL("filter_option_select", this);
            C72818Shy.LIZLLL("filter_option_cancel", this);
            C72818Shy.LIZLLL("fetch_filter_search_data_success", this);
            C72818Shy.LIZLLL("ec_search_result_page_scroll_to_top", this);
        }
        this.LLJILJIL = true;
    }

    public final boolean km() {
        return ((Boolean) this.LLIIL.getValue()).booleanValue();
    }

    public final String lm() {
        InterfaceC51365KDx LIZ;
        C50948Jz6 ha;
        KEP kep = this.LJLLI;
        if (kep != null && (LIZ = kep.LIZ()) != null && (ha = LIZ.ha()) != null) {
            return ha.getEnterSearchFrom();
        }
        return null;
    }

    public final Integer mm() {
        InterfaceC51365KDx LIZ;
        C50948Jz6 ha;
        KEP kep = this.LJLLI;
        if (kep == null || (LIZ = kep.LIZ()) == null || (ha = LIZ.ha()) == null) {
            return null;
        }
        return Integer.valueOf(ha.getEcSearchEntranceValue());
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String lm;
        long j;
        long j2;
        long j3;
        InterfaceC51365KDx LIZ;
        C50948Jz6 ha;
        Object obtainEcLogData;
        this.LLJIJIL.put("fragment_destroy", Long.valueOf(System.currentTimeMillis()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_method", this.LJZ);
        KEP kep = this.LJLLI;
        if ((kep == null || (LIZ = kep.LIZ()) == null || (ha = LIZ.ha()) == null || (obtainEcLogData = ha.obtainEcLogData("result_search_entrance")) == null || (lm = obtainEcLogData.toString()) == null) && (lm = lm()) == null) {
            lm = "";
        }
        linkedHashMap.put("enter_search_from", lm);
        Integer mm = mm();
        if (mm != null) {
            linkedHashMap.put("root_enter_from_type", String.valueOf(mm.intValue()));
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LLJIJIL).entrySet()) {
            linkedHashMap.put(entry.getKey(), String.valueOf(((Number) entry.getValue()).longValue()));
        }
        linkedHashMap.put("leave_before_request_end", String.valueOf(!this.LLJIJIL.containsKey("request_end")));
        long j4 = 0;
        if (this.LLJIJIL.containsKey("request_end")) {
            Long l = (Long) ((LinkedHashMap) this.LLJIJIL).get("request_end");
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = 0;
            }
            Long l2 = (Long) ((LinkedHashMap) this.LLJIJIL).get("request_begin");
            if (l2 != null) {
                j3 = l2.longValue();
            } else {
                j3 = 0;
            }
            linkedHashMap.put("request_duration", String.valueOf(j2 - j3));
        }
        Long l3 = (Long) ((LinkedHashMap) this.LLJIJIL).get("fragment_destroy");
        if (l3 != null) {
            j = l3.longValue();
        } else {
            j = -1;
        }
        Long l4 = (Long) ((LinkedHashMap) this.LLJIJIL).get("start_navigation");
        if (l4 != null) {
            j4 = l4.longValue();
        }
        linkedHashMap.put("stay_duration", String.valueOf(j - j4));
        C48658J7u.LIZ("rd_ec_search_page_stay_duration", linkedHashMap);
        super.onDestroy();
        if (DY3.LIZ()) {
            C72818Shy.LJII("filter_option_select", this);
            C72818Shy.LJII("filter_option_cancel", this);
            C72818Shy.LJII("fetch_filter_search_data_success", this);
            C72818Shy.LJII("ec_search_result_page_scroll_to_top", this);
        }
    }

    public final void xm() {
        C50948Jz6 c50948Jz6;
        InterfaceC51365KDx LIZ;
        KEP kep = this.LJLLI;
        if (kep != null && (LIZ = kep.LIZ()) != null) {
            c50948Jz6 = LIZ.ha();
        } else {
            c50948Jz6 = null;
        }
        JSONObject Nl = Nl(c50948Jz6);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("searchInitParams", Nl);
        Nl.put("tab_name", "shop");
        Nl.put("type", LiveWalletRechargeExchangeStrengthen.DEFAULT);
        C48658J7u.LIZIZ("rd_ec_fe_params", Nl);
        KFY Ol = Ol();
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
        Ol.LIZJ(jSONObject2);
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
        if (((Boolean) this.LLJI.getValue()).booleanValue()) {
            kfy = new C50855Jxb(requireContext, this);
        } else {
            C50865Jxl c50865Jxl = new C50865Jxl(requireContext, this);
            c50865Jxl.LIZLLL = new KGM(this);
            c50865Jxl.LJIIJJI = new AqS158S0100000_8(this, 451);
            kfy = c50865Jxl;
        }
        this.LLIIIILZ = kfy;
        if (((Boolean) this.LLJI.getValue()).booleanValue()) {
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
        if (!DY3.LIZ()) {
            C72818Shy.LJII("filter_option_select", this);
            C72818Shy.LJII("filter_option_cancel", this);
            C72818Shy.LJII("fetch_filter_search_data_success", this);
            C72818Shy.LJII("ec_search_result_page_scroll_to_top", this);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ = Ol().LIZIZ();
        if ((LIZIZ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && LIZIZ != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(LIZIZ);
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        qm(false);
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (getUserVisibleHint()) {
            qm(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final boolean wl() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcSearchBaseFragment
    public final void Ll(boolean z) {
        super.Ll(z);
        if (!z) {
            qm(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment
    public final JSONObject Nl(C50948Jz6 c50948Jz6) {
        Map<String, Object> map;
        int value;
        ECSearchEntranceData eCSearchEntranceData;
        String value2;
        ECSearchEntranceData eCSearchEntranceData2;
        String value3;
        String str;
        C51244K9g c51244K9g;
        KBA kba;
        String str2;
        String str3;
        Integer num;
        C51244K9g resultAttachCard;
        int i;
        C51222K8k attachStoreCardValue;
        ECSearchEntranceData ecSearchEntranceData;
        String ecUserActions;
        String adPreviousPage;
        String adCreativeId;
        String adCampaignId;
        String adDeepLinkType;
        String adUrl;
        List<Object> list;
        Object LJLLLL;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String optString;
        String optString2;
        C50650JuI immutableData;
        K5P searchEcommerceModel;
        InterfaceC51365KDx LIZ;
        String trendingWordsId;
        ECSearchEntranceData ecSearchEntranceData2;
        String LIZIZ;
        JSONObject Nl = super.Nl(c50948Jz6);
        Nl.put("traffic_source_list", C51240K9c.LIZ(c50948Jz6));
        SearchResultParam searchResultParam = this.LJLLILLLL;
        Integer num2 = null;
        if (searchResultParam != null) {
            map = searchResultParam.getEcomRecomSearchParamMap();
        } else {
            map = null;
        }
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                Nl.put(entry.getKey(), entry.getValue());
            }
        }
        if (c50948Jz6 != null && (ecSearchEntranceData2 = c50948Jz6.getEcSearchEntranceData()) != null && (LIZIZ = KFS.LIZIZ(Integer.valueOf(ecSearchEntranceData2.getRootEnterFromType()))) != null) {
            Nl.put("vertical_api_version", LIZIZ);
        }
        SearchResultParam searchResultParam2 = this.LJLLILLLL;
        if (searchResultParam2 != null && (trendingWordsId = searchResultParam2.getTrendingWordsId()) != null) {
            Nl.put("trending_words_id", trendingWordsId);
        }
        if (!Nl.isNull("enter_from")) {
            String optString3 = Nl.optString("enter_from");
            optString3.toString();
            this.LLILLJJLI = optString3;
        }
        if (c50948Jz6 != null) {
            value = c50948Jz6.getEcSearchEntranceValue();
        } else {
            value = EnumC51281KAr.DEFAULT.getValue();
        }
        if (c50948Jz6 != null) {
            eCSearchEntranceData = c50948Jz6.getEcSearchEntranceData();
        } else {
            eCSearchEntranceData = null;
        }
        if (eCSearchEntranceData != null) {
            ECSearchEntranceData ecSearchEntranceData3 = c50948Jz6.getEcSearchEntranceData();
            if (ecSearchEntranceData3 != null) {
                value2 = ecSearchEntranceData3.getResultSource();
            } else {
                value2 = null;
            }
        } else {
            value2 = KB1.LIZJ(value).getValue();
        }
        if (c50948Jz6 != null) {
            eCSearchEntranceData2 = c50948Jz6.getEcSearchEntranceData();
        } else {
            eCSearchEntranceData2 = null;
        }
        if (eCSearchEntranceData2 != null) {
            ECSearchEntranceData ecSearchEntranceData4 = c50948Jz6.getEcSearchEntranceData();
            if (ecSearchEntranceData4 != null) {
                value3 = ecSearchEntranceData4.getResultChannel();
            } else {
                value3 = null;
            }
        } else {
            value3 = KB1.LIZIZ(value).getValue();
        }
        Nl.put("source", value2);
        Nl.put("search_channel", value3);
        KEP kep = this.LJLLI;
        if (kep == null || (LIZ = kep.LIZ()) == null || (str = LIZ.LIZIZ()) == null) {
            str = "";
        }
        Nl.put("page_type", str);
        JSONObject jSONObject3 = new JSONObject();
        SearchResultParam searchResultParam3 = this.LJLLILLLL;
        if (searchResultParam3 != null) {
            c51244K9g = searchResultParam3.getResultAttachCard();
        } else {
            c51244K9g = null;
        }
        C50652JuK.Companion.getClass();
        C50652JuK LJIIJ = C50651JuJ.LJIIJ(this);
        if (LJIIJ != null && (immutableData = LJIIJ.getImmutableData()) != null && (searchEcommerceModel = immutableData.getSearchEcommerceModel()) != null) {
            kba = searchEcommerceModel.getDeepLinkEcParams();
        } else {
            kba = null;
        }
        if (c51244K9g != null) {
            str2 = c51244K9g.getScene();
        } else {
            str2 = null;
        }
        if (o.LJ(str2, "mall_ug") && c51244K9g.getCardType() == KBE.PRODUCT_CARD && c51244K9g.getAttachProductCardValue() != null) {
            try {
                list = JsonExtKt.toList(new JSONArray(c51244K9g.getAttachProductCardValue()));
            } catch (Throwable unused) {
                list = null;
            }
            if (list != null && (LJLLLL = ORZ.LJLLLL(list)) != null) {
                boolean z = LJLLLL instanceof JSONObject;
                if (z) {
                    jSONObject = (JSONObject) LJLLLL;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null && (optString2 = jSONObject.optString("product_id")) != null) {
                    jSONObject3.put("ad_product_id", optString2);
                }
                if (z) {
                    jSONObject2 = (JSONObject) LJLLLL;
                } else {
                    jSONObject2 = null;
                }
                if (jSONObject2 != null && (optString = jSONObject2.optString("position")) != null) {
                    jSONObject3.put("ad_product_rank", optString);
                }
            }
        }
        if (kba != null && (adUrl = kba.getAdUrl()) != null) {
            jSONObject3.put("ad_url", adUrl);
        }
        if (kba != null && (adDeepLinkType = kba.getAdDeepLinkType()) != null) {
            jSONObject3.put("ad_deeplink_type", adDeepLinkType);
        }
        if (kba != null && (adCampaignId = kba.getAdCampaignId()) != null) {
            jSONObject3.put("ad_campaign_id", adCampaignId);
        }
        if (kba != null && (adCreativeId = kba.getAdCreativeId()) != null) {
            jSONObject3.put("ad_creative_id", adCreativeId);
        }
        if (kba != null && (adPreviousPage = kba.getAdPreviousPage()) != null) {
            jSONObject3.put("ad_previous_page", adPreviousPage);
        }
        if (jSONObject3.length() > 0) {
            Nl.put("ad_params", jSONObject3.toString());
        }
        if (C78685UuP.LJJJZ(this.LLIZ)) {
            Nl.put("cmpl_enc", this.LLIZ);
        }
        SearchResultParam searchResultParam4 = this.LJLLILLLL;
        if (searchResultParam4 != null) {
            str3 = searchResultParam4.getSugShopId();
        } else {
            str3 = null;
        }
        if (!C78685UuP.LJJJZ(str3)) {
            str3 = null;
        }
        if (str3 != null) {
            Nl.put("sug_shop_id", str3);
        }
        if (c50948Jz6 != null && (ecSearchEntranceData = c50948Jz6.getEcSearchEntranceData()) != null && (ecUserActions = ecSearchEntranceData.getEcUserActions()) != null) {
            if (!C78685UuP.LJJJZ(ecUserActions)) {
                ecUserActions = null;
            }
            if (ecUserActions != null) {
                Nl.put("ecom_user_actions", ecUserActions);
            }
        }
        SearchResultParam searchResultParam5 = this.LJLLILLLL;
        boolean z2 = true;
        if (searchResultParam5 != null && (resultAttachCard = searchResultParam5.getResultAttachCard()) != null) {
            KBE cardType = resultAttachCard.getCardType();
            if (cardType == null) {
                i = -1;
            } else {
                i = KFI.LIZ[cardType.ordinal()];
            }
            if (i != 1) {
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
            } else {
                String attachProductCardValue = resultAttachCard.getAttachProductCardValue();
                if (attachProductCardValue != null) {
                    Nl.put("attach_products", attachProductCardValue);
                }
            }
        }
        if (c50948Jz6 != null) {
            num = Integer.valueOf(c50948Jz6.getEcSearchEntranceValue());
        } else {
            num = null;
        }
        if (num != null) {
            Nl.put("root_enter_from_type", num.intValue());
        }
        SearchResultParam searchResultParam6 = this.LJLLILLLL;
        boolean z3 = false;
        if (searchResultParam6 == null || !searchResultParam6.getIsFromGeneralSug()) {
            z2 = false;
        }
        if (z2) {
            Nl.remove("sug_shop_id");
            Nl.remove("sug_creator_id");
        }
        KFN kfn = this.LLIIIL;
        if (kfn != null) {
            KFM kfm = EcSearchShopResultPreload.Companion;
            SearchResultParam searchResultParam7 = this.LJLLILLLL;
            if (searchResultParam7 != null) {
                z3 = searchResultParam7.getIsPreloadShopResult();
            }
            if (c50948Jz6 != null) {
                num2 = Integer.valueOf(c50948Jz6.getEcSearchEntranceValue());
            }
            kfm.getClass();
            KFM.LJFF(Nl, kfn, z3, num2);
        }
        this.LLILL = Nl;
        return Nl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object[]] */
    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment
    public final void Wl(KFY kfy) {
        int value;
        String str;
        Activity activity;
        int i;
        InterfaceC51365KDx LIZ;
        InterfaceC51365KDx LIZ2;
        C50948Jz6 ha;
        KEP kep = this.LJLLI;
        if (kep != null && (LIZ2 = kep.LIZ()) != null && (ha = LIZ2.ha()) != null) {
            value = ha.getEcSearchEntranceValue();
        } else {
            value = EnumC51281KAr.DEFAULT.getValue();
        }
        String Jl = Jl();
        String str2 = this.LJZ;
        KEP kep2 = this.LJLLI;
        if (kep2 != null && (LIZ = kep2.LIZ()) != null) {
            str = LIZ.LJIILJJIL();
        } else {
            str = null;
        }
        String valueOf = String.valueOf(JI6.LIZ());
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        String[] strArr = KG3.LIZ;
        ?? r0 = (Object[]) LIZLLL.LJIIIIZZ("search_enable_code_cache_list", String[].class, strArr);
        if (r0 != 0) {
            strArr = r0;
        }
        boolean LJJIJIIJIL = ORY.LJJIJIIJIL(lm(), strArr);
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
        String LIZJ = KFS.LIZJ(Jl, str2, str, valueOf, LJJIJIIJIL, String.valueOf(i), km(), value);
        try {
            Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
            buildUpon.appendQueryParameter("hasFilterPanel", "1");
            String builder = buildUpon.toString();
            o.LJIIIIZZ(builder, "builder.toString()");
            LIZJ = builder;
        } catch (Exception unused) {
        }
        DynamicPatch dynamicPatch = new DynamicPatch();
        dynamicPatch.schema = LIZJ;
        kfy.LJ(new AqS174S0100000_8(this, 57), C47261Igj.LJJIJIL(new DynamicData(0, dynamicPatch, 1, null)));
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment
    public final void Zl(int i) {
        String str;
        InterfaceC51365KDx interfaceC51365KDx;
        KEP kep;
        InterfaceC51365KDx LIZ;
        InterfaceC51365KDx LIZ2;
        this.LLILII = System.currentTimeMillis();
        mo49getActivity();
        KEP kep2 = this.LJLLI;
        if (kep2 != null && (LIZ2 = kep2.LIZ()) != null) {
            str = LIZ2.LJIILJJIL();
        } else {
            str = null;
        }
        SearchResultParam searchResultParam = this.LJLLILLLL;
        if (searchResultParam != null) {
            KFM kfm = EcSearchShopResultPreload.Companion;
            String LIZ3 = SearchServiceImpl.LLLZI().LIZ();
            kfm.getClass();
            this.LLIIIL = KFM.LIZLLL(searchResultParam, LIZ3, str);
        }
        KFN kfn = this.LLIIIL;
        if (kfn == null) {
            return;
        }
        super.Zl(i);
        JSONObject LIZIZ = C1B8.LIZIZ(WM7.SCENE_SERVICE, "view_created", "is_native_request", 1);
        LIZIZ.put("enter_method", this.LLILLIZIL);
        LIZIZ.put("enter_from", this.LLILLJJLI);
        LIZIZ.put("request_type", !this.LLIZLLLIL ? 1 : 0);
        C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZIZ);
        if (this.LLIZLLLIL) {
            this.LLIZLLLIL = false;
        }
        this.LLILLL++;
        mo49getActivity();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                KEP kep3 = this.LJLLI;
                if (kep3 != null) {
                    interfaceC51365KDx = kep3.LIZ();
                } else {
                    interfaceC51365KDx = null;
                }
                if ((interfaceC51365KDx == null || (kep = this.LJLLI) == null || (LIZ = kep.LIZ()) == null || LIZ.LJIILIIL() == null) && TextUtils.isEmpty(this.LLILLJJLI)) {
                    JSONObject LIZIZ2 = C1B8.LIZIZ(WM7.SCENE_SERVICE, "page_error", "is_native_request", 1);
                    LIZIZ2.put("trace_type", 0);
                    LIZIZ2.put("request_count", this.LLILLL);
                    LIZIZ2.put("native_request_count", this.LLILZ);
                    LIZIZ2.put("enter_method", this.LLILLIZIL);
                    LIZIZ2.put("enter_from", this.LLILLJJLI);
                    LIZIZ2.put("visiable", this.LLILZIL ? 1 : 0);
                    LIZIZ2.put("index", this.LJZL);
                    LIZIZ2.put("null_type", this.LLILZLL);
                    LIZIZ2.put("tab_name", KAK.SHOP.getTabName());
                    C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZIZ2);
                    return;
                }
                this.LLILZ++;
                this.LLJIJIL.put("request_begin", Long.valueOf(System.currentTimeMillis()));
                pm(0, 0, true);
                try {
                    long j = 1000;
                    String valueOf = String.valueOf(System.currentTimeMillis() / j);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("query", kfn.getKeyword());
                    String searchChannel = kfn.getSearchChannel();
                    if (searchChannel == null) {
                        searchChannel = "";
                    }
                    linkedHashMap.put("channel", searchChannel);
                    String searchSource = kfn.getSearchSource();
                    if (searchSource == null) {
                        searchSource = "";
                    }
                    linkedHashMap.put("search_method", searchSource);
                    linkedHashMap.put("timestamp", Integer.valueOf((int) (System.currentTimeMillis() / j)));
                    C36033ECf.LIZLLL("search_action", valueOf, linkedHashMap);
                    if (this.LJLLILLLL != null) {
                        K8T.LIZ(C55230Lly.LIZJ(this, null));
                    }
                    if (km()) {
                        hm(kfn);
                        return;
                    }
                    System.currentTimeMillis();
                    new C2313095y(this.LLILLIZIL, this.LLILLL, this.LLILZIL, this.LLILZ, this.LLILZLL, this.LLILLJJLI);
                    ((DynamicSearchShopVM) this.LLIILII.getValue()).gv0(kfn);
                    return;
                } catch (Exception unused) {
                    JSONObject LIZIZ3 = C1B8.LIZIZ(WM7.SCENE_SERVICE, "request_start_error", "is_native_request", 1);
                    LIZIZ3.put("trace_type", 0);
                    LIZIZ3.put("request_count", this.LLILLL);
                    LIZIZ3.put("native_request_count", this.LLILZ);
                    LIZIZ3.put("enter_method", this.LLILLIZIL);
                    LIZIZ3.put("enter_from", this.LLILLJJLI);
                    LIZIZ3.put("visiable", this.LLILZIL ? 1 : 0);
                    LIZIZ3.put("null_type", this.LLILZLL);
                    LIZIZ3.put("tab_name", KAK.SHOP.getTabName());
                    C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZIZ3);
                    return;
                }
            }
        } catch (Exception unused2) {
        }
        m mVar = new m();
        mVar.LJJIIJ("status_code", 10000);
        String templateData = GsonProtectorUtils.toJson(this.LLIIZ, new DynamicSearchShopData(mVar, new RequestInfo(System.currentTimeMillis() - this.LLII)));
        KFY Ol = Ol();
        o.LJIIIIZZ(templateData, "templateData");
        Ol.LIZJ(templateData);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dm(X.C50948Jz6 r7) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchShopFragment.dm(X.Jz6):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void hm(KFN kfn) {
        boolean z;
        int i;
        int i2;
        LinkedHashMap<String, Integer> linkedHashMap;
        C10H c10h = this.LLJ;
        if (c10h != null) {
            c10h.LIZ();
        }
        this.LLJ = new C10H();
        String obj = ECSearchVerticalChunkSizeListSettings.LIZ().chunkSizeList.toString();
        String str = EcSearchApi.LIZ;
        o.LJIIIIZZ(str, "EcSearchApi.SEARCH_HOST");
        String searchChannel = kfn.getSearchChannel();
        if (searchChannel == null) {
            searchChannel = "tiktok_ecom";
        }
        long cursor = kfn.getCursor();
        String keyword = kfn.getKeyword();
        String enterFrom = kfn.getEnterFrom();
        int count = kfn.getCount();
        int hotSearch = kfn.getHotSearch();
        String searchId = kfn.getSearchId();
        String lastSearchId = kfn.getLastSearchId();
        String source = kfn.getSource();
        String searchSource = kfn.getSearchSource();
        int correctType = kfn.getCorrectType();
        C50287JoR filterOption = kfn.getFilterOption();
        if (filterOption != null) {
            z = filterOption.isDefaultOption();
        } else {
            z = 1;
        }
        int i3 = !z;
        C50287JoR filterOption2 = kfn.getFilterOption();
        if (filterOption2 != null) {
            i = filterOption2.getFilterBy();
        } else {
            i = 0;
        }
        C50287JoR filterOption3 = kfn.getFilterOption();
        if (filterOption3 != null) {
            i2 = filterOption3.getSortType();
        } else {
            i2 = 0;
        }
        C50287JoR filterOption4 = kfn.getFilterOption();
        if (filterOption4 == null || (linkedHashMap = filterOption4.activityToFieldMap()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        C10K LJIILIIL = C65314PkE.LJIILIIL(obj, str, searchChannel, cursor, keyword, enterFrom, count, hotSearch, searchId, lastSearchId, source, searchSource, correctType, i3, i, i2, linkedHashMap, kfn.getSearchContext(), kfn.getSugTagText(), kfn.getSugType(), kfn.getSugQueryState(), kfn.getSugCreatorId(), kfn.getAttachProducts(), kfn.getTrafficSourceList(), kfn.getCmplEnc(), kfn.getOriginIsMallTab(), kfn.getEcSearchSessionId(), kfn.getSugShopId(), kfn.getUserRtActs(), kfn.getApiVersion(), kfn.getSearchSessionId(), kfn.getUserActions());
        C72242sW c72242sW = new C72242sW();
        c72242sW.element = System.currentTimeMillis();
        C36581c6 c36581c6 = null;
        nm(0, null);
        if (LJIILIIL != null) {
            AgS74S0300000_6 agS74S0300000_6 = new AgS74S0300000_6(this, c72242sW, kfn, 1);
            C10H c10h2 = this.LLJ;
            if (c10h2 != null) {
                c36581c6 = c10h2.LIZIZ();
            }
            LJIILIIL.LJI(agS74S0300000_6, C10K.LJII, c36581c6);
        }
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        String str2;
        String str3;
        KEA LIZIZ;
        NextLiveData<Integer> LJI;
        InterfaceC51365KDx LIZ;
        C50948Jz6 searchEnterParam;
        super.onCreate(bundle);
        if (DY3.LIZ()) {
            C72818Shy.LIZLLL("filter_option_select", this);
            C72818Shy.LIZLLL("filter_option_cancel", this);
            C72818Shy.LIZLLL("fetch_filter_search_data_success", this);
            C72818Shy.LIZLLL("ec_search_result_page_scroll_to_top", this);
        }
        JSONObject LIZJ = C65232Piu.LIZJ(WM7.SCENE_SERVICE, "shop_create");
        if (bundle != null) {
            i = 1;
        } else {
            i = 0;
        }
        LIZJ.put("is_native_request", i);
        SearchResultParam searchResultParam = this.LJLLILLLL;
        if (searchResultParam != null) {
            str = searchResultParam.getEnterMethod();
        } else {
            str = null;
        }
        LIZJ.put("enter_method", str);
        SearchResultParam searchResultParam2 = this.LJLLILLLL;
        if (searchResultParam2 != null && (searchEnterParam = searchResultParam2.getSearchEnterParam()) != null) {
            str2 = searchEnterParam.getEnterSearchFrom();
        } else {
            str2 = null;
        }
        LIZJ.put("enter_from", str2);
        C48658J7u.LIZIZ("rd_ec_search_request_trace", LIZJ);
        this.LLIIII = true;
        this.LLIZ = a.LJIIZILJ().LIZJ();
        this.LLJIJIL.put("start_navigation", Long.valueOf(System.currentTimeMillis()));
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            KEP kep = this.LJLLI;
            if (kep != null && (LIZ = kep.LIZ()) != null) {
                str3 = LIZ.LIZIZ();
            } else {
                str3 = null;
            }
            if (o.LJ(str3, "simple")) {
                this.LLIILZL = (EcSearchStartViewModel) ViewModelProviders.of(mo49getActivity).get(EcSearchStartViewModel.class);
            }
            KEP kep2 = this.LJLLI;
            if (kep2 != null && (LIZIZ = kep2.LIZIZ()) != null && (LJI = LIZIZ.LJI()) != null) {
                LJI.observe(this, new AObserverS76S0100000_8(this, 23));
            }
        }
        EcomSearchServiceImpl.LJJJJZI().LIZ(null, this.LJLLILLLL, "shop_result_on_create");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        String str2;
        InterfaceC51365KDx LIZ;
        KEP kep;
        InterfaceC51365KDx LIZ2;
        String string;
        KEX LIZLLL;
        KEX LIZLLL2;
        KEX LIZLLL3;
        KEX LIZLLL4;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        Object obj = null;
        if (mo49getActivity != null) {
            str = Integer.valueOf(mo49getActivity.hashCode()).toString();
        } else {
            str = null;
        }
        InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
        String str3 = "";
        if (interfaceC78280Uns == null || (str2 = u.LJJIJIL(interfaceC78280Uns, "container_unique_id", "")) == null) {
            str2 = "";
        }
        if (!o.LJ(str, str2)) {
            return;
        }
        try {
            String str4 = c199097rd.LJLIL;
            switch (str4.hashCode()) {
                case -2048023393:
                    if (!str4.equals("ec_search_result_page_scroll_to_top")) {
                        obj = C76800UCe.LIZ;
                        break;
                    } else {
                        KFW kfw = this.LLIIJI;
                        if (kfw != null) {
                            kfw.LJ();
                        }
                        obj = Integer.valueOf(Log.i("SearchFragment", "shop page receive js event(ec_search_result_page_scroll_to_top)"));
                        break;
                    }
                case -1575923459:
                    if (!str4.equals("filter_option_cancel")) {
                        obj = C76800UCe.LIZ;
                        break;
                    } else {
                        C50287JoR c50287JoR = new C50287JoR();
                        c50287JoR.setDefaultOption(true);
                        this.LJLJI = c50287JoR;
                        SearchResultParam searchResultParam = this.LJLLILLLL;
                        if (searchResultParam != null) {
                            searchResultParam.setFilterOption(null);
                        }
                        KEP kep2 = this.LJLLI;
                        if (kep2 != null && (LIZLLL4 = kep2.LIZLLL()) != null) {
                            LIZLLL4.LIZIZ(false);
                        }
                        KEP kep3 = this.LJLLI;
                        if (kep3 != null && (LIZLLL3 = kep3.LIZLLL()) != null) {
                            LIZLLL3.LIZ(false);
                        }
                        this.LJLILLLLZI = false;
                        obj = C76800UCe.LIZ;
                        break;
                    }
                    break;
                case -1114220673:
                    if (!str4.equals("filter_option_select")) {
                        obj = C76800UCe.LIZ;
                        break;
                    } else {
                        C50287JoR c50287JoR2 = new C50287JoR();
                        c50287JoR2.setDefaultOption(false);
                        this.LJLJI = c50287JoR2;
                        SearchResultParam searchResultParam2 = this.LJLLILLLL;
                        if (searchResultParam2 != null) {
                            searchResultParam2.setFilterOption(c50287JoR2);
                        }
                        KEP kep4 = this.LJLLI;
                        if (kep4 != null && (LIZLLL2 = kep4.LIZLLL()) != null) {
                            LIZLLL2.LIZIZ(true);
                        }
                        KEP kep5 = this.LJLLI;
                        if (kep5 != null && (LIZLLL = kep5.LIZLLL()) != null) {
                            LIZLLL.LIZ(true);
                        }
                        this.LJLILLLLZI = true;
                        obj = C76800UCe.LIZ;
                        break;
                    }
                    break;
                case -835798269:
                    if (!str4.equals("fetch_filter_search_data_success")) {
                        obj = C76800UCe.LIZ;
                        break;
                    } else {
                        InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
                        if (interfaceC78280Uns2 != null && (string = interfaceC78280Uns2.getString("search_id")) != null) {
                            str3 = string;
                        }
                        SearchResultParam searchResultParam3 = this.LJLLILLLL;
                        if (searchResultParam3 != null && (kep = this.LJLLI) != null && (LIZ2 = kep.LIZ()) != null) {
                            LIZ2.LJIIIZ(searchResultParam3, str3, KAK.SHOP);
                        }
                        KEP kep6 = this.LJLLI;
                        if (kep6 != null && (LIZ = kep6.LIZ()) != null) {
                            LIZ.LJIIL(str3);
                            obj = C76800UCe.LIZ;
                            break;
                        }
                    }
                    break;
                default:
                    obj = C76800UCe.LIZ;
                    break;
            }
            C3C5.m7constructorimpl(obj);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public final void qm(boolean z) {
        K9C LIZ;
        if (z && (LIZ = K8T.LIZ(C55230Lly.LIZJ(this, null))) != null) {
            LIZ.LJLJI = KAK.SHOP;
        }
        Ol().LIZ("changePageActive", C770830u.LIZLLL("active", z ? 1 : 0));
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "7304024107160354162");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/result/common/core/ui/fragment/DynamicSearchShopFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/result/common/core/ui/fragment/DynamicSearchShopFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        this.LLILZIL = z;
        super.setUserVisibleHint(z);
        if (!C48054ItW.LIZ() && isActive()) {
            qm(z);
        }
        C2U8.LIZ(new IGH(z));
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/result/common/core/ui/fragment/DynamicSearchShopFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    public final void fm(String str, Throwable th) {
        LJIJ();
        pm(0, 0, false);
        if (str == null) {
            m mVar = new m();
            m mVar2 = new m();
            mVar2.LJJIIJ("cursor", -1);
            mVar2.LJJIII(Boolean.FALSE, "has_more");
            mVar2.LJJIIJ("items_count", 0);
            mVar.LJJII("chunk_meta", mVar2);
            mVar.LJJIIJ("status_code", -1);
            mVar.LJJIIZ("status_msg", "");
            mVar.LJJIIZ("enter_from_sub", C17N.LJJJJJL(this).cs().LIZJ().LJLILLLLZI);
            str = GsonProtectorUtils.toJson(this.LLIIZ, new DynamicSearchShopData(mVar, new RequestInfo(System.currentTimeMillis() - this.LLII)));
            o.LJIIIIZZ(str, "gson.toJson(\n           …\n            ),\n        )");
        }
        C51395KFb.LIZ(new AqS75S1100000_8(this, str, 11));
        String message = th.getMessage();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "shop_search_result");
        if (message != null) {
            linkedHashMap.put("error_msg", message);
        }
        linkedHashMap.put("tab_name", "shop");
        C76542zS.LIZ("rd_tiktokec_chunk_error", linkedHashMap);
    }

    public final void nm(int i, m mVar) {
        int i2;
        if (mVar != null) {
            try {
                if (mVar.LJJIJ("chunk_meta") != null) {
                    j LJJIJ = mVar.LJJIJ("chunk_meta");
                    o.LJII(LJJIJ, "null cannot be cast to non-null type com.google.gson.JsonObject");
                    m mVar2 = (m) LJJIJ;
                    j LJJIJ2 = mVar2.LJJIJ("cursor");
                    int i3 = 0;
                    if (LJJIJ2 != null) {
                        i2 = LJJIJ2.LJIILJJIL();
                    } else {
                        i2 = 0;
                    }
                    j LJJIJ3 = mVar2.LJJIJ("items_count");
                    if (LJJIJ3 != null) {
                        i3 = LJJIJ3.LJIILJJIL();
                    }
                    vm(i2, i3, i);
                    return;
                }
            } catch (Exception unused) {
                vm(-2, -2, i);
                return;
            }
        }
        vm(-1, -1, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void om(long r5, java.lang.String r7) {
        /*
            r4 = this;
            X.KEP r0 = r4.LJLLI
            r3 = 0
            if (r0 == 0) goto L75
            X.KDx r0 = r0.LIZ()
            if (r0 == 0) goto L75
            X.Jz6 r2 = r0.ha()
            if (r2 == 0) goto L75
            int r1 = r2.getEcSearchEntranceValue()
            com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData r0 = r2.getEcSearchEntranceData()
            if (r0 == 0) goto L7b
            com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData r0 = r2.getEcSearchEntranceData()
            if (r0 == 0) goto L25
            java.lang.String r3 = r0.getResultType()
        L25:
            java.lang.String r0 = "phase"
            org.json.JSONObject r2 = X.C65232Piu.LIZJ(r0, r7)
            java.lang.String r1 = "cost"
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r2.put(r1, r0)
            java.lang.String r1 = "enter_search_from"
            java.lang.String r0 = r4.lm()
            r2.put(r1, r0)
            java.lang.String r0 = "search_type"
            r2.put(r0, r3)
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = r4.LJZ
            r2.put(r1, r0)
            X.Joz r0 = r4.LJLJJI
            java.lang.String r1 = r0.getSearchId()
            java.lang.String r0 = "search_id"
            r2.put(r0, r1)
            X.KAK r0 = X.KAK.SHOP
            java.lang.String r1 = r0.getTabName()
            java.lang.String r0 = "tab_name"
            r2.put(r0, r1)
            java.lang.Integer r0 = r4.mm()
            if (r0 == 0) goto L6f
            int r1 = r0.intValue()
            java.lang.String r0 = "root_enter_from_type"
            r2.put(r0, r1)
        L6f:
            java.lang.String r0 = "rd_ec_search_page_load_detail"
            X.C48658J7u.LIZIZ(r0, r2)
            return
        L75:
            X.KAr r0 = X.EnumC51281KAr.DEFAULT
            int r1 = r0.getValue()
        L7b:
            X.KB0 r0 = X.KB1.LIZLLL(r1)
            java.lang.String r3 = r0.getValue()
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchShopFragment.om(long, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.fragment.EcDynamicSearchFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        try {
            AssemViewModel.asyncSubscribe$default((DynamicSearchShopVM) this.LLIILII.getValue(), new TBT() { // from class: X.EBw
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C36022EBu) obj).LJLIL;
                }
            }, null, new AqS174S0100000_8(this, 58), null, new AqS174S0100000_8(this, 59), 10, null);
        } catch (Exception unused) {
        }
        super.onViewCreated(view, bundle);
    }

    public final void sm(Boolean bool, long j) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "shop_search_result");
        if (bool != null) {
            linkedHashMap.put("is_success", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        linkedHashMap.put("cost", Long.valueOf(j));
        linkedHashMap.put("tab_name", "shop");
        C76542zS.LIZ("rd_tiktokec_chunk_duration", linkedHashMap);
    }

    public final void pm(int i, int i2, boolean z) {
        String str;
        String str2;
        int i3;
        String optString;
        if (z) {
            try {
                this.LLIL = System.currentTimeMillis();
            } catch (Exception unused) {
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LLIL;
        if (km()) {
            str = "/aweme/v1/search/stream/ecom/";
        } else {
            str = "/aweme/v1/search/single/ecom/";
        }
        IECommerceService createIECommerceServicebyMonsterPlugin = ECommerceService.createIECommerceServicebyMonsterPlugin(false);
        if (z) {
            str2 = "rd_ec_request_send";
        } else {
            str2 = "rd_ec_request_result";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("request_method", "template");
        jSONObject.put("start_click_to_now", System.currentTimeMillis() - this.LLILII);
        int i4 = 1;
        if (this.LLILIL) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        jSONObject.put("request_type", i3);
        JSONObject jSONObject2 = this.LLILL;
        if (jSONObject2 == null || (optString = jSONObject2.optString("enter_from")) == null) {
            optString = "";
        }
        jSONObject.put("enter_from", optString);
        jSONObject.put("enter_method", this.LJZ);
        if (!z) {
            jSONObject.put("api_duration", currentTimeMillis);
            jSONObject.put("is_success", i);
            jSONObject.put("item_count", i2);
            jSONObject.put("params", 0);
        }
        jSONObject.put("api_path", str);
        jSONObject.put("rd_page_type", "native");
        if (C36033ECf.LIZJ("goods_view_action") == null) {
            i4 = 0;
        }
        jSONObject.put("has_user_action_info", i4);
        Integer mm = mm();
        if (mm != null) {
            jSONObject.put("root_enter_from_type", mm.intValue());
        }
        createIECommerceServicebyMonsterPlugin.reportVerticalSearchApiLog(str2, jSONObject);
        if (!z) {
            this.LLILIL = false;
        }
    }

    public final void vm(int i, int i2, int i3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "shop_search_result");
        linkedHashMap.put("chunk_cursor", Integer.valueOf(i));
        linkedHashMap.put("chunk_count", Integer.valueOf(i2));
        linkedHashMap.put("step", Integer.valueOf(i3));
        C76542zS.LIZ("rd_tiktokec_chunk_duration", linkedHashMap);
    }
}
