package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SaveTemplateRequestBody;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SaveTemplateResponse;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateListViewModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateListViewModel$doSaveTemplate$resp$1", f = "TemplateListViewModel.kt", l = {194}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class S7L extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C64797Pbt<Response<SaveTemplateResponse>>>, Object> {
    public int LJLIL;
    public final /* synthetic */ TemplateListViewModel LJLILLLLZI;
    public final /* synthetic */ TemplateItem LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S7L(TemplateListViewModel templateListViewModel, TemplateItem templateItem, InterfaceC67352kd<? super S7L> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = templateListViewModel;
        this.LJLJI = templateItem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new S7L(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        S6S Rj;
        RootData rootData;
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
                TemplateListViewModel templateListViewModel = this.LJLILLLLZI;
                C71534S5q c71534S5q = templateListViewModel.LJLIL.LIZIZ;
                S5I s5i = templateListViewModel.LJLJJI;
                if (s5i == null || (Rj = s5i.Rj()) == null || (rootData = Rj.LJLILLLLZI) == null || (str = rootData.authorId) == null) {
                    str = "";
                }
                String templateId = this.LJLJI.getTemplateId();
                int type = this.LJLJI.getType();
                List<TemplateField> LJJLJLI = this.LJLJI.LJJLJLI();
                this.LJLIL = 1;
                c71534S5q.getClass();
                obj = c71534S5q.LJLIL.LIZ.saveTemplate(new SaveTemplateRequestBody(str, templateId, type, LJJLJLI), this);
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
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C64797Pbt<Response<SaveTemplateResponse>>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
