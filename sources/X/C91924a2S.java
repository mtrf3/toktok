package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.a2S, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91924a2S {
    public static final C91924a2S LIZ = new C91924a2S();

    public final void LIZIZ(String str, String str2) {
        LIZ(this, "fp_sdk_bnpl_enter_page", str, str2, null, 24);
    }

    public final void LIZLLL(String str, EnumC91923a2R errorCode, String errorMessage, String str2) {
        o.LJIIIZ(errorCode, "errorCode");
        o.LJIIIZ(errorMessage, "errorMessage");
        OSZ[] oszArr = new OSZ[5];
        if (str == null) {
            str = "";
        }
        oszArr[0] = new OSZ("verify_type", str);
        oszArr[1] = new OSZ("error_code", String.valueOf(errorCode.getValue()));
        oszArr[2] = new OSZ("error_message", errorMessage);
        oszArr[3] = new OSZ("biz_type", "BNPL");
        if (str2 == null) {
            str2 = "";
        }
        oszArr[4] = new OSZ("verifyId", str2);
        LIZ(this, "rd_pipo_bnpl_veryfication", "", null, C113554cx.LJJL(oszArr), 12);
    }

    public static void LIZ(C91924a2S c91924a2S, String str, String str2, String str3, java.util.Map map, int i) {
        String str4 = "";
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) == 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            map = C113554cx.LJJJLIIL();
        }
        c91924a2S.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap.put("merchant_id", C91824a0q.LIZ.LIZ);
        linkedHashMap.put("merchant_user_id", C91824a0q.LIZ.LIZIZ);
        linkedHashMap.put("bnpl_merchant_id", C91824a0q.LIZ());
        linkedHashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        linkedHashMap.put("scene_id", C91824a0q.LIZJ);
        linkedHashMap.put("secondary_scene_id", C91824a0q.LIZLLL);
        linkedHashMap.put("flow_id", C91824a0q.LJ);
        linkedHashMap.put("source_id", C91824a0q.LJFF);
        linkedHashMap.put("fi_id", C91824a0q.LJI);
        linkedHashMap.put("user_status", C91824a0q.LJII);
        linkedHashMap.put("page_id", str2);
        if (C78685UuP.LJJJZ(str4)) {
            linkedHashMap.put("secondary_page_id", str4);
        }
        if (C78685UuP.LJJJZ(str3)) {
            linkedHashMap.put("previous_page_id", str3);
        }
        FMX.LJIIL(str, linkedHashMap);
    }

    public final void LIZJ(int i, int i2, String str, String landingInfo, EnumC91922a2Q errorCode, String str2) {
        o.LJIIIZ(landingInfo, "landingInfo");
        o.LJIIIZ(errorCode, "errorCode");
        LIZ(this, "rd_pipo_bnpl_landing", "", null, C113554cx.LJJL(new OSZ("landing_status", String.valueOf(i)), new OSZ("fail_type", String.valueOf(i2)), new OSZ("landing_page", str), new OSZ("landing_info", landingInfo), new OSZ("error_code", String.valueOf(errorCode.getValue())), new OSZ("error_message", str2), new OSZ("biz_type", "BNPL")), 12);
    }
}
