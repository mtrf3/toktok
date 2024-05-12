package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor$monitorPageNode$1", f = "PageMonitor.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.EaF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36667EaF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ LifecycleOwner LJLIL;
    public final /* synthetic */ InterfaceC37828Esy LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36667EaF(LifecycleOwner lifecycleOwner, InterfaceC37828Esy interfaceC37828Esy, InterfaceC67352kd<? super C36667EaF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = interfaceC37828Esy;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36667EaF(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        PageMonitor.LIZ.LIZ(this.LJLIL, this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
