package X;

import Y.IDfS130S0100000_9;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel$subscribeContactState$1", f = "MultiViewModel.kt", l = {1728}, m = "invokeSuspend")
/* renamed from: X.Mbj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57143Mbj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MultiViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57143Mbj(MultiViewModel multiViewModel, InterfaceC67352kd<? super C57143Mbj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = multiViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57143Mbj(this.LJLILLLLZI, interfaceC67352kd);
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
            InterfaceC70352pT<C57148Mbo> LJIIIZ = UTK.LIZIZ.LJIIIZ(EnumC77147UPn.CONTACT);
            IDfS130S0100000_9 iDfS130S0100000_9 = new IDfS130S0100000_9(this.LJLILLLLZI, 6);
            this.LJLIL = 1;
            if (LJIIIZ.collect(iDfS130S0100000_9, this) == enumC58928NAu) {
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
