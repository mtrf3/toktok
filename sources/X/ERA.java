package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.MobileEffectExportWorkflowImpl$exportEffect$1$deferredSaveZip$1", f = "MobileEffectExportWorkflowImpl.kt", l = {295}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ERA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ERB LJLILLLLZI;
    public final /* synthetic */ Effect LJLJI;
    public final /* synthetic */ UploadableMobileEffect2 LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ERA(ERB erb, Effect effect, UploadableMobileEffect2 uploadableMobileEffect2, long j, InterfaceC67352kd<? super ERA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = erb;
        this.LJLJI = effect;
        this.LJLJJI = uploadableMobileEffect2;
        this.LJLJJL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new ERA(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            H78.LIZIZ("MET-JEFF", "zip export started");
            ERB erb = this.LJLILLLLZI;
            Effect effect = this.LJLJI;
            UploadableMobileEffect2 uploadableMobileEffect2 = this.LJLJJI;
            this.LJLIL = 1;
            if (erb.LIZLLL(effect, uploadableMobileEffect2, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("zip export time = ");
        LIZ.append((System.currentTimeMillis() - this.LJLJJL) / 1000);
        LIZ.append(" seconds");
        H78.LIZIZ("MET-JEFF", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
