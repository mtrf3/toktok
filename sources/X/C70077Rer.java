package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Rer, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70077Rer {
    public static C70646Ro2 LIZ(String productId) {
        o.LJIIIZ(productId, "productId");
        HashMap<String, C70646Ro2> hashMap = C70646Ro2.LJIIL;
        C70646Ro2 c70646Ro2 = hashMap.get(productId);
        if (c70646Ro2 == null) {
            c70646Ro2 = new C70646Ro2(productId);
            hashMap.put(productId, c70646Ro2);
        }
        return c70646Ro2;
    }
}
