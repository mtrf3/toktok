package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1zb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51151zb implements InterfaceC39651h3<C51151zb>, InterfaceC39641h2 {
    public final InterfaceC88472Yns<InterfaceC09480Yu, C76800UCe> LJLIL;
    public C51151zb LJLILLLLZI;
    public final C25710zf<C51151zb> LJLJI;
    public final C25710zf<C51171zd> LJLJJI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    @Override // X.InterfaceC39651h3
    public final C51151zb getValue() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r1 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r8 = this;
            X.0zf<X.1zd> r1 = r8.LJLJJI
            int r7 = r1.LJLJI
            if (r7 == 0) goto L5f
            r6 = 0
            r0 = 1
            if (r7 == r0) goto L56
            r5 = 0
            if (r7 <= 0) goto L30
            T[] r4 = r1.LJLIL
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>"
            kotlin.jvm.internal.o.LJII(r4, r0)
            r3 = r5
        L15:
            r2 = r4[r6]
            X.1zd r2 = (X.C51171zd) r2
            X.1PB r0 = r2.LJLJJI
            int[] r1 = X.C0Z1.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L4a;
                case 2: goto L4a;
                case 3: goto L4a;
                case 4: goto L4a;
                case 5: goto L4e;
                case 6: goto L53;
                default: goto L26;
            }
        L26:
            int r6 = r6 + 1
            if (r6 < r7) goto L15
            if (r3 == 0) goto L30
            X.1PB r1 = r3.LJLJJI
            if (r1 != 0) goto L3a
        L30:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r0)
            if (r0 == 0) goto L47
            X.1PB r1 = X.C1PB.Deactivated
        L3a:
            X.Yns<X.0Yu, X.UCe> r0 = r8.LJLIL
            r0.invoke(r1)
            X.1zb r0 = r8.LJLILLLLZI
            if (r0 == 0) goto L46
            r0.LIZJ()
        L46:
            return
        L47:
            X.1PB r1 = X.C1PB.Inactive
            goto L3a
        L4a:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r3 = r2
            goto L26
        L4e:
            if (r5 != 0) goto L26
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L26
        L53:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L26
        L56:
            T[] r0 = r1.LJLIL
            r0 = r0[r6]
            X.1zd r0 = (X.C51171zd) r0
            X.1PB r1 = r0.LJLJJI
            goto L3a
        L5f:
            X.1PB r1 = X.C1PB.Inactive
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51151zb.LIZJ():void");
    }

    @Override // X.InterfaceC39651h3
    public final C17R<C51151zb> getKey() {
        return C09500Yw.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C51151zb(InterfaceC88472Yns<? super InterfaceC09480Yu, C76800UCe> onFocusEvent) {
        o.LJIIIZ(onFocusEvent, "onFocusEvent");
        this.LJLIL = onFocusEvent;
        this.LJLJI = new C25710zf<>(new C51151zb[16]);
        this.LJLJJI = new C25710zf<>(new C51171zd[16]);
    }

    public final void LIZ(C51171zd focusModifier) {
        o.LJIIIZ(focusModifier, "focusModifier");
        this.LJLJJI.LIZLLL(focusModifier);
        C51151zb c51151zb = this.LJLILLLLZI;
        if (c51151zb != null) {
            c51151zb.LIZ(focusModifier);
        }
    }

    public final void LIZIZ(C25710zf<C51171zd> c25710zf) {
        C25710zf<C51171zd> c25710zf2 = this.LJLJJI;
        c25710zf2.LJ(c25710zf2.LJLJI, c25710zf);
        C51151zb c51151zb = this.LJLILLLLZI;
        if (c51151zb != null) {
            c51151zb.LIZIZ(c25710zf);
        }
    }

    public final void LIZLLL(C51171zd focusModifier) {
        o.LJIIIZ(focusModifier, "focusModifier");
        this.LJLJJI.LJIIL(focusModifier);
        C51151zb c51151zb = this.LJLILLLLZI;
        if (c51151zb != null) {
            c51151zb.LIZLLL(focusModifier);
        }
    }

    public final void LJ(C25710zf<C51171zd> c25710zf) {
        this.LJLJJI.LJIILIIL(c25710zf);
        C51151zb c51151zb = this.LJLILLLLZI;
        if (c51151zb != null) {
            c51151zb.LJ(c25710zf);
        }
    }

    @Override // X.InterfaceC39641h2
    public final void LLJI(C00E scope) {
        o.LJIIIZ(scope, "scope");
        C17R<C51151zb> c17r = C09500Yw.LIZ;
        C51151zb c51151zb = (C51151zb) scope.LJII(c17r);
        if (!o.LJ(c51151zb, this.LJLILLLLZI)) {
            C51151zb c51151zb2 = this.LJLILLLLZI;
            if (c51151zb2 != null) {
                c51151zb2.LJLJI.LJIIL(this);
                c51151zb2.LJ(this.LJLJJI);
            }
            this.LJLILLLLZI = c51151zb;
            if (c51151zb != null) {
                c51151zb.LJLJI.LIZLLL(this);
                c51151zb.LIZIZ(this.LJLJJI);
            }
        }
        this.LJLILLLLZI = (C51151zb) scope.LJII(c17r);
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
