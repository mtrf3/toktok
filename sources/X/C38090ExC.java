package X;

import com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService;
import com.ss.android.ugc.aweme.opt.BackendApiCallerOptService;

/* renamed from: X.ExC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38090ExC implements IBackendApiCallerOptService {
    public static final C38090ExC LIZIZ = new C38090ExC();
    public final /* synthetic */ IBackendApiCallerOptService LIZ;

    @Override // com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService
    public final boolean LIZIZ(String str) {
        return this.LIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService
    public final void LIZJ() {
        this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService
    public final void LIZLLL() {
        this.LIZ.LIZLLL();
    }

    public C38090ExC() {
        IBackendApiCallerOptService iBackendApiCallerOptService;
        Object LIZ = C58096Mr6.LIZ(IBackendApiCallerOptService.class, false);
        if (LIZ != null) {
            iBackendApiCallerOptService = (IBackendApiCallerOptService) LIZ;
        } else {
            if (C58096Mr6.I3 == null) {
                synchronized (IBackendApiCallerOptService.class) {
                    if (C58096Mr6.I3 == null) {
                        C58096Mr6.I3 = new BackendApiCallerOptService();
                    }
                }
            }
            iBackendApiCallerOptService = C58096Mr6.I3;
        }
        this.LIZ = iBackendApiCallerOptService;
    }
}
