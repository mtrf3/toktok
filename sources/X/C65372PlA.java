package X;

import com.bytedance.helios.network.NetworkComponent;

/* renamed from: X.PlA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65372PlA extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C65372PlA LJLIL = new C65372PlA();

    public C65372PlA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isNetworkEnabled: ");
        LIZ.append(NetworkComponent.INSTANCE.isNetworkEnabled());
        return X1D.LIZIZ(LIZ);
    }
}
