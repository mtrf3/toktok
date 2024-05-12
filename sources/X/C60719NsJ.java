package X;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.AbsModel.AbsSparkPageSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.NsJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60719NsJ extends C60413NnN {
    public final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLILLLLZI;
    public final /* synthetic */ InterfaceC60718NsI LJLJI;
    public final /* synthetic */ SparkContext LJLJJI;
    public final /* synthetic */ C68322mC LJLJJL;

    @Override // X.AbstractC60423NnX
    public final void LJ(WebView webView, String str) {
        Long l;
        String str2;
        super.LJ(webView, str);
        InterfaceC60721NsL interfaceC60721NsL = this.LJLILLLLZI.LJLLILLLL;
        if (interfaceC60721NsL != null) {
            interfaceC60721NsL.LIZ(false);
        }
        this.LJLILLLLZI.LLD = System.currentTimeMillis();
        FD5.LJII("hybrid_log_report", C113554cx.LJJL(new OSZ(WM7.SCENE_SERVICE, "web_start_to_draw_end"), new OSZ("schema", this.LJLJJI.LJIILLIIL()), new OSZ("duration", Long.valueOf(System.currentTimeMillis() - this.LJLILLLLZI.LJZL))));
        C60728NsS c60728NsS = (C60728NsS) this.LJLJJI.LIZIZ(C60728NsS.class);
        String str3 = null;
        if (c60728NsS != null && c60728NsS.LJIIIZ != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l2 = c60728NsS.LJIIIZ;
            if (l2 != null) {
                c60728NsS.LJIIJ = C0EM.LIZIZ(l2, currentTimeMillis);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        C60728NsS c60728NsS2 = (C60728NsS) this.LJLJJI.LIZIZ(C60728NsS.class);
        if (c60728NsS2 != null && (l = c60728NsS2.LIZJ) != null) {
            l.longValue();
            long currentTimeMillis2 = System.currentTimeMillis();
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLILLLLZI;
            long j = currentTimeMillis2 - sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJZL;
            SparkContext sparkContext = this.LJLJJI;
            if (sparkContext != null) {
                str2 = sparkContext.containerId;
            } else {
                str2 = null;
            }
            C79605VMb c79605VMb = new C79605VMb("hybrid_monitor_web_first_screen_duration");
            c79605VMb.LIZIZ = sparkContext.bid;
            c79605VMb.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LLFF;
            c79605VMb.LJ = Q7K.LIZLLL("duration", j);
            FD5.LJ(str2, c79605VMb.LIZ());
            SparkContext sparkContext2 = this.LJLJJI;
            if (sparkContext2 != null) {
                str3 = sparkContext2.containerId;
            }
            C79605VMb c79605VMb2 = new C79605VMb("hybrid_monitor_web_timeline");
            c79605VMb2.LIZIZ = sparkContext2.bid;
            c79605VMb2.LIZ = this.LJLILLLLZI.LLFF;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("init_to_start_render", c60728NsS2.LJ);
            jSONObject.put("webview_create", c60728NsS2.LJIIIIZZ);
            jSONObject.put("webview_render", c60728NsS2.LJIIJ);
            c79605VMb2.LJ = jSONObject;
            FD5.LJ(str3, c79605VMb2.LIZ());
        }
    }

    @Override // X.AbstractC60423NnX
    public final boolean LJIILIIL(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WebView onRenderProcessGone detail = ");
        LIZ.append(renderProcessGoneDetail);
        C37682Eqc.LIZ(this.LJLJJI, "SparkView", X1D.LIZIZ(LIZ));
        return true;
    }

    @Override // X.AbstractC60423NnX
    public final void LJFF(WebView webView, String str, Bitmap bitmap) {
        SparkSchemaParam sparkSchemaParam;
        int i;
        Object obj;
        Integer num;
        HashMap<String, Object> hashMap;
        Long l;
        C60728NsS c60728NsS;
        InterfaceC60721NsL interfaceC60721NsL;
        InterfaceC60718NsI interfaceC60718NsI;
        super.LJFF(webView, str, bitmap);
        if (str != null && (interfaceC60718NsI = this.LJLJI) != null) {
            interfaceC60718NsI.LIZ(str);
        }
        SparkSchemaParam sparkSchemaParam2 = this.LJLILLLLZI.LJLLJ;
        if (((sparkSchemaParam2 != null && sparkSchemaParam2.getShowProgressBarInAllPage()) || ((sparkSchemaParam = this.LJLILLLLZI.LJLLJ) != null && sparkSchemaParam.getWebviewProgressBar())) && (interfaceC60721NsL = this.LJLILLLLZI.LJLLILLLL) != null) {
            interfaceC60721NsL.LIZ(true);
        }
        SparkSchemaParam sparkSchemaParam3 = this.LJLILLLLZI.LJLLJ;
        if (sparkSchemaParam3 != null && (sparkSchemaParam3 instanceof AbsSparkPageSchemaParam)) {
            i = ((AbsSparkPageSchemaParam) sparkSchemaParam3).getPageDepthOfReportShow();
        } else {
            i = 0;
        }
        SparkSchemaParam sparkSchemaParam4 = this.LJLILLLLZI.LJLLJ;
        if (sparkSchemaParam4 == null || !(sparkSchemaParam4 instanceof AbsSparkPageSchemaParam) || (obj = ((AbsSparkPageSchemaParam) sparkSchemaParam4).getNavBtnType()) == null) {
            obj = EnumC60084Ni4.TYPE_NONE;
        }
        if (o.LJ(obj, "report") && i > 0) {
            C60792NtU.LIZ.getClass();
            if (C60792NtU.LIZ(webView) <= i) {
                InterfaceC60844NuK interfaceC60844NuK = (InterfaceC60844NuK) this.LJLJJL.element;
                if (interfaceC60844NuK != null) {
                    interfaceC60844NuK.LJIIZILJ(EnumC60084Ni4.TYPE_REPORT);
                }
            } else {
                InterfaceC60844NuK interfaceC60844NuK2 = (InterfaceC60844NuK) this.LJLJJL.element;
                if (interfaceC60844NuK2 != null) {
                    interfaceC60844NuK2.LJIIZILJ(EnumC60084Ni4.TYPE_NONE);
                }
            }
        }
        SparkContext sparkContext = this.LJLILLLLZI.getSparkContext();
        if (sparkContext != null && sparkContext.enableAutoHideLoadingScript) {
            String script = this.LJLILLLLZI.LLIFFJFJJ;
            o.LJIIJ(script, "script");
            C60722NsM.LIZ = script;
            SparkContext sparkContext2 = this.LJLILLLLZI.getSparkContext();
            if (sparkContext2 != null) {
                num = sparkContext2.fmpValueForAutoHideLoadingScript;
            } else {
                num = null;
            }
            SparkContext sparkContext3 = this.LJLILLLLZI.getSparkContext();
            if (sparkContext3 != null) {
                hashMap = sparkContext3.autoHideLoadingEventExtraInfo;
            } else {
                hashMap = null;
            }
            SparkContext sparkContext4 = this.LJLILLLLZI.getSparkContext();
            if (sparkContext4 != null && (c60728NsS = (C60728NsS) sparkContext4.LIZIZ(C60728NsS.class)) != null) {
                l = c60728NsS.LIZJ;
            } else {
                l = null;
            }
            String str2 = C60722NsM.LIZ;
            if (webView == null || str2.length() == 0) {
                return;
            }
            if (s.LJJJLZIJ(str2, "/** LIMIT_TIME **/", false) && num != null) {
                str2 = ujb.o.LJJJJZ(str2, "/** LIMIT_TIME **/", String.valueOf(num.intValue()), false);
            }
            if (s.LJJJLZIJ(str2, "/** START_TIME **/", false)) {
                str2 = ujb.o.LJJJJZ(str2, "/** START_TIME **/", String.valueOf(l), false);
            }
            if (s.LJJJLZIJ(str2, "\"/** EXTRA_INFO **/\"", false)) {
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append('\'');
                    LIZ.append(jSONObject);
                    LIZ.append('\'');
                    str2 = ujb.o.LJJJJZ(str2, "\"/** EXTRA_INFO **/\"", X1D.LIZIZ(LIZ), false);
                } catch (Throwable unused) {
                }
            }
            WebSettings settings = webView.getSettings();
            if (settings != null) {
                settings.setJavaScriptEnabled(true);
            }
            webView.evaluateJavascript(str2, null);
        }
    }

    public C60719NsJ(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, InterfaceC60718NsI interfaceC60718NsI, SparkContext sparkContext, C68322mC c68322mC) {
        this.LJLILLLLZI = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        this.LJLJI = interfaceC60718NsI;
        this.LJLJJI = sparkContext;
        this.LJLJJL = c68322mC;
    }
}
