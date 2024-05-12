package X;

import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;

/* renamed from: X.A5j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25663A5j extends AbstractC65781Prl implements InterfaceC65784Pro<INetworkStandardUIService> {
    public static final C25663A5j LJLIL = new C25663A5j();

    public C25663A5j() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final INetworkStandardUIService invoke() {
        return NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false);
    }
}
