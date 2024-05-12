package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.RkM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70418RkM extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ C70414RkI LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70418RkM(C70414RkI c70414RkI, String str, String str2, int i) {
        super(1);
        this.LJLIL = c70414RkI;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logNode = laneParams;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(this.LJLIL.LIZIZ);
        logNode.plusAssign("module_name", this.LJLILLLLZI);
        String str = this.LJLJI;
        if (str == null) {
            str = "";
        }
        logNode.plusAssign("video_id", str);
        logNode.plusAssign("video_whole_duration", Integer.valueOf(this.LJLJJI));
        return C76800UCe.LIZ;
    }
}
