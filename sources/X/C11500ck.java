package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.0ck, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11500ck {
    public final boolean LIZ;
    public final List<Integer> LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final C11460cg LJFF;
    public final C11420cc LJI;
    public final InterfaceC11270cN LJII;

    public final C11480ci LIZIZ(int i) {
        int i2;
        C11410cb LIZIZ = this.LJI.LIZIZ(i);
        int size = LIZIZ.LIZIZ.size();
        if (size == 0 || LIZIZ.LIZ + size == this.LIZLLL) {
            i2 = 0;
        } else {
            i2 = this.LJ;
        }
        C11450cf[] c11450cfArr = new C11450cf[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = (int) ((C11280cO) ListProtector.get(LIZIZ.LIZIZ, i4)).LIZ;
            long LIZ = LIZ(i3, i5);
            i3 += i5;
            c11450cfArr[i4] = this.LJFF.LIZ(LIZIZ.LIZ + i4, i2, LIZ);
        }
        return this.LJII.LIZ(i, c11450cfArr, LIZIZ.LIZIZ, i2);
    }

    public final long LIZ(int i, int i2) {
        int intValue;
        int intValue2 = ((Number) ListProtector.get(this.LIZIZ, (i + i2) - 1)).intValue();
        int i3 = 0;
        if (i == 0) {
            intValue = 0;
        } else {
            intValue = ((Number) ListProtector.get(this.LIZIZ, i - 1)).intValue();
        }
        int LIZ = C0EH.LIZ(i2, -1, this.LIZJ, intValue2 - intValue);
        if (LIZ >= 0) {
            i3 = LIZ;
        }
        if (this.LIZ) {
            return C23350vr.LIZLLL(i3);
        }
        return C23350vr.LIZJ(i3);
    }

    public C11500ck(boolean z, List list, int i, int i2, int i3, C11460cg c11460cg, C11420cc c11420cc, C1QI c1qi) {
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = c11460cg;
        this.LJI = c11420cc;
        this.LJII = c1qi;
    }
}
