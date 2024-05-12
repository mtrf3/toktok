package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.dialogcenter.common.RelationAuthDialogCenter$check$1", f = "RelationAuthDialogCenter.kt", l = {86}, m = "invokeSuspend")
/* renamed from: X.URr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77203URr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C77202URq LJLJI;
    public final /* synthetic */ C34K LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77203URr(C77202URq c77202URq, C34K c34k, InterfaceC67352kd<? super C77203URr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c77202URq;
        this.LJLJJI = c34k;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C77203URr(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r0 != false) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x004d -> B:5:0x0010). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLILLLLZI
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 != r3) goto L59
            java.lang.Object r2 = r5.LJLIL
            java.util.Iterator r2 = (java.util.Iterator) r2
            X.C141335gf.LIZJ(r6)
        L10:
            X.URP r6 = (X.URP) r6
            X.34K r1 = r5.LJLJJI
            boolean r0 = r1.element
            if (r0 == 0) goto L26
            boolean r0 = r6.LJLIL
            if (r0 == 0) goto L26
            r0 = 1
        L1d:
            r1.element = r0
            if (r0 != 0) goto L35
        L21:
            X.USW r1 = X.USW.LIZ
            monitor-enter(r1)
            r0 = 0
            goto L50
        L26:
            r0 = 0
            goto L1d
        L28:
            X.C141335gf.LIZJ(r6)
            X.URq r0 = r5.LJLJI
            java.util.List r0 = r0.LIZIZ(r3)
            java.util.Iterator r2 = r0.iterator()
        L35:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r1 = r2.next()
            X.USJ r1 = (X.USJ) r1
            X.URq r0 = r5.LJLJI
            X.URw r0 = r0.LIZIZ
            r5.LJLIL = r2
            r5.LJLILLLLZI = r3
            java.lang.Object r6 = r1.LIZ(r0, r5)
            if (r6 != r4) goto L10
            return r4
        L50:
            X.USW.LIZIZ = r0     // Catch: java.lang.Throwable -> L56
            monitor-exit(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L56:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L59:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77203URr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
