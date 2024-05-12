package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.CgJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31947CgJ {
    public static String LIZ;

    public static String LIZIZ(String str) {
        String host;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 27) {
            int indexOf = str.indexOf(92);
            if (indexOf == -1) {
                host = UriProtector.parse(str).getHost();
            } else {
                host = UriProtector.parse(str.substring(0, indexOf)).getHost();
            }
        } else {
            host = UriProtector.parse(str).getHost();
        }
        if (host != null && !host.isEmpty()) {
            str = host;
        }
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("\\.");
            if (split.length >= 2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(split[split.length - 2]);
                LIZ2.append(".");
                LIZ2.append(split[split.length - 1]);
                return X1D.LIZIZ(LIZ2);
            }
            return str;
        }
        return str;
    }

    public static boolean LIZLLL(String str) {
        if (C38354F3m.LJ(str)) {
            return false;
        }
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            return false;
        }
        return true;
    }

    public static boolean LJ(String str) {
        try {
            String host = new java.net.URI(str).getHost();
            if (host != null && !host.isEmpty()) {
                str = host;
            }
            String replace = str.replace("www.", "");
            List<String> LJFF = C31886CfK.LJFF();
            if (replace.isEmpty()) {
                return false;
            }
            return LJFF.contains(replace);
        } catch (Exception unused) {
            return false;
        }
    }

    public static void LIZ(HashMap hashMap, JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            loop0: while (keys != null) {
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        String optString = jSONObject.optString(next);
                        if (!C38354F3m.LJ(next) && !C38354F3m.LJ(optString)) {
                            hashMap.put(next, optString);
                        }
                    } catch (Exception unused) {
                    }
                }
                break loop0;
            }
        }
        if (!C38354F3m.LJ(null)) {
            hashMap.put("User-Agent", null);
        }
    }

    public static String LIZJ(Context context, WebView webView) {
        String str;
        String userAgentString = webView.getSettings().getUserAgentString();
        if (!C38354F3m.LJ(userAgentString)) {
            LIZ = userAgentString;
            return userAgentString;
        }
        if (!C38354F3m.LJ(LIZ)) {
            return LIZ;
        }
        try {
            str = WebSettings.getDefaultUserAgent(context);
        } catch (Throwable unused) {
            str = null;
        }
        LIZ = str;
        if (!C38354F3m.LJ(str)) {
            return LIZ;
        }
        return LIZ;
    }

    public static void LJFF(WebView webView, String str, String str2) {
        if (webView == null || C38354F3m.LJ(str)) {
            return;
        }
        if (!LIZLLL(str)) {
            str2 = null;
        }
        HashMap hashMap = new HashMap();
        if (!C38354F3m.LJ(str2)) {
            hashMap.put("Referer", str2);
        }
        LJI(webView, str, hashMap);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:5|(17:(1:122)|19|(2:22|(2:24|25))|28|(1:30)(1:120)|31|(1:33)(2:116|(1:118)(1:119))|34|(1:36)(1:115)|37|38|39|(1:41)(1:112)|42|(27:45|(2:47|(1:49))(1:99)|50|(1:54)|55|(1:57)|58|(1:60)|61|(1:63)|64|(1:66)|67|(1:69)|70|(1:72)|73|(1:77)|78|(1:82)|83|(1:87)|88|(1:92)|93|(1:97)|98)|100|(2:110|111)(4:104|(1:106)|107|108))(2:(1:12)|13)|14|(2:(1:17)|18)|19|(2:22|(0))|28|(0)(0)|31|(0)(0)|34|(0)(0)|37|38|39|(0)(0)|42|(27:45|(0)(0)|50|(2:52|54)|55|(0)|58|(0)|61|(0)|64|(0)|67|(0)|70|(0)|73|(2:75|77)|78|(2:80|82)|83|(2:85|87)|88|(2:90|92)|93|(2:95|97)|98)|100|(1:102)|110|111) */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0106 A[Catch: Exception -> 0x010e, TRY_LEAVE, TryCatch #1 {Exception -> 0x010e, blocks: (B:39:0x00fb, B:112:0x0106), top: B:38:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(android.webkit.WebView r20, java.lang.String r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31947CgJ.LJI(android.webkit.WebView, java.lang.String, java.util.Map):void");
    }

    public static void LJIIIIZZ(int i, Activity activity, Fragment fragment) {
        String[] strArr;
        if (Build.VERSION.SDK_INT >= 33) {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES"};
        } else {
            strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        new C77276UUm(activity, TokenCert.with("bpea-webcast-hybrid-common-gallery")).LIZ(new C31881CfF(i, activity, fragment), strArr);
    }

    public static void LJII(ActivityC45651qj activityC45651qj, Fragment fragment, String str, String str2) {
        String[] strArr;
        if (!"mounted".equals(C16880lQ.LLLLLLLZIL())) {
            KL2.LJ(activityC45651qj, R.drawable.cpa, activityC45651qj.getString(R.string.sp0));
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            strArr = new String[]{"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES"};
        } else {
            strArr = new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        new C77276UUm(activityC45651qj, TokenCert.with("bpea-webcast-hybrid-common-camera")).LIZ(new C31879CfD(activityC45651qj, fragment, str, str2), strArr);
    }
}
