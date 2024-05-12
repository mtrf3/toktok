package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.RnS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70610RnS extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C70610RnS LJLIL = new C70610RnS();

    public C70610RnS() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logView = laneParams;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("button_name", "product_share");
        return C76800UCe.LIZ;
    }
}
