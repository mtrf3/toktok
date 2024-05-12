package X;

import com.bytedance.lynx.hybrid.webkit.WebKitView;
import kotlin.jvm.internal.o;

/* renamed from: X.Nu5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60829Nu5 {
    public static boolean LIZ;
    public static C244989jS LIZIZ;

    public static boolean LIZ() {
        C244989jS c244989jS = LIZIZ;
        if (c244989jS != null && !c244989jS.LJLILLLLZI) {
            return C39862Fkg.LIZJ;
        }
        if (LIZ || C39862Fkg.LIZJ) {
            return true;
        }
        return false;
    }

    public static void LIZJ() {
        C39836FkG.LJII.getClass();
        C16880lQ.LLZLL(new WebKitView(C38262Ezy.LIZ().LIZIZ()), new C60830Nu6());
        FD5.LJIIIZ(null, "webview_warmup", "warmup", null, null, null, null, null, 249);
    }

    public static void LIZIZ(C244989jS warmupConfig) {
        o.LJIIJ(warmupConfig, "warmupConfig");
        FD5.LJIIIZ(null, "webview_warmup", "call", null, null, null, null, null, 249);
        if (LIZIZ != null) {
            return;
        }
        LIZIZ = warmupConfig;
        if (!LIZ()) {
            C244989jS c244989jS = LIZIZ;
            if (c244989jS != null) {
                if (c244989jS.LJLIL) {
                    C60882Nuw.LIZ(C60832Nu8.LJLIL);
                    return;
                } else {
                    LIZJ();
                    return;
                }
            }
            o.LJIJI("webViewWarmupConfig");
            throw null;
        }
    }
}
