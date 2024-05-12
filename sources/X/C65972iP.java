package X;

import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.ADClickToMessageHandler$onEnterChatByCTM$1", f = "ADClickToMessageHandler.kt", l = {42}, m = "invokeSuspend")
/* renamed from: X.2iP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65972iP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65972iP(long j, String str, InterfaceC67352kd<? super C65972iP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65972iP(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                TikTokImApi LIZ = C30U.LIZ();
                long j = this.LJLILLLLZI;
                String str = this.LJLJI;
                this.LJLIL = 1;
                if (LIZ.reportOpenOnBusinessScene(j, "from_ad_ctm", str, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception unused) {
            C34B.LIZJ("ADClickToMessageHandler", "reportOpenOnBusinessScene: request error");
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
