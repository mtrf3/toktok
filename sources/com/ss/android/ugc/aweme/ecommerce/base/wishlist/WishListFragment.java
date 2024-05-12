package com.ss.android.ugc.aweme.ecommerce.base.wishlist;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C186627Uc;
import X.C29S;
import X.C3C5;
import X.C40342FsQ;
import X.C40343FsR;
import X.C61878OQg;
import X.C65300Pk0;
import X.C76542zS;
import X.C76800UCe;
import X.C78685UuP;
import X.C8ZK;
import X.C90903hW;
import X.InterfaceC57784Mm4;
import X.InterfaceC60761Nsz;
import X.KME;
import X.KMP;
import X.OGG;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECWishListSchemaConfig;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class WishListFragment extends ECBaseFragment implements OGG, C8ZK {
    public static final /* synthetic */ int LJLLI = 0;
    public String LJLIL;
    public String LJLILLLLZI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public long LJLJL;
    public boolean LJLJLJ;
    public View LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public String LJLJJLL = "";

    @Override // X.C8ZK
    public final void Od() {
        setUserVisibleHint(false);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.OGG
    public final View LJIJJ() {
        View view = this.LJLJLLL;
        if (view != null) {
            return view;
        }
        View vl = vl(_$_findCachedViewById(R.id.njp));
        if (vl != null) {
            this.LJLJLLL = vl;
            return vl;
        }
        ScrollView scrollView = new ScrollView(getContext());
        this.LJLJLLL = scrollView;
        return scrollView;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJJL = false;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (getUserVisibleHint()) {
            C76542zS.LIZ("ads_wishlist_tab_exit", C113554cx.LJJJLIIL());
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (getUserVisibleHint() && this.LJLJJL) {
            wl();
        }
        if (!this.LJLJJL) {
            this.LJLJJL = true;
        }
    }

    public final void wl() {
        InterfaceC60761Nsz kitView;
        C76542zS.LIZ("ads_wishlist_tab_enter", C113554cx.LJJJLIIL());
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.LJIIJ("favoritePageShow", C61878OQg.INSTANCE);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ECommerceService.WishListFragmentData wishListFragmentData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (wishListFragmentData = (ECommerceService.WishListFragmentData) arguments.getParcelable("power_viewpager_default_key")) != null) {
            this.LJLIL = wishListFragmentData.location;
            this.LJLILLLLZI = wishListFragmentData.previousPage;
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
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-2140164253763504873");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/ecommerce/base/wishlist/WishListFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/ecommerce/base/wishlist/WishListFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            this.LJLJJI = true;
            wl();
        } else if (this.LJLJJI) {
            C76542zS.LIZ("ads_wishlist_tab_exit", C113554cx.LJJJLIIL());
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/ecommerce/base/wishlist/WishListFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
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

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            ECWishListSchemaConfig.RomaSchemaGroupFavoritePageModel romaSchemaGroupFavoritePageModel = ECWishListSchemaConfig.LIZ;
            ECWishListSchemaConfig.RomaSchemaGroupFavoritePageModel romaSchemaGroupFavoritePageModel2 = (ECWishListSchemaConfig.RomaSchemaGroupFavoritePageModel) LIZLLL.LJIIIIZZ("roma_schema_group_favorite_page", ECWishListSchemaConfig.RomaSchemaGroupFavoritePageModel.class, romaSchemaGroupFavoritePageModel);
            if (romaSchemaGroupFavoritePageModel2 != null) {
                romaSchemaGroupFavoritePageModel = romaSchemaGroupFavoritePageModel2;
            }
            o.LJIIIIZZ(romaSchemaGroupFavoritePageModel, "SettingsManager.getInsta…ss.java) ?: DEFAULT_GROUP");
            Uri.Builder buildUpon = UriProtector.parse(romaSchemaGroupFavoritePageModel.romaSchemaPageFavoriteProduct).buildUpon();
            if (C78685UuP.LJJJZ(this.LJLIL)) {
                buildUpon.appendQueryParameter("page_location", this.LJLIL);
            }
            if (C78685UuP.LJJJZ(this.LJLILLLLZI)) {
                buildUpon.appendQueryParameter("previous_page", this.LJLILLLLZI);
            }
            str = buildUpon.build().toString();
            o.LJIIIIZZ(str, "{\n            Uri.parse(…ld().toString()\n        }");
        } catch (Exception unused) {
            SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
            ECWishListSchemaConfig.RomaSchemaGroupFavoritePageModel romaSchemaGroupFavoritePageModel3 = ECWishListSchemaConfig.LIZ;
            ECWishListSchemaConfig.RomaSchemaGroupFavoritePageModel romaSchemaGroupFavoritePageModel4 = (ECWishListSchemaConfig.RomaSchemaGroupFavoritePageModel) LIZLLL2.LJIIIIZZ("roma_schema_group_favorite_page", ECWishListSchemaConfig.RomaSchemaGroupFavoritePageModel.class, romaSchemaGroupFavoritePageModel3);
            if (romaSchemaGroupFavoritePageModel4 != null) {
                romaSchemaGroupFavoritePageModel3 = romaSchemaGroupFavoritePageModel4;
            }
            o.LJIIIIZZ(romaSchemaGroupFavoritePageModel3, "SettingsManager.getInsta…ss.java) ?: DEFAULT_GROUP");
            str = romaSchemaGroupFavoritePageModel3.romaSchemaPageFavoriteProduct;
        }
        this.LJLJJLL = str;
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJIJLIJ(this.LJLJJLL);
        sparkContext.LJJI(new KME(this));
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZJ = KMP.LIZJ(c40342FsQ, context, sparkContext);
        this.LJLJI = LIZJ;
        LIZJ.LIZIZ();
        ((ViewGroup) _$_findCachedViewById(R.id.njp)).addView(this.LJLJI, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.z0, viewGroup, false);
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
