package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.model.PanelOpenInfo;
import com.ss.android.ugc.aweme.ecommerce.model.PriceDaInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.EcUgVSAData;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
import ujb.o;

/* loaded from: classes11.dex */
public final class OLG {
    public static final OLG LIZ = new OLG();

    public static boolean LJ(String str) {
        if (o.LJJJJJL(str)) {
            return false;
        }
        try {
            android.net.Uri parse = UriProtector.parse(str);
            String host = parse.getHost();
            String path = parse.getPath();
            if (kotlin.jvm.internal.o.LJ("ec", host) && kotlin.jvm.internal.o.LJ("/plp", path) && o.LJJJJJL(ED3.LJ(parse, "plp_cache_key"))) {
                OLH.LJ(EnumC61741OKz.JUMP.getValue(), false, 0, "plp no cache", null, null, null, 116);
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static ShopWindowAnchorModel LIZ(VSAProductCardsResponse.ProductDetail productDetail, String str) {
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        List<String> urls;
        List<String> urls2;
        String productId = productDetail.getProductId();
        if (productId == null || o.LJJJJJL(productId)) {
            z = true;
        } else {
            z = false;
        }
        ShopWindowAnchorModel shopWindowAnchorModel = null;
        if (z) {
            return null;
        }
        Long LJJIZ = C38350F3i.LJJIZ(productId);
        if (LJJIZ != null) {
            long longValue = LJJIZ.longValue();
            try {
                VSAProductCardsResponse.PriceDetail price = productDetail.getPrice();
                if (price != null) {
                    str2 = price.getMinOriginPriceValue();
                } else {
                    str2 = null;
                }
                VSAProductCardsResponse.PriceDetail price2 = productDetail.getPrice();
                if (price2 != null) {
                    str3 = price2.getMinRealPriceValue();
                } else {
                    str3 = null;
                }
                VSAProductCardsResponse.PriceDetail price3 = productDetail.getPrice();
                if (price3 != null) {
                    str4 = price3.getCurrency();
                } else {
                    str4 = null;
                }
                PriceDaInfo priceDaInfo = new PriceDaInfo(str2, str3, str4);
                VSAProductCardsResponse.PriceDetail price4 = productDetail.getPrice();
                if (price4 != null) {
                    str5 = price4.getMinOriginPriceValue();
                } else {
                    str5 = null;
                }
                VSAProductCardsResponse.PriceDetail price5 = productDetail.getPrice();
                if (price5 != null) {
                    str6 = price5.getMinRealPriceValue();
                } else {
                    str6 = null;
                }
                VSAProductCardsResponse.PriceDetail price6 = productDetail.getPrice();
                if (price6 != null) {
                    str7 = price6.getCurrency();
                } else {
                    str7 = null;
                }
                ProductBase productBase = new ProductBase(new ProductPrice(str5, str6, str7, null, priceDaInfo.toString(), 8, null), null, null, null, 14, null);
                int bizType = productDetail.getBizType();
                String LJJJJZ = o.LJJJJZ(o.LJJJJZ(str, "__PRODUCT_ID_PLACEHOLDER__", productId, false), "__BIZ_TYPE_PLACEHOLDER__", String.valueOf(bizType), false);
                Long valueOf = Long.valueOf(longValue);
                String LIZ2 = ED2.LIZ(productDetail.getTitle());
                Image image = productDetail.getImage();
                if (image != null && (urls2 = image.getUrls()) != null) {
                    str8 = (String) ORZ.LJLLLL(urls2);
                } else {
                    str8 = null;
                }
                Image image2 = productDetail.getImage();
                if (image2 != null && (urls = image2.getUrls()) != null) {
                    str9 = (String) ORZ.LJLLLL(urls);
                } else {
                    str9 = null;
                }
                ShopWindowExtraModel shopWindowExtraModel = new ShopWindowExtraModel(null, valueOf, LIZ2, null, 0, null, str8, str9, 5, LJJJJZ, null, null, null, null, null, productBase, productDetail.getStatus(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(bizType), -1147847, 0, null);
                shopWindowAnchorModel = null;
                return new ShopWindowAnchorModel(C27739Aud.LJI(shopWindowExtraModel), shopWindowExtraModel, null, productId, Integer.valueOf(EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE()), null, null, null, 228, null);
            } catch (Throwable unused) {
            }
        }
        return shopWindowAnchorModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2 A[Catch: all -> 0x00d8, TryCatch #0 {all -> 0x00d8, blocks: (B:15:0x002d, B:17:0x003b, B:18:0x0040, B:20:0x0055, B:21:0x005a, B:26:0x0075, B:27:0x007a, B:29:0x0082, B:30:0x0087, B:32:0x008d, B:39:0x009e, B:40:0x00a3, B:42:0x00d2, B:51:0x0064, B:52:0x006a), top: B:14:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(java.lang.String r13, com.ss.android.ugc.aweme.feed.model.Aweme r14, java.lang.String r15) {
        /*
            java.lang.String r2 = "trackParams"
            java.lang.String r8 = "product_id"
            java.lang.String r3 = "__PRODUCT_ID_PLACEHOLDER__"
            java.lang.String r6 = "requestParams"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r14.getAwemeRawAd()
            r12 = 0
            if (r0 == 0) goto L2b
            com.ss.android.ugc.aweme.feed.model.EcUgVSAData r0 = r0.getEcUgVSAData()
            if (r0 == 0) goto L2b
            java.lang.String r11 = r0.getPdpTemplateUrl()
        L19:
            r10 = 1
            r9 = 0
            if (r11 == 0) goto L23
            boolean r0 = ujb.o.LJJJJJL(r11)
            if (r0 == 0) goto L29
        L23:
            r0 = 1
        L24:
            if (r0 == 0) goto L2d
            java.lang.String r0 = ""
            return r0
        L29:
            r0 = 0
            goto L24
        L2b:
            r11 = r12
            goto L19
        L2d:
            android.net.Uri r4 = com.bytedance.mt.protector.impl.UriProtector.parse(r11)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r1 = X.ED3.LJ(r4, r6)     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = ujb.o.LJJJJJL(r1)     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L6a
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld8
            r7.<init>()     // Catch: java.lang.Throwable -> Ld8
        L40:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Ld8
            r0.<init>()     // Catch: java.lang.Throwable -> Ld8
            r0.put(r3)     // Catch: java.lang.Throwable -> Ld8
            r7.put(r8, r0)     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r1 = X.ED3.LJ(r4, r2)     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = ujb.o.LJJJJJL(r1)     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L64
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld8
            r5.<init>()     // Catch: java.lang.Throwable -> Ld8
        L5a:
            r5.put(r8, r3)     // Catch: java.lang.Throwable -> Ld8
            boolean r0 = ujb.o.LJJJJJL(r13)     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L72
            goto L70
        L64:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld8
            r5.<init>(r1)     // Catch: java.lang.Throwable -> Ld8
            goto L5a
        L6a:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld8
            r7.<init>(r1)     // Catch: java.lang.Throwable -> Ld8
            goto L40
        L70:
            r0 = 1
            goto L73
        L72:
            r0 = 0
        L73:
            if (r0 != 0) goto L7a
            java.lang.String r0 = "previous_page"
            r5.put(r0, r13)     // Catch: java.lang.Throwable -> Ld8
        L7a:
            boolean r0 = ujb.o.LJJJJJL(r15)     // Catch: java.lang.Throwable -> Ld8
            r0 = r0 ^ 1
            if (r0 == 0) goto L87
            java.lang.String r0 = "enter_click_area"
            r5.put(r0, r15)     // Catch: java.lang.Throwable -> Ld8
        L87:
            java.lang.String r1 = r14.getAid()     // Catch: java.lang.Throwable -> Ld8
            if (r1 == 0) goto L96
            boolean r0 = ujb.o.LJJJJJL(r1)     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L94
            goto L96
        L94:
            r0 = 0
            goto L97
        L96:
            r0 = 1
        L97:
            if (r0 != 0) goto L9c
        L99:
            if (r1 == 0) goto La3
            goto L9e
        L9c:
            r1 = r12
            goto L99
        L9e:
            java.lang.String r0 = "source_content_id"
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> Ld8
        La3:
            r0 = 3
            X.OSZ[] r3 = new X.OSZ[r0]     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> Ld8
            X.OSZ r0 = new X.OSZ     // Catch: java.lang.Throwable -> Ld8
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> Ld8
            r3[r9] = r0     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> Ld8
            X.OSZ r0 = new X.OSZ     // Catch: java.lang.Throwable -> Ld8
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> Ld8
            r3[r10] = r0     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r2 = "biz_type"
            java.lang.String r0 = "__BIZ_TYPE_PLACEHOLDER__"
            X.OSZ r1 = new X.OSZ     // Catch: java.lang.Throwable -> Ld8
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> Ld8
            r0 = 2
            r3[r0] = r1     // Catch: java.lang.Throwable -> Ld8
            java.util.Map r0 = X.C113554cx.LJJL(r3)     // Catch: java.lang.Throwable -> Ld8
            android.net.Uri r0 = X.ED3.LIZJ(r4, r0)     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto Ld6
            java.lang.String r12 = r0.toString()     // Catch: java.lang.Throwable -> Ld8
        Ld6:
            if (r12 != 0) goto Ld9
        Ld8:
            return r11
        Ld9:
            r11 = r12
            goto Ld8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OLG.LIZJ(java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):java.lang.String");
    }

    public static String LJFF(Context context, VSAProductCardsResponse.ProductDetail productDetail, String str) {
        String str2;
        List<String> urls;
        if (productDetail != null && !o.LJJJJJL(str)) {
            String LIZ2 = ED2.LIZ(productDetail.getProductId());
            String LIZ3 = ED2.LIZ(productDetail.getTitle());
            VSAProductCardsResponse.PriceDetail price = productDetail.getPrice();
            Object obj = null;
            if (price != null) {
                str2 = price.getMinRealPriceValue();
            } else {
                str2 = null;
            }
            String LIZ4 = ED2.LIZ(str2);
            Image image = productDetail.getImage();
            if (image != null && (urls = image.getUrls()) != null) {
                obj = ORZ.LJLLLL(urls);
            }
            String LIZ5 = ED2.LIZ(obj);
            if (o.LJJJJJL(LIZ2) && o.LJJJJJL(LIZ3) && o.LJJJJJL(LIZ4) && o.LJJJJJL(LIZ5)) {
                return str;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("title", LIZ3);
                jSONObject.put("price", LIZ4);
                jSONObject.put("cover", LIZ5);
                jSONObject.put("id", LIZ2);
                String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
                C72264SXs.LIZ(context).LJIIIIZZ(jSONObject2, "ec_ug_vsa_pdp_cache");
                String uri = UriProtector.parse(str).buildUpon().appendQueryParameter("pdp_cache_key", "ec_ug_vsa_pdp_cache").build().toString();
                kotlin.jvm.internal.o.LJIIIIZZ(uri, "parse(pdpSchema)\n       …              .toString()");
                return uri;
            } catch (Throwable unused) {
            }
        }
        return str;
    }

    public static ProductListModel LIZIZ(String str, Aweme aweme, List list, String str2, String str3, String str4, String str5, String str6) {
        java.util.Map linkedHashMap;
        EcUgVSAData ecUgVSAData;
        try {
            HashMap<String, Object> LIZJ = C27739Aud.LIZJ(UriProtector.parse(str), "trackParams");
            if (LIZJ != null) {
                linkedHashMap = C113554cx.LJJLIL(LIZJ);
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            if (!o.LJJJJJL(str4)) {
                linkedHashMap.put("need_overlay", str4);
            }
            if (!o.LJJJJJL(str5)) {
                linkedHashMap.put("after_landing_draw", str5);
            }
            if (!o.LJJJJJL(str6)) {
                linkedHashMap.put("previous_page", str6);
            }
            if (!o.LJJJJJL(str2)) {
                linkedHashMap.put("enter_click_area", str2);
            }
            String LIZ2 = ED2.LIZ(linkedHashMap.get("traffic_source_list"));
            if (!o.LJJJJJL(LIZ2)) {
                aweme.appendMobParam("traffic_source_list", LIZ2);
            }
            PanelOpenInfo panelOpenInfo = new PanelOpenInfo(1, "ug_mall", 0, false, 4);
            String LIZ3 = ED2.LIZ(linkedHashMap.get("enter_from"));
            if (o.LJJJJJL(LIZ3)) {
                LIZ3 = "fyp_vsa_shoptab";
            }
            String value = OLI.AD_MULTI_BUBBLE.getValue();
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (ecUgVSAData = awemeRawAd.getEcUgVSAData()) != null) {
                Integer adType = ecUgVSAData.getAdType();
                int value2 = OL7.COMMERCIALIZE_PRODUCT_CARD.getValue();
                if (adType != null && adType.intValue() == value2) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(value);
                    LIZ4.append("_old");
                    value = X1D.LIZIZ(LIZ4);
                }
            }
            String aid = aweme.getAid();
            String groupId = aweme.getGroupId();
            List<AnchorCommonStruct> anchors = aweme.getAnchors();
            String authorUid = aweme.getAuthorUid();
            User author = aweme.getAuthor();
            String awemeRawAdIdStr = aweme.getAwemeRawAdIdStr();
            AnchorCustomData anchorCustomData = aweme.getAnchorCustomData();
            java.util.Map LIZIZ = K02.LIZIZ("tiktokec_enter_product_detail", aweme, LIZ3);
            if (!(true ^ ((HashMap) LIZIZ).isEmpty())) {
                LIZIZ = null;
            }
            return new ProductListModel(aid, groupId, str3, anchors, list, authorUid, author, awemeRawAdIdStr, anchorCustomData, LIZIZ, aweme.getMobParams(), Boolean.valueOf(aweme.isAd()), aweme.getAwemeRawAd(), LIZ3, Long.valueOf(System.currentTimeMillis()), aweme.getShopAdStruct(), aweme, Boolean.valueOf(aweme.isPhotoMode()), Boolean.FALSE, panelOpenInfo, value, "mask_mall", str2, linkedHashMap);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a7 A[Catch: all -> 0x0063, TRY_ENTER, TryCatch #2 {all -> 0x0063, blocks: (B:84:0x00f4, B:87:0x0104, B:89:0x0122, B:91:0x0128, B:94:0x0135, B:97:0x0140, B:99:0x0160, B:116:0x01a7, B:119:0x01b7, B:121:0x01cb, B:122:0x01e1, B:124:0x01e7), top: B:65:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0160 A[Catch: all -> 0x0063, TryCatch #2 {all -> 0x0063, blocks: (B:84:0x00f4, B:87:0x0104, B:89:0x0122, B:91:0x0128, B:94:0x0135, B:97:0x0140, B:99:0x0160, B:116:0x01a7, B:119:0x01b7, B:121:0x01cb, B:122:0x01e1, B:124:0x01e7), top: B:65:0x00ae }] */
    /* JADX WARN: Type inference failed for: r5v10, types: [com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse$ProductDetail] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(X.OLG r22, android.content.Context r23, java.lang.String r24, com.ss.android.ugc.aweme.feed.model.Aweme r25, java.lang.String r26, X.OL6 r27, boolean r28, int r29) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OLG.LIZLLL(X.OLG, android.content.Context, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, X.OL6, boolean, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6 A[Catch: all -> 0x00e9, TryCatch #1 {all -> 0x00e9, blocks: (B:6:0x000c, B:8:0x0010, B:10:0x0016, B:11:0x001f, B:13:0x0025, B:16:0x0038, B:21:0x003c, B:24:0x0045, B:31:0x0054, B:37:0x00a7, B:40:0x00c6, B:43:0x0061, B:45:0x0067), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0076 A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:47:0x006b, B:48:0x0070, B:50:0x0076, B:59:0x0098, B:61:0x009e, B:55:0x0095, B:63:0x0083), top: B:46:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095 A[Catch: all -> 0x00a7, LOOP:1: B:48:0x0070->B:55:0x0095, LOOP_END, TryCatch #0 {all -> 0x00a7, blocks: (B:47:0x006b, B:48:0x0070, B:50:0x0076, B:59:0x0098, B:61:0x009e, B:55:0x0095, B:63:0x0083), top: B:46:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092 A[EDGE_INSN: B:56:0x0092->B:57:0x0092 BREAK  A[LOOP:1: B:48:0x0070->B:55:0x0095], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJI(com.ss.android.ugc.aweme.feed.model.Aweme r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OLG.LJI(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String LJII(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        JSONObject jSONObject;
        boolean z2;
        boolean z3;
        boolean z4;
        String str8;
        if (o.LJJJJJL(str)) {
            return str;
        }
        try {
            android.net.Uri parse = UriProtector.parse(str);
            String LJ = ED3.LJ(parse, "trackParams");
            if (o.LJJJJJL(LJ)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(LJ);
            }
            boolean z5 = false;
            if (o.LJJJJJL(str2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                jSONObject.put("need_overlay", str2);
            }
            if (o.LJJJJJL(str3)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                jSONObject.put("after_landing_draw", str3);
            }
            if (o.LJJJJJL(str4)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                jSONObject.put("previous_page", str4);
            }
            if (!o.LJJJJJL(str5)) {
                jSONObject.put("enter_click_area", str5);
            }
            if (!o.LJJJJJL(str6)) {
                jSONObject.put("source_content_id", str6);
            }
            if (!o.LJJJJJL(str7)) {
                jSONObject.put("track_id", str7);
            }
            String optString = jSONObject.optString("entrance_form");
            if (optString == null || o.LJJJJJL(optString)) {
                z5 = true;
            }
            if (z5) {
                optString = OLI.AD_SINGLE_BUBBLE.getValue();
            }
            if (z) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(optString);
                LIZ2.append("_old");
                optString = X1D.LIZIZ(LIZ2);
            }
            jSONObject.put("entrance_form", optString);
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.LJIIIIZZ(jSONObject2, "trackParamsJson.toString()");
            android.net.Uri LIZIZ = ED3.LIZIZ(parse, "trackParams", jSONObject2);
            if (LIZIZ != null) {
                str8 = LIZIZ.toString();
            } else {
                str8 = null;
            }
            if (str8 == null) {
                return str;
            }
            return str8;
        } catch (Throwable unused) {
            return str;
        }
    }
}
