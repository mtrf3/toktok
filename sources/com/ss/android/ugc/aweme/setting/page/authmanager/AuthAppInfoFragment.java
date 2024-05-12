package com.ss.android.ugc.aweme.setting.page.authmanager;

import X.ActivityC45651qj;
import X.C10A;
import X.C110614Vt;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C90903hW;
import X.SY4;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS24S0100000_4;
import Y.AObserverS72S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AuthAppInfoFragment extends JediBaseFragment {
    public static String LJLJJI = "";
    public static String LJLJJL = "";
    public static String LJLJJLL = "";
    public static String LJLJL;
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    public AuthAppInfoFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(AuthListViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 150));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 802));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        _$_findCachedViewById(R.id.aej).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS24S0100000_4(this, 262)));
        View _$_findCachedViewById = _$_findCachedViewById(R.id.am4);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.ci);
        c110614Vt.LJIIIIZZ = Float.valueOf(C32151Nz.LJIIZILJ(4));
        c110614Vt.LJIIIZ = Float.valueOf(C32151Nz.LJIIZILJ(4));
        c110614Vt.LJIIJ = Float.valueOf(C32151Nz.LJIIZILJ(4));
        c110614Vt.LJIIJJI = Float.valueOf(C32151Nz.LJIIZILJ(4));
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        _$_findCachedViewById.setBackground(c110614Vt.LIZ(requireContext));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.aug), new ACListenerS24S0100000_4(this, 263));
        ((AuthListViewModel) this.LJLIL.getValue()).LJLJL.observe(this, new AObserverS72S0100000_4(this, 36));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ckr, viewGroup, false);
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
