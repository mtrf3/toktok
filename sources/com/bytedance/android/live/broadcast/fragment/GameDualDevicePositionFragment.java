package com.bytedance.android.live.broadcast.fragment;

import X.ActivityC45651qj;
import X.C0NB;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1BD;
import X.C221108m2;
import X.C276716t;
import X.C28408BCy;
import X.C29S;
import X.C32537Cpp;
import X.C3C5;
import X.C46841se;
import X.C46851sf;
import X.C46861sg;
import X.C47261Igj;
import X.C48459J0d;
import X.C51029K0z;
import X.C62822Ol8;
import X.C73933Szx;
import X.C73969T1h;
import X.C76800UCe;
import X.C80261Vej;
import X.C90903hW;
import X.InterfaceC29856Bng;
import X.InterfaceC30442Bx8;
import X.X1D;
import Y.IDfS292S0100000;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class GameDualDevicePositionFragment extends BaseFragment {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public ViewPager LJLJJL;

    public GameDualDevicePositionFragment() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(C46861sg.LJLIL);
        this.LJLILLLLZI = C221108m2.LIZIZ(C46841se.LJLIL);
        this.LJLJI = C221108m2.LIZIZ(new C46851sf(this));
        this.LJLJJI = C221108m2.LIZIZ(new IDqS420S0100000(this, 35));
    }

    public final boolean vl() {
        return ((Boolean) this.LJLJI.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, O] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C48459J0d<Integer> c48459J0d;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (vl()) {
            c48459J0d = InterfaceC30442Bx8.i3;
        } else {
            c48459J0d = InterfaceC30442Bx8.j3;
        }
        ?? LIZJ = c48459J0d.LIZJ();
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            ((C32537Cpp) LJIILIIL.gv0(C28408BCy.class)).LIZ = LIZJ;
        }
        C80261Vej c80261Vej = (C80261Vej) view.findViewById(R.id.lp9);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.lp_);
        if (viewPager != null) {
            final FragmentManager childFragmentManager = getChildFragmentManager();
            o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
            boolean vl = vl();
            GameDualDevicePositionSelectFragment gameDualDevicePositionSelectFragment = new GameDualDevicePositionSelectFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("is_landscape", vl);
            gameDualDevicePositionSelectFragment.setArguments(bundle2);
            boolean vl2 = vl();
            GameDualDevicePositionPreviewFragment gameDualDevicePositionPreviewFragment = new GameDualDevicePositionPreviewFragment();
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("is_landscape", vl2);
            gameDualDevicePositionPreviewFragment.setArguments(bundle3);
            final List LJJIJIL = C47261Igj.LJJIJIL(gameDualDevicePositionSelectFragment, gameDualDevicePositionPreviewFragment);
            String string = getString(R.string.mw3);
            o.LJIIIIZZ(string, "getString(R.string.pm_ls…Cam_actionSheet4_tapName)");
            String string2 = getString(R.string.mw5);
            o.LJIIIIZZ(string2, "getString(R.string.pm_ls…Cam_actionSheet5_tapName)");
            final List LJJIJIL2 = C47261Igj.LJJIJIL(string, string2);
            viewPager.setAdapter(new C1BD(childFragmentManager, LJJIJIL, LJJIJIL2) { // from class: X.1j7
                public final List<Fragment> LJLJLJ;
                public final List<String> LJLJLLL;

                @Override // androidx.viewpager.widget.PagerAdapter
                public final int getCount() {
                    return this.LJLJLJ.size();
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final CharSequence LJIILIIL(int i) {
                    return (CharSequence) ListProtector.get(this.LJLJLLL, i);
                }

                @Override // X.C1BD
                public final Fragment LJJIII(int i) {
                    return (Fragment) ListProtector.get(this.LJLJLJ, i);
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LJLJLJ = LJJIJIL;
                    this.LJLJLLL = LJJIJIL2;
                }
            });
        } else {
            viewPager = null;
        }
        this.LJLJJL = viewPager;
        c80261Vej.setupWithViewPager(viewPager, false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isLandscape = ");
        LIZ.append(vl());
        C0NB.LJIIIZ("GameDualDevicePositionFragment", X1D.LIZIZ(LIZ));
        ((InterfaceC29856Bng) C276716t.LIZJ.LJJJ(C73969T1h.LIZIZ()).LIZJ(C73933Szx.LIZLLL(this))).LIZIZ(new IDfS292S0100000(this, 41));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d3z, viewGroup, false);
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
}
