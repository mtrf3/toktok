package X;

import com.ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig;
import defpackage.e1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Nel, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59879Nel implements InterfaceC59875Neh {
    public String LIZ = "";
    public String LIZIZ = "";
    public Boolean LIZJ;
    public final /* synthetic */ C59639Nat LIZLLL;

    public static String LIZ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("webview_is_need_monitor", true);
        jSONObject.put("webview_classes", new JSONArray());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("bid", "ies");
        jSONObject.put("commonReportConfig", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("interval", 8000L);
        jSONObject3.put("FPSMonitor", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("interval", 8000L);
        jSONObject3.put("MemoryMonitor", jSONObject5);
        jSONObject.put("apmReportConfig", jSONObject3);
        JSONObject jSONObject6 = new JSONObject();
        JSONObject LIZLLL = Q7K.LIZLLL("interval", 10L);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("DOMContentLoaded");
        LIZLLL.put("checkPoint", jSONArray);
        jSONObject6.put("PerformanceMonitor", LIZLLL);
        jSONObject.put("performanceReportConfig", jSONObject6);
        JSONObject jSONObject7 = new JSONObject();
        JSONObject jSONObject8 = new JSONObject();
        jSONObject8.put("ignore", new JSONArray());
        jSONObject7.put("StaticErrorMonitor", jSONObject8);
        jSONObject.put("errorMsgReportConfig", jSONObject7);
        JSONObject jSONObject9 = new JSONObject();
        JSONObject LIZLLL2 = Q7K.LIZLLL("slowSession", 8000L);
        LIZLLL2.put("sampleRate", 0.1d);
        jSONObject9.put("StaticPerformanceMonitor", LIZLLL2);
        jSONObject.put("resourceTimingReportConfig", jSONObject9);
        String jSONObject10 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject10, "JSONObject().apply {\n   …\n            }.toString()");
        return jSONObject10;
    }

    @Override // X.InterfaceC59875Neh
    public final String LIZJ() {
        if (this.LIZIZ.length() == 0) {
            this.LIZIZ = "SystemWebView";
        }
        return this.LIZIZ;
    }

    @Override // X.InterfaceC59875Neh
    public final boolean LJ() {
        return e1.LIZ(31744, "webview_monitor_enable", true, false);
    }

    @Override // X.InterfaceC59875Neh
    public final String LJFF() {
        boolean z;
        String LIZ;
        if (this.LIZ.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.LIZ;
        }
        this.LIZLLL.getClass();
        HybridMonitorConfig LIZLLL = C59639Nat.LIZLLL();
        if (LIZLLL != null) {
            try {
                LIZ = LIZLLL.getSlardarSdkConfig();
            } catch (C158056If unused) {
                LIZ = LIZ();
            }
        } else {
            LIZ = null;
        }
        if (LIZ == null) {
            LIZ = LIZ();
        }
        this.LIZ = LIZ;
        return LIZ;
    }

    @Override // X.InterfaceC59875Neh
    public final boolean LJI() {
        if (this.LIZJ == null) {
            this.LIZJ = Boolean.FALSE;
        }
        Boolean bool = this.LIZJ;
        o.LJII(bool, "null cannot be cast to non-null type kotlin.Boolean");
        return bool.booleanValue();
    }

    @Override // X.InterfaceC59875Neh
    public final List<String> LIZIZ() {
        List<String> emptyList;
        String[] strArr;
        try {
            FFL.LJIIIZ().getClass();
            FHD.LIZLLL().getClass();
            strArr = (String[]) FHD.LJIIIIZZ(0, "webview_cache_urls", true);
        } catch (Throwable unused) {
        }
        if (strArr != null) {
            emptyList = Arrays.asList(strArr);
            o.LJIIIIZZ(emptyList, "getWebViewCacheModelCompat()");
            return emptyList;
        }
        emptyList = Collections.emptyList();
        o.LJIIIIZZ(emptyList, "getWebViewCacheModelCompat()");
        return emptyList;
    }

    public C59879Nel(C59639Nat c59639Nat) {
        this.LIZLLL = c59639Nat;
    }
}
