package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J99 {
    public static void LIZ(EnumC79773VSn actionType, EnumC79770VSk enumC79770VSk, HashMap hashMap) {
        Object LIZ;
        String str;
        o.LJIIIZ(actionType, "actionType");
        if (enumC79770VSk != null && hashMap != null) {
            try {
                HashMap hashMap2 = (HashMap) hashMap.get("extra_info");
                if (hashMap2 != null) {
                    Object obj = hashMap2.get("start_time");
                    if (obj != null && (obj instanceof Long)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long longValue = currentTimeMillis - ((Number) obj).longValue();
                        int i = C79772VSm.LIZ[actionType.ordinal()];
                        int i2 = 1;
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new C162476Zf();
                                }
                                str = "S";
                            } else {
                                str = "B";
                            }
                        } else {
                            str = "T";
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("start_time", obj);
                        linkedHashMap.put("show_notice_time", Long.valueOf(currentTimeMillis));
                        linkedHashMap.put("notice_time", Long.valueOf(longValue));
                        int i3 = C79772VSm.LIZIZ[enumC79770VSk.ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    i2 = -1;
                                } else {
                                    i2 = 2;
                                }
                            }
                        } else {
                            i2 = 0;
                        }
                        linkedHashMap.put("detect_res", Integer.valueOf(i2));
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("extra_info", linkedHashMap);
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("network_status", str);
                        c188727au.LJFF(hashMap3, "network_status_detail");
                        FMX.LJIIL("network_observe_report", c188727au.LIZ);
                    }
                    LIZ = C76800UCe.LIZ;
                } else {
                    LIZ = null;
                }
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            C3C5.m6boximpl(LIZ);
        }
    }
}
