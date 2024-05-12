package X;

import android.content.Context;
import com.bytedance.push.settings.storage.PushProvider;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class PT2 implements PT3 {
    public static final ConcurrentHashMap<String, InterfaceC66858QLu> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, InterfaceC66858QLu> LIZIZ = new ConcurrentHashMap<>();

    public final InterfaceC66858QLu LIZ(Context context, String str, boolean z) {
        InterfaceC66858QLu pt1;
        if (z) {
            ConcurrentHashMap<String, InterfaceC66858QLu> concurrentHashMap = LIZIZ;
            InterfaceC66858QLu interfaceC66858QLu = concurrentHashMap.get(str);
            if (interfaceC66858QLu != null) {
                return interfaceC66858QLu;
            }
            if (PushProvider.LJLJJI || FCD.LJI(context)) {
                pt1 = new PT1(context, str);
            } else {
                pt1 = new C39174FZa(context, str);
            }
            concurrentHashMap.put(str, pt1);
            return pt1;
        }
        ConcurrentHashMap<String, InterfaceC66858QLu> concurrentHashMap2 = LIZ;
        InterfaceC66858QLu interfaceC66858QLu2 = concurrentHashMap2.get(str);
        if (interfaceC66858QLu2 != null) {
            return interfaceC66858QLu2;
        }
        C64497PSz c64497PSz = new C64497PSz(context, str);
        concurrentHashMap2.put(str, c64497PSz);
        return c64497PSz;
    }
}
