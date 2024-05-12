package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.usecase.MobileEffectRecordUseCase$diyPropExport$1", f = "MobileEffectRecordUseCase.kt", l = {355}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ERJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ES0 LJLJI;
    public final /* synthetic */ ShortVideoContext LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ERJ(ES0 es0, ShortVideoContext shortVideoContext, InterfaceC67352kd<? super ERJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = es0;
        this.LJLJJI = shortVideoContext;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        ERJ erj = new ERJ(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        erj.LJLILLLLZI = obj;
        return erj;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C36411EQt c36411EQt;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                c36411EQt = (C36411EQt) this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C15280iq.LJ("DiyProp", "diyPropExport()");
            ES5 es5 = this.LJLJI.LJI;
            if (!(es5 instanceof C36411EQt) || (c36411EQt = (C36411EQt) es5) == null) {
                C15280iq.LJ("DiyProp", "diyPropExport() is null, return");
                return C76800UCe.LIZ;
            }
            System.currentTimeMillis();
            C60903NvH.LJIIJJI().LJIJJLI();
            this.LJLJJI.creativeModel.mobileEffectsModel.exportedEffects.add(c36411EQt.LIZIZ);
            XN6 xn6 = c36411EQt.LIZJ;
            if (xn6 != null) {
                xn6.LIZ();
            }
            this.LJLILLLLZI = c36411EQt;
            this.LJLIL = 1;
            if (XKX.LJI(EXT.LIZ, new C36407EQp(c36411EQt, null), this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        XN6 xn62 = c36411EQt.LIZJ;
        if (xn62 != null) {
            synchronized (xn62) {
                xn62.LIZ.removeTag("tt-child-effect");
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
