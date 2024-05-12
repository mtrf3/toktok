package com.bytedance.android.monitor.lynx.jsb;

import X.C03880Dg;
import X.C37692Eqm;
import X.C39540FfU;
import X.C39541FfV;
import X.C39544FfY;
import X.C65300Pk0;
import X.C70657RoD;
import X.InterfaceC37728ErM;
import android.content.Context;
import com.google.gson.Gson;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class LynxMonitorModule extends LynxModule {
    public static final C39540FfU Companion = new C39540FfU();
    public static final String NAME = "hybridMonitor";
    public final Gson gson;

    private final JSONObject convertJson(ReadableMap readableMap) {
        JSONObject jSONObject = null;
        if (readableMap == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject(this.gson.LJIILL(readableMap));
            return jSONObject;
        } catch (Throwable unused) {
            C70657RoD.LJIILL();
            return jSONObject;
        }
    }

    private final C39541FfV getError(ReadableMap readableMap) {
        C39541FfV c39541FfV = new C39541FfV();
        try {
            String.valueOf(convertJson(readableMap));
            return c39541FfV;
        } catch (Exception unused) {
            C70657RoD.LJIILL();
            return c39541FfV;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxMonitorModule(Context context, Object param) {
        super(context, param);
        o.LJIIJ(context, "context");
        o.LJIIJ(param, "param");
        this.gson = new Gson();
    }

    @InterfaceC37728ErM
    public final void customReport(ReadableMap readableMap, Callback callback) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {readableMap, callback};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", "-6147598271540149432");
        if (c03880Dg.LIZJ(300002, "com/bytedance/android/monitor/lynx/jsb/LynxMonitorModule", "customReport", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/bytedance/android/monitor/lynx/jsb/LynxMonitorModule", "customReport", null, objArr, this, c65300Pk0, false);
            return;
        }
        if (readableMap == null || this.mParam == null) {
            c03880Dg.LIZIZ(300002, "com/bytedance/android/monitor/lynx/jsb/LynxMonitorModule", "customReport", null, objArr, this, c65300Pk0, true);
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putInt("errorCode", -1);
        Object obj = this.mParam;
        if (obj instanceof C39544FfY) {
            if (obj != null) {
                javaOnlyMap.putString("errorMessage", "view is empty.");
            } else {
                C37692Eqm c37692Eqm = new C37692Eqm("null cannot be cast to non-null type com.bytedance.android.monitor.lynx.jsb.MonitorViewProvider");
                c03880Dg.LIZIZ(300002, "com/bytedance/android/monitor/lynx/jsb/LynxMonitorModule", "customReport", null, objArr, this, c65300Pk0, true);
                throw c37692Eqm;
            }
        } else {
            javaOnlyMap.putString("errorMessage", "mParam is not MonitorViewProvider.");
        }
        if (callback != null) {
            callback.invoke(javaOnlyMap);
        }
        c03880Dg.LIZIZ(300002, "com/bytedance/android/monitor/lynx/jsb/LynxMonitorModule", "customReport", null, objArr, this, c65300Pk0, true);
    }

    @InterfaceC37728ErM
    public final void reportJSError(ReadableMap readableMap, Callback callback) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {readableMap, callback};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", "-6147598271540149432");
        if (c03880Dg.LIZJ(300002, "com/bytedance/android/monitor/lynx/jsb/LynxMonitorModule", "reportJSError", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/bytedance/android/monitor/lynx/jsb/LynxMonitorModule", "reportJSError", null, objArr, this, c65300Pk0, false);
            return;
        }
        if (readableMap == null || this.mParam == null) {
            c03880Dg.LIZIZ(300002, "com/bytedance/android/monitor/lynx/jsb/LynxMonitorModule", "reportJSError", null, objArr, this, c65300Pk0, true);
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putInt("errorCode", -1);
        Object obj = this.mParam;
        if (!(obj instanceof C39544FfY) || obj != null) {
            if (callback != null) {
                callback.invoke(javaOnlyMap);
            }
            c03880Dg.LIZIZ(300002, "com/bytedance/android/monitor/lynx/jsb/LynxMonitorModule", "reportJSError", null, objArr, this, c65300Pk0, true);
        } else {
            C37692Eqm c37692Eqm = new C37692Eqm("null cannot be cast to non-null type com.bytedance.android.monitor.lynx.jsb.MonitorViewProvider");
            c03880Dg.LIZIZ(300002, "com/bytedance/android/monitor/lynx/jsb/LynxMonitorModule", "reportJSError", null, objArr, this, c65300Pk0, true);
            throw c37692Eqm;
        }
    }
}
