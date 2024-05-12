package org.apache.commons.codec.binary;

import X.X1D;
import X.XC5;
import org.apache.commons.codec.binary.BaseNCodec;

/* loaded from: classes16.dex */
public class Base64 extends BaseNCodec {
    public final int decodeSize;
    public final byte[] decodeTable;
    public final int encodeSize;
    public final byte[] encodeTable;
    public final byte[] lineSeparator;
    public static final byte[] CHUNK_SEPARATOR = {XC5.LJFF, 10};
    public static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    public static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, XC5.LJFF, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    public Base64(boolean z) {
        this(76, CHUNK_SEPARATOR, z);
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public boolean isInAlphabet(byte b) {
        if (b >= 0) {
            byte[] bArr = this.decodeTable;
            if (b < bArr.length && bArr[b] != -1) {
                return true;
            }
        }
        return false;
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z) {
        return encodeBase64(bArr, z, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Base64(int r5, byte[] r6, boolean r7) {
        /*
            r4 = this;
            r3 = 0
            if (r6 != 0) goto L40
            r1 = 0
        L4:
            r0 = 3
            r2 = 4
            r4.<init>(r0, r2, r5, r1)
            byte[] r0 = org.apache.commons.codec.binary.Base64.DECODE_TABLE
            r4.decodeTable = r0
            r1 = 0
            if (r6 == 0) goto L3b
            boolean r0 = r4.containsAlphabetOrPad(r6)
            if (r0 != 0) goto L42
            if (r5 <= 0) goto L36
            int r0 = r6.length
            int r0 = r0 + 4
            r4.encodeSize = r0
            int r0 = r6.length
            byte[] r1 = new byte[r0]
            r4.lineSeparator = r1
            int r0 = r6.length
            java.lang.System.arraycopy(r6, r3, r1, r3, r0)
        L26:
            int r0 = r4.encodeSize
            int r0 = r0 + (-1)
            r4.decodeSize = r0
            if (r7 == 0) goto L33
            byte[] r0 = org.apache.commons.codec.binary.Base64.URL_SAFE_ENCODE_TABLE
        L30:
            r4.encodeTable = r0
            return
        L33:
            byte[] r0 = org.apache.commons.codec.binary.Base64.STANDARD_ENCODE_TABLE
            goto L30
        L36:
            r4.encodeSize = r2
            r4.lineSeparator = r1
            goto L26
        L3b:
            r4.encodeSize = r2
            r4.lineSeparator = r1
            goto L26
        L40:
            int r1 = r6.length
            goto L4
        L42:
            java.lang.String r3 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(r6)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "lineSeparator must not contain base64 characters: ["
            java.lang.String r0 = "]"
            java.lang.String r0 = defpackage.a1.LJ(r1, r3, r0)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.binary.Base64.<init>(int, byte[], boolean):void");
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2) {
        return encodeBase64(bArr, z, z2, Integer.MAX_VALUE);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2, int i) {
        Base64 base64;
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        if (z) {
            base64 = new Base64(z2);
        } else {
            base64 = new Base64(0, CHUNK_SEPARATOR, z2);
        }
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength <= i) {
            return base64.encode(bArr);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Input array too big, the output array would be bigger (");
        LIZ.append(encodedLength);
        LIZ.append(") than the specified maximum size of ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public void encode(byte[] bArr, int i, int i2, BaseNCodec.Context context) {
        if (context.eof) {
            return;
        }
        if (i2 < 0) {
            context.eof = true;
            if (context.modulus == 0 && this.lineLength == 0) {
                return;
            }
            byte[] ensureBufferSize = ensureBufferSize(this.encodeSize, context);
            int i3 = context.pos;
            int i4 = context.modulus;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = i3 + 1;
                        byte[] bArr2 = this.encodeTable;
                        int i6 = context.ibitWorkArea;
                        ensureBufferSize[i3] = bArr2[(i6 >> 10) & 63];
                        int i7 = i5 + 1;
                        ensureBufferSize[i5] = bArr2[(i6 >> 4) & 63];
                        int i8 = i7 + 1;
                        context.pos = i8;
                        ensureBufferSize[i7] = bArr2[(i6 << 2) & 63];
                        if (bArr2 == STANDARD_ENCODE_TABLE) {
                            context.pos = i8 + 1;
                            ensureBufferSize[i8] = 61;
                        }
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Impossible modulus ");
                        LIZ.append(context.modulus);
                        throw new IllegalStateException(X1D.LIZIZ(LIZ));
                    }
                } else {
                    int i9 = i3 + 1;
                    byte[] bArr3 = this.encodeTable;
                    int i10 = context.ibitWorkArea;
                    ensureBufferSize[i3] = bArr3[(i10 >> 2) & 63];
                    int i11 = i9 + 1;
                    context.pos = i11;
                    ensureBufferSize[i9] = bArr3[(i10 << 4) & 63];
                    if (bArr3 == STANDARD_ENCODE_TABLE) {
                        int i12 = i11 + 1;
                        ensureBufferSize[i11] = 61;
                        context.pos = i12 + 1;
                        ensureBufferSize[i12] = 61;
                    }
                }
            }
            int i13 = context.currentLinePos;
            int i14 = context.pos;
            int i15 = (i14 - i3) + i13;
            context.currentLinePos = i15;
            if (this.lineLength > 0 && i15 > 0) {
                byte[] bArr4 = this.lineSeparator;
                System.arraycopy(bArr4, 0, ensureBufferSize, i14, bArr4.length);
                context.pos += this.lineSeparator.length;
                return;
            }
            return;
        }
        int i16 = 0;
        while (i16 < i2) {
            byte[] ensureBufferSize2 = ensureBufferSize(this.encodeSize, context);
            int i17 = (context.modulus + 1) % 3;
            context.modulus = i17;
            int i18 = i + 1;
            int i19 = bArr[i];
            if (i19 < 0) {
                i19 += 256;
            }
            int i20 = (context.ibitWorkArea << 8) + i19;
            context.ibitWorkArea = i20;
            if (i17 == 0) {
                int i21 = context.pos;
                int i22 = i21 + 1;
                byte[] bArr5 = this.encodeTable;
                ensureBufferSize2[i21] = bArr5[(i20 >> 18) & 63];
                int i23 = i22 + 1;
                ensureBufferSize2[i22] = bArr5[(i20 >> 12) & 63];
                int i24 = i23 + 1;
                ensureBufferSize2[i23] = bArr5[(i20 >> 6) & 63];
                int i25 = i24 + 1;
                context.pos = i25;
                ensureBufferSize2[i24] = bArr5[i20 & 63];
                int i26 = context.currentLinePos + 4;
                context.currentLinePos = i26;
                int i27 = this.lineLength;
                if (i27 > 0 && i27 <= i26) {
                    byte[] bArr6 = this.lineSeparator;
                    System.arraycopy(bArr6, 0, ensureBufferSize2, i25, bArr6.length);
                    context.pos += this.lineSeparator.length;
                    context.currentLinePos = 0;
                }
            }
            i16++;
            i = i18;
        }
    }
}
