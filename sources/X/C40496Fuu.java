package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Fuu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40496Fuu implements InterfaceC38012Evw {
    public static final C40497Fuv LJLILLLLZI = new C40497Fuv();
    public static Aweme LJLJI;
    public final WeakReference<Context> LJLIL;

    static {
        new LinkedHashMap();
    }

    public C40496Fuu(WeakReference<Context> weakReference) {
        this.LJLIL = weakReference;
    }

    public final void LIZ(C38150EyA dmtJsBridge) {
        o.LJIIIZ(dmtJsBridge, "dmtJsBridge");
        Iterator it = C47261Igj.LJJIJIL("download_click").iterator();
        while (it.hasNext()) {
            dmtJsBridge.LIZ((String) it.next(), this);
        }
        dmtJsBridge.LIZ.hashCode();
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW msg, JSONObject res) {
        JSONObject jSONObject;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AwemeRawAd awemeRawAd4;
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(res, "res");
        if (TextUtils.equals(msg.LIZJ, "download_click")) {
            res.put("code", 0);
            if (msg.LIZLLL.has("app_id")) {
                AwemeRawAd awemeRawAd5 = null;
                r6 = null;
                String str = null;
                AwemeRawAd awemeRawAd6 = null;
                if (msg.LIZLLL.optInt("direct_download", 0) == 1) {
                    String string = JSONObjectProtectorUtils.getString(msg.LIZLLL, "app_id");
                    Context context = this.LJLIL.get();
                    Aweme aweme = LJLJI;
                    if (aweme != null && (awemeRawAd4 = aweme.getAwemeRawAd()) != null) {
                        str = awemeRawAd4.getClickId();
                    }
                    res.put("code", NOE.LJJIIZ(context, string, str) ? 1 : 0);
                    return;
                }
                Object opt = msg.LIZLLL.opt("extParam");
                if (opt instanceof JSONObject) {
                    jSONObject = (JSONObject) opt;
                } else {
                    jSONObject = null;
                }
                if (NO5.LJIIIZ(this.LJLIL.get(), LJLJI)) {
                    res.put("code", 1);
                    Aweme aweme2 = LJLJI;
                    if (aweme2 != null) {
                        awemeRawAd6 = aweme2.getAwemeRawAd();
                    }
                    C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "click", awemeRawAd6);
                    if (jSONObject != null) {
                        Iterator<String> keys = jSONObject.keys();
                        o.LJIIIIZZ(keys, "extParam.keys()");
                        while (keys.hasNext()) {
                            String next = keys.next();
                            LIZLLL.LIZJ(jSONObject.opt(next), next);
                        }
                    }
                    LIZLLL.LJI();
                    Aweme aweme3 = LJLJI;
                    if (aweme3 != null && (awemeRawAd3 = aweme3.getAwemeRawAd()) != null) {
                        O8Z.LIZ("click", awemeRawAd3.getClickTrackUrlList(), awemeRawAd3.getCreativeId(), awemeRawAd3.getLogExtra());
                        return;
                    }
                    return;
                }
                if (C55447LpT.LIZ(this.LJLIL.get(), LJLJI)) {
                    return;
                }
                res.put("code", NOE.LJJIIZ(this.LJLIL.get(), JSONObjectProtectorUtils.getString(msg.LIZLLL, "app_id"), null) ? 1 : 0);
                Aweme aweme4 = LJLJI;
                if (aweme4 != null) {
                    awemeRawAd = aweme4.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "click", awemeRawAd);
                if (jSONObject != null) {
                    Iterator<String> keys2 = jSONObject.keys();
                    o.LJIIIIZZ(keys2, "extParam.keys()");
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        LIZLLL2.LIZJ(jSONObject.opt(next2), next2);
                    }
                }
                LIZLLL2.LJI();
                Aweme aweme5 = LJLJI;
                if (aweme5 != null && (awemeRawAd2 = aweme5.getAwemeRawAd()) != null) {
                    O8Z.LIZ("click", awemeRawAd2.getClickTrackUrlList(), awemeRawAd2.getCreativeId(), awemeRawAd2.getLogExtra());
                }
                Aweme aweme6 = LJLJI;
                if (aweme6 != null) {
                    awemeRawAd5 = aweme6.getAwemeRawAd();
                }
                C58655N0h LIZLLL3 = C58704N2e.LIZLLL("draw_ad", "click_start", awemeRawAd5);
                if (jSONObject != null) {
                    Iterator<String> keys3 = jSONObject.keys();
                    o.LJIIIIZZ(keys3, "extParam.keys()");
                    while (keys3.hasNext()) {
                        String next3 = keys3.next();
                        LIZLLL3.LIZJ(jSONObject.opt(next3), next3);
                    }
                }
                LIZLLL3.LJI();
            }
        }
    }
}
