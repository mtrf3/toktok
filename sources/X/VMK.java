package X;

import Y.ARunnableS50S0100000_14;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.webview.WebViewMonitorJsBridge;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import ujb.o;
import ujb.s;

/* loaded from: classes15.dex */
public final class VMK {
    public final String LIZ;
    public C60601NqP LIZIZ;
    public EnumC79613VMj LIZJ;
    public final HashMap<EnumC79613VMj, Long> LIZLLL;
    public int LJ;
    public final HashMap<String, Long> LJFF;
    public ViewOnAttachStateChangeListenerC79609VMf LJI;
    public VML LJII;
    public VML LJIIIIZZ;
    public final Handler LJIIIZ;
    public final HashMap<String, Integer> LJIIJ;
    public final String LJIIJJI;
    public boolean LJIIL;
    public VMR LJIILIIL;
    public String LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final int LJIJI;
    public final int LJIJJ;
    public boolean LJIJJLI;
    public final WeakReference<WebView> LJIL;
    public final VMJ LJJ;

    public final void LIZIZ() {
        VN7<VMM> vn7;
        if (this.LJIJJLI) {
            return;
        }
        this.LJIJJLI = true;
        LJII(true);
        LJ();
        VML vml = this.LJII;
        if (vml != null && (vn7 = vml.LJIIZILJ) != null) {
            vn7.LIZIZ();
        }
        this.LJIIIZ.postDelayed(new ARunnableS50S0100000_14(this, 258), 150L);
    }

    public final String LIZJ() {
        String str;
        String valueOf;
        VML vml = this.LJII;
        if (vml == null || (str = vml.LIZJ) == null) {
            str = "";
        }
        java.util.Map LIZIZ = OFI.LIZIZ(this.LJIILJJIL);
        String valueOf2 = String.valueOf(LIZIZ.get("schema"));
        WebView LIZLLL = LIZLLL();
        String str2 = null;
        if (LIZLLL == null || (valueOf = LIZLLL.getUrl()) == null || o.LJJJJJL(valueOf)) {
            valueOf = String.valueOf(LIZIZ.get("url"));
        }
        if (str.length() > 0) {
            return str;
        }
        String str3 = VMV.LJII(valueOf2, valueOf, false).LIZ;
        if (!o.LJJJJJL(str3)) {
            return str3;
        }
        C60601NqP c60601NqP = this.LIZIZ;
        if (c60601NqP != null) {
            str2 = c60601NqP.LJFF;
        }
        return String.valueOf(str2);
    }

    public final WebView LIZLLL() {
        return this.LJIL.get();
    }

    public final void LJ() {
        VN1 vn1;
        boolean z;
        Bitmap.Config config;
        int i;
        float f;
        VM4.LJIILL.getClass();
        Object obj = null;
        VM4 LIZ = VM3.LIZ("blank", null);
        WebView LIZLLL = LIZLLL();
        VML vml = this.LJII;
        if (vml != null) {
            C40048Fng.LIZJ(vml.LJ.LJLILLLLZI, "blank_check", null, null, 12);
        }
        EnumC79613VMj enumC79613VMj = this.LIZJ;
        if (enumC79613VMj == null) {
            enumC79613VMj = EnumC79613VMj.CREATED;
        }
        if (enumC79613VMj.ordinal() >= EnumC79613VMj.DESTROYED.ordinal() || LIZLLL == null || LIZLLL.getUrl() == null || kotlin.jvm.internal.o.LJ(LIZLLL.getUrl(), "about:blank")) {
            LIZ.onEventTerminated(EnumC65355Pkt.INVALID_CASE);
            return;
        }
        if (VMS.webBlank.not()) {
            LIZ.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C60601NqP c60601NqP = this.LIZIZ;
        if (c60601NqP != null) {
            vn1 = c60601NqP.LJII;
        } else {
            vn1 = null;
        }
        OFP ofp = OFP.WebBlank;
        List<String> strListOptions = ofp.getStrListOptions("scope", new ArrayList());
        String LIZJ = LIZJ();
        if ((!o.LJJJJJL(LIZJ)) && strListOptions.contains(LIZJ)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Object obj2 = ((ConcurrentHashMap) C36745EbV.LIZ).get(InterfaceC78286Uny.class);
            if (obj2 == null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Cannot find service implementation of ");
                LIZ2.append(InterfaceC78286Uny.class);
                X1D.LIZIZ(LIZ2);
                new Throwable();
            } else if (obj2 instanceof InterfaceC78286Uny) {
                obj = obj2;
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Internal error, service is not instance of ");
                LIZ3.append(InterfaceC78286Uny.class);
                LIZ3.append(", ");
                LIZ3.append("is that call register and get in different classloader?");
                X1D.LIZIZ(LIZ3);
                new Throwable();
            }
            InterfaceC78286Uny interfaceC78286Uny = (InterfaceC78286Uny) obj;
            if (interfaceC78286Uny != null) {
                LIZ(LIZLLL, jSONObject, interfaceC78286Uny.detect(LIZLLL, 0.1f, Bitmap.Config.ARGB_8888), vn1, this.LJIIZILJ);
            }
        } else if (ofp.not()) {
            C40082FoE.LJIIIIZZ(jSONObject, "event_type", "blank");
            C40082FoE.LJIIIIZZ(jSONObject, "is_blank", 0);
            C40082FoE.LJIIIIZZ(jSONObject, "detect_type", Integer.valueOf(this.LJIJ));
            C40082FoE.LJIIIIZZ(jSONObject, "cost_time", 0);
            if (vn1 != null) {
                vn1.LIZ(0L);
                vn1.LIZIZ(4, LIZLLL);
            }
        } else {
            if (ofp.getIntOption("quality", 0) == 1) {
                config = Bitmap.Config.RGB_565;
                i = this.LJIJJ;
                f = 0.05f;
            } else {
                config = Bitmap.Config.ARGB_8888;
                i = this.LJIJI;
                f = 0.1f;
            }
            Object obj3 = ((ConcurrentHashMap) C36745EbV.LIZ).get(InterfaceC78286Uny.class);
            if (obj3 == null) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("Cannot find service implementation of ");
                LIZ4.append(InterfaceC78286Uny.class);
                X1D.LIZIZ(LIZ4);
                new Throwable();
            } else if (obj3 instanceof InterfaceC78286Uny) {
                obj = obj3;
            } else {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("Internal error, service is not instance of ");
                LIZ5.append(InterfaceC78286Uny.class);
                LIZ5.append(", ");
                LIZ5.append("is that call register and get in different classloader?");
                X1D.LIZIZ(LIZ5);
                new Throwable();
            }
            InterfaceC78286Uny interfaceC78286Uny2 = (InterfaceC78286Uny) obj;
            if (interfaceC78286Uny2 != null) {
                LIZ(LIZLLL, jSONObject, interfaceC78286Uny2.detect(LIZLLL, f, config), vn1, i);
            }
        }
        VML vml2 = this.LJII;
        if (vml2 != null) {
            vml2.LJI(LIZ, jSONObject);
        }
    }

    public final void LJIIIIZZ() {
        WebViewMonitorJsBridge webViewMonitorJsBridge = new WebViewMonitorJsBridge(this);
        WebView LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            if (!LIZLLL.getSettings().getJavaScriptEnabled()) {
                LIZLLL.getSettings().setJavaScriptEnabled(true);
            }
            LIZLLL.addJavascriptInterface(webViewMonitorJsBridge, "iesJsBridgeTransferMonitor");
        }
    }

    public final void LJFF(JSONObject jSONObject) {
        String str;
        if (jSONObject == null) {
            return;
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.LJFF(jSONObject2, "jsonObject.toString()");
        String LJJJJLI = C77123UOp.LJJJJLI("serviceType", jSONObject);
        if (kotlin.jvm.internal.o.LJ(LJJJJLI, "")) {
            VML vml = this.LJII;
            if (vml != null) {
                JSONObject LJJJLL = C77123UOp.LJJJLL(C77123UOp.LJJJJLI("category", jSONObject));
                JSONObject LJJJLL2 = C77123UOp.LJJJLL(C77123UOp.LJJJJLI("metrics", jSONObject));
                JSONObject LJJJLL3 = C77123UOp.LJJJLL(C77123UOp.LJJJJLI("timing", jSONObject));
                JSONObject LJJJLL4 = C77123UOp.LJJJLL(C77123UOp.LJJJJLI("extra", jSONObject));
                String LJJJJLI2 = C77123UOp.LJJJJLI("bid", jSONObject);
                int LJJJJI = C77123UOp.LJJJJI("level", jSONObject);
                int LJJJJI2 = C77123UOp.LJJJJI("canSample", jSONObject);
                boolean optBoolean = jSONObject.optBoolean("canSample", true);
                if (!jSONObject.has("level")) {
                    if (jSONObject.has("canSample") && (LJJJJI2 == 0 || !optBoolean)) {
                        LJJJJI = 0;
                    } else {
                        LJJJJI = 2;
                    }
                }
                C79605VMb c79605VMb = new C79605VMb(C77123UOp.LJJJJLI("eventName", jSONObject));
                c79605VMb.LIZLLL = LJJJLL;
                c79605VMb.LJFF = LJJJLL4;
                c79605VMb.LJI = LJJJLL3;
                c79605VMb.LJ = LJJJLL2;
                c79605VMb.LIZIZ(LJJJJI);
                C79604VMa LIZ = c79605VMb.LIZ();
                if (!TextUtils.isEmpty(LJJJJLI2)) {
                    LIZ.LIZIZ = LJJJJLI2;
                }
                VM5 vm5 = new VM5();
                vm5.LJIIL = LIZ;
                java.util.Map<String, Object> map = vm5.LIZLLL;
                C60601NqP c60601NqP = vml.LJIJ.LIZIZ;
                if (c60601NqP != null) {
                    str = c60601NqP.LJFF;
                } else {
                    str = null;
                }
                map.put("config_bid", str);
                vm5.LIZLLL.put("jsb_bid", vml.LIZJ);
                vm5.LIZIZ();
                vml.LJIIZILJ.LIZ(vm5);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.o.LJ(LJJJJLI, "perf")) {
            VML vml2 = this.LJII;
            if (vml2 == null) {
                return;
            }
            vml2.LIZ(jSONObject2);
            return;
        }
        VML vml3 = this.LJII;
        if (vml3 == null) {
            return;
        }
        vml3.LJFF(LJJJJLI, jSONObject2);
    }

    public final void LJI(EnumC79613VMj enumC79613VMj) {
        this.LIZJ = enumC79613VMj;
        this.LIZLLL.put(enumC79613VMj, Long.valueOf(System.currentTimeMillis()));
    }

    public final void LJII(boolean z) {
        String str;
        WebView LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            if (z) {
                str = "true";
            } else {
                str = "false";
            }
            String LLLZ = C16880lQ.LLLZ(" javascript: (function () {\n                    var target = {}\n                    if (typeof SlardarHybrid !== 'undefined' && typeof jsIESLiveTimingMonitor !== 'undefined'){\n                    var performacess = SlardarHybrid('getLatestPerformance');\n                    var resourcess = SlardarHybrid('getLatestResource');\n                    var cacheData = SlardarHybrid('flushCacheData');\n                    target.performance = performacess;\n                    target.resource = resourcess;\n                    target.cacheData = cacheData;\n                    target.needReport = %s;\n                    jsIESLiveTimingMonitor.reportPageLatestData(target);}\n                })()", Arrays.copyOf(new Object[]{str}, 1));
            kotlin.jvm.internal.o.LJFF(LLLZ, "java.lang.String.format(format, *args)");
            LIZLLL.evaluateJavascript(LLLZ, null);
        }
    }

    public VMK(WeakReference<WebView> weakReference, VMJ webViewMonitorHelperImpl) {
        String str;
        List LJLJJL;
        WebSettings settings;
        kotlin.jvm.internal.o.LJIIJ(webViewMonitorHelperImpl, "webViewMonitorHelperImpl");
        this.LJIL = weakReference;
        this.LJJ = webViewMonitorHelperImpl;
        this.LIZ = "WebViewDataManager";
        HybridMultiMonitor hybridMultiMonitor = HybridMultiMonitor.getInstance();
        kotlin.jvm.internal.o.LJFF(hybridMultiMonitor, "HybridMultiMonitor.getInstance()");
        InterfaceC40069Fo1 hybridSettingManager = hybridMultiMonitor.getHybridSettingManager();
        kotlin.jvm.internal.o.LJFF(hybridSettingManager, "HybridMultiMonitor.getIn…ce().hybridSettingManager");
        kotlin.jvm.internal.o.LJFF(hybridSettingManager.LJI(), "HybridMultiMonitor.getIn…bridSettingManager.switch");
        this.LIZLLL = new HashMap<>();
        this.LJFF = new HashMap<>();
        this.LJIIIZ = new Handler(C16880lQ.LLJJJJ());
        this.LJIIJ = new HashMap<>();
        try {
            WebView LIZLLL = LIZLLL();
            String str2 = (LIZLLL == null || (settings = LIZLLL.getSettings()) == null || (str2 = settings.getUserAgentString()) == null) ? "" : str2;
            int LJJLIIIJL = s.LJJLIIIJL(str2, "Chrome/", 0, false, 6);
            String substring = str2.substring(LJJLIIIJL != -1 ? LJJLIIIJL + 7 : LJJLIIIJL);
            kotlin.jvm.internal.o.LJFF(substring, "(this as java.lang.String).substring(startIndex)");
            LJLJJL = s.LJLJJL(substring, new String[]{" "}, 0, 6);
        } catch (Throwable unused) {
        }
        if (!LJLJJL.isEmpty()) {
            str = (String) ListProtector.get(LJLJJL, 0);
            this.LJIIJJI = str;
            this.LJIIL = true;
            this.LJIILJJIL = "";
            this.LJIILL = -401;
            this.LJIILLIIL = -402;
            this.LJIIZILJ = 4;
            this.LJIJ = 5;
            this.LJIJI = 6;
            this.LJIJJ = 7;
        }
        str = "";
        this.LJIIJJI = str;
        this.LJIIL = true;
        this.LJIILJJIL = "";
        this.LJIILL = -401;
        this.LJIILLIIL = -402;
        this.LJIIZILJ = 4;
        this.LJIJ = 5;
        this.LJIJI = 6;
        this.LJIJJ = 7;
    }

    public final void LIZ(View view, JSONObject jSONObject, C78285Unx c78285Unx, VN1 vn1, int i) {
        int i2;
        boolean z;
        if (vn1 != null) {
            vn1.LIZ(c78285Unx.LIZIZ);
            vn1.LIZIZ(c78285Unx.LIZ, view);
        }
        VML vml = this.LJII;
        boolean z2 = true;
        if (vml != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i3 = c78285Unx.LIZ;
            if (i3 != 1) {
                if (i3 != 2) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("code:");
                    LIZ.append(c78285Unx.LIZJ);
                    LIZ.append(", msg:");
                    LIZ.append(c78285Unx.LIZLLL);
                    linkedHashMap.put("error_error_msg", X1D.LIZIZ(LIZ));
                    linkedHashMap.put("error_desc", "web blank check fail");
                    C40048Fng.LIZJ(vml.LJ.LJLILLLLZI, "internal_error", linkedHashMap, null, 8);
                } else {
                    linkedHashMap.put("result", CardStruct.IStatusCode.DEFAULT);
                    C40048Fng.LIZJ(vml.LJ.LJLILLLLZI, "blank_result", linkedHashMap, null, 8);
                }
            } else {
                linkedHashMap.put("result", "1");
                C40048Fng.LIZJ(vml.LJ.LJLILLLLZI, "blank_result", linkedHashMap, null, 8);
            }
        }
        C40082FoE.LJIIIIZZ(jSONObject, "event_type", "blank");
        if (c78285Unx.LIZ == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C40082FoE.LJIIIIZZ(jSONObject, "is_blank", Integer.valueOf(i2));
        C40082FoE.LJIIIIZZ(jSONObject, "detect_type", Integer.valueOf(i));
        C40082FoE.LJIIIIZZ(jSONObject, "cost_time", Long.valueOf(c78285Unx.LIZIZ));
        if (c78285Unx.LIZ == 3) {
            C40082FoE.LJIIIIZZ(jSONObject, "error_code", Integer.valueOf(c78285Unx.LIZJ));
            C40082FoE.LJIIIIZZ(jSONObject, "error_msg", c78285Unx.LIZLLL);
        }
        C40082FoE.LJIIIIZZ(jSONObject, "detect_start_time", Long.valueOf(System.currentTimeMillis() - c78285Unx.LIZIZ));
        JSONObject jSONObject2 = new JSONObject();
        try {
            int i4 = TTNetInit.getNetworkQuality().LIZIZ;
            if (i4 != 0) {
                z = true;
            } else {
                z = false;
            }
            C40082FoE.LJIIIZ(jSONObject2, Boolean.valueOf(z), "http_rtt_ms", Integer.valueOf(i4));
            C3C5.m7constructorimpl(jSONObject2);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        try {
            int i5 = TTNetInit.getNetworkQuality().LIZ;
            if (i5 == 0) {
                z2 = false;
            }
            C40082FoE.LJIIIZ(jSONObject2, Boolean.valueOf(z2), "transport_rtt_ms", Integer.valueOf(i5));
            C3C5.m7constructorimpl(jSONObject2);
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
        C40082FoE.LJIIIIZZ(jSONObject, "assist_info", jSONObject2);
    }
}
