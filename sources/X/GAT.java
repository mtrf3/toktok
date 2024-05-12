package X;

import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;

/* loaded from: classes8.dex */
public final class GAT extends AbstractC65781Prl implements InterfaceC65784Pro<INetworkStateService> {
    public static final GAT LJLIL = new GAT();

    public GAT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final INetworkStateService invoke() {
        return NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false);
    }
}
