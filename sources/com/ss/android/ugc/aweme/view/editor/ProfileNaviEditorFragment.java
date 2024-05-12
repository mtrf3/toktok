package com.ss.android.ugc.aweme.view.editor;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C221108m2;
import X.C62822Ol8;
import X.C72674Sfe;
import X.C72677Sfh;
import X.C72678Sfi;
import X.C72694Sfy;
import X.C72695Sfz;
import X.C73156SnQ;
import X.C73318Sq2;
import X.C78856UxA;
import X.C79902VXm;
import X.C7MY;
import X.C80261Vej;
import X.InterfaceC72603SeV;
import X.InterfaceC72616Sei;
import X.SY4;
import X.TBE;
import X.TBT;
import Y.ACListenerS32S0100000_12;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS16S0010000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviEditorFragment extends ProfileNaviGLSurfaceFragment {
    public C79902VXm LJLLILLLL;
    public TuxTextView LJLLJ;
    public TuxIconView LJLLL;
    public TuxTextView LJLLLL;
    public SY4 LJLLLLLL;
    public C80261Vej LJLZ;
    public TBE LJZ;
    public ViewGroup LJZI;
    public C72678Sfi LJZL;
    public final Map<Integer, View> LL = new LinkedHashMap();
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 941));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 944));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 943));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 940));
    public final C72677Sfh LJLLI = new C72677Sfh(this);

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LL).clear();
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final int getLayout() {
        return R.layout.c6z;
    }

    public final String Jl() {
        TBE tbe = this.LJZ;
        if (tbe != null) {
            int currentItem = tbe.getCurrentItem();
            List<InterfaceC72603SeV> tabList = vl().Hv0(this).getTabList();
            if (tabList == null || tabList.size() <= currentItem) {
                return null;
            }
            return ((InterfaceC72603SeV) ListProtector.get(tabList, currentItem)).getKey();
        }
        o.LJIJI("navi_editor_viewpager");
        throw null;
    }

    public final void Kl() {
        TBE tbe = this.LJZ;
        if (tbe != null) {
            tbe.setVisibility(0);
            ViewGroup viewGroup = this.LJZI;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                C72678Sfi c72678Sfi = this.LJZL;
                if (c72678Sfi != null) {
                    c72678Sfi.setVisibility(8);
                    return;
                } else {
                    o.LJIJI("navi_editor_slider_panel_v2");
                    throw null;
                }
            }
            o.LJIJI("navi_editor_slider_container");
            throw null;
        }
        o.LJIJI("navi_editor_viewpager");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final C79902VXm wl() {
        C79902VXm c79902VXm = this.LJLLILLLL;
        if (c79902VXm != null) {
            return c79902VXm;
        }
        o.LJIJI("navi_editor_gl_view");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final void xl() {
        TuxTextView tuxTextView = this.LJLLJ;
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS32S0100000_12(this, 87));
            TuxIconView tuxIconView = this.LJLLL;
            if (tuxIconView != null) {
                C16880lQ.LJJJ(tuxIconView, new ACListenerS32S0100000_12(this, 88));
                TuxTextView tuxTextView2 = this.LJLLLL;
                if (tuxTextView2 != null) {
                    C16880lQ.LJJJJI(tuxTextView2, new ACListenerS32S0100000_12(this, 89));
                    SY4 sy4 = this.LJLLLLLL;
                    if (sy4 != null) {
                        sy4.setEnabled(false);
                        SY4 sy42 = this.LJLLLLLL;
                        if (sy42 != null) {
                            C16880lQ.LJJIZ(sy42, new ACListenerS32S0100000_12(this, 90));
                            return;
                        } else {
                            o.LJIJI("naviEditorDoneBtn");
                            throw null;
                        }
                    }
                    o.LJIJI("naviEditorDoneBtn");
                    throw null;
                }
                o.LJIJI("profile_navi_effect_editor_done_button");
                throw null;
            }
            o.LJIJI("profile_navi_editor_cancel_button");
            throw null;
        }
        o.LJIJI("profile_navi_effect_editor_cancel_button");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ll() {
        InterfaceC72603SeV interfaceC72603SeV;
        String key;
        C72695Sfz LIZ;
        InterfaceC72616Sei naviManager;
        ProfileNaviEditorViewModel vl = vl();
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        int currentTabIndex = vl.Hv0(requireActivity).getCurrentTabIndex();
        C80261Vej c80261Vej = this.LJLZ;
        if (c80261Vej != null) {
            if (c80261Vej.getSelectedTabPosition() != -1) {
                C80261Vej c80261Vej2 = this.LJLZ;
                if (c80261Vej2 != null) {
                    if (currentTabIndex != c80261Vej2.getSelectedTabPosition()) {
                        C80261Vej c80261Vej3 = this.LJLZ;
                        if (c80261Vej3 != null) {
                            C78856UxA tabAt = c80261Vej3.getTabAt(currentTabIndex);
                            if (tabAt != null) {
                                tabAt.LIZIZ();
                            }
                        } else {
                            o.LJIJI("navi_editor_viewpager_tab_strip");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("navi_editor_viewpager_tab_strip");
                    throw null;
                }
            }
            ProfileNaviEditorState profileNaviEditorState = (ProfileNaviEditorState) vl().lv0();
            List<InterfaceC72603SeV> tabList = profileNaviEditorState.getTabList();
            if (tabList != null && (interfaceC72603SeV = (InterfaceC72603SeV) ListProtector.get(tabList, profileNaviEditorState.getCurrentTabIndex())) != null && (key = interfaceC72603SeV.getKey()) != null && (LIZ = C72694Sfy.LIZ(1, 66690, key)) != null && (naviManager = wl().getNaviManager()) != null) {
                int i = LIZ.LIZ;
                int i2 = LIZ.LIZJ;
                naviManager.LJJJJIZL(i, i2, i2, LIZ.LIZIZ);
                return;
            }
            return;
        }
        o.LJIJI("navi_editor_viewpager_tab_strip");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ProfileNaviEditorViewModel vl = vl();
        if (((ProfileNaviEditorState) vl.lv0()).getNaviDoneLoading()) {
            vl.setStateImmediate(new AqS16S0010000_12(false, 11));
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final void Al(C73318Sq2 c73318Sq2) {
        super.Al(c73318Sq2);
        c73318Sq2.LIZ(C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.Sfr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProfileNaviEditorState) obj).getTabList();
            }
        }, new C72674Sfe(this)));
        c73318Sq2.LIZ(C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.Sfo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProfileNaviEditorState) obj).getEditCategory();
            }
        }, new AqS194S0100000_12(this, 147)));
        c73318Sq2.LIZ(C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.Sfk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((ProfileNaviEditorState) obj).getCurrentTabIndex());
            }
        }, new AqS194S0100000_12(this, 148)));
        c73318Sq2.LIZ(C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.Sfl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviEditorState) obj).getNaviDoneLoading());
            }
        }, new AqS194S0100000_12(this, 149)));
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.LJLLILLLL = (C79902VXm) C7MY.LIZLLL(view, "view", R.id.gxc, "view.findViewById(R.id.navi_editor_gl_view)");
        View findViewById = view.findViewById(R.id.i84);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.p…ect_editor_cancel_button)");
        this.LJLLJ = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.i7v);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.p…avi_editor_cancel_button)");
        this.LJLLL = (TuxIconView) findViewById2;
        View findViewById3 = view.findViewById(R.id.i85);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.p…ffect_editor_done_button)");
        this.LJLLLL = (TuxTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.gxb);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.navi_editor_done_btn)");
        this.LJLLLLLL = (SY4) findViewById4;
        View findViewById5 = view.findViewById(R.id.gxi);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.n…itor_viewpager_tab_strip)");
        this.LJLZ = (C80261Vej) findViewById5;
        View findViewById6 = view.findViewById(R.id.gxg);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.navi_editor_viewpager)");
        this.LJZ = (TBE) findViewById6;
        View findViewById7 = view.findViewById(R.id.gxd);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.n…_editor_slider_container)");
        this.LJZI = (ViewGroup) findViewById7;
        View findViewById8 = view.findViewById(R.id.gxe);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.n…i_editor_slider_panel_v2)");
        this.LJZL = (C72678Sfi) findViewById8;
        super.onViewCreated(view, bundle);
    }
}
