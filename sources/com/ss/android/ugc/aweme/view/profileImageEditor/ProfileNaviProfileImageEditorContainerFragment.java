package com.ss.android.ugc.aweme.view.profileImageEditor;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C188727au;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C72550Sde;
import X.C72582SeA;
import X.C72593SeL;
import X.C73156SnQ;
import X.C73318Sq2;
import X.C76800UCe;
import X.C78857UxB;
import X.C79902VXm;
import X.C90903hW;
import X.FMX;
import X.InterfaceC72616Sei;
import X.KNV;
import X.QD3;
import X.TBV;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes13.dex */
public final class ProfileNaviProfileImageEditorContainerFragment extends ProfileNaviGLSurfaceFragment {
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public String LJLJL = "avatar_hub";
    public final String LJLJLJ = "ImageEditorContainer";
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 958));

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final int getLayout() {
        return R.layout.c7c;
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final void xl() {
        FragmentManager supportFragmentManager;
        Jl(null);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) != null) {
            String enterFrom = this.LJLJL;
            o.LJIIIZ(enterFrom, "enterFrom");
            ProfileNaviProfileImageEditorFragment profileNaviProfileImageEditorFragment = new ProfileNaviProfileImageEditorFragment();
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", enterFrom);
            profileNaviProfileImageEditorFragment.setArguments(bundle);
            profileNaviProfileImageEditorFragment.show(supportFragmentManager, this.LJLJLJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final C79902VXm wl() {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(R.id.i8j));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (view = view2.findViewById(R.id.i8j)) != null) {
                linkedHashMap.put(Integer.valueOf(R.id.i8j), view);
            } else {
                view = null;
            }
        }
        return (C79902VXm) view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final void Al(C73318Sq2 c73318Sq2) {
        super.Al(c73318Sq2);
        c73318Sq2.LIZ(C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLJLLL.getValue(), new TBV() { // from class: X.Sek
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((ProfileNaviCreatorState) obj).getProfileImageBackgroundColor();
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviCreatorState) obj).setProfileImageBackgroundColor((String) obj2);
            }
        }, new AqS194S0100000_12(this, 151)));
    }

    public final void Jl(String str) {
        int parseColor;
        InterfaceC72616Sei naviManager;
        try {
            C79902VXm wl = wl();
            String str2 = null;
            if (C78857UxB.LJJJIL(str)) {
                parseColor = Color.parseColor(str);
            } else {
                ((ProfileNaviCreatorViewModel) this.LJLJLLL.getValue()).getClass();
                C72582SeA c72582SeA = C72593SeL.LIZIZ;
                if (c72582SeA != null) {
                    str2 = c72582SeA.LIZIZ;
                }
                parseColor = Color.parseColor(str2);
            }
            if (wl != null) {
                InterfaceC72616Sei naviManager2 = wl.getNaviManager();
                if (naviManager2 != null) {
                    naviManager2.LJJJLIIL(Color.red(parseColor) / 256.0f);
                }
                if (wl != null) {
                    InterfaceC72616Sei naviManager3 = wl.getNaviManager();
                    if (naviManager3 != null) {
                        naviManager3.LJJJJLI(Color.blue(parseColor) / 256.0f);
                    }
                    if (wl != null) {
                        InterfaceC72616Sei naviManager4 = wl.getNaviManager();
                        if (naviManager4 != null) {
                            naviManager4.LJJJLL(Color.green(parseColor) / 256.0f);
                        }
                        if (wl != null) {
                            InterfaceC72616Sei naviManager5 = wl.getNaviManager();
                            if (naviManager5 != null) {
                                naviManager5.LJJLIIIJJI();
                            }
                            if (wl != null && (naviManager = wl.getNaviManager()) != null) {
                                naviManager.LJJLIIIJLJLI();
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onImageEditorEvent(C72550Sde event) {
        C79902VXm wl;
        o.LJIIIZ(event, "event");
        int i = event.LJLIL;
        if (i != 0) {
            if (i != 1 || (wl = wl()) == null) {
                return;
            }
            wl.setVisibility(4);
            return;
        }
        C79902VXm wl2 = wl();
        if (wl2 == null) {
            return;
        }
        wl2.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        String str = this.LJLJL;
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        FMX.LJIIL("show_set_avatar_profile", LIZLLL.LIZ);
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(onCreateView instanceof View)) {
            onCreateView = null;
        }
        if (onCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(onCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(onCreateView, this);
                C10A.LIZIZ(onCreateView, this);
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
        return onCreateView;
    }
}
