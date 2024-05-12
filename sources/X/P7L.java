package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.view.Surface;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class P7L extends P7K {
    public Surface LJIIJJI;
    public Surface LJIIL;
    public SurfaceTexture LJIILIIL;
    public final float[] LJIILJJIL;
    public final int LJIILL;

    @Override // X.P7K
    public final int LJIIJJI() {
        return 16;
    }

    @Override // X.P7K
    public final void LJIJJLI(SurfaceTexture surfaceTexture) {
    }

    @Override // X.P7K
    public final void LJIILJJIL() {
        Surface surface = this.LJIIL;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.LJIILIIL;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.LJIILIIL = new SurfaceTexture(this.LJIILL);
        this.LJIIL = new Surface(this.LJIILIIL);
        this.LIZ.onNewSurfaceTexture(this.LJIILIIL);
    }

    @Override // X.P7K
    public final void LJIILL() {
        super.LJIILL();
        Surface surface = this.LJIIL;
        if (surface != null) {
            surface.release();
            this.LJIIL = null;
        }
        Surface surface2 = this.LJIIJJI;
        if (surface2 != null) {
            surface2.release();
            this.LJIIJJI = null;
        }
    }

    @Override // X.P7K
    public final Surface LIZIZ() {
        return this.LJIIJJI;
    }

    @Override // X.P7K
    public final Surface LIZJ() {
        return this.LJIIL;
    }

    @Override // X.P7K
    public final SurfaceTexture LJI() {
        return this.LJIILIIL;
    }

    public P7L(C63915P6p c63915P6p, X10 x10) {
        super(c63915P6p, x10);
        this.LJIILJJIL = new float[16];
        this.LJIILIIL = c63915P6p.LIZLLL;
        this.LJIILL = c63915P6p.LJ;
        this.LJIIL = new Surface(c63915P6p.LIZLLL);
        this.LJIIJJI = c63915P6p.LJI;
    }

    @Override // X.P7K
    public final int LJIIL(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        LJIILIIL(P7K.LIZ(streamConfigurationMap.getOutputSizes(SurfaceTexture.class)), tEFrameSizei);
        return 0;
    }

    @Override // X.P7K
    public final void LJIILIIL(List list, TEFrameSizei tEFrameSizei) {
        if (list != null && ((ArrayList) list).size() > 0) {
            this.LIZJ = PDA.LIZIZ(list, this.LIZJ);
        }
        SurfaceTexture surfaceTexture = this.LJIILIIL;
        TEFrameSizei tEFrameSizei2 = this.LIZJ;
        surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        this.LJIILIIL.setOnFrameAvailableListener(new P7E(this), this.LIZLLL.getHandler());
    }
}
