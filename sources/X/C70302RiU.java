package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.RiU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70302RiU extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C70302RiU LJLIL = new C70302RiU();

    public C70302RiU() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logNode = laneParams;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("page_name", "3rd_party_h5");
        logNode.plusAssign("previous_page", "sku");
        return C76800UCe.LIZ;
    }
}
