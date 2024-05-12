package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.RnT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70611RnT extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C70611RnT LJLIL = new C70611RnT();

    public C70611RnT() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logView = laneParams;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("guide_name", "add to favorites");
        return C76800UCe.LIZ;
    }
}
