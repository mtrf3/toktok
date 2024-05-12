package com.bytedance.pumbaa.hybrid.impl;

import X.C38243Ezf;
import X.C39486Fec;
import X.C39488Fee;
import X.C39491Feh;
import X.C39504Feu;
import X.C39506Few;
import X.C58096Mr6;
import X.C65935PuF;
import X.C66199PyV;
import X.C66226Pyw;
import X.EXK;
import X.InterfaceC65784Pro;
import X.InterfaceC66203PyZ;
import com.bytedance.pumbaa.common.interfaces.ILogger;
import com.bytedance.pumbaa.hybrid.api.IHybridService;
import com.bytedance.pumbaa.hybrid.base.NavigationConfig;
import com.bytedance.pumbaa.hybrid.impl.jsb.BridgeHookDispatcher;
import com.bytedance.pumbaa.hybrid.monitor.HybridMonitorServiceImpl;
import com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorService;
import com.bytedance.pumbaa.hybrid.rasp.RaspServiceImpl;
import com.bytedance.pumbaa.hybrid.rasp.api.IRaspService;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class HybridServiceImpl implements IHybridService {
    public InterfaceC65784Pro<C39491Feh> LIZ;

    public static IHybridService LJIILIIL() {
        Object LIZ = C58096Mr6.LIZ(IHybridService.class, false);
        if (LIZ != null) {
            return (IHybridService) LIZ;
        }
        if (C58096Mr6.LJJIJIIJI == null) {
            synchronized (IHybridService.class) {
                if (C58096Mr6.LJJIJIIJI == null) {
                    C58096Mr6.LJJIJIIJI = new HybridServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJIJIIJI;
    }

    @Override // com.bytedance.pumbaa.base.ICommonService
    public final void updateSettings() {
        C39491Feh invoke;
        InterfaceC65784Pro<C39491Feh> interfaceC65784Pro = this.LIZ;
        if (interfaceC65784Pro != null && (invoke = interfaceC65784Pro.invoke()) != null) {
            NavigationConfig config = invoke.LJLIL;
            o.LJIIIZ(config, "config");
            config.LJLIL = C39506Few.LJLIL;
            C39488Fee.LIZIZ = config;
            BridgeHookDispatcher.INSTANCE.updateSettings(invoke.LJLILLLLZI);
            IHybridMonitorService LJIIIIZZ = HybridMonitorServiceImpl.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                LJIIIIZZ.LJFF(invoke);
            }
            IRaspService LJIIIIZZ2 = RaspServiceImpl.LJIIIIZZ();
            if (LJIIIIZZ2 != null) {
                LJIIIIZZ2.LJFF(invoke);
            }
        }
    }

    @Override // com.bytedance.pumbaa.hybrid.api.IHybridService
    public final void LJI(C38243Ezf c38243Ezf) {
        BridgeHookDispatcher.INSTANCE.registerBridgeInterceptor(c38243Ezf);
    }

    @Override // com.bytedance.pumbaa.base.ICommonService
    public final void init(C65935PuF c65935PuF, Object obj, Object obj2, Object obj3) {
        C39491Feh invoke;
        C66226Pyw c66226Pyw = (C66226Pyw) obj;
        InterfaceC65784Pro<C39491Feh> interfaceC65784Pro = (InterfaceC65784Pro) obj2;
        this.LIZ = interfaceC65784Pro;
        if (interfaceC65784Pro != null && (invoke = interfaceC65784Pro.invoke()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            IRaspService LJIIIIZZ = RaspServiceImpl.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                LJIIIIZZ.LIZIZ(c66226Pyw, invoke);
                arrayList2.add(LJIIIIZZ.LIZJ());
                arrayList.add(LJIIIIZZ.LIZLLL());
            }
            IHybridMonitorService LJIIIIZZ2 = HybridMonitorServiceImpl.LJIIIIZZ();
            if (LJIIIIZZ2 != null) {
                LJIIIIZZ2.LIZIZ(c66226Pyw, invoke);
                arrayList.add(LJIIIIZZ2.LIZLLL());
                arrayList2.add(LJIIIIZZ2.LIZJ());
            }
            if (!arrayList.isEmpty()) {
                ILogger iLogger = c66226Pyw.LJLLLLLL;
                NavigationConfig config = invoke.LJLIL;
                o.LJIIIZ(config, "config");
                ((ArrayList) C39488Fee.LIZJ).addAll(arrayList);
                C39504Feu c39504Feu = new C39504Feu();
                CopyOnWriteArrayList<InterfaceC66203PyZ> copyOnWriteArrayList = C66199PyV.LIZ;
                if (!copyOnWriteArrayList.contains(c39504Feu)) {
                    copyOnWriteArrayList.add(c39504Feu);
                }
                C39488Fee.LIZLLL = c39504Feu;
                config.LJLIL = C39506Few.LJLIL;
                C39488Fee.LIZIZ = config;
                C39488Fee.LIZ = iLogger;
                EXK.LIZJ(new C39486Fec());
            }
            if (!arrayList2.isEmpty()) {
                BridgeHookDispatcher.INSTANCE.init(c66226Pyw.LJLLLLLL, arrayList2, invoke.LJLILLLLZI);
            }
        }
    }
}
