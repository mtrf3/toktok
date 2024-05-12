package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.RoO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70668RoO extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C70691Rol LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70668RoO(String str, int i, C70691Rol c70691Rol, String str2, String str3, boolean z, String str4) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = c70691Rol;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = z;
        this.LJLJL = str4;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        LaneParams logView = laneParams;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("photo_id", this.LJLIL);
        logView.plusAssign("rank", Integer.valueOf(this.LJLILLLLZI));
        logView.plusAssign("product_id", this.LJLJI.LIZIZ);
        String str = this.LJLJJI;
        if (str == null) {
            str = "";
        }
        logView.plusAssign("sku_id", str);
        logView.plusAssign("review_id", this.LJLJJL);
        logView.plusAssign("is_self", Integer.valueOf(this.LJLJJLL ? 1 : 0));
        logView.plusAssign("product_id", this.LJLJI.LIZIZ);
        logView.plusAssign("biz_type", String.valueOf(this.LJLJI.LIZJ));
        if (C70691Rol.LJIJJLI == 2) {
            C70666RoM.LIZLLL(logView, this.LJLJL);
        }
        return C76800UCe.LIZ;
    }
}
