package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem.TemplateEditBottomAreaAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateEditBottomAreaViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem.TemplateEditBottomAreaAssem$onViewCreated$2$1", f = "TemplateEditBottomAreaAssem.kt", l = {87}, m = "invokeSuspend")
/* renamed from: X.S7t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71589S7t extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TemplateEditBottomAreaAssem LJLILLLLZI;
    public final /* synthetic */ TemplateItem LJLJI;
    public final /* synthetic */ TemplateItem LJLJJI;
    public final /* synthetic */ S87 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71589S7t(TemplateEditBottomAreaAssem templateEditBottomAreaAssem, TemplateItem templateItem, TemplateItem templateItem2, S87 s87, InterfaceC67352kd<? super C71589S7t> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = templateEditBottomAreaAssem;
        this.LJLJI = templateItem;
        this.LJLJJI = templateItem2;
        this.LJLJJL = s87;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71589S7t(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            FSJ fsj = C36576EXc.LIZ;
            C71590S7u c71590S7u = new C71590S7u(this.LJLJJL, null);
            this.LJLIL = 1;
            obj2 = XKX.LJI(fsj, c71590S7u, this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        String imageFile = (String) obj2;
        TemplateEditBottomAreaViewModel K3 = this.LJLILLLLZI.K3();
        TemplateItem rawItem = this.LJLJI;
        TemplateItem newItem = this.LJLJJI;
        K3.getClass();
        o.LJIIIZ(rawItem, "rawItem");
        o.LJIIIZ(newItem, "newItem");
        o.LJIIIZ(imageFile, "imageFile");
        K3.setState(C71588S7s.LJLIL);
        XKX.LIZLLL(ViewModelKt.getViewModelScope(K3), null, null, new C71585S7p(K3, rawItem, newItem, imageFile, null), 3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
