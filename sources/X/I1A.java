package X;

import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;

/* loaded from: classes8.dex */
public final class I1A implements InterfaceC84907XTz {
    public final /* synthetic */ I1C LIZ;
    public final /* synthetic */ I15 LIZIZ;

    @Override // X.InterfaceC84907XTz
    public final void LIZ(Exception exc) {
        this.LIZ.LIZJ();
    }

    @Override // X.InterfaceC84907XTz
    public final void LIZIZ(AVMusic aVMusic) {
        if (aVMusic == null) {
            this.LIZ.LIZJ();
        } else if ((!AVCommerceServiceImpl.LJIIJ().LIZ() || aVMusic.isCommerceMusic()) && C44172HVg.LJI.LJIJJ(aVMusic, this.LIZIZ.LIZLLL)) {
            this.LIZ.LIZ(aVMusic);
        } else {
            this.LIZ.LJ();
        }
    }

    public I1A(I1C i1c, I15 i15) {
        this.LIZ = i1c;
        this.LIZIZ = i15;
    }
}
