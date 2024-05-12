package com.ss.android.ugc.aweme.services;

import X.C58096Mr6;
import X.EnumC41264GHk;
import X.InterfaceC35868E5w;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NetworkStateServiceImpl implements INetworkStateService {
    public final INetworkStateService networkStateDelegate = NetworkStateNqeService.INSTANCE;

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public int getEffectiveConnectionType() {
        return this.networkStateDelegate.getEffectiveConnectionType();
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public EnumC41264GHk getNetworkStatus() {
        return this.networkStateDelegate.getNetworkStatus();
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public boolean isFakeNetwork() {
        return this.networkStateDelegate.isFakeNetwork();
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public boolean isWeakNetwork() {
        return this.networkStateDelegate.isWeakNetwork();
    }

    public static INetworkStateService createINetworkStateServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(INetworkStateService.class, z);
        if (LIZ != null) {
            return (INetworkStateService) LIZ;
        }
        if (C58096Mr6.W5 == null) {
            synchronized (INetworkStateService.class) {
                if (C58096Mr6.W5 == null) {
                    C58096Mr6.W5 = new NetworkStateServiceImpl();
                }
            }
        }
        return C58096Mr6.W5;
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public void observerNetworkChange(InterfaceC35868E5w callback) {
        o.LJIIIZ(callback, "callback");
        this.networkStateDelegate.observerNetworkChange(callback);
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public void removeNetworkChangeObserver(InterfaceC35868E5w callback) {
        o.LJIIIZ(callback, "callback");
        this.networkStateDelegate.removeNetworkChangeObserver(callback);
    }
}
