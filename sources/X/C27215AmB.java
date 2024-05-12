package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import kotlin.jvm.internal.o;

/* renamed from: X.AmB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27215AmB extends AbstractC65781Prl implements InterfaceC88471Ynr<OrderSubmitState, Bundle, OrderSubmitState> {
    public static final C27215AmB INSTANCE = new C27215AmB();

    public C27215AmB() {
        super(2);
    }

    public final OrderSubmitState invoke(OrderSubmitState receiver, Bundle bundle) {
        o.LJIIJ(receiver, "$receiver");
        return receiver;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ OrderSubmitState invoke(OrderSubmitState orderSubmitState, Bundle bundle) {
        OrderSubmitState orderSubmitState2 = orderSubmitState;
        invoke(orderSubmitState2, bundle);
        return orderSubmitState2;
    }
}
