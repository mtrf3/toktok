package X;

import kotlin.jvm.internal.o;

/* renamed from: X.28t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C536728t extends AbstractC014804a implements InterfaceC44931pZ, InterfaceC274715z {
    public final Object LJLILLLLZI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC44931pZ
    public final Object LJIIL(InterfaceC23370vt interfaceC23370vt, Object obj) {
        o.LJIIIZ(interfaceC23370vt, "<this>");
        return this;
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
        LIZ.append("LayoutId(id=");
        return U26.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC274715z
    public final Object getLayoutId() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C536728t(java.lang.Object r3) {
        /*
            r2 = this;
            X.1qA r1 = androidx.compose.ui.platform.g1.LIZ
            java.lang.String r0 = "inspectorInfo"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.<init>(r1)
            r2.LJLILLLLZI = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C536728t.<init>(java.lang.Object):void");
    }

    public final boolean equals(Object obj) {
        C536728t c536728t;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C536728t) || (c536728t = (C536728t) obj) == null) {
            return false;
        }
        return o.LJ(this.LJLILLLLZI, c536728t.LJLILLLLZI);
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
