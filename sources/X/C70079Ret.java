package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseLimit;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.utils.PdpButtonActionHelper;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.widget.UsPdpBottomNavBarWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.IDqS38S0300000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ret, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70079Ret implements InterfaceC70181RgX {
    public final /* synthetic */ UsPdpBottomNavBarWidget LIZ;

    public C70079Ret(UsPdpBottomNavBarWidget usPdpBottomNavBarWidget) {
        this.LIZ = usPdpBottomNavBarWidget;
    }

    @Override // X.InterfaceC70181RgX
    public final void LIZ(C113724dE view, PdpButton button) {
        String str;
        PurchaseLimit purchaseLimit;
        boolean z;
        ProductBase productBase;
        ProductPrice productPrice;
        ProductBase productBase2;
        ProductPrice productPrice2;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(button, "button");
        PdpButtonActionHelper pdpButtonActionHelper = this.LIZ.getViewModel().LLJL;
        PurchaseLimit purchaseLimit2 = null;
        if (pdpButtonActionHelper != null) {
            PdpFragment node = this.LIZ.LJLIL;
            o.LJIIIZ(node, "node");
            Integer num = button.buttonAction;
            int value = EnumC70033Re9.ADD_TO_CART.getValue();
            boolean z2 = false;
            if (num == null || num.intValue() != value) {
                int value2 = EnumC70033Re9.BUY.getValue();
                if (num == null || num.intValue() != value2) {
                    int value3 = EnumC70033Re9.SCHEMA.getValue();
                    if (num == null || num.intValue() != value3) {
                        int value4 = EnumC70033Re9.UPDATE_ADDRESS.getValue();
                        if (num == null || num.intValue() != value4) {
                            return;
                        }
                        C70414RkI c70414RkI = pdpButtonActionHelper.LJLIL.LLFII;
                        if (c70414RkI != null) {
                            C70082Rew c70082Rew = new C70082Rew("tiktokec_module_click");
                            ConcurrentHashMap<String, Object> commonParams = c70414RkI.LIZIZ;
                            o.LJIIIZ(commonParams, "commonParams");
                            c70082Rew.LIZIZ.putAll(commonParams);
                            c70082Rew.LIZIZ();
                        }
                        PdpViewModel pdpViewModel = pdpButtonActionHelper.LJLIL;
                        pdpViewModel.getClass();
                        C78565UsT.LJJIJ(pdpViewModel, MBB.INSTANCE, new C26821Afp(view, pdpViewModel, null));
                        return;
                    }
                    String str2 = button.link;
                    if (str2 == null) {
                        return;
                    }
                    Context context = view.getContext();
                    o.LJIIIIZZ(context, "view.context");
                    C26867AgZ.LIZIZ(context, str2, C113554cx.LJJJLIIL(), false).open();
                    return;
                }
                Context context2 = view.getContext();
                PdpViewModel pdpViewModel2 = pdpButtonActionHelper.LJLIL;
                if (pdpViewModel2.LLIIIILZ) {
                    C26048AKe c26048AKe = new C26048AKe(view);
                    c26048AKe.LJI(context2.getString(R.string.f3i));
                    c26048AKe.LJII();
                    return;
                }
                ProductPackStruct productPackStruct = pdpViewModel2.LJLJLLL;
                if (productPackStruct != null && (productBase2 = productPackStruct.baseInfo) != null && (productPrice2 = productBase2.priceInfo) != null) {
                    z = o.LJ(productPrice2.needIcon, Boolean.TRUE);
                } else {
                    z = false;
                }
                String str3 = "unable_to_buy";
                if (pdpButtonActionHelper.LJLIL.sw0()) {
                    if (!view.isEnabled()) {
                        String str4 = button.clickHint;
                        if (str4 != null) {
                            C26048AKe c26048AKe2 = new C26048AKe(view);
                            c26048AKe2.LJI(str4);
                            c26048AKe2.LJII();
                        }
                    } else {
                        PdpViewModel pdpViewModel3 = pdpButtonActionHelper.LJLIL;
                        pdpViewModel3.LLJJIJIL = true;
                        PdpViewModel.Tw0(1, 28, view, pdpViewModel3, null);
                    }
                    if (pdpButtonActionHelper.LJLIL.uw0()) {
                        IEventCenter LIZ = C26059AKp.LIZ();
                        JSONObject jSONObject = new JSONObject();
                        ProductPackStruct productPackStruct2 = pdpButtonActionHelper.LJLIL.LJLJLLL;
                        if (productPackStruct2 != null && (productBase = productPackStruct2.baseInfo) != null && (productPrice = productBase.priceInfo) != null) {
                            z2 = o.LJ(productPrice.needIcon, Boolean.TRUE);
                        }
                        jSONObject.put("is_buy_with_coupon", z2);
                        String jSONObject2 = jSONObject.toString();
                        o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
                        LIZ.LIZ("ec_buy_now_click", jSONObject2);
                    } else {
                        C70414RkI c70414RkI2 = pdpButtonActionHelper.LJLIL.LLFII;
                        if (c70414RkI2 != null) {
                            C70414RkI.LJJIL(c70414RkI2, "buy_now", Boolean.valueOf(view.isEnabled()), Boolean.valueOf(z), null, null, 24);
                        }
                        C70414RkI c70414RkI3 = pdpButtonActionHelper.LJLIL.LLFII;
                        if (c70414RkI3 != null) {
                            HashMap<String, Object> hashMap = new HashMap<>();
                            hashMap.put("is_clickable", V1M.LJJJJZ(view.isEnabled()));
                            hashMap.put("is_buy_with_coupon", V1M.LJJJJZ(z));
                            if (view.isEnabled()) {
                                str3 = "able_to_buy";
                            }
                            hashMap.put("button_type", str3);
                            c70414RkI3.LJJI("buy_now", hashMap);
                        }
                    }
                    C78565UsT.LJJIJ(pdpButtonActionHelper.LJLIL, MBB.INSTANCE, new C70076Req(pdpButtonActionHelper, null));
                    return;
                }
                C70414RkI c70414RkI4 = pdpButtonActionHelper.LJLIL.LLFII;
                if (c70414RkI4 == null) {
                    return;
                }
                String str5 = CardStruct.IStatusCode.DEFAULT;
                HashMap<String, Object> LIZJ = C03660Ck.LIZJ("is_clickable", CardStruct.IStatusCode.DEFAULT);
                if (z) {
                    str5 = "1";
                }
                LIZJ.put("is_buy_with_coupon", str5);
                LIZJ.put("button_type", "unable_to_buy");
                c70414RkI4.LJJI("buy_now", LIZJ);
                return;
            }
            Context context3 = view.getContext();
            if (pdpButtonActionHelper.LJLIL.LLIIIILZ) {
                C26048AKe c26048AKe3 = new C26048AKe(view);
                c26048AKe3.LJI(context3.getString(R.string.f3i));
                c26048AKe3.LJII();
                return;
            }
            Integer num2 = button.buttonStatus;
            int value5 = EnumC70052ReS.DISABLE.getValue();
            if (num2 != null && num2.intValue() == value5) {
                z2 = true;
            }
            String str6 = "unable_to_cart";
            if (pdpButtonActionHelper.LJLIL.sw0()) {
                PdpViewModel pdpViewModel4 = pdpButtonActionHelper.LJLIL;
                pdpViewModel4.LLJJJ = true;
                if (z2) {
                    String str7 = button.clickHint;
                    if (C78685UuP.LJJJZ(str7) && str7 != null) {
                        C26048AKe c26048AKe4 = new C26048AKe(view);
                        c26048AKe4.LJI(str7);
                        c26048AKe4.LJII();
                    }
                    PdpViewModel pdpViewModel5 = pdpButtonActionHelper.LJLIL;
                    ProductPackStruct productPackStruct3 = pdpViewModel5.LJLJLLL;
                    if (productPackStruct3 != null && (purchaseLimit = productPackStruct3.purchaseLimit) != null) {
                        str = purchaseLimit.LIZ(pdpViewModel5.lw0());
                    } else {
                        str = null;
                    }
                    if (C78685UuP.LJJJZ(str)) {
                        C78946Uyc.LJJIIJ(view, new C70947Rst(), new AqS178S0100000_12(pdpButtonActionHelper, 732));
                    }
                } else {
                    pdpViewModel4.Jv0(view, new IDqS38S0300000_12(pdpButtonActionHelper, view, context3, 1));
                    C78565UsT.LJJIJ(pdpButtonActionHelper.LJLIL, MBB.INSTANCE, new C70075Rep(pdpButtonActionHelper, null));
                }
                if (pdpButtonActionHelper.LJLIL.uw0()) {
                    Integer num3 = button.buttonStatus;
                    int value6 = EnumC70052ReS.ENABLE.getValue();
                    if (num3 != null && num3.intValue() == value6) {
                        str6 = "able_to_cart";
                    }
                    IEventCenter LIZ2 = C26059AKp.LIZ();
                    String jSONObject3 = C65232Piu.LIZJ("button_type", str6).toString();
                    o.LJIIIIZZ(jSONObject3, "JSONObject().apply {\n   …             }.toString()");
                    LIZ2.LIZ("ec_add_cart_click", jSONObject3);
                    return;
                }
                C70414RkI c70414RkI5 = pdpButtonActionHelper.LJLIL.LLFII;
                if (c70414RkI5 != null) {
                    HashMap<String, Object> hashMap2 = new HashMap<>();
                    hashMap2.put("is_clickable", V1M.LJJJJZ(view.isEnabled()));
                    if (!z2) {
                        str6 = "able_to_cart";
                    }
                    hashMap2.put("button_type", str6);
                    RT2 rt2 = PurchaseLimit.Companion;
                    PdpViewModel pdpViewModel6 = pdpButtonActionHelper.LJLIL;
                    ProductPackStruct productPackStruct4 = pdpViewModel6.LJLJLLL;
                    if (productPackStruct4 != null) {
                        purchaseLimit2 = productPackStruct4.purchaseLimit;
                    }
                    String lw0 = pdpViewModel6.lw0();
                    rt2.getClass();
                    hashMap2.put("is_new_user_discount_limit1", RT2.LIZ(purchaseLimit2, lw0));
                    c70414RkI5.LJJI("add_to_cart", hashMap2);
                }
                C70414RkI c70414RkI6 = pdpButtonActionHelper.LJLIL.LLFII;
                if (c70414RkI6 == null) {
                    return;
                }
                C70414RkI.LJJIL(c70414RkI6, "add_to_cart", null, null, null, null, 30);
                return;
            }
            C70414RkI c70414RkI7 = pdpButtonActionHelper.LJLIL.LLFII;
            if (c70414RkI7 == null) {
                return;
            }
            HashMap<String, Object> hashMap3 = new HashMap<>();
            hashMap3.put("is_clickable", V1M.LJJJJZ(view.isEnabled()));
            if (!z2) {
                str6 = "able_to_cart";
            }
            hashMap3.put("button_type", str6);
            RT2 rt22 = PurchaseLimit.Companion;
            PdpViewModel pdpViewModel7 = pdpButtonActionHelper.LJLIL;
            ProductPackStruct productPackStruct5 = pdpViewModel7.LJLJLLL;
            if (productPackStruct5 != null) {
                purchaseLimit2 = productPackStruct5.purchaseLimit;
            }
            String lw02 = pdpViewModel7.lw0();
            rt22.getClass();
            hashMap3.put("is_new_user_discount_limit1", RT2.LIZ(purchaseLimit2, lw02));
            c70414RkI7.LJJI("add_to_cart", hashMap3);
            return;
        }
        o.LJIJI("buttonActionHelper");
        throw null;
    }

    @Override // X.InterfaceC70181RgX
    public final void LIZIZ(C113724dE c113724dE, PdpButton pdpButton) {
        String str;
        boolean z;
        String str2;
        ProductBase productBase;
        ProductPrice productPrice;
        PdpButtonActionHelper pdpButtonActionHelper = this.LIZ.getViewModel().LLJL;
        if (pdpButtonActionHelper != null) {
            PdpFragment node = this.LIZ.LJLIL;
            o.LJIIIZ(node, "node");
            if (pdpButtonActionHelper.LJLILLLLZI.contains(String.valueOf(pdpButton.hashCode()))) {
                return;
            }
            pdpButtonActionHelper.LJLILLLLZI.add(String.valueOf(pdpButton.hashCode()));
            Integer num = pdpButton.buttonAction;
            int value = EnumC70033Re9.ADD_TO_CART.getValue();
            if (num == null || num.intValue() != value) {
                int value2 = EnumC70033Re9.BUY.getValue();
                if (num == null || num.intValue() != value2) {
                    EnumC70033Re9.SCHEMA.getValue();
                    if (num == null) {
                        return;
                    }
                    num.intValue();
                    return;
                }
                boolean isEnabled = c113724dE.isEnabled();
                ProductPackStruct productPackStruct = pdpButtonActionHelper.LJLIL.LJLJLLL;
                if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null && (productPrice = productBase.priceInfo) != null) {
                    z = o.LJ(productPrice.needIcon, Boolean.TRUE);
                } else {
                    z = false;
                }
                C70414RkI c70414RkI = pdpButtonActionHelper.LJLIL.LLFII;
                if (c70414RkI == null) {
                    return;
                }
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("is_clickable", V1M.LJJJJZ(isEnabled));
                if (isEnabled) {
                    str2 = "able_to_buy";
                } else {
                    str2 = "unable_to_buy";
                }
                hashMap.put("button_type", str2);
                hashMap.put("is_buy_with_coupon", V1M.LJJJJZ(z));
                c70414RkI.LJJIFFI("buy_now", hashMap);
                return;
            }
            if (c113724dE.isEnabled()) {
                str = "able_to_cart";
            } else {
                str = "unable_to_cart";
            }
            C70414RkI c70414RkI2 = pdpButtonActionHelper.LJLIL.LLFII;
            if (c70414RkI2 == null) {
                return;
            }
            HashMap<String, Object> LIZJ = C03660Ck.LIZJ("button_type", str);
            LIZJ.put("is_clickable", V1M.LJJJJZ(c113724dE.isEnabled()));
            c70414RkI2.LJJIFFI("add_to_cart", LIZJ);
            return;
        }
        o.LJIJI("buttonActionHelper");
        throw null;
    }
}
