package com.ss.android.ugc.aweme.network.spi;

import X.FBC;

/* loaded from: classes5.dex */
public interface INetworkStandardApi {
    void addEffectiveConnectionTypeChangedListener(FBC fbc);

    int getEffectiveConnectionType();

    void removeEffectiveConnectionTypeChangedListener(FBC fbc);
}
