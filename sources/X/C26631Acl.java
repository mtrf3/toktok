package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Acl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26631Acl extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public static final C26631Acl LJLIL = new C26631Acl();

    public C26631Acl() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logWhenShow = laneParams;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.plusAssign("module_name", "payment_service");
        return C76800UCe.LIZ;
    }
}