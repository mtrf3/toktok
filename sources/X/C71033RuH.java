package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.RuH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71033RuH extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C71033RuH LJLIL = new C71033RuH();

    public C71033RuH() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logView = laneParams;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("popup_name", "CPF_edit");
        logView.plusAssign("action_type", "cancel");
        return C76800UCe.LIZ;
    }
}
