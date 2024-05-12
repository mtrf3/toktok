package X;

import java.net.InetAddress;

/* renamed from: X.aH4, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92830aH4 extends AbstractC65781Prl implements InterfaceC88472Yns<InetAddress, Boolean> {
    public static final C92830aH4 LJLIL = new C92830aH4();

    public C92830aH4() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(InetAddress inetAddress) {
        return Boolean.valueOf(!inetAddress.isLoopbackAddress());
    }
}
