package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1zE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50921zE extends AbstractC014804a implements InterfaceC44931pZ {
    public final float LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    public final int hashCode() {
        return C16880lQ.LLJILJIL(this.LJLJI) + (Float.floatToIntBits(this.LJLILLLLZI) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LayoutWeightImpl(weight=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", fill=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50921zE(boolean r3) {
        /*
            r2 = this;
            X.1qA r1 = androidx.compose.ui.platform.g1.LIZ
            java.lang.String r0 = "inspectorInfo"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.<init>(r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.LJLILLLLZI = r0
            r2.LJLJI = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50921zE.<init>(boolean):void");
    }

    public final boolean equals(Object obj) {
        C50921zE c50921zE;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50921zE) {
            c50921zE = (C50921zE) obj;
        } else {
            c50921zE = null;
        }
        if (c50921zE != null && this.LJLILLLLZI == c50921zE.LJLILLLLZI && this.LJLJI == c50921zE.LJLJI) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC44931pZ
    public final Object LJIIL(InterfaceC23370vt interfaceC23370vt, Object obj) {
        C0YV c0yv;
        o.LJIIIZ(interfaceC23370vt, "<this>");
        if (!(obj instanceof C0YV) || (c0yv = (C0YV) obj) == null) {
            c0yv = new C0YV(0);
        }
        c0yv.LIZ = this.LJLILLLLZI;
        c0yv.LIZIZ = this.LJLJI;
        return c0yv;
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
