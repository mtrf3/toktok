package com.ss.android.ugc.aweme.result.common.core.ui.fragment;

import X.ActivityC45651qj;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C2SL;
import X.C36013EBl;
import X.C45804HyK;
import X.C48658J7u;
import X.C50948Jz6;
import X.C51222K8k;
import X.C51244K9g;
import X.C51396KFc;
import X.C51409KFp;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C78685UuP;
import X.C78926UyI;
import X.C8YN;
import X.EnumC51281KAr;
import X.InterfaceC51365KDx;
import X.InterfaceC65784Pro;
import X.JI6;
import X.KB1;
import X.KBE;
import X.KBG;
import X.KE0;
import X.KEP;
import X.KFH;
import X.KFQ;
import X.KFS;
import X.KFY;
import X.TBT;
import X.XKX;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletRechargeExchangeStrengthen;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragmentNew;
import com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultShopViewModel;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class EcDynamicSearchShopFragment extends EcSearchBaseRefactorFragmentNew {
    public final C214298b3 LL;
    public final Map<Integer, View> LLD = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final Object Al(View view) {
        o.LJIIIZ(view, "view");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragmentNew, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLD).clear();
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragmentNew
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLD;
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

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragmentNew, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public EcDynamicSearchShopFragment() {
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(this, 108);
        AqS158S0100000_8 aqS158S0100000_82 = new AqS158S0100000_8(this, 109);
        this.LL = new C214298b3(C65352Pkq.LIZ(EcSearchResultShopViewModel.class), aqS158S0100000_8, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), aqS158S0100000_82, C51409KFp.INSTANCE, (InterfaceC65784Pro) null, 384);
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragmentNew
    public final void refreshData() {
        ECSearchEntranceData eCSearchEntranceData;
        int value;
        String value2;
        int value3;
        String value4;
        String ecUserActions;
        Integer valueOf;
        int i;
        C51222K8k attachStoreCardValue;
        ECSearchEntranceData ecSearchEntranceData;
        String LIZIZ;
        InterfaceC51365KDx LIZ;
        C50948Jz6 ha;
        super.refreshData();
        EcSearchResultShopViewModel ecSearchResultShopViewModel = (EcSearchResultShopViewModel) this.LL.getValue();
        SearchResultParam searchResultParam = this.LJZ;
        if (searchResultParam == null) {
            return;
        }
        try {
            KEP kep = ecSearchResultShopViewModel.LJLJJL;
            if (kep != null && (LIZ = kep.LIZ()) != null && (ha = LIZ.ha()) != null) {
                eCSearchEntranceData = ha.getEcSearchEntranceData();
            } else {
                eCSearchEntranceData = null;
            }
            JSONObject LIZ2 = ecSearchResultShopViewModel.LJLIL.LIZ(searchResultParam);
            if (eCSearchEntranceData != null) {
                value2 = eCSearchEntranceData.getResultSource();
            } else {
                KE0 ke0 = ecSearchResultShopViewModel.LJLJJLL;
                if (ke0 != null) {
                    value = ke0.LJII();
                } else {
                    value = EnumC51281KAr.DEFAULT.getValue();
                }
                value2 = KB1.LIZJ(value).getValue();
            }
            LIZ2.put("source", value2);
            if (eCSearchEntranceData != null) {
                value4 = eCSearchEntranceData.getResultChannel();
            } else {
                KE0 ke02 = ecSearchResultShopViewModel.LJLJJLL;
                if (ke02 != null) {
                    value3 = ke02.LJII();
                } else {
                    value3 = EnumC51281KAr.DEFAULT.getValue();
                }
                value4 = KB1.LIZIZ(value3).getValue();
            }
            LIZ2.put("search_channel", value4);
            C50948Jz6 searchEnterParam = searchResultParam.getSearchEnterParam();
            if (searchEnterParam != null && (ecSearchEntranceData = searchEnterParam.getEcSearchEntranceData()) != null && (LIZIZ = KFS.LIZIZ(Integer.valueOf(ecSearchEntranceData.getRootEnterFromType()))) != null) {
                LIZ2.put("vertical_api_version", LIZIZ);
            }
            String sugShopId = searchResultParam.getSugShopId();
            if (!C78685UuP.LJJJZ(sugShopId)) {
                sugShopId = null;
            }
            if (sugShopId != null) {
                LIZ2.put("sug_shop_id", sugShopId);
            }
            C51244K9g resultAttachCard = searchResultParam.getResultAttachCard();
            if (resultAttachCard != null) {
                KBE cardType = resultAttachCard.getCardType();
                if (cardType != null) {
                    i = KFH.LIZ[cardType.ordinal()];
                    if (i == 1) {
                        String attachProductCardValue = resultAttachCard.getAttachProductCardValue();
                        if (attachProductCardValue != null) {
                            LIZ2.put("attach_products", attachProductCardValue);
                        }
                    }
                } else {
                    i = -1;
                }
                if (i != 2) {
                    if (i == 3 && (attachStoreCardValue = resultAttachCard.getAttachStoreCardValue()) != null) {
                        LIZ2.put("sug_shop_id", attachStoreCardValue.getShopId());
                        LIZ2.put("sug_creator_id", attachStoreCardValue.getCreatorId());
                    }
                } else {
                    KBG attachTalentLiveCardValue = resultAttachCard.getAttachTalentLiveCardValue();
                    if (attachTalentLiveCardValue != null) {
                        LIZ2.put("sug_creator_id", attachTalentLiveCardValue.getCreatorId());
                    }
                }
            }
            if (eCSearchEntranceData != null && (ecUserActions = eCSearchEntranceData.getEcUserActions()) != null && C78685UuP.LJJJZ(ecUserActions)) {
                LIZ2.put("ecom_user_actions", ecUserActions);
            }
            C50948Jz6 searchEnterParam2 = searchResultParam.getSearchEnterParam();
            if (searchEnterParam2 != null && (valueOf = Integer.valueOf(searchEnterParam2.getEcSearchEntranceValue())) != null) {
                LIZ2.put("root_enter_from_type", valueOf.intValue());
            }
            String optString = LIZ2.optString("enter_from");
            o.LJIIIIZZ(optString, "baseParams.optString(\"enter_from\")");
            if (optString.length() == 0) {
                KFQ kfq = ecSearchResultShopViewModel.LJLJJI;
                if (kfq != null) {
                    kfq.LJ("page_error");
                    return;
                }
                return;
            }
            KFQ kfq2 = ecSearchResultShopViewModel.LJLJJI;
            if (kfq2 != null) {
                String optString2 = LIZ2.optString("enter_method");
                o.LJIIIIZZ(optString2, "baseParams.optString(\"enter_method\")");
                String optString3 = LIZ2.optString("enter_from");
                o.LJIIIIZZ(optString3, "baseParams.optString(\"enter_from\")");
                KFQ.LIZ(kfq2, optString2, optString3, C2SL.LIZ());
            }
            KFQ kfq3 = ecSearchResultShopViewModel.LJLJJI;
            if (kfq3 != null) {
                kfq3.LIZLLL();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("searchInitParams", LIZ2);
            LIZ2.put("tab_name", "shop");
            LIZ2.put("type", LiveWalletRechargeExchangeStrengthen.DEFAULT);
            C48658J7u.LIZIZ("rd_ec_fe_params", LIZ2);
            ecSearchResultShopViewModel.setState(new AqS172S0100000_6(jSONObject, 60));
            KFQ kfq4 = ecSearchResultShopViewModel.LJLJJI;
            if (kfq4 != null) {
                kfq4.LJ("request_start");
            }
            XKX.LIZLLL(ecSearchResultShopViewModel.getAssemVMScope(), null, null, new C36013EBl(ecSearchResultShopViewModel, searchResultParam, LIZ2, null), 3);
        } catch (Exception e) {
            ecSearchResultShopViewModel.setState(new AqS172S0100000_6(e, 61));
        }
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragmentNew
    public final void Il(KFY kfy) {
        int i;
        String str;
        int value;
        String str2;
        String str3;
        String str4;
        Activity LJIJJ;
        InterfaceC51365KDx LIZ;
        InterfaceC51365KDx LIZ2;
        C50948Jz6 ha;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        int i2 = 0;
        if (mo49getActivity != null) {
            i = mo49getActivity.hashCode();
        } else {
            i = 0;
        }
        String.valueOf(i);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 453));
        try {
            KEP kep = this.LJLLI;
            if (kep != null && (LIZ2 = kep.LIZ()) != null && (ha = LIZ2.ha()) != null) {
                value = ha.getEcSearchEntranceValue();
            } else {
                value = EnumC51281KAr.DEFAULT.getValue();
            }
            SearchResultParam searchResultParam = this.LJZ;
            if (searchResultParam != null) {
                str2 = searchResultParam.getKeyword();
            } else {
                str2 = null;
            }
            SearchResultParam searchResultParam2 = this.LJZ;
            if (searchResultParam2 != null) {
                str3 = searchResultParam2.getEnterMethod();
            } else {
                str3 = null;
            }
            KEP kep2 = this.LJLLI;
            if (kep2 != null && (LIZ = kep2.LIZ()) != null) {
                str4 = LIZ.LJIILJJIL();
            } else {
                str4 = null;
            }
            String valueOf = String.valueOf(JI6.LIZ());
            Context context = getContext();
            if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
                i2 = LJIJJ.hashCode();
            }
            str = KFS.LIZJ(str2, str3, str4, valueOf, true, String.valueOf(i2), ((Boolean) LIZIZ.getValue()).booleanValue(), value);
        } catch (Throwable unused) {
            str = "aweme://lynxview/?channel=fe_tiktok_ecommerce_search_vertical&bundle=prod/all/fe_tiktok_ecommerce_search_vertical/vertical-shopping/template.js&use_bdx=1&dynamic=3&surl=https://lf77-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/tiktok/fe/live/fe_tiktok_ecommerce_search_vertical/prod/all/fe_tiktok_ecommerce_search_vertical/vertical-shopping/template.js";
        }
        DynamicPatch dynamicPatch = new DynamicPatch();
        dynamicPatch.schema = str;
        C51396KFc.LIZIZ(kfy, dynamicPatch, null, 6);
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragmentNew, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8YN.LJII(this, (AssemViewModel) this.LL.getValue(), new TBT() { // from class: X.KFe
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C35650Dyw) obj).LJLIL;
            }
        }, null, new AqS190S0100000_8(this, 15), 6);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LL.getValue(), new TBT() { // from class: X.KFf
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C35650Dyw) obj).LJLILLLLZI;
            }
        }, null, new AqS174S0100000_8(this, 63), null, new AqS174S0100000_8(this, 64), 10, null);
    }
}
