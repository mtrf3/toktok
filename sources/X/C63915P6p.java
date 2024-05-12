package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.ss.android.ttvecamera.TEFrameSizei;

/* renamed from: X.P6p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C63915P6p {
    public final boolean LIZ;
    public final TEFrameSizei LIZIZ;
    public final P7P LIZJ;
    public final SurfaceTexture LIZLLL;
    public int LJ;
    public final int LJFF;
    public final Surface LJI;
    public final EnumC63904P6e LJII;
    public final EnumC63901P6b LJIIIIZZ;
    public boolean LJIIIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProviderSettings: [mIsPreview = ");
        LIZ.append(this.LIZ);
        LIZ.append(", mSize = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mListener = ");
        LIZ.append(this.LIZJ);
        LIZ.append(", mSurfaceTexture = ");
        LIZ.append(this.LIZLLL);
        LIZ.append(", mTextureOES = ");
        LIZ.append(this.LJ);
        LIZ.append(", mImageReaderCount = ");
        LIZ.append(this.LJFF);
        LIZ.append(", mPrimary=");
        return C19U.LIZ(LIZ, this.LJIIIZ, "]", LIZ);
    }

    public C63915P6p(C63915P6p c63915P6p) {
        this.LIZ = true;
        this.LJII = EnumC63904P6e.NONE;
        this.LJIIIIZZ = EnumC63901P6b.PIXEL_FORMAT_Count;
        this.LJIIIZ = true;
        this.LIZ = c63915P6p.LIZ;
        this.LIZIZ = c63915P6p.LIZIZ;
        this.LIZJ = c63915P6p.LIZJ;
        this.LIZLLL = c63915P6p.LIZLLL;
        this.LJ = c63915P6p.LJ;
        this.LJFF = c63915P6p.LJFF;
    }

    public final boolean LIZ(C63915P6p c63915P6p) {
        if (c63915P6p != null && this.LIZ == c63915P6p.LIZ) {
            TEFrameSizei tEFrameSizei = this.LIZIZ;
            int i = tEFrameSizei.width;
            TEFrameSizei tEFrameSizei2 = c63915P6p.LIZIZ;
            if (i == tEFrameSizei2.width && tEFrameSizei.height == tEFrameSizei2.height && this.LIZJ == c63915P6p.LIZJ && this.LIZLLL == c63915P6p.LIZLLL && this.LJ == c63915P6p.LJ && this.LJFF == c63915P6p.LJFF && this.LJIIIZ == c63915P6p.LJIIIZ) {
                return true;
            }
        }
        return false;
    }

    public C63915P6p(TEFrameSizei tEFrameSizei, P7P p7p, SurfaceTexture surfaceTexture, EnumC63901P6b enumC63901P6b) {
        this.LIZ = true;
        this.LJII = EnumC63904P6e.NONE;
        this.LJIIIIZZ = EnumC63901P6b.PIXEL_FORMAT_Count;
        this.LJIIIZ = true;
        this.LIZIZ = tEFrameSizei;
        this.LIZJ = p7p;
        this.LIZLLL = surfaceTexture;
        this.LIZ = false;
        this.LJIIIIZZ = enumC63901P6b;
    }

    public C63915P6p(TEFrameSizei tEFrameSizei, P63 p63, boolean z, SurfaceTexture surfaceTexture, int i) {
        this.LIZ = true;
        this.LJII = EnumC63904P6e.NONE;
        this.LJIIIIZZ = EnumC63901P6b.PIXEL_FORMAT_Count;
        this.LJIIIZ = true;
        this.LIZIZ = tEFrameSizei;
        this.LIZJ = p63;
        this.LIZLLL = surfaceTexture;
        this.LJ = i;
        this.LIZ = z;
        this.LJIIIIZZ = EnumC63901P6b.PIXEL_FORMAT_OpenGL_OES;
        this.LJI = null;
    }

    public C63915P6p(TEFrameSizei tEFrameSizei, P7P p7p, boolean z, SurfaceTexture surfaceTexture, int i) {
        this.LIZ = true;
        this.LJII = EnumC63904P6e.NONE;
        this.LJIIIIZZ = EnumC63901P6b.PIXEL_FORMAT_Count;
        this.LJIIIZ = true;
        this.LIZIZ = tEFrameSizei;
        this.LIZJ = p7p;
        this.LIZLLL = surfaceTexture;
        this.LJ = i;
        this.LIZ = z;
        this.LJIIIIZZ = EnumC63901P6b.PIXEL_FORMAT_OpenGL_OES;
    }

    public C63915P6p(TEFrameSizei tEFrameSizei, P63 p63, boolean z, SurfaceTexture surfaceTexture, EnumC63901P6b enumC63901P6b, int i) {
        this.LIZ = true;
        this.LJII = EnumC63904P6e.NONE;
        this.LJIIIIZZ = EnumC63901P6b.PIXEL_FORMAT_Count;
        this.LJIIIZ = true;
        this.LIZIZ = tEFrameSizei;
        this.LIZJ = p63;
        this.LIZLLL = surfaceTexture;
        this.LIZ = z;
        this.LJIIIIZZ = enumC63901P6b;
        this.LJFF = i;
    }
}
