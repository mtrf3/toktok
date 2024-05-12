package X;

/* renamed from: X.Ut2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78600Ut2 {
    public static final boolean LIZ = !"little".equals(System.getProperty("sun.cpu.endian"));
    public static final C78600Ut2 LIZIZ = new C78600Ut2();

    public static long LIZLLL(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    public static long LJ(int i, long j) {
        if (i == 0) {
            return j;
        }
        return (j << (64 - i)) | (j >>> i);
    }

    public static int LIZ(int i, byte[] bArr) {
        C78601Ut3 c78601Ut3 = new C78601Ut3(4, LIZ);
        int i2 = 0;
        while (true) {
            int i3 = c78601Ut3.LIZJ;
            int i4 = c78601Ut3.LIZ;
            if (i3 < i4) {
                if (!c78601Ut3.LIZIZ) {
                    c78601Ut3.LIZJ = i3 + 1;
                } else {
                    c78601Ut3.LIZJ = i3 + 1;
                    i3 = (i4 - 1) - i3;
                }
                i2 |= (bArr[i3 + i] & 255) << (i3 * 8);
            } else {
                return i2;
            }
        }
    }

    public static long LIZIZ(int i, byte[] bArr) {
        C78601Ut3 c78601Ut3 = new C78601Ut3(8, LIZ);
        long j = 0;
        while (true) {
            int i2 = c78601Ut3.LIZJ;
            int i3 = c78601Ut3.LIZ;
            if (i2 < i3) {
                if (!c78601Ut3.LIZIZ) {
                    c78601Ut3.LIZJ = i2 + 1;
                } else {
                    c78601Ut3.LIZJ = i2 + 1;
                    i2 = (i3 - 1) - i2;
                }
                j |= (bArr[i2 + i] & 255) << (i2 * 8);
            } else {
                return j;
            }
        }
    }

    public static long LIZJ(long j, long j2) {
        long j3 = (j ^ j2) * (-7070675565921424023L);
        long j4 = ((j3 ^ (j3 >>> 47)) ^ j2) * (-7070675565921424023L);
        return (j4 ^ (j4 >>> 47)) * (-7070675565921424023L);
    }

    public static C78604Ut6 LJFF(int i, long j, long j2, byte[] bArr) {
        long LIZIZ2 = LIZIZ(i, bArr);
        long LIZIZ3 = LIZIZ(i + 8, bArr);
        long LIZIZ4 = LIZIZ(i + 16, bArr);
        long LIZIZ5 = LIZIZ(i + 24, bArr);
        long j3 = j + LIZIZ2;
        long j4 = LIZIZ3 + j3 + LIZIZ4;
        return new C78604Ut6(j4 + LIZIZ5, LJ(44, j4) + LJ(21, j2 + j3 + LIZIZ5) + j3);
    }
}
