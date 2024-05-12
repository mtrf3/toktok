package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.home.BillHomeViewModel;
import com.ss.android.ugc.aweme.bnpl.biz.bill.model.CustomUnreadInfo;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.bill.home.BillHomeViewModel$loadCustomUnread$1", f = "BillHomeViewModel.kt", l = {170}, m = "invokeSuspend")
/* renamed from: X.aLJ, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93093aLJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BillHomeViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93093aLJ(BillHomeViewModel billHomeViewModel, InterfaceC67352kd<? super C93093aLJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = billHomeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93093aLJ(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                InterfaceC92249a7h interfaceC92249a7h = (InterfaceC92249a7h) ((InterfaceC214228aw) this.LJLILLLLZI.LJLIL.getValue()).getOperator();
                this.LJLIL = 1;
                obj = interfaceC92249a7h.LJJLL(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            C64797Pbt c64797Pbt = (C64797Pbt) obj;
            if (c64797Pbt.LIZIZ()) {
                if (((CustomUnreadInfo) c64797Pbt.LIZIZ).data > 0) {
                    this.LJLILLLLZI.setState(C92744aFg.LJLIL);
                } else {
                    this.LJLILLLLZI.setState(C92745aFh.LJLIL);
                }
            }
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
