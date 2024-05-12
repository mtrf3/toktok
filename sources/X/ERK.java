package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.usecase.MobileEffectRecordUseCase$handleGSExport$1", f = "MobileEffectRecordUseCase.kt", l = {380}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ERK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ES0 LJLJI;
    public final /* synthetic */ ShortVideoContext LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ERK(ES0 es0, ShortVideoContext shortVideoContext, InterfaceC67352kd<? super ERK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = es0;
        this.LJLJJI = shortVideoContext;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        ERK erk = new ERK(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        erk.LJLILLLLZI = obj;
        return erk;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C36413EQv c36413EQv;
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
            C15280iq.LJ("DiyProp", "diyPropExport()");
            ES5 es5 = this.LJLJI.LJI;
            if (!(es5 instanceof C36413EQv) || (c36413EQv = (C36413EQv) es5) == null) {
                C15280iq.LJ("DiyProp", "diyPropExport() is null, return");
                return C76800UCe.LIZ;
            }
            this.LJLJJI.creativeModel.mobileEffectsModel.exportedEffects.add(c36413EQv.LIZJ);
            System.currentTimeMillis();
            C60903NvH.LJIIJJI().LJIJJLI();
            this.LJLILLLLZI = c36413EQv;
            this.LJLIL = 1;
            if (XKX.LJI(EXT.LIZ, new C36402EQk(c36413EQv, null), this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C60903NvH.LJIIJJI().LJIJJLI();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
