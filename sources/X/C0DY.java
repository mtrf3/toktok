package X;

import java.nio.ByteBuffer;

/* renamed from: X.0DY, reason: invalid class name */
/* loaded from: classes.dex */
public class C0DY {
    public int LIZ;
    public ByteBuffer LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public C0DY() {
        if (C26150AOc.LIZ == null) {
            C26150AOc.LIZ = new C26150AOc();
        }
    }

    public final int LIZ(int i) {
        if (i < this.LIZLLL) {
            return this.LIZIZ.getShort(this.LIZJ + i);
        }
        return 0;
    }

    public final void LIZIZ(int i, ByteBuffer byteBuffer) {
        this.LIZIZ = byteBuffer;
        if (byteBuffer != null) {
            this.LIZ = i;
            int i2 = i - byteBuffer.getInt(i);
            this.LIZJ = i2;
            this.LIZLLL = this.LIZIZ.getShort(i2);
            return;
        }
        this.LIZ = 0;
        this.LIZJ = 0;
        this.LIZLLL = 0;
    }
}
