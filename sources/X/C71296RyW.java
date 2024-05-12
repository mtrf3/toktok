package X;

import java.util.LinkedHashMap;
import ujb.o;

/* renamed from: X.RyW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71296RyW extends AbstractC27750Auo {
    public C71296RyW(Integer num, String str) {
        super("tiktokec_ecommerce_centre_entry_show");
        LinkedHashMap<String, Object> linkedHashMap = this.LIZIZ;
        linkedHashMap.put("entry", "navigation_panel");
        if (str != null && !o.LJJJJJL(str)) {
            linkedHashMap.put("entry_name", str);
        }
        if (num != null && num.intValue() > 0) {
            linkedHashMap.put("copywriting", "review_orders");
            linkedHashMap.put("to_review_cnt", num);
        }
    }
}
