package com.ss.android.ugc.aweme.compliance.privacy.sdk.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C47261Igj;
import X.C62822Ol8;
import X.C71909SKb;
import X.C76800UCe;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC219588ja;
import X.ORZ;
import X.SKI;
import X.SKJ;
import X.SKL;
import X.SLJ;
import X.SNL;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PrivacySettingSheet extends Fragment implements InterfaceC219588ja, SKJ {
    public static final /* synthetic */ int LJLJJI = 0;
    public SLJ LJLIL;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 168));

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

    @Override // X.SKJ
    public final void Ra() {
        SLJ slj = this.LJLIL;
        if (slj == null) {
            return;
        }
        SKI ski = SKJ.LJJJJLL;
        List LJJIJ = C47261Igj.LJJIJ(slj);
        ski.getClass();
        String LIZ = SKI.LIZ(LJJIJ);
        TextView textView = (TextView) _$_findCachedViewById(R.id.lgi);
        if (textView != null) {
            if (LIZ == null || LIZ.length() == 0) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(LIZ);
            }
        }
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        String str;
        Integer num = ((TPSCPageBuildConfigs) this.LJLILLLLZI.getValue()).titleRes;
        if (num != null && num.intValue() != 0) {
            str = getString(num.intValue());
        } else {
            str = ((TPSCPageBuildConfigs) this.LJLILLLLZI.getValue()).title;
        }
        C235119Kp c235119Kp = new C235119Kp();
        if (str != null) {
            C9KF c9kf = new C9KF();
            c9kf.LIZJ = str;
            c235119Kp.LIZJ = c9kf;
        }
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS162S0100000_12(this, 169));
        c235119Kp.LIZIZ(LIZJ);
        c235119Kp.LIZLLL = true;
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SKL skl = new SKL(this);
        Object value = SNL.LIZLLL.getValue();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), R.style.ul);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            mo49getActivity = this;
        }
        TPSCPageBuildConfigs tPSCPageBuildConfigs = (TPSCPageBuildConfigs) this.LJLILLLLZI.getValue();
        value.getClass();
        this.LJLIL = (SLJ) ORZ.LJLLJ(C71909SKb.LIZIZ(contextThemeWrapper, mo49getActivity, this, tPSCPageBuildConfigs, skl));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (this.LJLIL == null) {
            return;
        }
        getContext();
        ((RecyclerView) _$_findCachedViewById(R.id.ftq)).setLayoutManager(new WrapLinearLayoutManager(1));
        ((RecyclerView) _$_findCachedViewById(R.id.ftq)).setItemAnimator(null);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.ftq);
        SLJ slj = this.LJLIL;
        if (slj != null) {
            recyclerView.setAdapter(slj);
            Ra();
        } else {
            o.LJIJI("adapter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ahl, viewGroup, false);
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
