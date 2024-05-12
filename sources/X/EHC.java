package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercebase.async.PreTask$start$1$1", f = "PreTask.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EHC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ EHE<Object> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EHC(EHE<Object> ehe, InterfaceC67352kd<? super EHC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = ehe;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        EHC ehc = new EHC(this.LJLILLLLZI, interfaceC67352kd);
        ehc.LJLIL = obj;
        return ehc;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLIL;
        EHE<Object> ehe = this.LJLILLLLZI;
        ehe.LIZJ = ehe.LIZ.invoke();
        XKX.LIZLLL(interfaceC70422pa, EXV.LIZ, null, new EHD(this.LJLILLLLZI, null), 2);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
