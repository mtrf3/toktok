package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS135S0200000_4;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel$updateGooglePayList$1", f = "OrderSubmitViewModel.kt", l = {2079}, m = "invokeSuspend")
/* renamed from: X.Ayr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28001Ayr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ OrderSubmitViewModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28001Ayr(OrderSubmitViewModel orderSubmitViewModel, boolean z, InterfaceC67352kd<? super C28001Ayr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = orderSubmitViewModel;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28001Ayr(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            OrderSubmitViewModel orderSubmitViewModel = this.LJLILLLLZI;
            boolean z = this.LJLJI;
            this.LJLIL = 1;
            obj = orderSubmitViewModel.Kw0(z, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            return C76800UCe.LIZ;
        }
        CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList = this.LJLILLLLZI.LLFF;
        boolean z2 = this.LJLJI;
        ArrayList arrayList = new ArrayList();
        Iterator<PaymentMethod> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            PaymentMethod next = it.next();
            if (!GooglePayProcess.LJ(next) || z2) {
                arrayList.add(next);
            }
        }
        OrderSubmitViewModel orderSubmitViewModel2 = this.LJLILLLLZI;
        orderSubmitViewModel2.withState(new AqS135S0200000_4(orderSubmitViewModel2, arrayList, 228));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
