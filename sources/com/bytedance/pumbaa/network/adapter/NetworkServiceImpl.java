package com.bytedance.pumbaa.network.adapter;

import X.C58096Mr6;
import X.C65935PuF;
import X.C66226Pyw;
import X.InterfaceC65784Pro;
import X.InterfaceC65943PuN;
import X.InterfaceC65954PuY;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.pumbaa.network.adapter.api.INetworkService;

/* loaded from: classes11.dex */
public final class NetworkServiceImpl implements INetworkService {
    public InterfaceC65784Pro<SettingsModel> LIZ;

    public static INetworkService LJIILIIL() {
        Object LIZ = C58096Mr6.LIZ(INetworkService.class, false);
        if (LIZ != null) {
            return (INetworkService) LIZ;
        }
        if (C58096Mr6.LJJIJLIJ == null) {
            synchronized (INetworkService.class) {
                if (C58096Mr6.LJJIJLIJ == null) {
                    C58096Mr6.LJJIJLIJ = new NetworkServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJIJLIJ;
    }

    @Override // com.bytedance.pumbaa.base.ICommonService
    public final void updateSettings() {
        InterfaceC65784Pro<SettingsModel> interfaceC65784Pro = this.LIZ;
        if (interfaceC65784Pro != null && interfaceC65784Pro.invoke() != null) {
            NetworkComponent.INSTANCE.updateSettings();
        }
    }

    @Override // com.bytedance.pumbaa.network.adapter.api.INetworkService
    public final void LJII(InterfaceC65943PuN interfaceC65943PuN) {
        NetworkComponent.INSTANCE.switchEventHandler(interfaceC65943PuN, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.pumbaa.base.ICommonService
    public final void init(C65935PuF c65935PuF, C66226Pyw c66226Pyw, InterfaceC65784Pro<? extends SettingsModel> interfaceC65784Pro, InterfaceC65954PuY interfaceC65954PuY) {
        InterfaceC65784Pro<? extends SettingsModel> interfaceC65784Pro2 = interfaceC65784Pro;
        this.LIZ = interfaceC65784Pro2;
        NetworkComponent.init$default(NetworkComponent.INSTANCE, c65935PuF, c66226Pyw, interfaceC65784Pro2, interfaceC65954PuY, false, 16, null);
    }
}
