package X;

import Y.ARunnableS8S0200100_12;
import Y.AfS21S1200000_12;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BlockPageInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicPage;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.GlobalWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.EcUgPopupService;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSource;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS8S0111000_12;
import kotlin.jvm.internal.AqS99S0101000_12;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* renamed from: X.RdX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69995RdX extends AbstractC73313Spx implements InterfaceC70070Rek {
    public static long LJLJJLL;
    public static final C69995RdX LJLILLLLZI = new C69995RdX();
    public static final C70098RfC LJLJI = new C70098RfC();
    public static final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C70004Rdg.LJLIL);
    public static final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C70003Rdf.LJLIL);
    public static long LJLJL = -1;
    public static final HashMap<String, C70006Rdi> LJLJLJ = new HashMap<>();
    public static final HashMap<String, C70006Rdi> LJLJLLL = new HashMap<>();

    public static void LLLLZ(IPdpStarter.PdpEnterParam pdpEnterParam) {
        HashMap<String, Object> trackParams = pdpEnterParam.getTrackParams();
        if (trackParams != null && trackParams.containsKey("traffic_source_list")) {
            HashMap<String, Object> trackParams2 = pdpEnterParam.getTrackParams();
            Object obj = null;
            if (trackParams2 != null) {
                obj = trackParams2.get("traffic_source_list");
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        Object opt = jSONArray.opt(i);
                        if (opt instanceof Number) {
                            arrayList.add(Integer.valueOf(((Number) opt).intValue()));
                        }
                    }
                    if (C1GE.LJIILIIL(arrayList)) {
                        pdpEnterParam.getRequestParams().put("traffic_source_list", arrayList);
                        return;
                    }
                    return;
                }
                return;
            }
            if (obj instanceof ArrayList) {
                ArrayList arrayList2 = (ArrayList) obj;
                if (arrayList2 != null && C1GE.LJIILIIL(arrayList2)) {
                    pdpEnterParam.getRequestParams().put("traffic_source_list", arrayList2);
                    return;
                }
                return;
            }
            if (obj instanceof String) {
                try {
                    List LIZLLL = C75792yF.LIZLLL(Integer[].class, (String) obj);
                    if (C1GE.LJIILIIL(LIZLLL)) {
                        pdpEnterParam.getRequestParams().put("traffic_source_list", LIZLLL);
                    }
                } catch (Exception e) {
                    C78983UzD.LJIIZILJ(e);
                }
            }
        }
    }

    public static java.util.Map LLLLZIL(IPdpStarter.PdpEnterParam pdpEnterParam) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> trackParams = pdpEnterParam.getTrackParams();
        if (trackParams != null && (obj = trackParams.get("author_id")) != null) {
            linkedHashMap.put("kol_id", obj);
        }
        linkedHashMap.put("promotion_response_style", 1);
        return linkedHashMap;
    }

    public static void LLLZL(ProductInfoPackData productInfoPackData) {
        List<BrickInfo> list;
        List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab> list2;
        if (productInfoPackData == null || productInfoPackData.productionInfoPack == null || productInfoPackData.productionInfoPack.isEmpty()) {
            return;
        }
        for (ProductPackStruct productPackStruct : productInfoPackData.productionInfoPack) {
            productPackStruct.cartEntry = productInfoPackData.cartEntry;
            productPackStruct.hasPayMethod = productInfoPackData.hasPayMethod;
            productPackStruct.hasShippingAddress = productInfoPackData.hasShippingAddress;
            productPackStruct.schemaInfo = productInfoPackData.schemaInfo;
            productPackStruct.productUnavailableInfo = productInfoPackData.productUnavailableInfo;
            DynamicPage dynamicPage = productInfoPackData.dynamicPage;
            if (dynamicPage != null) {
                list = dynamicPage.bricks;
            } else {
                list = null;
            }
            productPackStruct.bricks = list;
            if (dynamicPage != null) {
                list2 = dynamicPage.tabs;
            } else {
                list2 = null;
            }
            productPackStruct.tabs = list2;
            productPackStruct.favorite = productInfoPackData.favorite;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LLLLZLLLI(IPdpStarter.PdpEnterParam pdpEnterParam, RYH ryh) {
        ProductInfoPackData productInfoPackData;
        List<ProductPackStruct> list;
        ProductPackStruct productPackStruct;
        if (C52289Kfd.LIZ() && (productInfoPackData = (ProductInfoPackData) ryh.data) != null && (list = productInfoPackData.productionInfoPack) != null && (productPackStruct = (ProductPackStruct) ORZ.LJLLLL(list)) != null) {
            C70031Re7.LIZIZ(productPackStruct, pdpEnterParam.getProductId());
        }
    }

    public static void LLLZLL(IPdpStarter.PdpEnterParam pdpEnterParam, String str) {
        String str2;
        try {
            HashMap<String, String> pdpPreParam = pdpEnterParam.getPdpPreParam();
            boolean containsKey = pdpPreParam.containsKey("isPrefetchScene");
            String str3 = CardStruct.IStatusCode.DEFAULT;
            if (!containsKey) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str2 = pdpPreParam.get("isPrefetchScene");
            }
            if (pdpPreParam.containsKey("autoSchema")) {
                str3 = pdpPreParam.get("autoSchema");
            }
            if (o.LJ(str2, "1") && !o.LJ(str3, "1")) {
                LJLJLLL.remove(str);
            } else {
                LJLJLJ.remove(str);
            }
        } catch (Exception unused) {
        }
    }

    public static void LLLLZLLIL(IPdpStarter.PdpEnterParam pdpEnterParam, String str, RYH ryh) {
        String str2;
        HashMap<String, String> pdpPreParam = pdpEnterParam.getPdpPreParam();
        if (pdpPreParam.containsKey("isPrefetchScene")) {
            str2 = pdpPreParam.get("isPrefetchScene");
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        if (!o.LJ(str2, "1") && ryh.isValid()) {
            LJLJI.put(str, ryh);
        }
    }

    public static void LLLZI(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z, int i) {
        C70895Rs3 c70895Rs3 = new C70895Rs3();
        c70895Rs3.LJII(new AqS8S0111000_12(pdpEnterParam, z, i, 1));
        c70895Rs3.LIZJ(false);
        C70952Rsy c70952Rsy = new C70952Rsy();
        c70952Rsy.LJII(new AqS8S0111000_12(pdpEnterParam, z, i, 2));
        c70952Rsy.LIZJ(false);
    }

    public static void LLLZ(IPdpStarter.PdpEnterParam pdpEnterParam, ProductPackStruct productPackStruct, RYH ryh, int i, long j) {
        int i2;
        FlashSale flashSale;
        PromotionEntrance promotionEntrance;
        Integer num;
        String str;
        String str2;
        String str3;
        C69999Rdb c69999Rdb = new C69999Rdb(pdpEnterParam.getProductId());
        c69999Rdb.LJIIL(EnumC70000Rdc.COMPLETE);
        c69999Rdb.LJIIJ();
        if (productPackStruct.blockPageInfo != null) {
            HashMap<String, Object> requestParams = pdpEnterParam.getRequestParams();
            HashMap<String, Object> trackParams = pdpEnterParam.getTrackParams();
            BlockPageInfo blockPageInfo = productPackStruct.blockPageInfo;
            String str4 = blockPageInfo.message;
            if (str4 == null) {
                str4 = "";
            }
            C70001Rdd.LIZ(requestParams, trackParams, str4, String.valueOf(blockPageInfo.code), i);
        } else {
            u.LJJIIJZLJL("reponse data", pdpEnterParam.getTrackParams());
            HashMap<String, Object> requestParams2 = pdpEnterParam.getRequestParams();
            HashMap<String, Object> trackParams2 = pdpEnterParam.getTrackParams();
            long j2 = j - LJLJL;
            o.LJIIIZ(requestParams2, "requestParams");
            C70911RsJ c70911RsJ = new C70911RsJ();
            c70911RsJ.LJII(new C70016Rds(requestParams2, trackParams2, j2, i));
            c70911RsJ.LIZJ(false);
        }
        int i3 = ryh.code;
        if (i3 == 23002002) {
            i2 = 6;
        } else if (i3 == 23002102) {
            i2 = 5;
        } else {
            if (productPackStruct.blockPageInfo != null) {
                i2 = 8;
            }
            if (productPackStruct.globalWaistBanner == null && (str3 = productPackStruct.productId) != null) {
                C70646Ro2 LIZ = C70077Rer.LIZ(str3);
                GlobalWaistBanner globalWaistBanner = productPackStruct.globalWaistBanner;
                o.LJIIIZ(globalWaistBanner, "globalWaistBanner");
                LIZ.LJFF.post(new ARunnableS8S0200100_12(LIZ, C32151Nz.LJJIZ(globalWaistBanner), 1000L, 0));
                return;
            }
            flashSale = productPackStruct.flashSale;
            if (flashSale == null && (str2 = productPackStruct.productId) != null) {
                C70646Ro2 LIZ2 = C70077Rer.LIZ(str2);
                LIZ2.LJFF.post(new ARunnableS8S0200100_12(LIZ2, flashSale, 1000L, 0));
                return;
            }
            promotionEntrance = productPackStruct.promotionEntrance;
            if (promotionEntrance != null || (num = promotionEntrance.entranceStyle) == null || num.intValue() != 1 || (str = productPackStruct.productId) == null || productPackStruct.promotionEntrance == null) {
                return;
            }
            C70646Ro2 LIZ3 = C70077Rer.LIZ(str);
            PromotionEntrance promotion = productPackStruct.promotionEntrance;
            o.LJIIIZ(promotion, "promotion");
            LIZ3.LJFF.post(new ARunnableS8S0200100_12(LIZ3, C32151Nz.LJJJ(promotion), 1000L, 0));
            return;
        }
        C70900Rs8 c70900Rs8 = new C70900Rs8();
        c70900Rs8.LJII(new AqS99S0101000_12(i2, pdpEnterParam, 25));
        c70900Rs8.LIZJ(false);
        if (productPackStruct.globalWaistBanner == null) {
        }
        flashSale = productPackStruct.flashSale;
        if (flashSale == null) {
        }
        promotionEntrance = productPackStruct.promotionEntrance;
        if (promotionEntrance != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C70006Rdi LLLZIL(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z, int i, boolean z2, Boolean bool, Boolean bool2) {
        String str;
        List list;
        PageSourceInfo LIZJ;
        java.util.Map map;
        String str2;
        HashMap<String, C70006Rdi> hashMap;
        String str3;
        ProductPackStruct productPackStruct;
        ProductInfoPackData productInfoPackData;
        List<ProductPackStruct> list2;
        int i2;
        List list3;
        Object obj;
        int LIZ;
        long longValue;
        String str4 = CardStruct.IStatusCode.DEFAULT;
        C69999Rdb c69999Rdb = new C69999Rdb(pdpEnterParam.getProductId());
        c69999Rdb.LJIIL(EnumC70000Rdc.START);
        c69999Rdb.LJIIJ();
        Object clone = pdpEnterParam.getRequestParams().clone();
        o.LJII(clone, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.Any> }");
        Object clone2 = pdpEnterParam.getPdpPreParam().clone();
        o.LJII(clone2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
        IPdpStarter.PdpEnterParam copy$default = IPdpStarter.PdpEnterParam.copy$default(pdpEnterParam, (HashMap) clone, null, null, null, false, null, 0.0f, null, false, false, false, null, null, (HashMap) clone2, null, null, null, null, 253950, null);
        String LJI = C27739Aud.LJI(copy$default.getRequestParams());
        RYH LIZIZ = LJLJI.LIZIZ(LJI);
        if (!o.LJ(bool, Boolean.TRUE) ? LIZIZ == null || !LIZIZ.isValid() || SystemClock.elapsedRealtime() - LIZIZ.LJLIL > RYH.LJLILLLLZI : LIZIZ == null) {
            str = "tt_pdp_full";
        } else {
            str = "tt_pdp_dynamic";
        }
        copy$default.getRequestParams().put("template", str);
        Object obj2 = copy$default.getRequestParams().get("product_id");
        if ((obj2 instanceof List) && (list3 = (List) obj2) != null && (obj = ListProtector.get(list3, 0)) != null) {
            HashMap<String, Object> productEnterContext = copy$default.getProductEnterContext();
            if (productEnterContext != null && productEnterContext.get(obj) != null) {
                Object obj3 = copy$default.getProductEnterContext().get(obj);
                o.LJII(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                if (((java.util.Map) obj3).get("enter_source_type") != null) {
                    Object obj4 = copy$default.getProductEnterContext().get(obj);
                    o.LJII(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                    Object obj5 = ((java.util.Map) obj4).get("enter_source_type");
                    o.LJI(obj5);
                    Class<?> cls = obj5.getClass();
                    if (o.LJ(cls, Integer.class)) {
                        LIZ = ((Integer) obj5).intValue();
                    } else if (o.LJ(cls, Short.class)) {
                        LIZ = ((Short) obj5).shortValue();
                    } else {
                        if (o.LJ(cls, Long.class)) {
                            longValue = ((Long) obj5).longValue();
                        } else if (o.LJ(cls, Integer.TYPE)) {
                            LIZ = ((Integer) obj5).intValue();
                        } else if (o.LJ(cls, Short.TYPE)) {
                            LIZ = ((Short) obj5).shortValue();
                        } else if (o.LJ(cls, Long.TYPE)) {
                            longValue = ((Long) obj5).longValue();
                        } else {
                            LIZ = 0;
                        }
                        LIZ = (int) longValue;
                    }
                    copy$default.getRequestParams().put("product_source_info", C113554cx.LJJJLZIJ(new OSZ(obj, Integer.valueOf(LIZ))));
                }
            }
            C70101RfF c70101RfF = IPdpStarter.LIZ;
            HashMap<String, Object> trackParams = pdpEnterParam.getTrackParams();
            c70101RfF.getClass();
            LIZ = C70101RfF.LIZ(trackParams);
            copy$default.getRequestParams().put("product_source_info", C113554cx.LJJJLZIJ(new OSZ(obj, Integer.valueOf(LIZ))));
        }
        HashMap<String, Object> requestParams = copy$default.getRequestParams();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj6 = copy$default.getRequestParams().get("product_id");
        if (obj6 instanceof List) {
            list = (List) obj6;
        } else {
            list = null;
        }
        if (list != null) {
            for (Object obj7 : list) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (i != 0) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                linkedHashMap2.put("req_type", Integer.valueOf(i2));
                if (copy$default.getProductEnterContext() != null && copy$default.getProductEnterContext().get(obj7) != null) {
                    Object obj8 = copy$default.getProductEnterContext().get(obj7);
                    o.LJII(obj8, "null cannot be cast to non-null type kotlin.collections.Map<out kotlin.String, kotlin.Any>");
                    linkedHashMap2.putAll((java.util.Map) obj8);
                }
                linkedHashMap.put(obj7, linkedHashMap2);
            }
        }
        requestParams.put("product_enter_context", linkedHashMap);
        LLLLZ(copy$default);
        if (i == 4) {
            LIZJ = C39468FeK.LJ(new PageSource(EnumC63755P0l.LIVE_PAGE.getPageCode(), null, 2, null));
        } else if (EcUgPopupService.LJIILJJIL().LIZLLL(copy$default.getTrackParams())) {
            String pageCode = EnumC63755P0l.PDP_PAGE.getPageCode();
            if (EcUgPopupService.LJIILJJIL().LJ(copy$default.getTrackParams())) {
                map = C113554cx.LJJLIIIIJ(new OSZ("ec_is_video_page", "1"));
            } else {
                map = null;
            }
            LIZJ = C39468FeK.LJ(new PageSource(pageCode, map));
        } else if (o.LJ(bool2, Boolean.TRUE)) {
            LIZJ = C39468FeK.LJ(new PageSource(EnumC63755P0l.PDP_PAGE.getPageCode(), null, 2, null));
            copy$default.getRequestParams().put("request_scene", 1);
        } else {
            LIZJ = C39468FeK.LIZJ();
        }
        if (LIZJ != null) {
            copy$default.getRequestParams().put("page_source_info", C27739Aud.LJI(LIZJ));
        }
        HashMap<String, Object> requestParams2 = copy$default.getRequestParams();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        C26943Ahn.LIZ.getClass();
        linkedHashMap4.put("ecom_logistic_display_opt", Integer.valueOf(C26943Ahn.LIZ() ? 1 : 0));
        linkedHashMap4.put("display_history_shipday", Integer.valueOf(C26945Ahp.LIZ() ? 1 : 0));
        linkedHashMap3.put("param", linkedHashMap4);
        requestParams2.put("experiment", linkedHashMap3);
        copy$default.getRequestParams().put("biz_template", Integer.valueOf(C27206Am2.LJ(C78866UxK.LJJZZIII(pdpEnterParam.getBizType()), "product_detail", null)));
        List<Region> list4 = C27090AkA.LJLJJI;
        if (list4 != null) {
            copy$default.getRequestParams().put("ship_to_addr", list4);
        }
        String str5 = C27090AkA.LJLILLLLZI;
        if (str5 != null) {
            copy$default.getRequestParams().put("selected_address_id", str5);
        }
        copy$default.getRequestParams().putAll(LLLLZIL(pdpEnterParam));
        try {
            HashMap<String, String> pdpPreParam = pdpEnterParam.getPdpPreParam();
            if (pdpPreParam.containsKey("isPrefetchScene")) {
                str2 = pdpPreParam.get("isPrefetchScene");
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            if (o.LJ(str2, "1")) {
                hashMap = LJLJLLL;
            } else {
                hashMap = LJLJLJ;
            }
            C70006Rdi c70006Rdi = hashMap.get(LJI);
            if (o.LJ(str2, "1")) {
                if (c70006Rdi != null) {
                    if (z2) {
                        LJLJLLL.remove(LJI);
                        return c70006Rdi;
                    }
                    return c70006Rdi;
                }
                if (pdpPreParam.containsKey("autoSchema")) {
                    str3 = pdpPreParam.get("autoSchema");
                } else {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                if (o.LJ(str3, "1")) {
                    if (LIZIZ == null || (productInfoPackData = (ProductInfoPackData) LIZIZ.data) == null || (list2 = productInfoPackData.productionInfoPack) == null) {
                        productPackStruct = null;
                    } else {
                        productPackStruct = (ProductPackStruct) ListProtector.get(list2, 0);
                    }
                    return new C70006Rdi(LJI, 4, new C70002Rde(), productPackStruct);
                }
            } else if (c70006Rdi != null) {
                if (z2) {
                    LJLJLJ.remove(LJI);
                    return c70006Rdi;
                }
                return c70006Rdi;
            }
        } catch (Exception unused) {
        }
        C73454SsE LJJJ = new C73338SqM(((R30) LJLJJI.getValue()).LIZ(copy$default).LJJL(T16.LIZ()).LJJJJJ(1L).LJJIJL(new C69678RWg(str, LIZIZ, pdpEnterParam, LJI)).LJJIJL(new RYK(i, copy$default)).LJIJJ(new C69996RdY(pdpEnterParam, copy$default, i, LJI)).LJIL(new RYL(copy$default, z, i)).LJJJJIZL()).LJJJ(C73969T1h.LIZIZ());
        C70006Rdi c70006Rdi2 = new C70006Rdi(LJI, i, LJJJ, null);
        LJJJ.LJJJLIIL(new AfS21S1200000_12(LJI, c70006Rdi2, copy$default, 1), RXS.LJLIL);
        LJLJJLL = SystemClock.elapsedRealtime();
        if (!z && !z2) {
            HashMap<String, String> pdpPreParam2 = copy$default.getPdpPreParam();
            if (pdpPreParam2.containsKey("isPrefetchScene")) {
                str4 = pdpPreParam2.get("isPrefetchScene");
            }
            if (o.LJ(str4, "1")) {
                LJLJLLL.put(LJI, c70006Rdi2);
            } else {
                LJLJLJ.put(LJI, c70006Rdi2);
            }
        }
        return c70006Rdi2;
    }
}
