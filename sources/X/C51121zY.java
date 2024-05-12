package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1zY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51121zY implements InterfaceC39641h2, InterfaceC39651h3<C51121zY> {
    public C51121zY LJLIL;
    public final C25710zf<C51171zd> LJLILLLLZI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    @Override // X.InterfaceC39651h3
    public final C51121zY getValue() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (r0.indexOf(r8) < r0.indexOf(r7)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C51171zd LIZJ() {
        /*
            r9 = this;
            X.0zf<X.1zd> r0 = r9.LJLILLLLZI
            int r6 = r0.LJLJI
            r5 = 0
            if (r6 <= 0) goto L22
            T[] r4 = r0.LJLIL
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>"
            kotlin.jvm.internal.o.LJII(r4, r0)
            r3 = 0
        Lf:
            r2 = r4[r3]
            X.1zd r2 = (X.C51171zd) r2
            if (r5 == 0) goto L1d
            X.29g r0 = r5.LJLLJ
            if (r0 == 0) goto L1d
            X.1Dc r8 = r0.LJLJL
            if (r8 != 0) goto L23
        L1d:
            r5 = r2
        L1e:
            int r3 = r3 + 1
            if (r3 < r6) goto Lf
        L22:
            return r5
        L23:
            X.29g r0 = r2.LJLLJ
            if (r0 == 0) goto L1e
            X.1Dc r7 = r0.LJLJL
            if (r7 != 0) goto L2c
            goto L1e
        L2c:
            int r1 = r8.LJLJLLL
            int r0 = r7.LJLJLLL
            if (r1 <= r0) goto L3a
            X.1Dc r8 = r8.LJIJJLI()
            kotlin.jvm.internal.o.LJI(r8)
            goto L2c
        L3a:
            int r1 = r7.LJLJLLL
            int r0 = r8.LJLJLLL
            if (r1 <= r0) goto L48
            X.1Dc r7 = r7.LJIJJLI()
            kotlin.jvm.internal.o.LJI(r7)
            goto L3a
        L48:
            X.1Dc r1 = r8.LJIJJLI()
            X.1Dc r0 = r7.LJIJJLI()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L65
            X.1Dc r8 = r8.LJIJJLI()
            kotlin.jvm.internal.o.LJI(r8)
            X.1Dc r7 = r7.LJIJJLI()
            kotlin.jvm.internal.o.LJI(r7)
            goto L48
        L65:
            X.1Dc r0 = r8.LJIJJLI()
            kotlin.jvm.internal.o.LJI(r0)
            java.util.List r0 = r0.LJIJI()
            int r1 = r0.indexOf(r8)
            int r0 = r0.indexOf(r7)
            if (r1 >= r0) goto L1d
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51121zY.LIZJ():X.1zd");
    }

    @Override // X.InterfaceC39651h3
    public final C17R<C51121zY> getKey() {
        return C09440Yq.LIZ;
    }

    public C51121zY(C0ZJ focusRequester) {
        o.LJIIIZ(focusRequester, "focusRequester");
        this.LJLILLLLZI = new C25710zf<>(new C51171zd[16]);
        focusRequester.LIZ.LIZLLL(this);
    }

    public final void LIZ(C51171zd focusModifier) {
        o.LJIIIZ(focusModifier, "focusModifier");
        this.LJLILLLLZI.LIZLLL(focusModifier);
        C51121zY c51121zY = this.LJLIL;
        if (c51121zY != null) {
            c51121zY.LIZ(focusModifier);
        }
    }

    public final void LIZIZ(C25710zf<C51171zd> newModifiers) {
        o.LJIIIZ(newModifiers, "newModifiers");
        C25710zf<C51171zd> c25710zf = this.LJLILLLLZI;
        c25710zf.LJ(c25710zf.LJLJI, newModifiers);
        C51121zY c51121zY = this.LJLIL;
        if (c51121zY != null) {
            c51121zY.LIZIZ(newModifiers);
        }
    }

    public final void LIZLLL(C51171zd focusModifier) {
        o.LJIIIZ(focusModifier, "focusModifier");
        this.LJLILLLLZI.LJIIL(focusModifier);
        C51121zY c51121zY = this.LJLIL;
        if (c51121zY != null) {
            c51121zY.LIZLLL(focusModifier);
        }
    }

    public final void LJ(C25710zf<C51171zd> removedModifiers) {
        o.LJIIIZ(removedModifiers, "removedModifiers");
        this.LJLILLLLZI.LJIILIIL(removedModifiers);
        C51121zY c51121zY = this.LJLIL;
        if (c51121zY != null) {
            c51121zY.LJ(removedModifiers);
        }
    }

    @Override // X.InterfaceC39641h2
    public final void LLJI(C00E scope) {
        o.LJIIIZ(scope, "scope");
        C51121zY c51121zY = (C51121zY) scope.LJII(C09440Yq.LIZ);
        if (!o.LJ(c51121zY, this.LJLIL)) {
            C51121zY c51121zY2 = this.LJLIL;
            if (c51121zY2 != null) {
                c51121zY2.LJ(this.LJLILLLLZI);
            }
            if (c51121zY != null) {
                c51121zY.LIZIZ(this.LJLILLLLZI);
            }
            this.LJLIL = c51121zY;
        }
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
