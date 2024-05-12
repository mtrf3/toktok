package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1ya, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50521ya extends AbstractC014804a implements InterfaceC42201lA {
    public final InterfaceC88472Yns<InterfaceC33691Tx, C76800UCe> LJLILLLLZI;

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
    public C50521ya(X.InterfaceC88472Yns r3) {
        /*
            r2 = this;
            X.1qA r1 = androidx.compose.ui.platform.g1.LIZ
            java.lang.String r0 = "onDraw"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "inspectorInfo"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.<init>(r1)
            r2.LJLILLLLZI = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50521ya.<init>(X.Yns):void");
    }

    @Override // X.InterfaceC42201lA
    public final void LJIILIIL(InterfaceC43021mU interfaceC43021mU) {
        o.LJIIIZ(interfaceC43021mU, "<this>");
        this.LJLILLLLZI.invoke(interfaceC43021mU);
        interfaceC43021mU.LJJLIIIIJ();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50521ya)) {
            return false;
        }
        return o.LJ(this.LJLILLLLZI, ((C50521ya) obj).LJLILLLLZI);
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
