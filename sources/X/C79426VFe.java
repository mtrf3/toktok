package X;

import android.opengl.GLES20;
import android.os.Bundle;
import defpackage.a1;

/* renamed from: X.VFe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79426VFe extends C79427VFf {
    public float LJJL;
    public float LJJLI;
    public float LJJLIIIIJ;
    public float LJJLIIIJ;
    public float LJJLIIIJILLIZJL;
    public float[] LJJLIIIJJI;
    public int LJJLIIIJJIZ;
    public int LJJLIIIJL;
    public int LJJLIIIJLJLI;
    public float LJJLIIIJLLLLLLLZ;
    public int LJJLIIJ;
    public int LJJLIL;
    public final float[] LJJLJ;
    public int LJJLJLI;
    public int LJJLL;
    public int LJJZ;
    public int LJJZZI;
    public int LJJZZIII;
    public int LJL;

    @Override // X.C79427VFf, X.C79433VFl
    public final void LJIILL() {
        if (this.LIZIZ == 36197) {
            if (this.LJJLIL >= 0) {
                this.LJ.getTransformMatrix(this.LJJLJ);
                GLES20.glUniformMatrix4fv(this.LJJLIL, 1, false, this.LJJLJ, 0);
            }
        } else {
            int i = this.LJJLIIIJL;
            if (i == 2) {
                GLES20.glTexParameteri(3553, 10242, 33648);
                GLES20.glTexParameteri(3553, 10243, 33648);
            } else if (i == 3) {
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
            } else {
                GLES20.glTexParameteri(3553, 10242, 10497);
                GLES20.glTexParameteri(3553, 10243, 10497);
            }
        }
        if (this.LJJLI < 0.0f) {
            if (this.LJJJZ == 0) {
                float f = (this.LJJZZI * 1.0f) / this.LJJZZIII;
                float f2 = (this.LJJLL * 1.0f) / this.LJJZ;
                float f3 = this.LJJIIJZLJL;
                float[] fArr = this.LJJLIIIJJI;
                if (f > f2) {
                    float f4 = f2 / f;
                    fArr[0] = 0.0f;
                    fArr[1] = (1.0f - f4) * f3;
                    fArr[2] = 1.0f;
                    fArr[3] = f4;
                } else {
                    float f5 = f / f2;
                    fArr[0] = (1.0f - f5) * f3;
                    fArr[1] = 0.0f;
                    fArr[2] = f5;
                    fArr[3] = 1.0f;
                }
            }
            int i2 = this.LJJLIIIJJIZ;
            float[] fArr2 = this.LJJLIIIJJI;
            GLES20.glUniform4f(i2, fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        }
        int i3 = this.LJJLIIIJLJLI;
        if (i3 >= 0) {
            int i4 = this.LJL;
            int i5 = this.LJJJZ;
            if (i4 != i5) {
                GLES20.glUniform1f(i3, i5);
                this.LJL = this.LJJJZ;
            }
        }
        super.LJIILL();
    }

    public C79426VFe(int i) {
        super(i);
        this.LJJLI = -1.0f;
        this.LJJLIIIJJIZ = -1;
        this.LJJLIIIJL = 2;
        this.LJJLIIIJLJLI = -1;
        this.LJJLIIIJLLLLLLLZ = 1.0f;
        this.LJJLIIJ = -1;
        this.LJJLJ = new float[16];
        this.LJJLJLI = -1;
        this.LJJLL = -1;
        this.LJJZ = -1;
        this.LJJZZI = -1;
        this.LJJZZIII = -1;
        this.LJL = -1;
        this.LIZ = 15;
        int i2 = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new GLSelectiveGaussianBlurFilter,this:");
        LIZ.append(toString());
        C48284IxE.LIZ(2, i2, "TR_GLSelectiveGaussianBlurFilter", X1D.LIZIZ(LIZ));
    }

    @Override // X.C79427VFf, X.C79433VFl, X.AbstractC79424VFc
    public final int LIZIZ(Bundle bundle) {
        this.LIZIZ = bundle.getInt("texture_type");
        this.LJJJJ = bundle.getFloat("strength", -1.0f);
        this.LJJLIIIJL = bundle.getInt("repeat_type", 2);
        this.LJJL = bundle.getFloat("edge_size", 0.0f);
        if (bundle.containsKey("x")) {
            this.LJJLI = bundle.getFloat("x", 0.0f);
            this.LJJLIIIIJ = bundle.getFloat("y", 0.0f);
            this.LJJLIIIJ = bundle.getFloat("width", 1.0f);
            this.LJJLIIIJILLIZJL = bundle.getFloat("height", 1.0f);
        } else {
            this.LJJIIJZLJL = bundle.getFloat("aspect_ratio", 0.5f);
            if (this.LJJLIIIJJI == null) {
                this.LJJLIIIJJI = new float[4];
            }
        }
        this.LJJLIIIJLLLLLLLZ = 1.0f / bundle.getFloat("scale", 1.0f);
        int LIZIZ = super.LIZIZ(bundle);
        if (LIZIZ == 0) {
            this.LJJLIIIJJIZ = GLES20.glGetUniformLocation(this.LJIILJJIL, "layoutCoord");
            this.LJJLIIIJLJLI = GLES20.glGetUniformLocation(this.LJIILJJIL, "processStage");
            this.LJJLIIJ = GLES20.glGetUniformLocation(this.LJIILJJIL, "blurAreaParam");
        }
        this.LJJLIL = GLES20.glGetUniformLocation(this.LJIILJJIL, "uSTMatrix");
        this.LJJLJLI = GLES20.glGetUniformLocation(this.LJIILJJIL, "repeadMode");
        GLES20.glUseProgram(this.LJIILJJIL);
        int i = this.LJJLJLI;
        if (i >= 0 && this.LIZIZ == 36197) {
            GLES20.glUniform1i(i, this.LJJLIIIJL);
        }
        int i2 = this.LJJLIIJ;
        if (i2 >= 0) {
            GLES20.glUniform2f(i2, this.LJJL, this.LJJLIIIJLLLLLLLZ);
        }
        float f = this.LJJLI;
        if (f >= 0.0f) {
            GLES20.glUniform4f(this.LJJLIIIJJIZ, f, this.LJJLIIIIJ, this.LJJLIIIJ, this.LJJLIIIJILLIZJL);
        }
        return LIZIZ;
    }

    @Override // X.C79427VFf, X.C79433VFl
    public final String LJIIL(int i) {
        String str;
        String str2;
        if (i != 11000) {
            if (i == 11001) {
                if (this.LIZIZ == 36197) {
                    str = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float gaussianAlpha;\nuniform vec4 layoutCoord;//x,y,w,h\nuniform float processStage;//0:stage1;1:stage2\nuniform vec2 blurAreaParam;//x:blur edge size;y:blur area scale\nuniform int repeadMode;//1:normal;2:mirror;3:clamp to edge;\n";
                    str2 = "// return 1 if v inside the box, return 0 otherwise\nfloat insideBox(vec2 v, vec2 bottomLeft, vec2 topRight) {\n    vec2 s = step(bottomLeft, v) - step(topRight, v);\n    return s.x * s.y;\n}\n//pointer to box edge distance\nfloat pointToBoxDistance(vec2 v, vec2 bottomLeft, vec2 topRight, float edge) {\n    vec2 distance = smoothstep(0.0, blurAreaParam.x, abs(v - (bottomLeft + topRight) / 2.0) - (topRight - bottomLeft) / 2.0);\n    return sqrt(distance.x * distance.x + distance.y * distance.y);\n}\n\nvoid main() {\n    vec2 stage1Coord = vec2((vTextureCoord.x - layoutCoord.x) / layoutCoord.z, (vTextureCoord.y - layoutCoord.y) / layoutCoord.w);\n    vec2 resetCoord = (1.0 - processStage) * stage1Coord + processStage * vTextureCoord;\n    vec2 oriBoxBottomLeft = vec2(layoutCoord.x, layoutCoord.y);\n    vec2 oriBoxTopRight = vec2(layoutCoord.x+layoutCoord.z, layoutCoord.y+layoutCoord.w);\n    if (insideBox(vTextureCoord, oriBoxBottomLeft, oriBoxTopRight) > 0.5) {\n        gl_FragColor = texture2D(sTexture, resetCoord);\n        return;\n    } else {\n        float scale = blurAreaParam.y * (1.0 - processStage) + processStage * 1.0;\n        if (resetCoord.y <= 0.0 || resetCoord.y >= 1.0) {\n            resetCoord.x = (resetCoord.x - 0.5) * scale + 0.5;\n            if (resetCoord.y < 0.0) {\n                resetCoord.y = resetCoord.y * scale;\n                if (repeadMode == 1) {\n                    resetCoord.y = 1.0 + resetCoord.y;\n                } else if (repeadMode == 2) {\n                    resetCoord.y = -resetCoord.y;\n                }\n            } else {\n                resetCoord.y = (resetCoord.y-1.0)*scale+1.0;\n                if (repeadMode == 1) {\n                    resetCoord.y = resetCoord.y - 1.0;\n                } else if (repeadMode == 2) {\n                    resetCoord.y = 2.0 - resetCoord.y;\n                }\n            }\n        } else {\n            if (resetCoord.x < 0.0) {\n                resetCoord.x = resetCoord.x * scale;\n            } else {\n                resetCoord.x = (resetCoord.x-1.0)*scale+1.0;\n            }\n            resetCoord.y = (resetCoord.y - 0.5) * scale + 0.5;\n        }\n        vec4 oriColor = texture2D(sTexture, resetCoord);\n        float edgeCoeff = pointToBoxDistance(vTextureCoord, oriBoxBottomLeft, oriBoxTopRight, blurAreaParam.x);\n        gl_FragColor = gaussianBlurKernel(oriColor, resetCoord, edgeCoeff);\n    }\n}";
                } else {
                    str = "precision highp float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float gaussianAlpha;\nuniform vec4 layoutCoord;//x,y,w,h\nuniform float processStage;//0:stage1;1:stage2\nuniform vec2 blurAreaParam;//x:blur edge size;y:blur area scale\n";
                    str2 = "// return 1 if v inside the box, return 0 otherwise\nfloat insideBox(vec2 v, vec2 bottomLeft, vec2 topRight) {\n    vec2 s = step(bottomLeft, v) - step(topRight, v);\n    return s.x * s.y;\n}\n//pointer to box edge distance\nfloat pointToBoxDistance(vec2 v, vec2 bottomLeft, vec2 topRight, float edge) {\n    vec2 distance = smoothstep(0.0, blurAreaParam.x, abs(v - (bottomLeft + topRight) / 2.0) - (topRight - bottomLeft) / 2.0);\n    return sqrt(distance.x * distance.x + distance.y * distance.y);\n}\n\nvoid main() {\n    vec2 stage1Coord = vec2((vTextureCoord.x - layoutCoord.x) / layoutCoord.z, (vTextureCoord.y - layoutCoord.y) / layoutCoord.w);\n    vec2 resetCoord = (1.0 - processStage) * stage1Coord + processStage * vTextureCoord;\n    vec2 oriBoxBottomLeft = vec2(layoutCoord.x, layoutCoord.y);\n    vec2 oriBoxTopRight = vec2(layoutCoord.x+layoutCoord.z, layoutCoord.y+layoutCoord.w);\n    if (insideBox(vTextureCoord, oriBoxBottomLeft, oriBoxTopRight) > 0.5) {\n        gl_FragColor = texture2D(sTexture, resetCoord);\n        return;\n    } else {\n        float scale = blurAreaParam.y * (1.0 - processStage) + processStage * 1.0;\n        if (resetCoord.y <= 0.0 || resetCoord.y >= 1.0) {\n            resetCoord.x = (resetCoord.x - 0.5) * scale + 0.5;\n            if (resetCoord.y < 0.0) {\n                resetCoord.y = resetCoord.y * scale;\n            } else {\n                resetCoord.y = (resetCoord.y-1.0)*scale+1.0;\n            }\n        } else {\n            if (resetCoord.x < 0.0) {\n                resetCoord.x = resetCoord.x * scale;\n            } else {\n                resetCoord.x = (resetCoord.x-1.0)*scale+1.0;\n            }\n            resetCoord.y = (resetCoord.y - 0.5) * scale + 0.5;\n        }\n        vec4 oriColor = texture2D(sTexture, resetCoord);\n        float edgeCoeff = pointToBoxDistance(vTextureCoord, oriBoxBottomLeft, oriBoxTopRight, blurAreaParam.x);\n        gl_FragColor = gaussianBlurKernel(oriColor, resetCoord, edgeCoeff);\n    }\n}\n";
                }
                if (this.LJJJJ == 1.0f || this.LJJLIIIJL == 3) {
                    return a1.LJ(str, "vec4 gaussianBlurKernel(vec4 oriColor, vec2 texCoord) {\n    return oriColor;\n}\n", str2);
                }
                return a1.LJ(str, "uniform float gaussianWeights[44];\nuniform int radius;\nuniform vec2 texelOffset;\nvec4 gaussianBlurKernel(vec4 oriColor, vec2 texCoord, float edgeCoeff) {\n    int curRadius = int(float(radius) * edgeCoeff);\n    vec4 sum = oriColor * gaussianWeights[0];\n    for (int i = curRadius + 1; i <= radius; i++) {\n        sum += 2.0 * oriColor * gaussianWeights[i];\n    }\n    for (int i = 1; i <= curRadius; i++) {\n        vec2 stepOffset = vec2(texelOffset.x * float(i), texelOffset.y * float(i));\n        sum += texture2D(sTexture, texCoord + stepOffset) * gaussianWeights[i];\n        sum += texture2D(sTexture, texCoord - stepOffset) * gaussianWeights[i];\n    }\n    return sum;\n}\n", str2);
            }
        } else if (this.LIZIZ == 36197) {
            return "uniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
        }
        return super.LJIIL(i);
    }

    @Override // X.C79427VFf, X.C79433VFl, X.AbstractC79424VFc
    public final VFZ LIZLLL(VFZ vfz, VG6 vg6) {
        this.LJJZ = vfz.LIZJ;
        this.LJJLL = vfz.LIZLLL;
        this.LJJZZIII = this.LJ.getViewportWidth();
        this.LJJZZI = this.LJ.getViewportHeight();
        return LJIL(vfz, vg6, false, this.LJIIJ);
    }

    @Override // X.C79433VFl
    public final int LJIJJLI(VFZ vfz, VG6 vg6) {
        if (vg6 == null) {
            this.LJIJJ = this.LJJZZIII;
            this.LJIJJLI = this.LJJZZI;
            this.LJJ = 0;
            this.LJIL = 0;
        } else {
            int i = this.LJJZZI;
            int i2 = this.LJJZZIII;
            float f = (i * 1.0f) / i2;
            int i3 = vfz.LIZLLL;
            int i4 = vfz.LIZJ;
            if (f > (i3 * 1.0f) / i4) {
                int min = Math.min(i2, i4);
                this.LJJII = min;
                this.LJJIII = (int) ((min * f) + 0.5f);
            } else {
                int min2 = Math.min(i, i3);
                this.LJJIII = min2;
                this.LJJII = (int) ((min2 / f) + 0.5f);
            }
            this.LJIJJ = this.LJJII;
            this.LJIJJLI = this.LJJIII;
            this.LJJ = 0;
            this.LJIL = 0;
        }
        return 0;
    }
}
