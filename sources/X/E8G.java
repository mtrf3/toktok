package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E8G {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, java.util.Map map, java.util.Map map2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("realMonitor serviceName:");
        LIZ2.append(str);
        LIZ2.append(",category:");
        LIZ2.append(map);
        LIZ2.append(',');
        LIZ2.append("metric:");
        LIZ2.append(map2);
        LIZ2.append(",extraLog:");
        LIZ2.append((Object) null);
        String message = X1D.LIZIZ(LIZ2);
        o.LJIIJ(message, "message");
        F7E.LJI.getClass();
        InterfaceC35904E7g interfaceC35904E7g = F7E.LJFF;
        if (interfaceC35904E7g != null) {
            interfaceC35904E7g.LIZ(str, map, map2);
        }
    }
}
