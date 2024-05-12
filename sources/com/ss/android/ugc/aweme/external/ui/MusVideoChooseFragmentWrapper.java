package com.ss.android.ugc.aweme.external.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C1B3;
import X.C1JI;
import X.C29S;
import X.C3C5;
import X.C42156Gga;
import X.C42158Ggc;
import X.C42159Ggd;
import X.C42160Gge;
import X.C45657Hvx;
import X.C60903NvH;
import X.C65531Pnj;
import X.C76800UCe;
import X.C78685UuP;
import X.C90903hW;
import X.WM7;
import X.WMA;
import X.WMH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.scene.ui.LifeCycleCompatFragment;
import com.bytedance.scene.ui.ScopeHolderCompatFragment;
import com.ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MusVideoChooseFragmentWrapper extends Fragment implements IVideoChoose {
    public final C45657Hvx LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final int LJLIL = View.generateViewId();

    public MusVideoChooseFragmentWrapper() {
        int color = C60903NvH.LJ.getResources().getColor(R.color.bd);
        int color2 = C60903NvH.LJ.getResources().getColor(R.color.b6);
        int color3 = C60903NvH.LJ.getResources().getColor(R.color.ar);
        C45657Hvx c45657Hvx = new C45657Hvx();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_NUM_COLUMNS", 3);
        bundle.putFloat("ARG_HORIZONTAL_SPACING", 1.5f);
        bundle.putFloat("ARG_VERTICAL_SPACING", 1.5f);
        bundle.putInt("ARG_GRID_PADDING", 0);
        bundle.putInt("ARG_TEXT_COLOR", color);
        bundle.putInt("ARG_SHADOW_COLOR", color2);
        bundle.putDouble("ARG_ITEM_HEIGHT_WIDTH_RATIO", 1.0d);
        bundle.putInt("ARG_TEXT_SIZE", 13);
        bundle.putBoolean("ARG_TEXT_BACKGROUND", false);
        bundle.putBoolean("ARG_TEXT_INDICATOR", false);
        bundle.putInt("ARG_BG_COLOR", color3);
        c45657Hvx.mArguments = bundle;
        this.LJLILLLLZI = c45657Hvx;
    }

    @Override // com.ss.android.ugc.aweme.services.videochoose.IVideoChoose
    public final void loadData() {
        this.LJLILLLLZI.loadData();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C42159Ggd c42159Ggd = new C42159Ggd(this, C45657Hvx.class, this.LJLIL);
        C42158Ggc c42158Ggc = new C42158Ggc(this);
        Fragment fragment = c42159Ggd.LIZ;
        int i = c42159Ggd.LIZJ;
        Class<? extends WMH> cls = c42159Ggd.LIZIZ;
        C1JI.LJII();
        WeakHashMap<Fragment, HashSet<String>> weakHashMap = C42160Gge.LIZ;
        if (weakHashMap.get(fragment) == null || !weakHashMap.get(fragment).contains("LifeCycleCompatFragment")) {
            HashSet<String> hashSet = weakHashMap.get(fragment);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                weakHashMap.put(fragment, hashSet);
            }
            hashSet.add("LifeCycleCompatFragment");
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            LifeCycleCompatFragment lifeCycleCompatFragment = (LifeCycleCompatFragment) childFragmentManager.LJJJIL("LifeCycleCompatFragment");
            if (lifeCycleCompatFragment != null) {
                C1B3 c1b3 = new C1B3(childFragmentManager);
                c1b3.LJJI(lifeCycleCompatFragment);
                C78685UuP.LJIIIZ(c1b3, false);
            }
            C42156Gga c42156Gga = new C42156Gga(fragment);
            WM7 LIZ = c42158Ggc.LIZ(fragment.getClass().getClassLoader(), cls.getName());
            if (LIZ == null) {
                LIZ = C65531Pnj.LIZ(null, cls);
            }
            ScopeHolderCompatFragment vl = ScopeHolderCompatFragment.vl(fragment, true, false);
            LifeCycleCompatFragment lifeCycleCompatFragment2 = new LifeCycleCompatFragment();
            lifeCycleCompatFragment2.LJLIL = new WMA(i, c42156Gga, LIZ, vl, false);
            C1B3 c1b32 = new C1B3(childFragmentManager);
            c1b32.LJIIIIZZ(i, 1, lifeCycleCompatFragment2, "LifeCycleCompatFragment");
            C78685UuP.LJIIIZ(c1b32, false);
            return;
        }
        throw new IllegalArgumentException("tag duplicate, use another tag when invoke setupWithActivity for the second time in same Fragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        frameLayout.setId(this.LJLIL);
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            C10A.LIZIZ(frameLayout, this);
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
        return frameLayout;
    }
}
