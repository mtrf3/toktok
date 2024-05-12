package com.ss.android.ugc.aweme.services;

import X.C58096Mr6;
import X.IJV;
import com.ss.android.ugc.aweme.base.INetworkQualityService;

/* loaded from: classes7.dex */
public final class NetworkQualityServiceImpl implements INetworkQualityService {
    @Override // com.ss.android.ugc.aweme.base.INetworkQualityService
    public int getNetQualityLevel() {
        return IJV.LIZIZ();
    }

    public static INetworkQualityService createINetworkQualityServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(INetworkQualityService.class, z);
        if (LIZ != null) {
            return (INetworkQualityService) LIZ;
        }
        if (C58096Mr6.T5 == null) {
            synchronized (INetworkQualityService.class) {
                if (C58096Mr6.T5 == null) {
                    C58096Mr6.T5 = new NetworkQualityServiceImpl();
                }
            }
        }
        return C58096Mr6.T5;
    }
}
