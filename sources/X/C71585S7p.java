package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateEditBottomAreaViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS178S0100000_12;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateEditBottomAreaViewModel$doSaveAndDisplay$2", f = "TemplateEditBottomAreaViewModel.kt", l = {77}, m = "invokeSuspend")
/* renamed from: X.S7p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71585S7p extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TemplateEditBottomAreaViewModel LJLILLLLZI;
    public final /* synthetic */ TemplateItem LJLJI;
    public final /* synthetic */ TemplateItem LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71585S7p(TemplateEditBottomAreaViewModel templateEditBottomAreaViewModel, TemplateItem templateItem, TemplateItem templateItem2, String str, InterfaceC67352kd<? super C71585S7p> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = templateEditBottomAreaViewModel;
        this.LJLJI = templateItem;
        this.LJLJJI = templateItem2;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71585S7p(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            TemplateEditBottomAreaViewModel templateEditBottomAreaViewModel = this.LJLILLLLZI;
            TemplateItem templateItem = this.LJLJI;
            TemplateItem templateItem2 = this.LJLJJI;
            String str = this.LJLJJL;
            this.LJLIL = 1;
            obj = templateEditBottomAreaViewModel.hv0(templateItem, templateItem2, str, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C71584S7o c71584S7o = (C71584S7o) obj;
        if (c71584S7o.LJLIL) {
            this.LJLILLLLZI.setState(C71586S7q.LJLIL);
        } else if (c71584S7o.LJLILLLLZI == 3) {
            this.LJLILLLLZI.setState(new AqS178S0100000_12(c71584S7o, 536));
        } else {
            this.LJLILLLLZI.setState(new AqS178S0100000_12(c71584S7o, 537));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
