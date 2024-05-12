package X;

import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.DraftFragment$tryShowCleanStorageUI$1", f = "DraftFragment.kt", l = {399}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GLK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DraftFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLK(DraftFragment draftFragment, InterfaceC67352kd<? super GLK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = draftFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GLK(this.LJLILLLLZI, interfaceC67352kd);
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
            ActivityC45651qj mo49getActivity = this.LJLILLLLZI.mo49getActivity();
            if (mo49getActivity != null && !mo49getActivity.isFinishing() && C41472GPk.LIZ(mo49getActivity) && 1 != 0) {
                DraftFragment draftFragment = this.LJLILLLLZI;
                XIF xif = EXV.LIZ;
                GLJ glj = new GLJ(draftFragment, null);
                this.LJLIL = 1;
                if (XKX.LJI(xif, glj, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
