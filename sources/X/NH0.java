package X;

import com.bytedance.geckox.model.UpdatePackage;
import com.ss.android.ugc.aweme.ad.preload.gecko.GeckoPreloadServiceImpl;

/* loaded from: classes11.dex */
public final class NH0 extends AbstractC61537ODd {
    public final /* synthetic */ GeckoPreloadServiceImpl LIZ;
    public final /* synthetic */ NH1 LIZIZ;

    public NH0(GeckoPreloadServiceImpl geckoPreloadServiceImpl, NH1 nh1) {
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
