package X;

import com.ss.android.ugc.aweme.effectcreator.EffectCreatorServiceImpl;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service.TTEPEffectService;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel$deleteDraftEffect$1", f = "MyEffectsViewModel.kt", l = {305}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EQL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MyEffectsViewModel LJLILLLLZI;
    public final /* synthetic */ DraftEffect LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EQL(MyEffectsViewModel myEffectsViewModel, DraftEffect draftEffect, InterfaceC67352kd<? super EQL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = myEffectsViewModel;
        this.LJLJI = draftEffect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EQL(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
                TTEPEffectService tTEPEffectService = (TTEPEffectService) this.LJLILLLLZI.LJZL.getValue();
                String effectId = this.LJLJI.getEffectId();
                this.LJLIL = 1;
                obj = tTEPEffectService.deleteMobileEffect(effectId, -2, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            DraftEffect draftEffect = this.LJLJI;
            MobileEffectResponse mobileEffectResponse = (MobileEffectResponse) obj;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Delete effect status code: ");
            LIZ.append(mobileEffectResponse.statusCode);
            C15280iq.LJ("DiyProp", X1D.LIZIZ(LIZ));
            if (mobileEffectResponse.statusCode == 0) {
                EffectCreatorServiceImpl.LJIIJ().LIZIZ(C5L7.LIZ(), draftEffect.getDraft().draftID);
                return C76800UCe.LIZ;
            }
        } catch (Exception e) {
            C15280iq.LIZJ("DiyProp", e.getMessage());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
