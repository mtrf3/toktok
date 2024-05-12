package com.ss.android.ugc.feed.platform.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C55230Lly;
import X.C62822Ol8;
import X.C76800UCe;
import X.C88407Ymp;
import X.C8VV;
import X.C90903hW;
import X.KR5;
import X.KR7;
import X.KR8;
import X.KRA;
import X.M89;
import X.TBU;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hox.Hox;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class GenericFeedFragment extends AbsFragment {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 370));

    public final KR7 vl() {
        return (KR7) this.LJLIL.getValue();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        vl().LLLIL();
        super.onDestroy();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        vl().W1();
        super.onDetach();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        vl().LLJLLL();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        vl().d5();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        vl().LLJILJIL();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        vl().LLLLZLLLI();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        KR5 N20;
        RootPanelComponent LIZLLL;
        o.LJIIIZ(activity, "activity");
        C8VV.LIZ(this, true, new AqS174S0100000_8(this, 267));
        C55230Lly.LIZ(this, null);
        C8VV.LIZ(this, true, new AqS174S0100000_8(this, 268));
        RootPanelComponent LIZLLL2 = KR8.LIZLLL(this);
        if (LIZLLL2 != null && (N20 = LIZLLL2.N20()) != null && (LIZLLL = KR8.LIZLLL(this)) != null) {
            final KRA panelContext = LIZLLL.getPanelContext();
            TBU tbu = new TBU(panelContext) { // from class: X.KR9
                @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
                public final Object get() {
                    return ((KRA) this.receiver).LIZJ;
                }

                @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
                public final void set(Object obj) {
                    ((KRA) this.receiver).LIZJ = (M89) obj;
                }
            };
            Object obj = tbu.get();
            if (obj == null) {
                obj = new M89();
            }
            if (tbu.get() == null) {
                tbu.set(obj);
            }
            getArguments();
            N20.LIZIZ();
        }
        vl().j(activity, this);
        super.onAttach(activity);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        vl().LLIIIJ(newConfig);
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Hox LIZ;
        String tv0;
        super.onCreate(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (tv0 = (LIZ = Hox.LJLLI.LIZ(mo49getActivity)).tv0(this)) != null) {
            LIZ.hv0(tv0, new C88407Ymp(KR8.LIZJ(this), this, tv0));
        }
        vl().N1(bundle);
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        vl().LLLII(outState);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        vl().LLLLLZ(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLJLL = vl().LLJLL(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(LLJLL instanceof View)) {
            LLJLL = null;
        }
        if (LLJLL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLJLL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLJLL, this);
                C10A.LIZIZ(LLJLL, this);
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
        return LLJLL;
    }
}
