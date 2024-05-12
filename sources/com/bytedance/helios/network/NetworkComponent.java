package com.bytedance.helios.network;

import X.C113554cx;
import X.C221108m2;
import X.C25620zW;
import X.C39645FhB;
import X.C5H3;
import X.C64401PPh;
import X.C64483PSl;
import X.C65852Psu;
import X.C65911Ptr;
import X.C65919Ptz;
import X.C65921Pu1;
import X.C65924Pu4;
import X.C65926Pu6;
import X.C65933PuD;
import X.C65935PuF;
import X.C65944PuO;
import X.C65945PuP;
import X.C65946PuQ;
import X.C65947PuR;
import X.C65948PuS;
import X.C66059PwF;
import X.C66226Pyw;
import X.ExecutorC64417PPx;
import X.HandlerThreadC64418PPy;
import X.HandlerThreadC65936PuG;
import X.InterfaceC65784Pro;
import X.InterfaceC65941PuL;
import X.InterfaceC65943PuN;
import X.InterfaceC65954PuY;
import X.ORZ;
import X.OSZ;
import X.PZP;
import X.RunnableC65927Pu7;
import X.X1D;
import android.app.Application;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.config.ShutdownConfig;
import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.helios.network.api.service.IAppLogService;
import com.bytedance.helios.network.api.service.IFrescoService;
import com.bytedance.helios.network.api.service.INetworkApiService;
import com.bytedance.helios.network.api.service.IOkHttpService;
import com.bytedance.helios.network.api.service.ISkynetService;
import com.bytedance.helios.network.api.service.ITTNetService;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import com.bytedance.pumbaa.common.interfaces.IExceptionMonitor;
import com.bytedance.pumbaa.common.interfaces.IStore;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class NetworkComponent {
    public static C65935PuF appInfo;
    public static C66226Pyw commonProxy;
    public static IEventMonitor eventMonitor;
    public static IExceptionMonitor exceptionMonitor;
    public static IRuleEngineService ruleEngine;
    public static SettingsModel settings;
    public static InterfaceC65784Pro<SettingsModel> settingsGetter;
    public static IStore store;
    public static final NetworkComponent INSTANCE = new NetworkComponent();
    public static final long initTime = System.currentTimeMillis();
    public static PZP urlConnectionService = new PZP();
    public static final C5H3 ttNetService$delegate = C221108m2.LIZIZ(C65948PuS.LJLIL);
    public static final C5H3 okHttpService$delegate = C221108m2.LIZIZ(C65946PuQ.LJLIL);
    public static final C5H3 appLogService$delegate = C221108m2.LIZIZ(C65944PuO.LJLIL);
    public static final C5H3 frescoService$delegate = C221108m2.LIZIZ(C65945PuP.LJLIL);
    public static final C5H3 skynetService$delegate = C221108m2.LIZIZ(C65947PuR.LJLIL);

    public final IAppLogService getAppLogService() {
        return (IAppLogService) appLogService$delegate.getValue();
    }

    public final IFrescoService getFrescoService() {
        return (IFrescoService) frescoService$delegate.getValue();
    }

    public final IOkHttpService getOkHttpService() {
        return (IOkHttpService) okHttpService$delegate.getValue();
    }

    public final ISkynetService getSkynetService() {
        return (ISkynetService) skynetService$delegate.getValue();
    }

    public final ITTNetService getTtNetService() {
        return (ITTNetService) ttNetService$delegate.getValue();
    }

    public final boolean isNetworkEnabled() {
        NetworkConfig networkConfig;
        SettingsModel settingsModel = settings;
        if (settingsModel != null && (networkConfig = settingsModel.networkConfig) != null && networkConfig.enabled) {
            return true;
        }
        return false;
    }

    public final boolean isOffLineEnv() {
        List<String> list;
        String str;
        C65935PuF c65935PuF = appInfo;
        if (c65935PuF == null || !c65935PuF.LJLJJL) {
            SettingsModel settingsModel = settings;
            if (settingsModel == null || (list = settingsModel.testEnvChannels) == null) {
                return false;
            }
            if (c65935PuF != null) {
                str = c65935PuF.LJLJJI;
            } else {
                str = null;
            }
            if (!ORZ.LJLJJI(str, list)) {
                return false;
            }
        }
        return true;
    }

    public final void updateSettings() {
        String str;
        SettingsModel settingsModel;
        String str2;
        SettingsModel settingsModel2 = settings;
        String str3 = null;
        if (settingsModel2 != null) {
            str = settingsModel2.version;
        } else {
            str = null;
        }
        InterfaceC65784Pro<SettingsModel> interfaceC65784Pro = settingsGetter;
        if (interfaceC65784Pro != null) {
            settingsModel = interfaceC65784Pro.invoke();
        } else {
            settingsModel = null;
        }
        settings = settingsModel;
        if (settingsModel != null) {
            str2 = settingsModel.version;
        } else {
            str2 = null;
        }
        if (!o.LJ(str, str2)) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("updateSettings from ", str, " -> ");
            SettingsModel settingsModel3 = settings;
            if (settingsModel3 != null) {
                str3 = settingsModel3.version;
            }
            LIZIZ.append(str3);
            X1D.LIZIZ(LIZIZ);
            HandlerThreadC64418PPy.LIZ();
            HandlerThreadC64418PPy.LJLJI.LIZIZ(RunnableC65927Pu7.LJLIL);
        }
    }

    public final C65935PuF getAppInfo() {
        return appInfo;
    }

    public final C66226Pyw getCommonProxy() {
        return commonProxy;
    }

    public final IEventMonitor getEventMonitor() {
        return eventMonitor;
    }

    public final IExceptionMonitor getExceptionMonitor() {
        return exceptionMonitor;
    }

    public final long getInitTime() {
        return initTime;
    }

    public final IRuleEngineService getRuleEngine() {
        return ruleEngine;
    }

    public final SettingsModel getSettings() {
        return settings;
    }

    public final InterfaceC65784Pro<SettingsModel> getSettingsGetter() {
        return settingsGetter;
    }

    public final IStore getStore() {
        return store;
    }

    public final PZP getUrlConnectionService() {
        return urlConnectionService;
    }

    public final INetworkApiService selectService(int i) {
        switch (i) {
            case 400000:
            case 400001:
                return urlConnectionService;
            case 400101:
            case 400102:
            case 400103:
                return getOkHttpService();
            case 400203:
            case 400204:
            case 400205:
                return getTtNetService();
            default:
                return null;
        }
    }

    public final void setAppInfo(C65935PuF c65935PuF) {
        appInfo = c65935PuF;
    }

    public final void setCommonProxy(C66226Pyw c66226Pyw) {
        commonProxy = c66226Pyw;
    }

    public final void setEventMonitor(IEventMonitor iEventMonitor) {
        eventMonitor = iEventMonitor;
    }

    public final void setExceptionMonitor(IExceptionMonitor iExceptionMonitor) {
        exceptionMonitor = iExceptionMonitor;
    }

    public final void setRuleEngine(IRuleEngineService iRuleEngineService) {
        ruleEngine = iRuleEngineService;
    }

    public final void setSettings(SettingsModel settingsModel) {
        settings = settingsModel;
    }

    public final void setSettingsGetter(InterfaceC65784Pro<SettingsModel> interfaceC65784Pro) {
        settingsGetter = interfaceC65784Pro;
    }

    public final void setStore(IStore iStore) {
        store = iStore;
    }

    public final void setUrlConnectionService(PZP pzp) {
        urlConnectionService = pzp;
    }

    public final void switchEventHandler(InterfaceC65943PuN handler, boolean z) {
        o.LJIIIZ(handler, "handler");
        C65924Pu4.LIZJ.LIZIZ(handler, z);
    }

    public final void reportException(String str, String str2, Throwable th) {
        OSZ[] oszArr = new OSZ[1];
        if (str2 == null) {
            str2 = "null";
        }
        oszArr[0] = new OSZ("message", str2);
        C66059PwF.LIZIZ(new C65852Psu((Thread) null, th, str, C113554cx.LJJLIIIIJ(oszArr), 1));
    }

    public final void init(C65935PuF appInfo2, C66226Pyw c66226Pyw, InterfaceC65784Pro<SettingsModel> interfaceC65784Pro, InterfaceC65954PuY interfaceC65954PuY, boolean z) {
        IEventMonitor iEventMonitor;
        Object obj;
        IExceptionMonitor iExceptionMonitor;
        IStore iStore;
        SettingsModel settingsModel;
        ShutdownConfig shutdownConfig;
        String str;
        SettingsModel invoke;
        NetworkConfig networkConfig;
        o.LJIIIZ(appInfo2, "appInfo");
        appInfo = appInfo2;
        commonProxy = c66226Pyw;
        settingsGetter = interfaceC65784Pro;
        if (c66226Pyw != null) {
            iEventMonitor = c66226Pyw.LJZ;
        } else {
            iEventMonitor = null;
        }
        eventMonitor = iEventMonitor;
        if (c66226Pyw != null) {
            obj = c66226Pyw.LL;
        } else {
            obj = null;
        }
        ruleEngine = (IRuleEngineService) obj;
        if (c66226Pyw != null) {
            iExceptionMonitor = c66226Pyw.LJZL;
        } else {
            iExceptionMonitor = null;
        }
        exceptionMonitor = iExceptionMonitor;
        if (c66226Pyw != null) {
            iStore = c66226Pyw.LJZI;
        } else {
            iStore = null;
        }
        store = iStore;
        if (interfaceC65784Pro != null) {
            settingsModel = interfaceC65784Pro.invoke();
        } else {
            settingsModel = null;
        }
        settings = settingsModel;
        HandlerThreadC64418PPy.LIZ();
        HandlerThreadC64418PPy handlerThreadC64418PPy = HandlerThreadC64418PPy.LJLJI;
        o.LJIIIIZZ(handlerThreadC64418PPy, "MonitorThread.get()");
        C64483PSl c64483PSl = C64483PSl.LIZ;
        handlerThreadC64418PPy.setUncaughtExceptionHandler(c64483PSl);
        HandlerThreadC65936PuG.LIZ();
        HandlerThreadC65936PuG handlerThreadC65936PuG = HandlerThreadC65936PuG.LJLIL;
        o.LJIIIIZZ(handlerThreadC65936PuG, "WorkerThread.get()");
        handlerThreadC65936PuG.setUncaughtExceptionHandler(c64483PSl);
        C39645FhB.LIZ();
        IAppLogService appLogService = getAppLogService();
        if (appLogService != null) {
            appLogService.addInterceptor(null);
        }
        ISkynetService skynetService = getSkynetService();
        if (skynetService != null) {
            skynetService.initDNSControl(appInfo2.LJLIL);
        }
        C65924Pu4 c65924Pu4 = C65924Pu4.LIZJ;
        c65924Pu4.LIZIZ(C65919Ptz.LIZ, true);
        c65924Pu4.LIZIZ(C65911Ptr.LIZ, true);
        Application application = appInfo2.LJLIL;
        HandlerThreadC64418PPy.LIZ();
        ExecutorC64417PPx executorC64417PPx = HandlerThreadC64418PPy.LJLJJL;
        o.LJIIIIZZ(executorC64417PPx, "MonitorThread.getExecutor()");
        C64401PPh.LIZIZ(application, executorC64417PPx, z);
        C65926Pu6.LIZIZ = isOffLineEnv();
        C65933PuD c65933PuD = new C65933PuD();
        CopyOnWriteArrayList<InterfaceC65941PuL> copyOnWriteArrayList = C65926Pu6.LIZ;
        if (!copyOnWriteArrayList.contains(c65933PuD)) {
            copyOnWriteArrayList.add(c65933PuD);
        }
        if (c66226Pyw != null) {
            if (interfaceC65784Pro == null || (invoke = interfaceC65784Pro.invoke()) == null || (networkConfig = invoke.networkConfig) == null || (shutdownConfig = networkConfig.shutdownConfig) == null) {
                shutdownConfig = new ShutdownConfig(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, null, null, null, null, false, false, false, 2047, null);
            }
            long nanoTime = System.nanoTime();
            C65921Pu1.LIZIZ(c66226Pyw, shutdownConfig);
            long nanoTime2 = System.nanoTime();
            C65921Pu1.LIZ = c66226Pyw.LJLLI;
            SettingsModel settings2 = INSTANCE.getSettings();
            if (settings2 == null || (str = settings2.version) == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            C65921Pu1.LIZIZ = str;
            C65921Pu1.LJI.set(true);
            ApmEvent apmEvent = new ApmEvent("sky_eye_apm_log");
            apmEvent.LIZ("MethodTimeCost_us", "EventName");
            apmEvent.mMetrics.put("initDomainAllowList", Float.valueOf(((float) (nanoTime2 - nanoTime)) / 1000));
            C66059PwF.LIZIZ(apmEvent);
        }
        if (interfaceC65954PuY != null) {
            interfaceC65954PuY.LIZ();
        }
    }

    public static /* synthetic */ void init$default(NetworkComponent networkComponent, C65935PuF c65935PuF, C66226Pyw c66226Pyw, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65954PuY interfaceC65954PuY, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        networkComponent.init(c65935PuF, c66226Pyw, interfaceC65784Pro, interfaceC65954PuY, z);
    }
}
