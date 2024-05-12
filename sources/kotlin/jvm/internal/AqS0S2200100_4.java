package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27739Aud;
import X.C27941Axt;
import X.C27949Ay1;
import X.C28025AzF;
import X.C70356RjM;
import X.C70414RkI;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.OSZ;
import X.RXX;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
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
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import defpackage.g0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class AqS0S2200100_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j4;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S2200100_4 aqS0S2200100_4, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        MainOrderInfo mainOrderInfo;
        String str6;
        String str7;
        C70356RjM c70356RjM;
        String str8;
        RXX rxx;
        String str9;
        PlatformPromotion platformPromotion;
        String str10;
        String str11;
        String str12;
        String str13;
        Object obj2;
        CommuteType commuteType;
        String message;
        PaymentMethod paymentMethod;
        CommuteInfo LJIIJJI;
        HashMap LJ;
        PaymentMethod paymentMethod2;
        PaymentMethod paymentMethod3;
        PaymentMethod paymentMethod4;
        PaymentMethod paymentMethod5;
        Summary summary;
        List<ShopOrderNew> newShopOrders;
        ShopOrderNew shopOrderNew;
        List<MainOrderInfo> list;
        PaymentMethodInfo paymentMethodInfo;
        Summary summary2;
        Price total;
        PaymentMethod paymentMethod6;
        BindInfo bindInfo;
        PaymentMethod paymentMethod7;
        PaymentMethod paymentMethod8;
        OrderSubmitState it = (OrderSubmitState) obj;
        o.LJIIIZ(it, "it");
        PaymentInfo userPaymentInfo = it.getUserPaymentInfo();
        String str14 = "";
        if (userPaymentInfo == null || (paymentMethod8 = userPaymentInfo.paymentMethod) == null) {
            str = "";
        } else {
            str = paymentMethod8.LJIIL();
        }
        OrderSubmitViewModel orderSubmitViewModel = (OrderSubmitViewModel) aqS0S2200100_4.l2;
        PaymentInfo userPaymentInfo2 = it.getUserPaymentInfo();
        if (userPaymentInfo2 != null && (paymentMethod7 = userPaymentInfo2.paymentMethod) != null) {
            str2 = paymentMethod7.id;
        } else {
            str2 = null;
        }
        boolean Nv0 = orderSubmitViewModel.Nv0(str2);
        PaymentInfo userPaymentInfo3 = it.getUserPaymentInfo();
        if (userPaymentInfo3 != null && (paymentMethod6 = userPaymentInfo3.paymentMethod) != null && (bindInfo = paymentMethod6.bindInfo) != null) {
            str3 = bindInfo.bindStatus;
        } else {
            str3 = null;
        }
        BillInfoData billInfoData = ((OrderSubmitViewModel) aqS0S2200100_4.l2).LJZ;
        if (billInfoData != null && (summary2 = billInfoData.getSummary()) != null && (total = summary2.getTotal()) != null) {
            str4 = total.getPriceStr();
        } else {
            str4 = null;
        }
        PaymentInfo userPaymentInfo4 = it.getUserPaymentInfo();
        if (userPaymentInfo4 != null && (paymentMethodInfo = userPaymentInfo4.paymentMethodInfo) != null) {
            str5 = paymentMethodInfo.getTenure();
        } else {
            str5 = null;
        }
        C27941Axt c27941Axt = ((OrderSubmitViewModel) aqS0S2200100_4.l2).LJLL;
        if (c27941Axt != null) {
            z = c27941Axt.LIZ();
        } else {
            z = false;
        }
        BillInfoData billInfoData2 = ((OrderSubmitViewModel) aqS0S2200100_4.l2).LJZ;
        if (billInfoData2 != null && (newShopOrders = billInfoData2.getNewShopOrders()) != null && (shopOrderNew = (ShopOrderNew) ORZ.LJLLLL(newShopOrders)) != null && (list = shopOrderNew.mainOrderInfos) != null) {
            mainOrderInfo = (MainOrderInfo) ORZ.LJLLLL(list);
        } else {
            mainOrderInfo = null;
        }
        OSZ LJFF = C27949Ay1.LJFF(it.getUserPaymentInfo(), ((OrderSubmitViewModel) aqS0S2200100_4.l2).Yv0());
        OrderSubmitViewModel orderSubmitViewModel2 = (OrderSubmitViewModel) aqS0S2200100_4.l2;
        boolean z2 = orderSubmitViewModel2.LLIIL;
        boolean z3 = orderSubmitViewModel2.LLIILII;
        Throwable th = (Throwable) aqS0S2200100_4.l3;
        if (th == null || (str6 = th.getMessage()) == null) {
            str6 = "";
        }
        String LJJJJJ = C27949Ay1.LJJJJJ(str6);
        HashMap<String, Object> fw0 = ((OrderSubmitViewModel) aqS0S2200100_4.l2).fw0(false);
        String str15 = aqS0S2200100_4.s0;
        if (z) {
            fw0.put("add_on_track_id", str15);
            fw0.put("add_on_source_page_type", "add_on_order_submit_rec");
            fw0.put("add_on_entrance_form", "append_goods_card");
        }
        long j = aqS0S2200100_4.j4;
        String aw0 = ((OrderSubmitViewModel) aqS0S2200100_4.l2).aw0();
        Boolean valueOf = Boolean.valueOf(Nv0);
        if (z) {
            str7 = aqS0S2200100_4.s0;
        } else {
            str7 = null;
        }
        HashMap<String, Object> Xv0 = ((OrderSubmitViewModel) aqS0S2200100_4.l2).Xv0();
        String bw0 = ((OrderSubmitViewModel) aqS0S2200100_4.l2).bw0();
        Boolean bool = (Boolean) LJFF.getFirst();
        Boolean bool2 = (Boolean) LJFF.getSecond();
        BillInfoData billInfoData3 = ((OrderSubmitViewModel) aqS0S2200100_4.l2).LJZ;
        if (billInfoData3 != null && (summary = billInfoData3.getSummary()) != null) {
            c70356RjM = g0.LJJJJIZL(summary);
        } else {
            c70356RjM = null;
        }
        if (mainOrderInfo != null) {
            str8 = g0.LJJIFFI(mainOrderInfo, ((OrderSubmitViewModel) aqS0S2200100_4.l2).LJLJJLL, mainOrderInfo.selectedLogisticsServiceId);
        } else {
            str8 = null;
        }
        String iw0 = ((OrderSubmitViewModel) aqS0S2200100_4.l2).iw0();
        OrderSubmitViewModel orderSubmitViewModel3 = (OrderSubmitViewModel) aqS0S2200100_4.l2;
        HashMap<String, String> hashMap = orderSubmitViewModel3.LLJLLIL;
        if (mainOrderInfo != null) {
            rxx = g0.LJJII(mainOrderInfo, orderSubmitViewModel3.LJLJJLL);
        } else {
            rxx = null;
        }
        PaymentInfo userPaymentInfo5 = it.getUserPaymentInfo();
        if (userPaymentInfo5 != null && (paymentMethod5 = userPaymentInfo5.paymentMethod) != null) {
            str9 = paymentMethod5.LJFF();
        } else {
            str9 = null;
        }
        boolean LJ2 = o.LJ(str9, ((OrderSubmitViewModel) aqS0S2200100_4.l2).LLJL);
        BillInfoData billInfoData4 = ((OrderSubmitViewModel) aqS0S2200100_4.l2).LJZ;
        if (billInfoData4 != null) {
            platformPromotion = billInfoData4.getPlatformPromotion();
        } else {
            platformPromotion = null;
        }
        C27949Ay1.LJJII(z2, z3, "", false, LJJJJJ, fw0, str, j, aw0, null, null, null, str4, valueOf, str3, null, str5, str7, Xv0, bw0, bool, bool2, c70356RjM, str8, iw0, hashMap, rxx, LJ2, C27949Ay1.LJ(platformPromotion));
        Throwable th2 = (Throwable) aqS0S2200100_4.l3;
        if (th2 == null || (str10 = th2.getMessage()) == null) {
            str10 = "";
        }
        String LJJJJJ2 = C27949Ay1.LJJJJJ(str10);
        long j2 = aqS0S2200100_4.j4;
        PaymentInfo userPaymentInfo6 = it.getUserPaymentInfo();
        if (userPaymentInfo6 != null && (paymentMethod4 = userPaymentInfo6.paymentMethod) != null) {
            str11 = paymentMethod4.id;
        } else {
            str11 = null;
        }
        C27949Ay1.LJJIJLIJ("", false, LJJJJJ2, str, j2, null, null, null, str11, aqS0S2200100_4.s0);
        String str16 = aqS0S2200100_4.s1;
        Long valueOf2 = Long.valueOf(aqS0S2200100_4.j4);
        PaymentInfo userPaymentInfo7 = it.getUserPaymentInfo();
        if (userPaymentInfo7 != null && (paymentMethod3 = userPaymentInfo7.paymentMethod) != null) {
            str12 = paymentMethod3.id;
        } else {
            str12 = null;
        }
        PaymentInfo userPaymentInfo8 = it.getUserPaymentInfo();
        if (userPaymentInfo8 == null || (paymentMethod2 = userPaymentInfo8.paymentMethod) == null) {
            str13 = "";
        } else {
            str13 = paymentMethod2.LJIIL();
        }
        Boolean bool3 = Boolean.TRUE;
        HashMap<String, Object> hashMap2 = ((OrderSubmitViewModel) aqS0S2200100_4.l2).LLIL;
        if (hashMap2 != null && (LJ = C27739Aud.LJ("entrance_info", hashMap2)) != null) {
            obj2 = LJ.get("source_page_type");
        } else {
            obj2 = null;
        }
        String valueOf3 = String.valueOf(obj2);
        PaymentInfo userPaymentInfo9 = it.getUserPaymentInfo();
        if (userPaymentInfo9 != null && (paymentMethod = userPaymentInfo9.paymentMethod) != null && (LJIIJJI = paymentMethod.LJIIJJI()) != null) {
            commuteType = LJIIJJI.commuteType;
        } else {
            commuteType = null;
        }
        Throwable th3 = (Throwable) aqS0S2200100_4.l3;
        if (th3 != null && (message = th3.getMessage()) != null) {
            str14 = message;
        }
        C27949Ay1.LJJIL(str16, valueOf2, str12, str13, bool3, valueOf3, commuteType, str14, null);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AqS0S2200100_4 aqS0S2200100_4, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        MainOrderInfo mainOrderInfo;
        String str6;
        String str7;
        C70356RjM c70356RjM;
        String str8;
        RXX rxx;
        String str9;
        PlatformPromotion platformPromotion;
        String str10;
        String str11;
        String str12;
        String str13;
        Object obj2;
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
        OrderSubmitState it = (OrderSubmitState) obj;
        o.LJIIIZ(it, "it");
        PaymentInfo userPaymentInfo = it.getUserPaymentInfo();
        String str14 = "";
        if (userPaymentInfo == null || (paymentMethod8 = userPaymentInfo.paymentMethod) == null) {
            str = "";
        } else {
            str = paymentMethod8.LJIIL();
        }
        OrderSubmitViewModel orderSubmitViewModel = (OrderSubmitViewModel) aqS0S2200100_4.l2;
        PaymentInfo userPaymentInfo2 = it.getUserPaymentInfo();
        CommuteType commuteType = null;
        if (userPaymentInfo2 != null && (paymentMethod7 = userPaymentInfo2.paymentMethod) != null) {
            str2 = paymentMethod7.id;
        } else {
            str2 = null;
        }
        boolean Nv0 = orderSubmitViewModel.Nv0(str2);
        PaymentInfo userPaymentInfo3 = it.getUserPaymentInfo();
        if (userPaymentInfo3 != null && (paymentMethod6 = userPaymentInfo3.paymentMethod) != null && (bindInfo = paymentMethod6.bindInfo) != null) {
            str3 = bindInfo.bindStatus;
        } else {
            str3 = null;
        }
        BillInfoData billInfoData = ((OrderSubmitViewModel) aqS0S2200100_4.l2).LJZ;
        if (billInfoData != null && (summary2 = billInfoData.getSummary()) != null && (total = summary2.getTotal()) != null) {
            str4 = total.getPriceStr();
        } else {
            str4 = null;
        }
        PaymentInfo userPaymentInfo4 = it.getUserPaymentInfo();
        if (userPaymentInfo4 != null && (paymentMethodInfo = userPaymentInfo4.paymentMethodInfo) != null) {
            str5 = paymentMethodInfo.getTenure();
        } else {
            str5 = null;
        }
        C27941Axt c27941Axt = ((OrderSubmitViewModel) aqS0S2200100_4.l2).LJLL;
        if (c27941Axt != null) {
            z = c27941Axt.LIZ();
        } else {
            z = false;
        }
        BillInfoData billInfoData2 = ((OrderSubmitViewModel) aqS0S2200100_4.l2).LJZ;
        if (billInfoData2 != null && (newShopOrders = billInfoData2.getNewShopOrders()) != null && (shopOrderNew = (ShopOrderNew) ORZ.LJLLLL(newShopOrders)) != null && (list3 = shopOrderNew.mainOrderInfos) != null) {
            mainOrderInfo = (MainOrderInfo) ORZ.LJLLLL(list3);
        } else {
            mainOrderInfo = null;
        }
        OSZ LJFF = C27949Ay1.LJFF(it.getUserPaymentInfo(), ((OrderSubmitViewModel) aqS0S2200100_4.l2).Yv0());
        OrderSubmitViewModel orderSubmitViewModel2 = (OrderSubmitViewModel) aqS0S2200100_4.l2;
        boolean z2 = orderSubmitViewModel2.LLIIL;
        boolean z3 = orderSubmitViewModel2.LLIILII;
        CreateOrderData createOrderData = (CreateOrderData) ((C28025AzF) aqS0S2200100_4.l3).data;
        if (createOrderData == null || (list2 = createOrderData.orderIds) == null) {
            str6 = "";
        } else {
            str6 = ORZ.LLD(list2, ",", null, null, null, 62);
        }
        String valueOf = String.valueOf(((C28025AzF) aqS0S2200100_4.l3).code);
        HashMap<String, Object> fw0 = ((OrderSubmitViewModel) aqS0S2200100_4.l2).fw0(false);
        String str15 = aqS0S2200100_4.s0;
        if (z) {
            fw0.put("add_on_track_id", str15);
            fw0.put("add_on_source_page_type", "add_on_order_submit_rec");
            fw0.put("add_on_entrance_form", "append_goods_card");
        }
        long j = aqS0S2200100_4.j4;
        String aw0 = ((OrderSubmitViewModel) aqS0S2200100_4.l2).aw0();
        Boolean valueOf2 = Boolean.valueOf(Nv0);
        if (z) {
            str7 = aqS0S2200100_4.s0;
        } else {
            str7 = null;
        }
        HashMap<String, Object> Xv0 = ((OrderSubmitViewModel) aqS0S2200100_4.l2).Xv0();
        String bw0 = ((OrderSubmitViewModel) aqS0S2200100_4.l2).bw0();
        Boolean bool = (Boolean) LJFF.getFirst();
        Boolean bool2 = (Boolean) LJFF.getSecond();
        BillInfoData billInfoData3 = ((OrderSubmitViewModel) aqS0S2200100_4.l2).LJZ;
        if (billInfoData3 != null && (summary = billInfoData3.getSummary()) != null) {
            c70356RjM = g0.LJJJJIZL(summary);
        } else {
            c70356RjM = null;
        }
        if (mainOrderInfo != null) {
            str8 = g0.LJJIFFI(mainOrderInfo, ((OrderSubmitViewModel) aqS0S2200100_4.l2).LJLJJLL, mainOrderInfo.selectedLogisticsServiceId);
        } else {
            str8 = null;
        }
        String iw0 = ((OrderSubmitViewModel) aqS0S2200100_4.l2).iw0();
        OrderSubmitViewModel orderSubmitViewModel3 = (OrderSubmitViewModel) aqS0S2200100_4.l2;
        HashMap<String, String> hashMap = orderSubmitViewModel3.LLJLLIL;
        if (mainOrderInfo != null) {
            rxx = g0.LJJII(mainOrderInfo, orderSubmitViewModel3.LJLJJLL);
        } else {
            rxx = null;
        }
        PaymentInfo userPaymentInfo5 = it.getUserPaymentInfo();
        if (userPaymentInfo5 != null && (paymentMethod5 = userPaymentInfo5.paymentMethod) != null) {
            str9 = paymentMethod5.LJFF();
        } else {
            str9 = null;
        }
        boolean LJ2 = o.LJ(str9, ((OrderSubmitViewModel) aqS0S2200100_4.l2).LLJL);
        BillInfoData billInfoData4 = ((OrderSubmitViewModel) aqS0S2200100_4.l2).LJZ;
        if (billInfoData4 != null) {
            platformPromotion = billInfoData4.getPlatformPromotion();
        } else {
            platformPromotion = null;
        }
        C27949Ay1.LJJII(z2, z3, str6, false, valueOf, fw0, str, j, aw0, null, null, null, str4, valueOf2, str3, null, str5, str7, Xv0, bw0, bool, bool2, c70356RjM, str8, iw0, hashMap, rxx, LJ2, C27949Ay1.LJ(platformPromotion));
        CreateOrderData createOrderData2 = (CreateOrderData) ((C28025AzF) aqS0S2200100_4.l3).data;
        if (createOrderData2 == null || (list = createOrderData2.orderIds) == null) {
            str10 = "";
        } else {
            str10 = ORZ.LLD(list, ",", null, null, null, 62);
        }
        String valueOf3 = String.valueOf(((C28025AzF) aqS0S2200100_4.l3).code);
        long j2 = aqS0S2200100_4.j4;
        PaymentInfo userPaymentInfo6 = it.getUserPaymentInfo();
        if (userPaymentInfo6 != null && (paymentMethod4 = userPaymentInfo6.paymentMethod) != null) {
            str11 = paymentMethod4.id;
        } else {
            str11 = null;
        }
        C27949Ay1.LJJIJLIJ(str10, false, valueOf3, str, j2, null, null, null, str11, aqS0S2200100_4.s0);
        String str16 = aqS0S2200100_4.s1;
        Long valueOf4 = Long.valueOf(aqS0S2200100_4.j4);
        PaymentInfo userPaymentInfo7 = it.getUserPaymentInfo();
        if (userPaymentInfo7 != null && (paymentMethod3 = userPaymentInfo7.paymentMethod) != null) {
            str12 = paymentMethod3.id;
        } else {
            str12 = null;
        }
        PaymentInfo userPaymentInfo8 = it.getUserPaymentInfo();
        if (userPaymentInfo8 == null || (paymentMethod2 = userPaymentInfo8.paymentMethod) == null) {
            str13 = "";
        } else {
            str13 = paymentMethod2.LJIIL();
        }
        Boolean bool3 = Boolean.TRUE;
        HashMap<String, Object> hashMap2 = ((OrderSubmitViewModel) aqS0S2200100_4.l2).LLIL;
        if (hashMap2 != null && (LJ = C27739Aud.LJ("entrance_info", hashMap2)) != null) {
            obj2 = LJ.get("source_page_type");
        } else {
            obj2 = null;
        }
        String valueOf5 = String.valueOf(obj2);
        PaymentInfo userPaymentInfo9 = it.getUserPaymentInfo();
        if (userPaymentInfo9 != null && (paymentMethod = userPaymentInfo9.paymentMethod) != null && (LJIIJJI = paymentMethod.LJIIJJI()) != null) {
            commuteType = LJIIJJI.commuteType;
        }
        C28025AzF c28025AzF = (C28025AzF) aqS0S2200100_4.l3;
        String str17 = c28025AzF.message;
        if (str17 != null) {
            str14 = str17;
        }
        C27949Ay1.LJJIL(str16, valueOf4, str12, str13, bool3, valueOf5, commuteType, str14, String.valueOf(c28025AzF.code));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS0S2200100_4 aqS0S2200100_4, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS0S2200100_4.l2).LIZIZ);
        Map<String, ? extends Object> map = (Map) aqS0S2200100_4.l3;
        if (map != null) {
            logNode.compareTo(logNode, map);
        }
        logNode.plusAssign("page_name", aqS0S2200100_4.s0);
        logNode.plusAssign("stay_time", Long.valueOf(aqS0S2200100_4.j4));
        logNode.plusAssign("quit_type", aqS0S2200100_4.s1);
        ((C70414RkI) aqS0S2200100_4.l2).LJJLIIIJLJLI(logNode);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x000b: IPUT (r8 I:java.lang.String), (r1 I:kotlin.jvm.internal.AqS0S2200100_4) (LINE:100663307) kotlin.jvm.internal.AqS0S2200100_4.s1 java.lang.String, block:B:1:0x0000 */
    public AqS0S2200100_4(C70414RkI c70414RkI, C70414RkI c70414RkI2, Map<String, ? extends Object> map, String str, long j, String str2) {
        super(1);
        String str3;
        this.$t = str2;
        this.l2 = c70414RkI;
        this.l3 = c70414RkI2;
        this.s0 = map;
        this.j4 = str;
        this.s1 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S2200100_4(OrderSubmitViewModel orderSubmitViewModel, C28025AzF c28025AzF, long j, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = orderSubmitViewModel;
        this.l3 = c28025AzF;
        this.j4 = j;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S2200100_4(OrderSubmitViewModel orderSubmitViewModel, Throwable th, long j, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = orderSubmitViewModel;
        this.l3 = th;
        this.j4 = j;
        this.s0 = str;
        this.s1 = str2;
    }
}
