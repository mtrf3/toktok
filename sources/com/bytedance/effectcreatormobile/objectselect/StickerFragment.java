package com.bytedance.effectcreatormobile.objectselect;

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
import X.C93410aQQ;
import X.C93643aUB;
import X.C93671aUd;
import X.C94038aaY;
import X.C94201adB;
import X.C94457ahJ;
import X.C94965apV;
import X.EnumC93477aRV;
import X.InterfaceC65784Pro;
import X.InterfaceC93411aQR;
import X.InterfaceC93645aUD;
import X.InterfaceC94013aa9;
import X.XKX;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.objectselect.viewmodel.StickerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class StickerFragment extends Fragment implements InterfaceC94013aa9<C93671aUd> {
    public static final /* synthetic */ int LJLJJLL = 0;
    public C94038aaY LJLIL;
    public final ViewModelLazy LJLILLLLZI = C93408aQO.LIZ(this, C65352Pkq.LIZ(StickerViewModel.class), new IDqS423S0100000_42((InterfaceC65784Pro) new IDqS423S0100000_42((Fragment) this, 33), 34), new IDqS423S0100000_42(this, 35));
    public final InterfaceC93645aUD LJLJI = C93643aUB.LIZ().provideStatusPage(EnumC93477aRV.Small);
    public final InterfaceC93411aQR LJLJJI = C93410aQQ.LIZJ().providePageLoadingView();
    public C94457ahJ LJLJJL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLIL = null;
    }

    @Override // X.InterfaceC94013aa9
    public final void U0(C93671aUd c93671aUd) {
        C93671aUd c93671aUd2 = c93671aUd;
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof AssetsFragment)) {
            parentFragment = null;
        }
        AssetsFragment assetsFragment = (AssetsFragment) parentFragment;
        if (assetsFragment != null) {
            assetsFragment.U0(c93671aUd2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC93411aQR interfaceC93411aQR = this.LJLJJI;
        LayoutInflater LLZIL = C16880lQ.LLZIL(getContext());
        C94038aaY c94038aaY = this.LJLIL;
        o.LJI(c94038aaY);
        FrameLayout frameLayout = c94038aaY.LJLILLLLZI;
        o.LJIIIIZZ(frameLayout, "binding.loadingContainer");
        interfaceC93411aQR.LIZ(LLZIL, frameLayout);
        InterfaceC93645aUD interfaceC93645aUD = this.LJLJI;
        LayoutInflater layoutInflater = getLayoutInflater();
        o.LJIIIIZZ(layoutInflater, "layoutInflater");
        C94038aaY c94038aaY2 = this.LJLIL;
        o.LJI(c94038aaY2);
        FrameLayout frameLayout2 = c94038aaY2.LJLILLLLZI;
        o.LJIIIIZZ(frameLayout2, "binding.loadingContainer");
        interfaceC93645aUD.LIZ(layoutInflater, frameLayout2);
        this.LJLJI.LIZIZ(new IDqS419S0100000_42(this, 124));
        C94038aaY c94038aaY3 = this.LJLIL;
        o.LJI(c94038aaY3);
        RecyclerView recyclerView = c94038aaY3.LJLJI;
        o.LJIIIIZZ(recyclerView, "binding.stickerList");
        getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(4));
        StickerViewModel stickerViewModel = (StickerViewModel) this.LJLILLLLZI.getValue();
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        this.LJLJJL = new C94457ahJ(this, stickerViewModel, requireActivity);
        C94038aaY c94038aaY4 = this.LJLIL;
        o.LJI(c94038aaY4);
        RecyclerView recyclerView2 = c94038aaY4.LJLJI;
        o.LJIIIIZZ(recyclerView2, "binding.stickerList");
        C94457ahJ c94457ahJ = this.LJLJJL;
        if (c94457ahJ != null) {
            recyclerView2.setAdapter(c94457ahJ);
            C94038aaY c94038aaY5 = this.LJLIL;
            o.LJI(c94038aaY5);
            c94038aaY5.LJLJI.setHasFixedSize(true);
            C94038aaY c94038aaY6 = this.LJLIL;
            o.LJI(c94038aaY6);
            c94038aaY6.LJLJI.LJII(new C94201adB(), -1);
            C79863Bm c79863Bm = ((StickerViewModel) this.LJLILLLLZI.getValue()).LJLILLLLZI;
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94965apV(c79863Bm, viewLifecycleOwner, Lifecycle.State.STARTED, null, this), 3);
            return;
        }
        o.LJIJI("adapter");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dus, viewGroup, false);
        int i = R.id.g8a;
        FrameLayout frameLayout = (FrameLayout) LLLLIILL.findViewById(R.id.g8a);
        if (frameLayout != null) {
            i = R.id.kie;
            RecyclerView recyclerView = (RecyclerView) LLLLIILL.findViewById(R.id.kie);
            if (recyclerView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) LLLLIILL;
                this.LJLIL = new C94038aaY(constraintLayout, frameLayout, recyclerView);
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
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(i)));
    }
}
