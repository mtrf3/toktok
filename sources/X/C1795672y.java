package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.72y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1795672y {
    public static final java.util.Map<String, C1795572x> LIZ = new LinkedHashMap();

    public static C1795572x LIZ(String aid) {
        o.LJIIIZ(aid, "aid");
        java.util.Map<String, C1795572x> map = LIZ;
        C1795572x c1795572x = (C1795572x) ((LinkedHashMap) map).get(aid);
        if (c1795572x != null) {
            return c1795572x;
        }
        C1795572x c1795572x2 = new C1795572x(0);
        map.put(aid, c1795572x2);
        return c1795572x2;
    }
}
