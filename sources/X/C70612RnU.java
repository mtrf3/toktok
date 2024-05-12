package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.RnU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70612RnU extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C70612RnU LJLIL = new C70612RnU();

    public C70612RnU() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logWhenShow = laneParams;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.plusAssign("button_name", "product_share");
        return C76800UCe.LIZ;
    }
}
