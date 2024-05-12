package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.MobileEffectExportWorkflowImpl$exportIconOnly$1", f = "MobileEffectExportWorkflowImpl.kt", l = {256, 258}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ER8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ERD LJLILLLLZI;
    public final /* synthetic */ UploadableMobileEffect2 LJLJI;
    public final /* synthetic */ ERB LJLJJI;
    public final /* synthetic */ Effect LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ER8(ERD erd, UploadableMobileEffect2 uploadableMobileEffect2, ERB erb, Effect effect, InterfaceC67352kd<? super ER8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = erd;
        this.LJLJI = uploadableMobileEffect2;
        this.LJLJJI = erb;
        this.LJLJJL = effect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new ER8(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            ERD erd = this.LJLILLLLZI;
            String str = this.LJLJI.effectId;
            this.LJLIL = 1;
            erd.getClass();
            if (XKX.LJI(C78613UtF.LIZJ, new ERG(erd, str, true, null), this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        ERB erb = this.LJLJJI;
        Effect effect = this.LJLJJL;
        UploadableMobileEffect2 uploadableMobileEffect2 = this.LJLJI;
        this.LJLIL = 2;
        if (erb.LIZIZ(effect, uploadableMobileEffect2, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
