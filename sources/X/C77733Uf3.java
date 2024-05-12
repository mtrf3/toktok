package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uf3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C77733Uf3 implements InterfaceC78395Upj {
    public final InterfaceC77737Uf7 LIZ;
    public boolean LIZIZ = true;

    @Override // X.InterfaceC78395Upj
    public final void LIZ() {
    }

    @Override // X.InterfaceC78395Upj
    public final /* synthetic */ void LIZIZ() {
    }

    @Override // X.InterfaceC78395Upj
    public final void LJ() {
    }

    @Override // X.InterfaceC78395Upj
    public final void LJI() {
    }

    @Override // X.InterfaceC78395Upj
    public final /* synthetic */ void LJIIIIZZ(IapPaymentMethod iapPaymentMethod, C78368UpI c78368UpI) {
    }

    @Override // X.InterfaceC78395Upj
    public final /* synthetic */ void LJIIIZ() {
    }

    public C77733Uf3(InterfaceC77737Uf7 interfaceC77737Uf7) {
        this.LIZ = interfaceC77737Uf7;
    }

    public static void LJIIZILJ(Diamond diamond) {
        if (diamond != null) {
            String str = diamond.LJLILLLLZI;
            o.LJIIIIZZ(str, "it.priceCurrencyCode");
            if (!C38354F3m.LIZJ(C77608Ud2.LIZIZ, str)) {
                C77608Ud2.LIZIZ = str;
                ((ArrayList) C77608Ud2.LIZJ).clear();
            }
        }
    }

    @Override // X.InterfaceC78395Upj
    public void LIZLLL(C78368UpI c78368UpI, List<? extends AbsIapProduct> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        LJIILL(this.LIZ, c78368UpI, list);
    }

    @Override // X.InterfaceC78395Upj
    public void LJFF(C78368UpI c78368UpI, OrderInfo orderInfo) {
        java.util.Map<String, String> map;
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
        LJIILIIL(this.LIZ, c78368UpI, orderInfo);
    }

    @Override // X.InterfaceC78395Upj
    public void LJII(C78368UpI c78368UpI, OrderInfo orderInfo) {
        LJIIJ(this.LIZ, c78368UpI, orderInfo);
    }

    @Override // X.InterfaceC78395Upj
    public void LIZJ(IapPaymentMethod iapPaymentMethod, C78368UpI c78368UpI, List<? extends AbsIapProduct> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        LJIILJJIL(this.LIZ, iapPaymentMethod, c78368UpI, list);
    }

    public final void LJIIJ(InterfaceC77737Uf7 interfaceC77737Uf7, C78368UpI c78368UpI, OrderInfo orderInfo) {
        int i;
        String str;
        String str2;
        String orderId;
        C31556Ca0 c31556Ca0;
        HashMap<String, ?> hashMap;
        C77874UhK c77874UhK;
        int i2 = 1;
        if (c78368UpI != null && (c77874UhK = c78368UpI.LIZIZ) != null && c77874UhK.LJII) {
            i = 5;
        } else {
            i = 2;
        }
        if (c78368UpI != null && orderInfo != null) {
            if (c78368UpI.getCode() != 0 || (orderId = orderInfo.getOrderId()) == null || orderId.length() == 0) {
                if (c78368UpI.getCode() != 0) {
                    int code = c78368UpI.getCode();
                    int detailCode = c78368UpI.getDetailCode();
                    String message = c78368UpI.getMessage();
                    o.LJIIIIZZ(message, "result.message");
                    String productId = orderInfo.getProductId();
                    o.LJIIIIZZ(productId, "info.productId");
                    String orderId2 = orderInfo.getOrderId();
                    o.LJIIIIZZ(orderId2, "info.orderId");
                    LJIIJJI(interfaceC77737Uf7, i, code, detailCode, "ttlive_wallet_supplement_order", message, productId, orderId2, orderInfo.getQuantity(), c78368UpI.LIZIZ, true);
                    return;
                }
            } else {
                HashMap hashMap2 = new HashMap();
                String orderId3 = orderInfo.getOrderId();
                String str3 = "";
                if (orderId3 == null) {
                    orderId3 = "";
                }
                hashMap2.put("order_id", orderId3);
                String productId2 = orderInfo.getProductId();
                if (productId2 == null) {
                    productId2 = "";
                }
                hashMap2.put("product_id", productId2);
                String userId = orderInfo.getUserId();
                if (userId != null) {
                    str3 = userId;
                }
                hashMap2.put("user_id", str3);
                C77874UhK c77874UhK2 = c78368UpI.LIZIZ;
                if (c77874UhK2 != null && (hashMap = c77874UhK2.LJI) != null) {
                    hashMap2.putAll(hashMap);
                }
                if (this.LIZIZ) {
                    C78609UtB.LJJJJZI("ttlive_wallet_supplement_order", hashMap2);
                }
                C77874UhK c77874UhK3 = c78368UpI.LIZIZ;
                if (c77874UhK3 != null && c77874UhK3.LJII) {
                    c31556Ca0 = new C31556Ca0(i, null, null, null, null, new C77612Ud6(orderInfo.getProductId(), orderInfo.getOrderId(), orderInfo.getQuantity(), orderInfo.getUserId()), null, null, 222);
                } else {
                    c31556Ca0 = new C31556Ca0(i, null, new C77612Ud6(orderInfo.getProductId(), orderInfo.getOrderId(), orderInfo.getQuantity(), orderInfo.getUserId()), null, null, null, null, null, LiveCoverMinSizeSetting.DEFAULT);
                }
                LJIILLIIL(interfaceC77737Uf7, i, c31556Ca0, hashMap2, true);
                return;
            }
        }
        C77874UhK c77874UhK4 = null;
        if (orderInfo != null) {
            str = orderInfo.getProductId();
        } else {
            str = null;
        }
        String valueOf = String.valueOf(str);
        if (orderInfo != null) {
            str2 = orderInfo.getOrderId();
        } else {
            str2 = null;
        }
        String valueOf2 = String.valueOf(str2);
        if (orderInfo != null) {
            i2 = orderInfo.getQuantity();
        }
        if (c78368UpI != null) {
            c77874UhK4 = c78368UpI.LIZIZ;
        }
        LJIIJJI(interfaceC77737Uf7, i, 51, -1, "ttlive_wallet_supplement_order", "extra supplement order_fail", valueOf, valueOf2, i2, c77874UhK4, true);
    }

    public final void LJIILIIL(InterfaceC77737Uf7 interfaceC77737Uf7, C78368UpI c78368UpI, OrderInfo orderInfo) {
        int i;
        String str;
        String str2;
        String str3;
        String orderId;
        C31556Ca0 c31556Ca0;
        HashMap<String, ?> hashMap;
        C77874UhK c77874UhK;
        C77874UhK c77874UhK2;
        int i2 = 1;
        if (c78368UpI != null && (c77874UhK2 = c78368UpI.LIZIZ) != null && c77874UhK2.LJII) {
            i = 5;
        } else {
            i = 2;
        }
        if (c78368UpI != null && (c77874UhK = c78368UpI.LIZIZ) != null && c77874UhK.LJII) {
            str = "ttlive_pipo_iap_subscription";
        } else {
            str = "ttlive_pipo_create_order";
        }
        if (c78368UpI != null && orderInfo != null) {
            if (c78368UpI.getCode() != 0 || (orderId = orderInfo.getOrderId()) == null || orderId.length() == 0) {
                if (c78368UpI.getCode() != 0) {
                    int code = c78368UpI.getCode();
                    int detailCode = c78368UpI.getDetailCode();
                    String message = c78368UpI.getMessage();
                    o.LJIIIIZZ(message, "result.message");
                    String productId = orderInfo.getProductId();
                    o.LJIIIIZZ(productId, "info.productId");
                    String orderId2 = orderInfo.getOrderId();
                    o.LJIIIIZZ(orderId2, "info.orderId");
                    LJIIL(this, interfaceC77737Uf7, i, code, detailCode, str, message, productId, orderId2, orderInfo.getQuantity(), c78368UpI.LIZIZ, 1024);
                    return;
                }
            } else {
                HashMap hashMap2 = new HashMap();
                String productId2 = orderInfo.getProductId();
                String str4 = "";
                if (productId2 == null) {
                    productId2 = "";
                }
                hashMap2.put("sku_id", productId2);
                String productId3 = orderInfo.getProductId();
                if (productId3 == null) {
                    productId3 = "";
                }
                hashMap2.put("product_id", productId3);
                String orderId3 = orderInfo.getOrderId();
                if (orderId3 == null) {
                    orderId3 = "";
                }
                hashMap2.put("order_id", orderId3);
                String userId = orderInfo.getUserId();
                if (userId != null) {
                    str4 = userId;
                }
                hashMap2.put("user_id", str4);
                hashMap2.put("quantity", Integer.valueOf(orderInfo.getQuantity()));
                C77874UhK c77874UhK3 = c78368UpI.LIZIZ;
                if (c77874UhK3 != null && (hashMap = c77874UhK3.LJI) != null) {
                    hashMap2.putAll(hashMap);
                }
                if (this.LIZIZ) {
                    C78609UtB.LJJJJZI(str, hashMap2);
                }
                C77874UhK c77874UhK4 = c78368UpI.LIZIZ;
                if (c77874UhK4 != null && c77874UhK4.LJII) {
                    c31556Ca0 = new C31556Ca0(i, null, null, null, null, new C77612Ud6(orderInfo.getProductId(), orderInfo.getOrderId(), orderInfo.getQuantity(), orderInfo.getUserId()), null, null, 222);
                } else {
                    c31556Ca0 = new C31556Ca0(i, null, new C77612Ud6(orderInfo.getProductId(), orderInfo.getOrderId(), orderInfo.getQuantity(), orderInfo.getUserId()), null, null, null, null, null, LiveCoverMinSizeSetting.DEFAULT);
                }
                LJIILLIIL(interfaceC77737Uf7, i, c31556Ca0, hashMap2, false);
                return;
            }
        }
        C77874UhK c77874UhK5 = null;
        if (orderInfo != null) {
            str2 = orderInfo.getProductId();
        } else {
            str2 = null;
        }
        String valueOf = String.valueOf(str2);
        if (orderInfo != null) {
            str3 = orderInfo.getOrderId();
        } else {
            str3 = null;
        }
        String valueOf2 = String.valueOf(str3);
        if (orderInfo != null) {
            i2 = orderInfo.getQuantity();
        }
        if (c78368UpI != null) {
            c77874UhK5 = c78368UpI.LIZIZ;
        }
        LJIIL(this, interfaceC77737Uf7, i, 32, -1, str, "create pipo order fail", valueOf, valueOf2, i2, c77874UhK5, 1024);
    }

    public final void LJIILL(InterfaceC77737Uf7 interfaceC77737Uf7, C78368UpI c78368UpI, List<? extends AbsIapProduct> list) {
        if (c78368UpI != null) {
            if (c78368UpI.getCode() == 0 && !C79004UzY.LJJIFFI(list)) {
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (AbsIapProduct absIapProduct : list) {
                    if (absIapProduct != null) {
                        arrayList.add(new Diamond(absIapProduct.getProductId(), absIapProduct.getPrice(), absIapProduct.getPriceCurrencyCode(), absIapProduct.getPriceAmountMicros(), absIapProduct.getDescription()));
                        String productId = absIapProduct.getProductId();
                        o.LJIIIIZZ(productId, "item.productId");
                        linkedHashMap.put(productId, C25400zA.LIZ(absIapProduct));
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("item_size", Integer.valueOf(list.size()));
                String LJFF = C38393F4z.LJFF(arrayList);
                o.LJIIIIZZ(LJFF, "toJSONString(diamondList)");
                hashMap.put("product_list", LJFF);
                if (this.LIZIZ) {
                    C78609UtB.LJJJJZI("ttlive_fetch_subscription_products", hashMap);
                }
                LJIIZILJ((Diamond) ORZ.LJLLLLLL(0, arrayList));
                LJIILLIIL(interfaceC77737Uf7, 4, new C31556Ca0(4, null, null, null, new C68395Qsp(arrayList, linkedHashMap), null, null, null, 238), hashMap, false);
                return;
            }
            if (c78368UpI.getCode() == 0 && C79004UzY.LJJIFFI(list)) {
                LJIIL(this, interfaceC77737Uf7, 4, 21, -1, "ttlive_fetch_subscription_products", "query pipo product empty", null, null, 0, null, 1984);
                return;
            } else if (c78368UpI.getCode() != 0) {
                int code = c78368UpI.getCode();
                int detailCode = c78368UpI.getDetailCode();
                String message = c78368UpI.getMessage();
                o.LJIIIIZZ(message, "result.message");
                LJIIL(this, interfaceC77737Uf7, 4, code, detailCode, "ttlive_fetch_subscription_products", message, null, null, 0, null, 1984);
                return;
            }
        }
        LJIIL(this, interfaceC77737Uf7, 4, 21, -1, "ttlive_fetch_subscription_products", "query pipo product null", null, null, 0, null, 1984);
    }

    public final void LJIILJJIL(InterfaceC77737Uf7 interfaceC77737Uf7, IapPaymentMethod iapPaymentMethod, C78368UpI c78368UpI, List<? extends AbsIapProduct> list) {
        Object obj;
        if (c78368UpI != null) {
            if (c78368UpI.getCode() == 0 && !C79004UzY.LJJIFFI(list)) {
                ArrayList arrayList = new ArrayList();
                for (AbsIapProduct absIapProduct : list) {
                    if (absIapProduct != null) {
                        Diamond diamond = new Diamond(absIapProduct.getProductId(), absIapProduct.getPrice(), absIapProduct.getPriceCurrencyCode(), absIapProduct.getPriceAmountMicros(), absIapProduct.getDescription());
                        if (absIapProduct.getChannelUserData() != null) {
                            String userId = absIapProduct.getChannelUserData().getUserId();
                            o.LJIIIIZZ(userId, "item.channelUserData.userId");
                            String userMarkPlace = absIapProduct.getChannelUserData().getUserMarkPlace();
                            o.LJIIIIZZ(userMarkPlace, "item.channelUserData.userMarkPlace");
                            diamond.LJLJJL = new C77745UfF(userId, userMarkPlace);
                        }
                        arrayList.add(diamond);
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("item_size", Integer.valueOf(list.size()));
                if (iapPaymentMethod == null || (obj = iapPaymentMethod.channelName) == null) {
                    obj = IapPaymentMethod.UNKNOWN;
                }
                hashMap.put("payment_method", obj);
                String LJFF = C38393F4z.LJFF(arrayList);
                o.LJIIIIZZ(LJFF, "toJSONString(diamondList)");
                hashMap.put("product_list", LJFF);
                if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_query_pipo_purchase_all", 0.2d) && this.LIZIZ) {
                    C78609UtB.LJJJJZI("ttlive_query_pipo_purchase", hashMap);
                }
                LJIIZILJ((Diamond) ORZ.LJLLLLLL(0, arrayList));
                LJIILLIIL(interfaceC77737Uf7, 1, new C31556Ca0(1, arrayList, null, null, null, null, null, null, 252), hashMap, false);
                return;
            }
            if (c78368UpI.getCode() == 0 && C79004UzY.LJJIFFI(list)) {
                LJIIL(this, interfaceC77737Uf7, 1, 21, -1, "ttlive_query_pipo_purchase", "query pipo product empty", null, null, 0, null, 1984);
                return;
            }
            if (c78368UpI.getCode() != 0) {
                int code = c78368UpI.getCode();
                int detailCode = c78368UpI.getDetailCode();
                String message = c78368UpI.getMessage();
                o.LJIIIIZZ(message, "result.message");
                LJIIL(this, interfaceC77737Uf7, 1, code, detailCode, "ttlive_query_pipo_purchase", message, "", "", 0, null, 1792);
                return;
            }
            return;
        }
        LJIIL(this, interfaceC77737Uf7, 1, 21, -1, "ttlive_query_pipo_purchase", "query pipo product null", null, null, 0, null, 1984);
    }

    public static void LJIILLIIL(InterfaceC77737Uf7 interfaceC77737Uf7, int i, C31556Ca0 c31556Ca0, HashMap hashMap, boolean z) {
        if (interfaceC77737Uf7 != null) {
            interfaceC77737Uf7.LJIIIIZZ(c31556Ca0);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 5 && interfaceC77737Uf7 != null) {
                        interfaceC77737Uf7.LIZLLL(c31556Ca0);
                    }
                } else if (interfaceC77737Uf7 != null) {
                    interfaceC77737Uf7.LJIIIZ(i, c31556Ca0);
                }
            } else if (interfaceC77737Uf7 != null) {
                interfaceC77737Uf7.LJIIJJI(c31556Ca0);
            }
            if (i != 2) {
                if (i != 4) {
                    if (i != 5) {
                        return;
                    }
                } else {
                    C77744UfE.LIZ(C77739Uf9.LIZ, EnumC77742UfC.BOTH, "livesdk_wallet_recharge_query_subscription_product_success", C38393F4z.LIZLLL(hashMap), 56);
                    return;
                }
            }
            if (z) {
                C77744UfE.LIZ(C77739Uf9.LIZ, EnumC77742UfC.BOTH, "livesdk_iap_finish_order_supply", C38393F4z.LIZLLL(hashMap), 56);
                return;
            } else {
                C77624UdI.LJ(hashMap);
                return;
            }
        }
        if (interfaceC77737Uf7 == null) {
            return;
        }
        interfaceC77737Uf7.LJJ(i, c31556Ca0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r18 != 5) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(X.InterfaceC77737Uf7 r17, int r18, int r19, int r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25, X.C77874UhK r26, boolean r27) {
        /*
            r16 = this;
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r1 = 1
            r5 = 5
            r2 = 4
            r0 = 2
            r3 = r22
            r8 = r20
            r12 = r24
            r7 = r19
            r11 = r23
            r6 = r18
            if (r6 == r0) goto L67
            if (r6 == r2) goto L63
            if (r6 == r5) goto L67
        L1b:
            r0 = r16
            boolean r0 = r0.LIZIZ
            r9 = r21
            if (r0 == 0) goto L29
            X.C78609UtB.LJJJLL(r7, r8, r9, r3, r4)
            com.bytedance.android.live.wallet.utils.ChargeFailLogHelper.LIZ(r7, r8, r3, r12)
        L29:
            X.UdH r5 = new X.UdH
            java.lang.Exception r10 = new java.lang.Exception
            r10.<init>(r3)
            r15 = 0
            r2 = r5
            r13 = 0
            r14 = 128(0x80, float:1.8E-43)
            r0 = 2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r3 = r17
            if (r3 == 0) goto L40
            r3.LIZIZ(r6, r5)
        L40:
            if (r6 == r1) goto L5d
            if (r6 == r0) goto L57
            r0 = 4
            if (r6 == r0) goto L51
            r0 = 5
            if (r6 == r0) goto L4b
        L4a:
            return
        L4b:
            if (r3 == 0) goto L4a
            r3.LJIIL(r2)
            goto L4a
        L51:
            if (r3 == 0) goto L4a
            r3.LJI(r2)
            goto L4a
        L57:
            if (r3 == 0) goto L4a
            r3.LJIIZILJ(r6, r5)
            goto L4a
        L5d:
            if (r3 == 0) goto L4a
            r3.LJFF(r6, r5)
            goto L4a
        L63:
            X.C77624UdI.LIZJ(r7, r8, r3)
            goto L1b
        L67:
            java.lang.String r0 = "order_id"
            r4.put(r0, r12)
            java.lang.String r0 = "product_id"
            r4.put(r0, r11)
            java.lang.String r0 = "sku_id"
            r4.put(r0, r11)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)
            java.lang.String r0 = "quantity"
            r4.put(r0, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r2.putAll(r4)
            r0 = r26
            if (r0 == 0) goto L92
            java.util.HashMap<java.lang.String, ?> r0 = r0.LJI
            if (r0 == 0) goto L92
            r4.putAll(r0)
        L92:
            if (r27 == 0) goto L98
            X.C77624UdI.LJFF(r7, r8, r3, r2)
            goto L1b
        L98:
            int r0 = r12.length()
            if (r0 != 0) goto La4
            r0 = 1
        L9f:
            X.C77624UdI.LIZLLL(r7, r8, r3, r2, r0)
            goto L1b
        La4:
            r0 = 2
            goto L9f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77733Uf3.LJIIJJI(X.Uf7, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, X.UhK, boolean):void");
    }

    public static /* synthetic */ void LJIIL(C77733Uf3 c77733Uf3, InterfaceC77737Uf7 interfaceC77737Uf7, int i, int i2, int i3, String str, String str2, String str3, String str4, int i4, C77874UhK c77874UhK, int i5) {
        int i6 = i4;
        String str5 = str3;
        C77874UhK c77874UhK2 = c77874UhK;
        String str6 = "";
        if ((i5 & 64) != 0) {
            str5 = "";
        }
        if ((i5 & 128) == 0) {
            str6 = str4;
        }
        if ((i5 & 256) != 0) {
            i6 = 1;
        }
        if ((i5 & 512) != 0) {
            c77874UhK2 = null;
        }
        c77733Uf3.LJIIJJI(interfaceC77737Uf7, i, i2, i3, str, str2, str5, str6, i6, c77874UhK2, false);
    }
}
