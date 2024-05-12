package X;

import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.JYz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49365JYz {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LIZLLL(java.util.Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        Object remove = linkedHashMap.remove("enter_from");
        if (remove == null) {
            remove = "";
        }
        linkedHashMap.put("enter_from_info", remove);
        linkedHashMap.remove("page_name");
        linkedHashMap.put("source_page_type", "video");
        return linkedHashMap;
    }

    public static java.util.Map LIZ(User user, Product product, JQA jqa) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String num;
        int i;
        Integer num2;
        String str9 = null;
        if (user != null) {
            str9 = user.getUid();
        }
        String str10 = "";
        if (str9 == null) {
            str9 = "";
        }
        String curUserId = AccountService.LJIJ().LJFF().getCurUserId();
        OSZ[] oszArr = new OSZ[10];
        oszArr[0] = new OSZ("author_id", str9);
        if (product == null || (num2 = product.platform) == null || (str = num2.toString()) == null) {
            str = "";
        }
        oszArr[1] = new OSZ("product_source", str);
        if (product == null || (str2 = product.sourceFrom) == null) {
            str2 = "";
        }
        oszArr[2] = new OSZ("source_from", str2);
        if (product == null || (str3 = product.source) == null) {
            str3 = "";
        }
        oszArr[3] = new OSZ("source", str3);
        if (product == null || (str4 = product.LIZ()) == null) {
            str4 = "";
        }
        oszArr[4] = new OSZ("product_id", str4);
        if (o.LJ(str9, curUserId)) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[5] = new OSZ("is_self", str5);
        if (jqa == null || (str6 = jqa.LJII) == null) {
            str6 = "";
        }
        oszArr[6] = new OSZ("search_id", str6);
        if (jqa == null || (str7 = jqa.LJIILJJIL) == null) {
            str7 = "";
        }
        oszArr[7] = new OSZ("search_result_id", str7);
        if (jqa == null || (str8 = jqa.LJFF) == null) {
            str8 = "";
        }
        oszArr[8] = new OSZ("enter_from", str8);
        oszArr[9] = new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (ujb.o.LJJJJIZL((String) ((LinkedHashMap) LJJLIIIIJ).get("is_self"), CardStruct.IStatusCode.DEFAULT, false)) {
            if (user != null) {
                i = user.getFollowStatus();
            } else {
                i = -1;
            }
            LJJLIIIIJ.put("follow_status", String.valueOf(i));
        }
        if (product != null && product.bizType != null) {
            Integer num3 = product.bizType;
            if (num3 != null && (num = num3.toString()) != null) {
                str10 = num;
            }
            LJJLIIIIJ.put("biz_type", str10);
        }
        return LJJLIIIIJ;
    }

    public static java.util.Map LIZIZ(User user, Product product, JQA jqa) {
        java.util.Map LIZ2 = LIZ(user, product, jqa);
        Object obj = ((LinkedHashMap) LIZ2).get("enter_from");
        if (obj == null) {
            obj = "";
        }
        LIZ2.put("page_name", obj);
        LIZ2.put("entrance_form", "user_showcase_card");
        return LIZ2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r1 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme r5, com.ss.android.ugc.aweme.search.ecom.data.Product r6, X.JQA r7) {
        /*
            r0 = 0
            if (r5 == 0) goto L7
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.getAuthor()
        L7:
            java.util.Map r3 = LIZ(r0, r6, r7)
            r4 = r3
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            java.lang.String r2 = "enter_from"
            java.lang.Object r1 = r4.get(r2)
            java.lang.String r0 = "search_result"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L70
            java.lang.String r1 = "video_search"
        L1e:
            r3.put(r2, r1)
        L21:
            java.lang.Object r1 = r4.get(r2)
            java.lang.String r2 = ""
            if (r1 != 0) goto L2a
            r1 = r2
        L2a:
            java.lang.String r0 = "page_name"
            r3.put(r0, r1)
            java.lang.String r1 = X.JNE.LIZ(r5)
            java.lang.String r0 = "entrance_form"
            r3.put(r0, r1)
            if (r5 == 0) goto L40
            java.lang.String r1 = r5.getAid()
            if (r1 != 0) goto L41
        L40:
            r1 = r2
        L41:
            java.lang.String r0 = "group_id"
            r3.put(r0, r1)
            if (r5 == 0) goto L4e
            int r0 = r5.getTotalProductAnchors()
            if (r0 > 0) goto L6d
        L4e:
            r1 = r2
        L4f:
            java.lang.String r0 = "is_single_anchor"
            r3.put(r0, r1)
            if (r5 == 0) goto L6a
            boolean r1 = r5.isAd()
            r0 = 1
            if (r1 != r0) goto L6a
            java.lang.String r1 = "1"
        L5f:
            java.lang.String r0 = "is_ad"
            r3.put(r0, r1)
            java.lang.String r0 = "anchor_tag"
            r3.put(r0, r2)
            return r3
        L6a:
            java.lang.String r1 = "0"
            goto L5f
        L6d:
            java.lang.String r1 = "yes"
            goto L4f
        L70:
            if (r1 == 0) goto L21
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49365JYz.LIZJ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.search.ecom.data.Product, X.JQA):java.util.Map");
    }
}
