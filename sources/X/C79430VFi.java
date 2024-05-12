package X;

import android.opengl.GLES20;

/* renamed from: X.VFi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79430VFi extends C79433VFl {
    @Override // X.C79433VFl
    public final void LJIILL() {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
    }

    public C79430VFi(int i) {
        super(i, 9);
        this.LIZLLL = 25;
        int i2 = this.LJIIIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new GLMattingFilter,this:");
        LIZ.append(this);
        C48284IxE.LIZ(2, i2, "TR_GLMattingFilter", X1D.LIZIZ(LIZ));
    }

    @Override // X.C79433VFl
    public final String LJIIL(int i) {
        if (i != 11001) {
            return super.LJIIL(i);
        }
        return "precision mediump float;\nuniform sampler2D sTexture;\nvarying vec2 vTextureCoord;\nvoid main() {\n    vec4 tmpFrag = texture2D(sTexture, vTextureCoord);\n    float rbAver = tmpFrag.r * 0.5 + tmpFrag.b * 0.5;\n    float delta = tmpFrag.g - rbAver;\n    tmpFrag.a = 1.0 - smoothstep(0.0, 0.25, delta);\n    tmpFrag.a = tmpFrag.a * tmpFrag.a * tmpFrag.a;\n    gl_FragColor = tmpFrag;\n}";
    }
}
