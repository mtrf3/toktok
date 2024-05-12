package X;

import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;

/* renamed from: X.EgY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37058EgY implements InterfaceC37077Egr {
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(java.lang.String r7) {
        /*
            java.lang.String r0 = "needBuildSecLink : "
            X.C1JX.LJIIIIZZ(r0, r7)
            boolean r0 = X.C73040SlY.LJLJJL
            r6 = 0
            if (r0 != 0) goto Lb
            return r6
        Lb:
            boolean r0 = X.C37054EgU.LIZLLL(r7)
            if (r0 != 0) goto L12
            return r6
        L12:
            X.EgQ r0 = X.C73040SlY.LJLJJI
            java.util.List<java.lang.String> r0 = r0.LIZLLL
            r5 = 1
            if (r0 == 0) goto L1b
            if (r7 != 0) goto L2f
        L1b:
            X.EgW r0 = X.C37056EgW.LIZ()
            X.Efx r0 = r0.LIZIZ(r7)
            if (r0 == 0) goto L84
            boolean r0 = r0.LIZJ
            if (r0 != 0) goto L84
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            goto L79
        L2f:
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r4 = r0.iterator()
        L35:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r3 = r4.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L35
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L4e
            goto L35
        L4e:
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r7)     // Catch: java.lang.Exception -> L35
            java.lang.String r2 = r0.getHost()     // Catch: java.lang.Exception -> L35
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L35
            if (r0 != 0) goto L62
            boolean r0 = android.text.TextUtils.equals(r2, r3)     // Catch: java.lang.Exception -> L35
            if (r0 != 0) goto L9b
        L62:
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L35
            r0 = 46
            r1.append(r0)     // Catch: java.lang.Exception -> L35
            r1.append(r3)     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> L35
            boolean r0 = r2.endsWith(r0)     // Catch: java.lang.Exception -> L35
            if (r0 == 0) goto L35
            goto L9b
        L79:
            java.lang.String r0 = "url"
            r1.put(r0, r7)     // Catch: org.json.JSONException -> L7f
            goto L83
        L7f:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L83:
            return r6
        L84:
            X.EdB r0 = X.C36849EdB.LIZ()
            r0.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = X.C36849EdB.LJFF
            long r3 = r3 - r0
            r1 = 1800000(0x1b7740, double:8.89318E-318)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L9a
            return r6
        L9a:
            return r5
        L9b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC37058EgY.LJ(java.lang.String):boolean");
    }

    public static boolean LIZLLL(WebView webView, boolean z) {
        WebHistoryItem currentItem;
        if (!C73040SlY.LJLJJL) {
            return z;
        }
        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
        if (copyBackForwardList != null && (currentItem = copyBackForwardList.getCurrentItem()) != null && C73040SlY.LJLJJI != null) {
            if (currentItem.getUrl().startsWith(C73040SlY.LJLJJI.LIZJ)) {
                return webView.canGoBackOrForward(-2);
            }
            if (copyBackForwardList.getSize() == 2 && C37054EgU.LJ(copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() - 1).getUrl())) {
                return webView.canGoBackOrForward(-2);
            }
        }
        return z;
    }
}
