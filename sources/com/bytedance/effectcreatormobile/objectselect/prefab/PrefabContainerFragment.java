package com.bytedance.effectcreatormobile.objectselect.prefab;

import X.ActivityC45651qj;
import X.C019005q;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.C93709aVF;
import X.C93940aYy;
import X.C94045aaf;
import X.C94421agj;
import X.C94449ahB;
import X.C94763amF;
import X.C94764amG;
import X.EnumC93712aVI;
import X.InterfaceC93646aUE;
import X.InterfaceC93647aUF;
import X.InterfaceC93952aZA;
import X.InterfaceC93955aZD;
import X.InterfaceC93966aZO;
import X.KL2;
import X.XKX;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext;
import com.bytedance.effectcreatormobile.ckeapi.api.layer.ILayer;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class PrefabContainerFragment extends Fragment implements InterfaceC93952aZA, InterfaceC93966aZO, InterfaceC93646aUE, InterfaceC93647aUF {
    public C94045aaf LJLIL;

    @Override // X.InterfaceC93647aUF
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return this;
    }

    @Override // X.InterfaceC93966aZO
    public final boolean LJIIJ() {
        C94045aaf c94045aaf = this.LJLIL;
        if (c94045aaf != null) {
            if (c94045aaf.LJLJI.LIZLLL()) {
                C94045aaf c94045aaf2 = this.LJLIL;
                if (c94045aaf2 != null) {
                    c94045aaf2.LJLJI.goBack();
                    return true;
                }
                o.LJIJI("binding");
                throw null;
            }
            FragmentManager fragmentManager = getFragmentManager();
            if (fragmentManager != null) {
                C1B3 c1b3 = new C1B3(fragmentManager);
                c1b3.LJJI(this);
                c1b3.LJI();
            }
            return false;
        }
        o.LJIJI("binding");
        throw null;
    }

    @Override // X.InterfaceC93646aUE
    public final View Vc() {
        C94045aaf c94045aaf = this.LJLIL;
        if (c94045aaf != null) {
            View view = c94045aaf.LJLILLLLZI;
            o.LJIIIIZZ(view, "binding.blankView");
            return view;
        }
        o.LJIJI("binding");
        throw null;
    }

    @Override // X.InterfaceC93952aZA
    public final InterfaceC93955aZD r5() {
        C94045aaf c94045aaf = this.LJLIL;
        if (c94045aaf != null) {
            return c94045aaf.LJLJI;
        }
        o.LJIJI("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        IEditorContext LIZ;
        Integer layerContainerViewId;
        ILayer LIZ2;
        super.onDestroyView();
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C94763amF(null), 3);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("open_layer_when_dismiss") && (LIZ = C93940aYy.LIZ()) != null && (layerContainerViewId = LIZ.getLayerContainerViewId()) != null) {
            int intValue = layerContainerViewId.intValue();
            FragmentManager fragmentManager = getFragmentManager();
            if (fragmentManager != null && (LIZ2 = C93709aVF.LIZ()) != null) {
                LIZ2.open(fragmentManager, intValue);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC93712aVI enumC93712aVI;
        FragmentManager fragmentManager;
        LiveData<EnumC93712aVI> layerPageStatus;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ILayer LIZ = C93709aVF.LIZ();
        if (LIZ != null && (layerPageStatus = LIZ.getLayerPageStatus()) != null) {
            enumC93712aVI = layerPageStatus.getValue();
        } else {
            enumC93712aVI = null;
        }
        if (enumC93712aVI == EnumC93712aVI.SHOW && (fragmentManager = getFragmentManager()) != null) {
            ILayer LIZ2 = C93709aVF.LIZ();
            if (LIZ2 != null) {
                LIZ2.hideLayerPage(fragmentManager);
            }
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putBoolean("open_layer_when_dismiss", true);
            }
        }
        C94045aaf c94045aaf = this.LJLIL;
        if (c94045aaf != null) {
            c94045aaf.LJLJJI.setGuidelineBegin(KL2.LJIIL(requireContext()));
            C94045aaf c94045aaf2 = this.LJLIL;
            if (c94045aaf2 != null) {
                C94421agj c94421agj = c94045aaf2.LJLJI;
                FragmentManager childFragmentManager = getChildFragmentManager();
                o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
                c94421agj.setAdapter(new C94449ahB(childFragmentManager));
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    C94045aaf c94045aaf3 = this.LJLIL;
                    if (c94045aaf3 != null) {
                        c94045aaf3.LJLJI.LJII(arguments2);
                    } else {
                        o.LJIJI("binding");
                        throw null;
                    }
                }
                C94045aaf c94045aaf4 = this.LJLIL;
                if (c94045aaf4 != null) {
                    c94045aaf4.LJLJI.setDismissListener(new IDqS423S0100000_42(this, 39));
                    LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                    o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
                    XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94764amG(null), 3);
                    return;
                }
                o.LJIJI("binding");
                throw null;
            }
            o.LJIJI("binding");
            throw null;
        }
        o.LJIJI("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dvn, viewGroup, false);
        int i = R.id.am3;
        View findViewById = LLLLIILL.findViewById(R.id.am3);
        if (findViewById != null) {
            i = R.id.nlr;
            C94421agj c94421agj = (C94421agj) LLLLIILL.findViewById(R.id.nlr);
            if (c94421agj != null) {
                i = R.id.e1u;
                C019005q c019005q = (C019005q) LLLLIILL.findViewById(R.id.e1u);
                if (c019005q != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) LLLLIILL;
                    this.LJLIL = new C94045aaf(constraintLayout, findViewById, c94421agj, c019005q);
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
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(i)));
    }
}
