package X;

import Y.ARunnableS2S0401000_8;
import android.os.Handler;

/* loaded from: classes9.dex */
public final class IOA {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(IOB.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(IOC.LJLIL);

    public static void LIZ(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, InterfaceC65784Pro interfaceC65784Pro, Object obj, int i) {
        if (obj != null) {
            if (!((Boolean) interfaceC88472Yns.invoke(obj)).booleanValue()) {
                return;
            }
            if (i > 0) {
                interfaceC88472Yns2.invoke(obj);
            }
        }
        if (i > ((Number) LIZ.getValue()).longValue()) {
            return;
        }
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS2S0401000_8(interfaceC88472Yns, interfaceC88472Yns2, interfaceC65784Pro, interfaceC65784Pro.invoke(), i, 0), ((Number) LIZIZ.getValue()).longValue());
    }
}
