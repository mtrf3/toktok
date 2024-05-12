package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.RjL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70355RjL {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(RXX rxx, java.util.Map map) {
        o.LJIIIZ(rxx, "<this>");
        String str = rxx.LIZJ;
        if (str != null) {
            map.put("currency", str);
        }
        Float f = rxx.LIZ;
        if (f != null) {
            map.put("sale_price_value", Float.valueOf(f.floatValue()));
        }
        Float f2 = rxx.LIZIZ;
        if (f2 != null) {
            map.put("original_price_value", Float.valueOf(f2.floatValue()));
        }
    }

    public static void LIZJ(C70356RjM c70356RjM, java.util.Map map) {
        o.LJIIIZ(c70356RjM, "<this>");
        Float f = c70356RjM.LIZ;
        if (f != null) {
            map.put("total_payment", Float.valueOf(f.floatValue()));
        }
        Float f2 = c70356RjM.LIZIZ;
        if (f2 != null) {
            map.put("discounted_amount", Float.valueOf(f2.floatValue()));
        }
        Float f3 = c70356RjM.LIZJ;
        if (f3 != null) {
            map.put("total_tax", Float.valueOf(f3.floatValue()));
        }
        String str = c70356RjM.LIZLLL;
        if (str != null) {
            map.put("summary_info", str);
            map.put("order_summary_info", str);
        }
        Float f4 = c70356RjM.LJ;
        if (f4 != null) {
            map.put("shipping_price", Float.valueOf(f4.floatValue()));
        }
        Float f5 = c70356RjM.LJFF;
        if (f5 != null) {
            map.put("discounted_shipping_price", Float.valueOf(f5.floatValue()));
        }
    }

    public static void LIZLLL(C70354RjK c70354RjK, C27943Axv daMap) {
        o.LJIIIZ(daMap, "daMap");
        String str = c70354RjK.LIZIZ;
        if (str != null) {
            daMap.LIZLLL("original_price", str);
        }
        Float f = c70354RjK.LIZ;
        if (f != null) {
            daMap.LIZLLL("original_price_value", Float.valueOf(f.floatValue()));
        }
        String str2 = c70354RjK.LIZLLL;
        if (str2 != null) {
            daMap.LIZLLL("sale_price", str2);
        }
        Float f2 = c70354RjK.LIZJ;
        if (f2 != null) {
            daMap.LIZLLL("sale_price_value", Float.valueOf(f2.floatValue()));
        }
        String str3 = c70354RjK.LJ;
        if (str3 != null) {
            daMap.LIZLLL("currency", str3);
        }
    }

    public static void LIZ(C27943Axv c27943Axv, java.util.Map commonParams, ProductPackStruct productPackStruct, SkuPrice skuPrice, int i, String str) {
        String str2;
        String str3;
        String str4;
        float f;
        Object obj;
        SellerInfo sellerInfo;
        Object obj2;
        Price price;
        Price price2;
        String priceVal;
        Float LJJIJLIJ;
        Price price3;
        String priceVal2;
        Float LJJIJLIJ2;
        ProductBase productBase;
        o.LJIIIZ(c27943Axv, "<this>");
        o.LJIIIZ(commonParams, "commonParams");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("author_id", commonParams.get("author_id"));
        Object obj3 = commonParams.get("source_page_type");
        if (o.LJ(obj3, "video")) {
            str2 = "ShortVideo";
        } else if (o.LJ(obj3, "live")) {
            str2 = "Live";
        } else if (o.LJ(obj3, "show_window")) {
            str2 = "ShowCase";
        } else {
            str2 = "Else";
        }
        jSONObject.put("screen_refer", str2);
        Object obj4 = commonParams.get("source_page_type");
        if (o.LJ(obj4, "video")) {
            jSONObject.put("feed_id", commonParams.get("source_content_id"));
        } else if (o.LJ(obj4, "live")) {
            if (commonParams.get("room_id") != null) {
                jSONObject.put("room_id", commonParams.get("room_id"));
            } else {
                jSONObject.put("room_id", commonParams.get("source_content_id"));
            }
        } else {
            jSONObject.put("source_page_type", commonParams.get("source_content_id"));
        }
        Object obj5 = "";
        if (productPackStruct == null || (str3 = productPackStruct.productId) == null) {
            str3 = "";
        }
        jSONObject.put("content_id", str3);
        if (productPackStruct == null || (productBase = productPackStruct.baseInfo) == null || (str4 = productBase.title) == null) {
            str4 = "";
        }
        jSONObject.put("content_name", str4);
        jSONObject.put("quantity", i);
        float f2 = 0.0f;
        if (skuPrice != null && (price3 = skuPrice.realPrice) != null && (priceVal2 = price3.getPriceVal()) != null && (LJJIJLIJ2 = C38350F3i.LJJIJLIJ(priceVal2)) != null) {
            f = LJJIJLIJ2.floatValue();
        } else {
            f = 0.0f;
        }
        jSONObject.put("discount_price", Float.valueOf(f));
        jSONObject.put("content_type", "product");
        jSONObject.put("page_type", str);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        c27943Axv.LIZJ("contents", jSONArray);
        if (skuPrice != null && (price2 = skuPrice.realPrice) != null && (priceVal = price2.getPriceVal()) != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(priceVal)) != null) {
            f2 = LJJIJLIJ.floatValue();
        }
        c27943Axv.LIZJ("value", Float.valueOf(f2 * i));
        c27943Axv.LIZJ("quantity", Integer.valueOf(i));
        if (skuPrice == null || (price = skuPrice.realPrice) == null || (obj = price.getCurrency()) == null) {
            obj = "";
        }
        c27943Axv.LIZJ("currency", obj);
        c27943Axv.LIZJ("is_ad_signal", 1);
        if (productPackStruct != null && (sellerInfo = productPackStruct.sellerInfo) != null && (obj2 = sellerInfo.sellerId) != null) {
            obj5 = obj2;
        }
        c27943Axv.LIZJ("shop_id", obj5);
    }
}
