package com.bytedance.pumbaa.hybrid.monitor;

import X.C141335gf;
import X.C37191Eih;
import X.C38027EwB;
import X.C38028EwC;
import X.C38386F4s;
import X.C38995FSd;
import X.C39479FeV;
import X.C39481FeX;
import X.C39482FeY;
import X.C39485Feb;
import X.C39491Feh;
import X.C39493Fej;
import X.C3C5;
import X.C58096Mr6;
import X.C64402PPi;
import X.C64409PPp;
import X.C66226Pyw;
import X.C76800UCe;
import X.FSY;
import X.InterfaceC39487Fed;
import X.InterfaceC39517Ff7;
import X.InterfaceC65784Pro;
import X.X1D;
import android.content.Intent;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import com.bytedance.pumbaa.common.interfaces.ILogger;
import com.bytedance.pumbaa.hybrid.base.NavigationConfig;
import com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorService;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class HybridMonitorServiceImpl implements IHybridMonitorService {
    public C39491Feh LIZ;
    public C66226Pyw LIZIZ;
    public C39482FeY LIZJ;
    public C39485Feb LIZLLL;
    public C39493Fej LJ;
    public C39479FeV LJFF;

    public static IHybridMonitorService LJIIIIZZ() {
        Object LIZ = C58096Mr6.LIZ(IHybridMonitorService.class, false);
        if (LIZ != null) {
            return (IHybridMonitorService) LIZ;
        }
        if (C58096Mr6.LJJIJIIJIL == null) {
            synchronized (IHybridMonitorService.class) {
                if (C58096Mr6.LJJIJIIJIL == null) {
                    C58096Mr6.LJJIJIIJIL = new HybridMonitorServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJIJIIJIL;
    }

    @Override // X.InterfaceC39505Fev
    public final InterfaceC39517Ff7 LIZJ() {
        ILogger iLogger;
        IEventMonitor iEventMonitor;
        Map<String, InterfaceC65784Pro<Boolean>> map;
        Object obj;
        C39491Feh c39491Feh = this.LIZ;
        C66226Pyw c66226Pyw = this.LIZIZ;
        Object obj2 = null;
        if (c66226Pyw != null) {
            iLogger = c66226Pyw.LJLLLLLL;
            iEventMonitor = c66226Pyw.LJZ;
            map = c66226Pyw.LJLJLJ;
            obj = c66226Pyw.LL;
        } else {
            iLogger = null;
            iEventMonitor = null;
            map = null;
            obj = null;
        }
        if (obj instanceof IRuleEngineService) {
            obj2 = obj;
        }
        C38027EwB LIZ = C38028EwC.LIZ(FSY.FIXED);
        LIZ.LIZJ = 1;
        LIZ.LIZIZ = "hybrid_security_monitor_jsb";
        C39493Fej c39493Fej = new C39493Fej(c39491Feh, iLogger, iEventMonitor, map, (IRuleEngineService) obj2, C38995FSd.LIZ(LIZ.LIZ()));
        this.LJ = c39493Fej;
        return c39493Fej;
    }

    @Override // X.InterfaceC39505Fev
    public final InterfaceC39487Fed LIZLLL() {
        NavigationConfig navigationConfig;
        IEventMonitor iEventMonitor;
        Map<String, InterfaceC65784Pro<Boolean>> map;
        C39491Feh c39491Feh = this.LIZ;
        ILogger iLogger = null;
        if (c39491Feh != null) {
            navigationConfig = c39491Feh.LJLIL;
        } else {
            navigationConfig = null;
        }
        C66226Pyw c66226Pyw = this.LIZIZ;
        if (c66226Pyw != null) {
            iLogger = c66226Pyw.LJLLLLLL;
            iEventMonitor = c66226Pyw.LJZ;
            map = c66226Pyw.LJLJLJ;
        } else {
            iEventMonitor = null;
            map = null;
        }
        C38027EwB c38027EwB = new C38027EwB(FSY.FIXED);
        c38027EwB.LIZJ = 1;
        c38027EwB.LIZIZ = "hybrid_security_monitor_navigation";
        C39479FeV c39479FeV = new C39479FeV(navigationConfig, iLogger, iEventMonitor, map, C37191Eih.LIZ(c38027EwB));
        this.LJFF = c39479FeV;
        return c39479FeV;
    }

    @Override // X.InterfaceC39505Fev
    public final void LJFF(C39491Feh c39491Feh) {
        this.LIZ = c39491Feh;
        C39482FeY c39482FeY = this.LIZJ;
        if (c39482FeY != null) {
            NavigationConfig navigationConfig = c39491Feh.LJLIL;
            o.LJIIIZ(navigationConfig, "<set-?>");
            c39482FeY.LJLIL = navigationConfig;
        }
        C39485Feb c39485Feb = this.LIZLLL;
        if (c39485Feb != null) {
            NavigationConfig navigationConfig2 = c39491Feh.LJLIL;
            o.LJIIIZ(navigationConfig2, "<set-?>");
            c39485Feb.LIZ = navigationConfig2;
        }
        C39493Fej c39493Fej = this.LJ;
        if (c39493Fej != null) {
            c39493Fej.LIZ = c39491Feh;
        }
        C39479FeV c39479FeV = this.LJFF;
        if (c39479FeV != null) {
            c39479FeV.LIZ = c39491Feh.LJLIL;
        }
    }

    @Override // com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorService
    public final void LJII(InterfaceC65784Pro<? extends List<String>> provider) {
        o.LJIIIZ(provider, "provider");
        C39479FeV c39479FeV = this.LJFF;
        if (c39479FeV != null) {
            c39479FeV.LJFF = provider;
        }
    }

    @Override // X.InterfaceC39505Fev
    public final Boolean LIZ(Intent intent, Throwable th) {
        NavigationConfig navigationConfig;
        Object LIZ;
        C39491Feh c39491Feh = this.LIZ;
        if (c39491Feh != null) {
            navigationConfig = c39491Feh.LJLIL;
        } else {
            navigationConfig = null;
        }
        try {
            C39481FeX.LIZIZ(intent, th, navigationConfig);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th2) {
            LIZ = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("error occur. ");
            LIZ2.append(C38386F4s.LIZJ(m10exceptionOrNullimpl, false));
            X1D.LIZIZ(LIZ2);
        }
        return Boolean.FALSE;
    }

    @Override // X.InterfaceC39505Fev
    public final void LIZIZ(C66226Pyw proxy, C39491Feh c39491Feh) {
        o.LJIIIZ(proxy, "proxy");
        this.LIZIZ = proxy;
        this.LIZ = c39491Feh;
        C39482FeY c39482FeY = new C39482FeY(c39491Feh.LJLIL);
        C64409PPp.LJI(c39482FeY);
        this.LIZJ = c39482FeY;
        C39485Feb c39485Feb = new C39485Feb(c39491Feh.LJLIL);
        C64402PPi.LIZJ.add(c39485Feb);
        this.LIZLLL = c39485Feb;
    }
}
