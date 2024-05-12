package X;

import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.elements.SelectPIKt$SelectPI$1", f = "SelectPI.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLF, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93089aLF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<InterfaceC91961a33> LJLIL;
    public final /* synthetic */ List<InterfaceC91961a33> LJLILLLLZI;
    public final /* synthetic */ C92283a8F LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C93089aLF(List<? extends InterfaceC91961a33> list, List<? extends InterfaceC91961a33> list2, C92283a8F c92283a8F, InterfaceC67352kd<? super C93089aLF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = list2;
        this.LJLJI = c92283a8F;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93089aLF(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List list;
        String paymentMethod;
        C141335gf.LIZJ(obj);
        List<InterfaceC91961a33> LLIIIZ = ORZ.LLIIIZ(this.LJLILLLLZI, this.LJLIL);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LLIIIZ, 10));
        for (InterfaceC91961a33 interfaceC91961a33 : LLIIIZ) {
            if (interfaceC91961a33 instanceof C92233a7R) {
                C92233a7R c92233a7R = (C92233a7R) interfaceC91961a33;
                list = C92047a4R.LIZIZ(c92233a7R.LJLIL.isValid(), c92233a7R.LJLIL.getPaymentMethod(), c92233a7R.LJLIL.getPaymentMethodToken());
            } else if (interfaceC91961a33 instanceof C92231a7P) {
                C92231a7P c92231a7P = (C92231a7P) interfaceC91961a33;
                String paymentMethodType = c92231a7P.LJLIL.getPaymentMethodType();
                EnumC91967a39 enumC91967a39 = EnumC91967a39.CCDC;
                if (o.LJ(paymentMethodType, enumC91967a39.getValue())) {
                    paymentMethod = enumC91967a39.getValue();
                } else {
                    paymentMethod = c92231a7P.LJLIL.getPaymentMethod();
                }
                list = C92047a4R.LIZIZ(Boolean.TRUE, paymentMethod, null);
            } else if (interfaceC91961a33 instanceof C92230a7O) {
                list = C92047a4R.LIZIZ(Boolean.TRUE, ((C92230a7O) interfaceC91961a33).LJLILLLLZI, null);
            } else {
                list = C61878OQg.INSTANCE;
            }
            arrayList.add(list);
        }
        if (!arrayList.isEmpty()) {
            this.LJLJI.LJIIL(arrayList, true);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
