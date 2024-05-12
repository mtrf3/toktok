package X;

import Y.ARunnableS14S1200000_15;
import Y.ARunnableS6S1101000_15;
import com.ss.android.videoshop.controller.VideoController;

/* loaded from: classes16.dex */
public final class YSV extends C36071bH {
    public final VideoController LIZ;

    @Override // X.C36071bH
    public final void LJIIL(int i) {
    }

    public YSV(VideoController videoController) {
        this.LIZ = videoController;
    }

    @Override // X.C36071bH
    public final void LJIIJ(int i, String str) {
        VIF.LIZ().post(new ARunnableS6S1101000_15(this, i, str, 0));
    }

    @Override // X.C36071bH
    public final void LJIILJJIL(C47789IpF c47789IpF, String str) {
        VIF.LIZ().post(new ARunnableS14S1200000_15(this, str, c47789IpF, 0));
    }

    @Override // X.C36071bH
    public final void LJIILL(int i, int i2) {
        VIF.LIZ().post(new YSY(this, i, i2));
    }
}
