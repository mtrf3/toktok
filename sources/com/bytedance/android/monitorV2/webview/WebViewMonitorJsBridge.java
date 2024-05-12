package com.bytedance.android.monitorV2.webview;

import X.C03880Dg;
import X.C16880lQ;
import X.C38192Eyq;
import X.C39519Ff9;
import X.C40082FoE;
import X.C61654OHq;
import X.C65300Pk0;
import X.C65354Pks;
import X.C67348Qbw;
import X.C77117UOj;
import X.C77123UOp;
import X.C79605VMb;
import X.OFI;
import X.VM8;
import X.VMK;
import X.VML;
import Y.ARunnableS13S1200000_14;
import Y.ARunnableS15S1100000_14;
import Y.ARunnableS33S0200000_14;
import Y.ARunnableS50S0100000_14;
import Y.ARunnableS6S2100000_14;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.Objects;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class WebViewMonitorJsBridge {
    public final Handler mainHandler = new Handler(C16880lQ.LLJJJJ());
    public final VMK webViewDataManager;

    @JavascriptInterface
    public String getInfo() {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()Ljava/lang/String;", "-8159379520847931948");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "getInfo", this, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "getInfo", null, objArr, this, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        JSONObject jSONObject = new JSONObject();
        C77123UOp.LJJJLIIL(jSONObject, "need_report", Boolean.valueOf(C61654OHq.LIZ()));
        C77123UOp.LJJJJZI("sdk_version", "1.5.14-rc.16-oversea", jSONObject);
        String jSONObject2 = jSONObject.toString();
        c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "getInfo", jSONObject2, objArr, this, c65300Pk0, true);
        return jSONObject2;
    }

    public VML getNavigationManager() {
        return this.webViewDataManager.LJII;
    }

    @JavascriptInterface
    public String getVersion() {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()Ljava/lang/String;", "-8159379520847931948");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "getVersion", this, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "getVersion", null, objArr, this, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "getVersion", "1.5.14-rc.16-oversea", objArr, this, c65300Pk0, true);
        return "1.5.14-rc.16-oversea";
    }

    @JavascriptInterface
    public void injectJS() {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "-8159379520847931948");
        if (c03880Dg.LIZJ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "injectJS", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "injectJS", null, objArr, this, c65300Pk0, false);
        } else {
            this.mainHandler.post(new ARunnableS50S0100000_14(this, 11));
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "injectJS", null, objArr, this, c65300Pk0, true);
        }
    }

    public WebViewMonitorJsBridge(VMK vmk) {
        this.webViewDataManager = vmk;
    }

    @JavascriptInterface
    public void batch(String str) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "-8159379520847931948");
        if (c03880Dg.LIZJ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "batch", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "batch", null, objArr, this, c65300Pk0, false);
        } else {
            this.mainHandler.post(new ARunnableS15S1100000_14(this, str, 3));
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "batch", null, objArr, this, c65300Pk0, true);
        }
    }

    @JavascriptInterface
    public void config(String str) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "-8159379520847931948");
        if (c03880Dg.LIZJ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "config", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "config", null, objArr, this, c65300Pk0, false);
            return;
        }
        JSONObject LJJJLL = C77123UOp.LJJJLL(str);
        String LJJJJLI = C77123UOp.LJJJJLI("bid", LJJJLL);
        VML navigationManager = getNavigationManager();
        this.mainHandler.post(new ARunnableS13S1200000_14(LJJJLL, navigationManager, LJJJJLI, 2));
        if (navigationManager != null && !LJJJJLI.isEmpty()) {
            C67348Qbw.LIZ(navigationManager.LIZ, LJJJJLI);
        }
        c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "config", null, objArr, this, c65300Pk0, true);
    }

    @JavascriptInterface
    public void reportPageLatestData(String str) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "-8159379520847931948");
        if (c03880Dg.LIZJ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "reportPageLatestData", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "reportPageLatestData", null, objArr, this, c65300Pk0, false);
        } else {
            C38192Eyq.LIZJ(new ARunnableS15S1100000_14(this, str, 5));
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "reportPageLatestData", null, objArr, this, c65300Pk0, true);
        }
    }

    @JavascriptInterface
    public void reportPiaInfo(String str) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "-8159379520847931948");
        if (c03880Dg.LIZJ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "reportPiaInfo", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "reportPiaInfo", null, objArr, this, c65300Pk0, false);
        } else {
            this.mainHandler.post(new ARunnableS15S1100000_14(this, str, 2));
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "reportPiaInfo", null, objArr, this, c65300Pk0, true);
        }
    }

    @JavascriptInterface
    public void reportVerifiedData(String str) {
        String str2;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "-8159379520847931948");
        if (c03880Dg.LIZJ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "reportVerifiedData", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "reportVerifiedData", null, objArr, this, c65300Pk0, false);
            return;
        }
        if (C61654OHq.LIZ()) {
            JSONObject LJJJLL = C77123UOp.LJJJLL(str);
            C65354Pks.LJFF.getClass();
            HybridSettingInitConfig hybridSettingInitConfig = C65354Pks.LIZIZ;
            if (hybridSettingInitConfig != null) {
                str2 = hybridSettingInitConfig.LJ;
            } else {
                str2 = null;
            }
            C77123UOp.LJJJJZI("device_id", str2, LJJJLL);
            C77123UOp.LJJJJZ("timestamp", System.currentTimeMillis(), LJJJLL);
            String jSONObject = LJJJLL.toString();
            o.LJFF(jSONObject, "jsonObject.toString()");
            C65354Pks.LIZIZ(jSONObject);
        }
        c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "reportVerifiedData", null, objArr, this, c65300Pk0, true);
    }

    @JavascriptInterface
    public void sendInitTimeInfo(String str) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "-8159379520847931948");
        if (c03880Dg.LIZJ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "sendInitTimeInfo", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "sendInitTimeInfo", null, objArr, this, c65300Pk0, false);
        } else {
            this.mainHandler.post(new ARunnableS15S1100000_14(this, str, 4));
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "sendInitTimeInfo", null, objArr, this, c65300Pk0, true);
        }
    }

    @JavascriptInterface
    public void terminatedPreCollect(String str) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "-8159379520847931948");
        if (c03880Dg.LIZJ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "terminatedPreCollect", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "terminatedPreCollect", null, objArr, this, c65300Pk0, false);
        } else {
            this.mainHandler.post(new ARunnableS50S0100000_14(this, 12));
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "terminatedPreCollect", null, objArr, this, c65300Pk0, true);
        }
    }

    @JavascriptInterface
    public void traceMark(String str) {
        String optString;
        JSONObject optJSONObject;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "-8159379520847931948");
        if (c03880Dg.LIZJ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "traceMark", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "traceMark", null, objArr, this, c65300Pk0, false);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            optString = jSONObject.optString("name");
            optJSONObject = jSONObject.optJSONObject("params");
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
        if (!TextUtils.isEmpty(optString) && optJSONObject != null) {
            C40082FoE.LJII(OFI.LJIIIZ(this.webViewDataManager.LIZLLL(), optString), optJSONObject);
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "traceMark", null, objArr, this, c65300Pk0, true);
            return;
        }
        Objects.toString(optJSONObject);
        c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "traceMark", null, objArr, this, c65300Pk0, true);
    }

    @JavascriptInterface
    public void cover(String str, String str2) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str, str2};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Ljava/lang/String;)V", "-8159379520847931948");
        if (c03880Dg.LIZJ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "cover", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "cover", null, objArr, this, c65300Pk0, false);
        } else {
            this.mainHandler.post(new ARunnableS6S2100000_14(this, str, str2, 0));
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "cover", null, objArr, this, c65300Pk0, true);
        }
    }

    @JavascriptInterface
    public void reportDirectly(String str, String str2) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str, str2};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Ljava/lang/String;)V", "-8159379520847931948");
        if (c03880Dg.LIZJ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "reportDirectly", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "reportDirectly", null, objArr, this, c65300Pk0, false);
        } else {
            this.mainHandler.post(new ARunnableS6S2100000_14(this, str2, str, 1));
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "reportDirectly", null, objArr, this, c65300Pk0, true);
        }
    }

    @JavascriptInterface
    public void customReport(String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
        int i = 2;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str, str2, str3, Boolean.valueOf(z), str4, str5, str6};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "-8159379520847931948");
        if (c03880Dg.LIZJ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "customReport", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "customReport", null, objArr, this, c65300Pk0, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "customReport", null, objArr, this, c65300Pk0, true);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            if (!z) {
                i = 0;
            }
        } else {
            i = CastIntegerProtector.parseInt(str4);
        }
        try {
            JSONObject LJJJLL = C77123UOp.LJJJLL(str3);
            JSONObject LJJJLL2 = C77123UOp.LJJJLL(str2);
            JSONObject LJJJLL3 = C77123UOp.LJJJLL(str5);
            JSONObject LJJJLL4 = C77123UOp.LJJJLL(str6);
            C79605VMb c79605VMb = new C79605VMb(str);
            c79605VMb.LIZLLL = LJJJLL;
            c79605VMb.LJ = LJJJLL2;
            c79605VMb.LJFF = LJJJLL3;
            c79605VMb.LJI = LJJJLL4;
            c79605VMb.LIZIZ(i);
            this.mainHandler.post(new ARunnableS33S0200000_14(this, VM8.LIZ(c79605VMb.LIZ()), 2));
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
        c03880Dg.LIZIZ(300001, "com/bytedance/android/monitorV2/webview/WebViewMonitorJsBridge", "customReport", null, objArr, this, c65300Pk0, true);
    }
}
