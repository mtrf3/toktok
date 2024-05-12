package X;

import android.opengl.GLES30;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VGJ {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final FloatBuffer LJIIJJI;
    public final FloatBuffer LJIIL;

    public static int LIZ(int i, String str) {
        int glCreateShader = GLES30.glCreateShader(i);
        if (glCreateShader == 0) {
            return 0;
        }
        GLES30.glShaderSource(glCreateShader, str);
        GLES30.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES30.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            GLES30.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public VGJ(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        int[] iArr = new int[1];
        int i5 = 0;
        GLES30.glGenFramebuffers(1, iArr, 0);
        this.LJFF = iArr[0];
        int[] iArr2 = new int[2];
        GLES30.glGenBuffers(2, iArr2, 0);
        this.LJI = iArr2[0];
        float[] fArr = VGN.LIZ;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr);
        o.LJIIIIZZ(asFloatBuffer, "allocateDirect(GLConstan…(GLConstants.VERTEX_DATA)");
        this.LJIIJJI = asFloatBuffer;
        asFloatBuffer.position(0);
        this.LJII = iArr2[1];
        float[] fArr2 = VGN.LIZIZ;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer2.put(fArr2);
        o.LJIIIIZZ(asFloatBuffer2, "allocateDirect(GLConstan…Constants.TEX_COORD_DATA)");
        this.LJIIL = asFloatBuffer2;
        asFloatBuffer2.position(0);
        int LIZ = LIZ(35633, "attribute vec4 a_Position;\nattribute vec2 a_TexCoord;\nvarying vec2 v_TexCoord;\nvoid main() {\n    gl_Position = a_Position;\n    v_TexCoord = a_TexCoord;\n}");
        int LIZ2 = LIZ(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 v_TexCoord;\nuniform samplerExternalOES s_Texture;\nvoid main() {\n    gl_FragColor = texture2D(s_Texture, v_TexCoord);\n}");
        int glCreateProgram = GLES30.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES30.glAttachShader(glCreateProgram, LIZ);
            GLES30.glAttachShader(glCreateProgram, LIZ2);
            GLES30.glLinkProgram(glCreateProgram);
            int[] iArr3 = new int[1];
            GLES30.glGetProgramiv(glCreateProgram, 35714, iArr3, 0);
            if (iArr3[0] == 0) {
                GLES30.glDeleteProgram(glCreateProgram);
            } else {
                i5 = glCreateProgram;
            }
        }
        this.LJ = i5;
        GLES30.glUseProgram(i5);
        this.LJIIIIZZ = GLES30.glGetAttribLocation(i5, "a_Position");
        this.LJIIIZ = GLES30.glGetAttribLocation(i5, "a_TexCoord");
        this.LJIIJ = GLES30.glGetUniformLocation(i5, "s_Texture");
    }
}
