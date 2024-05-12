package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.discover.IDiscoveryService;
import com.ss.android.ugc.aweme.discover.impl.DiscoveryServiceImpl;

/* renamed from: X.Lu6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55734Lu6 implements IDiscoveryService {
    public static final C55734Lu6 LIZIZ = new C55734Lu6();
    public final /* synthetic */ IDiscoveryService LIZ;

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final Class<? extends Fragment> LJJJJZI() {
        return this.LIZ.LJJJJZI();
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final InterfaceC55284Lmq LJJJLIIL() {
        return this.LIZ.LJJJLIIL();
    }

    @Override // com.ss.android.ugc.aweme.discover.IDiscoveryService
    public final Fragment LJJJLL() {
        return this.LIZ.LJJJLL();
    }

    public C55734Lu6() {
        IDiscoveryService iDiscoveryService;
        Object LIZ = C58096Mr6.LIZ(IDiscoveryService.class, false);
        if (LIZ != null) {
            iDiscoveryService = (IDiscoveryService) LIZ;
        } else {
            if (C58096Mr6.w == null) {
                synchronized (IDiscoveryService.class) {
                    if (C58096Mr6.w == null) {
                        C58096Mr6.w = new DiscoveryServiceImpl();
                    }
                }
            }
            iDiscoveryService = C58096Mr6.w;
        }
        this.LIZ = iDiscoveryService;
    }
}
