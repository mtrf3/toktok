package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.notification.legacy.IMNotificationPlayer$showNotificationAsync$1", f = "IMNotificationPlayer.kt", l = {540, 415, 421}, m = "invokeSuspend")
/* renamed from: X.2yP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75892yP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public InterfaceC75422xe LJLILLLLZI;
    public C112444bA LJLJI;
    public C68322mC LJLJJI;
    public int LJLJJL;
    public final /* synthetic */ C112444bA LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75892yP(C112444bA c112444bA, InterfaceC67352kd<? super C75892yP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJLL = c112444bA;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75892yP(this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:14:0x005a, B:15:0x005d, B:17:0x0063, B:26:0x0040, B:29:0x0045), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLJJL
            r6 = 3
            r2 = 2
            r8 = 1
            r4 = 0
            if (r0 == 0) goto L29
            if (r0 == r8) goto L1f
            if (r0 == r2) goto L16
            if (r0 != r6) goto L88
            X.C141335gf.LIZJ(r10)
        L13:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L16:
            X.2mC r3 = r9.LJLJJI
            X.4bA r1 = r9.LJLJI
            X.2xe r7 = r9.LJLILLLLZI
            X.2mC r2 = r9.LJLIL
            goto L5a
        L1f:
            X.4bA r1 = r9.LJLJI
            X.2xe r7 = r9.LJLILLLLZI
            X.2mC r3 = r9.LJLIL
            X.C141335gf.LIZJ(r10)
            goto L40
        L29:
            X.2mC r3 = X.C793239k.LIZ(r10)
            X.4bA r1 = r9.LJLJJLL
            X.XJO r7 = r1.LJIIIZ
            r9.LJLIL = r3
            r9.LJLILLLLZI = r7
            r9.LJLJI = r1
            r9.LJLJJL = r8
            java.lang.Object r0 = r7.LIZ(r4, r9)
            if (r0 != r5) goto L40
            return r5
        L40:
            boolean r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> L91
            if (r0 == 0) goto L45
            goto L66
        L45:
            X.3GW r0 = X.C3GW.LIZ     // Catch: java.lang.Throwable -> L91
            r9.LJLIL = r3     // Catch: java.lang.Throwable -> L91
            r9.LJLILLLLZI = r7     // Catch: java.lang.Throwable -> L91
            r9.LJLJI = r1     // Catch: java.lang.Throwable -> L91
            r9.LJLJJI = r3     // Catch: java.lang.Throwable -> L91
            r9.LJLJJL = r2     // Catch: java.lang.Throwable -> L91
            java.lang.Object r10 = r0.LJII(r9)     // Catch: java.lang.Throwable -> L91
            if (r10 != r5) goto L58
            goto L90
        L58:
            r2 = r3
            goto L5d
        L5a:
            X.C141335gf.LIZJ(r10)     // Catch: java.lang.Throwable -> L91
        L5d:
            r3.element = r10     // Catch: java.lang.Throwable -> L91
            T r0 = r2.element     // Catch: java.lang.Throwable -> L91
            if (r0 == 0) goto L65
            r1.LIZIZ = r8     // Catch: java.lang.Throwable -> L91
        L65:
            r3 = r2
        L66:
            r7.LIZIZ(r4)
            T r0 = r3.element
            if (r0 == 0) goto L13
        L6e:
            X.UtN r2 = X.C36636EZk.LIZ
            X.4b9 r1 = new X.4b9
            X.4bA r0 = r9.LJLJJLL
            r1.<init>(r3, r0, r4)
            r9.LJLIL = r4
            r9.LJLILLLLZI = r4
            r9.LJLJI = r4
            r9.LJLJJI = r4
            r9.LJLJJL = r6
            java.lang.Object r0 = X.XKX.LJI(r2, r1, r9)
            if (r0 != r5) goto L13
            return r5
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L90:
            return r5
        L91:
            r0 = move-exception
            r7.LIZIZ(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75892yP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
