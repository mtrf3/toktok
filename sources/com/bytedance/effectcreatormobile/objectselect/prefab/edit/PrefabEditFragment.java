package com.bytedance.effectcreatormobile.objectselect.prefab.edit;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C65352Pkq;
import X.C76800UCe;
import X.C79863Bm;
import X.C90903hW;
import X.C93408aQO;
import X.C93421aQb;
import X.C94041aab;
import X.C94057aar;
import X.C94199ad9;
import X.C94766amI;
import X.InterfaceC65784Pro;
import X.XKX;
import Y.IDCListenerS139S0100000_42;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.objectselect.prefab.AbstractPrefabFragment;
import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel;
import com.bytedance.ies.effectcreator.swig.UIAnnotationFloat;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class PrefabEditFragment extends AbstractPrefabFragment {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final ViewModelLazy LJLILLLLZI = C93408aQO.LIZ(this, C65352Pkq.LIZ(PrefabEditViewModel.class), new IDqS423S0100000_42((InterfaceC65784Pro) new IDqS423S0100000_42((Fragment) this, 45), 46), new IDqS423S0100000_42(this, 50));
    public final ViewModelLazy LJLJI = C93408aQO.LIZ(this, C65352Pkq.LIZ(PrefabViewModel.class), new IDqS423S0100000_42((InterfaceC65784Pro) new IDqS423S0100000_42(this, 49), 47), null);
    public C94041aab LJLJJI;
    public C94057aar LJLJJL;

    @Override // com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLJJI = null;
    }

    @Override // com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C94041aab c94041aab = this.LJLJJI;
        o.LJI(c94041aab);
        C16880lQ.LJIILLIIL(c94041aab.LJLJI, new IDCListenerS139S0100000_42(this, 1));
        C94041aab c94041aab2 = this.LJLJJI;
        o.LJI(c94041aab2);
        C16880lQ.LJIILLIIL(c94041aab2.LJLILLLLZI, new IDCListenerS139S0100000_42(this, 2));
        C94041aab c94041aab3 = this.LJLJJI;
        o.LJI(c94041aab3);
        RecyclerView recyclerView = c94041aab3.LJLJJI;
        o.LJIIIIZZ(recyclerView, "binding.paramList");
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        C93421aQb c93421aQb = new C93421aQb();
        C94199ad9 c94199ad9 = new C94199ad9();
        c94199ad9.LIZIZ = new IDqS423S0100000_42(this, 48);
        c93421aQb.LIZ(UIAnnotationFloat.class, c94199ad9);
        this.LJLJJL = c93421aQb.LIZ;
        C94041aab c94041aab4 = this.LJLJJI;
        o.LJI(c94041aab4);
        RecyclerView recyclerView2 = c94041aab4.LJLJJI;
        o.LJIIIIZZ(recyclerView2, "binding.paramList");
        C94057aar c94057aar = this.LJLJJL;
        if (c94057aar != null) {
            recyclerView2.setAdapter(c94057aar);
            PrefabEditViewModel prefabEditViewModel = (PrefabEditViewModel) this.LJLILLLLZI.getValue();
            prefabEditViewModel.getClass();
            CKEffectEditorContext.LIZLLL(new IDqS423S0100000_42(prefabEditViewModel, 118));
            C79863Bm c79863Bm = ((PrefabEditViewModel) this.LJLILLLLZI.getValue()).LJLILLLLZI;
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94766amI(c79863Bm, viewLifecycleOwner, Lifecycle.State.CREATED, null, this), 3);
            return;
        }
        o.LJIJI("adapter");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dvd, viewGroup, false);
        int i = R.id.avw;
        ImageView imageView = (ImageView) LLLLIILL.findViewById(R.id.avw);
        if (imageView != null) {
            i = R.id.ear;
            ImageView imageView2 = (ImageView) LLLLIILL.findViewById(R.id.ear);
            if (imageView2 != null) {
                i = R.id.nof;
                RecyclerView recyclerView = (RecyclerView) LLLLIILL.findViewById(R.id.nof);
                if (recyclerView != null) {
                    i = R.id.mo6;
                    if (LLLLIILL.findViewById(R.id.mo6) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) LLLLIILL;
                        this.LJLJJI = new C94041aab(constraintLayout, imageView, imageView2, recyclerView);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(i)));
    }
}
