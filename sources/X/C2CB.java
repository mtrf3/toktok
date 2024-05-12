package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1$1", f = "AndroidOverscroll.kt", l = {324, 328}, m = "invokeSuspend")
/* renamed from: X.2CB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CB extends AbstractC65783Prn implements InterfaceC88471Ynr<InterfaceC37471dX, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C31441Lg LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2CB(C31441Lg c31441Lg, InterfaceC67352kd<? super C2CB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c31441Lg;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2CB c2cb = new C2CB(this.LJLJJI, interfaceC67352kd);
        c2cb.LJLJI = obj;
        return c2cb;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c7 -> B:6:0x0014). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r2 = r12.LJLILLLLZI
            r6 = 2
            r1 = 0
            r0 = 1
            if (r2 == 0) goto L8e
            if (r2 == r0) goto La2
            if (r2 != r6) goto Lca
            java.lang.Object r4 = r12.LJLJI
            X.1dX r4 = (X.InterfaceC37471dX) r4
            X.C141335gf.LIZJ(r13)
        L14:
            X.11H r13 = (X.C11H) r13
            java.util.List<X.11P> r6 = r13.LIZ
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = r6.size()
            r7.<init>(r0)
            int r3 = r6.size()
            r2 = 0
        L26:
            if (r2 >= r3) goto L39
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r2)
            r0 = r1
            X.11P r0 = (X.C11P) r0
            boolean r0 = r0.LIZLLL
            if (r0 == 0) goto L36
            r7.add(r1)
        L36:
            int r2 = r2 + 1
            goto L26
        L39:
            X.1Lg r11 = r12.LJLJJI
            int r10 = r7.size()
            r9 = 0
        L40:
            if (r9 >= r10) goto L5b
            java.lang.Object r6 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r9)
            r0 = r6
            X.11P r0 = (X.C11P) r0
            long r2 = r0.LIZ
            X.11O r1 = r11.LJIIZILJ
            boolean r0 = r1 instanceof X.C11O
            if (r0 != 0) goto L54
        L51:
            int r9 = r9 + 1
            goto L40
        L54:
            long r0 = r1.LIZ
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L5c
            goto L51
        L5b:
            r6 = 0
        L5c:
            X.11P r6 = (X.C11P) r6
            if (r6 != 0) goto L68
            java.lang.Object r6 = X.ORZ.LJLLLL(r7)
            X.11P r6 = (X.C11P) r6
            if (r6 == 0) goto L7c
        L68:
            X.1Lg r3 = r12.LJLJJI
            long r1 = r6.LIZ
            X.11O r0 = new X.11O
            r0.<init>(r1)
            r3.LJIIZILJ = r0
            long r1 = r6.LIZJ
            X.0av r0 = new X.0av
            r0.<init>(r1)
            r3.LIZIZ = r0
        L7c:
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L8c
            X.1Lg r1 = r12.LJLJJI
            r0 = 0
            r1.LJIIZILJ = r0
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L8c:
            r6 = 2
            goto Lbf
        L8e:
            X.C141335gf.LIZJ(r13)
            java.lang.Object r4 = r12.LJLJI
            X.1dX r4 = (X.InterfaceC37471dX) r4
            r12.LJLJI = r4
            r12.LJLILLLLZI = r0
            X.11I r0 = X.C11I.Main
            java.lang.Object r13 = X.C0UM.LIZIZ(r4, r0, r1, r12)
            if (r13 != r5) goto La9
            return r5
        La2:
            java.lang.Object r4 = r12.LJLJI
            X.1dX r4 = (X.InterfaceC37471dX) r4
            X.C141335gf.LIZJ(r13)
        La9:
            X.11P r13 = (X.C11P) r13
            X.1Lg r3 = r12.LJLJJI
            long r1 = r13.LIZ
            X.11O r0 = new X.11O
            r0.<init>(r1)
            r3.LJIIZILJ = r0
            long r1 = r13.LIZJ
            X.0av r0 = new X.0av
            r0.<init>(r1)
            r3.LIZIZ = r0
        Lbf:
            r12.LJLJI = r4
            r12.LJLILLLLZI = r6
            java.lang.Object r13 = X.SC5.LIZ(r4, r12)
            if (r13 != r5) goto L14
            return r5
        Lca:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2CB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37471dX interfaceC37471dX, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC37471dX, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
