package Y;

import X.C31319CQx;
import X.C32063CiB;
import java.util.Comparator;

/* loaded from: classes6.dex */
public class IDComparatorS338S0100000_5 implements Comparator {
    public final int $t;
    public Object l0;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            case 2:
                return compare$2(this, t, t2);
            default:
                return 0;
        }
    }

    public IDComparatorS338S0100000_5(int i) {
        this.$t = i;
        this.l0 = C32063CiB.LJLIL;
    }

    public IDComparatorS338S0100000_5(C31319CQx c31319CQx, int i) {
        this.$t = i;
        this.l0 = c31319CQx;
    }

    public static final int compare$0(IDComparatorS338S0100000_5 iDComparatorS338S0100000_5, Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return ((Comparator) iDComparatorS338S0100000_5.l0).compare(obj, obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int compare$1(Y.IDComparatorS338S0100000_5 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            java.lang.Object r0 = r6.l0
            X.CQx r0 = (X.C31319CQx) r0
            X.CRD r7 = (X.CRD) r7
            X.CRD r8 = (X.CRD) r8
            boolean r0 = r0.LJLLL
            r5 = 0
            if (r0 == 0) goto L1f
            long r2 = r7.getPriority()
            long r0 = r8.getPriority()
            long r2 = r2 - r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L1f
            if (r0 <= 0) goto L3a
        L1d:
            r0 = 1
        L1e:
            return r0
        L1f:
            long r3 = r7.LJIL()
            long r1 = r8.LJIL()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L2d
            r0 = 0
            goto L1e
        L2d:
            long r2 = r7.LJIL()
            long r0 = r8.LJIL()
            long r2 = r2 - r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L1d
        L3a:
            r0 = -1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDComparatorS338S0100000_5.compare$1(Y.IDComparatorS338S0100000_5, java.lang.Object, java.lang.Object):int");
    }

    public static final int compare$2(IDComparatorS338S0100000_5 iDComparatorS338S0100000_5, Object obj, Object obj2) {
        C31319CQx c31319CQx = (C31319CQx) iDComparatorS338S0100000_5.l0;
        int LJIIIIZZ = c31319CQx.LJZI.LJIIIIZZ(obj);
        int LJIIIIZZ2 = c31319CQx.LJZI.LJIIIIZZ(obj2);
        if (LJIIIIZZ < LJIIIIZZ2) {
            return -1;
        }
        if (LJIIIIZZ == LJIIIIZZ2) {
            return 0;
        }
        return 1;
    }
}
