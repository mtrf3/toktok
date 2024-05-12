package X;

import android.content.Context;
import android.text.TextUtils;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import java.net.CookieHandler;
import java.util.List;
import java.util.Map;

/* renamed from: X.OPk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61856OPk extends TTAppInfoProvider {
    public static C61856OPk LIZJ;
    public TTAppInfoProvider.AppInfo LIZ;
    public final Context LIZIZ;

    public C61856OPk(Context context) {
        this.LIZIZ = C16880lQ.LLLLL(context);
    }

    public static String LIZ(String str) {
        CookieHandler cookieHandler = CookieHandler.getDefault();
        if (!TextUtils.isEmpty(str) && cookieHandler != null) {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("https://");
                LIZ.append(str);
                java.util.Map<String, List<String>> map = cookieHandler.get(EZY.LIZIZ(X1D.LIZIZ(LIZ)), null);
                if (map != null && map.size() > 0) {
                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        if ("Cookie".equalsIgnoreCase(entry.getKey()) && !entry.getValue().isEmpty()) {
                            StringBuilder sb = new StringBuilder();
                            int i = 0;
                            for (String str2 : entry.getValue()) {
                                if (i > 0) {
                                    sb.append("; ");
                                }
                                sb.append(str2);
                                i++;
                            }
                            return sb.toString();
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static C61856OPk LIZIZ(Context context) {
        if (LIZJ == null) {
            synchronized (C61856OPk.class) {
                if (LIZJ == null) {
                    LIZJ = new C61856OPk(context);
                }
            }
        }
        return LIZJ;
    }
}
