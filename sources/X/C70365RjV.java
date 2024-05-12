package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.RjV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70365RjV extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C70365RjV LJLIL = new C70365RjV();

    public C70365RjV() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logWhenShow = laneParams;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.put("entrance_name", "tiktok_paylater");
        logWhenShow.put("entrance_status", "normal");
        logWhenShow.put("entrance_to", "tiktok_paylater_register");
        return C76800UCe.LIZ;
    }
}
