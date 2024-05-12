package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "tiktok.compose.AssemComposeExtensionKt$collectAsState$1", f = "AssemComposeExtension.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class OJW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC44011o5<Object>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ AssemViewModel<Object> LJLJI;
    public final /* synthetic */ Lifecycle.State LJLJJI;
    public final /* synthetic */ C56412MCa<Object> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OJW(AssemViewModel<Object> assemViewModel, Lifecycle.State state, C56412MCa<Object> c56412MCa, InterfaceC67352kd<? super OJW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = assemViewModel;
        this.LJLJJI = state;
        this.LJLJJL = c56412MCa;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        OJW ojw = new OJW(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        ojw.LJLILLLLZI = obj;
        return ojw;
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
            InterfaceC44011o5 interfaceC44011o5 = (InterfaceC44011o5) this.LJLILLLLZI;
            Lifecycle lifecycle = this.LJLJI.getLifecycle();
            Lifecycle.State state = this.LJLJJI;
            OJX ojx = new OJX(this.LJLJI, this.LJLJJL, interfaceC44011o5, null);
            this.LJLIL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, ojx, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC44011o5<Object> interfaceC44011o5, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC44011o5, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
