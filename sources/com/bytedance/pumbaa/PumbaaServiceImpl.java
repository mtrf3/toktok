package com.bytedance.pumbaa;

import X.C39491Feh;
import X.C58096Mr6;
import X.C65935PuF;
import X.C65983Pv1;
import X.C66226Pyw;
import X.C66227Pyx;
import X.C66229Pyz;
import X.C66231Pz1;
import X.C66237Pz7;
import X.C66243PzD;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC66259PzT;
import X.InterfaceC88472Yns;
import X.Q08;
import X.Q18;
import android.os.SystemClock;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.pumbaa.api.IPumbaaService;
import com.bytedance.pumbaa.base.ICommonService;
import com.bytedance.pumbaa.bpea.adapter.api.IBPEAPumbaaService;
import com.bytedance.pumbaa.common.interfaces.IAppLog;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import com.bytedance.pumbaa.common.interfaces.IExceptionMonitor;
import com.bytedance.pumbaa.common.interfaces.ILogger;
import com.bytedance.pumbaa.common.interfaces.IStore;
import com.bytedance.pumbaa.hybrid.api.IHybridService;
import com.bytedance.pumbaa.monitor.adapter.api.IMonitorService;
import com.bytedance.pumbaa.network.adapter.api.INetworkService;
import com.bytedance.pumbaa.pdp.PolicyDecisionImp;
import com.bytedance.pumbaa.pdp.adapter.api.IPDPPumbaaService;
import com.bytedance.pumbaa.pdp.api.IPolicyDecision;
import com.bytedance.pumbaa.ruler.adapter.RuleEngineServiceImpl;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import com.google.gson.m;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PumbaaServiceImpl implements IPumbaaService {
    public C66231Pz1 LIZ;
    public C66227Pyx LIZIZ;
    public C66243PzD LIZJ;

    public static IPumbaaService LJIILIIL() {
        Object LIZ = C58096Mr6.LIZ(IPumbaaService.class, false);
        if (LIZ != null) {
            return (IPumbaaService) LIZ;
        }
        if (C58096Mr6.LJJIIZI == null) {
            synchronized (IPumbaaService.class) {
                if (C58096Mr6.LJJIIZI == null) {
                    C58096Mr6.LJJIIZI = new PumbaaServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJIIZI;
    }

    @Override // com.bytedance.pumbaa.base.ICommonService
    public final void updateSettings() {
        Set<ICommonService> services = ServiceManager.get().getServices(ICommonService.class);
        o.LJIIIIZZ(services, "ServiceManager.get().get…ommonService::class.java)");
        for (ICommonService iCommonService : services) {
            if (!(iCommonService instanceof PumbaaServiceImpl)) {
                iCommonService.updateSettings();
            }
        }
    }

    @Override // com.bytedance.pumbaa.base.ICommonService
    /* renamed from: LJIILJJIL, reason: merged with bridge method [inline-methods] */
    public final void init(C65935PuF c65935PuF, C66231Pz1 proxy, C66227Pyx c66227Pyx, C66243PzD c66243PzD) {
        C66226Pyw c66226Pyw;
        C66226Pyw c66226Pyw2;
        InterfaceC65784Pro<SettingsModel> interfaceC65784Pro;
        C66226Pyw c66226Pyw3;
        Q18 q18;
        InterfaceC65784Pro<C65983Pv1> interfaceC65784Pro2;
        C66226Pyw c66226Pyw4;
        InterfaceC66259PzT interfaceC66259PzT;
        InterfaceC65784Pro<m> interfaceC65784Pro3;
        InterfaceC65784Pro<m> interfaceC65784Pro4;
        C66226Pyw c66226Pyw5;
        C66226Pyw c66226Pyw6;
        InterfaceC65784Pro<C39491Feh> interfaceC65784Pro5;
        o.LJIIIZ(proxy, "proxy");
        SystemClock.elapsedRealtimeNanos();
        this.LIZIZ = c66227Pyx;
        this.LIZJ = c66243PzD;
        C66226Pyw c66226Pyw7 = proxy.LJLIL;
        ILogger iLogger = c66226Pyw7.LJLLLLLL;
        if (iLogger == null) {
            iLogger = (ILogger) ServiceManager.get().getService(ILogger.class);
        }
        IAppLog iAppLog = c66226Pyw7.LJLZ;
        if (iAppLog == null) {
            iAppLog = (IAppLog) ServiceManager.get().getService(IAppLog.class);
        }
        IEventMonitor iEventMonitor = c66226Pyw7.LJZ;
        if (iEventMonitor == null) {
            iEventMonitor = (IEventMonitor) ServiceManager.get().getService(IEventMonitor.class);
        }
        IStore iStore = c66226Pyw7.LJZI;
        if (iStore == null) {
            iStore = (IStore) ServiceManager.get().getService(IStore.class);
        }
        IExceptionMonitor iExceptionMonitor = c66226Pyw7.LJZL;
        if (iExceptionMonitor == null) {
            iExceptionMonitor = (IExceptionMonitor) ServiceManager.get().getService(IExceptionMonitor.class);
        }
        Object obj = c66226Pyw7.LL;
        if (obj == null) {
            obj = RuleEngineServiceImpl.LJIILIIL();
        }
        IPolicyDecision LIZJ = PolicyDecisionImp.LIZJ();
        InterfaceC65784Pro<String> deviceIdGetter = c66226Pyw7.LJLIL;
        InterfaceC65784Pro<String> userIdGetter = c66226Pyw7.LJLILLLLZI;
        InterfaceC65784Pro<String> userRegionGetter = c66226Pyw7.LJLJI;
        InterfaceC65784Pro<String> currentRegionGetter = c66226Pyw7.LJLJJI;
        InterfaceC65784Pro<String> regionSourceGetter = c66226Pyw7.LJLJJL;
        InterfaceC65784Pro<Long> currentTimeMillisGetter = c66226Pyw7.LJLJJLL;
        InterfaceC65784Pro<Long> usedTime = c66226Pyw7.LJLJL;
        Map<String, InterfaceC65784Pro<Boolean>> sceneStatusGetter = c66226Pyw7.LJLJLJ;
        InterfaceC65784Pro<String> interfaceC65784Pro6 = c66226Pyw7.LJLJLLL;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro7 = c66226Pyw7.LJLL;
        String domainListVersion = c66226Pyw7.LJLLI;
        InterfaceC65784Pro<Set<String>> interfaceC65784Pro8 = c66226Pyw7.LJLLILLLL;
        InterfaceC65784Pro<Set<String>> interfaceC65784Pro9 = c66226Pyw7.LJLLJ;
        InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns = c66226Pyw7.LJLLL;
        InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns2 = c66226Pyw7.LJLLLL;
        o.LJIIIZ(deviceIdGetter, "deviceIdGetter");
        o.LJIIIZ(userIdGetter, "userIdGetter");
        o.LJIIIZ(userRegionGetter, "userRegionGetter");
        o.LJIIIZ(currentRegionGetter, "currentRegionGetter");
        o.LJIIIZ(regionSourceGetter, "regionSourceGetter");
        o.LJIIIZ(currentTimeMillisGetter, "currentTimeMillisGetter");
        o.LJIIIZ(usedTime, "usedTime");
        o.LJIIIZ(sceneStatusGetter, "sceneStatusGetter");
        o.LJIIIZ(domainListVersion, "domainListVersion");
        C66226Pyw c66226Pyw8 = new C66226Pyw(deviceIdGetter, userIdGetter, userRegionGetter, currentRegionGetter, regionSourceGetter, currentTimeMillisGetter, usedTime, sceneStatusGetter, interfaceC65784Pro6, interfaceC65784Pro7, domainListVersion, interfaceC65784Pro8, interfaceC65784Pro9, interfaceC88472Yns, interfaceC88472Yns2, iLogger, iAppLog, iEventMonitor, iStore, iExceptionMonitor, obj, LIZJ);
        Q18 ruleEngineProxy = proxy.LJLILLLLZI;
        InterfaceC66259PzT bpeaProxy = proxy.LJLJI;
        o.LJIIIZ(ruleEngineProxy, "ruleEngineProxy");
        o.LJIIIZ(bpeaProxy, "bpeaProxy");
        this.LIZ = new C66231Pz1(c66226Pyw8, ruleEngineProxy, bpeaProxy);
        SystemClock.elapsedRealtimeNanos();
        Set<ICommonService> services = ServiceManager.get().getServices(ICommonService.class);
        o.LJIIIIZZ(services, "ServiceManager.get().get…ommonService::class.java)");
        for (ICommonService iCommonService : services) {
            Object obj2 = null;
            if (iCommonService instanceof IMonitorService) {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                C66231Pz1 c66231Pz1 = this.LIZ;
                if (c66231Pz1 != null) {
                    c66226Pyw = c66231Pz1.LJLIL;
                } else {
                    c66226Pyw = null;
                }
                o.LJI(c66226Pyw);
                C66227Pyx c66227Pyx2 = this.LIZIZ;
                if (c66227Pyx2 != null) {
                    obj2 = c66227Pyx2.LJLIL;
                }
                iCommonService.init(c65935PuF, c66226Pyw, obj2, new C66229Pyz(elapsedRealtimeNanos, this));
                SystemClock.elapsedRealtimeNanos();
            } else if (iCommonService instanceof INetworkService) {
                SystemClock.elapsedRealtimeNanos();
                C66231Pz1 c66231Pz12 = this.LIZ;
                if (c66231Pz12 != null) {
                    c66226Pyw2 = c66231Pz12.LJLIL;
                } else {
                    c66226Pyw2 = null;
                }
                o.LJI(c66226Pyw2);
                C66227Pyx c66227Pyx3 = this.LIZIZ;
                if (c66227Pyx3 != null) {
                    interfaceC65784Pro = c66227Pyx3.LJLIL;
                } else {
                    interfaceC65784Pro = null;
                }
                C66243PzD c66243PzD2 = this.LIZJ;
                if (c66243PzD2 != null) {
                    obj2 = c66243PzD2.LJLILLLLZI;
                }
                iCommonService.init(c65935PuF, c66226Pyw2, interfaceC65784Pro, obj2);
                SystemClock.elapsedRealtimeNanos();
            } else if (iCommonService instanceof IRuleEngineService) {
                SystemClock.elapsedRealtimeNanos();
                C66231Pz1 c66231Pz13 = this.LIZ;
                if (c66231Pz13 != null) {
                    c66226Pyw3 = c66231Pz13.LJLIL;
                    q18 = c66231Pz13.LJLILLLLZI;
                } else {
                    c66226Pyw3 = null;
                    q18 = null;
                }
                Q08 q08 = new Q08(c66226Pyw3, q18);
                C66227Pyx c66227Pyx4 = this.LIZIZ;
                if (c66227Pyx4 != null) {
                    interfaceC65784Pro2 = c66227Pyx4.LJLILLLLZI;
                } else {
                    interfaceC65784Pro2 = null;
                }
                iCommonService.init(c65935PuF, q08, interfaceC65784Pro2, null);
                SystemClock.elapsedRealtimeNanos();
            } else if (iCommonService instanceof IBPEAPumbaaService) {
                SystemClock.elapsedRealtimeNanos();
                C66231Pz1 c66231Pz14 = this.LIZ;
                if (c66231Pz14 != null) {
                    c66226Pyw4 = c66231Pz14.LJLIL;
                    interfaceC66259PzT = c66231Pz14.LJLJI;
                } else {
                    c66226Pyw4 = null;
                    interfaceC66259PzT = null;
                }
                Q08 q082 = new Q08(c66226Pyw4, interfaceC66259PzT);
                C66227Pyx c66227Pyx5 = this.LIZIZ;
                if (c66227Pyx5 != null) {
                    interfaceC65784Pro3 = c66227Pyx5.LJLJJL;
                    interfaceC65784Pro4 = c66227Pyx5.LJLJI;
                } else {
                    interfaceC65784Pro3 = null;
                    interfaceC65784Pro4 = null;
                }
                iCommonService.init(c65935PuF, q082, new Q08(interfaceC65784Pro3, interfaceC65784Pro4), null);
                SystemClock.elapsedRealtimeNanos();
            } else if (iCommonService instanceof IPDPPumbaaService) {
                SystemClock.elapsedRealtimeNanos();
                C66231Pz1 c66231Pz15 = this.LIZ;
                if (c66231Pz15 != null) {
                    c66226Pyw5 = c66231Pz15.LJLIL;
                } else {
                    c66226Pyw5 = null;
                }
                o.LJI(c66226Pyw5);
                iCommonService.init(c65935PuF, c66226Pyw5, C66237Pz7.LJLIL, null);
                SystemClock.elapsedRealtimeNanos();
            } else if (iCommonService instanceof IHybridService) {
                SystemClock.elapsedRealtimeNanos();
                C66231Pz1 c66231Pz16 = this.LIZ;
                if (c66231Pz16 != null && (c66226Pyw6 = c66231Pz16.LJLIL) != null) {
                    C66227Pyx c66227Pyx6 = this.LIZIZ;
                    if (c66227Pyx6 != null) {
                        interfaceC65784Pro5 = c66227Pyx6.LJLJJI;
                    } else {
                        interfaceC65784Pro5 = null;
                    }
                    iCommonService.init(c65935PuF, c66226Pyw6, interfaceC65784Pro5, null);
                    SystemClock.elapsedRealtimeNanos();
                }
            }
        }
        SystemClock.elapsedRealtimeNanos();
    }
}
