package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Anj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27311Anj extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27311Anj(int i, long j) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logView = laneParams;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("item_num", Integer.valueOf(this.LJLIL));
        logView.plusAssign("stay_time", Long.valueOf(this.LJLILLLLZI));
        return C76800UCe.LIZ;
    }
}
