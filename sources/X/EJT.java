package X;

import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoStickerHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoStickerHandler$loadViewWithCreatorInformation$1", f = "EffectInfoStickerHandler.kt", l = {115, 117}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EJT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ EffectInfoStickerHandler LJLJI;
    public final /* synthetic */ Effect LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EJT(EffectInfoStickerHandler effectInfoStickerHandler, Effect effect, InterfaceC67352kd<? super EJT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = effectInfoStickerHandler;
        this.LJLJJI = effect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        EJT ejt = new EJT(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        ejt.LJLILLLLZI = obj;
        return ejt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (Exception e) {
            H78.LIZJ(e.getMessage());
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            EffectInfoStickerHandler effectInfoStickerHandler = this.LJLJI;
            Effect effect = this.LJLJJI;
            this.LJLILLLLZI = interfaceC70422pa;
            this.LJLIL = 1;
            effectInfoStickerHandler.getClass();
            obj = EffectInfoStickerHandler.LIZIZ(effect, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        InterfaceC74334TFi interfaceC74334TFi = (InterfaceC74334TFi) obj;
        if (interfaceC74334TFi != null) {
            EffectInfoStickerHandler effectInfoStickerHandler2 = this.LJLJI;
            Effect effect2 = this.LJLJJI;
            if (C48841JEv.LJIILLIIL(interfaceC70422pa)) {
                AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
                C74328TFc c74328TFc = new C74328TFc(effectInfoStickerHandler2, effect2, interfaceC74334TFi, null);
                this.LJLILLLLZI = null;
                this.LJLIL = 2;
                if (XKX.LJI(abstractC78621UtN, c74328TFc, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
