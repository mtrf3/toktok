package X;

import com.bytedance.effectcreatormobile.camera.viewmodel.EffectHintViewModel;
import com.bytedance.effectcreatormobile.ckeapi.api.behaviour.res.IEffectHintResProvider;
import com.bytedance.news.common.service.manager.IService;
import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.camera.viewmodel.EffectHintViewModel$load$1", f = "EffectHintViewModel.kt", l = {46}, m = "invokeSuspend")
/* renamed from: X.aoR, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94899aoR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EffectHintViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94899aoR(EffectHintViewModel effectHintViewModel, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = effectHintViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94899aoR(this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            IEffectHintResProvider iEffectHintResProvider = (IEffectHintResProvider) ((IService) C93971aZT.LIZ().LIZ(IEffectHintResProvider.class));
            if (iEffectHintResProvider != null) {
                this.LJLIL = 1;
                obj = iEffectHintResProvider.loadEffectHintRes(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            StateViewModel.gv0(this.LJLILLLLZI.LJLJJI, EnumC93623aTr.Fail);
            return C76800UCe.LIZ;
        }
        C94382ag6 c94382ag6 = (C94382ag6) obj;
        if (c94382ag6 != null) {
            if (c94382ag6.LJLIL) {
                StateViewModel.hv0(this.LJLILLLLZI.LJLILLLLZI, c94382ag6.LJLILLLLZI);
            } else {
                StateViewModel.gv0(this.LJLILLLLZI.LJLJJI, EnumC93623aTr.Fail);
            }
            return C76800UCe.LIZ;
        }
        StateViewModel.gv0(this.LJLILLLLZI.LJLJJI, EnumC93623aTr.Fail);
        return C76800UCe.LIZ;
    }
}
