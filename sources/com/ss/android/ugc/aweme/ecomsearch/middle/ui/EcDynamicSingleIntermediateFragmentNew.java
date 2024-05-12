package com.ss.android.ugc.aweme.ecomsearch.middle.ui;

import X.AbstractC73745Swv;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C1HQ;
import X.C221108m2;
import X.C27739Aud;
import X.C278817o;
import X.C32I;
import X.C34512Dga;
import X.C34K;
import X.C36922EeM;
import X.C37831Et1;
import X.C38350F3i;
import X.C39419FdX;
import X.C47135Ieh;
import X.C47261Igj;
import X.C48658J7u;
import X.C50295JoZ;
import X.C50433Jqn;
import X.C50469JrN;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50723JvT;
import X.C50764Jw8;
import X.C50779JwN;
import X.C50782JwQ;
import X.C50833JxF;
import X.C50845JxR;
import X.C50856Jxc;
import X.C50863Jxj;
import X.C50868Jxo;
import X.C50948Jz6;
import X.C51090K3i;
import X.C51110K4c;
import X.C51141K5h;
import X.C51214K8c;
import X.C51246K9i;
import X.C51248K9k;
import X.C51249K9l;
import X.C51252K9o;
import X.C51253K9p;
import X.C51258K9u;
import X.C51272KAi;
import X.C51307KBr;
import X.C51345KDd;
import X.C51541KKr;
import X.C56642Ke;
import X.C61842bk;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65777Prh;
import X.C73969T1h;
import X.C78685UuP;
import X.C78857UxB;
import X.C85999Xp5;
import X.C9CW;
import X.EnumC51280KAq;
import X.EnumC51281KAr;
import X.InterfaceC178696zp;
import X.InterfaceC50548Jse;
import X.InterfaceC50796Jwe;
import X.InterfaceC51113K4f;
import X.InterfaceC60761Nsz;
import X.InterfaceC88472Yns;
import X.JTO;
import X.K0W;
import X.K75;
import X.K8K;
import X.KA1;
import X.KAD;
import X.KAI;
import X.KAK;
import X.KAL;
import X.KAO;
import X.KAY;
import X.KB1;
import X.KCU;
import X.KL8;
import X.ORZ;
import X.OSZ;
import X.QD3;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.T16;
import X.WM7;
import X.X1D;
import Y.AObserverS76S0100000_8;
import Y.AfS57S0200000_8;
import Y.IDDListenerS394S0100000_8;
import Y.IDhS69S0200000_8;
import a04.IDfS2S0000000_8;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.internal.m;
import com.google.gson.n;
import com.lynx.tasm.TemplateData;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.ab.EcommerceSearchIntermediateCardsConfig;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.config.SearchSecurityControlConfig;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.ecomsearch.middle.viewmodel.EcSuggestWordsViewModel;
import com.ss.android.ugc.aweme.ecomsearch.utils.EcIntermediatePreload;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.lynx.core.model.DynamicData;
import com.ss.android.ugc.aweme.model.EcommerceDynamicData;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.SearchMiddleForEcService;
import com.ss.android.ugc.aweme.search.ecommerce.config.TiktokEcSearchRegionConfigSettings;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import defpackage.e1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class EcDynamicSingleIntermediateFragmentNew extends EcAbstractSearchIntermediateFragmentNew implements GenericLifecycleObserver {
    public C50863Jxj LJZL;
    public boolean LL;
    public EcSuggestWordsViewModel LLD;
    public int LLFF;
    public String LLFFF;
    public final C62822Ol8 LLFII;
    public final AObserverS76S0100000_8 LLFZ;
    public final AObserverS76S0100000_8 LLI;
    public final Map<Integer, View> LLIFFJFJJ = new LinkedHashMap();
    public final Gson LLF = GsonHolder.LIZLLL().LIZ();

    public final void Vl() {
        String str;
        String str2;
        C51258K9u.LIZJ = false;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C50948Jz6 LIZIZ = JTO.LIZIZ(mo49getActivity());
        if (LIZIZ != null) {
            str = LIZIZ.getEnterSearchFrom();
        } else {
            str = null;
        }
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("is_force", 1);
        C50948Jz6 LIZIZ2 = JTO.LIZIZ(mo49getActivity());
        if (LIZIZ2 == null || (str2 = LIZIZ2.getEnterSearchFrom()) == null) {
            str2 = "";
        }
        hm("guess", "update_data", true, false, str2);
        TemplateData LJ = TemplateData.LJ(linkedHashMap);
        LJ.LIZLLL = "guessSearchDataProcess";
        C50863Jxj c50863Jxj = this.LJZL;
        if (c50863Jxj != null) {
            c50863Jxj.LJIIJJI(LJ);
        } else {
            o.LJIJI("dynamicViewsContainer");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIFFJFJJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public EcDynamicSingleIntermediateFragmentNew() {
        new Handler();
        this.LLFF = -1;
        this.LLFII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 76));
        this.LLFZ = new AObserverS76S0100000_8(this, 14);
        this.LLI = new AObserverS76S0100000_8(this, 13);
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew
    public final void Ol() {
        String str;
        boolean z;
        String str2;
        boolean z2;
        InterfaceC51113K4f LJI;
        String str3;
        Word word;
        K75 k75;
        InterfaceC50796Jwe LIZJ;
        Word LJIJJLI;
        K75 k752;
        InterfaceC50796Jwe LIZJ2;
        C50469JrN searchVideoModel;
        ECSearchEntranceData eCSearchEntranceData;
        String str4;
        String str5;
        int i;
        int i2;
        String str6;
        String str7;
        int i3;
        String str8;
        int i4;
        String str9;
        Object obj;
        Object obj2;
        Integer num;
        Object obj3;
        String Yl;
        String str10;
        String str11;
        NextLiveData<C50764Jw8<String>> nextLiveData;
        String str12;
        NextLiveData<C50764Jw8<String>> nextLiveData2;
        String str13;
        String str14;
        ECSearchEntranceData ecSearchEntranceData;
        ECSearchEntranceData eCSearchEntranceData2;
        InterfaceC51113K4f LJI2;
        String str15;
        Map map;
        C51110K4c singleSearchEcommerceModel;
        KCU LJII;
        C50469JrN searchVideoModel2;
        C50469JrN searchVideoModel3;
        InterfaceC178696zp LIZIZ;
        C50433Jqn searchCommonModel;
        InterfaceC51113K4f LJI3;
        int i5;
        String str16;
        int i6;
        InterfaceC178696zp LIZIZ2;
        HashMap hashMap;
        ECSearchEntranceData ecSearchEntranceData2;
        String historyMaxCount;
        String str17;
        String str18;
        ViewGroup viewGroup;
        Il().setVisibility(0);
        C50863Jxj c50863Jxj = this.LJZL;
        Integer num2 = null;
        if (c50863Jxj != null) {
            ViewParent parent = c50863Jxj.LJIIJ.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                viewGroup.removeAllViews();
            }
            C50863Jxj c50863Jxj2 = this.LJZL;
            if (c50863Jxj2 != null) {
                Il().addView(c50863Jxj2.LJIIJ, new ViewGroup.LayoutParams(-1, -1));
                C50948Jz6 LIZIZ3 = JTO.LIZIZ(mo49getActivity());
                if (LIZIZ3 != null) {
                    LIZIZ3.getEnterSearchFrom();
                }
                ECommerceService.createIECommerceServicebyMonsterPlugin(false);
                List<EcommerceDynamicData> LIZ = EcommerceSearchIntermediateCardsConfig.LIZ();
                ArrayList arrayList = new ArrayList(C32I.LJJL(LIZ, 10));
                for (EcommerceDynamicData ecommerceDynamicData : LIZ) {
                    arrayList.add(new DynamicData(ecommerceDynamicData.cardType, ecommerceDynamicData.dynamicPatch));
                }
                DynamicData dynamicData = (DynamicData) ORZ.LJLLLLLL(0, arrayList);
                if (dynamicData != null) {
                    this.LLFF = C50868Jxo.LIZ(dynamicData.dynamicPatch);
                    ECSearchEntranceData wl = wl();
                    if (wl != null) {
                        str17 = wl.getMiddleHistoryControlStyle();
                    } else {
                        str17 = null;
                    }
                    if (C78685UuP.LJJJZ(str17)) {
                        try {
                            Uri.Builder buildUpon = UriProtector.parse(dynamicData.dynamicPatch.schema).buildUpon();
                            if (C78685UuP.LJJJZ(str17) && str17 != null) {
                                buildUpon.appendQueryParameter("history_control_style", str17);
                            }
                            str18 = buildUpon.toString();
                        } catch (Exception unused) {
                            str18 = dynamicData.dynamicPatch.schema;
                        }
                        dynamicData.dynamicPatch.schema = str18;
                    }
                }
                if (this.LJZL != null) {
                    new IDfS2S0000000_8(0);
                    C50863Jxj c50863Jxj3 = this.LJZL;
                    if (c50863Jxj3 != null) {
                        c50863Jxj3.LIZLLL = new KA1(this);
                        C37831Et1.LIZIZ(K8K.class, null, 6);
                        C37831Et1.LIZIZ(K0W.class, null, 6);
                        C37831Et1.LIZIZ(C51541KKr.class, null, 6);
                        if (!arrayList.isEmpty()) {
                            Tl();
                            DynamicPatch dynamicData2 = ((DynamicData) ListProtector.get(arrayList, 0)).dynamicPatch;
                            C50948Jz6 Wa0 = Wa0();
                            if (Wa0 != null && Wa0.getEcSearchEntranceValue() == EnumC51280KAq.ORDER.getValue()) {
                                C50863Jxj c50863Jxj4 = this.LJZL;
                                if (c50863Jxj4 != null) {
                                    o.LJIIIZ(dynamicData2, "dynamicData");
                                    c50863Jxj4.LJIIJ();
                                    C1HQ c1hq = new C1HQ();
                                    c50863Jxj4.LJIIIIZZ.add(AbstractC73745Swv.LJFF(c1hq).LJI(new IDhS69S0200000_8(dynamicData2, c1hq, 0)).LJIILJJIL(T16.LIZIZ).LJII(C73969T1h.LIZIZ()).LJIIIZ(new AfS57S0200000_8(c50863Jxj4, dynamicData2, 8)));
                                } else {
                                    o.LJIJI("dynamicViewsContainer");
                                    throw null;
                                }
                            } else if ((KL8.LIZ() == 2 || KL8.LIZ() == 3 || KL8.LIZ() == 4) && !C51272KAi.LIZ()) {
                                C50863Jxj c50863Jxj5 = this.LJZL;
                                if (c50863Jxj5 != null) {
                                    c50863Jxj5.LJIILJJIL(dynamicData2, Yl(this, true, null, 2));
                                } else {
                                    o.LJIJI("dynamicViewsContainer");
                                    throw null;
                                }
                            } else if (C51272KAi.LIZ() && C51272KAi.LIZ) {
                                KAY kay = KAY.LOAD;
                                o.LJIIIZ(kay, "<set-?>");
                                C51248K9k.LIZIZ = kay;
                                C50863Jxj c50863Jxj6 = this.LJZL;
                                if (c50863Jxj6 != null) {
                                    C50948Jz6 LIZIZ4 = JTO.LIZIZ(mo49getActivity());
                                    if (LIZIZ4 != null && (ecSearchEntranceData2 = LIZIZ4.getEcSearchEntranceData()) != null && (historyMaxCount = ecSearchEntranceData2.getHistoryMaxCount()) != null) {
                                        num2 = C38350F3i.LJJIL(historyMaxCount);
                                    }
                                    List<SearchHistory> xl = xl();
                                    if (num2 != null) {
                                        i5 = num2.intValue();
                                    } else {
                                        i5 = 20;
                                    }
                                    List<SearchHistory> LLILLL = ORZ.LLILLL(xl, i5);
                                    C50948Jz6 LIZIZ5 = JTO.LIZIZ(mo49getActivity());
                                    if (LIZIZ5 == null || (str16 = LIZIZ5.getEnterSearchFrom()) == null) {
                                        str16 = "";
                                    }
                                    hm("history", "request", LLILLL.isEmpty(), true, str16);
                                    hm("history", "response_success", LLILLL.isEmpty(), true, str16);
                                    ArrayList arrayList2 = new ArrayList();
                                    for (SearchHistory searchHistory : LLILLL) {
                                        HashMap hashMap2 = new HashMap();
                                        hashMap2.put("word", searchHistory.keyword);
                                        arrayList2.add(hashMap2);
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    try {
                                        EcIntermediatePreload.Companion.getClass();
                                        String str19 = EcIntermediatePreload.suggestPreResponseStr;
                                        if (str19 != null && str19.length() > 0 && C51248K9k.LIZJ) {
                                            hashMap = (HashMap) this.LLF.LJI(EcIntermediatePreload.suggestPreResponseStr, HashMap.class);
                                        } else {
                                            hashMap = (HashMap) this.LLF.LJI(Zl(), HashMap.class);
                                        }
                                        linkedHashMap.put("guessSearchData", hashMap);
                                    } catch (Exception unused2) {
                                    }
                                    linkedHashMap.put("historyList", arrayList2);
                                    linkedHashMap.put("is_ecommerce_cache", Integer.valueOf(C51258K9u.LIZJ ? 1 : 0));
                                    linkedHashMap.put("should_end_refresh_data", 0);
                                    linkedHashMap.put("isSuggestHistory", 0);
                                    K75 k753 = this.LJLZ;
                                    if (k753 != null && (LIZIZ2 = k753.LIZIZ()) != null) {
                                        i6 = LIZIZ2.LIZIZ();
                                    } else {
                                        i6 = -1;
                                    }
                                    if (i6 >= 0) {
                                        linkedHashMap.put("current_tab_name", C51214K8c.LJ(i6));
                                    } else {
                                        linkedHashMap.put("current_tab_name", KAK.SHOP.getTabName());
                                    }
                                    linkedHashMap.put("is_force", Integer.valueOf(LLILLL.isEmpty() ? 1 : 0));
                                    linkedHashMap.put("enter_from", str16);
                                    c50863Jxj6.LJIILL(dynamicData2, C27739Aud.LJI(linkedHashMap));
                                } else {
                                    o.LJIJI("dynamicViewsContainer");
                                    throw null;
                                }
                            } else {
                                C50863Jxj c50863Jxj7 = this.LJZL;
                                if (c50863Jxj7 != null) {
                                    c50863Jxj7.LJIILIIL(dynamicData2, C50845JxR.LIZ());
                                } else {
                                    o.LJIJI("dynamicViewsContainer");
                                    throw null;
                                }
                            }
                        }
                        super.Ol();
                        C50856Jxc c50856Jxc = new C50856Jxc();
                        c50856Jxc.LJIILL("type", "click_input_area");
                        c50856Jxc.LJIILIIL();
                        C51090K3i.LIZLLL = System.currentTimeMillis();
                        Object obtainLogData = JTO.LIZ(mo49getActivity()).hv0().obtainLogData("search_position");
                        if (obtainLogData != null) {
                            str = obtainLogData.toString();
                        } else {
                            C50948Jz6 c50948Jz6 = JTO.LIZ(mo49getActivity()).LJLIL;
                            ECSearchEntranceData wl2 = wl();
                            if (wl2 != null) {
                                str = wl2.getMiddleSearchPosition();
                            } else {
                                str = null;
                            }
                            if (!C78685UuP.LJJJZ(str) || str == null) {
                                if (c50948Jz6 != null) {
                                    str = c50948Jz6.getLastSearchPosition();
                                } else {
                                    str = null;
                                }
                                if (!C78685UuP.LJJJZ(str) || str == null) {
                                    if (KB1.LIZ(c50948Jz6) == EnumC51281KAr.PDP.getValue()) {
                                        str = "product_detail";
                                    } else {
                                        str = KAI.LIZIZ(Hl());
                                        C51141K5h c51141K5h = C51141K5h.LIZ;
                                        ActivityC45651qj mo49getActivity = mo49getActivity();
                                        c51141K5h.getClass();
                                        if (C51141K5h.LIZ(mo49getActivity)) {
                                            str = SearchMiddleForEcService.LJJJJLI().LJIJ(Hl());
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            str = Kl();
                                        }
                                    }
                                }
                            }
                        }
                        boolean z3 = C50782JwQ.LIZ;
                        C50948Jz6 LIZIZ6 = JTO.LIZIZ(mo49getActivity());
                        int LIZ2 = KB1.LIZ(LIZIZ6);
                        IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
                        K75 k754 = this.LJLZ;
                        if (k754 != null && (LJI3 = k754.LJI()) != null) {
                            z = LJI3.LJ();
                        } else {
                            z = false;
                        }
                        if (!z || z3) {
                            C50948Jz6 LIZIZ7 = JTO.LIZIZ(mo49getActivity());
                            int LIZ3 = KB1.LIZ(LIZIZ7);
                            IEcomSearchService LJJJJZI2 = EcomSearchServiceImpl.LJJJJZI();
                            if (LIZIZ7 == null || LIZIZ7.getEcSearchEntranceData() == null ? !TiktokEcSearchRegionConfigSettings.LIZ().disableSuggestGuideFromMall && (LIZ3 != EnumC51281KAr.PDP.getValue() ? LIZ3 != EnumC51281KAr.FASHION.getValue() || !e1.LIZ(31744, "disable_guess_from_fashion", true, false) : !LJJJJZI2.LJIIJJI()) : !LJJJJZI2.LJJJJJ(LIZIZ7.getEcSearchEntranceData())) {
                                SearchSecurityControlConfig.LIZ.getClass();
                                if (!SearchSecurityControlConfig.LIZ().disableSuggestGuide) {
                                    C50651JuJ c50651JuJ = C50652JuK.Companion;
                                    ActivityC45651qj mo49getActivity2 = mo49getActivity();
                                    c50651JuJ.getClass();
                                    C50650JuI LJII2 = C50651JuJ.LJII(mo49getActivity2);
                                    if (LJII2 != null && (searchVideoModel = LJII2.getSearchVideoModel()) != null) {
                                        str2 = searchVideoModel.getGroupId();
                                    } else {
                                        str2 = null;
                                    }
                                    if (Sl()) {
                                        C50948Jz6 LIZIZ8 = JTO.LIZIZ(mo49getActivity());
                                        if (LIZIZ8 == null || (str3 = LIZIZ8.getEnterSearchFrom()) == null) {
                                            str3 = "";
                                        }
                                        hm("guess", "request", true, false, str3);
                                        cm(null);
                                        if (!z) {
                                            C51141K5h c51141K5h2 = C51141K5h.LIZ;
                                            ActivityC45651qj mo49getActivity3 = mo49getActivity();
                                            c51141K5h2.getClass();
                                            if (C51141K5h.LIZ(mo49getActivity3)) {
                                                ISearchMiddleForECService iSearchMiddleForECService = this.LJZ;
                                                if (iSearchMiddleForECService != null && (LJIJJLI = iSearchMiddleForECService.LJIJJLI(this)) != null && (k752 = this.LJLZ) != null && (LIZJ2 = k752.LIZJ()) != null) {
                                                    LIZJ2.LIZ(LJIJJLI);
                                                }
                                            } else {
                                                KAL kal = (KAL) ((LinkedHashMap) C51090K3i.LIZIZ).get(str2);
                                                if (kal != null && (word = kal.LJII) != null && (k75 = this.LJLZ) != null && (LIZJ = k75.LIZJ()) != null) {
                                                    LIZJ.LIZ(word);
                                                }
                                            }
                                        }
                                    } else {
                                        C51141K5h c51141K5h3 = C51141K5h.LIZ;
                                        ActivityC45651qj mo49getActivity4 = mo49getActivity();
                                        c51141K5h3.getClass();
                                        if (C51141K5h.LIZ(mo49getActivity4)) {
                                            SearchMiddleForEcService.LJJJJLI().LJJIJIL(this, z);
                                        } else {
                                            String LIZ4 = C51090K3i.LIZ();
                                            if (LIZ4 != null) {
                                                Map<String, KAL> map2 = C51090K3i.LIZIZ;
                                                if (!map2.containsKey(LIZ4)) {
                                                    map2.put(LIZ4, new KAL(null));
                                                }
                                            }
                                            if (z) {
                                                C51090K3i.LIZJ = 1;
                                            } else {
                                                C51090K3i.LIZJ = 0;
                                            }
                                        }
                                        C48658J7u.LIZIZ("rd_ec_search_middle_trace", C47135Ieh.LJ(WM7.SCENE_SERVICE, "preload_check", "step", CardStruct.IStatusCode.DEFAULT));
                                        if (C51272KAi.LIZ()) {
                                            EcIntermediatePreload.Companion.getClass();
                                            String str20 = EcIntermediatePreload.suggestPreResponseStr;
                                            if (str20 != null && str20.length() > 0 && C51248K9k.LIZJ) {
                                                C51248K9k.LIZJ = false;
                                                EcIntermediatePreload.suggestPreResponseStr = null;
                                                JSONObject jSONObject = new JSONObject();
                                                jSONObject.put(WM7.SCENE_SERVICE, "preload_check");
                                                jSONObject.put("step", "1");
                                                C48658J7u.LIZIZ("rd_ec_search_middle_trace", jSONObject);
                                            }
                                        }
                                        EcSuggestWordsViewModel ecSuggestWordsViewModel = this.LLD;
                                        if (ecSuggestWordsViewModel != null) {
                                            C50948Jz6 LIZIZ9 = JTO.LIZIZ(mo49getActivity());
                                            K75 k755 = this.LJLZ;
                                            if (k755 != null && (LJI = k755.LJI()) != null) {
                                                z2 = LJI.LIZJ();
                                            } else {
                                                z2 = false;
                                            }
                                            String Nl = Nl();
                                            C50650JuI LJII3 = C50651JuJ.LJII(mo49getActivity());
                                            if (LJII3 == null) {
                                                LJII3 = new C50650JuI(null, null, null, null, null, null, null, 127, null);
                                            }
                                            ecSuggestWordsViewModel.gv0(LIZIZ9, str2, z2, Nl, LJII3, mo49getActivity());
                                        }
                                    }
                                }
                            }
                        } else {
                            z3 = false;
                        }
                        if (LIZIZ6 != null) {
                            eCSearchEntranceData = LIZIZ6.getEcSearchEntranceData();
                        } else {
                            eCSearchEntranceData = null;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        C50948Jz6 LIZIZ10 = JTO.LIZIZ(mo49getActivity());
                        if (LIZIZ10 != null) {
                            str4 = LIZIZ10.getEnterSearchFrom();
                        } else {
                            str4 = null;
                        }
                        jSONObject2.put("enter_from", str4);
                        C50651JuJ c50651JuJ2 = C50652JuK.Companion;
                        ActivityC45651qj mo49getActivity5 = mo49getActivity();
                        c50651JuJ2.getClass();
                        C50650JuI LJII4 = C50651JuJ.LJII(mo49getActivity5);
                        if (LJII4 != null && (searchCommonModel = LJII4.getSearchCommonModel()) != null) {
                            str5 = searchCommonModel.getEnterFrom();
                        } else {
                            str5 = null;
                        }
                        jSONObject2.put("enter_from_x", str5);
                        jSONObject2.put("search_position", str);
                        if (eCSearchEntranceData == null ? TiktokEcSearchRegionConfigSettings.LIZ().disableSuggestGuideFromMall : LJJJJZI.LJJJJJ(LIZIZ6.getEcSearchEntranceData())) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        jSONObject2.put("show_suggest_search_words", i);
                        K75 k756 = this.LJLZ;
                        if (k756 != null && (LIZIZ = k756.LIZIZ()) != null) {
                            i2 = LIZIZ.LIZIZ();
                        } else {
                            i2 = -1;
                        }
                        jSONObject2.put("type", C51214K8c.LJ(i2));
                        jSONObject2.put("language", C39419FdX.LIZ().toString());
                        jSONObject2.put("appLanguage", SettingServiceImpl.LIZ().getAppLanguage());
                        jSONObject2.put("appLocale", C85999Xp5.LIZIZ());
                        jSONObject2.put("is_lynx_request_suggest", !z3);
                        C50948Jz6 LIZIZ11 = JTO.LIZIZ(mo49getActivity());
                        if (LIZIZ11 == null || (str6 = LIZIZ11.getGroupId()) == null) {
                            str6 = "";
                        }
                        jSONObject2.put("from_group_id", str6);
                        C50650JuI LJII5 = C50651JuJ.LJII(mo49getActivity());
                        if (LJII5 != null && (searchVideoModel3 = LJII5.getSearchVideoModel()) != null) {
                            str7 = searchVideoModel3.getGroupId();
                        } else {
                            str7 = null;
                        }
                        jSONObject2.put("from_group_id_x", str7);
                        if (this.LLFF == 1) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        jSONObject2.put("is_built_in", String.valueOf(i3));
                        jSONObject2.put("prerender", String.valueOf(C50845JxR.LIZ() ? 1 : 0));
                        jSONObject2.put("timestamp", C50833JxF.LIZ);
                        C50650JuI LJII6 = C50651JuJ.LJII(this);
                        if (LJII6 != null && (searchVideoModel2 = LJII6.getSearchVideoModel()) != null) {
                            str8 = searchVideoModel2.getGroupId();
                        } else {
                            str8 = null;
                        }
                        jSONObject2.put("lastFromGroupId", str8);
                        K75 k757 = this.LJLZ;
                        if (k757 != null && (LJII = k757.LJII()) != null && LJII.E()) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        jSONObject2.put("is_keyboard_on", i4);
                        jSONObject2.put("page_type", "simple");
                        if (LIZIZ6 != null && LIZIZ6.obtainEcLogData("search_entrance") != null) {
                            str9 = String.valueOf(LIZIZ6.obtainEcLogData("search_entrance"));
                        } else {
                            C50948Jz6 LIZIZ12 = JTO.LIZIZ(mo49getActivity());
                            if (LIZIZ12 != null) {
                                str9 = LIZIZ12.getEnterSearchFrom();
                            } else {
                                str9 = null;
                            }
                        }
                        jSONObject2.put("search_entrance", str9);
                        JSONObject jSONObject3 = new JSONObject();
                        C50650JuI LJII7 = C50651JuJ.LJII(mo49getActivity());
                        if (LJII7 != null && (singleSearchEcommerceModel = LJII7.getSingleSearchEcommerceModel()) != null) {
                            jSONObject3.put("enter_product_id", singleSearchEcommerceModel.getSrcMaterialId());
                        }
                        if (LIZIZ6 != null) {
                            Object obtainEcLogData = LIZIZ6.obtainEcLogData("search_entrance");
                            if (obtainEcLogData != null) {
                                jSONObject2.put("enter_from", obtainEcLogData);
                            }
                            obj = LIZIZ6.obtainEcLogData("ec_middle_extra_log_params");
                        } else {
                            obj = null;
                        }
                        if (C65777Prh.LJII(obj) && (map = (Map) obj) != null) {
                            for (Map.Entry entry : map.entrySet()) {
                                jSONObject3.put((String) entry.getKey(), entry.getValue());
                            }
                        }
                        C50948Jz6 LIZIZ13 = JTO.LIZIZ(mo49getActivity());
                        if (LIZIZ13 != null) {
                            obj2 = LIZIZ13.getEnterSearchFrom();
                        } else {
                            obj2 = null;
                        }
                        jSONObject3.put("enter_from_second", obj2);
                        jSONObject2.put("extraLogParams", jSONObject3.toString());
                        if (LIZIZ6 != null) {
                            num = Integer.valueOf(LIZIZ6.getEcSearchEntranceValue());
                        } else {
                            num = null;
                        }
                        jSONObject2.put("root_enter_from_type", num);
                        Object obtainLogData2 = JTO.LIZ(mo49getActivity()).hv0().obtainLogData("tab_name");
                        if (obtainLogData2 != null) {
                            jSONObject2.put("tab_name", obtainLogData2.toString());
                        }
                        C50863Jxj c50863Jxj8 = this.LJZL;
                        if (c50863Jxj8 != null) {
                            c50863Jxj8.LIZ("searchTransferEnter", jSONObject2);
                            JSONObject LJ = C47135Ieh.LJ(WM7.SCENE_SERVICE, "searchTransferEnter", "enter_method", "recom");
                            C50948Jz6 LIZIZ14 = JTO.LIZIZ(mo49getActivity());
                            if (LIZIZ14 != null) {
                                obj3 = LIZIZ14.getEnterSearchFrom();
                            } else {
                                obj3 = null;
                            }
                            LJ.put("enter_from", obj3);
                            C48658J7u.LIZIZ("rd_ec_search_request_trace", LJ);
                            if (eCSearchEntranceData != null) {
                                if (LJJJJZI.LJIILL(LIZIZ6.getEcSearchEntranceData())) {
                                    JSONArray jSONArray = new JSONArray();
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("historyList", jSONArray);
                                    Yl = jSONObject4.toString();
                                } else {
                                    C34K c34k = new C34K();
                                    Yl = Yl(this, false, new AqS174S0100000_8(c34k, 35), 1);
                                    KAO kao = C51253K9p.LIZIZ;
                                    if (kao != null) {
                                        kao.LJIILJJIL = System.currentTimeMillis();
                                    }
                                    boolean z4 = c34k.element;
                                    C50948Jz6 LIZIZ15 = JTO.LIZIZ(mo49getActivity());
                                    if (LIZIZ15 == null || (str15 = LIZIZ15.getEnterSearchFrom()) == null) {
                                        str15 = "";
                                    }
                                    hm("history", "update_data", z4, false, str15);
                                }
                            } else if (LIZ2 == EnumC51281KAr.FASHION.getValue() && e1.LIZ(31744, "disable_history_from_fashion", true, false)) {
                                JSONArray jSONArray2 = new JSONArray();
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("historyList", jSONArray2);
                                Yl = jSONObject5.toString();
                            } else if (C51272KAi.LIZ() && C51272KAi.LIZ) {
                                Yl = null;
                            } else {
                                C34K c34k2 = new C34K();
                                Yl = Yl(this, false, new AqS174S0100000_8(c34k2, 36), 1);
                                KAO kao2 = C51253K9p.LIZIZ;
                                if (kao2 != null) {
                                    kao2.LJIILJJIL = System.currentTimeMillis();
                                }
                                boolean z5 = c34k2.element;
                                C50948Jz6 LIZIZ16 = JTO.LIZIZ(mo49getActivity());
                                if (LIZIZ16 == null || (str10 = LIZIZ16.getEnterSearchFrom()) == null) {
                                    str10 = "";
                                }
                                hm("history", "update_data", z5, false, str10);
                            }
                            C50948Jz6 Wa02 = Wa0();
                            if ((Wa02 != null && Wa02.getEcSearchEntranceValue() == EnumC51280KAq.ORDER.getValue()) || !C51272KAi.LIZ()) {
                                if (Yl != null) {
                                    C50863Jxj c50863Jxj9 = this.LJZL;
                                    if (c50863Jxj9 != null) {
                                        c50863Jxj9.LIZJ(Yl);
                                    } else {
                                        o.LJIJI("dynamicViewsContainer");
                                        throw null;
                                    }
                                }
                            } else if (!C51272KAi.LIZ) {
                                if (Yl != null) {
                                    C50863Jxj c50863Jxj10 = this.LJZL;
                                    if (c50863Jxj10 != null) {
                                        c50863Jxj10.LIZJ(Yl);
                                    } else {
                                        o.LJIJI("dynamicViewsContainer");
                                        throw null;
                                    }
                                }
                            } else {
                                C51272KAi.LIZ = false;
                            }
                            C50948Jz6 Wa03 = Wa0();
                            if (Wa03 != null && (ecSearchEntranceData = Wa03.getEcSearchEntranceData()) != null && ecSearchEntranceData.isEC()) {
                                IEcomSearchService LJJJJZI3 = EcomSearchServiceImpl.LJJJJZI();
                                C50948Jz6 Wa04 = Wa0();
                                if (Wa04 != null) {
                                    eCSearchEntranceData2 = Wa04.getEcSearchEntranceData();
                                } else {
                                    eCSearchEntranceData2 = null;
                                }
                                int i7 = C61842bk.LIZ[LJJJJZI3.LJJJJLL(eCSearchEntranceData2).ordinal()];
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        if (i7 == 3 || i7 == 4) {
                                            String Xl = Xl();
                                            if (C78685UuP.LJJJZ(Xl) && Xl != null) {
                                                lm(Xl);
                                            }
                                        }
                                    } else {
                                        K75 k758 = this.LJLZ;
                                        if (k758 != null && (LJI2 = k758.LJI()) != null && LJI2.LIZJ()) {
                                            String Xl2 = Xl();
                                            if (C78685UuP.LJJJZ(Xl2) && Xl2 != null) {
                                                lm(Xl2);
                                            }
                                        } else {
                                            Vl();
                                        }
                                    }
                                } else {
                                    Vl();
                                }
                            } else if (fm()) {
                                C51258K9u.LIZJ = false;
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                C50948Jz6 LIZIZ17 = JTO.LIZIZ(mo49getActivity());
                                if (LIZIZ17 != null) {
                                    str13 = LIZIZ17.getEnterSearchFrom();
                                } else {
                                    str13 = null;
                                }
                                linkedHashMap2.put("enter_from", str13);
                                linkedHashMap2.put("is_force", 1);
                                C50948Jz6 LIZIZ18 = JTO.LIZIZ(mo49getActivity());
                                if (LIZIZ18 == null || (str14 = LIZIZ18.getEnterSearchFrom()) == null) {
                                    str14 = "";
                                }
                                hm("guess", "update_data", true, false, str14);
                                TemplateData LJ2 = TemplateData.LJ(linkedHashMap2);
                                LJ2.LIZLLL = "guessSearchDataProcess";
                                C50863Jxj c50863Jxj11 = this.LJZL;
                                if (c50863Jxj11 != null) {
                                    c50863Jxj11.LJIIJJI(LJ2);
                                } else {
                                    o.LJIJI("dynamicViewsContainer");
                                    throw null;
                                }
                            } else if (dm() && !C51272KAi.LIZ()) {
                                C51258K9u.LIZJ = true;
                                if (Zl().length() > 0) {
                                    C50948Jz6 LIZIZ19 = JTO.LIZIZ(mo49getActivity());
                                    if (LIZIZ19 == null || (str12 = LIZIZ19.getEnterSearchFrom()) == null) {
                                        str12 = "";
                                    }
                                    hm("guess", "request", false, false, str12);
                                    EcSuggestWordsViewModel ecSuggestWordsViewModel2 = this.LLD;
                                    if (ecSuggestWordsViewModel2 != null && (nextLiveData2 = ecSuggestWordsViewModel2.LJLJI) != null) {
                                        nextLiveData2.setValue(new C50764Jw8<>(Zl()));
                                    }
                                }
                            } else if (em()) {
                                C51258K9u.LIZJ = true;
                                String str21 = C51258K9u.LIZIZ;
                                if (C78685UuP.LJJJZ(str21) && str21 != null) {
                                    EcSuggestWordsViewModel ecSuggestWordsViewModel3 = this.LLD;
                                    if (ecSuggestWordsViewModel3 != null && (nextLiveData = ecSuggestWordsViewModel3.LJLJI) != null) {
                                        nextLiveData.setValue(new C50764Jw8<>(str21));
                                    }
                                    C50948Jz6 LIZIZ20 = JTO.LIZIZ(mo49getActivity());
                                    if (LIZIZ20 == null || (str11 = LIZIZ20.getEnterSearchFrom()) == null) {
                                        str11 = "";
                                    }
                                    hm("guess", "request", false, false, str11);
                                }
                            } else {
                                C51258K9u.LIZJ = false;
                            }
                            C36922EeM.LIZLLL(4, "Search_history_middle_page", "setData-history at openSearchSquare, history = " + Yl);
                            return;
                        }
                        o.LJIJI("dynamicViewsContainer");
                        throw null;
                    }
                    o.LJIJI("dynamicViewsContainer");
                    throw null;
                }
                o.LJIJI("dynamicViewsContainer");
                throw null;
            }
            o.LJIJI("dynamicViewsContainer");
            throw null;
        }
        o.LJIJI("dynamicViewsContainer");
        throw null;
    }

    public final void Tl() {
        Long l;
        HashMap hashMap = new HashMap();
        KAO kao = C51253K9p.LIZIZ;
        if (kao != null) {
            l = Long.valueOf(kao.LIZ);
        } else {
            l = null;
        }
        if (l != null) {
            hashMap.put("_ec_start_time", l.toString());
        } else {
            hashMap.put("_ec_start_time", String.valueOf(System.currentTimeMillis()));
        }
        C50863Jxj c50863Jxj = this.LJZL;
        if (c50863Jxj != null) {
            InterfaceC60761Nsz interfaceC60761Nsz = c50863Jxj.LJIIJ.LJLIL;
            if (interfaceC60761Nsz != null) {
                interfaceC60761Nsz.LIZ(hashMap);
                return;
            }
            return;
        }
        o.LJIJI("dynamicViewsContainer");
        throw null;
    }

    public final String Wl() {
        return (String) this.LLFII.getValue();
    }

    public final String Zl() {
        if (this.LLFFF == null) {
            String string = Keva.getRepo("ecommerce_search_repo").getString("ecommerce_suggest_words", "");
            o.LJIIIIZZ(string, "getRepo(ECommerceSearchC…MMERCE_SUGGEST_WORDS, \"\")");
            this.LLFFF = string;
        }
        String str = this.LLFFF;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        if (r5.LJIILJJIL(r4, r0) != false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean fm() {
        /*
            r9 = this;
            X.JuJ r1 = X.C50652JuK.Companion
            X.1qj r0 = r9.mo49getActivity()
            r1.getClass()
            X.JuI r0 = X.C50651JuJ.LJII(r0)
            if (r0 == 0) goto L1b
            X.Jqn r0 = r0.getSearchCommonModel()
            if (r0 == 0) goto L1b
            java.lang.String r4 = r0.getEnterFrom()
            if (r4 != 0) goto L1d
        L1b:
            java.lang.String r4 = ""
        L1d:
            X.1qj r0 = r9.mo49getActivity()
            X.Jz6 r8 = X.JTO.LIZIZ(r0)
            int r7 = X.KB1.LIZ(r8)
            com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService r5 = com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl.LJJJJZI()
            if (r8 == 0) goto L49
            com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData r0 = r8.getEcSearchEntranceData()
        L33:
            r6 = 0
            java.lang.String r3 = "request"
            java.lang.String r2 = "guess"
            r1 = 1
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData r0 = r8.getEcSearchEntranceData()
            boolean r0 = r5.LJJJJJ(r0)
            if (r0 == 0) goto L4b
            km(r9, r2, r3, r1, r4)
            return r1
        L49:
            r0 = 0
            goto L33
        L4b:
            return r6
        L4c:
            com.ss.android.ugc.aweme.search.ecommerce.config.TiktokEcSearchRegionConfigSettings$TiktokEcSearchRegionConfigModel r0 = com.ss.android.ugc.aweme.search.ecommerce.config.TiktokEcSearchRegionConfigSettings.LIZ()
            boolean r0 = r0.disableSuggestGuideFromMall
            if (r0 == 0) goto L58
            km(r9, r2, r3, r1, r4)
            return r1
        L58:
            X.KAr r0 = X.EnumC51281KAr.PDP
            int r0 = r0.getValue()
            if (r7 != r0) goto L83
            boolean r0 = r5.LJIIJJI()
            if (r0 != 0) goto L7d
            X.K75 r0 = r9.LJLZ
            if (r0 == 0) goto L81
            X.K4f r0 = r0.LJI()
            if (r0 == 0) goto L81
            boolean r0 = r0.LIZJ()
            if (r0 != r1) goto L81
            r0 = 1
        L77:
            boolean r0 = r5.LJIILJJIL(r4, r0)
            if (r0 == 0) goto L8c
        L7d:
            km(r9, r2, r3, r1, r4)
            return r1
        L81:
            r0 = 0
            goto L77
        L83:
            X.KAr r0 = X.EnumC51281KAr.FASHION
            int r0 = r0.getValue()
            if (r7 != r0) goto L8c
            return r1
        L8c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcDynamicSingleIntermediateFragmentNew.fm():boolean");
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew
    public final void Pl() {
        Gl().setVisibility(0);
        Il().setVisibility(4);
        super.Pl();
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew
    public final boolean Ql() {
        InterfaceC50548Jse LIZ;
        Integer valueOf;
        InterfaceC50548Jse LIZ2;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("middleState=");
        K75 k75 = this.LJLZ;
        Integer num = null;
        if (k75 != null && (LIZ2 = k75.LIZ()) != null) {
            num = Integer.valueOf(LIZ2.LIZ());
        }
        LIZ3.append(num);
        X1D.LIZIZ(LIZ3);
        K75 k752 = this.LJLZ;
        if (k752 == null || (LIZ = k752.LIZ()) == null || (valueOf = Integer.valueOf(LIZ.LIZ())) == null) {
            return false;
        }
        if (valueOf.intValue() == 2) {
            if (Il().getVisibility() == 0) {
                Il().setVisibility(4);
            }
        } else if (valueOf.intValue() == 0) {
            if (Il().getVisibility() == 0) {
                Il().setVisibility(4);
            }
        } else if (valueOf.intValue() == 1 && Gl().getVisibility() == 0) {
            Gl().setVisibility(4);
        }
        return super.Ql();
    }

    public final C50948Jz6 Wa0() {
        return JTO.LIZIZ(mo49getActivity());
    }

    public final String Xl() {
        ECSearchEntranceData eCSearchEntranceData;
        boolean z;
        InterfaceC51113K4f LJI;
        C50948Jz6 Wa0 = Wa0();
        if (Wa0 != null) {
            eCSearchEntranceData = Wa0.getEcSearchEntranceData();
        } else {
            eCSearchEntranceData = null;
        }
        K75 k75 = this.LJLZ;
        if (k75 != null && (LJI = k75.LJI()) != null) {
            z = LJI.LIZJ();
        } else {
            z = false;
        }
        return C51258K9u.LIZJ(eCSearchEntranceData, z);
    }

    public final boolean dm() {
        if (KB1.LJIIIIZZ(KB1.LIZ(JTO.LIZIZ(mo49getActivity()))) && !fm()) {
            SearchSecurityControlConfig.LIZ.getClass();
            if (!SearchSecurityControlConfig.LIZ().disableSuggestGuide && C51258K9u.LIZ && C78857UxB.LJJJIL(Zl())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean em() {
        if (KB1.LJIIIIZZ(KB1.LIZ(JTO.LIZIZ(mo49getActivity()))) && !fm()) {
            SearchSecurityControlConfig.LIZ.getClass();
            if (!SearchSecurityControlConfig.LIZ().disableSuggestGuide && C78685UuP.LJJJZ(C51258K9u.LIZIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C51253K9p.LIZIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        KAO kao = C51253K9p.LIZIZ;
        if (kao != null && kao.LJIIIIZZ != 0) {
            kao.LJIIJ = System.currentTimeMillis() - kao.LJIIIIZZ;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void cm(HashMap<?, ?> hashMap) {
        String str;
        int i;
        Object obj;
        String str2;
        long j;
        Integer num;
        List<String> list;
        List<String> list2;
        C50433Jqn searchCommonModel;
        Integer valueOf;
        K75 k75;
        InterfaceC51113K4f LJI;
        Object obj2;
        String str3;
        Long l;
        Integer num2;
        String str4;
        List<TypeWords> list3;
        TypeWords typeWords;
        List<Word> list4;
        ISearchMiddleForECService iSearchMiddleForECService;
        C50433Jqn searchCommonModel2;
        C50652JuK.Companion.getClass();
        C50650JuI LJII = C50651JuJ.LJII(this);
        if (LJII == null || (searchCommonModel2 = LJII.getSearchCommonModel()) == null || (str = searchCommonModel2.getEnterFrom()) == null) {
            str = "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("performance_params", C51253K9p.LIZ(Boolean.valueOf(!C51258K9u.LIZJ)));
        this.LL = true;
        linkedHashMap.put("isCachedSuggestWords", 0);
        linkedHashMap.put("enter_from", str);
        if (hashMap == null) {
            i = 1;
        } else {
            i = 0;
        }
        linkedHashMap.put("is_force", Integer.valueOf(i));
        linkedHashMap.put("is_ecommerce_cache", Integer.valueOf(C51258K9u.LIZJ ? 1 : 0));
        linkedHashMap.put("guessSearchData", hashMap);
        C51141K5h c51141K5h = C51141K5h.LIZ;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        c51141K5h.getClass();
        if (C51141K5h.LIZ(mo49getActivity)) {
            if (hashMap != null) {
                obj2 = hashMap.get("qrec_virtual_enable");
            } else {
                obj2 = null;
            }
            if (o.LJ(obj2, "1")) {
                ISearchMiddleForECService iSearchMiddleForECService2 = this.LJZ;
                if (iSearchMiddleForECService2 != null) {
                    str4 = iSearchMiddleForECService2.LJJIJLIJ();
                } else {
                    str4 = null;
                }
                C51249K9l.LIZIZ(Wl(), this.LJZ, mo49getActivity());
                ISearchMiddleForECService iSearchMiddleForECService3 = this.LJZ;
                if (iSearchMiddleForECService3 != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str4);
                    LIZ.append(Wl());
                    iSearchMiddleForECService3.LJIIJ(X1D.LIZIZ(LIZ));
                }
                try {
                    SuggestWordResponse suggestWordResponse = (SuggestWordResponse) GsonProtectorUtils.fromJson(this.LLF, GsonProtectorUtils.toJsonTree(this.LLF, hashMap), SuggestWordResponse.class);
                    if (suggestWordResponse != null && (list3 = suggestWordResponse.data) != null && (typeWords = (TypeWords) ORZ.LJLLLL(list3)) != null && (list4 = typeWords.words) != null) {
                        Iterator<Word> it = list4.iterator();
                        while (it.hasNext()) {
                            String word = it.next().getWord();
                            if (word != null && (iSearchMiddleForECService = this.LJZ) != null) {
                                StringBuilder LIZJ = C278817o.LIZJ(str4);
                                LIZJ.append(Wl());
                                iSearchMiddleForECService.LJIIL(LIZJ.toString(), word);
                            }
                        }
                    }
                } catch (n unused) {
                }
                ISearchMiddleForECService iSearchMiddleForECService4 = this.LJZ;
                if (iSearchMiddleForECService4 != null) {
                    StringBuilder LIZJ2 = C278817o.LIZJ(str4);
                    LIZJ2.append(Wl());
                    String sb = LIZJ2.toString();
                    System.currentTimeMillis();
                    iSearchMiddleForECService4.LJJIFFI(sb);
                }
            }
            ISearchMiddleForECService iSearchMiddleForECService5 = this.LJZ;
            if (iSearchMiddleForECService5 != null) {
                str3 = iSearchMiddleForECService5.LJJIJL(this);
            } else {
                str3 = null;
            }
            linkedHashMap.put("latestGroupId", str3);
            ISearchMiddleForECService iSearchMiddleForECService6 = this.LJZ;
            if (iSearchMiddleForECService6 != null) {
                l = Long.valueOf(iSearchMiddleForECService6.LJJ(this));
            } else {
                l = null;
            }
            linkedHashMap.put("totalPlayTime", l);
            ISearchMiddleForECService iSearchMiddleForECService7 = this.LJZ;
            if (iSearchMiddleForECService7 != null) {
                num2 = Integer.valueOf(iSearchMiddleForECService7.LJIILLIIL(this));
            } else {
                num2 = null;
            }
            linkedHashMap.put("hasEffectiveClick", num2);
        } else {
            if (hashMap != null) {
                obj = hashMap.get("qrec_virtual_enable");
            } else {
                obj = null;
            }
            if (o.LJ(obj, "1")) {
                String LJ = C51249K9l.LJ();
                C51249K9l.LIZIZ(Wl(), null, null);
                Map<String, C50295JoZ> map = C51249K9l.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LJ);
                LIZ2.append(Wl());
                C50295JoZ c50295JoZ = (C50295JoZ) ((LinkedHashMap) map).get(X1D.LIZIZ(LIZ2));
                if (c50295JoZ != null && (list2 = c50295JoZ.LJ) != null) {
                    list2.clear();
                }
                Object obj3 = hashMap.get("data");
                o.LJII(obj3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any> }");
                Object obj4 = ListProtector.get((ArrayList) obj3, 0);
                o.LJII(obj4, "null cannot be cast to non-null type com.google.gson.internal.LinkedTreeMap<kotlin.String, kotlin.Any>");
                Object obj5 = ((m) obj4).get("words");
                o.LJII(obj5, "null cannot be cast to non-null type java.util.ArrayList<com.google.gson.internal.LinkedTreeMap<kotlin.String, kotlin.String>>{ kotlin.collections.TypeAliasesKt.ArrayList<com.google.gson.internal.LinkedTreeMap<kotlin.String, kotlin.String>> }");
                Iterator it2 = ((ArrayList) obj5).iterator();
                while (it2.hasNext()) {
                    Object obj6 = ((m) it2.next()).get("word");
                    if (obj6 != null) {
                        Map<String, C50295JoZ> map2 = C51249K9l.LIZIZ;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(LJ);
                        LIZ3.append(Wl());
                        C50295JoZ c50295JoZ2 = (C50295JoZ) ((LinkedHashMap) map2).get(X1D.LIZIZ(LIZ3));
                        if (c50295JoZ2 != null && (list = c50295JoZ2.LJ) != 0) {
                            list.add(obj6);
                        }
                    }
                }
                Map<String, C50295JoZ> map3 = C51249K9l.LIZIZ;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(LJ);
                LIZ4.append(Wl());
                C50295JoZ c50295JoZ3 = (C50295JoZ) ((LinkedHashMap) map3).get(X1D.LIZIZ(LIZ4));
                if (c50295JoZ3 != null) {
                    c50295JoZ3.LJIIL = System.currentTimeMillis();
                }
            }
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) C51090K3i.LIZIZ;
            KAL kal = (KAL) linkedHashMap2.get(Wl());
            if (kal != null) {
                str2 = kal.LIZLLL;
            } else {
                str2 = null;
            }
            linkedHashMap.put("latestGroupId", str2);
            KAL kal2 = (KAL) linkedHashMap2.get(Wl());
            if (kal2 != null) {
                j = kal2.LJI;
            } else {
                j = 0;
            }
            linkedHashMap.put("totalPlayTime", Long.valueOf(j / 1000));
            KAL kal3 = (KAL) linkedHashMap2.get(Wl());
            if (kal3 != null) {
                num = Integer.valueOf(kal3.LIZIZ);
            } else {
                num = null;
            }
            linkedHashMap.put("hasEffectiveClick", num);
        }
        linkedHashMap.put("lastFromGroupId", Wl());
        linkedHashMap.put("new_sug_session_id", C51307KBr.LIZ);
        mo49getActivity();
        C51307KBr.LIZ(3);
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        c50651JuJ.getClass();
        C50650JuI LJII2 = C50651JuJ.LJII(mo49getActivity2);
        if (LJII2 != null && (searchCommonModel = LJII2.getSearchCommonModel()) != null && (valueOf = Integer.valueOf(searchCommonModel.getFeedSearchBarFlag())) != null && valueOf.intValue() == 2 && ((k75 = this.LJLZ) == null || (LJI = k75.LJI()) == null || !LJI.LJ())) {
            linkedHashMap.put("is_from_outside", 1);
        }
        try {
            TemplateData LJ2 = TemplateData.LJ(linkedHashMap);
            LJ2.LIZLLL = "guessSearchDataProcess";
            this.LL = true;
            hm("guess", "update_data", false, false, str);
            C50863Jxj c50863Jxj = this.LJZL;
            if (c50863Jxj != null) {
                c50863Jxj.LJIIJJI(LJ2);
            } else {
                o.LJIJI("dynamicViewsContainer");
                throw null;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew
    public final void initView(View view) {
        OSZ LIZLLL;
        C50433Jqn searchCommonModel;
        InterfaceC50796Jwe LIZJ;
        K75 k75;
        Word word;
        K75 k752;
        InterfaceC50796Jwe LIZJ2;
        Word LJIJJLI;
        K75 k753;
        InterfaceC50796Jwe LIZJ3;
        InterfaceC51113K4f LJI;
        ViewTreeObserver viewTreeObserver;
        o.LJIIIZ(view, "view");
        super.initView(view);
        C50948Jz6 Wa0 = Wa0();
        if (Wa0 != null && Wa0.getEcSearchEntranceValue() == EnumC51280KAq.ORDER.getValue()) {
            mo49getActivity();
            LIZLLL = C51248K9k.LIZ();
        } else {
            mo49getActivity();
            LIZLLL = C51248K9k.LIZLLL();
        }
        if (LIZLLL == null) {
            if (mo49getActivity() != null) {
                requireActivity().finish();
                return;
            }
            return;
        }
        C50863Jxj c50863Jxj = (C50863Jxj) LIZLLL.getFirst();
        this.LJZL = c50863Jxj;
        if (c50863Jxj != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50863Jxj.LJIIJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (viewTreeObserver = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnPreDrawListener(new IDDListenerS394S0100000_8(this, 0));
            }
            this.LL = false;
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity == null) {
                return;
            }
            boolean z = C50723JvT.LIZ;
            if (z || C50779JwN.LIZ() || C63081OpJ.LJJIJL().LJJ(true)) {
                EcSuggestWordsViewModel ecSuggestWordsViewModel = (EcSuggestWordsViewModel) ViewModelProviders.of(mo49getActivity).get(EcSuggestWordsViewModel.class);
                if (z || C63081OpJ.LJJIJL().LJJ(true)) {
                    ecSuggestWordsViewModel.LJLJI.observe(mo49getActivity, this.LLFZ);
                }
                if (Sl() && ((k75 = this.LJLZ) == null || (LJI = k75.LJI()) == null || !LJI.LJ())) {
                    C51141K5h.LIZ.getClass();
                    if (C51141K5h.LIZ(mo49getActivity)) {
                        ISearchMiddleForECService iSearchMiddleForECService = this.LJZ;
                        if (iSearchMiddleForECService != null && (LJIJJLI = iSearchMiddleForECService.LJIJJLI(this)) != null && (k753 = this.LJLZ) != null && (LIZJ3 = k753.LIZJ()) != null) {
                            LIZJ3.LIZ(LJIJJLI);
                        }
                    } else {
                        KAL kal = (KAL) ((LinkedHashMap) C51090K3i.LIZIZ).get(Wl());
                        if (kal != null && (word = kal.LJII) != null && (k752 = this.LJLZ) != null && (LIZJ2 = k752.LIZJ()) != null) {
                            LIZJ2.LIZ(word);
                        }
                    }
                }
                C50652JuK.Companion.getClass();
                C50650JuI LJII = C50651JuJ.LJII(this);
                if (LJII != null && (searchCommonModel = LJII.getSearchCommonModel()) != null && !searchCommonModel.m23isFromComment() && !searchCommonModel.isFromVideoDetail() && !searchCommonModel.isFromFeedSearchBar() && C34512Dga.LIZ) {
                    if (ORZ.LJLJJI(searchCommonModel.getEnterFrom(), C47261Igj.LJJIJIIJI("homepage_hot", "homepage_follow", "homepage_friends", "discovery", "homepage_nearby"))) {
                        K75 k754 = this.LJLZ;
                        if (k754 != null && (LIZJ = k754.LIZJ()) != null) {
                            LIZJ.LIZIZ();
                        }
                        this.LLD = ecSuggestWordsViewModel;
                        return;
                    }
                }
                ecSuggestWordsViewModel.LJLIL.observe(mo49getActivity, this.LLI);
                this.LLD = ecSuggestWordsViewModel;
                return;
            }
            return;
        }
        o.LJIJI("dynamicViewsContainer");
        throw null;
    }

    public final void lm(String str) {
        String str2;
        NextLiveData<C50764Jw8<String>> nextLiveData;
        C51258K9u.LIZJ = true;
        if (str.length() > 0) {
            C50948Jz6 LIZIZ = JTO.LIZIZ(mo49getActivity());
            if (LIZIZ == null || (str2 = LIZIZ.getEnterSearchFrom()) == null) {
                str2 = "";
            }
            hm("guess", "request", false, false, str2);
            EcSuggestWordsViewModel ecSuggestWordsViewModel = this.LLD;
            if (ecSuggestWordsViewModel == null || (nextLiveData = ecSuggestWordsViewModel.LJLJI) == null) {
                return;
            }
            nextLiveData.setValue(new C50764Jw8<>(str));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadcastEvent(C56642Ke event) {
        o.LJIIIZ(event, "event");
        if (o.LJ(event.LJLIL.get("eventName"), "SearchTransferFirstScreenFinished")) {
            long currentTimeMillis = System.currentTimeMillis();
            ISearchMiddleForECService iSearchMiddleForECService = this.LJZ;
            ActivityC45651qj mo49getActivity = mo49getActivity();
            C51141K5h.LIZ.getClass();
            if (C51141K5h.LIZ(mo49getActivity)) {
                if (iSearchMiddleForECService != null) {
                    iSearchMiddleForECService.LJJIL(currentTimeMillis);
                }
            } else {
                if (C51345KDd.LIZIZ > 0) {
                    return;
                }
                C51345KDd.LIZIZ = currentTimeMillis;
                long j = currentTimeMillis - C51345KDd.LIZ;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("time", j);
                jSONObject.put("fe_flag", "lynx");
                AppLogNewUtils.onEventV3("search_transfer_firstscreen_time_monitor", jSONObject);
            }
        }
    }

    @QD3
    public final void onSugSessionEndEvent(C9CW event) {
        o.LJIIIZ(event, "event");
        C51252K9o c51252K9o = this.LJLJJI;
        if (c51252K9o != null) {
            c51252K9o.LJLJLLL.clear();
            KAD.LIZ = 0L;
            KAD.LIZIZ = 0L;
            if (event.LJLIL == 3 && C51246K9i.LIZ != 0) {
                C51246K9i.LIZIZ = System.currentTimeMillis();
                C51141K5h c51141K5h = C51141K5h.LIZ;
                ActivityC45651qj mo49getActivity = mo49getActivity();
                c51141K5h.getClass();
                if (C51141K5h.LIZ(mo49getActivity)) {
                    this.LJZ.LJIILJJIL();
                } else {
                    C51246K9i.LIZIZ(this.LJZ, mo49getActivity()).LJIILIIL();
                }
                C51246K9i.LIZ(this.LJZ, mo49getActivity());
                return;
            }
            return;
        }
        o.LJIJI("sugPresenter");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        KAO kao = C51253K9p.LIZIZ;
        if (kao != null && kao.LJIIIIZZ != 0) {
            kao.LJIIIZ = System.currentTimeMillis() - kao.LJIIIIZZ;
        }
        super.onViewCreated(view, bundle);
    }

    public static String Yl(EcDynamicSingleIntermediateFragmentNew ecDynamicSingleIntermediateFragmentNew, boolean z, InterfaceC88472Yns interfaceC88472Yns, int i) {
        int i2;
        String str;
        int i3;
        InterfaceC178696zp LIZIZ;
        ECSearchEntranceData ecSearchEntranceData;
        String historyMaxCount;
        boolean z2 = z;
        InterfaceC88472Yns interfaceC88472Yns2 = interfaceC88472Yns;
        if ((i & 1) != 0) {
            z2 = false;
        }
        Integer num = null;
        if ((i & 2) != 0) {
            interfaceC88472Yns2 = null;
        }
        ecDynamicSingleIntermediateFragmentNew.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        C50948Jz6 LIZIZ2 = JTO.LIZIZ(ecDynamicSingleIntermediateFragmentNew.mo49getActivity());
        if (LIZIZ2 != null && (ecSearchEntranceData = LIZIZ2.getEcSearchEntranceData()) != null && (historyMaxCount = ecSearchEntranceData.getHistoryMaxCount()) != null) {
            num = C38350F3i.LJJIL(historyMaxCount);
        }
        List<SearchHistory> xl = ecDynamicSingleIntermediateFragmentNew.xl();
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 20;
        }
        List<SearchHistory> LLILLL = ORZ.LLILLL(xl, i2);
        C50948Jz6 LIZIZ3 = JTO.LIZIZ(ecDynamicSingleIntermediateFragmentNew.mo49getActivity());
        if (LIZIZ3 == null || (str = LIZIZ3.getEnterSearchFrom()) == null) {
            str = "";
        }
        if (!z2) {
            ecDynamicSingleIntermediateFragmentNew.hm("history", "request", LLILLL.isEmpty(), false, str);
        }
        ecDynamicSingleIntermediateFragmentNew.hm("history", "response_success", LLILLL.isEmpty(), z2, str);
        JSONArray jSONArray = new JSONArray();
        for (SearchHistory searchHistory : LLILLL) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("word", searchHistory.keyword);
            jSONArray.put(jSONObject);
        }
        if (interfaceC88472Yns2 != null) {
            interfaceC88472Yns2.invoke(Boolean.valueOf(LLILLL.isEmpty()));
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("historyList", jSONArray);
        K75 k75 = ecDynamicSingleIntermediateFragmentNew.LJLZ;
        if (k75 != null && (LIZIZ = k75.LIZIZ()) != null) {
            i3 = LIZIZ.LIZIZ();
        } else {
            i3 = -1;
        }
        if (i3 >= 0) {
            jSONObject2.put("current_tab_name", C51214K8c.LJ(i3));
        } else {
            jSONObject2.put("current_tab_name", KAK.SHOP.getTabName());
        }
        jSONObject2.put("is_force", LLILLL.isEmpty() ? 1 : 0);
        jSONObject2.put("enter_from", str);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getSearchHistory cost:");
        LIZ.append(currentTimeMillis2);
        X1D.LIZIZ(LIZ);
        String jSONObject3 = jSONObject2.toString();
        o.LJIIIIZZ(jSONObject3, "ret.toString()");
        return jSONObject3;
    }

    public final void hm(String str, String str2, boolean z, boolean z2, String str3) {
        JSONObject LJ = C47135Ieh.LJ(WM7.SCENE_SERVICE, str, "step", str2);
        LJ.put("is_force", z ? 1 : 0);
        LJ.put("enter_from", str3);
        Object Jl = Jl();
        if (Jl == null) {
            Jl = "";
        }
        LJ.put("root_enter_from_type", Jl);
        LJ.put("is_history_first_screen", z2);
        C48658J7u.LIZIZ("rd_ec_search_middle_trace", LJ);
    }
}
