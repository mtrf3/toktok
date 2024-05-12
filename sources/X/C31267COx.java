package X;

import com.bytedance.android.livesdk.livesetting.slot.LiveOutsideBizRegisterPrioritySetting;
import java.util.HashMap;

/* renamed from: X.COx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31267COx {
    public static final java.util.Map<EnumC30736C4m, java.util.Map<String, Integer>> LIZ;
    public static final java.util.Map<EnumC31730Cco, java.util.Map<String, Integer>> LIZIZ;
    public static final java.util.Map<String, Integer> LIZJ;
    public static final int LIZLLL;

    static {
        HashMap hashMap = new HashMap();
        LIZ = hashMap;
        HashMap hashMap2 = new HashMap();
        LIZIZ = hashMap2;
        HashMap hashMap3 = new HashMap();
        LIZJ = hashMap3;
        LIZLLL = 999;
        hashMap.put(EnumC30736C4m.SLOT_LIVE_WATCHER_TOOLBAR, LIZ());
        hashMap.put(EnumC30736C4m.SLOT_LIVE_WATCHER_L2_TOOLBAR, LIZ());
        EnumC30736C4m enumC30736C4m = EnumC30736C4m.SLOT_BROADCAST_PREVIEW_TOOLBAR;
        HashMap hashMap4 = new HashMap();
        hashMap4.put("business_links", 0);
        hashMap4.put("ec_shop", 0);
        hashMap.put(enumC30736C4m, hashMap4);
        EnumC30736C4m enumC30736C4m2 = EnumC30736C4m.SLOT_LIVE_ANCHOR_TOOLBAR;
        HashMap hashMap5 = new HashMap();
        if (2 == LiveOutsideBizRegisterPrioritySetting.INSTANCE.getValue()) {
            hashMap5.put("ec_shop", 2);
            hashMap5.put("business_links", 1);
        } else {
            hashMap5.put("ec_shop", 1);
            hashMap5.put("business_links", 2);
        }
        hashMap.put(enumC30736C4m2, hashMap5);
        EnumC31730Cco enumC31730Cco = EnumC31730Cco.SLOT_LIVE_BOTTOM_POP;
        HashMap hashMap6 = new HashMap();
        hashMap6.put("business_links", 0);
        hashMap6.put("ec_shop", 0);
        hashMap2.put(enumC31730Cco, hashMap6);
        hashMap3.put("game_partnership", 0);
        hashMap3.put("ec_shop", 1);
        hashMap3.put("business_links", 2);
        hashMap3.put("ba_leads_gen", 3);
        hashMap3.put("live_paid_series", 4);
    }

    public static java.util.Map<String, Integer> LIZ() {
        HashMap hashMap = new HashMap();
        if (2 == LiveOutsideBizRegisterPrioritySetting.INSTANCE.getValue()) {
            hashMap.put("ec_shop", 2);
            hashMap.put("business_links", 1);
        } else {
            hashMap.put("ec_shop", 1);
            hashMap.put("business_links", 2);
        }
        return hashMap;
    }

    public static int LIZIZ(String str) {
        Integer num = (Integer) ((HashMap) LIZJ).get(str);
        if (num == null) {
            return LIZLLL;
        }
        return num.intValue();
    }

    public static int LIZJ(EnumC30736C4m enumC30736C4m, String str) {
        Integer num;
        java.util.Map map = (java.util.Map) ((HashMap) LIZ).get(enumC30736C4m);
        if (map == null || (num = (Integer) map.get(str)) == null) {
            return LIZLLL;
        }
        return num.intValue();
    }
}
