package X;

import kotlin.jvm.internal.o;

/* renamed from: X.28w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C537028w extends AbstractC014804a implements InterfaceC44951pb {
    public final InterfaceC88473Ynt<InterfaceC44861pS, InterfaceC39071g7, C23360vs, InterfaceC273515n> LJLILLLLZI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC44951pb
    public final /* synthetic */ int LJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        return C79062V1e.LIZIZ(this, interfaceC39181gI, interfaceC274115t, i);
    }

    @Override // X.InterfaceC44951pb
    public final /* synthetic */ int LJIIJJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        return C79062V1e.LIZLLL(this, interfaceC39181gI, interfaceC274115t, i);
    }

    @Override // X.InterfaceC44951pb
    public final /* synthetic */ int LJJJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        return C79062V1e.LIZ(this, interfaceC39181gI, interfaceC274115t, i);
    }

    @Override // X.InterfaceC44951pb
    public final /* synthetic */ int LJJJIL(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        return C79062V1e.LIZJ(this, interfaceC39181gI, interfaceC274115t, i);
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
        LIZ.append("LayoutModifierImpl(measureBlock=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C537028w(X.InterfaceC88473Ynt r3) {
        /*
            r2 = this;
            X.1qA r1 = androidx.compose.ui.platform.g1.LIZ
            java.lang.String r0 = "measureBlock"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "inspectorInfo"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.<init>(r1)
            r2.LJLILLLLZI = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C537028w.<init>(X.Ynt):void");
    }

    public final boolean equals(Object obj) {
        C537028w c537028w;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C537028w) || (c537028w = (C537028w) obj) == null) {
            return false;
        }
        return o.LJ(this.LJLILLLLZI, c537028w.LJLILLLLZI);
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // X.InterfaceC44951pb
    public final InterfaceC273515n LJIILL(InterfaceC44861pS measure, InterfaceC39071g7 interfaceC39071g7, long j) {
        o.LJIIIZ(measure, "$this$measure");
        return this.LJLILLLLZI.invoke(measure, interfaceC39071g7, new C23360vs(j));
    }
}
