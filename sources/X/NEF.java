package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.live.SearchLiveAdModule$initLivePlayerModule$1", f = "SearchLiveAdModule.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NEF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ N53 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NEF(N53 n53, InterfaceC67352kd<? super NEF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = n53;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new NEF(this.LJLILLLLZI, interfaceC67352kd);
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
            N53 n53 = this.LJLILLLLZI;
            ActivityC45651qj activityC45651qj = n53.LJLJJI;
            if (activityC45651qj != null) {
                Lifecycle.State state = Lifecycle.State.STARTED;
                NEL nel = new NEL(n53, null);
                this.LJLIL = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC45651qj, state, nel, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
