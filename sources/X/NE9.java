package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.SearchAdModuleExtKt$handlePlayerState$1", f = "SearchAdModuleExt.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NE9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ LifecycleOwner LJLILLLLZI;
    public final /* synthetic */ InterfaceC58799N5v LJLJI;
    public final /* synthetic */ java.util.Map<N62, InterfaceC65784Pro<C76800UCe>> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NE9(LifecycleOwner lifecycleOwner, InterfaceC58799N5v interfaceC58799N5v, java.util.Map<N62, ? extends InterfaceC65784Pro<C76800UCe>> map, InterfaceC67352kd<? super NE9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = interfaceC58799N5v;
        this.LJLJJI = map;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new NE9(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            LifecycleOwner lifecycleOwner = this.LJLILLLLZI;
            Lifecycle.State state = Lifecycle.State.STARTED;
            NE8 ne8 = new NE8(this.LJLJI, this.LJLJJI, null);
            this.LJLIL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, ne8, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
