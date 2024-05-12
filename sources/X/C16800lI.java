package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import o3.h0;

/* renamed from: X.0lI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16800lI {
    public static final C16800lI LIZIZ;
    public final C16770lF LIZ;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            LIZIZ = C2I6.LJIILLIIL;
        } else {
            LIZIZ = C16770lF.LIZIZ;
        }
    }

    public final int LIZIZ() {
        return this.LIZ.LJIIJ().LIZLLL;
    }

    public final int LIZJ() {
        return this.LIZ.LJIIJ().LIZ;
    }

    public final int LIZLLL() {
        return this.LIZ.LJIIJ().LIZJ;
    }

    public final int LJ() {
        return this.LIZ.LJIIJ().LIZIZ;
    }

    public final boolean LJI() {
        return this.LIZ.LJIILIIL();
    }

    public final WindowInsets LJIIIZ() {
        C16770lF c16770lF = this.LIZ;
        if (c16770lF instanceof C1V3) {
            return ((C1V3) c16770lF).LIZJ;
        }
        return null;
    }

    public final int hashCode() {
        C16770lF c16770lF = this.LIZ;
        if (c16770lF == null) {
            return 0;
        }
        return c16770lF.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0034, code lost:
    
        if (r1 >= 28) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C16800lI(X.C16800lI r4) {
        /*
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L6b
            X.0lF r2 = r4.LIZ
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L1f
            boolean r0 = r2 instanceof X.C2I6
            if (r0 == 0) goto L23
            X.2I6 r1 = new X.2I6
            r0 = r2
            X.2I6 r0 = (X.C2I6) r0
            r1.<init>(r3, r0)
            r3.LIZ = r1
        L1b:
            r2.LJ(r3)
        L1e:
            return
        L1f:
            r0 = 29
            if (r1 < r0) goto L32
        L23:
            boolean r0 = r2 instanceof X.C2F7
            if (r0 == 0) goto L36
            X.2F7 r1 = new X.2F7
            r0 = r2
            X.2F7 r0 = (X.C2F7) r0
            r1.<init>(r3, r0)
            r3.LIZ = r1
            goto L1b
        L32:
            r0 = 28
            if (r1 < r0) goto L45
        L36:
            boolean r0 = r2 instanceof X.AnonymousClass223
            if (r0 == 0) goto L45
            X.223 r1 = new X.223
            r0 = r2
            X.223 r0 = (X.AnonymousClass223) r0
            r1.<init>(r3, r0)
            r3.LIZ = r1
            goto L1b
        L45:
            boolean r0 = r2 instanceof X.C43271mt
            if (r0 == 0) goto L54
            X.1mt r1 = new X.1mt
            r0 = r2
            X.1mt r0 = (X.C43271mt) r0
            r1.<init>(r3, r0)
            r3.LIZ = r1
            goto L1b
        L54:
            boolean r0 = r2 instanceof X.C1V3
            if (r0 == 0) goto L63
            X.1V3 r1 = new X.1V3
            r0 = r2
            X.1V3 r0 = (X.C1V3) r0
            r1.<init>(r3, r0)
            r3.LIZ = r1
            goto L1b
        L63:
            X.0lF r0 = new X.0lF
            r0.<init>(r3)
            r3.LIZ = r0
            goto L1b
        L6b:
            X.0lF r0 = new X.0lF
            r0.<init>(r3)
            r3.LIZ = r0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16800lI.<init>(X.0lI):void");
    }

    public final C07310Ql LIZ(int i) {
        return this.LIZ.LJI(i);
    }

    public final boolean LJII(int i) {
        return this.LIZ.LJIILL(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16800lI)) {
            return false;
        }
        return Objects.equals(this.LIZ, ((C16800lI) obj).LIZ);
    }

    public C16800lI(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.LIZ = new C2I6(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.LIZ = new C2F7(this, windowInsets);
        } else if (i >= 28) {
            this.LIZ = new AnonymousClass223(this, windowInsets);
        } else {
            this.LIZ = new C43271mt(this, windowInsets);
        }
    }

    public static C16800lI LJIIJ(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C16800lI c16800lI = new C16800lI(windowInsets);
        if (view != null && C16330kX.LIZIZ(view)) {
            c16800lI.LIZ.LJIJ(h0.LJIIIZ(view));
            c16800lI.LIZ.LIZLLL(view.getRootView());
        }
        return c16800lI;
    }

    public final C16800lI LJIIIIZZ(int i, int i2, int i3, int i4) {
        C16750lD c16750lD = new C16750lD(this);
        c16750lD.LIZ.LJFF(C07310Ql.LIZIZ(i, i2, i3, i4));
        return c16750lD.LIZ();
    }

    public static C07310Ql LJFF(C07310Ql c07310Ql, int i, int i2, int i3, int i4) {
        int max = Math.max(0, c07310Ql.LIZ - i);
        int max2 = Math.max(0, c07310Ql.LIZIZ - i2);
        int max3 = Math.max(0, c07310Ql.LIZJ - i3);
        int max4 = Math.max(0, c07310Ql.LIZLLL - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return c07310Ql;
        }
        return C07310Ql.LIZIZ(max, max2, max3, max4);
    }
}
