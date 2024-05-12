package X;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import defpackage.i0;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: X.VFn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79435VFn extends C79433VFl {
    public static final float[] LL = {0.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    public static final float[] LLD = {0.5f, 0.0f, 0.5f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    public static final float[] LLF = {1.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f};
    public static final float[] LLFF = {1.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.0f, 0.0f};
    public static final float[] LLFFF = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    public int LJJJIL;
    public int LJJJJ;
    public int LJJJJI;
    public float LJJJJIZL;
    public float LJJJJJ;
    public int LJJJJJL;
    public int LJJJJL;
    public int LJJJJLI;
    public final float[] LJJJJLL;
    public float[] LJJJJZ;
    public float[] LJJJJZI;
    public final float[] LJJJLIIL;
    public boolean LJJJLL;
    public boolean LJJJLZIJ;
    public final float[] LJJJZ;
    public final float[] LJJL;
    public C79436VFo LJJLI;
    public InterfaceC79442VFu LJJLIIIIJ;
    public boolean LJJLIIIJ;
    public boolean LJJLIIIJILLIZJL;
    public ScaleGestureDetectorOnScaleGestureListenerC79437VFp LJJLIIIJJI;
    public int LJJLIIIJJIZ;
    public int LJJLIIIJL;
    public int LJJLIIIJLJLI;
    public int LJJLIIIJLLLLLLLZ;
    public int LJJLIIJ;
    public int LJJLIL;
    public int LJJLJ;
    public float LJJLJLI;
    public float[] LJJLL;
    public float[][] LJJZ;
    public float LJJZZI;
    public boolean LJJZZIII;
    public float LJL;
    public float[] LJLI;
    public float[][] LJLIIIL;
    public float[][] LJLIIL;
    public short[][] LJLIL;
    public C79439VFr LJLILLLLZI;
    public FloatBuffer[] LJLJI;
    public FloatBuffer[] LJLJJI;
    public ShortBuffer[] LJLJJL;
    public float[] LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public Display LJLJLLL;
    public FloatBuffer LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public float[] LJLLL;
    public float[] LJLLLL;
    public float LJLLLLLL;
    public int LJLZ;
    public C87400YRw LJZ;
    public int LJZI;
    public C79438VFq LJZL;

    public final void LJIL() {
        this.LIZLLL = 7;
        this.LJJLIIIJILLIZJL = true;
        this.LJJLIIIJJI = new ScaleGestureDetectorOnScaleGestureListenerC79437VFp(this.LJIIIZ);
        this.LJLILLLLZI = new C79439VFr(this.LJIIIZ, this.LJLI);
        Class cls = Float.TYPE;
        this.LJLIIIL = (float[][]) Array.newInstance((Class<?>) cls, 2, 3200);
        this.LJLIIL = (float[][]) Array.newInstance((Class<?>) cls, 2, 3200);
        this.LJLIL = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 2, 3158);
        this.LJLJI = new FloatBuffer[2];
        this.LJLJJI = new FloatBuffer[2];
        this.LJLJJL = new ShortBuffer[2];
        this.LJJZ = (float[][]) Array.newInstance((Class<?>) cls, 2, 4);
        float[] fArr = new float[16];
        this.LJLJJLL = fArr;
        Matrix.setIdentityM(fArr, 0);
        int i = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new GLPanoramaFilter,this:");
        LIZ.append(this);
        C48284IxE.LIZ(2, i, "TR_GLPanoramaFilter", X1D.LIZIZ(LIZ));
    }

    @Override // X.C79433VFl, X.AbstractC79424VFc
    public AbstractC79424VFc LJ() {
        InterfaceC79442VFu interfaceC79442VFu = this.LJJLIIIIJ;
        if (interfaceC79442VFu != null) {
            interfaceC79442VFu.stop();
            this.LJJLIIIIJ = null;
        }
        C79438VFq c79438VFq = this.LJZL;
        if (c79438VFq != null) {
            c79438VFq.disable();
            this.LJZL = null;
        }
        this.LJJZZIII = false;
        return super.LJ();
    }

    public final void LJJI() {
        int i = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleDirectModeChange mDirectMode:");
        LIZ.append(this.LJJLJ);
        LIZ.append(", this:");
        LIZ.append(this);
        C48284IxE.LIZ(2, i, "TR_GLPanoramaFilter", X1D.LIZIZ(LIZ));
        int i2 = this.LJJLJ;
        if (i2 == 1) {
            LJJIIJ();
            C79445VFx c79445VFx = this.LJ;
            if (c79445VFx != null) {
                c79445VFx.unRegisterTouchListener(this.LJJLI);
                return;
            }
            return;
        }
        if (i2 == 2) {
            InterfaceC79442VFu interfaceC79442VFu = this.LJJLIIIIJ;
            if (interfaceC79442VFu != null) {
                interfaceC79442VFu.stop();
            }
            LJJII();
            return;
        }
        LJJIIJ();
        LJJII();
    }

    public final void LJJIFFI() {
        if (this.LJ == null) {
            C48284IxE.LIZ(2, this.LJIIIZ, "TR_GLPanoramaFilter", "Error: handleTouchScalerChange mSurfaceTexture is null");
            return;
        }
        int i = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleTouchScalerChange mEnableTouchScaler:");
        LIZ.append(this.LJJLIIIJILLIZJL);
        LIZ.append(", this:");
        LIZ.append(this);
        C48284IxE.LIZ(2, i, "TR_GLPanoramaFilter", X1D.LIZIZ(LIZ));
        if (this.LJJLIIIJILLIZJL) {
            this.LJJLIIIJJI.getClass();
            this.LJ.registerTouchListener(this.LJJLIIIJJI);
        } else {
            this.LJ.unRegisterTouchListener(this.LJJLIIIJJI);
            ScaleGestureDetectorOnScaleGestureListenerC79437VFp scaleGestureDetectorOnScaleGestureListenerC79437VFp = this.LJJLIIIJJI;
            scaleGestureDetectorOnScaleGestureListenerC79437VFp.getClass();
            scaleGestureDetectorOnScaleGestureListenerC79437VFp.LJLJI = new android.graphics.Matrix();
        }
    }

    public final void LJJII() {
        C79436VFo c79436VFo;
        C79445VFx c79445VFx = this.LJ;
        if (c79445VFx != null && (c79436VFo = this.LJJLI) != null) {
            if (this.LJZI == 2) {
                int i = this.LJIIIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("freezing touch,don't regist,this:");
                LIZ.append(this);
                C48284IxE.LIZ(2, i, "TR_GLPanoramaFilter", X1D.LIZIZ(LIZ));
                return;
            }
            c79445VFx.registerTouchListener(c79436VFo);
        }
    }

    public final void LJJIIJ() {
        InterfaceC79442VFu interfaceC79442VFu = this.LJJLIIIIJ;
        if (interfaceC79442VFu != null) {
            if (this.LJZI == 0) {
                interfaceC79442VFu.start();
                return;
            }
            int i = this.LJIIIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("freezing,don't start,this:");
            LIZ.append(this);
            C48284IxE.LIZ(2, i, "TR_GLPanoramaFilter", X1D.LIZIZ(LIZ));
        }
    }

    public C79435VFn(int i) {
        super(i, 8);
        this.LJJJJIZL = 1.0f;
        this.LJJJJLL = new float[16];
        this.LJJJJZ = new float[16];
        this.LJJJJZI = new float[16];
        this.LJJJLIIL = new float[16];
        this.LJJJZ = new float[16];
        this.LJJL = new float[16];
        this.LJJLIIIJ = true;
        this.LJJLIIIJJIZ = 2;
        this.LJJLIIIJL = 1;
        this.LJJLIIIJLJLI = 1;
        this.LJJLIIIJLLLLLLLZ = 360;
        this.LJJLIIJ = 360;
        this.LJJLIL = 180;
        this.LJJLJ = 1;
        this.LJJLJLI = 100.0f;
        this.LJJLL = new float[]{50.0f, 50.0f, 50.0f, 50.0f};
        this.LJJZZI = 0.03f;
        this.LJL = 0.042f;
        this.LJLI = new float[]{0.441f, 0.156f};
        this.LJLJL = -1;
        this.LJLJLJ = -1;
        this.LJLLI = -1;
        this.LJLLILLLL = -1;
        this.LJLLJ = -1;
        LJIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020e  */
    @Override // X.C79433VFl, X.AbstractC79424VFc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int LIZIZ(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79435VFn.LIZIZ(android.os.Bundle):int");
    }

    @Override // X.C79433VFl, X.AbstractC79424VFc
    public final void LJIIIZ(Bundle bundle) {
        if (bundle != null && this.LIZ == bundle.getInt("effect_type")) {
            int i = this.LJIIIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" setOption:");
            LIZ.append(bundle.toString());
            LIZ.append(",this:");
            LIZ.append(this);
            C48284IxE.LIZ(2, i, "TR_GLPanoramaFilter", X1D.LIZIZ(LIZ));
            if (bundle.getInt("action") != 134) {
                return;
            }
            InterfaceC79442VFu interfaceC79442VFu = this.LJJLIIIIJ;
            if (interfaceC79442VFu != null) {
                interfaceC79442VFu.stop();
                this.LJJLIIIIJ.reset();
                LJJIIJ();
            }
            C79436VFo c79436VFo = this.LJJLI;
            if (c79436VFo != null) {
                c79436VFo.reset();
                this.LJJLI.start();
            }
            ScaleGestureDetectorOnScaleGestureListenerC79437VFp scaleGestureDetectorOnScaleGestureListenerC79437VFp = this.LJJLIIIJJI;
            if (scaleGestureDetectorOnScaleGestureListenerC79437VFp == null || !this.LJJLIIIJILLIZJL) {
                return;
            }
            scaleGestureDetectorOnScaleGestureListenerC79437VFp.LJLJI = new android.graphics.Matrix();
            this.LJJLIIIJJI.getClass();
            return;
        }
        super.LJIIIZ(bundle);
    }

    @Override // X.C79433VFl
    public String LJIIL(int i) {
        if (i != 11000) {
            if (i != 11001) {
                return super.LJIIL(i);
            }
            int i2 = this.LJJLIIIJLJLI;
            if (i2 == 2) {
                if (this.LJJLIIIJLLLLLLLZ == 180) {
                    return "#define PI 3.14159265359\nprecision mediump float;\nvarying vec2 vTextureCoord;\nvarying vec3 verPosition;\nuniform sampler2D sTexture;\nuniform float expandCoef;\nuniform vec3 zOffset;\nuniform mat3 texScale;//one eye and two eye scale\nvec2 EACTransFunc(vec2 oriCoord, float expand) {\n    vec2 resultCoord;\n    float xStep = -1.0 / 6.0 + step(1.0 / 6.0, oriCoord.x) / 3.0 + step(3.0 / 6.0, oriCoord.x) / 3.0 + step(2.0 / 3.0, oriCoord.x) / 6.0;\n    float yStep = 0.0;\n    resultCoord.x = (atan(((oriCoord.x - xStep) * 6.0 - 1.0) / expand) / PI * 4.0 + 1.0) / 6.0 + xStep;\n    resultCoord.y = (atan(((oriCoord.y - yStep) * 2.0 - 1.0) / expand) / PI * 4.0 + 1.0) / 2.0 + yStep;\n    return resultCoord;\n}\nvoid main() {\n    vec3 eacResult = vec3(EACTransFunc(vTextureCoord, expandCoef), 1.0) * texScale;\n    gl_FragColor = step(0.0, -verPosition.z) * texture2D(sTexture, eacResult.xy);\n}";
                }
                return "#define PI 3.14159265359\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float expandCoef;\nuniform vec3 zOffset;\nuniform mat3 texScale;//one eye and two eye scale\nvec2 EACTransFunc(vec2 oriCoord, float expand) {\n    vec2 resultCoord;\n    float xStep = 1.0 / 3.0 * clamp(floor(oriCoord.x * 3.0), 0.0, 2.0);\n    float yStep = 0.5 * step(0.5, oriCoord.y);\n    resultCoord.x = (atan(((oriCoord.x - xStep) * 6.0 - 1.0) / expand) / PI * 4.0 + 1.0) / 6.0 + xStep;\n    resultCoord.y = (atan(((oriCoord.y - yStep) * 4.0 - 1.0) / expand) / PI * 4.0 + 1.0) / 4.0 + yStep;\n    return resultCoord;\n}\nvoid main() {\n    vec3 eacResult = vec3(EACTransFunc(vTextureCoord, expandCoef), 1.0) * texScale;\n    gl_FragColor = texture2D(sTexture,  eacResult.xy);\n}";
            }
            if (i2 == 3) {
                return "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float expandCoef;\nvarying vec3 verPosition;\nuniform vec3 zOffset;\nuniform int cubemapMode;\nuniform vec2 texOffset[6];\nuniform mat2 rotates[6];\nuniform mat3 texScale;//one eye and two eye scale\nvec2 cubeToTexture(vec3 cubeCoord, float expand) {\n    vec2 result;\n    float absX = abs(cubeCoord.x);\n    float absY = abs(cubeCoord.y);\n    float absZ = abs(cubeCoord.z);\n    int index;//0:left 1:front 2:right 3:top 4:back 5:bottom\n    if (-cubeCoord.z >= absX && -cubeCoord.z >= absY) {\n        result = vec2(cubeCoord.x, cubeCoord.y);\n        index = 1;\n    } else if (cubeCoord.z >= absX && cubeCoord.z >= absY) {\n        result = vec2(-cubeCoord.x, cubeCoord.y);\n        index = 4;\n    } else if (cubeCoord.y >= absX && cubeCoord.y >= absZ) {\n        result = vec2(cubeCoord.x, cubeCoord.z);\n        index = 3;\n    } else if (-cubeCoord.y >= absX && -cubeCoord.y >= absZ) {\n        result = vec2(cubeCoord.x, -cubeCoord.z);\n        index = 5;\n    } else if (cubeCoord.x >= absY && cubeCoord.x >= absZ) {\n        result = vec2(cubeCoord.z, cubeCoord.y);\n        index = 2;\n    } else {\n        result = vec2(-cubeCoord.z, cubeCoord.y);\n        index = 0;\n    }\n    result = result * rotates[index] / expand;\n    result = vec2((result.x + 1.0) / 6.0, (result.y + 1.0) / 4.0) + texOffset[index];\n    return result;\n}\nvec2 offsetCubicTransFunc(vec3 inCubePosition) {\n    inCubePosition = inCubePosition - zOffset;\n    inCubePosition = inCubePosition / max(max(abs(inCubePosition.x),abs(inCubePosition.y)),abs(inCubePosition.z));\n    return cubeToTexture(inCubePosition, expandCoef);\n}\nvoid main() {\n    vec3 result = vec3(offsetCubicTransFunc(verPosition),1.0) * texScale;\n    gl_FragColor = texture2D(sTexture, result.xy);\n}";
            }
            if (i2 == 4 || i2 == 5) {
                return "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float expandCoef;\nuniform vec3 zOffset;\nuniform mat3 texScale;//one eye and two eye scale\nvoid main() {\n    vec3 result = vec3((vTextureCoord - 0.5) / expandCoef + 0.5, 1.0) * texScale;\n    gl_FragColor = texture2D(sTexture, result.xy);\n}";
            }
            return super.LJIIL(i);
        }
        return "attribute vec4 aPosition;\nuniform mat4 u_MVPMatrix;\nuniform mat4 rotateMatrix;attribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec3 verPosition;void main() {\n  gl_Position =  u_MVPMatrix * rotateMatrix * aPosition;\n  vTextureCoord = aTextureCoord.xy;\n  verPosition = aPosition.xyz;}\n";
    }

    public final void LJJ(ShortBuffer shortBuffer) {
        float[] fArr = new float[16];
        Matrix.multiplyMM(fArr, 0, this.LJJJZ, 0, this.LJJJJZ, 0);
        Matrix.multiplyMM(fArr, 0, this.LJJJJLL, 0, fArr, 0);
        GLES20.glUniformMatrix4fv(this.LJJJIL, 1, false, fArr, 0);
        shortBuffer.position(0);
        GLES20.glBindBuffer(34963, this.LJLLI);
        GLES20.glDrawElements(4, shortBuffer.remaining(), 5123, 0);
        GLES20.glBindBuffer(34963, 0);
    }

    public final void LJJIII(int i) {
        this.LJLJI[i].position(0);
        GLES20.glVertexAttribPointer(this.LJIILL, 2, 5126, false, 8, (Buffer) this.LJLJI[i]);
        GLES20.glEnableVertexAttribArray(this.LJIILL);
        this.LJLJJI[i].position(0);
        GLES20.glVertexAttribPointer(this.LJIILLIIL, 2, 5126, false, 8, (Buffer) this.LJLJJI[i]);
        GLES20.glEnableVertexAttribArray(this.LJIILLIIL);
        this.LJLJJL[i].position(0);
        GLES20.glDrawElements(5, this.LJLJJL[i].remaining(), 5123, this.LJLJJL[i]);
    }

    public final void LJJIIJZLJL(boolean z) {
        if (this.LJJLIIIJJIZ != 2 || C56509MFt.LJIIJJI()) {
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Context context = C47988IsS.LIZLLL().LIZLLL;
        if (context != null) {
            ((WindowManager) C16880lQ.LLILL(context, "window")).getDefaultDisplay().getMetrics(displayMetrics);
        }
        int i = displayMetrics.widthPixels;
        if (i == this.LJLJL && displayMetrics.heightPixels == this.LJLJLJ && !z) {
            return;
        }
        this.LJLJL = i;
        int i2 = displayMetrics.heightPixels;
        this.LJLJLJ = i2;
        float f = (i / displayMetrics.xdpi) * 0.0254f;
        float f2 = (i2 / displayMetrics.ydpi) * 0.0254f;
        float f3 = f / 2.0f;
        float f4 = this.LJJZZI;
        float[] fArr = {Math.min((float) Math.atan(this.LJLILLLLZI.LIZ((f3 - f4) / this.LJL, 0.0f)[0]), (float) Math.toRadians(this.LJJLL[0])), Math.min((float) Math.atan(this.LJLILLLLZI.LIZ(f4 / this.LJL, 0.0f)[0]), (float) Math.toRadians(this.LJJLL[1])), Math.min((float) Math.atan(this.LJLILLLLZI.LIZ(0.0f, 0.032f / this.LJL)[1]), (float) Math.toRadians(this.LJJLL[2])), Math.min((float) Math.atan(this.LJLILLLLZI.LIZ(0.0f, (f2 - 0.032f) / this.LJL)[1]), (float) Math.toRadians(this.LJJLL[3]))};
        this.LJJZ[0][0] = (float) Math.tan(fArr[0]);
        this.LJJZ[0][1] = (float) Math.tan(fArr[1]);
        this.LJJZ[0][2] = (float) Math.tan(fArr[2]);
        this.LJJZ[0][3] = (float) Math.tan(fArr[3]);
        this.LJJZ[1][0] = (float) Math.tan(fArr[1]);
        this.LJJZ[1][1] = (float) Math.tan(fArr[0]);
        this.LJJZ[1][2] = (float) Math.tan(fArr[2]);
        this.LJJZ[1][3] = (float) Math.tan(fArr[3]);
        int i3 = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("realFov:");
        LIZ.append(Arrays.toString(fArr));
        LIZ.append("screenWInMeter:");
        LIZ.append(f);
        LIZ.append(" screenHInMeter:");
        LIZ.append(f2);
        C48284IxE.LIZ(2, i3, "TR_GLPanoramaFilter", X1D.LIZIZ(LIZ));
        float f5 = this.LJL;
        float f6 = f / f5;
        float f7 = f2 / f5;
        float f8 = this.LJJZZI;
        float f9 = 0.032f / f5;
        float tan = (float) (Math.tan(fArr[1]) + Math.tan(fArr[0]));
        float tan2 = (float) (Math.tan(fArr[3]) + Math.tan(fArr[2]));
        float tan3 = (float) Math.tan(fArr[0]);
        float tan4 = (float) Math.tan(fArr[1]);
        float tan5 = (float) Math.tan(fArr[2]);
        LJJIIZ(0, f6, f7, (f3 - f8) / f5, f9, tan, tan2, tan3, tan5);
        LJJIIZ(1, f6, f7, (f3 + f8) / f5, f9, tan, tan2, tan4, tan5);
    }

    public C79435VFn(int i, int i2) {
        super(i, 12);
        this.LJJJJIZL = 1.0f;
        this.LJJJJLL = new float[16];
        this.LJJJJZ = new float[16];
        this.LJJJJZI = new float[16];
        this.LJJJLIIL = new float[16];
        this.LJJJZ = new float[16];
        this.LJJL = new float[16];
        this.LJJLIIIJ = true;
        this.LJJLIIIJJIZ = 2;
        this.LJJLIIIJL = 1;
        this.LJJLIIIJLJLI = 1;
        this.LJJLIIIJLLLLLLLZ = 360;
        this.LJJLIIJ = 360;
        this.LJJLIL = 180;
        this.LJJLJ = 1;
        this.LJJLJLI = 100.0f;
        this.LJJLL = new float[]{50.0f, 50.0f, 50.0f, 50.0f};
        this.LJJZZI = 0.03f;
        this.LJL = 0.042f;
        this.LJLI = new float[]{0.441f, 0.156f};
        this.LJLJL = -1;
        this.LJLJLJ = -1;
        this.LJLLI = -1;
        this.LJLLILLLL = -1;
        this.LJLLJ = -1;
        LJIL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d6, code lost:
    
        if ((java.lang.Math.abs(r29.LJZ.LIZLLL - r2.LIZLLL) + (java.lang.Math.abs(r29.LJZ.LIZJ - r2.LIZJ) + (java.lang.Math.abs(r29.LJZ.LIZIZ - r2.LIZIZ) + java.lang.Math.abs(r4.LIZ - r2.LIZ)))) > 0.001d) goto L47;
     */
    @Override // X.C79433VFl, X.AbstractC79424VFc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.VFZ LIZLLL(X.VFZ r30, X.VG6 r31) {
        /*
            Method dump skipped, instructions count: 1389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79435VFn.LIZLLL(X.VFZ, X.VG6):X.VFZ");
    }

    @Override // X.C79433VFl, X.AbstractC79424VFc
    public final void LJI(int i, float f) {
        if (i != 103) {
            if (i != 104) {
                if (i != 111) {
                    super.LJI(i, f);
                    return;
                }
                this.LJJJJJ = f;
                int i2 = this.LJIIIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("set zoffset:");
                LIZ.append(f);
                C48284IxE.LIZ(2, i2, "TR_GLPanoramaFilter", X1D.LIZIZ(LIZ));
                return;
            }
            this.LJJZZI = f / 2.0f;
            int i3 = this.LJIIIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("eye disfance:");
            LIZ2.append(f);
            C48284IxE.LIZ(2, i3, "TR_GLPanoramaFilter", X1D.LIZIZ(LIZ2));
            return;
        }
        this.LJJLJLI = f;
        int i4 = this.LJIIIZ;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("perspective view:");
        LIZ3.append(f);
        C48284IxE.LIZ(2, i4, "TR_GLPanoramaFilter", X1D.LIZIZ(LIZ3));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0025. Please report as an issue. */
    @Override // X.C79433VFl, X.AbstractC79424VFc
    public final void LJII(int i, int i2) {
        C79436VFo c79436VFo;
        C79445VFx c79445VFx;
        boolean z = false;
        if (i != 1) {
            if (i != 101) {
                if (i != 102) {
                    if (i != 105) {
                        if (i != 106) {
                            if (i != 108) {
                                if (i != 109) {
                                    if (i != 128) {
                                        if (i != 129) {
                                            switch (i) {
                                                case 137:
                                                    this.LJZI = i2;
                                                    if (i2 == 0) {
                                                        LJJI();
                                                        return;
                                                    }
                                                    if (i2 != 1 && i2 != 2) {
                                                        return;
                                                    }
                                                    InterfaceC79442VFu interfaceC79442VFu = this.LJJLIIIIJ;
                                                    if (interfaceC79442VFu != null) {
                                                        interfaceC79442VFu.stop();
                                                    }
                                                    if (i2 != 2 || (c79445VFx = this.LJ) == null) {
                                                        return;
                                                    }
                                                    c79445VFx.unRegisterTouchListener(this.LJJLI);
                                                    return;
                                                case 138:
                                                    this.LJJJJLI = i2;
                                                    break;
                                                case 139:
                                                    ScaleGestureDetectorOnScaleGestureListenerC79437VFp scaleGestureDetectorOnScaleGestureListenerC79437VFp = this.LJJLIIIJJI;
                                                    if (scaleGestureDetectorOnScaleGestureListenerC79437VFp != null && this.LJJLIIIJILLIZJL) {
                                                        scaleGestureDetectorOnScaleGestureListenerC79437VFp.LJLJI = new android.graphics.Matrix();
                                                        this.LJJLIIIJJI.getClass();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        } else {
                                            if (i2 != 0) {
                                                z = true;
                                            }
                                            this.LJJLIIIJ = z;
                                            if (!z) {
                                                this.LJJJJZI = this.LJJJJZ;
                                                return;
                                            }
                                            return;
                                        }
                                    } else {
                                        this.LJJJLL = false;
                                        if (i2 != 0 && (c79436VFo = this.LJJLI) != null) {
                                            c79436VFo.reset();
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    this.LJJJJL = i2;
                                }
                            } else {
                                this.LJJJJJL = i2;
                            }
                        } else if (this.LJJLIIIIJ != null) {
                            if (i2 == 1) {
                                C79438VFq c79438VFq = this.LJZL;
                                if (c79438VFq != null) {
                                    c79438VFq.disable();
                                }
                                this.LJJLIIIIJ.stop();
                            } else {
                                C79438VFq c79438VFq2 = this.LJZL;
                                if (c79438VFq2 != null) {
                                    c79438VFq2.enable();
                                }
                                LJJIIJ();
                            }
                        }
                    } else {
                        this.LJJLJ = i2;
                        LJJI();
                        return;
                    }
                } else {
                    this.LJJLIIIJL = i2;
                    LJIJJLI(null, null);
                    return;
                }
            } else {
                this.LJJLIIIJJIZ = i2;
                return;
            }
        } else if (this.LJJLIIIIJ != null) {
            if (i2 == 3) {
                C79438VFq c79438VFq3 = this.LJZL;
                if (c79438VFq3 != null) {
                    c79438VFq3.disable();
                }
                this.LJJLIIIIJ.stop();
                this.LJJLIIIIJ.reset();
                this.LJJLI.getClass();
                this.LJJLI.reset();
                ScaleGestureDetectorOnScaleGestureListenerC79437VFp scaleGestureDetectorOnScaleGestureListenerC79437VFp2 = this.LJJLIIIJJI;
                scaleGestureDetectorOnScaleGestureListenerC79437VFp2.getClass();
                scaleGestureDetectorOnScaleGestureListenerC79437VFp2.LJLJI = new android.graphics.Matrix();
                this.LJZI = 0;
            } else if (i2 == 1) {
                C79438VFq c79438VFq4 = this.LJZL;
                if (c79438VFq4 != null) {
                    c79438VFq4.enable();
                }
                LJJIIJ();
                this.LJJLI.start();
                this.LJJLIIIJJI.getClass();
            }
        }
        int i3 = this.LJIIIZ;
        StringBuilder LIZJ = C06460Ne.LIZJ("setOption key:", i, " value:", i2, ", this:");
        LIZJ.append(this);
        C48284IxE.LIZ(2, i3, "TR_GLPanoramaFilter", X1D.LIZIZ(LIZJ));
        super.LJII(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x02ae, code lost:
    
        if (r4 != null) goto L68;
     */
    @Override // X.C79433VFl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIJJLI(X.VFZ r23, X.VG6 r24) {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79435VFn.LJIJJLI(X.VFZ, X.VG6):int");
    }

    public final void LJJIIZ(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9;
        float[] fArr;
        char c;
        float f10 = 0.0f;
        if (i == 0) {
            f9 = 0.0f;
        } else {
            f9 = 0.5f;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 40; i3++) {
            float f11 = 1.0f;
            float f12 = 39;
            float f13 = (i3 * 1.0f) / f12;
            int i4 = 0;
            do {
                float f14 = (i4 * f11) / f12;
                C79439VFr c79439VFr = this.LJLILLLLZI;
                float f15 = (f14 * f5) - f7;
                float f16 = (f13 * f6) - f8;
                c79439VFr.getClass();
                float sqrt = (float) Math.sqrt((f16 * f16) + (f15 * f15));
                if (sqrt - f10 < Math.ulp(f10)) {
                    fArr = new float[2];
                    fArr[i2] = f15;
                    fArr[1] = f16;
                    c = 0;
                } else {
                    float f17 = sqrt / 2.0f;
                    float f18 = sqrt / 3.0f;
                    float LIZIZ = sqrt - (c79439VFr.LIZIZ(f17 * f17) * f17);
                    while (true) {
                        float f19 = f17;
                        f17 = f18;
                        float f20 = f18 - f19;
                        if (Math.abs(f20) <= 1.0E-4f) {
                            break;
                        }
                        float LIZIZ2 = sqrt - (c79439VFr.LIZIZ(f18 * f18) * f18);
                        f18 -= (f20 / (LIZIZ2 - LIZIZ)) * LIZIZ2;
                        LIZIZ = LIZIZ2;
                    }
                    float f21 = f18 / sqrt;
                    c = 0;
                    fArr = new float[]{f15 * f21, f21 * f16};
                }
                float f22 = (fArr[c] + f3) / f;
                float f23 = (fArr[1] + f4) / f2;
                int i5 = ((i3 * 40) + i4) * 2;
                float[] fArr2 = this.LJLIIL[i];
                fArr2[i5] = (f22 * 2.0f) - 1.0f;
                int i6 = i5 + 1;
                fArr2[i6] = (f23 * 2.0f) - 1.0f;
                float[] fArr3 = this.LJLIIIL[i];
                fArr3[i5] = (f14 / 2.0f) + f9;
                fArr3[i6] = f13;
                i4++;
                f10 = 0.0f;
                f11 = 1.0f;
                i2 = 0;
            } while (i4 < 40);
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = 0;
            while (true) {
                short[] sArr = this.LJLIL[i];
                int i10 = i8 + 1;
                sArr[i8] = (short) i2;
                i8 = i10 + 1;
                sArr[i10] = (short) (i2 + 40);
                i9++;
                if (i9 >= 40) {
                    break;
                }
                if (i9 > 0) {
                    i2 = i7 % 2 == 0 ? i2 + 1 : i2 - 1;
                }
            }
            i2 += 40;
            i7++;
            if (i7 < 39) {
                if (i7 > 0) {
                    short[] sArr2 = this.LJLIL[i];
                    sArr2[i8] = sArr2[i8 - 1];
                    i8++;
                }
            } else {
                this.LJLJI[i] = i0.LJI(ByteBuffer.allocateDirect(this.LJLIIL[i].length * 4));
                FloatBuffer floatBuffer = this.LJLJI[i];
                floatBuffer.put(this.LJLIIL[i]);
                floatBuffer.position(0);
                this.LJLJJI[i] = i0.LJI(ByteBuffer.allocateDirect(this.LJLIIIL[i].length * 4));
                FloatBuffer floatBuffer2 = this.LJLJJI[i];
                floatBuffer2.put(this.LJLIIIL[i]);
                floatBuffer2.position(0);
                this.LJLJJL[i] = ByteBuffer.allocateDirect(this.LJLIL[i].length * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
                ShortBuffer shortBuffer = this.LJLJJL[i];
                shortBuffer.put(this.LJLIL[i]);
                shortBuffer.position(0);
                return;
            }
        }
    }
}
