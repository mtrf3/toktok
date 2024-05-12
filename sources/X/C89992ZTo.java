package X;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: X.ZTo, reason: case insensitive filesystem */
/* loaded from: classes19.dex */
public final class C89992ZTo {
    public static final float[] LJIILLIIL;
    public static final int LJIJ;
    public final FloatBuffer LIZ;
    public final FloatBuffer LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int[] LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int[] LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public ByteBuffer LJIIL;
    public ByteBuffer LJIILIIL;
    public ByteBuffer LJIILJJIL;
    public static final String LJIILL = C16880lQ.LJLLJ(C89992ZTo.class);
    public static final float[] LJIIZILJ = {0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    static {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
        LJIILLIIL = fArr;
        LJIJ = fArr.length / 3;
    }

    public final void LIZIZ() {
        ByteBuffer byteBuffer = this.LJIIL;
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.LJIIL = null;
        }
        ByteBuffer byteBuffer2 = this.LJIILIIL;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
            this.LJIILIIL = null;
        }
        ByteBuffer byteBuffer3 = this.LJIILJJIL;
        if (byteBuffer3 != null) {
            byteBuffer3.clear();
            this.LJIILJJIL = null;
        }
        GLES20.glDeleteProgram(this.LIZJ);
        int[] iArr = this.LJFF;
        GLES20.glDeleteBuffers(iArr.length, iArr, 0);
        int[] iArr2 = this.LJIIIZ;
        GLES20.glDeleteTextures(iArr2.length, iArr2, 0);
    }

    public C89992ZTo() {
        float[] fArr = LJIILLIIL;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr);
        this.LIZ = asFloatBuffer;
        asFloatBuffer.position(0);
        float[] fArr2 = LJIIZILJ;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer2.put(fArr2);
        this.LIZIZ = asFloatBuffer2;
        asFloatBuffer2.position(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZ() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89992ZTo.LIZ():int");
    }

    public final void LIZJ(int i, byte[] bArr, int i2) {
        this.LJIIJ = i;
        this.LJIIJJI = i2;
        int i3 = i * i2;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 / 4;
        byte[] bArr3 = new byte[i4];
        byte[] bArr4 = new byte[i4];
        int i5 = i * i2;
        if (i5 >= 0) {
            System.arraycopy(bArr, 0, bArr2, 0, i5);
        }
        int i6 = this.LJIIJ * this.LJIIJJI;
        int i7 = i6 / 4;
        if (i7 >= 0) {
            System.arraycopy(bArr, i6, bArr3, 0, i7);
        }
        int i8 = this.LJIIJ * this.LJIIJJI;
        int i9 = i8 / 4;
        if (i9 >= 0) {
            System.arraycopy(bArr, (i8 * 5) / 4, bArr4, 0, i9);
        }
        ByteBuffer order = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
        order.put(bArr2);
        this.LJIIL = order;
        order.position(0);
        ByteBuffer order2 = ByteBuffer.allocateDirect(i4).order(ByteOrder.nativeOrder());
        order2.put(bArr3);
        this.LJIILIIL = order2;
        order2.position(0);
        ByteBuffer order3 = ByteBuffer.allocateDirect(i4).order(ByteOrder.nativeOrder());
        order3.put(bArr4);
        this.LJIILJJIL = order3;
        order3.position(0);
    }
}
