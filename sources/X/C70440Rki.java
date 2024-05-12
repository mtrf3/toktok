package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Rki, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70440Rki extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C70440Rki LJLIL = new C70440Rki();

    public C70440Rki() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logView = laneParams;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("glide_type", "fulltodetail");
        return C76800UCe.LIZ;
    }
}
