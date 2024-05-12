package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Amq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27256Amq extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27256Amq(String str, int i, int i2) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logNode = laneParams;
        o.LJIIIZ(logNode, "$this$logNode");
        String str = this.LJLIL;
        if (str == null) {
            str = "";
        }
        logNode.plusAssign("drop_down_list_name", str);
        logNode.plusAssign("item_num", Integer.valueOf(this.LJLILLLLZI));
        logNode.plusAssign("action_type", "click");
        logNode.plusAssign("rank", Integer.valueOf(this.LJLJI));
        return C76800UCe.LIZ;
    }
}
