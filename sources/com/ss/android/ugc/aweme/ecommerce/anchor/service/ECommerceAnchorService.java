package com.ss.android.ugc.aweme.ecommerce.anchor.service;

import X.C00F;
import X.C113554cx;
import X.C16880lQ;
import X.C188727au;
import X.C27739Aud;
import X.C45804HyK;
import X.C53609L2f;
import X.C58096Mr6;
import X.C66832jn;
import X.C70084Rey;
import X.C71357RzV;
import X.C71359RzX;
import X.C71360RzY;
import X.C71361RzZ;
import X.C71362Rza;
import X.C71365Rzd;
import X.C71370Rzi;
import X.C71387Rzz;
import X.C76542zS;
import X.C76800UCe;
import X.EnumC53638L3i;
import X.FFL;
import X.LCW;
import X.ORZ;
import X.OSZ;
import X.Q7K;
import X.S0P;
import X.S0X;
import X.X1D;
import Y.ARunnableS40S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.g;
import com.google.gson.internal.b;
import com.google.gson.m;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategoryFuncSetting;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategorySetting;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorFetchListTask;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.model.PanelOpenInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo;
import com.ss.android.ugc.aweme.ecommerce.service.AnchorPdpPreloadModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS2S3000000_12;
import kotlin.jvm.internal.AqS57S1200000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ECommerceAnchorService implements IECommerceAnchorService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final String LJIIL() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcStickerCategoryFuncSetting.EcStickerCategoryFuncConfig ecStickerCategoryFuncConfig = EcStickerCategoryFuncSetting.LIZ;
        EcStickerCategoryFuncSetting.EcStickerCategoryFuncConfig ecStickerCategoryFuncConfig2 = (EcStickerCategoryFuncSetting.EcStickerCategoryFuncConfig) LIZLLL.LJIIIIZZ("ecom_sticker_category_config", EcStickerCategoryFuncSetting.EcStickerCategoryFuncConfig.class, ecStickerCategoryFuncConfig);
        if (ecStickerCategoryFuncConfig2 != null) {
            ecStickerCategoryFuncConfig = ecStickerCategoryFuncConfig2;
        }
        return (String) ORZ.LJLLLL(ecStickerCategoryFuncConfig.categoryKeyList);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final AnchorPdpPreloadModel LJJIII() {
        if (NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).isWeakNetwork()) {
            return null;
        }
        FFL LJIIIZ = FFL.LJIIIZ();
        AnchorPdpPreloadModel anchorPdpPreloadModel = C70084Rey.LIZ;
        LJIIIZ.getClass();
        AnchorPdpPreloadModel anchorPdpPreloadModel2 = (AnchorPdpPreloadModel) FFL.LJIJ(true, "ec_anchor_pdp_preload_opt_android", 31744, AnchorPdpPreloadModel.class, anchorPdpPreloadModel);
        if (anchorPdpPreloadModel2 == null) {
            return anchorPdpPreloadModel;
        }
        return anchorPdpPreloadModel2;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJIIZI() {
        try {
            FFL.LJIIIZ().getClass();
            return FFL.LJ(31744, "ec_enable_auto_check_accurate", true, false);
        } catch (Exception unused) {
            return false;
        }
    }

    public static IECommerceAnchorService LJJJJI() {
        Object LIZ = C58096Mr6.LIZ(IECommerceAnchorService.class, false);
        if (LIZ != null) {
            return (IECommerceAnchorService) LIZ;
        }
        return new ECommerceAnchorService();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final S0P LIZ() {
        return new S0P();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LIZLLL() {
        if (C71365Rzd.LJZ || PdpFragment.LLIIJLIL || ECommerceAnchorPanelFragment.LLIIL) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final int LJII() {
        return Q7K.LIZIZ("ec_toggle_style", 0);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final C71387Rzz LJIIIZ() {
        return new C71387Rzz();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final AnchorFetchListTask LJIJJLI() {
        return new AnchorFetchListTask();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJ() {
        if (Q7K.LIZIZ("ec_toggle_style", 0) != 2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
    
        if (r0.enableCategory != false) goto L13;
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJI() {
        /*
            r5 = this;
            X.RzZ r0 = X.C71361RzZ.LIZ
            r0.getClass()
            boolean r0 = X.C71361RzZ.LJIIIZ()
            if (r0 != 0) goto L58
        Lc:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "ecom_sticker_category_should_anchor_"
            r1.append(r0)
            r0 = 0
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = com.ss.android.ugc.aweme.services.BaseUserService.createIUserServicebyMonsterPlugin(r0)
            java.lang.String r0 = r0.getCurrentUserID()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C71370Rzi.LJIIJ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L89
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L89
            X.FFL r0 = X.FFL.LJIIIZ()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategorySetting$EcStickerCategoryConfig> r4 = com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategorySetting.EcStickerCategoryConfig.class
            com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategorySetting$EcStickerCategoryConfig r3 = com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategorySetting.LIZ
            r0.getClass()
            java.lang.String r2 = "ecom_sticker_category"
            r1 = 31744(0x7c00, float:4.4483E-41)
            r0 = 1
            java.lang.Object r0 = X.FFL.LJIJ(r0, r2, r1, r4, r3)
            com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategorySetting$EcStickerCategoryConfig r0 = (com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategorySetting.EcStickerCategoryConfig) r0
            if (r0 == 0) goto L89
            boolean r0 = r0.enableCategory
            if (r0 == 0) goto L89
        L58:
        L59:
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategoryFuncSetting$EcStickerCategoryFuncConfig> r0 = com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategoryFuncSetting.EcStickerCategoryFuncConfig.class
            com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategoryFuncSetting$EcStickerCategoryFuncConfig r3 = com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategoryFuncSetting.LIZ
            java.lang.String r2 = "ecom_sticker_category_config"
            java.lang.Object r0 = r1.LJIIIIZZ(r2, r0, r3)
            com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategoryFuncSetting$EcStickerCategoryFuncConfig r0 = (com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategoryFuncSetting.EcStickerCategoryFuncConfig) r0
            if (r0 != 0) goto L6c
            r0 = r3
        L6c:
            boolean r0 = r0.forceHide
            if (r0 != 0) goto L89
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategoryFuncSetting$EcStickerCategoryFuncConfig> r0 = com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategoryFuncSetting.EcStickerCategoryFuncConfig.class
            java.lang.Object r0 = r1.LJIIIIZZ(r2, r0, r3)
            com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategoryFuncSetting$EcStickerCategoryFuncConfig r0 = (com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategoryFuncSetting.EcStickerCategoryFuncConfig) r0
            if (r0 != 0) goto L87
        L7e:
            java.util.List<java.lang.String> r0 = r3.categoryKeyList
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            java.lang.String r0 = (java.lang.String) r0
        L86:
            return r0
        L87:
            r3 = r0
            goto L7e
        L89:
            r0 = 0
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService.LJJI():java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJII() {
        C71361RzZ.LIZ.getClass();
        return C71361RzZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final C71362Rza LJJIJ() {
        return new C71362Rza();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJIJIIJI() {
        return e1.LIZ(31744, "ecom_multianchor_panel_shopcart_position", true, false);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJIJIL() {
        if (Q7K.LIZIZ("ec_toggle_style", 0) != 1 && Q7K.LIZIZ("ec_toggle_style", 0) != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final int LJJIJL() {
        return C00F.LIZ(31744, 0, "ec_video_publish_add_anchor_force_single", true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final int LJIJJ() {
        return C71357RzV.LIZ().lowImageSize;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final int LJJJJ() {
        return C71357RzV.LIZ().middleImageSize;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final Map<String, Object> LIZJ(Aweme aweme) {
        int i;
        C71361RzZ.LIZ.getClass();
        if (aweme == null) {
            return null;
        }
        C53609L2f LJIL = C71361RzZ.LJIL(aweme);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer num = LJIL.LIZ;
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        linkedHashMap.put("is_ecom", Integer.valueOf(i));
        Integer num2 = LJIL.LIZIZ;
        if (num2 != null) {
            i2 = num2.intValue();
        }
        linkedHashMap.put("ec_product_cnt", Integer.valueOf(i2));
        String str = LJIL.LIZJ;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("ecom_product_list", str);
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJFF(Aweme aweme) {
        C71361RzZ.LIZ.getClass();
        if (!C71361RzZ.LJJJJI(aweme)) {
            return false;
        }
        if (Q7K.LIZIZ("ec_toggle_style", 0) != 1 && Q7K.LIZIZ("ec_toggle_style", 0) != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJIIIIZZ(Aweme aweme) {
        C71361RzZ.LIZ.getClass();
        return C71361RzZ.LJJJJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJIILIIL(ProductListModel productListModel) {
        Map<String, ProductListModel> map = C71370Rzi.LJII;
        if (map.size() > 3) {
            ((LinkedHashMap) map).clear();
        }
        map.put("ec_ug_vsa_plp_cache", productListModel);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJIFFI(Aweme aweme) {
        C71361RzZ.LIZ.getClass();
        if (!C71361RzZ.LJJJJI(aweme) || Q7K.LIZIZ("ec_toggle_style", 0) != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final boolean LJJJ(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        C71361RzZ.LIZ.getClass();
        if (aweme == null || (anchors = aweme.getAnchors()) == null) {
            return false;
        }
        for (AnchorCommonStruct anchorCommonStruct : anchors) {
            if (anchorCommonStruct.getType() == 35 || anchorCommonStruct.getType() == 6 || anchorCommonStruct.getType() == 33) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJJIL(String str) {
        C76542zS.LIZJ("tiktokec_toast_show", new AqS2S3000000_12(str, 1));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LIZIZ(Bundle bundle, Aweme aweme) {
        int i;
        C71361RzZ.LIZ.getClass();
        if (aweme == null) {
            return;
        }
        C53609L2f LJIL = C71361RzZ.LJIL(aweme);
        if (bundle == null) {
            return;
        }
        Integer num = LJIL.LIZ;
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        bundle.putInt("is_ecom", i);
        Integer num2 = LJIL.LIZIZ;
        if (num2 != null) {
            i2 = num2.intValue();
        }
        bundle.putInt("ec_product_cnt", i2);
        String str = LJIL.LIZJ;
        if (str == null) {
            str = "";
        }
        bundle.putString("ecom_product_list", str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJ(C188727au c188727au, Aweme aweme) {
        int i;
        C71361RzZ.LIZ.getClass();
        if (aweme == null) {
            return;
        }
        C53609L2f LJIL = C71361RzZ.LJIL(aweme);
        Integer num = LJIL.LIZ;
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        c188727au.LJI("is_ecom", String.valueOf(i));
        Integer num2 = LJIL.LIZIZ;
        if (num2 != null) {
            i2 = num2.intValue();
        }
        c188727au.LJI("ec_product_cnt", String.valueOf(i2));
        String str = LJIL.LIZJ;
        if (str == null) {
            str = "";
        }
        c188727au.LJI("ecom_product_list", str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final String LJI(Aweme aweme, boolean z) {
        o.LJIIIZ(aweme, "aweme");
        return C71360RzY.LJIIJ(aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final m LJIIJJI(String videoId, String authorId) {
        o.LJIIIZ(videoId, "videoId");
        o.LJIIIZ(authorId, "authorId");
        S0X s0x = C71370Rzi.LJFF;
        s0x.getClass();
        RelatedProductInfo relatedProductInfo = s0x.get(S0X.LIZ(videoId, authorId));
        if (relatedProductInfo != null) {
            m mVar = new m();
            mVar.LJJIIZ("video_id", relatedProductInfo.videoId);
            mVar.LJJIIZ("author_id", relatedProductInfo.authorId);
            g gVar = new g();
            Iterator<Long> it = relatedProductInfo.productIdList.iterator();
            while (it.hasNext()) {
                gVar.LJJIIJ(String.valueOf(it.next().longValue()));
            }
            mVar.LJJII("product_id_list", gVar);
            g gVar2 = new g();
            Iterator<Long> it2 = relatedProductInfo.expoProductIdList.iterator();
            while (it2.hasNext()) {
                gVar2.LJJIIJ(String.valueOf(it2.next().longValue()));
            }
            mVar.LJJII("expo_product_id_list", gVar2);
            g gVar3 = new g();
            Iterator<Long> it3 = relatedProductInfo.clickProductIdList.iterator();
            while (it3.hasNext()) {
                gVar3.LJJIIJ(String.valueOf(it3.next().longValue()));
            }
            mVar.LJJII("click_product_id_list", gVar3);
            return mVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0218, code lost:
    
        if (r6 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x025c, code lost:
    
        if (r5 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02b1, code lost:
    
        if (r4 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02db, code lost:
    
        if (r3 == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0339, code lost:
    
        if (r2 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03c8, code lost:
    
        if (r1 == null) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x00af, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d6, code lost:
    
        if (r12 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010b, code lost:
    
        if (r11 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0135, code lost:
    
        if (r10 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015f, code lost:
    
        if (r9 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019a, code lost:
    
        if (r8 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d9, code lost:
    
        if (r7 == null) goto L99;
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(X.ActivityC45651qj r51, com.bytedance.router.RouteIntent r52) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService.LJIILL(X.1qj, com.bytedance.router.RouteIntent):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJIJ(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        C71361RzZ.LIZ.getClass();
        if (C71361RzZ.LJJJJIZL(str, false) || !o.LJ("1", UriProtector.getQueryParameter(UriProtector.parse(str), "outer_ecom_product"))) {
            return;
        }
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS40S0100000_4(context, 25), 1000L);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final String LJIJI(String str, PanelOpenInfo panelOpenInfo) {
        PanelOpenInfo panelOpenInfo2 = panelOpenInfo;
        C71361RzZ.LIZ.getClass();
        if (str == null || str.length() == 0) {
            return str;
        }
        if (panelOpenInfo2 == null) {
            if (o.LJ("commercialize", "commercialize")) {
                panelOpenInfo2 = new PanelOpenInfo(1, "commercialize", 0, false, 0);
            } else if (o.LJ("commercialize", "ug_mall")) {
                panelOpenInfo2 = new PanelOpenInfo(1, "ug_mall", 0, false, 0);
            } else {
                panelOpenInfo2 = new PanelOpenInfo(0, null, 0, false, 0, 31, null);
            }
        }
        Uri parse = UriProtector.parse(str);
        o.LJIIIIZZ(parse, "Uri.parse(this)");
        return C45804HyK.LIZIZ(parse, new OSZ("panel_open_info", C27739Aud.LJI(panelOpenInfo2))).build().toString();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final List<String> LJIL(boolean z, boolean z2) {
        C71361RzZ.LIZ.getClass();
        if (!z && !z2) {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            EcStickerCategoryFuncSetting.EcStickerCategoryFuncConfig ecStickerCategoryFuncConfig = EcStickerCategoryFuncSetting.LIZ;
            EcStickerCategoryFuncSetting.EcStickerCategoryFuncConfig ecStickerCategoryFuncConfig2 = (EcStickerCategoryFuncSetting.EcStickerCategoryFuncConfig) LIZLLL.LJIIIIZZ("ecom_sticker_category_config", EcStickerCategoryFuncSetting.EcStickerCategoryFuncConfig.class, ecStickerCategoryFuncConfig);
            if (ecStickerCategoryFuncConfig2 != null) {
                ecStickerCategoryFuncConfig = ecStickerCategoryFuncConfig2;
            }
            if (!ecStickerCategoryFuncConfig.forceHide && C71361RzZ.LJJIZ()) {
                FFL LJIIIZ = FFL.LJIIIZ();
                EcStickerCategorySetting.EcStickerCategoryConfig ecStickerCategoryConfig = EcStickerCategorySetting.LIZ;
                LJIIIZ.getClass();
                EcStickerCategorySetting.EcStickerCategoryConfig ecStickerCategoryConfig2 = (EcStickerCategorySetting.EcStickerCategoryConfig) FFL.LJIJ(true, "ecom_sticker_category", 31744, EcStickerCategorySetting.EcStickerCategoryConfig.class, ecStickerCategoryConfig);
                if (ecStickerCategoryConfig2 != null && ecStickerCategoryConfig2.enableCategory) {
                    return null;
                }
            }
        }
        SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
        EcStickerCategoryFuncSetting.EcStickerCategoryFuncConfig ecStickerCategoryFuncConfig3 = EcStickerCategoryFuncSetting.LIZ;
        EcStickerCategoryFuncSetting.EcStickerCategoryFuncConfig ecStickerCategoryFuncConfig4 = (EcStickerCategoryFuncSetting.EcStickerCategoryFuncConfig) LIZLLL2.LJIIIIZZ("ecom_sticker_category_config", EcStickerCategoryFuncSetting.EcStickerCategoryFuncConfig.class, ecStickerCategoryFuncConfig3);
        if (ecStickerCategoryFuncConfig4 != null) {
            ecStickerCategoryFuncConfig3 = ecStickerCategoryFuncConfig4;
        }
        return ORZ.LLJILJILJ(ecStickerCategoryFuncConfig3.categoryKeyList);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJIIJZLJL(Integer num, Map map) {
        C71359RzX.LIZ.getClass();
        C71359RzX.LIZ(map);
        Map<String, Object> map2 = C71359RzX.LIZIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
        Object obj = linkedHashMap.get("has_shop_anchor");
        Boolean bool = Boolean.TRUE;
        if (o.LJ(obj, bool)) {
            map.put("ec_anchor_response_status", 1);
        } else if (o.LJ(linkedHashMap.get("last_has_shop_anchor"), bool)) {
            map.put("ec_anchor_response_status", 2);
        }
        EnumC53638L3i enumC53638L3i = EnumC53638L3i.VIDEO_ANCHOR;
        map.putAll(map2);
        C66832jn.LIZIZ("tiktokec_video_add_product_show_fail", enumC53638L3i, num, "Add produck link should show but not.", map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final RelatedProductInfo LJJIL(String str, String str2) {
        return C71370Rzi.LJII(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJIIZ(Integer num, String str, Map<String, Object> map) {
        C71359RzX.LIZ.getClass();
        C71359RzX.LIZ(map);
        EnumC53638L3i enumC53638L3i = EnumC53638L3i.VIDEO_ANCHOR;
        map.putAll(C71359RzX.LIZIZ);
        C66832jn.LIZIZ("tiktokec_video_add_product_click_fail", enumC53638L3i, num, str, map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
    
        if (r2 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007f, code lost:
    
        if (r2 != null) goto L14;
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(com.ss.android.ugc.aweme.feed.model.Aweme r17, java.lang.Integer r18, java.lang.String r19) {
        /*
            r16 = this;
            X.RzZ r0 = X.C71361RzZ.LIZ
            r0.getClass()
            r14 = 0
            r3 = r17
            if (r3 == 0) goto L88
            java.lang.String r1 = r3.getAid()
            java.lang.String r0 = r3.getAuthorUid()
        L13:
            com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo r2 = X.C71370Rzi.LJII(r1, r0)
            if (r3 == 0) goto L84
            java.lang.String r6 = r3.getAid()
            java.lang.String r7 = r3.getAuthorUid()
            boolean r0 = r3.isAd()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
        L29:
            if (r2 == 0) goto L7e
            X.J77<java.lang.Long> r0 = r2.expoProductIdList
            if (r0 == 0) goto L7e
            java.lang.Object r0 = X.ORZ.LLFII(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L7e
            java.lang.String r9 = r0.toString()
        L3b:
            X.J77<java.lang.Long> r0 = r2.clickProductIdList
            if (r0 == 0) goto L82
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L82
            java.lang.String r10 = r0.toString()
        L4b:
            r4 = 10
            if (r2 == 0) goto L8b
            X.J77<java.lang.Long> r0 = r2.productIdList
            if (r0 == 0) goto L8b
            java.util.List r1 = X.ORZ.LJLJJL(r0)
            if (r1 == 0) goto L8b
            java.util.ArrayList r11 = new java.util.ArrayList
            int r0 = X.C32I.LJJL(r1, r4)
            r11.<init>(r0)
            java.util.Iterator r5 = r1.iterator()
        L66:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r5.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r11.add(r0)
            goto L66
        L7e:
            r9 = r14
            if (r2 == 0) goto L82
            goto L3b
        L82:
            r10 = r14
            goto L4b
        L84:
            r6 = r14
            r7 = r14
            r8 = r14
            goto L29
        L88:
            r1 = r14
            r0 = r14
            goto L13
        L8b:
            r11 = r14
            if (r2 == 0) goto Lbd
        L8e:
            X.J77<java.lang.Long> r0 = r2.clickProductIdList
            if (r0 == 0) goto Lbd
            java.util.List r1 = X.ORZ.LJLJJL(r0)
            if (r1 == 0) goto Lbd
            java.util.ArrayList r12 = new java.util.ArrayList
            int r0 = X.C32I.LJJL(r1, r4)
            r12.<init>(r0)
            java.util.Iterator r4 = r1.iterator()
        La5:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lbe
            java.lang.Object r0 = r4.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r12.add(r0)
            goto La5
        Lbd:
            r12 = r14
        Lbe:
            if (r3 == 0) goto Le9
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.getAuthor()
            if (r0 == 0) goto Le9
            com.ss.android.ugc.aweme.base.model.UrlModel r13 = r0.getAvatarThumb()
        Lca:
            if (r2 == 0) goto Ld4
            X.J77<java.lang.Object> r0 = r2.sessionImpressionInfo
            if (r0 == 0) goto Ld4
            java.lang.Object r14 = X.ORZ.LJLLLL(r0)
        Ld4:
            r1 = r18
            r0 = r19
            java.util.Map r15 = X.C71366Rze.LJ(r3, r2, r0, r1)
            X.M1p r5 = new X.M1p
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService r0 = com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService.v3()
            r0.Z0(r5)
            return
        Le9:
            r13 = r14
            goto Lca
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService.LJJIJIIJIL(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
    
        if (r2 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007f, code lost:
    
        if (r2 != null) goto L14;
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIZ(com.ss.android.ugc.aweme.feed.model.Aweme r17, java.lang.Integer r18, java.lang.String r19) {
        /*
            r16 = this;
            X.RzZ r0 = X.C71361RzZ.LIZ
            r0.getClass()
            r14 = 0
            r3 = r17
            if (r3 == 0) goto L88
            java.lang.String r1 = r3.getAid()
            java.lang.String r0 = r3.getAuthorUid()
        L13:
            com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo r2 = X.C71370Rzi.LJII(r1, r0)
            if (r3 == 0) goto L84
            java.lang.String r6 = r3.getAid()
            java.lang.String r7 = r3.getAuthorUid()
            boolean r0 = r3.isAd()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
        L29:
            if (r2 == 0) goto L7e
            X.J77<java.lang.Long> r0 = r2.expoProductIdList
            if (r0 == 0) goto L7e
            java.lang.Object r0 = X.ORZ.LLFII(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L7e
            java.lang.String r9 = r0.toString()
        L3b:
            X.J77<java.lang.Long> r0 = r2.clickProductIdList
            if (r0 == 0) goto L82
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L82
            java.lang.String r10 = r0.toString()
        L4b:
            r4 = 10
            if (r2 == 0) goto L8b
            X.J77<java.lang.Long> r0 = r2.productIdList
            if (r0 == 0) goto L8b
            java.util.List r1 = X.ORZ.LJLJJL(r0)
            if (r1 == 0) goto L8b
            java.util.ArrayList r11 = new java.util.ArrayList
            int r0 = X.C32I.LJJL(r1, r4)
            r11.<init>(r0)
            java.util.Iterator r5 = r1.iterator()
        L66:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r5.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r11.add(r0)
            goto L66
        L7e:
            r9 = r14
            if (r2 == 0) goto L82
            goto L3b
        L82:
            r10 = r14
            goto L4b
        L84:
            r6 = r14
            r7 = r14
            r8 = r14
            goto L29
        L88:
            r1 = r14
            r0 = r14
            goto L13
        L8b:
            r11 = r14
            if (r2 == 0) goto Lbd
        L8e:
            X.J77<java.lang.Long> r0 = r2.clickProductIdList
            if (r0 == 0) goto Lbd
            java.util.List r1 = X.ORZ.LJLJJL(r0)
            if (r1 == 0) goto Lbd
            java.util.ArrayList r12 = new java.util.ArrayList
            int r0 = X.C32I.LJJL(r1, r4)
            r12.<init>(r0)
            java.util.Iterator r4 = r1.iterator()
        La5:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lbe
            java.lang.Object r0 = r4.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r12.add(r0)
            goto La5
        Lbd:
            r12 = r14
        Lbe:
            if (r3 == 0) goto Le9
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.getAuthor()
            if (r0 == 0) goto Le9
            com.ss.android.ugc.aweme.base.model.UrlModel r13 = r0.getAvatarThumb()
        Lca:
            if (r2 == 0) goto Ld4
            X.J77<java.lang.Object> r0 = r2.sessionImpressionInfo
            if (r0 == 0) goto Ld4
            java.lang.Object r14 = X.ORZ.LJLLLL(r0)
        Ld4:
            r1 = r18
            r0 = r19
            java.util.Map r15 = X.C71366Rze.LJ(r3, r2, r0, r1)
            X.M1p r5 = new X.M1p
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService r0 = com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService.v3()
            r0.U2(r5)
            return
        Le9:
            r13 = r14
            goto Lca
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService.LJJIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJJI(Integer num, String str, Map<String, Object> map) {
        C71359RzX.LIZ.getClass();
        C71359RzX.LIZ(map);
        if (num != null) {
            Integer valueOf = Integer.valueOf(num.intValue());
            map.putAll(C71359RzX.LIZIZ);
            C66832jn.LIZLLL(valueOf, "tiktokec_video_add_link_request_v2", str, map);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        map.putAll(C71359RzX.LIZIZ);
        C66832jn.LIZJ(num, "tiktokec_video_add_link_request_v2", str, map);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJIILLIIL(Activity activity, View targetView, boolean z, boolean z2) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(targetView, "targetView");
        C71361RzZ.LIZ.getClass();
        if (z || z2 || !C71361RzZ.LJIIIZ()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ecom_sticker_category_should_anchor_");
        LIZ.append(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
        String key = X1D.LIZIZ(LIZ);
        Boolean value = Boolean.FALSE;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        Map<String, Object> map = C71370Rzi.LJIIJ;
        map.put(key, value);
        String string = activity.getString(R.string.fg4);
        o.LJIIIIZZ(string, "activity.getString(R.string.ecom_sticker_tooltip)");
        SAAService.LIZ().invokeMethodsSafely(activity, new AqS57S1200000_2(activity, targetView, string, 2));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ecom_sticker_category_should_anchor_");
        LIZ2.append(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
        String key2 = X1D.LIZIZ(LIZ2);
        Boolean value2 = Boolean.TRUE;
        o.LJIIIZ(key2, "key");
        o.LJIIIZ(value2, "value");
        map.put(key2, value2);
        Keva LIZ3 = LCW.LIZ();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("ecom_sticker_bubble_has_been_shown_");
        LIZ4.append(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
        LIZ3.storeBoolean(X1D.LIZIZ(LIZ4), true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJIJLIJ(Integer num, String str, boolean z, Map map) {
        String str2;
        C71359RzX.LIZ.getClass();
        EnumC53638L3i enumC53638L3i = EnumC53638L3i.VIDEO_ANCHOR;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C71359RzX.LIZIZ);
        linkedHashMap.putAll(C113554cx.LJJLIIIJLLLLLLLZ(map));
        if (z) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        linkedHashMap.put("is_single_anchor", str2);
        if (str != null) {
            linkedHashMap.put("entrance_form", str);
        }
        C66832jn.LIZIZ("rd_tiktokec_video_anchor_view_show_fail", enumC53638L3i, num, "", linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJIIJ(String str, String str2, Integer num, String str3, String str4) {
        b.LJJIJIIJIL("rd_tiktokec_open_singleton_schema", new OSZ("err_code", num), new OSZ("err_msg", str), new OSZ("page_name", str2), new OSZ("jsb_key", "openSingletonSchema"), new OSZ("schema", str3), new OSZ("params", str4));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJIILJJIL(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        b.LJJIJIIJIL("sound_copyright_check_page_request", new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI"), new OSZ("is_ecommerce_scene", Integer.valueOf(o.LJ(bool, Boolean.TRUE) ? 1 : 0)), new OSZ("creation_id", str), new OSZ("shoot_way", str2), new OSZ("draft_id", str3), new OSZ("content_type", str4), new OSZ("content_source", str5), new OSZ("music_id", str6));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJJIIJ(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, Integer num) {
        b.LJJIJIIJIL("sound_copyright_check_page_request_result", new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI"), new OSZ("is_ecommerce_scene", Integer.valueOf(o.LJ(bool, Boolean.TRUE) ? 1 : 0)), new OSZ("creation_id", str), new OSZ("shoot_way", str2), new OSZ("draft_id", str3), new OSZ("content_type", str4), new OSZ("content_source", str5), new OSZ("music_id", str6), new OSZ("sound_copyright_check_page_request_result", num));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService
    public final void LJIIZILJ(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        String str10;
        if (str8.length() == 0 && (str9 == null || str9.length() == 0)) {
            str10 = "sound_copyright_check_page_show";
        } else {
            str10 = "sound_copyright_check_page_show_fail";
        }
        b.LJJIJIIJIL(str10, new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI"), new OSZ("is_ecommerce_scene", Integer.valueOf(o.LJ(bool, Boolean.TRUE) ? 1 : 0)), new OSZ("creation_id", str), new OSZ("enter_from", str2), new OSZ("shoot_way", str3), new OSZ("draft_id", str4), new OSZ("content_type", str5), new OSZ("content_source", str6), new OSZ("music_id", str7), new OSZ("sound_copyright_check_page_show_fail_code", str8), new OSZ("sound_copyright_check_page_show_fail_reason", str9));
    }
}
