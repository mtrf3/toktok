package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.toolbar.NowSimpleToolbarScene$onActivityCreated$10$1", f = "NowSimpleToolbarScene.kt", l = {101, 106}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class W3A extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ W3M LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3A(W3M w3m, InterfaceC67352kd<? super W3A> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = w3m;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new W3A(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLIL
            java.lang.String r8 = "newItemPromote"
            r6 = 2
            r7 = 0
            r4 = 1
            if (r0 == 0) goto L1e
            if (r0 == r4) goto L2c
            if (r0 != r6) goto L71
            X.C141335gf.LIZJ(r10)
        L12:
            X.W3M r0 = r9.LJLILLLLZI
            X.VoU r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L6d
            r0.LJJLJLI(r4)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1e:
            X.C141335gf.LIZJ(r10)
            r9.LJLIL = r4
            r0 = 1200(0x4b0, double:5.93E-321)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r9)
            if (r0 != r5) goto L2f
            return r5
        L2c:
            X.C141335gf.LIZJ(r10)
        L2f:
            X.W3M r0 = r9.LJLILLLLZI
            X.VoU r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L7f
            r0.LJJLL()
            X.W3M r0 = r9.LJLILLLLZI
            java.util.List<X.62Q> r0 = r0.LJLJI
            java.util.Iterator r3 = r0.iterator()
        L40:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.62Q r0 = (X.C62Q) r0
            int r1 = r0.getType()
            r0 = 25
            if (r1 != r0) goto L40
        L55:
            X.62Q r2 = (X.C62Q) r2
            if (r2 == 0) goto L60
            X.1Eo r0 = r2.LJLJJI
            if (r0 == 0) goto L79
            r0.playAnimation()
        L60:
            r9.LJLIL = r6
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r9)
            if (r0 != r5) goto L12
            return r5
        L6b:
            r2 = r7
            goto L55
        L6d:
            kotlin.jvm.internal.o.LJIJI(r8)
            throw r7
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L79:
            java.lang.String r0 = "starTwinkling"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r7
        L7f:
            kotlin.jvm.internal.o.LJIJI(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3A.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
