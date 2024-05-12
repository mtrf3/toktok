package X;

import kotlin.jvm.internal.o;

/* renamed from: X.28r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C536528r extends AbstractC014804a implements InterfaceC44921pY {
    public final InterfaceC88472Yns<C23490w5, C76800UCe> LJLILLLLZI;
    public long LJLJI;

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
    public C536528r(X.InterfaceC88472Yns r3) {
        /*
            r2 = this;
            X.1qA r1 = androidx.compose.ui.platform.g1.LIZ
            java.lang.String r0 = "onSizeChanged"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "inspectorInfo"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.<init>(r1)
            r2.LJLILLLLZI = r3
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            long r0 = X.C78996UzQ.LIZIZ(r0, r0)
            r2.LJLJI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C536528r.<init>(X.Yns):void");
    }

    @Override // X.InterfaceC44921pY
    public final void LJJIJIIJIL(long j) {
        if (!C23490w5.LIZ(this.LJLJI, j)) {
            this.LJLILLLLZI.invoke(new C23490w5(j));
            this.LJLJI = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C536528r)) {
            return false;
        }
        return o.LJ(this.LJLILLLLZI, ((C536528r) obj).LJLILLLLZI);
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
