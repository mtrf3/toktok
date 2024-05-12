package com.ss.android.ugc.aweme.ecommerce.core.services;

import X.C00F;
import X.C10K;
import X.C113554cx;
import X.C18080nM;
import X.C18090nN;
import X.C19N;
import X.C1E4;
import X.C221108m2;
import X.C238629Yc;
import X.C238659Yf;
import X.C26550AbS;
import X.C26555AbX;
import X.C27206Am2;
import X.C27207Am3;
import X.C27531ArH;
import X.C27739Aud;
import X.C2Q7;
import X.C2SD;
import X.C2SE;
import X.C2TF;
import X.C2VO;
import X.C32I;
import X.C39468FeK;
import X.C43001GuD;
import X.C45804HyK;
import X.C47261Igj;
import X.C48658J7u;
import X.C58096Mr6;
import X.C5H3;
import X.C61232al;
import X.C61242am;
import X.C63081OpJ;
import X.C69757RZh;
import X.C69991RdT;
import X.C69995RdX;
import X.C70037ReD;
import X.C70101RfF;
import X.C70505Rll;
import X.C70510Rlq;
import X.C73338SqM;
import X.C73372uL;
import X.C73969T1h;
import X.C76800UCe;
import X.C77119UOl;
import X.C780334l;
import X.C78613UtF;
import X.C78866UxK;
import X.C78880UxY;
import X.C78926UyI;
import X.C78983UzD;
import X.C9JN;
import X.CallableC71286RyM;
import X.E94;
import X.E9D;
import X.EnumC26549AbR;
import X.EnumC28000Ayq;
import X.EnumC53633L3d;
import X.EnumC53634L3e;
import X.EnumC70569Rmn;
import X.FFL;
import X.InterfaceC43002GuE;
import X.InterfaceC64592gB;
import X.InterfaceC70070Rek;
import X.InterfaceC88472Yns;
import X.KMG;
import X.M2T;
import X.OQY;
import X.ORZ;
import X.OSZ;
import X.Q7K;
import X.R30;
import X.RXR;
import X.RXT;
import X.RXU;
import X.RYC;
import X.T16;
import X.X1D;
import X.XKX;
import Y.AfS64S0100000_12;
import Y.IDComparatorS40S0000000_12;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.wishlist.WishListFragment;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECMallLivePdpAccurateModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECSearchLivePdpAccurateModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECSettingConfig;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECSkuOptimizeForShopBagSwitchConfig;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EComPdpConfig;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcMainImageSizeOptSettings;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PrefetchSchemaConfig;
import com.ss.android.ugc.aweme.ecommerce.core.ab.SkuPrefetchConfig;
import com.ss.android.ugc.aweme.ecommerce.core.jsb.GetInfoByOCRMethodBullet;
import com.ss.android.ugc.aweme.ecommerce.core.jsb.GetSmsOtpMethodBullet;
import com.ss.android.ugc.aweme.ecommerce.core.jsb.IXLruCacheGetBulletMethod;
import com.ss.android.ugc.aweme.ecommerce.core.jsb.IXLruCacheSetBulletMethod;
import com.ss.android.ugc.aweme.ecommerce.core.jsb.PhoneCountryCodeTranslateMethodBullet;
import com.ss.android.ugc.aweme.ecommerce.core.jsb.PrefetchSchemaBulletMethod;
import com.ss.android.ugc.aweme.ecommerce.core.jsb.UpdateNonceMethodBullet;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomCartInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomCartLynxNetInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomGeckoUpdateInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomOutProductPipeInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomSchemaFallbackInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomSparkH5AdaptInterceptor;
import com.ss.android.ugc.aweme.ecommerce.core.router.SchemaFallbackConfig;
import com.ss.android.ugc.aweme.ecommerce.core.strategy.BizIdentity;
import com.ss.android.ugc.aweme.ecommerce.jsb.CloseTopWebViewBulletMethod;
import com.ss.android.ugc.aweme.ecommerce.jsb.OpenThirdPartyAppMethodBullet;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.ProductBaseEpt;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.SmartCheckIntegrateImpl;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.EcommerceInfo;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import defpackage.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes13.dex */
public final class ECommerceService implements IECommerceService {
    public String adPageFrom;
    public String adVideoTrackerId;
    public final EcomSchemaFallbackInterceptor fallbackInterceptor;
    public final C5H3 interceptors$delegate;
    public final List<IInterceptor> pipeInterceptors;

    public void cleanMarketDataCacheOldVersion() {
    }

    public void cleanShopMarketDataCache() {
    }

    public int getAutoImageSize(int i, EnumC70569Rmn imageScene) {
        o.LJIIIZ(imageScene, "imageScene");
        return i;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void onBootFinish() {
        if (C19N.LJ("ecom_template_region_settings", false)) {
            C27206Am2.LIZ = true;
            XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C27207Am3(null), 2);
        }
        SmartCheckIntegrateImpl.LIZJ().init();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void onEnterEcommerceLiveRoom(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
    }

    private final List<IInterceptor> getInterceptors() {
        return (List) this.interceptors$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public Map<String, Class<?>> getJSMethodClass() {
        return C113554cx.LJJL(new OSZ("phoneCountryCodeTranslate", PhoneCountryCodeTranslateMethodBullet.class), new OSZ("openThirdPartyApp", OpenThirdPartyAppMethodBullet.class), new OSZ("pipo.getInfoByOcr", GetInfoByOCRMethodBullet.class), new OSZ("pipo.updateNonce", UpdateNonceMethodBullet.class), new OSZ("prefetchSchema", PrefetchSchemaBulletMethod.class), new OSZ("closeTopWebView", CloseTopWebViewBulletMethod.class), new OSZ("webcast_i18n.lruCacheGet", IXLruCacheGetBulletMethod.class), new OSZ("webcast_i18n.lruCacheSet", IXLruCacheSetBulletMethod.class), new OSZ("getSmsOtp", GetSmsOtpMethodBullet.class));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public InterfaceC43002GuE inboxService() {
        return new C43001GuD();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public boolean isLiveCreatorBCToggleAvailable() {
        if (Q7K.LIZIZ("creator_bc_toggle", 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public boolean isLowLevelDevice() {
        C238659Yf.LIZ.getClass();
        return C238659Yf.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public boolean isMiddleLevelDevice() {
        C238659Yf.LIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("tiktok_device_score", 0) != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public C9JN orderCenterService() {
        return new C78880UxY();
    }

    public ECommerceService() {
        C10K.LIZJ(CallableC71286RyM.LJLIL);
        this.fallbackInterceptor = new EcomSchemaFallbackInterceptor();
        this.interceptors$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 519));
        List LJJIJIL = C47261Igj.LJJIJIL(new EcomOutProductPipeInterceptor(), new EcomCartLynxNetInterceptor(), EcomGeckoUpdateInterceptor.LJLIL, new EcomSparkH5AdaptInterceptor());
        if (C73372uL.LIZIZ) {
            LJJIJIL.add(new EcomCartInterceptor());
        }
        this.pipeInterceptors = ORZ.LLJI(LJJIJIL);
        this.adPageFrom = "";
        this.adVideoTrackerId = "";
    }

    public boolean enableVerticalSearchChunkRequest() {
        return C2SD.LIZ();
    }

    public boolean enableVerticalSearchNativeRequestAB() {
        if (C2SD.LIZ() || C2SE.LIZ()) {
            return true;
        }
        return false;
    }

    public boolean enableVerticalSearchRequestV4() {
        return C2SE.LIZ();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.2TF] */
    public C2TF getCommonResource() {
        EComPdpConfig LIZ = C2VO.LIZ();
        final String str = LIZ.couponPopupBg2xUrl;
        final String str2 = LIZ.couponPopupBg3xUrl;
        return new Object(str, str2) { // from class: X.2TF
            public final String LIZ;
            public final String LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2TF)) {
                    return false;
                }
                C2TF c2tf = (C2TF) obj;
                return o.LJ(this.LIZ, c2tf.LIZ) && o.LJ(this.LIZIZ, c2tf.LIZIZ);
            }

            public final int hashCode() {
                String str3 = this.LIZ;
                int hashCode = (str3 == null ? 0 : str3.hashCode()) * 31;
                String str4 = this.LIZIZ;
                return hashCode + (str4 != null ? str4.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("CommonResource(couponPopupBg2xUrl=");
                LIZ2.append(this.LIZ);
                LIZ2.append(", couponPopupBg3xUrl=");
                return q.LIZIZ(LIZ2, this.LIZIZ, ')', LIZ2);
            }

            {
                this.LIZ = str;
                this.LIZIZ = str2;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public List<IInterceptor> getECommerceRouterInterceptors() {
        return getInterceptors();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public List<IInterceptor> getEComPipeRouterInterceptors() {
        return this.pipeInterceptors;
    }

    public static IECommerceService createIECommerceServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IECommerceService.class, z);
        if (LIZ != null) {
            return (IECommerceService) LIZ;
        }
        if (C58096Mr6.R == null) {
            synchronized (IECommerceService.class) {
                if (C58096Mr6.R == null) {
                    C58096Mr6.R = new ECommerceService();
                }
            }
        }
        return C58096Mr6.R;
    }

    private final int getResizeImage(EnumC70569Rmn enumC70569Rmn) {
        EcMainImageSizeOptSettings.Size size;
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcMainImageSizeOptSettings.EcMainImageSizeOptSettingsModel ecMainImageSizeOptSettingsModel = EcMainImageSizeOptSettings.LIZ;
        EcMainImageSizeOptSettings.EcMainImageSizeOptSettingsModel ecMainImageSizeOptSettingsModel2 = (EcMainImageSizeOptSettings.EcMainImageSizeOptSettingsModel) LIZLLL.LJIIIIZZ("ec_main_image_size_opt_settings", EcMainImageSizeOptSettings.EcMainImageSizeOptSettingsModel.class, ecMainImageSizeOptSettingsModel);
        if (ecMainImageSizeOptSettingsModel2 != null) {
            ecMainImageSizeOptSettingsModel = ecMainImageSizeOptSettingsModel2;
        }
        if (C70510Rlq.LIZ[enumC70569Rmn.ordinal()] != 1 || (size = (EcMainImageSizeOptSettings.Size) ORZ.LJLLLLLL(0, ecMainImageSizeOptSettingsModel.pdpHead)) == null) {
            return 800;
        }
        return size.width;
    }

    private final HashMap<String, Object> getTrackParams(Uri uri) {
        HashMap<String, Object> LIZJ = C27739Aud.LIZJ(uri, "trackParams");
        if (LIZJ != null) {
            Map LJJLIL = C113554cx.LJJLIL(LIZJ);
            LJJLIL.remove("product_id");
            LJJLIL.remove("author_id");
            LIZJ.put("entrance_info", C27739Aud.LJI(LJJLIL));
            return LIZJ;
        }
        return null;
    }

    private final void prefetchSkuBatch(String str) {
        SkuPrefetchConfig skuPrefetchConfig;
        Boolean bool;
        IPdpStarter.PdpEnterParam schema2EnterParamForSku;
        List list;
        if (str == null || str.length() == 0) {
            return;
        }
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        ECSettingConfig eCSettingConfig = C2Q7.LIZ;
        ECSettingConfig eCSettingConfig2 = (ECSettingConfig) LIZLLL.LJIIIIZZ("ecom_settings_config", ECSettingConfig.class, eCSettingConfig);
        if (eCSettingConfig2 != null) {
            eCSettingConfig = eCSettingConfig2;
        }
        PrefetchSchemaConfig prefetchSchemaConfig = eCSettingConfig.prefetchSchema;
        if (prefetchSchemaConfig == null || (skuPrefetchConfig = prefetchSchemaConfig.skuPrefetch) == null || (bool = skuPrefetchConfig.enable) == null || !bool.booleanValue()) {
            return;
        }
        FFL LJIIIZ = FFL.LJIIIZ();
        ECSkuOptimizeForShopBagSwitchConfig eCSkuOptimizeForShopBagSwitchConfig = C70037ReD.LIZ;
        LJIIIZ.getClass();
        ECSkuOptimizeForShopBagSwitchConfig eCSkuOptimizeForShopBagSwitchConfig2 = (ECSkuOptimizeForShopBagSwitchConfig) FFL.LJIJ(true, "ec_sku_opt_for_shop_bag_switch", 31744, ECSkuOptimizeForShopBagSwitchConfig.class, eCSkuOptimizeForShopBagSwitchConfig);
        if (eCSkuOptimizeForShopBagSwitchConfig2 != null) {
            eCSkuOptimizeForShopBagSwitchConfig = eCSkuOptimizeForShopBagSwitchConfig2;
        }
        if (!eCSkuOptimizeForShopBagSwitchConfig.f20switch) {
            return;
        }
        Uri parse = UriProtector.parse(str);
        if (!o.LJ(parse.getHost(), "ec") || !o.LJ(parse.getPath(), "/sku") || (schema2EnterParamForSku = schema2EnterParamForSku(str)) == null) {
            return;
        }
        InterfaceC70070Rek.LJJLIIIJLJLI.getClass();
        C69995RdX.LJLILLLLZI.getClass();
        Object clone = schema2EnterParamForSku.getRequestParams().clone();
        o.LJII(clone, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
        IPdpStarter.PdpEnterParam copy$default = IPdpStarter.PdpEnterParam.copy$default(schema2EnterParamForSku, (HashMap) clone, null, null, null, false, null, 0.0f, null, false, false, false, null, null, null, null, null, null, null, 262142, null);
        copy$default.getRequestParams().put("template", "tt_sku_selection");
        Object obj = copy$default.getRequestParams().get("product_id");
        if ((obj instanceof List) && (list = (List) obj) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (Object obj2 : list) {
                HashMap<String, Object> requestParams = copy$default.getRequestParams();
                C70101RfF c70101RfF = IPdpStarter.LIZ;
                HashMap<String, Object> trackParams = schema2EnterParamForSku.getTrackParams();
                c70101RfF.getClass();
                requestParams.put("product_source_info", C113554cx.LJJJLZIJ(new OSZ(obj2, Integer.valueOf(C70101RfF.LIZ(trackParams)))));
                arrayList.add(C76800UCe.LIZ);
            }
        }
        C69995RdX.LLLLZ(copy$default);
        PageSourceInfo LIZJ = C39468FeK.LIZJ();
        if (LIZJ != null) {
            copy$default.getRequestParams().put("page_source_info", C27739Aud.LJI(LIZJ));
        }
        copy$default.getRequestParams().putAll(C69995RdX.LLLLZIL(schema2EnterParamForSku));
        new C73338SqM(((R30) C69995RdX.LJLJJL.getValue()).LIZ(copy$default).LJJL(T16.LIZ()).LJJJJJ(1L).LJJIJL(RYC.LJLIL).LJIJJ(new InterfaceC64592gB() { // from class: X.9El
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj3) {
            }
        }).LJIL(new InterfaceC64592gB() { // from class: X.9Em
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj3) {
            }
        }).LJJJJIZL()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(RXT.LJLIL, RXU.LJLIL);
    }

    private final IPdpStarter.PdpEnterParam schema2EnterParam(String str) {
        Uri parse = UriProtector.parse(str);
        IPdpStarter.PdpEnterParam pdpEnterParam = null;
        if (!o.LJ(parse.getHost(), "ec") || !o.LJ(parse.getPath(), "/pdp")) {
            return null;
        }
        try {
            HashMap<String, Object> LIZJ = C27739Aud.LIZJ(parse, "requestParams");
            if (LIZJ == null) {
                LIZJ = new HashMap<>();
            }
            pdpEnterParam = new IPdpStarter.PdpEnterParam(LIZJ, null, getTrackParams(parse), null, false, null, 0.0f, null, false, false, false, null, null, null, null, null, null, null, 262128, null);
            return pdpEnterParam;
        } catch (Exception unused) {
            return pdpEnterParam;
        }
    }

    private final IPdpStarter.PdpEnterParam schema2EnterParamForSku(String str) {
        Uri parse = UriProtector.parse(str);
        IPdpStarter.PdpEnterParam pdpEnterParam = null;
        if (!o.LJ(parse.getHost(), "ec") || !o.LJ(parse.getPath(), "/sku")) {
            return null;
        }
        try {
            HashMap<String, Object> LIZJ = C27739Aud.LIZJ(parse, "requestParams");
            if (LIZJ == null) {
                LIZJ = new HashMap<>();
            }
            pdpEnterParam = new IPdpStarter.PdpEnterParam(LIZJ, null, null, null, false, null, 0.0f, null, false, false, false, null, null, null, null, null, null, null, 262128, null);
            return pdpEnterParam;
        } catch (Exception unused) {
            return pdpEnterParam;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public String generateTrackId(Aweme aweme) {
        List<String> list;
        EcommerceInfo ecommerceInfo;
        o.LJIIIZ(aweme, "aweme");
        try {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            String str = null;
            if (awemeRawAd != null && (ecommerceInfo = awemeRawAd.getEcommerceInfo()) != null) {
                list = ecommerceInfo.getSpuList();
            } else {
                list = null;
            }
            if (list != null && !list.isEmpty()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(aweme.getRequestId());
                LIZ.append('_');
                LIZ.append(aweme.getAid());
                LIZ.append('_');
                LIZ.append((String) ListProtector.get(list, 0));
                LIZ.append('_');
                LIZ.append(System.currentTimeMillis());
                String LIZIZ = X1D.LIZIZ(LIZ);
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("enable_ec_mall_track_id_md5", true)) {
                    if (LIZIZ != null) {
                        str = C77119UOl.LJIIJJI(LIZIZ.getBytes());
                    }
                    if (str != null) {
                        LIZIZ = str;
                    }
                    this.adVideoTrackerId = LIZIZ;
                } else {
                    this.adVideoTrackerId = LIZIZ;
                }
                return LIZIZ;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public List<OSZ<Integer, String>> getPageTemplateList(String pageName) {
        o.LJIIIZ(pageName, "pageName");
        EnumC26549AbR[] values = EnumC26549AbR.values();
        ArrayList arrayList = new ArrayList();
        for (EnumC26549AbR enumC26549AbR : values) {
            if (o.LJ(enumC26549AbR.getPage(), pageName) || o.LJ(enumC26549AbR.getPage(), "*")) {
                arrayList.add(enumC26549AbR);
            }
        }
        List<EnumC26549AbR> LLILII = ORZ.LLILII(new IDComparatorS40S0000000_12(1), arrayList);
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(LLILII, 10));
        for (EnumC26549AbR enumC26549AbR2 : LLILII) {
            arrayList2.add(new OSZ(Integer.valueOf(enumC26549AbR2.getTemplate()), enumC26549AbR2.name()));
        }
        return arrayList2;
    }

    public boolean hintAutoImageSizeAB(float f) {
        boolean z;
        if (f <= 2.4f) {
            z = true;
        } else {
            z = false;
        }
        try {
            boolean isWeakNetwork = NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).isWeakNetwork();
            if (!z && !isWeakNetwork) {
                return false;
            }
            FFL.LJIIIZ().getClass();
            if (FFL.LJIIJ(31744, 0, "ec_main_image_size_opt_pdp_v2", true) == 1) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public boolean isECADVideo(Aweme aweme) {
        List<String> spuList;
        o.LJIIIZ(aweme, "aweme");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            return false;
        }
        String pageFrom = awemeRawAd.getPageFrom();
        if (pageFrom != null && pageFrom.length() > 0) {
            String pageFrom2 = awemeRawAd.getPageFrom();
            o.LJIIIIZZ(pageFrom2, "rawAd.pageFrom");
            this.adPageFrom = pageFrom2;
        }
        EcommerceInfo ecommerceInfo = awemeRawAd.getEcommerceInfo();
        if (ecommerceInfo == null || (spuList = ecommerceInfo.getSpuList()) == null || !(!spuList.isEmpty())) {
            return false;
        }
        return true;
    }

    public boolean isFallbackContainsUri(Uri uri) {
        o.LJIIIZ(uri, "uri");
        EcomSchemaFallbackInterceptor ecomSchemaFallbackInterceptor = this.fallbackInterceptor;
        ecomSchemaFallbackInterceptor.getClass();
        if (ecomSchemaFallbackInterceptor.LJLILLLLZI != null) {
            HashMap<String, SchemaFallbackConfig> hashMap = ecomSchemaFallbackInterceptor.LJLILLLLZI;
            if (hashMap != null) {
                return hashMap.containsKey(EcomSchemaFallbackInterceptor.LIZIZ(uri));
            }
            o.LJIJI("configMap");
            throw null;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public String prefetchPdpEnterLiveRoom(String autoRouteSchema) {
        o.LJIIIZ(autoRouteSchema, "autoRouteSchema");
        if (autoRouteSchema.length() == 0) {
            return autoRouteSchema;
        }
        Uri autoSchemaUri = UriProtector.parse(autoRouteSchema);
        o.LJIIIIZZ(autoSchemaUri, "autoSchemaUri");
        String LJJJJI = C78926UyI.LJJJJI(autoSchemaUri, "prefetch_scene");
        if (LJJJJI != null) {
            int hashCode = LJJJJI.hashCode();
            if (hashCode != -1472524243) {
                if (hashCode != 3343892) {
                    if (hashCode != 998835423 || !LJJJJI.equals("general_search")) {
                        return autoRouteSchema;
                    }
                    return getExtraSchema(autoSchemaUri, autoRouteSchema, "general_search");
                }
                if (!LJJJJI.equals("mall")) {
                    return autoRouteSchema;
                }
                FFL LJIIIZ = FFL.LJIIIZ();
                ECMallLivePdpAccurateModel eCMallLivePdpAccurateModel = C61232al.LIZ;
                LJIIIZ.getClass();
                ECMallLivePdpAccurateModel eCMallLivePdpAccurateModel2 = (ECMallLivePdpAccurateModel) FFL.LJIJ(true, "ec_mall_live_pdp_jump_accurate", 31744, ECMallLivePdpAccurateModel.class, eCMallLivePdpAccurateModel);
                if (eCMallLivePdpAccurateModel2 != null) {
                    eCMallLivePdpAccurateModel = eCMallLivePdpAccurateModel2;
                }
                int i = eCMallLivePdpAccurateModel.enable;
                if (i == EnumC53634L3e.Style1.getValue() || i == EnumC53634L3e.Style2.getValue()) {
                    return getExtraSchema(autoSchemaUri, autoRouteSchema, "mall");
                }
                return getDefaultSchema(autoSchemaUri, autoRouteSchema);
            }
            if (!LJJJJI.equals("search_vertical")) {
                return autoRouteSchema;
            }
            FFL LJIIIZ2 = FFL.LJIIIZ();
            ECSearchLivePdpAccurateModel eCSearchLivePdpAccurateModel = C61242am.LIZ;
            LJIIIZ2.getClass();
            ECSearchLivePdpAccurateModel eCSearchLivePdpAccurateModel2 = (ECSearchLivePdpAccurateModel) FFL.LJIJ(true, "ec_search_live_pdp_jump_accurate", 31744, ECSearchLivePdpAccurateModel.class, eCSearchLivePdpAccurateModel);
            if (eCSearchLivePdpAccurateModel2 != null) {
                eCSearchLivePdpAccurateModel = eCSearchLivePdpAccurateModel2;
            }
            int i2 = eCSearchLivePdpAccurateModel.enable;
            if (i2 == EnumC53633L3d.STYLE1.getValue() || i2 == EnumC53633L3d.STYLE2.getValue()) {
                return getExtraSchema(autoSchemaUri, autoRouteSchema, "search_vertical");
            }
            return getDefaultSchema(autoSchemaUri, autoRouteSchema);
        }
        return autoRouteSchema;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void setCurrentRoomId(Long l) {
        IPdpStarter.LIZ.getClass();
        C70101RfF.LIZIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void setIsDeeplinkOpenECMallSearchFlag(boolean z) {
        Map<String, String> map;
        String str;
        if (E9D.LIZ().pageSourceEnable == 1) {
            C18080nM.LIZ.getClass();
            C18090nN c18090nN = C18080nM.LIZJ;
            if (c18090nN != null && c18090nN.LJJIL == null && c18090nN != null) {
                c18090nN.LJJIL = new LinkedHashMap();
            }
            C18090nN c18090nN2 = C18080nM.LIZJ;
            if (c18090nN2 != null && (map = c18090nN2.LJJIL) != null) {
                if (z) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("ec_is_deeplink_ec_mall_search", str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void setSearchResultTabNameFlag(String tabName) {
        Map<String, String> map;
        o.LJIIIZ(tabName, "tabName");
        if (E9D.LIZ().pageSourceEnable == 1) {
            C18080nM.LIZ.getClass();
            C18090nN c18090nN = C18080nM.LIZJ;
            if (c18090nN != null && c18090nN.LJJIL == null && c18090nN != null) {
                c18090nN.LJJIL = new LinkedHashMap();
            }
            C18090nN c18090nN2 = C18080nM.LIZJ;
            if (c18090nN2 != null && (map = c18090nN2.LJJIL) != null) {
                map.put("ec_search_tab_name", tabName);
            }
        }
    }

    public void updateFallbackConfig(Map<String, String> configMap) {
        o.LJIIIZ(configMap, "configMap");
        HashMap<String, SchemaFallbackConfig> hashMap = new HashMap<>();
        for (Map.Entry<String, String> entry : configMap.entrySet()) {
            hashMap.put(entry.getKey(), new SchemaFallbackConfig(entry.getKey(), entry.getValue()));
        }
        EcomSchemaFallbackInterceptor ecomSchemaFallbackInterceptor = this.fallbackInterceptor;
        ecomSchemaFallbackInterceptor.getClass();
        ecomSchemaFallbackInterceptor.LJLILLLLZI = hashMap;
    }

    /* loaded from: classes9.dex */
    public static final class WishListFragmentData extends PowerViewPagerFragmentItem<WishListFragment> {
        public static final Parcelable.Creator<WishListFragmentData> CREATOR = new KMG();
        public final String location;
        public final String previousPage;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeString(this.location);
            out.writeString(this.previousPage);
        }

        public WishListFragmentData(String str, String str2) {
            this.location = str;
            this.previousPage = str2;
        }
    }

    private final String getDefaultSchema(Uri uri, String str) {
        String str2;
        Uri.Builder appendQueryParameter;
        Uri build;
        try {
            Uri.Builder buildUpon = uri.buildUpon();
            if (buildUpon != null && (appendQueryParameter = buildUpon.appendQueryParameter("click_scene_start_time", String.valueOf(SystemClock.elapsedRealtime()))) != null && (build = appendQueryParameter.build()) != null) {
                str2 = build.toString();
                if (str2 != null) {
                    return str2;
                }
            }
            str2 = "";
            return str2;
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            return str;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void appendAdTrackParam(Aweme aweme, Uri.Builder builder) {
        EcommerceInfo ecommerceInfo;
        List<String> spuList;
        String str;
        List<String> spuList2;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(builder, "builder");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (ecommerceInfo = awemeRawAd.getEcommerceInfo()) != null && (spuList = ecommerceInfo.getSpuList()) != null && spuList.size() == 1) {
            JSONObject jSONObject = new JSONObject();
            try {
                EcommerceInfo ecommerceInfo2 = awemeRawAd.getEcommerceInfo();
                if (ecommerceInfo2 != null && (spuList2 = ecommerceInfo2.getSpuList()) != null) {
                    str = (String) ListProtector.get(spuList2, 0);
                } else {
                    str = null;
                }
                jSONObject.put("group_id", aweme.getAid());
                if (awemeRawAd.getAdId() != null) {
                    Long adId = awemeRawAd.getAdId();
                    o.LJIIIIZZ(adId, "rawAd.adId");
                    jSONObject.put("ad_id", adId.longValue());
                }
                jSONObject.put("product_id", str);
                jSONObject.put("track_id", this.adVideoTrackerId);
                builder.appendQueryParameter("trackParams", jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public Fragment createWishListFragment(String str, String str2) {
        WishListFragment wishListFragment = new WishListFragment();
        wishListFragment.LJLIL = str;
        wishListFragment.LJLILLLLZI = str2;
        return wishListFragment;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public WishListFragmentData createWishListFragmentData(String str, String str2) {
        return new WishListFragmentData(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public String generateAdLynxLogExtra(Aweme aweme, String trackId) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(trackId, "trackId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("group_id", aweme.getAid());
            jSONObject.put("author_id", aweme.getAuthorUid());
            int i = 0;
            if (o.LJ(aweme.getAuthorUid(), BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID())) {
                i = 1;
            }
            jSONObject.put("is_self", i);
            jSONObject.put("enter_from", this.adPageFrom);
            jSONObject.put("follow_status", aweme.getFollowStatus());
            jSONObject.put("track_id", trackId);
        } catch (Exception unused) {
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
        return jSONObject2;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public String generateAdLynxLogExtraAll(Aweme aweme, String trackId) {
        boolean z;
        String str;
        int i;
        int i2;
        boolean z2;
        String str2;
        String str3;
        String nativeSiteCustomData;
        String nativeSiteCustomData2;
        List<String> spuList;
        EcommerceInfo ecommerceInfo;
        List<String> spuList2;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(trackId, "trackId");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        boolean z3 = true;
        if (awemeRawAd != null && (ecommerceInfo = awemeRawAd.getEcommerceInfo()) != null && (spuList2 = ecommerceInfo.getSpuList()) != null && spuList2.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            EcommerceInfo ecommerceInfo2 = awemeRawAd.getEcommerceInfo();
            if (ecommerceInfo2 != null && (spuList = ecommerceInfo2.getSpuList()) != null) {
                str = (String) ListProtector.get(spuList, 0);
            } else {
                str = null;
            }
            jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            jSONObject.put("group_id", aweme.getAid());
            jSONObject.put("author_id", aweme.getAuthorUid());
            if (aweme.isAd()) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_ad", i);
            if (awemeRawAd.getCreativeId() != null) {
                Long creativeId = awemeRawAd.getCreativeId();
                o.LJIIIIZZ(creativeId, "rawAd.creativeId");
                jSONObject.put("creative_id", creativeId.longValue());
            }
            if (awemeRawAd.getAdId() != null) {
                Long adId = awemeRawAd.getAdId();
                o.LJIIIIZZ(adId, "rawAd.adId");
                jSONObject.put("ad_id", adId.longValue());
            }
            jSONObject.put("track_id", trackId);
            jSONObject.put("item_order", 1);
            jSONObject.put("request_id", aweme.getRequestId());
            jSONObject.put("product_id", str);
            if (o.LJ(aweme.getAuthorUid(), BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID())) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_self", i2);
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null && (nativeSiteCustomData2 = awemeRawAd2.getNativeSiteCustomData()) != null && s.LJJJLZIJ(nativeSiteCustomData2, "shopType", false)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                if (awemeRawAd3 == null || (nativeSiteCustomData = awemeRawAd3.getNativeSiteCustomData()) == null || !s.LJJJLZIJ(nativeSiteCustomData, "\"shopType\":2", false)) {
                    z3 = false;
                }
                if (z3) {
                    str3 = "100";
                } else {
                    str3 = "5";
                }
                jSONObject.put("product_source", str3);
            }
            jSONObject.put("enter_from", this.adPageFrom);
            jSONObject.put("source_page_type", "video");
            jSONObject.put("page_name", "video");
            if (aweme.getAwemeType() == 101) {
                str2 = "live";
            } else {
                str2 = "ad_video_entrance";
            }
            jSONObject.put("entrance_form", str2);
            jSONObject.put("click_area", "finish");
            jSONObject.put("follow_status", aweme.getFollowStatus());
        } catch (Exception unused) {
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "jsonObject.toString()");
        return jSONObject2;
    }

    public String getAutoImageSizeUrl(String originUrl, EnumC70569Rmn imageScene) {
        o.LJIIIZ(originUrl, "originUrl");
        o.LJIIIZ(imageScene, "imageScene");
        if (imageScene == EnumC70569Rmn.PDP_HEADER) {
            if (C00F.LIZ(31744, 0, "ec_main_image_size_opt_pdp_v2", true) == 1) {
                int resizeImage = getResizeImage(imageScene);
                return C1E4.LJJIIJZLJL(resizeImage, resizeImage, originUrl);
            }
            return originUrl;
        }
        return originUrl;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void postEvent(String eventName, JSONObject jsonObject) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(jsonObject, "jsonObject");
        C48658J7u.LIZIZ(eventName, jsonObject);
    }

    public void preLinkPdp(String schema, Context context) {
        Activity LJIJJ;
        o.LJIIIZ(schema, "schema");
        IPdpStarter.PdpEnterParam schema2EnterParam = schema2EnterParam(schema);
        if (schema2EnterParam != null) {
            InterfaceC70070Rek.LJJLIIIJLJLI.getClass();
            C69995RdX c69995RdX = C69995RdX.LJLILLLLZI;
            c69995RdX.getClass();
            if (SystemClock.elapsedRealtime() - C69995RdX.LJLJJLL > LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
                C69991RdT.LIZ(c69995RdX, schema2EnterParam, false, 1, false, null, null, 48);
            }
            if (!schema2EnterParam.isPromotionPage() && !schema2EnterParam.getFullScreen() && context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
                C27531ArH.LIZIZ(LJIJJ, schema2EnterParam.getBizType());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void prefetchPdp(String schema, Context context) {
        o.LJIIIZ(schema, "schema");
        prefetchPdp(schema, context, 1, null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void prefetchSchema(String str, Context context) {
        String path;
        if (str == null || str.length() == 0) {
            return;
        }
        Uri parse = UriProtector.parse(str);
        if (o.LJ(parse.getHost(), "ec") && (path = parse.getPath()) != null) {
            int hashCode = path.hashCode();
            if (hashCode != 1511021) {
                if (hashCode != 1514126 || !path.equals("/sku")) {
                    return;
                }
                prefetchSkuBatch(str);
                return;
            }
            if (!path.equals("/pdp")) {
                return;
            }
            prefetchPdp(str, context, 3, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void reportVerticalSearchApiLog(String eventName, JSONObject param) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(param, "param");
        param.put("page_name", "shop_search_result");
        C48658J7u.LIZIZ(eventName, param);
    }

    private final String getExtraSchema(Uri uri, String str, String str2) {
        String str3;
        Uri.Builder buildUpon;
        Uri.Builder appendQueryParameter;
        Uri.Builder appendQueryParameter2;
        Uri.Builder appendQueryParameter3;
        Uri.Builder appendQueryParameter4;
        Uri build;
        try {
            HashMap<String, Object> LIZJ = C27739Aud.LIZJ(uri, "requestParams");
            if (LIZJ == null) {
                LIZJ = new HashMap<>();
            }
            HashMap<String, Object> LIZJ2 = C27739Aud.LIZJ(uri, "trackParams");
            if (LIZJ2 == null) {
                LIZJ2 = new HashMap<>();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("isPrefetchScene", "1");
            hashMap.put("prefetchScene", str2);
            LIZJ2.put("traffic_source_list", new JSONArray(M2T.LJI(uri)));
            InterfaceC70070Rek.LJJLIIIJLJLI.getClass();
            C69991RdT.LIZ(C69995RdX.LJLILLLLZI, new IPdpStarter.PdpEnterParam(LIZJ, null, LIZJ2, null, false, null, 0.0f, null, false, false, false, null, null, hashMap, null, null, null, null, 253946, null), false, 4, false, null, null, 48);
            buildUpon = uri.buildUpon();
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            str3 = str;
        }
        if (buildUpon != null && (appendQueryParameter = buildUpon.appendQueryParameter("autoSchema", "1")) != null && (appendQueryParameter2 = appendQueryParameter.appendQueryParameter("click_scene_start_time", String.valueOf(SystemClock.elapsedRealtime()))) != null && (appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("prefetchScene", str2)) != null && (appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("isScenePrefetch", "1")) != null && (build = appendQueryParameter4.build()) != null) {
            str3 = build.toString();
            if (str3 != null) {
                o.LJIIIIZZ(str3, "try {\n            val re…autoRouteSchema\n        }");
                return str3;
            }
        }
        str3 = "";
        o.LJIIIIZZ(str3, "try {\n            val re…autoRouteSchema\n        }");
        return str3;
    }

    public int getPageTemplate(Integer num, String pageName, String str) {
        o.LJIIIZ(pageName, "pageName");
        return C27206Am2.LJ(C78866UxK.LJJZZIII(num), pageName, str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public String modifySchemaOfNotice(String schema, String str, String str2) {
        o.LJIIIZ(schema, "schema");
        E94 LLL = C63081OpJ.LLL(schema);
        if (str2 == null) {
            str2 = "notification_page";
        }
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_from", str2), new OSZ("start_click_time", String.valueOf(System.currentTimeMillis())));
        if (str != null) {
            LJJLIIIIJ.put("previous_page", str);
        }
        LLL.LJII(3, LJJLIIIIJ);
        LLL.LJI(2, "enter_from_info", str2);
        Map LJJLIIIIJ2 = C113554cx.LJJLIIIIJ(new OSZ("enter_from_info", str2), new OSZ("enter_from", str2));
        if (str != null) {
            LJJLIIIIJ2.put("previous_page", str);
        }
        LLL.LJFF(2, 2, LJJLIIIIJ2);
        return LLL.LIZ();
    }

    public Set<String> getPagesStrategyService(Integer num, String str, String str2, String str3) {
        EnumC28000Ayq LJJZZIII = C78866UxK.LJJZZIII(num);
        if (str == null) {
            return OQY.INSTANCE;
        }
        int LJ = C27206Am2.LJ(LJJZZIII, str, null);
        EnumC26549AbR.Companion.getClass();
        C26555AbX bizEnv = C26550AbS.LIZ(LJ, "product_detail").getBizEnv();
        if (str3 == null) {
            str3 = "";
        }
        bizEnv.getClass();
        BizIdentity bizIdentity = new BizIdentity(str3, bizEnv.LIZ, bizEnv.LIZIZ);
        HashSet hashSet = new HashSet();
        C69757RZh.LIZ.forEach(new C70505Rll(bizIdentity, hashSet));
        return hashSet;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void prefetchPdp(String schema, Context context, int i, InterfaceC88472Yns<? super ProductBaseEpt, C76800UCe> interfaceC88472Yns) {
        IPdpStarter.PdpEnterParam schema2EnterParam;
        Activity LJIJJ;
        o.LJIIIZ(schema, "schema");
        Uri parse = UriProtector.parse(schema);
        if (o.LJ(parse.getHost(), "ec") && o.LJ(parse.getPath(), "/pdp") && o.LJ(parse.getPath(), "/pdp") && (schema2EnterParam = schema2EnterParam(schema)) != null) {
            InterfaceC70070Rek.LJJLIIIJLJLI.getClass();
            C69991RdT.LIZ(C69995RdX.LJLILLLLZI, schema2EnterParam, false, i, false, null, null, 48).LIZJ.LJJJLIIL(new AfS64S0100000_12((InterfaceC88472Yns) interfaceC88472Yns, 25), RXR.LJLIL);
            if (!schema2EnterParam.isPromotionPage() && !schema2EnterParam.getFullScreen() && context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
                C27531ArH.LIZIZ(LJIJJ, schema2EnterParam.getBizType());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void reportAdVideoLog(Aweme aweme, boolean z, int i, String trackId) {
        EcommerceInfo ecommerceInfo;
        List<String> spuList;
        String str;
        int i2;
        String str2;
        String str3;
        String str4;
        String nativeSiteCustomData;
        boolean z2;
        boolean z3;
        String nativeSiteCustomData2;
        String nativeSiteCustomData3;
        List<String> spuList2;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(trackId, "trackId");
        try {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (ecommerceInfo = awemeRawAd.getEcommerceInfo()) != null && (spuList = ecommerceInfo.getSpuList()) != null && spuList.size() == 1) {
                EcommerceInfo ecommerceInfo2 = awemeRawAd.getEcommerceInfo();
                String str5 = null;
                if (ecommerceInfo2 != null && (spuList2 = ecommerceInfo2.getSpuList()) != null) {
                    str = (String) ListProtector.get(spuList2, 0);
                } else {
                    str = null;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
                jSONObject.put("group_id", aweme.getAid());
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null && (nativeSiteCustomData = awemeRawAd2.getNativeSiteCustomData()) != null && s.LJJJLZIJ(nativeSiteCustomData, "shopType", false)) {
                    AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                    if (awemeRawAd3 != null && (nativeSiteCustomData3 = awemeRawAd3.getNativeSiteCustomData()) != null && s.LJJJLZIJ(nativeSiteCustomData3, "\"shopType\":2", false)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                    if (awemeRawAd4 == null || (nativeSiteCustomData2 = awemeRawAd4.getNativeSiteCustomData()) == null || !s.LJJJLZIJ(nativeSiteCustomData2, "\"shopType\":1", false)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z2) {
                        str5 = "100";
                    }
                    if (!z3) {
                        if (str5 != null) {
                        }
                    } else {
                        str5 = "5";
                    }
                    jSONObject.put("product_source", str5);
                }
                jSONObject.put("author_id", aweme.getAuthorUid());
                if (aweme.isAd()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                jSONObject.put("is_ad", i2);
                if (awemeRawAd.getCreativeId() != null) {
                    Long creativeId = awemeRawAd.getCreativeId();
                    o.LJIIIIZZ(creativeId, "rawAd.creativeId");
                    jSONObject.put("creative_id", creativeId.longValue());
                }
                if (awemeRawAd.getAdId() != null) {
                    Long adId = awemeRawAd.getAdId();
                    o.LJIIIIZZ(adId, "rawAd.adId");
                    jSONObject.put("ad_id", adId.longValue());
                }
                jSONObject.put("track_id", trackId);
                jSONObject.put("item_order", 1);
                jSONObject.put("request_id", aweme.getRequestId());
                jSONObject.put("product_id", str);
                jSONObject.put("is_self", o.LJ(aweme.getAuthorUid(), BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()) ? 1 : 0);
                jSONObject.put("enter_from", this.adPageFrom);
                jSONObject.put("source_page_type", "video");
                jSONObject.put("page_name", "video");
                if (aweme.getAwemeType() == 101) {
                    str2 = "live";
                } else {
                    str2 = "ad_video_entrance";
                }
                jSONObject.put("entrance_form", str2);
                if (!z) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                str4 = "finish";
                            } else {
                                str4 = "other";
                            }
                        } else {
                            str4 = "button";
                        }
                    } else {
                        str4 = "title";
                    }
                    jSONObject.put("click_area", str4);
                }
                jSONObject.put("follow_status", aweme.getFollowStatus());
                if (!z) {
                    str3 = "tiktokec_product_click";
                } else {
                    str3 = "tiktokec_product_show";
                }
                C48658J7u.LIZIZ(str3, jSONObject);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public void doNewCartAnimation(Context context, LifecycleCoroutineScope lifecycleCoroutineScope, String str, boolean z, View view, ViewGroup viewGroup, ViewGroup viewGroup2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        C238629Yc.LIZIZ(context, lifecycleCoroutineScope, str, z, 0, view, viewGroup, viewGroup2, interfaceC88472Yns);
    }
}
