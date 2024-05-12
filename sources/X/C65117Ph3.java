package X;

import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;

/* renamed from: X.Ph3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65117Ph3 extends AbstractC65781Prl implements InterfaceC65784Pro<INetworkStateService> {
    public static final C65117Ph3 LJLIL = new C65117Ph3();

    public C65117Ph3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final INetworkStateService invoke() {
        return NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false);
    }
}
