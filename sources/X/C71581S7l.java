package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateEditBottomAreaViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS178S0100000_12;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateEditBottomAreaViewModel$doSave$2", f = "TemplateEditBottomAreaViewModel.kt", l = {59}, m = "invokeSuspend")
/* renamed from: X.S7l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71581S7l extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TemplateEditBottomAreaViewModel LJLILLLLZI;
    public final /* synthetic */ TemplateItem LJLJI;
    public final /* synthetic */ TemplateItem LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71581S7l(TemplateEditBottomAreaViewModel templateEditBottomAreaViewModel, TemplateItem templateItem, TemplateItem templateItem2, InterfaceC67352kd<? super C71581S7l> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = templateEditBottomAreaViewModel;
        this.LJLJI = templateItem;
        this.LJLJJI = templateItem2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71581S7l(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            this.LJLIL = 1;
            obj = templateEditBottomAreaViewModel.gv0(templateItem, templateItem2, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        S7Z s7z = (S7Z) obj;
        if (s7z.LJLIL) {
            this.LJLILLLLZI.setState(new AqS178S0100000_12(s7z, 533));
        } else if (s7z.LJLJI == 3) {
            this.LJLILLLLZI.setState(new AqS178S0100000_12(s7z, 534));
        } else {
            this.LJLILLLLZI.setState(new AqS178S0100000_12(s7z, 535));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
