package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.model.message.ext.GImage;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionProperty;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.google.gson.j;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcAnchorToShopSettings;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategorySetting;
import com.ss.android.ugc.aweme.ecommerce.model.PanelOpenInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.view.PromotionLogo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.RzZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71361RzZ {
    public static final C71361RzZ LIZ = new C71361RzZ();
    public static final List<String> LIZIZ = C47261Igj.LJJIJIIJI("coupon_id", "coupon_type_id", "coupon_type_info", "coupon_cost_role");
    public static final List<Integer> LIZJ = C47261Igj.LJJIJIIJI(15, 16, 19, 20);

    public static boolean LJJIZ() {
        if (AnchorListManager.LIZ(EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE()) || AnchorListManager.LIZ(EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE()) || AnchorListManager.LIZ(EnumC42934Gt8.ANCHOR_SHOP_MIX.getTYPE())) {
            return true;
        }
        return false;
    }

    public static boolean LJJJJJ(int i, int i2) {
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2 && i2 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIIIZ() {
        if (!LJJIZ()) {
            return false;
        }
        FFL LJIIIZ = FFL.LJIIIZ();
        EcStickerCategorySetting.EcStickerCategoryConfig ecStickerCategoryConfig = EcStickerCategorySetting.LIZ;
        LJIIIZ.getClass();
        EcStickerCategorySetting.EcStickerCategoryConfig ecStickerCategoryConfig2 = (EcStickerCategorySetting.EcStickerCategoryConfig) FFL.LJIJ(true, "ecom_sticker_category", 31744, EcStickerCategorySetting.EcStickerCategoryConfig.class, ecStickerCategoryConfig);
        if (ecStickerCategoryConfig2 == null || !ecStickerCategoryConfig2.enableGuide || !ecStickerCategoryConfig2.enableCategory) {
            return false;
        }
        Keva LIZ2 = LCW.LIZ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("ecom_sticker_bubble_has_been_shown_");
        LIZ3.append(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
        if (LIZ2.getBoolean(X1D.LIZIZ(LIZ3), false)) {
            return false;
        }
        return true;
    }

    public static boolean LJII(PromotionItem promotionItem) {
        List<PromotionProperty> extraProperty;
        if (promotionItem != null && (extraProperty = promotionItem.getExtraProperty()) != null) {
            ArrayList arrayList = new ArrayList();
            for (PromotionProperty promotionProperty : extraProperty) {
                if (o.LJ(promotionProperty.getPropertyName(), "emphasize_name")) {
                    arrayList.add(promotionProperty);
                }
            }
            PromotionProperty promotionProperty2 = (PromotionProperty) ORZ.LJLLLL(arrayList);
            if (promotionProperty2 != null && promotionProperty2.getPropertyValue() != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIIJJI(ProductListModel productListModel) {
        if (productListModel != null && o.LJ(productListModel.isAd(), Boolean.TRUE)) {
            if (!C71358RzW.LIZJ().enableAds || !C71358RzW.LIZJ().enableAnchorTitleShowPromot) {
                return false;
            }
        } else if (!C71358RzW.LIZJ().enable || !C71358RzW.LIZJ().enableAnchorTitleShowPromot) {
            return false;
        }
        return true;
    }

    public static boolean LJIIL(Aweme aweme) {
        if (aweme != null && aweme.isAd()) {
            if (C71358RzW.LIZJ().enableAds && C71358RzW.LIZJ().enableAnchorTitleShowPromot) {
                return true;
            }
        } else if (C71358RzW.LIZJ().enable && C71358RzW.LIZJ().enableAnchorTitleShowPromot) {
            return true;
        }
        return false;
    }

    public static boolean LJIILIIL(Aweme aweme) {
        if (aweme != null && aweme.isAd()) {
            if (!C19N.LJ("ec_anchor_show_request_enable_ads", false)) {
                return false;
            }
        } else if (!C19N.LJ("ec_anchor_show_request_enable", false)) {
            return false;
        }
        return true;
    }

    public static boolean LJIILJJIL(Aweme aweme) {
        if (aweme != null && aweme.isAd()) {
            return S0O.LIZ();
        }
        if (!S0O.LIZIZ().enable || S0O.LIZIZ().delayShowSubtitle <= 0) {
            return false;
        }
        return true;
    }

    public static boolean LJIILLIIL(List list) {
        if (C19N.LJ("ec_custom_anchor_panel", true) && LJJJ(list)) {
            return true;
        }
        return false;
    }

    public static List LJIJJLI(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!ORZ.LJLJJI(((PromotionItem) obj).getType(), LIZJ)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a5, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C53609L2f LJIL(com.ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
            java.util.List r0 = r12.getAnchors()
            r3 = 0
            if (r0 == 0) goto Lac
            java.util.Iterator r5 = r0.iterator()
        Lb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r4 = r5.next()
            r2 = r4
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r2 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r2
            if (r2 == 0) goto Lb
            int r1 = r2.getType()
            r0 = 6
            if (r1 == r0) goto L31
            int r1 = r2.getType()
            r0 = 33
            if (r1 == r0) goto L31
            int r1 = r2.getType()
            r0 = 35
            if (r1 != r0) goto Lb
        L31:
            java.lang.String r0 = r2.getExtra()
            int r0 = r0.length()
            if (r0 <= 0) goto Lb
        L3b:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r4 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r4
            if (r4 == 0) goto Lac
            java.util.List r2 = X.C71360RzY.LJIIJJI(r4)
        L43:
            r6 = 1
        L44:
            if (r2 == 0) goto L8f
            int r0 = r2.size()
            if (r0 <= 0) goto L8f
            int r5 = r2.size()
        L50:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r4 = r2.iterator()
        L59:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lca
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel r2 = (com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel) r2
            com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel r1 = r2.LIZ
            java.lang.Long r0 = r1.productId
            if (r0 == 0) goto L59
            java.lang.Integer r0 = r1.platform
            if (r0 != 0) goto L71
            goto L59
        L71:
            int r1 = r0.intValue()
            r0 = 5
            if (r1 != r0) goto L59
            com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel r0 = r2.LIZ
            java.lang.Integer r2 = r0.productStatus
            X.Ryz r0 = X.EnumC71325Ryz.ProductStatusDown
            int r1 = r0.getValue()
            if (r2 != 0) goto L88
        L84:
            r7.add(r3)
            goto L59
        L88:
            int r0 = r2.intValue()
            if (r0 == r1) goto L59
            goto L84
        L8f:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r12.getAwemeRawAd()
            if (r0 == 0) goto La8
            com.ss.android.ugc.aweme.feed.model.live.EcommerceInfo r0 = r0.getEcommerceInfo()
            if (r0 == 0) goto La8
            java.lang.Integer r0 = r0.getProductCnt()
            if (r0 == 0) goto La8
            int r5 = r0.intValue()
        La5:
            if (r2 == 0) goto Ld6
            goto L50
        La8:
            r5 = 0
            goto La5
        Laa:
            r4 = r3
            goto L3b
        Lac:
            r2 = r3
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r12.getAwemeRawAd()
            if (r0 == 0) goto Lc7
            com.ss.android.ugc.aweme.feed.model.live.EcommerceInfo r0 = r0.getEcommerceInfo()
            if (r0 == 0) goto Lc7
            java.lang.Boolean r1 = r0.isEcom()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto Lc7
            goto L43
        Lc7:
            r6 = 0
            goto L44
        Lca:
            java.lang.String r8 = ","
            r9 = 0
            X.S0F r11 = X.S0F.LJLIL
            r12 = 30
            r10 = r9
            java.lang.String r3 = X.ORZ.LLD(r7, r8, r9, r10, r11, r12)
        Ld6:
            X.L2f r2 = new X.L2f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.<init>(r1, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71361RzZ.LJIL(com.ss.android.ugc.aweme.feed.model.Aweme):X.L2f");
    }

    public static String LJJ(List products) {
        o.LJIIIZ(products, "products");
        return ORZ.LLD(products, ",", null, null, C71328Rz2.LJLIL, 30);
    }

    public static String LJJIFFI(String str) {
        try {
            android.net.Uri parse = UriProtector.parse(str);
            o.LJIIIIZZ(parse, "parse(schema)");
            String LJIJJLI = C78939UyV.LJIJJLI(parse, "visitReportParams");
            if (LJIJJLI == null) {
                return null;
            }
            new com.google.gson.o();
            j LJJIJ = com.google.gson.o.LIZ(LJIJJLI).LJIIZILJ().LJJIJ("chain_key");
            if (LJJIJ == null) {
                return null;
            }
            return LJJIJ.LJJIFFI();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String LJJII(C71376Rzo c71376Rzo) {
        if (c71376Rzo.LJII == 2) {
            long j = c71376Rzo.LIZ;
            if (j > 86400000) {
                return "gt_24";
            }
            if (j > 3600000) {
                return "in_24";
            }
            if (j > 0) {
                return "in_1";
            }
        }
        return "no_countdown";
    }

    public static List LJJIII(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                PromotionItem promotionItem = (PromotionItem) obj;
                if (ORZ.LJLJJI(promotionItem.getType(), LIZJ) && promotionItem.getWaistImg() != null) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return null;
    }

    public static AnchorCommonStruct LJJIIJ(List list) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) obj2;
            if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_SHOP_MIX.getTYPE() || anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE() || anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE()) {
                obj = obj2;
                break;
            }
        }
        return (AnchorCommonStruct) obj;
    }

    public static Integer LJJIIZ(ProductListModel model) {
        int i;
        o.LJIIIZ(model, "model");
        if (C025908h.LJFF(false, model.getAuthorUid())) {
            return null;
        }
        User author = model.getAuthor();
        if (author != null) {
            i = author.getFollowStatus();
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }

    public static boolean LJJIIZI(boolean z) {
        if (z) {
            if (C00F.LIZ(31744, 0, "ec_single_anchor_maybe_you_like", true) != 1) {
                return false;
            }
        } else if (C00F.LIZ(31744, 0, "ec_multi_anchor_maybe_you_like", true) != 1) {
            return false;
        }
        return true;
    }

    public static String LJJIJ(ShopWindowExtraModel extraData) {
        o.LJIIIZ(extraData, "extraData");
        String str = "";
        if (C78857UxB.LJJJIL(extraData.elasticUrl)) {
            String str2 = extraData.elasticUrl;
            if (str2 != null) {
                str = str2;
            }
            return C70657RoD.LJIIJJI(str, EnumC70569Rmn.VIDEO_MULTI_ANCHOR);
        }
        if (C78857UxB.LJJJIL(extraData.coverUrl)) {
            String str3 = extraData.coverUrl;
            if (str3 != null) {
                str = str3;
            }
            return C70657RoD.LJIIJJI(str, EnumC70569Rmn.VIDEO_MULTI_ANCHOR);
        }
        return null;
    }

    public static java.util.Map LJJIJIIJIL(List list) {
        List<String> urls;
        HashMap hashMap = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Image image = ((PromotionLogo) obj).image;
                if (image != null && (urls = image.getUrls()) != null && ORZ.LJLLLLLL(0, urls) != null) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                hashMap = new HashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hashMap.putAll(((PromotionLogo) it.next()).LIZ());
                }
            }
        }
        return hashMap;
    }

    public static java.util.Map LJJIJIL(java.util.Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            Object obj = map.get("campaign_id");
            if (obj != null) {
                linkedHashMap.put("campaign_id", obj);
            }
            Object obj2 = map.get("campaign_user_tag");
            if (obj2 != null) {
                linkedHashMap.put("campaign_type", obj2);
            }
            Object obj3 = map.get("campaign_channel");
            if (obj3 != null) {
                linkedHashMap.put("campaign_channel", obj3);
            }
            Object obj4 = map.get("coupon_type");
            if (obj4 != null) {
                linkedHashMap.put("coupon_type", obj4);
            }
            Object obj5 = map.get("coupon_type_info");
            if (obj5 != null) {
                linkedHashMap.put("coupon_type_info", obj5);
            }
            Object obj6 = map.get("coupon_id");
            if (obj6 != null) {
                linkedHashMap.put("coupon_id", obj6);
            }
            Object obj7 = map.get("coupon_type_id");
            if (obj7 != null) {
                linkedHashMap.put("coupon_type_id", obj7);
            }
            Object obj8 = map.get("coupon_id");
            if (obj8 != null) {
                linkedHashMap.put("coupon_id", obj8);
            }
            Object obj9 = map.get("coupon_cost_role");
            if (obj9 != null) {
                linkedHashMap.put("coupon_cost_role", obj9);
            }
            Object obj10 = map.get("rights_cnt");
            if (obj10 != null) {
                linkedHashMap.put("rights_cnt", obj10);
            }
            Object obj11 = map.get("rights_content");
            if (obj11 != null) {
                linkedHashMap.put("rights_content", obj11);
            }
        }
        return linkedHashMap;
    }

    public static L7W LJJIL(List models) {
        o.LJIIIZ(models, "models");
        Iterator it = models.iterator();
        while (it.hasNext()) {
            Integer num = ((ShopWindowAnchorModel) it.next()).LIZ.productStatus;
            int value = EnumC71103RvP.PRODUCT_STATUS_DOWN.getValue();
            if (num == null || num.intValue() != value) {
                return L7W.OTHER;
            }
        }
        return L7W.REGION_UNAVAILABLE;
    }

    public static boolean LJJJ(List list) {
        Integer num;
        if (list == null) {
            return false;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ShopWindowExtraModel shopWindowExtraModel = ((ShopWindowAnchorModel) it.next()).LIZ;
                if (shopWindowExtraModel == null || (num = shopWindowExtraModel.platform) == null || num.intValue() != 5) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean LJJJI(ProductListModel productListModel) {
        List<AnchorCommonStruct> anchors;
        if (productListModel == null || (anchors = productListModel.getAnchors()) == null) {
            return false;
        }
        if (!anchors.isEmpty()) {
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                if (anchorCommonStruct.getType() != 35 && anchorCommonStruct.getType() != 6 && anchorCommonStruct.getType() != 33) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean LJJJIL(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        if (aweme == null || (anchors = aweme.getAnchors()) == null) {
            return false;
        }
        if (!anchors.isEmpty()) {
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                if (anchorCommonStruct.getType() != 35 && anchorCommonStruct.getType() != 6 && anchorCommonStruct.getType() != 33) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean LJJJJ(Aweme aweme) {
        boolean z = true;
        if (aweme == null || !aweme.isAd() ? !C19N.LJ("ec_use_custom_anchor", false) : !C19N.LJ("ec_use_custom_anchor_ads", false)) {
            z = false;
        }
        if (!LJJJIL(aweme) || !z) {
            return false;
        }
        return true;
    }

    public static boolean LJJJJI(Aweme aweme) {
        HashMap<String, Object> LJII;
        if (aweme == null || (LJII = C27739Aud.LJII(aweme.getAnchorsExtras())) == null || !o.LJ(LJII.get("is_ec_video"), 1) || aweme.isAd()) {
            return false;
        }
        return true;
    }

    public static void LJ(C71367Rzf params, List list) {
        List<String> urls;
        o.LJIIIZ(params, "params");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Image image = ((PromotionLogo) obj).image;
            if (image != null && (urls = image.getUrls()) != null && ORZ.LJLLLLLL(0, urls) != null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(((PromotionLogo) it.next()).LIZ());
        }
        params.LJZ = hashMap;
    }

    public static void LJFF(C71367Rzf params, java.util.Map map) {
        o.LJIIIZ(params, "params");
        if (map.containsKey("campaign_id")) {
            params.LJJJJIZL = String.valueOf(map.get("campaign_id"));
        }
        if (map.containsKey("campaign_type")) {
            params.LJJJJJ = String.valueOf(map.get("campaign_type"));
        }
        if (map.containsKey("campaign_user_tag")) {
            params.LJJJJJL = String.valueOf(map.get("campaign_user_tag"));
        }
        if (map.containsKey("campaign_channel")) {
            params.LJJJJL = String.valueOf(map.get("campaign_channel"));
        }
        if (map.containsKey("coupon_type")) {
            params.LJJJJLI = String.valueOf(map.get("coupon_type"));
        }
        if (map.containsKey("coupon_type_info")) {
            params.LJJJJLL = String.valueOf(map.get("coupon_type_info"));
        }
        if (map.containsKey("coupon_id")) {
            params.LJJJJZ = String.valueOf(map.get("coupon_id"));
        }
        if (map.containsKey("coupon_type_id")) {
            params.LJJJJZI = String.valueOf(map.get("coupon_type_id"));
        }
        if (map.containsKey("coupon_cost_role")) {
            params.LJJJLIIL = String.valueOf(map.get("coupon_cost_role"));
        }
        if (map.containsKey("rights_cnt")) {
            params.LJLL = String.valueOf(map.get("rights_cnt"));
        }
        if (map.containsKey("rights_content")) {
            params.LJLLI = String.valueOf(map.get("rights_content"));
        }
    }

    public static boolean LJIIIIZZ(Context context, ShopWindowAnchorModel data) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(context, "context");
        Integer num = data.LIZ.productStatus;
        int value = EnumC71103RvP.PRODUCT_STATUS_DOWN.getValue();
        if (num == null || num.intValue() != value) {
            return true;
        }
        LJJJLIIL(context, data.LIZ.unavailableText);
        return false;
    }

    public static boolean LJIILL(Aweme aweme, List products) {
        o.LJIIIZ(products, "products");
        if (!LJJJ(products)) {
            return false;
        }
        if (aweme != null && aweme.isAd()) {
            if (!C71358RzW.LIZJ().enableAds || !C71358RzW.LIZJ().primaryStyle) {
                return false;
            }
        } else if (!C71358RzW.LIZJ().enable || !C71358RzW.LIZJ().primaryStyle) {
            return false;
        }
        return true;
    }

    public static boolean LJIJ(ProductListModel productListModel, List products) {
        boolean z;
        o.LJIIIZ(products, "products");
        if (!LJJJ(products)) {
            return false;
        }
        if (productListModel != null) {
            z = o.LJ(productListModel.isAd(), Boolean.TRUE);
        } else {
            z = false;
        }
        if (z) {
            if (C53218Kuc.LIZ().anchorPanelStyleAds != 1) {
                return false;
            }
        } else if (C53218Kuc.LIZ().anchorPanelStyle != 1) {
            return false;
        }
        return true;
    }

    public static void LJIJI(SmartImageView smartImageView, List list) {
        PromotionItem promotionItem;
        List LJJIII = LJJIII(list);
        if (LJJIII != null && (promotionItem = (PromotionItem) ORZ.LJLLLL(LJJIII)) != null) {
            try {
                GImage waistImg = promotionItem.getWaistImg();
                if (waistImg != null) {
                    W5F LIZLLL = C70759Rpr.LIZLLL(C69889Rbp.LIZLLL(waistImg));
                    LIZLLL.LJJIIJ = smartImageView;
                    LIZLLL.LIZLLL(new LDM(smartImageView));
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
            }
        }
    }

    public static String LJJI(ProductListModel model, String productId) {
        String str;
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(model, "model");
        HashMap<String, String> mobParams = model.getMobParams();
        String str2 = "";
        if (mobParams == null || (str = mobParams.get("request_id")) == null) {
            str = "";
        }
        String aid = model.getAid();
        if (aid != null) {
            str2 = aid;
        }
        return C70570Rmo.LIZ(str, str2, productId);
    }

    public static java.util.Map LJJIIJZLJL(String productId, java.util.Map map) {
        C71376Rzo c71376Rzo;
        String str;
        o.LJIIIZ(productId, "productId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null && (c71376Rzo = (C71376Rzo) ((LinkedHashMap) map).get(productId)) != null) {
            LIZ.getClass();
            if (c71376Rzo.LJII == 2) {
                str = "on_sale";
            } else {
                str = "";
            }
            linkedHashMap.put("flashsale_status", str);
            linkedHashMap.put("countdown_type", LJJII(c71376Rzo));
        }
        return linkedHashMap;
    }

    public static String LJJIJIIJI(ShopWindowAnchorModel shopWindowAnchorModel, boolean z) {
        if (C78857UxB.LJJJIL(shopWindowAnchorModel.LIZ.elasticTitle) && !z) {
            return shopWindowAnchorModel.LIZ.elasticTitle;
        }
        return shopWindowAnchorModel.LIZ.title;
    }

    public static int LJJIJL(int i, Integer num) {
        if (num != null) {
            num.intValue();
            if (num.intValue() == 2) {
                if (i > 2) {
                    return 2;
                }
                return 1;
            }
            return num.intValue();
        }
        return 0;
    }

    public static String LJJIJLIJ(ShopWindowExtraModel extraData, Integer num) {
        int i;
        String LJJIJ;
        o.LJIIIZ(extraData, "extraData");
        if (num == null || num.intValue() != 0) {
            if (num == null || num.intValue() != 1) {
                i = C71357RzV.LIZ().middleImageSize;
            } else {
                i = C71357RzV.LIZ().middleImageSize;
            }
        } else {
            i = C71357RzV.LIZ().lowImageSize;
        }
        if (num == null || num.intValue() != 2) {
            String str = "";
            if (C78857UxB.LJJJIL(extraData.elasticUrl)) {
                String str2 = extraData.elasticUrl;
                if (str2 != null) {
                    str = str2;
                }
                try {
                    str = C1E4.LJJIIJZLJL(i, i, str);
                } catch (Exception unused) {
                }
                LJJIJ = C70657RoD.LJIIJJI(str, EnumC70569Rmn.VIDEO_MULTI_ANCHOR);
            } else if (C78857UxB.LJJJIL(extraData.coverUrl)) {
                String str3 = extraData.coverUrl;
                if (str3 != null) {
                    str = str3;
                }
                try {
                    str = C1E4.LJJIIJZLJL(i, i, str);
                } catch (Exception unused2) {
                }
                LJJIJ = C70657RoD.LJIIJJI(str, EnumC70569Rmn.VIDEO_MULTI_ANCHOR);
            } else {
                LJJIJ = null;
            }
        } else {
            LJJIJ = LJJIJ(extraData);
        }
        if (LJJIJ == null) {
            return null;
        }
        if (C52186Kdy.LIZ) {
            LJJIJ = N3O.LIZ.LIZ(LJJIJ);
        }
        return LJJIJ;
    }

    public static boolean LJJJJIZL(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return false;
        }
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcAnchorToShopSettings.EcAnchorToShopModel ecAnchorToShopModel = EcAnchorToShopSettings.LIZ;
        EcAnchorToShopSettings.EcAnchorToShopModel ecAnchorToShopModel2 = (EcAnchorToShopSettings.EcAnchorToShopModel) LIZLLL.LJIIIIZZ("ec_anchor_to_shop", EcAnchorToShopSettings.EcAnchorToShopModel.class, ecAnchorToShopModel);
        if (ecAnchorToShopModel2 != null) {
            ecAnchorToShopModel = ecAnchorToShopModel2;
        }
        if (!ecAnchorToShopModel.enableAnchorToShop) {
            C71363Rzb.LJ(false, -1, "anchor_to_shop_experiment_disable", str, null, z, 16);
            return false;
        }
        android.net.Uri parse = UriProtector.parse(str);
        if (!ORZ.LJLJJI(parse.getHost(), ecAnchorToShopModel.hostWhiteList)) {
            C71363Rzb.LJ(false, -2, "host_not_in_whitelist", str, null, z, 16);
            return false;
        }
        String LJJJJI = C78926UyI.LJJJJI(parse, "af_dp");
        if (LJJJJI == null || LJJJJI.length() == 0) {
            C71363Rzb.LJ(false, -4, "af_dp_get_fail", str, null, z, 16);
            return false;
        }
        List<String> list = ecAnchorToShopModel.pathWhiteList;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (!(!s.LJJJLZIJ(LJJJJI, it.next(), false))) {
                    if (!SmartRouter.canOpen(LJJJJI)) {
                        C71363Rzb.LIZLLL(false, -5, "schema_can_not_open", str, LJJJJI, z);
                        return false;
                    }
                    C71363Rzb.LJ(true, null, null, str, LJJJJI, z, 6);
                    return true;
                }
            }
        }
        C71363Rzb.LIZLLL(false, -3, "path_not_in_whitelist", str, LJJJJI, z);
        return false;
    }

    public static java.util.Map LJJJJJL(List list, java.util.Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        List LJJIII = LJJIII(list);
        if (LJJIII == null) {
            return linkedHashMap;
        }
        Iterator it = LJJIII.iterator();
        while (it.hasNext()) {
            HashMap<String, Object> LJII = C27739Aud.LJII(((PromotionItem) it.next()).getLog_extra());
            if (LJII != null) {
                for (String str : LIZIZ) {
                    Object obj = LJII.get(str);
                    if (obj != null) {
                        Object obj2 = linkedHashMap.get(str);
                        if (obj2 == null) {
                            linkedHashMap.put(str, String.valueOf(obj));
                        } else {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(obj2);
                            LIZ2.append(',');
                            LIZ2.append(obj);
                            linkedHashMap.put(str, X1D.LIZIZ(LIZ2));
                        }
                    }
                }
            }
        }
        String LLD = ORZ.LLD(LJJIII, ",", null, null, C69892Rbs.LJLIL, 30);
        int size = LJJIII.size();
        linkedHashMap.put("rights_content", LLD);
        linkedHashMap.put("rights_cnt", String.valueOf(size));
        return linkedHashMap;
    }

    public static List LJJJJLL(AnchorCommonStruct anchorCommonStruct, boolean z) {
        String str;
        String str2;
        ShopWindowExtraModel shopWindowExtraModel;
        ArrayList arrayList = new ArrayList();
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getExtra();
        } else {
            str = null;
        }
        if (anchorCommonStruct != null) {
            str2 = anchorCommonStruct.getMostRelevantProductId();
        } else {
            str2 = null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                String extra = jSONObject.optString("extra");
                try {
                    Object LJII = C27739Aud.LJFF().LJII(extra, C65330PkU.LIZJ(C65352Pkq.LIZLLL(ShopWindowExtraModel.class)));
                    if (!(LJII instanceof ShopWindowExtraModel)) {
                        LJII = null;
                    }
                    shopWindowExtraModel = (ShopWindowExtraModel) LJII;
                } catch (com.google.gson.s unused) {
                    shopWindowExtraModel = null;
                }
                if (shopWindowExtraModel == null) {
                    shopWindowExtraModel = new ShopWindowExtraModel(null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
                }
                if (z && C78857UxB.LJJJIL(str2)) {
                    if (o.LJ(str2, jSONObject.optString("id"))) {
                        o.LJIIIIZZ(extra, "extra");
                        String optString = jSONObject.optString("keyword");
                        o.LJIIIIZZ(optString, "obj.optString(\"keyword\")");
                        String optString2 = jSONObject.optString("id");
                        o.LJIIIIZZ(optString2, "obj.optString(\"id\")");
                        Integer valueOf = Integer.valueOf(jSONObject.optInt("type"));
                        Integer valueOf2 = Integer.valueOf(jSONObject.optInt("platform"));
                        String optString3 = jSONObject.optString("log_extra");
                        o.LJIIIIZZ(optString3, "obj.optString(\"log_extra\")");
                        String optString4 = jSONObject.optString("schema");
                        o.LJIIIIZZ(optString4, "obj.optString(\"schema\")");
                        ListProtector.add(arrayList, 0, new ShopWindowAnchorModel(extra, shopWindowExtraModel, optString, optString2, valueOf, valueOf2, optString3, optString4));
                    }
                }
                o.LJIIIIZZ(extra, "extra");
                String optString5 = jSONObject.optString("keyword");
                o.LJIIIIZZ(optString5, "obj.optString(\"keyword\")");
                String optString6 = jSONObject.optString("id");
                o.LJIIIIZZ(optString6, "obj.optString(\"id\")");
                Integer valueOf3 = Integer.valueOf(jSONObject.optInt("type"));
                Integer valueOf4 = Integer.valueOf(jSONObject.optInt("platform"));
                String optString7 = jSONObject.optString("log_extra");
                o.LJIIIIZZ(optString7, "obj.optString(\"log_extra\")");
                String optString8 = jSONObject.optString("schema");
                o.LJIIIIZZ(optString8, "obj.optString(\"schema\")");
                arrayList.add(new ShopWindowAnchorModel(extra, shopWindowExtraModel, optString5, optString6, valueOf3, valueOf4, optString7, optString8));
            }
            return arrayList;
        } catch (Exception unused2) {
            return new ArrayList();
        }
    }

    public static void LJJJLIIL(Context context, String str) {
        o.LJIIIZ(context, "context");
        if ((str == null || ujb.o.LJJJJJL(str)) && (str = context.getString(R.string.pc9)) == null) {
            str = "";
        }
        o.LJIIIIZZ(str, "if (msg.isNullOrBlank())…            msg\n        }");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            C31811Ce7.LIZIZ(LJIJJ, str);
        }
    }

    public static void LIZJ(java.util.Map map, C71367Rzf params, String productId) {
        C71376Rzo c71376Rzo;
        String str;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(productId, "productId");
        if (map != null && (c71376Rzo = (C71376Rzo) map.get(productId)) != null) {
            LIZ.getClass();
            if (c71376Rzo.LJII == 2) {
                str = "on_sale";
            } else {
                str = "";
            }
            params.LJJLIIIJ = str;
            params.LJJLIIIIJ = LJJII(c71376Rzo);
        }
    }

    public static void LIZLLL(C71367Rzf params, ShopWindowAnchorModel anchor, java.util.Map map) {
        String str;
        List<PromotionItem> list;
        List<PromotionItem> list2;
        Integer style;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(anchor, "anchor");
        String valueOf = String.valueOf(anchor.LIZ.productId);
        if (map != null) {
            PromotionView promotionView = (PromotionView) ((LinkedHashMap) map).get(valueOf);
            if (map != null && map.containsKey(valueOf) && promotionView != null && (list = promotionView.promotion_items) != null && list.size() > 0 && promotionView != null && (list2 = promotionView.promotion_items) != null) {
                C71361RzZ c71361RzZ = LIZ;
                PromotionItem promotionItem = (PromotionItem) ListProtector.get(list2, 0);
                c71361RzZ.getClass();
                if (!LJII(promotionItem) && (style = ((PromotionItem) ListProtector.get(list2, 0)).getStyle()) != null && style.intValue() == 10) {
                    str = "1";
                    params.LJJLJ = str;
                }
            }
        }
        str = CardStruct.IStatusCode.DEFAULT;
        params.LJJLJ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(android.content.Context r8, com.bytedance.android.livesdk.model.message.ext.PromotionItem r9, android.widget.LinearLayout r10) {
        /*
            if (r9 != 0) goto L3
            return
        L3:
            X.8Hd r5 = new X.8Hd
            r4 = 0
            r5.<init>(r8, r4)
            java.util.List r0 = r9.getExtraProperty()
            if (r0 == 0) goto L35
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r0.iterator()
        L18:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.livesdk.model.message.ext.PromotionProperty r0 = (com.bytedance.android.livesdk.model.message.ext.PromotionProperty) r0
            java.lang.String r1 = r0.getPropertyName()
            java.lang.String r0 = "emphasize_name"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L18
            r6.add(r2)
            goto L18
        L35:
            r6 = r4
            goto L43
        L37:
            java.lang.Object r0 = X.ORZ.LJLLLL(r6)
            com.bytedance.android.livesdk.model.message.ext.PromotionProperty r0 = (com.bytedance.android.livesdk.model.message.ext.PromotionProperty) r0
            if (r0 == 0) goto L35
            java.lang.String r6 = r0.getPropertyValue()
        L43:
            java.lang.String r3 = r9.getName()
            java.util.List r0 = r9.getExtraProperty()
            if (r0 == 0) goto L7f
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r0.iterator()
        L56:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r2 = r7.next()
            r0 = r2
            com.bytedance.android.livesdk.model.message.ext.PromotionProperty r0 = (com.bytedance.android.livesdk.model.message.ext.PromotionProperty) r0
            java.lang.String r1 = r0.getPropertyName()
            java.lang.String r0 = "emphasize_icon"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L56
            r8.add(r2)
            goto L56
        L73:
            java.lang.Object r0 = X.ORZ.LJLLLL(r8)
            com.bytedance.android.livesdk.model.message.ext.PromotionProperty r0 = (com.bytedance.android.livesdk.model.message.ext.PromotionProperty) r0
            if (r0 == 0) goto L7f
            java.lang.String r4 = r0.getPropertyValue()
        L7f:
            if (r6 == 0) goto L9e
            if (r3 == 0) goto L9e
            X.FvF r2 = new X.FvF
            r1 = 7
            r0 = 12
            r2.<init>(r1, r0)
            java.lang.Integer r0 = r9.getType()
            if (r0 == 0) goto La5
            int r0 = r0.intValue()
            boolean r0 = r2.LJIILJJIL(r0)
            if (r0 == 0) goto La5
            r5.LJJZ(r6, r3, r4)
        L9e:
            r10.removeAllViews()
            r10.addView(r5)
            return
        La5:
            r5.LJJLL(r6, r3, r4)
            goto L9e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71361RzZ.LJIIJ(android.content.Context, com.bytedance.android.livesdk.model.message.ext.PromotionItem, android.widget.LinearLayout):void");
    }

    public static boolean LJIIZILJ(Aweme aweme, List products, boolean z) {
        o.LJIIIZ(products, "products");
        if (!LJJJ(products)) {
            return false;
        }
        if (aweme != null && aweme.isAd()) {
            if (C00F.LIZ(31744, 0, "ec_anchor_maybe_you_like_ads", true) != 1) {
                return false;
            }
            return LJJIIZI(z);
        }
        return LJJIIZI(z);
    }

    public static boolean LJJJJZ(C71361RzZ c71361RzZ, int i, int i2) {
        c71361RzZ.getClass();
        if (i != 0) {
            if (i != 1) {
                if (i != 2 || i2 > 1) {
                    return true;
                }
            } else if (i2 > 1) {
                return true;
            }
        } else if (i2 > 4) {
            return true;
        }
        return false;
    }

    public static void LJJJJZI(Context context, View view, String str) {
        S0M s0m;
        int i;
        if (view == null || str == null || str.length() == 0) {
            return;
        }
        int LIZ2 = C00F.LIZ(31744, 0, "ec_add_to_cart_new_anim", true);
        if (LIZ2 == 0) {
            s0m = S0M.TOP;
        } else if (LIZ2 == 1 || LIZ2 == 3) {
            s0m = S0M.CENTER;
        } else {
            s0m = S0M.CART;
        }
        int i2 = S0N.LIZ[s0m.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                RXA rxa = new RXA(str, System.currentTimeMillis());
                if (!view.isShown()) {
                    return;
                }
                C139825eE c139825eE = new C139825eE(context);
                c139825eE.LJIIL(rxa.LJLIL);
                c139825eE.LIZ.LIZIZ = view;
                c139825eE.LJI(WHL.BOTTOM);
                Integer LJI = C79045V0n.LJI(R.attr.gy, context);
                if (LJI != null) {
                    i = LJI.intValue();
                } else {
                    i = -16777216;
                }
                c139825eE.LJIIIIZZ(i);
                C82682Wcg c82682Wcg = c139825eE.LIZ;
                c82682Wcg.LJIIIZ = true;
                c82682Wcg.LJIIL = true;
                c139825eE.LIZ.LJ = (int) KL2.LIZJ(context, -1000.0f);
                c139825eE.LIZJ().show();
                return;
            }
            C26045AKb c26045AKb = new C26045AKb(view);
            c26045AKb.LJIIIZ(str);
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb.LJI(AnonymousClass636.LJIIIIZZ(R.attr.e8, context));
            c26045AKb.LJIIJ();
            return;
        }
        C26048AKe c26048AKe = new C26048AKe(view);
        c26048AKe.LJI(str);
        c26048AKe.LIZJ(R.raw.icon_tick);
        c26048AKe.LIZLLL(AnonymousClass636.LJIIIIZZ(R.attr.dj, context));
        c26048AKe.LJII();
    }

    public static void LJI(ShopWindowAnchorModel data, boolean z, String str, boolean z2) {
        o.LJIIIZ(data, "data");
        Integer num = data.LIZ.productStatus;
        int value = EnumC71325Ryz.ProductStatusDown.getValue();
        if (num == null || num.intValue() != value) {
            String str2 = data.LIZ.schema;
            if (str2 == null || str2.length() == 0) {
                C71359RzX.LJ(C71359RzX.LIZ, 5003, "data unavailable", str, z2);
                return;
            }
            C71359RzX c71359RzX = C71359RzX.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("is_thirty_part", Boolean.valueOf(z));
            c71359RzX.getClass();
            C71359RzX.LIZLLL(true, 5004, "route fail", str, z2, linkedHashMap);
            return;
        }
        C71359RzX.LJ(C71359RzX.LIZ, 5002, "product unavailable", str, z2);
    }

    public static void LJIJJ(SHA productCoverView, ShopWindowAnchorModel anchor, String lowSizeImageUrl, boolean z) {
        o.LJIIIZ(productCoverView, "productCoverView");
        o.LJIIIZ(anchor, "anchor");
        o.LJIIIZ(lowSizeImageUrl, "lowSizeImageUrl");
        Integer num = anchor.type;
        int type = EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE();
        if (num == null || num.intValue() != type) {
            return;
        }
        try {
            C71361RzZ c71361RzZ = LIZ;
            ShopWindowExtraModel shopWindowExtraModel = anchor.LIZ;
            c71361RzZ.getClass();
            String LJJIJ = LJJIJ(shopWindowExtraModel);
            if (LJJIJ != null && LJJIJ.length() != 0) {
                XKX.LIZLLL(C780334l.LJLIL, null, null, new C26086ALq(lowSizeImageUrl, z, anchor, productCoverView, null), 3);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r10 != null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r6, java.lang.String r7, com.bytedance.android.livesdk.model.message.ext.PromotionItem r8, android.widget.LinearLayout r9, java.util.Map r10) {
        /*
            X.OLf r3 = new X.OLf
            r3.<init>(r6)
            java.lang.String r1 = r8.getCountDown()
            if (r1 == 0) goto L5b
            r4 = 0
            if (r10 == 0) goto L24
            java.lang.Object r0 = r10.get(r7)
            if (r0 != 0) goto L2f
            if (r10 == 0) goto L24
            X.Rzo r0 = new X.Rzo
            r0.<init>()
            r10.put(r7, r0)
        L1e:
            java.lang.Object r4 = r10.get(r7)
            X.Rzo r4 = (X.C71376Rzo) r4
        L24:
            com.ss.android.ugc.aweme.ecommercebase.view.coupon.FlashSaleModel r5 = new com.ss.android.ugc.aweme.ecommercebase.view.coupon.FlashSaleModel
            r5.<init>(r1)
            X.RzZ r0 = X.C71361RzZ.LIZ
            r0.getClass()
            goto L32
        L2f:
            if (r10 == 0) goto L24
            goto L1e
        L32:
            long r6 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r1)     // Catch: java.lang.Exception -> L40
            r0 = 86400(0x15180, float:1.21072E-40)
            long r1 = (long) r0     // Catch: java.lang.Exception -> L40
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L40
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            r1 = 6
            if (r0 == 0) goto L6e
            java.lang.Integer r0 = r8.getStyle()
            if (r0 != 0) goto L62
        L4a:
            X.L3Y r0 = X.L3Y.FlashSaleViewWithoutCountDown
            r3.LIZIZ(r0)
        L4f:
            java.lang.String r0 = r8.getName()
            r3.setFlashSaleText(r0)
            if (r4 == 0) goto L5b
            X.C71376Rzo.LIZIZ(r4, r5)
        L5b:
            r9.removeAllViews()
            r9.addView(r3)
            return
        L62:
            int r0 = r0.intValue()
            if (r0 != r1) goto L4a
            X.L3Y r0 = X.L3Y.FlashSaleViewWithoutCountDown
            r3.LIZ(r0)
            goto L4f
        L6e:
            java.lang.Integer r0 = r8.getStyle()
            if (r0 != 0) goto La2
        L74:
            X.L3Y r0 = X.L3Y.FlashSaleViewWithCountDown
            r3.LIZIZ(r0)
        L79:
            java.lang.String r0 = r8.getName()
            r3.setFlashSaleText(r0)
            X.Af3 r2 = r3.getFlashCountDownView()
            if (r4 == 0) goto L5b
            kotlin.jvm.internal.IDqS436S0100000_12 r1 = new kotlin.jvm.internal.IDqS436S0100000_12
            r0 = 24
            r1.<init>(r2, r0)
            java.util.List<X.Ynt<java.lang.Integer, java.lang.Integer, java.lang.Long, X.UCe>> r0 = r4.LJFF
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L9e
            java.util.List<X.Ynt<java.lang.Integer, java.lang.Integer, java.lang.Long, X.UCe>> r0 = r4.LJFF
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r1)
        L9e:
            X.C71376Rzo.LIZIZ(r4, r5)
            goto L5b
        La2:
            int r0 = r0.intValue()
            if (r0 != r1) goto L74
            X.L3Y r0 = X.L3Y.FlashSaleViewWithCountDown
            r3.LIZ(r0)
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71361RzZ.LIZ(android.content.Context, java.lang.String, com.bytedance.android.livesdk.model.message.ext.PromotionItem, android.widget.LinearLayout, java.util.Map):void");
    }

    public static boolean LJJJJLI(String str, String str2, String str3, String str4, Context context) {
        String LJ;
        String LJ2;
        o.LJIIIZ(context, "context");
        if (str == null || str.length() == 0) {
            return false;
        }
        if (LJJJJIZL(str2, true)) {
            android.net.Uri parse = UriProtector.parse(str2);
            o.LJIIIIZZ(parse, "parse(finalUrl)");
            String LJJJJI = C78926UyI.LJJJJI(parse, "af_dp");
            if (LJJJJI == null) {
                return false;
            }
            String LIZ2 = C26867AgZ.LIZ(LJJJJI, C113554cx.LJJL(new OSZ("item_id", str3), new OSZ("author_id", str4)));
            if (str3 != null && (LJ2 = a1.LJ(LIZ2, "&item_id=", str3)) != null) {
                LIZ2 = LJ2;
            }
            if (str4 != null && (LJ = a1.LJ(LIZ2, "&author_id=", str4)) != null) {
                LIZ2 = LJ;
            }
            SmartRouter.buildRoute(context, LIZ2).open();
            return SmartRouter.canOpen(LIZ2);
        }
        return MainServiceImpl.createIMainServicebyMonsterPlugin(false).openAdWebUrl(context, str, "");
    }

    public static void LJJJJL(C71361RzZ c71361RzZ, ActivityC45651qj activityC45651qj, ProductListModel productListModel, PanelOpenInfo panelOpenInfo, InterfaceC44105HSr interfaceC44105HSr, int i) {
        int i2;
        PanelOpenInfo panelOpenInfo2;
        if ((i & 4) != 0) {
            panelOpenInfo = null;
        }
        if ((i & 8) != 0) {
            interfaceC44105HSr = null;
        }
        c71361RzZ.getClass();
        List<ShopWindowAnchorModel> products = productListModel.getProducts();
        if (products != null) {
            i2 = products.size();
        } else {
            i2 = 0;
        }
        ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment = new ECommerceAnchorPanelFragment();
        eCommerceAnchorPanelFragment.LJLJJLL = interfaceC44105HSr;
        Bundle bundle = new Bundle();
        bundle.putSerializable("productListModel", productListModel);
        bundle.putBoolean("useBubbleIcon", false);
        bundle.putLong("clickTime", System.currentTimeMillis());
        if (panelOpenInfo == null) {
            panelOpenInfo2 = productListModel.getPanelOpenInfo();
        } else {
            panelOpenInfo2 = panelOpenInfo;
        }
        bundle.putSerializable("panelOpenInfo", panelOpenInfo2);
        eCommerceAnchorPanelFragment.setArguments(bundle);
        if (panelOpenInfo == null) {
            panelOpenInfo = productListModel.getPanelOpenInfo();
        }
        C71381Rzt.LIZ(activityC45651qj, eCommerceAnchorPanelFragment, LJJJJZ(c71361RzZ, LJJIJL(i2, Integer.valueOf(panelOpenInfo.getPanelStyle())), i2));
    }

    public static void LIZIZ(Context context, String str, PromotionItem firstPromotionItem, C119774mz c119774mz, List list, LinearLayout linearLayout, java.util.Map map) {
        Integer style;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(firstPromotionItem, "firstPromotionItem");
        if (LJII(firstPromotionItem)) {
            linearLayout.setVisibility(0);
            LJIIJ(context, firstPromotionItem, linearLayout);
            c119774mz.setVisibility(8);
            return;
        }
        Integer style2 = firstPromotionItem.getStyle();
        if ((style2 == null || style2.intValue() != 6) && ((style = firstPromotionItem.getStyle()) == null || style.intValue() != 12)) {
            linearLayout.setVisibility(8);
            ((ArrayList) list).add(firstPromotionItem);
            c119774mz.setVisibility(0);
            C70648Ro4.LIZ(c119774mz, list, EnumC70206Rgw.PDP, new ViewGroup.MarginLayoutParams(-2, -1), 0, 44);
            return;
        }
        linearLayout.setVisibility(0);
        LIZ(context, str, firstPromotionItem, linearLayout, map);
        c119774mz.setVisibility(8);
    }
}
