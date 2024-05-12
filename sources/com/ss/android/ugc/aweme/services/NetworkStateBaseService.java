package com.ss.android.ugc.aweme.services;

import X.C2NU;
import X.C55382LoQ;
import X.EF7;
import X.EnumC111394Yt;
import X.EnumC41264GHk;
import X.FCD;
import X.InterfaceC35868E5w;
import X.N4P;
import X.N4Q;
import android.content.Context;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class NetworkStateBaseService implements INetworkStateService {
    public N4P netLevel = NetworkLevelKt.defaultNetworkLevel();
    public final CopyOnWriteArrayList<InterfaceC35868E5w> statusListeners = new CopyOnWriteArrayList<>();

    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[N4Q.values().length];
            try {
                iArr[N4Q.FAKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N4Q.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N4Q.OFFLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[N4Q.SLOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void notifyNetworkChanged() {
        Iterator<InterfaceC35868E5w> it = this.statusListeners.iterator();
        while (it.hasNext()) {
            it.next().LIZ(getNetworkStatus());
        }
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public int getEffectiveConnectionType() {
        return getNetworkLevel().LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public EnumC41264GHk getNetworkStatus() {
        int i = WhenMappings.$EnumSwitchMapping$0[getNetworkLevel().LJLIL.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    return EnumC41264GHk.STRONG;
                }
                return EnumC41264GHk.WEAK;
            }
            return EnumC41264GHk.NOT_AVAILABLE;
        }
        return EnumC41264GHk.FAKE;
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public boolean isFakeNetwork() {
        return NetworkLevelKt.isFake(getNetworkLevel());
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public boolean isWeakNetwork() {
        return NetworkLevelKt.isWeak(getNetworkLevel());
    }

    public N4P getNetworkLevel() {
        return this.netLevel;
    }

    public static boolean INVOKESTATIC_com_ss_android_ugc_aweme_services_NetworkStateBaseService_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable(Context context) {
        try {
            return C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    private final void handleNetworkLevelLogic(N4P n4p) {
        C55382LoQ LJJIZ;
        C55382LoQ LJJIZ2;
        if (NetworkLevelKt.isFake(n4p)) {
            C2NU.LIZ.LJ(EnumC111394Yt.FAKE);
            SpeedModeServiceImpl.LJII().LJI();
        } else if (NetworkLevelKt.isOffline(n4p)) {
            C2NU.LIZ.LJ(EnumC111394Yt.NOT_AVAILABLE);
        } else if (NetworkLevelKt.isUnknown(n4p)) {
            C2NU.LIZ.LJ(EnumC111394Yt.UNKNOWN);
        } else if (INVOKESTATIC_com_ss_android_ugc_aweme_services_NetworkStateBaseService_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailable(EF7.LIZIZ())) {
            C2NU.LIZ.LJ(EnumC111394Yt.AVAILABLE);
        }
        if (FCD.LJI(EF7.LIZIZ())) {
            if (NetworkLevelKt.lteOffline(n4p)) {
                ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
                if (LJJJLL != null && (LJJIZ2 = LJJJLL.LJJIZ()) != null) {
                    LJJIZ2.LJJIJIIJIL();
                    if (Live.getLiteService() == null) {
                        return;
                    }
                    Live.getLiteService().v3();
                    return;
                }
                return;
            }
            ILiveOuterService LJJJLL2 = LiveOuterService.LJJJLL();
            if (LJJJLL2 == null || (LJJIZ = LJJJLL2.LJJIZ()) == null) {
                return;
            }
            LJJIZ.LJJIJIIJIL();
            if (Live.getLiteService() == null) {
                return;
            }
            Live.getLiteService().j9();
        }
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public void observerNetworkChange(InterfaceC35868E5w callback) {
        o.LJIIIZ(callback, "callback");
        this.statusListeners.add(callback);
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStateService
    public void removeNetworkChangeObserver(InterfaceC35868E5w callback) {
        o.LJIIIZ(callback, "callback");
        this.statusListeners.remove(callback);
    }

    public final void updateNetLevel(N4P level) {
        o.LJIIIZ(level, "level");
        this.netLevel = level;
        handleNetworkLevelLogic(level);
        notifyNetworkChanged();
    }
}
