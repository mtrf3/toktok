package X;

import com.ss.android.ugc.aweme.qna.vm.QnaSuggestedTabViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qna.vm.QnaSuggestedTabViewModel$fetchMore$1", f = "QnaSuggestedTabViewModel.kt", l = {101, 106, 111, 113}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class MIJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ QnaSuggestedTabViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIJ(QnaSuggestedTabViewModel qnaSuggestedTabViewModel, InterfaceC67352kd<? super MIJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = qnaSuggestedTabViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new MIJ(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 || i == 4) {
                        C141335gf.LIZJ(obj);
                        return C76800UCe.LIZ;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
                return C76800UCe.LIZ;
            }
            C141335gf.LIZJ(obj);
            return C76800UCe.LIZ;
        }
        C141335gf.LIZJ(obj);
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel = this.LJLILLLLZI;
        MIL mil = qnaSuggestedTabViewModel.LJLJLJ;
        if (C52900KpU.LIZ && mil != MIL.FYP_BANNER) {
            T7O t7o = qnaSuggestedTabViewModel.LJLJL;
            this.LJLIL = 1;
            if (t7o.LJ(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
            return C76800UCe.LIZ;
        }
        if (mil == MIL.FYP_BANNER) {
            T7O t7o2 = qnaSuggestedTabViewModel.LJLJL;
            this.LJLIL = 2;
            if (t7o2.LIZJ(null, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
            return C76800UCe.LIZ;
        }
        if (C00F.LIZ(31744, 0, "public_qna_suggested_tab", true) == 2) {
            T7O t7o3 = this.LJLILLLLZI.LJLJL;
            this.LJLIL = 3;
            if (t7o3.LIZLLL(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        } else {
            T7O t7o4 = this.LJLILLLLZI.LJLJL;
            this.LJLIL = 4;
            if (t7o4.LJII(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
