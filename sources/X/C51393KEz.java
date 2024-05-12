package X;

import org.json.JSONObject;

/* renamed from: X.KEz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51393KEz {
    public static final /* synthetic */ C51393KEz LIZ = new C51393KEz();

    public static void LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C43588H8u.LIZLLL(str2, "wordsContent", str3, "searchPosition", str4, "groupId", str5, "imprId");
        JSONObject LIZIZ = C1B8.LIZIZ("words_source", str, "words_position", 0);
        LIZIZ.put("words_content", str2);
        LIZIZ.put("search_position", str3);
        LIZIZ.put("group_id", str4);
        LIZIZ.put("impr_id", str5);
        LIZIZ.put("enter_group_id", str6);
        LIZIZ.put("is_ecom_search", str7);
        LIZIZ.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        C48658J7u.LIZIZ("trending_words_click", LIZIZ);
    }

    public static void LIZIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C43588H8u.LIZLLL(str2, "wordsContent", str3, "searchPosition", str4, "groupId", str5, "imprId");
        JSONObject LIZIZ = C1B8.LIZIZ("words_source", str, "words_position", 0);
        LIZIZ.put("words_content", str2);
        LIZIZ.put("search_position", str3);
        LIZIZ.put("group_id", str4);
        LIZIZ.put("impr_id", str5);
        LIZIZ.put("enter_group_id", str6);
        LIZIZ.put("is_ecom_search", str7);
        LIZIZ.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        C48658J7u.LIZIZ("trending_words_show", LIZIZ);
    }
}
