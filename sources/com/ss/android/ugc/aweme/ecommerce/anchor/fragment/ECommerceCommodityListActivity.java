package com.ss.android.ugc.aweme.ecommerce.anchor.fragment;

import X.AVS;
import X.AbstractActivityC27434Api;
import X.AbstractC029409q;
import X.C16880lQ;
import X.C17N;
import X.C55824LvY;
import X.C65803Ps7;
import X.C70858RrS;
import X.C71334Rz8;
import X.C71343RzH;
import X.C71344RzI;
import X.C71370Rzi;
import X.C76542zS;
import X.C78915Uy7;
import X.EnumC63755P0l;
import X.EnumC71337RzB;
import X.InterfaceC18010nF;
import X.InterfaceC60061Nhh;
import Y.ACListenerS46S1100000_12;
import android.os.SystemClock;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceVideoService;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceCommodityListViewModel;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.model.CartRefreshEvent;
import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS1S2400000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ECommerceCommodityListActivity extends AbstractActivityC27434Api implements InterfaceC60061Nhh, InterfaceC18010nF {
    public ECommerceCommodityListViewModel LJLJJL;
    public C71343RzH LJLJJLL;
    public CommonVideoAnchorModel LJLJL;
    public int LJLLI;
    public int LJLLILLLL;
    public long LJLLJ;
    public boolean LJLLL;
    public final Map<Integer, View> LJZL = new LinkedHashMap();
    public List<ShopWindowAnchorModel> LJLJJI = new ArrayList();
    public final IECommerceVideoService LJLJLJ = ECommerceVideoService.LJIIJ();
    public EnumC71337RzB LJLJLLL = EnumC71337RzB.OneRowBigImage;
    public int LJLL = 1;
    public final int LJLLLL = C17N.LJIILL(4.0d);
    public final int LJLLLLLL = C17N.LJIILL(8.0d);
    public final int LJLZ = C17N.LJIILL(16.0d);
    public final int LJZ = C17N.LJIILL(78.0d);
    public final C70858RrS LJZI = new C70858RrS();

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZL).clear();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.AbstractActivityC27434Api, X.InterfaceC37828Esy
    public final String getPageName() {
        return "video_comment_anchor";
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceCommodityListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return EnumC63755P0l.COMMODITY_LIST_PAGE.getPageCode();
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        MutableLiveData<GetItemProductInfoResponseData> mutableLiveData;
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        ECommerceCommodityListViewModel eCommerceCommodityListViewModel = this.LJLJJL;
        if (eCommerceCommodityListViewModel != null && (mutableLiveData = eCommerceCommodityListViewModel.LJLIL) != null) {
            mutableLiveData.removeObservers(this);
        }
        EventCenter.LJ().LIZIZ("ec_cart_refresh", this);
        C71370Rzi.LIZ = false;
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceCommodityListActivity", "onResume", true);
        super.onResume();
        this.LJLLL = false;
        this.LJLLJ = SystemClock.elapsedRealtime();
        C76542zS.LIZJ("tiktokec_shopping_list_show", new AqS1S2400000_12(this.LJLJL, (CommonVideoAnchorModel) this.LJLJJI, (List<ShopWindowAnchorModel>) null, (Long) Integer.valueOf(this.LJLLILLLL), (Integer) null, "video_comment_multi_anchor", (String) 0));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceCommodityListActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        String str;
        C65803Ps7.LJFF(this);
        super.onStop();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLLJ;
        CommonVideoAnchorModel commonVideoAnchorModel = this.LJLJL;
        List<ShopWindowAnchorModel> list = this.LJLJJI;
        Long valueOf = Long.valueOf(elapsedRealtime);
        Integer valueOf2 = Integer.valueOf(this.LJLLILLLL);
        if (ActivityStack.isAppBackGround()) {
            str = "close";
        } else if (this.LJLLL) {
            str = "next";
        } else {
            str = "return";
        }
        C76542zS.LIZJ("tiktokec_shopping_list_staytime", new AqS1S2400000_12(commonVideoAnchorModel, (CommonVideoAnchorModel) list, (List<ShopWindowAnchorModel>) valueOf, (Long) valueOf2, (Integer) str, "video_comment_multi_anchor", (String) 0));
        this.LJLLL = false;
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    public final void LLFZ(int i) {
        try {
            AVS shopping_cart_red_badge = (AVS) _$_findCachedViewById(R.id.jyz);
            o.LJIIIIZZ(shopping_cart_red_badge, "shopping_cart_red_badge");
            int i2 = 0;
            if (i <= 0) {
                i2 = 8;
            }
            shopping_cart_red_badge.setVisibility(i2);
            ((AVS) _$_findCachedViewById(R.id.jyz)).setCount(i);
        } catch (Exception unused) {
        }
    }

    @Override // X.AbstractActivityC27434Api, X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS c70858RrS) {
        C78915Uy7.LJJIL(c70858RrS, new AqS178S0100000_12(this, 110));
        c70858RrS.LIZJ(this.LJZI);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02f6  */
    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r46) {
        /*
            Method dump skipped, instructions count: 977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceCommodityListActivity.onCreate(android.os.Bundle):void");
    }

    public final void LLII(String str, boolean z) {
        int i;
        try {
            ConstraintLayout shopping_cart_layout = (ConstraintLayout) _$_findCachedViewById(R.id.jyx);
            o.LJIIIIZZ(shopping_cart_layout, "shopping_cart_layout");
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            shopping_cart_layout.setVisibility(i);
            if (str != null) {
                C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.jyu), new ACListenerS46S1100000_12(this, str, 0));
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.AbstractActivityC27434Api, X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        int i;
        AbstractC029409q abstractC029409q;
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_cart_refresh")) {
            if (this.LJLJJLL == null) {
                this.LJLJJLL = new C71343RzH(this);
            }
            try {
                CartRefreshEvent LIZ = C55824LvY.LIZ(str);
                Integer num = LIZ.count;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.bp7);
                if (recyclerView != null) {
                    abstractC029409q = recyclerView.getAdapter();
                } else {
                    abstractC029409q = null;
                }
                if (abstractC029409q instanceof C71334Rz8) {
                }
                LLFZ(i);
                C71370Rzi.LIZ(Integer.valueOf(i));
                IECommerceVideoService iECommerceVideoService = this.LJLJLJ;
                if (iECommerceVideoService != null) {
                    ConstraintLayout root_container = (ConstraintLayout) _$_findCachedViewById(R.id.j7b);
                    o.LJIIIIZZ(root_container, "root_container");
                    iECommerceVideoService.LJ(root_container, this, this.LJLJJLL, LIZ.toast, C71344RzI.LJLIL);
                }
            } catch (Exception unused) {
            }
        }
    }
}
