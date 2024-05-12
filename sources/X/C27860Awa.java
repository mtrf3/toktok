package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import kotlin.jvm.internal.o;

/* renamed from: X.Awa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27860Awa extends AbstractC65781Prl implements InterfaceC88472Yns<OrderSubmitState, C76800UCe> {
    public static final C27860Awa LJLIL = new C27860Awa();

    public C27860Awa() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(OrderSubmitState orderSubmitState) {
        OrderSubmitState it = orderSubmitState;
        o.LJIIIZ(it, "it");
        C27949Ay1.LJIJJ("edit_address", Boolean.valueOf(it.getReachableAny()), 4);
        return C76800UCe.LIZ;
    }
}
