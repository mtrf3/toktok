package net.jpountz.lz4;

import X.KMP;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.UnsafeUtils;

/* loaded from: classes15.dex */
public final class LZ4JavaUnsafeFastDecompressor extends LZ4FastDecompressor {
    public static final LZ4FastDecompressor INSTANCE = new LZ4JavaUnsafeFastDecompressor();

    @Override // net.jpountz.lz4.LZ4FastDecompressor
    public int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        int i4;
        byte readByte;
        int i5;
        byte readByte2;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return decompress(byteBuffer.array(), byteBuffer.arrayOffset() + i, byteBuffer2.array(), byteBuffer2.arrayOffset() + i2, i3);
        }
        ByteBuffer inNativeByteOrder = ByteBufferUtils.inNativeByteOrder(byteBuffer);
        ByteBuffer inNativeByteOrder2 = ByteBufferUtils.inNativeByteOrder(byteBuffer2);
        ByteBufferUtils.checkRange(inNativeByteOrder, i);
        ByteBufferUtils.checkRange(inNativeByteOrder2, i2, i3);
        if (i3 == 0) {
            if (ByteBufferUtils.readByte(inNativeByteOrder, i) == 0) {
                return 1;
            }
            throw new LZ4Exception(KMP.LJ("Malformed input at ", i));
        }
        int i6 = i3 + i2;
        int i7 = i;
        int i8 = i2;
        while (true) {
            int readByte3 = ByteBufferUtils.readByte(inNativeByteOrder, i7) & 255;
            int i9 = i7 + 1;
            int i10 = readByte3 >>> 4;
            if (i10 == 15) {
                while (true) {
                    i5 = i9 + 1;
                    readByte2 = ByteBufferUtils.readByte(inNativeByteOrder, i9);
                    if (readByte2 != -1) {
                        break;
                    }
                    i10 += 255;
                    i9 = i5;
                }
                i10 += readByte2 & 255;
                i9 = i5;
            }
            int i11 = i8 + i10;
            int i12 = i6 - 8;
            if (i11 > i12) {
                if (i11 == i6) {
                    LZ4ByteBufferUtils.safeArraycopy(inNativeByteOrder, i9, inNativeByteOrder2, i8, i10);
                    return (i9 + i10) - i;
                }
                throw new LZ4Exception(KMP.LJ("Malformed input at ", i9));
            }
            LZ4ByteBufferUtils.wildArraycopy(inNativeByteOrder, i9, inNativeByteOrder2, i8, i10);
            int i13 = i9 + i10;
            int readShortLE = ByteBufferUtils.readShortLE(inNativeByteOrder, i13);
            i7 = i13 + 2;
            int i14 = i11 - readShortLE;
            if (i14 >= i2) {
                int i15 = readByte3 & 15;
                if (i15 == 15) {
                    while (true) {
                        i4 = i7 + 1;
                        readByte = ByteBufferUtils.readByte(inNativeByteOrder, i7);
                        if (readByte != -1) {
                            break;
                        }
                        i15 += 255;
                        i7 = i4;
                    }
                    i15 += readByte & 255;
                    i7 = i4;
                }
                int i16 = i15 + 4;
                i8 = i11 + i16;
                if (i8 > i12) {
                    if (i8 <= i6) {
                        LZ4ByteBufferUtils.safeIncrementalCopy(inNativeByteOrder2, i14, i11, i16);
                    } else {
                        throw new LZ4Exception(KMP.LJ("Malformed input at ", i7));
                    }
                } else {
                    LZ4ByteBufferUtils.wildIncrementalCopy(inNativeByteOrder2, i14, i11, i8);
                }
            } else {
                throw new LZ4Exception(KMP.LJ("Malformed input at ", i7));
            }
        }
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor, net.jpountz.lz4.LZ4Decompressor
    public int decompress(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        byte readByte;
        int i5;
        byte readByte2;
        UnsafeUtils.checkRange(bArr, i);
        UnsafeUtils.checkRange(bArr2, i2, i3);
        if (i3 == 0) {
            if (UnsafeUtils.readByte(bArr, i) == 0) {
                return 1;
            }
            throw new LZ4Exception(KMP.LJ("Malformed input at ", i));
        }
        int i6 = i3 + i2;
        int i7 = i;
        int i8 = i2;
        while (true) {
            int readByte3 = UnsafeUtils.readByte(bArr, i7) & 255;
            int i9 = i7 + 1;
            int i10 = readByte3 >>> 4;
            if (i10 == 15) {
                while (true) {
                    i5 = i9 + 1;
                    readByte2 = UnsafeUtils.readByte(bArr, i9);
                    if (readByte2 != -1) {
                        break;
                    }
                    i10 += 255;
                    i9 = i5;
                }
                i10 += readByte2 & 255;
                i9 = i5;
            }
            int i11 = i8 + i10;
            int i12 = i6 - 8;
            if (i11 > i12) {
                if (i11 == i6) {
                    LZ4UnsafeUtils.safeArraycopy(bArr, i9, bArr2, i8, i10);
                    return (i9 + i10) - i;
                }
                throw new LZ4Exception(KMP.LJ("Malformed input at ", i9));
            }
            LZ4UnsafeUtils.wildArraycopy(bArr, i9, bArr2, i8, i10);
            int i13 = i9 + i10;
            int readShortLE = UnsafeUtils.readShortLE(bArr, i13);
            i7 = i13 + 2;
            int i14 = i11 - readShortLE;
            if (i14 >= i2) {
                int i15 = readByte3 & 15;
                if (i15 == 15) {
                    while (true) {
                        i4 = i7 + 1;
                        readByte = UnsafeUtils.readByte(bArr, i7);
                        if (readByte != -1) {
                            break;
                        }
                        i15 += 255;
                        i7 = i4;
                    }
                    i15 += readByte & 255;
                    i7 = i4;
                }
                int i16 = i15 + 4;
                i8 = i11 + i16;
                if (i8 > i12) {
                    if (i8 <= i6) {
                        LZ4UnsafeUtils.safeIncrementalCopy(bArr2, i14, i11, i16);
                    } else {
                        throw new LZ4Exception(KMP.LJ("Malformed input at ", i7));
                    }
                } else {
                    LZ4UnsafeUtils.wildIncrementalCopy(bArr2, i14, i11, i8);
                }
            } else {
                throw new LZ4Exception(KMP.LJ("Malformed input at ", i7));
            }
        }
    }
}
