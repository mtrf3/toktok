package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel$triggerLocalTasks$1", f = "CommonChatNoticeViewModel.kt", l = {94, 95, 96, 99}, m = "invokeSuspend")
/* renamed from: X.41Y, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41Y extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CommonChatNoticeViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41Y(CommonChatNoticeViewModel commonChatNoticeViewModel, InterfaceC67352kd<? super C41Y> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = commonChatNoticeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41Y(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLIL
            r6 = 0
            r3 = 4
            r5 = 3
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 == r1) goto L27
            if (r0 == r4) goto L3c
            if (r0 == r5) goto L4e
            if (r0 != r3) goto L6e
            X.C141335gf.LIZJ(r8)
        L16:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L19:
            X.C141335gf.LIZJ(r8)
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel r0 = r7.LJLILLLLZI
            r7.LJLIL = r1
            java.lang.Object r0 = r0.gv0(r6, r7)
            if (r0 != r2) goto L2a
            return r2
        L27:
            X.C141335gf.LIZJ(r8)
        L2a:
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel r0 = r7.LJLILLLLZI
            X.45b r1 = r0.LJLIL
            X.43S r0 = new X.43S
            r0.<init>(r6)
            r7.LJLIL = r4
            java.lang.Object r0 = r1.LIZ(r0, r7)
            if (r0 != r2) goto L3f
            return r2
        L3c:
            X.C141335gf.LIZJ(r8)
        L3f:
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel r0 = r7.LJLILLLLZI
            X.45b r1 = r0.LJLIL
            X.41X r0 = X.C41X.PUSH_PREVIEW
            r7.LJLIL = r5
            java.lang.Object r0 = r1.LIZIZ(r0, r7)
            if (r0 != r2) goto L51
            return r2
        L4e:
            X.C141335gf.LIZJ(r8)
        L51:
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel r0 = r7.LJLILLLLZI
            X.5H3 r0 = r0.LJLJJI
            java.lang.Object r0 = r0.getValue()
            X.3ud r0 = (X.C99033ud) r0
            boolean r0 = r0.hasChatHistory()
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel r0 = r7.LJLILLLLZI
            X.45b r0 = r0.LJLIL
            r7.LJLIL = r3
            java.lang.Object r0 = r0.LJIILJJIL(r7)
            if (r0 != r2) goto L16
            return r2
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41Y.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
