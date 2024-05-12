package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import fjb.a;
import kotlin.jvm.internal.AqS20S0200100_12;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.common.popcard.AbsECLiveExplanationCardWidget$onMessage$2", f = "AbsECLiveExplanationCardWidget.kt", l = {717}, m = "invokeSuspend")
/* renamed from: X.Rww, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71198Rww extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C34K LJLILLLLZI;
    public final /* synthetic */ AbstractC71187Rwl LJLJI;
    public final /* synthetic */ IMessage LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71198Rww(C34K c34k, AbstractC71187Rwl abstractC71187Rwl, IMessage iMessage, long j, InterfaceC67352kd<? super C71198Rww> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c34k;
        this.LJLJI = abstractC71187Rwl;
        this.LJLJJI = iMessage;
        this.LJLJJL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71198Rww(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            if (this.LJLILLLLZI.element) {
                this.LJLIL = 1;
                if (C1JD.LIZJ(400L, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        AbstractC71187Rwl abstractC71187Rwl = this.LJLJI;
        C71200Rwy c71200Rwy = abstractC71187Rwl.LLIFFJFJJ;
        ViewModel slotViewModel = abstractC71187Rwl.LJLIL;
        o.LJIIIIZZ(slotViewModel, "slotViewModel");
        InterfaceC70422pa viewModelScope = ViewModelKt.getViewModelScope(slotViewModel);
        IMessage iMessage = this.LJLJJI;
        c71200Rwy.LIZ(viewModelScope, (ECommerceMessage) iMessage, new AqS20S0200100_12(iMessage, this.LJLJJL, this.LJLJI, 1));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
