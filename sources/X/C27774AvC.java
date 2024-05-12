package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.AvC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27774AvC extends AbstractC65781Prl implements InterfaceC88472Yns<OrderSubmitState, OrderSubmitState> {
    public static final C27774AvC LJLIL = new C27774AvC();

    public C27774AvC() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
        OrderSubmitState setState = orderSubmitState;
        o.LJIIIZ(setState, "$this$setState");
        Iterator<Object> it = setState.getAdapterList().iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next() instanceof C27042AjO) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        return OrderSubmitState.copy$default(setState, 0, null, null, false, null, null, false, false, null, null, null, 0, null, 0, 0, null, null, false, false, false, null, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, new C27919AxX(Integer.valueOf(i)), null, null, null, false, null, false, null, false, -1, 66715647, null);
    }
}
