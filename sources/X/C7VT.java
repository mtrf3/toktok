package X;

import com.ss.android.ugc.aweme.paidcontent.seriescreation.activity.SeriesDraftFragment;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.seriescreation.activity.SeriesDraftFragment$seriesPriceOptionsDelegate$1$requestScrollToBottom$1", f = "SeriesDraftFragment.kt", l = {39}, m = "invokeSuspend")
/* renamed from: X.7VT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7VT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SeriesDraftFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7VT(SeriesDraftFragment seriesDraftFragment, InterfaceC67352kd<? super C7VT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = seriesDraftFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C7VT(this.LJLILLLLZI, interfaceC67352kd);
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(100L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        ((C45631qh) this.LJLILLLLZI._$_findCachedViewById(R.id.jp6)).LJFF(130);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
