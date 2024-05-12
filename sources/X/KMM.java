package X;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final /* synthetic */ class KMM extends TBS implements InterfaceC88472Yns<java.util.Map<String, ? extends String>, C76800UCe> {
    public KMM(C56092Lzs c56092Lzs) {
        super(1, c56092Lzs, C56092Lzs.class, "sendCartEntryShowTestEvent", "sendCartEntryShowTestEvent(Ljava/util/Map;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(java.util.Map<String, ? extends String> map) {
        java.util.Map<String, ? extends String> p0 = map;
        o.LJIIIZ(p0, "p0");
        this.receiver.getClass();
        ConcurrentHashMap<String, Integer> concurrentHashMap = C56092Lzs.LIZIZ;
        Integer num = concurrentHashMap.get("tiktokec_cart_entrance_show_test");
        if (num == null) {
            num = Integer.MAX_VALUE;
        }
        int intValue = num.intValue();
        if (intValue > 0) {
            if (intValue != Integer.MAX_VALUE) {
                concurrentHashMap.put("tiktokec_cart_entrance_show_test", Integer.valueOf(intValue - 1));
            }
            HashMap LIZJ = C03660Ck.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
            C56092Lzs.LIZ.getClass();
            LIZJ.put("enter_from", C56092Lzs.LIZJ());
            LIZJ.put("page_name", "mall");
            for (Map.Entry<String, ? extends String> entry : p0.entrySet()) {
                LIZJ.put(entry.getKey(), entry.getValue());
            }
            C56092Lzs.LJIILIIL("tiktokec_cart_entrance_show_test", LIZJ);
        }
        return C76800UCe.LIZ;
    }
}
