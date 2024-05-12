package net.jpountz.xxhash;

import X.C74221TAz;
import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.StreamingXXHash64;

/* loaded from: classes15.dex */
public final class StreamingXXHash64JavaSafe extends AbstractStreamingXXHash64Java {
    @Override // net.jpountz.xxhash.StreamingXXHash64
    public long getValue() {
        long j;
        int i;
        if (this.totalLen >= 32) {
            long j2 = this.v1;
            long j3 = this.v2;
            long j4 = this.v3;
            j = (((((((((((C74221TAz.LIZ(j2, -4417276706812531889L, 31, -7046029288634856825L) ^ (Long.rotateLeft(r0, 18) + (Long.rotateLeft(j4, 12) + (Long.rotateLeft(j3, 7) + Long.rotateLeft(j2, 1))))) * (-7046029288634856825L)) - 8796714831421723037L) ^ C74221TAz.LIZ(j3, -4417276706812531889L, 31, -7046029288634856825L)) * (-7046029288634856825L)) - 8796714831421723037L) ^ C74221TAz.LIZ(j4, -4417276706812531889L, 31, -7046029288634856825L)) * (-7046029288634856825L)) - 8796714831421723037L) ^ C74221TAz.LIZ(this.v4, -4417276706812531889L, 31, -7046029288634856825L)) * (-7046029288634856825L)) - 8796714831421723037L;
        } else {
            j = this.seed + 2870177450012600261L;
        }
        long j5 = j + this.totalLen;
        int i2 = 0;
        while (true) {
            i = this.memSize;
            if (i2 > i - 8) {
                break;
            }
            j5 = (Long.rotateLeft(j5 ^ (Long.rotateLeft(SafeUtils.readLongLE(this.memory, i2) * (-4417276706812531889L), 31) * (-7046029288634856825L)), 27) * (-7046029288634856825L)) - 8796714831421723037L;
            i2 += 8;
        }
        if (i2 <= i - 4) {
            j5 = (Long.rotateLeft(j5 ^ ((SafeUtils.readIntLE(this.memory, i2) & 4294967295L) * (-7046029288634856825L)), 23) * (-4417276706812531889L)) + 1609587929392839161L;
            i2 += 4;
        }
        while (i2 < this.memSize) {
            j5 = Long.rotateLeft(j5 ^ ((this.memory[i2] & 255) * 2870177450012600261L), 11) * (-7046029288634856825L);
            i2++;
        }
        long j6 = (j5 ^ (j5 >>> 33)) * (-4417276706812531889L);
        long j7 = (j6 ^ (j6 >>> 29)) * 1609587929392839161L;
        return j7 ^ (j7 >>> 32);
    }

    /* loaded from: classes15.dex */
    public static class Factory implements StreamingXXHash64.Factory {
        public static final StreamingXXHash64.Factory INSTANCE = new Factory();

        @Override // net.jpountz.xxhash.StreamingXXHash64.Factory
        public StreamingXXHash64 newStreamingHash(long j) {
            return new StreamingXXHash64JavaSafe(j);
        }
    }

    public StreamingXXHash64JavaSafe(long j) {
        super(j);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public void update(byte[] bArr, int i, int i2) {
        int i3 = i;
        SafeUtils.checkRange(bArr, i3, i2);
        this.totalLen += i2;
        int i4 = this.memSize;
        if (i4 + i2 < 32) {
            System.arraycopy(bArr, i3, this.memory, i4, i2);
            this.memSize += i2;
            return;
        }
        int i5 = i2 + i3;
        if (i4 > 0) {
            System.arraycopy(bArr, i3, this.memory, i4, 32 - i4);
            long readLongLE = this.v1 + (SafeUtils.readLongLE(this.memory, 0) * (-4417276706812531889L));
            this.v1 = readLongLE;
            this.v1 = Long.rotateLeft(readLongLE, 31) * (-7046029288634856825L);
            long readLongLE2 = this.v2 + (SafeUtils.readLongLE(this.memory, 8) * (-4417276706812531889L));
            this.v2 = readLongLE2;
            this.v2 = Long.rotateLeft(readLongLE2, 31) * (-7046029288634856825L);
            long readLongLE3 = this.v3 + (SafeUtils.readLongLE(this.memory, 16) * (-4417276706812531889L));
            this.v3 = readLongLE3;
            this.v3 = Long.rotateLeft(readLongLE3, 31) * (-7046029288634856825L);
            long readLongLE4 = this.v4 + (SafeUtils.readLongLE(this.memory, 24) * (-4417276706812531889L));
            this.v4 = readLongLE4;
            this.v4 = Long.rotateLeft(readLongLE4, 31) * (-7046029288634856825L);
            i3 += 32 - this.memSize;
            this.memSize = 0;
        }
        int i6 = i5 - 32;
        long j = this.v1;
        long j2 = this.v2;
        long j3 = this.v3;
        long j4 = this.v4;
        while (i3 <= i6) {
            j = Long.rotateLeft((SafeUtils.readLongLE(bArr, i3) * (-4417276706812531889L)) + j, 31) * (-7046029288634856825L);
            int i7 = i3 + 8;
            j2 = Long.rotateLeft((SafeUtils.readLongLE(bArr, i7) * (-4417276706812531889L)) + j2, 31) * (-7046029288634856825L);
            int i8 = i7 + 8;
            j3 = Long.rotateLeft((SafeUtils.readLongLE(bArr, i8) * (-4417276706812531889L)) + j3, 31) * (-7046029288634856825L);
            int i9 = i8 + 8;
            j4 = Long.rotateLeft((SafeUtils.readLongLE(bArr, i9) * (-4417276706812531889L)) + j4, 31) * (-7046029288634856825L);
            i3 = i9 + 8;
        }
        this.v1 = j;
        this.v2 = j2;
        this.v3 = j3;
        this.v4 = j4;
        if (i3 < i5) {
            int i10 = i5 - i3;
            System.arraycopy(bArr, i3, this.memory, 0, i10);
            this.memSize = i10;
        }
    }
}
