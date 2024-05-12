package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Ri4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70276Ri4 extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C70276Ri4 LJLIL = new C70276Ri4();

    public C70276Ri4() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams withBusinessLane = laneParams;
        o.LJIIIZ(withBusinessLane, "$this$withBusinessLane");
        withBusinessLane.put("module_name", "sku");
        return C76800UCe.LIZ;
    }
}
