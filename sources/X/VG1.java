package X;

import android.opengl.GLES20;
import android.util.AndroidRuntimeException;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes15.dex */
public final class VG1 implements VGC {
    public final int LIZ;
    public final C34821Yg LIZIZ;
    public final ReentrantLock LIZJ;
    public final VGE LIZLLL;
    public final int LJ;
    public int LJFF;
    public final int LJI;

    @Override // X.VGD
    public final int LIZIZ() {
        int LIZIZ = this.LIZIZ.LIZIZ();
        int i = this.LJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append(" add ref ");
        LIZ.append(LIZIZ);
        C48284IxE.LIZ(2, i, "ITexture", X1D.LIZIZ(LIZ));
        return LIZIZ;
    }

    @Override // X.VGD
    public final int LIZJ() {
        int LIZJ = this.LIZIZ.LIZJ();
        int i = this.LJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append(" dec ref ");
        LIZ.append(LIZJ);
        C48284IxE.LIZ(2, i, "ITexture", X1D.LIZIZ(LIZ));
        if (LIZJ == 1) {
            VG2 vg2 = (VG2) this.LIZLLL;
            synchronized (vg2.LIZ) {
                if (this.LJFF > 0) {
                    VG0 vg0 = vg2.LIZIZ;
                    if (vg0 != null) {
                        int i2 = vg0.LJLZ;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("release texture = ");
                        LIZ2.append(this);
                        C48284IxE.LIZ(2, i2, "TextureFactory", X1D.LIZIZ(LIZ2));
                    }
                    LIZLLL();
                } else {
                    VG0 vg02 = vg2.LIZIZ;
                    if (vg02 != null) {
                        int i3 = vg02.LJLZ;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("add texture = ");
                        LIZ3.append(this);
                        LIZ3.append("size = ");
                        LIZ3.append(vg2.LIZ.size());
                        C48284IxE.LIZ(2, i3, "TextureFactory", X1D.LIZIZ(LIZ3));
                    }
                    vg2.LIZ.add(this);
                }
            }
            return 0;
        }
        if (LIZJ >= 1) {
            return 0;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("reference idx ");
        LIZ4.append(LIZJ - 1);
        LIZ4.append(" app abort!!");
        throw new RuntimeException(new Exception(X1D.LIZIZ(LIZ4)));
    }

    public final void LIZLLL() {
        int i = this.LJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append("release = ");
        LIZ.append(this.LIZ);
        C48284IxE.LIZ(2, i, "ITexture", X1D.LIZIZ(LIZ));
        lock();
        GLES20.glDeleteTextures(1, new int[]{this.LIZ}, 0);
        unlock();
        int i2 = this.LJI;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this);
        LIZ2.append("release end = ");
        C79062V1e.LJII(LIZ2, this.LIZ, LIZ2, 2, i2, "ITexture");
    }

    @Override // X.VGC
    public final int lock() {
        if (!this.LIZJ.isHeldByCurrentThread()) {
            this.LIZJ.lock();
            return this.LIZ;
        }
        throw new AndroidRuntimeException("Dead lock!!");
    }

    @Override // X.VGC
    public final void unlock() {
        this.LIZJ.unlock();
    }

    @Override // X.VGC
    public final int LIZ() {
        return this.LJ;
    }

    public VG1(int i, int i2, VGE vge, int i3) {
        this.LJI = -1;
        this.LJI = i3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new texture = ");
        LIZ.append(i);
        C48284IxE.LIZ(2, i3, "ITexture", X1D.LIZIZ(LIZ));
        this.LIZ = i;
        this.LIZLLL = vge;
        this.LIZIZ = new C34821Yg(5, 0);
        this.LIZJ = new ReentrantLock();
        this.LJ = i2;
    }
}
