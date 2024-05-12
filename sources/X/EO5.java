package X;

import Y.IDObjectS385S0100000_6;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.TemplateEffectsViewModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.TemplateEffectsViewModel$loadCombinedData$1$proTemplatesTask$1", f = "TemplateEffectsViewModel.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EO5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends Throwable, ? extends List<? extends Effect>>>, Object> {
    public int LJLIL;
    public final /* synthetic */ TemplateEffectsViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EO5(TemplateEffectsViewModel templateEffectsViewModel, InterfaceC67352kd<? super EO5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = templateEffectsViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EO5(this.LJLILLLLZI, interfaceC67352kd);
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
            TemplateEffectsViewModel templateEffectsViewModel = this.LJLILLLLZI;
            this.LJLIL = 1;
            templateEffectsViewModel.getClass();
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            templateEffectsViewModel.LJLJLLL.LJJJJLL().LJI().LJI("effecttooltemplate", false, new IDObjectS385S0100000_6(c84654XKg, 0));
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends Throwable, ? extends List<? extends Effect>>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
