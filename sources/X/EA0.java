package X;

import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EA0 extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ Request LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EA0(Request request, String str, int i) {
        super(1);
        this.LJLIL = request;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams update = laneParams;
        o.LJIIIZ(update, "$this$update");
        update.plusAssign("url", this.LJLIL.getUrl());
        update.plusAssign("host", this.LJLIL.getHost());
        update.plusAssign("path", this.LJLIL.getPath());
        update.plusAssign("key", this.LJLILLLLZI);
        update.plusAssign("type", Integer.valueOf(this.LJLJI));
        return C76800UCe.LIZ;
    }
}
