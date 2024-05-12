package X;

import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public final class X00 extends C269714b {
    public final ByteBuffer LIZJ;

    public X00(int i) {
        super(new byte[1]);
        this.LIZJ = ByteBuffer.allocateDirect(i);
    }

    public final void LJI(int i) {
        byte[] bArr = new byte[4];
        int i2 = 0;
        do {
            bArr[i2] = (byte) ((i >> (i2 * 8)) & 255);
            i2++;
        } while (i2 < 4);
        this.LIZJ.put(bArr);
    }
}
