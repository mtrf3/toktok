package X;

import com.ss.android.ugc.aweme.feed.prompt.PromptHistorySheetVM;
import com.ss.android.ugc.aweme.feed.prompt.api.InstructionResp;
import fjb.a;
import kotlin.jvm.internal.AqS170S0100000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.prompt.PromptHistorySheetVM$requestHistory$2", f = "PromptHistoryFragment.kt", l = {520}, m = "invokeSuspend")
/* renamed from: X.9Uo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237709Uo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PromptHistorySheetVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C237709Uo(PromptHistorySheetVM promptHistorySheetVM, InterfaceC67352kd<? super C237709Uo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = promptHistorySheetVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C237709Uo(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LJIJJ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
                LJIJJ = ((C3C5) obj).m15unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC237619Uf interfaceC237619Uf = (InterfaceC237619Uf) this.LJLILLLLZI.LJLIL.getValue().getOperator();
            this.LJLIL = 1;
            LJIJJ = interfaceC237619Uf.LJIJJ(this);
            if (LJIJJ == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        PromptHistorySheetVM promptHistorySheetVM = this.LJLILLLLZI;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LJIJJ);
        if (m10exceptionOrNullimpl != null) {
            promptHistorySheetVM.setState(new AqS170S0100000_4(m10exceptionOrNullimpl, 1347));
            LJIJJ = null;
        }
        InstructionResp instructionResp = (InstructionResp) LJIJJ;
        if (instructionResp != null && instructionResp.statusCode == 0) {
            this.LJLILLLLZI.setState(new AqS170S0100000_4(instructionResp, 1345));
        } else {
            this.LJLILLLLZI.setState(new AqS170S0100000_4(instructionResp, 1346));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
