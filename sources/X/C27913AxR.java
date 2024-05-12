package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.AxR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27913AxR extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C27913AxR LJLIL = new C27913AxR();

    public C27913AxR() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logView = laneParams;
        o.LJIIIZ(logView, "$this$logView");
        logView.put("notice_name", "view_payment_detail");
        return C76800UCe.LIZ;
    }
}
