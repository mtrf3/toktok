package X;

import com.ss.android.ugc.aweme.feed.prompt.api.FeedPromptApi;
import com.ss.android.ugc.aweme.feed.prompt.api.InstructionUndoResp;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.prompt.PromptHistoryRepository$1$undo$2$1", f = "PromptHistoryFragment.kt", l = {583}, m = "invokeSuspend")
/* renamed from: X.9Ub, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237579Ub extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super InstructionUndoResp>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C237579Ub(long j, InterfaceC67352kd<? super C237579Ub> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C237579Ub(this.LJLILLLLZI, interfaceC67352kd);
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
            FeedPromptApi.LIZ.getClass();
            AbstractC73672Svk<InstructionUndoResp> instructionsUndo = C237639Uh.LIZ().instructionsUndo(this.LJLILLLLZI);
            this.LJLIL = 1;
            obj = C77318UWc.LIZIZ(instructionsUndo, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super InstructionUndoResp> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
