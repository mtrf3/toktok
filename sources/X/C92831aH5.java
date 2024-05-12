package X;

import java.net.InetAddress;

/* renamed from: X.aH5, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92831aH5 extends AbstractC65781Prl implements InterfaceC88472Yns<InetAddress, String> {
    public static final C92831aH5 LJLIL = new C92831aH5();

    public C92831aH5() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(InetAddress inetAddress) {
        return inetAddress.getHostAddress();
    }
}
