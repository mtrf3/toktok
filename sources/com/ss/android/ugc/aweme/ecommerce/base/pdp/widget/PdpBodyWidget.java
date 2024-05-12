package com.ss.android.ugc.aweme.ecommerce.base.pdp.widget;

import X.AnonymousClass636;
import X.C0A2;
import X.C16880lQ;
import X.C221108m2;
import X.C26059AKp;
import X.C26338AVi;
import X.C26430AYw;
import X.C26706Ady;
import X.C26778Af8;
import X.C26830Afy;
import X.C26838Ag6;
import X.C26845AgD;
import X.C26847AgF;
import X.C26870Agc;
import X.C27127Akl;
import X.C27162AlK;
import X.C27172AlU;
import X.C27515Ar1;
import X.C27516Ar2;
import X.C27528ArE;
import X.C27531ArH;
import X.C27546ArW;
import X.C27570Aru;
import X.C27739Aud;
import X.C28036AzQ;
import X.C2U8;
import X.C34K;
import X.C38350F3i;
import X.C39468FeK;
import X.C40443Fu3;
import X.C42625Go9;
import X.C47261Igj;
import X.C48257Iwn;
import X.C51029K0z;
import X.C5H3;
import X.C61845OOz;
import X.C61928OSe;
import X.C65330PkU;
import X.C65340Pke;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65777Prh;
import X.C69687RWp;
import X.C69978RdG;
import X.C70212Rh2;
import X.C70414RkI;
import X.C70441Rkj;
import X.C70445Rkn;
import X.C70446Rko;
import X.C70448Rkq;
import X.C70449Rkr;
import X.C70450Rks;
import X.C70451Rkt;
import X.C70456Rky;
import X.C70459Rl1;
import X.C70699Rot;
import X.C70920RsS;
import X.C70933Rsf;
import X.C71062Ruk;
import X.C71312Rym;
import X.C72262SXq;
import X.C73156SnQ;
import X.C73305Spp;
import X.C73340SqO;
import X.C76542zS;
import X.C77125UOr;
import X.C78929UyL;
import X.C78946Uyc;
import X.DialogC25756A8y;
import X.EnumC61929OSf;
import X.ExecutorC142245i8;
import X.FKM;
import X.InterfaceC26837Ag5;
import X.InterfaceC27538ArO;
import X.InterfaceC60061Nhh;
import X.InterfaceC69697RWz;
import X.InterfaceC69824Ram;
import X.KL2;
import X.L9X;
import X.MKQ;
import X.O9B;
import X.ORZ;
import X.OSZ;
import X.QD3;
import X.RunnableC70066Reg;
import X.SC5;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS46S0200000_12;
import Y.AUListenerS72S0101000_12;
import Y.IDLListenerS198S0100000_12;
import Y.IDrS14S0200000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RankInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.IPdpBodyWidgetStyle;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewImageItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.core.utils.ScrollTopLinearLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.Au2S7S0000000_12;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS128S0300000_12;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.IDqS183S0200000_4;
import kotlin.jvm.internal.IDqS186S0200000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import wg5.c;

/* loaded from: classes13.dex */
public final class PdpBodyWidget extends JediBaseWidget implements InterfaceC60061Nhh, c {
    public static final C70456Rky Companion = new C70456Rky();
    public Map<Integer, View> _$_findViewCache;
    public C26778Af8 adapter;
    public boolean dataMounted;
    public final float emptySpaceHeight;
    public final PdpFragment fragment;
    public boolean hasUpdateUserActs;
    public final float headNavBarHeight;
    public String lastUsedVapSchema;
    public final C5H3 loadingDialog$delegate;
    public boolean mTouchDownReset;
    public final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    public final C5H3 pdpRecyclerScrollDetector$delegate;
    public C70212Rh2 promotionBannerView;
    public Map<String, Object> searchQueryData;
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
        return R.layout.a2f;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final C70459Rl1 getPdpRecyclerScrollDetector() {
        return (C70459Rl1) this.pdpRecyclerScrollDetector$delegate.getValue();
    }

    private final void initSubscribe() {
        MKQ mkq;
        View view = this.contentView;
        if (view == null || (mkq = (MKQ) view.findViewById(R.id.isf)) == null) {
            return;
        }
        C34K c34k = new C34K();
        c34k.element = true;
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.RiY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getContentList();
            }
        }, new AqS128S0300000_12(this, mkq, c34k, 1));
        C73156SnQ.LJII(this, getViewModel(), new TBT() { // from class: X.Asa
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getScrollOffset());
            }
        }, new TBT() { // from class: X.Rdl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getReviewInfo();
            }
        }, new IDqS183S0200000_4(this, new C34K(), 2));
        C73156SnQ.LJII(this, getViewModel(), new TBT() { // from class: X.Rkk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((PdpMainState) obj).getBottomSheetSlideOffset());
            }
        }, new TBT() { // from class: X.Asb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getScrollOffset());
            }
        }, new IDqS186S0200000_12(this, mkq, 1));
        getViewModel().Lv0(new AqS170S0100000_4(this, 313));
        C73156SnQ.LJII(this, getViewModel(), new TBT() { // from class: X.Rgd
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getLoadingStatus());
            }
        }, new TBT() { // from class: X.Rdk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getBlockInfo();
            }
        }, new IDqS436S0100000_12(this, 5));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rdj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getFocusTabAction();
            }
        }, new AqS186S0100000_4(this, 89));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Aex
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getFlashSaleState();
            }
        }, new AqS186S0100000_4(this, 90));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rkm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((PdpMainState) obj).getShowLoadingDialog());
            }
        }, new AqS186S0100000_4(this, 91));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Res
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getPlatformPromotion();
            }
        }, new AqS194S0100000_12(this, 62));
        C42625Go9.LIZIZ(this);
    }

    public final DialogC25756A8y getLoadingDialog() {
        return (DialogC25756A8y) this.loadingDialog$delegate.getValue();
    }

    public final IPdpBodyWidgetStyle getStyle() {
        return (IPdpBodyWidgetStyle) this.style$delegate.getValue();
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.viewModel$delegate.getValue();
    }

    @Override // com.bytedance.widget.Widget
    public void onResume() {
        C70450Rks c70450Rks = new C70450Rks(getViewModel().jw0());
        ((Map) c70450Rks.LJLILLLLZI).put("enter_from_merge", getViewModel().cw0());
        c70450Rks.LJIIJ();
        O9B o9b = getViewModel().LLJLIL;
        PdpFragment pdpFragment = this.fragment;
        o.LJII(pdpFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.slark.api.ITrackNode");
        o9b.LIZIZ(pdpFragment, getViewModel(), getViewModel().jw0());
        Map<String, Object> map = null;
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), C39468FeK.LIZ("search_query_data"), C65330PkU.LIZJ(C65352Pkq.LIZJ(C65352Pkq.LJIIIIZZ(Map.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)), C65340Pke.LIZ(C65352Pkq.LJI(Object.class))))));
            if (!C65777Prh.LJII(fromJson)) {
                fromJson = null;
            }
            map = (Map) fromJson;
        } catch (s unused) {
        }
        this.searchQueryData = map;
        super.onResume();
    }

    public final void removeGlobalLayoutListener() {
        View findViewById;
        ViewTreeObserver viewTreeObserver;
        View view = this.contentView;
        if (view != null && (findViewById = view.findViewById(R.id.isf)) != null && (viewTreeObserver = findViewById.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        }
    }

    private final void initStatusView() {
        C73305Spp c73305Spp;
        View view;
        View findViewById;
        if (!getViewModel().LJLJL && (view = this.contentView) != null && (findViewById = view.findViewById(R.id.keh)) != null) {
            C26338AVi.LJIIIZ(findViewById, null, null, null, Integer.valueOf((int) this.emptySpaceHeight), 23);
        }
        View view2 = this.contentView;
        if (view2 != null && (c73305Spp = (C73305Spp) view2.findViewById(R.id.keh)) != null) {
            Context context = c73305Spp.getContext();
            o.LJIIIIZZ(context, "it.context");
            c73305Spp.LIZJ(C27531ArH.LIZ(((InterfaceC69824Ram) C73340SqO.LJIILJJIL(getViewModel(), InterfaceC69824Ram.class)).Rf(), context, c73305Spp, false));
            C16880lQ.LJIIJ(new Au2S7S0000000_12(0), c73305Spp);
        }
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.bytedance.widget.Widget
    public void onCreate() {
        Context context;
        super.onCreate();
        View view = this.contentView;
        if (view != null && (context = view.getContext()) != null) {
            initStatusView();
            initRecyclerView(context);
            initSubscribe();
        }
        View view2 = this.contentView;
        if (view2 != null) {
            ((MKQ) view2.findViewById(R.id.isf)).setDownListener(new C70446Rko(this));
            view2.findViewById(R.id.le_).setVisibility(8);
            view2.findViewById(R.id.le_).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS46S0200000_12(this, view2, 12)));
            ((C72262SXq) view2.findViewById(R.id.and)).setListener(new C70441Rkj(this));
        }
        C26059AKp.LIZ().LIZJ("ec_live_shop_widget_on_destroy", this);
    }

    @Override // com.bytedance.widget.Widget
    public void onDestroy() {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        super.onDestroy();
        WeakReference<L9X> weakReference = L9X.LIZJ;
        if (weakReference != null) {
            weakReference.clear();
        }
        L9X.LIZJ = null;
        C70414RkI c70414RkI = getViewModel().LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJJIFFI.clear();
        }
        ProductPackStruct productPackStruct = getViewModel().LJLJLLL;
        String str5 = "";
        if (productPackStruct == null || (str = productPackStruct.productId) == null) {
            str = "";
        }
        C70699Rot remove = C70699Rot.LJLLLL.remove(str);
        if (remove != null) {
            remove.LJLJJI.LJIIIZ();
            remove.LJLJJL.LJIIIZ();
            remove.LJLJL = null;
        }
        removeGlobalLayoutListener();
        C42625Go9.LIZJ(this);
        ((LinkedHashMap) C48257Iwn.LIZ).clear();
        ProductPackStruct productPackStruct2 = getViewModel().LJLJLLL;
        if (productPackStruct2 != null && (str4 = productPackStruct2.productId) != null) {
            str5 = str4;
        }
        boolean z = getViewModel().LJLJLJ;
        IPdpStarter.PdpEnterParam pdpEnterParam = getViewModel().LJLJJLL;
        if (pdpEnterParam != null) {
            str2 = pdpEnterParam.getAwemeId();
        } else {
            str2 = null;
        }
        IPdpStarter.PdpEnterParam pdpEnterParam2 = getViewModel().LJLJJLL;
        if (pdpEnterParam2 != null) {
            str3 = pdpEnterParam2.getClickFrom();
        } else {
            str3 = null;
        }
        if (z) {
            i = 2;
        } else {
            i = 3;
        }
        C2U8.LIZ(new C71062Ruk(4, str5, str2, str3, Integer.valueOf(i)));
        C70459Rl1 pdpRecyclerScrollDetector = getPdpRecyclerScrollDetector();
        pdpRecyclerScrollDetector.LIZIZ = null;
        pdpRecyclerScrollDetector.LIZJ = null;
        C26059AKp.LIZ().LIZIZ("ec_live_shop_widget_on_destroy", this);
    }

    @Override // com.bytedance.widget.Widget
    public void onStart() {
        super.onStart();
        C70414RkI c70414RkI = getViewModel().LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJ = SystemClock.elapsedRealtime();
            c70414RkI.LJFF = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.widget.Widget
    public void onStop() {
        super.onStop();
        if (ActivityStack.isAppBackGround()) {
            C70414RkI c70414RkI = getViewModel().LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJ = "close";
            }
            C61928OSe c61928OSe = new C61928OSe(getViewModel().jw0());
            c61928OSe.LJIIL(this.fragment.getStayDuration());
            EnumC61929OSf enumC61929OSf = EnumC61929OSf.CLOSE;
            c61928OSe.LJIILIIL(enumC61929OSf);
            c61928OSe.LJIIJ();
            C70414RkI c70414RkI2 = getViewModel().LLFII;
            if (c70414RkI2 != null) {
                c70414RkI2.LJJJJJL(enumC61929OSf);
            }
        }
        C70414RkI c70414RkI3 = getViewModel().LLFII;
        long j = 0;
        if (c70414RkI3 != null) {
            long j2 = c70414RkI3.LJ;
            if (j2 != 0) {
                j = SystemClock.elapsedRealtime() - j2;
            }
        }
        ExecutorC142245i8.LJLILLLLZI.execute(new RunnableC70066Reg(this, j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ae, code lost:
    
        if (r9 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0206, code lost:
    
        if (r9 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0076, code lost:
    
        if (r9 != null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateUserAction() {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget.updateUserAction():void");
    }

    public final PdpFragment getFragment() {
        return this.fragment;
    }

    public PdpBodyWidget(PdpFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.viewModel$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 72));
        this.emptySpaceHeight = C27162AlK.LIZIZ - C27162AlK.LIZIZ();
        this.headNavBarHeight = KL2.LIZJ(FKM.LIZ(), 44.0f);
        this.mTouchDownReset = true;
        this.loadingDialog$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 375));
        this.pdpRecyclerScrollDetector$delegate = C221108m2.LIZIZ(C70449Rkr.LJLIL);
        this.lastUsedVapSchema = "";
        this.style$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 374));
        this.onGlobalLayoutListener = new IDLListenerS198S0100000_12(this, 0);
    }

    private final void initRecyclerView(Context context) {
        MKQ mkq;
        View view = this.contentView;
        if (view == null || (mkq = (MKQ) view.findViewById(R.id.isf)) == null) {
            return;
        }
        mkq.setItemAnimator(null);
        PdpFragment pdpFragment = this.fragment;
        C26778Af8 c26778Af8 = new C26778Af8(pdpFragment, pdpFragment.LJLJJLL);
        c26778Af8.setShowFooter(false);
        this.adapter = c26778Af8;
        mkq.setAdapter(c26778Af8);
        if (C26830Afy.LIZ()) {
            mkq.setItemViewCacheSize(10);
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.jv);
        ScrollTopLinearLayoutManager scrollTopLinearLayoutManager = new ScrollTopLinearLayoutManager(context);
        scrollTopLinearLayoutManager.LLIIIJ = dimensionPixelSize;
        mkq.setLayoutManager(scrollTopLinearLayoutManager);
        mkq.setItemAnimator(null);
        mkq.LJII(new C71312Rym(KL2.LIZJ(context, 16.0f), AnonymousClass636.LJIIIIZZ(R.attr.dz, context), (int) KL2.LIZJ(context, 0.5f)), -1);
        mkq.LJIIJJI(new C69978RdG(this, getViewModel().mw0() + context.getResources().getDimensionPixelSize(R.dimen.ju) + dimensionPixelSize));
        C70459Rl1 pdpRecyclerScrollDetector = getPdpRecyclerScrollDetector();
        C70451Rkt c70451Rkt = new C70451Rkt(this);
        pdpRecyclerScrollDetector.getClass();
        pdpRecyclerScrollDetector.LIZIZ = mkq;
        pdpRecyclerScrollDetector.LIZJ = c70451Rkt;
        mkq.setMFlingListener(new C70448Rkq(pdpRecyclerScrollDetector));
        mkq.LJIIJJI(new IDrS14S0200000_12(pdpRecyclerScrollDetector, mkq, 0));
        mkq.getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
        C40443Fu3.LIZ("tiktokec_anchor_product_detail").LJIIIIZZ(mkq);
    }

    private final void showBannerAnim(int i) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new AUListenerS72S0101000_12(i, this, 0));
        ofFloat.start();
    }

    @QD3
    public final void onRefreshPdp(C28036AzQ event) {
        String str;
        o.LJIIIZ(event, "event");
        String str2 = event.LJLIL;
        ProductPackStruct productPackStruct = getViewModel().LJLJLLL;
        if (productPackStruct != null) {
            str = productPackStruct.productId;
        } else {
            str = null;
        }
        if (o.LJ(str2, str)) {
            PdpViewModel.bx0(getViewModel(), false, true, null, null, 28);
        }
    }

    public final void trackImpression(RecyclerView recyclerView) {
        int i;
        C70445Rkn c70445Rkn;
        int i2;
        ReviewItemStruct.AppendReview appendReview;
        List<ReviewMedia> list;
        String uri;
        boolean z;
        List<ReviewMedia> list2;
        String uri2;
        boolean z2;
        String str;
        String str2;
        C70414RkI c70414RkI;
        String str3;
        String str4;
        String str5;
        Resources resources = recyclerView.getContext().getResources();
        if (getViewModel().zw0()) {
            i = R.dimen.jq;
        } else {
            i = R.dimen.jp;
        }
        float dimension = resources.getDimension(i);
        int[] iArr = new int[2];
        C0A2 layoutManager = recyclerView.getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int LLILL = linearLayoutManager.LLILL();
        int LLILLJJLI = linearLayoutManager.LLILLJJLI();
        if (LLILL > LLILLJJLI) {
            return;
        }
        while (true) {
            View LJJIJIL = linearLayoutManager.LJJIJIL(LLILL);
            if (LJJIJIL == null) {
                return;
            }
            Object tag = LJJIJIL.getTag(R.id.bny);
            C27127Akl c27127Akl = null;
            String str6 = null;
            if ((tag instanceof C70445Rkn) && (c70445Rkn = (C70445Rkn) tag) != null) {
                LJJIJIL.getLocationInWindow(iArr);
                int i3 = iArr[1];
                View view = this.contentView;
                int i4 = 0;
                if (view != null) {
                    i2 = view.getHeight();
                } else {
                    i2 = 0;
                }
                int i5 = (int) (i2 - dimension);
                if (1 <= i3 && i3 < i5) {
                    if (!c70445Rkn.LJLILLLLZI) {
                        c70445Rkn.LJLILLLLZI = true;
                        Object obj = c70445Rkn.LJLIL;
                        if (obj instanceof C27516Ar2) {
                            C70414RkI c70414RkI2 = getViewModel().LLFII;
                            if (c70414RkI2 != null) {
                                C27516Ar2 productPromotionVO = (C27516Ar2) c70445Rkn.LJLIL;
                                o.LJIIIZ(productPromotionVO, "productPromotionVO");
                                if (!c70414RkI2.LJJIJLIJ) {
                                    c70414RkI2.LJJIJLIJ = true;
                                    if (C26847AgF.LIZ()) {
                                        C78946Uyc.LJJII(c70414RkI2.LJIJI(), new C70920RsS(), new AqS135S0200000_4(c70414RkI2, productPromotionVO, 310));
                                    } else {
                                        C76542zS.LJ("tiktokec_module_show", new AqS135S0200000_4(c70414RkI2, productPromotionVO, 313));
                                    }
                                }
                            }
                        } else if (obj instanceof C27515Ar1) {
                            C70414RkI c70414RkI3 = getViewModel().LLFII;
                            if (c70414RkI3 != null) {
                                C27515Ar1 productPromotionVO2 = (C27515Ar1) c70445Rkn.LJLIL;
                                o.LJIIIZ(productPromotionVO2, "productPromotionVO");
                                if (!c70414RkI3.LJJIL) {
                                    c70414RkI3.LJJIL = true;
                                    if (C26847AgF.LIZ()) {
                                        C78946Uyc.LJJII(c70414RkI3.LJIJI(), new C70920RsS(), new AqS135S0200000_4(c70414RkI3, productPromotionVO2, 308));
                                    } else {
                                        C76542zS.LJ("tiktokec_module_show", new AqS135S0200000_4(c70414RkI3, productPromotionVO2, 309));
                                    }
                                }
                            }
                        } else if (obj instanceof C27528ArE) {
                            C70414RkI c70414RkI4 = getViewModel().LLFII;
                            if (c70414RkI4 != null) {
                                C70414RkI.LJJJJI(c70414RkI4, "sku", getViewModel().LJLJL, false, null, C51029K0z.LJJIIZI(new OSZ("is_photo_show", Integer.valueOf(((C27528ArE) obj).LJLJJI ? 1 : 0))), 44);
                            }
                        } else if ((obj instanceof C27172AlU) && o.LJ(((C27172AlU) obj).LJLILLLLZI, "title")) {
                            if (i3 < i5 / 2) {
                                c70445Rkn.LJLILLLLZI = true;
                            }
                        } else if (obj instanceof C27546ArW) {
                            C70414RkI c70414RkI5 = getViewModel().LLFII;
                            if (c70414RkI5 != null) {
                                C70414RkI.LJJJJI(c70414RkI5, "showcase_detail", getViewModel().LJLJL, false, null, null, 60);
                            }
                            C27546ArW c27546ArW = (C27546ArW) obj;
                            String str7 = c27546ArW.LJLJL;
                            if (str7 != null && !ujb.o.LJJJJJL(str7)) {
                                PdpViewModel viewModel = getViewModel();
                                String str8 = c27546ArW.LJLIL;
                                Float LJJIJLIJ = C38350F3i.LJJIJLIJ(c27546ArW.LJLJJL);
                                StoreOfficialLabel storeOfficialLabel = c27546ArW.LJLJLJ;
                                if (storeOfficialLabel != null) {
                                    str4 = storeOfficialLabel.labelTypeStr;
                                } else {
                                    str4 = null;
                                }
                                List<SellerDetailInfo> list3 = c27546ArW.LJLL;
                                SellerSellingPoint sellerSellingPoint = c27546ArW.LJLLLL;
                                if (sellerSellingPoint != null) {
                                    str5 = sellerSellingPoint.sellingPoints;
                                } else {
                                    str5 = null;
                                }
                                if (storeOfficialLabel != null) {
                                    str6 = storeOfficialLabel.labelTypeStr;
                                }
                                viewModel.Dw0(LJJIJLIJ, str8, "showcase_detail", str4, str5, str6, list3);
                            }
                        } else {
                            Object obj2 = c70445Rkn.LJLIL;
                            if (obj2 instanceof C69687RWp) {
                                C70414RkI c70414RkI6 = getViewModel().LLFII;
                                if (c70414RkI6 != null) {
                                    c70414RkI6.LJJJ(((C69687RWp) c70445Rkn.LJLIL).LJIIIZ);
                                }
                            } else if (obj instanceof RankInfo) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                RankInfo rankInfo = (RankInfo) obj;
                                String str9 = rankInfo.tpp;
                                if (str9 != null && !ujb.o.LJJJJJL(str9)) {
                                    linkedHashMap.put("ranking_name", str9);
                                }
                                String str10 = rankInfo.rankId;
                                if (str10 != null) {
                                    linkedHashMap.put("ranking_id", str10);
                                }
                                Integer num = rankInfo.rankLevelNum;
                                if (num != null) {
                                    C61845OOz.LIZLLL(num, linkedHashMap, "ranking_num");
                                }
                                String str11 = rankInfo.schema;
                                if (str11 == null || ujb.o.LJJJJJL(str11)) {
                                    i4 = 1;
                                }
                                linkedHashMap.put("is_clickable", Integer.valueOf(1 ^ i4));
                                C70414RkI c70414RkI7 = getViewModel().LLFII;
                                if (c70414RkI7 != null) {
                                    C70414RkI.LJJJJI(c70414RkI7, "product_ranking", getViewModel().LJLJL, false, null, linkedHashMap, 44);
                                }
                            } else if ((obj2 instanceof C26870Agc) || (obj2 instanceof ReviewItemStruct)) {
                                C70414RkI c70414RkI8 = getViewModel().LLFII;
                                if (c70414RkI8 != null) {
                                    c70414RkI8.LJJLI(c70445Rkn.LJLIL);
                                }
                                if (c70445Rkn.LJLIL instanceof ReviewItemStruct) {
                                    C70414RkI c70414RkI9 = getViewModel().LLFII;
                                    if (c70414RkI9 != null) {
                                        ReviewItemStruct reviewItemStruct = (ReviewItemStruct) c70445Rkn.LJLIL;
                                        o.LJIIIZ(reviewItemStruct, "reviewItemStruct");
                                        HashSet<String> hashSet = c70414RkI9.LJJIJIL;
                                        ReviewItemStruct.MainReview mainReview = reviewItemStruct.review;
                                        if (mainReview != null) {
                                            str = mainReview.reviewId;
                                        } else {
                                            str = null;
                                        }
                                        if (!ORZ.LJLJJI(str, hashSet)) {
                                            ReviewItemStruct.MainReview mainReview2 = reviewItemStruct.review;
                                            if (mainReview2 != null && (str2 = mainReview2.reviewId) != null) {
                                                c70414RkI9.LJJIJIL.add(str2);
                                            }
                                            if (C26847AgF.LIZ()) {
                                                C78946Uyc.LJJII(c70414RkI9.LJIJI(), new C70933Rsf(), new AqS143S0200000_12(c70414RkI9, reviewItemStruct, 155));
                                            } else {
                                                C76542zS.LJ("tiktokec_review_show", new AqS143S0200000_12(c70414RkI9, reviewItemStruct, 156));
                                            }
                                        }
                                    }
                                    C70414RkI c70414RkI10 = getViewModel().LLFII;
                                    if (c70414RkI10 != null) {
                                        ReviewItemStruct reviewItemStruct2 = (ReviewItemStruct) c70445Rkn.LJLIL;
                                        o.LJIIIZ(reviewItemStruct2, "reviewItemStruct");
                                        if (!c70414RkI10.LJIJJ()) {
                                            ReviewItemStruct.MainReview mainReview3 = reviewItemStruct2.review;
                                            if (mainReview3 != null && (list2 = mainReview3.media) != null) {
                                                int i6 = 0;
                                                for (ReviewMedia reviewMedia : list2) {
                                                    int i7 = i6 + 1;
                                                    if (i6 >= 0) {
                                                        ReviewMedia reviewMedia2 = reviewMedia;
                                                        String str12 = reviewItemStruct2.review.reviewId;
                                                        Integer num2 = reviewMedia2.mediaType;
                                                        if (num2 == null || num2.intValue() != 1) {
                                                            Video video = reviewMedia2.video;
                                                            if (video != null) {
                                                                uri2 = video.id;
                                                            }
                                                            uri2 = null;
                                                        } else {
                                                            Image image = reviewMedia2.image;
                                                            if (image != null) {
                                                                uri2 = image.getUri();
                                                            }
                                                            uri2 = null;
                                                        }
                                                        String valueOf = String.valueOf(uri2);
                                                        Boolean bool = reviewItemStruct2.isOwner;
                                                        if (bool != null) {
                                                            z2 = bool.booleanValue();
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        c70414RkI10.LJJJLIIL(i6, Boolean.valueOf(z2), str12, valueOf, null);
                                                        i6 = i7;
                                                    } else {
                                                        C47261Igj.LJJJJJ();
                                                        throw null;
                                                    }
                                                }
                                            }
                                            ReviewItemStruct.MainReview mainReview4 = reviewItemStruct2.review;
                                            if (mainReview4 != null && (appendReview = mainReview4.appendReview) != null && (list = appendReview.media) != null) {
                                                int i8 = 0;
                                                for (ReviewMedia reviewMedia3 : list) {
                                                    int i9 = i8 + 1;
                                                    if (i8 >= 0) {
                                                        ReviewMedia reviewMedia4 = reviewMedia3;
                                                        String str13 = reviewItemStruct2.review.reviewId;
                                                        Integer num3 = reviewMedia4.mediaType;
                                                        if (num3 == null || num3.intValue() != 1) {
                                                            Video video2 = reviewMedia4.video;
                                                            if (video2 != null) {
                                                                uri = video2.id;
                                                            }
                                                            uri = null;
                                                        } else {
                                                            Image image2 = reviewMedia4.image;
                                                            if (image2 != null) {
                                                                uri = image2.getUri();
                                                            }
                                                            uri = null;
                                                        }
                                                        String valueOf2 = String.valueOf(uri);
                                                        Boolean bool2 = reviewItemStruct2.isOwner;
                                                        if (bool2 != null) {
                                                            z = bool2.booleanValue();
                                                        } else {
                                                            z = false;
                                                        }
                                                        c70414RkI10.LJJJLIIL(i8, Boolean.valueOf(z), str13, valueOf2, null);
                                                        i8 = i9;
                                                    } else {
                                                        C47261Igj.LJJJJJ();
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (obj2 instanceof C26838Ag6) {
                                C70414RkI c70414RkI11 = getViewModel().LLFII;
                                if (c70414RkI11 != null) {
                                    c70414RkI11.LJJLIIIIJ();
                                }
                            } else if (obj2 instanceof C26845AgD) {
                                C70414RkI c70414RkI12 = getViewModel().LLFII;
                                if (c70414RkI12 != null) {
                                    C26845AgD reviewImageAreaVO = (C26845AgD) c70445Rkn.LJLIL;
                                    o.LJIIIZ(reviewImageAreaVO, "reviewImageAreaVO");
                                    if (c70414RkI12.LJIJJ()) {
                                        for (ReviewImageItem reviewImageItem : reviewImageAreaVO.LJLIL) {
                                            List<Image> list4 = reviewImageItem.images;
                                            if (list4 != null) {
                                                for (Image image3 : list4) {
                                                    String str14 = reviewImageItem.reviewId;
                                                    if (str14 == null) {
                                                        str14 = "";
                                                    }
                                                    String valueOf3 = String.valueOf(image3.getUri());
                                                    Boolean bool3 = reviewImageItem.isOwner;
                                                    Integer num4 = reviewImageItem.rating;
                                                    if (num4 != null) {
                                                        str3 = num4.toString();
                                                    } else {
                                                        str3 = null;
                                                    }
                                                    c70414RkI12.LJJJLIIL(i4, bool3, str14, valueOf3, str3);
                                                    i4++;
                                                    if (i4 == 4) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (obj2 instanceof C26430AYw) {
                                C70414RkI c70414RkI13 = getViewModel().LLFII;
                                if (c70414RkI13 != null && !c70414RkI13.LJJIZ) {
                                    c70414RkI13.LJJIZ = true;
                                    if (C26847AgF.LIZ()) {
                                        C78946Uyc.LJJII(c70414RkI13.LJIJI(), new C70920RsS(), new AqS170S0100000_4(c70414RkI13, 1550));
                                    } else {
                                        C76542zS.LJ("tiktokec_module_show", new AqS170S0100000_4(c70414RkI13, 1551));
                                    }
                                }
                            } else if ((obj2 instanceof InterfaceC26837Ag5) && (c70414RkI = getViewModel().LLFII) != null) {
                                String LJJLIL = ((InterfaceC26837Ag5) c70445Rkn.LJLIL).LJJLIL();
                                boolean z3 = getViewModel().LJLJL;
                                Object obj3 = c70445Rkn.LJLIL;
                                if (obj3 instanceof C27127Akl) {
                                    c27127Akl = (C27127Akl) obj3;
                                }
                                C70414RkI.LJJJJI(c70414RkI, LJJLIL, z3, false, c27127Akl, null, 52);
                            }
                        }
                    }
                } else if (c70445Rkn.LJLILLLLZI) {
                    c70445Rkn.LJLILLLLZI = false;
                }
            }
            if (LLILL != LLILLJJLI) {
                LLILL++;
            } else {
                return;
            }
        }
    }

    public final void trackPdpPageDataMounted(List<? extends Object> list) {
        Image image;
        Object obj;
        String uri;
        List<Image> images;
        if (!getViewModel().LLIIII) {
            this.dataMounted = true;
            Iterator<? extends Object> it = list.iterator();
            while (true) {
                image = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (obj instanceof InterfaceC69697RWz) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            InterfaceC69697RWz interfaceC69697RWz = (InterfaceC69697RWz) obj;
            if (interfaceC69697RWz != null && (images = interfaceC69697RWz.getImages()) != null) {
                image = (Image) ORZ.LJLLLL(images);
            }
            ArrayList arrayList = new ArrayList();
            if (image != null && (uri = image.getUri()) != null) {
                arrayList.add(uri);
            }
            PdpFragment pdpFragment = this.fragment;
            if ((pdpFragment instanceof InterfaceC27538ArO) && pdpFragment != null) {
                C78929UyL.LJIJJ(pdpFragment, arrayList);
            }
        }
    }

    @Override // X.InterfaceC60061Nhh
    public void onEvent(String str, String str2) {
        Object obj;
        HashMap<String, Object> trackParams;
        if (SC5.LIZIZ(str, "eventName", str2, "params", str, "ec_live_shop_widget_on_destroy")) {
            Boolean bool = null;
            try {
                Object obj2 = new JSONObject(str2).get("room_id");
                if (obj2 != null) {
                    IPdpStarter.PdpEnterParam pdpEnterParam = getViewModel().LJLJJLL;
                    if (pdpEnterParam != null && (trackParams = pdpEnterParam.getTrackParams()) != null) {
                        obj = trackParams.get("lineup_room_id");
                    } else {
                        obj = null;
                    }
                    if (o.LJ(obj2, obj)) {
                        bool = Boolean.TRUE;
                    }
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
            }
            if (o.LJ(bool, Boolean.TRUE)) {
                getViewModel().Ov0(C77125UOr.LIZJ(this), this.fragment);
            }
        }
    }

    public final void translatePromotionBanner(float f, int i) {
        if (this.promotionBannerView == null || !getStyle().getShowPlatformPromotion()) {
            return;
        }
        int height = _$_findCachedViewById(R.id.aga).getHeight();
        if (!getViewModel().LLII && f >= 0.0f && f <= 1.0f && i <= 0) {
            _$_findCachedViewById(R.id.isf).setTranslationY(height * f);
        }
        if (f < 1.0f) {
            return;
        }
        int i2 = C27162AlK.LIZIZ;
        int i3 = i2 / 4;
        int i4 = i2 / 2;
        if (i >= i4) {
            i = i4;
        }
        if (i <= i3) {
            i = i3;
        }
        float f2 = 1;
        float f3 = (i3 / (i3 - i4)) + ((f2 / (i4 - i3)) * i);
        float f4 = height;
        float f5 = (f2 - f3) * f4;
        if (f5 == _$_findCachedViewById(R.id.isf).getTranslationY()) {
            return;
        }
        _$_findCachedViewById(R.id.isf).setTranslationY(f5);
        _$_findCachedViewById(R.id.aga).setTranslationY((-f3) * f4);
    }

    public final void initBanner(Context context, boolean z, boolean z2) {
        int i = C70212Rh2.LJLJJL;
        if (z) {
            i = C70212Rh2.LJLJJLL;
        }
        if (!z2) {
            i += C70212Rh2.LJLJL;
        }
        if (this.promotionBannerView == null) {
            this.promotionBannerView = new C70212Rh2(context, null, 0);
            View banner = _$_findCachedViewById(R.id.aga);
            o.LJIIIIZZ(banner, "banner");
            banner.setVisibility(0);
            ((ViewGroup) _$_findCachedViewById(R.id.aga)).addView(this.promotionBannerView);
            View banner2 = _$_findCachedViewById(R.id.aga);
            o.LJIIIIZZ(banner2, "banner");
            C27570Aru.LJII(i, banner2);
            if (!getViewModel().LLII) {
                _$_findCachedViewById(R.id.aga).setTranslationY(0.0f);
                _$_findCachedViewById(R.id.isf).setTranslationY(0.0f);
            } else {
                _$_findCachedViewById(R.id.aga).setTranslationY(-i);
                showBannerAnim(i);
            }
        }
    }
}
