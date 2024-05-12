package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Ank, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27312Ank extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C27312Ank LJLIL = new C27312Ank();

    public C27312Ank() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logView = laneParams;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("button_area", "address_searchbar");
        logView.plusAssign("button_name", "enter_address");
        return C76800UCe.LIZ;
    }
}
