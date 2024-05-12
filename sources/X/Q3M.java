package X;

import com.ss.android.experiment.ImageHeaderConfigImpl;
import com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig;

/* loaded from: classes12.dex */
public final class Q3M implements IImageHeaderConfig {
    public static final Q3M LIZIZ = new Q3M();
    public final /* synthetic */ IImageHeaderConfig LIZ;

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final long LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final long LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final java.util.Set<String> LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final long LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final boolean isEnable() {
        return this.LIZ.isEnable();
    }

    public Q3M() {
        IImageHeaderConfig iImageHeaderConfig;
        Object LIZ = C58096Mr6.LIZ(IImageHeaderConfig.class, false);
        if (LIZ != null) {
            iImageHeaderConfig = (IImageHeaderConfig) LIZ;
        } else {
            if (C58096Mr6.LJJJJJL == null) {
                synchronized (IImageHeaderConfig.class) {
                    if (C58096Mr6.LJJJJJL == null) {
                        C58096Mr6.LJJJJJL = new ImageHeaderConfigImpl();
                    }
                }
            }
            iImageHeaderConfig = C58096Mr6.LJJJJJL;
        }
        this.LIZ = iImageHeaderConfig;
    }
}
