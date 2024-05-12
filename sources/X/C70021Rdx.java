package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Rdx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70021Rdx extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C70021Rdx LJLIL = new C70021Rdx();

    public C70021Rdx() {
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
