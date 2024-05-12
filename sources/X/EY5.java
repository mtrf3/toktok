package X;

import com.bytedance.common.utility.reflect.Reflect;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EY5 extends C39586FgE {
    public EY5() {
        super(9);
    }

    @Override // X.C39586FgE
    public final void LJIIJ(String url) {
        o.LJIIIZ(url, "url");
        super.LJIIJ(url);
        EPI.LIZ(url);
    }

    @Override // X.C39586FgE
    public final void LJIIIZ(java.util.Map map, boolean z) {
        if (EY7.LIZ) {
            try {
                Reflect.on(Reflect.on("android.webkit.WebViewFactory").call("getUpdateService").get()).call("waitForAndGetProvider").get();
            } catch (Exception e) {
                try {
                    C16880lQ.LLLLIIL(e);
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
        }
        super.LJIIIZ(map, z);
    }

    @Override // X.C39586FgE
    public final void LJIIJJI(String url, java.util.Map<String, String> map) {
        o.LJIIIZ(url, "url");
        super.LJIIJJI(url, map);
        EPI.LIZ(url);
    }
}
