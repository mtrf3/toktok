package X;

import com.ss.android.ugc.aweme.effectcreator.EffectCreatorServiceImpl;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service.TTEPEffectService;
import fjb.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel$deleteMyEffectData$1", f = "MyEffectsViewModel.kt", l = {282}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EQM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Effect LJLILLLLZI;
    public final /* synthetic */ MyEffectsViewModel LJLJI;
    public final /* synthetic */ OSZ<Effect, Integer> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EQM(Effect effect, MyEffectsViewModel myEffectsViewModel, OSZ<? extends Effect, Integer> osz, InterfaceC67352kd<? super EQM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = effect;
        this.LJLJI = myEffectsViewModel;
        this.LJLJJI = osz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EQM(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int source;
        MobileEffect mobileEffect;
        DraftEffect draftEffect;
        CKEDraftInfoWrapper draft;
        String str;
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
                Effect effect = this.LJLILLLLZI;
                if ((effect instanceof MobileEffect) && (mobileEffect = (MobileEffect) effect) != null && mobileEffect.getModerationStatus() == 2) {
                    List<DraftEffect> value = this.LJLJI.LJZI.getValue();
                    if (value != null) {
                        Effect effect2 = this.LJLILLLLZI;
                        Iterator<DraftEffect> it = value.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                draftEffect = it.next();
                                if (o.LJ(draftEffect.getDraft().effectId, effect2.getEffectId())) {
                                    break;
                                }
                            } else {
                                draftEffect = null;
                                break;
                            }
                        }
                        DraftEffect draftEffect2 = draftEffect;
                        if (draftEffect2 != null && (draft = draftEffect2.getDraft()) != null && (str = draft.draftID) != null) {
                            EffectCreatorServiceImpl.LJIIJ().LIZIZ(C5L7.LIZ(), str);
                        }
                    }
                    source = -1;
                } else {
                    source = this.LJLILLLLZI.getSource();
                }
                TTEPEffectService tTEPEffectService = (TTEPEffectService) this.LJLJI.LJZL.getValue();
                String effectId = this.LJLILLLLZI.getEffectId();
                this.LJLIL = 1;
                obj = tTEPEffectService.deleteMobileEffect(effectId, source, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            MobileEffectResponse mobileEffectResponse = (MobileEffectResponse) obj;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Delete effect status code: ");
            LIZ.append(mobileEffectResponse.statusCode);
            C15280iq.LJ("DiyProp", X1D.LIZIZ(LIZ));
            if (mobileEffectResponse.statusCode == 0) {
                return C76800UCe.LIZ;
            }
        } catch (Exception e) {
            C15280iq.LIZJ("DiyProp", e.getMessage());
        }
        this.LJLJI.LJZ.setValue(this.LJLJJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
