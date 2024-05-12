package X;

import android.content.Context;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.PMi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64324PMi extends PMI {
    public final LinkedList<C64325PMj> LIZIZ;

    @Override // X.PMI
    public final void LIZIZ() {
        if (!this.LIZIZ.isEmpty()) {
            Iterator<C64325PMj> it = this.LIZIZ.iterator();
            while (it.hasNext()) {
                C64325PMj next = it.next();
                GLES20.glUseProgram(next.LJ);
                V16.LJI();
                next.LIZJ.position(0);
                GLES20.glVertexAttribPointer(next.LJFF, 2, 5126, false, 0, (Buffer) next.LIZJ);
                V16.LJI();
                GLES20.glEnableVertexAttribArray(next.LJFF);
                V16.LJI();
                next.LIZLLL.position(0);
                GLES20.glVertexAttribPointer(next.LJI, 2, 5126, false, 0, (Buffer) next.LIZLLL);
                V16.LJI();
                GLES20.glEnableVertexAttribArray(next.LJI);
                V16.LJI();
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(0, 770);
                GLES20.glDrawArrays(5, 0, 4);
                V16.LJI();
                GLES20.glDisable(3042);
            }
        }
    }

    @Override // X.PMI
    public final void LJ() {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4 = null;
        try {
            C64325PMj LJIILL = LJIILL(-1.0f, 1.0f, 1.0f, 0.9f, "\nprecision mediump float;\nvarying vec2 vTextureCoord;\n\nvoid main() {\n    gl_FragColor = vec4(1.0, 1.0, 1.0, 1.059 /(1.0 + exp(7.0 * (0.5 - vTextureCoord.y))) - 0.03);\n}    \n");
            if (LJIILL != null) {
                bool3 = Boolean.valueOf(this.LIZIZ.add(LJIILL));
            } else {
                bool3 = null;
            }
            C3C5.m7constructorimpl(bool3);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        try {
            C64325PMj LJIILL2 = LJIILL(-1.0f, -0.9f, 1.0f, -1.0f, "\nprecision mediump float;\nvarying vec2 vTextureCoord;\n\nvoid main() {\n    gl_FragColor = vec4(1.0, 1.0, 1.0, 1.059 /(1.0 + exp(7.0 * (vTextureCoord.y - 0.5))) - 0.03);\n}    \n");
            if (LJIILL2 != null) {
                bool2 = Boolean.valueOf(this.LIZIZ.add(LJIILL2));
            } else {
                bool2 = null;
            }
            C3C5.m7constructorimpl(bool2);
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
        try {
            C64325PMj LJIILL3 = LJIILL(-1.0f, 1.0f, -0.87f, -1.0f, "\nprecision mediump float;\nvarying vec2 vTextureCoord;\n\nvoid main() {\n    gl_FragColor = vec4(1.0, 1.0, 1.0, 1.059 /(1.0 + exp(7.0 * (0.5 - vTextureCoord.x))) - 0.03);\n}    \n");
            if (LJIILL3 != null) {
                bool = Boolean.valueOf(this.LIZIZ.add(LJIILL3));
            } else {
                bool = null;
            }
            C3C5.m7constructorimpl(bool);
        } catch (Throwable th3) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th3));
        }
        try {
            C64325PMj LJIILL4 = LJIILL(0.87f, 1.0f, 1.0f, -1.0f, "\nprecision mediump float;\nvarying vec2 vTextureCoord;\n\nvoid main() {\n    gl_FragColor = vec4(1.0, 1.0, 1.0, 1.059 /(1.0 + exp(7.0 * (vTextureCoord.x - 0.5))) - 0.03);\n}    \n");
            if (LJIILL4 != null) {
                bool4 = Boolean.valueOf(this.LIZIZ.add(LJIILL4));
            }
            C3C5.m7constructorimpl(bool4);
        } catch (Throwable th4) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th4));
        }
    }

    public C64324PMi(Context context) {
        super(context);
        this.LIZIZ = new LinkedList<>();
    }

    public static C64325PMj LJIILL(float f, float f2, float f3, float f4, String str) {
        float[] fArr = new float[8];
        VGT.LIZIZ(fArr, f, f2, f3, f4);
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        float[] fArr2 = new float[8];
        VGT.LIZIZ(fArr2, 0.0f, 0.0f, 1.0f, 1.0f);
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer2.put(fArr2);
        asFloatBuffer2.position(0);
        int LJII = V16.LJII("\nattribute vec4 aPosition;\nattribute vec2 aTextureCoord;\nvarying vec2 vTextureCoord;\n\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord;\n}\n", str);
        if (LJII == 0) {
            V16.LJI();
            return null;
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(LJII, "aPosition");
        V16.LJI();
        if (glGetAttribLocation != -1) {
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(LJII, "aTextureCoord");
            V16.LJI();
            if (glGetAttribLocation2 != -1) {
                return new C64325PMj(fArr, fArr2, asFloatBuffer, asFloatBuffer2, LJII, glGetAttribLocation, glGetAttribLocation2);
            }
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        throw new RuntimeException("Could not get attrib location for aPosition");
    }
}
