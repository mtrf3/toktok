package X;

import java.net.Inet4Address;
import java.net.Inet6Address;
import kotlin.jvm.internal.o;

/* renamed from: X.P3h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63829P3h {
    public static String LIZ(Inet4Address getHostAddress, C78862UxG c78862UxG) {
        o.LJIIJ(getHostAddress, "$this$getHostAddress");
        OHW ohw = new OHW(c78862UxG, C63832P3k.LIZIZ, new String[]{C63832P3k.LIZ}, Integer.valueOf(EnumC39200Fa0.BPEA_ENTRY.getType()), "Collect", 0);
        C78929UyL.LIZIZ(ohw, "java/net/Inet4Address", "getHostAddress()Ljava/lang/String;", null);
        Object LIZ = C39207Fa7.LIZ(ohw, new C63830P3i(getHostAddress));
        o.LJFF(LIZ, "BaseAuthEntry.checkAndCa…hostAddress\n            }");
        return (String) LIZ;
    }

    public static String LIZIZ(Inet6Address getHostAddress, C78862UxG c78862UxG) {
        o.LJIIJ(getHostAddress, "$this$getHostAddress");
        OHW ohw = new OHW(c78862UxG, C63832P3k.LIZIZ, new String[]{C63832P3k.LIZ}, Integer.valueOf(EnumC39200Fa0.BPEA_ENTRY.getType()), "Collect", 0);
        C78929UyL.LIZIZ(ohw, "java/net/Inet6Address", "getHostAddress()Ljava/lang/String;", null);
        Object LIZ = C39207Fa7.LIZ(ohw, new C63831P3j(getHostAddress));
        o.LJFF(LIZ, "BaseAuthEntry.checkAndCa…hostAddress\n            }");
        return (String) LIZ;
    }
}
