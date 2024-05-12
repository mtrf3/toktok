package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResult;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResultTrackData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.AyD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27961AyD implements SAG {
    public final /* synthetic */ OrderSubmitViewModel LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ long LIZLLL;
    public final /* synthetic */ OrderSubmitState LJ;
    public final /* synthetic */ Context LJFF;

    @Override // X.SAG
    public final void LIZIZ() {
    }

    @Override // X.SAG
    public final void LJFF() {
    }

    @Override // X.SAG
    public final void LIZJ() {
        OrderSubmitViewModel orderSubmitViewModel = this.LIZ;
        if (orderSubmitViewModel.tw0()) {
            orderSubmitViewModel.setState(C27803Avf.LJLIL);
        }
    }

    @Override // X.SAG
    public final void LIZLLL() {
        this.LIZ.Bw0();
    }

    @Override // X.SAG
    public final void LJ() {
        OrderSubmitViewModel orderSubmitViewModel = this.LIZ;
        if (orderSubmitViewModel.tw0()) {
            EnumC26795AfP pageStatus = EnumC26795AfP.ORDER_HAVE_CREATED;
            o.LJIIIZ(pageStatus, "pageStatus");
            orderSubmitViewModel.setState(new AqS170S0100000_4(pageStatus, 1242));
        }
    }

    @Override // X.SAG
    public final void LIZ(PayResult payResult, String str, String str2) {
        String str3;
        String str4;
        Object obj;
        CommuteType commuteType;
        PaymentMethod paymentMethod;
        CommuteInfo LJIIJJI;
        HashMap LJ;
        PaymentMethod paymentMethod2;
        PaymentMethod paymentMethod3;
        o.LJIIIZ(payResult, "payResult");
        OrderSubmitViewModel orderSubmitViewModel = this.LIZ;
        orderSubmitViewModel.getClass();
        orderSubmitViewModel.LLII = "next";
        this.LIZ.setState(C27976AyS.LJLIL);
        String str5 = this.LIZIZ;
        Long valueOf = Long.valueOf(this.LIZJ);
        Long valueOf2 = Long.valueOf(this.LIZLLL);
        PaymentInfo userPaymentInfo = this.LJ.getUserPaymentInfo();
        if (userPaymentInfo != null && (paymentMethod3 = userPaymentInfo.paymentMethod) != null) {
            str3 = paymentMethod3.id;
        } else {
            str3 = null;
        }
        PaymentInfo userPaymentInfo2 = this.LJ.getUserPaymentInfo();
        if (userPaymentInfo2 != null && (paymentMethod2 = userPaymentInfo2.paymentMethod) != null) {
            str4 = paymentMethod2.LJIIL();
        } else {
            str4 = "";
        }
        HashMap<String, Object> hashMap = this.LIZ.LLIL;
        if (hashMap != null && (LJ = C27739Aud.LJ("entrance_info", hashMap)) != null) {
            obj = LJ.get("source_page_type");
        } else {
            obj = null;
        }
        String valueOf3 = String.valueOf(obj);
        PaymentInfo userPaymentInfo3 = this.LJ.getUserPaymentInfo();
        if (userPaymentInfo3 != null && (paymentMethod = userPaymentInfo3.paymentMethod) != null && (LJIIJJI = paymentMethod.LJIIJJI()) != null) {
            commuteType = LJIIJJI.commuteType;
        } else {
            commuteType = null;
        }
        C72264SXs.LIZ(this.LJFF).LJIIIIZZ(C27739Aud.LJI(new PayResultTrackData(str5, valueOf, valueOf2, null, str3, str4, 1, valueOf3, commuteType)), this.LIZIZ);
    }

    public C27961AyD(OrderSubmitViewModel orderSubmitViewModel, String str, long j, long j2, OrderSubmitState orderSubmitState, Context context) {
        this.LIZ = orderSubmitViewModel;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = orderSubmitState;
        this.LJFF = context;
    }
}
