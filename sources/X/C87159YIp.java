package X;

/* renamed from: X.YIp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87159YIp {
    public static final C87159YIp LJ = new C87159YIp(0, new int[0], new Object[0]);
    public final int LIZ;
    public final int[] LIZIZ;
    public final Object[] LIZJ;
    public int LIZLLL;

    public C87159YIp() {
        this(0, new int[8], new Object[8]);
    }

    public final int LIZ() {
        int LJIJJ;
        int i = this.LIZLLL;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.LIZ; i3++) {
            int i4 = this.LIZIZ[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 5) {
                                ((Integer) this.LIZJ[i3]).intValue();
                                LJIJJ = AbstractC87156YIm.LJI(i5);
                            } else {
                                throw new IllegalStateException(new YI9("Protocol message tag had invalid wire type."));
                            }
                        } else {
                            i2 = ((C87159YIp) this.LIZJ[i3]).LIZ() + (AbstractC87156YIm.LJIJJ(i5) << 1) + i2;
                        }
                    } else {
                        LJIJJ = AbstractC87156YIm.LJIIJ(i5, (AbstractC87141YHx) this.LIZJ[i3]);
                    }
                } else {
                    ((Long) this.LIZJ[i3]).longValue();
                    LJIJJ = AbstractC87156YIm.LJJIIJ(i5);
                }
            } else {
                LJIJJ = AbstractC87156YIm.LJIJJ(i5) + AbstractC87156YIm.LJIILLIIL(((Long) this.LIZJ[i3]).longValue());
            }
            i2 = LJIJJ + i2;
        }
        this.LIZLLL = i2;
        return i2;
    }

    public final int hashCode() {
        int i = this.LIZ;
        int i2 = (i + 527) * 31;
        int[] iArr = this.LIZIZ;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.LIZJ;
        int i7 = this.LIZ;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void LIZIZ(YJ8 yj8) {
        if (this.LIZ == 0) {
            return;
        }
        yj8.getClass();
        for (int i = 0; i < this.LIZ; i++) {
            int i2 = this.LIZIZ[i];
            Object obj = this.LIZJ[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                yj8.LIZ.LIZLLL(i3, ((Integer) obj).intValue());
                            } else {
                                throw new RuntimeException(new YI9("Protocol message tag had invalid wire type."));
                            }
                        } else {
                            yj8.LIZ.LJJIIJZLJL(i3, 3);
                            ((C87159YIp) obj).LIZIZ(yj8);
                            yj8.LIZ.LJJIIJZLJL(i3, 4);
                        }
                    } else {
                        yj8.LIZ(i3, (AbstractC87141YHx) obj);
                    }
                } else {
                    yj8.LIZ.LJJIFFI(i3, ((Long) obj).longValue());
                }
            } else {
                yj8.LIZ.LJJI(i3, ((Long) obj).longValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C87159YIp)) {
            return false;
        }
        C87159YIp c87159YIp = (C87159YIp) obj;
        int i = this.LIZ;
        if (i == c87159YIp.LIZ) {
            int[] iArr = this.LIZIZ;
            int[] iArr2 = c87159YIp.LIZIZ;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.LIZJ;
                    Object[] objArr2 = c87159YIp.LIZJ;
                    int i3 = this.LIZ;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public C87159YIp(int i, int[] iArr, Object[] objArr) {
        this.LIZLLL = -1;
        this.LIZ = i;
        this.LIZIZ = iArr;
        this.LIZJ = objArr;
    }
}
