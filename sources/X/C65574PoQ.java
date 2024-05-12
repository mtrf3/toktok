package X;

import java.util.Map;

/* renamed from: X.PoQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65574PoQ<K, V> extends AbstractC65564PoG<K, V> {
    public static final C65574PoQ LJLJLJ = new C65574PoQ(null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    public final transient int[] LJLJJL;
    public final transient Object[] LJLJJLL;
    public final transient int LJLJL;

    @Override // X.AbstractC65564PoG
    public final boolean LJ() {
        return false;
    }

    @Override // X.AbstractC65564PoG
    public final AbstractC65583PoZ<Map.Entry<K, V>> LIZ() {
        return new C65576PoS(this, this.LJLJJLL, this.LJLJL);
    }

    @Override // X.AbstractC65564PoG
    public final AbstractC65583PoZ<K> LIZIZ() {
        return new C65573PoP(this, new C65575PoR(0, this.LJLJL, this.LJLJJLL));
    }

    @Override // X.AbstractC65564PoG
    public final AbstractC65578PoU<V> LIZJ() {
        return new C65575PoR(1, this.LJLJL, this.LJLJJLL);
    }

    @Override // java.util.Map
    public final int size() {
        return this.LJLJL;
    }

    @Override // X.AbstractC65564PoG, java.util.Map
    public final V get(Object obj) {
        int[] iArr = this.LJLJJL;
        Object[] objArr = this.LJLJJLL;
        int i = this.LJLJL;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (!objArr[0].equals(obj)) {
                return null;
            }
            return (V) objArr[1];
        }
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        int LJIJJ = C1FP.LJIJJ(obj.hashCode());
        while (true) {
            int i2 = LJIJJ & length;
            int i3 = iArr[i2];
            if (i3 == -1) {
                return null;
            }
            if (objArr[i3].equals(obj)) {
                return (V) objArr[i3 ^ 1];
            }
            LJIJJ = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        r8[r1] = r2;
        r10 = r10 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <K, V> X.C65574PoQ<K, V> LJI(int r11, java.lang.Object[] r12) {
        /*
            if (r11 != 0) goto L5
            X.PoQ r0 = X.C65574PoQ.LJLJLJ
            return r0
        L5:
            r10 = 0
            r6 = 1
            r8 = 0
            if (r11 != r6) goto L17
            r1 = r12[r10]
            r0 = r12[r6]
            defpackage.g0.LJII(r1, r0)
            X.PoQ r0 = new X.PoQ
            r0.<init>(r8, r12, r6)
            return r0
        L17:
            int r0 = r12.length
            int r0 = r0 >> r6
            X.C76917UGr.LJIIIIZZ(r11, r0)
            int r0 = X.AbstractC65583PoZ.LJII(r11)
            if (r11 != r6) goto L2f
            r1 = r12[r10]
            r0 = r12[r6]
            defpackage.g0.LJII(r1, r0)
        L29:
            X.PoQ r0 = new X.PoQ
            r0.<init>(r8, r12, r11)
            return r0
        L2f:
            int r9 = r0 + (-1)
            int[] r8 = new int[r0]
            r3 = -1
            java.util.Arrays.fill(r8, r3)
        L37:
            if (r10 >= r11) goto L29
            int r2 = r10 * 2
            r7 = r12[r2]
            int r0 = r2 + 1
            r5 = r12[r0]
            defpackage.g0.LJII(r7, r5)
            int r0 = r7.hashCode()
            int r1 = X.C1FP.LJIJJ(r0)
        L4c:
            r1 = r1 & r9
            r4 = r8[r1]
            if (r4 != r3) goto L56
            r8[r1] = r2
            int r10 = r10 + 1
            goto L37
        L56:
            r0 = r12[r4]
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L61
            int r1 = r1 + 1
            goto L4c
        L61:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "Multiple entries with same key: "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r1 = "="
            r2.append(r1)
            r2.append(r5)
            java.lang.String r0 = " and "
            r2.append(r0)
            r0 = r12[r4]
            r2.append(r0)
            r2.append(r1)
            r6 = r6 ^ r4
            r0 = r12[r6]
            r2.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r2)
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65574PoQ.LJI(int, java.lang.Object[]):X.PoQ");
    }

    public C65574PoQ(int[] iArr, Object[] objArr, int i) {
        this.LJLJJL = iArr;
        this.LJLJJLL = objArr;
        this.LJLJL = i;
    }
}
