package X;

import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.core.da.HeaderBannerDaInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RiZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70307RiZ {
    public static final LinkedHashMap<String, Object> LIZ = new LinkedHashMap<>();

    public static void LIZ(SkuPanelStarter.SkuEnterParams skuEnterParams) {
        Integer bizType;
        HashMap<String, Object> trackParams;
        LinkedHashMap<String, Object> linkedHashMap = LIZ;
        if (skuEnterParams != null && (trackParams = skuEnterParams.getTrackParams()) != null) {
            linkedHashMap.putAll(trackParams);
        }
        linkedHashMap.put("is_fullscreen", 0);
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "sku");
        if (skuEnterParams != null && (bizType = skuEnterParams.getBizType()) != null) {
            linkedHashMap.put("biz_type", Integer.valueOf(bizType.intValue()));
        }
        C1DF.LIZJ(linkedHashMap, true, null, false, null);
    }

    public static void LJFF(ProductPackStruct product) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        List<PromotionItem> list;
        String str7;
        ProductPrice productPrice;
        ProductPrice productPrice2;
        ProductPrice productPrice3;
        o.LJIIIZ(product, "product");
        LinkedHashMap<String, Object> linkedHashMap = LIZ;
        Integer num = product.status;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 1;
        }
        linkedHashMap.put("product_type", String.valueOf(i));
        ProductBase productBase = product.baseInfo;
        String str8 = null;
        if (productBase != null && (productPrice3 = productBase.priceInfo) != null) {
            str = productPrice3.originPrice;
            if (str != null && str.length() == 0) {
                str = null;
            }
        } else {
            str = null;
        }
        ProductBase productBase2 = product.baseInfo;
        if (productBase2 != null && (productPrice2 = productBase2.priceInfo) != null) {
            str2 = productPrice2.realPrice;
            if (str2 != null && str2.length() == 0) {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        ProductBase productBase3 = product.baseInfo;
        if (productBase3 != null && (productPrice = productBase3.priceInfo) != null) {
            str3 = productPrice.discount;
            if (str3 != null && str3.length() == 0) {
                str3 = null;
            }
        } else {
            str3 = null;
        }
        String str9 = "";
        if (str == null) {
            if (str3 != null || str2 == null) {
                str = "";
            } else {
                str = str2;
            }
        }
        linkedHashMap.put("original_price", str);
        if (str3 != null) {
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("sale_price", str2);
        }
        java.util.Map<String, String> map = product.extra;
        if (map == null || map.get("mix_product_type") == null) {
            str4 = "";
        } else {
            java.util.Map<String, String> map2 = product.extra;
            if (map2 != null) {
                str7 = map2.get("mix_product_type");
            } else {
                str7 = null;
            }
            str4 = String.valueOf(str7);
        }
        linkedHashMap.put("is_mix_product", str4);
        WarehouseTag warehouseTag = product.warehouseTag;
        if (warehouseTag != null) {
            String str10 = warehouseTag.fulfilledBy;
            if (str10 != null) {
                str9 = str10;
            }
            linkedHashMap.put("fulfilled_by", str9);
        } else {
            linkedHashMap.put("fulfilled_by", "no_label");
        }
        ArrayList arrayList = new ArrayList();
        PickTag pickTag = product.activityInfo;
        if (pickTag != null) {
            str8 = pickTag.logExtra;
        }
        HashMap<String, Object> LJII = C27739Aud.LJII(str8);
        if (LJII != null) {
            arrayList.add(LJII);
        }
        PromotionView promotionView = product.promotionView;
        if (promotionView != null && (list = promotionView.promotion_items) != null) {
            Iterator<PromotionItem> it = list.iterator();
            while (it.hasNext()) {
                HashMap<String, Object> LJII2 = C27739Aud.LJII(it.next().getLog_extra());
                if (LJII2 != null) {
                    arrayList.add(LJII2);
                }
            }
        }
        LinkedHashMap<String, Object> linkedHashMap2 = LIZ;
        C70437Rkf.LIZ(arrayList, linkedHashMap2);
        ProductBase productBase4 = product.baseInfo;
        if (productBase4 != null) {
            String str11 = productBase4.title;
            if (str11 != null) {
                linkedHashMap2.put("product_name", str11);
            }
            String str12 = productBase4.categoryName;
            if (str12 != null) {
                linkedHashMap2.put("product_category", str12);
            }
        }
        SellerInfo sellerInfo = product.sellerInfo;
        if (sellerInfo != null && (str6 = sellerInfo.sellerId) != null) {
            linkedHashMap2.put("shop_id", str6);
        }
        List<SkuItem> list2 = product.skus;
        String str13 = CardStruct.IStatusCode.DEFAULT;
        if (list2 != null) {
            Iterator<SkuItem> it2 = list2.iterator();
            while (it2.hasNext()) {
                Integer num2 = it2.next().skuStatus;
                if (num2 != null && num2.intValue() == 2) {
                    str13 = "1";
                }
            }
        }
        LinkedHashMap<String, Object> linkedHashMap3 = LIZ;
        linkedHashMap3.put("is_sku_sold_out", str13);
        if (product.LIZLLL()) {
            str5 = "skc_version";
        } else {
            str5 = "sku_version";
        }
        linkedHashMap3.put("ttf_page_type", str5);
        Integer num3 = product.bizType;
        if (num3 != null) {
            C61845OOz.LIZLLL(num3, linkedHashMap3, "biz_type");
        }
    }

    public static void LJ(SkuItem skuItem, Boolean bool, Integer num, Integer num2) {
        String str;
        String str2;
        java.util.Map LJJLIL = C113554cx.LJJLIL(LIZ);
        LJJLIL.put("button_name", "sku_select");
        if (skuItem != null && (str2 = skuItem.skuId) != null && !ujb.o.LJJJJJL(str2)) {
            LJJLIL.put("sku_id", str2);
        }
        if (num != null) {
            LJJLIL.put("pdp_sku_attr_rank", Integer.valueOf(num.intValue()));
        }
        if (num2 != null) {
            LJJLIL.put("pdp_sku_value_rank", Integer.valueOf(num2.intValue()));
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            str = "select";
        } else {
            str = "cancel";
        }
        LJJLIL.put("select_type", str);
        C76542zS.LIZ("tiktokec_button_click", LJJLIL);
    }

    public static void LIZLLL(int i, long j, SkuItem skuItem, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        C76542zS.LIZJ("tiktokec_stay_page", new C70346RjC(i, j, skuItem, str2, str, str3, str4, str5, str6, z));
    }

    public static void LIZIZ(String str, String str2, Integer num, String str3, String str4, String str5, java.util.Map map, java.util.Map map2, C70354RjK c70354RjK, Boolean bool, HeaderBannerDaInfo headerBannerDaInfo, String str6, String str7, int i) {
        java.util.Map map3 = map2;
        java.util.Map map4 = map;
        C70354RjK c70354RjK2 = c70354RjK;
        Boolean bool2 = bool;
        HeaderBannerDaInfo headerBannerDaInfo2 = headerBannerDaInfo;
        String str8 = str6;
        String str9 = null;
        if ((i & 64) != 0) {
            map4 = null;
        }
        if ((i & 128) != 0) {
            map3 = null;
        }
        if ((i & 256) != 0) {
            c70354RjK2 = null;
        }
        if ((i & 512) != 0) {
            bool2 = null;
        }
        if ((i & 1024) != 0) {
            headerBannerDaInfo2 = null;
        }
        if ((i & 2048) != 0) {
            str8 = null;
        }
        if ((i & 4096) == 0) {
            str9 = str7;
        }
        if (map4 == null) {
            map4 = LIZ;
        }
        C76542zS.LIZJ("tiktokec_confirm_cart", new C70349RjF(c70354RjK2, headerBannerDaInfo2, bool2, num, str, str2, str3, str4, str5, str8, str9, map4, map3));
    }

    public static void LIZJ(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, Integer num3, Integer num4, Integer num5, String str6, String str7, java.util.Map map, String str8, java.util.Map map2, Integer num6, String str9, String str10, String str11, C70354RjK c70354RjK, Boolean bool, HeaderBannerDaInfo headerBannerDaInfo, String str12, Boolean bool2, int i) {
        String str13 = str10;
        String str14 = str9;
        Integer num7 = num6;
        java.util.Map map3 = map2;
        java.util.Map map4 = map;
        String str15 = str8;
        String str16 = str11;
        C70354RjK c70354RjK2 = c70354RjK;
        Boolean bool3 = bool;
        HeaderBannerDaInfo headerBannerDaInfo2 = headerBannerDaInfo;
        String str17 = str12;
        Boolean bool4 = null;
        if ((i & 4096) != 0) {
            map4 = null;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str15 = null;
        }
        if ((i & 16384) != 0) {
            map3 = null;
        }
        if ((32768 & i) != 0) {
            num7 = null;
        }
        if ((65536 & i) != 0) {
            str14 = null;
        }
        if ((131072 & i) != 0) {
            str13 = null;
        }
        if ((262144 & i) != 0) {
            str16 = null;
        }
        if ((524288 & i) != 0) {
            c70354RjK2 = null;
        }
        if ((1048576 & i) != 0) {
            bool3 = null;
        }
        if ((2097152 & i) != 0) {
            headerBannerDaInfo2 = null;
        }
        if ((4194304 & i) != 0) {
            str17 = null;
        }
        if ((i & 8388608) == 0) {
            bool4 = bool2;
        }
        C76542zS.LIZJ("tiktokec_confirm_cart_result", new C70348RjE(c70354RjK2, headerBannerDaInfo2, bool4, bool3, num, num2, num3, num4, num5, num7, str, str2, str3, str4, str5, str15, str6, str7, str14, str13, str16, str17, map4, map3));
    }
}
