package X;

import com.bytedance.helios.network.NetworkComponent;

/* renamed from: X.Pl9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65371Pl9 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C65371Pl9 LJLIL = new C65371Pl9();

    public C65371Pl9() {
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
