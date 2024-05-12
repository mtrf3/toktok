package X;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* renamed from: X.Yn5, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C88423Yn5 extends AbstractC88424Yn6 {
    public final int[] LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final /* synthetic */ TextureViewSurfaceTextureListenerC88419Yn1 LJIIIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C88423Yn5(TextureViewSurfaceTextureListenerC88419Yn1 textureViewSurfaceTextureListenerC88419Yn1, int i, int i2) {
        super(textureViewSurfaceTextureListenerC88419Yn1, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, i, 12325, i2, 12326, 0, 12344});
        this.LJIIIZ = textureViewSurfaceTextureListenerC88419Yn1;
        this.LIZJ = new int[1];
        this.LIZLLL = 8;
        this.LJ = 8;
        this.LJFF = 8;
        this.LJI = i;
        this.LJII = i2;
        this.LJIIIIZZ = 0;
    }

    public final int LIZ(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        if (!egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.LIZJ)) {
            return 0;
        }
        return this.LIZJ[0];
    }
}
