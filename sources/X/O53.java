package X;

import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O53 {
    public static final ArrayList<O55> LJIIJ = new ArrayList<>();
    public String LIZ;
    public O58 LIZIZ;
    public Long LIZJ;
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Long LJI;
    public Boolean LJII;
    public Long LJIIIIZZ;
    public String LJIIIZ;

    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("request_duration", this.LIZJ);
        jSONObject.put("image_size", this.LIZLLL);
        jSONObject.put("read_response_duration", this.LJ);
        jSONObject.put("decode_duration", this.LJFF);
        jSONObject.put("compress_duration", this.LJI);
        jSONObject.put("duration", this.LJIIIIZZ);
        return jSONObject;
    }

    public final String toString() {
        String jSONObject = LIZIZ().toString();
        o.LJFF(jSONObject, "json.toString()");
        return jSONObject;
    }

    public final void LIZ(JSONObject jSONObject) {
        String str;
        Object LIZ;
        jSONObject.put("image_type", this.LJIIIZ);
        O58 o58 = this.LIZIZ;
        if (o58 != null && (str = o58.LJ) != null) {
            jSONObject.put("image_url", str);
            jSONObject.put("url", this.LIZ);
            try {
                LIZ = UriProtector.parse(str);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = null;
            }
            android.net.Uri uri = (android.net.Uri) LIZ;
            if (uri != null) {
                Object LJJJJI = C78926UyI.LJJJJI(uri, "biz_tag");
                Object LJJJJI2 = C78926UyI.LJJJJI(uri, "scene_tag");
                jSONObject.put("biz_tag", LJJJJI);
                jSONObject.put("scene_tag", LJJJJI2);
            }
        }
    }

    public final void LIZLLL(WebView webView, String str) {
        String str2;
        C60737Nsb hybridContext;
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("type: success, metrics: ");
        LIZ.append(toString());
        LIZ.append(", Uri: ");
        LIZ.append(str);
        LIZ.append(", isSuperResponse = ");
        LIZ.append(this.LJII);
        c39048FUe.LIZ(X1D.LIZIZ(LIZ), EnumC39866Fkk.I, "ImageExtExtension_Metric");
        if (!(webView instanceof WebKitView)) {
            webView = null;
        }
        WebKitView webKitView = (WebKitView) webView;
        if (webKitView == null || (hybridContext = webKitView.getHybridContext()) == null || (str2 = hybridContext.bid) == null) {
            str2 = "hybridkit_default_bid";
        }
        OFH ofh = OFH.LIZLLL;
        C79605VMb c79605VMb = new C79605VMb("hybrid_web_image_metrics");
        c79605VMb.LIZIZ = str2;
        c79605VMb.LIZ = str;
        c79605VMb.LJ = LIZIZ();
        JSONObject LIZLLL = C770830u.LIZLLL("success", 1);
        LIZLLL.put("is_super_response", this.LJII);
        LIZ(LIZLLL);
        c79605VMb.LIZLLL = LIZLLL;
        c79605VMb.LJIIJJI = EnumC40073Fo5.Tea;
        C79604VMa LIZ2 = c79605VMb.LIZ();
        ofh.getClass();
        OFH.LIZLLL(LIZ2);
        Iterator<O55> it = LJIIJ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(true, str, this.LIZLLL, this.LIZJ, this.LJFF, this.LJIIIIZZ, null);
        }
    }

    public static void LIZJ(O53 o532, WebView webView, String str, O54 error) {
        String str2;
        C60737Nsb hybridContext;
        o.LJIIJ(error, "error");
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("type: failed, error: ");
        LIZ.append(error.name());
        LIZ.append(", metrics: ");
        LIZ.append(o532.toString());
        C1DI.LIZIZ(LIZ, ", Uri: ", str, ", isSuperResponse = ");
        LIZ.append(o532.LJII);
        c39048FUe.LIZ(X1D.LIZIZ(LIZ), EnumC39866Fkk.I, "ImageExtExtension_Metric");
        if (!(webView instanceof WebKitView)) {
            webView = null;
        }
        WebKitView webKitView = (WebKitView) webView;
        if (webKitView == null || (hybridContext = webKitView.getHybridContext()) == null || (str2 = hybridContext.bid) == null) {
            str2 = "hybridkit_default_bid";
        }
        OFH ofh = OFH.LIZLLL;
        C79605VMb c79605VMb = new C79605VMb("hybrid_web_image_metrics");
        c79605VMb.LIZIZ = str2;
        c79605VMb.LIZ = str;
        c79605VMb.LJ = o532.LIZIZ();
        JSONObject LIZLLL = C770830u.LIZLLL("success", 0);
        LIZLLL.put("is_super_response", o532.LJII);
        LIZLLL.put("error_code", error.getCode());
        LIZLLL.put("error_msg", error.name());
        o532.LIZ(LIZLLL);
        c79605VMb.LIZLLL = LIZLLL;
        c79605VMb.LJIIJJI = EnumC40073Fo5.Tea;
        C79604VMa LIZ2 = c79605VMb.LIZ();
        ofh.getClass();
        OFH.LIZLLL(LIZ2);
        Iterator<O55> it = LJIIJ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(false, str, o532.LIZLLL, o532.LIZJ, o532.LJFF, o532.LJIIIIZZ, error);
        }
    }
}
