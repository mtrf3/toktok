package X;

import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EA1 extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ Request LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EA1(Request request, int i, long j) {
        super(1);
        this.LJLIL = request;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams update = laneParams;
        o.LJIIIZ(update, "$this$update");
        update.plusAssign("url", this.LJLIL.getUrl());
        update.plusAssign("host", this.LJLIL.getHost());
        update.plusAssign("path", this.LJLIL.getPath());
        update.plusAssign("success", Integer.valueOf(this.LJLILLLLZI));
        update.plusAssign("cost_time", Long.valueOf(this.LJLJI));
        return C76800UCe.LIZ;
    }
}
