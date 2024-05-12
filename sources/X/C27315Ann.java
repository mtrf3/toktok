package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Ann, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27315Ann extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C27315Ann LJLIL = new C27315Ann();

    public C27315Ann() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams withBusinessLane = laneParams;
        o.LJIIIZ(withBusinessLane, "$this$withBusinessLane");
        withBusinessLane.plusAssign("input_box_name", "address_searchbar");
        withBusinessLane.plusAssign("action_type", "show");
        withBusinessLane.plusAssign("drop_down_list_name", "address_searchbar");
        return C76800UCe.LIZ;
    }
}
