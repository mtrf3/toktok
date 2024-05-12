package com.ss.android.ugc.aweme.services;

import X.C58096Mr6;
import X.N4P;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkLevelService;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.services.NetworkStandardApiImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NetworkLevelService implements INetworkLevelService {
    public static final Companion Companion = new Companion();

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkLevelService
    public void reportNetworkLevel(String scene) {
        o.LJIIIZ(scene, "scene");
    }

    public N4P getNqeNetworkLevel() {
        return NetworkStateNqeService.INSTANCE.getNetworkLevel();
    }

    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public static INetworkLevelService createINetworkLevelServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(INetworkLevelService.class, z);
        if (LIZ != null) {
            return (INetworkLevelService) LIZ;
        }
        if (C58096Mr6.S5 == null) {
            synchronized (INetworkLevelService.class) {
                if (C58096Mr6.S5 == null) {
                    C58096Mr6.S5 = new NetworkLevelService();
                }
            }
        }
        return C58096Mr6.S5;
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkLevelService
    public void notifyNQEChange(int i) {
        NetworkStandardApiImpl.EffectiveConnectionTypeDispatcher.INSTANCE.notifyEffectiveConnectionTypeChanged(i);
        N4P obtainNetworkLevelByNqe = NetworkLevelKt.obtainNetworkLevelByNqe(i);
        NetworkStateNqeService.INSTANCE.notifyNQEChange(obtainNetworkLevelByNqe);
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LIZ(obtainNetworkLevelByNqe);
    }
}
