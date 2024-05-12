package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C10K;
import X.C141335gf;
import X.C16880lQ;
import X.C207668Da;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C63057Oov;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C76800UCe;
import X.C78840Uwu;
import X.C80675VlP;
import X.C84989XXd;
import X.C90903hW;
import X.KL2;
import X.VW3;
import X.XVW;
import Y.AgS87S0101000_15;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class SecondLevelMusicFragment extends AmeBaseFragment implements Observer<C207668Da> {
    public static final /* synthetic */ int LJZI = 0;
    public C80675VlP LJLIL;
    public VW3 LJLILLLLZI;
    public C73305Spp LJLJI;
    public C84989XXd LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public int LJLJLLL;
    public DataCenter LJLL;
    public XVW LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public long LJLLLLLL;
    public long LJLZ;
    public final Map<Integer, View> LJZ = new LinkedHashMap();

    public final void wl() {
        C73305Spp c73305Spp = this.LJLJI;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
            C73305Spp c73305Spp2 = this.LJLJI;
            if (c73305Spp2 != null) {
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJIIJJI(c73306Spq, new AqS165S0100000_15(this, 230));
                c73305Spp2.setStatus(c73306Spq);
                return;
            }
            o.LJIJI("statusView");
            throw null;
        }
        o.LJIJI("statusView");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJZ).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onChanged(X.C207668Da r28) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.fragment.SecondLevelMusicFragment.onChanged(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJLJJL = arguments.getString("music_class_id");
            this.LJLJJLL = arguments.getString("music_class_name");
            this.LJLJL = arguments.getString("music_class_enter_from");
            arguments.getBoolean("music_class_is_hot", false);
            this.LJLJLJ = arguments.getString("music_class_enter_method");
            this.LJLLILLLL = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
            this.LJLJLLL = arguments.getInt("music_class_level");
            this.LJLLL = arguments.getInt("sound_page_scene", 0);
            this.LJLLLLLL = arguments.getLong("max_video_duration", 0L);
            this.LJLZ = arguments.getLong("shoot_video_length", 0L);
            this.LJLLLL = arguments.getInt("music_discovery_type", 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object LLILL;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        VW3 vw3 = this.LJLILLLLZI;
        if (vw3 != null) {
            vw3.setOffscreenPageLimit(1);
            FragmentManager childFragmentManager = getChildFragmentManager();
            o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
            this.LJLJJI = new C84989XXd(childFragmentManager, this.LJLJL, this.LJLLILLLL, this.LJLJLJ);
            C80675VlP c80675VlP = this.LJLIL;
            if (c80675VlP != null) {
                c80675VlP.setTabMode(0);
                C80675VlP c80675VlP2 = this.LJLIL;
                if (c80675VlP2 != null) {
                    c80675VlP2.setTabMaxWidth(Integer.MAX_VALUE);
                    Context context = getContext();
                    if (context == null) {
                        LLILL = null;
                    } else {
                        try {
                            LLILL = C16880lQ.LLILL(context, "connectivity");
                        } catch (Exception unused) {
                        }
                    }
                    o.LJII(LLILL, "null cannot be cast to non-null type android.net.ConnectivityManager");
                    NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) LLILL);
                    if (LJJLI != null) {
                        if (LJJLI.isAvailable()) {
                            XVW xvw = this.LJLLI;
                            if (xvw != null) {
                                String str = this.LJLJJL;
                                int i = this.LJLJLLL;
                                ChooseMusicApi.LIZ.secondLevelMusicList(str, 0, 30, i, this.LJLLL).LJ(new AgS87S0101000_15(i, xvw, 1), C10K.LJIIIIZZ, null);
                                return;
                            }
                            return;
                        }
                    }
                    wl();
                    return;
                }
                o.LJIJI("mSecondLevelTabLayout");
                throw null;
            }
            o.LJIJI("mSecondLevelTabLayout");
            throw null;
        }
        o.LJIJI("mSecondLevelViewPager");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        if (C63057Oov.LIZ()) {
            inflater = inflater.cloneInContext(new ContextThemeWrapper(requireActivity(), R.style.uw));
            o.LJIIIIZZ(inflater, "inflater.cloneInContext(…ikTokThemeOverlay_Const))");
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.axa, viewGroup, false);
        View findViewById = LLLLIILL.findViewById(R.id.jj2);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.….second_level_tab_layout)");
        this.LJLIL = (C80675VlP) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.jj5);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.….second_level_view_pager)");
        this.LJLILLLLZI = (VW3) findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.gtj);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.…second_level_status_view)");
        this.LJLJI = (C73305Spp) findViewById3;
        View findViewById4 = LLLLIILL.findViewById(R.id.l_2);
        o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.id.title_bar)");
        C252709vu c252709vu = (C252709vu) findViewById4;
        C235119Kp c235119Kp = new C235119Kp();
        String str = this.LJLJJLL;
        if (str == null) {
            str = "";
        }
        C78840Uwu.LJJIZ(c235119Kp, str, new AqS165S0100000_15(this, 846));
        c235119Kp.LIZLLL = false;
        c252709vu.setNavActions(c235119Kp);
        C73305Spp c73305Spp = this.LJLJI;
        C29S c29s = null;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
            C73305Spp c73305Spp2 = this.LJLJI;
            if (c73305Spp2 != null) {
                c73305Spp2.LJFF();
                this.LJLLJ = (int) KL2.LIZJ(mo49getActivity(), 16.0f);
                if (this.LJLL == null) {
                    this.LJLL = DataCenter.gv0(ViewModelProviders.of(this), this);
                }
                DataCenter dataCenter = this.LJLL;
                if (dataCenter != null) {
                    dataCenter.iv0("status_second_level_music_list", this, false);
                }
                DataCenter dataCenter2 = this.LJLL;
                if (dataCenter2 != null) {
                    dataCenter2.iv0("second_level_music_list", this, false);
                }
                this.LJLLI = new XVW(getContext(), this.LJLL);
                try {
                    ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                    ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                    C10A.LIZIZ(LLLLIILL, this);
                    ActivityC45651qj mo49getActivity = mo49getActivity();
                    if (mo49getActivity instanceof C29S) {
                        c29s = (C29S) mo49getActivity;
                    }
                    C90903hW.LIZ(c29s);
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
                return LLLLIILL;
            }
            o.LJIJI("statusView");
            throw null;
        }
        o.LJIJI("statusView");
        throw null;
    }

    public final void vl(int i, int i2, View view) {
        if (i != -1 || i2 != -1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i != -1) {
                marginLayoutParams.setMarginStart(i);
            }
            if (i2 != -1) {
                marginLayoutParams.setMarginEnd(i2);
            }
            view.setLayoutParams(marginLayoutParams);
            view.invalidate();
        }
    }
}
