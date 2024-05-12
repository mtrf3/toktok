package X;

import java.util.Arrays;

/* renamed from: X.YIn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87157YIn {
    public static final C87157YIn LJFF = new C87157YIn(0, new int[0], new Object[0], false);
    public int LIZ;
    public int[] LIZIZ;
    public Object[] LIZJ;
    public int LIZLLL;
    public boolean LJ;

    public C87157YIn(int i, int[] iArr, Object[] objArr, boolean z) {
        this.LIZLLL = -1;
        this.LIZ = i;
        this.LIZIZ = iArr;
        this.LIZJ = objArr;
        this.LJ = z;
    }

    public static C87157YIn LIZIZ() {
        return new C87157YIn(0, new int[8], new Object[8], true);
    }

    public C87157YIn() {
        this(0, new int[8], new Object[8], true);
    }

    public final int LIZ() {
        int LJLJL;
        int LJLJLJ;
        int i;
        int i2 = this.LIZLLL;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.LIZ; i4++) {
                int i5 = this.LIZIZ[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 5) {
                                    ((Integer) this.LIZJ[i4]).intValue();
                                    i = AbstractC87153YIj.LJLJL(i6 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(new C87183YJn("Protocol message tag had invalid wire type."));
                                }
                            } else {
                                int LLFZ = AbstractC87153YIj.LLFZ(i6);
                                LJLJL = LLFZ + LLFZ;
                                LJLJLJ = ((C87157YIn) this.LIZJ[i4]).LIZ();
                            }
                        } else {
                            AbstractC87134YHq abstractC87134YHq = (AbstractC87134YHq) this.LIZJ[i4];
                            int LJLJL2 = AbstractC87153YIj.LJLJL(i6 << 3);
                            int zzd = abstractC87134YHq.zzd();
                            i = AbstractC87153YIj.LJLJL(zzd) + zzd + LJLJL2;
                        }
                    } else {
                        ((Long) this.LIZJ[i4]).longValue();
                        i = AbstractC87153YIj.LJLJL(i6 << 3) + 8;
                    }
                    i3 = i + i3;
                } else {
                    long longValue = ((Long) this.LIZJ[i4]).longValue();
                    LJLJL = AbstractC87153YIj.LJLJL(i6 << 3);
                    LJLJLJ = AbstractC87153YIj.LJLJLJ(longValue);
                }
                i = LJLJLJ + LJLJL;
                i3 = i + i3;
            }
            this.LIZLLL = i3;
            return i3;
        }
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

    public final void LIZLLL(C87149YIf c87149YIf) {
        if (this.LIZ != 0) {
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
                                    c87149YIf.LIZ.LJLLILLLL(i3, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(new C87183YJn("Protocol message tag had invalid wire type."));
                                }
                            } else {
                                c87149YIf.LIZ.LJZI(i3, 3);
                                ((C87157YIn) obj).LIZLLL(c87149YIf);
                                c87149YIf.LIZ.LJZI(i3, 4);
                            }
                        } else {
                            c87149YIf.LIZ(i3, (AbstractC87134YHq) obj);
                        }
                    } else {
                        c87149YIf.LIZ.LJLLL(i3, ((Long) obj).longValue());
                    }
                } else {
                    c87149YIf.LIZ.LLD(i3, ((Long) obj).longValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C87157YIn)) {
            return false;
        }
        C87157YIn c87157YIn = (C87157YIn) obj;
        int i = this.LIZ;
        if (i == c87157YIn.LIZ) {
            int[] iArr = this.LIZIZ;
            int[] iArr2 = c87157YIn.LIZIZ;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.LIZJ;
                    Object[] objArr2 = c87157YIn.LIZJ;
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

    public final void LIZJ(int i, Object obj) {
        int i2;
        if (this.LJ) {
            int i3 = this.LIZ;
            int[] iArr = this.LIZIZ;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.LIZIZ = Arrays.copyOf(iArr, i4);
                this.LIZJ = Arrays.copyOf(this.LIZJ, i4);
            }
            int[] iArr2 = this.LIZIZ;
            int i5 = this.LIZ;
            iArr2[i5] = i;
            this.LIZJ[i5] = obj;
            this.LIZ = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
