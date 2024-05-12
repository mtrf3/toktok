package com.bytedance.effectcreatormobile.objectselect.prefab;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C65352Pkq;
import X.C70342pS;
import X.C76800UCe;
import X.C90903hW;
import X.C93408aQO;
import X.C94042aac;
import X.C94180acq;
import X.C94181acr;
import X.C94206adG;
import X.C94824anE;
import X.C94825anF;
import X.InterfaceC65784Pro;
import X.XKX;
import Y.IDeS363S0100000_42;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.IDqS446S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class PrefabPageFragment extends AbstractPrefabFragment {
    public static final /* synthetic */ int LJLJL = 0;
    public C94042aac LJLILLLLZI;
    public final ViewModelLazy LJLJI = C93408aQO.LIZ(this, C65352Pkq.LIZ(PrefabViewModel.class), new IDqS423S0100000_42((InterfaceC65784Pro) new IDqS423S0100000_42(this, 41), 40), null);
    public String LJLJJI;
    public GridLayoutManager LJLJJL;
    public C94180acq LJLJJLL;

    public final PrefabViewModel Al() {
        return (PrefabViewModel) this.LJLJI.getValue();
    }

    @Override // com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLILLLLZI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        o.LJI(arguments);
        String string = arguments.getString("category_key");
        o.LJI(string);
        this.LJLJJI = string;
    }

    @Override // com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C94042aac c94042aac = this.LJLILLLLZI;
        o.LJI(c94042aac);
        c94042aac.LJLILLLLZI.LJII(new C94206adG(), -1);
        requireContext();
        this.LJLJJL = new GridLayoutManager(5);
        C94042aac c94042aac2 = this.LJLILLLLZI;
        o.LJI(c94042aac2);
        RecyclerView recyclerView = c94042aac2.LJLILLLLZI;
        o.LJIIIIZZ(recyclerView, "binding.filterList");
        GridLayoutManager gridLayoutManager = this.LJLJJL;
        if (gridLayoutManager != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
            this.LJLJJLL = new C94180acq(new IDqS446S0100000_42(this, 5));
            C94042aac c94042aac3 = this.LJLILLLLZI;
            o.LJI(c94042aac3);
            RecyclerView recyclerView2 = c94042aac3.LJLILLLLZI;
            o.LJIIIIZZ(recyclerView2, "binding.filterList");
            C94180acq c94180acq = this.LJLJJLL;
            if (c94180acq != null) {
                recyclerView2.setAdapter(c94180acq);
                C70342pS c70342pS = new C70342pS(new C94181acr(new IDeS363S0100000_42(Al().LJLILLLLZI, 0), this), Al().LJLJJI, new C94825anF(this, null));
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94824anE(c70342pS, viewLifecycleOwner, Lifecycle.State.CREATED, null, this), 3);
                return;
            }
            o.LJIJI("adapter");
            throw null;
        }
        o.LJIJI("layoutManager");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dve, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) LLLLIILL.findViewById(R.id.nmz);
        if (recyclerView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) LLLLIILL;
            this.LJLILLLLZI = new C94042aac(constraintLayout, recyclerView);
            try {
                ViewTreeLifecycleOwner.set(constraintLayout, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(constraintLayout, this);
                C10A.LIZIZ(constraintLayout, this);
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
            return constraintLayout;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(R.id.nmz)));
    }
}
