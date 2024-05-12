package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.RnF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70597RnF extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C70597RnF LJLIL = new C70597RnF();

    public C70597RnF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logWhenShow = laneParams;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.plusAssign("guide_name", "add to favorites");
        return C76800UCe.LIZ;
    }
}
