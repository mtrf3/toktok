package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Rd1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69963Rd1 extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69963Rd1(boolean z, String str) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        String str;
        LaneParams logView = laneParams;
        o.LJIIIZ(logView, "$this$logView");
        boolean z = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        if (z) {
            str = "save";
        } else {
            str = "unsave";
        }
        logView.plusAssign("save_type", str);
        logView.plusAssign("prompt_type", str2);
        return C76800UCe.LIZ;
    }
}
