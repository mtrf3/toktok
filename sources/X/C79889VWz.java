package X;

import Y.ACallableS39S1100000_14;
import android.graphics.Bitmap;
import com.bytedance.ies.xelement.alphavideo.LynxAlphaVideo;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;

/* renamed from: X.VWz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79889VWz implements VX3 {
    public final /* synthetic */ ACallableS39S1100000_14 LIZ;
    public final /* synthetic */ C68322mC LIZIZ;

    @Override // X.VX3
    public final void onFailed() {
        DataSource dataSource = ((LynxAlphaVideo) this.LIZ.l1).LJLJI;
        if (dataSource != null) {
            dataSource.setAutoRelease(true);
        }
        LynxAlphaVideo lynxAlphaVideo = (LynxAlphaVideo) this.LIZ.l1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set video lastFrame failed, lastFrame is ");
        LIZ.append(this.LIZ.s0);
        lynxAlphaVideo.LJJI(-16, X1D.LIZIZ(LIZ), ((LynxAlphaVideo) this.LIZ.l1).LJLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.VX3
    public final void LIZ(Bitmap bitmap) {
        if (bitmap != 0) {
            this.LIZIZ.element = bitmap;
        }
    }

    public C79889VWz(ACallableS39S1100000_14 aCallableS39S1100000_14, C68322mC c68322mC) {
        this.LIZ = aCallableS39S1100000_14;
        this.LIZIZ = c68322mC;
    }
}
