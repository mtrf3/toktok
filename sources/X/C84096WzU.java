package X;

import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.vesdk.VEReactSettings;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VECanvasFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;

/* renamed from: X.WzU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84096WzU extends C84091WzP {
    public static final String LJIILIIL = C16880lQ.LJLLJ(C84091WzP.class);
    public final VEReactSettings LJIIL;

    @Override // X.C84091WzP
    public final void LJIIIIZZ(String str, String str2) {
    }

    @Override // X.C84091WzP
    public final int[] LJIIJ() {
        return new int[]{2, 1, 0};
    }

    @Override // X.C84091WzP
    public final void LJIIL() {
        VEVideoTransformFilterParam vEVideoTransformFilterParam = new VEVideoTransformFilterParam();
        vEVideoTransformFilterParam.filterName = "canvas blend";
        vEVideoTransformFilterParam.scaleFactor = 1.0f;
        vEVideoTransformFilterParam.transX = 0.0f;
        vEVideoTransformFilterParam.alpha = 1.0f;
        int i = this.LJIIIZ;
        if (i >= 0) {
            this.LIZIZ.LIZ.updateTrackFilterParam(i, vEVideoTransformFilterParam);
        } else {
            this.LJIIIZ = this.LIZIZ.LIZ.addTrackFilter(0, 0, vEVideoTransformFilterParam, -1, -1);
        }
        VECanvasFilterParam vECanvasFilterParam = new VECanvasFilterParam();
        vECanvasFilterParam.filterName = "canvas wrap";
        VESize vESize = this.LJ;
        vECanvasFilterParam.width = vESize.width;
        vECanvasFilterParam.height = vESize.height;
        vECanvasFilterParam.color = -65536;
        vECanvasFilterParam.sourceType = VECanvasFilterParam.SourceType.VIDEOFRAME.ordinal();
        int i2 = this.LJIIIIZZ;
        if (i2 >= 0) {
            this.LIZIZ.LIZ.updateTrackFilterParam(i2, vECanvasFilterParam);
        } else {
            this.LJIIIIZZ = this.LIZIZ.LIZ.addTrackFilter(0, 0, vECanvasFilterParam, -1, -1);
        }
    }

    @Override // X.C84091WzP, X.X02
    public final void onCreate() {
        this.LIZIZ.addRecorderStateListener(this);
        C84092WzQ c84092WzQ = this.LIZIZ;
        VESize vESize = this.LJ;
        c84092WzQ.changeVideoOutputSize(vESize.width, vESize.height);
        String reactAudioPath = this.LJIIL.getReactAudioPath();
        C82647Wc7 c82647Wc7 = new C82647Wc7();
        c82647Wc7.LIZ(reactAudioPath);
        c82647Wc7.LIZIZ();
        c82647Wc7.LIZJ(0);
        c82647Wc7.LIZLLL(-1);
        EnumC82648Wc8 enumC82648Wc8 = EnumC82648Wc8.External;
        VETrackParams vETrackParams = c82647Wc7.LIZ;
        vETrackParams.trackPriority = enumC82648Wc8;
        int LIZJ = this.LIZIZ.LIZJ(1, vETrackParams, true);
        this.LJI = LIZJ;
        this.LIZIZ.seekTrack(LIZJ, 1, 0L);
        String str = LJIILIIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("add aTrack: ");
        C01R.LIZJ(LIZ, this.LJI, LIZ, str);
        String reactVideoPath = this.LJIIL.getReactVideoPath();
        C82647Wc7 c82647Wc72 = new C82647Wc7();
        c82647Wc72.LIZ(reactVideoPath);
        c82647Wc72.LIZIZ();
        c82647Wc72.LIZJ(0);
        c82647Wc72.LIZLLL(-1);
        int i = LJIIJ()[1];
        VETrackParams vETrackParams2 = c82647Wc72.LIZ;
        vETrackParams2.layer = i;
        vETrackParams2.trackPriority = enumC82648Wc8;
        int LIZJ2 = this.LIZIZ.LIZJ(0, vETrackParams2, true);
        this.LJII = LIZJ2;
        this.LIZIZ.seekTrack(LIZJ2, 0, 0L);
        LJIILIIL(this.LJII);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("add vTrack: ");
        LIZ2.append(this.LJII);
        P4Q.LJFF(str, X1D.LIZIZ(LIZ2));
        LJIILJJIL();
        LJIILL();
    }

    @Override // X.C84091WzP
    public final void LJIILIIL(int i) {
        VEVideoTransformFilterParam vEVideoTransformFilterParam = new VEVideoTransformFilterParam();
        vEVideoTransformFilterParam.filterName = "canvas blend";
        vEVideoTransformFilterParam.scaleFactor = 0.35f;
        vEVideoTransformFilterParam.transX = -0.23f;
        vEVideoTransformFilterParam.transY = -0.23f;
        vEVideoTransformFilterParam.alpha = 1.0f;
        int i2 = this.LJIIJ;
        if (i2 >= 0) {
            this.LIZIZ.LIZ.updateTrackFilterParam(i2, vEVideoTransformFilterParam);
        } else {
            this.LJIIJ = this.LIZIZ.LIZ.addTrackFilter(0, i, vEVideoTransformFilterParam, -1, -1);
        }
    }

    public C84096WzU(C84092WzQ c84092WzQ, VEReactSettings vEReactSettings, VESize vESize) {
        this.LJIIL = vEReactSettings;
        this.LIZIZ = c84092WzQ;
        this.LIZLLL = vESize;
        this.LJ = vESize;
    }
}
