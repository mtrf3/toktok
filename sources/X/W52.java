package X;

import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class W52 extends C81695W4l {
    public final HashMap<W5O, Long> LIZIZ = new HashMap<>();

    public static void LJIIL(String str, JSONObject jSONObject) {
        java.util.Map map;
        List<InterfaceC61844OOy> list = QGG.LIZIZ;
        synchronized (list) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Pair LIZ = ((InterfaceC61844OOy) it.next()).LIZ(null, null);
                if (LIZ != null && (map = (java.util.Map) LIZ.second) != null) {
                    try {
                        for (String str2 : map.keySet()) {
                            jSONObject.put(str2, map.get(str2));
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        if (TextUtils.isEmpty(jSONObject.optString("biz_tag"))) {
            android.net.Uri parse = UriProtector.parse(str);
            String queryParameter = UriProtector.getQueryParameter(parse, "biz_tag");
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = UriProtector.getQueryParameter(parse, "from");
            }
            if (queryParameter != null) {
                try {
                    jSONObject.put("biz_tag", queryParameter);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }

    @Override // X.C81695W4l, X.W4V
    public final void LJII(W5O w5o, long j) {
        this.LIZIZ.put(w5o, Long.valueOf(j));
    }

    @Override // X.C81695W4l, X.W4V
    public final void LJIIJJI(String str, W5O w5o) {
        this.LIZIZ.remove(w5o);
    }

    @Override // X.C81695W4l, X.W4V
    public final void LJIIIIZZ(String str, W5O w5o, Throwable th) {
        this.LIZIZ.remove(w5o);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:11|(2:13|(17:15|16|(2:18|(1:20)(2:48|(1:50)(2:51|(1:53)(1:54))))(1:55)|21|22|23|(1:25)(1:44)|26|(1:28)|29|(1:43)(1:33)|34|(1:36)|37|(1:39)|40|41))|56|16|(0)(0)|21|22|23|(0)(0)|26|(0)|29|(1:31)|43|34|(0)|37|(0)|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013b, code lost:
    
        if (X.W58.LIZ.LJIIIIZZ(5) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013d, code lost:
    
        X.W58.LIZ.w("UserSenceListener", "JSONException in FrescoControllerListener");
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0106 A[Catch: JSONException -> 0x0134, TryCatch #0 {JSONException -> 0x0134, blocks: (B:23:0x009c, B:26:0x00ce, B:28:0x0106, B:29:0x0113, B:34:0x0127, B:37:0x0130, B:44:0x011f), top: B:22:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011f A[Catch: JSONException -> 0x0134, TryCatch #0 {JSONException -> 0x0134, blocks: (B:23:0x009c, B:26:0x00ce, B:28:0x0106, B:29:0x0113, B:34:0x0127, B:37:0x0130, B:44:0x011f), top: B:22:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(java.lang.Object r20, X.W5O r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W52.LJIILIIL(java.lang.Object, X.W5O, java.util.Map):void");
    }

    @Override // X.C81695W4l, X.W4V
    public final void LJIIIZ(String str, Object obj, Animatable animatable, W5O w5o, java.util.Map map) {
        try {
            if (C61831OOl.LJIIIZ(w5o.LIZIZ.getHost())) {
                C61831OOl.LJI(w5o, this.LIZIZ.get(w5o));
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
