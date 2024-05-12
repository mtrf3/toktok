package X;

import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {63}, m = "invokeSuspend")
/* renamed from: X.29V, reason: invalid class name */
/* loaded from: classes.dex */
public final class C29V extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public XKM LJLIL;
    public InterfaceC169716lL LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ InterfaceC78936UyS<C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29V(InterfaceC78936UyS<C76800UCe> interfaceC78936UyS, InterfaceC67352kd<? super C29V> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = interfaceC78936UyS;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29V(this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #0 {all -> 0x0048, blocks: (B:8:0x002f, B:10:0x0037), top: B:7:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002c -> B:7:0x002f). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r3 = 1
            if (r0 == 0) goto L19
            if (r0 != r3) goto L11
            X.6lL r1 = r5.LJLILLLLZI
            X.XKM r2 = r5.LJLIL
            X.C141335gf.LIZJ(r6)     // Catch: java.lang.Throwable -> L4b
            goto L2f
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L19:
            X.C141335gf.LIZJ(r6)
            X.UyS<X.UCe> r2 = r5.LJLJJI
            X.6lL r1 = r2.iterator()     // Catch: java.lang.Throwable -> L4b
        L22:
            r5.LJLIL = r2     // Catch: java.lang.Throwable -> L4b
            r5.LJLILLLLZI = r1     // Catch: java.lang.Throwable -> L4b
            r5.LJLJI = r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r6 = r1.LIZ(r5)     // Catch: java.lang.Throwable -> L4b
            if (r6 != r4) goto L2f
            goto L4a
        L2f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L48
            boolean r0 = r6.booleanValue()     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L41
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L48
            X.UCe r0 = (X.C76800UCe) r0     // Catch: java.lang.Throwable -> L48
            X.C0O8.LIZLLL()     // Catch: java.lang.Throwable -> L48
            goto L22
        L41:
            r0 = 0
            X.C77275UUl.LIZIZ(r2, r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L48:
            r1 = move-exception
            goto L4c
        L4a:
            return r4
        L4b:
            r1 = move-exception
        L4c:
            throw r1     // Catch: java.lang.Throwable -> L4d
        L4d:
            r0 = move-exception
            X.C77275UUl.LIZIZ(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29V.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
