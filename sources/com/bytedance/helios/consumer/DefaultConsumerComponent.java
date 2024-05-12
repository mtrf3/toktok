package com.bytedance.helios.consumer;

import X.C37651Eq7;
import X.C65956Pua;
import X.C65958Puc;
import X.C65992PvA;
import X.C65993PvB;
import X.C66030Pvm;
import X.C66031Pvn;
import X.C66043Pvz;
import X.C66059PwF;
import X.C66063PwJ;
import X.C66071PwR;
import X.C66119PxD;
import X.HandlerThreadC65936PuG;
import X.III;
import X.InterfaceC37650Eq6;
import X.InterfaceC65994PvC;
import X.InterfaceC66045Pw1;
import X.InterfaceC66049Pw5;
import X.InterfaceC66053Pw9;
import Y.ARunnableS47S0100000_11;
import android.app.Application;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class DefaultConsumerComponent implements InterfaceC66049Pw5 {
    public InterfaceC65994PvC exceptionMonitor;
    public InterfaceC37650Eq6 logger;
    public InterfaceC66053Pw9 ruleEngineImpl;
    public final C66119PxD npthConsumer = new C66119PxD();
    public final C65993PvB exceptionConsumer = new C65993PvB();
    public final C65956Pua apmConsumer = new C65956Pua();

    public final void enableDebugForOffline() {
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        if (heliosEnvImpl.LJFF()) {
            InterfaceC37650Eq6 interfaceC37650Eq6 = this.logger;
            if (interfaceC37650Eq6 != null) {
                interfaceC37650Eq6.LIZ();
            }
            InterfaceC65994PvC interfaceC65994PvC = this.exceptionMonitor;
            if (interfaceC65994PvC != null) {
                interfaceC65994PvC.LIZ();
            }
        }
    }

    private final void setEventMonitor(III monitor) {
        C65956Pua c65956Pua = this.apmConsumer;
        c65956Pua.getClass();
        o.LJIIIZ(monitor, "monitor");
        c65956Pua.LIZ = monitor;
    }

    private final void setExceptionMonitor(InterfaceC65994PvC monitor) {
        this.exceptionMonitor = monitor;
        C66119PxD c66119PxD = this.npthConsumer;
        c66119PxD.getClass();
        o.LJIIIZ(monitor, "monitor");
        c66119PxD.LIZ = monitor;
        C65993PvB c65993PvB = this.exceptionConsumer;
        c65993PvB.getClass();
        c65993PvB.LIZ = monitor;
    }

    private final void setLogger(InterfaceC37650Eq6 logger) {
        this.logger = logger;
        o.LJIIIZ(logger, "logger");
        C37651Eq7.LIZJ = logger;
    }

    @Override // X.InterfaceC66032Pvo
    public void onNewSettings(SettingsModel newSettings) {
        o.LJIIIZ(newSettings, "newSettings");
        C66043Pvz.LJFF.onNewSettings(newSettings);
    }

    @Override // X.InterfaceC66049Pw5
    public void init(Application application, InterfaceC66045Pw1 proxy, Map<String, Object> params) {
        o.LJIIIZ(application, "application");
        o.LJIIIZ(proxy, "proxy");
        o.LJIIIZ(params, "params");
        C66063PwJ.LIZIZ("HeliosService", "consumer component init");
        C66071PwR LIZJ = proxy.LIZJ();
        o.LJIIIIZZ(LIZJ, "proxy.loggerImpl");
        setLogger(LIZJ);
        C65992PvA LIZIZ = proxy.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "proxy.exceptionMonitorImpl");
        setExceptionMonitor(LIZIZ);
        C65958Puc LIZLLL = proxy.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "proxy.eventMonitorImpl");
        setEventMonitor(LIZLLL);
        C66059PwF c66059PwF = C66059PwF.LJ;
        c66059PwF.LIZ(this.npthConsumer);
        c66059PwF.LIZ(this.exceptionConsumer);
        c66059PwF.LIZ(this.apmConsumer);
        C66063PwJ.LIZ = C37651Eq7.LIZLLL;
        C66043Pvz c66043Pvz = C66043Pvz.LJFF;
        C66031Pvn LJFF = proxy.LJFF();
        o.LJIIIIZZ(LJFF, "proxy.dataProxy");
        c66043Pvz.onNewSettings(new C66030Pvm(LJFF).LIZ());
        enableDebugForOffline();
        HandlerThreadC65936PuG.LIZ();
        HandlerThreadC65936PuG.LJLILLLLZI.postDelayed(new ARunnableS47S0100000_11(this, 22), 10000L);
    }
}
