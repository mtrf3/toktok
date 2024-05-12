package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Arn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27563Arn extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C27563Arn LJLIL = new C27563Arn();

    public C27563Arn() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logNode = laneParams;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("button_name", "favorites_list");
        return C76800UCe.LIZ;
    }
}
