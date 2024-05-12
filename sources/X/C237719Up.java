package X;

import com.ss.android.ugc.aweme.feed.prompt.PromptHistoryFragment;
import com.ss.android.ugc.aweme.feed.prompt.PromptHistorySheetVM;
import com.ss.android.ugc.aweme.feed.prompt.api.InstructionUndoResp;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.prompt.PromptHistoryFragment$showUndoDialog$1$1$1$1$success$1", f = "PromptHistoryFragment.kt", l = {324}, m = "invokeSuspend")
/* renamed from: X.9Up, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237719Up extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ PromptHistoryFragment LJLILLLLZI;
    public final /* synthetic */ C237749Us LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C237719Up(PromptHistoryFragment promptHistoryFragment, C237749Us c237749Us, InterfaceC67352kd<? super C237719Up> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = promptHistoryFragment;
        this.LJLJI = c237749Us;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C237719Up(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object gv0;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
                gv0 = ((C3C5) obj).m15unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            PromptHistorySheetVM promptHistorySheetVM = (PromptHistorySheetVM) this.LJLILLLLZI.LJLIL.getValue();
            C237749Us c237749Us = this.LJLJI;
            this.LJLIL = 1;
            gv0 = promptHistorySheetVM.gv0(c237749Us, this);
            if (gv0 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (C3C5.m10exceptionOrNullimpl(gv0) != null) {
            gv0 = null;
        }
        InstructionUndoResp instructionUndoResp = (InstructionUndoResp) gv0;
        if (instructionUndoResp == null || instructionUndoResp.statusCode != 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
