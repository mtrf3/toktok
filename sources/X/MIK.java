package X;

import com.ss.android.ugc.aweme.qna.vm.QnaSuggestedTabViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qna.vm.QnaSuggestedTabViewModel$initialFetch$1", f = "QnaSuggestedTabViewModel.kt", l = {69, 73, 76, 79}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class MIK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ QnaSuggestedTabViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIK(QnaSuggestedTabViewModel qnaSuggestedTabViewModel, InterfaceC67352kd<? super MIK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = qnaSuggestedTabViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new MIK(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            QnaSuggestedTabViewModel qnaSuggestedTabViewModel = this.LJLILLLLZI;
            MIL mil = qnaSuggestedTabViewModel.LJLJLJ;
            if (C52900KpU.LIZ && mil != MIL.FYP_BANNER) {
                T7O t7o = qnaSuggestedTabViewModel.LJLJL;
                this.LJLIL = 1;
                if (t7o.LJ(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                int LIZ = C00F.LIZ(31744, 0, "public_qna_suggested_tab", true);
                if (LIZ != 1) {
                    if (LIZ != 2) {
                        if (LIZ == 3) {
                            T7O t7o2 = this.LJLILLLLZI.LJLJL;
                            this.LJLIL = 2;
                            if (t7o2.LJIIIZ(this) == enumC58928NAu) {
                                return enumC58928NAu;
                            }
                        }
                    } else {
                        T7O t7o3 = this.LJLILLLLZI.LJLJL;
                        this.LJLIL = 3;
                        if (t7o3.LIZLLL(this) == enumC58928NAu) {
                            return enumC58928NAu;
                        }
                    }
                } else {
                    T7O t7o4 = this.LJLILLLLZI.LJLJL;
                    this.LJLIL = 4;
                    if (t7o4.LJII(this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
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
