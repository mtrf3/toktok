package com.bytedance.pitaya.bdcomponentimpl.monitor;

import X.C16880lQ;
import X.C47261Igj;
import X.C64009PAf;
import X.C64241PJd;
import X.C64246PJi;
import X.C93266aO6;
import X.C93327aP5;
import X.ORY;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.pitaya.api.PTYDIDCallback;
import com.bytedance.pitaya.api.bean.PTYSetupInfo;
import com.bytedance.pitaya.log.PitayaLogger;
import com.bytedance.pitaya.thirdcomponent.monitor.Monitor;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes30.dex */
public final class APMMonitorImpl implements Monitor {
    public static final C93266aO6 Companion = new C93266aO6();
    public C64009PAf mMonitor;
    public PTYSetupInfo si;

    public final C64009PAf getMMonitor$bdcomponent_release() {
        return this.mMonitor;
    }

    public final PTYSetupInfo getSi() {
        return this.si;
    }

    @Override // com.bytedance.pitaya.thirdcomponent.monitor.Monitor
    public boolean isAllowedEvent(String eventName) {
        o.LJIIJ(eventName, "eventName");
        C64009PAf c64009PAf = this.mMonitor;
        if (c64009PAf == null || c64009PAf.LJI == null || TextUtils.isEmpty(eventName) || c64009PAf.LJI.opt(eventName) == null) {
            return false;
        }
        return true;
    }

    public final void setMMonitor$bdcomponent_release(C64009PAf c64009PAf) {
        this.mMonitor = c64009PAf;
    }

    public final void setSi(PTYSetupInfo pTYSetupInfo) {
        this.si = pTYSetupInfo;
    }

    @Override // com.bytedance.pitaya.thirdcomponent.monitor.Monitor
    public void monitorEvent(String eventName, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        o.LJIIJ(eventName, "eventName");
        JSONObject put = new JSONObject().put("extra", jSONObject3);
        C64009PAf c64009PAf = this.mMonitor;
        if (c64009PAf != null) {
            c64009PAf.LJIIJ(eventName, jSONObject, jSONObject2, put);
        }
    }

    @Override // com.bytedance.pitaya.thirdcomponent.monitor.Monitor
    public void threadException(String type, String str, String str2, int i) {
        o.LJIIJ(type, "type");
        Map<Thread, StackTraceElement[]> all = Thread.getAllStackTraces();
        o.LJFF(all, "all");
        StackTraceElement stackTraceElement = null;
        for (Map.Entry<Thread, StackTraceElement[]> entry : all.entrySet()) {
            Thread key = entry.getKey();
            o.LJFF(key, "entry.key");
            String name = key.getName();
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            o.LJFF(LLLLIIIILLL, "Thread.currentThread()");
            if (o.LJ(name, LLLLIIIILLL.getName())) {
                StackTraceElement[] value = entry.getValue();
                o.LJFF(value, "entry.value");
                if (value.length != 0) {
                    StackTraceElement[] value2 = entry.getValue();
                    o.LJFF(value2, "entry.value");
                    stackTraceElement = (StackTraceElement) ORY.LJJIL(value2);
                }
            }
        }
        if (stackTraceElement == null) {
            stackTraceElement = new StackTraceElement("PitayaCore", "Unknown method", "", 0);
        }
        Thread LLLLIIIILLL2 = C16880lQ.LLLLIIIILLL();
        o.LJFF(LLLLIIIILLL2, "Thread.currentThread()");
        C64246PJi LJJIFFI = C64246PJi.LJJIFFI(stackTraceElement, "com.bytedance.pitaya.thirdpart.SDKMonitor.threadException", "RunTaskError", LLLLIIIILLL2.getName(), false, "EnsureNotReachHere", "pitaya_sdk_task_runtime_error");
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                o.LJFF(keys, "json.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    LJJIFFI.LJFF(next, jSONObject.optString(next));
                }
                LJJIFFI.LJFF("type", type);
            } catch (JSONException e) {
                PitayaLogger.LJ(e, null, 6);
            }
        }
        if (str2 != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str2);
                Iterator<String> keys2 = jSONObject2.keys();
                o.LJFF(keys2, "json.keys()");
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    LJJIFFI.LIZIZ(next2, jSONObject2.optString(next2));
                }
            } catch (JSONException e2) {
                PitayaLogger.LJ(e2, null, 6);
            }
        }
        C64241PJd.LIZIZ(LJJIFFI);
    }

    @Override // com.bytedance.pitaya.thirdcomponent.monitor.Monitor
    public void init(PTYSetupInfo setupInfo, String pitayaAID, String sdkVer, Context context, String isOverSea, String str, String str2) {
        String str3;
        o.LJIIJ(setupInfo, "setupInfo");
        o.LJIIJ(pitayaAID, "pitayaAID");
        o.LJIIJ(sdkVer, "sdkVer");
        o.LJIIJ(context, "context");
        o.LJIIJ(isOverSea, "isOverSea");
        SDKMonitorUtils.LIZLLL(pitayaAID, C47261Igj.LJJIJ(str));
        SDKMonitorUtils.LJ(pitayaAID, C47261Igj.LJJIJ(str2));
        JSONObject jSONObject = new JSONObject();
        PTYDIDCallback didCallback = setupInfo.getDidCallback();
        if (didCallback != null) {
            str3 = didCallback.getDid();
        } else {
            str3 = null;
        }
        jSONObject.put("device_id", str3).put("host_aid", setupInfo.getAid()).put("channel", setupInfo.getChannel()).put("app_version", setupInfo.getAppVersion()).put("sdk_version", sdkVer);
        SDKMonitorUtils.LIZJ(context, pitayaAID, jSONObject, new C93327aP5(isOverSea, setupInfo, sdkVer));
        this.mMonitor = SDKMonitorUtils.LIZIZ(pitayaAID);
        this.si = setupInfo;
    }
}
