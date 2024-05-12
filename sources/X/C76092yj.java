package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.service.BotTypingProcessInfoManager$handleMsg$1", f = "TakoTypingProcessInfoService.kt", l = {207, 211}, m = "invokeSuspend")
/* renamed from: X.2yj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76092yj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public C68322mC LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76092yj(String str, InterfaceC67352kd<? super C76092yj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C76092yj(this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJI
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L17
            if (r0 == r6) goto L12
            if (r0 != r5) goto L93
            X.C141335gf.LIZJ(r8)
        Lf:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L12:
            X.2mC r3 = r7.LJLILLLLZI
            X.2mC r6 = r7.LJLIL
            goto L65
        L17:
            X.C141335gf.LIZJ(r8)
            com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.service.BotTypingProcessInfoManager r2 = com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.service.BotTypingProcessInfoManager.INSTANCE
            java.lang.String r0 = "begin getTakoProcessInfo"
            r2.log(r0)
            java.lang.String r0 = r7.LJLJJI
            boolean r0 = r2.isQueryMsgIdInvalid(r0)
            if (r0 != 0) goto L2f
            boolean r0 = r2.isTimeOut()
            if (r0 == 0) goto L47
        L2f:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "1 isInvalid == true, queryMsgId = "
            r1.append(r0)
            java.lang.String r0 = r7.LJLJJI
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.log(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L47:
            X.2mC r3 = new X.2mC
            r3.<init>()
            X.Ol8 r0 = X.C775132l.LIZIZ     // Catch: java.lang.Exception -> L6b
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L6b
            com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoApi r1 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api.TakoApi) r1     // Catch: java.lang.Exception -> L6b
            java.lang.String r0 = r7.LJLJJI     // Catch: java.lang.Exception -> L6b
            r7.LJLIL = r3     // Catch: java.lang.Exception -> L6b
            r7.LJLILLLLZI = r3     // Catch: java.lang.Exception -> L6b
            r7.LJLJI = r6     // Catch: java.lang.Exception -> L6b
            java.lang.Object r8 = r1.getTakoProcessInfo(r0, r7)     // Catch: java.lang.Exception -> L6b
            if (r8 != r4) goto L63
            goto L9b
        L63:
            r6 = r3
            goto L68
        L65:
            X.C141335gf.LIZJ(r8)     // Catch: java.lang.Exception -> L6d
        L68:
            r3.element = r8     // Catch: java.lang.Exception -> L6d
            goto L7b
        L6b:
            r2 = move-exception
            goto L6f
        L6d:
            r2 = move-exception
            r3 = r6
        L6f:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.service.BotTypingProcessInfoManager r0 = com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.service.BotTypingProcessInfoManager.INSTANCE
            java.lang.String r1 = r0.getTAG()
            java.lang.String r0 = "getTakoProcessInfo error "
            X.C34B.LIZLLL(r1, r0, r2)
            r6 = r3
        L7b:
            X.UtN r3 = X.C36636EZk.LIZ
            X.2yk r2 = new X.2yk
            java.lang.String r1 = r7.LJLJJI
            r0 = 0
            r2.<init>(r6, r1, r0)
            r7.LJLIL = r0
            r7.LJLILLLLZI = r0
            r7.LJLJI = r5
            java.lang.Object r0 = X.XKX.LJI(r3, r2, r7)
            if (r0 != r4) goto Lf
            return r4
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76092yj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
