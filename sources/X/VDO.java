package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/* loaded from: classes15.dex */
public final class VDO {
    public final String LIZ;
    public final InterfaceC79374VDe LIZIZ;
    public final List<Pair<String, String>> LIZJ;

    public VDO(VDM vdm) {
        this.LIZ = vdm.LIZ;
        this.LIZIZ = vdm.LIZIZ;
        this.LIZJ = vdm.LIZJ;
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
}
