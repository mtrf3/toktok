package X;

import java.util.TimerTask;
import kotlin.jvm.internal.AqS175S0100000_9;

/* loaded from: classes10.dex */
public final class MDV extends TimerTask {
    public static void LIZ() {
        try {
            C10H c10h = MDW.LIZ;
            if (c10h != null) {
                c10h.LIZ();
            }
        } catch (IllegalStateException unused) {
        }
        MDW.LIZ = null;
        MDW.LJ = MDU.RESPONSE_TIMEOUT;
        MDX mdx = MDW.LJI;
        if (mdx != null) {
            C56574MIg c56574MIg = new C56574MIg(new Object[0]);
            MIZ.LIZ.getClass();
            c56574MIg.LJIILJJIL(MIZ.LIZIZ, new AqS175S0100000_9(mdx, 581));
        }
        InterfaceC55741LuD interfaceC55741LuD = MDW.LIZJ;
        if (interfaceC55741LuD != null) {
            interfaceC55741LuD.LIZ(MDW.LJ);
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
