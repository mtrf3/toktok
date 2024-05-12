package X;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.bef.effectsdk.BEFEffectNative;
import com.bef.effectsdk.OpenGLUtils;
import com.bef.effectsdk.ResourceFinder;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VGZ implements InterfaceC72616Sei {
    public static final float[] LJJJLL = {-1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f};
    public static final float[] LJJJLZIJ = {-1.0f, 1.0f, 0.0f, 0.0f, 1.0f, -1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};
    public static final short[] LJJJZ = {0, 1, 2, 0, 2, 3};
    public long LIZ;
    public ResourceFinder LIZIZ;
    public String LIZJ;
    public Long LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public float LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public int[] LJJII;
    public int[] LJJIII;
    public int[] LJJIIJ;
    public FloatBuffer LJJIIJZLJL;
    public FloatBuffer LJJIIZ;
    public ShortBuffer LJJIIZI;
    public int LJJIJ;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public int LJJIJIL;
    public int LJJIJL;
    public int[] LJJJJIZL;
    public int[] LJJJJJ;
    public int[] LJJJJJL;
    public int[] LJJJJL;
    public int[] LJJJJLI;
    public int[] LJJJJLL;
    public int[] LJJJJZ;
    public int[] LJJJJZI;
    public final int LJIIIIZZ = 480;
    public final int LJIIIZ = 270;
    public final boolean LJIILJJIL = true;
    public final float LJJIJLIJ = 1.0f;
    public final float LJJIL = 0.8314f;
    public final float LJJIZ = 0.8588f;
    public final float LJJJ = 1.0f;
    public final float LJJJI = 0.43f;
    public final float LJJJIL = 0.8f;
    public final float LJJJJ = 0.914f;
    public final float LJJJJI = 1.0f;
    public boolean LJJJLIIL = true;

    @Override // X.InterfaceC72616Sei
    public final void LJJLIIIJLJLI() {
        this.LJJJLIIL = false;
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJJJ() {
        int[] iArr = this.LJJJJIZL;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(1, iArr, 0);
        }
        int[] iArr2 = this.LJJJJJ;
        if (iArr2 != null) {
            GLES20.glDeleteTextures(1, iArr2, 0);
        }
        int[] iArr3 = this.LJJJJJL;
        if (iArr3 != null) {
            GLES20.glDeleteFramebuffers(1, iArr3, 0);
        }
        int[] iArr4 = this.LJJJJL;
        if (iArr4 != null) {
            GLES20.glDeleteTextures(1, iArr4, 0);
        }
        int[] iArr5 = this.LJJJJLI;
        if (iArr5 != null) {
            GLES20.glDeleteFramebuffers(1, iArr5, 0);
        }
        int[] iArr6 = this.LJJJJLL;
        if (iArr6 != null) {
            GLES20.glDeleteTextures(1, iArr6, 0);
        }
        int[] iArr7 = this.LJJJJZ;
        if (iArr7 != null) {
            GLES20.glDeleteFramebuffers(1, iArr7, 0);
        }
        int[] iArr8 = this.LJJJJZI;
        if (iArr8 != null) {
            GLES20.glDeleteTextures(1, iArr8, 0);
        }
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJJJI() {
        long j = this.LIZ;
        if (j != 0) {
            BEFEffectNative.nativeDestroyHandle(j);
            this.LIZ = 0L;
        }
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJJJJL() {
        ResourceFinder resourceFinder = this.LIZIZ;
        if (resourceFinder != null) {
            BEFEffectNative.nativeReleaseResourceFinder(this.LIZ, resourceFinder);
            this.LIZIZ = null;
        }
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJJZ() {
        int loadProgram = OpenGLUtils.loadProgram("attribute vec2 vPosition;\nattribute vec2 vTexCoord;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = vTexCoord;\n  gl_Position = vec4(vPosition.x, vPosition.y, 0.0, 1.0);\n}", "precision mediump float;\nuniform vec4 color1;\nuniform vec4 color2;\nuniform vec2 dir;\nuniform vec2 start;\nvarying vec2 texCoord;\nvoid main(){\nfloat factor = dot(texCoord - start,dir)/(dot(dir,dir));\ngl_FragColor = mix(color1,color2,factor);\n}");
        this.LJJIJ = loadProgram;
        this.LJJIJIIJI = GLES20.glGetUniformLocation(loadProgram, "color1");
        this.LJJIJIIJIL = GLES20.glGetUniformLocation(this.LJJIJ, "color2");
        this.LJJIJIL = GLES20.glGetUniformLocation(this.LJJIJ, "dir");
        this.LJJIJL = GLES20.glGetUniformLocation(this.LJJIJ, "start");
        GLES20.glGetAttribLocation(this.LJJIJ, "vTexCoord");
        int loadProgram2 = OpenGLUtils.loadProgram("attribute vec2 vPosition;\nattribute vec2 vTexCoord;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = vTexCoord;\n  gl_Position = vec4(vPosition.x, vPosition.y, 0.0, 1.0);\n}", "precision mediump float;\nuniform sampler2D sTexture;\nvarying vec2 texCoord;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, texCoord);\n}");
        this.LJIL = loadProgram2;
        this.LJJ = GLES20.glGetAttribLocation(loadProgram2, "vTexCoord");
        this.LJJI = GLES20.glGetAttribLocation(this.LJIL, "vPosition");
        this.LJJIFFI = GLES20.glGetUniformLocation(this.LJIL, "sTexture");
        int loadProgram3 = OpenGLUtils.loadProgram("attribute vec2 vPosition;\nattribute vec2 vTexCoord;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = vTexCoord;\n  gl_Position = vec4(vPosition.x, vPosition.y, 0.0, 1.0);\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sCamera;\nuniform float uCamera;\nvarying vec2 texCoord;\nvoid main() {\n  vec2 uv = texCoord;\n  float off = (1.0 - uCamera) / 2.0;\n  uv.x = uv.x * uCamera + off;\n  gl_FragColor = texture2D(sCamera, uv);\n}");
        this.LJIIZILJ = loadProgram3;
        this.LJIJJ = GLES20.glGetAttribLocation(loadProgram3, "vTexCoord");
        this.LJIJI = GLES20.glGetAttribLocation(this.LJIIZILJ, "vPosition");
        this.LJIJ = GLES20.glGetUniformLocation(this.LJIIZILJ, "sCamera");
        this.LJIJJLI = GLES20.glGetUniformLocation(this.LJIIZILJ, "uCamera");
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(80);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.LJJIIJZLJL = asFloatBuffer;
        if (asFloatBuffer != null) {
            asFloatBuffer.put(LJJJLL);
        }
        FloatBuffer floatBuffer = this.LJJIIJZLJL;
        if (floatBuffer != null) {
            floatBuffer.position(0);
        }
        int[] iArr = new int[1];
        this.LJJII = iArr;
        GLES20.glGenBuffers(1, iArr, 0);
        int[] iArr2 = this.LJJII;
        o.LJI(iArr2);
        GLES20.glBindBuffer(34962, iArr2[0]);
        GLES20.glBufferData(34962, 80, this.LJJIIJZLJL, 35044);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(80);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.LJJIIZ = asFloatBuffer2;
        if (asFloatBuffer2 != null) {
            asFloatBuffer2.put(LJJJLZIJ);
        }
        FloatBuffer floatBuffer2 = this.LJJIIZ;
        if (floatBuffer2 != null) {
            floatBuffer2.position(0);
        }
        int[] iArr3 = new int[1];
        this.LJJIII = iArr3;
        GLES20.glGenBuffers(1, iArr3, 0);
        int[] iArr4 = this.LJJIII;
        o.LJI(iArr4);
        GLES20.glBindBuffer(34962, iArr4[0]);
        GLES20.glBufferData(34962, 80, this.LJJIIZ, 35044);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(12);
        allocateDirect3.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect3.asShortBuffer();
        this.LJJIIZI = asShortBuffer;
        if (asShortBuffer != null) {
            asShortBuffer.put(LJJJZ);
        }
        ShortBuffer shortBuffer = this.LJJIIZI;
        if (shortBuffer != null) {
            shortBuffer.position(0);
        }
        int[] iArr5 = new int[1];
        this.LJJIIJ = iArr5;
        GLES20.glGenBuffers(1, iArr5, 0);
        int[] iArr6 = this.LJJIIJ;
        o.LJI(iArr6);
        GLES20.glBindBuffer(34963, iArr6[0]);
        GLES20.glBufferData(34963, 12, this.LJJIIZI, 35044);
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJLI() {
        LJJJJ();
        int i = this.LJ;
        int i2 = this.LJFF;
        int[] iArr = new int[1];
        this.LJJJJIZL = iArr;
        this.LJJJJJ = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int[] iArr2 = this.LJJJJIZL;
        o.LJI(iArr2);
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        GLES20.glGenTextures(1, this.LJJJJJ, 0);
        int[] iArr3 = this.LJJJJJ;
        o.LJI(iArr3);
        GLES20.glBindTexture(3553, iArr3[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        int[] iArr4 = this.LJJJJJ;
        o.LJI(iArr4);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr4[0], 0);
        int[] iArr5 = new int[1];
        this.LJJJJJL = iArr5;
        this.LJJJJL = new int[1];
        GLES20.glGenFramebuffers(1, iArr5, 0);
        int[] iArr6 = this.LJJJJJL;
        o.LJI(iArr6);
        GLES20.glBindFramebuffer(36160, iArr6[0]);
        GLES20.glGenTextures(1, this.LJJJJL, 0);
        int[] iArr7 = this.LJJJJL;
        o.LJI(iArr7);
        GLES20.glBindTexture(3553, iArr7[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        int[] iArr8 = this.LJJJJL;
        o.LJI(iArr8);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr8[0], 0);
        int[] iArr9 = new int[1];
        this.LJJJJLI = iArr9;
        this.LJJJJLL = new int[1];
        GLES20.glGenFramebuffers(1, iArr9, 0);
        int[] iArr10 = this.LJJJJLI;
        o.LJI(iArr10);
        GLES20.glBindFramebuffer(36160, iArr10[0]);
        GLES20.glGenTextures(1, this.LJJJJLL, 0);
        int[] iArr11 = this.LJJJJLL;
        o.LJI(iArr11);
        GLES20.glBindTexture(3553, iArr11[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        int[] iArr12 = this.LJJJJLL;
        o.LJI(iArr12);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr12[0], 0);
        int[] iArr13 = new int[1];
        this.LJJJJZ = iArr13;
        this.LJJJJZI = new int[1];
        this.LJI = (this.LJIIIZ * i2) / this.LJIIIIZZ;
        this.LJII = i2;
        GLES20.glGenFramebuffers(1, iArr13, 0);
        int[] iArr14 = this.LJJJJZ;
        o.LJI(iArr14);
        GLES20.glBindFramebuffer(36160, iArr14[0]);
        GLES20.glGenTextures(1, this.LJJJJZI, 0);
        int[] iArr15 = this.LJJJJZI;
        o.LJI(iArr15);
        GLES20.glBindTexture(3553, iArr15[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, this.LJI, this.LJII, 0, 6408, 5121, null);
        int[] iArr16 = this.LJJJJZI;
        o.LJI(iArr16);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr16[0], 0);
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJLIIIJJI() {
        this.LJIILIIL = 1.0f;
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJLIIIJJIZ() {
        int i = this.LJIL;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
        }
        int i2 = this.LJIIZILJ;
        if (i2 != 0) {
            GLES20.glDeleteProgram(i2);
        }
        int i3 = this.LJJIJ;
        if (i3 != 0) {
            GLES20.glDeleteProgram(i3);
        }
        int[] iArr = this.LJJII;
        if (iArr != null) {
            GLES20.glDeleteBuffers(1, iArr, 0);
        }
        int[] iArr2 = this.LJJIII;
        if (iArr2 != null) {
            GLES20.glDeleteBuffers(1, iArr2, 0);
        }
        int[] iArr3 = this.LJJIIJ;
        if (iArr3 != null) {
            GLES20.glDeleteBuffers(1, iArr3, 0);
        }
    }

    public final void finalize() {
        LJJJJJL();
        LJJJJI();
        LJJJJ();
        LJJLIIIJJIZ();
    }

    @Override // X.InterfaceC72616Sei
    public final int LJJJJL() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC72616Sei
    public final int LJJJLZIJ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJJI(String str) {
        this.LIZJ = str;
        this.LIZLLL = Long.valueOf(this.LIZ);
        BEFEffectNative.nativeSetStickerPath(this.LIZ, this.LIZJ);
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJJJLI(float f) {
        this.LJIIL = f;
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJJJLL(boolean z) {
        this.LJIILLIIL = z;
    }

    @Override // X.InterfaceC72616Sei
    public final Bitmap LJJJJZ(boolean z) {
        int[] iArr = this.LJJJJJL;
        o.LJI(iArr);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        if (z) {
            Bitmap LIZ = LIZ(this.LJ, this.LJFF);
            int min = Math.min(LIZ.getWidth(), LIZ.getHeight());
            Bitmap createBitmap = Bitmap.createBitmap(LIZ, (LIZ.getWidth() - min) / 2, (LIZ.getHeight() - min) / 2, min, min);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("toSquare bitmap image size = w");
            LIZ2.append(createBitmap.getWidth());
            LIZ2.append(" x h");
            LIZ2.append(createBitmap.getHeight());
            H78.LIZIZ("JEFF", X1D.LIZIZ(LIZ2));
            return createBitmap;
        }
        return LIZ(this.LJ, this.LJFF);
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJJLIIL(float f) {
        this.LJIIJ = f;
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJJLL(float f) {
        this.LJIIJJI = f;
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJLIIIIJ(boolean z) {
        ResourceFinder resourceFinder;
        LJJJJI();
        long nativeCreateHandle = BEFEffectNative.nativeCreateHandle(z);
        this.LIZ = nativeCreateHandle;
        if (nativeCreateHandle != 0 && (resourceFinder = this.LIZIZ) != null) {
            BEFEffectNative.nativeInitResourceFinder(nativeCreateHandle, resourceFinder, this.LJIIIZ, this.LJIIIIZZ, "android");
            BEFEffectNative.nativeSetOrientation(this.LIZ, 0);
            BEFEffectNative.nativeSetFrameOrientation(this.LIZ, 0);
            BEFEffectNative.nativeSetCameraPosition(this.LIZ, true);
        }
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJLIIIJ(boolean z) {
        this.LJIILL = z;
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJLIIIJL(DownloadableModelSupportResourceFinder downloadableModelSupportResourceFinder) {
        this.LIZIZ = downloadableModelSupportResourceFinder;
    }

    public final Bitmap LIZ(int i, int i2) {
        int i3 = i * i2;
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        IntBuffer wrap = IntBuffer.wrap(iArr);
        wrap.position(0);
        GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, wrap);
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i4 * i;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = iArr[i5 + i6];
                int i8 = i5 + i6;
                iArr2[i8] = (i7 & (-16711936)) | ((i7 << 16) & 16711680) | ((i7 >> 16) & 255);
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr2, i, i2, Bitmap.Config.ARGB_8888);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("createBitmapFromGLSurface bitmap image size = w");
        LIZ.append(createBitmap.getWidth());
        LIZ.append(" x h");
        LIZ.append(createBitmap.getHeight());
        H78.LIZIZ("JEFF", X1D.LIZIZ(LIZ));
        return createBitmap;
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJJJJ(boolean z, int i) {
        int i2;
        int[] iArr = this.LJJJJIZL;
        o.LJI(iArr);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glClearColor(this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL);
        GLES20.glClear(16384);
        if (this.LJJJLIIL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onDraw gradientProg=");
            LIZ.append(this.LJJIJ);
            H78.LIZIZ("NaviRender", X1D.LIZIZ(LIZ));
            GLES20.glUseProgram(this.LJJIJ);
            GLES20.glUniform4f(this.LJJIJIIJI, this.LJJIJLIJ, this.LJJIL, this.LJJIZ, this.LJJJ);
            GLES20.glUniform4f(this.LJJIJIIJIL, this.LJJJI, this.LJJJIL, this.LJJJJ, this.LJJJJI);
            GLES20.glUniform2f(this.LJJIJIL, -1.0f, 1.0f);
            GLES20.glUniform2f(this.LJJIJL, 1.0f, 0.0f);
            int[] iArr2 = this.LJJII;
            o.LJI(iArr2);
            GLES20.glBindBuffer(34962, iArr2[0]);
            GLES20.glVertexAttribPointer(this.LJJI, 2, 5126, false, 20, 0);
            GLES20.glEnableVertexAttribArray(this.LJJI);
            GLES20.glVertexAttribPointer(this.LJJ, 2, 5126, false, 20, 12);
            GLES20.glEnableVertexAttribArray(this.LJJ);
            int[] iArr3 = this.LJJIIJ;
            o.LJI(iArr3);
            GLES20.glBindBuffer(34963, iArr3[0]);
            GLES20.glDrawElements(4, 6, 5123, 0);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onDraw glProg = ");
        LIZ2.append(this.LJIL);
        H78.LIZIZ("NaviRender", X1D.LIZIZ(LIZ2));
        if (this.LIZJ != null) {
            Long l = this.LIZLLL;
            long j = this.LIZ;
            if (l == null || l.longValue() != j) {
                LJJJI(this.LIZJ);
            }
            if (z) {
                if (this.LJIILL) {
                    GLES20.glViewport(0, 0, this.LJI, this.LJII);
                    int[] iArr4 = this.LJJJJZ;
                    o.LJI(iArr4);
                    LIZIZ(1.0f, i, iArr4[0]);
                } else {
                    int i3 = this.LJFF;
                    float f = this.LJIIIZ * i3;
                    float f2 = f / (this.LJIIIIZZ * r6);
                    GLES20.glViewport(0, 0, this.LJ, i3);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("crop camera texture: mHeight=");
                    LIZ3.append(this.LJFF);
                    LIZ3.append(", mWidth=");
                    LIZ3.append(this.LJ);
                    LIZ3.append(", mCameraHeight=");
                    LIZ3.append(this.LJIIIIZZ);
                    LIZ3.append(", mCameraWidth=");
                    LIZ3.append(this.LJIIIZ);
                    LIZ3.append(", cropRatio=");
                    LIZ3.append(f2);
                    H78.LIZIZ("NaviRender", X1D.LIZIZ(LIZ3));
                    int[] iArr5 = this.LJJJJLI;
                    o.LJI(iArr5);
                    LIZIZ(f2, i, iArr5[0]);
                }
                GLES20.glFlush();
            }
            double nanoTime = System.nanoTime() / 1.0E9d;
            if (this.LJIILL) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("process algorithm: preview texture dimensions - mPreviewWidth=");
                LIZ4.append(this.LJI);
                LIZ4.append(", mPreviewHeight=");
                LIZ4.append(this.LJII);
                H78.LIZIZ("NaviRender", X1D.LIZIZ(LIZ4));
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("process frame: output texture dimensions - mPreviewWidth=");
                LIZ5.append(this.LJI);
                LIZ5.append(", mPreviewHeight=");
                LIZ5.append(this.LJII);
                H78.LIZIZ("NaviRender", X1D.LIZIZ(LIZ5));
                long j2 = this.LIZ;
                int[] iArr6 = this.LJJJJZI;
                o.LJI(iArr6);
                BEFEffectNative.nativeProcessAlgorithm(j2, iArr6[0], this.LJI, this.LJII, nanoTime);
                long j3 = this.LIZ;
                int[] iArr7 = this.LJJJJZI;
                o.LJI(iArr7);
                int i4 = iArr7[0];
                int[] iArr8 = this.LJJJJL;
                o.LJI(iArr8);
                BEFEffectNative.nativeProcessFrame(j3, i4, iArr8[0], this.LJI, this.LJII, nanoTime);
            } else {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("process algorithm: preview texture dimensions - mWidth=");
                LIZ6.append(this.LJ);
                LIZ6.append(", mHeight=");
                LIZ6.append(this.LJFF);
                H78.LIZIZ("NaviRender", X1D.LIZIZ(LIZ6));
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("process frame: output texture dimensions - mWidth=");
                LIZ7.append(this.LJ);
                LIZ7.append(", mHeight=");
                LIZ7.append(this.LJFF);
                H78.LIZIZ("NaviRender", X1D.LIZIZ(LIZ7));
                long j4 = this.LIZ;
                int[] iArr9 = this.LJJJJLL;
                o.LJI(iArr9);
                BEFEffectNative.nativeProcessAlgorithm(j4, iArr9[0], this.LJ, this.LJFF, nanoTime);
                if (this.LJIILLIIL) {
                    int[] iArr10 = this.LJJJJLL;
                    o.LJI(iArr10);
                    i2 = iArr10[0];
                } else {
                    int[] iArr11 = this.LJJJJJ;
                    o.LJI(iArr11);
                    i2 = iArr11[0];
                }
                long j5 = this.LIZ;
                int[] iArr12 = this.LJJJJL;
                o.LJI(iArr12);
                BEFEffectNative.nativeProcessFrame(j5, i2, iArr12[0], this.LJ, this.LJFF, nanoTime);
            }
        } else {
            GLES20.glViewport(0, 0, this.LJ, this.LJFF);
            int[] iArr13 = this.LJJJJJ;
            o.LJI(iArr13);
            int i5 = iArr13[0];
            int[] iArr14 = this.LJJJJJL;
            o.LJI(iArr14);
            LIZIZ(0.0f, i5, iArr14[0]);
        }
        if (this.LJIILJJIL) {
            GLES20.glViewport(0, 0, this.LJ, this.LJFF);
            int[] iArr15 = this.LJJJJL;
            o.LJI(iArr15);
            LIZIZ(0.0f, iArr15[0], 0);
            GLES20.glFlush();
        }
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJL(int i, int i2) {
        this.LJ = i;
        this.LJFF = i2;
    }

    public final void LIZIZ(float f, int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        GLES20.glBindFramebuffer(36160, i2);
        if (f > 0.0f) {
            z = true;
            i3 = this.LJIIZILJ;
            i4 = 36197;
            i5 = this.LJIJ;
            i6 = this.LJIJJ;
            i7 = this.LJIJI;
            int[] iArr = this.LJJIII;
            o.LJI(iArr);
            i8 = iArr[0];
        } else {
            z = false;
            i3 = this.LJIL;
            i4 = 3553;
            i5 = this.LJJIFFI;
            i6 = this.LJJ;
            i7 = this.LJJI;
            int[] iArr2 = this.LJJII;
            o.LJI(iArr2);
            i8 = iArr2[0];
        }
        GLES20.glUseProgram(i3);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(i4, i);
        GLES20.glUniform1i(i5, 0);
        if (z) {
            GLES20.glUniform1f(this.LJIJJLI, f);
        }
        GLES20.glBindBuffer(34962, i8);
        GLES20.glVertexAttribPointer(i7, 2, 5126, false, 20, 0);
        GLES20.glEnableVertexAttribArray(i7);
        GLES20.glVertexAttribPointer(i6, 2, 5126, false, 20, 12);
        GLES20.glEnableVertexAttribArray(i6);
        int[] iArr3 = this.LJJIIJ;
        o.LJI(iArr3);
        GLES20.glBindBuffer(34963, iArr3[0]);
        GLES20.glDrawElements(4, 6, 5123, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJJIL(int[] iArr, float[] fArr, float[] fArr2) {
        BEFEffectNative.touchMoveEvent(this.LIZ, iArr, fArr, fArr2);
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJJJZI(int[] iArr, float[] fArr, float[] fArr2) {
        BEFEffectNative.touchBeginEvent(this.LIZ, iArr, fArr, fArr2);
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJLIIIJILLIZJL(int[] iArr, float[] fArr, float[] fArr2) {
        BEFEffectNative.touchEndEvent(this.LIZ, iArr, fArr, fArr2);
    }

    @Override // X.InterfaceC72616Sei
    public final void LJJJJIZL(int i, int i2, int i3, String str) {
        StringBuilder LIZJ = C06460Ne.LIZJ("sendMessage, type=", i, ", arg1=", i2, ", arg2=");
        LIZJ.append(i3);
        LIZJ.append(", arg3=");
        LIZJ.append(str);
        H78.LIZIZ("JEFF", X1D.LIZIZ(LIZJ));
        BEFEffectNative.nativeSendMessage(this.LIZ, i, i2, i3, str);
    }
}
