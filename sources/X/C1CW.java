package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: X.1CW, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1CW extends AbstractC03490Bt {
    public static final String[] LLI = {"android:visibility:visibility", "android:visibility:parent"};
    public int LLFZ = 3;

    public abstract Animator LJJIL(ViewGroup viewGroup, View view, C03860De c03860De, C03860De c03860De2);

    public abstract Animator LJJIZ(ViewGroup viewGroup, View view, C03860De c03860De);

    @Override // X.AbstractC03490Bt
    public final String[] LJIILLIIL() {
        return LLI;
    }

    public static final void LJJIJL(C03860De c03860De) {
        int visibility = c03860De.LIZIZ.getVisibility();
        ((HashMap) c03860De.LIZ).put("android:visibility:visibility", Integer.valueOf(visibility));
        ((HashMap) c03860De.LIZ).put("android:visibility:parent", c03860De.LIZIZ.getParent());
        int[] iArr = new int[2];
        c03860De.LIZIZ.getLocationOnScreen(iArr);
        ((HashMap) c03860De.LIZ).put("android:visibility:screenLocation", iArr);
    }

    @Override // X.AbstractC03490Bt
    public void LIZLLL(C03860De c03860De) {
        LJJIJL(c03860De);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        if (r8 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C03530Bx LJJIJLIJ(X.C03860De r7, X.C03860De r8) {
        /*
            X.0Bx r5 = new X.0Bx
            r5.<init>()
            r6 = 0
            r5.LIZ = r6
            r5.LIZIZ = r6
            java.lang.String r1 = "android:visibility:parent"
            r4 = 0
            r3 = -1
            java.lang.String r2 = "android:visibility:visibility"
            if (r7 == 0) goto L77
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.LIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L77
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.LIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r5.LIZJ = r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.LIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.LJ = r0
        L38:
            if (r8 == 0) goto L72
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.LIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L72
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.LIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r5.LIZLLL = r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.LIZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.LJFF = r0
        L60:
            r4 = 1
            if (r7 == 0) goto L9e
            if (r8 == 0) goto La9
            int r3 = r5.LIZJ
            int r2 = r5.LIZLLL
            if (r3 != r2) goto L7c
            android.view.ViewGroup r1 = r5.LJ
            android.view.ViewGroup r0 = r5.LJFF
            if (r1 != r0) goto L7c
            return r5
        L72:
            r5.LIZLLL = r3
            r5.LJFF = r4
            goto L60
        L77:
            r5.LIZJ = r3
            r5.LJ = r4
            goto L38
        L7c:
            if (r3 == r2) goto L8c
            if (r3 != 0) goto L85
            r5.LIZIZ = r6
            r5.LIZ = r4
            goto La6
        L85:
            if (r2 != 0) goto La6
            r5.LIZIZ = r4
            r5.LIZ = r4
            goto La6
        L8c:
            android.view.ViewGroup r0 = r5.LJFF
            if (r0 != 0) goto L95
            r5.LIZIZ = r6
            r5.LIZ = r4
            goto La6
        L95:
            android.view.ViewGroup r0 = r5.LJ
            if (r0 != 0) goto La6
            r5.LIZIZ = r4
            r5.LIZ = r4
            goto La6
        L9e:
            int r0 = r5.LIZLLL
            if (r0 != 0) goto La7
            r5.LIZIZ = r4
            r5.LIZ = r4
        La6:
            return r5
        La7:
            if (r8 != 0) goto La6
        La9:
            int r0 = r5.LIZJ
            if (r0 != 0) goto La6
            r5.LIZIZ = r6
            r5.LIZ = r4
            goto La6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1CW.LJJIJLIJ(X.0De, X.0De):X.0Bx");
    }

    @Override // X.AbstractC03490Bt
    public final boolean LJIJ(C03860De c03860De, C03860De c03860De2) {
        if (c03860De == null) {
            if (c03860De2 == null) {
                return false;
            }
        } else if (c03860De2 != null && ((HashMap) c03860De2.LIZ).containsKey("android:visibility:visibility") != ((HashMap) c03860De.LIZ).containsKey("android:visibility:visibility")) {
            return false;
        }
        C03530Bx LJJIJLIJ = LJJIJLIJ(c03860De, c03860De2);
        if (!LJJIJLIJ.LIZ) {
            return false;
        }
        if (LJJIJLIJ.LIZJ != 0 && LJJIJLIJ.LIZLLL != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (LJJIJLIJ(LJIILJJIL(r0, false), LJIIZILJ(r0, false)).LIZ != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0222, code lost:
    
        if (r21.LJLLL != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0239  */
    @Override // X.AbstractC03490Bt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator LJIIJ(final android.view.ViewGroup r22, X.C03860De r23, X.C03860De r24) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1CW.LJIIJ(android.view.ViewGroup, X.0De, X.0De):android.animation.Animator");
    }
}
