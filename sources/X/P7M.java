package X;

import android.graphics.SurfaceTexture;
import android.media.ImageReader;
import android.view.Surface;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class P7M extends P7K {
    public ImageReader LJIIJJI;

    @Override // X.P7K
    public final SurfaceTexture LJI() {
        return null;
    }

    @Override // X.P7K
    public final int LJIIJJI() {
        return 2;
    }

    @Override // X.P7K
    public final void LJIILJJIL() {
    }

    @Override // X.P7K
    public final void LJIJJLI(SurfaceTexture surfaceTexture) {
    }

    @Override // X.P7K
    public final Surface LIZJ() {
        ImageReader imageReader = this.LJIIJJI;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    @Override // X.P7K
    public final void LJIILL() {
        super.LJIILL();
        ImageReader imageReader = this.LJIIJJI;
        if (imageReader != null) {
            imageReader.close();
            this.LJIIJJI = null;
        }
    }

    public P7M(C63915P6p c63915P6p, X10 x10) {
        super(c63915P6p, x10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r0 == 0) goto L7;
     */
    @Override // X.P7K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIIL(android.hardware.camera2.params.StreamConfigurationMap r7, com.ss.android.ttvecamera.TEFrameSizei r8) {
        /*
            r6 = this;
            int[] r5 = r7.getOutputFormats()
            X.P6b r0 = r6.LIZIZ
            int r4 = X.P6E.LJII(r0)
            int r3 = r5.length
            r2 = 0
            r1 = 0
        Ld:
            if (r1 >= r3) goto L15
            r0 = r5[r1]
            if (r0 != r4) goto L27
            if (r0 != 0) goto L1b
        L15:
            X.P6b r0 = X.EnumC63901P6b.PIXEL_FORMAT_YUV420
            r6.LIZIZ = r0
            r0 = 35
        L1b:
            android.util.Size[] r0 = r7.getOutputSizes(r0)
            java.util.List r0 = X.P7K.LIZ(r0)
            r6.LJIILIIL(r0, r8)
            return r2
        L27:
            int r1 = r1 + 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P7M.LJIIL(android.hardware.camera2.params.StreamConfigurationMap, com.ss.android.ttvecamera.TEFrameSizei):int");
    }

    @Override // X.P7K
    public final void LJIILIIL(List list, TEFrameSizei tEFrameSizei) {
        if (list != null && ((ArrayList) list).size() > 0) {
            this.LIZJ = PDA.LIZIZ(list, this.LIZJ);
        }
        ImageReader imageReader = this.LJIIJJI;
        if (imageReader != null) {
            imageReader.close();
        }
        TEFrameSizei tEFrameSizei2 = this.LIZJ;
        ImageReader newInstance = ImageReader.newInstance(tEFrameSizei2.width, tEFrameSizei2.height, P6E.LJII(this.LIZIZ), 1);
        this.LJIIJJI = newInstance;
        newInstance.setOnImageAvailableListener(new P7C(this), this.LIZLLL.getHandler());
    }
}
