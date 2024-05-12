package com.ss.android.ugc.aweme.ecommerce.base.osp.page;

import X.AKH;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C04650Gf;
import X.C0GU;
import X.C0GY;
import X.C10A;
import X.C113714dD;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C1XY;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26227ARb;
import X.C26338AVi;
import X.C26558Aba;
import X.C26585Ac1;
import X.C26706Ady;
import X.C27052AjY;
import X.C27201Alx;
import X.C27739Aud;
import X.C27855AwV;
import X.C27856AwW;
import X.C27905AxJ;
import X.C27920AxY;
import X.C27921AxZ;
import X.C27926Axe;
import X.C27927Axf;
import X.C27928Axg;
import X.C27930Axi;
import X.C27939Axr;
import X.C27949Ay1;
import X.C28121B1x;
import X.C29706BlG;
import X.C29S;
import X.C31461Li;
import X.C32151Nz;
import X.C33381Ss;
import X.C3AW;
import X.C3C5;
import X.C40443Fu3;
import X.C47117IeP;
import X.C51029K0z;
import X.C58096Mr6;
import X.C5H3;
import X.C61712OJw;
import X.C61713OJx;
import X.C62822Ol8;
import X.C65330PkU;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70858RrS;
import X.C71096RvI;
import X.C71312Rym;
import X.C71800SFw;
import X.C72713SgH;
import X.C72714SgI;
import X.C73156SnQ;
import X.C73305Spp;
import X.C73311Spv;
import X.C76800UCe;
import X.C76917UGr;
import X.C78685UuP;
import X.C78915Uy7;
import X.C79045V0n;
import X.C7MY;
import X.C90903hW;
import X.C9KF;
import X.DialogC25756A8y;
import X.EO3;
import X.EnumC26795AfP;
import X.InterfaceC27538ArO;
import X.InterfaceC27833Aw9;
import X.InterfaceC60061Nhh;
import X.O6N;
import X.O6R;
import X.OSZ;
import X.SCQ;
import X.TBT;
import X.UC0;
import X.X1D;
import Y.ACListenerS24S0100000_4;
import Y.ARunnableS48S0100000_12;
import Y.IDLListenerS192S0100000_4;
import Y.IDLListenerS58S0200000_4;
import Y.IDrS44S0100000_4;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.ospfragment.IOspFragmentStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonOrder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DynamicSchema;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PayMiddleFailedEvent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuitReasonData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.widget.OrderSubmitBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment;
import com.ss.android.ugc.aweme.ecommerce.core.ab.OspAsyncInflateSettings;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECLayerService;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IECLayerService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS167S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS28S0210000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.IDqS429S0100000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class OrderSubmitFragment extends ECBaseJediFragment implements InterfaceC27833Aw9, InterfaceC60061Nhh, c {
    public static final C27921AxZ Companion = new C27921AxZ();
    public static InterfaceC27538ArO ospTrackNode;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final C5H3 adapter$delegate;
    public C71096RvI counterView;
    public volatile boolean couponBarShown;
    public volatile boolean hideSummaryPanel;
    public boolean isFirstIn;
    public boolean isRdEnterPageLogged;
    public final C5H3 loadingDialog$delegate;
    public final C5H3 loadingPopupWindow$delegate;
    public final C5H3 lottieWindow$delegate;
    public final IDrS44S0100000_4 onScrollListener;
    public long openSummaryTime;
    public final C5H3 popupWindow$delegate;
    public boolean skipDismissPromotionBannerOnScroll;
    public final C5H3 viewModel$delegate;

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, X.InterfaceC37828Esy
    public String getPageName() {
        return "order_submit";
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com_ss_android_ugc_aweme_ecommerce_base_osp_page_OrderSubmitFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.aweme.base.arch.JediBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public OrderSubmitFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.viewModel$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 34));
        this.adapter$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 176));
        this.loadingDialog$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 179));
        this.popupWindow$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 182));
        this.lottieWindow$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 181));
        this.loadingPopupWindow$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 180));
        this.isFirstIn = true;
        this.skipDismissPromotionBannerOnScroll = true;
        this.onScrollListener = new IDrS44S0100000_4(this, 2);
    }

    public final C26585Ac1 getAdapter() {
        return (C26585Ac1) this.adapter$delegate.getValue();
    }

    public final DialogC25756A8y getLoadingDialog() {
        return (DialogC25756A8y) this.loadingDialog$delegate.getValue();
    }

    public final AKH getLoadingPopupWindow() {
        return (AKH) this.loadingPopupWindow$delegate.getValue();
    }

    public final C27939Axr getLottieWindow() {
        return (C27939Axr) this.lottieWindow$delegate.getValue();
    }

    public final C71800SFw getPopupWindow() {
        return (C71800SFw) this.popupWindow$delegate.getValue();
    }

    public final OrderSubmitViewModel getViewModel() {
        return (OrderSubmitViewModel) this.viewModel$delegate.getValue();
    }

    private final void initSubscribe() {
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Avx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((OrderSubmitState) obj).getPageLoadStatus());
            }
        }, new AqS186S0100000_4(this, 68));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AwU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((OrderSubmitState) obj).getLoadSuccess());
            }
        }, new AqS186S0100000_4(this, 63));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Awm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getToastMsg();
            }
        }, new AqS186S0100000_4(this, 45));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Awu
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getAdapterList();
            }
        }, new AqS186S0100000_4(this, 47));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Awe
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((OrderSubmitState) obj).getHideSummaryPanel());
            }
        }, new AqS186S0100000_4(this, 48));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AjV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getSummaryInfo();
            }
        }, new AqS186S0100000_4(this, 50));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Awg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((OrderSubmitState) obj).getKeyBoardCounterDiff());
            }
        }, new AqS186S0100000_4(this, 52));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Ax8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getNetworkErrorState();
            }
        }, new AqS186S0100000_4(this, 54));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AxA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getSystemErrorState();
            }
        }, new AqS186S0100000_4(this, 57));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Awi
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((OrderSubmitState) obj).getShowDialogState());
            }
        }, new AqS186S0100000_4(this, 60));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Awj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((OrderSubmitState) obj).getShowPayState());
            }
        }, new AqS186S0100000_4(this, 62));
        C73156SnQ.LJII(this, getViewModel(), new TBT() { // from class: X.Awk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((OrderSubmitState) obj).getShowPopupState());
            }
        }, new TBT() { // from class: X.AxD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getShowPopupTitle();
            }
        }, new IDqS429S0100000_4(this, 3));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Awl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((OrderSubmitState) obj).getAbnormalStatus());
            }
        }, new AqS186S0100000_4(this, 65));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AwP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((OrderSubmitState) obj).getOrderSummaryPanelOpened());
            }
        }, new AqS186S0100000_4(this, 67));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Ax4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getResendOrderCreateAction();
            }
        }, new AqS186S0100000_4(this, 44));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Ax5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getTopNotice();
            }
        }, new AqS186S0100000_4(this, 46));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Ax6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getAnnouncements();
            }
        }, new AqS186S0100000_4(this, 49));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Awp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getExpandTarget();
            }
        }, new AqS186S0100000_4(this, 51));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Ax7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getPaymentInfoErrorState();
            }
        }, new AqS186S0100000_4(this, 53));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Ax9
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getUseVoucherState();
            }
        }, new AqS186S0100000_4(this, 55));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AxB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getShowShippingPriceToast();
            }
        }, new AqS186S0100000_4(this, 58));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Awr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getEditBillingAddress();
            }
        }, new AqS186S0100000_4(this, 61));
        C73156SnQ.LJII(this, getViewModel(), new TBT() { // from class: X.Aws
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getMoveToPos();
            }
        }, new TBT() { // from class: X.AxC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getMoveToast();
            }
        }, new IDqS429S0100000_4(this, 2));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AxE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getMoveCpfToTopPart();
            }
        }, new AqS186S0100000_4(this, 64));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Awt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getMoveModuleTo();
            }
        }, new AqS186S0100000_4(this, 66));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Awo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getPageStatus();
            }
        }, new AqS186S0100000_4(this, 43));
    }

    private final void initView() {
        Window window;
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.l_2);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 177));
        c235119Kp.LIZLLL(LIZJ);
        c235119Kp.LIZ(buildTitleNavCenter());
        c235119Kp.LIZLLL = true;
        c252709vu.setNavActions(c235119Kp);
        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(requireContext()), R.layout.a_f, (ViewGroup) _$_findCachedViewById(R.id.bs8), false);
        o.LJIIIIZZ(LLLLIILL, "from(requireContext()).i…ontainer, false\n        )");
        c73305Spp.LIZJ(LLLLIILL);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isn);
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        recyclerView.LJII(new C71312Rym(0.0f, AnonymousClass636.LJIIIIZZ(R.attr.ds, requireContext), C17N.LJIILL(8.0d)), -1);
        ((RecyclerView) _$_findCachedViewById(R.id.isn)).LJIIJJI(this.onScrollListener);
        ((RecyclerView) _$_findCachedViewById(R.id.isn)).setNestedScrollingEnabled(false);
        ((RecyclerView) _$_findCachedViewById(R.id.isn)).setAdapter(getAdapter());
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.isn);
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        _$_findCachedViewById(R.id.isn).getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS192S0100000_4(this, 1));
        Context context = getContext();
        if (context == null) {
            return;
        }
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Awq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).isShowToastForVoucher();
            }
        }, new AqS186S0100000_4(this, 56));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Awh
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((OrderSubmitState) obj).getOpenAddressEditPage());
            }
        }, new AqS186S0100000_4(this, 59));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Awn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getAddress();
            }
        }, new AqS167S0200000_4(this, context, 7));
        ((C27052AjY) _$_findCachedViewById(R.id.ktt)).setCloseAction(new AqS154S0100000_4(this, 178));
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 53), _$_findCachedViewById(R.id.hd9));
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 54), _$_findCachedViewById(R.id.hd_));
        if ((!getViewModel().LLILLIZIL.isEmpty()) && getViewModel().LLILLIZIL.size() == 3) {
            ((C113714dD) _$_findCachedViewById(R.id.hfo)).setLightStep(3);
        }
        C40443Fu3.LIZ("tiktokec_anchor_order_submit").LJIIIIZZ((RecyclerView) _$_findCachedViewById(R.id.isn));
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            window = mo49getActivity.getWindow();
        } else {
            window = null;
        }
        View view = getView();
        if (window != null && view != null) {
            Lifecycle lifecycle = getLifecycle();
            o.LJIIIIZZ(lifecycle, "lifecycle");
            new KeyBoardVisibilityUtil(lifecycle, window, view, null, new AqS167S0200000_4(this, view, 6));
        }
        if (OspAsyncInflateSettings.LIZ()) {
            C72714SgI c72714SgI = C72713SgH.LJIIIIZZ;
            View view2 = getView();
            c72714SgI.getClass();
            C72714SgI.LIZ(view2, this).LIZJ(R.id.ap_, new OrderSubmitBottomWidget(), true);
        }
    }

    private final boolean needIntercept() {
        boolean z;
        Price price;
        boolean z2;
        Summary summary;
        List<BillItem> billItems;
        String str;
        Summary summary2;
        if (getViewModel().LLILLIZIL.size() == 3) {
            return false;
        }
        if (getViewModel().LJLJJLL == 0 && ((Boolean) C27928Axg.LIZ.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (!getViewModel().LLIIIJ && !getViewModel().LLIILZL && !z && !getViewModel().LLJZIJLIL.LIZJ) {
            return false;
        }
        BillInfoData billInfoData = getViewModel().LJZ;
        if (billInfoData != null && (summary2 = billInfoData.getSummary()) != null) {
            price = summary2.getTotalDiscount();
        } else {
            price = null;
        }
        BillInfoData billInfoData2 = getViewModel().LJZ;
        if (billInfoData2 != null && (summary = billInfoData2.getSummary()) != null && (billItems = summary.getBillItems()) != null && !billItems.isEmpty()) {
            for (BillItem billItem : billItems) {
                Integer itemType = billItem.getItemType();
                if (itemType != null && itemType.intValue() == 16) {
                    Price itemPrice = billItem.getItemPrice();
                    if (itemPrice != null) {
                        str = itemPrice.getPriceVal();
                    } else {
                        str = null;
                    }
                    if (o.LJ(str, CardStruct.IStatusCode.DEFAULT)) {
                        z2 = true;
                        break;
                    }
                }
            }
        }
        z2 = false;
        if (price != null && price.getPriceVal() != null && z2 && (getViewModel().LLIILZL || getViewModel().LLIIIJ)) {
            C62822Ol8 c62822Ol8 = C27930Axi.LIZ;
            if (((Number) c62822Ol8.getValue()).intValue() == 1) {
                C27949Ay1.LJJIIJ("quit_checkout_discount_remind", null, null, null, "order_submit", true, 14);
                if (price != null) {
                    showDiscountDialog(mo49getActivity(), price.getPriceStr());
                    return true;
                }
            } else if (((Number) c62822Ol8.getValue()).intValue() == 2) {
                C27949Ay1.LJJIIJ("quit_checkout_free_shipping_remind", null, null, null, "order_submit", true, 14);
                showFreeShippingDialog(mo49getActivity());
                return true;
            }
        }
        C27949Ay1.LJJIIJ("quit_checkout", null, null, null, null, false, 62);
        showBackInterceptDialog(mo49getActivity(), getViewModel().LLIILZL);
        return true;
    }

    private final void subscribeEvent() {
        EventCenter.LJ().LIZJ("restore_sku_quantity_event", this);
        EventCenter.LJ().LIZJ("ec_pay_middle_successed", this);
        EventCenter.LJ().LIZJ("ec_pay_middle_failed", this);
        EventCenter.LJ().LIZJ("ec_resend_pay_request", this);
    }

    private final void unsubscribeEvent() {
        EventCenter.LJ().LIZIZ("restore_sku_quantity_event", this);
        EventCenter.LJ().LIZIZ("ec_pay_middle_successed", this);
        EventCenter.LJ().LIZIZ("ec_pay_middle_failed", this);
        EventCenter.LJ().LIZIZ("ec_resend_pay_request", this);
    }

    public final C9KF buildTitleNavCenter() {
        String string;
        String str;
        Context context;
        int i;
        if (C1XY.LJJ()) {
            ((TuxTextView) _$_findCachedViewById(R.id.asx)).setTuxFont(71);
            string = getResources().getString(R.string.fcg);
            o.LJIIIIZZ(string, "resources.getString(R.st…_order_checkout_headline)");
            str = getResources().getString(R.string.fch);
            o.LJIIIIZZ(str, "resources.getString(R.st…_order_checkout_subtitle)");
        } else {
            string = getResources().getString(R.string.r_1);
            o.LJIIIIZZ(string, "resources.getString(R.st…op_order_page_headertext)");
            IOspFragmentStyle iOspFragmentStyle = (IOspFragmentStyle) UC0.LJIIJJI(this, "order_submit", null, null, null, 14);
            if (iOspFragmentStyle != null) {
                string = getResources().getString(iOspFragmentStyle.getPageTitle());
                o.LJIIIIZZ(string, "resources.getString(it.pageTitle)");
            }
            str = "";
        }
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = string;
        C28121B1x.LIZ.getClass();
        if (C28121B1x.LIZ()) {
            C252709vu title_bar = (C252709vu) _$_findCachedViewById(R.id.l_2);
            o.LJIIIIZZ(title_bar, "title_bar");
            String string2 = getResources().getString(R.string.f8z);
            o.LJIIIIZZ(string2, "resources.getString(R.st…eckout_payment_guarantee)");
            c9kf.LIZLLL = C76917UGr.LJIJI(title_bar, string2);
        } else if (C78685UuP.LJJJZ(str) && (context = getContext()) != null) {
            SpannableString spannableString = new SpannableString(str);
            Integer LJI = C79045V0n.LJI(R.attr.gv, context);
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = -7829368;
            }
            spannableString.setSpan(new ForegroundColorSpan(i), 0, spannableString.length(), 17);
            c9kf.LIZLLL = spannableString;
        }
        return c9kf;
    }

    public final void dismissLoadingDialog() {
        C71800SFw popupWindow;
        if (C27927Axf.LIZ()) {
            C71800SFw popupWindow2 = getPopupWindow();
            if (popupWindow2 != null && popupWindow2.isShowing() && (popupWindow = getPopupWindow()) != null) {
                popupWindow.dismiss();
                return;
            }
            return;
        }
        if (!getLoadingDialog().isShowing()) {
            return;
        }
        getLoadingDialog().dismiss();
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // X.InterfaceC27833Aw9
    public boolean onBackPressed() {
        if (getViewModel().LLIFFJFJJ) {
            getViewModel().Rw0(false);
            return true;
        }
        OrderSubmitViewModel viewModel = getViewModel();
        viewModel.getClass();
        viewModel.LLII = "return";
        if (!needIntercept()) {
            if (getViewModel().LLILLIZIL.size() != 2) {
                return false;
            }
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.finish();
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ospTrackNode = null;
        C27949Ay1.LIZIZ.clear();
        C27949Ay1.LIZJ = -1L;
        C27949Ay1.LJI = -1L;
        C27949Ay1.LJII = -1L;
        C27949Ay1.LJIIIIZZ = 0;
        C27949Ay1.LIZLLL = -1L;
        C27949Ay1.LJ = -1L;
        C27949Ay1.LJFF = -1L;
        C27949Ay1.LJIJJLI = -1L;
        ((ArrayList) C27949Ay1.LJIIIZ).clear();
        ((ArrayList) C27949Ay1.LJIIJ).clear();
        ((ArrayList) C27949Ay1.LJIIL).clear();
        ((ArrayList) C27949Ay1.LJIIJJI).clear();
        ((ArrayList) C27949Ay1.LJIILIIL).clear();
        ((ArrayList) C27949Ay1.LJIILJJIL).clear();
        ((ArrayList) C27949Ay1.LJIILL).clear();
        C27949Ay1.LJIJ = null;
        C27949Ay1.LJIJI = null;
        OrderSubmitViewModel viewModel = getViewModel();
        viewModel.getClass();
        IEventCenter LJ = EventCenter.LJ();
        LJ.LIZIZ("ec_osp_resend_order_create", viewModel);
        LJ.LIZIZ("ec_payment_change", viewModel);
        EO3.LIZIZ(this);
        unsubscribeEvent();
        OrderSubmitViewModel viewModel2 = getViewModel();
        viewModel2.getClass();
        IEventCenter LJ2 = EventCenter.LJ();
        LJ2.LIZIZ("ec_address_change", viewModel2);
        LJ2.LIZIZ("ec_address_select", viewModel2);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getViewModel().LLJZIJLIL.LIZJ) {
            OrderSubmitViewModel viewModel = getViewModel();
            EnumC26795AfP pageStatus = EnumC26795AfP.ORDER_HAVE_CREATED;
            viewModel.getClass();
            o.LJIIIZ(pageStatus, "pageStatus");
            viewModel.setState(new AqS170S0100000_4(pageStatus, 1242));
        }
        C27949Ay1.LJJJJ();
        getViewModel().getClass();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (ActivityStack.isAppBackGround()) {
            C27949Ay1.LJFF = (SystemClock.elapsedRealtime() - C27949Ay1.LJ) + C27949Ay1.LJFF;
            OrderSubmitViewModel viewModel = getViewModel();
            viewModel.getClass();
            viewModel.withState(new AqS170S0100000_4(viewModel, 1239));
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        int i;
        AddonOrder addonOrder;
        List<PackedSku> packedSkus;
        super.onStop();
        if (ActivityStack.isAppBackGround()) {
            C27949Ay1.LJ = SystemClock.elapsedRealtime();
            OrderSubmitViewModel viewModel = getViewModel();
            viewModel.getClass();
            viewModel.LLII = "close";
        }
        if (!SCQ.LJIIIIZZ) {
            boolean z = getViewModel().LLI;
            String str = getViewModel().LLII;
            Boolean valueOf = Boolean.valueOf(getViewModel().LLIIL);
            Boolean valueOf2 = Boolean.valueOf(getViewModel().LLIILII);
            HashMap<String, Object> fw0 = getViewModel().fw0(true);
            String bw0 = getViewModel().bw0();
            BillInfoData billInfoData = getViewModel().LJZ;
            if (billInfoData != null && (addonOrder = billInfoData.getAddonOrder()) != null && (packedSkus = addonOrder.getPackedSkus()) != null) {
                i = packedSkus.size();
            } else {
                i = 0;
            }
            C27949Ay1.LJJIIZ(z, str, valueOf, valueOf2, fw0, null, null, null, null, bw0, Integer.valueOf(i), getViewModel().iw0(), 480);
        }
    }

    public final void showAddAddressHintDialog() {
        List<ShopOrderNew> list;
        if (C27920AxY.LIZ() && this.isFirstIn) {
            BillInfoData billInfoData = getViewModel().LJZ;
            if (billInfoData == null || !billInfoData.hasAddress()) {
                BillInfoData billInfoData2 = getViewModel().LJZ;
                if (billInfoData2 != null) {
                    list = billInfoData2.getNewShopOrders();
                } else {
                    list = null;
                }
                if (!C27855AwV.LIZ(list)) {
                    this.isFirstIn = false;
                    C27949Ay1.LJJIIJ("add_a_new_address", null, null, null, "shipping_address", true, 14);
                    C27905AxJ.LIZ(mo49getActivity(), getView(), getViewModel());
                }
            }
        }
    }

    public final void showLoadingDialog() {
        View view = getView();
        if (view != null) {
            view.post(new ARunnableS48S0100000_12(this, 18));
        }
    }

    public final C71096RvI getCounterView() {
        return this.counterView;
    }

    private final void showFreeShippingDialog(Context context) {
        if (context == null) {
            return;
        }
        C33381Ss c33381Ss = new C33381Ss();
        c33381Ss.LJLIL = R.drawable.b_s;
        C73311Spv c73311Spv = new C73311Spv(context, c33381Ss.LIZ(context), new Rect(C7MY.LIZIZ(16), C7MY.LIZIZ(24), C7MY.LIZIZ(16), C7MY.LIZIZ(20)));
        C26227ARb LIZ = C3AW.LIZ(context);
        LIZ.LIZ(R.string.faw);
        LIZ.LJ(R.string.fax);
        LIZ.LJIIIZ = c73311Spv;
        UC0.LIZJ(LIZ, new AqS135S0200000_4(this, context, 31));
        LIZ.LJII = false;
        LIZ.LJI().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public void fillNodeParams(C70858RrS params) {
        o.LJIIIZ(params, "params");
        C78915Uy7.LJJIL(params, new AqS170S0100000_4(this, 255));
    }

    public final void initAnnouncementLineLimit(Announcement announcement) {
        Long maxTextLine = announcement.getMaxTextLine();
        if (maxTextLine != null) {
            ((TextView) _$_findCachedViewById(R.id.hck)).setMaxLines((int) maxTextLine.longValue());
        }
        _$_findCachedViewById(R.id.hck).getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS58S0200000_4(this, announcement, 1));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Context context;
        super.onCreate(bundle);
        C61713OJx LIZIZ = C61712OJw.LIZIZ(this);
        LIZIZ.LJII(R.attr.cl);
        LIZIZ.LIZJ();
        ospTrackNode = this;
        HashMap<String, Object> hashMap = getViewModel().LLIL;
        ConcurrentHashMap<String, Object> concurrentHashMap = C27949Ay1.LIZIZ;
        if (hashMap != null) {
            concurrentHashMap.putAll(hashMap);
        }
        concurrentHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        concurrentHashMap.put("page_name", "order_submit");
        C27949Ay1.LIZLLL = SystemClock.elapsedRealtime();
        getViewModel().Mv0(false);
        EO3.LIZLLL("order_submit");
        EO3.LIZJ(this, "order_submit");
        C28121B1x.LIZ.getClass();
        if (C28121B1x.LIZ()) {
            Context context2 = getContext();
            if (context2 != null) {
                context = C16880lQ.LLLLL(context2);
            } else {
                context = null;
            }
            String LIZJ = C31461Li.LIZJ("ecom_payment_lottie_source", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/563eh7ulojpld/safety_loading.json.zip", "getInstance().getStringV…urceSettings::class.java)");
            if (context != null) {
                try {
                    C0GU<C0GY> LJIIIZ = C04650Gf.LJIIIZ(context, LIZJ);
                    LJIIIZ.LIZIZ(new C27856AwW(LIZJ));
                    LJIIIZ.LIZ(C27201Alx.LIZ);
                    C3C5.m7constructorimpl(LJIIIZ);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
        }
        subscribeEvent();
        OrderSubmitViewModel viewModel = getViewModel();
        viewModel.getClass();
        IEventCenter LJ = EventCenter.LJ();
        LJ.LIZJ("ec_address_select", viewModel);
        LJ.LIZJ("ec_address_change", viewModel);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, X.InterfaceC27438Apm
    public boolean onDetectBlank(Map<String, String> params) {
        String str;
        String[] layout;
        BillInfoData billInfoData;
        List<ShopOrderNew> newShopOrders;
        o.LJIIIZ(params, "params");
        OrderSubmitViewModel viewModel = getViewModel();
        viewModel.getClass();
        OrderSubmitState lv0 = viewModel.lv0();
        if (lv0.getPageLoadStatus() != 0) {
            Integer num = viewModel.LLJLLL;
            if (num == null || (str = num.toString()) == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            params.put("biz_type", str);
            params.put("content_list_size", String.valueOf(lv0.getAdapterList().size()));
            if (lv0.getPageLoadStatus() == 2 || lv0.getPageLoadStatus() == 3) {
                params.put("blank_type", "error_status");
            } else {
                BillInfoData billInfoData2 = viewModel.LJZ;
                if (billInfoData2 == null || (layout = billInfoData2.getLayout()) == null || layout.length == 0 || (billInfoData = viewModel.LJZ) == null || (newShopOrders = billInfoData.getNewShopOrders()) == null || newShopOrders.isEmpty()) {
                    params.put("blank_type", "no_meta_data");
                } else if (lv0.getAdapterList().isEmpty()) {
                    params.put("blank_type", "empty_data_list");
                }
            }
            return true;
        }
        if (((ViewGroup) _$_findCachedViewById(R.id.isn)).getChildCount() > 0 && _$_findCachedViewById(R.id.isn).getHeight() > 0) {
            return false;
        }
        params.put("blank_type", "empty_view");
        return true;
    }

    public final void setAnnouncementClickListener(Announcement announcement) {
        View order_announcement = _$_findCachedViewById(R.id.hci);
        o.LJIIIIZZ(order_announcement, "order_announcement");
        C16880lQ.LJIIJ(new Au2S14S0200000_4(this, announcement, 5), order_announcement);
    }

    public final void setCounterView(C71096RvI c71096RvI) {
        this.counterView = c71096RvI;
    }

    public final boolean showFeedbackDialog(Context context) {
        String str;
        IECLayerService eCLayerService;
        Uri uri;
        DynamicSchema dynamicSchema;
        String popupSchema;
        DynamicSchema dynamicSchema2;
        QuitReasonData quitReasonData = getViewModel().LLFII;
        View view = null;
        if (quitReasonData != null && (dynamicSchema2 = quitReasonData.schemaInfo) != null) {
            str = dynamicSchema2.getPopupSchema();
        } else {
            str = null;
        }
        if (str == null) {
            return false;
        }
        Object LIZ = C58096Mr6.LIZ(IECLayerService.class, false);
        if (LIZ != null) {
            eCLayerService = (IECLayerService) LIZ;
        } else {
            eCLayerService = new ECLayerService();
        }
        Uri.Builder builder = new Uri.Builder();
        QuitReasonData quitReasonData2 = getViewModel().LLFII;
        if (quitReasonData2 != null && (dynamicSchema = quitReasonData2.schemaInfo) != null && (popupSchema = dynamicSchema.getPopupSchema()) != null) {
            uri = C17N.LJJJJIZL(popupSchema);
        } else {
            uri = null;
        }
        Uri parse = UriProtector.parse(C29706BlG.LIZ(uri));
        Uri.Builder encodedPath = builder.scheme(parse.getScheme()).encodedAuthority(parse.getAuthority()).encodedPath(parse.getPath());
        Iterator LIZ2 = C47117IeP.LIZ(parse, "uri.queryParameterNames");
        while (LIZ2.hasNext()) {
            String str2 = (String) LIZ2.next();
            encodedPath.appendQueryParameter(str2, UriProtector.getQueryParameter(parse, str2));
        }
        ArrayList arrayList = new ArrayList();
        List<OrderShopDigest> list = getViewModel().LJLJLLL;
        if (list != null) {
            Iterator<OrderShopDigest> it = list.iterator();
            while (it.hasNext()) {
                List<OrderSKUDTO> orderSKUs = it.next().getOrderSKUs();
                if (orderSKUs != null) {
                    for (OrderSKUDTO orderSKUDTO : orderSKUs) {
                        arrayList.add(new SkuInfo(orderSKUDTO.productId, orderSKUDTO.skuId));
                    }
                }
            }
        }
        encodedPath.appendQueryParameter("track_params", C27739Aud.LJI(C51029K0z.LJJIIZI(new OSZ("extra_info", new ExtraInfo(arrayList)))));
        String uri2 = builder.build().toString();
        o.LJIIIIZZ(uri2, "Builder().apply {\n      …     }.build().toString()");
        O6N o6n = O6N.BUSINESS;
        View view2 = getView();
        if (view2 != null) {
            view = view2.findViewById(R.id.ckn);
        }
        eCLayerService.LIZ(o6n, view, uri2);
        return true;
    }

    public final void updateAnnouncementView(Announcement announcement) {
        int LJJIIZ;
        int i;
        if (C78685UuP.LJJJZ(announcement.getIconText())) {
            ImageView coupon_ic_truck = (ImageView) _$_findCachedViewById(R.id.bx9);
            o.LJIIIIZZ(coupon_ic_truck, "coupon_ic_truck");
            coupon_ic_truck.setVisibility(8);
            View coupon_ic_composite_container = _$_findCachedViewById(R.id.bx6);
            o.LJIIIIZZ(coupon_ic_composite_container, "coupon_ic_composite_container");
            coupon_ic_composite_container.setVisibility(0);
            ((TextView) _$_findCachedViewById(R.id.bx7)).setText(announcement.getIconText());
            LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(10));
        } else {
            ImageView coupon_ic_truck2 = (ImageView) _$_findCachedViewById(R.id.bx9);
            o.LJIIIIZZ(coupon_ic_truck2, "coupon_ic_truck");
            coupon_ic_truck2.setVisibility(0);
            View coupon_ic_composite_container2 = _$_findCachedViewById(R.id.bx6);
            o.LJIIIIZZ(coupon_ic_composite_container2, "coupon_ic_composite_container");
            coupon_ic_composite_container2.setVisibility(8);
            LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(6));
        }
        ((TextView) _$_findCachedViewById(R.id.jx5)).setText(announcement.getText());
        View shipping_notice_text = _$_findCachedViewById(R.id.jx5);
        o.LJIIIIZZ(shipping_notice_text, "shipping_notice_text");
        C26338AVi.LJI(shipping_notice_text, Integer.valueOf(LJJIIZ), null, null, null, false, 30);
        View shipping_notice_bold_text = _$_findCachedViewById(R.id.jx3);
        o.LJIIIIZZ(shipping_notice_bold_text, "shipping_notice_bold_text");
        if (C78685UuP.LJJJZ(announcement.getBoldText())) {
            i = 0;
        } else {
            i = 8;
        }
        shipping_notice_bold_text.setVisibility(i);
        if (C78685UuP.LJJJZ(announcement.getBoldText())) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(' ');
            LIZ.append(announcement.getBoldText());
            ((TextView) _$_findCachedViewById(R.id.jx3)).setText(X1D.LIZIZ(LIZ));
        }
        if (o.LJ(announcement.getClickable(), Boolean.TRUE)) {
            ImageView shipping_notice_nav_icon = (ImageView) _$_findCachedViewById(R.id.jx4);
            o.LJIIIIZZ(shipping_notice_nav_icon, "shipping_notice_nav_icon");
            shipping_notice_nav_icon.setVisibility(0);
            _$_findCachedViewById(R.id.bx0).setClickable(true);
            View coupon_bar = _$_findCachedViewById(R.id.bx0);
            o.LJIIIIZZ(coupon_bar, "coupon_bar");
            C16880lQ.LJIIJ(new Au2S14S0200000_4(this, announcement, 3), coupon_bar);
            return;
        }
        ImageView shipping_notice_nav_icon2 = (ImageView) _$_findCachedViewById(R.id.jx4);
        o.LJIIIIZZ(shipping_notice_nav_icon2, "shipping_notice_nav_icon");
        shipping_notice_nav_icon2.setVisibility(8);
        _$_findCachedViewById(R.id.bx0).setClickable(false);
    }

    private final void showBackInterceptDialog(Context context, boolean z) {
        if (context == null) {
            return;
        }
        boolean booleanValue = ((Boolean) C27928Axg.LIZ.getValue()).booleanValue();
        C26227ARb LIZ = C3AW.LIZ(context);
        if (booleanValue && getViewModel().LJLJJLL == 0) {
            LIZ.LIZ(R.string.slf);
            LIZ.LJ(R.string.sli);
        } else {
            if (z) {
                LIZ.LIZ(R.string.f4k);
            } else {
                LIZ.LIZ(R.string.f4l);
            }
            LIZ.LJ(R.string.r_j);
        }
        UC0.LIZJ(LIZ, new AqS28S0210000_4(context, this, booleanValue, 0));
        LIZ.LJII = false;
        LIZ.LJI().LIZLLL();
    }

    private final void showDiscountDialog(Context context, String str) {
        if (context == null) {
            return;
        }
        C33381Ss c33381Ss = new C33381Ss();
        c33381Ss.LJLIL = R.drawable.bdk;
        C73311Spv c73311Spv = new C73311Spv(context, c33381Ss.LIZ(context), new Rect(C7MY.LIZIZ(16), C7MY.LIZIZ(24), C7MY.LIZIZ(16), C7MY.LIZIZ(20)));
        C26227ARb LIZ = C3AW.LIZ(context);
        LIZ.LIZ(R.string.faz);
        String string = getString(R.string.fb0);
        o.LJIIIIZZ(string, "getString(R.string.ecom_…sion_popup_savings_title)");
        LIZ.LJFF(ujb.o.LJJJJZ(string, "{{value}}", String.valueOf(str), false));
        LIZ.LJIIIZ = c73311Spv;
        UC0.LIZJ(LIZ, new AqS135S0200000_4(this, context, 30));
        LIZ.LJII = false;
        LIZ.LJI().LIZLLL();
    }

    private final void showPaymentFailedDialog(Context context, String str) {
        if (context == null) {
            return;
        }
        C26227ARb LIZ = C3AW.LIZ(context);
        LIZ.LIZIZ(str);
        LIZ.LJ(R.string.slk);
        UC0.LIZJ(LIZ, new AqS170S0100000_4(this, 256));
        LIZ.LJII = false;
        LIZ.LJI().LIZLLL();
    }

    @Override // X.InterfaceC60061Nhh
    public void onEvent(String eventName, String params) {
        ActivityC45651qj mo49getActivity;
        String str;
        C27926Axe c27926Axe;
        Integer num;
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(params, "params");
        switch (eventName.hashCode()) {
            case -1413704395:
                if (!eventName.equals("ec_resend_pay_request")) {
                    return;
                }
                withState(getViewModel(), new AqS170S0100000_4(this, 259));
                return;
            case -1136609639:
                if (!eventName.equals("restore_sku_quantity_event") || !C27927Axf.LIZ() || (c27926Axe = getViewModel().LLJJJJ) == null || (num = c27926Axe.LIZJ) == null) {
                    return;
                }
                int intValue = num.intValue();
                C71096RvI c71096RvI = this.counterView;
                if (c71096RvI == null) {
                    return;
                }
                c71096RvI.setQuantity(intValue);
                return;
            case 333593967:
                if (!eventName.equals("ec_pay_middle_failed")) {
                    return;
                }
                PayMiddleFailedEvent payMiddleFailedEvent = null;
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), params, C65330PkU.LIZJ(C65352Pkq.LJI(PayMiddleFailedEvent.class)));
                    if (!(fromJson instanceof PayMiddleFailedEvent)) {
                        fromJson = null;
                    }
                    payMiddleFailedEvent = (PayMiddleFailedEvent) fromJson;
                } catch (s unused) {
                }
                if (payMiddleFailedEvent == null || (str = payMiddleFailedEvent.errorMessage) == null) {
                    return;
                }
                showPaymentFailedDialog(mo49getActivity(), str);
                return;
            case 1025755504:
                if (!eventName.equals("ec_pay_middle_successed") || (mo49getActivity = mo49getActivity()) == null) {
                    return;
                }
                mo49getActivity.finish();
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x01e6, code lost:
    
        if (r2 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e1, code lost:
    
        if (r2 != null) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0189  */
    /* JADX WARN: Type inference failed for: r13v5, types: [T, java.lang.Object, X.AjO] */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r33, android.os.Bundle r34) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public View com_ss_android_ugc_aweme_ecommerce_base_osp_page_OrderSubmitFragment__onCreateView$___twin___(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            return C26558Aba.LIZ(R.layout.a9y, mo49getActivity, viewGroup);
        }
        return null;
    }

    public static View com_ss_android_ugc_aweme_ecommerce_base_osp_page_OrderSubmitFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(OrderSubmitFragment orderSubmitFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View com_ss_android_ugc_aweme_ecommerce_base_osp_page_OrderSubmitFragment__onCreateView$___twin___ = orderSubmitFragment.com_ss_android_ugc_aweme_ecommerce_base_osp_page_OrderSubmitFragment__onCreateView$___twin___(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(com_ss_android_ugc_aweme_ecommerce_base_osp_page_OrderSubmitFragment__onCreateView$___twin___ instanceof View)) {
            com_ss_android_ugc_aweme_ecommerce_base_osp_page_OrderSubmitFragment__onCreateView$___twin___ = null;
        }
        if (com_ss_android_ugc_aweme_ecommerce_base_osp_page_OrderSubmitFragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(com_ss_android_ugc_aweme_ecommerce_base_osp_page_OrderSubmitFragment__onCreateView$___twin___, orderSubmitFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(com_ss_android_ugc_aweme_ecommerce_base_osp_page_OrderSubmitFragment__onCreateView$___twin___, orderSubmitFragment);
                C10A.LIZIZ(com_ss_android_ugc_aweme_ecommerce_base_osp_page_OrderSubmitFragment__onCreateView$___twin___, orderSubmitFragment);
                ActivityC45651qj mo49getActivity = orderSubmitFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return com_ss_android_ugc_aweme_ecommerce_base_osp_page_OrderSubmitFragment__onCreateView$___twin___;
    }
}
