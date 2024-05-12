package com.ss.android.ugc.aweme.search.common.ui;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C50238Jne;
import X.C50240Jng;
import X.C61712OJw;
import X.C61713OJx;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C75O;
import X.C76800UCe;
import X.C79045V0n;
import X.C81293VvN;
import X.C81298VvS;
import X.C81300VvU;
import X.C90903hW;
import X.VVN;
import X.ViewOnClickListenerC13880ga;
import X.ViewOnKeyListenerC81299VvT;
import Y.ACListenerS34S0100000_14;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.search.pages.common.theme.ThemeViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class SearchDialogFragment extends AmeBaseFragment implements C75O {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public C81293VvN LJLIL;
    public ViewGroup LJLILLLLZI;
    public ViewGroup LJLJI;
    public ViewGroup LJLJJI;
    public AppCompatTextView LJLJJL;
    public AppCompatTextView LJLJJLL;
    public View LJLJL;
    public TuxTextView LJLJLJ;
    public boolean LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;

    public SearchDialogFragment() {
        new LinkedHashMap();
        this.LJLL = C221108m2.LIZIZ(C81300VvU.LJLIL);
        this.LJLLI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 138));
        new AqS180S0100000_14(this, 127);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        vl();
    }

    public final void vl() {
        View view = getView();
        if (view != null) {
            view.setFocusableInTouchMode(true);
        }
        View view2 = getView();
        if (view2 != null) {
            view2.requestFocus();
        }
        View view3 = getView();
        if (view3 != null) {
            view3.setOnKeyListener(new ViewOnKeyListenerC81299VvT(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-1375462028057374697");
        if (c03880Dg.LIZJ(10501, "com/ss/android/ugc/aweme/search/common/ui/SearchDialogFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/search/common/ui/SearchDialogFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        if (!isHidden()) {
            vl();
        }
        c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/search/common/ui/SearchDialogFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // X.C75O
    public final void O4(float f, float f2) {
        C50240Jng c50240Jng;
        Integer valueOf;
        float f3 = (f * 1.0f) / f2;
        if (f3 < 0.0f) {
            return;
        }
        int i = 0;
        Object evaluate = ((ArgbEvaluator) this.LJLL.getValue()).evaluate(f3, 0, Integer.valueOf(((Number) this.LJLLI.getValue()).intValue()));
        o.LJII(evaluate, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) evaluate).intValue();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        Integer num = null;
        if (mo49getActivity != null && (c50240Jng = (C50240Jng) ((LiveData) ((ThemeViewModel) ViewModelProviders.of(mo49getActivity).get(ThemeViewModel.class)).LJLJJL.getValue()).getValue()) != null && (valueOf = Integer.valueOf(c50240Jng.LIZIZ)) != null) {
            Object evaluate2 = ((ArgbEvaluator) this.LJLL.getValue()).evaluate(f3, valueOf, Integer.valueOf(((Number) this.LJLLI.getValue()).intValue()));
            o.LJII(evaluate2, "null cannot be cast to non-null type kotlin.Int");
            num = (Integer) evaluate2;
        }
        try {
            ViewGroup viewGroup = this.LJLJI;
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(intValue);
            }
            if (num != null && mo49getActivity() != null) {
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                o.LJI(mo49getActivity2);
                C61713OJx LIZJ = C61712OJw.LIZJ(mo49getActivity2);
                LIZJ.LJIIIIZZ(num.intValue());
                LIZJ.LIZJ();
                return;
            }
            if (C50238Jne.LJ()) {
                ViewGroup viewGroup2 = this.LJLJI;
                o.LJI(viewGroup2);
                Context context = viewGroup2.getContext();
                o.LJIIIIZZ(context, "rootView!!.context");
                Integer LJI = C79045V0n.LJI(R.attr.cl, new ContextThemeWrapper(context, R.style.ux));
                if (LJI != null) {
                    i = LJI.intValue();
                }
            } else {
                i = 8421504;
            }
            mo49getActivity().getWindow().setStatusBarColor(i);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer LJI;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJI = (ViewGroup) view.findViewById(R.id.bs8);
        this.LJLIL = (C81293VvN) view.findViewById(R.id.j7n);
        this.LJLJJI = (ViewGroup) view.findViewById(R.id.l_j);
        this.LJLJJL = (AppCompatTextView) view.findViewById(R.id.bfm);
        this.LJLJJLL = (AppCompatTextView) view.findViewById(R.id.br4);
        this.LJLILLLLZI = (ViewGroup) view.findViewById(R.id.c9z);
        this.LJLJLJ = (TuxTextView) view.findViewById(R.id.c_i);
        VVN vvn = (VVN) view.findViewById(R.id.c_4);
        if (vvn != null) {
            vvn.setNestedScrollingParent(this.LJLIL);
        }
        ViewGroup viewGroup = this.LJLILLLLZI;
        int i = 0;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = 0;
            } else {
                layoutParams = null;
            }
            viewGroup.setLayoutParams(layoutParams);
        }
        if (!TextUtils.isEmpty(null) && (appCompatTextView2 = this.LJLJJL) != null) {
            appCompatTextView2.setText((CharSequence) null);
        }
        ACListenerS34S0100000_14 aCListenerS34S0100000_14 = new ACListenerS34S0100000_14(this, 71);
        AppCompatTextView appCompatTextView3 = this.LJLJJL;
        if (appCompatTextView3 != null) {
            C16880lQ.LJIJI(appCompatTextView3, new ACListenerS34S0100000_14(this, 69));
        }
        C81293VvN c81293VvN = this.LJLIL;
        if (c81293VvN != null) {
            c81293VvN.setOnCancelListener(aCListenerS34S0100000_14);
        }
        if (!TextUtils.isEmpty(null) && (appCompatTextView = this.LJLJJLL) != null) {
            appCompatTextView.setText((CharSequence) null);
        }
        AppCompatTextView appCompatTextView4 = this.LJLJJLL;
        if (appCompatTextView4 != null) {
            appCompatTextView4.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS34S0100000_14(this, 70)));
        }
        mo49getActivity();
        TuxTextView tuxTextView = this.LJLJLJ;
        if (tuxTextView != null) {
            tuxTextView.setText((CharSequence) null);
        }
        ViewGroup viewGroup2 = this.LJLJJI;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        this.LJLJL = view.findViewById(R.id.n_v);
        if (getContext() != null) {
            AppCompatTextView appCompatTextView5 = this.LJLJJLL;
            if (appCompatTextView5 != null) {
                Context context = getContext();
                if (context != null && (LJI = C79045V0n.LJI(R.attr.eb, context)) != null) {
                    i = LJI.intValue();
                }
                appCompatTextView5.setTextColor(i);
            }
            AppCompatTextView appCompatTextView6 = this.LJLJJLL;
            if (appCompatTextView6 != null) {
                appCompatTextView6.setClickable(true);
            }
        }
        C81293VvN c81293VvN2 = this.LJLIL;
        if (c81293VvN2 != null) {
            c81293VvN2.setMOnShowHeightChangeListener(this);
            C81293VvN c81293VvN3 = this.LJLIL;
            if (c81293VvN3 != null) {
                c81293VvN3.setOnDialogListener(new C81298VvS(this));
            }
            C81293VvN c81293VvN4 = this.LJLIL;
            if (c81293VvN4 != null) {
                c81293VvN4.LIZ(true, true);
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cg2, viewGroup, false);
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
