package net.jpountz.xxhash;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.UnsafeUtils;

/* loaded from: classes15.dex */
public final class XXHash32JavaUnsafe extends XXHash32 {
    public static final XXHash32 INSTANCE = new XXHash32JavaUnsafe();

    @Override // net.jpountz.xxhash.XXHash32
    public int hash(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4;
        int i5 = i;
        int i6 = i3;
        if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), byteBuffer.arrayOffset() + i5, i2, i6);
        }
        ByteBufferUtils.checkRange(byteBuffer, i5, i2);
        ByteBuffer inLittleEndianOrder = ByteBufferUtils.inLittleEndianOrder(byteBuffer);
        int i7 = i5 + i2;
        if (i2 >= 16) {
            int i8 = i7 - 16;
            int i9 = (i6 - 1640531535) - 2048144777;
            int i10 = i6 - 2048144777;
            int i11 = i6 - (-1640531535);
            do {
                i9 = Integer.rotateLeft((ByteBufferUtils.readIntLE(inLittleEndianOrder, i5) * (-2048144777)) + i9, 13) * (-1640531535);
                int i12 = i5 + 4;
                i10 = Integer.rotateLeft((ByteBufferUtils.readIntLE(inLittleEndianOrder, i12) * (-2048144777)) + i10, 13) * (-1640531535);
                int i13 = i12 + 4;
                i6 = Integer.rotateLeft((ByteBufferUtils.readIntLE(inLittleEndianOrder, i13) * (-2048144777)) + i6, 13) * (-1640531535);
                int i14 = i13 + 4;
                i11 = Integer.rotateLeft((ByteBufferUtils.readIntLE(inLittleEndianOrder, i14) * (-2048144777)) + i11, 13) * (-1640531535);
                i5 = i14 + 4;
            } while (i5 <= i8);
            i4 = Integer.rotateLeft(i11, 18) + Integer.rotateLeft(i6, 12) + Integer.rotateLeft(i10, 7) + Integer.rotateLeft(i9, 1);
        } else {
            i4 = i6 + 374761393;
        }
        int i15 = i4 + i2;
        while (i5 <= i7 - 4) {
            i15 = 668265263 * Integer.rotateLeft((ByteBufferUtils.readIntLE(inLittleEndianOrder, i5) * (-1028477379)) + i15, 17);
            i5 += 4;
        }
        while (i5 < i7) {
            i15 = Integer.rotateLeft(((ByteBufferUtils.readByte(inLittleEndianOrder, i5) & 255) * 374761393) + i15, 11) * (-1640531535);
            i5++;
        }
        int i16 = ((i15 >>> 15) ^ i15) * (-2048144777);
        int i17 = (i16 ^ (i16 >>> 13)) * (-1028477379);
        return i17 ^ (i17 >>> 16);
    }

    @Override // net.jpountz.xxhash.XXHash32
    public int hash(byte[] bArr, int i, int i2, int i3) {
        int i4;
        UnsafeUtils.checkRange(bArr, i, i2);
        int i5 = i + i2;
        if (i2 >= 16) {
            int i6 = i5 - 16;
            int i7 = (i3 - 1640531535) - 2048144777;
            int i8 = i3 - 2048144777;
            int i9 = i3 - (-1640531535);
            do {
                i7 = Integer.rotateLeft((UnsafeUtils.readIntLE(bArr, i) * (-2048144777)) + i7, 13) * (-1640531535);
                int i10 = i + 4;
                i8 = Integer.rotateLeft((UnsafeUtils.readIntLE(bArr, i10) * (-2048144777)) + i8, 13) * (-1640531535);
                int i11 = i10 + 4;
                i3 = Integer.rotateLeft((UnsafeUtils.readIntLE(bArr, i11) * (-2048144777)) + i3, 13) * (-1640531535);
                int i12 = i11 + 4;
                i9 = Integer.rotateLeft((UnsafeUtils.readIntLE(bArr, i12) * (-2048144777)) + i9, 13) * (-1640531535);
                i = i12 + 4;
            } while (i <= i6);
            i4 = Integer.rotateLeft(i9, 18) + Integer.rotateLeft(i3, 12) + Integer.rotateLeft(i8, 7) + Integer.rotateLeft(i7, 1);
        } else {
            i4 = i3 + 374761393;
        }
        int i13 = i4 + i2;
        while (i <= i5 - 4) {
            i13 = 668265263 * Integer.rotateLeft((UnsafeUtils.readIntLE(bArr, i) * (-1028477379)) + i13, 17);
            i += 4;
        }
        while (i < i5) {
            i13 = Integer.rotateLeft(((UnsafeUtils.readByte(bArr, i) & 255) * 374761393) + i13, 11) * (-1640531535);
            i++;
        }
        int i14 = ((i13 >>> 15) ^ i13) * (-2048144777);
        int i15 = (i14 ^ (i14 >>> 13)) * (-1028477379);
        return i15 ^ (i15 >>> 16);
    }
}
