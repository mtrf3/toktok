package com.ss.android.ugc.aweme.geofencing.ui;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C41090GAs;
import X.C61878OQg;
import X.C73318Sq2;
import X.C76800UCe;
import X.C90903hW;
import X.C9KF;
import X.GAX;
import X.InterfaceC41042G8w;
import X.ORY;
import Y.ACListenerS27S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GeoFencingStatusFragment extends Fragment {
    public static final /* synthetic */ int LJLJJLL = 0;
    public GAX LJLIL;
    public InterfaceC41042G8w LJLILLLLZI;
    public C235119Kp LJLJI;
    public boolean LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC41042G8w interfaceC41042G8w;
        if (!this.LJLJJI && (interfaceC41042G8w = this.LJLILLLLZI) != null) {
            GAX gax = this.LJLIL;
            if (gax != null) {
                interfaceC41042G8w.LIZ(gax.getCurrentList());
            } else {
                o.LJIJI("regionDeleteAdapter");
                throw null;
            }
        }
        super.onDestroy();
        ((C73318Sq2) C41090GAs.LIZIZ.getValue()).LIZLLL();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        List list;
        boolean z;
        Object[] objArr;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            obj = arguments.getSerializable("extra.region.list");
        } else {
            obj = null;
        }
        if (!(obj instanceof TranslatedRegion[]) || (objArr = (Object[]) obj) == null || (list = ORY.LJJZZIII(objArr)) == null) {
            list = C61878OQg.INSTANCE;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z = arguments2.getBoolean("extra.read_only");
        } else {
            z = false;
        }
        C235119Kp c235119Kp = new C235119Kp();
        this.LJLJI = c235119Kp;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS157S0100000_7(this, 725));
        c235119Kp.LIZIZ(LIZJ);
        C9KF c9kf = new C9KF();
        String string = getString(R.string.p6k);
        o.LJIIIIZZ(string, "getString(R.string.post_targeted_locations)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwg);
        C235119Kp c235119Kp2 = this.LJLJI;
        if (c235119Kp2 != null) {
            c252709vu.setNavActions(c235119Kp2);
            ((C252709vu) _$_findCachedViewById(R.id.gwg)).LJIILJJIL(true);
            if (z) {
                TextView textView = (TextView) _$_findCachedViewById(R.id.dr5);
                ActivityC45651qj requireActivity = requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, requireActivity));
                ((TextView) _$_findCachedViewById(R.id.dr5)).setText(R.string.s3z);
                ((TextView) _$_findCachedViewById(R.id.dr7)).setText(R.string.s3r);
            } else {
                C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.dr5), new ACListenerS27S0100000_7(this, 188));
            }
            ActivityC45651qj requireActivity2 = requireActivity();
            o.LJIIIIZZ(requireActivity2, "requireActivity()");
            this.LJLIL = new GAX(requireActivity2, list, z);
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.drh);
            GAX gax = this.LJLIL;
            if (gax != null) {
                recyclerView.setAdapter(gax);
                requireContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                C41090GAs.LIZJ(null, null);
                return;
            }
            o.LJIJI("regionDeleteAdapter");
            throw null;
        }
        o.LJIJI("navActions");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.awl, viewGroup, false);
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
