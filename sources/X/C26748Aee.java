package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Aee, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26748Aee extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C26748Aee LJLIL = new C26748Aee();

    public C26748Aee() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams withBusinessLane = laneParams;
        o.LJIIIZ(withBusinessLane, "$this$withBusinessLane");
        withBusinessLane.plusAssign("previous_page", "shipping_address");
        return C76800UCe.LIZ;
    }
}
