package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Rom, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70692Rom extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70692Rom(String str, String str2, long j, String str3) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = j;
        this.LJLJJI = str3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logNode = laneParams;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("actionsheet_name", this.LJLIL);
        logNode.plusAssign("quit_type", this.LJLILLLLZI);
        logNode.plusAssign("stay_time", Long.valueOf(this.LJLJI));
        logNode.plusAssign("default_option", this.LJLJJI);
        logNode.plusAssign("is_load_data", 1);
        logNode.plusAssign("review_cnt", Integer.valueOf(C70691Rol.LJIILLIIL));
        return C76800UCe.LIZ;
    }
}
