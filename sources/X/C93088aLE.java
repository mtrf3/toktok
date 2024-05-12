package X;

import com.bytedance.pipo.checkout.api.network.model.response.Methods;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.elements.SelectAssemblePIKt$SelectAssemblePI$1$1", f = "SelectAssemblePI.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLE, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93088aLE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<Methods> LJLIL;
    public final /* synthetic */ C92283a8F LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93088aLE(List<Methods> list, C92283a8F c92283a8F, InterfaceC67352kd<? super C93088aLE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = c92283a8F;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93088aLE(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String LJIIIIZZ;
        C141335gf.LIZJ(obj);
        List<Methods> list = this.LJLIL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (Methods methods : list) {
            if (o.LJ(methods.getPaymentMethodType(), EnumC91967a39.BankTransfer.getValue())) {
                LJIIIIZZ = C91969a3B.LIZJ(C91969a3B.LJ(methods));
            } else {
                LJIIIIZZ = C91969a3B.LJIIIIZZ(methods);
            }
            arrayList.add(C47261Igj.LJJIJIIJI(methods.getPaymentMethodType(), LJIIIIZZ, null, Boolean.TRUE));
        }
        this.LJLILLLLZI.LJIIL(arrayList, false);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
