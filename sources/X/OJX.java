package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS176S0100000_10;

@InterfaceC65848Psq(c = "tiktok.compose.AssemComposeExtensionKt$collectAsState$1$1", f = "AssemComposeExtension.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class OJX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AssemViewModel<Object> LJLIL;
    public final /* synthetic */ C56412MCa<Object> LJLILLLLZI;
    public final /* synthetic */ InterfaceC44011o5<Object> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OJX(AssemViewModel<Object> assemViewModel, C56412MCa<Object> c56412MCa, InterfaceC44011o5<Object> interfaceC44011o5, InterfaceC67352kd<? super OJX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = assemViewModel;
        this.LJLILLLLZI = c56412MCa;
        this.LJLJI = interfaceC44011o5;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new OJX(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        AssemViewModel.subscribeInternal$default(this.LJLIL, this.LJLILLLLZI, null, null, new AqS176S0100000_10(this.LJLJI, (InterfaceC44011o5<Object>) 117), 6, null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
