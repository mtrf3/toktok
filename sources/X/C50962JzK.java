package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import kotlin.jvm.internal.o;

/* renamed from: X.JzK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50962JzK {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C50948Jz6 c50948Jz6, Word word) {
        String str;
        String str2;
        String str3;
        C188727au c188727au = new C188727au();
        if (c50948Jz6 != null) {
            String srcMaterialId = c50948Jz6.getSrcMaterialId();
            if (srcMaterialId != null) {
                c188727au.LJI("enter_product_id", srcMaterialId);
            }
            String groupId = c50948Jz6.getGroupId();
            if (groupId != null) {
                c188727au.LJI("enter_group_id", groupId);
            }
            c188727au.LJI("root_enter_from_type", String.valueOf(c50948Jz6.getEcSearchEntranceValue()));
            Object obtainEcLogData = c50948Jz6.obtainEcLogData("search_entrance");
            if (obtainEcLogData != null) {
                c188727au.LJI("search_entrance", obtainEcLogData.toString());
            }
        }
        c188727au.LJIIIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c188727au.LIZLLL(1, "is_ecom_search");
        c188727au.LJIIIZ("words_source", "search_bar_outer");
        c188727au.LIZLLL(0, "words_position");
        String str4 = null;
        if (word != null) {
            str = word.getWord();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("words_content", str);
        if (c50948Jz6 != null) {
            str2 = c50948Jz6.getGroupId();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("group_id", str2);
        if (word != null) {
            str3 = word.getImplId();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("impr_id", str3);
        if (c50948Jz6 != null) {
            str4 = c50948Jz6.getEnterSearchFrom();
        }
        c188727au.LJIIIZ("search_position", str4);
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …               .builder()");
        C76542zS.LIZ("trending_words_show", map);
    }
}
