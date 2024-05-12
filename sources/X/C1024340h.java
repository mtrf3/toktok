package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel$triggerLocalTasks$1", f = "SingleChatNoticeViewModel.kt", l = {63, 64, 65, 66, 69}, m = "invokeSuspend")
/* renamed from: X.40h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1024340h extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SingleChatNoticeViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1024340h(SingleChatNoticeViewModel singleChatNoticeViewModel, InterfaceC67352kd<? super C1024340h> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = singleChatNoticeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C1024340h(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLIL
            r3 = 5
            r4 = 4
            r5 = 3
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L1b
            if (r0 == r6) goto L2d
            if (r0 == r7) goto L3f
            if (r0 == r5) goto L51
            if (r0 == r4) goto L63
            if (r0 != r3) goto L83
            X.C141335gf.LIZJ(r9)
        L18:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1b:
            X.C141335gf.LIZJ(r9)
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel r0 = r8.LJLILLLLZI
            X.45b r1 = r0.LJLIL
            X.41X r0 = X.C41X.BLOCK
            r8.LJLIL = r6
            java.lang.Object r0 = r1.LIZIZ(r0, r8)
            if (r0 != r2) goto L30
            return r2
        L2d:
            X.C141335gf.LIZJ(r9)
        L30:
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel r0 = r8.LJLILLLLZI
            X.45b r1 = r0.LJLIL
            X.41X r0 = X.C41X.STRANGER_CHAT
            r8.LJLIL = r7
            java.lang.Object r0 = r1.LIZIZ(r0, r8)
            if (r0 != r2) goto L42
            return r2
        L3f:
            X.C141335gf.LIZJ(r9)
        L42:
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel r0 = r8.LJLILLLLZI
            X.45b r1 = r0.LJLIL
            X.41X r0 = X.C41X.TCM
            r8.LJLIL = r5
            java.lang.Object r0 = r1.LIZIZ(r0, r8)
            if (r0 != r2) goto L54
            return r2
        L51:
            X.C141335gf.LIZJ(r9)
        L54:
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel r0 = r8.LJLILLLLZI
            X.45b r1 = r0.LJLIL
            X.41X r0 = X.C41X.MEDIA_NUDE_FILTER
            r8.LJLIL = r4
            java.lang.Object r0 = r1.LIZIZ(r0, r8)
            if (r0 != r2) goto L66
            return r2
        L63:
            X.C141335gf.LIZJ(r9)
        L66:
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel r0 = r8.LJLILLLLZI
            X.5H3 r0 = r0.LJLJJL
            java.lang.Object r0 = r0.getValue()
            X.3ud r0 = (X.C99033ud) r0
            boolean r0 = r0.hasChatHistory()
            if (r0 == 0) goto L18
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel r0 = r8.LJLILLLLZI
            X.45b r0 = r0.LJLIL
            r8.LJLIL = r3
            java.lang.Object r0 = r0.LJIILJJIL(r8)
            if (r0 != r2) goto L18
            return r2
        L83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1024340h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
