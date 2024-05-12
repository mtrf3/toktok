package com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.ui;

import X.AbstractC40201Fq9;
import X.AbstractC61062Nxq;
import X.AbstractC61066Nxu;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C109464Ri;
import X.C10A;
import X.C117144ik;
import X.C141335gf;
import X.C16880lQ;
import X.C186627Uc;
import X.C1B3;
import X.C1B6;
import X.C2068389v;
import X.C29S;
import X.C2NU;
import X.C3C5;
import X.C40204FqC;
import X.C42193GhB;
import X.C59209NLp;
import X.C65300Pk0;
import X.C65304Pk4;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C73426Srm;
import X.C73775SxP;
import X.C73849Syb;
import X.C73969T1h;
import X.C76800UCe;
import X.C78857UxB;
import X.C78999UzT;
import X.C8ZK;
import X.C90903hW;
import X.FMX;
import X.InterfaceC57784Mm4;
import X.InterfaceC61065Nxt;
import X.InterfaceC64592gB;
import X.NGQ;
import X.NHG;
import X.OGG;
import X.T16;
import Y.AfS62S0100000_10;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.ecommerce.service.ShoppingAdsServiceImpl;
import com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.manager.WishListManager;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class WishListFragment extends Hilt_WishListFragment implements InterfaceC61065Nxt, OGG, C8ZK {
    public WishListManager LJLJJI;
    public C73305Spp LJLJJL;
    public FrameLayout LJLJJLL;
    public SparkFragment LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public AqS160S0100000_10 LJLL;
    public String LJLLI;
    public View LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();

    @Override // X.InterfaceC61065Nxt
    public final void Bj() {
        boolean z;
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            C73305Spp c73305Spp = this.LJLJJL;
            if (c73305Spp != null) {
                c73305Spp.setVisibility(8);
                FrameLayout frameLayout = this.LJLJJLL;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                    return;
                } else {
                    o.LJIJI("wishListContentContainer");
                    throw null;
                }
            }
            o.LJIJI("statusView");
            throw null;
        }
        C73305Spp c73305Spp2 = this.LJLJJL;
        if (c73305Spp2 != null) {
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJI(c73306Spq, new AqS160S0100000_10(this, 77));
            c73305Spp2.setStatus(c73306Spq);
            FrameLayout frameLayout2 = this.LJLJJLL;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
                return;
            } else {
                o.LJIJI("wishListContentContainer");
                throw null;
            }
        }
        o.LJIJI("statusView");
        throw null;
    }

    @Override // X.InterfaceC61065Nxt
    public final void Eg() {
        boolean z;
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            C73305Spp c73305Spp = this.LJLJJL;
            if (c73305Spp != null) {
                C73306Spq c73306Spq = new C73306Spq();
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_large_no_access;
                c2068389v.LJ = Integer.valueOf(R.attr.gp);
                c73306Spq.LIZJ = 0;
                c73306Spq.LIZIZ = c2068389v;
                String string = getString(R.string.txk);
                o.LJIIIIZZ(string, "getString(R.string.wishlist_failed_to_load)");
                c73306Spq.LJFF = string;
                c73306Spq.LJII = new AqS176S0100000_10(this, 28);
                c73305Spp.setStatus(c73306Spq);
            } else {
                o.LJIJI("statusView");
                throw null;
            }
        } else {
            C73305Spp c73305Spp2 = this.LJLJJL;
            if (c73305Spp2 != null) {
                C73306Spq c73306Spq2 = new C73306Spq();
                C73312Spw.LJI(c73306Spq2, new AqS160S0100000_10(this, 76));
                c73305Spp2.setStatus(c73306Spq2);
            } else {
                o.LJIJI("statusView");
                throw null;
            }
        }
        C73305Spp c73305Spp3 = this.LJLJJL;
        if (c73305Spp3 != null) {
            c73305Spp3.setVisibility(0);
            FrameLayout frameLayout = this.LJLJJLL;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                return;
            } else {
                o.LJIJI("wishListContentContainer");
                throw null;
            }
        }
        o.LJIJI("statusView");
        throw null;
    }

    @Override // X.C8ZK
    public final void Od() {
        setUserVisibleHint(false);
    }

    @Override // X.InterfaceC61065Nxt
    public final void LJII() {
        C73305Spp c73305Spp = this.LJLJJL;
        if (c73305Spp != null) {
            c73305Spp.LJFF();
            FrameLayout frameLayout = this.LJLJJLL;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                return;
            } else {
                o.LJIJI("wishListContentContainer");
                throw null;
            }
        }
        o.LJIJI("statusView");
        throw null;
    }

    @Override // X.OGG
    public final View LJIJJ() {
        View view = this.LJLLILLLL;
        if (view != null) {
            return view;
        }
        FrameLayout frameLayout = this.LJLJJLL;
        if (frameLayout != null) {
            View vl = vl(frameLayout);
            if (vl != null) {
                this.LJLLILLLL = vl;
                return vl;
            }
            ScrollView scrollView = new ScrollView(this.LJLIL);
            this.LJLLILLLL = scrollView;
            return scrollView;
        }
        o.LJIJI("wishListContentContainer");
        throw null;
    }

    public final WishListManager wl() {
        WishListManager wishListManager = this.LJLJJI;
        if (wishListManager != null) {
            return wishListManager;
        }
        o.LJIJI("wishListManager");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJLLL = false;
        WishListManager wl = wl();
        wl.LJLJI.dispose();
        wl.LJLILLLLZI.LJI();
        NHG.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (getUserVisibleHint()) {
            FMX.onEventV3("ads_wishlist_tab_exit");
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (getUserVisibleHint() && this.LJLJLLL) {
            FMX.onEventV3("ads_wishlist_tab_enter");
        }
        if (!this.LJLJLLL) {
            this.LJLJLLL = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ShoppingAdsServiceImpl.WishListFragmentData wishListFragmentData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (wishListFragmentData = (ShoppingAdsServiceImpl.WishListFragmentData) arguments.getParcelable("power_viewpager_default_key")) != null) {
            this.LJLLI = wishListFragmentData.location;
        }
    }

    @Override // X.C8ZK
    public final void onPageSelected(int i) {
        setUserVisibleHint(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-5621795037356815423");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/commercialize/ecommerce/wishlist/ui/WishListFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/commercialize/ecommerce/wishlist/ui/WishListFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            if (this.LJLJJI != null && this.LJLJL != null) {
                WishListManager wl = wl();
                SparkFragment sparkFragment = this.LJLJL;
                if (sparkFragment != null) {
                    wl.LIZJ(sparkFragment, this.LJLLI);
                } else {
                    o.LJIJI("sparkContainerFragment");
                    throw null;
                }
            } else {
                this.LJLL = new AqS160S0100000_10(this, 75);
            }
            this.LJLJLJ = true;
            FMX.onEventV3("ads_wishlist_tab_enter");
        } else if (this.LJLJLJ) {
            FMX.onEventV3("ads_wishlist_tab_exit");
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/commercialize/ecommerce/wishlist/ui/WishListFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    public final View vl(View view) {
        if (view instanceof RecyclerView) {
            return view;
        }
        if (view instanceof ScrollView) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View vl = vl(viewGroup.getChildAt(i));
                if (vl != null) {
                    return vl;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SparkFragment sparkFragment;
        SparkContext sparkContext;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.njq);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.wishlist_status_view)");
        this.LJLJJL = (C73305Spp) findViewById;
        View findViewById2 = view.findViewById(R.id.njp);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.wishlist_content_container)");
        this.LJLJJLL = (FrameLayout) findViewById2;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        IAdSparkUtils LJFF = AdSparkUtils.LJFF();
        if (LJFF == null || (sparkFragment = LJFF.LIZJ(true)) == null) {
            sparkFragment = new SparkFragment();
        }
        IAdSparkUtils LJFF2 = AdSparkUtils.LJFF();
        if (LJFF2 == null || (sparkContext = NGQ.LIZ(LJFF2, context, null, null, false, 30)) == null) {
            sparkContext = new SparkContext();
        }
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        if (LJJI == null || (str = LJJI.LJIIL("lynx_feed")) == null) {
            str = "";
        }
        if (C78857UxB.LJJJIL(str)) {
            if (C59209NLp.LIZ().enableLynxWishList) {
                sparkContext.LJJIIJZLJL("use_forest", true);
                sparkContext.LJJIIJ("access_key", str);
            } else {
                sparkContext.LJII(AbstractC40201Fq9.class, new C40204FqC(str));
            }
        }
        Bundle bundle2 = new Bundle();
        C109464Ri.LIZ.getClass();
        C117144ik.LIZIZ.getClass();
        C117144ik.LIZIZ(sparkContext);
        bundle2.putString("SparkContextContainerId", sparkContext.containerId);
        sparkFragment.setArguments(bundle2);
        this.LJLJL = sparkFragment;
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        SparkFragment sparkFragment2 = this.LJLJL;
        if (sparkFragment2 != null) {
            LIZ.LJIIJ(sparkFragment2, null, R.id.njp);
            LIZ.LJIILJJIL();
            WishListManager wl = wl();
            C73849Syb<AbstractC61062Nxq> c73849Syb = wl.LJLJJI;
            C78999UzT.LJFF(C42193GhB.LIZJ(c73849Syb, c73849Syb).LJJIFFI(C65304Pk4.LJLIL).LJJL(T16.LIZ()).LJJJLIIL(new AfS62S0100000_10(wl, 6), new InterfaceC64592gB() { // from class: X.9E4
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }), wl.LJLJI);
            C73849Syb<AbstractC61062Nxq> c73849Syb2 = wl.LJLJJI;
            C73426Srm LIZJ = C42193GhB.LIZJ(c73849Syb2, c73849Syb2);
            wl.LJLILLLLZI.LJI();
            C73775SxP LJFF3 = NHG.LIZ.LJFF();
            C73849Syb<AbstractC61066Nxu> c73849Syb3 = wl.LJLJJL;
            c73849Syb3.getClass();
            C78999UzT.LJFF(AbstractC73672Svk.LJJIL(LIZJ, LJFF3, new C73426Srm(c73849Syb3)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS62S0100000_10(this, 7), new InterfaceC64592gB() { // from class: X.9E5
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }), wl.LJLJI);
            wl().LIZIZ();
            AqS160S0100000_10 aqS160S0100000_10 = this.LJLL;
            if (aqS160S0100000_10 != null) {
                aqS160S0100000_10.invoke();
            }
            this.LJLL = null;
            return;
        }
        o.LJIJI("sparkContainerFragment");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.axl, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    @Override // X.C8ZK
    public final void u7(InterfaceC57784Mm4 interfaceC57784Mm4, Lifecycle.State state, List<? extends Object> list) {
        C186627Uc.LIZ(interfaceC57784Mm4, state, list);
    }
}
