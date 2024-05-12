package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel$checkBlockStatus$1", f = "FakeMessageViewModel.kt", l = {279}, m = "invokeSuspend")
/* renamed from: X.2yB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75752yB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ FakeMessageViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75752yB(FakeMessageViewModel fakeMessageViewModel, InterfaceC67352kd<? super C75752yB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = fakeMessageViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75752yB(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        if (r3 != null) goto L36;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLIL
            r6 = 1
            if (r0 == 0) goto L12
            if (r0 != r6) goto La4
            X.C141335gf.LIZJ(r8)
        Lc:
            X.C76212yv.LIZIZ()
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L12:
            X.C141335gf.LIZJ(r8)
            com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel r0 = r7.LJLILLLLZI
            X.3ud r0 = r0.LJLIL
            java.lang.String r3 = r0.getConversationId()
            X.2yC r1 = X.C75762yC.LIZ
            java.lang.String r0 = "convId"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.util.Map r1 = X.C75762yC.LIZ(r1, r3)
            r4 = 0
            if (r1 == 0) goto L40
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object r2 = r1.get(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageContent r2 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageContent) r2
        L35:
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.im.sdk.chat.data.model.UserRecommendationContent
            if (r0 == 0) goto L3d
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.UserRecommendationContent r2 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.UserRecommendationContent) r2
            if (r2 != 0) goto L42
        L3d:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L40:
            r2 = r4
            goto L35
        L42:
            X.2yE r0 = X.C3Q9.LIZ
            r0.getClass()
            X.C75782yE.LIZ()
            X.4WC r0 = X.C4WC.LIZIZ
            X.Opw r1 = r0.LIZ(r3)
            if (r1 != 0) goto L55
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L55:
            com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel r0 = r7.LJLILLLLZI
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.UserRecommendationContent r0 = r0.gv0(r2, r1)
            java.util.List r1 = r0.getUserList()
            if (r1 == 0) goto L88
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L70:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.UserRecommendationContent$RecUserInfo r0 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.UserRecommendationContent.RecUserInfo) r0
            if (r0 == 0) goto L86
            java.lang.String r0 = r0.getUserId()
        L82:
            r2.add(r0)
            goto L70
        L86:
            r0 = r4
            goto L82
        L88:
            X.OQY r3 = X.OQY.INSTANCE
            goto L91
        L8b:
            java.util.Set r3 = X.ORZ.LLJJ(r2)
            if (r3 == 0) goto L88
        L91:
        L92:
            X.UtN r2 = X.C36636EZk.LIZ
            X.2nE r1 = new X.2nE
            com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel r0 = r7.LJLILLLLZI
            r1.<init>(r0, r3, r4)
            r7.LJLIL = r6
            java.lang.Object r0 = X.XKX.LJI(r2, r1, r7)
            if (r0 != r5) goto Lc
            return r5
        La4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75752yB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
