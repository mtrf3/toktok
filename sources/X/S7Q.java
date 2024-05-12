package X;

import android.view.ViewGroup;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateListViewModel$display$1$imageFilepath$1", f = "TemplateListViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class S7Q extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public final /* synthetic */ ViewGroup LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S7Q(ViewGroup viewGroup, InterfaceC67352kd<? super S7Q> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = viewGroup;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new S7Q(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return C45455Hsh.LIZ(C45455Hsh.LIZIZ(this.LJLIL));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
