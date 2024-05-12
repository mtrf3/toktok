package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.HashMap;

/* renamed from: X.Sda, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72546Sda {
    public static final java.util.Map<String, String> LIZ = new HashMap();

    public static void LIZ(android.net.Uri uri) {
        long parseLong;
        long currentTimeMillis;
        if (uri != null && uri.isHierarchical()) {
            String queryParameter = UriProtector.getQueryParameter(uri, "x-expires");
            if (TextUtils.isEmpty(queryParameter)) {
                return;
            }
            try {
                parseLong = CastLongProtector.parseLong(queryParameter);
                currentTimeMillis = System.currentTimeMillis();
                if (queryParameter.length() == 10) {
                    currentTimeMillis /= 1000;
                }
            } catch (NumberFormatException unused) {
                if (0 == 0) {
                    return;
                }
            }
            if (currentTimeMillis <= parseLong) {
                return;
            }
            String stackTraceString = android.util.Log.getStackTraceString(new Throwable());
            ((HashMap) LIZ).put(uri.toString(), stackTraceString);
        }
    }

    public static boolean LIZIZ(android.net.Uri uri) {
        if (uri == null || !uri.isHierarchical() || C81814W9a.LJIIJ().LIZIZ.LJJIIJZLJL.LIZ() == null) {
            return false;
        }
        String queryParameter = UriProtector.getQueryParameter(uri, "x-expires");
        if (TextUtils.isEmpty(queryParameter)) {
            return false;
        }
        long LIZ2 = ((InterfaceC72547Sdb) C81814W9a.LJIIJ().LIZIZ.LJJIIJZLJL.LIZ()).LIZ();
        try {
            long parseLong = CastLongProtector.parseLong(queryParameter);
            if (queryParameter.length() == 10) {
                LIZ2 /= 1000;
            }
            if (LIZ2 <= parseLong) {
                return false;
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
