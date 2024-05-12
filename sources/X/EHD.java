package X;

import fjb.a;
import java.util.Iterator;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercebase.async.PreTask$start$1$1$1", f = "PreTask.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EHD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ EHE<Object> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EHD(EHE<Object> ehe, InterfaceC67352kd<? super EHD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = ehe;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        EHD ehd = new EHD(this.LJLILLLLZI, interfaceC67352kd);
        ehd.LJLIL = obj;
        return ehd;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Object obj2 = this.LJLIL;
        EHE<Object> ehe = this.LJLILLLLZI;
        synchronized (obj2) {
            Iterator<InterfaceC88472Yns<Object, C76800UCe>> it = ehe.LIZLLL.iterator();
            while (it.hasNext()) {
                it.next().invoke(ehe.LIZJ);
            }
            ehe.LIZLLL.clear();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
