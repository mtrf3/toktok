package X;

import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1", f = "RxConvert.kt", l = {167}, m = "invokeSuspend")
/* renamed from: X.SuB, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73575SuB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC65462ha LJLJI;
    public final /* synthetic */ InterfaceC73573Su9 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73575SuB(InterfaceC65462ha interfaceC65462ha, InterfaceC73573Su9 interfaceC73573Su9, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC65462ha;
        this.LJLJJI = interfaceC73573Su9;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C73575SuB c73575SuB = new C73575SuB(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c73575SuB.LJLILLLLZI = obj;
        return c73575SuB;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
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
            r5 = 1
            if (r0 == 0) goto L16
            if (r0 != r5) goto Le
            java.lang.Object r4 = r7.LJLILLLLZI
            X.2pa r4 = (X.InterfaceC70422pa) r4
            goto L32
        Le:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L16:
            X.C141335gf.LIZJ(r8)
            java.lang.Object r4 = r7.LJLILLLLZI
            X.2pa r4 = (X.InterfaceC70422pa) r4
            X.2ha r3 = r7.LJLJI     // Catch: java.lang.Throwable -> L3e
            X.Su9 r2 = r7.LJLJJI     // Catch: java.lang.Throwable -> L3e
            Y.IDfS132S0100000_12 r1 = new Y.IDfS132S0100000_12     // Catch: java.lang.Throwable -> L3e
            r0 = 0
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L3e
            r7.LJLILLLLZI = r4     // Catch: java.lang.Throwable -> L3e
            r7.LJLIL = r5     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r0 = r3.collect(r1, r7)     // Catch: java.lang.Throwable -> L3e
            if (r0 != r6) goto L35
            goto L3d
        L32:
            X.C141335gf.LIZJ(r8)     // Catch: java.lang.Throwable -> L3b
        L35:
            X.Su9 r0 = r7.LJLJJI     // Catch: java.lang.Throwable -> L3b
            r0.onComplete()     // Catch: java.lang.Throwable -> L3b
            goto L60
        L3b:
            r2 = move-exception
            goto L3f
        L3d:
            return r6
        L3e:
            r2 = move-exception
        L3f:
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L5b
            X.Su9 r0 = r7.LJLJJI
            boolean r0 = r0.tryOnError(r2)
            if (r0 != 0) goto L60
            X.MBA r1 = r4.getCoroutineContext()
            X.C73548Stk.LIZIZ(r2)     // Catch: java.lang.Throwable -> L53
            goto L60
        L53:
            r0 = move-exception
            X.V0N.LJFF(r2, r0)
            X.C78540Us4.LJIIJ(r1, r2)
            goto L60
        L5b:
            X.Su9 r0 = r7.LJLJJI
            r0.onComplete()
        L60:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73575SuB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
