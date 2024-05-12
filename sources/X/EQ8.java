package X;

import com.ss.android.ugc.aweme.prop.presenter.MobileEffectViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service.TTEPEffectService;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.prop.presenter.MobileEffectViewModel$deleteEffect$1", f = "MobileEffectViewModel.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EQ8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MobileEffectViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EQ8(MobileEffectViewModel mobileEffectViewModel, String str, int i, InterfaceC67352kd<? super EQ8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = mobileEffectViewModel;
        this.LJLJI = str;
        this.LJLJJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EQ8(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C141335gf.LIZJ(obj);
                } else {
                    C141335gf.LIZJ(obj);
                    this.LJLILLLLZI.LJLJI.setValue(EQB.LIZ);
                    TTEPEffectService tTEPEffectService = (TTEPEffectService) this.LJLILLLLZI.LJLJJL.getValue();
                    String str = this.LJLJI;
                    int i2 = this.LJLJJI;
                    this.LJLIL = 1;
                    obj = tTEPEffectService.deleteMobileEffect(str, i2, this);
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
                    this.LJLILLLLZI.LJLIL.LJII(EQE.LIZ);
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Delete effect status code: ");
                    LIZ2.append(mobileEffectResponse.errorCode);
                    C15280iq.LJ("DiyProp", X1D.LIZIZ(LIZ2));
                    this.LJLILLLLZI.LJLIL.LJII(EQC.LIZ);
                }
            } catch (Exception e) {
                this.LJLILLLLZI.LJLIL.LJII(EQC.LIZ);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("error: ");
                LIZ3.append(e);
                C15280iq.LIZJ("DiyProp", X1D.LIZIZ(LIZ3));
            }
            this.LJLILLLLZI.LJLJI.setValue(EQ9.LIZ);
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            this.LJLILLLLZI.LJLJI.setValue(EQ9.LIZ);
            throw th;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
