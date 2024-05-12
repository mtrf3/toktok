package X;

import com.ss.android.experiment.LauncherExperimentsImpl;
import com.ss.android.ugc.aweme.launcher.service.experiment.ILauncherExperimentsApi;

/* renamed from: X.Fmz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40005Fmz implements ILauncherExperimentsApi {
    public static final C40005Fmz LIZIZ = new C40005Fmz();
    public final /* synthetic */ ILauncherExperimentsApi LIZ;

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.ILauncherExperimentsApi
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    public C40005Fmz() {
        ILauncherExperimentsApi iLauncherExperimentsApi;
        Object LIZ = C58096Mr6.LIZ(ILauncherExperimentsApi.class, false);
        if (LIZ != null) {
            iLauncherExperimentsApi = (ILauncherExperimentsApi) LIZ;
        } else {
            if (C58096Mr6.LJJJJL == null) {
                synchronized (ILauncherExperimentsApi.class) {
                    if (C58096Mr6.LJJJJL == null) {
                        C58096Mr6.LJJJJL = new LauncherExperimentsImpl();
                    }
                }
            }
            iLauncherExperimentsApi = C58096Mr6.LJJJJL;
        }
        this.LIZ = iLauncherExperimentsApi;
    }
}
