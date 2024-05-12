package X;

import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", l = {129}, m = "invokeSuspend")
/* renamed from: X.3CH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC64672gJ<Object> LJLJI;
    public final /* synthetic */ InterfaceC65462ha<Object> LJLJJI;
    public final /* synthetic */ InterfaceC65462ha<Object> LJLJJL;
    public final /* synthetic */ InterfaceC88473Ynt<Object, Object, InterfaceC67352kd<Object>, Object> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3CH(InterfaceC64672gJ<Object> interfaceC64672gJ, InterfaceC65462ha<Object> interfaceC65462ha, InterfaceC65462ha<Object> interfaceC65462ha2, InterfaceC88473Ynt<Object, Object, ? super InterfaceC67352kd<Object>, ? extends Object> interfaceC88473Ynt, InterfaceC67352kd<? super C3CH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC64672gJ;
        this.LJLJJI = interfaceC65462ha;
        this.LJLJJL = interfaceC65462ha2;
        this.LJLJJLL = interfaceC88473Ynt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3CH c3ch = new C3CH(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c3ch.LJLILLLLZI = obj;
        return c3ch;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094 A[Catch: all -> 0x0095, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0095, blocks: (B:7:0x000e, B:13:0x0084, B:16:0x0094), top: B:2:0x0006 }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r14.LJLIL
            r5 = 1
            r13 = 0
            if (r0 == 0) goto L1c
            if (r0 != r5) goto L14
            java.lang.Object r3 = r14.LJLILLLLZI
            X.XKM r3 = (X.XKM) r3
            X.C141335gf.LIZJ(r15)     // Catch: X.C3CM -> L12 java.lang.Throwable -> L95
            goto L8e
        L12:
            r2 = move-exception
            goto L84
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1c:
            X.C141335gf.LIZJ(r15)
            java.lang.Object r6 = r14.LJLILLLLZI
            X.2pa r6 = (X.InterfaceC70422pa) r6
            X.3CI r8 = new X.3CI
            X.2ha<java.lang.Object> r0 = r14.LJLJJI
            r8.<init>(r0, r13)
            X.MBB r7 = X.MBB.INSTANCE
            X.XKI r3 = X.XKI.SUSPEND
            X.XKY r2 = X.XKY.DEFAULT
            r1 = 4
            r0 = 0
            X.XK4 r1 = X.C78934UyQ.LIZJ(r0, r3, r1)
            X.MBA r0 = X.C84648XKa.LIZ(r6, r7)
            X.XKO r10 = new X.XKO
            r10.<init>(r0, r1)
            r2.invoke(r8, r10, r10)
            X.XKz r3 = X.C79146V4k.LJIILIIL()
            kotlin.jvm.internal.AqS132S0200000_1 r2 = new kotlin.jvm.internal.AqS132S0200000_1
            X.2gJ<java.lang.Object> r1 = r14.LJLJI
            r0 = 0
            r2.<init>(r3, r1, r0)
            r10.LJIL(r2)
            X.MBA r8 = r6.getCoroutineContext()     // Catch: X.C3CM -> L82 java.lang.Throwable -> L97
            java.lang.Object r9 = X.XLG.LIZIZ(r8)     // Catch: X.C3CM -> L82 java.lang.Throwable -> L97
            X.MBA r0 = r6.getCoroutineContext()     // Catch: X.C3CM -> L82 java.lang.Throwable -> L97
            X.MBA r2 = r0.plus(r3)     // Catch: X.C3CM -> L82 java.lang.Throwable -> L97
            X.UCe r1 = X.C76800UCe.LIZ     // Catch: X.C3CM -> L82 java.lang.Throwable -> L97
            X.3CG r6 = new X.3CG     // Catch: X.C3CM -> L82 java.lang.Throwable -> L97
            X.2ha<java.lang.Object> r7 = r14.LJLJJL     // Catch: X.C3CM -> L82 java.lang.Throwable -> L97
            X.2gJ<java.lang.Object> r11 = r14.LJLJI     // Catch: X.C3CM -> L82 java.lang.Throwable -> L97
            X.Ynt<java.lang.Object, java.lang.Object, X.2kd<java.lang.Object>, java.lang.Object> r12 = r14.LJLJJLL     // Catch: X.C3CM -> L82 java.lang.Throwable -> L97
            r3 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L7e X.C3CM -> L80
            r14.LJLILLLLZI = r10     // Catch: java.lang.Throwable -> L7e X.C3CM -> L80
            r14.LJLIL = r5     // Catch: java.lang.Throwable -> L7e X.C3CM -> L80
            java.lang.Object r0 = X.XLG.LIZIZ(r2)     // Catch: java.lang.Throwable -> L7e X.C3CM -> L80
            java.lang.Object r0 = X.C1RF.LJIIIIZZ(r2, r1, r0, r6, r14)     // Catch: java.lang.Throwable -> L7e X.C3CM -> L80
            if (r0 != r4) goto L8d
            return r4
        L7e:
            r0 = move-exception
            goto L99
        L80:
            r2 = move-exception
            goto L84
        L82:
            r2 = move-exception
            r3 = r10
        L84:
            X.2gJ<java.lang.Object> r1 = r14.LJLJI     // Catch: java.lang.Throwable -> L95
            X.2gJ r0 = r2.getOwner()     // Catch: java.lang.Throwable -> L95
            if (r0 != r1) goto L94
            goto L8e
        L8d:
            r3 = r10
        L8e:
            r3.LIZIZ(r13)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L94:
            throw r2     // Catch: java.lang.Throwable -> L95
        L95:
            r0 = move-exception
            goto L99
        L97:
            r0 = move-exception
            r3 = r10
        L99:
            r3.LIZIZ(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3CH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
