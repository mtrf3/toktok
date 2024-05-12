package X;

import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;

/* loaded from: classes5.dex */
public final class A1G extends AbstractC65781Prl implements InterfaceC65784Pro<INetworkStandardUIService> {
    public static final A1G LJLIL = new A1G();

    public A1G() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final INetworkStandardUIService invoke() {
        return NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false);
    }
}
