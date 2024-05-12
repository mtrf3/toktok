package X;

import kotlin.jvm.internal.o;

/* renamed from: X.28q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C536428q extends AbstractC014804a implements InterfaceC44901pW {
    public final InterfaceC88472Yns<InterfaceC274415w, C76800UCe> LJLILLLLZI;

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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C536428q(X.InterfaceC88472Yns r3) {
        /*
            r2 = this;
            X.1qA r1 = androidx.compose.ui.platform.g1.LIZ
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "inspectorInfo"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.<init>(r1)
            r2.LJLILLLLZI = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C536428q.<init>(X.Yns):void");
    }

    @Override // X.InterfaceC44901pW
    public final void LJIJJ(AbstractC538029g abstractC538029g) {
        this.LJLILLLLZI.invoke(abstractC538029g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C536428q)) {
            return false;
        }
        return o.LJ(this.LJLILLLLZI, ((C536428q) obj).LJLILLLLZI);
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
