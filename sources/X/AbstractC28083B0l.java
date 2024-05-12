package X;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.B0l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28083B0l extends AbstractC69312nn {
    @Override // X.AbstractC69312nn
    public HashMap LIZ() {
        HashMap hashMap = new HashMap();
        ConcurrentHashMap<String, Object> concurrentHashMap = C27949Ay1.LIZIZ;
        Object obj = concurrentHashMap.get("source_page_type");
        if (obj != null) {
            hashMap.put("source_page_type", obj);
        }
        Object obj2 = concurrentHashMap.get("anchor_show_type");
        if (obj2 != null) {
            hashMap.put("anchor_show_type", obj2);
        }
        Object obj3 = concurrentHashMap.get("product_id");
        if (obj3 != null) {
            hashMap.put("product_id", obj3);
        }
        Object obj4 = concurrentHashMap.get("biz_type");
        if (obj4 != null) {
            hashMap.put("biz_type", obj4);
        }
        return hashMap;
    }

    public /* synthetic */ AbstractC28083B0l(String str) {
        super(str);
    }
}
