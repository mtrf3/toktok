package X;

import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPBottomNotice;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ay8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27956Ay8 extends AbstractC65781Prl implements InterfaceC88472Yns<OrderSubmitState, OrderSubmitState> {
    public final /* synthetic */ BillInfoData LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ OrderSubmitViewModel LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ PaymentMethod LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ C68322mC<OSPBottomNotice> LJLJL;
    public final /* synthetic */ C27941Axt LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27956Ay8(BillInfoData billInfoData, String str, OrderSubmitViewModel orderSubmitViewModel, boolean z, PaymentMethod paymentMethod, boolean z2, C68322mC<OSPBottomNotice> c68322mC, C27941Axt c27941Axt, boolean z3) {
        super(1);
        this.LJLIL = billInfoData;
        this.LJLILLLLZI = str;
        this.LJLJI = orderSubmitViewModel;
        this.LJLJJI = z;
        this.LJLJJL = paymentMethod;
        this.LJLJJLL = z2;
        this.LJLJL = c68322mC;
        this.LJLJLJ = c27941Axt;
        this.LJLJLLL = z3;
    }

    @Override // X.InterfaceC88472Yns
    public final OrderSubmitState invoke(OrderSubmitState orderSubmitState) {
        Integer num;
        boolean z;
        boolean z2;
        OrderSubmitState setState = orderSubmitState;
        o.LJIIIZ(setState, "$this$setState");
        String total = this.LJLIL.getTotal(this.LJLILLLLZI);
        String totalDesc = this.LJLIL.getTotalDesc(this.LJLILLLLZI);
        int totalItems = this.LJLIL.getTotalItems();
        Summary summary = this.LJLIL.getSummary();
        OSPBottomNotice oSPBottomNotice = null;
        if (summary != null) {
            num = summary.getSkuTotalQuantity();
        } else {
            num = null;
        }
        OrderSubmitViewModel orderSubmitViewModel = this.LJLJI;
        boolean z3 = orderSubmitViewModel.LLIIZ;
        BillInfoData billInfoData = this.LJLIL;
        boolean z4 = this.LJLJJI;
        PaymentMethod paymentMethod = this.LJLJJL;
        if (paymentMethod == null) {
            PaymentMethodsData paymentMethods = billInfoData.getPaymentMethods();
            if (paymentMethods != null) {
                paymentMethod = paymentMethods.LIZLLL();
            } else {
                paymentMethod = null;
            }
        }
        CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList = this.LJLJI.LLFF;
        if (this.LJLJJL != null) {
            z = true;
        } else {
            z = false;
        }
        List<Object> Uv0 = orderSubmitViewModel.Uv0(billInfoData, z4, paymentMethod, copyOnWriteArrayList, z, this.LJLJJLL);
        C27042AjO LJJJ = u.LJJJ(this.LJLIL, this.LJLILLLLZI);
        if (this.LJLJI.LLLFZ > 0) {
            oSPBottomNotice = this.LJLJL.element;
        }
        String topNotice = this.LJLIL.getTopNotice();
        List<Announcement> announcement = this.LJLIL.getAnnouncement();
        String buttonPopTips = this.LJLIL.getButtonPopTips();
        boolean LJJIJIIJIL = ORY.LJJIJIIJIL("order_summary", this.LJLIL.getLayout());
        if (this.LJLIL.getToast() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        return OrderSubmitState.copy$default(setState, 0, Uv0, LJJJ, this.LJLJJI, null, null, z3, false, null, total, totalDesc, totalItems, num, 0, 0, null, null, false, false, false, null, false, null, 0, null, false, oSPBottomNotice, false, V2B.LJIJJ(this.LJLIL), topNotice, buttonPopTips, null, false, null, null, null, false, false, null, null, null, null, this.LJLJLJ, LJJIJIIJIL, announcement, null, Boolean.valueOf(z2), null, null, null, null, null, null, this.LJLJLLL, null, false, null, false, -1946164815, 64988159, null);
    }
}
