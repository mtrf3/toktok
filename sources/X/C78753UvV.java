package X;

import java.lang.reflect.Array;

/* renamed from: X.UvV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78753UvV {
    public final byte[][] LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.LIZIZ * 2 * this.LIZJ) + 2);
        for (int i = 0; i < this.LIZJ; i++) {
            byte[] bArr = this.LIZ[i];
            for (int i2 = 0; i2 < this.LIZIZ; i2++) {
                byte b = bArr[i2];
                if (b != 0) {
                    if (b != 1) {
                        sb.append("  ");
                    } else {
                        sb.append(" 1");
                    }
                } else {
                    sb.append(" 0");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public C78753UvV(int i, int i2) {
        this.LIZ = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.LIZIZ = i;
        this.LIZJ = i2;
    }

    public final byte LIZ(int i, int i2) {
        return this.LIZ[i2][i];
    }

    public final void LIZIZ(int i, int i2, int i3) {
        this.LIZ[i2][i] = (byte) i3;
    }

    public final void LIZJ(int i, int i2, boolean z) {
        this.LIZ[i2][i] = z ? (byte) 1 : (byte) 0;
    }
}
