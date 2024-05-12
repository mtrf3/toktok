package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1zH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50951zH extends AbstractC014804a implements InterfaceC44931pZ {
    public final InterfaceC07740Sc LJLILLLLZI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HorizontalAlignModifier(horizontal=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50951zH(X.C31611Lx r3) {
        /*
            r2 = this;
            X.1qA r1 = androidx.compose.ui.platform.g1.LIZ
            java.lang.String r0 = "horizontal"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "inspectorInfo"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.<init>(r1)
            r2.LJLILLLLZI = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50951zH.<init>(X.1Lx):void");
    }

    public final boolean equals(Object obj) {
        C50951zH c50951zH;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50951zH) || (c50951zH = (C50951zH) obj) == null) {
            return false;
        }
        return o.LJ(this.LJLILLLLZI, c50951zH.LJLILLLLZI);
    }

    @Override // X.InterfaceC44931pZ
    public final Object LJIIL(InterfaceC23370vt interfaceC23370vt, Object obj) {
        C0YV c0yv;
        o.LJIIIZ(interfaceC23370vt, "<this>");
        if (!(obj instanceof C0YV) || (c0yv = (C0YV) obj) == null) {
            c0yv = new C0YV(0);
        }
        InterfaceC07740Sc horizontal = this.LJLILLLLZI;
        o.LJIIIZ(horizontal, "horizontal");
        c0yv.LIZJ = new C1P5(horizontal);
        return c0yv;
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
