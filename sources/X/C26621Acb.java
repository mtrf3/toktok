package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Acb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26621Acb extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C26621Acb LJLIL = new C26621Acb();

    public C26621Acb() {
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
