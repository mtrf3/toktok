package com.ss.android.ugc.aweme.ecommerce.base.pdp.widget;

import X.AnonymousClass636;
import X.C00F;
import X.C113724dE;
import X.C16880lQ;
import X.C221108m2;
import X.C26706Ady;
import X.C26901Ah7;
import X.C27162AlK;
import X.C27534ArK;
import X.C27558Ari;
import X.C27560Ark;
import X.C27739Aud;
import X.C27740Aue;
import X.C40925G4j;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C69684RWm;
import X.C70080Reu;
import X.C70085Rez;
import X.C70414RkI;
import X.C70918RsQ;
import X.C73156SnQ;
import X.C76800UCe;
import X.C78450Uqc;
import X.C78565UsT;
import X.C78613UtF;
import X.C78946Uyc;
import X.C78948Uye;
import X.EnumC70180RgW;
import X.InterfaceC26903Ah9;
import X.InterfaceC65784Pro;
import X.InterfaceC65895Ptb;
import X.InterfaceC72712tH;
import X.M06;
import X.SC5;
import X.SY4;
import X.TBT;
import Y.IDeS357S0100000_12;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.IPdpBottomNavWidgetStyle;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.Au2S0S1101000_4;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS5S1001000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class PdpBottomNavBarWidget extends JediBaseWidget implements InterfaceC72712tH, InterfaceC26903Ah9, c {
    public Map<Integer, View> _$_findViewCache;
    public boolean addToCartShow;
    public final PdpFragment fragment;
    public boolean hasReportBuyNow;
    public int lastUnreadMsgNum;
    public C70085Rez pdpBottomNavBarTipsViewGroup;
    public String sellerId;
    public boolean showUnreadMsgHint;
    public final C5H3 skeletonView$delegate;
    public final C5H3 slowFunXmlOptEnable$delegate;
    public final C5H3 style$delegate;
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
        return R.layout.xu;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final View getSkeletonView() {
        return (View) this.skeletonView$delegate.getValue();
    }

    private final boolean getSlowFunXmlOptEnable() {
        return ((Boolean) this.slowFunXmlOptEnable$delegate.getValue()).booleanValue();
    }

    private final void updateUnreadMsgHint() {
        TuxAlertBadgeLayout tuxAlertBadgeLayout;
        TuxAlertBadgeLayout tuxAlertBadgeLayout2;
        if (this.showUnreadMsgHint) {
            View view = this.contentView;
            if (view != null && (tuxAlertBadgeLayout2 = (TuxAlertBadgeLayout) view.findViewById(R.id.edt)) != null) {
                tuxAlertBadgeLayout2.LIZJ();
                return;
            }
            return;
        }
        View view2 = this.contentView;
        if (view2 == null || (tuxAlertBadgeLayout = (TuxAlertBadgeLayout) view2.findViewById(R.id.edt)) == null) {
            return;
        }
        tuxAlertBadgeLayout.LIZIZ();
    }

    public final C70085Rez getBottomTipsView() {
        View view;
        Context context;
        if (this.pdpBottomNavBarTipsViewGroup == null && (view = this.contentView) != null && (context = view.getContext()) != null) {
            C70085Rez c70085Rez = new C70085Rez(context);
            ((ViewGroup) _$_findCachedViewById(R.id.l9d)).addView(c70085Rez, new ViewGroup.LayoutParams(-1, -2));
            this.pdpBottomNavBarTipsViewGroup = c70085Rez;
            return c70085Rez;
        }
        return this.pdpBottomNavBarTipsViewGroup;
    }

    public final IPdpBottomNavWidgetStyle getStyle() {
        return (IPdpBottomNavWidgetStyle) this.style$delegate.getValue();
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.viewModel$delegate.getValue();
    }

    private final boolean isLoading() {
        return getViewModel().LLIIII;
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.bytedance.widget.Widget
    public void onCreate() {
        super.onCreate();
        View view = this.contentView;
        if (view != null) {
            C78948Uye.LJIJJLI(view, this.fragment);
        }
        getViewModel().dx0(this);
        View view2 = this.contentView;
        if (view2 != null) {
            View findViewById = view2.findViewById(R.id.b2p);
            getStyle().getButtonNewRadiusDesign();
            findViewById.getClass();
            View findViewById2 = view2.findViewById(R.id.wn);
            getStyle().getButtonNewRadiusDesign();
            findViewById2.getClass();
            ((TextView) view2.findViewById(R.id.wn)).setMaxLines(2);
            ((SY4) view2.findViewById(R.id.b2p)).setSupportClickWhenDisable(true);
            View findViewById3 = view2.findViewById(R.id.b2p);
            o.LJIIIIZZ(findViewById3, "it.buynow_btn");
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 14, 42), findViewById3);
            View findViewById4 = view2.findViewById(R.id.jnv);
            o.LJIIIIZZ(findViewById4, "it.seller_shop_icon");
            C78565UsT.LJJIZ(findViewById4, null, new C27560Ark(this, null), 3);
        }
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.RgN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getLoadingStatus());
            }
        }, new AqS186S0100000_4(this, 92));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rbg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getBottomBarVO();
            }
        }, new AqS194S0100000_12(this, 63));
        subscribeEvent("ec_clear_unread_msg");
    }

    @Override // com.bytedance.widget.Widget
    public void onDestroy() {
        getViewModel().mx0(this);
        onClearEvent();
        super.onDestroy();
    }

    public final C70085Rez getPdpBottomNavBarTipsViewGroup() {
        return this.pdpBottomNavBarTipsViewGroup;
    }

    public void onClearEvent() {
        C26901Ah7.LIZ(this);
    }

    public PdpBottomNavBarWidget(PdpFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.viewModel$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 73));
        this.showUnreadMsgHint = true;
        this.lastUnreadMsgNum = -1;
        this.skeletonView$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 376));
        this.style$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 377));
        this.slowFunXmlOptEnable$delegate = C221108m2.LIZIZ(C27534ArK.LJLIL);
    }

    @Override // X.InterfaceC72712tH
    public void onCountDown(long j) {
        C70085Rez bottomTipsView;
        if (!getViewModel().LLIIII && (bottomTipsView = getBottomTipsView()) != null) {
            PdpViewModel viewModel = getViewModel();
            o.LJIIIZ(viewModel, "viewModel");
            int length = bottomTipsView.LJLIL.length();
            String LIZIZ = C70085Rez.LIZIZ(j, viewModel);
            if (o.LJ(LIZIZ, C27162AlK.LJIIJJI)) {
                bottomTipsView.LIZ(R.id.hkc).setVisibility(8);
                return;
            }
            ((TextView) bottomTipsView.LIZ(R.id.hkd)).setText(bottomTipsView.LJLIL.append((CharSequence) LIZIZ));
            SpannableStringBuilder spannableStringBuilder = bottomTipsView.LJLIL;
            spannableStringBuilder.delete(length, spannableStringBuilder.length());
        }
    }

    public final void setPdpBottomNavBarTipsViewGroup(C70085Rez c70085Rez) {
        this.pdpBottomNavBarTipsViewGroup = c70085Rez;
    }

    public void subscribeEvent(String... strArr) {
        C26901Ah7.LIZIZ(this, strArr);
    }

    public final void updateUI(C69684RWm c69684RWm) {
        Context context;
        String str;
        String str2;
        SellerInfo sellerInfo;
        String str3;
        SellerInfo sellerInfo2;
        boolean z;
        int i;
        int i2;
        String value;
        int i3;
        M06 m06;
        Integer num;
        Integer num2;
        Boolean bool;
        Object obj;
        String str4;
        View findViewById;
        String string;
        View findViewById2;
        View view = this.contentView;
        if (view == null || (context = view.getContext()) == null) {
            return;
        }
        View view2 = this.contentView;
        if (view2 != null) {
            BuyButton buyButton = c69684RWm.LJ;
            if (buyButton != null && o.LJ(buyButton.isHide, Boolean.TRUE) && (findViewById2 = view2.findViewById(R.id.b2p)) != null) {
                findViewById2.setVisibility(8);
            }
            TextView textView = (TextView) view2.findViewById(R.id.b2p);
            if (textView != null) {
                textView.setMaxLines(2);
            }
            TextView textView2 = (TextView) view2.findViewById(R.id.b2p);
            if (textView2 != null) {
                BuyButton buyButton2 = c69684RWm.LJ;
                if (buyButton2 == null || (string = buyButton2.desc) == null) {
                    if (o.LJ(c69684RWm.LIZLLL, Boolean.TRUE)) {
                        string = context.getString(R.string.f4r);
                    } else {
                        string = context.getString(R.string.f2y);
                    }
                }
                textView2.setText(string);
            }
            int i4 = c69684RWm.LIZ;
            if (i4 == 3 || i4 == 2 || i4 == 4) {
                SY4 sy4 = (SY4) view2.findViewById(R.id.b2p);
                if (sy4 != null) {
                    sy4.setEnabled(false);
                }
                View findViewById3 = view2.findViewById(R.id.b2p);
                if (findViewById3 != null) {
                    findViewById3.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cf, context));
                }
                TextView textView3 = (TextView) view2.findViewById(R.id.b2p);
                if (textView3 != null) {
                    textView3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context));
                }
            }
            if (c69684RWm.LIZ == 1) {
                SY4 sy42 = (SY4) view2.findViewById(R.id.wn);
                if (sy42 != null) {
                    sy42.setEnabled(true);
                }
                SY4 sy43 = (SY4) view2.findViewById(R.id.b2p);
                if (sy43 != null) {
                    sy43.setEnabled(true);
                }
            } else {
                SY4 sy44 = (SY4) view2.findViewById(R.id.wn);
                if (sy44 != null) {
                    sy44.setEnabled(false);
                }
            }
            C113724dE buynow_btn = (C113724dE) view2.findViewById(R.id.b2p);
            o.LJIIIIZZ(buynow_btn, "buynow_btn");
            setButtonStyle(buynow_btn, Integer.valueOf(EnumC70180RgW.BUY_STYLE.getValue()), c69684RWm.LIZIZ);
        }
        if (isLoading()) {
            View view3 = this.contentView;
            if (view3 != null) {
                view3.setVisibility(0);
                if (getSkeletonView() != null) {
                    View findViewById4 = view3.findViewById(R.id.agl);
                    o.LJIIIIZZ(findViewById4, "it.bar");
                    findViewById4.setVisibility(8);
                    View skeletonView = getSkeletonView();
                    if (skeletonView != null) {
                        skeletonView.setVisibility(0);
                    }
                }
            }
        } else {
            SellerInfo sellerInfo3 = c69684RWm.LIZJ;
            if (sellerInfo3 != null) {
                str = sellerInfo3.imSchema;
            } else {
                str = null;
            }
            View view4 = this.contentView;
            if (view4 != null) {
                view4.setVisibility(0);
                View findViewById5 = view4.findViewById(R.id.agl);
                o.LJIIIIZZ(findViewById5, "it.bar");
                findViewById5.setVisibility(0);
                View skeletonView2 = getSkeletonView();
                if (skeletonView2 != null) {
                    skeletonView2.setVisibility(8);
                }
                if (str != null && (!ujb.o.LJJJJJL(str))) {
                    view4.findViewById(R.id.eex).setVisibility(0);
                    if (this.showUnreadMsgHint && (num2 = c69684RWm.LJIIJ) != null && num2.intValue() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.showUnreadMsgHint = z;
                    if (z && (num = c69684RWm.LJIIJ) != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    ((TuxAlertBadgeLayout) view4.findViewById(R.id.edt)).setCount(i);
                    if (C00F.LIZ(31744, 0, "ecom_unread_msg_hint_config", true) == 1) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    int i5 = i2 ^ 1;
                    ((TuxAlertBadgeLayout) view4.findViewById(R.id.edt)).setVariant(i5);
                    updateUnreadMsgHint();
                    if (this.showUnreadMsgHint) {
                        if (i5 == 0) {
                            m06 = M06.NORMAL;
                        } else {
                            m06 = M06.NUMBER;
                        }
                        value = m06.getValue();
                    } else {
                        value = M06.NONE.getValue();
                    }
                    View findViewById6 = view4.findViewById(R.id.eex);
                    o.LJIIIIZZ(findViewById6, "it.im_icon");
                    C16880lQ.LJIIJ(new Au2S0S1101000_4(this, value, i, 0), findViewById6);
                    if (i != this.lastUnreadMsgNum) {
                        View findViewById7 = view4.findViewById(R.id.eex);
                        o.LJIIIIZZ(findViewById7, "it.im_icon");
                        C78946Uyc.LJJIIJ(findViewById7, new C70918RsQ(0), new AqS5S1001000_12(value, i, 0));
                    }
                    this.lastUnreadMsgNum = i;
                    ((TuxAlertBadgeLayout) view4.findViewById(R.id.edt)).setCount(i);
                    TuxAlertBadgeLayout tuxAlertBadgeLayout = (TuxAlertBadgeLayout) view4.findViewById(R.id.edt);
                    if (C00F.LIZ(31744, 0, "ecom_unread_msg_hint_config", true) == 1) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    tuxAlertBadgeLayout.setVariant(i3 ^ 1);
                    updateUnreadMsgHint();
                } else {
                    view4.findViewById(R.id.eex).setVisibility(8);
                }
                SellerInfo sellerInfo4 = c69684RWm.LIZJ;
                if (sellerInfo4 == null || (str2 = sellerInfo4.imSchema) == null || ujb.o.LJJJJJL(str2) || (sellerInfo = c69684RWm.LIZJ) == null || (str3 = sellerInfo.name) == null || str3.length() == 0 || ((sellerInfo2 = c69684RWm.LIZJ) != null && o.LJ(sellerInfo2.isHide, Boolean.TRUE))) {
                    view4.findViewById(R.id.jnv).setVisibility(8);
                } else {
                    view4.findViewById(R.id.jnv).setVisibility(0);
                }
            }
        }
        View view5 = this.contentView;
        if (view5 != null) {
            ((TuxIconView) view5.findViewById(R.id.jnv).findViewById(R.id.jnx)).setTintColorRes(R.attr.go);
            ((TuxTextView) view5.findViewById(R.id.jnv).findViewById(R.id.jny)).setTextColorRes(R.attr.go);
            ((TuxIconView) view5.findViewById(R.id.eex).findViewById(R.id.ef0)).setTintColorRes(R.attr.go);
            ((TuxTextView) view5.findViewById(R.id.eex).findViewById(R.id.eez)).setTextColorRes(R.attr.go);
        }
        View view6 = this.contentView;
        if (view6 != null && (findViewById = view6.findViewById(R.id.b2p)) != null) {
            bool = Boolean.valueOf(findViewById.isEnabled());
        } else {
            bool = null;
        }
        if (this.hasReportBuyNow) {
            return;
        }
        this.hasReportBuyNow = true;
        C70414RkI c70414RkI = getViewModel().LLFII;
        if (c70414RkI != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            String str5 = "1";
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap.put("is_clickable", obj);
                if (bool.booleanValue()) {
                    str4 = "able_to_buy";
                } else {
                    str4 = "unable_to_buy";
                }
                hashMap.put("button_type", str4);
            }
            if (!o.LJ(c69684RWm.LIZLLL, Boolean.TRUE)) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_buy_with_coupon", str5);
            c70414RkI.LJJIFFI("buy_now", hashMap);
        }
    }

    public final void checkLoginAndDo(Context context, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        IAccountService LJIJ = AccountService.LJIJ();
        if (!LJIJ.LJFF().isLogin()) {
            InterfaceC65895Ptb LJI = LJIJ.LJI();
            C78450Uqc c78450Uqc = new C78450Uqc();
            c78450Uqc.LIZ = C27740Aue.LIZ(context);
            c78450Uqc.LJ = new IDeS357S0100000_12(interfaceC65784Pro, 1);
            C40925G4j.LIZ(c78450Uqc, LJI);
            return;
        }
        interfaceC65784Pro.invoke();
    }

    @Override // X.InterfaceC60061Nhh
    public void onEvent(String str, String str2) {
        Object obj;
        String str3;
        if (SC5.LIZIZ(str, "eventName", str2, "params", str, "ec_clear_unread_msg") && this.sellerId != null) {
            HashMap<String, Object> LJII = C27739Aud.LJII(str2);
            if (LJII != null) {
                obj = LJII.get("seller_id");
            } else {
                obj = null;
            }
            if (o.LJ(obj, this.sellerId)) {
                this.showUnreadMsgHint = false;
                updateUnreadMsgHint();
                PdpViewModel viewModel = getViewModel();
                ProductPackStruct productPackStruct = viewModel.LJLJLLL;
                if (productPackStruct != null && (str3 = productPackStruct.productId) != null) {
                    C78565UsT.LJJIJ(viewModel, C78613UtF.LIZJ, new C27558Ari(str3, null));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showCart(com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton r15, int r16) {
        /*
            r14 = this;
            r8 = r14
            android.view.View r5 = r8.contentView
            if (r5 == 0) goto L69
            r11 = 0
            if (r15 == 0) goto Lc9
            java.lang.Integer r1 = r15.status
        La:
            java.lang.String r4 = "it.addcart_btn"
            r6 = 0
            r3 = 1
            r2 = 2131362277(0x7f0a01e5, float:1.834433E38)
            if (r1 != 0) goto L6d
        L13:
            android.view.View r1 = r5.findViewById(r2)
            r0 = 8
            r1.setVisibility(r0)
            r1 = r11
        L1d:
            boolean r0 = r8.addToCartShow
            if (r0 != 0) goto L57
            android.view.View r0 = r5.findViewById(r2)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L57
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r0 = r8.getViewModel()
            X.RkI r7 = r0.LLFII
            if (r7 == 0) goto L55
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            if (r1 == 0) goto L3f
            java.lang.String r0 = "button_type"
            r6.put(r0, r1)
        L3f:
            android.view.View r0 = r5.findViewById(r2)
            boolean r0 = r0.isClickable()
            if (r0 == 0) goto L6a
            java.lang.String r1 = "1"
        L4b:
            java.lang.String r0 = "is_clickable"
            r6.put(r0, r1)
            java.lang.String r0 = "add_to_cart"
            r7.LJJIFFI(r0, r6)
        L55:
            r8.addToCartShow = r3
        L57:
            android.view.View r0 = r5.findViewById(r2)
            X.4dE r0 = (X.C113724dE) r0
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r4)
            if (r15 == 0) goto L64
            java.lang.Integer r11 = r15.buttonStyle
        L64:
            r1 = r16
            r8.setButtonStyle(r0, r11, r1)
        L69:
            return
        L6a:
            java.lang.String r1 = "0"
            goto L4b
        L6d:
            int r0 = r1.intValue()
            if (r0 != r3) goto L9b
            android.view.View r0 = r5.findViewById(r2)
            r0.setVisibility(r6)
            android.view.View r1 = r5.findViewById(r2)
            X.SY4 r1 = (X.SY4) r1
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r0 = r8.getViewModel()
            boolean r0 = r0.sw0()
            r1.setEnabled(r0)
            r9 = 0
            android.view.View r10 = r5.findViewById(r2)
            kotlin.jvm.internal.o.LJIIIIZZ(r10, r4)
            r12 = 4
            r13 = r11
            setAddCartClickAction$default(r8, r9, r10, r11, r12, r13)
            java.lang.String r1 = "able_to_cart"
            goto L1d
        L9b:
            int r1 = r1.intValue()
            r0 = 2
            if (r1 != r0) goto L13
            android.view.View r0 = r5.findViewById(r2)
            r0.setVisibility(r6)
            android.view.View r0 = r5.findViewById(r2)
            X.SY4 r0 = (X.SY4) r0
            r0.setEnabled(r6)
            android.view.View r0 = r5.findViewById(r2)
            X.SY4 r0 = (X.SY4) r0
            r0.setSupportClickWhenDisable(r3)
            android.view.View r0 = r5.findViewById(r2)
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r4)
            r8.setAddCartClickAction(r3, r0, r15)
            java.lang.String r1 = "unable_to_cart"
            goto L1d
        Lc9:
            r1 = r11
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBottomNavBarWidget.showCart(com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton, int):void");
    }

    private final void setAddCartClickAction(boolean z, View view, AddToCartButton addToCartButton) {
        C16880lQ.LJIIJ(new C70080Reu(this, z, addToCartButton, view), view);
    }

    private final void setButtonStyle(C113724dE c113724dE, Integer num, int i) {
        int i2;
        c113724dE.setStyle(Integer.valueOf(i));
        int value = EnumC70180RgW.BUY_STYLE.getValue();
        if (num == null || num.intValue() != value) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        c113724dE.setButtonVariant(i2);
    }

    public static /* synthetic */ void setAddCartClickAction$default(PdpBottomNavBarWidget pdpBottomNavBarWidget, boolean z, View view, AddToCartButton addToCartButton, int i, Object obj) {
        if ((i & 4) != 0) {
            addToCartButton = null;
        }
        pdpBottomNavBarWidget.setAddCartClickAction(z, view, addToCartButton);
    }
}
