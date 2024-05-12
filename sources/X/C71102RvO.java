package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.RvO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71102RvO extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C71102RvO LJLIL = new C71102RvO();

    public C71102RvO() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logView = laneParams;
        o.LJIIIZ(logView, "$this$logView");
        logView.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        logView.put("page_name", "order_submit");
        logView.put("button_name", "see_more");
        logView.put("button_type", "add_on_module");
        return C76800UCe.LIZ;
    }
}
