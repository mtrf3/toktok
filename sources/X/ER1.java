package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.effectlogic.AnnotationEffectExportLogic$saveZip$2", f = "AnnotationEffectExportLogic.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ER1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ Effect LJLILLLLZI;
    public final /* synthetic */ UploadableMobileEffect2 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ER1(Effect effect, UploadableMobileEffect2 uploadableMobileEffect2, InterfaceC67352kd<? super ER1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = effect;
        this.LJLJI = uploadableMobileEffect2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new ER1(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C36417EQz c36417EQz = ER0.LIZ;
            Effect effect = this.LJLILLLLZI;
            UploadableMobileEffect2 uploadableMobileEffect2 = this.LJLJI;
            this.LJLIL = 1;
            obj = c36417EQz.LIZ(effect, uploadableMobileEffect2, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
