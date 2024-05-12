package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.kids.discovery.DiscoveryServiceImpl;
import com.ss.android.ugc.aweme.kids.discovery.api.IDiscoveryService;

/* renamed from: X.Mrq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58142Mrq extends AbstractC65781Prl implements InterfaceC65784Pro<Fragment> {
    public static final C58142Mrq LJLIL = new C58142Mrq();

    public C58142Mrq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Fragment invoke() {
        IDiscoveryService iDiscoveryService;
        Object LIZ = C58096Mr6.LIZ(IDiscoveryService.class, false);
        if (LIZ != null) {
            iDiscoveryService = (IDiscoveryService) LIZ;
        } else {
            if (C58096Mr6.I1 == null) {
                synchronized (IDiscoveryService.class) {
                    if (C58096Mr6.I1 == null) {
                        C58096Mr6.I1 = new DiscoveryServiceImpl();
                    }
                }
            }
            iDiscoveryService = C58096Mr6.I1;
        }
        return iDiscoveryService.LIZ();
    }
}
