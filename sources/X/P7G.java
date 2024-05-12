package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class P7G extends P7K {
    public SurfaceTexture LJIIJJI;
    public SurfaceTexture LJIIL;
    public Surface LJIILIIL;
    public Surface LJIILJJIL;
    public EnumC63904P6e LJIILL;
    public final float[] LJIILLIIL;
    public int LJIIZILJ;
    public boolean LJIJ;
    public final P7F LJIJI;

    @Override // X.P7K
    public final int LJIIJJI() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // X.P7K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL() {
        /*
            r4 = this;
            android.view.Surface r0 = r4.LJIILIIL
            if (r0 == 0) goto L7
            r0.release()
        L7:
            android.graphics.SurfaceTexture r0 = r4.LJIIJJI
            if (r0 == 0) goto Le
            r0.release()
        Le:
            int r0 = r4.LJIIZILJ
            r3 = 0
            if (r0 != 0) goto L38
            r2 = 1
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L39
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r3)
            r4.LJIIJJI = r0
        L21:
            android.view.Surface r1 = new android.view.Surface
            android.graphics.SurfaceTexture r0 = r4.LJIIJJI
            r1.<init>(r0)
            r4.LJIILIIL = r1
            X.P7P r1 = r4.LIZ
            boolean r0 = r1 instanceof X.P7S
            if (r0 == 0) goto L37
            X.P7S r1 = (X.P7S) r1
            android.graphics.SurfaceTexture r0 = r4.LJIIJJI
            r1.LIZ(r0, r2)
        L37:
            return
        L38:
            r2 = 0
        L39:
            android.graphics.SurfaceTexture r1 = new android.graphics.SurfaceTexture
            int r0 = r4.LJIIZILJ
            r1.<init>(r0)
            r4.LJIIJJI = r1
            if (r2 == 0) goto L21
            r1.detachFromGLContext()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P7G.LJIILJJIL():void");
    }

    @Override // X.P7K
    public final void LJIILLIIL() {
        SurfaceTexture surfaceTexture = this.LJIIJJI;
        if (surfaceTexture != null && Build.VERSION.SDK_INT >= 26 && !surfaceTexture.isReleased()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("releaseSurfaceTexture, mSurfaceTexture = ");
            LIZ.append(this.LJIIJJI);
            C63922P6w.LIZLLL("TESurfaceTextureProvider", X1D.LIZIZ(LIZ));
            this.LJIIJJI.release();
        }
    }

    @Override // X.P7K
    public final void LJIJ() {
        C63922P6w.LIZLLL("TESurfaceTextureProvider", "remove surface texture");
        this.LJIIL = null;
        this.LJIILL = EnumC63904P6e.NONE;
    }

    @Override // X.P7K
    public final void LJJIFFI() {
        this.LJIJI.onFrameAvailable(this.LJIIJJI);
    }

    @Override // X.P7K
    public final Surface LIZJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get surface = ");
        LIZ.append(this.LJIILIIL);
        C63922P6w.LIZLLL("TESurfaceTextureProvider", X1D.LIZIZ(LIZ));
        return this.LJIILIIL;
    }

    @Override // X.P7K
    public final Surface LJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getSurface surface is ");
        LIZ.append(this.LJIILJJIL);
        C63922P6w.LIZLLL("TESurfaceTextureProvider", X1D.LIZIZ(LIZ));
        return this.LJIILJJIL;
    }

    @Override // X.P7K
    public final EnumC63904P6e LJFF() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get operation is ");
        LIZ.append(this.LJIILL);
        LIZ.append(" ,this is");
        LIZ.append(this);
        C63922P6w.LIZLLL("TESurfaceTextureProvider", X1D.LIZIZ(LIZ));
        return this.LJIILL;
    }

    @Override // X.P7K
    public final SurfaceTexture LJII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get surface texture is ");
        LIZ.append(this.LJIIL);
        LIZ.append(" ,ooperation is ");
        LIZ.append(this.LJIILL);
        LIZ.append(" ,this is");
        LIZ.append(this);
        C63922P6w.LIZLLL("TESurfaceTextureProvider", X1D.LIZIZ(LIZ));
        return this.LJIIL;
    }

    @Override // X.P7K
    public final void LJIILL() {
        super.LJIILL();
        Surface surface = this.LJIILIIL;
        if (surface != null) {
            surface.release();
            this.LJIILIIL = null;
        }
    }

    @Override // X.P7K
    public final void LJIIZILJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeSurface surface is ");
        LIZ.append(this.LJIILJJIL);
        C63922P6w.LIZLLL("TESurfaceTextureProvider", X1D.LIZIZ(LIZ));
        this.LJIILJJIL = null;
        this.LJIILL = EnumC63904P6e.NONE;
    }

    @Override // X.P7K
    public final SurfaceTexture LJI() {
        return this.LJIIJJI;
    }

    @Override // X.P7K
    public final int LJIIJ() {
        return this.LJIIZILJ;
    }

    @Override // X.P7K
    public final void LJIJJ(EnumC63904P6e enumC63904P6e) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSurface surface is ");
        LIZ.append(this.LJIILJJIL);
        C63922P6w.LIZLLL("TESurfaceTextureProvider", X1D.LIZIZ(LIZ));
        this.LJIILJJIL = null;
        this.LJIILL = enumC63904P6e;
    }

    @Override // X.P7K
    public final void LJIJJLI(SurfaceTexture surfaceTexture) {
        Surface surface = this.LJIILIIL;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture2 = this.LJIIJJI;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        this.LJIIJJI = surfaceTexture;
        this.LJIILIIL = new Surface(this.LJIIJJI);
        P7F p7f = this.LJIJI;
        SurfaceTexture surfaceTexture3 = this.LJIIJJI;
        if (surfaceTexture3 != null) {
            surfaceTexture3.setOnFrameAvailableListener(p7f, this.LIZLLL.getHandler());
        }
        P7P p7p = this.LIZ;
        if (p7p != null && (p7p instanceof P7S)) {
            ((P7S) p7p).LIZ(this.LJIIJJI, true);
        }
    }

    @Override // X.P7K
    public final void LJJI(int i) {
        this.LJIIZILJ = i;
    }

    public P7G(C63915P6p c63915P6p, X10 x10) {
        super(c63915P6p, x10);
        this.LJIILL = EnumC63904P6e.NONE;
        this.LJIILLIIL = new float[16];
        this.LJIJ = true;
        this.LJIJI = new P7F(this);
        SurfaceTexture surfaceTexture = c63915P6p.LIZLLL;
        this.LJIIJJI = surfaceTexture;
        if (surfaceTexture == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("only surface = ");
            LIZ.append(c63915P6p.LJI);
            C63922P6w.LIZLLL("TESurfaceTextureProvider", X1D.LIZIZ(LIZ));
            this.LJIILIIL = c63915P6p.LJI;
            return;
        }
        this.LJIIZILJ = c63915P6p.LJ;
        this.LJIILIIL = new Surface(this.LJIIJJI);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("new surface = ");
        LIZ2.append(this.LJIILIIL);
        C63922P6w.LIZLLL("TESurfaceTextureProvider", X1D.LIZIZ(LIZ2));
    }

    @Override // X.P7K
    public final int LJIIL(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        if (this.LIZLLL.LLJJJJLIIL().LLILZ) {
            List<TEFrameSizei> LIZ = P7K.LIZ(streamConfigurationMap.getOutputSizes(MediaRecorder.class));
            ArrayList arrayList = (ArrayList) P7K.LIZ(outputSizes);
            arrayList.retainAll(LIZ);
            LJIILIIL(arrayList, tEFrameSizei);
            return 0;
        }
        LJIILIIL(P7K.LIZ(outputSizes), tEFrameSizei);
        return 0;
    }

    @Override // X.P7K
    public final void LJIILIIL(List list, TEFrameSizei tEFrameSizei) {
        if (this.LJIIJJI != null) {
            if (list != null && list.size() > 0) {
                P75 p75 = this.LJIIIIZZ;
                if (p75 != null) {
                    TEFrameSizei LIZ = ((P74) p75).LIZ(list);
                    if (LIZ != null) {
                        this.LIZJ = LIZ;
                    } else {
                        if (tEFrameSizei == null) {
                            tEFrameSizei = this.LIZJ;
                        }
                        this.LIZJ = PDA.LIZIZ(list, tEFrameSizei);
                    }
                } else {
                    if (tEFrameSizei == null) {
                        tEFrameSizei = this.LIZJ;
                    }
                    this.LIZJ = PDA.LIZIZ(list, tEFrameSizei);
                }
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("previewSize = ");
            LIZ2.append(tEFrameSizei);
            LIZ2.append(" mSize = ");
            LIZ2.append(this.LIZJ);
            LIZ2.append("mPreviewSizeCallback = ");
            LIZ2.append(this.LJIIIIZZ);
            LIZ2.append(" deviceSupportedSizes = ");
            LIZ2.append(list);
            C63922P6w.LIZLLL("TESurfaceTextureProvider", X1D.LIZIZ(LIZ2));
            SurfaceTexture surfaceTexture = this.LJIIJJI;
            TEFrameSizei tEFrameSizei2 = this.LIZJ;
            surfaceTexture.setDefaultBufferSize(tEFrameSizei2.width, tEFrameSizei2.height);
            P7F p7f = this.LJIJI;
            SurfaceTexture surfaceTexture2 = this.LJIIJJI;
            if (surfaceTexture2 != null) {
                surfaceTexture2.setOnFrameAvailableListener(p7f, this.LIZLLL.getHandler());
            }
        }
    }

    @Override // X.P7K
    public final void LJJ(SurfaceTexture surfaceTexture, EnumC63904P6e enumC63904P6e) {
        this.LJIILL = enumC63904P6e;
        this.LJIIL = surfaceTexture;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set surface texture is ");
        LIZ.append(this.LJIIL);
        LIZ.append(" ,ooperation is ");
        LIZ.append(this.LJIILL);
        LIZ.append(" ,this is");
        LIZ.append(this);
        C63922P6w.LIZLLL("TESurfaceTextureProvider", X1D.LIZIZ(LIZ));
    }
}
