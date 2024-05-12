package com.ss.android.ugc.aweme.profile.ui;

import X.AFB;
import X.AXO;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C03880Dg;
import X.C10A;
import X.C10K;
import X.C141335gf;
import X.C16970lZ;
import X.C188727au;
import X.C237259Sv;
import X.C26335AVf;
import X.C29S;
import X.C2K3;
import X.C34508DgW;
import X.C34510DgY;
import X.C35810E3q;
import X.C37179EiV;
import X.C3C5;
import X.C55406Loo;
import X.C63081OpJ;
import X.C65300Pk0;
import X.C72713SgH;
import X.C72714SgI;
import X.C76800UCe;
import X.C79234V7u;
import X.C90903hW;
import X.EVM;
import X.FKM;
import X.FMX;
import X.InterfaceC55407Lop;
import X.InterfaceC68342mE;
import X.J8U;
import X.LNH;
import X.MDP;
import X.TBT;
import Y.ACallableS0S1101100_9;
import Y.AObjectS42S0101000_5;
import Y.ARunnableS16S0000000_9;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.GetCreatorShopInfoData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV2;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nMyProfileFragmentV3;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.screenshot.ScreenShotService;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class I18nAbsProfileFragmentV2 extends AmeBaseFragment implements C2K3 {
    public String LJLIL;
    public String LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public List<Integer> LJLJJL;
    public String LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public User LJLL;
    public boolean LJLLI;
    public ViewGroup LJLLILLLL;
    public int LJLLJ = -1;
    public AnalysisStayTimeFragmentComponent LJLLL;
    public ProfileViewModel LJLLLL;
    public C72713SgH LJLLLLLL;
    public InterfaceC68342mE<GetCreatorShopInfoData> LJLZ;
    public Boolean LJZ;
    public Boolean LJZI;
    public Boolean LJZL;
    public long LL;

    public static /* synthetic */ boolean Sl(View view, MotionEvent motionEvent) {
        return true;
    }

    public static /* synthetic */ C55406Loo vl(I18nAbsProfileFragmentV2 i18nAbsProfileFragmentV2, C55406Loo c55406Loo) {
        Pl(i18nAbsProfileFragmentV2, c55406Loo);
        return c55406Loo;
    }

    public abstract int Jl();

    public abstract boolean Nl();

    public void Xl() {
        String str;
        if (this.LL > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.LL;
            if (currentTimeMillis > 0) {
                if (Nl()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                C10K.LIZIZ(new ACallableS0S1101100_9(this, str, currentTimeMillis, this.LJLJL, 0), FMX.LIZIZ(), null);
            }
            this.LL = -1L;
        }
    }

    public boolean Zl() {
        return true;
    }

    public void clearData() {
    }

    public void initData() {
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return Hl(this, layoutInflater, viewGroup, bundle);
    }

    public C72713SgH Ll() {
        if (this.LJLLLLLL == null && getView() != null) {
            C72714SgI c72714SgI = C72713SgH.LJIIIIZZ;
            View view = getView();
            c72714SgI.getClass();
            this.LJLLLLLL = C72714SgI.LIZ(view, this);
        }
        return this.LJLLLLLL;
    }

    public I18nAbsProfileFragmentV2() {
        Boolean bool = Boolean.FALSE;
        this.LJZ = bool;
        this.LJZI = Boolean.TRUE;
        this.LJZL = bool;
        this.LL = -1L;
    }

    private void Il() {
        long j;
        if (Nl()) {
            j = 2500;
        } else {
            j = 4500;
        }
        if ((C34508DgW.LIZ & 1) == 1) {
            C35810E3q.LJIIJJI(j);
        }
        int i = C34510DgY.LIZ;
        if ((i & 8) == 8) {
            C35810E3q.LIZLLL(j);
        }
        if ((i & 1) == 1) {
            EVM.LIZ(Process.myTid(), -20);
            JatoXL.boostRenderThread(FKM.LIZ(), -20);
            C37179EiV.LJFF.postDelayed(new ARunnableS16S0000000_9(3), j);
        }
    }

    public static /* synthetic */ void Ol() {
        JatoXL.resetPriority(Process.myTid());
        JatoXL.resetRenderThread();
    }

    private void Tl() {
        String str;
        IScreenshotService LJIIIZ = ScreenShotService.LJIIIZ();
        if (Nl()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        LJIIIZ.LJI(str);
    }

    private void Vl() {
        String str;
        if (Nl()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        IScreenshotService LJIIIZ = ScreenShotService.LJIIIZ();
        LJIIIZ.LIZ(str, new MDP(this, LJIIIZ, str));
    }

    public void Wl() {
        this.LL = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Tl();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Wl();
        if (this.LJZL.booleanValue()) {
            Vl();
        }
    }

    private void Yl(View view) {
        try {
            view.findViewById(R.id.l_2).setOnTouchListener(new View.OnTouchListener() { // from class: X.MFp
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return I18nAbsProfileFragmentV2.Sl(view2, motionEvent);
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void initArguments(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.LJLJL = bundle.getInt("profile_cur_pos", 0);
        this.LJLJLLL = bundle.getInt("indicator_scroll_maxx", 0);
    }

    public String Kl(int i) {
        List<Integer> list = this.LJLJJL;
        if (list == null || list.size() == 0 || i >= this.LJLJJL.size()) {
            return "";
        }
        return C79234V7u.LJIJI(((Integer) ListProtector.get(this.LJLJJL, i)).intValue());
    }

    public void Ml(View view) {
        view.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, getContext()));
    }

    public void initView(View view) {
        int identifier;
        int dimensionPixelSize;
        this.LJLJJI = view.findViewById(R.id.kej);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            dimensionPixelSize = 0;
        } else {
            if (mo49getActivity.getRequestedOrientation() != mo49getActivity.getResources().getConfiguration().orientation) {
                try {
                    if (mo49getActivity.getRequestedOrientation() == 2) {
                        identifier = mo49getActivity.getResources().getIdentifier("status_bar_height_landscape", "dimen", "android");
                    } else {
                        identifier = mo49getActivity.getResources().getIdentifier("status_bar_height_portrait", "dimen", "android");
                    }
                    if (identifier > 0) {
                        dimensionPixelSize = mo49getActivity.getResources().getDimensionPixelSize(identifier);
                        if (dimensionPixelSize > 0) {
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            dimensionPixelSize = C63081OpJ.LJJJJLI(mo49getActivity);
        }
        this.LJLJJI.getLayoutParams().height = dimensionPixelSize;
        this.LJLLILLLL = (ViewGroup) view.findViewById(R.id.bs8);
        AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = new AnalysisStayTimeFragmentComponent(this, Zl());
        this.LJLLL = analysisStayTimeFragmentComponent;
        analysisStayTimeFragmentComponent.LJLJJI = new InterfaceC55407Lop() { // from class: X.MFq
            @Override // X.InterfaceC55407Lop
            public final C55406Loo LIZ(C55406Loo c55406Loo) {
                I18nAbsProfileFragmentV2.Pl(I18nAbsProfileFragmentV2.this, c55406Loo);
                return c55406Loo;
            }
        };
        Yl(view);
        this.LJZL = Boolean.valueOf(!Nl());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ProfileViewModel LIZ = AFB.LIZ(this);
        this.LJLLLL = LIZ;
        JediViewModel.wv0(LIZ, new TBT() { // from class: X.AO8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((ProfileState) obj).getCurTabType());
            }
        }, null, new AqS171S0100000_5(new AObjectS42S0101000_5(4, this, 40), 606), 2, null);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Il();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-8244732364625012433");
        if (c03880Dg.LIZJ(10501, "com/ss/android/ugc/aweme/profile/ui/I18nAbsProfileFragmentV2", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/profile/ui/I18nAbsProfileFragmentV2", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.LJLLL;
        if (analysisStayTimeFragmentComponent != null) {
            boolean z2 = !z;
            analysisStayTimeFragmentComponent.LJLJI = z2;
            if (z2) {
                analysisStayTimeFragmentComponent.LJLIL = System.currentTimeMillis();
            } else {
                analysisStayTimeFragmentComponent.LIZIZ();
            }
        }
        if (z) {
            Xl();
            Tl();
        } else {
            Wl();
            Vl();
        }
        c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/profile/ui/I18nAbsProfileFragmentV2", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("profile_cur_pos", this.LJLJL);
        bundle.putInt("indicator_scroll_maxx", this.LJLJLLL);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-8244732364625012433");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/profile/ui/I18nAbsProfileFragmentV2", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/profile/ui/I18nAbsProfileFragmentV2", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        this.LJZL = Boolean.valueOf(z);
        if (z) {
            Vl();
        } else {
            Tl();
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/profile/ui/I18nAbsProfileFragmentV2", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    public static C55406Loo Pl(I18nAbsProfileFragmentV2 i18nAbsProfileFragmentV2, C55406Loo c55406Loo) {
        c55406Loo.LJJIIZ(LNH.LIZIZ(i18nAbsProfileFragmentV2.mo49getActivity()));
        return c55406Loo;
    }

    public static /* synthetic */ C76800UCe Ql(I18nAbsProfileFragmentV2 i18nAbsProfileFragmentV2, Integer num) {
        i18nAbsProfileFragmentV2.LJLJLJ = num.intValue();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (e1.LIZ(31744, "is_release_window_background", true, true)) {
            view.setBackgroundColor(-1);
        }
        this.LJLJI = view;
        initArguments(bundle);
        initView(view);
        Ml(view);
        initData();
    }

    public View Gl(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLLLLLL = null;
        View LIZLLL = C16970lZ.LIZLLL(mo49getActivity(), Jl());
        if (this instanceof I18nMyProfileFragmentV2) {
            str = "v2_old_create_layout";
        } else if (this instanceof I18nMyProfileFragmentV3) {
            str = "v3_platform_create_layout";
        } else if (this instanceof I18nUserProfileFragmentV2) {
            str = "v2_user_create_layout";
        } else {
            str = "";
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("profile_attributes", C237259Sv.LJIIIIZZ);
        c188727au.LJ(currentTimeMillis2, "profile_create_layout_cost_time");
        c188727au.LIZLLL(AXO.LIZ() ? 1 : 0, "is_profile_platform");
        c188727au.LJIIIZ("report_scene", str);
        FMX.LJIIL("profile_performance_data_statistics", c188727au.LIZ);
        return LIZLLL;
    }

    public static View Hl(I18nAbsProfileFragmentV2 i18nAbsProfileFragmentV2, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View Gl = i18nAbsProfileFragmentV2.Gl(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(Gl instanceof View)) {
            Gl = null;
        }
        if (Gl != null) {
            try {
                ViewTreeLifecycleOwner.set(Gl, i18nAbsProfileFragmentV2.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(Gl, i18nAbsProfileFragmentV2);
                C10A.LIZIZ(Gl, i18nAbsProfileFragmentV2);
                ActivityC45651qj mo49getActivity = i18nAbsProfileFragmentV2.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return Gl;
    }

    public static Object Rl(I18nAbsProfileFragmentV2 i18nAbsProfileFragmentV2, String str, long j, int i) {
        J8U j8u = new J8U();
        j8u.LIZLLL = str;
        j8u.LJJL = String.valueOf(j);
        j8u.LJIILL = i18nAbsProfileFragmentV2.Kl(i);
        j8u.LJIILIIL();
        C26335AVf.LJJII(i, j, i18nAbsProfileFragmentV2.getContext(), i18nAbsProfileFragmentV2.Kl(i));
        return null;
    }
}
