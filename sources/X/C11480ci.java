package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0ci, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11480ci {
    public final int LIZ;
    public final C11450cf[] LIZIZ;
    public final List<C11280cO> LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final EnumC23500w6 LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;

    public C11480ci() {
        throw null;
    }

    public final List<C1QL> LIZ(int i, int i2, int i3) {
        int i4;
        int i5;
        C11450cf[] c11450cfArr = this.LIZIZ;
        ArrayList arrayList = new ArrayList(c11450cfArr.length);
        int length = c11450cfArr.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i6 < length) {
            C11450cf c11450cf = c11450cfArr[i6];
            int i10 = i7 + 1;
            int i11 = (int) ((C11280cO) ListProtector.get(this.LIZJ, i7)).LIZ;
            if (this.LJFF == EnumC23500w6.Rtl) {
                i4 = (this.LJ - i8) - i11;
            } else {
                i4 = i8;
            }
            if (this.LIZLLL) {
                i5 = this.LIZ;
            } else {
                i5 = i4;
                i4 = this.LIZ;
            }
            int i12 = i5;
            C1QL LIZ = c11450cf.LIZ(i, i9, i2, i3, i12, i4, this.LJIIIIZZ);
            i9 += c11450cf.LIZLLL + this.LJII;
            i8 += i11;
            arrayList.add(LIZ);
            i6++;
            i7 = i10;
        }
        return arrayList;
    }

    public C11480ci(int i, C11450cf[] c11450cfArr, List list, boolean z, int i2, EnumC23500w6 enumC23500w6, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = c11450cfArr;
        this.LIZJ = list;
        this.LIZLLL = z;
        this.LJ = i2;
        this.LJFF = enumC23500w6;
        this.LJI = i3;
        this.LJII = i4;
        int i5 = 0;
        for (C11450cf c11450cf : c11450cfArr) {
            i5 = Math.max(i5, c11450cf.LJIIL);
        }
        this.LJIIIIZZ = i5;
        int i6 = i5 + this.LJI;
        this.LJIIIZ = i6 >= 0 ? i6 : 0;
    }
}
