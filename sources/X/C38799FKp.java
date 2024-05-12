package X;

import Y.ARunnableS1S0001000_6;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.FKp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38799FKp {
    public static long LIZJ;
    public static long LIZLLL;
    public static String LJ;
    public static final C38799FKp LIZ = new C38799FKp();
    public static final EnumC38801FKr LIZIZ = EnumC38801FKr.REGULAR;
    public static final CopyOnWriteArrayList<InterfaceC65784Pro<C76800UCe>> LJFF = new CopyOnWriteArrayList<>();

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        if (r3 < r5) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ() {
        /*
            java.util.concurrent.CopyOnWriteArrayList<X.Pro<X.UCe>> r2 = X.C38799FKp.LJFF
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = X.C38799FKp.LJ
            if (r1 == 0) goto L1d
            X.FKv r0 = X.C38805FKv.LIZ
            r0.getClass()
            X.FKs r0 = X.C38805FKv.LJFF
            if (r0 == 0) goto L1d
            r0.LIZIZ(r1)
        L1d:
            r0 = 0
            java.lang.Object r0 = r2.remove(r0)
            X.Pro r0 = (X.InterfaceC65784Pro) r0
            r0.invoke()
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r5
            java.lang.String r1 = X.C38799FKp.LJ
            if (r1 == 0) goto L3c
            X.FKv r0 = X.C38805FKv.LIZ
            r0.getClass()
            X.FKs r0 = X.C38805FKv.LJFF
            if (r0 == 0) goto L3c
            r0.LIZ(r1)
        L3c:
            long r0 = X.C38799FKp.LIZJ
            long r0 = r0 + r3
            X.C38799FKp.LIZJ = r0
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L6f
            X.FKr r0 = X.C38799FKp.LIZIZ
            int[] r1 = X.C38800FKq.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r7 = 1
            if (r1 == r7) goto L8e
            r0 = 2
            if (r1 == r0) goto L70
            r0 = 3
            r3 = 0
            if (r1 == r0) goto L82
        L5c:
            X.FKv r0 = X.C38805FKv.LIZ
            r0.getClass()
            android.os.Handler r2 = X.C38805FKv.LIZLLL()
            Y.ARunnableS1S0001000_6 r1 = new Y.ARunnableS1S0001000_6
            r0 = 16
            r1.<init>(r7, r0)
            r2.postDelayed(r1, r3)
        L6f:
            return
        L70:
            long r0 = (long) r0
            long r3 = r3 * r0
            long r5 = X.C38799FKp.LIZLLL
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L79
            goto L8c
        L79:
            r0 = 10
            long r0 = (long) r0
            long r5 = r5 / r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L5c
            goto L8c
        L82:
            long r1 = X.C38799FKp.LIZJ
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5c
            long r5 = X.C38799FKp.LIZLLL
            X.C38799FKp.LIZJ = r3
        L8c:
            r3 = r5
            goto L5c
        L8e:
            long r3 = X.C38799FKp.LIZLLL
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38799FKp.LIZ():void");
    }

    public final void LIZIZ(Integer num, String str, List list) {
        if (num != null) {
            LIZLLL = num.intValue();
        }
        LJ = str;
        LJFF.addAll(list);
        C38805FKv.LIZ.getClass();
        C38805FKv.LIZLLL().post(new ARunnableS1S0001000_6(0, 20));
    }
}
