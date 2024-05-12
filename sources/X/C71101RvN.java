package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.RvN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71101RvN extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C71101RvN LJLIL = new C71101RvN();

    public C71101RvN() {
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
