package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.RjU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70364RjU extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C70364RjU LJLIL = new C70364RjU();

    public C70364RjU() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logView = laneParams;
        o.LJIIIZ(logView, "$this$logView");
        logView.put("entrance_name", "tiktok_paylater");
        logView.put("entrance_status", "normal");
        logView.put("entrance_to", "tiktok_paylater_register");
        return C76800UCe.LIZ;
    }
}
