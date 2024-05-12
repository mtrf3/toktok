package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.search.ProductAnchor;

/* renamed from: X.Jb8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49462Jb8 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C49463Jb9.LJLIL);

    public static final ProductAnchor LIZ(AnchorCommonStruct anchorCommonStruct) {
        if (anchorCommonStruct == null || !anchorCommonStruct.getShowInSearchResult()) {
            return null;
        }
        return LIZIZ(anchorCommonStruct);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.feed.model.search.ProductAnchor LIZIZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r38) {
        /*
            r16 = 0
            if (r38 != 0) goto L5
            return r16
        L5:
            java.lang.String r1 = r38.getExtra()
            if (r1 == 0) goto Ld7
            int r0 = r1.length()
            if (r0 <= 0) goto Ld7
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch: org.json.JSONException -> Ld7
            r13.<init>(r1)     // Catch: org.json.JSONException -> Ld7
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            int r11 = r13.length()
            r10 = 0
        L20:
            if (r10 >= r11) goto Lcd
            java.lang.Object r3 = r13.get(r10)
            boolean r0 = r3 instanceof org.json.JSONObject
            if (r0 == 0) goto Lc7
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            if (r3 == 0) goto Lc9
            java.lang.String r0 = "extra"
            java.lang.String r2 = r3.optString(r0)
        L34:
            X.Ol8 r0 = X.C49462Jb8.LIZ
            java.lang.Object r1 = r0.getValue()
            com.google.gson.Gson r1 = (com.google.gson.Gson) r1
            java.lang.Class<com.ss.android.ugc.aweme.search.ecom.data.Product> r0 = com.ss.android.ugc.aweme.search.ecom.data.Product.class
            java.lang.Object r9 = X.C78966Uyw.LJJJJJL(r1, r2, r0)
            com.ss.android.ugc.aweme.search.ecom.data.Product r9 = (com.ss.android.ugc.aweme.search.ecom.data.Product) r9
            if (r9 == 0) goto L63
            if (r3 == 0) goto Lc4
            java.lang.String r0 = "id"
            java.lang.String r19 = r3.optString(r0)
        L4e:
            java.lang.String r0 = r9.idStr
            if (r0 == 0) goto L58
            int r0 = r0.length()
            if (r0 != 0) goto L60
        L58:
            if (r19 == 0) goto L60
            int r0 = r19.length()
            if (r0 != 0) goto L66
        L60:
            r12.add(r9)
        L63:
            int r10 = r10 + 1
            goto L20
        L66:
            java.lang.Long r0 = r9.productId
            r37 = r0
            java.lang.String r0 = r9.title
            r20 = r0
            java.lang.String r0 = r9.cover
            r21 = r0
            java.lang.String r0 = r9.elasticTitle
            r22 = r0
            java.util.List<java.lang.String> r0 = r9.imgUrlList
            r23 = r0
            java.lang.String r0 = r9.formatPrice
            r18 = r0
            java.lang.String r0 = r9.currencySymbol
            r17 = r0
            java.lang.String r15 = r9.formatPriceNumber
            java.lang.String r14 = r9.formatOriginPriceNumber
            java.lang.Integer r8 = r9.currencyPosition
            com.ss.android.ugc.aweme.search.ecom.data.Product$ActivityInfo r7 = r9.activityInfo
            java.lang.String r6 = r9.schema
            java.lang.String r5 = r9.detailUrl
            java.lang.Integer r4 = r9.platform
            java.lang.String r3 = r9.sourceFrom
            java.lang.String r2 = r9.source
            com.ss.android.ugc.aweme.search.ecom.data.Product$ExtraInfo r1 = r9.extra
            java.lang.Integer r0 = r9.bizType
            com.ss.android.ugc.aweme.search.ecom.data.Product r9 = new com.ss.android.ugc.aweme.search.ecom.data.Product
            r24 = r18
            r25 = r17
            r26 = r15
            r27 = r14
            r28 = r8
            r29 = r7
            r30 = r6
            r31 = r5
            r32 = r4
            r33 = r3
            r34 = r2
            r35 = r1
            r36 = r0
            r17 = r9
            r18 = r37
            r20 = r20
            r21 = r21
            r22 = r22
            r23 = r23
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L60
        Lc4:
            r19 = r16
            goto L4e
        Lc7:
            r3 = r16
        Lc9:
            r2 = r16
            goto L34
        Lcd:
            com.ss.android.ugc.aweme.feed.model.search.ProductAnchor r1 = new com.ss.android.ugc.aweme.feed.model.search.ProductAnchor
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r38.getIcon()
            r1.<init>(r0, r12)
            return r1
        Ld7:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49462Jb8.LIZIZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct):com.ss.android.ugc.aweme.feed.model.search.ProductAnchor");
    }
}
