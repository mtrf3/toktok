package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Rfw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70144Rfw extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C70144Rfw LJLIL = new C70144Rfw();

    public C70144Rfw() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams withBusinessLane = laneParams;
        o.LJIIIZ(withBusinessLane, "$this$withBusinessLane");
        withBusinessLane.plusAssign("source_page_type", "bundle_deal");
        return C76800UCe.LIZ;
    }
}
