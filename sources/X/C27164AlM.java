package X;

import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.AlM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27164AlM {
    public final LinkedHashMap<String, Object> LIZ;
    public boolean LIZIZ;
    public long LIZJ;
    public long LIZLLL;

    public C27164AlM(HashMap<String, Object> hashMap, String str, Integer num) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        this.LIZ = linkedHashMap;
        if (hashMap != null) {
            linkedHashMap.putAll(hashMap);
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "secure_payments");
        linkedHashMap.put("previous_page", "ccdc_card_info");
        if (num != null) {
            linkedHashMap.put("is_with_delivery_info", Integer.valueOf(num.intValue()));
        }
        if (str != null) {
            linkedHashMap.put("fill_type", str);
        }
    }
}
