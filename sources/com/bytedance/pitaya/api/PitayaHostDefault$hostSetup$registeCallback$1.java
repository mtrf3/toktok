package com.bytedance.pitaya.api;

import X.C113554cx;
import X.C93258aNy;
import X.OSZ;
import com.bytedance.pitaya.api.bean.PTYApplogEvent;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.inner.api.bean.SetupInfo;
import com.bytedance.pitaya.jniwrapper.PitayaNativeInstance;
import com.bytedance.pitaya.log.PitayaLogger;
import com.bytedance.pitaya.thirdcomponent.crash.CrashExtraInfoCallback;
import com.bytedance.pitaya.thirdcomponent.crash.CrashInfoCollector;
import com.bytedance.pitaya.thirdcomponent.stddelegate.CallbackRegister;
import com.bytedance.pitaya.thirdcomponent.stddelegate.PitayaInnerServiceProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class PitayaHostDefault$hostSetup$registeCallback$1 implements PTYSetupCallback {
    public final /* synthetic */ PTYSetupCallback $callback;
    public final /* synthetic */ SetupInfo $setupInfo;
    public final /* synthetic */ C93258aNy this$0;

    @Override // com.bytedance.pitaya.api.PTYSetupCallback
    public void onResult(boolean z, PTYError pTYError) {
        if (z) {
            this.this$0.LJII = true;
            PitayaProxy.processApplogCache(new PTYApplogImplCallback() { // from class: com.bytedance.pitaya.api.PitayaHostDefault$hostSetup$registeCallback$1$onResult$appLogEventProxyCallback$1
                @Override // com.bytedance.pitaya.api.PTYApplogImplCallback
                public void onEvent(PTYApplogEvent event) {
                    o.LJIIJ(event, "event");
                    PitayaHostDefault$hostSetup$registeCallback$1.this.this$0.LIZIZ(event, false);
                }
            });
        }
        CrashExtraInfoCallback crashExtraInfoCallback = new CrashExtraInfoCallback() { // from class: com.bytedance.pitaya.api.PitayaHostDefault$hostSetup$registeCallback$1$onResult$infoCollect$1
            @Override // com.bytedance.pitaya.thirdcomponent.crash.CrashExtraInfoCallback
            public Map<String, String> getCrashExtraInfo() {
                String str;
                String str2;
                String str3;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str4 = null;
                try {
                    str = PitayaNativeInstance.nativeGetRecentRunPackages();
                } catch (UnsatisfiedLinkError e) {
                    PitayaLogger.LJ(e, null, 6);
                    str = null;
                }
                if (str != null) {
                    linkedHashMap.put("pitaya_recent_run_pack", str);
                }
                try {
                    str2 = PitayaNativeInstance.nativeGetExecutorsStack();
                } catch (UnsatisfiedLinkError e2) {
                    PitayaLogger.LJ(e2, null, 6);
                    str2 = null;
                }
                if (str2 != null) {
                    linkedHashMap.put("pitaya_executor_stack", str2);
                }
                try {
                    str3 = PitayaNativeInstance.nativeGetExecutorsCrashInfo();
                } catch (UnsatisfiedLinkError e3) {
                    PitayaLogger.LJ(e3, null, 6);
                    str3 = null;
                }
                if (str3 != null) {
                    linkedHashMap.put("pitaya_executor_crash_info", str3);
                }
                try {
                    str4 = PitayaNativeInstance.nativeGetExecutorsFatalErrorMsg();
                } catch (UnsatisfiedLinkError e4) {
                    PitayaLogger.LJ(e4, str4, 6);
                }
                if (str4 != null) {
                    linkedHashMap.put("pitaya_executor_fatal", str4);
                }
                linkedHashMap.put("pitaya_sdk_build_ver", "2.8.0.i18ntob-rc.58");
                PitayaLogger.LIZ("PitayaInstance", "getUserData: " + linkedHashMap);
                return linkedHashMap;
            }
        };
        CallbackRegister callbackRegister = (CallbackRegister) PitayaInnerServiceProvider.getService(CrashInfoCollector.class);
        if (callbackRegister != null) {
            callbackRegister.registerCallback(0, crashExtraInfoCallback);
        }
        CallbackRegister callbackRegister2 = (CallbackRegister) PitayaInnerServiceProvider.getService(CrashInfoCollector.class);
        if (callbackRegister2 != null) {
            callbackRegister2.registerCallback(1, crashExtraInfoCallback);
        }
        CrashInfoCollector crashInfoCollector = (CrashInfoCollector) PitayaInnerServiceProvider.getService(CrashInfoCollector.class);
        if (crashInfoCollector != null) {
            crashInfoCollector.addCustomTags(C113554cx.LJJL(new OSZ("pitaya_plugin_version", this.$setupInfo.getPluginVersion()), new OSZ("pitaya_sdk_build_ver", "2.8.0.i18ntob-rc.58")));
        }
        PTYSetupCallback pTYSetupCallback = this.$callback;
        if (pTYSetupCallback != null) {
            pTYSetupCallback.onResult(z, pTYError);
        }
    }

    public PitayaHostDefault$hostSetup$registeCallback$1(C93258aNy c93258aNy, SetupInfo setupInfo, PTYSetupCallback pTYSetupCallback) {
        this.this$0 = c93258aNy;
        this.$setupInfo = setupInfo;
        this.$callback = pTYSetupCallback;
    }
}
