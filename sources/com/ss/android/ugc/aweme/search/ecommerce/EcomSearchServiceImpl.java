package com.ss.android.ugc.aweme.search.ecommerce;

import X.ASL;
import X.AV1;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C00F;
import X.C018905p;
import X.C020506f;
import X.C141335gf;
import X.C15070iV;
import X.C162476Zf;
import X.C17N;
import X.C1DG;
import X.C208338Fp;
import X.C208398Fv;
import X.C221108m2;
import X.C249109q6;
import X.C2SG;
import X.C2U8;
import X.C38350F3i;
import X.C38995FSd;
import X.C39468FeK;
import X.C3C4;
import X.C3C5;
import X.C3C8;
import X.C45804HyK;
import X.C47261Igj;
import X.C48658J7u;
import X.C49636Jdw;
import X.C50471JrP;
import X.C50650JuI;
import X.C50652JuK;
import X.C50863Jxj;
import X.C50946Jz4;
import X.C50947Jz5;
import X.C50948Jz6;
import X.C50958JzG;
import X.C51001Jzx;
import X.C51141K5h;
import X.C51163K6d;
import X.C51214K8c;
import X.C51222K8k;
import X.C51244K9g;
import X.C51248K9k;
import X.C51253K9p;
import X.C51275KAl;
import X.C51276KAm;
import X.C51277KAn;
import X.C51278KAo;
import X.C51286KAw;
import X.C51298KBi;
import X.C51385KEr;
import X.C51421KGb;
import X.C51423KGd;
import X.C58096Mr6;
import X.C61322au;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65232Piu;
import X.C76800UCe;
import X.C78685UuP;
import X.C78840Uwu;
import X.C78926UyI;
import X.C78983UzD;
import X.EnumC51264KAa;
import X.EnumC51280KAq;
import X.EnumC51281KAr;
import X.EnumC51287KAx;
import X.EnumC51288KAy;
import X.EnumC51289KAz;
import X.EnumC61742ba;
import X.EnumC61752bb;
import X.EnumC61762bc;
import X.EnumC62182cI;
import X.FFL;
import X.InterfaceC34451Wv;
import X.InterfaceC65784Pro;
import X.InterfaceC70514Rlu;
import X.K05;
import X.K0D;
import X.K5P;
import X.K5R;
import X.K7G;
import X.K8R;
import X.K94;
import X.KAK;
import X.KAM;
import X.KAO;
import X.KAY;
import X.KB5;
import X.KB6;
import X.KB7;
import X.KB9;
import X.KBA;
import X.KBD;
import X.KBE;
import X.KBF;
import X.KBG;
import X.KBJ;
import X.KBL;
import X.KBY;
import X.KC5;
import X.KCP;
import X.KCR;
import X.KDP;
import X.KE2;
import X.KEK;
import X.KEP;
import X.KFM;
import X.KL2;
import X.KLA;
import X.ORZ;
import X.X1D;
import X.Z9N;
import Y.ARunnableS7S1200000_8;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ab.RomaSchemaGroupSearchSettings;
import com.ss.android.ugc.aweme.app.AwemeApplicationServiceImpl;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallService;
import com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.mall.unify.api.IECMallService;
import com.ss.android.ugc.aweme.ecommerce.model.EcFeedSuggestWordList;
import com.ss.android.ugc.aweme.ecommerce.model.EcSuggestWordStruct;
import com.ss.android.ugc.aweme.ecommerce.model.EcWordStruct;
import com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.GeneralSearchAdapter;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchResultActivity;
import com.ss.android.ugc.aweme.ecomsearch.utils.EcIntermediatePreload;
import com.ss.android.ugc.aweme.ecomsearch.utils.EcSearchShopResultPreload;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.general.ECStoreLiveAssem;
import com.ss.android.ugc.aweme.general.ECStoreProductAssem;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.impl.LauncherTaskApiImpl;
import com.ss.android.ugc.aweme.impl.OptimizerHelperServiceImpl;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.result.common.core.ui.HalfShopBehavior;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchShopFragment;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.HalfDynamicSearchShopFragment;
import com.ss.android.ugc.aweme.search.ecommerce.config.TiktokEcSearchRegionConfigSettings;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ab.ECEntranceNewArch;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import defpackage.e1;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes9.dex */
public final class EcomSearchServiceImpl implements IEcomSearchService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(KBY.LJLIL);

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJIJJLI() {
        return e1.LIZ(31744, "disable_sug_from_fashion", true, false);
    }

    public static IEcomSearchService LJJJJZI() {
        Object LIZ = C58096Mr6.LIZ(IEcomSearchService.class, false);
        if (LIZ != null) {
            return (IEcomSearchService) LIZ;
        }
        if (C58096Mr6.I4 == null) {
            synchronized (IEcomSearchService.class) {
                if (C58096Mr6.I4 == null) {
                    C58096Mr6.I4 = new EcomSearchServiceImpl();
                }
            }
        }
        return C58096Mr6.I4;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJIILIIL() {
        return e1.LIZ(31744, "ec_enable_search_in_store", true, false);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final List<IInterceptor> LJJIJL() {
        return (List) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final int LJJJJLI() {
        return C00F.LIZ(31744, 0, "search_ecom_video_anchor_style_exp", true);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final String LJII() {
        return RomaSchemaGroupSearchSettings.LIZ().romaSchemaPageFilterPanelNew;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJIIJJI() {
        if (C2SG.LIZ() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final K7G LJIIZILJ() {
        if (!ECommerceMallService.v3().LJJLI()) {
            IECMallService LIZJ = FashionMallService.LIZJ();
            o.LJIIIIZZ(LIZJ, "get().getService(IECMallService::class.java)");
            if (!LIZJ.LJJLI()) {
                if (ECommerceMallService.v3().Q1()) {
                    return K7G.HOMEPAGE_MALL;
                }
                return K7G.NO_MALL;
            }
        }
        return K7G.MALL;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final String LJIJJ() {
        return RomaSchemaGroupSearchSettings.LIZ().romaSchemaPageStoreSearch;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final String LJJIJ() {
        return C50946Jz4.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LIZJ(Uri routeUri) {
        o.LJIIIZ(routeUri, "routeUri");
        return C51278KAo.LIZIZ(routeUri);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final SmartRoute LJFF(Context context) {
        o.LJIIIZ(context, "context");
        if (!AwemeApplicationServiceImpl.LIZ().isAppHot()) {
            return SmartRouter.buildRoute(context, "//main");
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJI(ECSearchEntranceData eCSearchEntranceData) {
        String str;
        if (eCSearchEntranceData == null || (str = eCSearchEntranceData.getMiddleDisableSugStrategy()) == null) {
            str = "";
        }
        if (C61322au.LIZ(eCSearchEntranceData, str, C61322au.LIZLLL) == EnumC61752bb.DISABLE_PAGE) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final String LJIIIIZZ(String str) {
        return C39468FeK.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJIIIZ(ECSearchEntranceData eCSearchEntranceData) {
        String str;
        if (eCSearchEntranceData == null || (str = eCSearchEntranceData.getDisableBg()) == null) {
            str = "";
        }
        return ((Boolean) C61322au.LIZ(eCSearchEntranceData, str, C61322au.LJIIIIZZ)).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b2, code lost:
    
        if (r6 == null) goto L23;
     */
    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData LJIIJ(android.net.Uri r12) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl.LJIIJ(android.net.Uri):com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData");
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJIILL(ECSearchEntranceData eCSearchEntranceData) {
        String str;
        if (eCSearchEntranceData == null || (str = eCSearchEntranceData.getMiddleDisableHistoryStrategy()) == null) {
            str = "";
        }
        return ((Boolean) C61322au.LIZ(eCSearchEntranceData, str, C61322au.LIZJ)).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJIL(ActivityC45651qj activityC45651qj) {
        return activityC45651qj instanceof EcSearchActivity;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJJ(boolean z) {
        if (z && !TiktokEcSearchRegionConfigSettings.LIZ().disableSuggestGuideFromMall) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final GeneralSearchAdapter LJJIFFI(KEP ecomSearchResultService) {
        o.LJIIIZ(ecomSearchResultService, "ecomSearchResultService");
        GeneralSearchAdapter generalSearchAdapter = new GeneralSearchAdapter();
        generalSearchAdapter.LJLLI = ecomSearchResultService;
        return generalSearchAdapter;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final EnumC61742ba LJJIIJ(ECSearchEntranceData eCSearchEntranceData) {
        String str;
        if (eCSearchEntranceData == null || (str = eCSearchEntranceData.getHistoryIsolateStrategy()) == null) {
            str = "";
        }
        return (EnumC61742ba) C61322au.LIZ(eCSearchEntranceData, str, C61322au.LJIIIZ);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final ReusedUISlotAssem<? extends C3C8> LJJIIZI(boolean z) {
        if (z) {
            return new ECStoreLiveAssem();
        }
        return new ECStoreProductAssem();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final KBF LJJIJIIJI(Uri routeUri) {
        o.LJIIIZ(routeUri, "routeUri");
        if (C51278KAo.LIZIZ(routeUri)) {
            String LJJJJI = C78926UyI.LJJJJI(routeUri, "enter_from");
            if (LJJJJI == null) {
                LJJJJI = "";
            }
            if (o.LJ(LJJJJI, "mall") || o.LJ(LJJJJI, "homepage_mall")) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Throwable th) {
                    C78983UzD.LJIIZILJ(th);
                }
                if (!SettingsManager.LIZ("mall_ug_deeplink_revert_setting", false)) {
                    try {
                        SettingsManager.LIZLLL().getClass();
                        if (SettingsManager.LIZ("enable_mall_ug_deeplink_to_ecom_search", false)) {
                            if (ECommerceMallService.v3().LLJLILLLLZIIL()) {
                                return KBF.GO_TO_MALL_SEARCH;
                            }
                            return KBF.GO_TO_GENERAL_SEARCH;
                        }
                    } catch (Throwable th2) {
                        C78983UzD.LJIIZILJ(th2);
                    }
                    return KBF.FROM_UG_DEEPLINK_BUT_NOT_HAVE_FUNCTION;
                }
            }
        }
        return KBF.NOT_FROM_MALL_UG_OR_REVERT;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJJIJIIJIL(ActivityC45651qj activityC45651qj) {
        return activityC45651qj instanceof EcSearchResultActivity;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJJIJLIJ(EnumC51280KAq rootEnterFromType) {
        o.LJIIIZ(rootEnterFromType, "rootEnterFromType");
        ECEntranceNewArch.LIZ.getClass();
        return ECEntranceNewArch.LIZ(rootEnterFromType);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJJJJ(ECSearchEntranceData eCSearchEntranceData) {
        String str;
        if (eCSearchEntranceData == null || (str = eCSearchEntranceData.getDisableFilterSearch()) == null) {
            str = "";
        }
        return ((Boolean) C61322au.LIZ(eCSearchEntranceData, str, C61322au.LJII)).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final DynamicSearchShopFragment LJJJJI(KEP ecomSearchResultService) {
        o.LJIIIZ(ecomSearchResultService, "ecomSearchResultService");
        DynamicSearchShopFragment dynamicSearchShopFragment = new DynamicSearchShopFragment();
        dynamicSearchShopFragment.LJLLI = ecomSearchResultService;
        return dynamicSearchShopFragment;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJJJJJ(ECSearchEntranceData eCSearchEntranceData) {
        String str;
        if (eCSearchEntranceData == null || (str = eCSearchEntranceData.getMiddleDisableGuessStrategy()) == null) {
            str = "";
        }
        return ((Boolean) C61322au.LIZ(eCSearchEntranceData, str, C61322au.LJ)).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJJJJJL(ECSearchEntranceData eCSearchEntranceData) {
        String str;
        int value;
        int i;
        if (eCSearchEntranceData == null || (str = eCSearchEntranceData.getMiddleEnableDiskGuessCacheStrategy()) == null) {
            str = "";
        }
        boolean booleanValue = ((Boolean) C61322au.LIZ(eCSearchEntranceData, str, C61322au.LJI)).booleanValue();
        if (!booleanValue) {
            KCR kcr = EnumC51280KAq.Companion;
            if (eCSearchEntranceData != null) {
                value = eCSearchEntranceData.getRootEnterFromType();
            } else {
                value = EnumC51280KAq.DEFAULT.getValue();
            }
            kcr.getClass();
            EnumC51280KAq enumC51280KAq = EnumC51280KAq.MAP.get(Integer.valueOf(value));
            if (enumC51280KAq != null && ((i = KB9.LIZIZ[enumC51280KAq.ordinal()]) == 1 || i == 2 || i == 3)) {
                return true;
            }
        }
        return booleanValue;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final EnumC61762bc LJJJJLL(ECSearchEntranceData eCSearchEntranceData) {
        String str;
        if (eCSearchEntranceData != null && eCSearchEntranceData.isEC() && LJJJJJ(eCSearchEntranceData)) {
            return EnumC61762bc.NO_CACHE;
        }
        if (eCSearchEntranceData == null || (str = eCSearchEntranceData.getMiddleGuessCacheStrategy()) == null) {
            str = "";
        }
        return (EnumC61762bc) C61322au.LIZ(eCSearchEntranceData, str, C61322au.LJFF);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJJJJZ(ECSearchEntranceData eCSearchEntranceData) {
        String str;
        if (eCSearchEntranceData == null || (str = eCSearchEntranceData.getMiddleDisableSugStrategy()) == null) {
            str = "";
        }
        if (C61322au.LIZ(eCSearchEntranceData, str, C61322au.LIZLLL) == EnumC61752bb.DISABLE_REQUEST) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final Intent LIZLLL(Activity activity, Uri uri) {
        Intent intent;
        o.LJIIIZ(activity, "activity");
        IEcomSearchService LJJIJL = C63081OpJ.LJJIJL();
        KBF LJJIJIIJI = LJJIJL.LJJIJIIJI(uri);
        Uri LJJIIJZLJL = LJJIJL.LJJIIJZLJL(uri, LJJIJIIJI);
        if (LJJIJIIJI == KBF.FROM_UG_DEEPLINK_BUT_NOT_HAVE_FUNCTION) {
            SmartRoute LJFF = LJJIJL.LJFF(activity);
            if (LJFF != null) {
                return LJFF.buildIntent();
            }
            return null;
        }
        C50947Jz5 newBuilder = C50948Jz6.Companion.newBuilder();
        C50652JuK LIZ = C50946Jz4.LIZ(LJJIIJZLJL, newBuilder);
        C50948Jz6 LIZIZ = newBuilder.LIZIZ();
        SearchResultParam searchResultParam = new SearchResultParam();
        C50946Jz4.LIZIZ(LJJIIJZLJL, searchResultParam);
        searchResultParam.setSearchEnterParam(LIZIZ);
        LJJIJL.LJJJI(LJJIIJZLJL, LJJIJIIJI, LIZ.getImmutableData().getSearchEcommerceModel(), searchResultParam);
        if (LJJIJIIJI == KBF.GO_TO_MALL_SEARCH) {
            C51214K8c.LJIIIIZZ(searchResultParam);
        }
        C50471JrP.LIZJ(LIZ, LIZIZ);
        if (C50958JzG.LIZ()) {
            intent = new Intent(activity, (Class<?>) EcSearchActivity.class);
        } else {
            intent = new Intent(activity, (Class<?>) EcSearchResultActivity.class);
        }
        new Bundle();
        intent.putExtra("searchParam", searchResultParam);
        intent.putExtra("search_enter_param", LIZIZ);
        intent.putExtras(intent.putExtra("search_context_source", LIZ));
        return intent;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJ(String str, String value) {
        o.LJIIIZ(value, "value");
        C39468FeK.LJIIL(str, value);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJIILJJIL(String str, boolean z) {
        if (C2SG.LIZ() == 2 && o.LJ("product_detail", str) && !z) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJIJI(KE2 ke2, ActivityC45651qj activityC45651qj) {
        float f;
        C50948Jz6 searchEnterParam;
        ECSearchEntranceData ecSearchEntranceData;
        String resultExpandHeight;
        Float LJJIJLIJ;
        HalfDynamicSearchShopFragment halfDynamicSearchShopFragment = new HalfDynamicSearchShopFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ec_result_immutable_data", ke2);
        halfDynamicSearchShopFragment.setArguments(bundle);
        SearchResultParam searchResultParam = ke2.getSearchResultParam();
        if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null && (ecSearchEntranceData = searchEnterParam.getEcSearchEntranceData()) != null && (resultExpandHeight = ecSearchEntranceData.getResultExpandHeight()) != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(resultExpandHeight)) != null) {
            f = LJJIJLIJ.floatValue();
        } else {
            f = 0.73f;
        }
        ASL LIZ = C249109q6.LIZ(1);
        int LJIIIZ = (int) (KL2.LJIIIZ(activityC45651qj) * f);
        TuxSheet tuxSheet = LIZ.LIZ;
        tuxSheet.LJLLLLLL = LJIIIZ;
        tuxSheet.LJLLILLLL = halfDynamicSearchShopFragment;
        tuxSheet.LLD = true;
        tuxSheet.LJZI = false;
        tuxSheet.LJZL = true;
        tuxSheet.LJLLL = null;
        HalfShopBehavior halfShopBehavior = new HalfShopBehavior();
        TuxSheet tuxSheet2 = LIZ.LIZ;
        tuxSheet2.LLFZ = halfShopBehavior;
        C1DG.LJII(activityC45651qj, "it.supportFragmentManager", tuxSheet2, "HalfDynamicSearchShopFragment");
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJII(Bundle bundle, K5R k5r) {
        SearchResultParam searchResultParam;
        String string;
        if (k5r != null) {
            k5r.LIZ = true;
        }
        if (bundle != null && (string = bundle.getString("recreateTabName")) != null && k5r != null) {
            k5r.LJI = string;
        }
        String str = null;
        if (bundle != null) {
            str = bundle.getString("recreateState");
        }
        if (o.LJ(str, K05.RECREATE_SEARCH_RESULT.getState())) {
            if (k5r != null) {
                k5r.LIZIZ = true;
            }
            Serializable serializable = bundle.getSerializable("param");
            if (!(serializable instanceof SearchResultParam) || (searchResultParam = (SearchResultParam) serializable) == null || k5r == null) {
                return;
            }
            k5r.LJ = searchResultParam;
            return;
        }
        if (o.LJ(str, K05.RECREATE_SEARCH_SUG.getState())) {
            if (k5r != null) {
                k5r.LIZJ = true;
            }
            String string2 = bundle.getString("sugKeyword");
            if (!C78685UuP.LJJJZ(string2) || string2 == null || k5r == null) {
                return;
            }
            k5r.LJFF = string2;
            return;
        }
        if (!o.LJ(str, K05.RECREATE_SEARCH_SQUARE.getState()) || k5r == null) {
            return;
        }
        k5r.LIZLLL = true;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJIII(Context context, ActivityC45651qj activityC45651qj) {
        try {
            if (C51248K9k.LIZIZ != KAY.LOAD) {
                C50863Jxj c50863Jxj = new C50863Jxj(context, null);
                C51248K9k.LIZJ(c50863Jxj, activityC45651qj);
                C51248K9k.LIZ = new WeakReference<>(c50863Jxj);
            }
        } catch (Throwable unused) {
            C78983UzD.LJIILL("tiktokec_search_middle_preload_error");
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final Uri LJJIIJZLJL(Uri routeUri, KBF state) {
        boolean z;
        o.LJIIIZ(routeUri, "routeUri");
        o.LJIIIZ(state, "state");
        if (state.compareTo(KBF.NOT_FROM_MALL_UG_OR_REVERT) > 0) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (!z) {
            state = null;
        }
        if (state != null) {
            int i = KBJ.LIZ[state.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new C162476Zf();
                        }
                    } else {
                        str = "no_mall_tab";
                    }
                } else {
                    str = "mall_ug_deeplink_close";
                }
            }
            C51278KAo.LIZJ(routeUri, str);
            int i2 = KBD.LIZ[state.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    return routeUri;
                }
                try {
                    Uri.Builder buildUpon = routeUri.buildUpon();
                    if (!C51278KAo.LIZ(routeUri, "back_to_page")) {
                        buildUpon.appendQueryParameter("back_to_page", "mall");
                    }
                    Uri build = buildUpon.build();
                    o.LJIIIIZZ(build, "builder.build()");
                    routeUri = C78840Uwu.LJJIIZ(build);
                    return routeUri;
                } catch (Throwable th) {
                    C78983UzD.LJIIZILJ(th);
                    return routeUri;
                }
            }
            try {
                Uri.Builder buildUpon2 = routeUri.buildUpon();
                if (!C51278KAo.LIZ(routeUri, "back_to_page")) {
                    buildUpon2.appendQueryParameter("back_to_page", "mall");
                }
                if (!C51278KAo.LIZ(routeUri, "origin_url")) {
                    buildUpon2.appendQueryParameter("origin_url", routeUri.toString());
                }
                if (!C51278KAo.LIZ(routeUri, "traffic_source_list")) {
                    buildUpon2.appendQueryParameter("traffic_source_list", new JSONArray((Collection) C47261Igj.LJJIJ(6)).toString());
                }
                if (!C51278KAo.LIZ(routeUri, "in_single_stack")) {
                    buildUpon2.appendQueryParameter("in_single_stack", "true");
                }
                if (!C51278KAo.LIZ(routeUri, "set_hint_by_sug_word")) {
                    buildUpon2.appendQueryParameter("set_hint_by_sug_word", "false");
                }
                if (!C51278KAo.LIZ(routeUri, "keep_tab_position")) {
                    buildUpon2.appendQueryParameter("keep_tab_position", "true");
                }
                if (!C51278KAo.LIZ(routeUri, "back_flag")) {
                    buildUpon2.appendQueryParameter("back_flag", "1");
                }
                buildUpon2.appendQueryParameter("root_enter_from_type", String.valueOf(EnumC51280KAq.MALL_UG_DEEPLINK.getValue()));
                Uri build2 = buildUpon2.build();
                o.LJIIIIZZ(build2, "builder.build()");
                routeUri = build2;
                return routeUri;
            } catch (Throwable th2) {
                C78983UzD.LJIIZILJ(th2);
                return routeUri;
            }
        }
        return routeUri;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJIL(Uri routeUri, String str) {
        o.LJIIIZ(routeUri, "routeUri");
        C51278KAo.LIZJ(routeUri, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LIZ(Uri uri, SearchResultParam searchResultParam, String str) {
        C38995FSd.LIZJ().execute(new ARunnableS7S1200000_8(uri, searchResultParam, str, 16));
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJIILLIIL(Uri routeUri, EnumC51281KAr enumC51281KAr, ECSearchEntranceData eCSearchEntranceData) {
        int rootEnterFromType;
        String str;
        String str2;
        o.LJIIIZ(routeUri, "routeUri");
        JSONObject jSONObject = new JSONObject();
        try {
            if (eCSearchEntranceData == null) {
                rootEnterFromType = enumC51281KAr.getValue();
            } else {
                rootEnterFromType = eCSearchEntranceData.getRootEnterFromType();
            }
            if (eCSearchEntranceData == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = "1";
            }
            jSONObject.put("new_arch", str);
            try {
                str2 = UriProtector.getQueryParameter(routeUri, "enter_from");
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
                str2 = null;
            }
            jSONObject.put("enter_from", str2);
            ECEntranceNewArch eCEntranceNewArch = ECEntranceNewArch.LIZ;
            EnumC51280KAq.Companion.getClass();
            EnumC51280KAq enumC51280KAq = EnumC51280KAq.MAP.get(Integer.valueOf(rootEnterFromType));
            eCEntranceNewArch.getClass();
            jSONObject.put("new_arch_exp", ECEntranceNewArch.LIZ(enumC51280KAq));
            C51276KAm.LIZ.getClass();
            jSONObject.put("is_ec_exp", ((Map) C51276KAm.LIZJ.getValue()).containsKey(String.valueOf(rootEnterFromType)));
            jSONObject.put("mall_simple_tab_exp", KLA.LIZ());
            C51141K5h.LIZ.getClass();
            jSONObject.put("middle_isolate_exp", C51141K5h.LIZIZ());
            jSONObject.put("root_enter_from_type", rootEnterFromType);
            jSONObject.put("schema", routeUri);
            if (eCSearchEntranceData != null) {
                jSONObject.put("enter_req_source", eCSearchEntranceData.getEnterReqSource());
                jSONObject.put("enter_view_type", eCSearchEntranceData.getEnterViewType());
                jSONObject.put("disable_history_strategy", eCSearchEntranceData.getMiddleDisableHistoryStrategy());
                jSONObject.put("disable_sug_strategy", eCSearchEntranceData.getMiddleDisableSugStrategy());
                jSONObject.put("disable_guess_strategy", eCSearchEntranceData.getMiddleDisableGuessStrategy());
                jSONObject.put("enable_disk_guess_cache_strategy", eCSearchEntranceData.getMiddleEnableDiskGuessCacheStrategy());
                jSONObject.put("middle_sug_source", eCSearchEntranceData.getMiddleSugSource());
                jSONObject.put("middle_req_source", eCSearchEntranceData.getMiddleReqSource());
                jSONObject.put("guess_cache_strategy", eCSearchEntranceData.getMiddleGuessCacheStrategy());
                jSONObject.put("result_source", eCSearchEntranceData.getResultSource());
                jSONObject.put("result_channel", eCSearchEntranceData.getResultChannel());
                jSONObject.put("result_type", eCSearchEntranceData.getResultType());
                jSONObject.put("result_disable_filter", eCSearchEntranceData.getDisableFilterSearch());
                jSONObject.put("result_disable_bg", eCSearchEntranceData.getDisableBg());
                jSONObject.put("history_isolate_strategy", eCSearchEntranceData.getHistoryIsolateStrategy());
                jSONObject.put("duration", eCSearchEntranceData.getDataGenerationDuration());
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable unused2) {
        }
        C48658J7u.LIZIZ("rd_ec_search_entrance", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJJIIZ(ActivityC45651qj activityC45651qj, String str, String str2) {
        boolean isMainPage = MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(activityC45651qj);
        boolean LIZJ = a.LJIIIZ().LIZJ();
        if (o.LJ(str, "") || o.LJ("1", str2) || !Z9N.LIZIZ.LLLFZ() || !isMainPage || LIZJ) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJIJ(SearchResultParam searchResultParam, boolean z, int i, int i2) {
        o.LJIIIZ(searchResultParam, "searchResultParam");
        EcSearchShopResultPreload.Companion.getClass();
        KFM.LIZJ(searchResultParam, false, z, i, i2);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJIJIL(C208398Fv c208398Fv, EditText editText, ImageView imageView, boolean z) {
        C208338Fp.LIZJ(c208398Fv, editText, imageView, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJIZ(Bundle outState, K05 k05, K0D k0d, String tabName) {
        SearchResultParam searchResultParam;
        String str;
        o.LJIIIZ(outState, "outState");
        o.LJIIIZ(tabName, "tabName");
        outState.putString("shouldRecreate", "1");
        outState.putString("recreateState", k05.getState());
        outState.putString("recreateTabName", tabName);
        int i = KB9.LIZ[k05.ordinal()];
        if (i != 1) {
            if (i != 2 || k0d == null || (str = k0d.LIZIZ) == null) {
                return;
            }
            outState.putSerializable("sugKeyword", str);
            return;
        }
        if (k0d == null || (searchResultParam = k0d.LIZ) == null) {
            return;
        }
        outState.putSerializable("param", searchResultParam);
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [kotlin.jvm.internal.DefaultConstructorMarker, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v5, types: [kotlin.jvm.internal.DefaultConstructorMarker, java.lang.String] */
    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJJI(Uri uri, KBF deepLinkState, K5P ecommerceModel, SearchResultParam searchResultParam) {
        KBA deepLinkEcParams;
        KBA deepLinkEcParams2;
        KBA deepLinkEcParams3;
        KBA deepLinkEcParams4;
        KBA deepLinkEcParams5;
        String str;
        Uri parse;
        Uri.Builder buildUpon;
        String str2;
        C3C4 LIZ;
        C51244K9g c51244K9g;
        m mVar;
        KBE kbe;
        String str3;
        C51244K9g c51244K9g2;
        String str4;
        String str5;
        String str6;
        String LJJIFFI;
        int parseInt;
        o.LJIIIZ(deepLinkState, "deepLinkState");
        o.LJIIIZ(ecommerceModel, "ecommerceModel");
        String str7 = "";
        DefaultConstructorMarker defaultConstructorMarker = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        if (deepLinkState == KBF.GO_TO_GENERAL_SEARCH || deepLinkState == KBF.GO_TO_MALL_SEARCH) {
            ecommerceModel.setFromMallUGDeepLink(true);
            ecommerceModel.setExistMallTab(ECommerceMallService.v3().LLJLILLLLZIIL());
            String LJJJJI = C78926UyI.LJJJJI(uri, "back_to_page");
            if (LJJJJI != null && o.LJ(LJJJJI, "mall")) {
                if (ECommerceMallService.v3().LLJLILLLLZIIL()) {
                    ecommerceModel.setNeedBackToPage(true);
                    try {
                        parse = UriProtector.parse("sslocal://ec/mall");
                    } catch (Throwable th) {
                        C78983UzD.LJIIZILJ(th);
                    }
                    if (parse != null && (buildUpon = parse.buildUpon()) != null) {
                        String LJJJJI2 = C78926UyI.LJJJJI(uri, "enter_from");
                        if (LJJJJI2 != null) {
                            buildUpon.appendQueryParameter("enter_from", LJJJJI2);
                        }
                        String LJJJJI3 = C78926UyI.LJJJJI(uri, "previous_page");
                        if (LJJJJI3 != null) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("search_");
                            LIZ2.append(LJJJJI3);
                            buildUpon.appendQueryParameter("previous_page", X1D.LIZIZ(LIZ2));
                        }
                        String LJJJJI4 = C78926UyI.LJJJJI(uri, "deeplink_type");
                        if (LJJJJI4 != null) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("search_");
                            LIZ3.append(LJJJJI4);
                            buildUpon.appendQueryParameter("deeplink_type", X1D.LIZIZ(LIZ3));
                        }
                        Uri build = buildUpon.build();
                        if (build != null) {
                            str = build.toString();
                            if (str == null) {
                            }
                            ecommerceModel.setPageSchema(str);
                        }
                    }
                    str = "";
                    ecommerceModel.setPageSchema(str);
                } else if (AwemeApplicationServiceImpl.LIZ().isAppHot()) {
                    ecommerceModel.setNeedBackToPage(false);
                } else {
                    ecommerceModel.setNeedBackToPage(true);
                    ecommerceModel.setPageSchema("//main");
                }
            }
            if (KBD.LIZ[deepLinkState.ordinal()] == 1) {
                String LJJJJI5 = C78926UyI.LJJJJI(uri, "deeplink_type");
                if (LJJJJI5 != null && (deepLinkEcParams5 = ecommerceModel.getDeepLinkEcParams()) != null) {
                    deepLinkEcParams5.setAdDeepLinkType(LJJJJI5);
                }
                String LJJJJI6 = C78926UyI.LJJJJI(uri, "campaign_id");
                if (LJJJJI6 != null && (deepLinkEcParams4 = ecommerceModel.getDeepLinkEcParams()) != null) {
                    deepLinkEcParams4.setAdCampaignId(LJJJJI6);
                }
                String LJJJJI7 = C78926UyI.LJJJJI(uri, "creative_id");
                if (LJJJJI7 != null && (deepLinkEcParams3 = ecommerceModel.getDeepLinkEcParams()) != null) {
                    deepLinkEcParams3.setAdCreativeId(LJJJJI7);
                }
                String LJJJJI8 = C78926UyI.LJJJJI(uri, "origin_url");
                if (LJJJJI8 != null && (deepLinkEcParams2 = ecommerceModel.getDeepLinkEcParams()) != null) {
                    deepLinkEcParams2.setAdUrl(LJJJJI8);
                }
                String LJJJJI9 = C78926UyI.LJJJJI(uri, "previous_page");
                if (LJJJJI9 != null && (deepLinkEcParams = ecommerceModel.getDeepLinkEcParams()) != null) {
                    deepLinkEcParams.setAdPreviousPage(LJJJJI9);
                }
            }
        }
        if (deepLinkState == KBF.GO_TO_MALL_SEARCH) {
            str2 = "mall_ug";
        } else {
            str2 = null;
        }
        String LJJJJI10 = C78926UyI.LJJJJI(uri, "top_product_ids");
        if (LJJJJI10 != null) {
            JSONObject LIZJ = C65232Piu.LIZJ("product_id", LJJJJI10);
            String LJJJJI11 = C78926UyI.LJJJJI(uri, "product_rank");
            if (LJJJJI11 != null) {
                try {
                    parseInt = CastIntegerProtector.parseInt(LJJJJI11);
                } catch (Exception unused) {
                }
                LIZJ.put("position", parseInt);
                searchResultParam.setResultAttachCard(new C51244K9g(KBE.PRODUCT_CARD, C47261Igj.LJJIJ(LIZJ).toString(), z5 ? 1 : 0, z4 ? 1 : 0, str2, 12, z3 ? 1 : 0));
            }
            parseInt = 1;
            LIZJ.put("position", parseInt);
            searchResultParam.setResultAttachCard(new C51244K9g(KBE.PRODUCT_CARD, C47261Igj.LJJIJ(LIZJ).toString(), z5 ? 1 : 0, z4 ? 1 : 0, str2, 12, z3 ? 1 : 0));
        }
        String LJJJJI12 = C78926UyI.LJJJJI(uri, "attach_products");
        if (LJJJJI12 != null) {
            ?? r12 = 0;
            searchResultParam.setResultAttachCard(new C51244K9g(KBE.PRODUCT_CARD, LJJJJI12, z2 ? 1 : 0, z ? 1 : 0, r12, 28, r12));
            defaultConstructorMarker = r12;
        }
        String LJJJJI13 = C78926UyI.LJJJJI(uri, "result_attach_card");
        if (LJJJJI13 != null) {
            try {
                String optString = new JSONArray(LJJJJI13).optString(0);
                if (optString == null) {
                    optString = "";
                }
                mVar = (m) GsonHolder.LIZLLL().LIZ().LJI(optString, m.class);
                KCP kcp = KBE.Companion;
                j LJJIJ = mVar.LJJIJ("card_type");
                if (LJJIJ != null && (LJJIFFI = LJJIJ.LJJIFFI()) != null) {
                    str7 = LJJIFFI;
                }
                kcp.getClass();
                kbe = KBE.MAP.get(str7);
            } catch (Throwable th2) {
                LIZ = C141335gf.LIZ(th2);
                C3C5.m7constructorimpl(LIZ);
            }
            if (kbe != null) {
                int i = KBD.LIZIZ[kbe.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            C51222K8k c51222K8k = new C51222K8k(defaultConstructorMarker, defaultConstructorMarker, 3, defaultConstructorMarker);
                            j LJJIJ2 = mVar.LJJIJ("sug_creator_id");
                            if (LJJIJ2 != null) {
                                str5 = LJJIJ2.LJJIFFI();
                            } else {
                                str5 = defaultConstructorMarker;
                            }
                            if (C78685UuP.LJJJZ(str5) && str5 != null) {
                                c51222K8k.setCreatorId(str5);
                            }
                            j LJJIJ3 = mVar.LJJIJ("sug_shop_id");
                            if (LJJIJ3 != null) {
                                str6 = LJJIJ3.LJJIFFI();
                            } else {
                                str6 = defaultConstructorMarker;
                            }
                            if (C78685UuP.LJJJZ(str6) && str6 != null) {
                                c51222K8k.setShopId(str6);
                            }
                            c51244K9g2 = new C51244K9g(kbe, defaultConstructorMarker, defaultConstructorMarker, c51222K8k, defaultConstructorMarker, 22, defaultConstructorMarker);
                            c51244K9g = c51244K9g2;
                        } else {
                            throw new C162476Zf();
                        }
                    } else {
                        j LJJIJ4 = mVar.LJJIJ("sug_creator_id");
                        if (LJJIJ4 != null) {
                            str4 = LJJIJ4.LJJIFFI();
                        } else {
                            str4 = defaultConstructorMarker;
                        }
                        if (C78685UuP.LJJJZ(str4) && str4 != null) {
                            c51244K9g = new C51244K9g(kbe, defaultConstructorMarker, new KBG(str4), defaultConstructorMarker, defaultConstructorMarker, 26, defaultConstructorMarker);
                        }
                    }
                } else {
                    j LJJIJ5 = mVar.LJJIJ("product_card_list");
                    if (LJJIJ5 != null) {
                        str3 = LJJIJ5.toString();
                    } else {
                        str3 = defaultConstructorMarker;
                    }
                    if (C78685UuP.LJJJZ(str3) && str3 != null) {
                        c51244K9g2 = new C51244K9g(kbe, str3, defaultConstructorMarker, defaultConstructorMarker, defaultConstructorMarker, 28, defaultConstructorMarker);
                        c51244K9g = c51244K9g2;
                    }
                }
                searchResultParam.setResultAttachCard(c51244K9g);
            }
            C3C5.m7constructorimpl(defaultConstructorMarker);
            LIZ = defaultConstructorMarker;
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            c51244K9g = defaultConstructorMarker;
            if (m10exceptionOrNullimpl != null) {
                C78983UzD.LJIIZILJ(m10exceptionOrNullimpl);
                c51244K9g = defaultConstructorMarker;
            }
            searchResultParam.setResultAttachCard(c51244K9g);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJJJIZL(Context context, Uri uri, Bundle bundle, Object obj) {
        RouteIntent routeIntent;
        boolean z;
        boolean z2;
        K5P searchEcommerceModel;
        String singleTabType;
        C50650JuI immutableData;
        C49636Jdw searchSessionModel;
        String str;
        K5P searchEcommerceModel2;
        String singleTabType2;
        Bundle bundle2 = bundle;
        o.LJIIIZ(context, "context");
        String str2 = null;
        if (obj instanceof RouteIntent) {
            routeIntent = (RouteIntent) obj;
        } else {
            routeIntent = null;
        }
        IEcomSearchService LJJIJL = C63081OpJ.LJJIJL();
        LJJIJL.LIZ(uri, null, "before_schema");
        KBF LJJIJIIJI = LJJIJL.LJJIJIIJI(uri);
        Uri LJJIIJZLJL = LJJIJL.LJJIIJZLJL(uri, LJJIJIIJI);
        if (LJJIJIIJI == KBF.FROM_UG_DEEPLINK_BUT_NOT_HAVE_FUNCTION) {
            SmartRoute LJFF = LJJIJL.LJFF(context);
            if (LJFF != null) {
                LJFF.open();
                return;
            }
            return;
        }
        OptimizerHelperServiceImpl.LJIIIZ().LJIIIIZZ(2000L, 2, 8);
        C50947Jz5 newBuilder = C50948Jz6.Companion.newBuilder();
        C50652JuK LIZ = C50946Jz4.LIZ(LJJIIJZLJL, newBuilder);
        C50948Jz6 LIZIZ = newBuilder.LIZIZ();
        SearchResultParam searchResultParam = new SearchResultParam();
        C50946Jz4.LIZIZ(LJJIIJZLJL, searchResultParam);
        searchResultParam.setSearchEnterParam(LIZIZ);
        LJJIJL.LJJJI(LJJIIJZLJL, LJJIJIIJI, LIZ.getImmutableData().getSearchEcommerceModel(), searchResultParam);
        C51253K9p c51253K9p = C51253K9p.LIZ;
        C51253K9p.LIZIZ = null;
        c51253K9p.LIZLLL(EnumC51264KAa.START);
        LauncherTaskApiImpl.LJIIIIZZ().LIZJ();
        EcIntermediatePreload.Companion.getClass();
        KAM.LIZ(searchResultParam);
        LJJIJL.LIZ(null, searchResultParam, "after_schema");
        int i = 0;
        if (LIZIZ.getEcSearchEntranceValue() == EnumC51281KAr.HALF_SHOP.getValue()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - C51001Jzx.LIZ;
            C51001Jzx.LIZ = currentTimeMillis;
            if (j < 1000) {
                return;
            }
            searchResultParam.setSearchEnterParam(LIZIZ);
            C50650JuI immutableData2 = LIZ.getImmutableData();
            if (immutableData2 != null && (searchEcommerceModel2 = immutableData2.getSearchEcommerceModel()) != null && (singleTabType2 = searchEcommerceModel2.getSingleTabType()) != null) {
                searchResultParam.setSingleTabType(singleTabType2);
            }
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI == null) {
                return;
            }
            C50948Jz6 searchEnterParam = searchResultParam.getSearchEnterParam();
            if (searchEnterParam != null) {
                str = searchEnterParam.getEcSearchSessionId();
            } else {
                str = null;
            }
            C50948Jz6 searchEnterParam2 = searchResultParam.getSearchEnterParam();
            if (searchEnterParam2 != null) {
                str2 = searchEnterParam2.getTrafficSourceList();
            }
            LJJJJZI().LJIJI(new KE2(searchResultParam, str, str2), LJJIFFI);
            return;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        long j2 = currentTimeMillis2 - C51001Jzx.LIZ;
        C51001Jzx.LIZ = currentTimeMillis2;
        if (j2 >= 1000) {
            C51421KGb.LIZIZ("launch");
            KAO kao = C51253K9p.LIZIZ;
            if (kao != null) {
                kao.LJIIIIZZ = System.currentTimeMillis();
            }
            System.currentTimeMillis();
            KC5 kc5 = new KC5();
            KDP.LIZ = kc5;
            kc5.LIZ = System.currentTimeMillis();
            if (searchResultParam.getKeyword() != null && (immutableData = LIZ.getImmutableData()) != null && (searchSessionModel = immutableData.getSearchSessionModel()) != null) {
                searchSessionModel.getSearchSessionId();
            }
            searchResultParam.setSearchEnterParam(LIZIZ);
            C50650JuI immutableData3 = LIZ.getImmutableData();
            if (immutableData3 != null && (searchEcommerceModel = immutableData3.getSearchEcommerceModel()) != null && (singleTabType = searchEcommerceModel.getSingleTabType()) != null) {
                searchResultParam.setSingleTabType(singleTabType);
            }
            C51214K8c.LJIIIIZZ(searchResultParam);
            if (!TextUtils.isEmpty(searchResultParam.getSwitchTab())) {
                String switchTab = searchResultParam.getSwitchTab();
                o.LJIIIIZZ(switchTab, "param.switchTab");
                if (o.LJ(switchTab, "challenge")) {
                    switchTab = KAK.HASHTAG.getTabName();
                }
                List<KAK> list = C51214K8c.LIZIZ;
                KAK.Companion.getClass();
                Integer valueOf = Integer.valueOf(ORZ.LJZ(C51298KBi.LIZ(switchTab), list));
                if (valueOf.intValue() >= 0) {
                    i = valueOf.intValue();
                }
                if (searchResultParam.getFilterOption().isDefaultOption()) {
                    C2U8.LIZ(new K8R(i));
                    return;
                } else {
                    C2U8.LIZ(new K8R(i, searchResultParam.getFilterOption()));
                    return;
                }
            }
            boolean LIZLLL = MSAdaptionService.LJIIL().LIZLLL(context);
            if (TextUtils.equals(LIZIZ.getEnterSearchFrom(), "homepage_hot") || TextUtils.equals(LIZIZ.getEnterSearchFrom(), "homepage_follow")) {
                z = true;
            } else {
                z = false;
            }
            if ((context instanceof EcSearchResultActivity) || (context instanceof EcSearchActivity)) {
                z2 = true;
            } else {
                z2 = false;
            }
            C51001Jzx.LIZIZ = z2;
            C50471JrP.LIZJ(LIZ, LIZIZ);
            if (C78685UuP.LJJJZ(searchResultParam.getKeyword()) && !C50958JzG.LIZ()) {
                KFM kfm = EcSearchShopResultPreload.Companion;
                int LIZJ = C51214K8c.LIZJ(KAK.SHOP);
                kfm.getClass();
                KFM.LIZJ(searchResultParam, true, true, LIZJ, -1);
            }
            LJJJJZI().LIZ(null, searchResultParam, "before_page");
            if (C50958JzG.LIZ()) {
                if ((context instanceof Activity) && !LIZLLL && !z) {
                    if (bundle2 == null) {
                        bundle2 = C020506f.LIZJ((Activity) context, new C15070iV[0]).LIZLLL();
                    }
                    C51275KAl.LIZ(context, searchResultParam, LIZIZ, bundle2, LIZ, routeIntent);
                    return;
                }
                C51275KAl.LIZ(context, searchResultParam, LIZIZ, null, LIZ, routeIntent);
                return;
            }
            if ((context instanceof Activity) && !LIZLLL && !z) {
                if (bundle2 == null) {
                    bundle2 = C020506f.LIZJ((Activity) context, new C15070iV[0]).LIZLLL();
                }
                C51277KAn.LIZ(context, searchResultParam, LIZIZ, bundle2, LIZ, routeIntent);
                return;
            }
            C51277KAn.LIZ(context, searchResultParam, LIZIZ, null, LIZ, routeIntent);
            return;
        }
        LJJJJZI().LIZ(null, searchResultParam, "cannot_launch");
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJIIL(View view, String str, String str2, Map<String, String> map, InterfaceC34451Wv interfaceC34451Wv) {
        o.LJIIIZ(view, "view");
        C39468FeK.LJFF(view, str, str2, map, interfaceC34451Wv);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final void LJJJIL(C51163K6d c51163K6d, Context context, ViewGroup viewGroup, TextView textView, boolean z) {
        K94.LIZJ(c51163K6d, context, viewGroup, textView, z, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final InterfaceC70514Rlu LJJJJL(Context context, EnumC51280KAq rootEnterFromType, ECSearchEntranceData eCSearchEntranceData, KEK kek, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Object LIZ;
        Object LIZ2;
        String value;
        Object LIZ3;
        Object LIZ4;
        boolean z;
        boolean z2;
        boolean z3;
        List<EcSuggestWordStruct> suggestWords;
        String str;
        EcWordStruct ecWordStruct;
        ECSearchEntranceData eCSearchEntranceData2 = eCSearchEntranceData;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(rootEnterFromType, "rootEnterFromType");
        int i = C51286KAw.LIZJ[rootEnterFromType.ordinal()];
        boolean z4 = true;
        boolean z5 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        C018905p c018905p = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    if (eCSearchEntranceData2 == null) {
                        eCSearchEntranceData2 = new ECSearchEntranceData(objArr3 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr2 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 268435455, 0 == true ? 1 : 0);
                    }
                    return KBL.LIZ(context, eCSearchEntranceData2, kek, interfaceC65784Pro, null);
                }
                Aweme aweme = kek.LJIL;
                Boolean bool = kek.LJJII;
                if (aweme == null || bool == null) {
                    return null;
                }
                bool.booleanValue();
                String aid = aweme.getAid();
                EcFeedSuggestWordList ecFeedSuggestWordList = aweme.getEcFeedSuggestWordList();
                if (ecFeedSuggestWordList != null && (suggestWords = ecFeedSuggestWordList.getSuggestWords()) != null) {
                    z = false;
                    z2 = false;
                    for (EcSuggestWordStruct ecSuggestWordStruct : suggestWords) {
                        if (ecSuggestWordStruct != null && o.LJ("comment_top", ecSuggestWordStruct.getScene())) {
                            if (o.LJ("1", ecSuggestWordStruct.getQrecVirtualEnable())) {
                                Z9N z9n = Z9N.LIZIZ;
                                z9n.LLJJJ(aid, true);
                                List<EcWordStruct> words = ecSuggestWordStruct.getWords();
                                if (words != null && (ecWordStruct = (EcWordStruct) ORZ.LJLLLL(words)) != null) {
                                    str = ecWordStruct.getWord();
                                } else {
                                    str = null;
                                }
                                z9n.LJIJI(str, aid);
                                z2 = true;
                            }
                            z = true;
                        }
                    }
                } else {
                    z = false;
                    z2 = false;
                }
                CommentService LJJL = CommentServiceImpl.LJJL();
                if (aweme.getStatus() != null && aweme.getStatus().getPrivateStatus() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (AV1.LJIJI(aweme.getAuthorUid()) || !z3 || AV1.LJIIZILJ(aweme.getAuthor(), AV1.LJIJI(aweme.getAuthorUid())) || LJJL.LJIILLIIL(aweme) || !LJJL.LJJIJIIJI(aweme) || bool.booleanValue() || a.LJIIIZ().LIZJ() || aweme.getEcFeedSuggestWordList() == null || !z || z2) {
                    return null;
                }
                int value2 = EnumC51280KAq.COMMENT_TOP_ANCHOR.getValue();
                String value3 = EnumC62182cI.RELATED.getValue();
                String value4 = KB5.SOURCE_COMMENT_TOP_ANCHOR_MIDDLE.getValue();
                return KBL.LIZ(context, new ECSearchEntranceData(value2, null, value3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, EnumC51289KAz.SOURCE_COMMENT_PRODUCT_ANCHOR.getValue(), value4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, EnumC51288KAy.SOURCE_COMMENT_TOP_ANCHOR.getValue(), KB7.CHANNEL_COMMENT_TOP_ANCHOR.getValue(), 0 == true ? 1 : 0, EnumC51287KAx.TYPE_COMMENT_TOP_ANCHOR.getValue(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 267714170, 0 == true ? 1 : 0), kek, interfaceC65784Pro, null);
            }
            if (((Boolean) C51423KGd.LIZ.getValue()).booleanValue()) {
                return null;
            }
            ECSearchEntranceData eCSearchEntranceData3 = new ECSearchEntranceData(EnumC51280KAq.VIDEO_ANCHOR.getValue(), KB6.SOURCE_ANCHOR.getValue(), "multi_anchor_search_entrance_type", null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, EnumC51289KAz.SOURCE_ANCHOR.getValue(), KB5.SOURCE_ANCHOR_MIDDLE.getValue(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, EnumC51288KAy.SOURCE_ANCHOR_PRODUCT.getValue(), KB7.CHANNEL_VIDEO_ANCHOR.getValue(), 0 == true ? 1 : 0, EnumC51287KAx.TYPE_ANCHOR.getValue(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 267705976, 0 == true ? 1 : 0);
            int i2 = C51286KAw.LIZIZ[((EnumC62182cI) C61322au.LIZ(eCSearchEntranceData3, eCSearchEntranceData3.getEnterViewType(), C61322au.LIZIZ)).ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    c018905p = new C018905p(-1, -2);
                    c018905p.setMarginStart(C17N.LJIILL(16.0d));
                    c018905p.setMarginEnd(C17N.LJIILL(16.0d));
                    ((ViewGroup.MarginLayoutParams) c018905p).height = C17N.LJIILL(32.0d);
                }
            } else {
                c018905p = new C018905p(-1, -2);
                c018905p.setMarginStart(C17N.LJIILL(12.0d));
                c018905p.setMarginEnd(C17N.LJIILL(12.0d));
                ((ViewGroup.MarginLayoutParams) c018905p).topMargin = C17N.LJIILL(7.0d);
                ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = C17N.LJIILL(7.0d);
            }
            return KBL.LIZ(context, eCSearchEntranceData3, kek, interfaceC65784Pro, c018905p);
        }
        if (((Boolean) C51423KGd.LIZ.getValue()).booleanValue()) {
            return null;
        }
        try {
            SettingsManager.LIZLLL().getClass();
            LIZ = Integer.valueOf(SettingsManager.LJ("ecommerce_pdp_search_entrance_except_live", 0));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        Integer num = (Integer) LIZ;
        if (num == null || num.intValue() != 1) {
            Activity[] activityStack = ActivityStack.getActivityStack();
            int length = activityStack.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (LiveOuterService.LJJJLL().LJIIZILJ(activityStack[i3]) && !activityStack[i3].isFinishing()) {
                    return null;
                }
            }
        }
        int i4 = C51286KAw.LIZ[kek.LJIJ.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    try {
                        FFL.LJIIIZ().getClass();
                        LIZ4 = Boolean.valueOf(FFL.LJ(31744, "us_pdp_search_icon", true, false));
                        C3C5.m7constructorimpl(LIZ4);
                    } catch (Throwable th2) {
                        LIZ4 = C141335gf.LIZ(th2);
                        C3C5.m7constructorimpl(LIZ4);
                    }
                    if (C3C5.m12isFailureimpl(LIZ4)) {
                        LIZ4 = null;
                    }
                    Boolean bool2 = (Boolean) LIZ4;
                    if (bool2 == null || !bool2.booleanValue()) {
                        return null;
                    }
                }
            } else {
                int LIZ5 = C2SG.LIZ();
                if (LIZ5 != 1 && LIZ5 != 2) {
                    return null;
                }
            }
        } else {
            int LIZ6 = C2SG.LIZ();
            if (LIZ6 != 1 && LIZ6 != 2) {
                return null;
            }
            try {
                FFL.LJIIIZ().getClass();
                LIZ2 = Boolean.valueOf(FFL.LJ(31744, "half_pdp_search_entrance", true, false));
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th3) {
                LIZ2 = C141335gf.LIZ(th3);
                C3C5.m7constructorimpl(LIZ2);
            }
            if (C3C5.m12isFailureimpl(LIZ2)) {
                LIZ2 = null;
            }
            Boolean bool3 = (Boolean) LIZ2;
            if (bool3 == null || !bool3.booleanValue()) {
                return null;
            }
        }
        int value5 = EnumC51280KAq.PDP.getValue();
        int i5 = C51286KAw.LIZ[kek.LJIJ.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    value = EnumC62182cI.SINGLE_SEARCH_BTN.getValue();
                } else {
                    throw new C162476Zf();
                }
            } else {
                value = EnumC62182cI.BLANK.getValue();
            }
        } else {
            value = EnumC62182cI.BUBBLE.getValue();
        }
        String value6 = KB6.SOURCE_PDP.getValue();
        String value7 = KB5.SOURCE_PDP_MIDDLE.getValue();
        ECSearchEntranceData eCSearchEntranceData4 = new ECSearchEntranceData(value5, value6, value, null, 0 == true ? 1 : 0, "ecommerce_pdp_search_entrance", "ec_search_pdp_guess_use_cache", EnumC51289KAz.SOURCE_PDP.getValue(), value7, 0 == true ? 1 : 0, "ec_search_pdp_guess_use_cache", 0 == true ? 1 : 0, 0 == true ? 1 : 0, z4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, EnumC51288KAy.SOURCE_PDP.getValue(), KB7.CHANNEL_PDP.getValue(), 0 == true ? 1 : 0, EnumC51287KAx.TYPE_PDP.getValue(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 267704856, 0 == true ? 1 : 0);
        try {
            FFL.LJIIIZ().getClass();
            LIZ3 = Boolean.valueOf(FFL.LJ(31744, "pdp_search_entrance_enhance", true, false));
            C3C5.m7constructorimpl(LIZ3);
        } catch (Throwable th4) {
            LIZ3 = C141335gf.LIZ(th4);
            C3C5.m7constructorimpl(LIZ3);
        }
        if (C3C5.m12isFailureimpl(LIZ3)) {
            LIZ3 = null;
        }
        Boolean bool4 = (Boolean) LIZ3;
        if (bool4 != null) {
            z5 = bool4.booleanValue();
        }
        kek.LJIJI = z5;
        if (!z5) {
            c018905p = new C018905p(-1, -2);
            ((ViewGroup.MarginLayoutParams) c018905p).topMargin = C17N.LJIILL(4.0d);
            ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = C17N.LJIILL(4.0d);
        }
        return KBL.LIZ(context, eCSearchEntranceData4, kek, interfaceC65784Pro, c018905p);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final boolean LJJJ(Context context, C208398Fv c208398Fv, EditText editText, ImageView imageView, AqS190S0100000_8 aqS190S0100000_8, AqS174S0100000_8 aqS174S0100000_8) {
        boolean z;
        int[] iArr;
        if (context != null && AnonymousClass636.LJIILJJIL(context)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iArr = new int[]{Color.argb(0, 46, 46, 46), Color.argb(184, 46, 46, 46), Color.argb(255, 46, 46, 46)};
        } else {
            iArr = new int[]{Color.argb(0, 241, 241, 242), Color.argb(184, 241, 241, 242), Color.argb(255, 241, 241, 242)};
        }
        return C208338Fp.LJ(context, c208398Fv, editText, imageView, iArr, false, aqS190S0100000_8, aqS174S0100000_8, 32);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService
    public final C51385KEr LJJI(long j, Context context, Aweme aweme, String str, String str2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        List<EcSuggestWordStruct> suggestWords;
        String str3;
        EcWordStruct ecWordStruct;
        String str4 = str;
        if (aweme == null) {
            return null;
        }
        String aid = aweme.getAid();
        EcFeedSuggestWordList ecFeedSuggestWordList = aweme.getEcFeedSuggestWordList();
        if (ecFeedSuggestWordList != null && (suggestWords = ecFeedSuggestWordList.getSuggestWords()) != null) {
            z3 = false;
            z4 = false;
            for (EcSuggestWordStruct ecSuggestWordStruct : suggestWords) {
                if (ecSuggestWordStruct != null && o.LJ("comment_top", ecSuggestWordStruct.getScene())) {
                    if (o.LJ("1", ecSuggestWordStruct.getQrecVirtualEnable())) {
                        Z9N z9n = Z9N.LIZIZ;
                        z9n.LLJJJ(aid, true);
                        List<EcWordStruct> words = ecSuggestWordStruct.getWords();
                        if (words != null && (ecWordStruct = (EcWordStruct) ORZ.LJLLLL(words)) != null) {
                            str3 = ecWordStruct.getWord();
                        } else {
                            str3 = null;
                        }
                        z9n.LJIJI(str3, aid);
                        z4 = true;
                    }
                    z3 = true;
                }
            }
        } else {
            z3 = false;
            z4 = false;
        }
        CommentService LJJL = CommentServiceImpl.LJJL();
        if (aweme.getStatus() != null && aweme.getStatus().getPrivateStatus() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (AV1.LJIJI(aweme.getAuthorUid()) || !z5 || AV1.LJIIZILJ(aweme.getAuthor(), AV1.LJIJI(aweme.getAuthorUid())) || LJJL.LJIILLIIL(aweme) || !LJJL.LJJIJIIJI(aweme) || z2 || a.LJIIIZ().LIZJ() || aweme.getEcFeedSuggestWordList() == null || !z3 || z4) {
            return null;
        }
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        if (str2 != null) {
            str5 = str2;
        }
        return new C51385KEr(context, aweme, str4, str5, z, j, null);
    }
}
