package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.DisplayResponse;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateEditBottomAreaViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateEditBottomAreaViewModel$saveAndDisplay$resp$1", f = "TemplateEditBottomAreaViewModel.kt", l = {165}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class S7J extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C64797Pbt<Response<DisplayResponse>>>, Object> {
    public int LJLIL;
    public final /* synthetic */ TemplateEditBottomAreaViewModel LJLILLLLZI;
    public final /* synthetic */ S6S LJLJI;
    public final /* synthetic */ TemplateItem LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S7J(TemplateEditBottomAreaViewModel templateEditBottomAreaViewModel, S6S s6s, TemplateItem templateItem, InterfaceC67352kd<? super S7J> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = templateEditBottomAreaViewModel;
        this.LJLJI = s6s;
        this.LJLJJI = templateItem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new S7J(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

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
                C71534S5q c71534S5q = this.LJLILLLLZI.LJLIL.LIZIZ;
                String str = this.LJLJI.LJLILLLLZI.authorId;
                String templateId = this.LJLJJI.getTemplateId();
                int type = this.LJLJJI.getType();
                this.LJLIL = 1;
                obj = c71534S5q.LJLIL.LIZ.display(str, templateId, true, 0, type, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return (C64797Pbt) obj;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C64797Pbt<Response<DisplayResponse>>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
