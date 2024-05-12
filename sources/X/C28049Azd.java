package X;

import Y.ARunnableS40S0100000_4;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Azd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28049Azd<T> implements InterfaceC64592gB {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ OrderSubmitViewModel LJLILLLLZI;
    public final /* synthetic */ OrderSubmitState LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public C28049Azd(Context context, OrderSubmitViewModel orderSubmitViewModel, OrderSubmitState orderSubmitState, long j, String str) {
        this.LJLIL = context;
        this.LJLILLLLZI = orderSubmitViewModel;
        this.LJLJI = orderSubmitState;
        this.LJLJJI = j;
        this.LJLJJL = str;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String builder;
        List<ShopOrderNew> newShopOrders;
        Response response = (Response) ((C64797Pbt) obj).LIZIZ;
        PayResponseData payResponseData = (PayResponseData) response.data;
        if (this.LJLIL != null) {
            if (!response.isCodeOK() || payResponseData == null) {
                this.LJLILLLLZI.setState(C27792AvU.LJLIL);
                String str = null;
                if (response.isAlreadyPaid()) {
                    PaymentResultProcess paymentResultProcess = PaymentResultProcess.INSTANCE;
                    C28031AzL c28031AzL = this.LJLILLLLZI.LLJZIJLIL;
                    String str2 = c28031AzL.LIZIZ;
                    List<String> list = c28031AzL.LIZ;
                    if (list != null) {
                        str = (String) ORZ.LJLLLL(list);
                    }
                    String orderDetailPageUrl$default = PaymentResultProcess.getOrderDetailPageUrl$default(paymentResultProcess, str2, str, this.LJLJI.getUserPaymentInfo(), false, 8, null);
                    IBulletService LIZ = BulletService.LIZ();
                    Context context = this.LJLIL;
                    if (C19N.LJ("ecom_order_detail_roma_short_link", false)) {
                        E94 LLL = C63081OpJ.LLL(orderDetailPageUrl$default);
                        LLL.LJII(3, C113554cx.LJJLIIIIJ(new OSZ("pay_route", "h5")));
                        builder = LLL.LIZ();
                    } else {
                        builder = C26867AgZ.LIZLLL(orderDetailPageUrl$default, C03660Ck.LIZJ("pay_route", "h5")).toString();
                        o.LJIIIIZZ(builder, "{\n                      …                        }");
                    }
                    LIZ.LJIIIIZZ(context, builder);
                    this.LJLILLLLZI.setState(C27794AvW.LJLIL);
                    return;
                }
                if (payResponseData != null && payResponseData.exceptionUX != null) {
                    EnumC28063Azr enumC28063Azr = EnumC28063Azr.FROM_DOUBLE_PAYMENT;
                    ExceptionUX exceptionUX = payResponseData.exceptionUX;
                    String valueOf = String.valueOf(response.code);
                    Context context2 = this.LJLIL;
                    C28144B2u.LIZ(enumC28063Azr, context2, valueOf, exceptionUX, true, C28073B0b.LJLIL, C28074B0c.LJLIL, C28075B0d.LJLIL, C28076B0e.LJLIL, new AqS135S0200000_4(this.LJLILLLLZI, context2, 227), null, null, null, null, new AqS93S0300000_4(payResponseData, this.LJLILLLLZI, this.LJLIL, 185), null, 15360);
                    return;
                }
                C5S1 c5s1 = new C5S1(EF7.LIZIZ());
                c5s1.LIZLLL(response.message);
                c5s1.LJ();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.LJLJJI;
            C28057Azl c28057Azl = new C28057Azl(this.LJLIL);
            c28057Azl.LJFF = payResponseData.cashier;
            OrderSubmitViewModel orderSubmitViewModel = this.LJLILLLLZI;
            c28057Azl.LJI = orderSubmitViewModel.LLJJL;
            c28057Azl.LIZLLL = payResponseData.newPayInfo;
            C28031AzL c28031AzL2 = orderSubmitViewModel.LLJZIJLIL;
            c28057Azl.LIZIZ = c28031AzL2.LIZ;
            c28057Azl.LIZJ = c28031AzL2.LIZIZ;
            c28057Azl.LJIIIZ = "ordersubmit";
            String str3 = this.LJLJJL;
            long j = this.LJLJJI;
            OrderSubmitState orderSubmitState = this.LJLJI;
            c28057Azl.LJ = new C27961AyD(orderSubmitViewModel, str3, j, currentTimeMillis, orderSubmitState, this.LJLIL);
            c28057Azl.LJII = orderSubmitState.getUserPaymentInfo();
            c28057Azl.LJIIL = Boolean.valueOf(this.LJLILLLLZI.tw0());
            Uri.Builder buildUpon = UriProtector.parse(payResponseData.schema).buildUpon();
            buildUpon.appendQueryParameter("source", "ordersubmit");
            buildUpon.appendQueryParameter("trackParams", C27739Aud.LJI(this.LJLILLLLZI.LLILII));
            HashMap hashMap = new HashMap();
            OrderSubmitViewModel orderSubmitViewModel2 = this.LJLILLLLZI;
            hashMap.putAll(orderSubmitViewModel2.LLILII);
            BillInfoData billInfoData = orderSubmitViewModel2.LJZ;
            if (billInfoData != null && (newShopOrders = billInfoData.getNewShopOrders()) != null) {
                for (ShopOrderNew shopOrderNew : newShopOrders) {
                    ArrayList arrayList = new ArrayList();
                    List<MainOrderInfo> list2 = shopOrderNew.mainOrderInfos;
                    if (list2 != null) {
                        Iterator<MainOrderInfo> it = list2.iterator();
                        while (it.hasNext()) {
                            List<PackedSku> list3 = it.next().packedSkus;
                            if (list3 != null) {
                                Iterator<PackedSku> it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    String sourceInfo = it2.next().getSourceInfo();
                                    if (sourceInfo != null) {
                                        arrayList.add(sourceInfo);
                                    }
                                }
                            }
                        }
                    }
                    hashMap.put("source_info", arrayList);
                }
            }
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.putAll(hashMap);
            c28057Azl.LJIIIIZZ = hashMap2;
            c28057Azl.LJIIJ = buildUpon.toString();
            ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS40S0100000_4(c28057Azl, 137));
            return;
        }
        OrderSubmitViewModel orderSubmitViewModel3 = this.LJLILLLLZI;
        orderSubmitViewModel3.getClass();
        orderSubmitViewModel3.withState(new AqS170S0100000_4(orderSubmitViewModel3, 1244));
    }
}
