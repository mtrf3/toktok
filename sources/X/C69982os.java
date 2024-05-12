package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.automessage.controller.LandAutoMsgReceiverToChatNode$fetchAweme$2", f = "LandAutoMsgReceiverToChatNode.kt", l = {124, 126, 133, 135}, m = "invokeSuspend")
/* renamed from: X.2os, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69982os extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C70172pB LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69982os(String str, C70172pB c70172pB, InterfaceC67352kd<? super C69982os> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = c70172pB;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69982os(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0037 A[Catch: Exception -> 0x0081, TryCatch #0 {Exception -> 0x0081, blocks: (B:14:0x0018, B:15:0x0050, B:16:0x0053, B:18:0x0057, B:20:0x005d, B:22:0x0065, B:23:0x006c, B:28:0x0030, B:29:0x0033, B:31:0x0037, B:33:0x001f, B:35:0x0025, B:39:0x003a), top: B:2:0x0008 }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLIL
            r4 = 4
            r5 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L1c
            if (r0 == r1) goto L30
            if (r0 == r2) goto L50
            if (r0 == r5) goto L18
            if (r0 != r4) goto L91
            X.C141335gf.LIZJ(r7)
        L15:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L18:
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.Exception -> L81
            goto L15
        L1c:
            X.C141335gf.LIZJ(r7)
            boolean r0 = X.C69992ot.LIZ()     // Catch: java.lang.Exception -> L81
            if (r0 == 0) goto L3a
            java.lang.String r0 = r6.LJLILLLLZI     // Catch: java.lang.Exception -> L81
            r6.LJLIL = r1     // Catch: java.lang.Exception -> L81
            java.lang.Object r7 = X.C69732oT.LIZIZ(r0, r6)     // Catch: java.lang.Exception -> L81
            if (r7 != r3) goto L33
            goto L99
        L30:
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.Exception -> L81
        L33:
            X.2oa r7 = (X.C69802oa) r7     // Catch: java.lang.Exception -> L81
            if (r7 == 0) goto L7f
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.LIZIZ     // Catch: java.lang.Exception -> L81
            goto L6c
        L3a:
            java.lang.String r0 = r6.LJLILLLLZI     // Catch: java.lang.Exception -> L81
            java.util.List r0 = X.C47261Igj.LJJIJ(r0)     // Catch: java.lang.Exception -> L81
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Exception -> L81
            java.lang.String r0 = "chat"
            r6.LJLIL = r2     // Catch: java.lang.Exception -> L81
            java.lang.Object r7 = X.C30U.LIZIZ(r1, r0, r6)     // Catch: java.lang.Exception -> L81
            if (r7 != r3) goto L53
            goto L9a
        L50:
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.Exception -> L81
        L53:
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeDetailList r7 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeDetailList) r7     // Catch: java.lang.Exception -> L81
            if (r7 == 0) goto L7f
            java.util.List r0 = r7.getAwemeList()     // Catch: java.lang.Exception -> L81
            if (r0 == 0) goto L7f
            java.lang.Object r2 = X.ORZ.LJLLLL(r0)     // Catch: java.lang.Exception -> L81
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2     // Catch: java.lang.Exception -> L81
            if (r2 == 0) goto L7f
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = com.ss.android.ugc.aweme.awemeservice.AwemeService.LIZ()     // Catch: java.lang.Exception -> L81
            r0.R1(r2)     // Catch: java.lang.Exception -> L81
        L6c:
            X.2pB r0 = r6.LJLJI     // Catch: java.lang.Exception -> L81
            X.XLM r1 = r0.LIZLLL     // Catch: java.lang.Exception -> L81
            X.2pO r0 = new X.2pO     // Catch: java.lang.Exception -> L81
            r0.<init>(r2)     // Catch: java.lang.Exception -> L81
            r6.LJLIL = r5     // Catch: java.lang.Exception -> L81
            r1.setValue(r0)     // Catch: java.lang.Exception -> L81
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Exception -> L81
            if (r0 != r3) goto L15
            goto L9b
        L7f:
            r2 = 0
            goto L6c
        L81:
            X.2pB r0 = r6.LJLJI
            X.XLM r1 = r0.LIZLLL
            X.2ow r0 = X.C70022ow.LIZ
            r6.LJLIL = r4
            r1.setValue(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != r3) goto L15
            return r3
        L91:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L99:
            return r3
        L9a:
            return r3
        L9b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69982os.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
