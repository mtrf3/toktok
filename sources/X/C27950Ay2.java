package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResult;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResultTrackData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import defpackage.g0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Ay2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27950Ay2 implements SAG {
    public final /* synthetic */ OrderSubmitViewModel LIZ;
    public final /* synthetic */ OrderSubmitState LIZIZ;
    public final /* synthetic */ C28025AzF LIZJ;
    public final /* synthetic */ long LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ long LJI;
    public final /* synthetic */ Context LJII;

    @Override // X.SAG
    public final void LIZIZ() {
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
    public final void LJFF() {
        String str;
        PaymentMethod paymentMethod;
        InstallmentInfo installmentInfo;
        List<InstallmentPlan> list;
        PaymentMethod paymentMethod2;
        PaymentInfo paymentInfo = this.LIZ.LL;
        if (paymentInfo != null && (paymentMethod2 = paymentInfo.paymentMethod) != null) {
            str = paymentMethod2.LJIIL();
        } else {
            str = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PaymentInfo paymentInfo2 = this.LIZ.LL;
        if (paymentInfo2 != null && (paymentMethod = paymentInfo2.paymentMethod) != null && (installmentInfo = paymentMethod.installmentInfo) != null && (list = installmentInfo.installmentPlans) != null) {
            linkedHashMap.put("installment_cnt", Integer.valueOf(list.size()));
        }
        C27949Ay1.LJJIIJ("payment_code", null, str, linkedHashMap, null, false, 50);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.SAG
    public final void LIZ(PayResult payResult, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z;
        MainOrderInfo mainOrderInfo;
        String str9;
        String str10;
        C70356RjM c70356RjM;
        String str11;
        RXX rxx;
        String str12;
        PlatformPromotion platformPromotion;
        String str13;
        String str14;
        String str15;
        Object obj;
        CommuteType commuteType;
        PaymentMethod paymentMethod;
        CommuteInfo LJIIJJI;
        HashMap LJ;
        PaymentMethod paymentMethod2;
        PaymentMethod paymentMethod3;
        PaymentMethod paymentMethod4;
        List<String> list;
        PaymentMethod paymentMethod5;
        Summary summary;
        List<String> list2;
        List<ShopOrderNew> newShopOrders;
        ShopOrderNew shopOrderNew;
        List<MainOrderInfo> list3;
        PaymentMethodInfo paymentMethodInfo;
        Summary summary2;
        Price total;
        PaymentMethod paymentMethod6;
        BindInfo bindInfo;
        PaymentMethod paymentMethod7;
        PaymentMethod paymentMethod8;
        o.LJIIIZ(payResult, "payResult");
        OrderSubmitViewModel orderSubmitViewModel = this.LIZ;
        orderSubmitViewModel.getClass();
        orderSubmitViewModel.LLII = "next";
        this.LIZ.setState(C27974AyQ.LJLIL);
        this.LIZ.Bw0();
        OrderSubmitViewModel orderSubmitViewModel2 = this.LIZ;
        PaymentInfo userPaymentInfo = this.LIZIZ.getUserPaymentInfo();
        if (userPaymentInfo != null && (paymentMethod8 = userPaymentInfo.paymentMethod) != null) {
            str3 = paymentMethod8.id;
        } else {
            str3 = null;
        }
        boolean Nv0 = orderSubmitViewModel2.Nv0(str3);
        PaymentInfo userPaymentInfo2 = this.LIZIZ.getUserPaymentInfo();
        String str16 = "";
        if (userPaymentInfo2 == null || (paymentMethod7 = userPaymentInfo2.paymentMethod) == null) {
            str4 = "";
        } else {
            str4 = paymentMethod7.LJIIL();
        }
        String LIZ = SAE.LIZ(payResult);
        PaymentInfo userPaymentInfo3 = this.LIZIZ.getUserPaymentInfo();
        if (userPaymentInfo3 != null && (paymentMethod6 = userPaymentInfo3.paymentMethod) != null && (bindInfo = paymentMethod6.bindInfo) != null) {
            str5 = bindInfo.bindStatus;
        } else {
            str5 = null;
        }
        BillInfoData billInfoData = this.LIZ.LJZ;
        if (billInfoData != null && (summary2 = billInfoData.getSummary()) != null && (total = summary2.getTotal()) != null) {
            str6 = total.getPriceStr();
        } else {
            str6 = null;
        }
        CreateOrderData createOrderData = (CreateOrderData) this.LIZJ.data;
        if (createOrderData != null) {
            str7 = createOrderData.comboId;
        } else {
            str7 = null;
        }
        PaymentInfo userPaymentInfo4 = this.LIZIZ.getUserPaymentInfo();
        if (userPaymentInfo4 != null && (paymentMethodInfo = userPaymentInfo4.paymentMethodInfo) != null) {
            str8 = paymentMethodInfo.getTenure();
        } else {
            str8 = null;
        }
        C27941Axt c27941Axt = this.LIZ.LJLL;
        if (c27941Axt != null) {
            z = c27941Axt.LIZ();
        } else {
            z = false;
        }
        BillInfoData billInfoData2 = this.LIZ.LJZ;
        if (billInfoData2 != null && (newShopOrders = billInfoData2.getNewShopOrders()) != null && (shopOrderNew = (ShopOrderNew) ORZ.LJLLLL(newShopOrders)) != null && (list3 = shopOrderNew.mainOrderInfos) != null) {
            mainOrderInfo = (MainOrderInfo) ORZ.LJLLLL(list3);
        } else {
            mainOrderInfo = null;
        }
        OSZ LJFF = C27949Ay1.LJFF(this.LIZIZ.getUserPaymentInfo(), this.LIZ.Yv0());
        OrderSubmitViewModel orderSubmitViewModel3 = this.LIZ;
        boolean z2 = orderSubmitViewModel3.LLIIL;
        boolean z3 = orderSubmitViewModel3.LLIILII;
        CreateOrderData createOrderData2 = (CreateOrderData) this.LIZJ.data;
        if (createOrderData2 == null || (list2 = createOrderData2.orderIds) == null) {
            str9 = "";
        } else {
            str9 = ORZ.LLD(list2, ",", null, null, null, 62);
        }
        HashMap<String, Object> fw0 = this.LIZ.fw0(false);
        String str17 = this.LJ;
        if (z) {
            fw0.put("add_on_track_id", str17);
            fw0.put("add_on_source_page_type", "add_on_order_submit_rec");
            fw0.put("add_on_entrance_form", "append_goods_card");
        }
        long j = this.LIZLLL;
        String aw0 = this.LIZ.aw0();
        Boolean valueOf = Boolean.valueOf(Nv0);
        if (z) {
            str10 = this.LJ;
        } else {
            str10 = null;
        }
        HashMap<String, Object> Xv0 = this.LIZ.Xv0();
        String bw0 = this.LIZ.bw0();
        Boolean bool = (Boolean) LJFF.getFirst();
        Boolean bool2 = (Boolean) LJFF.getSecond();
        BillInfoData billInfoData3 = this.LIZ.LJZ;
        if (billInfoData3 != null && (summary = billInfoData3.getSummary()) != null) {
            c70356RjM = g0.LJJJJIZL(summary);
        } else {
            c70356RjM = null;
        }
        if (mainOrderInfo != null) {
            str11 = g0.LJJIFFI(mainOrderInfo, this.LIZ.LJLJJLL, mainOrderInfo.selectedLogisticsServiceId);
        } else {
            str11 = null;
        }
        String iw0 = this.LIZ.iw0();
        OrderSubmitViewModel orderSubmitViewModel4 = this.LIZ;
        HashMap<String, String> hashMap = orderSubmitViewModel4.LLJLLIL;
        if (mainOrderInfo != null) {
            rxx = g0.LJJII(mainOrderInfo, orderSubmitViewModel4.LJLJJLL);
        } else {
            rxx = null;
        }
        PaymentInfo userPaymentInfo5 = this.LIZIZ.getUserPaymentInfo();
        if (userPaymentInfo5 != null && (paymentMethod5 = userPaymentInfo5.paymentMethod) != null) {
            str12 = paymentMethod5.LJFF();
        } else {
            str12 = null;
        }
        boolean LJ2 = o.LJ(str12, this.LIZ.LLJL);
        BillInfoData billInfoData4 = this.LIZ.LJZ;
        if (billInfoData4 != null) {
            platformPromotion = billInfoData4.getPlatformPromotion();
        } else {
            platformPromotion = null;
        }
        C27949Ay1.LJJII(z2, z3, str9, true, "", fw0, str4, j, aw0, LIZ, str, str2, str6, valueOf, str5, str7, str8, str10, Xv0, bw0, bool, bool2, c70356RjM, str11, iw0, hashMap, rxx, LJ2, C27949Ay1.LJ(platformPromotion));
        CreateOrderData createOrderData3 = (CreateOrderData) this.LIZJ.data;
        if (createOrderData3 == null || (list = createOrderData3.orderIds) == null) {
            str13 = "";
        } else {
            str13 = ORZ.LLD(list, ",", null, null, null, 62);
        }
        long j2 = this.LIZLLL;
        PaymentInfo userPaymentInfo6 = this.LIZIZ.getUserPaymentInfo();
        if (userPaymentInfo6 != null && (paymentMethod4 = userPaymentInfo6.paymentMethod) != null) {
            str14 = paymentMethod4.id;
        } else {
            str14 = null;
        }
        C27949Ay1.LJJIJLIJ(str13, true, "", str4, j2, str, LIZ, str2, str14, this.LJ);
        String str18 = this.LJFF;
        Long valueOf2 = Long.valueOf(this.LJI);
        Long valueOf3 = Long.valueOf(this.LIZLLL);
        PaymentInfo userPaymentInfo7 = this.LIZIZ.getUserPaymentInfo();
        if (userPaymentInfo7 != null && (paymentMethod3 = userPaymentInfo7.paymentMethod) != null) {
            str15 = paymentMethod3.id;
        } else {
            str15 = null;
        }
        PaymentInfo userPaymentInfo8 = this.LIZIZ.getUserPaymentInfo();
        if (userPaymentInfo8 != null && (paymentMethod2 = userPaymentInfo8.paymentMethod) != null) {
            str16 = paymentMethod2.LJIIL();
        }
        HashMap<String, Object> hashMap2 = this.LIZ.LLIL;
        if (hashMap2 != null && (LJ = C27739Aud.LJ("entrance_info", hashMap2)) != null) {
            obj = LJ.get("source_page_type");
        } else {
            obj = null;
        }
        String valueOf4 = String.valueOf(obj);
        PaymentInfo userPaymentInfo9 = this.LIZIZ.getUserPaymentInfo();
        if (userPaymentInfo9 != null && (paymentMethod = userPaymentInfo9.paymentMethod) != null && (LJIIJJI = paymentMethod.LJIIJJI()) != null) {
            commuteType = LJIIJJI.commuteType;
        } else {
            commuteType = null;
        }
        C72264SXs.LIZ(this.LJII).LJIIIIZZ(C27739Aud.LJI(new PayResultTrackData(str18, valueOf2, valueOf3, null, str15, str16, 1, valueOf4, commuteType)), this.LJFF);
    }

    public C27950Ay2(OrderSubmitViewModel orderSubmitViewModel, OrderSubmitState orderSubmitState, C28025AzF c28025AzF, long j, String str, String str2, long j2, Context context) {
        this.LIZ = orderSubmitViewModel;
        this.LIZIZ = orderSubmitState;
        this.LIZJ = c28025AzF;
        this.LIZLLL = j;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = j2;
        this.LJII = context;
    }
}
