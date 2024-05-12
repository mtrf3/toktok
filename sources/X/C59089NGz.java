package X;

import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.ss.android.ugc.aweme.ad.preload.gecko.GeckoPreloadServiceImpl;

/* renamed from: X.NGz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59089NGz extends AbstractC61537ODd {
    public final /* synthetic */ GeckoPreloadServiceImpl LIZ;
    public final /* synthetic */ NH1 LIZIZ;

    @Override // X.AbstractC61537ODd
    public final void LJIIIZ(LocalPackageModel localPackageModel) {
        GeckoPreloadServiceImpl geckoPreloadServiceImpl = this.LIZ;
        NH1 nh1 = this.LIZIZ;
        geckoPreloadServiceImpl.getClass();
        GeckoPreloadServiceImpl.LIZJ(nh1);
        this.LIZ.LIZ = true;
    }

    public C59089NGz(GeckoPreloadServiceImpl geckoPreloadServiceImpl, NH1 nh1) {
        this.LIZ = geckoPreloadServiceImpl;
        this.LIZIZ = nh1;
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIJ(UpdatePackage updatePackage, Throwable th) {
        if (th != null) {
            th.getMessage();
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILL(UpdatePackage updatePackage, long j) {
        this.LIZ.LIZ = true;
        GeckoPreloadServiceImpl.LIZJ(this.LIZIZ);
    }
}
