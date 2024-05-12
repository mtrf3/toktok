package X;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", l = {124}, m = "invokeSuspend")
/* renamed from: X.2fu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64422fu extends AbstractC65782Prm implements InterfaceC88474Ynu<InterfaceC64672gJ<Object>, Throwable, Long, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ InterfaceC88471Ynr<Throwable, InterfaceC67352kd<? super Boolean>, Object> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C64422fu(long j, InterfaceC88471Ynr<? super Throwable, ? super InterfaceC67352kd<? super Boolean>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super C64422fu> interfaceC67352kd) {
        super(4, interfaceC67352kd);
        this.LJLJJI = j;
        this.LJLJJL = interfaceC88471Ynr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (((java.lang.Boolean) r9).booleanValue() != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLIL
            r6 = 1
            if (r0 == 0) goto L19
            if (r0 != r6) goto L33
            X.C141335gf.LIZJ(r9)
        Lc:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r0 = r9.booleanValue()
            if (r0 == 0) goto L31
        L14:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L19:
            X.C141335gf.LIZJ(r9)
            java.lang.Object r5 = r8.LJLILLLLZI
            long r3 = r8.LJLJI
            long r1 = r8.LJLJJI
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L31
            X.Ynr<java.lang.Throwable, X.2kd<? super java.lang.Boolean>, java.lang.Object> r0 = r8.LJLJJL
            r8.LJLIL = r6
            java.lang.Object r9 = r0.invoke(r5, r8)
            if (r9 != r7) goto Lc
            return r7
        L31:
            r6 = 0
            goto L14
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64422fu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88474Ynu
    public final Object invoke(InterfaceC64672gJ<Object> interfaceC64672gJ, Throwable th, Long l, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        long longValue = l.longValue();
        C64422fu c64422fu = new C64422fu(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c64422fu.LJLILLLLZI = th;
        c64422fu.LJLJI = longValue;
        return c64422fu.invokeSuspend(C76800UCe.LIZ);
    }
}
