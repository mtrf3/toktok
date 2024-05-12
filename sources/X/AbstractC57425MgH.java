package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.MgH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC57425MgH {
    public static boolean LJII(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.startsWith("http") || charSequence2.startsWith("https") || charSequence2.startsWith("about:")) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIZ(String str) {
        if (!C38354F3m.LJ(str) && "1".equals(str)) {
            return true;
        }
        return false;
    }

    public static String LIZ(int i, String str) {
        if (str != null && C40680Fxs.LIZIZ(str)) {
            try {
                if (!((ArrayList) C38083Ex5.LIZIZ(Collections.singletonList("host"), false)).contains(UriProtector.parse(str).getHost())) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(str);
                if (!str.contains("?")) {
                    sb.append("?");
                } else {
                    sb.append("&");
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("status_bar_height=");
                LIZ.append(i);
                sb.append(X1D.LIZIZ(LIZ));
                return sb.toString();
            } catch (Exception unused) {
            }
        }
        return str;
    }

    public static Intent LJI(Context context, android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
            String queryParameter = UriProtector.getQueryParameter(uri, "url");
            if (C38354F3m.LJ(queryParameter)) {
                return null;
            }
            boolean LJIIIZ = LJIIIZ(UriProtector.getQueryParameter(uri, "no_hw"));
            boolean LJIIIZ2 = LJIIIZ(UriProtector.getQueryParameter(uri, "hide_more"));
            boolean LJIIIZ3 = LJIIIZ(UriProtector.getQueryParameter(uri, "hide_bar"));
            boolean LJIIIZ4 = LJIIIZ(UriProtector.getQueryParameter(uri, "hide_status_bar"));
            boolean LJIIIZ5 = LJIIIZ(UriProtector.getQueryParameter(uri, "hide_nav_bar"));
            try {
                boolean LJIIIZ6 = LJIIIZ(UriProtector.getQueryParameter(uri, "hide_more"));
                if (LJIIIZ3 || LJIIIZ5) {
                    intent.putExtra("hide_nav_bar", true);
                }
                if (LJIIIZ4) {
                    intent.putExtra("hide_status_bar", true);
                }
                String queryParameter2 = UriProtector.getQueryParameter(uri, "ad_id");
                if (!C38354F3m.LJ(queryParameter2)) {
                    try {
                        intent.putExtra("ad_id", CastLongProtector.parseLong(queryParameter2));
                    } catch (Exception unused) {
                    }
                }
                String decode = URLDecoder.decode(queryParameter, "UTF-8");
                intent.setData(UriProtector.parse(decode));
                intent.putExtra("swipe_mode", 2);
                intent.putExtra("show_toolbar", true);
                if (LJIIIZ) {
                    intent.putExtra("bundle_no_hw_acceleration", true);
                }
                if (LJIIIZ2) {
                    intent.putExtra("hide_more", true);
                }
                if (!LJIIIZ6) {
                    intent.putExtra("hide_more", LJIIIZ6);
                }
                String queryParameter3 = UriProtector.getQueryParameter(uri, "title");
                if (C38354F3m.LJ(queryParameter3)) {
                    queryParameter3 = UriProtector.getQueryParameter(UriProtector.parse(decode), "title");
                }
                String queryParameter4 = UriProtector.getQueryParameter(uri, "title_extra");
                if (!C38354F3m.LJ(queryParameter4)) {
                    queryParameter3 = queryParameter4;
                }
                if (!C38354F3m.LJ(queryParameter3)) {
                    intent.putExtra("title", queryParameter3);
                } else {
                    intent.putExtra("title", " ");
                    intent.putExtra("use_webview_title", true);
                }
                String queryParameter5 = UriProtector.getQueryParameter(uri, "gd_label");
                if (!C38354F3m.LJ(queryParameter5)) {
                    intent.putExtra("gd_label", queryParameter5);
                }
                String queryParameter6 = UriProtector.getQueryParameter(uri, "gd_ext_json");
                if (!C38354F3m.LJ(queryParameter6)) {
                    intent.putExtra("gd_ext_json", queryParameter6);
                }
                String queryParameter7 = UriProtector.getQueryParameter(uri, "webview_track_key");
                if (!C38354F3m.LJ(queryParameter7)) {
                    intent.putExtra("webview_track_key", queryParameter7);
                }
                String queryParameter8 = UriProtector.getQueryParameter(uri, "wap_headers");
                if (!C38354F3m.LJ(queryParameter8)) {
                    intent.putExtra("wap_headers", queryParameter8);
                }
                return intent;
            } catch (Exception unused2) {
                return null;
            }
        } catch (Exception unused3) {
            return null;
        }
    }

    public static boolean LIZJ(android.net.Uri uri, Bundle bundle, String str) {
        if (uri != null && uri.isHierarchical() && !TextUtils.isEmpty(UriProtector.getQueryParameter(uri, str))) {
            if (!UriProtector.getQueryParameter(uri, str).equals("1") && !UriProtector.getQueryParameter(uri, str).equals("true")) {
                return false;
            }
            return true;
        }
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean(str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[Catch: Exception -> 0x004e, TRY_LEAVE, TryCatch #0 {Exception -> 0x004e, blocks: (B:24:0x0007, B:26:0x000d, B:28:0x0013, B:4:0x0017, B:7:0x001f, B:9:0x0025, B:10:0x0029, B:12:0x002f, B:14:0x0035, B:15:0x0043, B:17:0x0049), top: B:23:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZLLL(android.net.Uri r3, android.os.Bundle r4, java.lang.String r5) {
        /*
            java.lang.String r2 = "#"
            if (r3 == 0) goto L5
            goto L7
        L5:
            r1 = 0
            goto L17
        L7:
            boolean r0 = r3.isHierarchical()     // Catch: java.lang.Exception -> L4e
            if (r0 == 0) goto L5
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r3, r5)     // Catch: java.lang.Exception -> L4e
            if (r0 == 0) goto L5
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r3, r5)     // Catch: java.lang.Exception -> L4e
        L17:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L4e
            if (r0 == 0) goto L29
            if (r4 == 0) goto L29
            java.lang.String r0 = r4.getString(r5)     // Catch: java.lang.Exception -> L4e
            if (r0 == 0) goto L29
            java.lang.String r1 = r4.getString(r5)     // Catch: java.lang.Exception -> L4e
        L29:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L4e
            if (r0 != 0) goto L43
            boolean r0 = r1.contains(r2)     // Catch: java.lang.Exception -> L4e
            if (r0 != 0) goto L43
            java.lang.StringBuilder r0 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L4e
            r0.append(r2)     // Catch: java.lang.Exception -> L4e
            r0.append(r1)     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = X.X1D.LIZIZ(r0)     // Catch: java.lang.Exception -> L4e
        L43:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L4e
            if (r0 != 0) goto L4e
            int r0 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Exception -> L4e
            goto L4f
        L4e:
            r0 = -2
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC57425MgH.LIZLLL(android.net.Uri, android.os.Bundle, java.lang.String):int");
    }

    public static int LJ(android.net.Uri uri, Bundle bundle, String str) {
        String queryParameter;
        if (uri == null || !uri.isHierarchical() || (queryParameter = UriProtector.getQueryParameter(uri, str)) == null) {
            return -1;
        }
        try {
            return CastIntegerProtector.parseInt(queryParameter);
        } catch (NumberFormatException e) {
            C16880lQ.LLLLIIL(e);
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt(str);
        }
    }

    public static String LJFF(android.net.Uri uri, Bundle bundle, String str) {
        if (uri != null && uri.isHierarchical() && !TextUtils.isEmpty(UriProtector.getQueryParameter(uri, str))) {
            return UriProtector.getQueryParameter(uri, str);
        }
        if (bundle != null && !TextUtils.isEmpty(bundle.getString(str))) {
            return bundle.getString(str);
        }
        return null;
    }

    public static Object LJIIJ(android.net.Uri uri, String str, Class cls) {
        String queryParameter;
        try {
            queryParameter = UriProtector.getQueryParameter(uri, str);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (queryParameter == null) {
            return null;
        }
        if (cls == String.class) {
            return queryParameter;
        }
        if (cls == Integer.class) {
            return Integer.valueOf(CastIntegerProtector.parseInt(queryParameter));
        }
        if (cls == Long.class) {
            return Long.valueOf(CastLongProtector.parseLong(queryParameter));
        }
        if (cls == Boolean.class) {
            return Boolean.valueOf(Boolean.parseBoolean(queryParameter));
        }
        if (cls == Float.class) {
            return Float.valueOf(CastFloatProtector.parseFloat(queryParameter));
        }
        if (cls == Double.class) {
            return Double.valueOf(CastDoubleProtector.parseDouble(queryParameter));
        }
        return null;
    }

    public static boolean LIZIZ(android.net.Uri uri, Bundle bundle, String str, boolean z) {
        if (uri != null && uri.isHierarchical() && UriProtector.getQueryParameter(uri, str) != null) {
            return TextUtils.equals(UriProtector.getQueryParameter(uri, str), "1");
        }
        if (bundle != null) {
            return bundle.getBoolean(str, z);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T LJIIIIZZ(android.net.Uri r1, java.lang.String r2, android.os.Bundle r3, java.lang.String r4, java.lang.Class<T> r5, T r6) {
        /*
            if (r1 == 0) goto L1f
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L2c
            if (r0 != 0) goto L1f
            boolean r0 = r1.isHierarchical()     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L1f
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r2)     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L1f
            java.lang.Object r1 = LJIIJ(r1, r2, r5)     // Catch: java.lang.Exception -> L2c
            boolean r0 = r5.isInstance(r1)     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L1f
            goto L31
        L1f:
            if (r3 == 0) goto L30
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L2c
            if (r0 != 0) goto L30
            java.lang.Object r1 = X.C16880lQ.LLJJIII(r3, r4)     // Catch: java.lang.Exception -> L2c
            goto L31
        L2c:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L30:
            r1 = 0
        L31:
            if (r1 == 0) goto L34
            r6 = r1
        L34:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC57425MgH.LJIIIIZZ(android.net.Uri, java.lang.String, android.os.Bundle, java.lang.String, java.lang.Class, java.lang.Object):java.lang.Object");
    }
}
