package X;

import android.content.Context;
import android.content.res.Resources;
import android.opengl.GLES20;
import defpackage.i0;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* renamed from: X.PMh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64323PMh extends PMI {
    public final float[] LIZIZ;
    public final float[] LIZJ;
    public FloatBuffer LIZLLL;
    public FloatBuffer LJ;
    public int LJFF;
    public int LJI;
    public int LJII;

    @Override // X.PMI
    public final void LIZIZ() {
        GLES20.glUseProgram(this.LJFF);
        V16.LJI();
        FloatBuffer floatBuffer = this.LIZLLL;
        if (floatBuffer != null) {
            floatBuffer.position(0);
        }
        GLES20.glVertexAttribPointer(this.LJI, 2, 5126, false, 0, (Buffer) this.LIZLLL);
        V16.LJI();
        GLES20.glEnableVertexAttribArray(this.LJI);
        V16.LJI();
        FloatBuffer floatBuffer2 = this.LJ;
        if (floatBuffer2 != null) {
            floatBuffer2.position(0);
        }
        GLES20.glVertexAttribPointer(this.LJII, 2, 5126, false, 0, (Buffer) this.LJ);
        V16.LJI();
        GLES20.glEnableVertexAttribArray(this.LJII);
        V16.LJI();
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(0, 770);
        GLES20.glDrawArrays(5, 0, 4);
        V16.LJI();
        GLES20.glDisable(3042);
    }

    @Override // X.PMI
    public final void LJ() {
        Resources resources;
        VGT.LIZIZ(this.LIZIZ, -1.0f, -0.8f, 1.0f, -1.0f);
        FloatBuffer LJI = i0.LJI(ByteBuffer.allocateDirect(this.LIZIZ.length * 4));
        LJI.put(this.LIZIZ);
        this.LIZLLL = LJI;
        LJI.position(0);
        VGT.LIZIZ(this.LIZJ, 0.0f, 0.0f, 1.0f, 1.0f);
        FloatBuffer LJI2 = i0.LJI(ByteBuffer.allocateDirect(this.LIZJ.length * 4));
        LJI2.put(this.LIZJ);
        this.LJ = LJI2;
        LJI2.position(0);
        Context context = (Context) this.LIZ;
        Resources resources2 = null;
        if (context != null) {
            resources = context.getResources();
        } else {
            resources = null;
        }
        String LJJJJI = V16.LJJJJI("video/bar_vertex.glsl", resources);
        Context context2 = (Context) this.LIZ;
        if (context2 != null) {
            resources2 = context2.getResources();
        }
        int LJII = V16.LJII(LJJJJI, V16.LJJJJI("video/trans_btm_frag.glsl", resources2));
        this.LJFF = LJII;
        if (LJII == 0) {
            V16.LJI();
            return;
        }
        this.LJI = GLES20.glGetAttribLocation(LJII, "aPosition");
        V16.LJI();
        if (this.LJI != -1) {
            this.LJII = GLES20.glGetAttribLocation(this.LJFF, "aTextureCoord");
            V16.LJI();
            if (this.LJII != -1) {
                return;
            } else {
                throw new RuntimeException("Could not get attrib location for aTextureCoord");
            }
        }
        throw new RuntimeException("Could not get attrib location for aPosition");
    }

    public C64323PMh(Context context) {
        super(context);
        this.LIZIZ = new float[8];
        this.LIZJ = new float[8];
    }
}
