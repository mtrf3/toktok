package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.13O, reason: invalid class name */
/* loaded from: classes.dex */
public final class C13O {
    public final C13K[] LIZ;
    public int LIZIZ;
    public long LIZJ;

    public final long LIZ() {
        C13N c13n;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = this.LIZIZ;
        C13K c13k = this.LIZ[i];
        if (c13k == null) {
            c13n = C13N.LJ;
        } else {
            int i2 = 0;
            C13K c13k2 = c13k;
            while (true) {
                C13K c13k3 = this.LIZ[i];
                if (c13k3 != null) {
                    long j = c13k.LIZIZ;
                    long j2 = c13k3.LIZIZ;
                    float f = (float) (j - j2);
                    float abs = (float) Math.abs(j2 - c13k2.LIZIZ);
                    if (f > 100.0f || abs > 40.0f) {
                        break;
                    }
                    long j3 = c13k3.LIZ;
                    arrayList.add(Float.valueOf(C10370av.LIZLLL(j3)));
                    arrayList2.add(Float.valueOf(C10370av.LJ(j3)));
                    arrayList3.add(Float.valueOf(-f));
                    if (i == 0) {
                        i = 20;
                    }
                    i--;
                    i2++;
                    if (i2 >= 20) {
                        c13k2 = c13k3;
                        break;
                    }
                    c13k2 = c13k3;
                } else {
                    break;
                }
            }
            if (i2 < 3) {
                c13n = new C13N(C10370av.LIZIZ, 1.0f, c13k.LIZIZ - c13k2.LIZIZ, C10370av.LJFF(c13k.LIZ, c13k2.LIZ));
            }
            try {
                C37971eL LJJJI = C17N.LJJJI(arrayList3, arrayList);
                C37971eL LJJJI2 = C17N.LJJJI(arrayList3, arrayList2);
                float f2 = 1000;
                c13n = new C13N(C78923UyF.LIZ(((Number) ListProtector.get(LJJJI.LJLIL, 1)).floatValue() * f2, ((Number) ListProtector.get(LJJJI2.LJLIL, 1)).floatValue() * f2), LJJJI.LJLILLLLZI * LJJJI2.LJLILLLLZI, c13k.LIZIZ - c13k2.LIZIZ, C10370av.LJFF(c13k.LIZ, c13k2.LIZ));
            } catch (IllegalArgumentException unused) {
                c13n = C13N.LJ;
            }
        }
        long j4 = c13n.LIZ;
        return C78983UzD.LJFF(C10370av.LIZLLL(j4), C10370av.LJ(j4));
    }

    public C13O() {
        C13K[] c13kArr = new C13K[20];
        int i = 0;
        do {
            c13kArr[i] = null;
            i++;
        } while (i < 20);
        this.LIZ = c13kArr;
        this.LIZJ = C10370av.LIZIZ;
    }
}
