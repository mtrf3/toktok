package X;

import com.bytedance.android.live.iap.model.response.iap.IapProductDetail;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1bj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36351bj implements InterfaceC78395Upj {
    public final InterfaceC18450nx LIZ;
    public final InterfaceC18460ny LIZIZ;

    @Override // X.InterfaceC78395Upj
    public final void LIZ() {
    }

    @Override // X.InterfaceC78395Upj
    public final /* synthetic */ void LIZIZ() {
    }

    @Override // X.InterfaceC78395Upj
    public final /* synthetic */ void LJ() {
    }

    @Override // X.InterfaceC78395Upj
    public final /* synthetic */ void LJI() {
    }

    @Override // X.InterfaceC78395Upj
    public final /* synthetic */ void LJIIIIZZ(IapPaymentMethod iapPaymentMethod, C78368UpI c78368UpI) {
    }

    @Override // X.InterfaceC78395Upj
    public final /* synthetic */ void LJIIIZ() {
    }

    public C36351bj(InterfaceC18450nx interfaceC18450nx, InterfaceC18460ny interfaceC18460ny) {
        this.LIZ = interfaceC18450nx;
        this.LIZIZ = interfaceC18460ny;
    }

    public static void LJIILJJIL(C21240sS c21240sS, C78368UpI c78368UpI) {
        if (c78368UpI != null) {
            String message = c78368UpI.getMessage();
            o.LJIIIIZZ(message, "result.message");
            c21240sS.LIZJ = message;
            c21240sS.LIZIZ = c78368UpI.getDetailCode();
            c21240sS.LIZ = c78368UpI.getCode();
        }
    }

    @Override // X.InterfaceC78395Upj
    public final void LIZLLL(C78368UpI c78368UpI, List<AbsIapProduct> list) {
        C1Z5 c1z5 = new C1Z5();
        LJIILJJIL(c1z5, c78368UpI);
        if (c78368UpI != null && c78368UpI.getCode() == 0 && !C79004UzY.LJJIFFI(list)) {
            LJIILIIL(4, c1z5, list);
        } else {
            LJIIL(4, c1z5, c78368UpI, list);
        }
    }

    @Override // X.InterfaceC78395Upj
    public final void LJFF(C78368UpI c78368UpI, OrderInfo orderInfo) {
        java.util.Map<String, String> map;
        String orderId;
        if (c78368UpI != null) {
            map = c78368UpI.getPerformanceLog();
        } else {
            map = null;
        }
        if (C77640UdY.LIZ) {
            if (map == null) {
                map = new HashMap<>();
            }
            C77640UdY.LJII = map;
        }
        if (c78368UpI != null) {
            C77874UhK c77874UhK = c78368UpI.LIZIZ;
        }
        C1Z6 c1z6 = new C1Z6();
        LJIILJJIL(c1z6, c78368UpI);
        if (c78368UpI == null || orderInfo == null || c78368UpI.getCode() != 0 || (orderId = orderInfo.getOrderId()) == null || orderId.length() == 0) {
            LJIIJ(c1z6, orderInfo, false);
        } else {
            LJIIJJI(c1z6, orderInfo, false);
        }
    }

    @Override // X.InterfaceC78395Upj
    public final void LJII(C78368UpI c78368UpI, OrderInfo orderInfo) {
        String orderId;
        if (c78368UpI != null) {
            C77874UhK c77874UhK = c78368UpI.LIZIZ;
        }
        C1Z6 c1z6 = new C1Z6();
        LJIILJJIL(c1z6, c78368UpI);
        if (c78368UpI == null || orderInfo == null || c78368UpI.getCode() != 0 || (orderId = orderInfo.getOrderId()) == null || orderId.length() == 0) {
            LJIIJ(c1z6, orderInfo, true);
        } else {
            LJIIJJI(c1z6, orderInfo, true);
        }
    }

    @Override // X.InterfaceC78395Upj
    public final void LIZJ(IapPaymentMethod iapPaymentMethod, C78368UpI c78368UpI, List<AbsIapProduct> list) {
        C1Z5 c1z5 = new C1Z5();
        LJIILJJIL(c1z5, c78368UpI);
        if (c78368UpI != null && c78368UpI.getCode() == 0 && !C79004UzY.LJJIFFI(list)) {
            LJIILIIL(1, c1z5, list);
        } else {
            LJIIL(1, c1z5, c78368UpI, list);
        }
    }

    public final void LJIIJ(C1Z6 c1z6, OrderInfo orderInfo, boolean z) {
        String str;
        int i;
        String orderId;
        String productId;
        HashMap hashMap = new HashMap();
        String str2 = null;
        if (orderInfo != null) {
            str2 = orderInfo.getOrderId();
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("order_id", str2);
        if (orderInfo == null || (str = orderInfo.getProductId()) == null) {
            str = "";
        }
        hashMap.put("product_id", str);
        if (orderInfo != null && (productId = orderInfo.getProductId()) != null) {
            str3 = productId;
        }
        hashMap.put("sku_id", str3);
        int i2 = 1;
        if (orderInfo != null) {
            i = orderInfo.getQuantity();
        } else {
            i = 1;
        }
        hashMap.put("quantity", Integer.valueOf(i));
        if (z) {
            C77624UdI.LJFF(32, -1, "create pipo order fail", hashMap);
        } else {
            if (orderInfo == null || (orderId = orderInfo.getOrderId()) == null || orderId.length() != 0) {
                i2 = 2;
            }
            C77624UdI.LIZLLL(32, -1, "create pipo order fail", hashMap, i2);
        }
        InterfaceC18460ny interfaceC18460ny = this.LIZIZ;
        if (interfaceC18460ny != null) {
            interfaceC18460ny.LIZ(c1z6);
        }
    }

    public final void LJIIJJI(C1Z6 c1z6, OrderInfo orderInfo, boolean z) {
        String orderId = orderInfo.getOrderId();
        o.LJIIIIZZ(orderId, "orderInfo.orderId");
        c1z6.LIZLLL = orderId;
        o.LJIIIIZZ(orderInfo.getProductId(), "orderInfo.productId");
        HashMap hashMap = new HashMap();
        String productId = orderInfo.getProductId();
        String str = "";
        if (productId == null) {
            productId = "";
        }
        hashMap.put("sku_id", productId);
        String productId2 = orderInfo.getProductId();
        if (productId2 == null) {
            productId2 = "";
        }
        hashMap.put("product_id", productId2);
        String orderId2 = orderInfo.getOrderId();
        if (orderId2 == null) {
            orderId2 = "";
        }
        hashMap.put("order_id", orderId2);
        String userId = orderInfo.getUserId();
        if (userId != null) {
            str = userId;
        }
        hashMap.put("user_id", str);
        hashMap.put("quantity", Integer.valueOf(orderInfo.getQuantity()));
        if (z) {
            C77744UfE.LIZ(C77739Uf9.LIZ, EnumC77742UfC.BOTH, "livesdk_iap_finish_order_supply", C38393F4z.LIZLLL(hashMap), 56);
        } else {
            C77624UdI.LJ(hashMap);
        }
        InterfaceC18460ny interfaceC18460ny = this.LIZIZ;
        if (interfaceC18460ny != null) {
            interfaceC18460ny.LIZIZ(c1z6);
        }
    }

    public final void LJIILIIL(int i, C1Z5 c1z5, List<AbsIapProduct> list) {
        int i2;
        String str;
        if (list != null) {
            int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
            if (LJJIIZ < 16) {
                LJJIIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
            for (AbsIapProduct absIapProduct : list) {
                OSZ osz = new OSZ(absIapProduct.getProductId(), C25400zA.LIZ(absIapProduct));
                linkedHashMap.put(osz.getFirst(), osz.getSecond());
            }
            c1z5.LIZLLL = linkedHashMap;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<AbsIapProduct> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C25400zA.LIZ(it.next()));
            }
            ((InterfaceC77665Udx) C261610y.LIZ.getValue()).LIZ(EnumC77641UdZ.USE, C61878OQg.INSTANCE, arrayList);
        }
        HashMap hashMap = new HashMap();
        java.util.Map<String, IapProductDetail> map = c1z5.LIZLLL;
        if (map != null) {
            i2 = map.size();
        } else {
            i2 = 0;
        }
        hashMap.put("item_size", Integer.valueOf(i2));
        java.util.Map<String, IapProductDetail> map2 = c1z5.LIZLLL;
        if (map2 == null || (str = C46104I7o.LJJJJZI(map2)) == null) {
            str = "";
        }
        hashMap.put("product_list", str);
        if (i == 1) {
            C77744UfE.LIZ(C77739Uf9.LIZ, EnumC77742UfC.BOTH, "livesdk_wallet_recharge_query_one_time_product_success", C38393F4z.LIZLLL(hashMap), 56);
        } else {
            C77744UfE.LIZ(C77739Uf9.LIZ, EnumC77742UfC.BOTH, "livesdk_wallet_recharge_query_subscription_product_success", C38393F4z.LIZLLL(hashMap), 56);
        }
        InterfaceC18450nx interfaceC18450nx = this.LIZ;
        if (interfaceC18450nx != null) {
            interfaceC18450nx.LIZ(c1z5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(int r5, X.C1Z5 r6, X.C78368UpI r7, java.util.List<com.bytedance.globalpayment.iap.model.AbsIapProduct> r8) {
        /*
            r4 = this;
            r3 = -1
            r2 = 21
            if (r7 == 0) goto L3d
            int r0 = r7.getCode()
            if (r0 != 0) goto L25
            boolean r0 = X.C79004UzY.LJJIFFI(r8)
            if (r0 == 0) goto L25
            java.lang.String r1 = "query pipo product empty"
        L13:
            r0 = 1
            if (r5 != r0) goto L21
            X.C77624UdI.LIZIZ(r2, r3, r1)
        L19:
            X.0nx r0 = r4.LIZ
            if (r0 == 0) goto L20
            r0.LIZIZ(r6)
        L20:
            return
        L21:
            X.C77624UdI.LIZJ(r2, r3, r1)
            goto L19
        L25:
            int r0 = r7.getCode()
            if (r0 == 0) goto L3d
            int r2 = r7.getCode()
            int r3 = r7.getDetailCode()
            java.lang.String r1 = r7.getMessage()
            java.lang.String r0 = "result.message"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            goto L13
        L3d:
            java.lang.String r1 = "query pipo product null"
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36351bj.LJIIL(int, X.1Z5, X.UpI, java.util.List):void");
    }
}
