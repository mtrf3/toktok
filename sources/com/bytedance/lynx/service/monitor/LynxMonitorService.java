package com.bytedance.lynx.service.monitor;

import X.C141335gf;
import X.C3C5;
import X.C40031FnP;
import X.C40032FnQ;
import X.C40033FnR;
import X.C76800UCe;
import X.C79604VMa;
import X.C79605VMb;
import X.InterfaceC79401VEf;
import X.VNS;
import X.X1D;
import android.app.Application;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class LynxMonitorService implements InterfaceC79401VEf {
    public static volatile boolean SDK_VERSION_REPORTED;
    public static C40033FnR lynxServiceConfig;
    public static final LynxMonitorService INSTANCE = new LynxMonitorService();
    public static final AtomicBoolean initLock = new AtomicBoolean(false);

    private final void ensureInitialize() {
        Object LIZ;
        C40033FnR c40033FnR;
        Application application;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (!initLock.compareAndSet(false, true)) {
            return;
        }
        try {
            Field declaredField = HybridMultiMonitor.class.getDeclaredField("isInitialized");
            o.LJFF(declaredField, "HybridMultiMonitor::clas…redField(\"isInitialized\")");
            declaredField.setAccessible(true);
            if (!Boolean.valueOf(declaredField.getBoolean(HybridMultiMonitor.getInstance())).booleanValue() && (c40033FnR = lynxServiceConfig) != null && (application = c40033FnR.LIZ) != null) {
                HybridMultiMonitor.getInstance().init(application);
                C40031FnP c40031FnP = new C40031FnP();
                C40033FnR c40033FnR2 = lynxServiceConfig;
                String str7 = null;
                if (c40033FnR2 != null) {
                    str = c40033FnR2.LJIIIZ;
                } else {
                    str = null;
                }
                c40031FnP.LIZIZ = str;
                if (c40033FnR2 == null) {
                    str2 = null;
                } else {
                    str2 = c40033FnR2.LJIIIIZZ;
                }
                c40031FnP.LIZLLL = str2;
                if (c40033FnR2 == null) {
                    str3 = null;
                } else {
                    str3 = c40033FnR2.LIZLLL;
                }
                c40031FnP.LIZ = str3;
                if (c40033FnR2 == null) {
                    str4 = null;
                } else {
                    str4 = c40033FnR2.LJI;
                }
                c40031FnP.LIZJ = str4;
                if (c40033FnR2 == null) {
                    str5 = null;
                } else {
                    str5 = c40033FnR2.LJ;
                }
                c40031FnP.LJ = str5;
                if (c40033FnR2 == null) {
                    str6 = null;
                } else {
                    str6 = c40033FnR2.LJFF;
                }
                c40031FnP.LJFF = str6;
                if (c40033FnR2 != null) {
                    str7 = c40033FnR2.LJII;
                }
                c40031FnP.LJI = str7;
                HybridMultiMonitor.getInstance().setConfig(c40031FnP.LIZ());
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("LynxMonitorService ensureInitialize:");
            LIZ2.append(m10exceptionOrNullimpl.getMessage());
            LLog.LIZLLL(4, "LynxMonitorService", X1D.LIZIZ(LIZ2));
        }
    }

    public final void initialize(C40033FnR lynxConfig) {
        o.LJIIJ(lynxConfig, "lynxConfig");
        lynxServiceConfig = lynxConfig;
    }

    @Override // X.InterfaceC79401VEf
    public void reportCrashGlobalContextTag(String tagName, String tagValue) {
        o.LJIIJ(tagName, "tagName");
        o.LJIIJ(tagValue, "tagValue");
        try {
            if (!SDK_VERSION_REPORTED) {
                o.LJFF(LynxEnv.LJIIIZ(), "LynxEnv.inst()");
                Npth.registerSdk(2951, "2.10.16-rc.10");
                SDK_VERSION_REPORTED = true;
            }
            Npth.addTag(tagName, tagValue);
            Npth.addAttachUserData(new C40032FnQ(tagValue, tagName), CrashType.ALL);
        } catch (ClassCastException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LynxMonitorService reportCrashGlobalContextTag:");
            LIZ.append(e.getMessage());
            LLog.LIZLLL(4, "LynxMonitorService", X1D.LIZIZ(LIZ));
        } catch (IllegalArgumentException e2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("LynxMonitorService reportCrashGlobalContextTag:");
            LIZ2.append(e2.getMessage());
            LLog.LIZLLL(4, "LynxMonitorService", X1D.LIZIZ(LIZ2));
        } catch (NullPointerException e3) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("LynxMonitorService reportCrashGlobalContextTag:");
            LIZ3.append(e3.getMessage());
            LLog.LIZLLL(4, "LynxMonitorService", X1D.LIZIZ(LIZ3));
        } catch (UnsupportedOperationException e4) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("LynxMonitorService reportCrashGlobalContextTag:");
            LIZ4.append(e4.getMessage());
            LLog.LIZLLL(4, "LynxMonitorService", X1D.LIZIZ(LIZ4));
        }
    }

    @Override // X.InterfaceC79401VEf
    public void reportImageStatus(String eventName, JSONObject data) {
        o.LJIIJ(eventName, "eventName");
        o.LJIIJ(data, "data");
        JSONObject jSONObject = new JSONObject();
        JSONObject optJSONObject = data.optJSONObject("timeMetrics");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            o.LJFF(keys, "this.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, optJSONObject.get(next));
            }
        }
        jSONObject.put("image_load_success_rate", data.optInt("successRate", -1));
        jSONObject.put("memory_cost", data.optLong("memoryCost", -1L));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("image_url", data.optString("image_url", ""));
        formatEventReporter(null, eventName, data, jSONObject, jSONObject2);
    }

    @Override // X.InterfaceC79401VEf
    public void reportTrailEvent(String eventName, JSONObject data) {
        o.LJIIJ(eventName, "eventName");
        o.LJIIJ(data, "data");
        JSONObject jSONObject = new JSONObject();
        JSONObject optJSONObject = data.optJSONObject("page_config");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            o.LJFF(keys, "this.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, optJSONObject.get(next));
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject optJSONObject2 = data.optJSONObject("metric");
        if (optJSONObject2 != null) {
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("metrics");
            if (optJSONObject3 != null) {
                Iterator<String> keys2 = optJSONObject3.keys();
                o.LJFF(keys2, "it.keys()");
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    jSONObject2.put(next2, optJSONObject3.get(next2));
                }
            }
            JSONObject optJSONObject4 = optJSONObject2.optJSONObject("setup_timing");
            if (optJSONObject4 != null) {
                Iterator<String> keys3 = optJSONObject4.keys();
                o.LJFF(keys3, "it.keys()");
                while (keys3.hasNext()) {
                    String next3 = keys3.next();
                    jSONObject2.put(next3, optJSONObject4.get(next3));
                }
            }
            JSONObject optJSONObject5 = optJSONObject2.optJSONObject("extra_timing");
            if (optJSONObject5 != null) {
                Iterator<String> keys4 = optJSONObject5.keys();
                o.LJFF(keys4, "it.keys()");
                while (keys4.hasNext()) {
                    String next4 = keys4.next();
                    jSONObject2.put(next4, optJSONObject5.get(next4));
                }
            }
            JSONObject optJSONObject6 = optJSONObject2.optJSONObject("update_timings");
            if (optJSONObject6 != null) {
                Iterator<String> keys5 = optJSONObject6.keys();
                o.LJFF(keys5, "it.keys()");
                while (keys5.hasNext()) {
                    String next5 = keys5.next();
                    jSONObject2.put(next5, optJSONObject6.get(next5));
                }
            }
            JSONObject optJSONObject7 = optJSONObject2.optJSONObject("memory");
            if (optJSONObject7 != null) {
                Iterator<String> keys6 = optJSONObject7.keys();
                o.LJFF(keys6, "it.keys()");
                while (keys6.hasNext()) {
                    String next6 = keys6.next();
                    jSONObject2.put(next6, optJSONObject7.get(next6));
                }
            }
        }
        formatEventReporter(null, eventName, data, jSONObject2, jSONObject);
    }

    @Override // X.InterfaceC79401VEf
    public void reportResourceStatus(VNS view, String eventName, JSONObject data, JSONObject jSONObject) {
        o.LJIIJ(view, "view");
        o.LJIIJ(eventName, "eventName");
        o.LJIIJ(data, "data");
        LynxViewMonitor.Companion.getClass();
        LynxViewMonitor.INSTANCE.handleNativeInfo(view, eventName, data);
    }

    @Override // X.InterfaceC79401VEf
    public void formatEventReporter(VNS vns, String eventName, JSONObject data, JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String str2;
        o.LJIIJ(eventName, "eventName");
        o.LJIIJ(data, "data");
        ensureInitialize();
        JSONObject optJSONObject = data.optJSONObject("metric");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("url", optJSONObject.optString("url", ""));
        jSONObject3.put("bid", "LynxInspector");
        jSONObject3.put("pid", "Lynx");
        if (jSONObject2 != null) {
            jSONObject2.put("type", "Lynx");
            jSONObject2.put("trigger", eventName);
            C40033FnR c40033FnR = lynxServiceConfig;
            if (c40033FnR == null || (str2 = c40033FnR.LJIIIIZZ) == null) {
                str2 = "";
            }
            jSONObject2.put("channel", data.optString("channel", str2));
            jSONObject2.put("url", optJSONObject.optString("url", ""));
        }
        JSONObject optJSONObject2 = data.optJSONObject("extra");
        if (optJSONObject2 == null) {
            optJSONObject2 = new JSONObject();
        }
        C79605VMb c79605VMb = new C79605VMb(eventName);
        c79605VMb.LIZIZ = "LynxInspector";
        c79605VMb.LIZLLL = jSONObject2;
        c79605VMb.LJ = jSONObject;
        c79605VMb.LJII = jSONObject3;
        c79605VMb.LJFF = optJSONObject2;
        c79605VMb.LIZIZ(0);
        C40033FnR c40033FnR2 = lynxServiceConfig;
        if (c40033FnR2 != null) {
            str = c40033FnR2.LIZLLL;
        } else {
            str = null;
        }
        c79605VMb.LJIIIZ = str;
        C79604VMa LIZ = c79605VMb.LIZ();
        if (vns != null) {
            LynxViewMonitor.Companion.getClass();
            LynxViewMonitor.INSTANCE.reportCustom(vns, LIZ);
        } else {
            HybridMultiMonitor.getInstance().customReport(LIZ);
        }
    }
}
