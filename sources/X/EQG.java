package X;

import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel$loadMyEffectsData$1", f = "MyEffectsViewModel.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EQG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MyEffectsViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EQG(MyEffectsViewModel myEffectsViewModel, String str, String str2, InterfaceC67352kd<? super EQG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = myEffectsViewModel;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EQG(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
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
            String str2 = this.LJLJJI;
            this.LJLIL = 1;
            myEffectsViewModel.getClass();
            Object LJI = C48841JEv.LJI(new EQJ(myEffectsViewModel, str, str2, null), this);
            if (LJI != obj2) {
                LJI = C76800UCe.LIZ;
            }
            if (LJI == obj2) {
                return obj2;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
