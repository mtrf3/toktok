package X;

import com.ss.android.ugc.aweme.account.network.IAccountNetworkApi;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QQB extends AbstractC65781Prl implements InterfaceC65784Pro<IAccountNetworkApi> {
    public static final QQB LJLIL = new QQB();

    public QQB() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final IAccountNetworkApi invoke() {
        IAccountNetworkApi iAccountNetworkApi;
        InterfaceC789838c create = C46104I7o.LJJII().create(NetworkProxyAccount.LIZIZ);
        if (create != null) {
            iAccountNetworkApi = create.create(IAccountNetworkApi.class);
        } else {
            iAccountNetworkApi = null;
        }
        o.LJI(iAccountNetworkApi);
        return iAccountNetworkApi;
    }
}
