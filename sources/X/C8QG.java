package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8QG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8QG {
    public static void LIZ(String str, String str2, String str3, int i, String str4, java.util.Map eventExtraParams, int i2) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        if ((i2 & 4) != 0) {
            str3 = "";
        }
        if ((i2 & 32) != 0) {
            eventExtraParams = C113554cx.LJJJLIIL();
        }
        o.LJIIIZ(eventExtraParams, "eventExtraParams");
        if (!C8QH.LIZ) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("event_type", str);
            c188727au.LJIIIZ("enter_from", str2);
            c188727au.LJIIIZ("panel_scene", str3);
            c188727au.LJIIIZ("component_name", str4);
            c188727au.LIZLLL(i, "error_type");
            c188727au.LJIIIIZZ(eventExtraParams);
            FMX.LJIIL("feed_platform_component_monitor", c188727au.LIZ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Component : ");
            LIZ.append(str4);
            LIZ.append(" eventType : ");
            LIZ.append(str);
            LIZ.append(" enterFrom : ");
            YE1.LIZLLL(LIZ, str2, "  panelScene : ", str3, "  errorType : ");
            LIZ.append(i);
            C60392Yp.LIZIZ("feed_platform_component_monitor", X1D.LIZIZ(LIZ));
        }
    }
}
