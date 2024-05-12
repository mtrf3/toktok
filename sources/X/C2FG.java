package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {99, 103}, m = "invokeSuspend")
/* renamed from: X.2FG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FG extends AbstractC65783Prn implements InterfaceC88471Ynr<InterfaceC37471dX, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C11P LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ InterfaceC18630oF LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2FG(InterfaceC18630oF interfaceC18630oF, InterfaceC67352kd<? super C2FG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = interfaceC18630oF;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2FG c2fg = new C2FG(this.LJLJJL, interfaceC67352kd);
        c2fg.LJLJJI = obj;
        return c2fg;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003e -> B:6:0x0015). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.NAu r11 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r13.LJLJI
            r10 = 2
            r2 = 1
            if (r0 == 0) goto L44
            if (r0 == r2) goto L58
            if (r0 != r10) goto L70
            X.11P r12 = r13.LJLILLLLZI
            java.lang.Object r1 = r13.LJLJJI
            X.1dX r1 = (X.InterfaceC37471dX) r1
            X.C141335gf.LIZJ(r14)
        L15:
            X.11H r14 = (X.C11H) r14
            java.util.List<X.11P> r9 = r14.LIZ
            int r8 = r9.size()
            r7 = 0
        L1e:
            if (r7 >= r8) goto L68
            java.lang.Object r6 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r7)
            X.11P r6 = (X.C11P) r6
            long r4 = r6.LIZ
            long r2 = r12.LIZ
            boolean r0 = X.C11O.LIZ(r4, r2)
            if (r0 == 0) goto L41
            boolean r0 = r6.LIZLLL
            if (r0 == 0) goto L41
        L34:
            r13.LJLJJI = r1
            r13.LJLILLLLZI = r12
            r13.LJLJI = r10
            java.lang.Object r14 = X.SC5.LIZ(r1, r13)
            if (r14 != r11) goto L15
            return r11
        L41:
            int r7 = r7 + 1
            goto L1e
        L44:
            X.C141335gf.LIZJ(r14)
            java.lang.Object r1 = r13.LJLJJI
            X.1dX r1 = (X.InterfaceC37471dX) r1
            r13.LJLJJI = r1
            r13.LJLJI = r2
            X.11I r0 = X.C11I.Main
            java.lang.Object r14 = X.C0UM.LIZIZ(r1, r0, r2, r13)
            if (r14 != r11) goto L5f
            return r11
        L58:
            java.lang.Object r1 = r13.LJLJJI
            X.1dX r1 = (X.InterfaceC37471dX) r1
            X.C141335gf.LIZJ(r14)
        L5f:
            X.11P r14 = (X.C11P) r14
            X.0oF r0 = r13.LJLJJL
            r0.LIZJ()
            r12 = r14
            goto L34
        L68:
            X.0oF r0 = r13.LJLJJL
            r0.LIZ()
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2FG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC37471dX interfaceC37471dX, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC37471dX, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
