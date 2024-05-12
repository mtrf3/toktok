package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0xo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24560xo {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List LIZ(C24570xp c24570xp, int i, C24570xp c24570xp2, boolean z, boolean z2) {
        boolean z3;
        C61878OQg c61878OQg;
        boolean LJJIJ;
        int LJII;
        boolean z4;
        int i2;
        int LJIILL = c24570xp.LJIILL(i);
        int i3 = i + LJIILL;
        int LJI = c24570xp.LJI(c24570xp.LJIILJJIL(i), c24570xp.LIZIZ);
        int LJI2 = c24570xp.LJI(c24570xp.LJIILJJIL(i3), c24570xp.LIZIZ);
        int i4 = LJI2 - LJI;
        if (i >= 0 && (c24570xp.LIZIZ[(c24570xp.LJIILJJIL(i) * 5) + 1] & 201326592) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        c24570xp2.LJIIZILJ(LJIILL);
        c24570xp2.LJIJ(i4, c24570xp2.LJIIZILJ);
        if (c24570xp.LJ < i3) {
            c24570xp.LJJ(i3);
        }
        if (c24570xp.LJIIIZ < LJI2) {
            c24570xp.LJJIFFI(LJI2, i3);
        }
        int[] iArr = c24570xp2.LIZIZ;
        int i5 = c24570xp2.LJIIZILJ;
        int i6 = i5 * 5;
        C61898ORa.LJIILLIIL(i6, i * 5, i3 * 5, c24570xp.LIZIZ, iArr);
        Object[] objArr = c24570xp2.LIZJ;
        int i7 = c24570xp2.LJII;
        C61898ORa.LJIIZILJ(i7, LJI, LJI2, c24570xp.LIZJ, objArr);
        int i8 = c24570xp2.LJIJ;
        iArr[i6 + 2] = i8;
        int i9 = i5 - i;
        int i10 = i5 + LJIILL;
        int LJI3 = i7 - c24570xp2.LJI(i5, iArr);
        int i11 = c24570xp2.LJIIJJI;
        int i12 = c24570xp2.LJIIJ;
        int length = objArr.length;
        for (int i13 = i5; i13 < i10; i13++) {
            if (i13 != i5) {
                int i14 = (i13 * 5) + 2;
                iArr[i14] = iArr[i14] + i9;
            }
            int LJI4 = c24570xp2.LJI(i13, iArr) + LJI3;
            if (i11 < i13) {
                i2 = 0;
            } else {
                i2 = c24570xp2.LJIIIZ;
            }
            if (LJI4 > i2) {
                LJI4 = -(((length - i12) - LJI4) + 1);
            }
            iArr[(i13 * 5) + 4] = LJI4;
            if (i13 == i11) {
                i11++;
            }
        }
        c24570xp2.LJIIJJI = i11;
        int LJI5 = C78847Ux1.LJI(c24570xp.LIZLLL, i, c24570xp.LJIIL());
        int LJI6 = C78847Ux1.LJI(c24570xp.LIZLLL, i3, c24570xp.LJIIL());
        if (LJI5 < LJI6) {
            ArrayList<C24400xY> arrayList = c24570xp.LIZLLL;
            ArrayList arrayList2 = new ArrayList(LJI6 - LJI5);
            for (int i15 = LJI5; i15 < LJI6; i15++) {
                Object obj = ListProtector.get(arrayList, i15);
                o.LJIIIIZZ(obj, "sourceAnchors[anchorIndex]");
                C24400xY c24400xY = (C24400xY) obj;
                c24400xY.LIZ += i9;
                arrayList2.add(c24400xY);
            }
            c24570xp2.LIZLLL.addAll(C78847Ux1.LJI(c24570xp2.LIZLLL, c24570xp2.LJIIZILJ, c24570xp2.LJIIL()), arrayList2);
            arrayList.subList(LJI5, LJI6).clear();
            c61878OQg = arrayList2;
        } else {
            c61878OQg = C61878OQg.INSTANCE;
        }
        int LJJIIJ = c24570xp.LJJIIJ(i);
        if (z) {
            if (LJJIIJ >= 0) {
                z4 = true;
                c24570xp.LJJJ();
                c24570xp.LIZ(LJJIIJ - c24570xp.LJIIZILJ);
                c24570xp.LJJJ();
            } else {
                z4 = false;
            }
            c24570xp.LIZ(i - c24570xp.LJIIZILJ);
            LJJIJ = c24570xp.LJJIIZI();
            if (z4) {
                c24570xp.LJJIJLIJ();
                c24570xp.LJIIIIZZ();
                c24570xp.LJJIJLIJ();
                c24570xp.LJIIIIZZ();
            }
        } else {
            LJJIJ = c24570xp.LJJIJ(i, LJIILL);
            c24570xp.LJJIJIIJI(LJI, i4, i - 1);
        }
        if (!LJJIJ) {
            int i16 = c24570xp2.LJIILIIL;
            if (C78847Ux1.LJFF(i5, iArr)) {
                LJII = 1;
            } else {
                LJII = C78847Ux1.LJII(i5, iArr);
            }
            c24570xp2.LJIILIIL = i16 + LJII;
            if (z2) {
                c24570xp2.LJIIZILJ = i10;
                c24570xp2.LJII = i7 + i4;
            }
            if (z3) {
                c24570xp2.LJJJJI(i8);
            }
            return c61878OQg;
        }
        "Unexpectedly removed anchors".toString();
        C24780yA.LIZJ("Unexpectedly removed anchors");
        throw null;
    }
}
