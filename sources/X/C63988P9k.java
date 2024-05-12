package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.P9k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63988P9k {
    public final String LIZ;
    public final InterfaceC63991P9n LIZIZ;
    public final List<Pair<String, String>> LIZJ;

    public C63988P9k(C63989P9l c63989P9l) {
        this.LIZ = c63989P9l.LIZ;
        this.LIZIZ = c63989P9l.LIZIZ;
        this.LIZJ = c63989P9l.LIZJ;
    }

    public static String LIZ(String str, List<Pair<String, String>> list) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            if (list.size() > 0) {
                sb.append("?");
            }
        } else {
            sb.append("&");
        }
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append("&");
            }
            Pair pair = (Pair) ListProtector.get(list, i);
            sb.append((String) pair.first);
            sb.append('=');
            try {
                sb.append(URLEncoder.encode((String) pair.second, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new IllegalArgumentException(e);
            }
        }
        return sb.toString();
    }

    public final JSONObject LIZIZ(Object obj, String str) {
        StringBuilder LIZ = X1D.LIZ();
        return new JSONObject(this.LIZIZ.LIZ(LIZ(JBR.LJFF(LIZ, this.LIZ, str, LIZ), this.LIZJ), obj.toString().getBytes("UTF-8")));
    }
}
