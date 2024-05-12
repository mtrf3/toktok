package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.0bb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C10790bb {
    public byte[] LIZ;
    public int LIZIZ;

    public String toString() {
        return this.LIZ.toString();
    }

    public C10790bb(int i) {
        if (i >= 0) {
            this.LIZ = new byte[i];
        } else {
            String LJ = KMP.LJ("Negative initial size: ", i);
            LJ.toString();
            throw new IllegalArgumentException(LJ);
        }
    }

    public final void LIZ(byte[] bArr, int i, int i2) {
        if (i >= 0 && i <= bArr.length && i2 >= 0) {
            int i3 = i + i2;
            if (i3 - bArr.length <= 0) {
                int i4 = this.LIZIZ + i2;
                byte[] bArr2 = this.LIZ;
                if (i4 - bArr2.length > 0) {
                    int length = bArr2.length << 1;
                    if (length - i4 < 0) {
                        length = i4;
                    }
                    if (length - 2147483639 > 0) {
                        if (i4 >= 0) {
                            if (i4 > 2147483639) {
                                length = Integer.MAX_VALUE;
                            } else {
                                length = 2147483639;
                            }
                        } else {
                            "out of memory!".toString();
                            throw new IllegalStateException("out of memory!");
                        }
                    }
                    byte[] copyOf = Arrays.copyOf(bArr2, length);
                    o.LJFF(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                    this.LIZ = copyOf;
                }
                byte[] destination = this.LIZ;
                int i5 = this.LIZIZ;
                o.LJIIIZ(destination, "destination");
                System.arraycopy(bArr, i, destination, i5, i3 - i);
                this.LIZIZ += i2;
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
