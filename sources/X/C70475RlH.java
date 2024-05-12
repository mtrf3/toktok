package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.RlH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70475RlH extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C70475RlH LJLIL = new C70475RlH();

    public C70475RlH() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logView = laneParams;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("entrance_name", "bonus");
        logView.plusAssign("entrance_to", "bonus_center");
        logView.plusAssign("entrance_status", "normal");
        return C76800UCe.LIZ;
    }
}
