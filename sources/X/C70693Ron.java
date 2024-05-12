package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Ron, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70693Ron extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70693Ron(String str, String str2, String str3, String str4) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logNode = laneParams;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("actionsheet_name", this.LJLIL);
        logNode.plusAssign("default_option", this.LJLILLLLZI);
        logNode.plusAssign("option_name", this.LJLJI);
        String str = this.LJLJJI;
        if (str != null) {
            logNode.plusAssign("button_name", str);
        }
        return C76800UCe.LIZ;
    }
}
