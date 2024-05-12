package com.ss.android.ugc.aweme.services;

import X.C113554cx;
import X.FMX;
import X.N4P;
import X.OSZ;
import com.bytedance.ttnet.TTNetInit;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NetworkStateNqeService extends NetworkStateBaseService {
    public static final NetworkStateNqeService INSTANCE = new NetworkStateNqeService();
    public static long weakStartTime;

    @Override // com.ss.android.ugc.aweme.services.NetworkStateBaseService
    public N4P getNetworkLevel() {
        N4P networkLevel = super.getNetworkLevel();
        if (NetworkLevelKt.isDefault(networkLevel)) {
            try {
                return NetworkLevelKt.obtainNetworkLevelByNqe(TTNetInit.getEffectiveConnectionType());
            } catch (Throwable unused) {
                return NetworkLevelKt.defaultNetworkLevel();
            }
        }
        return networkLevel;
    }

    public final void notifyNQEChange(N4P currentNQE) {
        o.LJIIIZ(currentNQE, "currentNQE");
        N4P networkLevel = getNetworkLevel();
        if (networkLevel.LJLILLLLZI != currentNQE.LJLILLLLZI) {
            mobNQEWeakEvent(networkLevel, currentNQE);
        }
        updateNetLevel(currentNQE);
    }

    private final void mobNQEWeakEvent(N4P n4p, N4P n4p2) {
        if (NetworkLevelKt.isDefault(n4p) && NetworkLevelKt.isWeak(n4p2)) {
            weakStartTime = System.currentTimeMillis();
        }
        if (!NetworkLevelKt.isWeak(n4p) && NetworkLevelKt.isWeak(n4p2)) {
            weakStartTime = System.currentTimeMillis();
            return;
        }
        if (!NetworkLevelKt.isWeak(n4p) || NetworkLevelKt.isWeak(n4p2) || weakStartTime == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - weakStartTime;
        weakStartTime = 0L;
        if (currentTimeMillis <= 0 || !FMX.LIZJ("network_status_change")) {
            return;
        }
        FMX.LJIIL("network_status_change", C113554cx.LJJL(new OSZ("network_status_from", String.valueOf(n4p.LJLILLLLZI)), new OSZ("network_status_to", String.valueOf(n4p2.LJLILLLLZI)), new OSZ("duration", String.valueOf(currentTimeMillis))));
    }
}
