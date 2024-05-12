package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Roj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70689Roj {
    public static C70699Rot LIZ(String productId) {
        o.LJIIIZ(productId, "productId");
        LinkedHashMap linkedHashMap = (LinkedHashMap) C70699Rot.LJLLLL;
        Object obj = linkedHashMap.get(productId);
        if (obj == null) {
            obj = new C70699Rot();
            linkedHashMap.put(productId, obj);
        }
        return (C70699Rot) obj;
    }
}
