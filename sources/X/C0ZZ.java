package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.0ZZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0ZZ {
    public static final int[] LIZ;

    static {
        int[] iArr = new int[256];
        int i = 0;
        int i2 = 0;
        do {
            iArr[i2] = -1;
            i2++;
        } while (i2 <= 255);
        do {
            iArr["ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".charAt(i)] = i;
            i++;
        } while (i < 65);
        LIZ = iArr;
    }

    public static byte[] LIZ(String str) {
        o.LJIIJ(str, "str");
        int length = str.length();
        byte[] bArr = new byte[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) str.charAt(i2);
        }
        byte[] bArr2 = new byte[length];
        int i3 = 0;
        while (i < length) {
            int[] iArr = LIZ;
            int i4 = iArr[bArr[i] & 255];
            i++;
            if (i4 >= 0) {
                int i5 = i + 1;
                int i6 = iArr[bArr[i] & 255];
                int i7 = i5 + 1;
                int i8 = iArr[bArr[i5] & 255];
                i = i7 + 1;
                int i9 = iArr[bArr[i7] & 255];
                int i10 = i3 + 1;
                bArr2[i3] = (byte) ((i4 << 2) | (i6 >> 4));
                if (i8 < 64) {
                    int i11 = i10 + 1;
                    bArr2[i10] = (byte) ((i6 << 4) | (i8 >> 2));
                    if (i9 < 64) {
                        i3 = i11 + 1;
                        bArr2[i11] = (byte) ((i8 << 6) | i9);
                    } else {
                        i3 = i11;
                    }
                } else {
                    i3 = i10;
                }
            }
        }
        byte[] copyOf = Arrays.copyOf(bArr2, i3);
        o.LJFF(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }
}
