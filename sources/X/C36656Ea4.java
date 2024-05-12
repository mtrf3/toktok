package X;

import com.ss.android.ugc.aweme.actionai.action.data.ActionAITextResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.text.TextRecommendAction$execute$responseData$1", f = "TextRecommendAction.kt", l = {79}, m = "invokeSuspend")
/* renamed from: X.Ea4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36656Ea4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super ActionAITextResponse>, Object> {
    public int LJLIL;
    public final /* synthetic */ C83438Wos LJLILLLLZI;
    public final /* synthetic */ C36648EZw LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36656Ea4(C83438Wos c83438Wos, C36648EZw c36648EZw, InterfaceC67352kd<? super C36656Ea4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c83438Wos;
        this.LJLJI = c36648EZw;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36656Ea4(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C83438Wos c83438Wos = this.LJLILLLLZI;
            C36648EZw c36648EZw = this.LJLJI;
            this.LJLIL = 1;
            c83438Wos.getClass();
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            C36646EZu.LIZIZ(new C37319Ekl(c84654XKg), c36648EZw, ActionAITextResponse.class);
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super ActionAITextResponse> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
