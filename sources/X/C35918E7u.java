package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.E7u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35918E7u {
    public static boolean LIZ;
    public static String LIZIZ;

    public static void LIZ(C188727au c188727au, String str) {
        String str2;
        if (str == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            o.LJIIIIZZ(keys, "jsonObject.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt != null) {
                    str2 = opt.toString();
                } else {
                    str2 = null;
                }
                c188727au.LJI(next, str2);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static void LIZIZ(C188727au c188727au, String str) {
        android.net.Uri parse = UriProtector.parse(str);
        c188727au.LJIIIZ("page_url", str);
        c188727au.LJIIIZ("domain_name", parse.getHost());
        c188727au.LJIIIZ("page_path", parse.getPath());
    }

    public static void LIZJ(String str, boolean z) {
        String str2;
        C188727au LIZLLL = KNV.LIZLLL(str, "url");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZLLL.LJIIIZ("page_loaded", str2);
        LIZIZ(LIZLLL, str);
        LIZ(LIZLLL, LIZIZ);
        FMX.LJIIL("enter_poi_webview", LIZLLL.LIZ);
    }
}
