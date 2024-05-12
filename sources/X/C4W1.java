package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.ies.im.core.client.StrangerListModelImpl$cacheStrangerAndNotify$1$2", f = "StrangerListModelImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4W1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4W1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C4W3 LJLIL;
    public final /* synthetic */ List<C63120Opw> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4W1(C4W3 c4w3, List<? extends C63120Opw> list, InterfaceC67352kd<? super C4W1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c4w3;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4W1(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C4W3 c4w3 = this.LJLIL;
        C4W6 c4w6 = c4w3.LJLILLLLZI;
        if (c4w6 != null) {
            c4w6.kc(this.LJLILLLLZI, c4w3.LJLJL);
            return C76800UCe.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
