package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class V0Q {
    public static final V0R Default = new V0R();
    public static final V0Q defaultRandom = C36637EZl.LIZ.LIZIZ();

    public abstract int nextBits(int i);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    public double nextDouble() {
        return ((nextBits(26) << 27) + nextBits(27)) / 9.007199254740992E15d;
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public long nextLong() {
        return (nextInt() << 32) + nextInt();
    }

    public byte[] nextBytes(byte[] array) {
        o.LJIIIZ(array, "array");
        return nextBytes(array, 0, array.length);
    }

    public double nextDouble(double d) {
        return nextDouble(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, d);
    }

    public int nextInt(int i) {
        return nextInt(0, i);
    }

    public long nextLong(long j) {
        return nextLong(0L, j);
    }

    public byte[] nextBytes(int i) {
        return nextBytes(new byte[i]);
    }

    public double nextDouble(double d, double d2) {
        double nextDouble;
        if (d2 > d) {
            double d3 = d2 - d;
            if (Double.isInfinite(d3) && !Double.isInfinite(d) && !Double.isNaN(d) && !Double.isInfinite(d2) && !Double.isNaN(d2)) {
                double d4 = 2;
                double nextDouble2 = ((d2 / d4) - (d / d4)) * nextDouble();
                nextDouble = d + nextDouble2 + nextDouble2;
            } else {
                nextDouble = d + (nextDouble() * d3);
            }
            if (nextDouble >= d2) {
                return Math.nextAfter(d2, Double.NEGATIVE_INFINITY);
            }
            return nextDouble;
        }
        String LJI = C78841Uwv.LJI(Double.valueOf(d), Double.valueOf(d2));
        LJI.toString();
        throw new IllegalArgumentException(LJI);
    }

    public int nextInt(int i, int i2) {
        int nextInt;
        int i3;
        if (i2 > i) {
            int i4 = i2 - i;
            if (i4 > 0 || i4 == Integer.MIN_VALUE) {
                if (((-i4) & i4) == i4) {
                    i3 = nextBits(31 - Integer.numberOfLeadingZeros(i4));
                    return i + i3;
                }
                do {
                    nextInt = nextInt() >>> 1;
                    i3 = nextInt % i4;
                } while ((i4 - 1) + (nextInt - i3) < 0);
                return i + i3;
            }
            while (true) {
                int nextInt2 = nextInt();
                if (i <= nextInt2 && nextInt2 < i2) {
                    return nextInt2;
                }
            }
        } else {
            String LJI = C78841Uwv.LJI(Integer.valueOf(i), Integer.valueOf(i2));
            LJI.toString();
            throw new IllegalArgumentException(LJI);
        }
    }

    public long nextLong(long j, long j2) {
        long nextLong;
        long j3;
        int nextInt;
        if (j2 > j) {
            long j4 = j2 - j;
            if (j4 > 0) {
                if (((-j4) & j4) == j4) {
                    int i = (int) j4;
                    int i2 = (int) (j4 >>> 32);
                    if (i != 0) {
                        nextInt = nextBits(31 - Integer.numberOfLeadingZeros(i));
                    } else if (i2 == 1) {
                        nextInt = nextInt();
                    } else {
                        j3 = (nextBits(31 - Integer.numberOfLeadingZeros(i2)) << 32) + (nextInt() & 4294967295L);
                        return j + j3;
                    }
                    j3 = nextInt & 4294967295L;
                    return j + j3;
                }
                do {
                    nextLong = nextLong() >>> 1;
                    j3 = nextLong % j4;
                } while ((j4 - 1) + (nextLong - j3) < 0);
                return j + j3;
            }
            while (true) {
                long nextLong2 = nextLong();
                if (j <= nextLong2 && nextLong2 < j2) {
                    return nextLong2;
                }
            }
        } else {
            String LJI = C78841Uwv.LJI(Long.valueOf(j), Long.valueOf(j2));
            LJI.toString();
            throw new IllegalArgumentException(LJI);
        }
    }

    public byte[] nextBytes(byte[] array, int i, int i2) {
        boolean z;
        o.LJIIIZ(array, "array");
        if (new C40517FvF(0, array.length).LJIILJJIL(i) && new C40517FvF(0, array.length).LJIILJJIL(i2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i <= i2) {
                int i3 = (i2 - i) / 4;
                for (int i4 = 0; i4 < i3; i4++) {
                    int nextInt = nextInt();
                    array[i] = (byte) nextInt;
                    array[i + 1] = (byte) (nextInt >>> 8);
                    array[i + 2] = (byte) (nextInt >>> 16);
                    array[i + 3] = (byte) (nextInt >>> 24);
                    i += 4;
                }
                int i5 = i2 - i;
                int nextBits = nextBits(i5 * 8);
                for (int i6 = 0; i6 < i5; i6++) {
                    array[i + i6] = (byte) (nextBits >>> (i6 * 8));
                }
                return array;
            }
            String LJIIJJI = C48690J9a.LJIIJJI("fromIndex (", i, ") must be not greater than toIndex (", i2, ").");
            LJIIJJI.toString();
            throw new IllegalArgumentException(LJIIJJI);
        }
        StringBuilder LIZJ = C06460Ne.LIZJ("fromIndex (", i, ") or toIndex (", i2, ") are out of range: 0..");
        String LIZJ2 = b0.LIZJ(LIZJ, array.length, '.', LIZJ);
        LIZJ2.toString();
        throw new IllegalArgumentException(LIZJ2);
    }

    public static /* synthetic */ byte[] nextBytes$default(V0Q v0q, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return v0q.nextBytes(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }
}
