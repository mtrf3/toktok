package X;

import java.util.LinkedHashMap;
import ujb.o;

/* renamed from: X.RyV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71295RyV extends AbstractC27750Auo {
    public C71295RyV(Integer num, String str) {
        super("tiktokec_ecommerce_centre_entry_click");
        LinkedHashMap<String, Object> linkedHashMap = this.LIZIZ;
        linkedHashMap.put("button_for", "orders");
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
