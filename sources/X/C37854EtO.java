package X;

import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.EtO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37854EtO {
    public static final void LIZ(C31926Cfy c31926Cfy, F14 f14, String namespace) {
        o.LJIIJ(namespace, "namespace");
        EnumC37847EtH platform = EnumC37847EtH.WEB;
        o.LJIIJ(platform, "platform");
        C31889CfN c31889CfN = new C31889CfN();
        java.util.Map LIZIZ = C37848EtI.LIZIZ(platform, namespace);
        if (LIZIZ != null) {
            for (Map.Entry entry : C113554cx.LJJLIIIJLLLLLLLZ(LIZIZ).entrySet()) {
                c31889CfN.LIZ((String) entry.getKey(), new C37853EtN(entry, c31926Cfy));
            }
        }
        F15 f15 = (F15) C37848EtI.LIZJ(F15.class);
        if (f15 != null) {
            f15.LIZJ(f14, c31889CfN);
        }
    }
}
