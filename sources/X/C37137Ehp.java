package X;

import Y.ARunnableS7S1100000_6;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import defpackage.i0;

/* renamed from: X.Ehp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37137Ehp {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("javascript: ");
        LIZ2.append(str);
        C16880lQ.LLZZ(webView, X1D.LIZIZ(LIZ2));
    }

    public static void LIZIZ(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb.append('\"');
                    } else {
                        if (obj instanceof String) {
                            String obj2 = obj.toString();
                            if (obj2.startsWith("{")) {
                                sb.append(obj2);
                            } else {
                                sb.append('\"');
                                sb.append(obj2);
                            }
                        } else {
                            sb.append(obj);
                        }
                        sb.append(",");
                    }
                    sb.append('\"');
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                C16880lQ.LLZZ(webView, sb2);
                return;
            } else {
                handler.post(new ARunnableS7S1100000_6(webView, sb2, 18));
                return;
            }
        }
        String LJFF = i0.LJFF("The WebView is null for ", str);
        if (C37138Ehq.LIZ.booleanValue()) {
            TextUtils.isEmpty(LJFF);
        }
    }
}
