package X;

import java.net.Inet4Address;
import kotlin.jvm.internal.o;

/* renamed from: X.P3i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63830P3i extends AbstractC65781Prl implements InterfaceC88472Yns<C66300Q0i, String> {
    public final /* synthetic */ Inet4Address LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63830P3i(Inet4Address inet4Address) {
        super(1);
        this.LJLIL = inet4Address;
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(C66300Q0i c66300Q0i) {
        String hostAddress = this.LJLIL.getHostAddress();
        o.LJFF(hostAddress, "this.hostAddress");
        return hostAddress;
    }
}
