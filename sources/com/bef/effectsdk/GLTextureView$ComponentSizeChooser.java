package com.bef.effectsdk;

import X.TextureViewSurfaceTextureListenerC05030Hr;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* loaded from: classes.dex */
public class GLTextureView$ComponentSizeChooser extends GLTextureView$BaseConfigChooser {
    public int mAlphaSize;
    public int mBlueSize;
    public int mDepthSize;
    public int mGreenSize;
    public int mRedSize;
    public int mStencilSize;
    public int[] mValue;
    public final /* synthetic */ TextureViewSurfaceTextureListenerC05030Hr this$0;

    @Override // com.bef.effectsdk.GLTextureView$BaseConfigChooser
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        for (EGLConfig eGLConfig : eGLConfigArr) {
            int findConfigAttrib = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12325, 0);
            int findConfigAttrib2 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12326, 0);
            if (findConfigAttrib >= this.mDepthSize && findConfigAttrib2 >= this.mStencilSize) {
                int findConfigAttrib3 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12324, 0);
                int findConfigAttrib4 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12323, 0);
                int findConfigAttrib5 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12322, 0);
                int findConfigAttrib6 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12321, 0);
                if (findConfigAttrib3 == this.mRedSize && findConfigAttrib4 == this.mGreenSize && findConfigAttrib5 == this.mBlueSize && findConfigAttrib6 == this.mAlphaSize) {
                    return eGLConfig;
                }
            }
        }
        return null;
    }

    private int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.mValue)) {
            return this.mValue[0];
        }
        return i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GLTextureView$ComponentSizeChooser(final X.TextureViewSurfaceTextureListenerC05030Hr r5, int r6, int r7, int r8, int r9, int r10, int r11) {
        /*
            r4 = this;
            r4.this$0 = r5
            r0 = 13
            int[] r3 = new int[r0]
            r1 = 0
            r0 = 12324(0x3024, float:1.727E-41)
            r3[r1] = r0
            r2 = 1
            r3[r2] = r6
            r1 = 2
            r0 = 12323(0x3023, float:1.7268E-41)
            r3[r1] = r0
            r0 = 3
            r3[r0] = r7
            r1 = 4
            r0 = 12322(0x3022, float:1.7267E-41)
            r3[r1] = r0
            r0 = 5
            r3[r0] = r8
            r1 = 6
            r0 = 12321(0x3021, float:1.7265E-41)
            r3[r1] = r0
            r0 = 7
            r3[r0] = r9
            r1 = 8
            r0 = 12325(0x3025, float:1.7271E-41)
            r3[r1] = r0
            r0 = 9
            r3[r0] = r10
            r1 = 10
            r0 = 12326(0x3026, float:1.7272E-41)
            r3[r1] = r0
            r0 = 11
            r3[r0] = r11
            r1 = 12
            r0 = 12344(0x3038, float:1.7298E-41)
            r3[r1] = r0
            r4.<init>(r3)
            int[] r0 = new int[r2]
            r4.mValue = r0
            r4.mRedSize = r6
            r4.mGreenSize = r7
            r4.mBlueSize = r8
            r4.mAlphaSize = r9
            r4.mDepthSize = r10
            r4.mStencilSize = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.GLTextureView$ComponentSizeChooser.<init>(X.0Hr, int, int, int, int, int, int):void");
    }
}
