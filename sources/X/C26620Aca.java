package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Aca, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26620Aca extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C26620Aca LJLIL = new C26620Aca();

    public C26620Aca() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logNode = laneParams;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("button_name", "add_address");
        logNode.plusAssign("page_name", "shipping_info");
        return C76800UCe.LIZ;
    }
}
