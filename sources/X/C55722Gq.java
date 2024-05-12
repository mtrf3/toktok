package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {620, 621}, m = "invokeSuspend")
/* renamed from: X.2Gq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55722Gq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C44251oT<R> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55722Gq(long j, C44251oT<R> c44251oT, InterfaceC67352kd<? super C55722Gq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = c44251oT;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55722Gq(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLIL
            r3 = 1
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 == r2) goto L3a
            if (r0 != r5) goto L46
            X.C141335gf.LIZJ(r8)
        L11:
            X.1oT<R> r0 = r7.LJLJI
            X.XJL<? super X.11H> r3 = r0.LJLJI
            if (r3 == 0) goto L28
            X.11J r2 = new X.11J
            long r0 = r7.LJLILLLLZI
            r2.<init>(r0)
            X.3C4 r0 = X.C141335gf.LIZ(r2)
            X.C3C5.m7constructorimpl(r0)
            r3.resumeWith(r0)
        L28:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2b:
            X.C141335gf.LIZJ(r8)
            long r0 = r7.LJLILLLLZI
            long r0 = r0 - r3
            r7.LJLIL = r2
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r7)
            if (r0 != r6) goto L3d
            return r6
        L3a:
            X.C141335gf.LIZJ(r8)
        L3d:
            r7.LJLIL = r5
            java.lang.Object r0 = X.C1JD.LIZJ(r3, r7)
            if (r0 != r6) goto L11
            return r6
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55722Gq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
