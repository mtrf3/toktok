package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2v2 */
/* loaded from: classes2.dex */
public final class C73802v2 {
    public static final java.util.Map<Integer, String> LIZ = C113554cx.LJJL(new OSZ(100, "100 - CheckCondition fail"), new OSZ(200, "200 - Read cursor is empty"), new OSZ(201, "201 - Prepare number for normalize is empty"), new OSZ(202, "202 - Normalize result is empty"), new OSZ(203, "203 - Is not possible number"), new OSZ(204, "204 - Is illegal number"), new OSZ(205, "205 - Read exception"), new OSZ(206, "206 - Contact is invalid"), new OSZ(207, "207 - NumberParseException"), new OSZ(208, "208 - Parse fail"), new OSZ(209, "209 - BPEAException"), new OSZ(300, "300 - Transform result is empty"), new OSZ(301, "301 - Phone hashed fail"), new OSZ(302, "302 - Email hashed fail"), new OSZ(401, "401 - Build upload params fail"), new OSZ(402, "402 - Api request fail"));

    public static /* synthetic */ void LIZIZ(int i, String str, int i2) {
        String str2;
        String str3;
        String str4 = str;
        if ((i2 & 2) != 0) {
            str4 = null;
        }
        String str5 = "";
        if ((i2 & 8) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        if ((i2 & 32) == 0) {
            str5 = null;
        }
        LIZ(i, str4, null, str2, str3, str5);
    }

    public static void LIZ(int i, String str, String str2, String str3, String str4, String str5) {
        Integer num;
        String str6;
        HH1.LIZ(str3, "simRegionCode", str4, "sysRegionCode", str5, "usedRegionCode");
        if (str == null && (str = LIZ.get(Integer.valueOf(i))) == null) {
            str = "specify key is null";
        }
        if (str2 != null) {
            num = Integer.valueOf(str2.length());
            if (str2.length() > 3) {
                str6 = str2.substring(0, 3);
                o.LJIIIIZZ(str6, "this as java.lang.String…ing(startIndex, endIndex)");
                C188727au LIZJ = C78920UyC.LIZJ(i, "error_code");
                LIZJ.LJIIIZ("error_message", str);
                LIZJ.LJFF(num, "origin_phone_number_length");
                LIZJ.LJIIIZ("origin_phone_number_segment", str6);
                LIZJ.LJIIIZ("sim_region_code", str3);
                LIZJ.LJIIIZ("sys_region_code", str4);
                LIZJ.LJIIIZ("used_region_code", str5);
                LIZJ.LIZLLL(1, "event_version");
                java.util.Map<String, String> data = LIZJ.LIZ;
                o.LJIIIIZZ(data, "data");
                FMX.LJIIL("process_contact_data", data);
            }
        } else {
            num = null;
        }
        str6 = "";
        C188727au LIZJ2 = C78920UyC.LIZJ(i, "error_code");
        LIZJ2.LJIIIZ("error_message", str);
        LIZJ2.LJFF(num, "origin_phone_number_length");
        LIZJ2.LJIIIZ("origin_phone_number_segment", str6);
        LIZJ2.LJIIIZ("sim_region_code", str3);
        LIZJ2.LJIIIZ("sys_region_code", str4);
        LIZJ2.LJIIIZ("used_region_code", str5);
        LIZJ2.LIZLLL(1, "event_version");
        java.util.Map<String, String> data2 = LIZJ2.LIZ;
        o.LJIIIIZZ(data2, "data");
        FMX.LJIIL("process_contact_data", data2);
    }
}
