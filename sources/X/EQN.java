package X;

import com.ss.android.ugc.aweme.effectcreator.EffectCreatorServiceImpl;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel$fetchDraftEffects$2", f = "MyEffectsViewModel.kt", l = {172}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EQN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends DraftEffect>>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ MyEffectsViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EQN(MyEffectsViewModel myEffectsViewModel, InterfaceC67352kd<? super EQN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = myEffectsViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        EQN eqn = new EQN(this.LJLJI, interfaceC67352kd);
        eqn.LJLILLLLZI = obj;
        return eqn;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            if (!ES2.LIZ()) {
                return C61878OQg.INSTANCE;
            }
            List LLILII = ORZ.LLILII(EQP.LJLIL, EffectCreatorServiceImpl.LJIIJ().LIZ(C5L7.LIZ()));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("draftList = ");
            LIZ.append(LLILII);
            H78.LIZIZ("AMESDK", X1D.LIZIZ(LIZ));
            C76732zl c76732zl = new C76732zl();
            c76732zl.element = 1000;
            MyEffectsViewModel myEffectsViewModel = this.LJLJI;
            ArrayList arrayList = new ArrayList(C32I.LJJL(LLILII, 10));
            int i2 = 0;
            for (Object obj2 : LLILII) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    CKEDraftInfoWrapper cKEDraftInfoWrapper = (CKEDraftInfoWrapper) obj2;
                    c76732zl.element++;
                    String str = cKEDraftInfoWrapper.effectId;
                    if (str.length() == 0) {
                        str = String.valueOf(c76732zl.element);
                    }
                    arrayList.add(XKX.LIZIZ(interfaceC70422pa, null, null, new EQO(myEffectsViewModel, str, cKEDraftInfoWrapper, null), 3));
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            this.LJLIL = 1;
            obj = T1W.LIZ(arrayList, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return ORZ.LJLL((Iterable) obj);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends DraftEffect>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
