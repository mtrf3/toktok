package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final /* synthetic */ class KMK extends TBS implements InterfaceC88472Yns<java.util.Map<String, ? extends String>, C76800UCe> {
    public KMK(C56045Lz7 c56045Lz7) {
        super(1, c56045Lz7, C56045Lz7.class, "sendCartEntryShowEvent", "sendCartEntryShowEvent(Ljava/util/Map;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(java.util.Map<String, ? extends String> map) {
        java.util.Map<String, ? extends String> p0 = map;
        o.LJIIIZ(p0, "p0");
        this.receiver.getClass();
        ConcurrentHashMap<String, Integer> concurrentHashMap = C56045Lz7.LIZIZ;
        Integer num = concurrentHashMap.get("tiktokec_cart_entrance_show");
        if (num == null) {
            num = Integer.MAX_VALUE;
        }
        int intValue = num.intValue();
        if (intValue > 0) {
            if (intValue != Integer.MAX_VALUE) {
                concurrentHashMap.put("tiktokec_cart_entrance_show", Integer.valueOf(intValue - 1));
            }
            C76542zS.LIZJ("tiktokec_cart_entrance_show", new AqS174S0100000_8(p0, (java.util.Map<String, String>) 199));
        }
        return C76800UCe.LIZ;
    }
}
