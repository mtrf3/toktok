package com.bytedance.pumbaa.monitor.adapter.api;

import X.C53655L3z;
import X.C65935PuF;
import X.C66226Pyw;
import X.InterfaceC65784Pro;
import X.InterfaceC65954PuY;
import X.Q0Q;
import com.bytedance.helios.api.config.SettingsModel;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MonitorServiceEmptyImpl implements IMonitorService {
    @Override // com.bytedance.pumbaa.monitor.adapter.api.IMonitorService
    public final void LJ(Map<String, ? extends Object> map) {
    }

    @Override // com.bytedance.pumbaa.monitor.adapter.api.IMonitorService
    public final void LJIIJ(Q0Q handler) {
        o.LJIIIZ(handler, "handler");
    }

    @Override // com.bytedance.pumbaa.monitor.adapter.api.IMonitorService
    public final void LJIIL(Q0Q handler) {
        o.LJIIIZ(handler, "handler");
    }

    @Override // com.bytedance.pumbaa.base.ICommonService
    public final void updateSettings() {
    }

    @Override // com.bytedance.pumbaa.monitor.adapter.api.IMonitorService
    public final C53655L3z LJIIIIZZ(int i) {
        return new C53655L3z(i, false, false);
    }

    @Override // com.bytedance.pumbaa.base.ICommonService
    public final void init(C65935PuF c65935PuF, C66226Pyw c66226Pyw, InterfaceC65784Pro<? extends SettingsModel> interfaceC65784Pro, InterfaceC65954PuY interfaceC65954PuY) {
    }
}
