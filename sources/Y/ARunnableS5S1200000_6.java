package Y;

import X.AbstractC38114Exa;
import X.C113554cx;
import X.C141335gf;
import X.C36340EOa;
import X.C36341EOb;
import X.C36982EfK;
import X.C37000Efc;
import X.C37390Elu;
import X.C37444Emm;
import X.C37451Emt;
import X.C37452Emu;
import X.C37558Eoc;
import X.C37561Eof;
import X.C37613EpV;
import X.C37900Eu8;
import X.C38117Exd;
import X.C38138Exy;
import X.C38185Eyj;
import X.C38351F3j;
import X.C38386F4s;
import X.C38692FGm;
import X.C38693FGn;
import X.C38805FKv;
import X.C39480FeW;
import X.C39481FeX;
import X.C39492Fei;
import X.C39902FlK;
import X.C3C5;
import X.C60737Nsb;
import X.C60905NvJ;
import X.C65232Piu;
import X.C68322mC;
import X.C76800UCe;
import X.C79081V1x;
import X.C79392VDw;
import X.EHL;
import X.EI4;
import X.EI5;
import X.EYS;
import X.EnumC36999Efb;
import X.EnumC61028NxI;
import X.FL5;
import X.FMX;
import X.FUF;
import X.FUG;
import X.InterfaceC36604EYe;
import X.InterfaceC61488OBg;
import X.InterfaceC65784Pro;
import X.JNN;
import X.ORZ;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.pia.core.worker.bridge.BridgeModule;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS61S1200000_6;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ARunnableS5S1200000_6 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        if (((C37000Efc) this.l1).LIZ.LIZJ == EnumC36999Efb.POST) {
            ((InterfaceC36604EYe) this.l2).LIZJ(this.s0, C113554cx.LJJJLIIL(), "application/x-www-form-urlencoded", new JSONObject(), ((C37000Efc) this.l1).LIZ.LIZ, null, C36982EfK.LJI);
        } else {
            ((InterfaceC36604EYe) this.l2).LIZ(this.s0, C113554cx.LJJJLIIL(), ((C37000Efc) this.l1).LIZ.LIZ, null, C36982EfK.LJI);
        }
    }

    public final void LIZ$1() {
        C38117Exd c38117Exd;
        if (((AbstractC38114Exa) this.l2).LJFF) {
            return;
        }
        try {
            c38117Exd = ((AbstractC38114Exa) this.l2).LIZIZ(new JSONObject(this.s0));
            if (c38117Exd != null) {
                ((CopyOnWriteArrayList) c38117Exd.LJIIL).add((TimeLineEvent) this.l1);
            }
        } catch (JSONException unused) {
            c38117Exd = null;
        }
        if (C38117Exd.LIZ(c38117Exd)) {
            Objects.toString(c38117Exd);
            if (c38117Exd != null) {
                C38185Eyj c38185Eyj = new C38185Eyj();
                c38185Eyj.LIZJ(this.s0, "value");
                c38185Eyj.LIZJ("call_invalid_1", "reason");
                c38185Eyj.LIZ("label_abstract_bridge_reject", c38117Exd.LJIIL);
                AbstractC38114Exa abstractC38114Exa = (AbstractC38114Exa) this.l2;
                abstractC38114Exa.LIZ(3, abstractC38114Exa.LJI(), c38117Exd.LIZLLL, "call_invalid_1", c38117Exd.LJIIL);
                ((AbstractC38114Exa) this.l2).LIZJ(C79081V1x.LJIILIIL(new C38138Exy(c38117Exd.LIZ, "Failed to parse invocation.")), c38117Exd);
                ((AbstractC38114Exa) this.l2).LJIILJJIL(c38117Exd);
                return;
            }
            return;
        }
        ((AbstractC38114Exa) this.l2).LJII(c38117Exd);
    }

    public final void LIZ$2() {
        SharedPreferences.Editor edit = C38693FGn.LIZJ((Context) this.l1, this.s0).edit();
        edit.clear().apply();
        for (String str : ((Map) this.l2).keySet()) {
            edit.putString(str, (String) ((Map) this.l2).get(str));
        }
        edit.apply();
    }

    public final void LIZ$3() {
        Object LIZ;
        try {
            LIZ = new C37558Eoc((C37561Eof) this.l1);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            ((C37444Emm) this.l2).LIZ(m10exceptionOrNullimpl.toString());
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        C37558Eoc c37558Eoc = (C37558Eoc) LIZ;
        if (c37558Eoc != null) {
            c37558Eoc.LIZIZ("!function(){var e=globalThis.NativeModules,t=e.get(\"BaseModule\");globalThis.location={href:t.getHref()},globalThis.navigator={userAgent:t.getUserAgent()},globalThis.NativeModules={get:function(l){var a=e.get(l);return\"BaseModule\"==l?Object.assign(a,{storeNSRHtml:function(e){t.terminateWithResult({html:e})}}):a}}}();");
            c37558Eoc.LJIILIIL.LIZIZ("bridge", BridgeModule.class, c37558Eoc.LJIILL);
            c37558Eoc.LJ(new C37452Emu(this, c37558Eoc));
            c37558Eoc.LIZIZ.LIZJ(new C37390Elu(C37451Emt.LIZ, c37558Eoc));
            c37558Eoc.LIZIZ(this.s0);
            c37558Eoc.LJFF();
            C37613EpV.LIZ().postDelayed(new ARunnableS25S0200000_6(new WeakReference(c37558Eoc), this, 49), 30000L);
        }
    }

    public final void LIZ$4() {
        Integer num;
        if (!((EI4) this.l1).LJ(EI5.LIZIZ)) {
            BaseCombineMode LIZJ = ((EI4) this.l1).LIZJ();
            if (LIZJ != null && LIZJ.httpCode == 509) {
                return;
            }
            ((EI4) this.l1).LIZLLL((EHL) this.l2);
            String key = this.s0;
            o.LJIIIIZZ(key, "key");
            BaseCombineMode LIZJ2 = ((EI4) this.l1).LIZJ();
            if (LIZJ2 != null) {
                num = Integer.valueOf(LIZJ2.httpCode);
            } else {
                num = null;
            }
            EI5.LIZLLL(num, key);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        if (r1.length() != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ed, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ef, code lost:
    
        if (r4 == null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b A[Catch: all -> 0x01a7, TryCatch #0 {all -> 0x01a7, blocks: (B:2:0x0000, B:4:0x0012, B:5:0x0020, B:9:0x0057, B:10:0x005f, B:12:0x007b, B:14:0x007f, B:15:0x0087, B:17:0x008b, B:19:0x009b, B:24:0x00a6, B:31:0x00ac, B:33:0x00c7, B:35:0x00cb, B:37:0x00cf, B:38:0x00d3, B:40:0x00d9, B:43:0x00e8, B:45:0x00f2, B:47:0x0104, B:49:0x010c, B:51:0x0113, B:52:0x011d, B:53:0x0122, B:57:0x0141, B:58:0x014b, B:60:0x0157, B:62:0x015f, B:63:0x0168, B:65:0x016e, B:67:0x0178, B:68:0x017d, B:70:0x019e, B:71:0x01a3, B:76:0x012d, B:78:0x0131, B:79:0x013a), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$5() {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS5S1200000_6.LIZ$5():void");
    }

    public final void LIZ$6() {
        String LIZJ;
        RequestParams requestParams = new RequestParams(EnumC61028NxI.LYNX_TEMPLATE);
        requestParams.setLoadToMemory(true);
        requestParams.setNeedLocalFile(Boolean.FALSE);
        requestParams.getCustomParams().put("rl_container_uuid", ((C60737Nsb) this.l1).containerId);
        Boolean bool = Boolean.TRUE;
        requestParams.setEnableMemoryCache(bool);
        HybridSchemaParam hybridSchemaParam = (HybridSchemaParam) this.l2;
        if (hybridSchemaParam == null) {
            LIZJ = C60905NvJ.LIZLLL(this.s0, requestParams, null);
        } else {
            C60905NvJ.LJII(requestParams, hybridSchemaParam);
            LIZJ = C60905NvJ.LIZJ((HybridSchemaParam) this.l2, this.s0, true);
        }
        InterfaceC61488OBg LIZIZ = C60905NvJ.LIZIZ((C60737Nsb) this.l1, bool);
        if (!(LIZIZ instanceof C39902FlK)) {
            LIZIZ = null;
        }
        C39902FlK c39902FlK = (C39902FlK) LIZIZ;
        if (c39902FlK != null) {
            c39902FlK.LJ(LIZJ, requestParams, null);
        }
    }

    public final void LIZ$7() {
        String str;
        String str2;
        List<C39480FeW> list;
        String str3 = this.s0;
        C39480FeW c39480FeW = null;
        if (str3 != null && (list = C39481FeX.LIZ.get(str3)) != null) {
            c39480FeW = (C39480FeW) ORZ.LLFII(list);
        }
        JSONObject LIZJ = C65232Piu.LIZJ("type", "webrouter");
        LIZJ.put("host", ((C39492Fei) this.l1).LJLILLLLZI);
        LIZJ.put("path", ((C39492Fei) this.l1).LJLJJLL);
        if (c39480FeW != null) {
            LIZJ.put("caller", c39480FeW.LJLIL);
            LIZJ.put("callee", c39480FeW.LJLILLLLZI);
        }
        JSONObject jSONObject = new JSONObject();
        String str4 = "";
        if (C38351F3j.LIZ == null) {
            try {
                HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
                o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
                Application ctx = heliosEnvImpl.LJIIIIZZ;
                Properties properties = new Properties();
                o.LJIIIIZZ(ctx, "ctx");
                properties.load(ctx.getAssets().open("slardar.properties"));
                str = String.valueOf(properties.get("release_build"));
            } catch (Exception unused) {
                str = "";
            }
            C38351F3j.LIZ = str;
        }
        String str5 = C38351F3j.LIZ;
        if (str5 == null) {
            str5 = "";
        }
        jSONObject.put("mr_id", str5);
        if (C38351F3j.LIZIZ == null) {
            try {
                HeliosEnvImpl heliosEnvImpl2 = HeliosEnvImpl.get();
                o.LJIIIIZZ(heliosEnvImpl2, "HeliosEnvImpl.get()");
                Application ctx2 = heliosEnvImpl2.LJIIIIZZ;
                Properties properties2 = new Properties();
                o.LJIIIIZZ(ctx2, "ctx");
                properties2.load(ctx2.getAssets().open("ss.properties"));
                str2 = String.valueOf(properties2.get("commit"));
            } catch (Exception unused2) {
                str2 = "";
            }
            C38351F3j.LIZIZ = str2;
        }
        String str6 = C38351F3j.LIZIZ;
        if (str6 != null) {
            str4 = str6;
        }
        jSONObject.put("commit_id", str4);
        if (c39480FeW != null && c39480FeW.LJLJL != null) {
            Throwable th = c39480FeW.LJLJL;
            o.LJI(th);
            jSONObject.put("stack", C38386F4s.LIZJ(th, true));
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("category", LIZJ);
        jSONObject2.put("extra", jSONObject);
        IEventMonitor iEventMonitor = (IEventMonitor) this.l2;
        if (iEventMonitor != null) {
            iEventMonitor.monitorCommonLog("pns_dataflow_id_miss_info", jSONObject2);
        }
    }

    public static final void run$0(ARunnableS5S1200000_6 aRunnableS5S1200000_6) {
        boolean LIZ;
        try {
            aRunnableS5S1200000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS5S1200000_6 aRunnableS5S1200000_6) {
        boolean LIZ;
        try {
            aRunnableS5S1200000_6.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS5S1200000_6 aRunnableS5S1200000_6) {
        boolean LIZ;
        try {
            aRunnableS5S1200000_6.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS5S1200000_6 aRunnableS5S1200000_6) {
        boolean LIZ;
        try {
            aRunnableS5S1200000_6.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$12(ARunnableS5S1200000_6 aRunnableS5S1200000_6) {
        boolean LIZ;
        try {
            String path = aRunnableS5S1200000_6.s0;
            o.LJIIIIZZ(path, "path");
            String traceCode = (String) ((C68322mC) aRunnableS5S1200000_6.l1).element;
            C36341EOb metrics = (C36341EOb) aRunnableS5S1200000_6.l2;
            o.LJIIIZ(traceCode, "traceCode");
            o.LJIIIZ(metrics, "metrics");
            try {
                C36340EOa.LJIIJ(metrics, path, traceCode);
            } catch (Throwable unused) {
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS5S1200000_6 aRunnableS5S1200000_6) {
        boolean LIZ;
        try {
            aRunnableS5S1200000_6.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS5S1200000_6 aRunnableS5S1200000_6) {
        boolean LIZ;
        try {
            JNN.LJIILLIIL.put(aRunnableS5S1200000_6.s0, ORZ.LLJILLL((Set) aRunnableS5S1200000_6.l1));
            FMX.LJIILJJIL(aRunnableS5S1200000_6.s0, (JSONObject) aRunnableS5S1200000_6.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS5S1200000_6 aRunnableS5S1200000_6) {
        boolean LIZ;
        try {
            aRunnableS5S1200000_6.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS5S1200000_6 aRunnableS5S1200000_6) {
        boolean LIZ;
        try {
            ((C38692FGm) aRunnableS5S1200000_6.l2).LJII.LIZIZ(aRunnableS5S1200000_6.s0, (EYS) aRunnableS5S1200000_6.l1, null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS5S1200000_6 aRunnableS5S1200000_6) {
        boolean LIZ;
        try {
            aRunnableS5S1200000_6.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS5S1200000_6 aRunnableS5S1200000_6) {
        boolean LIZ;
        try {
            C37900Eu8 c37900Eu8 = (C37900Eu8) aRunnableS5S1200000_6.l1;
            String url = aRunnableS5S1200000_6.s0;
            ValueCallback<String> valueCallback = (ValueCallback) aRunnableS5S1200000_6.l2;
            c37900Eu8.getClass();
            o.LJIIJ(url, "url");
            WebView webView = c37900Eu8.LIZ;
            if (webView != null) {
                webView.evaluateJavascript(url, valueCallback);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS5S1200000_6 aRunnableS5S1200000_6) {
        boolean LIZ;
        try {
            Iterator<FUF> it = ((FUG) aRunnableS5S1200000_6.l2).LIZ.iterator();
            while (it.hasNext()) {
                it.next().LIZ(aRunnableS5S1200000_6.s0, (JSONObject) aRunnableS5S1200000_6.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS5S1200000_6 aRunnableS5S1200000_6) {
        Object LIZ;
        String str = aRunnableS5S1200000_6.s0;
        AqS61S1200000_6 aqS61S1200000_6 = new AqS61S1200000_6(str, (InterfaceC65784Pro) aRunnableS5S1200000_6.l1, (InterfaceC65784Pro) aRunnableS5S1200000_6.l2, 3);
        C38805FKv.LIZ.getClass();
        FL5 fl5 = (FL5) ((LinkedHashMap) C38805FKv.LJI).get(str);
        if (fl5 != null) {
            try {
                LIZ = (C76800UCe) aqS61S1200000_6.invoke();
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
                o.LJI(str);
                fl5.LIZ();
                return;
            }
            return;
        }
        aqS61S1200000_6.invoke();
    }

    public static final void run$8(ARunnableS5S1200000_6 aRunnableS5S1200000_6) {
        boolean LIZ;
        try {
            ((C79392VDw) aRunnableS5S1200000_6.l2).LIZJ(aRunnableS5S1200000_6.s0, (JSONObject) aRunnableS5S1200000_6.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS5S1200000_6 aRunnableS5S1200000_6) {
        boolean LIZ;
        try {
            aRunnableS5S1200000_6.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS5S1200000_6(Context context, Map map, int i) {
        this.$t = i;
        this.l1 = context;
        this.s0 = "SP_EXPERIMENT_EXPOSURE_CACHE";
        this.l2 = map;
    }

    public ARunnableS5S1200000_6(C37561Eof c37561Eof, C37444Emm c37444Emm, int i) {
        this.$t = i;
        this.l1 = c37561Eof;
        this.l2 = c37444Emm;
        this.s0 = null;
    }

    public ARunnableS5S1200000_6(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.l1 = obj2;
    }

    public ARunnableS5S1200000_6(EI4 ei4, EHL ehl, Context context, String str, int i) {
        this.$t = i;
        this.l1 = ei4;
        this.l2 = ehl;
        this.s0 = str;
    }

    public ARunnableS5S1200000_6(FUG fug, String str, String str2, JSONObject jSONObject, int i) {
        this.$t = i;
        this.l2 = fug;
        this.s0 = str2;
        this.l1 = jSONObject;
    }
}
