package X;

import com.bytedance.ies.ugc.aweme.network.NetworkService;
import com.ss.android.ugc.aweme.network.INetwork;

/* renamed from: X.alG, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94702alG extends AbstractC65781Prl implements InterfaceC65784Pro<INetwork> {
    public static final C94702alG LJLIL = new C94702alG();

    public C94702alG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final INetwork invoke() {
        return NetworkService.LJI();
    }
}
