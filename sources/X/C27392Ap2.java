package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Ap2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27392Ap2 extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C27392Ap2 LJLIL = new C27392Ap2();

    public C27392Ap2() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        String str;
        LaneParams logView = laneParams;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("button_name", "auto_locate");
        if (C78996UzQ.LJJIIJ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        logView.plusAssign("is_allow", str);
        return C76800UCe.LIZ;
    }
}
