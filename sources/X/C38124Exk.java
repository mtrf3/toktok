package X;

import android.webkit.WebResourceResponse;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Exk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38124Exk implements InterfaceC38149Ey9 {
    public final /* synthetic */ C68322mC<WebResourceResponse> LIZ;
    public final /* synthetic */ C68322mC<String> LIZIZ;
    public final /* synthetic */ CountDownLatch LIZJ;

    /* JADX WARN: Type inference failed for: r0v6, types: [android.webkit.WebResourceResponse, T] */
    @Override // X.InterfaceC38149Ey9
    public final void LIZ(String str) {
        String jSONObject;
        C68322mC<WebResourceResponse> c68322mC = this.LIZ;
        if (str == null) {
            jSONObject = null;
        } else {
            JSONObject jSONObject2 = new JSONObject(str);
            String optString = jSONObject2.optString("__callback_id");
            o.LJIIIIZZ(optString, "jsonObject.optString(\"__callback_id\")");
            if (ujb.o.LJJJLIIL(optString, "SANDBOX_PREFIX", false)) {
                String optString2 = jSONObject2.optString("__callback_id");
                o.LJIIIIZZ(optString2, "jsonObject.optString(\"__callback_id\")");
                String substring = optString2.substring(14);
                o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                jSONObject2.put("__callback_id", substring);
            }
            jSONObject = jSONObject2.toString();
        }
        c68322mC.element = C38136Exw.LIZ(jSONObject);
        C38136Exw.LIZ.remove(this.LIZIZ.element);
        this.LIZJ.countDown();
    }

    public C38124Exk(C68322mC<WebResourceResponse> c68322mC, C68322mC<String> c68322mC2, CountDownLatch countDownLatch) {
        this.LIZ = c68322mC;
        this.LIZIZ = c68322mC2;
        this.LIZJ = countDownLatch;
    }
}
