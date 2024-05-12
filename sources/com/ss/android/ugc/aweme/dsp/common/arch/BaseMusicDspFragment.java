package com.ss.android.ugc.aweme.dsp.common.arch;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C16970lZ;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C73305Spp;
import X.C76800UCe;
import X.C79045V0n;
import X.C90903hW;
import X.C91071Zoh;
import X.C91503Zvf;
import X.O6R;
import X.YXW;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public abstract class BaseMusicDspFragment extends BaseFragment {
    public ViewModel LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    public abstract void initView(View view);

    public abstract int layoutId();

    public abstract ViewModel vl();

    public abstract void wl();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLIL = vl();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        wl();
        initView(view);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View LLLLIILL;
        ViewGroup viewGroup2;
        o.LJIIIZ(inflater, "inflater");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        C29S c29s = null;
        if (mo49getActivity == null) {
            viewGroup2 = null;
        } else {
            YXW.LIZ.getClass();
            if (YXW.LJIIIZ) {
                LLLLIILL = C16970lZ.LIZJ(layoutId(), mo49getActivity, viewGroup, false);
            } else {
                LLLLIILL = C16880lQ.LLLLIILL(inflater, layoutId(), viewGroup, false);
            }
            o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.FrameLayout");
            viewGroup2 = (ViewGroup) LLLLIILL;
            C91071Zoh c91071Zoh = new C91071Zoh(mo49getActivity);
            c91071Zoh.setId(R.id.gsx);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.bottomMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(49));
            c91071Zoh.setFinishInflated(true);
            Context context = c91071Zoh.getContext();
            o.LJIIIIZZ(context, "loadMoreLayout.context");
            Integer LJI = C79045V0n.LJI(R.attr.do, context);
            if (LJI != null) {
                c91071Zoh.setBackgroundColor(LJI.intValue());
            }
            C91503Zvf c91503Zvf = new C91503Zvf(mo49getActivity);
            c91503Zvf.setId(R.id.gsw);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            c91503Zvf.setOverScrollMode(2);
            C73305Spp c73305Spp = new C73305Spp(new ContextThemeWrapper(requireContext(), R.style.uw), null, 6);
            c73305Spp.setId(R.id.gsy);
            c73305Spp.setLayoutVariant(0);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams3.gravity = 17;
            View view = new View(mo49getActivity);
            view.setId(R.id.gsv);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 0);
            layoutParams4.gravity = 80;
            Context context2 = view.getContext();
            o.LJIIIIZZ(context2, "bottomSpace.context");
            Integer LJI2 = C79045V0n.LJI(R.attr.d4, context2);
            if (LJI2 != null) {
                view.setBackgroundColor(LJI2.intValue());
            }
            viewGroup2.addView(c91071Zoh, layoutParams);
            viewGroup2.addView(view, layoutParams4);
            c91071Zoh.addView(c91503Zvf, layoutParams2);
            c91071Zoh.addView(c73305Spp, layoutParams3);
        }
        if (!(viewGroup2 instanceof View)) {
            viewGroup2 = null;
        }
        if (viewGroup2 != null) {
            try {
                ViewTreeLifecycleOwner.set(viewGroup2, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewGroup2, this);
                C10A.LIZIZ(viewGroup2, this);
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 instanceof C29S) {
                    c29s = (C29S) mo49getActivity2;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return viewGroup2;
    }
}
