package X;

import android.os.Handler;
import android.webkit.WebResourceResponse;
import java.io.ByteArrayInputStream;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Exw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38136Exw {
    public static final ConcurrentHashMap<String, CountDownLatch> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, WebResourceResponse> LIZIZ = new ConcurrentHashMap<>();
    public static final Handler LIZJ = new Handler(C16880lQ.LLJJJJ());

    public static WebResourceResponse LIZ(String str) {
        byte[] bArr;
        if (str != null) {
            bArr = str.getBytes(PVC.LIZ);
            o.LJIIIIZZ(bArr, "this as java.lang.String).getBytes(charset)");
        } else {
            bArr = null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse("application/json", "utf-8", new ByteArrayInputStream(bArr));
        webResourceResponse.setResponseHeaders(C113554cx.LJJL(new OSZ("Access-Control-Allow-Origin", "*"), new OSZ("Access-Control-Allow-Methods", "GET")));
        return webResourceResponse;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0152, code lost:
    
        if (r4.getCount() == 1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0166, code lost:
    
        if (r12.element != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0168, code lost:
    
        r12.element = X.C38136Exw.LIZIZ.remove(r3.element);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0176, code lost:
    
        return (android.webkit.WebResourceResponse) r12.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0161, code lost:
    
        r4.countDown();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015f, code lost:
    
        if (r4.getCount() != 1) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.webkit.WebResourceResponse, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.webkit.WebResourceResponse LIZIZ(X.C38113ExZ r13, android.webkit.WebResourceRequest r14) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38136Exw.LIZIZ(X.ExZ, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    public static void LIZJ(String callbackId, JSONObject result) {
        o.LJIIIZ(callbackId, "callbackId");
        o.LJIIIZ(result, "result");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("__msg_type", "callback");
        jSONObject.put("__params", result);
        String substring = callbackId.substring(14);
        o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
        jSONObject.put("__callback_id", substring);
        LIZIZ.put(callbackId, LIZ(jSONObject.toString()));
        CountDownLatch remove = LIZ.remove(callbackId);
        if (remove != null) {
            remove.countDown();
        }
    }
}
