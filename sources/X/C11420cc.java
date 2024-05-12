package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS0S0001000;
import kotlin.jvm.internal.o;

/* renamed from: X.0cc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11420cc {
    public final C1QN LIZ;
    public final ArrayList<C11400ca> LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public final List<Integer> LJI;
    public List<C11280cO> LJII;
    public int LJIIIIZZ;

    public final int LIZLLL() {
        return this.LIZ.getItemCount();
    }

    public final int LIZ() {
        return ((int) Math.sqrt((LIZLLL() * 1.0d) / this.LJIIIIZZ)) + 1;
    }

    public C11420cc(C1QN itemProvider) {
        o.LJIIIZ(itemProvider, "itemProvider");
        this.LIZ = itemProvider;
        ArrayList<C11400ca> arrayList = new ArrayList<>();
        arrayList.add(new C11400ca(0, 0));
        this.LIZIZ = arrayList;
        this.LJFF = -1;
        this.LJI = new ArrayList();
        this.LJII = C61878OQg.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097 A[ADDED_TO_REGION, LOOP:1: B:33:0x0097->B:59:0x0097, LOOP_START, PHI: r2 r3 r6
      0x0097: PHI (r2v3 int) = (r2v2 int), (r2v9 int) binds: [B:32:0x0095, B:59:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x0097: PHI (r3v4 int) = (r3v3 int), (r3v8 int) binds: [B:32:0x0095, B:59:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x0097: PHI (r6v4 int) = (r6v3 int), (r6v5 int) binds: [B:32:0x0095, B:59:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C11410cb LIZIZ(int r9) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11420cc.LIZIZ(int):X.0cb");
    }

    public final int LIZJ(int i) {
        boolean z;
        int i2;
        if (LIZLLL() <= 0) {
            return 0;
        }
        if (i < LIZLLL()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.LIZ.LIZIZ()) {
                return i / this.LJIIIIZZ;
            }
            int LJIIIZ = C47261Igj.LJIIIZ(this.LIZIZ, new IDqS0S0001000(i, 11));
            if (LJIIIZ < 0) {
                LJIIIZ = (-LJIIIZ) - 2;
            }
            int LIZ = LIZ() * LJIIIZ;
            int i3 = ((C11400ca) ListProtector.get(this.LIZIZ, LJIIIZ)).LIZ;
            if (i3 <= i) {
                int i4 = 0;
                while (i3 < i) {
                    int i5 = i3 + 1;
                    int LJ = LJ(i3);
                    i4 += LJ;
                    int i6 = this.LJIIIIZZ;
                    if (i4 >= i6) {
                        LIZ++;
                        if (i4 == i6) {
                            i4 = 0;
                        } else {
                            i4 = LJ;
                        }
                    }
                    if (LIZ % LIZ() == 0 && LIZ / LIZ() >= this.LIZIZ.size()) {
                        ArrayList<C11400ca> arrayList = this.LIZIZ;
                        if (i4 > 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        arrayList.add(new C11400ca(i5 - i2, 0));
                    }
                    i3 = i5;
                }
                if (LJ(i) + i4 > this.LJIIIIZZ) {
                    return LIZ + 1;
                }
                return LIZ;
            }
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final int LJ(int i) {
        return C78842Uww.LJIIL((int) this.LIZ.LJ(i), 1, this.LJIIIIZZ);
    }
}
