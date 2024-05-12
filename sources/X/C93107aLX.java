package X;

import com.bytedance.pipo.checkout.api.network.model.response.Elements;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.pages.CheckoutHomeKt$CheckoutHome$3$4$1$1", f = "CheckoutHome.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLX, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93107aLX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C92283a8F LJLIL;
    public final /* synthetic */ InterfaceC91961a33 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93107aLX(C92283a8F c92283a8F, InterfaceC91961a33 interfaceC91961a33, InterfaceC67352kd<? super C93107aLX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c92283a8F;
        this.LJLILLLLZI = interfaceC91961a33;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93107aLX(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean booleanValue;
        C141335gf.LIZJ(obj);
        C92283a8F c92283a8F = this.LJLIL;
        Boolean isDefault = ((C92233a7R) this.LJLILLLLZI).LJLIL.isDefault();
        if (isDefault == null) {
            booleanValue = false;
        } else {
            booleanValue = isDefault.booleanValue();
        }
        String paymentMethod = ((C92233a7R) this.LJLILLLLZI).LJLIL.getPaymentMethod();
        if (paymentMethod == null) {
            paymentMethod = "";
        }
        List<Elements> list = ((C92220a7E) C91943a2l.LJIIJJI.getValue()).LIZLLL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<Elements> it = list.iterator();
        while (it.hasNext()) {
            String paramName = it.next().getParamName();
            if (paramName == null) {
                paramName = "";
            }
            arrayList.add(paramName);
        }
        c92283a8F.LJIILIIL(paymentMethod, arrayList, booleanValue);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
