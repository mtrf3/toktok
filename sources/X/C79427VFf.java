package X;

import android.opengl.GLES20;
import android.os.Bundle;

/* renamed from: X.VFf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79427VFf extends C79433VFl {
    public int LJJJIL;
    public float LJJJJ;
    public boolean LJJJJI;
    public int LJJJJIZL;
    public int LJJJJJ;
    public int LJJJJJL;
    public int LJJJJL;
    public float LJJJJLI;
    public float LJJJJLL;
    public float[] LJJJJZ;
    public float LJJJJZI;
    public int LJJJLIIL;
    public int LJJJLL;
    public float LJJJLZIJ;
    public int LJJJZ;

    @Override // X.C79433VFl
    public final void LJIILJJIL() {
        if (this.LJJJJZI < 1.0f) {
            GLES20.glDisable(3042);
        }
    }

    @Override // X.C79433VFl
    public void LJIILL() {
        if (!this.LJJJJI) {
            int i = this.LJJJJIZL;
            if (i >= 0) {
                GLES20.glUniform1fv(i, this.LJJJIL + 1, this.LJJJJZ, 0);
            }
            int i2 = this.LJJJJJL;
            if (i2 >= 0) {
                GLES20.glUniform1i(i2, this.LJJJIL);
            }
            this.LJJJJI = true;
        }
        int i3 = this.LJJJJJL;
        if (i3 >= 0) {
            GLES20.glUniform1i(i3, this.LJJJIL);
        }
        int i4 = this.LJJJJJ;
        if (i4 >= 0) {
            GLES20.glUniform2f(i4, this.LJJJJLI, this.LJJJJLL);
        }
        float f = this.LJJJJZI;
        if (f < 1.0f) {
            int i5 = this.LJJJJL;
            if (i5 >= 0) {
                GLES20.glUniform1f(i5, f);
            }
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
        }
    }

    public C79427VFf(int i) {
        super(i, 10);
        this.LJJJJ = 2.0f;
        this.LJJJJIZL = -1;
        this.LJJJJJ = -1;
        this.LJJJJJL = -1;
        this.LJJJJL = -1;
        this.LJJJJZI = 1.0f;
        this.LJJJZ = -1;
        this.LIZLLL = 6;
        int i2 = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new GLGaussianBlurFilter,this:");
        LIZ.append(this);
        C48284IxE.LIZ(2, i2, "TR_GLGaussianBlurFilter", X1D.LIZIZ(LIZ));
    }

    @Override // X.C79433VFl, X.AbstractC79424VFc
    public int LIZIZ(Bundle bundle) {
        if (super.LIZIZ(bundle) != 0) {
            C79445VFx c79445VFx = this.LJ;
            if (c79445VFx != null) {
                c79445VFx.notifyError(10, this.LIZ, "super.init(bundle) != TR_OK");
                return -1;
            }
            return -1;
        }
        this.LJJJJIZL = GLES20.glGetUniformLocation(this.LJIILJJIL, "gaussianWeights");
        this.LJJJJJ = GLES20.glGetUniformLocation(this.LJIILJJIL, "texelOffset");
        this.LJJJJJL = GLES20.glGetUniformLocation(this.LJIILJJIL, "radius");
        this.LJJJJL = GLES20.glGetUniformLocation(this.LJIILJJIL, "gaussianAlpha");
        float f = bundle.getFloat("strength", -1.0f);
        if (f > 1.0f) {
            LJJ(f);
        } else {
            LJJ(2.0f);
        }
        this.LJJJJZI = bundle.getFloat("alpha", 1.0f);
        int i = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GLGaussianBlurFilter init,this:");
        LIZ.append(this);
        C48284IxE.LIZ(2, i, "TR_GLGaussianBlurFilter", X1D.LIZIZ(LIZ));
        return 0;
    }

    @Override // X.C79433VFl, X.AbstractC79424VFc
    public final void LJIIIZ(Bundle bundle) {
        if (bundle != null && this.LIZ == bundle.getInt("effect_type")) {
            int i = this.LJIIIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setOption:");
            LIZ.append(bundle.toString());
            LIZ.append(",this:");
            LIZ.append(this);
            C48284IxE.LIZ(2, i, "TR_GLGaussianBlurFilter", X1D.LIZIZ(LIZ));
            if (bundle.getInt("action") != 20) {
                return;
            }
            float f = bundle.getFloat("float_value", -1.0f);
            if (f == this.LJJJJ || f <= 0.0f) {
                return;
            }
            LJJ(f);
            int i2 = this.LJIIIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("set strength:");
            LIZ2.append(this.LJJJJ);
            LIZ2.append(",this:");
            LIZ2.append(this);
            C48284IxE.LIZ(2, i2, "TR_GLGaussianBlurFilter", X1D.LIZIZ(LIZ2));
        }
    }

    @Override // X.C79433VFl
    public String LJIIL(int i) {
        if (i != 11001) {
            return super.LJIIL(i);
        }
        return "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float gaussianWeights[44];\nuniform int radius;\nuniform vec2 texelOffset;\nuniform float gaussianAlpha;\nvoid main() {\n    vec4 sum = texture2D(sTexture, vTextureCoord) * gaussianWeights[0];\n    for (int i = 1; i <= radius; i++) {\n        vec2 stepOffset = vec2(texelOffset.x * float(i), texelOffset.y * float(i));\n        sum += texture2D(sTexture, vTextureCoord + stepOffset) * gaussianWeights[i];\n        sum += texture2D(sTexture, vTextureCoord - stepOffset) * gaussianWeights[i];\n    }\n    gl_FragColor = vec4(sum.rgb, gaussianAlpha);\n}\n";
    }

    public final void LJJ(float f) {
        float max = Math.max(Math.min(f, 26.0f), 1.0f);
        this.LJJJJ = max;
        this.LJJJIL = (int) Math.floor(Math.sqrt(Math.log(Math.sqrt(Math.pow(this.LJJJJ, 2.0d) * 6.283185307179586d) * 0.00390625f) * Math.pow(max, 2.0d) * (-2.0d)));
        int i = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateGaussianWeights sigma:");
        LIZ.append(this.LJJJJ);
        LIZ.append(",mBlurRadius:");
        C79062V1e.LJII(LIZ, this.LJJJIL, LIZ, 2, i, "TR_GLGaussianBlurFilter");
        this.LJJJJZ = new float[this.LJJJIL + 1];
        for (int i2 = 0; i2 <= this.LJJJIL; i2++) {
            float[] fArr = this.LJJJJZ;
            double d = this.LJJJJ;
            fArr[i2] = (float) (Math.exp((-Math.pow(i2, 2.0d)) / (Math.pow(d, 2.0d) * 2.0d)) * (1.0d / Math.sqrt(Math.pow(d, 2.0d) * 6.283185307179586d)));
        }
        float f2 = this.LJJJJZ[0];
        for (int i3 = 1; i3 <= this.LJJJIL; i3++) {
            f2 += this.LJJJJZ[i3] * 2.0f;
        }
        for (int i4 = 0; i4 <= this.LJJJIL; i4++) {
            float[] fArr2 = this.LJJJJZ;
            fArr2[i4] = fArr2[i4] / f2;
        }
        this.LJJJJI = false;
    }

    @Override // X.C79433VFl, X.AbstractC79424VFc
    public VFZ LIZLLL(VFZ vfz, VG6 vg6) {
        if (this.LJJJJ == 1.0f) {
            return vfz;
        }
        C79445VFx c79445VFx = this.LJ;
        if (c79445VFx != null) {
            c79445VFx.currentEffectProcessBegin(this.LIZ);
        }
        VFZ LJIL = LJIL(vfz, vg6, true, false);
        C79445VFx c79445VFx2 = this.LJ;
        if (c79445VFx2 != null) {
            c79445VFx2.currentEffectProcessEnd(this.LIZ);
        }
        return LJIL;
    }

    @Override // X.C79433VFl, X.AbstractC79424VFc
    public final void LJI(int i, float f) {
        if (i != 20 || f == this.LJJJJ) {
            return;
        }
        LJJ(f);
        int i2 = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set strength:");
        LIZ.append(this.LJJJJ);
        LIZ.append(",this:");
        LIZ.append(this);
        C48284IxE.LIZ(2, i2, "TR_GLGaussianBlurFilter", X1D.LIZIZ(LIZ));
    }

    public final VFZ LJIL(VFZ vfz, VG6 vg6, boolean z, boolean z2) {
        int i = this.LJJJLL;
        int i2 = vfz.LIZLLL;
        if (i != i2 || this.LJJJLIIL != vfz.LIZJ) {
            this.LJJJLIIL = vfz.LIZJ;
            this.LJJJLL = i2;
            float sqrt = (float) Math.sqrt(((r0 * 1.0f) * i2) / 172800.0f);
            this.LJJJLZIJ = sqrt;
            this.LJJJLZIJ = Math.max(sqrt, 1.0f);
            int i3 = this.LJIIIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("tex w:");
            LIZ.append(this.LJJJLIIL);
            LIZ.append(",h:");
            LIZ.append(this.LJJJLL);
            LIZ.append(",ratio:");
            LIZ.append(this.LJJJLZIJ);
            C48284IxE.LIZ(1, i3, "TR_GLGaussianBlurFilter", X1D.LIZIZ(LIZ));
        }
        int i4 = this.LJJJZ;
        if (i4 == -1 || i4 == 0) {
            this.LJJJJLI = (1.0f / vfz.LIZJ) * this.LJJJLZIJ;
            this.LJJJJLL = 0.0f;
        } else {
            this.LJJJJLI = 0.0f;
            this.LJJJJLL = (1.0f / vfz.LIZLLL) * this.LJJJLZIJ;
        }
        VFZ LIZLLL = super.LIZLLL(vfz, vg6);
        if (z) {
            this.LJJJJLI = 0.0f;
            this.LJJJJLL = (1.0f / vfz.LIZLLL) * this.LJJJLZIJ;
            if (z2) {
                super.LIZLLL(LIZLLL, null);
                return null;
            }
            return super.LIZLLL(LIZLLL, vg6);
        }
        return LIZLLL;
    }
}
