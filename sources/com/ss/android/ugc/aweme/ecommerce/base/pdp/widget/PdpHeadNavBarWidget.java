package com.ss.android.ugc.aweme.ecommerce.base.pdp.widget;

import X.AVS;
import X.AnonymousClass636;
import X.C107794Kx;
import X.C113554cx;
import X.C139825eE;
import X.C16880lQ;
import X.C221108m2;
import X.C245319jz;
import X.C252659vp;
import X.C26048AKe;
import X.C26338AVi;
import X.C26706Ady;
import X.C26847AgF;
import X.C26867AgZ;
import X.C27162AlK;
import X.C27565Arp;
import X.C27566Arq;
import X.C2RP;
import X.C32I;
import X.C34K;
import X.C47261Igj;
import X.C54373LVp;
import X.C5H3;
import X.C64382fq;
import X.C65352Pkq;
import X.C65776Prg;
import X.C66822jm;
import X.C69941Rcf;
import X.C70101RfF;
import X.C70414RkI;
import X.C70511Rlr;
import X.C70513Rlt;
import X.C70519Rlz;
import X.C70546RmQ;
import X.C70552RmW;
import X.C70653Ro9;
import X.C70894Rs2;
import X.C70926RsY;
import X.C70969RtF;
import X.C70984RtU;
import X.C72545SdZ;
import X.C73156SnQ;
import X.C74053T4n;
import X.C76542zS;
import X.C76800UCe;
import X.C78685UuP;
import X.C78946Uyc;
import X.C79057V0z;
import X.C81273Gx;
import X.C82682Wcg;
import X.C88913eJ;
import X.FT5;
import X.G36;
import X.InterfaceC109344Qw;
import X.InterfaceC70514Rlu;
import X.InterfaceC88472Yns;
import X.KEI;
import X.L4F;
import X.OSZ;
import X.QD3;
import X.TBT;
import X.WHL;
import Y.ACListenerS21S0100000_1;
import Y.ARunnableS31S0200000_12;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Creator;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Favorite;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShareInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.IPdpHeaderWidgetStyle;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS123S0300000_4;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS2S0600000_4;
import kotlin.jvm.internal.AqS57S0400000_12;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.AqS8S0111000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import wg5.c;

/* loaded from: classes13.dex */
public final class PdpHeadNavBarWidget extends JediBaseWidget implements c {
    public static final C70552RmW Companion = new C70552RmW();
    public static final int HEADER_HEIGHT = C27162AlK.LIZ;
    public Map<Integer, View> _$_findViewCache;
    public boolean firstInitTab;
    public final FragmentManager fm;
    public final PdpFragment fragment;
    public boolean hasTabButtonShow;
    public boolean hasUploadSearchEntranceNode;
    public C2RP headerShopInfoView;
    public boolean isInitTab;
    public final C70511Rlr onTabSelectedListener;
    public InterfaceC70514Rlu searchEntranceView;
    public final C5H3 style$delegate;
    public int tabCount;
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
        return R.layout.a2u;
    }

    public final String getTabDefaultName(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "recommendation" : "description" : "review" : "overview";
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final IPdpHeaderWidgetStyle getStyle() {
        return (IPdpHeaderWidgetStyle) this.style$delegate.getValue();
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.viewModel$delegate.getValue();
    }

    private final void initSubscribe() {
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rlx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getBodyContent());
            }
        }, new AqS194S0100000_12(this, 69));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rf2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getCartTip();
            }
        }, new AqS194S0100000_12(this, 70));
        C73156SnQ.LJII(this, getViewModel(), new TBT() { // from class: X.Rf3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getTabs();
            }
        }, new TBT() { // from class: X.Rly
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getBodyContent());
            }
        }, new IDqS436S0100000_12(this, 6));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rf4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getShareInfo();
            }
        }, new AqS194S0100000_12(this, 71));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rkl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((PdpMainState) obj).getBottomSheetSlideOffset());
            }
        }, new AqS194S0100000_12(this, 65));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rlv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getScrollOffset());
            }
        }, new AqS194S0100000_12(this, 66));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rf1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getCartEntry();
            }
        }, new AqS194S0100000_12(this, 67));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rlw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getSheetState());
            }
        }, new AqS194S0100000_12(this, 68));
        EventBus.LIZJ().LJIILJJIL(this);
    }

    private final void initView() {
        Context context;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.hkn);
        if (_$_findCachedViewById != null) {
            C26338AVi.LJI(_$_findCachedViewById, null, Integer.valueOf(getViewModel().mw0()), null, null, false, 29);
        }
        View more_icon = _$_findCachedViewById(R.id.gmg);
        o.LJIIIIZZ(more_icon, "more_icon");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 15, 42), more_icon);
        View more_icon_circle = _$_findCachedViewById(R.id.gmh);
        o.LJIIIIZZ(more_icon_circle, "more_icon_circle");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 16, 42), more_icon_circle);
        View view = this.contentView;
        if (view != null && (context = view.getContext()) != null) {
            bindCustomArea(context);
        }
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    public final void initBar() {
        int i;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.bfq);
        if (_$_findCachedViewById != null) {
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 17, 42), _$_findCachedViewById);
        }
        _$_findCachedViewById(R.id.hkm).setAlpha(1.0f);
        _$_findCachedViewById(R.id.title).setVisibility(8);
        _$_findCachedViewById(R.id.n_w).setVisibility(8);
        View fl_search_entrance = _$_findCachedViewById(R.id.dgh);
        o.LJIIIIZZ(fl_search_entrance, "fl_search_entrance");
        fl_search_entrance.setVisibility(0);
        View shop_container = _$_findCachedViewById(R.id.jxz);
        o.LJIIIIZZ(shop_container, "shop_container");
        shop_container.setVisibility(0);
        if (getViewModel().tw0()) {
            ((ImageView) _$_findCachedViewById(R.id.gmg)).setVisibility(8);
            _$_findCachedViewById(R.id.gmh).setVisibility(8);
        } else {
            ((ImageView) _$_findCachedViewById(R.id.gmg)).setVisibility(0);
            _$_findCachedViewById(R.id.gmh).setVisibility(0);
        }
        if (getViewModel().LLII) {
            View shopping_cart_icon = _$_findCachedViewById(R.id.jyu);
            o.LJIIIIZZ(shopping_cart_icon, "shopping_cart_icon");
            setCartAnim(shopping_cart_icon);
            View more_icon = _$_findCachedViewById(R.id.gmg);
            o.LJIIIIZZ(more_icon, "more_icon");
            setMoreView(more_icon);
        }
        TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.bfq);
        if (getViewModel().LLII) {
            i = R.raw.icon_arrow_left_ltr;
        } else {
            i = R.raw.icon_x_mark;
        }
        tuxIconView.setIconRes(i);
    }

    public final void logCartClick() {
        withState(getViewModel(), new AqS178S0100000_12(this, 144));
    }

    public final void logShareIconClick() {
        withState(getViewModel(), new AqS178S0100000_12(this, 145));
    }

    @Override // com.bytedance.widget.Widget
    public void onCreate() {
        super.onCreate();
        initView();
        initSubscribe();
    }

    @Override // com.bytedance.widget.Widget
    public void onDestroy() {
        C74053T4n c74053T4n;
        super.onDestroy();
        View view = this.contentView;
        if (view != null && (c74053T4n = (C74053T4n) view.findViewById(R.id.hkw)) != null) {
            c74053T4n.LJLLJ.remove(this.onTabSelectedListener);
        }
        EventBus.LIZJ().LJIJ(this);
    }

    public final void trySendCartEntryShowLog() {
        View view;
        View findViewById;
        View view2;
        View findViewById2;
        int i;
        if (!getViewModel().LLFF && (view = this.contentView) != null && (findViewById = view.findViewById(R.id.jyu)) != null && findViewById.getVisibility() == 0 && (view2 = this.contentView) != null && (findViewById2 = view2.findViewById(R.id.hkm)) != null && findViewById2.getVisibility() == 0) {
            getViewModel().LLFF = true;
            AVS avs = (AVS) _$_findCachedViewById(R.id.jyz);
            if (avs != null) {
                i = avs.getCount();
            } else {
                i = 0;
            }
            C70414RkI c70414RkI = getViewModel().LLFII;
            if (c70414RkI != null) {
                boolean z = getViewModel().LJLJL;
                if (C26847AgF.LIZ()) {
                    C78946Uyc.LJJII(c70414RkI.LJIJI(), new C70926RsY(0), new AqS8S0111000_12(c70414RkI, i, z, 5));
                } else {
                    C76542zS.LJ("tiktokec_cart_entrance_show", new AqS8S0111000_12(c70414RkI, i, z, 6));
                }
            }
        }
    }

    public final void trySendShareIconShowLog() {
        View view;
        View findViewById;
        View view2;
        View findViewById2;
        if (!getViewModel().LLIZLLLIL && (view = this.contentView) != null && (findViewById = view.findViewById(R.id.jtc)) != null && findViewById.getVisibility() == 0 && (view2 = this.contentView) != null && (findViewById2 = view2.findViewById(R.id.hkm)) != null && findViewById2.getVisibility() == 0) {
            getViewModel().LLIZLLLIL = true;
            C70414RkI c70414RkI = getViewModel().LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJIFFI("product_share", null);
            }
        }
    }

    public final FragmentManager getFm() {
        return this.fm;
    }

    public final PdpFragment getFragment() {
        return this.fragment;
    }

    private final void bindCustomArea(Context context) {
        if (getStyle().isShowShopInfo()) {
            bindShopInfo(context);
        }
        if (getViewModel().Zv0()) {
            getContainer().post(new ARunnableS31S0200000_12(context, this, 13));
            return;
        }
        bindSearchBox(context);
        PdpViewModel viewModel = getViewModel();
        AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12(this, 143);
        viewModel.getClass();
        viewModel.withState(aqS178S0100000_12);
    }

    private final void bindShopInfo(Context context) {
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.As1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getShopInfo();
            }
        }, new AqS123S0300000_4(this, context, new C34K(), 0));
    }

    private final void setCartAnim(View view) {
        C27565Arp c27565Arp = getViewModel().LLJLLL;
        if (c27565Arp != null) {
            c27565Arp.LIZ.LJLJLLL = view;
        }
        C27565Arp c27565Arp2 = getViewModel().LLJLLL;
        if (c27565Arp2 != null) {
            c27565Arp2.LIZ.LJLLI = new AqS143S0200000_12(this, view, 32);
        }
    }

    private final void setMoreView(View view) {
        C27565Arp c27565Arp = getViewModel().LLJLLL;
        if (c27565Arp != null) {
            c27565Arp.LIZ.LJLL = view;
        }
        C27565Arp c27565Arp2 = getViewModel().LLJLLL;
        if (c27565Arp2 != null) {
            c27565Arp2.LIZ.LJLLILLLL = new AqS143S0200000_12(this, view, 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindSearchBox(android.content.Context r44) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpHeadNavBarWidget.bindSearchBox(android.content.Context):void");
    }

    public final void configBar(float f) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        View findViewById6;
        View findViewById7;
        View findViewById8;
        View view;
        View findViewById9;
        View findViewById10;
        View findViewById11;
        View findViewById12;
        if (f > 1.0f) {
            return;
        }
        int i = 0;
        float f2 = 0.0f;
        if (f >= 0.0f) {
            double d = f;
            if (d < 0.6d) {
                View view2 = this.contentView;
                if (view2 != null && (findViewById12 = view2.findViewById(R.id.hkm)) != null) {
                    findViewById12.setAlpha(0.0f);
                }
                View view3 = this.contentView;
                if (view3 != null && (findViewById11 = view3.findViewById(R.id.hkm)) != null) {
                    findViewById11.setVisibility(8);
                }
                View view4 = this.contentView;
                if (view4 != null) {
                    view = view4.findViewById(R.id.hkl);
                } else {
                    view = null;
                }
                if (view != null) {
                    view.setAlpha((float) ((d * (-1.6d)) + 1));
                }
                View view5 = this.contentView;
                if (view5 != null && (findViewById9 = view5.findViewById(R.id.hkl)) != null) {
                    View view6 = this.contentView;
                    if (view6 != null && (findViewById10 = view6.findViewById(R.id.hkl)) != null) {
                        f2 = findViewById10.getAlpha();
                    }
                    if (f2 <= 0.1d) {
                        i = 8;
                    }
                    findViewById9.setVisibility(i);
                }
                View shopping_cart_icon_circle = _$_findCachedViewById(R.id.jyv);
                o.LJIIIIZZ(shopping_cart_icon_circle, "shopping_cart_icon_circle");
                setCartAnim(shopping_cart_icon_circle);
                View more_icon_circle = _$_findCachedViewById(R.id.gmh);
                o.LJIIIIZZ(more_icon_circle, "more_icon_circle");
                setMoreView(more_icon_circle);
                return;
            }
        }
        double d2 = f;
        if (d2 >= 0.6d) {
            View view7 = this.contentView;
            if (view7 != null && (findViewById8 = view7.findViewById(R.id.hkm)) != null) {
                findViewById8.setAlpha((float) ((d2 * 2.5d) - 1.5d));
            }
            View view8 = this.contentView;
            if (view8 != null && (findViewById7 = view8.findViewById(R.id.hkm)) != null) {
                findViewById7.setVisibility(0);
            }
            View view9 = this.contentView;
            if (view9 != null && (findViewById6 = view9.findViewById(R.id.hkl)) != null) {
                findViewById6.setAlpha(0.0f);
            }
            View view10 = this.contentView;
            if (view10 != null && (findViewById5 = view10.findViewById(R.id.hkl)) != null) {
                findViewById5.setVisibility(8);
            }
            View shopping_cart_icon = _$_findCachedViewById(R.id.jyu);
            o.LJIIIIZZ(shopping_cart_icon, "shopping_cart_icon");
            setCartAnim(shopping_cart_icon);
            View more_icon = _$_findCachedViewById(R.id.gmg);
            o.LJIIIIZZ(more_icon, "more_icon");
            setMoreView(more_icon);
            return;
        }
        View view11 = this.contentView;
        if (view11 != null && (findViewById4 = view11.findViewById(R.id.hkm)) != null) {
            findViewById4.setAlpha(0.0f);
        }
        View view12 = this.contentView;
        if (view12 != null && (findViewById3 = view12.findViewById(R.id.hkm)) != null) {
            findViewById3.setVisibility(8);
        }
        View view13 = this.contentView;
        if (view13 != null && (findViewById2 = view13.findViewById(R.id.hkl)) != null) {
            findViewById2.setAlpha(1.0f);
        }
        View view14 = this.contentView;
        if (view14 != null && (findViewById = view14.findViewById(R.id.hkl)) != null) {
            findViewById.setVisibility(0);
        }
        View shopping_cart_icon_circle2 = _$_findCachedViewById(R.id.jyv);
        o.LJIIIIZZ(shopping_cart_icon_circle2, "shopping_cart_icon_circle");
        setCartAnim(shopping_cart_icon_circle2);
        View more_icon_circle2 = _$_findCachedViewById(R.id.gmh);
        o.LJIIIIZZ(more_icon_circle2, "more_icon_circle");
        setMoreView(more_icon_circle2);
    }

    public final void initTab(List<Tab> list) {
        int i;
        int i2;
        boolean z;
        C70519Rlz c70519Rlz;
        C70519Rlz c70519Rlz2;
        if (this.isInitTab) {
            return;
        }
        this.isInitTab = true;
        C74053T4n c74053T4n = (C74053T4n) _$_findCachedViewById(R.id.hkw);
        c74053T4n.setAlpha(0.0f);
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        int i3 = 0;
        for (Tab tab : list) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                Tab tab2 = tab;
                KEI LJII = c74053T4n.LJII();
                LJII.LIZIZ(tab2.tabTitle);
                Integer num = tab2.toBrick;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                Object obj = LJII.LIZ;
                if ((obj instanceof C70519Rlz) && (c70519Rlz2 = (C70519Rlz) obj) != null) {
                    LJII.LIZ = new C70519Rlz(i, c70519Rlz2.LJLILLLLZI);
                } else {
                    LJII.LIZ = new C70519Rlz(i, 0, 2);
                }
                Integer num2 = tab2.tabName;
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = 0;
                }
                Object obj2 = LJII.LIZ;
                if ((obj2 instanceof C70519Rlz) && (c70519Rlz = (C70519Rlz) obj2) != null) {
                    LJII.LIZ = new C70519Rlz(c70519Rlz.LJLIL, i2);
                } else {
                    LJII.LIZ = new C70519Rlz(0, i2, 1);
                }
                if (i3 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                c74053T4n.LIZIZ(LJII, i3, z);
                arrayList.add(LJII);
                i3 = i4;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        c74053T4n.LIZ(this.onTabSelectedListener);
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rdm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj3) {
                return ((PdpMainState) obj3).getFocusTabAction();
            }
        }, new AqS194S0100000_12(arrayList, (List<KEI>) 64));
    }

    @QD3
    public final void onEvent(C107794Kx event) {
        o.LJIIIZ(event, "event");
        if (TextUtils.equals("product", event.LJLJJI)) {
            View view = this.contentView;
            if (view != null) {
                InterfaceC109344Qw shareService = IMService.createIIMServicebyMonsterPlugin(false).getShareService();
                Activity LIZ = FT5.LIZ(view, "it.context");
                if (LIZ != null) {
                    shareService.LJIIL(LIZ, view, event);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            C70414RkI c70414RkI = getViewModel().LLFII;
            if (c70414RkI != null) {
                PdpViewModel viewModel = getViewModel();
                ArrayList LJ = C72545SdZ.LJ(viewModel, "vm");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                List<IMContact> list = event.LJLILLLLZI;
                o.LJIIIIZZ(list, "event.contactList");
                for (IMContact iMContact : list) {
                    if (iMContact instanceof IMUser) {
                        LJ.add("private");
                        IMUser iMUser = (IMUser) iMContact;
                        String uid = iMUser.getUid();
                        o.LJIIIIZZ(uid, "it.uid");
                        arrayList.add(uid);
                        arrayList2.add(C81273Gx.LIZJ(iMUser.getUid()));
                    } else if (iMContact instanceof IMConversation) {
                        LJ.add("group");
                        arrayList.add("-1");
                        String conversationId = ((IMConversation) iMContact).getConversationId();
                        o.LJIIIIZZ(conversationId, "it.conversationId");
                        arrayList2.add(conversationId);
                    } else {
                        LJ.add("");
                        arrayList.add("");
                        arrayList2.add("");
                    }
                }
                C78946Uyc.LJJII(c70414RkI.LJIJI(), new C70969RtF(1), new AqS2S0600000_4(c70414RkI, (C70414RkI) viewModel, (PdpViewModel) LJ, (List<String>) arrayList, (List<String>) arrayList2, (List<String>) event, (C107794Kx) 0));
            }
        }
    }

    public final void onMoreIconClick(View view) {
        Map LJJJLIIL;
        String str;
        String str2;
        String str3;
        String str4;
        Object obj;
        Creator creator;
        String str5;
        Favorite favorite;
        String str6;
        G36 currentI18nItem;
        ProductBase productBase;
        List<Image> list;
        Image image;
        List<String> urls;
        SellerInfo sellerInfo;
        ProductBase productBase2;
        SellerInfo sellerInfo2;
        String str7;
        SellerInfo sellerInfo3;
        C70414RkI c70414RkI = getViewModel().LLFII;
        String str8 = "";
        if (c70414RkI != null) {
            ProductPackStruct productPackStruct = getViewModel().LJLJLLL;
            if (productPackStruct == null || (sellerInfo3 = productPackStruct.sellerInfo) == null || (str7 = sellerInfo3.sellerId) == null) {
                str7 = "";
            }
            if (C26847AgF.LIZ()) {
                C78946Uyc.LJJII(c70414RkI.LJIJI(), new C70984RtU(), new AqS58S1100000_4(c70414RkI, str7, 49));
            } else {
                new C70513Rlt(str7).LIZJ(c70414RkI.LIZIZ);
            }
        }
        C70101RfF c70101RfF = IPdpStarter.LIZ;
        Context context = view.getContext();
        FragmentManager fragmentManager = this.fm;
        PdpViewModel viewModel = getViewModel();
        viewModel.getClass();
        IPdpStarter.PdpEnterParam pdpEnterParam = viewModel.LJLJJLL;
        if (pdpEnterParam == null || (LJJJLIIL = pdpEnterParam.getTrackParams()) == null) {
            LJJJLIIL = C113554cx.LJJJLIIL();
        }
        HashMap hashMap = new HashMap(LJJJLIIL);
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        String[] strArr = C70546RmQ.LIZ;
        String[] strArr2 = (String[]) LIZLLL.LJIIIIZZ("ecom_report_params_disable_list", String[].class, strArr);
        if (strArr2 != null) {
            strArr = strArr2;
        }
        for (String str9 : strArr) {
            hashMap.remove(str9);
        }
        OSZ[] oszArr = new OSZ[6];
        oszArr[0] = new OSZ("track_params", hashMap);
        ProductPackStruct productPackStruct2 = viewModel.LJLJLLL;
        if (productPackStruct2 == null || (sellerInfo2 = productPackStruct2.sellerInfo) == null || (str = sellerInfo2.name) == null) {
            str = "";
        }
        oszArr[1] = new OSZ("store_name", str);
        ProductPackStruct productPackStruct3 = viewModel.LJLJLLL;
        if (productPackStruct3 == null || (productBase2 = productPackStruct3.baseInfo) == null || (str2 = productBase2.title) == null) {
            str2 = "";
        }
        oszArr[2] = new OSZ("product_name", str2);
        ProductPackStruct productPackStruct4 = viewModel.LJLJLLL;
        if (productPackStruct4 == null || (str3 = productPackStruct4.productId) == null) {
            str3 = "";
        }
        oszArr[3] = new OSZ("product_id", str3);
        ProductPackStruct productPackStruct5 = viewModel.LJLJLLL;
        if (productPackStruct5 == null || (sellerInfo = productPackStruct5.sellerInfo) == null || (str4 = sellerInfo.sellerId) == null) {
            str4 = "";
        }
        oszArr[4] = new OSZ("shop_id", str4);
        ProductPackStruct productPackStruct6 = viewModel.LJLJLLL;
        if (productPackStruct6 == null || (productBase = productPackStruct6.baseInfo) == null || (list = productBase.images) == null || (image = (Image) ListProtector.get(list, 0)) == null || (urls = image.getUrls()) == null || (obj = ListProtector.get(urls, 0)) == null) {
            obj = "";
        }
        oszArr[5] = new OSZ("product_image_url", obj);
        HashMap LJJJLZIJ = C113554cx.LJJJLZIJ(oszArr);
        ProductPackStruct productPackStruct7 = getViewModel().LJLJLLL;
        if (productPackStruct7 != null) {
            creator = productPackStruct7.creator;
        } else {
            creator = null;
        }
        ProductPackStruct productPackStruct8 = getViewModel().LJLJLLL;
        if (productPackStruct8 != null) {
            str5 = productPackStruct8.productId;
        } else {
            str5 = null;
        }
        ProductPackStruct productPackStruct9 = getViewModel().LJLJLLL;
        if (productPackStruct9 != null) {
            favorite = productPackStruct9.favorite;
        } else {
            favorite = null;
        }
        o.LJIIIIZZ(context, "context");
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(this, 379);
        AqS159S0200000_12 aqS159S0200000_12 = new AqS159S0200000_12(this, view, 16);
        AqS162S0100000_12 aqS162S0100000_122 = new AqS162S0100000_12(this, 380);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 246);
        AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(this, view, 51);
        c70101RfF.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("hide_nav_bar", 1);
        hashMap2.put("disableBounces", 1);
        hashMap2.put("soft_input_adjust", "pan");
        ISettingService LIZ = SettingServiceImpl.LIZ();
        if (LIZ == null || (currentI18nItem = LIZ.getCurrentI18nItem(context)) == null || (str6 = currentI18nItem.LIZ()) == null) {
            str6 = "";
        }
        hashMap2.put("locale", str6);
        hashMap2.putAll(LJJJLZIJ);
        Uri build = C26867AgZ.LIZJ("https://oec-api.tiktokv.com/view/fe_tiktok_ecommerce_report/index.html/reasons", hashMap2).build();
        ArrayList arrayList = new ArrayList();
        if (favorite != null && C78685UuP.LJJJZ(favorite.favoriteSchemaLink) && C27566Arq.LIZ()) {
            C252659vp c252659vp = new C252659vp();
            String str10 = favorite.favoriteText;
            if (str10 != null) {
                str8 = str10;
            }
            c252659vp.LIZ = str8;
            c252659vp.LIZJ(R.raw.icon_bookmark);
            c252659vp.LJ = new ACListenerS21S0100000_1(new AqS143S0200000_12(aqS135S0200000_4, favorite, 28), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            arrayList.add(c252659vp);
            aqS154S0100000_4.invoke();
        }
        if (creator != null && o.LJ(creator.isSigned, Boolean.TRUE) && str5 != null && str5.length() > 0 && 1 == 1 && L4F.LIZ().locationType == 1) {
            C252659vp c252659vp2 = new C252659vp();
            c252659vp2.LIZ(R.string.phl);
            c252659vp2.LIZJ(R.raw.icon_shopping_bag_plus);
            c252659vp2.LJ = new ACListenerS21S0100000_1(new AqS178S0100000_12(aqS159S0200000_12, 131), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            arrayList.add(c252659vp2);
            aqS162S0100000_122.invoke();
        }
        C252659vp c252659vp3 = new C252659vp();
        c252659vp3.LIZ(R.string.f31);
        c252659vp3.LIZJ(R.raw.icon_flag);
        c252659vp3.LJ = new ACListenerS21S0100000_1(new AqS57S0400000_12(fragmentManager, context, build, aqS162S0100000_12, 2), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        arrayList.add(c252659vp3);
        C245319jz c245319jz = new C245319jz();
        c245319jz.LJ(arrayList);
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        if (fragmentManager != null) {
            LIZJ.show(fragmentManager, "pdp_more");
        }
        C70414RkI c70414RkI2 = getViewModel().LLFII;
        if (c70414RkI2 != null) {
            C70414RkI.LJJIL(c70414RkI2, "more_function", null, null, null, null, 30);
        }
    }

    public final void showCartShakeAnim(View view) {
        if (this.contentView != null) {
            C54373LVp.LIZ(view);
        }
    }

    public final void showFavoriteTip(View view) {
        String LIZ = C88913eJ.LIZ(view, R.string.f9o, "view.context.getString(R…vorite_add_success_toast)");
        C69941Rcf c69941Rcf = C69941Rcf.LIZ;
        if (c69941Rcf.LIZIZ()) {
            replaceIconRes(view, R.raw.icon_bookmark_fill);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            C139825eE c139825eE = new C139825eE(context);
            c139825eE.LIZ.LIZIZ = view;
            c139825eE.LIZJ = LIZ;
            c139825eE.LJI(WHL.BOTTOM);
            C82682Wcg c82682Wcg = c139825eE.LIZ;
            c82682Wcg.LJIIIZ = true;
            c82682Wcg.LJIIL = true;
            c82682Wcg.LJII = 1000L;
            c139825eE.LJ(new AqS148S0200000_1(this, view, 9));
            c139825eE.LIZJ().show();
            synchronized (c69941Rcf) {
                Keva keva = C66822jm.LIZ;
                C79057V0z.LJJJJIZL(C79057V0z.LJIL(keva, "ecom_favorite_list_guide") + 1, keva, "ecom_favorite_list_guide");
            }
        } else {
            replaceIconRes(view, R.raw.icon_bookmark_fill);
            C26048AKe c26048AKe = new C26048AKe(view);
            c26048AKe.LJI(LIZ);
            c26048AKe.LIZJ(R.raw.icon_tick);
            Context context2 = view.getContext();
            o.LJIIIIZZ(context2, "view.context");
            c26048AKe.LIZLLL(AnonymousClass636.LJIIIIZZ(R.attr.dj, context2));
            c26048AKe.LIZIZ(1000L);
            c26048AKe.LIZ(new AqS148S0200000_1(this, view, 10));
            c26048AKe.LJII();
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C64382fq(1000L, this, view, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r0.enablePreload == true) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tryLoadOtherData(float r6) {
        /*
            r5 = this;
            int r1 = r5.tabCount
            if (r1 > 0) goto Lf
            double r3 = (double) r6
            r1 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2a
        Le:
            return
        Lf:
            r0 = 3
            if (r1 != r0) goto L1d
            double r3 = (double) r6
            r1 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2a
            goto Le
        L1d:
            r0 = 4
            if (r1 != r0) goto Le
            double r3 = (double) r6
            r1 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto Le
        L2a:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r3 = r5.getViewModel()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment r2 = r5.fragment
            r3.getClass()
            java.lang.String r0 = "trackNode"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            boolean r0 = r3.LLLIIII
            r4 = 1
            if (r0 != 0) goto L5f
            boolean r0 = r3.LLLIIIIL
            if (r0 != 0) goto L5f
            java.util.Map r1 = X.C235179Kv.LIZ()
            if (r1 == 0) goto L9b
            X.AuL r0 = X.EnumC27721AuL.RECOMMENDATION
            int r0 = r0.getValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.ecommerce.core.ab.PdpLynxPreloadItem r0 = (com.ss.android.ugc.aweme.ecommerce.core.ab.PdpLynxPreloadItem) r0
            if (r0 == 0) goto L9b
            boolean r0 = r0.enablePreload
            if (r0 != r4) goto L9b
        L5f:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r3 = r5.getViewModel()
            android.view.View r2 = r5.contentView
            boolean r0 = r3.LLLIZZ
            if (r0 != 0) goto L75
            r3.LLLIZZ = r4
            kotlin.jvm.internal.AqS143S0200000_12 r1 = new kotlin.jvm.internal.AqS143S0200000_12
            r0 = 12
            r1.<init>(r2, r3, r0)
            r3.withState(r1)
        L75:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r3 = r5.getViewModel()
            boolean r0 = r3.LLLIIL
            if (r0 != 0) goto L90
            r3.LLLIIL = r4
            boolean r0 = r3.ow0()
            if (r0 == 0) goto L90
            X.XIA r2 = X.C78613UtF.LIZJ
            X.RcL r1 = new X.RcL
            r0 = 0
            r1.<init>(r3, r0)
            X.C78565UsT.LJJIJ(r3, r2, r1)
        L90:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r1 = r5.getViewModel()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment r0 = r5.fragment
            r1.Rv0(r0)
            goto Le
        L9b:
            r3.LLLIIII = r4
            kotlin.jvm.internal.AqS135S0200000_4 r1 = new kotlin.jvm.internal.AqS135S0200000_4
            r0 = 4
            r1.<init>(r3, r2, r0)
            r3.withState(r1)
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpHeadNavBarWidget.tryLoadOtherData(float):void");
    }

    public final void tryLogSearchViewShow(int i) {
        View view;
        if (i == 3 && !this.hasUploadSearchEntranceNode && this.searchEntranceView != null) {
            this.hasUploadSearchEntranceNode = true;
            C70414RkI c70414RkI = getViewModel().LLFII;
            if (c70414RkI != null && (view = this.contentView) != null) {
                C78946Uyc.LJJIIJ(view, new C70894Rs2(), new AqS170S0100000_4(c70414RkI, 1547));
            }
            InterfaceC70514Rlu interfaceC70514Rlu = this.searchEntranceView;
            if (interfaceC70514Rlu != null) {
                interfaceC70514Rlu.W0();
            }
            InterfaceC70514Rlu interfaceC70514Rlu2 = this.searchEntranceView;
            if (interfaceC70514Rlu2 != null) {
                interfaceC70514Rlu2.Y0();
            }
        }
    }

    public PdpHeadNavBarWidget(PdpFragment fragment, FragmentManager fragmentManager) {
        o.LJIIIZ(fragment, "fragment");
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment;
        this.fm = fragmentManager;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.viewModel$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 75));
        this.tabCount = -1;
        this.firstInitTab = true;
        this.style$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 381));
        this.onTabSelectedListener = new C70511Rlr(this);
    }

    public final void configTab(float f, List<Tab> list) {
        boolean z;
        int i;
        if (getStyle().getHideTab()) {
            return;
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.hkw);
        if (_$_findCachedViewById != null) {
            if (f > 0.9f) {
                z = true;
            } else {
                z = false;
            }
            _$_findCachedViewById.setClickable(z);
        }
        if (f > 0.1f && this.tabCount > 0) {
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.hkw);
            if (_$_findCachedViewById2 != null) {
                _$_findCachedViewById2.setVisibility(0);
            }
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.hkw);
            if (_$_findCachedViewById3 != null && _$_findCachedViewById3.getVisibility() == 0 && !this.hasTabButtonShow) {
                this.hasTabButtonShow = true;
                if (list != null) {
                    for (Tab tab : list) {
                        C70414RkI c70414RkI = getViewModel().LLFII;
                        if (c70414RkI != null) {
                            Integer num = tab.tabName;
                            if (num != null) {
                                i = num.intValue();
                            } else {
                                i = 0;
                            }
                            c70414RkI.LJJIFFI(getTabDefaultName(i), null);
                        }
                    }
                }
            }
        } else {
            View _$_findCachedViewById4 = _$_findCachedViewById(R.id.hkw);
            if (_$_findCachedViewById4 != null) {
                _$_findCachedViewById4.setVisibility(8);
            }
        }
        View _$_findCachedViewById5 = _$_findCachedViewById(R.id.hkw);
        if (_$_findCachedViewById5 == null) {
            return;
        }
        _$_findCachedViewById5.setAlpha(f);
    }

    public final void replaceIconRes(View view, int i) {
        if (view instanceof C70653Ro9) {
            ((C70653Ro9) view).setIconRes(i);
        } else {
            if (!(view instanceof TuxIconView)) {
                return;
            }
            ((TuxIconView) view).setIconRes(i);
        }
    }

    public final void updateShareIcon(ShareInfo shareInfo, View view) {
        if (!getStyle().isShowShareBtn()) {
            view.setVisibility(8);
        } else if (shareInfo != null && o.LJ(shareInfo.canShare, Boolean.TRUE)) {
            view.setVisibility(0);
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 19, 42), view);
        } else {
            view.setVisibility(8);
        }
    }

    public final void updateShowCart(CartEntry cartEntry, View view, AVS avs) {
        boolean z;
        Integer num;
        String str;
        View view2 = this.contentView;
        if (view2 != null) {
            getViewModel().getClass();
            if (cartEntry != null && (str = cartEntry.link) != null) {
                z = C78685UuP.LJJJZ(str);
            } else {
                z = false;
            }
            if (z) {
                if (cartEntry != null && (num = cartEntry.itemCount) != null) {
                    int intValue = num.intValue();
                    if (intValue > 0) {
                        avs.setVisibility(0);
                        avs.setCount(intValue);
                        avs.invalidate();
                    } else {
                        avs.setVisibility(8);
                    }
                }
                C16880lQ.LJIIJ(new Au2S19S0200000_12(this, view2, 15, 42), view);
                if (getViewModel().tw0()) {
                    view.setVisibility(8);
                    avs.setVisibility(8);
                } else {
                    view.setVisibility(0);
                }
            } else {
                view.setVisibility(8);
                avs.setVisibility(8);
            }
            trySendCartEntryShowLog();
        }
    }
}
