package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OGH extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ java.util.Map<String, Object> LJLJI;
    public final /* synthetic */ C76732zl LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OGH(String str, String str2, java.util.Map<String, ? extends Object> map, C76732zl c76732zl) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = map;
        this.LJLJJI = c76732zl;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logNode = laneParams;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.put("prepage_price", this.LJLIL);
        logNode.put("pdp_price", this.LJLILLLLZI);
        logNode.put("trackParams", this.LJLJI);
        logNode.put("is_diff", Integer.valueOf(this.LJLJJI.element));
        return C76800UCe.LIZ;
    }
}
