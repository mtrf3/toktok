package net.jpountz.xxhash;

import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.StreamingXXHash32;

/* loaded from: classes15.dex */
public final class StreamingXXHash32JavaSafe extends AbstractStreamingXXHash32Java {
    @Override // net.jpountz.xxhash.StreamingXXHash32
    public int getValue() {
        int i;
        if (this.totalLen >= 16) {
            i = Integer.rotateLeft(this.v4, 18) + Integer.rotateLeft(this.v3, 12) + Integer.rotateLeft(this.v2, 7) + Integer.rotateLeft(this.v1, 1);
        } else {
            i = this.seed + 374761393;
        }
        int i2 = (int) (i + this.totalLen);
        int i3 = 0;
        while (i3 <= this.memSize - 4) {
            i2 = Integer.rotateLeft((SafeUtils.readIntLE(this.memory, i3) * (-1028477379)) + i2, 17) * 668265263;
            i3 += 4;
        }
        while (i3 < this.memSize) {
            i2 = Integer.rotateLeft(((SafeUtils.readByte(this.memory, i3) & 255) * 374761393) + i2, 11) * (-1640531535);
            i3++;
        }
        int i4 = ((i2 >>> 15) ^ i2) * (-2048144777);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477379);
        return i5 ^ (i5 >>> 16);
    }

    /* loaded from: classes15.dex */
    public static class Factory implements StreamingXXHash32.Factory {
        public static final StreamingXXHash32.Factory INSTANCE = new Factory();

        @Override // net.jpountz.xxhash.StreamingXXHash32.Factory
        public StreamingXXHash32 newStreamingHash(int i) {
            return new StreamingXXHash32JavaSafe(i);
        }
    }

    public StreamingXXHash32JavaSafe(int i) {
        super(i);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash32
    public void update(byte[] bArr, int i, int i2) {
        SafeUtils.checkRange(bArr, i, i2);
        this.totalLen += i2;
        int i3 = this.memSize;
        if (i3 + i2 < 16) {
            System.arraycopy(bArr, i, this.memory, i3, i2);
            this.memSize += i2;
            return;
        }
        int i4 = i2 + i;
        if (i3 > 0) {
            System.arraycopy(bArr, i, this.memory, i3, 16 - i3);
            int readIntLE = (SafeUtils.readIntLE(this.memory, 0) * (-2048144777)) + this.v1;
            this.v1 = readIntLE;
            this.v1 = Integer.rotateLeft(readIntLE, 13) * (-1640531535);
            int readIntLE2 = (SafeUtils.readIntLE(this.memory, 4) * (-2048144777)) + this.v2;
            this.v2 = readIntLE2;
            this.v2 = Integer.rotateLeft(readIntLE2, 13) * (-1640531535);
            int readIntLE3 = (SafeUtils.readIntLE(this.memory, 8) * (-2048144777)) + this.v3;
            this.v3 = readIntLE3;
            this.v3 = Integer.rotateLeft(readIntLE3, 13) * (-1640531535);
            int readIntLE4 = (SafeUtils.readIntLE(this.memory, 12) * (-2048144777)) + this.v4;
            this.v4 = readIntLE4;
            this.v4 = Integer.rotateLeft(readIntLE4, 13) * (-1640531535);
            i += 16 - this.memSize;
            this.memSize = 0;
        }
        int i5 = i4 - 16;
        int i6 = this.v1;
        int i7 = this.v2;
        int i8 = this.v3;
        int i9 = this.v4;
        while (i <= i5) {
            i6 = Integer.rotateLeft((SafeUtils.readIntLE(bArr, i) * (-2048144777)) + i6, 13) * (-1640531535);
            int i10 = i + 4;
            i7 = Integer.rotateLeft((SafeUtils.readIntLE(bArr, i10) * (-2048144777)) + i7, 13) * (-1640531535);
            int i11 = i10 + 4;
            i8 = Integer.rotateLeft((SafeUtils.readIntLE(bArr, i11) * (-2048144777)) + i8, 13) * (-1640531535);
            int i12 = i11 + 4;
            i9 = Integer.rotateLeft((SafeUtils.readIntLE(bArr, i12) * (-2048144777)) + i9, 13) * (-1640531535);
            i = i12 + 4;
        }
        this.v1 = i6;
        this.v2 = i7;
        this.v3 = i8;
        this.v4 = i9;
        if (i < i4) {
            int i13 = i4 - i;
            System.arraycopy(bArr, i, this.memory, 0, i13);
            this.memSize = i13;
        }
    }
}
