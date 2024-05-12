package X;

import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;

/* loaded from: classes13.dex */
public final class SII extends AbstractC65781Prl implements InterfaceC65784Pro<INetworkStateService> {
    public static final SII LJLIL = new SII();

    public SII() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final INetworkStateService invoke() {
        return NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false);
    }
}
