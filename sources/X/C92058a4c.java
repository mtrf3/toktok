package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.a4c */
/* loaded from: classes20.dex */
public final class C92058a4c {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJFF(long j, String str, String previousPageId) {
        o.LJIIIZ(previousPageId, "previousPageId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("source", previousPageId);
        linkedHashMap.put("interface_return_cost", String.valueOf(j));
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_pin_show", str, previousPageId, linkedHashMap, 8);
    }

    public static void LIZ(long j, String str, String previousPageId, String str2) {
        o.LJIIIZ(previousPageId, "previousPageId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("source", previousPageId);
        linkedHashMap.put("obj_id", str2);
        linkedHashMap.put("click_use_time", String.valueOf(j));
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_pin_click", str, previousPageId, linkedHashMap, 8);
    }

    public static void LIZLLL(String str, String previousPageId, String str2, String popupId) {
        o.LJIIIZ(previousPageId, "previousPageId");
        o.LJIIIZ(popupId, "popupId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("source", previousPageId);
        linkedHashMap.put("obj_id", str2);
        linkedHashMap.put("popup_id", popupId);
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_popup_click", str, previousPageId, linkedHashMap, 8);
    }

    public static void LJ(String str, String previousPageId, String str2, String popupId) {
        o.LJIIIZ(previousPageId, "previousPageId");
        o.LJIIIZ(popupId, "popupId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("source", previousPageId);
        linkedHashMap.put("obj_id", str2);
        linkedHashMap.put("popup_id", popupId);
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_popup_show", str, previousPageId, linkedHashMap, 8);
    }

    public static void LIZIZ(long j, long j2, String str, String previousPageId, String str2, String str3, String str4) {
        o.LJIIIZ(previousPageId, "previousPageId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("source", previousPageId);
        linkedHashMap.put("obj_id", str2);
        linkedHashMap.put("finish_timestamp", String.valueOf(j));
        linkedHashMap.put("duration", String.valueOf(j2));
        if (C78685UuP.LJJJZ(str3)) {
            linkedHashMap.put("pin_err_code", str3);
        }
        if (C78685UuP.LJJJZ(str4)) {
            linkedHashMap.put("verification_err_msg", str4);
        }
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_pin_fillin", str, previousPageId, linkedHashMap, 8);
    }

    public static /* synthetic */ void LIZJ(String str, String str2, String str3, long j, long j2, String str4, int i) {
        String str5 = str4;
        if ((i & 64) != 0) {
            str5 = null;
        }
        LIZIZ(j, j2, str, str2, str3, null, str5);
    }
}
