package X;

import java.util.List;

/* renamed from: X.Rtu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71010Rtu {
    public static final List<String> LIZ = C47261Igj.LJJIJIIJI("source_page_type", "entrance_form", "product_source", "product_id", "author_id", "is_ad", "action_type", "rec_content_id", "rec_content_type", "request_id", "track_id", "source_content_id", "enter_from_info", "purchase_path");
    public static final List<String> LIZIZ;
    public static final List<String> LIZJ;

    static {
        List<String> LJJIJIIJI = C47261Igj.LJJIJIIJI("anchor_show_type", "author_id", "product_id", "action_type", "product_source", "source_from", "source", "follow_status", "source_page_type", "entrance_form", "is_ad", "rec_content_id", "rec_content_type", "request_id", "search_id", "search_result_id", "effect_ad_extra", "track_id", "campaign_channel", "start_click_time", "previous_page", "source_content_id", "enter_from_info", "rec_session_id", "traffic_source_list", "purchase_path", "saleable_sku_num", "creative_id", "ad_id", "video_shopping_list_style", "biz_type", "rights_content", "rights_cnt");
        LIZIZ = LJJIJIIJI;
        LIZJ = LJJIJIIJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ(java.util.List r5, java.util.Map r6) {
        /*
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r2.hashCode()
            java.lang.String r1 = "video"
            r4 = 0
            switch(r0) {
                case -1366079744: goto L69;
                case -266558761: goto L5c;
                case 741958194: goto L4d;
                case 1276412531: goto L36;
                case 1329423302: goto L29;
                default: goto L1f;
            }
        L1f:
            if (r6 == 0) goto L25
            java.lang.Object r4 = r6.get(r2)
        L25:
            r3.put(r2, r4)
            goto L9
        L29:
            java.lang.String r0 = "source_page_type"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L32
            goto L1f
        L32:
            r3.put(r2, r1)
            goto L9
        L36:
            java.lang.String r1 = "rec_session_id"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L3f
            goto L1f
        L3f:
            if (r6 == 0) goto L47
            java.lang.Object r0 = r6.get(r1)
            if (r0 != 0) goto L49
        L47:
            java.lang.String r0 = ""
        L49:
            r3.put(r2, r0)
            goto L9
        L4d:
            java.lang.String r0 = "anchor_show_type"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L56
            goto L1f
        L56:
            java.lang.String r0 = "video_cart_tag"
            r3.put(r2, r0)
            goto L9
        L5c:
            java.lang.String r0 = "previous_page"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L65
            goto L1f
        L65:
            r3.put(r2, r1)
            goto L9
        L69:
            java.lang.String r1 = "traffic_source_list"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L72
            goto L1f
        L72:
            if (r6 == 0) goto L7e
            java.lang.Object r0 = r6.get(r1)
            if (r0 == 0) goto L7e
            java.lang.String r4 = r0.toString()
        L7e:
            r0 = 2
            int[] r0 = X.M2T.LIZJ(r0, r4)
            r3.put(r2, r0)
            goto L9
        L87:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71010Rtu.LIZ(java.util.List, java.util.Map):java.util.Map");
    }
}
