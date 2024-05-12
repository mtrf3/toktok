package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveSparkLegacyGlobalPropsInjectSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.COc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31246COc extends C60413NnN {
    public final /* synthetic */ InterfaceC60710NsA LJLILLLLZI;

    public C31246COc(InterfaceC60710NsA interfaceC60710NsA) {
        this.LJLILLLLZI = interfaceC60710NsA;
    }

    @Override // X.AbstractC60423NnX
    public final WebResourceResponse LJIJI(WebView webView, String str) {
        COY LIZIZ = COY.LIZIZ();
        LIZIZ.getClass();
        if (!TextUtils.isEmpty(str)) {
            android.net.Uri parse = UriProtector.parse(str);
            Iterator<InterfaceC31244COa> it = LIZIZ.LIZIZ.iterator();
            while (it.hasNext()) {
                WebResourceResponse LIZ = it.next().LIZ(parse, webView);
                if (LIZ != null) {
                    return LIZ;
                }
            }
        }
        return super.LJIJI(webView, str);
    }

    @Override // X.AbstractC60423NnX
    public final void LJFF(WebView webView, String str, Bitmap bitmap) {
        super.LJFF(webView, str, bitmap);
        java.util.Map<String, Object> LJI = ((C60607NqV) this.LJLILLLLZI).LJI();
        if (webView == null || LJI == null || LJI.isEmpty()) {
            return;
        }
        String[] value = LiveSparkLegacyGlobalPropsInjectSetting.INSTANCE.getValue();
        if (value.length == 0 || !C31947CgJ.LJ(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str2 : value) {
            Object obj = LJI.get(str2);
            if (obj != null) {
                jSONObject.put(str2, obj);
            }
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
        String LLLZ = C16880lQ.LLLZ("(function(){var __globalProps=%s;window.__globalProps=__globalProps;})();", Arrays.copyOf(new Object[]{jSONObject2}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        webView.evaluateJavascript(LLLZ, null);
    }
}
