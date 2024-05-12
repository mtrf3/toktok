package com.bytedance.effectcreatormobile.objectselect.prefab;

import X.ActivityC45651qj;
import X.C0CM;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C65352Pkq;
import X.C76800UCe;
import X.C79863Bm;
import X.C79883Bo;
import X.C90903hW;
import X.C93408aQO;
import X.C93410aQQ;
import X.C93509aS1;
import X.C93635aU3;
import X.C93643aUB;
import X.C94046aag;
import X.C94827anH;
import X.C94829anJ;
import X.C94831anL;
import X.C94835anP;
import X.EnumC93477aRV;
import X.InterfaceC65462ha;
import X.InterfaceC65784Pro;
import X.InterfaceC93411aQR;
import X.InterfaceC93645aUD;
import X.InterfaceC93646aUE;
import X.InterfaceC93951aZ9;
import X.V1M;
import X.XKX;
import Y.IDCListenerS139S0100000_42;
import Y.IDCListenerS302S0100000_42;
import Y.IDTListenerS124S0100000_42;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class PrefabPanelFragment extends AbstractPrefabFragment implements InterfaceC93951aZ9 {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final ViewModelLazy LJLILLLLZI;
    public C94046aag LJLJI;
    public final InterfaceC93411aQR LJLJJI;
    public final InterfaceC93645aUD LJLJJL;
    public PrefabData LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;

    static {
        new C93509aS1();
    }

    public final PrefabViewModel Al() {
        return (PrefabViewModel) this.LJLILLLLZI.getValue();
    }

    public PrefabPanelFragment() {
        IDqS423S0100000_42 iDqS423S0100000_42 = new IDqS423S0100000_42(this, 43);
        this.LJLILLLLZI = C93408aQO.LIZ(this, C65352Pkq.LIZ(PrefabViewModel.class), new IDqS423S0100000_42((InterfaceC65784Pro) iDqS423S0100000_42, 42), new IDqS423S0100000_42(this, 44));
        this.LJLJJI = C93410aQQ.LIZJ().providePageLoadingView();
        this.LJLJJL = C93643aUB.LIZ().provideStatusPage(EnumC93477aRV.Small);
        this.LJLJLJ = true;
    }

    @Override // X.InterfaceC93951aZ9
    public final boolean LJI() {
        return !Al().gv0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        PrefabData prefabData;
        super.onCreate(bundle);
        if (bundle != null) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJL = z;
        Bundle arguments = getArguments();
        if (arguments != null) {
            prefabData = (PrefabData) arguments.getParcelable("prefab_data");
        } else {
            prefabData = null;
        }
        this.LJLJJLL = prefabData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View Vc;
        View Vc2;
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC93411aQR interfaceC93411aQR = this.LJLJJI;
        LayoutInflater LLZIL = C16880lQ.LLZIL(getContext());
        C94046aag c94046aag = this.LJLJI;
        if (c94046aag != null) {
            FrameLayout frameLayout = c94046aag.LJLJJL;
            o.LJIIIIZZ(frameLayout, "binding.loadingContainer");
            interfaceC93411aQR.LIZ(LLZIL, frameLayout);
            InterfaceC93645aUD interfaceC93645aUD = this.LJLJJL;
            LayoutInflater LLZIL2 = C16880lQ.LLZIL(getContext());
            C94046aag c94046aag2 = this.LJLJI;
            if (c94046aag2 != null) {
                FrameLayout frameLayout2 = c94046aag2.LJLJJL;
                o.LJIIIIZZ(frameLayout2, "binding.loadingContainer");
                interfaceC93645aUD.LIZ(LLZIL2, frameLayout2);
                this.LJLJJL.LIZIZ(new IDqS419S0100000_42(this, 45));
                C94046aag c94046aag3 = this.LJLJI;
                if (c94046aag3 != null) {
                    C16880lQ.LJIILLIIL(c94046aag3.LJLILLLLZI, new IDCListenerS139S0100000_42(this, 8));
                    C94046aag c94046aag4 = this.LJLJI;
                    if (c94046aag4 != null) {
                        C16880lQ.LJIILLIIL(c94046aag4.LJLJI, new IDCListenerS139S0100000_42(this, 9));
                        Fragment fragment = this;
                        while (true) {
                            fragment = fragment.getParentFragment();
                            if (fragment instanceof InterfaceC93646aUE) {
                                InterfaceC93646aUE interfaceC93646aUE = (InterfaceC93646aUE) fragment;
                                if (interfaceC93646aUE != null && (Vc = interfaceC93646aUE.Vc()) != null) {
                                    Vc.setOnLongClickListener(new IDCListenerS302S0100000_42(this, 0));
                                }
                            } else if (fragment == 0) {
                                break;
                            }
                        }
                        Fragment fragment2 = this;
                        while (true) {
                            fragment2 = fragment2.getParentFragment();
                            if (fragment2 instanceof InterfaceC93646aUE) {
                                InterfaceC93646aUE interfaceC93646aUE2 = (InterfaceC93646aUE) fragment2;
                                if (interfaceC93646aUE2 != null && (Vc2 = interfaceC93646aUE2.Vc()) != null) {
                                    Vc2.setOnTouchListener(new IDTListenerS124S0100000_42(this, 0));
                                }
                            } else if (fragment2 == 0) {
                                break;
                            }
                        }
                        C79863Bm c79863Bm = Al().LJLILLLLZI;
                        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                        o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
                        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94827anH(c79863Bm, viewLifecycleOwner, Lifecycle.State.CREATED, null, this), 3);
                        PrefabViewModel Al = Al();
                        if (this.LJLJLJ && !this.LJLJL) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Al.getClass();
                        XKX.LIZLLL(ViewModelKt.getViewModelScope(Al), null, null, new C94835anP(Al, z, null), 3);
                        this.LJLJLJ = false;
                        InterfaceC65462ha LJ = V1M.LJ(Al().LJLJJLL, -1, 2);
                        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
                        o.LJIIIIZZ(viewLifecycleOwner2, "viewLifecycleOwner");
                        Lifecycle.State state = Lifecycle.State.STARTED;
                        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C94829anJ(LJ, viewLifecycleOwner2, state, null, this), 3);
                        C79883Bo c79883Bo = Al().LJLJLJ;
                        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
                        o.LJIIIIZZ(viewLifecycleOwner3, "viewLifecycleOwner");
                        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new C94831anL(c79883Bo, viewLifecycleOwner3, state, null, this), 3);
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
        o.LJIJI("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dvq, viewGroup, false);
        int i = R.id.avg;
        ImageView imageView = (ImageView) LLLLIILL.findViewById(R.id.avg);
        if (imageView != null) {
            i = R.id.avw;
            ImageView imageView2 = (ImageView) LLLLIILL.findViewById(R.id.avw);
            if (imageView2 != null) {
                i = R.id.cd9;
                View findViewById = LLLLIILL.findViewById(R.id.cd9);
                if (findViewById != null) {
                    i = R.id.g8a;
                    FrameLayout frameLayout = (FrameLayout) LLLLIILL.findViewById(R.id.g8a);
                    if (frameLayout != null) {
                        i = R.id.k13;
                        TextView textView = (TextView) LLLLIILL.findViewById(R.id.k13);
                        if (textView != null) {
                            i = R.id.kyt;
                            C93635aU3 c93635aU3 = (C93635aU3) LLLLIILL.findViewById(R.id.kyt);
                            if (c93635aU3 != null) {
                                i = R.id.nb6;
                                C0CM c0cm = (C0CM) LLLLIILL.findViewById(R.id.nb6);
                                if (c0cm != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) LLLLIILL;
                                    this.LJLJI = new C94046aag(constraintLayout, imageView, imageView2, findViewById, frameLayout, textView, c93635aU3, c0cm);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(i)));
    }
}
