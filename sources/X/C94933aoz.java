package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.MainFragment$initObserver$$inlined$launchAndCollectIn$4", f = "MainFragment.kt", l = {17}, m = "invokeSuspend")
/* renamed from: X.aoz, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94933aoz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC65462ha LJLILLLLZI;
    public final /* synthetic */ LifecycleOwner LJLJI;
    public final /* synthetic */ Lifecycle.State LJLJJI;
    public final /* synthetic */ MainFragment LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94933aoz(InterfaceC65462ha interfaceC65462ha, LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC67352kd interfaceC67352kd, MainFragment mainFragment) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC65462ha;
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = state;
        this.LJLJJL = mainFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94933aoz(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, completion, this.LJLJJL);
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
            LifecycleOwner lifecycleOwner = this.LJLJI;
            Lifecycle.State state = this.LJLJJI;
            C94931aox c94931aox = new C94931aox(this, null);
            this.LJLIL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, c94931aox, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
