package X;

import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.viewmodel.ChatInviteViewModelImpl;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.viewmodel.ChatInviteViewModelImpl$getShortUrl$1", f = "ChatInviteViewModelImpl.kt", l = {60}, m = "invokeSuspend")
/* renamed from: X.2hU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65402hU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ChatInviteViewModelImpl LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65402hU(ChatInviteViewModelImpl chatInviteViewModelImpl, InterfaceC67352kd<? super C65402hU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = chatInviteViewModelImpl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C65402hU c65402hU = new C65402hU(this.LJLJI, interfaceC67352kd);
        c65402hU.LJLILLLLZI = obj;
        return c65402hU;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005e, code lost:
    
        if (r1 == null) goto L17;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            r1 = r10
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLIL
            r6 = 1
            if (r0 == 0) goto L13
            if (r0 != r6) goto Lb
            goto L59
        Lb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L13:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r8 = r9.LJLILLLLZI
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()     // Catch: java.lang.Exception -> L6d
            java.lang.String r1 = r0.getCurUserId()     // Catch: java.lang.Exception -> L6d
            java.lang.String r0 = "userService().curUserId"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> L6d
            java.lang.Long r0 = X.C38350F3i.LJJIZ(r1)     // Catch: java.lang.Exception -> L6d
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.viewmodel.ChatInviteViewModelImpl r5 = r9.LJLJI     // Catch: java.lang.Exception -> L6d
            long r2 = r0.longValue()     // Catch: java.lang.Exception -> L6d
            java.lang.String r4 = "page_name"
            java.lang.String r1 = "reflow_chat_invitation"
            X.OSZ r0 = new X.OSZ     // Catch: java.lang.Exception -> L6d
            r0.<init>(r4, r1)     // Catch: java.lang.Exception -> L6d
            java.util.Map r1 = X.C51029K0z.LJJIIZI(r0)     // Catch: java.lang.Exception -> L6d
            com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi r4 = r5.LJLJJI     // Catch: java.lang.Exception -> L6d
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L6d
            r0.<init>()     // Catch: java.lang.Exception -> L6d
            java.lang.String r1 = r0.LJIILL(r1)     // Catch: java.lang.Exception -> L6d
            java.lang.String r0 = "Gson().toJson(extra)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> L6d
            r9.LJLILLLLZI = r8     // Catch: java.lang.Exception -> L6d
            r9.LJLIL = r6     // Catch: java.lang.Exception -> L6d
            java.lang.Object r1 = r4.shareChatInvite(r2, r1, r9)     // Catch: java.lang.Exception -> L6d
            if (r1 != r7) goto L5c
            return r7
        L59:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L6d
        L5c:
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.model.ChatInviteShareResponse r1 = (com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.model.ChatInviteShareResponse) r1     // Catch: java.lang.Exception -> L6d
            if (r1 != 0) goto L79
        L60:
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.model.ChatInviteShareResponse r1 = new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.model.ChatInviteShareResponse     // Catch: java.lang.Exception -> L6d
            r2 = 0
            r6 = 15
            r3 = r2
            r4 = r2
            r5 = r2
            r7 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L6d
            goto L79
        L6d:
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.model.ChatInviteShareResponse r1 = new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.model.ChatInviteShareResponse
            r2 = 0
            r6 = 15
            r3 = r2
            r4 = r2
            r5 = r2
            r7 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L79:
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.viewmodel.ChatInviteViewModelImpl r0 = r9.LJLJI
            androidx.lifecycle.MutableLiveData<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.model.ChatInviteShareResponse> r0 = r0.LJLJJL
            r0.postValue(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65402hU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
