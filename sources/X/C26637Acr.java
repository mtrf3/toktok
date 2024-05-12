package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Acr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26637Acr extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C26637Acr LJLIL = new C26637Acr();

    public C26637Acr() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logView = laneParams;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("popup_name", "remove_address_confirm");
        return C76800UCe.LIZ;
    }
}
