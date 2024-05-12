package X;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import defpackage.e1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.LUv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54353LUv {
    public static C54353LUv LJI;
    public final List<C59612NaS> LIZ = new ArrayList();
    public final LinkedList<C59612NaS> LIZIZ = new LinkedList<>();
    public final java.util.Map<String, C59612NaS> LIZJ = new HashMap();
    public final int LIZLLL = 2;
    public final Object LJ = new Object();
    public final List<String> LJFF;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r3 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ() {
        /*
            r4 = 1
            X.FFL r2 = X.FFL.LJIIIZ()     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "webview_preload_entry_ab"
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.abtest.WebViewPreloadEntry> r0 = com.ss.android.ugc.aweme.crossplatform.abtest.WebViewPreloadEntry.class
            r2.getClass()     // Catch: java.lang.Throwable -> L15
            java.lang.Object r3 = X.FFL.LJIILLIIL(r0, r1, r4)     // Catch: java.lang.Throwable -> L15
            com.ss.android.ugc.aweme.crossplatform.abtest.WebViewPreloadEntry r3 = (com.ss.android.ugc.aweme.crossplatform.abtest.WebViewPreloadEntry) r3     // Catch: java.lang.Throwable -> L15
            if (r3 != 0) goto L2a
            goto L16
        L15:
            r3 = 0
        L16:
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "webview_preload_entry"
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.abtest.WebViewPreloadEntry> r0 = com.ss.android.ugc.aweme.crossplatform.abtest.WebViewPreloadEntry.class
            r2.getClass()     // Catch: java.lang.Throwable -> L28
            java.lang.Object r0 = com.bytedance.ies.abmock.SettingsManager.LJII(r1, r0)     // Catch: java.lang.Throwable -> L28
            com.ss.android.ugc.aweme.crossplatform.abtest.WebViewPreloadEntry r0 = (com.ss.android.ugc.aweme.crossplatform.abtest.WebViewPreloadEntry) r0     // Catch: java.lang.Throwable -> L28
            r3 = r0
        L28:
            if (r3 == 0) goto L31
        L2a:
            boolean r0 = r3.isUsePool()
            if (r0 == 0) goto L31
        L30:
            return r4
        L31:
            r4 = 0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54353LUv.LJ():boolean");
    }

    public static C54353LUv LIZLLL() {
        if (LJI == null) {
            synchronized (C54353LUv.class) {
                if (LJI == null) {
                    LJI = new C54353LUv();
                }
            }
        }
        return LJI;
    }

    public C54353LUv() {
        try {
            this.LJFF = C2YJ.LIZIZ.LIZ.getWebviewCachePoolSwitch();
        } catch (Throwable unused) {
        }
    }

    public final void LIZ(C59314NPq c59314NPq) {
        if (c59314NPq == null) {
            return;
        }
        String str = c59314NPq.LIZ.LIZJ;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.LJ) {
            if (Build.VERSION.SDK_INT >= 23 && !LIZIZ(str) && ((ArrayList) this.LIZ).size() < this.LIZLLL) {
                C16880lQ.LJLI(EF7.LIZIZ().getMainLooper().getQueue(), new C54354LUw(0, this));
            }
        }
    }

    public final boolean LIZIZ(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (!str.contains("need_webview_pool=1") && C38891fp.LJJI(this.LJFF) && !e1.LIZ(31744, "enable_webview_cache", true, false) && !LJ()) {
            return true;
        }
        return false;
    }

    public final C59612NaS LIZJ(Activity activity, C59314NPq c59314NPq) {
        C59612NaS c59612NaS;
        synchronized (this.LJ) {
            if (c59314NPq != null) {
                String str = c59314NPq.LIZ.LIZJ;
                if (!TextUtils.isEmpty(str) && ((HashMap) this.LIZJ).containsKey("/ies-cdn-alisg/tiktok_activities/covid19") && str.contains("/ies-cdn-alisg/tiktok_activities/covid19")) {
                    c59612NaS = (C59612NaS) ((HashMap) this.LIZJ).get("/ies-cdn-alisg/tiktok_activities/covid19");
                    ((HashMap) this.LIZJ).remove("/ies-cdn-alisg/tiktok_activities/covid19");
                    if (c59612NaS != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(c59314NPq.LIZ.LIZJ);
                        LIZ.append("&");
                        LIZ.append("cov19_render_no_need_load=1");
                        c59314NPq.LIZ.LIZJ = X1D.LIZIZ(LIZ);
                        c59612NaS.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        Context context = c59612NaS.getContext();
                        if (context instanceof MutableContextWrapper) {
                            ((MutableContextWrapper) context).setBaseContext(activity);
                        }
                        c59612NaS.initWeb(activity);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("click_btn_timestamp", System.currentTimeMillis());
                            jSONObject.put("cold_boot_begin_timestamp", C56662Kg.LIZ().LJIIJ);
                        } catch (JSONException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                        c59612NaS.sendEventToWebView("cov_pre_render_show", jSONObject);
                    }
                }
            }
            c59612NaS = null;
        }
        return c59612NaS;
    }
}
