package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.RnV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70613RnV extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C70613RnV LJLIL = new C70613RnV();

    public C70613RnV() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logNode = laneParams;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("guide_name", "add to favorites");
        return C76800UCe.LIZ;
    }
}
