package X;

import com.bytedance.router.SmartRouter;
import ujb.o;

/* loaded from: classes11.dex */
public final class N3P implements InterfaceC58734N3i {
    @Override // X.InterfaceC58734N3i
    public final String LIZ() {
        return "schema";
    }

    @Override // X.InterfaceC58734N3i
    public final boolean LIZIZ(int i, String str) {
        if (str == null || !o.LJJJLIIL(str, "aweme://authorize", false)) {
            return false;
        }
        SmartRouter.buildRoute(C84763XOl.LJIIIIZZ(), str).open();
        return true;
    }
}
