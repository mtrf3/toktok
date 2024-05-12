package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1zw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51361zw implements InterfaceC44901pW {
    public boolean LJLIL;
    public C84654XKg LJLILLLLZI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd<? super X.C76800UCe> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C51341zu
            if (r0 == 0) goto L51
            r5 = r7
            X.1zu r5 = (X.C51341zu) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L57
            X.2kd r2 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L22:
            if (r2 == 0) goto L2c
            X.UCe r0 = X.C76800UCe.LIZ
            X.C3C5.m7constructorimpl(r0)
            r2.resumeWith(r0)
        L2c:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2f:
            X.C141335gf.LIZJ(r4)
            boolean r0 = r6.LJLIL
            if (r0 != 0) goto L2c
            X.XKg r2 = r6.LJLILLLLZI
            r5.getClass()
            r5.LJLIL = r2
            r5.LJLJJI = r1
            X.XKg r1 = new X.XKg
            X.2kd r0 = X.C78555UsJ.LJJII(r5)
            r1.<init>(r0)
            r6.LJLILLLLZI = r1
            java.lang.Object r0 = r1.LIZ()
            if (r0 != r3) goto L22
            return r3
        L51:
            X.1zu r5 = new X.1zu
            r5.<init>(r6, r7)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51361zw.LIZ(X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC44901pW
    public final void LJIJJ(AbstractC538029g abstractC538029g) {
        if (!this.LJLIL) {
            this.LJLIL = true;
            C84654XKg c84654XKg = this.LJLILLLLZI;
            if (c84654XKg != null) {
                C76800UCe c76800UCe = C76800UCe.LIZ;
                C3C5.m7constructorimpl(c76800UCe);
                c84654XKg.resumeWith(c76800UCe);
            }
            this.LJLILLLLZI = null;
        }
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
