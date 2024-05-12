package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class F96 extends M56 {
    public static void LJII(String str, HashMap hashMap) {
        if (str == null || str.length() == 0) {
            return;
        }
        Iterator it = s.LJLJJL(str, new String[]{"&"}, 0, 6).iterator();
        while (it.hasNext()) {
            List LJLJJL = s.LJLJJL((String) it.next(), new String[]{"="}, 0, 6);
            if (LJLJJL.size() == 2) {
                hashMap.put(ListProtector.get(LJLJJL, 0), ListProtector.get(LJLJJL, 1));
            }
        }
    }

    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "feedback_input");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        String str;
        String str2;
        int i;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        String str3 = "";
        try {
            str = C2YJ.LIZIZ.LIZ.getFeedbackConf().getFeHelp();
            o.LJIIIIZZ(str, "get().feedbackConf.feHelp");
        } catch (C158056If unused) {
            str = "";
        }
        HashMap hashMap = new HashMap();
        String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "url");
        if (queryParameter != null) {
            str3 = queryParameter;
        }
        int LJJLIIIJJIZ = s.LJJLIIIJJIZ(str3, '?', 0, false, 6);
        if (LJJLIIIJJIZ > 0 && str3.length() > (i = LJJLIIIJJIZ + 1)) {
            String substring = str3.substring(i);
            o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            LJII(substring, hashMap);
        }
        LJII(uri.getEncodedQuery(), hashMap);
        int LJJLIIIJJIZ2 = s.LJJLIIIJJIZ(str3, '?', 0, false, 6);
        if (LJJLIIIJJIZ2 > 0) {
            str2 = str3.substring(0, LJJLIIIJJIZ2);
            o.LJIIIIZZ(str2, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str2 = str3;
        }
        C38281F0r c38281F0r = new C38281F0r(str2);
        for (Map.Entry entry : hashMap.entrySet()) {
            c38281F0r.LIZLLL((String) entry.getKey(), (String) entry.getValue());
        }
        String LJ = c38281F0r.LJ();
        o.LJIIIIZZ(LJ, "urlBuilder.build()");
        String encode = URLEncoder.encode(str3);
        o.LJIIIIZZ(encode, "encode(originalUrl)");
        String encode2 = URLEncoder.encode(LJ);
        o.LJIIIIZZ(encode2, "encode(finalUrl)");
        return C57422MgE.LIZ(activity, UriProtector.parse(ujb.o.LJJJJZ(str, encode, encode2, true)), !z, z);
    }
}
