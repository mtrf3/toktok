package com.ss.android.ugc.aweme.ecommerce.base.osp.widget;

import X.C16880lQ;
import X.C221108m2;
import X.C26260ASi;
import X.C26706Ady;
import X.C27102AkM;
import X.C27724AuO;
import X.C27739Aud;
import X.C27904AxI;
import X.C27923Axb;
import X.C27941Axt;
import X.C27944Axw;
import X.C27949Ay1;
import X.C28121B1x;
import X.C38350F3i;
import X.C45804HyK;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70356RjM;
import X.C73156SnQ;
import X.C78857UxB;
import X.C85990Xow;
import X.ORZ;
import X.OSZ;
import X.OUP;
import X.SY4;
import X.T5U;
import X.TBT;
import X.TBV;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospbottomwidget.IOspBottomBarStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionBanner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.StarlingKeyValue;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.ss.android.ugc.aweme.utils.Au2S6S0000000_4;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS167S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import ujb.s;
import wg5.c;

/* loaded from: classes5.dex */
public final class OrderSubmitBottomWidget extends JediBaseWidget implements c {
    public static final C27923Axb Companion = new C27923Axb();
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final C5H3 bottomBarStyle$delegate;
    public volatile boolean hideSummaryPanel;
    public String previousButtonName;
    public boolean totalTextShown;
    public final C5H3 viewModel$delegate;

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.widget.Widget
    public int getLayoutId() {
        return R.layout.a9x;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OrderSubmitBottomWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.viewModel$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 47));
        this.bottomBarStyle$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 228));
    }

    public final IOspBottomBarStyle getBottomBarStyle() {
        return (IOspBottomBarStyle) this.bottomBarStyle$delegate.getValue();
    }

    public final OrderSubmitViewModel getViewModel() {
        return (OrderSubmitViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.bytedance.widget.Widget
    public void onCreate() {
        LinkRichText buyerProtectionProgram;
        super.onCreate();
        View view = this.contentView;
        if (view != null) {
            view.findViewById(R.id.hqz).getClass();
            ((TextView) view.findViewById(R.id.lis)).setText(view.getContext().getString(R.string.r_m));
            ((TuxTextView) view.findViewById(R.id.lik)).setTuxFont(getBottomBarStyle().getTotalPriceFont());
            C28121B1x.LIZ.getClass();
            if (C28121B1x.LIZ() && getBottomBarStyle().getShowGuaranteeIcon()) {
                ((SY4) view.findViewById(R.id.hqz)).setButtonStartIcon(Integer.valueOf(R.raw.icon_shield_tick));
            }
            view.findViewById(R.id.b2o).setVisibility(8);
            BillInfoData billInfoData = getViewModel().LJZ;
            if (billInfoData != null && (buyerProtectionProgram = billInfoData.getBuyerProtectionProgram()) != null) {
                view.findViewById(R.id.b2o).setClickable(true);
                ((TextView) view.findViewById(R.id.b2o)).setMovementMethod(LinkMovementMethod.getInstance());
                ((TextView) view.findViewById(R.id.b2o)).setHighlightColor(0);
                TextView buyer_protection_program = (TextView) view.findViewById(R.id.b2o);
                o.LJIIIIZZ(buyer_protection_program, "buyer_protection_program");
                RichTextUtil richTextUtil = RichTextUtil.LIZ;
                Context context = view.getContext();
                o.LJIIIIZZ(context, "context");
                OUP.LJJLIIIJILLIZJL(buyer_protection_program, RichTextUtil.LIZJ(richTextUtil, context, buyerProtectionProgram, null, 0, false, 62, new AqS170S0100000_4(this, 298), 28));
            }
            C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AxG
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((OrderSubmitState) obj).isLoadingChunk();
                }
            }, new AqS167S0200000_4(view, this, 12));
            C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AjT
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((OrderSubmitState) obj).getSummaryInfo();
                }
            }, new AqS167S0200000_4(view, this, 14));
            C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Awv
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((OrderSubmitState) obj).getAddress();
                }
            }, new AqS186S0100000_4(view, 83));
            C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AkL
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((OrderSubmitState) obj).getTotalDesc();
                }
            }, new AqS186S0100000_4(view, 84));
            if (getSkuQuantityFromServer()) {
                C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AxP
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((OrderSubmitState) obj).getSkuTotalQuantity();
                    }
                }, new AqS167S0200000_4(view, this, 11));
            } else {
                C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AxM
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Integer.valueOf(((OrderSubmitState) obj).getTotalItems());
                    }
                }, new AqS167S0200000_4(view, this, 13));
            }
            C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Awf
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((OrderSubmitState) obj).getHideSummaryPanel());
                }
            }, new AqS167S0200000_4(view, this, 15));
            C73156SnQ.LJIIJ(this, getViewModel(), new TBT() { // from class: X.AxN
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((OrderSubmitState) obj).getHasAddress());
                }
            }, new TBV() { // from class: X.Avc
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj) {
                    return ((OrderSubmitState) obj).getUserPaymentInfo();
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj, Object obj2) {
                    ((OrderSubmitState) obj).setUserPaymentInfo((PaymentInfo) obj2);
                }
            }, new TBT() { // from class: X.Ax2
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((OrderSubmitState) obj).getHasAvailableOrders());
                }
            }, new TBT() { // from class: X.Aww
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((OrderSubmitState) obj).getAddress();
                }
            }, new C27904AxI(view, this));
            C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AxO
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((OrderSubmitState) obj).getReachableAny());
                }
            }, new AqS167S0200000_4(view, this, 16));
            C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AwQ
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((OrderSubmitState) obj).getOrderSummaryPanelOpened());
                }
            }, new AqS186S0100000_4(view, 85));
            C73156SnQ.LJIIJ(this, getViewModel(), new TBT() { // from class: X.AxQ
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((OrderSubmitState) obj).getBottomNotice();
                }
            }, new TBT() { // from class: X.AwR
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((OrderSubmitState) obj).getOrderSummaryPanelOpened());
                }
            }, new TBT() { // from class: X.Ax3
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((OrderSubmitState) obj).getBottomPromotionBannerDismissed());
                }
            }, new TBT() { // from class: X.AuY
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((OrderSubmitState) obj).getPlatformDiscounts();
                }
            }, new C27102AkM(view, this));
            View place_order = view.findViewById(R.id.hqz);
            o.LJIIIIZZ(place_order, "place_order");
            C16880lQ.LJIIJ(new Au2S14S0200000_4(this, view, 8), place_order);
            View total_price_desc = view.findViewById(R.id.lil);
            o.LJIIIIZZ(total_price_desc, "total_price_desc");
            C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 38, 42), total_price_desc);
            View summary_panel_touch_area = view.findViewById(R.id.ktu);
            o.LJIIIIZZ(summary_panel_touch_area, "summary_panel_touch_area");
            C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 39, 42), summary_panel_touch_area);
            View promotion_banner_dismiss_button = view.findViewById(R.id.ic1);
            o.LJIIIIZZ(promotion_banner_dismiss_button, "promotion_banner_dismiss_button");
            C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 40, 42), promotion_banner_dismiss_button);
            C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AxS
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((OrderSubmitState) obj).getButtonPopTips();
                }
            }, new AqS186S0100000_4(view, 81));
            C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AxH
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((OrderSubmitState) obj).getCashbackNotice();
                }
            }, new AqS167S0200000_4(view, this, 10));
            C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AxL
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((OrderSubmitState) obj).getTotalItems());
                }
            }, new AqS186S0100000_4(this, 82));
        }
    }

    public final void toggleSummaryPanel() {
        C27949Ay1.LJJI("total", getViewModel().fw0(false), null, null, null, null, null, null, null, 1020);
        withState(getViewModel(), new AqS170S0100000_4(this, 299));
    }

    private final boolean getSkuQuantityFromServer() {
        String upperCase = C85990Xow.LIZIZ().toUpperCase(Locale.ROOT);
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (o.LJ(upperCase, "US") || o.LJ(upperCase, "GB")) {
            return true;
        }
        return false;
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    public final SpannableString getTotalItemsText(int i) {
        SpannableString spannableString = new SpannableString(getContext().getResources().getQuantityString(R.plurals.er, i, Integer.valueOf(i)));
        int LJJLIIIJL = s.LJJLIIIJL(spannableString, "(", 0, false, 6);
        int LJJLIIIJL2 = s.LJJLIIIJL(spannableString, ")", 0, false, 6) + 1;
        if (LJJLIIIJL != -1 && LJJLIIIJL2 != -1 && LJJLIIIJL < LJJLIIIJL2) {
            spannableString.setSpan(new T5U(31, true), LJJLIIIJL, LJJLIIIJL2, 33);
        }
        return spannableString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void trackPlaceOrderButtonClick(OrderSubmitState orderSubmitState) {
        String str;
        String str2;
        String str3;
        boolean z;
        String str4;
        String str5;
        C70356RjM c70356RjM;
        float f;
        float f2;
        List<ShopOrderNew> newShopOrders;
        ShopOrderNew shopOrderNew;
        List<MainOrderInfo> list;
        MainOrderInfo mainOrderInfo;
        List<PackedSku> list2;
        PackedSku packedSku;
        SkuPrice price;
        String str6;
        Float LJJIJLIJ;
        List<ShopOrderNew> newShopOrders2;
        ShopOrderNew shopOrderNew2;
        List<MainOrderInfo> list3;
        MainOrderInfo mainOrderInfo2;
        List<PackedSku> list4;
        PackedSku packedSku2;
        SkuPrice price2;
        Price price3;
        String priceVal;
        Float LJJIJLIJ2;
        BillInfoData billInfoData;
        List<ShopOrderNew> newShopOrders3;
        ShopOrderNew shopOrderNew3;
        List<MainOrderInfo> list5;
        MainOrderInfo mainOrderInfo3;
        List<LogisticDTO> list6;
        LogisticDTO logisticDTO;
        Map<String, String> map;
        Summary summary;
        PaymentMethod paymentMethod;
        BindInfo bindInfo;
        PaymentMethod paymentMethod2;
        PaymentMethodInfo paymentMethodInfo;
        Summary summary2;
        Price total;
        StarlingKeyValue placeOrderButtonText;
        String LIZIZ = C27944Axw.LIZIZ(getViewModel().LJLL, getViewModel().LLJJIJIL);
        String LIZ = C27944Axw.LIZ(getViewModel().LJLL);
        BillInfoData billInfoData2 = getViewModel().LJZ;
        String str7 = null;
        if (billInfoData2 != null && (placeOrderButtonText = billInfoData2.getPlaceOrderButtonText()) != null) {
            str = placeOrderButtonText.key;
        } else {
            str = null;
        }
        if (o.LJ(str, "ecom_order_summary_button_placeorder")) {
            str = "place_order";
        } else if (o.LJ(str, "ecom_order_summary_button_paynow")) {
            str = "pay_now";
        } else if (str == null) {
            str = "";
        }
        BillInfoData billInfoData3 = getViewModel().LJZ;
        if (billInfoData3 != null && (summary2 = billInfoData3.getSummary()) != null && (total = summary2.getTotal()) != null) {
            str2 = total.getPriceStr();
        } else {
            str2 = null;
        }
        PaymentInfo userPaymentInfo = orderSubmitState.getUserPaymentInfo();
        if (userPaymentInfo != null && (paymentMethodInfo = userPaymentInfo.paymentMethodInfo) != null) {
            str3 = paymentMethodInfo.getTenure();
        } else {
            str3 = null;
        }
        C27941Axt c27941Axt = getViewModel().LJLL;
        int i = 0;
        if (c27941Axt != null) {
            z = c27941Axt.LIZ();
        } else {
            z = false;
        }
        OSZ LJFF = C27949Ay1.LJFF(orderSubmitState.getUserPaymentInfo(), getViewModel().Yv0());
        HashMap<String, Object> fw0 = getViewModel().fw0(false);
        if (z) {
            fw0.put("add_on_track_id", LIZIZ);
            fw0.put("add_on_source_page_type", "add_on_order_submit_rec");
            fw0.put("add_on_entrance_form", "append_goods_card");
        }
        fw0.put("is_delivery_info_complete_when_place_order", Integer.valueOf(orderSubmitState.getHasAddress() ? 1 : 0));
        PaymentInfo userPaymentInfo2 = orderSubmitState.getUserPaymentInfo();
        if (userPaymentInfo2 != null) {
            i = o.LJ(userPaymentInfo2.isValid, Boolean.TRUE);
        }
        fw0.put("is_pay_info_complete_when_place_order", Integer.valueOf(i));
        PaymentInfo userPaymentInfo3 = orderSubmitState.getUserPaymentInfo();
        if (userPaymentInfo3 != null && (paymentMethod2 = userPaymentInfo3.paymentMethod) != null) {
            str4 = paymentMethod2.LJIIL();
        } else {
            str4 = null;
        }
        PaymentInfo userPaymentInfo4 = orderSubmitState.getUserPaymentInfo();
        if (userPaymentInfo4 != null && (paymentMethod = userPaymentInfo4.paymentMethod) != null && (bindInfo = paymentMethod.bindInfo) != null) {
            str5 = bindInfo.bindStatus;
        } else {
            str5 = null;
        }
        Boolean valueOf = Boolean.valueOf(getViewModel().LLD);
        if (!z) {
            LIZIZ = null;
            LIZ = null;
        }
        HashMap<String, Object> Xv0 = getViewModel().Xv0();
        Boolean bool = (Boolean) LJFF.getFirst();
        Boolean bool2 = (Boolean) LJFF.getSecond();
        BillInfoData billInfoData4 = getViewModel().LJZ;
        if (billInfoData4 != null && (summary = billInfoData4.getSummary()) != null) {
            c70356RjM = g0.LJJJJIZL(summary);
        } else {
            c70356RjM = null;
        }
        if (getViewModel().LJLJJLL == 0 && (billInfoData = getViewModel().LJZ) != null && (newShopOrders3 = billInfoData.getNewShopOrders()) != null && (shopOrderNew3 = (ShopOrderNew) ORZ.LJLLLL(newShopOrders3)) != null && (list5 = shopOrderNew3.mainOrderInfos) != null && (mainOrderInfo3 = (MainOrderInfo) ORZ.LJLLLL(list5)) != null && (list6 = mainOrderInfo3.logistics) != null && (logisticDTO = (LogisticDTO) ORZ.LJLLLL(list6)) != null && (map = logisticDTO.eventTrackInfo) != null) {
            str7 = C27739Aud.LJI(map);
        }
        String iw0 = getViewModel().iw0();
        HashMap<String, String> hashMap = getViewModel().LLJLLIL;
        OrderSubmitViewModel viewModel = getViewModel();
        viewModel.getClass();
        HashMap hashMap2 = new HashMap();
        if (viewModel.LJLJJLL == 0) {
            BillInfoData billInfoData5 = viewModel.LJZ;
            if (billInfoData5 != null && (newShopOrders2 = billInfoData5.getNewShopOrders()) != null && (shopOrderNew2 = (ShopOrderNew) ORZ.LJLLLL(newShopOrders2)) != null && (list3 = shopOrderNew2.mainOrderInfos) != null && (mainOrderInfo2 = (MainOrderInfo) ORZ.LJLLLL(list3)) != null && (list4 = mainOrderInfo2.packedSkus) != null && (packedSku2 = (PackedSku) ORZ.LJLLLL(list4)) != null && (price2 = packedSku2.getPrice()) != null && (price3 = price2.realPrice) != null && (priceVal = price3.getPriceVal()) != null && (LJJIJLIJ2 = C38350F3i.LJJIJLIJ(priceVal)) != null) {
                f = LJJIJLIJ2.floatValue();
            } else {
                f = 0.0f;
            }
            BillInfoData billInfoData6 = viewModel.LJZ;
            if (billInfoData6 != null && (newShopOrders = billInfoData6.getNewShopOrders()) != null && (shopOrderNew = (ShopOrderNew) ORZ.LJLLLL(newShopOrders)) != null && (list = shopOrderNew.mainOrderInfos) != null && (mainOrderInfo = (MainOrderInfo) ORZ.LJLLLL(list)) != null && (list2 = mainOrderInfo.packedSkus) != null && (packedSku = (PackedSku) ORZ.LJLLLL(list2)) != null && (price = packedSku.getPrice()) != null && (str6 = price.originalPriceVal) != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(str6)) != null) {
                f2 = LJJIJLIJ.floatValue();
            } else {
                f2 = f;
            }
            hashMap2.put("original_price_value", Float.valueOf(f));
            hashMap2.put("sale_price_value", Float.valueOf(f2));
        }
        C27949Ay1.LJIJ(str, "place_order", fw0, null, null, null, str4, str5, str2, str3, valueOf, LIZIZ, LIZ, Xv0, null, bool, bool2, c70356RjM, str7, iw0, hashMap, hashMap2, null, 251724016);
    }

    public final void handlePromotionBanner(View view, boolean z, C27724AuO c27724AuO) {
        String str;
        String str2;
        String str3;
        PromotionBanner promotionBanner;
        PromotionBanner promotionBanner2;
        PromotionBanner promotionBanner3;
        if (z && view.findViewById(R.id.ibz).getVisibility() != 8) {
            View promotion_banner = view.findViewById(R.id.ibz);
            o.LJIIIIZZ(promotion_banner, "promotion_banner");
            C26260ASi c26260ASi = new C26260ASi(promotion_banner);
            c26260ASi.setDuration(300L);
            view.findViewById(R.id.ibz).startAnimation(c26260ASi);
            return;
        }
        Drawable drawable = null;
        if (c27724AuO != null && (promotionBanner3 = c27724AuO.LJIILJJIL) != null) {
            str = promotionBanner3.bannerText;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView = (TextView) view.findViewById(R.id.ic2);
            if (c27724AuO != null && (promotionBanner2 = c27724AuO.LJIILJJIL) != null) {
                str2 = promotionBanner2.bannerText;
            } else {
                str2 = null;
            }
            textView.setText(str2);
            if (c27724AuO != null && (promotionBanner = c27724AuO.LJIILJJIL) != null) {
                str3 = promotionBanner.linkSchema;
            } else {
                str3 = null;
            }
            if (C78857UxB.LJJJIL(str3)) {
                View findViewById = view.findViewById(R.id.ibz);
                Context context = view.getContext();
                o.LJIIIIZZ(context, "context");
                try {
                    drawable = context.getDrawable(R.drawable.afb);
                } catch (Exception unused) {
                }
                findViewById.setBackground(drawable);
                View promotion_banner2 = view.findViewById(R.id.ibz);
                o.LJIIIIZZ(promotion_banner2, "promotion_banner");
                C16880lQ.LJIIJ(new Au2S14S0200000_4(this, view, 7), promotion_banner2);
                C45804HyK.LJJLL(view.findViewById(R.id.ic0));
            } else {
                View promotion_banner3 = view.findViewById(R.id.ibz);
                o.LJIIIIZZ(promotion_banner3, "promotion_banner");
                C16880lQ.LJIIJ(new Au2S6S0000000_4(0), promotion_banner3);
                View findViewById2 = view.findViewById(R.id.ibz);
                Context context2 = view.getContext();
                o.LJIIIIZZ(context2, "context");
                try {
                    drawable = context2.getDrawable(R.drawable.afa);
                } catch (Exception unused2) {
                }
                findViewById2.setBackground(drawable);
                C45804HyK.LJJIJIIJIL(view.findViewById(R.id.ic0));
            }
            if (view.findViewById(R.id.ibz).getVisibility() == 0 || z) {
                return;
            }
            C27949Ay1.LJJIFFI(C27949Ay1.LIZ, "discount_reminder", getViewModel().fw0(false), null, null, null, null, null, 2044);
            view.findViewById(R.id.ibz).setVisibility(0);
            return;
        }
        view.findViewById(R.id.ibz).setVisibility(8);
    }
}
