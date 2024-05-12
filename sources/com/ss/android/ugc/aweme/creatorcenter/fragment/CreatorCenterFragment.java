package com.ss.android.ugc.aweme.creatorcenter.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C113554cx;
import X.C117144ik;
import X.C141335gf;
import X.C188727au;
import X.C1B3;
import X.C1B6;
import X.C221108m2;
import X.C234529Ii;
import X.C252709vu;
import X.C25951AGl;
import X.C25952AGm;
import X.C25953AGn;
import X.C25954AGo;
import X.C25957AGr;
import X.C29S;
import X.C3C5;
import X.C60829Nu5;
import X.C62822Ol8;
import X.C73305Spp;
import X.C74053T4n;
import X.C76800UCe;
import X.C78496UrM;
import X.C79045V0n;
import X.C90903hW;
import X.C9KF;
import X.FMX;
import X.InterfaceC61213O0r;
import X.OSZ;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.experiment.CreatorCenterURLSetting;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import ql1.IDbS494S0100000_4;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class CreatorCenterFragment extends BaseFragment {
    public C252709vu LJLJI;
    public C74053T4n LJLJJI;
    public ViewPager LJLJJL;
    public C73305Spp LJLJJLL;
    public FrameLayout LJLJLJ;
    public boolean LJLJLLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C25952AGm.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C25953AGn.LJLIL);
    public final CreatorCenterURLSetting.CreatorCenterInfoStructJsonModel LJLJL = (CreatorCenterURLSetting.CreatorCenterInfoStructJsonModel) SettingsManager.LIZLLL().LJIIIIZZ("creator_center_inapp_url", CreatorCenterURLSetting.CreatorCenterInfoStructJsonModel.class, null);
    public final Map<Integer, String> LJLL = C113554cx.LJJL(new OSZ(0, "tools"), new OSZ(1, "live"));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
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

    public final void vl() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        LIZ.LJIIJ((Fragment) this.LJLIL.getValue(), null, R.id.lce);
        LIZ.LJI();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("tab_name", "tools");
        FMX.LJIIL("creator_center_tab_show", c188727au.LIZ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        fragmentConfiguration(C25951AGl.LJLIL);
        super.onCreate(bundle);
        ((SparkToolFragment) this.LJLIL.getValue()).LLD = new C25954AGo(this);
        CreatorCenterURLSetting.CreatorCenterInfoStructJsonModel creatorCenterInfoStructJsonModel = this.LJLJL;
        if (creatorCenterInfoStructJsonModel != null) {
            String str = creatorCenterInfoStructJsonModel.toolsEntryURL;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJIJLIJ(str);
            sparkContext.LJJIIJ("spark_perf_bid", "creator_center_spark_biz");
            sparkContext.LJJIIZ(Boolean.valueOf(C60829Nu5.LIZ()), "web_warm_up");
            sparkContext.LJJI(new IDbS494S0100000_4(this, 2));
            Fragment fragment = (Fragment) this.LJLIL.getValue();
            Bundle bundle2 = new Bundle();
            C117144ik.LIZIZ.getClass();
            C117144ik.LIZIZ(sparkContext);
            bundle2.putString("SparkContextContainerId", sparkContext.containerId);
            fragment.setArguments(bundle2);
        }
        LiveOuterService.LJJJLL().LJJI().LIZJ(new C25957AGr(this), "creator_center");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c73305Spp != null) {
            c73305Spp.LJFF();
        }
        C73305Spp c73305Spp2 = this.LJLJJLL;
        if (c73305Spp2 != null) {
            c73305Spp2.setVisibility(0);
        }
        C252709vu c252709vu = this.LJLJI;
        if (c252709vu != null) {
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_chevron_left_ltr;
            LIZJ.LIZLLL = true;
            LIZJ.LIZIZ(new AqS154S0100000_4(this, 1160));
            c252709vu.LIZJ(LIZJ);
        }
        C252709vu c252709vu2 = this.LJLJI;
        if (c252709vu2 != null) {
            C9KF c9kf = new C9KF();
            String string = getString(R.string.e_1);
            o.LJIIIIZZ(string, "getString(R.string.creat…creen_screenHeader_Title)");
            c9kf.LIZJ = string;
            c252709vu2.LJIILLIIL(c9kf);
        }
        C252709vu c252709vu3 = this.LJLJI;
        if (c252709vu3 != null) {
            C234529Ii LIZJ2 = s1.LIZJ();
            LIZJ2.LIZJ = R.raw.icon_gear;
            LIZJ2.LIZLLL = true;
            LIZJ2.LIZIZ(new AqS154S0100000_4(this, 1161));
            c252709vu3.LIZIZ(LIZJ2);
        }
        C252709vu c252709vu4 = this.LJLJI;
        if (c252709vu4 != null) {
            c252709vu4.LJIILJJIL(false);
        }
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        Integer LJI = C79045V0n.LJI(R.attr.c9, requireContext);
        if (LJI != null) {
            int intValue = LJI.intValue();
            C252709vu c252709vu5 = this.LJLJI;
            if (c252709vu5 != null) {
                c252709vu5.setNavBackground(intValue);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.ckg, viewGroup, false, "inflater.inflate(\n      …         false,\n        )");
        this.LJLJI = (C252709vu) LIZIZ.findViewById(R.id.gwg);
        View findViewById = LIZIZ.findViewById(R.id.ky_);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tab_bar)");
        this.LJLJJI = (C74053T4n) findViewById;
        View findViewById2 = LIZIZ.findViewById(R.id.nb6);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.view_pager)");
        this.LJLJJL = (ViewPager) findViewById2;
        this.LJLJJLL = (C73305Spp) LIZIZ.findViewById(R.id.kf_);
        this.LJLJLJ = (FrameLayout) LIZIZ.findViewById(R.id.lce);
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZIZ;
    }
}
