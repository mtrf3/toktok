package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController$callApi$2", f = "BlockUserController.kt", l = {177, 177, 180, 189}, m = "invokeSuspend")
/* renamed from: X.36T, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36T extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C784636c LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C784636c LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36T(C784636c c784636c, String str, String str2, int i, InterfaceC67352kd<? super C36T> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c784636c;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36T(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:14:0x0069, B:15:0x006c, B:17:0x0045, B:18:0x0048, B:20:0x004c, B:22:0x0054, B:24:0x0059, B:29:0x0035, B:30:0x0038, B:35:0x001f), top: B:2:0x0009 }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLILLLLZI
            r6 = 4
            r3 = 3
            r10 = 2
            r9 = 1
            r4 = 0
            if (r0 == 0) goto L1c
            if (r0 == r9) goto L19
            if (r0 == r10) goto L45
            if (r0 == r3) goto L69
            if (r0 != r6) goto L85
            X.C141335gf.LIZJ(r12)
        L16:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L19:
            X.36c r8 = r11.LJLIL
            goto L35
        L1c:
            X.C141335gf.LIZJ(r12)
            X.36c r8 = r11.LJLJI     // Catch: java.lang.Exception -> L6f
            java.lang.String r7 = r11.LJLJJI     // Catch: java.lang.Exception -> L6f
            java.lang.String r2 = r11.LJLJJL     // Catch: java.lang.Exception -> L6f
            int r1 = r11.LJLJJLL     // Catch: java.lang.Exception -> L6f
            r11.LJLIL = r8     // Catch: java.lang.Exception -> L6f
            r11.LJLILLLLZI = r9     // Catch: java.lang.Exception -> L6f
            com.ss.android.ugc.aweme.im.sdk.common.data.api.ImApi r0 = X.C793739p.LIZIZ     // Catch: java.lang.Exception -> L6f
            java.lang.Object r12 = r0.updateBlockUserStatus(r7, r2, r1, r11)     // Catch: java.lang.Exception -> L6f
            if (r12 != r5) goto L38
            goto L8d
        L35:
            X.C141335gf.LIZJ(r12)     // Catch: java.lang.Exception -> L6f
        L38:
            com.ss.android.ugc.aweme.im.sdk.common.data.model.BlockResponse r12 = (com.ss.android.ugc.aweme.im.sdk.common.data.model.BlockResponse) r12     // Catch: java.lang.Exception -> L6f
            r11.LJLIL = r4     // Catch: java.lang.Exception -> L6f
            r11.LJLILLLLZI = r10     // Catch: java.lang.Exception -> L6f
            java.lang.Object r0 = r8.LIZJ(r12, r11)     // Catch: java.lang.Exception -> L6f
            if (r0 != r5) goto L48
            goto L8e
        L45:
            X.C141335gf.LIZJ(r12)     // Catch: java.lang.Exception -> L6f
        L48:
            int r0 = r11.LJLJJLL     // Catch: java.lang.Exception -> L6f
            if (r0 != r9) goto L16
            X.36c r2 = r11.LJLJI     // Catch: java.lang.Exception -> L6f
            android.app.Activity r1 = r2.LJLIL     // Catch: java.lang.Exception -> L6f
            boolean r0 = r1 instanceof X.ActivityC45651qj     // Catch: java.lang.Exception -> L6f
            if (r0 == 0) goto L16
            X.1qj r1 = (X.ActivityC45651qj) r1     // Catch: java.lang.Exception -> L6f
            if (r1 == 0) goto L16
        L59:
            X.UtN r1 = X.C36636EZk.LIZ     // Catch: java.lang.Exception -> L6f
            X.36U r0 = new X.36U     // Catch: java.lang.Exception -> L6f
            r0.<init>(r2, r4)     // Catch: java.lang.Exception -> L6f
            r11.LJLILLLLZI = r3     // Catch: java.lang.Exception -> L6f
            java.lang.Object r12 = X.XKX.LJI(r1, r0, r11)     // Catch: java.lang.Exception -> L6f
            if (r12 != r5) goto L6c
            goto L8f
        L69:
            X.C141335gf.LIZJ(r12)     // Catch: java.lang.Exception -> L6f
        L6c:
            X.UCe r12 = (X.C76800UCe) r12     // Catch: java.lang.Exception -> L6f
            goto L16
        L6f:
            r3 = move-exception
            X.UtN r2 = X.C36636EZk.LIZ
            X.36V r1 = new X.36V
            X.36c r0 = r11.LJLJI
            r1.<init>(r0, r3, r4)
            r11.LJLIL = r4
            r11.LJLILLLLZI = r6
            java.lang.Object r0 = X.XKX.LJI(r2, r1, r11)
            if (r0 != r5) goto L16
            return r5
        L85:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8d:
            return r5
        L8e:
            return r5
        L8f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36T.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
