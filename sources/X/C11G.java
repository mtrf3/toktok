package X;

import kotlin.jvm.internal.o;

/* renamed from: X.11G, reason: invalid class name */
/* loaded from: classes.dex */
public class C11G {
    public final C25710zf<C37491dZ> LIZ = new C25710zf<>(new C37491dZ[16]);

    public final void LJFF() {
        int i = 0;
        while (true) {
            C25710zf<C37491dZ> c25710zf = this.LIZ;
            if (i < c25710zf.LJLJI) {
                C37491dZ c37491dZ = c25710zf.LJLIL[i];
                if (!C1JI.LJIJJLI(c37491dZ.LIZIZ)) {
                    this.LIZ.LJIILJJIL(i);
                    c37491dZ.LIZJ();
                } else {
                    i++;
                    c37491dZ.LJFF();
                }
            } else {
                return;
            }
        }
    }

    public void LIZJ() {
        C25710zf<C37491dZ> c25710zf = this.LIZ;
        int i = c25710zf.LJLJI;
        if (i > 0) {
            C37491dZ[] c37491dZArr = c25710zf.LJLIL;
            o.LJII(c37491dZArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            do {
                c37491dZArr[i2].LIZJ();
                i2++;
            } while (i2 < i);
        }
    }

    public void LIZIZ(C11B c11b) {
        for (int i = this.LIZ.LJLJI - 1; -1 < i; i--) {
            if (this.LIZ.LJLIL[i].LIZJ.LJIIJ()) {
                this.LIZ.LJIILJJIL(i);
            }
        }
    }

    public boolean LIZLLL(C11B c11b) {
        C25710zf<C37491dZ> c25710zf = this.LIZ;
        int i = c25710zf.LJLJI;
        boolean z = false;
        if (i > 0) {
            C37491dZ[] c37491dZArr = c25710zf.LJLIL;
            o.LJII(c37491dZArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            z = false;
            do {
                if (c37491dZArr[i2].LIZLLL(c11b) || z) {
                    z = true;
                } else {
                    z = false;
                }
                i2++;
            } while (i2 < i);
        }
        LIZIZ(c11b);
        return z;
    }

    public boolean LIZ(java.util.Map<C11O, C11P> changes, InterfaceC274415w parentCoordinates, C11B c11b, boolean z) {
        o.LJIIIZ(changes, "changes");
        o.LJIIIZ(parentCoordinates, "parentCoordinates");
        C25710zf<C37491dZ> c25710zf = this.LIZ;
        int i = c25710zf.LJLJI;
        boolean z2 = false;
        if (i > 0) {
            C37491dZ[] c37491dZArr = c25710zf.LJLIL;
            o.LJII(c37491dZArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            z2 = false;
            do {
                if (c37491dZArr[i2].LIZ(changes, parentCoordinates, c11b, z) || z2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i2++;
            } while (i2 < i);
        }
        return z2;
    }

    public boolean LJ(java.util.Map<C11O, C11P> changes, InterfaceC274415w parentCoordinates, C11B c11b, boolean z) {
        o.LJIIIZ(changes, "changes");
        o.LJIIIZ(parentCoordinates, "parentCoordinates");
        C25710zf<C37491dZ> c25710zf = this.LIZ;
        int i = c25710zf.LJLJI;
        boolean z2 = false;
        if (i > 0) {
            C37491dZ[] c37491dZArr = c25710zf.LJLIL;
            o.LJII(c37491dZArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            z2 = false;
            do {
                if (c37491dZArr[i2].LJ(changes, parentCoordinates, c11b, z) || z2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i2++;
            } while (i2 < i);
        }
        return z2;
    }
}
