package com.ss.android.ugc.aweme.nows.feed.ui;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C55096Ljo;
import X.C55230Lly;
import X.C73305Spp;
import X.C76800UCe;
import X.C79045V0n;
import X.C90903hW;
import X.C9KF;
import Y.ARunnableS22S0200000_3;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class SocialNowsBaseDetailFragment extends BaseFragment implements StatusViewProvider {
    public C252709vu LJLIL;
    public C73305Spp LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
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

    @Override // com.ss.android.ugc.aweme.nows.feed.ui.StatusViewProvider
    public final C73305Spp lj0() {
        C73305Spp c73305Spp = this.LJLILLLLZI;
        if (c73305Spp != null) {
            return c73305Spp;
        }
        o.LJIJI("statusView");
        throw null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C55096Ljo.LJIILL(C55230Lly.LIZJ(this, null), StatusViewProvider.class, null);
        _$_clearFindViewByIdCache();
    }

    public void vl(View view) {
        view.post(new ARunnableS22S0200000_3(view, this, 20));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.gwg);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.nav_bar)");
        this.LJLIL = (C252709vu) findViewById;
        View findViewById2 = view.findViewById(R.id.kf_);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.status_view)");
        this.LJLILLLLZI = (C73305Spp) findViewById2;
        C252709vu c252709vu = this.LJLIL;
        if (c252709vu != null) {
            String string = c252709vu.getContext().getString(R.string.j5h);
            o.LJIIIIZZ(string, "navbar.context.getString…_posted_halfscreen_title)");
            C235119Kp c235119Kp = new C235119Kp();
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark;
            LIZJ.LIZIZ(new AqS153S0100000_3(this, 1704));
            C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
            LIZLLL.LIZJ = string;
            c235119Kp.LIZJ = LIZLLL;
            C252709vu c252709vu2 = this.LJLIL;
            if (c252709vu2 != null) {
                c252709vu2.setNavActions(c235119Kp);
                Context context = view.getContext();
                o.LJIIIIZZ(context, "view.context");
                Integer LJI = C79045V0n.LJI(R.attr.d4, context);
                if (LJI != null) {
                    int intValue = LJI.intValue();
                    ActivityC45651qj mo49getActivity = mo49getActivity();
                    if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
                        window.setNavigationBarColor(intValue);
                    }
                }
                View findViewById3 = view.findViewById(R.id.c92);
                o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.detail_content)");
                vl(findViewById3);
                C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this, null), this, StatusViewProvider.class, null);
                return;
            }
            o.LJIJI("navbar");
            throw null;
        }
        o.LJIJI("navbar");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bxj, viewGroup, false);
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
