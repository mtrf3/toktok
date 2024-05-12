package X;

import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel$fetchDraftEffects$2$deferredDraftList$1$deferred$1", f = "MyEffectsViewModel.kt", l = {168}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EQO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super DraftEffect>, Object> {
    public int LJLIL;
    public final /* synthetic */ MyEffectsViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ CKEDraftInfoWrapper LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EQO(MyEffectsViewModel myEffectsViewModel, String str, CKEDraftInfoWrapper cKEDraftInfoWrapper, InterfaceC67352kd<? super EQO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = myEffectsViewModel;
        this.LJLJI = str;
        this.LJLJJI = cKEDraftInfoWrapper;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EQO(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            MyEffectsViewModel myEffectsViewModel = this.LJLILLLLZI;
            String str = this.LJLJI;
            CKEDraftInfoWrapper cKEDraftInfoWrapper = this.LJLJJI;
            this.LJLIL = 1;
            myEffectsViewModel.getClass();
            obj = XKX.LJI(C78613UtF.LIZJ, new C36442ERy(cKEDraftInfoWrapper, str, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super DraftEffect> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
