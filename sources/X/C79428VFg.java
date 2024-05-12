package X;

import android.opengl.GLES20;
import android.os.Bundle;

/* renamed from: X.VFg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79428VFg extends C79433VFl {
    public final float[] LJJJIL;
    public int LJJJJ;

    @Override // X.C79433VFl
    public final void LJIILL() {
        this.LJ.getTransformMatrix(this.LJJJIL);
        GLES20.glUniformMatrix4fv(this.LJJJJ, 1, false, this.LJJJIL, 0);
    }

    public C79428VFg(int i) {
        super(i, 3);
        this.LJJJIL = new float[16];
        this.LIZIZ = 36197;
        this.LIZLLL = 100;
        C48284IxE.LIZ(2, this.LJIIIZ, "TR_GLOesTo2DFilter", "new GLOesTo2DFilter");
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
        this.LJJJJ = GLES20.glGetUniformLocation(this.LJIILJJIL, "uSTMatrix");
        C48284IxE.LIZ(2, this.LJIIIZ, "TR_GLOesTo2DFilter", "init");
        LJIIIZ(bundle);
        return 0;
    }

    @Override // X.C79433VFl
    public final String LJIIL(int i) {
        if (i != 11000) {
            if (i != 11001) {
                return super.LJIIL(i);
            }
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        }
        return "uniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    }
}
