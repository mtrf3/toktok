package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.o;

/* renamed from: X.1zo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51281zo extends AbstractC014804a implements InterfaceC39641h2, InterfaceC39651h3<C51281zo> {
    public final InterfaceC88472Yns<C0ZG, C76800UCe> LJLILLLLZI;
    public final ParcelableSnapshotMutableState LJLJI;
    public final C17R<C51281zo> LJLJJI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    @Override // X.InterfaceC39651h3
    public final C51281zo getValue() {
        return this;
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode();
    }

    @Override // X.InterfaceC39651h3
    public final C17R<C51281zo> getKey() {
        return this.LJLJJI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51281zo(X.InterfaceC88472Yns r3) {
        /*
            r2 = this;
            X.1qA r1 = androidx.compose.ui.platform.g1.LIZ
            java.lang.String r0 = "focusPropertiesScope"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "inspectorInfo"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.<init>(r1)
            r2.LJLILLLLZI = r3
            r0 = 0
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.C78966Uyw.LJJJIL(r0)
            r2.LJLJI = r0
            X.17R<X.1zo> r0 = X.C0ZH.LIZ
            r2.LJLJJI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51281zo.<init>(X.Yns):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(C1PD focusProperties) {
        o.LJIIIZ(focusProperties, "focusProperties");
        this.LJLILLLLZI.invoke(focusProperties);
        C51281zo c51281zo = (C51281zo) this.LJLJI.getValue();
        if (c51281zo != null) {
            c51281zo.LIZ(focusProperties);
        }
    }

    @Override // X.InterfaceC39641h2
    public final void LLJI(C00E scope) {
        o.LJIIIZ(scope, "scope");
        this.LJLJI.setValue(scope.LJII(C0ZH.LIZ));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C51281zo) && o.LJ(this.LJLILLLLZI, ((C51281zo) obj).LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
