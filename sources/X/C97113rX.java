package X;

import java.util.LinkedHashMap;

/* renamed from: X.3rX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97113rX {
    public static final java.util.Map<Integer, java.util.Set<Integer>> LIZ = new LinkedHashMap();

    public static void LIZIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9 = C3Y4.LIZJ;
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C111074Xn.LIZ(LIZ2, "onEventV3", "enter_from", str, "enter_method", str2);
        LIZ3.put("search_id", str3);
        LIZ3.put("conversation_id", str4);
        LIZ3.put("interaction_name", str5);
        LIZ3.put("source", str6);
        LIZ3.put("rank", str7);
        LIZ3.put("query_message_id", str8);
        LIZ3.put("process_id", str9);
        LIZ2.LIZIZ("quick_interaction_show", LIZ3);
    }

    public static void LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        String str10 = C3Y4.LIZJ;
        C85323Wm LIZ2 = C772831o.LIZ();
        C1HQ LIZ3 = C111074Xn.LIZ(LIZ2, "onEventV3", "enter_from", str, "enter_method", str2);
        LIZ3.put("search_id", str3);
        LIZ3.put("conversation_id", str4);
        LIZ3.put("interaction_name", str5);
        LIZ3.put("source", str6);
        LIZ3.put("rank", str7);
        LIZ3.put("is_responded", str8);
        LIZ3.put("query_message_id", str9);
        LIZ3.put("process_id", str10);
        LIZ2.LIZIZ("quick_interaction_click", LIZ3);
    }
}
