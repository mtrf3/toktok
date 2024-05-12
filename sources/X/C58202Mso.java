package X;

import com.bytedance.ies.ugc.aweme.network.INetworkConfigProvider;
import com.ss.android.ugc.aweme.legoImp.NetworkConfigProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.Mso, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58202Mso extends AbstractC65781Prl implements InterfaceC65784Pro<C64830PcQ> {
    public static final C58202Mso LJLIL = new C58202Mso();

    public C58202Mso() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C64830PcQ invoke() {
        INetworkConfigProvider iNetworkConfigProvider;
        Object LIZ = C58096Mr6.LIZ(INetworkConfigProvider.class, false);
        if (LIZ != null) {
            iNetworkConfigProvider = (INetworkConfigProvider) LIZ;
        } else {
            if (C58096Mr6.h2 == null) {
                synchronized (INetworkConfigProvider.class) {
                    if (C58096Mr6.h2 == null) {
                        C58096Mr6.h2 = new NetworkConfigProvider();
                    }
                }
            }
            iNetworkConfigProvider = C58096Mr6.h2;
        }
        o.LJI(iNetworkConfigProvider);
        return iNetworkConfigProvider.LIZ();
    }
}
