package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B25 extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final B25 LJLIL = new B25();

    public B25() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logWhenShow = laneParams;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.put("button_name", "view_all_payment");
        return C76800UCe.LIZ;
    }
}
