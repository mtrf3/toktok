package Y;

import X.AF0;
import X.C113554cx;
import X.C1B3;
import X.C243639hH;
import X.C243759hT;
import X.C249649qy;
import X.C26059AKp;
import X.C27739Aud;
import X.C45243HpH;
import X.C73318Sq2;
import X.C76542zS;
import X.IV8;
import X.InterfaceC116954iR;
import X.InterfaceC243629hG;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.ORZ;
import X.OSZ;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.network.Data;
import com.ss.android.ugc.aweme.account.login.v2.network.EdmUserPropertiesResponse;
import com.ss.android.ugc.aweme.account.verify.EmailConsentPageFragment;
import com.ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.ss.android.ugc.aweme.contentlanguage.model.ConfigListResponse;
import com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import com.ss.android.ugc.aweme.ecommerce.model.CartRefreshEvent;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS12S1400000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDxS128S0200000_4 implements InterfaceC116954iR {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onComplete$0(IDxS128S0200000_4 iDxS128S0200000_4) {
    }

    public static final void onComplete$1(IDxS128S0200000_4 iDxS128S0200000_4) {
    }

    public static final void onComplete$2(IDxS128S0200000_4 iDxS128S0200000_4) {
    }

    public static final void onComplete$3(IDxS128S0200000_4 iDxS128S0200000_4) {
    }

    public static final void onComplete$4(IDxS128S0200000_4 iDxS128S0200000_4) {
    }

    public static final void onComplete$5(IDxS128S0200000_4 iDxS128S0200000_4) {
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                return;
            case 1:
                onComplete$1(this);
                return;
            case 2:
                onComplete$2(this);
                return;
            case 3:
                onComplete$3(this);
                return;
            case 4:
                onComplete$4(this);
                return;
            case 5:
                onComplete$5(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                return;
            case 1:
                o.LJIIIZ(th, "e");
                return;
            case 2:
                o.LJIIIZ(th, "e");
                return;
            case 3:
                onError$3(this, th);
                return;
            case 4:
                o.LJIIIZ(th, "e");
                return;
            case 5:
                onError$5(this, th);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                return;
            case 1:
                onNext$1(this, obj);
                return;
            case 2:
                onNext$2(this, obj);
                return;
            case 3:
                onNext$3(this, obj);
                return;
            case 4:
                onNext$4(this, obj);
                return;
            case 5:
                onNext$5(this, obj);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            case 1:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            case 2:
                onSubscribe$2(this, interfaceC92693kP);
                return;
            case 3:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            case 4:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            case 5:
                onSubscribe$5(this, interfaceC92693kP);
                return;
            default:
                return;
        }
    }

    public static final void onError$0(IDxS128S0200000_4 iDxS128S0200000_4, Throwable e) {
        o.LJIIIZ(e, "e");
        ((CommonFlowActivity) iDxS128S0200000_4.l0).finish();
    }

    public static final void onError$3(IDxS128S0200000_4 iDxS128S0200000_4, Throwable e) {
        o.LJIIIZ(e, "e");
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDxS128S0200000_4.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(new C249649qy(ImagePreloadExperiment.PRIORITY_DEFAULT, "Report final failed", null));
        }
    }

    public static final void onError$5(IDxS128S0200000_4 iDxS128S0200000_4, Throwable e) {
        o.LJIIIZ(e, "e");
        ((InterfaceC243629hG) iDxS128S0200000_4.l1).onFail();
        ((InterfaceC243629hG) iDxS128S0200000_4.l1).LIZ();
    }

    public static final void onNext$0(IDxS128S0200000_4 iDxS128S0200000_4, Object obj) {
        EdmUserPropertiesResponse t = (EdmUserPropertiesResponse) obj;
        o.LJIIIZ(t, "t");
        Data data = t.getData();
        if (data != null && data.getShowConsentPage()) {
            EmailConsentPageFragment fragment = (EmailConsentPageFragment) iDxS128S0200000_4.l1;
            CommonFlowActivity activity = (CommonFlowActivity) iDxS128S0200000_4.l0;
            o.LJIIIZ(fragment, "fragment");
            o.LJIIIZ(activity, "activity");
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJIIJ(fragment, null, R.id.dm7);
            c1b3.LJ(null);
            c1b3.LJIILJJIL();
            return;
        }
        ((CommonFlowActivity) iDxS128S0200000_4.l0).finish();
    }

    public static final void onNext$1(IDxS128S0200000_4 iDxS128S0200000_4, Object obj) {
        ConfigListResponse response = (ConfigListResponse) obj;
        o.LJIIIZ(response, "response");
        AF0 LJI = ContentLanguageServiceImpl.LJIIJJI().LJI((List) iDxS128S0200000_4.l0, response.contentLanguage);
        o.LJI(LJI);
        ((ContentPreferenceViewModel) iDxS128S0200000_4.l1).jv0(LJI.LIZ, LJI.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onNext$2(IDxS128S0200000_4 iDxS128S0200000_4, Object obj) {
        ShopOrderNew shopOrderNew;
        String str;
        int i;
        String str2;
        Integer num;
        Integer num2;
        AddItemToCartData addItemToCartData;
        CartEntry cartEntry;
        String str3;
        Object obj2;
        Object obj3;
        List<ShopOrderNew> newShopOrders;
        Response response = (Response) obj;
        o.LJIIIZ(response, "response");
        BillInfoData billInfoData = ((OrderSubmitViewModel) iDxS128S0200000_4.l0).LJZ;
        if (billInfoData != null && (newShopOrders = billInfoData.getNewShopOrders()) != null) {
            shopOrderNew = (ShopOrderNew) ORZ.LJLLLL(newShopOrders);
        } else {
            shopOrderNew = null;
        }
        OrderSubmitViewModel orderSubmitViewModel = (OrderSubmitViewModel) iDxS128S0200000_4.l0;
        OrderSKUDTO orderSKUDTO = (OrderSKUDTO) iDxS128S0200000_4.l1;
        String str4 = orderSKUDTO.productId;
        String str5 = orderSKUDTO.skuId;
        T t = response.data;
        AddItemToCartData addItemToCartData2 = (AddItemToCartData) t;
        if (addItemToCartData2 != null) {
            str = addItemToCartData2.cartItemId;
        } else {
            str = null;
        }
        if (t != 0) {
            i = 1;
        } else {
            i = 0;
        }
        String str6 = orderSKUDTO.entranceInfo;
        orderSubmitViewModel.getClass();
        String str7 = OrderSubmitViewModel.dw0(shopOrderNew).LIZ;
        ((OrderSubmitViewModel) iDxS128S0200000_4.l0).getClass();
        Double d = OrderSubmitViewModel.dw0(shopOrderNew).LIZIZ;
        ((OrderSubmitViewModel) iDxS128S0200000_4.l0).getClass();
        String str8 = OrderSubmitViewModel.dw0(shopOrderNew).LIZJ;
        if (shopOrderNew != null) {
            str2 = shopOrderNew.sellerId;
        } else {
            str2 = null;
        }
        HashMap LIZ = C45243HpH.LIZ("EVENT_ORIGIN_FEATURE", "TEMAI", "page_name", "order_submit");
        HashMap<String, Object> hashMap = orderSubmitViewModel.LLIL;
        if (hashMap != null && (obj3 = hashMap.get("previous_page")) != null) {
            LIZ.put("previous_page", obj3);
        }
        if (str2 != null) {
            LIZ.put("shop_id", str2);
        }
        LIZ.put("cart_form", "unpaid_item");
        if (str != null) {
            LIZ.put("cart_item_id", str);
        }
        LIZ.put("add_sku_num", Integer.valueOf(i));
        HashMap<String, Object> hashMap2 = orderSubmitViewModel.LLIL;
        if (hashMap2 != null && (obj2 = hashMap2.get("enter_from_info")) != null) {
            LIZ.put("enter_from", obj2);
        }
        if (str4 != null) {
            LIZ.put("product_id", str4);
        }
        if (str5 != null) {
            LIZ.put("sku_id", str5);
        }
        if (str6 != null) {
            LIZ.put("entrance_info", str6);
        }
        if (str7 != null) {
            LIZ.put("currency", str7);
        }
        if (str8 != null) {
            LIZ.put("sale_price_value", str8);
        }
        if (d != null) {
            LIZ.put("original_price_value", d);
        }
        ((OrderSubmitViewModel) iDxS128S0200000_4.l0).getClass();
        C76542zS.LIZJ("tiktokec_confirm_cart", new AqS170S0100000_4(LIZ, (HashMap<String, Object>) 1238));
        OrderSubmitViewModel orderSubmitViewModel2 = (OrderSubmitViewModel) iDxS128S0200000_4.l0;
        Boolean valueOf = Boolean.valueOf(response.isCodeOK());
        String str9 = response.message;
        AddItemToCartData addItemToCartData3 = (AddItemToCartData) response.data;
        if (addItemToCartData3 != null) {
            num = addItemToCartData3.preSkuCount;
        } else {
            num = null;
        }
        if (addItemToCartData3 != null) {
            num2 = addItemToCartData3.postSkuCount;
        } else {
            num2 = null;
        }
        orderSubmitViewModel2.getClass();
        C76542zS.LIZJ("tiktokec_confirm_cart_result", new AqS12S1400000_4(LIZ, (HashMap<String, Object>) valueOf, (Boolean) str9, (String) num, num2, (Integer) 3));
        if (response.code == 0 && (addItemToCartData = (AddItemToCartData) response.data) != null && (cartEntry = addItemToCartData.cartEntry) != null) {
            OrderSKUDTO orderSKUDTO2 = (OrderSKUDTO) iDxS128S0200000_4.l1;
            OrderSubmitViewModel orderSubmitViewModel3 = (OrderSubmitViewModel) iDxS128S0200000_4.l0;
            String str10 = orderSKUDTO2.productId;
            if (str10 != null && (str3 = orderSKUDTO2.skuId) != null) {
                String str11 = addItemToCartData.cartItemId;
                orderSubmitViewModel3.getClass();
                C26059AKp.LIZ().LIZ("ec_cart_refresh", C27739Aud.LJI(new CartRefreshEvent(0, cartEntry.itemCount, C113554cx.LJJL(new OSZ("cart_item_id", str11), new OSZ("product_id", str10), new OSZ("sku_id", str3)), null, null, null, 56, null)));
            }
        }
    }

    public static final void onNext$3(IDxS128S0200000_4 iDxS128S0200000_4, Object obj) {
        C249649qy reportResult = (C249649qy) obj;
        o.LJIIIZ(reportResult, "reportResult");
        if (reportResult.LJLIL == 0) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDxS128S0200000_4.l0;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(reportResult);
                return;
            }
            return;
        }
        InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) iDxS128S0200000_4.l1;
        if (interfaceC88472Yns2 == null) {
            return;
        }
        interfaceC88472Yns2.invoke(reportResult);
    }

    public static final void onNext$4(IDxS128S0200000_4 iDxS128S0200000_4, Object obj) {
        C243759hT reportResult = (C243759hT) obj;
        o.LJIIIZ(reportResult, "reportResult");
        if (reportResult.LJLIL == 1) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDxS128S0200000_4.l0;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(reportResult);
                return;
            }
            return;
        }
        InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) iDxS128S0200000_4.l1;
        if (interfaceC88472Yns2 == null) {
            return;
        }
        interfaceC88472Yns2.invoke(reportResult);
    }

    public static final void onNext$5(IDxS128S0200000_4 iDxS128S0200000_4, Object obj) {
        int intValue = ((Number) obj).intValue();
        if (intValue != -1) {
            if (intValue != 1) {
                if (intValue != 2) {
                    return;
                }
                ((InterfaceC243629hG) iDxS128S0200000_4.l1).LIZIZ();
                return;
            }
            ((InterfaceC243629hG) iDxS128S0200000_4.l1).onSuccess(((C243639hH) iDxS128S0200000_4.l0).LIZ);
            return;
        }
        ((InterfaceC243629hG) iDxS128S0200000_4.l1).onFail();
    }

    public static final void onSubscribe$2(IDxS128S0200000_4 iDxS128S0200000_4, InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        C73318Sq2 c73318Sq2 = IV8.LIZ;
        if (c73318Sq2 != null) {
            c73318Sq2.LIZ(d);
        }
    }

    public static final void onSubscribe$5(IDxS128S0200000_4 iDxS128S0200000_4, InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        ((C243639hH) iDxS128S0200000_4.l0).LIZIZ = d;
    }

    public IDxS128S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
