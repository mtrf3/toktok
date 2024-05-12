package X;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.VFm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79434VFm extends C79435VFn {
    public int LLFII;
    public int LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public int LLII;
    public int LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;

    @Override // X.C79435VFn, X.C79433VFl, X.AbstractC79424VFc
    public final AbstractC79424VFc LJ() {
        int i = this.LLIIIL;
        if (i != 0) {
            C78966Uyw.LJIJ(i);
        }
        return super.LJ();
    }

    public C79434VFm(int i) {
        super(i, 0);
        int i2 = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new GLPanoramaFilter,this:");
        LIZ.append(this);
        C48284IxE.LIZ(2, i2, "GLPanorama180To360Filter", X1D.LIZIZ(LIZ));
    }

    @Override // X.C79435VFn, X.C79433VFl, X.AbstractC79424VFc
    public final int LIZIZ(Bundle bundle) {
        if (super.LIZIZ(bundle) != 0) {
            C79445VFx c79445VFx = this.LJ;
            if (c79445VFx != null) {
                c79445VFx.notifyError(10, this.LIZ, "super.init(bundle) != TR_OK");
                return -1;
            }
            return -1;
        }
        this.LLFII = GLES20.glGetUniformLocation(this.LJIILJJIL, "sBackground");
        this.LLFZ = GLES20.glGetUniformLocation(this.LJIILJJIL, "sTextureSize");
        this.LLI = GLES20.glGetUniformLocation(this.LJIILJJIL, "sBackTextureSize");
        this.LLIFFJFJJ = GLES20.glGetUniformLocation(this.LJIILJJIL, "scaleU");
        this.LLII = GLES20.glGetUniformLocation(this.LJIILJJIL, "scaleV");
        this.LLIIII = GLES20.glGetUniformLocation(this.LJIILJJIL, "offsetU");
        this.LLIIIILZ = GLES20.glGetUniformLocation(this.LJIILJJIL, "offsetT");
        this.LLIIIJ = GLES20.glGetUniformLocation(this.LJIILJJIL, "shaderType");
        return 0;
    }

    @Override // X.C79435VFn, X.C79433VFl
    public final String LJIIL(int i) {
        if (i != 11001) {
            return super.LJIIL(i);
        }
        return "precision highp float;\n\nuniform sampler2D sTexture;\nuniform sampler2D sBackground;\nuniform float sTextureSize;\nuniform float sBackTextureSize;\nuniform float scaleU;\nuniform float scaleV;\nuniform float offsetU;\nuniform float offsetT;\nuniform int shaderType;\nvarying vec2 vTextureCoord;\nvarying vec3 verPosition;\n\nvec4 vrTextureFragmentForVirtualLive() {\n    vec4 outputColor = texture2D(sBackground, vec2(vTextureCoord.x, 1.0 - vTextureCoord.y));\n    if (verPosition.z < 0.0 && abs(verPosition.z) > abs(verPosition.x) && abs(verPosition.z) > abs(verPosition.y)) {\n        vec2 st = vec2(verPosition.x / (verPosition.z * 2.0) + 0.5, verPosition.y / (verPosition.z * 2.0) + 0.5);\n        st = vec2(1.0, 1.0) - st;\n        outputColor = texture2D(sTexture, st);\n    }\n    return outputColor;\n}\n\nvec4 vrTextureFragmentForGeneralUse() {\n    vec2 uvMain = vTextureCoord;\n    if (offsetT == 0.0  && offsetU ==  0.25) {\n       uvMain.x = (uvMain.x - offsetU) * 2.0;\n    } else {\n       uvMain.x = (uvMain.x - offsetU) * scaleU;\n    }\n    vec4 colMain = texture2D(sTexture, uvMain);\n    float StepLeft = 1.0 - step((0.25 - sTextureSize / 2.0 + 0.5 * sBackTextureSize) / scaleU, vTextureCoord.x);\n    float StepRight = step((0.75 + sTextureSize / 2.0 - 0.5 * sBackTextureSize) / scaleU, vTextureCoord.x);\n\n    vec2 leftUV = vTextureCoord;\n    leftUV.x = (scaleU * leftUV.x  / sBackTextureSize) + 0.5;\n    \n    vec2 rightUV = vTextureCoord;\n    rightUV.x = (scaleU * (rightUV.x - 1.0 + offsetT) / sBackTextureSize) + 0.5;\n    \n    leftUV.y = scaleV * (1.0 - leftUV.y);\n    rightUV.y = scaleV * (1.0 - rightUV.y);\n\n    vec4 col = colMain * (1.0 - StepLeft) * (1.0 - StepRight) + texture2D(sBackground, leftUV) * StepLeft + texture2D(sBackground, rightUV) * StepRight;\n\n    return col;\n}\n\nvoid main()\n{\n    if (shaderType == 1) {\n        gl_FragColor = vrTextureFragmentForVirtualLive();\n    } else {\n        gl_FragColor = vrTextureFragmentForGeneralUse();\n    }\n}\n";
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x02f2  */
    @Override // X.C79435VFn, X.C79433VFl, X.AbstractC79424VFc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.VFZ LIZLLL(X.VFZ r29, X.VG6 r30) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79434VFm.LIZLLL(X.VFZ, X.VG6):X.VFZ");
    }

    @Override // X.AbstractC79424VFc
    public final void LJIIIIZZ(int i, Object obj) {
        if (i != 118) {
            super.LJIIIIZZ(i, obj);
            return;
        }
        try {
            ArrayList arrayList = (ArrayList) obj;
            Object obj2 = ListProtector.get(arrayList, 0);
            Object obj3 = ListProtector.get(arrayList, 1);
            if (obj3 instanceof Bitmap) {
                Bitmap bitmap = (Bitmap) obj3;
                if (this.LLIIIL == 0) {
                    int LJJIFFI = C78966Uyw.LJJIFFI();
                    this.LLIIIL = LJJIFFI;
                    GLES20.glBindTexture(3553, LJJIFFI);
                    GLES20.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, null);
                    GLES20.glBindTexture(3553, 0);
                }
                if (bitmap != null) {
                    try {
                        GLES20.glBindTexture(3553, this.LLIIIL);
                        GLUtils.texImage2D(3553, 0, bitmap, 0);
                        GLES20.glBindTexture(3553, 0);
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            synchronized (obj2) {
                obj2.notify();
                C48284IxE.LIZ(2, this.LJIIIZ, "GLPanorama180To360Filter", "update background texture done");
            }
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }
}
