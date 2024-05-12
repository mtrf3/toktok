package com.bytedance.android.monitorV2.lynx;

import X.C113554cx;
import X.C141335gf;
import X.C1JX;
import X.C35894E6w;
import X.C36745EbV;
import X.C38162EyM;
import X.C38164EyO;
import X.C38192Eyq;
import X.C38218EzG;
import X.C3C5;
import X.C60888Nv2;
import X.C61659OHv;
import X.C76800UCe;
import X.C77117UOj;
import X.C77119UOl;
import X.C79596VLs;
import X.C79602VLy;
import X.C79604VMa;
import X.C79605VMb;
import X.C79617VMn;
import X.C79622VMs;
import X.C79626VMw;
import X.EnumC65355Pkt;
import X.F33;
import X.InterfaceC78500UrQ;
import X.OFH;
import X.OFI;
import X.OFM;
import X.OFP;
import X.OSZ;
import X.UHB;
import X.VLQ;
import X.VM0;
import X.VM3;
import X.VM4;
import X.VM8;
import X.VM9;
import X.VMA;
import X.VMB;
import X.VMC;
import X.VMF;
import X.VMS;
import X.VMV;
import X.VN0;
import X.VN3;
import X.VNS;
import X.X1D;
import Y.ARunnableS50S0100000_14;
import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.g0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class LynxViewMonitor implements OFM {
    public static final UHB Companion = new UHB();
    public static final LynxViewMonitor INSTANCE = C79626VMw.LIZ;
    public static final long JVM_DIFF;
    public final InterfaceC78500UrQ lifeCycleDelegate = new g0();

    public static /* synthetic */ void lifeCycleDelegate$annotations() {
    }

    public final void handleBlankDetect(VNS vns) {
        handleBlankDetect$default(this, vns, null, 2, null);
    }

    @Override // X.OFM
    public void handleCollectEvent(View view, String field, Object value) {
        o.LJIIJ(field, "field");
        o.LJIIJ(value, "value");
    }

    public final void reportError(VNS vns, VM0 vm0) {
        reportError$default(this, vns, vm0, null, 4, null);
    }

    static {
        long j = 1000;
        JVM_DIFF = ((System.currentTimeMillis() * j) * j) - SystemClock.elapsedRealtimeNanos();
    }

    public LynxViewMonitor() {
        OFH.LIZLLL.getClass();
        OFH.LIZIZ.put("lynx", this);
        try {
            C36745EbV.LIZ(VMA.class, "com.bytedance.android.monitorV2.lynx.impl.blank.LynxBlankDetectorDefault");
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public final InterfaceC78500UrQ getLifeCycleDelegate() {
        return this.lifeCycleDelegate;
    }

    public final HashMap<String, Object> getExtraInfo(VNS view) {
        o.LJIIJ(view, "view");
        return C113554cx.LJJJLZIJ(new OSZ("navigation_id", VMB.LJLLLL.LIZ(view).LJIILJJIL().LJLILLLLZI));
    }

    @Override // X.OFM
    public String getMonitorBid(View view) {
        VM9 vm9;
        if ((view instanceof VNS) && (vm9 = VMB.LJLLLL.LIZ((VNS) view).LJLJJL) != null) {
            String str = vm9.LJLILLLLZI;
            if (str.length() > 0) {
                return str;
            }
            String str2 = vm9.LJLLI;
            Map LIZIZ = OFI.LIZIZ(vm9.LJLJI);
            if (str2 == null || ujb.o.LJJJJJL(str2)) {
                str2 = String.valueOf(LIZIZ.get("url"));
            }
            String str3 = VMV.LJII(String.valueOf(LIZIZ.get("schema")), str2, false).LIZ;
            if (!(!ujb.o.LJJJJJL(str3))) {
                str3 = vm9.LJZ.LJLJI.LIZ;
            }
            if (str3 != null) {
                return str3;
            }
        }
        return "";
    }

    public final boolean isEnableMonitor(VNS view) {
        o.LJIIJ(view, "view");
        if (!VMB.LJLLLL.LIZ(view).LJLJI.LIZIZ || !VMS.monitor.isEnabled() || !VMS.lynxMonitor.isEnabled()) {
            return false;
        }
        return true;
    }

    public final void unregisterLynxViewMonitor(VNS view) {
        o.LJIIJ(view, "view");
        VMC vmc = VMB.LJLLLL;
        VMB LIZ = vmc.LIZ(view);
        WeakReference<LynxViewClient> weakReference = LIZ.LJLJJI;
        if (weakReference != null) {
            view.removeLynxViewClient(weakReference.get());
            LIZ.LJLJJI = null;
        }
        vmc.getClass();
        VMB.LJLLL.remove(view);
    }

    public final void isEnableBlankCheckTool(boolean z) {
    }

    public static final void syncInstanceId(VNS view, int i) {
        Companion.getClass();
        o.LJIIJ(view, "view");
        if (OFP.LynxOptimize.not()) {
            return;
        }
        VMB.LJLLLL.LIZ(view).LJLL = i;
    }

    public final void addTemplateState(VNS view, int i) {
        o.LJIIJ(view, "view");
        if (isEnableMonitor(view)) {
            VMB.LJLLLL.LIZ(view).LJIILJJIL().LJLLL = i;
        }
    }

    @Override // X.OFM
    public void customReport(View view, C79604VMa customInfo) {
        o.LJIIJ(customInfo, "customInfo");
        if (view instanceof VNS) {
            reportCustom((VNS) view, customInfo);
        }
    }

    public final void handleBlankDetect(VNS view, VN0 vn0) {
        o.LJIIJ(view, "view");
        try {
            VMB LIZ = VMB.LJLLLL.LIZ(view);
            VM9 vm9 = LIZ.LJLJJL;
            if (vm9 == null) {
                if (LIZ.LJLIL.get() != null && vn0 != null) {
                    vn0.LIZIZ();
                    vn0.LIZ();
                }
            } else {
                vm9.LJIILLIIL();
            }
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }

    public final void notifyLynxViewReload(VNS view, String url) {
        o.LJIIJ(view, "view");
        o.LJIIJ(url, "url");
        VMB.LJLLLL.LIZ(view).LJII(url);
    }

    public final void registerLynxViewMonitor(VNS view, C60888Nv2 config) {
        o.LJIIJ(view, "view");
        o.LJIIJ(config, "config");
        VMB LIZ = VMB.LJLLLL.LIZ(view);
        LIZ.getClass();
        LIZ.LJLJI = config;
        C79602VLy c79602VLy = new C79602VLy(new WeakReference(view));
        view.addLynxViewClient(c79602VLy);
        LIZ.LJLJJI = new WeakReference<>(c79602VLy);
        OFH.LIZLLL.getClass();
        OFH.LIZIZ.put("lynx", this);
    }

    public final void reportCustom(VNS vns, C79604VMa customInfo) {
        o.LJIIJ(customInfo, "customInfo");
        C38192Eyq.LIZIZ(new AqS161S0200000_14(vns, customInfo, 2));
    }

    public final void reportFallbackPage(VNS vns, VN3 vn3) {
        C38192Eyq.LIZIZ(new C79622VMs(this, vns));
    }

    public final void reportJsbError(VNS view, C38164EyO errorData) {
        o.LJIIJ(view, "view");
        o.LJIIJ(errorData, "errorData");
        try {
            VM4.LJIILL.getClass();
            VM4 LIZ = VM3.LIZ("jsbError", errorData);
            boolean not = VMS.lynxJsb.not();
            LIZ.LJFF(not, EnumC65355Pkt.SWITCH_OFF);
            if (not) {
                return;
            }
            LIZ.LIZLLL(null, "jsb_error_extra");
            C38192Eyq.LIZ.post(new ARunnableS50S0100000_14((Object) new AqS161S0200000_14(LIZ, view, 3), 158));
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public final void reportJsbFetchError(VNS view, VLQ errorData) {
        o.LJIIJ(view, "view");
        o.LJIIJ(errorData, "errorData");
        VM4.LJIILL.getClass();
        VM4 LIZ = VM3.LIZ("fetchError", errorData);
        boolean not = VMS.lynxFetch.not();
        LIZ.LJFF(not, EnumC65355Pkt.SWITCH_OFF);
        if (not) {
            return;
        }
        VMB.LJLLLL.LIZIZ(view, LIZ);
    }

    public final void reportJsbInfo(VNS view, C38162EyM infoData) {
        o.LJIIJ(view, "view");
        o.LJIIJ(infoData, "infoData");
        VM4.LJIILL.getClass();
        VM4 LIZ = VM3.LIZ("jsbPerf", infoData);
        boolean not = VMS.lynxJsb.not();
        LIZ.LJFF(not, EnumC65355Pkt.SWITCH_OFF);
        if (not) {
            return;
        }
        VMB.LJLLLL.LIZIZ(view, LIZ);
    }

    public static final void event(int i, String name, Map<String, ? extends Object> map) {
        Companion.getClass();
        o.LJIIJ(name, "name");
        if (OFP.LynxOptimize.not()) {
            return;
        }
        VMB.LJLLLL.getClass();
        VMB vmb = VMB.LJLLJ;
        if (i >= 0) {
            for (Map.Entry<View, VMB> entry : VMB.LJLLL.entrySet()) {
                if (entry.getValue().LJLL == i) {
                    VMB value = entry.getValue();
                    o.LJFF(value, "it.value");
                    vmb = value;
                }
            }
        }
        if (name.hashCode() != 1203837037 || !name.equals("lynxsdk_fluency_event")) {
            C1JX.LJIIIIZZ("Unknown lynx event: ", name);
            return;
        }
        VM3 vm3 = VM4.LJIILL;
        JSONObject jSONObject = new JSONObject(map);
        vm3.getClass();
        vmb.onEventPost(VM3.LIZ("lynxsdk_fluency_event", new C79596VLs("lynxsdk_fluency_event", jSONObject)));
    }

    public final void addContext(VNS view, String key, String o) {
        o.LJIIJ(view, "view");
        o.LJIIJ(key, "key");
        o.LJIIJ(o, "o");
        if (isEnableMonitor(view)) {
            VMB.LJLLLL.LIZ(view).LJIILJJIL().LLLLZ(o, key);
        }
    }

    public final void handleNativeInfo(VNS view, String eventType, JSONObject inputJsonObject) {
        o.LJIIJ(view, "view");
        o.LJIIJ(eventType, "eventType");
        o.LJIIJ(inputJsonObject, "inputJsonObject");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleNativeInfo: eventTYpe: ");
        LIZ.append(eventType);
        X1D.LIZIZ(LIZ);
        VMC vmc = VMB.LJLLLL;
        VM4.LJIILL.getClass();
        vmc.LIZIZ(view, VM3.LIZ(eventType, new C79596VLs(eventType, inputJsonObject)));
    }

    public final void reportError(VNS view, VM0 lynxNativeErrorData, VM4 vm4) {
        o.LJIIJ(view, "view");
        o.LJIIJ(lynxNativeErrorData, "lynxNativeErrorData");
        if (vm4 == null) {
            VM4.LJIILL.getClass();
            vm4 = VM3.LIZ("nativeError", lynxNativeErrorData);
        }
        int i = lynxNativeErrorData.LJLJI;
        if (i == 201) {
            lynxNativeErrorData.LJLIL = "js_exception";
            vm4.LJIIJ = "js_exception";
        } else if (i == 301) {
            lynxNativeErrorData.LJLIL = "static";
            vm4.LJIIJ = "static";
        }
        vm4.LJIIL = lynxNativeErrorData;
        VMB.LJLLLL.LIZIZ(view, vm4);
    }

    public final void reportTemplateInfo(VNS view, String from, String str) {
        o.LJIIJ(view, "view");
        o.LJIIJ(from, "from");
        reportGeckoInfo(view, from, "template", view.getTemplateUrl(), str);
    }

    public final void addContext(VNS view, String key, Object o) {
        o.LJIIJ(view, "view");
        o.LJIIJ(key, "key");
        o.LJIIJ(o, "o");
        addContext(view, key, o.toString());
    }

    @Override // X.OFM
    public void handleNativeInfo(View view, String type, JSONObject jsonObject) {
        o.LJIIJ(type, "type");
        o.LJIIJ(jsonObject, "jsonObject");
        if (view instanceof VNS) {
            handleNativeInfo((VNS) view, type, jsonObject);
        }
    }

    @Override // X.OFM
    public void handleContainerError(View view, String monitorId, C35894E6w base, C61659OHv error) {
        o.LJIIJ(monitorId, "monitorId");
        o.LJIIJ(base, "base");
        o.LJIIJ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reportContainerError, errorCode: ");
        LIZ.append(error.LJLIL);
        X1D.LIZIZ(LIZ);
        VM3 vm3 = VM4.LJIILL;
        C79617VMn c79617VMn = new C79617VMn();
        vm3.getClass();
        VM4 LIZ2 = VM3.LIZ("containerError", c79617VMn);
        LIZ2.LJI = base;
        LIZ2.LJIILIIL = error.L();
        try {
            if (view == null) {
                new C60888Nv2(error.LJLJJI, new C38218EzG());
                VMF vmf = new VMF();
                vmf.LJLJJLL = error.LJLJI;
                vmf.LJLLL = 999;
                Activity LJIIIZ = C77119UOl.LJIIIZ(null);
                if (LJIIIZ != null) {
                    vmf.LJLJJI = LJIIIZ.getClass().getName();
                }
                LIZ2.LJ = vmf;
                VMB.LJLLLL.LIZIZ(null, LIZ2);
                return;
            }
            VMC vmc = VMB.LJLLLL;
            LIZ2.LJ(vmc.LIZ((VNS) view).LJIILJJIL());
            LIZ2.LJI = OFI.LJFF(view);
            vmc.LIZIZ((VNS) view, LIZ2);
        } catch (Throwable th) {
            LIZ2.onEventTerminated(EnumC65355Pkt.CATCH_EXCEPTION);
            C77117UOj.LJIIZILJ(th);
        }
    }

    public static /* synthetic */ void handleBlankDetect$default(LynxViewMonitor lynxViewMonitor, VNS vns, VN0 vn0, int i, Object obj) {
        if ((i & 2) != 0) {
            vn0 = null;
        }
        lynxViewMonitor.handleBlankDetect(vns, vn0);
    }

    public final void reportCustom(C60888Nv2 config, JSONObject category, JSONObject metric, JSONObject extra, int i) {
        o.LJIIJ(config, "config");
        o.LJIIJ(category, "category");
        o.LJIIJ(metric, "metric");
        o.LJIIJ(extra, "extra");
        C79605VMb c79605VMb = new C79605VMb("performance_test");
        c79605VMb.LIZIZ = config.LIZ;
        c79605VMb.LIZLLL = category;
        c79605VMb.LJ = metric;
        c79605VMb.LJFF = extra;
        c79605VMb.LIZIZ(i);
        HybridMultiMonitor.getInstance().customReportInner(VM8.LIZ(c79605VMb.LIZ()));
    }

    public final void reportGeckoInfo(VNS vns, String str, String str2, String str3, String str4) {
        C38192Eyq.LIZIZ(new F33(this, vns, str, str2, str3, str4));
    }

    public static /* synthetic */ void reportError$default(LynxViewMonitor lynxViewMonitor, VNS vns, VM0 vm0, VM4 vm4, int i, Object obj) {
        if ((i & 4) != 0) {
            vm4 = null;
        }
        lynxViewMonitor.reportError(vns, vm0, vm4);
    }

    public static /* synthetic */ void reportTemplateInfo$default(LynxViewMonitor lynxViewMonitor, VNS vns, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        lynxViewMonitor.reportTemplateInfo(vns, str, str2);
    }

    public final void reportCustom(VNS vns, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        reportCustom(vns, str, str2, jSONObject, jSONObject2, jSONObject3, null, jSONObject4, 0);
    }

    public static /* synthetic */ void reportGeckoInfo$default(LynxViewMonitor lynxViewMonitor, VNS vns, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 16) != 0) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        lynxViewMonitor.reportGeckoInfo(vns, str, str2, str3, str4);
    }

    public final void reportCustom(VNS vns, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i) {
        reportCustom(vns, str, str2, jSONObject, jSONObject2, jSONObject3, null, jSONObject4, i);
    }

    public final void reportCustom(VNS vns, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, int i) {
        C1JX.LJIIIIZZ("reportCustom: eventType: ", str);
        C79605VMb c79605VMb = new C79605VMb(str);
        c79605VMb.LIZ = str2;
        c79605VMb.LIZLLL = jSONObject;
        c79605VMb.LJ = jSONObject2;
        c79605VMb.LJFF = jSONObject3;
        c79605VMb.LJI = jSONObject4;
        c79605VMb.LJII = jSONObject5;
        c79605VMb.LIZIZ(i);
        reportCustom(vns, c79605VMb.LIZ());
    }

    public static /* synthetic */ void reportCustom$default(LynxViewMonitor lynxViewMonitor, VNS vns, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, Object obj) {
        if ((i & 64) != 0) {
            jSONObject4 = null;
        }
        lynxViewMonitor.reportCustom(vns, str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4);
    }

    public static /* synthetic */ void reportCustom$default(LynxViewMonitor lynxViewMonitor, VNS vns, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, int i2, Object obj) {
        if ((i2 & 64) != 0) {
            jSONObject4 = null;
        }
        lynxViewMonitor.reportCustom(vns, str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, i);
    }

    public static /* synthetic */ void reportCustom$default(LynxViewMonitor lynxViewMonitor, VNS vns, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, int i, int i2, Object obj) {
        if ((i2 & 128) != 0) {
            jSONObject5 = null;
        }
        lynxViewMonitor.reportCustom(vns, str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, jSONObject5, i);
    }
}
