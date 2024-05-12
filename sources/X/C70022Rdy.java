package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Rdy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70022Rdy extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C70022Rdy LJLIL = new C70022Rdy();

    public C70022Rdy() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams update = laneParams;
        o.LJIIIZ(update, "$this$update");
        update.put("page_name", "product_detail");
        update.put("click_type", "popup_click");
        return C76800UCe.LIZ;
    }
}
