package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1yq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50681yq extends AbstractC014804a implements InterfaceC44931pZ {
    public final InterfaceC07760Se LJLILLLLZI;
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
        return C16880lQ.LLJILJIL(this.LJLJI) + (this.LJLILLLLZI.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BoxChildData(alignment=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", matchParentSize=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50681yq(X.C31631Lz r3) {
        /*
            r2 = this;
            X.1qA r1 = androidx.compose.ui.platform.g1.LIZ
            java.lang.String r0 = "alignment"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "inspectorInfo"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.<init>(r1)
            r2.LJLILLLLZI = r3
            r0 = 0
            r2.LJLJI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50681yq.<init>(X.1Lz):void");
    }

    public final boolean equals(Object obj) {
        C50681yq c50681yq;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50681yq) {
            c50681yq = (C50681yq) obj;
        } else {
            c50681yq = null;
        }
        if (c50681yq != null && o.LJ(this.LJLILLLLZI, c50681yq.LJLILLLLZI) && this.LJLJI == c50681yq.LJLJI) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC44931pZ
    public final Object LJIIL(InterfaceC23370vt interfaceC23370vt, Object obj) {
        o.LJIIIZ(interfaceC23370vt, "<this>");
        return this;
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
