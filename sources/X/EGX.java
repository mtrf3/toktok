package X;

import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.TemplateEffectsViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.TemplateEffectsViewModel$loadMobileEffectData$1", f = "TemplateEffectsViewModel.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EGX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TemplateEffectsViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EGX(TemplateEffectsViewModel templateEffectsViewModel, InterfaceC67352kd<? super EGX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = templateEffectsViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EGX(this.LJLILLLLZI, interfaceC67352kd);
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
            obj = templateEffectsViewModel.nv0(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        OSZ osz = (OSZ) obj;
        Object first = osz.getFirst();
        Object second = osz.getSecond();
        if (first != null) {
            this.LJLILLLLZI.mv0(C74413TIj.LIZ(new Exception("Error fetching template effects")));
        } else {
            this.LJLILLLLZI.mv0(C74413TIj.LIZJ(second));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
