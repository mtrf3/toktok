package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel$triggerOutPushTaskOnMessageEvent$1", f = "CommonChatNoticeViewModel.kt", l = {235, 243}, m = "invokeSuspend")
/* renamed from: X.41Z, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41Z extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C109544Rq LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C89463fC LJLJI;
    public final /* synthetic */ CommonChatNoticeViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41Z(C89463fC c89463fC, CommonChatNoticeViewModel commonChatNoticeViewModel, InterfaceC67352kd<? super C41Z> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c89463fC;
        this.LJLJJI = commonChatNoticeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41Z(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L21;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLILLLLZI
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L19
            if (r0 == r2) goto L45
            if (r0 != r4) goto L80
            X.C141335gf.LIZJ(r7)
        Lf:
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel r0 = r6.LJLJJI
            X.45b r0 = r0.LJLIL
            r0.LJIILIIL()
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L19:
            X.C141335gf.LIZJ(r7)
            X.3fC r0 = r6.LJLJI
            java.util.List<X.4Rq> r0 = r0.LIZ
            java.lang.Object r5 = X.ORZ.LJLLLL(r0)
            X.4Rq r5 = (X.C109544Rq) r5
            if (r5 != 0) goto L2b
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2b:
            boolean r0 = r5.isSelf()
            if (r0 != 0) goto L52
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel r0 = r6.LJLJJI
            X.45b r1 = r0.LJLIL
            X.43S r0 = new X.43S
            r0.<init>(r2)
            r6.LJLIL = r5
            r6.LJLILLLLZI = r2
            java.lang.Object r7 = r1.LIZ(r0, r6)
            if (r7 != r3) goto L4a
            return r3
        L45:
            X.4Rq r5 = r6.LJLIL
            X.C141335gf.LIZJ(r7)
        L4a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r0 = r7.booleanValue()
            if (r0 != 0) goto Lf
        L52:
            int r1 = r5.getMsgType()
            r0 = 1030(0x406, float:1.443E-42)
            if (r1 == r0) goto Lf
            java.lang.String r1 = r5.getConversationId()
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel r0 = r6.LJLJJI
            X.5H3 r0 = r0.LJLJJI
            java.lang.Object r0 = r0.getValue()
            X.3ud r0 = (X.C99033ud) r0
            java.lang.String r0 = r0.getConversationId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto Lf
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel r1 = r6.LJLJJI
            r0 = 0
            r6.LJLIL = r0
            r6.LJLILLLLZI = r4
            java.lang.Object r0 = r1.gv0(r2, r6)
            if (r0 != r3) goto Lf
            return r3
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41Z.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
