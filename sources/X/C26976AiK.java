package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.AiK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26976AiK extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C26976AiK LJLIL = new C26976AiK();

    public C26976AiK() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logView = laneParams;
        o.LJIIIZ(logView, "$this$logView");
        logView.put("button_name", "info");
        logView.put("option_type", "order_summary");
        logView.put("option_name", "taxes");
        return C76800UCe.LIZ;
    }
}
