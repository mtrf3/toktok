package X;

import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JZ0 {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LIZ(Aweme aweme, Product product, JQA jqa, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Long l;
        String str12;
        Product.ExtraInfo extraInfo;
        String str13;
        int i;
        Integer num;
        User author = aweme.getAuthor();
        Long l2 = null;
        if (author != null) {
            str3 = author.getUid();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        String curUserId = AccountService.LJIJ().LJFF().getCurUserId();
        OSZ[] oszArr = new OSZ[10];
        int i2 = 0;
        oszArr[0] = new OSZ("author_id", str3);
        if (product == null || (num = product.platform) == null || (str4 = num.toString()) == null) {
            str4 = "";
        }
        oszArr[1] = new OSZ("product_source", str4);
        if (product == null || (str5 = product.sourceFrom) == null) {
            str5 = "";
        }
        oszArr[2] = new OSZ("source_from", str5);
        if (product == null || (str6 = product.source) == null) {
            str6 = "";
        }
        oszArr[3] = new OSZ("source", str6);
        if (product == null || (str7 = product.LIZ()) == null) {
            str7 = "";
        }
        oszArr[4] = new OSZ("product_id", str7);
        if (o.LJ(str3, curUserId)) {
            str8 = "1";
        } else {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[5] = new OSZ("is_self", str8);
        if (jqa == null || (str9 = jqa.LJII) == null) {
            str9 = "";
        }
        oszArr[6] = new OSZ("search_id", str9);
        if (jqa == null || (str10 = jqa.LJIILJJIL) == null) {
            str10 = "";
        }
        oszArr[7] = new OSZ("search_result_id", str10);
        if (jqa == null || (str11 = jqa.LJFF) == null) {
            str11 = "";
        }
        oszArr[8] = new OSZ("enter_from", str11);
        oszArr[9] = new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (ujb.o.LJJJJIZL((String) ((LinkedHashMap) LJJLIIIIJ).get("is_self"), CardStruct.IStatusCode.DEFAULT, false)) {
            if (author != null) {
                i = author.getFollowStatus();
            } else {
                i = -1;
            }
            LJJLIIIIJ.put("follow_status", String.valueOf(i));
        }
        if (product != null && product.bizType != null) {
            Integer num2 = product.bizType;
            if (num2 == null || (str13 = num2.toString()) == null) {
                str13 = "";
            }
            LJJLIIIIJ.put("biz_type", str13);
        }
        Object remove = LJJLIIIIJ.remove("enter_from");
        if (remove == null) {
            remove = "";
        }
        if (product != null && (extraInfo = product.extra) != null) {
            i2 = extraInfo.isPinned;
        }
        User author2 = aweme.getAuthor();
        if (author2 != null) {
            l = Long.valueOf(C78934UyQ.LJIILJJIL(author2));
        } else {
            l = null;
        }
        LJJLIIIIJ.put("room_id", String.valueOf(l));
        LJJLIIIIJ.put("is_ad", CardStruct.IStatusCode.DEFAULT);
        if (jqa == null || (str12 = jqa.LJIIIIZZ) == null) {
            str12 = "";
        }
        LJJLIIIIJ.put("request_id", str12);
        LJJLIIIIJ.put("enter_method", "");
        LJJLIIIIJ.put("action_type", "");
        LJJLIIIIJ.put("page_name", remove);
        LJJLIIIIJ.put("enter_from_merge", remove);
        LJJLIIIIJ.put("entrance_form", str);
        LJJLIIIIJ.put("card_type", String.valueOf(i2));
        User author3 = aweme.getAuthor();
        if (author3 != null) {
            l2 = Long.valueOf(C78934UyQ.LJIILJJIL(author3));
        }
        LJJLIIIIJ.put("list_item_id", String.valueOf(l2));
        if (str2 == null) {
            str2 = "";
        }
        LJJLIIIIJ.put("last_from_group_id", str2);
        return LJJLIIIIJ;
    }
}
