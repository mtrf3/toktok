package com.ss.android.ugc.aweme.profile.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.C9KF;
import X.C9YC;
import X.InterfaceC219588ja;
import X.InterfaceC236469Pu;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.ss.android.ugc.aweme.profile.ui.LiveEventBottomSheetFragment;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LiveEventBottomSheetFragment extends Fragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LJLJJI = 0;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final Handler LJLIL = new Handler();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 692));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJI;
        Integer valueOf = Integer.valueOf(R.id.isf);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.isf)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public LiveEventBottomSheetFragment() {
        C221108m2.LIZIZ(new AqS154S0100000_4(this, 693));
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(R.string.g6m);
        o.LJIIIIZZ(string, "getString(R.string.events_creator_profile)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 691));
        c235119Kp.LIZIZ(LIZJ);
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLIL.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isf);
        mo49getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.isf);
        C9YC c9yc = new C9YC((List) this.LJLILLLLZI.getValue());
        c9yc.LJLILLLLZI = new InterfaceC236469Pu() { // from class: X.9Pr
            @Override // X.InterfaceC236469Pu
            public final void LIZ(LiveEventStruct event) {
                o.LJIIIZ(event, "event");
                C243039gJ.LIZ(LiveEventBottomSheetFragment.this.getContext(), event);
                ASQ.LJ(LiveEventBottomSheetFragment.this, ASX.LIZ);
            }
        };
        recyclerView2.setAdapter(c9yc);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c64, viewGroup, false);
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
