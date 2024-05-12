package X;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.benchmark.presenter.HWEncodeManager;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes19.dex */
public class ZTZ implements Runnable {
    public int LJLIL;
    public C89995ZTr LJLILLLLZI;
    public final /* synthetic */ HWEncodeManager LJLJI;

    public final void LIZ() {
        int i;
        try {
            int width = this.LJLJI.mSettings.getWidth();
            int height = this.LJLJI.mSettings.getHeight();
            HWEncodeManager hWEncodeManager = this.LJLJI;
            hWEncodeManager.mFrameRate = hWEncodeManager.mSettings.getFrameRate();
            FileInputStream fileInputStream = new FileInputStream(this.LJLJI.mYUVPath);
            int i2 = ((width * height) * 3) / 2;
            if (this.LJLJI.mSettings.useSurfaceInput()) {
                C89995ZTr LIZIZ = C89995ZTr.LIZIZ(EGL14.EGL_NO_CONTEXT, width, height, this.LJLJI.mEncode.LIZLLL);
                this.LJLILLLLZI = LIZIZ;
                if (LIZIZ == null) {
                    this.LJLJI.encodeRet = -1;
                    this.LJLJI.mStart = false;
                    return;
                }
                if (!EGL14.eglGetCurrentContext().equals(this.LJLILLLLZI.LIZ)) {
                    C89995ZTr c89995ZTr = this.LJLILLLLZI;
                    EGLDisplay eGLDisplay = c89995ZTr.LIZJ;
                    EGLSurface eGLSurface = c89995ZTr.LIZLLL;
                    if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, c89995ZTr.LIZ)) {
                        C89995ZTr.LIZ("eglMakeCurrent");
                    }
                }
                this.LJLJI.yuvTextureDrawer = new C89992ZTo();
                if (this.LJLJI.yuvTextureDrawer.LIZ() != 0) {
                    C47261Igj.LJIILL("HWEncodeManager");
                    this.LJLJI.encodeRet = -1;
                    this.LJLJI.mStart = false;
                    return;
                }
            }
            this.LJLJI.mEncode.LJ = new ZTY(this, width, height);
            while (this.LJLJI.mStart) {
                C89989ZTl c89989ZTl = new C89989ZTl();
                byte[] bArr = new byte[i2];
                c89989ZTl.LIZIZ = bArr;
                int read = fileInputStream.read(bArr, 0, i2);
                if (read <= 0) {
                    break;
                }
                if (read != i2) {
                    C47261Igj.LJIILL("HWEncodeManager");
                }
                HWEncodeManager hWEncodeManager2 = this.LJLJI;
                int i3 = hWEncodeManager2.mNewFrameRate;
                if (i3 > 0 && (i = hWEncodeManager2.mChangeFPSIndex) > 0 && this.LJLIL + 1 == i) {
                    hWEncodeManager2.mFrameRate = i3;
                    hWEncodeManager2.mNewFrameRate = 0;
                }
                c89989ZTl.LIZLLL = (this.LJLIL * 1000000) / hWEncodeManager2.mFrameRate;
                c89989ZTl.LJI = false;
                if (hWEncodeManager2.mSettings.useSurfaceInput()) {
                    c89989ZTl.LIZ = 17;
                    this.LJLJI.yuvTextureDrawer.LIZJ(width, c89989ZTl.LIZIZ, height);
                    c89989ZTl.LIZJ = this.LJLJI.yuvTextureDrawer.LJIIIZ;
                } else {
                    c89989ZTl.LIZ = 0;
                }
                while (true) {
                    int LIZLLL = this.LJLJI.mEncode.LIZLLL(c89989ZTl);
                    if (LIZLLL >= 0) {
                        break;
                    }
                    if (LIZLLL != -605) {
                        if (LIZLLL != -607) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("encode failed!!! ret: ");
                            LIZ.append(LIZLLL);
                            X1D.LIZIZ(LIZ);
                            C47261Igj.LJIILL("HWEncodeManager");
                        } else {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("encode the status is error,ret: ");
                            LIZ2.append(LIZLLL);
                            X1D.LIZIZ(LIZ2);
                            C47261Igj.LJIILL("HWEncodeManager");
                            break;
                        }
                    }
                    if (!this.LJLJI.mStart) {
                        break;
                    }
                }
                this.LJLJI.mInputFrames.put(Long.valueOf(c89989ZTl.LIZLLL), c89989ZTl);
                this.LJLIL++;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("inputFrames: ");
            LIZ3.append(this.LJLIL);
            X1D.LIZIZ(LIZ3);
            C47261Igj.LJIILJJIL("HWEncodeManager");
            C89989ZTl c89989ZTl2 = new C89989ZTl();
            if (this.LJLJI.mSettings.useSurfaceInput()) {
                this.LJLJI.yuvTextureDrawer.LIZIZ();
                this.LJLILLLLZI.LIZJ();
                c89989ZTl2.LIZ = 17;
            } else {
                c89989ZTl2.LIZ = 0;
            }
            c89989ZTl2.LIZLLL = (this.LJLIL * 1000000) / this.LJLJI.mFrameRate;
            c89989ZTl2.LJI = true;
            do {
                int LIZLLL2 = this.LJLJI.mEncode.LIZLLL(c89989ZTl2);
                if (LIZLLL2 >= 0) {
                    break;
                }
                if (LIZLLL2 != -605) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("encode failed!!! ret: ");
                    LIZ4.append(LIZLLL2);
                    X1D.LIZIZ(LIZ4);
                    C47261Igj.LJIILL("HWEncodeManager");
                }
            } while (this.LJLJI.mStart);
            fileInputStream.close();
        } catch (C89988ZTk e) {
            C38901fq.LJIIIZ(e);
            this.LJLJI.encodeRet = -608;
            this.LJLJI.mStart = false;
        } catch (IOException e2) {
            C38901fq.LJIIIZ(e2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ZTZ(HWEncodeManager hWEncodeManager) {
        this.LJLJI = hWEncodeManager;
    }
}
