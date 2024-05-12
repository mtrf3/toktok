package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Eir, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37201Eir {
    public static final String[] LIZ = {".tiktok.com", ".tiktokv.com", ".tiktokcdn.com", ".byteoversea.com", ".tiktokglobalshop.com", ".byteintl.com", ".capcut.net", ".faceueditor.com", ".ibytedtos.com", ".immers.page", ".isnssdk.com", ".sgsnssdk.com"};

    public static boolean LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        android.net.Uri parse = UriProtector.parse(str);
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        String[] strArr = LIZ;
        String[] strArr2 = (String[]) LIZLLL.LJIIIIZZ("pns_inner_domains", String[].class, strArr);
        if (strArr2 != null) {
            strArr = strArr2;
        }
        for (String str2 : strArr) {
            String host = parse.getHost();
            if (host != null) {
                String lowerCase = host.toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (ujb.o.LJJJJ(lowerCase, str2, false)) {
                    return true;
                }
            }
            String lowerCase2 = QZZ.LIZIZ('.', host).toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (ujb.o.LJJJJ(lowerCase2, str2, false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ(String url) {
        o.LJIIIZ(url, "url");
        if (TextUtils.isEmpty(url)) {
            return false;
        }
        android.net.Uri parse = UriProtector.parse(url);
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        String[] strArr = LIZ;
        String[] strArr2 = (String[]) LIZLLL.LJIIIIZZ("pns_inner_domains", String[].class, strArr);
        if (strArr2 != null) {
            strArr = strArr2;
        }
        for (String str : strArr) {
            String host = parse.getHost();
            if (host != null) {
                String lowerCase = host.toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (ujb.o.LJJJJ(lowerCase, str, false)) {
                    return false;
                }
            }
            String lowerCase2 = QZZ.LIZIZ('.', host).toLowerCase(Locale.ROOT);
            o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (ujb.o.LJJJJ(lowerCase2, str, false)) {
                return false;
            }
        }
        return true;
    }
}
