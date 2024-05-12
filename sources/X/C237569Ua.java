package X;

import com.ss.android.ugc.aweme.feed.prompt.api.FeedPromptApi;
import com.ss.android.ugc.aweme.feed.prompt.api.InstructionResp;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.prompt.PromptHistoryRepository$1$requestHistory$2$1", f = "PromptHistoryFragment.kt", l = {575}, m = "invokeSuspend")
/* renamed from: X.9Ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237569Ua extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super InstructionResp>, Object> {
    public int LJLIL;

    public C237569Ua(InterfaceC67352kd<? super C237569Ua> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C237569Ua(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C9UY c9uy = C9UY.DETAIL;
            FeedPromptApi.LIZ.getClass();
            AbstractC73672Svk<InstructionResp> instructionsAll = C237639Uh.LIZ().instructionsAll(c9uy.getValue());
            this.LJLIL = 1;
            obj = C77318UWc.LIZIZ(instructionsAll, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super InstructionResp> interfaceC67352kd) {
        return new C237569Ua(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
