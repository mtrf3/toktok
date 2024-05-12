package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0cY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11380cY {
    public static final C41391jr<C23450w1> LIZ = C1JI.LJJIJIIJI(0.0f, 400.0f, new C23450w1(C07180Py.LIZ()), 1);

    public static final int LIZIZ(C11420cc c11420cc, int i) {
        if (i >= c11420cc.LIZLLL()) {
            C11410cb LIZIZ = c11420cc.LIZIZ(c11420cc.LIZJ(c11420cc.LIZLLL() - 1));
            int i2 = LIZIZ.LIZ - 1;
            List<C11280cO> list = LIZIZ.LIZIZ;
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                i3 += (int) ((C11280cO) ListProtector.get(list, i4)).LIZ;
                i2++;
            }
            int i5 = c11420cc.LJIIIIZZ;
            int i6 = (i5 - i3) + 1 + i2;
            return (((i - i6) / i5) * i5) + i6;
        }
        return c11420cc.LIZIZ(c11420cc.LIZJ(i)).LIZ;
    }

    public static final int LIZJ(C11420cc c11420cc, int i) {
        if (i >= c11420cc.LIZLLL()) {
            return LIZIZ(c11420cc, i) + c11420cc.LJIIIIZZ;
        }
        C11410cb LIZIZ = c11420cc.LIZIZ(c11420cc.LIZJ(i));
        return LIZIZ.LIZ + LIZIZ.LIZIZ.size();
    }

    public static final int LIZ(C11420cc c11420cc, int i, int i2, int i3, List list) {
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        while (i <= i2) {
            int LIZJ = LIZJ(c11420cc, i) - 1;
            if (LIZJ <= i2) {
                ArrayList arrayList = (ArrayList) list;
                if (!arrayList.isEmpty() && LIZJ >= ((C1QL) ORZ.LJLLJ(list)).LIZJ && LIZJ <= ((C1QL) ORZ.LLFF(list)).LIZJ) {
                    if (LIZJ - ((C1QL) ORZ.LJLLJ(list)).LIZJ < ((C1QL) ORZ.LLFF(list)).LIZJ - LIZJ) {
                        int size = arrayList.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            C1QL c1ql = (C1QL) ListProtector.get(list, i8);
                            int i9 = c1ql.LIZJ;
                            if (i9 == LIZJ) {
                                i5 = c1ql.LJIIIIZZ;
                                i6 = c1ql.LJII;
                                i4 = i5 + i6;
                                break;
                            }
                            if (i9 > LIZJ) {
                                break;
                            }
                        }
                    } else {
                        for (int LJJI = C47261Igj.LJJI(list); -1 < LJJI; LJJI--) {
                            C1QL c1ql2 = (C1QL) ListProtector.get(list, LJJI);
                            int i10 = c1ql2.LIZJ;
                            if (i10 == LIZJ) {
                                i5 = c1ql2.LJIIIIZZ;
                                i6 = c1ql2.LJII;
                                i4 = i5 + i6;
                                break;
                            }
                            if (i10 < LIZJ) {
                                break;
                            }
                        }
                    }
                    i7 += i4;
                }
                i4 = i3;
                i7 += i4;
            }
            i = LIZJ + 1;
        }
        return i7;
    }
}
