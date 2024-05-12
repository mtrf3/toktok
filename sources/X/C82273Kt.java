package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.datasource.MessageRequestDataSource$onStrangerBoxUpdate$1", f = "MessageRequestDataSource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Kt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82273Kt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C3LB LJLIL;
    public final /* synthetic */ C82283Ku LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82273Kt(C3LB c3lb, C82283Ku c82283Ku, InterfaceC67352kd<? super C82273Kt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c3lb;
        this.LJLILLLLZI = c82283Ku;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C82273Kt(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            X.C141335gf.LIZJ(r18)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onStrangerBoxUpdate: "
            r1.append(r0)
            r4 = r17
            X.3LB r0 = r4.LJLIL
            r6 = 0
            if (r0 == 0) goto L58
            java.lang.String r0 = r0.LIZ()
        L18:
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "SessionRefactor-MessageRequestDataSource"
            X.C81843Jc.LIZJ(r0, r1)
            X.3Ku r3 = r4.LJLILLLLZI
            X.3LB r0 = r4.LJLIL
            r9 = 0
            if (r0 == 0) goto L5a
            java.util.List<X.Opw> r0 = r0.LIZ
            if (r0 == 0) goto L5a
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r0.iterator()
        L39:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r5 = r7.next()
            r1 = r5
            X.Opw r1 = (X.C63120Opw) r1
            boolean r0 = X.C82473Ln.LJII(r1)
            if (r0 == 0) goto L39
            long r1 = r1.getUnreadCount()
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L39
            r8.add(r5)
            goto L39
        L58:
            r0 = r6
            goto L18
        L5a:
            r11 = 0
            goto L60
        L5c:
            int r11 = r8.size()
        L60:
            X.3LB r0 = r4.LJLIL
            if (r0 == 0) goto L90
            java.util.List<X.Opw> r0 = r0.LIZIZ
            if (r0 == 0) goto L90
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r0.iterator()
        L71:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r5 = r7.next()
            r1 = r5
            X.Opw r1 = (X.C63120Opw) r1
            boolean r0 = X.C82473Ln.LJII(r1)
            if (r0 == 0) goto L71
            long r1 = r1.getUnreadCount()
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L71
            r8.add(r5)
            goto L71
        L90:
            r12 = 0
            goto L96
        L92:
            int r12 = r8.size()
        L96:
            X.3LB r0 = r4.LJLIL
            if (r0 == 0) goto Lbd
            X.Opw r13 = r0.LIZJ
            java.util.List<X.Opw> r0 = r0.LIZ
            if (r0 == 0) goto Lbe
            int r14 = r0.size()
        La4:
            X.3LB r0 = r4.LJLIL
            if (r0 == 0) goto Laa
            java.util.List<X.Opw> r6 = r0.LIZ
        Laa:
            long r15 = X.C37O.LIZ(r6)
            X.3LG r10 = new X.3LG
            r10.<init>(r11, r12, r13, r14, r15)
            r3.LJLJJI = r10
            X.3Ku r0 = r4.LJLILLLLZI
            r0.LJIIZILJ()
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lbd:
            r13 = r6
        Lbe:
            r14 = 0
            goto La4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82273Kt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
