package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.AmJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27223AmJ extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C27223AmJ LJLIL = new C27223AmJ();

    public C27223AmJ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logNode = laneParams;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("toast_name", "free_shipping");
        logNode.plusAssign("toast_type", "user_rights_banner");
        return C76800UCe.LIZ;
    }
}
