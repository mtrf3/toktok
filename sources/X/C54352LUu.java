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

/* renamed from: X.LUu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54352LUu {
    public static C54352LUu LJI;
    public final List<C59613NaT> LIZ = new ArrayList();
    public final LinkedList<C59613NaT> LIZIZ = new LinkedList<>();
    public final java.util.Map<String, C59613NaT> LIZJ = new HashMap();
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
        throw new UnsupportedOperationException("Method not decompiled: X.C54352LUu.LJ():boolean");
    }

    public static C54352LUu LIZLLL() {
        if (LJI == null) {
            synchronized (C54352LUu.class) {
                if (LJI == null) {
                    LJI = new C54352LUu();
                }
            }
        }
        return LJI;
    }

    public final boolean LIZ() {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (C38891fp.LJJI(this.LJFF) && !e1.LIZ(31744, "enable_webview_cache", true, false) && !LJ()) {
            return true;
        }
        return false;
    }

    public C54352LUu() {
        try {
            this.LJFF = C2YJ.LIZIZ.LIZ.getWebviewCachePoolSwitch();
        } catch (Throwable unused) {
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

    public final C59613NaT LIZJ(Activity activity, C59314NPq c59314NPq) {
        C59613NaT c59613NaT;
        synchronized (this.LJ) {
            if (c59314NPq != null) {
                String str = c59314NPq.LIZ.LIZJ;
                if (!TextUtils.isEmpty(str) && ((HashMap) this.LIZJ).containsKey("/ies-cdn-alisg/tiktok_activities/covid19") && str.contains("/ies-cdn-alisg/tiktok_activities/covid19")) {
                    c59613NaT = (C59613NaT) ((HashMap) this.LIZJ).get("/ies-cdn-alisg/tiktok_activities/covid19");
                    ((HashMap) this.LIZJ).remove("/ies-cdn-alisg/tiktok_activities/covid19");
                    if (c59613NaT != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(c59314NPq.LIZ.LIZJ);
                        LIZ.append("&");
                        LIZ.append("cov19_render_no_need_load=1");
                        c59314NPq.LIZ.LIZJ = X1D.LIZIZ(LIZ);
                        c59613NaT.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        Context context = c59613NaT.getContext();
                        if (context instanceof MutableContextWrapper) {
                            ((MutableContextWrapper) context).setBaseContext(activity);
                        }
                        c59613NaT.initWeb(activity);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("click_btn_timestamp", System.currentTimeMillis());
                            jSONObject.put("cold_boot_begin_timestamp", C56662Kg.LIZ().LJIIJ);
                        } catch (JSONException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                        c59613NaT.sendEventToWebView("cov_pre_render_show", jSONObject);
                    }
                }
            }
            c59613NaT = null;
        }
        return c59613NaT;
    }
}
