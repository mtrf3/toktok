package X;

import android.graphics.SurfaceTexture;
import android.media.ImageReader;
import android.view.Surface;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class P7I extends P7K {
    public SurfaceTexture LJIIJJI;
    public final int LJIIL;
    public ImageReader[] LJIILIIL;
    public final Surface[] LJIILJJIL;

    @Override // X.P7K
    public final int LJIIJJI() {
        return 8;
    }

    @Override // X.P7K
    public final void LJIILJJIL() {
    }

    @Override // X.P7K
    public final Surface LIZJ() {
        Surface[] surfaceArr = this.LJIILJJIL;
        if (surfaceArr != null) {
            return surfaceArr[0];
        }
        return null;
    }

    @Override // X.P7K
    public final int LJIIJ() {
        if (this.LJIIJJI != null) {
            return this.LJIIL;
        }
        return -1;
    }

    @Override // X.P7K
    public final void LJIILL() {
        Surface[] surfaceArr;
        Surface surface;
        super.LJIILL();
        ImageReader[] imageReaderArr = this.LJIILIIL;
        if (imageReaderArr != null) {
            for (ImageReader imageReader : imageReaderArr) {
                if (imageReader != null) {
                    imageReader.close();
                }
            }
            this.LJIILIIL = null;
        }
        if (this.LJIIJJI != null && (surfaceArr = this.LJIILJJIL) != null && (surface = surfaceArr[0]) != null) {
            surface.release();
        }
    }

    @Override // X.P7K
    public final SurfaceTexture LJI() {
        return this.LJIIJJI;
    }

    @Override // X.P7K
    public final Surface[] LJIIIIZZ() {
        return this.LJIILJJIL;
    }

    @Override // X.P7K
    public final void LJIJJLI(SurfaceTexture surfaceTexture) {
        Surface surface;
        if (this.LJIIJJI == null) {
            return;
        }
        Surface[] surfaceArr = this.LJIILJJIL;
        if (surfaceArr != null && (surface = surfaceArr[0]) != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture2 = this.LJIIJJI;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        this.LJIIJJI = surfaceTexture;
        this.LJIILJJIL[0] = new Surface(this.LJIIJJI);
        P7P p7p = this.LIZ;
        if (p7p != null && (p7p instanceof P7S)) {
            ((P7S) p7p).LIZ(this.LJIIJJI, true);
        }
    }

    public P7I(C63915P6p c63915P6p, X10 x10) {
        super(c63915P6p, x10);
        SurfaceTexture surfaceTexture = c63915P6p.LIZLLL;
        this.LJIIJJI = surfaceTexture;
        this.LJIIL = c63915P6p.LJ;
        int i = this.LJFF;
        this.LJIILIIL = new ImageReader[i];
        Surface[] surfaceArr = new Surface[surfaceTexture != null ? i + 1 : i];
        this.LJIILJJIL = surfaceArr;
        if (surfaceTexture != null) {
            surfaceArr[0] = new Surface(this.LJIIJJI);
        }
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
        throw new UnsupportedOperationException("Method not decompiled: X.P7I.LJIIL(android.hardware.camera2.params.StreamConfigurationMap, com.ss.android.ttvecamera.TEFrameSizei):int");
    }

    @Override // X.P7K
    public final void LJIILIIL(List list, TEFrameSizei tEFrameSizei) {
        if (list != null && ((ArrayList) list).size() > 0) {
            this.LIZJ = PDA.LIZIZ(list, this.LIZJ);
        }
        SurfaceTexture surfaceTexture = this.LJIIJJI;
        if (surfaceTexture != null) {
            TEFrameSizei tEFrameSizei2 = this.LIZJ;
            surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
        }
        for (int i = 0; i < this.LJFF; i++) {
            ImageReader[] imageReaderArr = this.LJIILIIL;
            TEFrameSizei tEFrameSizei3 = this.LIZJ;
            imageReaderArr[i] = ImageReader.newInstance(tEFrameSizei3.width, tEFrameSizei3.height, P6E.LJII(this.LIZIZ), 1);
            this.LJIILIIL[i].setOnImageAvailableListener(new P7B(this), this.LIZLLL.getHandler());
            if (this.LJIIJJI != null) {
                this.LJIILJJIL[i + 1] = this.LJIILIIL[i].getSurface();
            } else {
                this.LJIILJJIL[i] = this.LJIILIIL[i].getSurface();
            }
        }
    }
}
