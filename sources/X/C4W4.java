package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.ies.im.core.client.StrangerListModelImpl$loadStrangerConversations$1", f = "StrangerListModelImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4W4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4W4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C4W3 LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<List<? extends C63120Opw>, C76800UCe> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4W4(C4W3 c4w3, InterfaceC88472Yns<? super List<? extends C63120Opw>, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C4W4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c4w3;
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4W4(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C4W3 c4w3 = this.LJLIL;
        this.LJLILLLLZI.invoke(c4w3.LJIIL(c4w3.LJIILL().LIZIZ()));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
