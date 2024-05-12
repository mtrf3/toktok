package com.bytedance.pumbaa.monitor.adapter;

import X.C53655L3z;
import X.C58096Mr6;
import X.C65935PuF;
import X.C66031Pvn;
import X.C66033Pvp;
import X.C66036Pvs;
import X.C66037Pvt;
import X.C66038Pvu;
import X.C66059PwF;
import X.C66063PwJ;
import X.C66226Pyw;
import X.InterfaceC65784Pro;
import X.InterfaceC65954PuY;
import X.InterfaceC66039Pvv;
import X.Q0Q;
import X.X1D;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.pumbaa.monitor.adapter.api.IMonitorService;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class MonitorServiceImpl implements IMonitorService {
    public InterfaceC65784Pro<SettingsModel> LIZ;

    public static IMonitorService LJIILIIL() {
        Object LIZ = C58096Mr6.LIZ(IMonitorService.class, false);
        if (LIZ != null) {
            return (IMonitorService) LIZ;
        }
        if (C58096Mr6.LJJIJL == null) {
            synchronized (IMonitorService.class) {
                if (C58096Mr6.LJJIJL == null) {
                    C58096Mr6.LJJIJL = new MonitorServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJIJL;
    }

    @Override // com.bytedance.pumbaa.base.ICommonService
    public final void updateSettings() {
        C66036Pvs.LIZIZ().LJII();
    }

    @Override // com.bytedance.pumbaa.monitor.adapter.api.IMonitorService
    public final void LJ(Map<String, ? extends Object> map) {
        C66036Pvs.LIZIZ().LJI(map);
    }

    @Override // com.bytedance.pumbaa.monitor.adapter.api.IMonitorService
    public final C53655L3z LJIIIIZZ(int i) {
        C53655L3z LIZJ = C66036Pvs.LIZIZ().LIZJ(i);
        o.LJIIIIZZ(LIZJ, "HeliosEnv.get().getApiControlConfig(id)");
        return LIZJ;
    }

    @Override // com.bytedance.pumbaa.monitor.adapter.api.IMonitorService
    public final void LJIIJ(Q0Q handler) {
        o.LJIIIZ(handler, "handler");
        C66037Pvt.LIZIZ.LIZIZ(handler);
    }

    @Override // com.bytedance.pumbaa.monitor.adapter.api.IMonitorService
    public final void LJIIL(Q0Q handler) {
        o.LJIIIZ(handler, "handler");
        C66037Pvt c66037Pvt = C66037Pvt.LIZIZ;
        synchronized (c66037Pvt) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unregisterEventHandler: ");
            LIZ.append(0);
            LIZ.append("->");
            LIZ.append(handler);
            C66063PwJ.LIZIZ("EventHandler", X1D.LIZIZ(LIZ));
            List<InterfaceC66039Pvv> list = c66037Pvt.LIZ.get(0);
            if (list != null) {
                list.remove(handler);
                c66037Pvt.LIZ.put(0, list);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.pumbaa.base.ICommonService
    public final void init(C65935PuF c65935PuF, C66226Pyw c66226Pyw, InterfaceC65784Pro<? extends SettingsModel> interfaceC65784Pro, InterfaceC65954PuY interfaceC65954PuY) {
        C66226Pyw c66226Pyw2 = c66226Pyw;
        InterfaceC65784Pro<? extends SettingsModel> interfaceC65784Pro2 = interfaceC65784Pro;
        o.LJI(interfaceC65784Pro2);
        this.LIZ = interfaceC65784Pro2;
        C66031Pvn c66031Pvn = new C66031Pvn(this, c65935PuF, c66226Pyw2);
        C66036Pvs LIZIZ = C66036Pvs.LIZIZ();
        C66038Pvu c66038Pvu = new C66038Pvu(c66226Pyw2, c66031Pvn);
        C66033Pvp c66033Pvp = new C66033Pvp(interfaceC65954PuY);
        LIZIZ.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            synchronized (LIZIZ) {
                LIZIZ.LJ(c66038Pvu, c66033Pvp);
            }
        } finally {
            C66059PwF.LIZIZ(ApmEvent.LJ(System.currentTimeMillis() - currentTimeMillis, "HeliosEnv.init"));
        }
    }
}
