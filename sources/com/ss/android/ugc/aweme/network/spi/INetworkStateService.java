package com.ss.android.ugc.aweme.network.spi;

import X.EnumC41264GHk;
import X.InterfaceC35868E5w;

/* loaded from: classes11.dex */
public interface INetworkStateService {
    int getEffectiveConnectionType();

    EnumC41264GHk getNetworkStatus();

    boolean isFakeNetwork();

    boolean isWeakNetwork();

    void observerNetworkChange(InterfaceC35868E5w interfaceC35868E5w);

    void removeNetworkChangeObserver(InterfaceC35868E5w interfaceC35868E5w);
}
