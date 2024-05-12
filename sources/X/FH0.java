package X;

import com.bytedance.ies.abmock.ConfigItem;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FH0 {
    public static final ConcurrentHashMap<String, Boolean> LIZ = new ConcurrentHashMap<>();

    public static boolean LIZ(String str) {
        ConfigItem configItem;
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str == null || (configItem = (ConfigItem) ((HashMap) KUZ.LIZ).get(str)) == null || !configItem.isHybrid) {
            return false;
        }
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LIZ;
        if (concurrentHashMap.containsKey(str) && o.LJ(concurrentHashMap.get(str), Boolean.TRUE)) {
            z = true;
        } else {
            z = false;
        }
        if (!concurrentHashMap.containsKey(str) && !FHK.LIZJ.LIZ.contains(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            z3 = true;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("checkTimeout ");
        LIZ2.append(str);
        LIZ2.append(" is timeout:");
        LIZ2.append(z3);
        String msg = X1D.LIZIZ(LIZ2);
        o.LJIIIZ(msg, "msg");
        return z3;
    }
}
