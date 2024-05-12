package net.jpountz.lz4;

import X.KMP;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;

/* loaded from: classes15.dex */
public final class LZ4JavaSafeSafeDecompressor extends LZ4SafeDecompressor {
    public static final LZ4SafeDecompressor INSTANCE = new LZ4JavaSafeSafeDecompressor();

    @Override // net.jpountz.lz4.LZ4SafeDecompressor
    public int decompress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return decompress(byteBuffer.array(), byteBuffer.arrayOffset() + i9, i2, byteBuffer2.array(), byteBuffer2.arrayOffset() + i3, i4);
        }
        ByteBuffer inNativeByteOrder = ByteBufferUtils.inNativeByteOrder(byteBuffer);
        ByteBuffer inNativeByteOrder2 = ByteBufferUtils.inNativeByteOrder(byteBuffer2);
        ByteBufferUtils.checkRange(inNativeByteOrder, i9, i2);
        ByteBufferUtils.checkRange(inNativeByteOrder2, i3, i4);
        if (i4 == 0) {
            if (i2 == 1 && ByteBufferUtils.readByte(inNativeByteOrder, i9) == 0) {
                return 0;
            }
            throw new LZ4Exception("Output buffer too small");
        }
        int i10 = i2 + i9;
        int i11 = i4 + i3;
        int i12 = i3;
        while (true) {
            int readByte = ByteBufferUtils.readByte(inNativeByteOrder, i9) & 255;
            i5 = i9 + 1;
            i6 = readByte >>> 4;
            if (i6 == 15) {
                byte b = -1;
                while (true) {
                    if (i5 >= i10) {
                        break;
                    }
                    int i13 = i5 + 1;
                    b = ByteBufferUtils.readByte(inNativeByteOrder, i5);
                    if (b == -1) {
                        i6 += 255;
                        b = -1;
                        i5 = i13;
                    } else {
                        i5 = i13;
                        break;
                    }
                }
                i6 += b & 255;
            }
            i7 = i12 + i6;
            int i14 = i11 - 8;
            if (i7 > i14 || (i8 = i5 + i6) > i10 - 8) {
                break;
            }
            LZ4ByteBufferUtils.wildArraycopy(inNativeByteOrder, i5, inNativeByteOrder2, i12, i6);
            i9 = i8 + 2;
            int readShortLE = i7 - ByteBufferUtils.readShortLE(inNativeByteOrder, i8);
            if (readShortLE >= i3) {
                int i15 = readByte & 15;
                if (i15 == 15) {
                    byte b2 = -1;
                    while (true) {
                        if (i9 >= i10) {
                            break;
                        }
                        int i16 = i9 + 1;
                        b2 = ByteBufferUtils.readByte(inNativeByteOrder, i9);
                        if (b2 == -1) {
                            i15 += 255;
                            i9 = i16;
                            b2 = -1;
                        } else {
                            i9 = i16;
                            break;
                        }
                    }
                    i15 += b2 & 255;
                }
                int i17 = i15 + 4;
                i12 = i7 + i17;
                if (i12 > i14) {
                    if (i12 <= i11) {
                        LZ4ByteBufferUtils.safeIncrementalCopy(inNativeByteOrder2, readShortLE, i7, i17);
                    } else {
                        throw new LZ4Exception(KMP.LJ("Malformed input at ", i9));
                    }
                } else {
                    LZ4ByteBufferUtils.wildIncrementalCopy(inNativeByteOrder2, readShortLE, i7, i12);
                }
            } else {
                throw new LZ4Exception(KMP.LJ("Malformed input at ", i9));
            }
        }
        if (i7 <= i11) {
            if (i5 + i6 == i10) {
                LZ4ByteBufferUtils.safeArraycopy(inNativeByteOrder, i5, inNativeByteOrder2, i12, i6);
                return i7 - i3;
            }
            throw new LZ4Exception(KMP.LJ("Malformed input at ", i5));
        }
        throw new LZ4Exception();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x005d, code lost:
    
        if (r6 > r12) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0061, code lost:
    
        if ((r3 + r10) != r7) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0063, code lost:
    
        net.jpountz.lz4.LZ4SafeUtils.safeArraycopy(r17, r3, r20, r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0067, code lost:
    
        return r6 - r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a6, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception(X.KMP.LJ("Malformed input at ", r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ac, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception();
     */
    @Override // net.jpountz.lz4.LZ4SafeDecompressor, net.jpountz.lz4.LZ4UnknownSizeDecompressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int decompress(byte[] r17, int r18, int r19, byte[] r20, int r21, int r22) {
        /*
            r16 = this;
            r10 = r18
            r2 = r19
            r11 = r17
            net.jpountz.util.SafeUtils.checkRange(r11, r10, r2)
            r9 = r20
            r1 = r22
            r8 = r21
            net.jpountz.util.SafeUtils.checkRange(r9, r8, r1)
            r0 = 1
            if (r1 != 0) goto L27
            if (r2 != r0) goto L1f
            byte r0 = net.jpountz.util.SafeUtils.readByte(r11, r10)
            if (r0 != 0) goto L1f
            r0 = 0
            return r0
        L1f:
            net.jpountz.lz4.LZ4Exception r1 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r0 = "Output buffer too small"
            r1.<init>(r0)
            throw r1
        L27:
            int r7 = r10 + r2
            int r12 = r8 + r1
            r2 = r8
        L2c:
            byte r0 = net.jpountz.util.SafeUtils.readByte(r11, r10)
            r15 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r10 + 1
            int r10 = r15 >>> 4
            r14 = 15
            r13 = -1
            if (r10 != r14) goto L4f
            r0 = -1
        L3c:
            if (r3 >= r7) goto L4c
            int r1 = r3 + 1
            byte r0 = net.jpountz.util.SafeUtils.readByte(r11, r3)
            if (r0 != r13) goto L4b
            int r10 = r10 + 255
            r0 = -1
            r3 = r1
            goto L3c
        L4b:
            r3 = r1
        L4c:
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r10 = r10 + r0
        L4f:
            int r6 = r2 + r10
            int r5 = r12 + (-8)
            java.lang.String r4 = "Malformed input at "
            if (r6 > r5) goto L5d
            int r1 = r3 + r10
            int r0 = r7 + (-8)
            if (r1 <= r0) goto L68
        L5d:
            if (r6 > r12) goto La7
            int r0 = r3 + r10
            if (r0 != r7) goto L9d
            net.jpountz.lz4.LZ4SafeUtils.safeArraycopy(r11, r3, r9, r2, r10)
            int r6 = r6 - r8
            return r6
        L68:
            net.jpountz.lz4.LZ4SafeUtils.wildArraycopy(r11, r3, r9, r2, r10)
            int r0 = net.jpountz.util.SafeUtils.readShortLE(r11, r1)
            int r10 = r1 + 2
            int r3 = r6 - r0
            if (r3 < r8) goto Lb7
            r2 = r15 & 15
            if (r2 != r14) goto L8d
            r0 = -1
        L7a:
            if (r10 >= r7) goto L8a
            int r1 = r10 + 1
            byte r0 = net.jpountz.util.SafeUtils.readByte(r11, r10)
            if (r0 != r13) goto L89
            int r2 = r2 + 255
            r10 = r1
            r0 = -1
            goto L7a
        L89:
            r10 = r1
        L8a:
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r0
        L8d:
            int r0 = r2 + 4
            int r2 = r6 + r0
            if (r2 <= r5) goto L99
            if (r2 > r12) goto Lad
            net.jpountz.lz4.LZ4SafeUtils.safeIncrementalCopy(r9, r3, r6, r0)
            goto L2c
        L99:
            net.jpountz.lz4.LZ4SafeUtils.wildIncrementalCopy(r9, r3, r6, r2)
            goto L2c
        L9d:
            net.jpountz.lz4.LZ4Exception r1 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r0 = X.KMP.LJ(r4, r3)
            r1.<init>(r0)
            throw r1
        La7:
            net.jpountz.lz4.LZ4Exception r0 = new net.jpountz.lz4.LZ4Exception
            r0.<init>()
            throw r0
        Lad:
            net.jpountz.lz4.LZ4Exception r1 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r0 = X.KMP.LJ(r4, r10)
            r1.<init>(r0)
            throw r1
        Lb7:
            net.jpountz.lz4.LZ4Exception r1 = new net.jpountz.lz4.LZ4Exception
            java.lang.String r0 = X.KMP.LJ(r4, r10)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeSafeDecompressor.decompress(byte[], int, int, byte[], int, int):int");
    }
}
