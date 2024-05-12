package com.ss.android.ugc.aweme.geofencing.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C41085GAn;
import X.C41087GAp;
import X.C41090GAs;
import X.C61878OQg;
import X.C62822Ol8;
import X.C73305Spp;
import X.C73318Sq2;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC41042G8w;
import X.ORY;
import X.T3D;
import Y.ACListenerS27S0100000_7;
import Y.AfS59S0100000_7;
import Y.IDObjectS179S0100000_7;
import Y.IDhS100S0100000_7;
import Y.IDrS46S0100000_7;
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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GeoFencingSelectionFragment extends Fragment {
    public static final /* synthetic */ int LJLL = 0;
    public C41085GAn LJLIL;
    public List<TranslatedRegion> LJLJI;
    public InterfaceC41042G8w LJLJJI;
    public C73305Spp LJLJJL;
    public View LJLJJLL;
    public boolean LJLJL;
    public T3D LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C41087GAp.LJLIL);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    public final void vl() {
        C41090GAs.LIZ(new AqS173S0100000_7(this, 66), new AqS173S0100000_7(this, 67));
    }

    public final void LJII() {
        View view = this.LJLJJLL;
        if (view != null) {
            view.setVisibility(8);
        }
        _$_findCachedViewById(R.id.dra).setVisibility(8);
        C73305Spp c73305Spp = this.LJLJJL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
        }
        C73305Spp c73305Spp2 = this.LJLJJL;
        if (c73305Spp2 != null) {
            c73305Spp2.LJFF();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((C73318Sq2) this.LJLILLLLZI.getValue()).dispose();
        T3D t3d = this.LJLJLJ;
        if (t3d != null) {
            t3d.LIZIZ();
        }
        this.LJLJLJ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        List<TranslatedRegion> list;
        Object[] objArr;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJJL = (C73305Spp) view.findViewById(R.id.kf_);
        this.LJLJJLL = view.findViewById(R.id.dre);
        LJII();
        Bundle arguments = getArguments();
        if (arguments != null) {
            obj = arguments.getSerializable("extra.region.list");
        } else {
            obj = null;
        }
        if (!(obj instanceof TranslatedRegion[]) || (objArr = (Object[]) obj) == null || (list = ORY.LJJZZIII(objArr)) == null) {
            list = C61878OQg.INSTANCE;
        }
        this.LJLJI = list;
        Iterator<TranslatedRegion> it = list.iterator();
        while (it.hasNext()) {
            it.next().setSelected(true);
        }
        this.LJLIL = new C41085GAn(C61878OQg.INSTANCE, list);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.dra);
        C41085GAn c41085GAn = this.LJLIL;
        if (c41085GAn != null) {
            recyclerView.setAdapter(c41085GAn);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.LJIIJJI(new IDrS46S0100000_7(this, 6));
            C73318Sq2 c73318Sq2 = (C73318Sq2) this.LJLILLLLZI.getValue();
            C41085GAn c41085GAn2 = this.LJLIL;
            if (c41085GAn2 != null) {
                c73318Sq2.LIZ(c41085GAn2.LJLJI.LJJIJL(new IDhS100S0100000_7(c41085GAn2, 8)).LJJJJZI(new AfS59S0100000_7(this, 83)));
                ((TextView) _$_findCachedViewById(R.id.drf)).addTextChangedListener(new IDObjectS179S0100000_7(this, 6));
                C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.drd), new ACListenerS27S0100000_7(this, 183));
                C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.dr6), new ACListenerS27S0100000_7(this, 184));
                C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.drc), new ACListenerS27S0100000_7(this, 185));
                vl();
                return;
            }
            o.LJIJI("regionAdapter");
            throw null;
        }
        o.LJIJI("regionAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ed, viewGroup, false);
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
