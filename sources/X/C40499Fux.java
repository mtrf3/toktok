package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

/* renamed from: X.Fux, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40499Fux implements C0RF {
    public static final C40499Fux LIZ = new C40499Fux();

    @Override // X.C0RF
    public final void LIZ(String it) {
        o.LJIIIIZZ(it, "it");
        if (!ujb.o.LJJJLIIL(it, "aweme://webview/", false)) {
            SmartRoute buildRoute = SmartRouter.buildRoute(FKM.LIZIZ(), "aweme://webview/");
            buildRoute.withParam("url", it);
            buildRoute.open();
            return;
        }
        SmartRouter.buildRoute(FKM.LIZIZ(), it).open();
    }
}
