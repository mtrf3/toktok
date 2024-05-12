package X;

import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F44 extends F2U {
    @Override // X.F2U
    public final String LJFF() {
        return "_jsmanage_mbj_test_inlinewithparam";
    }

    @Override // X.F48
    public final JSInjectConfig LIZJ() {
        return new JSInjectConfig(null, null, null, null, null, null, false, 127, null);
    }

    @Override // X.F2U, X.F48
    public final String LJ(android.net.Uri uri, WebView webView) {
        Object LIZ;
        o.LJIIIZ(webView, "webView");
        Object obj = null;
        try {
            F45 f45 = F4G.LIZIZ;
            if (f45 != null) {
                LIZ = (JSInjectConfig) f45.LIZJ("_jsmanage_mbj_test_inlinewithparam", new JSInjectConfig(null, null, null, null, null, null, false, 127, null), JSInjectConfig.class);
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        return GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), obj);
    }
}
