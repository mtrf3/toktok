package net.jpountz.xxhash;

import X.C74221TAz;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* loaded from: classes15.dex */
public final class XXHash64JavaSafe extends XXHash64 {
    public static final XXHash64 INSTANCE = new XXHash64JavaSafe();

    @Override // net.jpountz.xxhash.XXHash64
    public long hash(ByteBuffer byteBuffer, int i, int i2, long j) {
        long j2;
        int i3 = i;
        if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), byteBuffer.arrayOffset() + i3, i2, j);
        }
        ByteBufferUtils.checkRange(byteBuffer, i3, i2);
        ByteBuffer inLittleEndianOrder = ByteBufferUtils.inLittleEndianOrder(byteBuffer);
        int i4 = i3 + i2;
        if (i2 >= 32) {
            int i5 = i4 - 32;
            long j3 = (j - 7046029288634856825L) - 4417276706812531889L;
            long j4 = j - 4417276706812531889L;
            long j5 = j + 0;
            long j6 = j - (-7046029288634856825L);
            do {
                j3 = Long.rotateLeft((ByteBufferUtils.readLongLE(inLittleEndianOrder, i3) * (-4417276706812531889L)) + j3, 31) * (-7046029288634856825L);
                int i6 = i3 + 8;
                j4 = Long.rotateLeft((ByteBufferUtils.readLongLE(inLittleEndianOrder, i6) * (-4417276706812531889L)) + j4, 31) * (-7046029288634856825L);
                int i7 = i6 + 8;
                j5 = Long.rotateLeft((ByteBufferUtils.readLongLE(inLittleEndianOrder, i7) * (-4417276706812531889L)) + j5, 31) * (-7046029288634856825L);
                int i8 = i7 + 8;
                j6 = Long.rotateLeft((ByteBufferUtils.readLongLE(inLittleEndianOrder, i8) * (-4417276706812531889L)) + j6, 31) * (-7046029288634856825L);
                i3 = i8 + 8;
            } while (i3 <= i5);
            j2 = ((C74221TAz.LIZ(j6, -4417276706812531889L, 31, -7046029288634856825L) ^ ((((((((((Long.rotateLeft(j6, 18) + (Long.rotateLeft(j5, 12) + (Long.rotateLeft(j4, 7) + Long.rotateLeft(j3, 1)))) ^ C74221TAz.LIZ(j3, -4417276706812531889L, 31, -7046029288634856825L)) * (-7046029288634856825L)) - 8796714831421723037L) ^ C74221TAz.LIZ(j4, -4417276706812531889L, 31, -7046029288634856825L)) * (-7046029288634856825L)) - 8796714831421723037L) ^ C74221TAz.LIZ(j5, -4417276706812531889L, 31, -7046029288634856825L)) * (-7046029288634856825L)) - 8796714831421723037L)) * (-7046029288634856825L)) - 8796714831421723037L;
        } else {
            j2 = j + 2870177450012600261L;
        }
        long j7 = j2 + i2;
        while (i3 <= i4 - 8) {
            j7 = (Long.rotateLeft(j7 ^ (Long.rotateLeft(ByteBufferUtils.readLongLE(inLittleEndianOrder, i3) * (-4417276706812531889L), 31) * (-7046029288634856825L)), 27) * (-7046029288634856825L)) - 8796714831421723037L;
            i3 += 8;
        }
        if (i3 <= i4 - 4) {
            j7 = (Long.rotateLeft(j7 ^ ((ByteBufferUtils.readIntLE(inLittleEndianOrder, i3) & 4294967295L) * (-7046029288634856825L)), 23) * (-4417276706812531889L)) + 1609587929392839161L;
            i3 += 4;
        }
        while (i3 < i4) {
            j7 = Long.rotateLeft(j7 ^ ((ByteBufferUtils.readByte(inLittleEndianOrder, i3) & 255) * 2870177450012600261L), 11) * (-7046029288634856825L);
            i3++;
        }
        long j8 = ((j7 >>> 33) ^ j7) * (-4417276706812531889L);
        long j9 = (j8 ^ (j8 >>> 29)) * 1609587929392839161L;
        return j9 ^ (j9 >>> 32);
    }

    @Override // net.jpountz.xxhash.XXHash64
    public long hash(byte[] bArr, int i, int i2, long j) {
        long j2;
        int i3 = i;
        SafeUtils.checkRange(bArr, i3, i2);
        int i4 = i3 + i2;
        if (i2 >= 32) {
            int i5 = i4 - 32;
            long j3 = (j - 7046029288634856825L) - 4417276706812531889L;
            long j4 = j - 4417276706812531889L;
            long j5 = j + 0;
            long j6 = j - (-7046029288634856825L);
            do {
                j3 = Long.rotateLeft((SafeUtils.readLongLE(bArr, i3) * (-4417276706812531889L)) + j3, 31) * (-7046029288634856825L);
                int i6 = i3 + 8;
                j4 = Long.rotateLeft((SafeUtils.readLongLE(bArr, i6) * (-4417276706812531889L)) + j4, 31) * (-7046029288634856825L);
                int i7 = i6 + 8;
                j5 = Long.rotateLeft((SafeUtils.readLongLE(bArr, i7) * (-4417276706812531889L)) + j5, 31) * (-7046029288634856825L);
                int i8 = i7 + 8;
                j6 = Long.rotateLeft((SafeUtils.readLongLE(bArr, i8) * (-4417276706812531889L)) + j6, 31) * (-7046029288634856825L);
                i3 = i8 + 8;
            } while (i3 <= i5);
            j2 = (((((C74221TAz.LIZ(j5, -4417276706812531889L, 31, -7046029288634856825L) ^ ((((((C74221TAz.LIZ(j3, -4417276706812531889L, 31, -7046029288634856825L) ^ (Long.rotateLeft(j6, 18) + (Long.rotateLeft(j5, 12) + (Long.rotateLeft(j4, 7) + Long.rotateLeft(j3, 1))))) * (-7046029288634856825L)) - 8796714831421723037L) ^ C74221TAz.LIZ(j4, -4417276706812531889L, 31, -7046029288634856825L)) * (-7046029288634856825L)) - 8796714831421723037L)) * (-7046029288634856825L)) - 8796714831421723037L) ^ C74221TAz.LIZ(j6, -4417276706812531889L, 31, -7046029288634856825L)) * (-7046029288634856825L)) - 8796714831421723037L;
        } else {
            j2 = j + 2870177450012600261L;
        }
        long j7 = j2 + i2;
        while (i3 <= i4 - 8) {
            j7 = (Long.rotateLeft(j7 ^ (Long.rotateLeft(SafeUtils.readLongLE(bArr, i3) * (-4417276706812531889L), 31) * (-7046029288634856825L)), 27) * (-7046029288634856825L)) - 8796714831421723037L;
            i3 += 8;
        }
        if (i3 <= i4 - 4) {
            j7 = (Long.rotateLeft(j7 ^ ((SafeUtils.readIntLE(bArr, i3) & 4294967295L) * (-7046029288634856825L)), 23) * (-4417276706812531889L)) + 1609587929392839161L;
            i3 += 4;
        }
        while (i3 < i4) {
            j7 = Long.rotateLeft(j7 ^ ((SafeUtils.readByte(bArr, i3) & 255) * 2870177450012600261L), 11) * (-7046029288634856825L);
            i3++;
        }
        long j8 = ((j7 >>> 33) ^ j7) * (-4417276706812531889L);
        long j9 = (j8 ^ (j8 >>> 29)) * 1609587929392839161L;
        return j9 ^ (j9 >>> 32);
    }
}
