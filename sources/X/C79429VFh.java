package X;

import android.opengl.GLES20;
import android.os.Bundle;

/* renamed from: X.VFh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79429VFh extends C79433VFl {
    public final float[] LJJJIL;
    public int LJJJJ;
    public int LJJJJI;

    @Override // X.C79433VFl
    public final void LJIILL() {
        GLES20.glUniform1i(this.LJJJJ, this.LJJJJI);
    }

    public C79429VFh(int i) {
        super(i, 4);
        this.LJJJIL = new float[]{1.660497f, -0.1245471f, -0.01815368f, -0.5876567f, 1.132895f, -0.1005973f, -0.07283995f, -0.008347984f, 1.118751f};
        this.LIZLLL = 20;
    }

    @Override // X.C79433VFl, X.AbstractC79424VFc
    public final int LIZIZ(Bundle bundle) {
        if (super.LIZIZ(bundle) != 0) {
            C79445VFx c79445VFx = this.LJ;
            if (c79445VFx != null) {
                c79445VFx.notifyError(10, this.LIZ, "super.init(bundle) != TR_OK");
                return -1;
            }
            return -1;
        }
        GLES20.glUseProgram(this.LJIILJJIL);
        GLES20.glUniformMatrix3fv(GLES20.glGetUniformLocation(this.LJIILJJIL, "uCMSmatrix"), 1, false, this.LJJJIL, 0);
        this.LJJJJ = GLES20.glGetUniformLocation(this.LJIILJJIL, "hdrType");
        if (bundle != null) {
            this.LJJJJI = bundle.getInt("hdr_type");
        }
        int i = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init bundle:");
        LIZ.append(bundle.toString());
        C48284IxE.LIZ(2, i, "TR_GLLutFilter", X1D.LIZIZ(LIZ));
        return 0;
    }

    @Override // X.C79433VFl
    public final String LJIIL(int i) {
        if (i != 11001) {
            return super.LJIIL(i);
        }
        return "precision highp float;\nuniform mat3 uCMSmatrix;\nuniform int hdrType;\nvec3 eotf_pq(vec3 color) {\n    color = max(color, 0.0);\n    color = pow(color, vec3(1.0/78.843750));\n    color = max(color - vec3(0.835938), 0.0) / (vec3(18.851562) - vec3(18.687500) * color);\n    color = pow(color, vec3(1.0/0.159302));\n    return color;\n}\nvec3 eotf_hlg(vec3 color) {\n    float HLG_A = 0.17883277;\n    float HLG_B = 0.28466892;\n    float HLG_C = 0.55991073;\n    vec3 mask = step(vec3(0.5), color);\n    color = mask * exp((color - vec3(HLG_C)) * vec3(1.0/HLG_A) + HLG_B) + (1.0 - mask) * vec3(4.0) * color * color;\n    color *= vec3(1.0/12.0);\n    color = clamp(color, 0.0, 1.0);\n    float lum = 0.2627 * color.r + 0.677998 * color.g + 0.059302 * color.b;\n    color = vec3(pow(lum, 0.2)) * color;\n    return color;\n}float _hable_3_0(float x) {\n    return ((x * (0.150000*x + 0.050000)+0.004000)/(x * (0.150000*x + 0.500000) + 0.060000)) - 0.066667;\n}\nvec3 toneMap(vec3 color, float peakLum) {\n    color = color * vec3(peakLum);\n    float sig = max(max(color.r, color.g), color.b);\n    float sig_peak = peakLum;\n    float luma = 0.2126368 * color.r + 0.715183 * color.g + 0.07218021 * color.b;\n    float coeff = max(sig - 0.18, 1e-6) / max(sig, 1e-6);\n    coeff = pow(coeff, 20.0);\n    sig = mix(sig, luma, coeff);\n    float sig_orig = max(sig, 1e-6);\n    sig = _hable_3_0(sig) / _hable_3_0(sig_peak);\n    sig = min(sig, 1.0);\n    color *= sig / sig_orig;\n    return color;\n}\nvec4 colorMapping(vec4 color) {\n    float peakLum = 0.0;    if (hdrType == 1) {\n        color.rgb = eotf_pq(color.rgb);\n        peakLum = 110.0;\n    } else {\n        color.rgb = eotf_hlg(color.rgb);\n        peakLum = 12.0;\n    } \n    color.rgb = uCMSmatrix * color.rgb;\n    color.rgb = toneMap(color.rgb, peakLum);\n    color.rgb = pow(color.rgb, vec3(1.0/2.2));\n    color.rgb = clamp(color.rgb, 0.0, 1.0);\n    return color;\n}\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main(void) {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = colorMapping(gl_FragColor);\n}\n";
    }

    @Override // X.C79433VFl, X.AbstractC79424VFc
    public final void LJII(int i, int i2) {
        if (i != 8) {
            super.LJII(i, i2);
            return;
        }
        this.LJJJJI = i2;
        int i3 = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mHDRType:");
        LIZ.append(i2);
        C48284IxE.LIZ(2, i3, "TR_GLLutFilter", X1D.LIZIZ(LIZ));
    }
}
