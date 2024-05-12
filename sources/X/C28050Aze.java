package X;

import Y.ARunnableS40S0100000_4;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Aze, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28050Aze extends AbstractC65781Prl implements InterfaceC88472Yns<OrderSubmitState, C76800UCe> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ CreateOrderData LJLILLLLZI;
    public final /* synthetic */ OrderSubmitViewModel LJLJI;
    public final /* synthetic */ C28025AzF LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ long LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28050Aze(Context context, CreateOrderData createOrderData, OrderSubmitViewModel orderSubmitViewModel, C28025AzF c28025AzF, String str, long j, String str2, long j2) {
        super(1);
        this.LJLIL = context;
        this.LJLILLLLZI = createOrderData;
        this.LJLJI = orderSubmitViewModel;
        this.LJLJJI = c28025AzF;
        this.LJLJJL = str;
        this.LJLJJLL = j;
        this.LJLJL = str2;
        this.LJLJLJ = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(OrderSubmitState orderSubmitState) {
        m mVar;
        NewPayInfo newPayInfo;
        List<String> list;
        String str;
        String str2;
        String str3;
        List<String> list2;
        List<ShopOrderNew> newShopOrders;
        OrderSubmitState it = orderSubmitState;
        o.LJIIIZ(it, "it");
        if (this.LJLIL == null) {
            C78983UzD.LJIILL("create order context null");
        }
        CreateOrderData createOrderData = this.LJLILLLLZI;
        if (createOrderData != null && createOrderData.delayTime != null && createOrderData.delayTime.longValue() > 0) {
            long j = 4;
            if (this.LJLILLLLZI.delayTime.longValue() <= 4) {
                j = this.LJLILLLLZI.delayTime.longValue();
            }
            OrderSubmitViewModel orderSubmitViewModel = this.LJLJI;
            C78565UsT.LJJIJ(orderSubmitViewModel, C78613UtF.LIZJ, new C28051Azf(j * 1000, orderSubmitViewModel, this.LJLIL, this.LJLILLLLZI, null));
        } else {
            Context context = this.LJLIL;
            if (context != null) {
                C28057Azl c28057Azl = new C28057Azl(context);
                CreateOrderData createOrderData2 = this.LJLILLLLZI;
                if (createOrderData2 != null) {
                    mVar = createOrderData2.cashier;
                } else {
                    mVar = null;
                }
                c28057Azl.LJFF = mVar;
                OrderSubmitViewModel orderSubmitViewModel2 = this.LJLJI;
                c28057Azl.LJI = orderSubmitViewModel2.LLJJL;
                if (createOrderData2 != null) {
                    newPayInfo = createOrderData2.newPayInfo;
                } else {
                    newPayInfo = null;
                }
                c28057Azl.LIZLLL = newPayInfo;
                if (createOrderData2 != null) {
                    list = createOrderData2.orderIds;
                } else {
                    list = null;
                }
                c28057Azl.LIZIZ = list;
                if (createOrderData2 != null) {
                    str = createOrderData2.comboId;
                } else {
                    str = null;
                }
                c28057Azl.LIZJ = str;
                c28057Azl.LJIIIZ = "ordersubmit";
                c28057Azl.LJ = new C27950Ay2(orderSubmitViewModel2, it, this.LJLJJI, this.LJLJJLL, this.LJLJL, this.LJLJJL, this.LJLJLJ, this.LJLIL);
                c28057Azl.LJII = it.getUserPaymentInfo();
                c28057Azl.LJIIL = Boolean.valueOf(this.LJLJI.tw0());
                CreateOrderData createOrderData3 = (CreateOrderData) this.LJLJJI.data;
                if (createOrderData3 != null) {
                    str2 = createOrderData3.jumpSchema_url;
                } else {
                    str2 = null;
                }
                Uri.Builder buildUpon = UriProtector.parse(str2).buildUpon();
                C28031AzL c28031AzL = this.LJLJI.LLJZIJLIL;
                CreateOrderData createOrderData4 = (CreateOrderData) this.LJLJJI.data;
                if (createOrderData4 != null) {
                    str3 = createOrderData4.comboId;
                } else {
                    str3 = null;
                }
                c28031AzL.LIZIZ = str3;
                if (createOrderData4 != null) {
                    list2 = createOrderData4.orderIds;
                } else {
                    list2 = null;
                }
                c28031AzL.LIZ = list2;
                buildUpon.appendQueryParameter("source", "ordersubmit");
                buildUpon.appendQueryParameter("trackParams", C27739Aud.LJI(this.LJLJI.LLILII));
                HashMap hashMap = new HashMap();
                OrderSubmitViewModel orderSubmitViewModel3 = this.LJLJI;
                hashMap.putAll(orderSubmitViewModel3.LLILII);
                BillInfoData billInfoData = orderSubmitViewModel3.LJZ;
                if (billInfoData != null && (newShopOrders = billInfoData.getNewShopOrders()) != null) {
                    for (ShopOrderNew shopOrderNew : newShopOrders) {
                        ArrayList arrayList = new ArrayList();
                        List<MainOrderInfo> list3 = shopOrderNew.mainOrderInfos;
                        if (list3 != null) {
                            Iterator<MainOrderInfo> it2 = list3.iterator();
                            while (it2.hasNext()) {
                                List<PackedSku> list4 = it2.next().packedSkus;
                                if (list4 != null) {
                                    Iterator<PackedSku> it3 = list4.iterator();
                                    while (it3.hasNext()) {
                                        String sourceInfo = it3.next().getSourceInfo();
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
                c28057Azl.LJIIJJI = this.LJLJJL;
                ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS40S0100000_4(c28057Azl, 36));
            }
            EventCenter.LJ().LIZ("ec_order_list_state_changed", "{}");
            ECommerceMallService.v3().l3();
        }
        return C76800UCe.LIZ;
    }
}
