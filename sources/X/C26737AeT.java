package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectzipcode.USLogisticSelectByZipcodeVH;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.AeT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26737AeT extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ USLogisticSelectByZipcodeVH LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26737AeT(USLogisticSelectByZipcodeVH uSLogisticSelectByZipcodeVH, boolean z, boolean z2, boolean z3) {
        super(1);
        this.LJLIL = uSLogisticSelectByZipcodeVH;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        String str;
        HashMap<String, Object> LJII;
        LaneParams logView = laneParams;
        o.LJIIIZ(logView, "$this$logView");
        DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage = this.LJLIL.M().LJLJLJ;
        if (enterParamForProductDetailPage != null && (str = enterParamForProductDetailPage.trackParams) != null && (LJII = C27739Aud.LJII(str)) != null) {
            LJII.putAll(LJII);
        }
        logView.plusAssign("page_name", "logistics");
        logView.plusAssign("sub_page_name", "choose_your_location");
        logView.plusAssign("previous_page", "logistics");
        logView.plusAssign("input_box_name", "zipcode");
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLIL.getClass();
        logView.plusAssign("stay_time", Long.valueOf(currentTimeMillis - 0));
        logView.plusAssign("input_method", this.LJLIL.LJLJJLL);
        logView.plusAssign("has_normal_input", String.valueOf(this.LJLIL.LJLJLJ ? 1 : 0));
        logView.plusAssign("has_auto_input", String.valueOf(this.LJLILLLLZI ? 1 : 0));
        logView.plusAssign("has_sug_input", String.valueOf(this.LJLJI ? 1 : 0));
        logView.plusAssign("is_valid", String.valueOf(this.LJLJJI ? 1 : 0));
        return C76800UCe.LIZ;
    }
}
