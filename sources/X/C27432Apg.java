package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Apg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27432Apg extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C27432Apg LJLIL = new C27432Apg();

    public C27432Apg() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logView = laneParams;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("button_name", "use");
        logView.plusAssign("is_allow", "1");
        return C76800UCe.LIZ;
    }
}
