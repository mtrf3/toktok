package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.s;
import com.ss.android.ugc.aweme.commerce.model.ShopAdStruct;
import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.PanelOpenInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.RzY */
/* loaded from: classes13.dex */
public final class C71360RzY {
    public static final boolean LIZIZ(String str) {
        return C73852v7.LIZ.contains(str);
    }

    public static final List<ShopWindowAnchorModel> LJIIJJI(AnchorCommonStruct anchorCommonStruct) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(anchorCommonStruct.getExtra());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                String extra = jSONObject.optString("extra");
                ShopWindowExtraModel shopWindowExtraModel = null;
                try {
                    Object LJII = C27739Aud.LJFF().LJII(extra, C65330PkU.LIZJ(C65352Pkq.LIZLLL(ShopWindowExtraModel.class)));
                    if (!(LJII instanceof ShopWindowExtraModel)) {
                        LJII = null;
                    }
                    shopWindowExtraModel = (ShopWindowExtraModel) LJII;
                } catch (s unused) {
                }
                if (shopWindowExtraModel == null) {
                    shopWindowExtraModel = new ShopWindowExtraModel(null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
                }
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
                arrayList.add(new ShopWindowAnchorModel(extra, shopWindowExtraModel, optString, optString2, valueOf, valueOf2, optString3, optString4));
            }
            return arrayList;
        } catch (Exception unused2) {
            return new ArrayList();
        }
    }

    public static final Integer LJIILL(CommonVideoAnchorModel commonVideoAnchorModel) {
        String str;
        int i;
        User author;
        if (commonVideoAnchorModel != null) {
            str = commonVideoAnchorModel.getAuthorUid();
        } else {
            str = null;
        }
        if (C025908h.LJFF(false, str)) {
            return null;
        }
        if (commonVideoAnchorModel != null && (author = commonVideoAnchorModel.getAuthor()) != null) {
            i = author.getFollowStatus();
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }

    public static final String LJIILLIIL(String extra) {
        j LJJIJ;
        j LJJIJ2;
        o.LJIIIZ(extra, "extra");
        j jVar = null;
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), extra, C65330PkU.LIZJ(C65352Pkq.LJI(m.class)));
            if (!(fromJson instanceof m)) {
                fromJson = null;
            }
            jVar = (j) fromJson;
        } catch (s unused) {
        }
        if (jVar != null && (LJJIJ = jVar.LJIIZILJ().LJJIJ("extra")) != null && (LJJIJ instanceof m) && (LJJIJ2 = LJJIJ.LJIIZILJ().LJJIJ("mix_product_type")) != null && !(LJJIJ2 instanceof l)) {
            String LJJIFFI = LJJIJ2.LJJIFFI();
            o.LJIIIIZZ(LJJIFFI, "mixProductType.asString");
            return LJJIFFI;
        }
        return "";
    }

    public static final String LJIIIIZZ(CommonVideoAnchorModel commonVideoAnchorModel, String productId) {
        HashMap<String, String> hashMap;
        String str;
        String aid;
        o.LJIIIZ(productId, "productId");
        if (commonVideoAnchorModel != null) {
            hashMap = commonVideoAnchorModel.getMMobParams();
        } else {
            hashMap = null;
        }
        String str2 = "";
        if (hashMap == null || (str = hashMap.get("request_id")) == null) {
            str = "";
        }
        if (commonVideoAnchorModel != null && (aid = commonVideoAnchorModel.getAid()) != null) {
            str2 = aid;
        }
        return C70570Rmo.LIZ(str, str2, productId);
    }

    public static final String LJIIIZ(ProductListModel productListModel, boolean z) {
        AnchorCustomData anchorCustomData;
        java.util.Map<String, String> trackingData;
        String str;
        if (z || productListModel == null || (anchorCustomData = productListModel.getAnchorCustomData()) == null || (trackingData = anchorCustomData.getTrackingData()) == null || (str = trackingData.get("entrance_form")) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public static final String LJIIJ(Aweme aweme, boolean z) {
        AnchorCustomData anchorCustomData;
        java.util.Map<String, String> trackingData;
        String str;
        if (z || aweme == null || (anchorCustomData = aweme.getAnchorCustomData()) == null || (trackingData = anchorCustomData.getTrackingData()) == null || (str = trackingData.get("entrance_form")) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public static final java.util.Map<String, String> LJIIL(CommonVideoAnchorModel aweme, String str) {
        java.util.Map<String, String> map;
        o.LJIIIZ(aweme, "aweme");
        AnchorCustomData anchorCustomData = aweme.getAnchorCustomData();
        if (anchorCustomData != null) {
            map = anchorCustomData.getTrackingData();
        } else {
            map = null;
        }
        java.util.Map<String, String> awemeExtraParams = aweme.getAwemeExtraParams();
        java.util.Map<String, String> LJJZ = Z9N.LIZIZ.LJJZ(str, null, "search_result_id", "search_id", "list_item_id", "last_from_group_id");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (awemeExtraParams != null) {
            linkedHashMap.putAll(awemeExtraParams);
        }
        if (LJJZ != null) {
            linkedHashMap.putAll(LJJZ);
        }
        linkedHashMap.remove("enter_from_info");
        linkedHashMap.remove("source_page_type");
        return linkedHashMap;
    }

    public static final CommonVideoAnchorModel LJJIIZ(Aweme aweme, String eventType) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(eventType, "eventType");
        try {
            String aid = aweme.getAid();
            String groupId = aweme.getGroupId();
            String requestId = aweme.getRequestId();
            List<AnchorCommonStruct> anchors = aweme.getAnchors();
            String authorUid = aweme.getAuthorUid();
            User author = aweme.getAuthor();
            String awemeRawAdIdStr = aweme.getAwemeRawAdIdStr();
            AnchorCustomData anchorCustomData = aweme.getAnchorCustomData();
            java.util.Map LIZIZ = K02.LIZIZ("tiktokec_enter_product_detail", aweme, eventType);
            if (!(!((HashMap) LIZIZ).isEmpty())) {
                LIZIZ = null;
            }
            boolean isAd = aweme.isAd();
            return new CommonVideoAnchorModel(aid, groupId, requestId, anchors, authorUid, author, awemeRawAdIdStr, anchorCustomData, LIZIZ, aweme.getMobParams(), Boolean.valueOf(isAd), aweme.getAwemeRawAd(), eventType, 0L, aweme.getShopAdStruct());
        } catch (Exception unused) {
            return new CommonVideoAnchorModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r9 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if ((!r6.isEmpty()) == true) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map LJIILIIL(java.lang.String r8, com.ss.android.ugc.aweme.feed.model.Aweme r9, java.lang.String r10) {
        /*
            r7 = 0
            if (r9 == 0) goto L64
            com.ss.android.ugc.aweme.feed.model.AnchorCustomData r0 = r9.getAnchorCustomData()
            if (r0 == 0) goto L64
            java.util.Map r5 = r0.getTrackingData()
        Ld:
            java.util.Map r6 = X.K02.LIZIZ(r8, r9, r10)
            if (r6 == 0) goto L68
            boolean r0 = r6.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L68
        L1c:
            X.Z9N r4 = X.Z9N.LIZIZ
            java.lang.String r3 = "search_result_id"
            java.lang.String r1 = "search_id"
            java.lang.String r2 = "list_item_id"
            java.lang.String r0 = "last_from_group_id"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2, r0}
            com.ss.android.ugc.aweme.search.ISearchService r0 = r4.LIZ
            java.util.Map r0 = r0.LJJZ(r10, r7, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            if (r5 == 0) goto L3a
            r1.putAll(r5)
        L3a:
            if (r6 == 0) goto L3f
            r1.putAll(r6)
        L3f:
            if (r0 == 0) goto L44
            r1.putAll(r0)
        L44:
            java.lang.String r0 = "general_search"
            boolean r0 = kotlin.jvm.internal.o.LJ(r10, r0)
            if (r0 == 0) goto L59
            if (r9 == 0) goto L54
            java.lang.String r0 = r9.getAid()
            if (r0 != 0) goto L56
        L54:
            java.lang.String r0 = ""
        L56:
            r1.put(r2, r0)
        L59:
            java.lang.String r0 = "enter_from_info"
            r1.remove(r0)
            java.lang.String r0 = "source_page_type"
            r1.remove(r0)
            return r1
        L64:
            r5 = r7
            if (r9 == 0) goto L68
            goto Ld
        L68:
            r6 = r7
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71360RzY.LJIILIIL(java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):java.util.Map");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if ((!r6.isEmpty()) == true) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r8 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.String> LJIILJJIL(com.ss.android.ugc.aweme.ecommerce.model.ProductListModel r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = 0
            if (r8 == 0) goto L6a
            com.ss.android.ugc.aweme.feed.model.AnchorCustomData r0 = r8.getAnchorCustomData()
            if (r0 == 0) goto L6a
            java.util.Map r5 = r0.getTrackingData()
        Ld:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.getAweme()
            if (r0 == 0) goto L6e
            java.util.Map r6 = X.K02.LIZIZ(r9, r0, r10)
            if (r6 == 0) goto L6e
            boolean r0 = r6.isEmpty()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L6e
        L22:
            X.Z9N r4 = X.Z9N.LIZIZ
            java.lang.String r3 = "search_result_id"
            java.lang.String r1 = "search_id"
            java.lang.String r2 = "list_item_id"
            java.lang.String r0 = "last_from_group_id"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2, r0}
            com.ss.android.ugc.aweme.search.ISearchService r0 = r4.LIZ
            java.util.Map r0 = r0.LJJZ(r10, r7, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            if (r5 == 0) goto L40
            r1.putAll(r5)
        L40:
            if (r6 == 0) goto L45
            r1.putAll(r6)
        L45:
            if (r0 == 0) goto L4a
            r1.putAll(r0)
        L4a:
            java.lang.String r0 = "general_search"
            boolean r0 = kotlin.jvm.internal.o.LJ(r10, r0)
            if (r0 == 0) goto L5f
            if (r8 == 0) goto L5a
            java.lang.String r0 = r8.getAid()
            if (r0 != 0) goto L5c
        L5a:
            java.lang.String r0 = ""
        L5c:
            r1.put(r2, r0)
        L5f:
            java.lang.String r0 = "enter_from_info"
            r1.remove(r0)
            java.lang.String r0 = "source_page_type"
            r1.remove(r0)
            return r1
        L6a:
            r5 = r7
            if (r8 == 0) goto L6e
            goto Ld
        L6e:
            r6 = r7
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71360RzY.LJIILJJIL(com.ss.android.ugc.aweme.ecommerce.model.ProductListModel, java.lang.String, java.lang.String):java.util.Map");
    }

    public static final String LJIIZILJ(ShopWindowAnchorModel data, CommonVideoAnchorModel commonVideoAnchorModel, String str, String str2, String trackerId) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(trackerId, "trackerId");
        try {
            return LIZJ(data, UriProtector.getQueryParameter(UriProtector.parse(data.LIZ.schema), "trackParams"), commonVideoAnchorModel, str, str2, trackerId, true, null, false);
        } catch (Exception unused) {
            return "";
        }
    }

    public static final String LJJI(ShopWindowAnchorModel data, CommonVideoAnchorModel commonVideoAnchorModel, String str, String str2, String trackerId) {
        boolean z;
        Boolean isAd;
        Integer num;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(trackerId, "trackerId");
        Integer num2 = data.LIZ.platform;
        if ((num2 == null || num2.intValue() != 5) && ((num = data.LIZ.platform) == null || num.intValue() != 6)) {
            return data.LIZ.schema;
        }
        try {
            android.net.Uri parse = UriProtector.parse(data.LIZ.schema);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(parse.getScheme());
            builder.authority(parse.getHost());
            builder.path(parse.getPath());
            Iterator<String> it = UriProtector.getQueryParameterNames(parse).iterator();
            while (true) {
                commonVideoAnchorModel = commonVideoAnchorModel;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (o.LJ(next, "requestParams")) {
                    JSONObject jSONObject = new JSONObject(UriProtector.getQueryParameter(parse, next));
                    if (commonVideoAnchorModel != null && (isAd = commonVideoAnchorModel.isAd()) != null) {
                        z = isAd.booleanValue();
                    } else {
                        z = false;
                    }
                    jSONObject.put("is_ad", z);
                    builder.appendQueryParameter(next, jSONObject.toString());
                } else if (!o.LJ(next, "trackParams")) {
                    if (o.LJ(next, "fullScreen")) {
                        builder.appendQueryParameter(next, String.valueOf(true));
                    } else {
                        builder.appendQueryParameter(next, UriProtector.getQueryParameter(parse, next));
                    }
                }
            }
            builder.appendQueryParameter("trackParams", LIZJ(data, UriProtector.getQueryParameter(parse, "trackParams"), commonVideoAnchorModel, str, str2, trackerId, true, null, false));
            if (!UriProtector.getQueryParameterNames(parse).contains("fullScreen")) {
                builder.appendQueryParameter("fullScreen", String.valueOf(true));
            }
            return builder.build().toString();
        } catch (Exception e) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("e_stack_trace", C36747EbX.LIZIZ(e));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ShopWindowAnchorModel : ");
            LIZ.append(data);
            c188727au.LJIIIZ("extra_data", X1D.LIZIZ(LIZ));
            c188727au.LJIIIZ("where", "ShopWindowAnchorModel");
            C48658J7u.LIZ("rd_tiktokec_shop_anchor_exception", c188727au.LIZ);
            return data.LIZ.schema;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ProductListModel LJJIIZI(Aweme aweme, InterfaceC44105HSr interfaceC44105HSr, String str, PanelOpenInfo panelOpenInfo, String str2) {
        String aid;
        String groupId;
        String requestId;
        List<AnchorCommonStruct> anchors;
        String authorUid;
        User author;
        String awemeRawAdIdStr;
        AnchorCustomData anchorCustomData;
        String str3;
        java.util.Map LIZIZ;
        Boolean bool;
        AwemeRawAd awemeRawAd;
        HashMap<String, String> hashMap;
        String str4;
        ShopAdStruct shopAdStruct;
        Boolean bool2;
        Boolean bool3;
        PanelOpenInfo panelOpenInfo2 = panelOpenInfo;
        List<AnchorCommonStruct> list = null;
        if (aweme != null) {
            try {
                aid = aweme.getAid();
                groupId = aweme.getGroupId();
                requestId = aweme.getRequestId();
                anchors = aweme.getAnchors();
                authorUid = aweme.getAuthorUid();
                author = aweme.getAuthor();
                awemeRawAdIdStr = aweme.getAwemeRawAdIdStr();
                anchorCustomData = aweme.getAnchorCustomData();
                if (interfaceC44105HSr != null) {
                    str3 = interfaceC44105HSr.LJJLJLI();
                } else {
                    str3 = null;
                }
                LIZIZ = K02.LIZIZ("tiktokec_enter_product_detail", aweme, str3);
            } catch (Exception unused) {
                return new ProductListModel(null, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 16777215, null == true ? 1 : 0);
            }
        } else {
            aid = null;
            groupId = null;
            requestId = null;
            anchors = null;
            authorUid = null;
            author = null;
            awemeRawAdIdStr = null;
            anchorCustomData = null;
            LIZIZ = null;
        }
        if (LIZIZ == null || !(!LIZIZ.isEmpty())) {
            LIZIZ = null;
        }
        if (aweme != null) {
            bool = Boolean.valueOf(aweme.isAd());
            awemeRawAd = aweme.getAwemeRawAd();
            hashMap = aweme.getMobParams();
        } else {
            bool = null;
            awemeRawAd = null;
            hashMap = null;
        }
        if (interfaceC44105HSr == null || (str4 = interfaceC44105HSr.LJJLJLI()) == null) {
            str4 = str;
        }
        if (aweme != null) {
            shopAdStruct = aweme.getShopAdStruct();
            bool2 = Boolean.valueOf(aweme.isPhotoMode());
        } else {
            shopAdStruct = null;
            bool2 = null;
        }
        if (interfaceC44105HSr != null) {
            bool3 = Boolean.valueOf(interfaceC44105HSr.LJJLJ());
        } else {
            bool3 = null;
        }
        if (panelOpenInfo2 == null) {
            panelOpenInfo2 = new PanelOpenInfo(0, null, 0, false, 0, 31, null);
        }
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        if (aweme != null) {
            list = aweme.getAnchors();
        }
        c71361RzZ.getClass();
        return new ProductListModel(aid, groupId, requestId, anchors, C71361RzZ.LJJJJLL(C71361RzZ.LJJIIJ(list), false), authorUid, author, awemeRawAdIdStr, anchorCustomData, LIZIZ, hashMap, bool, awemeRawAd, str4, 0L, shopAdStruct, aweme, bool2, bool3, panelOpenInfo2, str, null, str2, null == true ? 1 : 0, 10485760, null == true ? 1 : 0);
    }

    public static /* synthetic */ ProductListModel LJJIJ(Aweme aweme, InterfaceC44105HSr interfaceC44105HSr, String str, PanelOpenInfo panelOpenInfo, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            panelOpenInfo = null;
        }
        return LJJIIZI(aweme, interfaceC44105HSr, str, panelOpenInfo, null);
    }

    public static final void LIZ(Integer num, String str, String str2, ShopWindowAnchorModel data, CommonVideoAnchorModel commonVideoAnchorModel, C27943Axv buildParams) {
        String str3;
        HashMap<String, String> mMobParams;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(buildParams, "buildParams");
        if (commonVideoAnchorModel == null) {
            return;
        }
        buildParams.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        String aid = commonVideoAnchorModel.getAid();
        if (aid == null) {
            aid = "";
        }
        buildParams.LIZLLL("group_id", aid);
        buildParams.LIZLLL("is_ad", Integer.valueOf(o.LJ(commonVideoAnchorModel.isAd(), Boolean.TRUE) ? 1 : 0));
        String authorUid = commonVideoAnchorModel.getAuthorUid();
        if (authorUid == null) {
            authorUid = "";
        }
        buildParams.LIZLLL("author_id", authorUid);
        String requestId = commonVideoAnchorModel.getRequestId();
        if (requestId == null) {
            requestId = "";
        }
        buildParams.LIZLLL("request_id", requestId);
        String eventType = commonVideoAnchorModel.getEventType();
        if (eventType == null) {
            eventType = "";
        }
        buildParams.LIZLLL("enter_from", eventType);
        buildParams.LIZLLL("anchor_show_type", "video_cart_tag");
        buildParams.LIZLLL("product_source", String.valueOf(data.LIZ.platform));
        String str4 = data.LIZ.source;
        if (str4 == null) {
            str4 = "";
        }
        buildParams.LIZLLL("source", str4);
        buildParams.LIZLLL("product_id", String.valueOf(data.LIZ.productId));
        buildParams.LIZLLL("biz_type", C71366Rze.LJFF(data));
        int i = 0;
        buildParams.LIZLLL("is_self", Integer.valueOf(o.LJ(commonVideoAnchorModel.getAuthorUid(), BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()) ? 1 : 0));
        buildParams.LIZLLL("is_single_anchor", "no");
        if (num != null) {
            buildParams.LIZLLL("item_order", String.valueOf(num.intValue() + 1));
        }
        Integer LJIILL = LJIILL(commonVideoAnchorModel);
        if (LJIILL != null) {
            i = LJIILL.intValue();
        }
        buildParams.LIZLLL("follow_status", Integer.valueOf(i));
        if (str != null) {
            buildParams.LIZLLL("track_id", str);
        }
        buildParams.LIZLLL("source_page_type", "video");
        if (str2 != null) {
            buildParams.LIZLLL("entrance_form", str2);
        }
        buildParams.LIZLLL("page_name", "video_comment_shopping_list");
        String eventType2 = commonVideoAnchorModel.getEventType();
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        buildParams.LIZLLL("entrance_info", LJIIZILJ(data, commonVideoAnchorModel, eventType2, str2, str3));
        buildParams.LIZLLL("is_mix_product", LJIILLIIL(data.extra));
        Integer num2 = data.LIZ.productStatus;
        if (num2 == null || num2.intValue() != 70) {
            buildParams.LIZLLL("shopping_status", "product_available");
        } else {
            buildParams.LIZLLL("shopping_status", "product_not_available");
        }
        buildParams.LJ(LJIIL(commonVideoAnchorModel, commonVideoAnchorModel.getEventType()));
        if (str != null && (mMobParams = commonVideoAnchorModel.getMMobParams()) != null) {
            mMobParams.put("track_id", str);
        }
        HashMap<String, String> mMobParams2 = commonVideoAnchorModel.getMMobParams();
        if (mMobParams2 != null) {
            for (Map.Entry<String, String> entry : mMobParams2.entrySet()) {
                if (entry.getValue() != null) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    buildParams.LIZLLL(key, value);
                }
            }
        }
    }

    public static String LJIJ(ShopWindowAnchorModel data, Aweme aweme, String str, String str2, String str3, boolean z) {
        o.LJIIIZ(data, "data");
        return LJIJI(data, LJJIJ(aweme, null, str2, null, 24), str, str2, str3, z, null, null);
    }

    public static final String LJJIFFI(ShopWindowAnchorModel data, Aweme aweme, String str, String str2, String trackerId, boolean z) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(trackerId, "trackerId");
        return LJJII(data, LJJIJ(aweme, null, str2, null, 24), false, str, str2, trackerId, z);
    }

    public static final String LJJIII(ShopWindowAnchorModel shopWindowAnchorModel, ProductListModel productListModel, String str, String str2, String str3, boolean z) {
        Integer num = shopWindowAnchorModel.LIZ.platform;
        if (num == null || num.intValue() != 100) {
            return shopWindowAnchorModel.LIZ.schema;
        }
        try {
            return UriProtector.parse(shopWindowAnchorModel.LIZ.schema).buildUpon().appendQueryParameter("trackParams", LJI(shopWindowAnchorModel, UriProtector.getQueryParameter(UriProtector.parse(shopWindowAnchorModel.LIZ.schema), "trackParams"), productListModel, str, str2, str3, z, null, null, null, null, null, 3968)).build().toString();
        } catch (Exception unused) {
            return shopWindowAnchorModel.LIZ.schema;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        if (r13 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (r0.LJFF() == true) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIIJ(android.content.Context r11, com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel r12, com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71360RzY.LJJIIJ(android.content.Context, com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel, com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static String LJII(String str, ShopWindowAnchorModel data, String str2, Aweme aweme, String str3, String str4, boolean z) {
        o.LJIIIZ(data, "data");
        try {
            android.net.Uri parse = UriProtector.parse(str);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(parse.getScheme());
            builder.authority(parse.getHost());
            builder.path(parse.getPath());
            Iterator<String> it = UriProtector.getQueryParameterNames(parse).iterator();
            while (true) {
                boolean z2 = false;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (o.LJ(next, "requestParams")) {
                    JSONObject jSONObject = new JSONObject(UriProtector.getQueryParameter(parse, next));
                    if (aweme != null) {
                        z2 = aweme.isAd();
                    }
                    jSONObject.put("is_ad", z2);
                    builder.appendQueryParameter(next, jSONObject.toString());
                } else if (!o.LJ(next, "trackParams")) {
                    if (o.LJ(next, "fullScreen")) {
                        builder.appendQueryParameter(next, String.valueOf(false));
                    } else {
                        builder.appendQueryParameter(next, UriProtector.getQueryParameter(parse, next));
                    }
                }
            }
            builder.appendQueryParameter("product_id", str2);
            builder.appendQueryParameter("click_from", "2");
            builder.appendQueryParameter("enter_from", str3);
            builder.appendQueryParameter("trackParams", LJFF(data, UriProtector.getQueryParameter(parse, "trackParams"), LJJIJ(aweme, null, str4, null, 24), str3, str4, "", z, "video", null, null, null, null));
            builder.appendQueryParameter("previous_page", "video");
            if (!UriProtector.getQueryParameterNames(parse).contains("fullScreen")) {
                builder.appendQueryParameter("fullScreen", String.valueOf(false));
            }
            return builder.build().toString();
        } catch (Exception e) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("e_stack_trace", C36747EbX.LIZIZ(e));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ShopWindowAnchorModel : ");
            LIZ.append(data);
            c188727au.LJIIIZ("extra_data", X1D.LIZIZ(LIZ));
            c188727au.LJIIIZ("where", "ShopWindowAnchorModel");
            FMX.LJIIL("rd_tiktokec_shop_anchor_exception", c188727au.LIZ);
            return null;
        }
    }

    public static final String LJJII(ShopWindowAnchorModel data, ProductListModel productListModel, boolean z, String str, String str2, String trackerId, boolean z2) {
        boolean z3;
        Boolean isAd;
        Integer num;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(trackerId, "trackerId");
        Integer num2 = data.LIZ.platform;
        if ((num2 == null || num2.intValue() != 5) && ((num = data.LIZ.platform) == null || num.intValue() != 6)) {
            return data.LIZ.schema;
        }
        try {
            android.net.Uri parse = UriProtector.parse(data.LIZ.schema);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(parse.getScheme());
            builder.authority(parse.getHost());
            builder.path(parse.getPath());
            for (String str3 : UriProtector.getQueryParameterNames(parse)) {
                if (o.LJ(str3, "requestParams")) {
                    JSONObject jSONObject = new JSONObject(UriProtector.getQueryParameter(parse, str3));
                    if (productListModel != null && (isAd = productListModel.isAd()) != null) {
                        z3 = isAd.booleanValue();
                    } else {
                        z3 = false;
                    }
                    jSONObject.put("is_ad", z3);
                    builder.appendQueryParameter(str3, jSONObject.toString());
                } else if (!o.LJ(str3, "trackParams")) {
                    if (o.LJ(str3, "fullScreen")) {
                        builder.appendQueryParameter(str3, String.valueOf(z));
                    } else {
                        builder.appendQueryParameter(str3, UriProtector.getQueryParameter(parse, str3));
                    }
                }
            }
            builder.appendQueryParameter("trackParams", LJI(data, UriProtector.getQueryParameter(parse, "trackParams"), productListModel, str, str2, trackerId, z2, null, null, null, null, null, 3968));
            if (!UriProtector.getQueryParameterNames(parse).contains("fullScreen")) {
                builder.appendQueryParameter("fullScreen", String.valueOf(z));
            }
            return builder.build().toString();
        } catch (Exception e) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("e_stack_trace", C36747EbX.LIZIZ(e));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ShopWindowAnchorModel : ");
            LIZ.append(data);
            c188727au.LJIIIZ("extra_data", X1D.LIZIZ(LIZ));
            c188727au.LJIIIZ("where", "ShopWindowAnchorModel");
            FMX.LJIIL("rd_tiktokec_shop_anchor_exception", c188727au.LIZ);
            return data.LIZ.schema;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r14 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r0.LJFF() == true) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIIJZLJL(android.app.Activity r12, com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel r13, com.ss.android.ugc.aweme.ecommerce.model.ProductListModel r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18) {
        /*
            java.lang.String r0 = "data"
            r6 = r13
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "trackerId"
            r10 = r17
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            if (r12 != 0) goto L10
            return
        L10:
            r7 = r14
            r8 = r15
            r9 = r16
            r11 = r18
            java.lang.String r4 = LJJIII(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService r0 = com.ss.android.ugc.aweme.commercialize.ecommerce.service.ShoppingAdsServiceImpl.LJIIIZ()
            r6 = 0
            if (r0 == 0) goto Le1
            boolean r0 = r0.LJFF()
            r1 = 1
            if (r0 != r1) goto Le1
        L28:
            java.lang.String r2 = ""
            r0 = 0
            if (r1 == 0) goto L79
            boolean r1 = r12 instanceof X.ActivityC45651qj
            if (r1 == 0) goto L74
            X.Ny2 r5 = new X.Ny2
            if (r4 != 0) goto L36
            r4 = r2
        L36:
            X.S0W r3 = X.S0W.LJLIL
            X.S0c r2 = X.C71390S0c.LJLIL
            r1 = 1060823368(0x3f3ae148, float:0.73)
            r5.<init>(r1, r4, r3, r2)
            com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.model.ShopifyPdpAdInfo r3 = new com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.model.ShopifyPdpAdInfo
            if (r7 == 0) goto L75
            java.lang.Boolean r1 = r7.isAd()
            if (r1 == 0) goto L4e
            boolean r6 = r1.booleanValue()
        L4e:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r7.getAwemeRawAd()
            if (r1 == 0) goto L75
            java.lang.Long r2 = r1.getCreativeId()
        L58:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r7.getAwemeRawAd()
            if (r1 == 0) goto L62
            java.lang.String r0 = r1.getLogExtra()
        L62:
            r3.<init>(r6, r2, r0)
            com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService r1 = com.ss.android.ugc.aweme.commercialize.ecommerce.service.ShoppingAdsServiceImpl.LJIIIZ()
            if (r1 == 0) goto L74
            X.1qj r12 = (X.ActivityC45651qj) r12
            androidx.fragment.app.FragmentManager r0 = r12.getSupportFragmentManager()
            r1.LIZ(r0, r5, r3)
        L74:
            return
        L75:
            r2 = r0
            if (r7 == 0) goto L62
            goto L58
        L79:
            if (r4 != 0) goto L7c
            r4 = r2
        L7c:
            if (r7 == 0) goto Ldf
            java.lang.Boolean r2 = r7.isAd()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.o.LJ(r2, r1)
            if (r1 == 0) goto Ldf
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r4)
            android.net.Uri$Builder r2 = r0.buildUpon()
            java.lang.String r1 = "is_ad"
            java.lang.String r0 = "1"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r1, r0)
            android.net.Uri r0 = r0.build()
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "parse(schema).buildUpon(…, \"1\").build().toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService r0 = com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl.LJJI()
            r0.LJIIIIZZ()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r7.getAwemeRawAd()
            if (r0 == 0) goto Lc8
            java.lang.Long r0 = r0.getCreativeId()
            if (r0 == 0) goto Lc8
            long r1 = r0.longValue()
            java.lang.String r0 = "ad_id"
            r3.putLong(r0, r1)
        Lc8:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r7.getAwemeRawAd()
            if (r0 == 0) goto Ld9
            java.lang.String r1 = r0.getLogExtra()
            if (r1 == 0) goto Ld9
            java.lang.String r0 = "bundle_download_app_log_extra"
            r3.putString(r0, r1)
        Ld9:
            java.lang.String r0 = "ad_commerce"
        Ldb:
            X.C57415Mg7.LIZIZ(r12, r4, r0, r3)
            goto L74
        Ldf:
            r3 = r0
            goto Ldb
        Le1:
            r1 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71360RzY.LJJIIJZLJL(android.app.Activity, com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel, com.ss.android.ugc.aweme.ecommerce.model.ProductListModel, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public static final String LJIJI(ShopWindowAnchorModel data, ProductListModel productListModel, String str, String str2, String trackerId, boolean z, java.util.Map<String, String> map, String str3) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(trackerId, "trackerId");
        try {
            return LJI(data, UriProtector.getQueryParameter(UriProtector.parse(data.LIZ.schema), "trackParams"), productListModel, str, str2, trackerId, z, null, null, map, null, str3, 1024);
        } catch (Exception unused) {
            return "";
        }
    }

    public static /* synthetic */ String LJIL(String str, ShopWindowAnchorModel shopWindowAnchorModel, String str2, CommonVideoAnchorModel commonVideoAnchorModel, boolean z, String str3, String str4, String str5) {
        return LJIJJLI(str, shopWindowAnchorModel, str2, commonVideoAnchorModel, z, str3, str4, str5, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02f2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZJ(com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel r47, java.lang.String r48, com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, boolean r53, java.lang.String r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71360RzY.LIZJ(com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel, java.lang.String, com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean):java.lang.String");
    }

    public static final String LJIJJLI(String str, ShopWindowAnchorModel data, String productId, CommonVideoAnchorModel commonVideoAnchorModel, boolean z, String str2, String str3, String trackerId, Boolean bool, String str4) {
        String str5;
        boolean z2;
        Boolean isAd;
        String str6 = str;
        String str7 = str4;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(trackerId, "trackerId");
        if (str6 == null) {
            try {
                str6 = data.LIZ.schema;
            } catch (Exception e) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("e_stack_trace", C36747EbX.LIZIZ(e));
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ShopWindowAnchorModel : ");
                LIZ.append(data);
                c188727au.LJIIIZ("extra_data", X1D.LIZIZ(LIZ));
                c188727au.LJIIIZ("where", "ShopWindowAnchorModel");
                C48658J7u.LIZ("rd_tiktokec_shop_anchor_exception", c188727au.LIZ);
                return data.LIZ.schema;
            }
        }
        android.net.Uri parse = UriProtector.parse(str6);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(parse.getScheme());
        builder.authority(parse.getHost());
        if (str7 == null) {
            str7 = parse.getPath();
        }
        builder.path(str7);
        for (String str8 : UriProtector.getQueryParameterNames(parse)) {
            if (o.LJ(str8, "requestParams")) {
                JSONObject jSONObject = new JSONObject(UriProtector.getQueryParameter(parse, str8));
                if (commonVideoAnchorModel != null && (isAd = commonVideoAnchorModel.isAd()) != null) {
                    z2 = isAd.booleanValue();
                } else {
                    z2 = false;
                }
                jSONObject.put("is_ad", z2);
                builder.appendQueryParameter(str8, jSONObject.toString());
            } else if (!o.LJ(str8, "trackParams")) {
                if (o.LJ(str8, "fullScreen")) {
                    builder.appendQueryParameter(str8, String.valueOf(z));
                } else {
                    builder.appendQueryParameter(str8, UriProtector.getQueryParameter(parse, str8));
                }
            }
        }
        builder.appendQueryParameter("product_id", productId);
        if (bool != null) {
            if (bool.booleanValue()) {
                str5 = "true";
            } else {
                str5 = "false";
            }
            builder.appendQueryParameter("need_request", str5);
        }
        builder.appendQueryParameter("click_from", "2");
        builder.appendQueryParameter("enter_from", str2);
        builder.appendQueryParameter("trackParams", LIZJ(data, UriProtector.getQueryParameter(parse, "trackParams"), commonVideoAnchorModel, str2, str3, trackerId, true, "video_comment_shopping_list", true));
        builder.appendQueryParameter("previous_page", "video_comment_shopping_list");
        if (!UriProtector.getQueryParameterNames(parse).contains("fullScreen")) {
            builder.appendQueryParameter("fullScreen", String.valueOf(z));
        }
        return builder.build().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0342 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJ(com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel r47, java.lang.String r48, com.ss.android.ugc.aweme.ecommerce.model.ProductListModel r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, boolean r53, java.lang.String r54, boolean r55, java.lang.Integer r56, int[] r57) {
        /*
            Method dump skipped, instructions count: 1017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71360RzY.LJ(com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel, java.lang.String, com.ss.android.ugc.aweme.ecommerce.model.ProductListModel, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.Integer, int[]):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:237:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03ae A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJFF(com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel r47, java.lang.String r48, com.ss.android.ugc.aweme.ecommerce.model.ProductListModel r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, boolean r53, java.lang.String r54, java.util.Map<java.lang.String, ? extends java.lang.Object> r55, java.util.Map<java.lang.String, java.lang.String> r56, java.lang.Integer r57, java.lang.String r58) {
        /*
            Method dump skipped, instructions count: 1125
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71360RzY.LJFF(com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel, java.lang.String, com.ss.android.ugc.aweme.ecommerce.model.ProductListModel, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.Map, java.util.Map, java.lang.Integer, java.lang.String):java.lang.String");
    }

    public static /* synthetic */ String LJI(ShopWindowAnchorModel shopWindowAnchorModel, String str, ProductListModel productListModel, String str2, String str3, String str4, boolean z, String str5, java.util.Map map, java.util.Map map2, Integer num, String str6, int i) {
        String str7 = str5;
        boolean z2 = z;
        java.util.Map map3 = map;
        java.util.Map map4 = map2;
        Integer num2 = num;
        if ((i & 64) != 0) {
            z2 = true;
        }
        String str8 = null;
        if ((i & 128) != 0) {
            str7 = null;
        }
        if ((i & 256) != 0) {
            map3 = null;
        }
        if ((i & 512) != 0) {
            map4 = null;
        }
        if ((i & 1024) != 0) {
            num2 = null;
        }
        if ((i & 2048) == 0) {
            str8 = str6;
        }
        return LJFF(shopWindowAnchorModel, str, productListModel, str2, str3, str4, z2, str7, map3, map4, num2, str8);
    }

    public static final String LJJ(String str, ShopWindowAnchorModel data, String productId, ProductListModel productListModel, boolean z, String str2, String str3, String trackerId, boolean z2, Boolean bool, String str4, java.util.Map<String, ? extends Object> map, Integer num) {
        String str5;
        String str6;
        boolean z3;
        Boolean isAd;
        Integer num2;
        String str7 = str4;
        String str8 = str;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(productId, "productId");
        o.LJIIIZ(trackerId, "trackerId");
        Integer num3 = data.LIZ.platform;
        if ((num3 == null || num3.intValue() != 5) && ((num2 = data.LIZ.platform) == null || num2.intValue() != 6)) {
            return data.LIZ.schema;
        }
        if (str8 == null) {
            try {
                str8 = data.LIZ.schema;
            } catch (Exception e) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("e_stack_trace", C36747EbX.LIZIZ(e));
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ShopWindowAnchorModel : ");
                LIZ.append(data);
                c188727au.LJIIIZ("extra_data", X1D.LIZIZ(LIZ));
                c188727au.LJIIIZ("where", "ShopWindowAnchorModel");
                FMX.LJIIL("rd_tiktokec_shop_anchor_exception", c188727au.LIZ);
                return data.LIZ.schema;
            }
        }
        android.net.Uri parse = UriProtector.parse(str8);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(parse.getScheme());
        builder.authority(parse.getHost());
        if (str7 == null) {
            str7 = parse.getPath();
        }
        builder.path(str7);
        for (String str9 : UriProtector.getQueryParameterNames(parse)) {
            if (o.LJ(str9, "requestParams")) {
                JSONObject jSONObject = new JSONObject(UriProtector.getQueryParameter(parse, str9));
                if (productListModel != null && (isAd = productListModel.isAd()) != null) {
                    z3 = isAd.booleanValue();
                } else {
                    z3 = false;
                }
                jSONObject.put("is_ad", z3);
                builder.appendQueryParameter(str9, jSONObject.toString());
            } else if (!o.LJ(str9, "trackParams")) {
                if (o.LJ(str9, "fullScreen")) {
                    builder.appendQueryParameter(str9, String.valueOf(z));
                } else {
                    builder.appendQueryParameter(str9, UriProtector.getQueryParameter(parse, str9));
                }
            }
        }
        builder.appendQueryParameter("product_id", productId);
        if (bool != null) {
            if (bool.booleanValue()) {
                str6 = "true";
            } else {
                str6 = "false";
            }
            builder.appendQueryParameter("need_request", str6);
        }
        builder.appendQueryParameter("click_from", "2");
        builder.appendQueryParameter("enter_from", str2);
        Integer num4 = data.LIZ.bizType;
        if (num4 == null || (str5 = num4.toString()) == null) {
            str5 = "";
        }
        builder.appendQueryParameter("biz_type", str5);
        builder.appendQueryParameter("trackParams", LJI(data, UriProtector.getQueryParameter(parse, "trackParams"), productListModel, str2, str3, trackerId, z2, "video", map, null, num, null, 2560));
        builder.appendQueryParameter("previous_page", "video");
        if (!UriProtector.getQueryParameterNames(parse).contains("fullScreen")) {
            builder.appendQueryParameter("fullScreen", String.valueOf(z));
        }
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        String str10 = data.schema;
        c71361RzZ.getClass();
        String str11 = null;
        try {
            android.net.Uri parse2 = UriProtector.parse(str10);
            o.LJIIIIZZ(parse2, "parse(schema)");
            String LJIJJLI = C78939UyV.LJIJJLI(parse2, "visitReportParams");
            if (LJIJJLI != null) {
                str11 = LJIJJLI;
            }
        } catch (Exception unused) {
        }
        builder.appendQueryParameter("visitReportParams", str11);
        return builder.build().toString();
    }
}
