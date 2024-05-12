package com.bytedance.effectcreatormobile.objectselect.gif;

import X.AbstractC030309z;
import X.ActivityC45651qj;
import X.C018905p;
import X.C03510Bv;
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
import X.C93417aQX;
import X.C93419aQZ;
import X.C93420aQa;
import X.C93643aUB;
import X.C93736aVg;
import X.C93817aWz;
import X.C94036aaW;
import X.C94052aam;
import X.C94053aan;
import X.C94097abV;
import X.C94201adB;
import X.C94734alm;
import X.C94736alo;
import X.C94738alq;
import X.C94740als;
import X.C94742alu;
import X.EnumC93477aRV;
import X.InterfaceC65784Pro;
import X.InterfaceC93411aQR;
import X.InterfaceC93645aUD;
import X.ViewOnFocusChangeListenerC93418aQY;
import X.XKX;
import Y.IDCListenerS139S0100000_42;
import Y.IDrS54S0100000_42;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
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
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.GifRepository;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class GifsFragment extends Fragment {
    public static final /* synthetic */ int LJLJL = 0;
    public C94036aaW LJLIL;
    public C94052aam LJLJJL;
    public final ViewModelLazy LJLILLLLZI = C93408aQO.LIZ(this, C65352Pkq.LIZ(GifsViewModel.class), new IDqS423S0100000_42((InterfaceC65784Pro) new IDqS423S0100000_42((Fragment) this, 36), 37), new IDqS423S0100000_42(this, 38));
    public final InterfaceC93645aUD LJLJI = C93643aUB.LIZ().provideStatusPage(EnumC93477aRV.Small);
    public final InterfaceC93411aQR LJLJJI = C93410aQQ.LIZJ().providePageLoadingView();
    public final IDrS54S0100000_42 LJLJJLL = new IDrS54S0100000_42(this, 0);

    public final GifsViewModel vl() {
        return (GifsViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C94036aaW c94036aaW = this.LJLIL;
        o.LJI(c94036aaW);
        c94036aaW.LJLJLJ.getEditText().setOnFocusChangeListener(null);
        C94036aaW c94036aaW2 = this.LJLIL;
        o.LJI(c94036aaW2);
        c94036aaW2.LJLJJI.LJJLL(this.LJLJJLL);
        C93736aVg.LIZ(requireContext());
        this.LJLIL = null;
    }

    public final boolean wl() {
        String str;
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments != null) {
            str = arguments.getString("key_gif_source");
        } else {
            str = null;
        }
        GifRepository LIZ = C93817aWz.LIZ();
        if (LIZ != null) {
            str2 = LIZ.getBackgroundGifSource();
        }
        return o.LJ(str, str2);
    }

    public final void xl(boolean z) {
        int i;
        C94036aaW c94036aaW = this.LJLIL;
        o.LJI(c94036aaW);
        TextView textView = c94036aaW.LJLILLLLZI;
        o.LJIIIIZZ(textView, "binding.btnCancel");
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (!(layoutParams instanceof C018905p)) {
            layoutParams = null;
        }
        C018905p c018905p = (C018905p) layoutParams;
        if (c018905p != null) {
            int i2 = 0;
            if (z) {
                i = 0;
            } else {
                i = -1;
            }
            c018905p.endToEnd = i;
            if (z) {
                i2 = -1;
            }
            c018905p.startToEnd = i2;
            C94036aaW c94036aaW2 = this.LJLIL;
            o.LJI(c94036aaW2);
            TextView textView2 = c94036aaW2.LJLILLLLZI;
            o.LJIIIIZZ(textView2, "binding.btnCancel");
            textView2.setLayoutParams(c018905p);
        }
        C94036aaW c94036aaW3 = this.LJLIL;
        o.LJI(c94036aaW3);
        C03510Bv.LIZ(c94036aaW3.LJLJL, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        GridLayoutManager gridLayoutManager;
        AbstractC030309z c94201adB;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC93411aQR interfaceC93411aQR = this.LJLJJI;
        LayoutInflater LLZIL = C16880lQ.LLZIL(getContext());
        C94036aaW c94036aaW = this.LJLIL;
        o.LJI(c94036aaW);
        FrameLayout frameLayout = c94036aaW.LJLJJLL;
        o.LJIIIIZZ(frameLayout, "binding.loadingContainer");
        interfaceC93411aQR.LIZ(LLZIL, frameLayout);
        InterfaceC93645aUD interfaceC93645aUD = this.LJLJI;
        LayoutInflater layoutInflater = getLayoutInflater();
        o.LJIIIIZZ(layoutInflater, "layoutInflater");
        C94036aaW c94036aaW2 = this.LJLIL;
        o.LJI(c94036aaW2);
        FrameLayout frameLayout2 = c94036aaW2.LJLJJLL;
        o.LJIIIIZZ(frameLayout2, "binding.loadingContainer");
        interfaceC93645aUD.LIZ(layoutInflater, frameLayout2);
        this.LJLJI.LIZIZ(new IDqS419S0100000_42(this, 0));
        C94036aaW c94036aaW3 = this.LJLIL;
        o.LJI(c94036aaW3);
        c94036aaW3.LJLJLJ.getEditText().setHint(getString(R.string.h18));
        C94036aaW c94036aaW4 = this.LJLIL;
        o.LJI(c94036aaW4);
        c94036aaW4.LJLJLJ.getEditText().setOnEditorActionListener(new C93417aQX(this));
        C94036aaW c94036aaW5 = this.LJLIL;
        o.LJI(c94036aaW5);
        c94036aaW5.LJLJLJ.getEditText().setOnFocusChangeListener(new ViewOnFocusChangeListenerC93418aQY(this));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94734alm(this, null), 3);
        C94036aaW c94036aaW6 = this.LJLIL;
        o.LJI(c94036aaW6);
        C16880lQ.LJIJI(c94036aaW6.LJLILLLLZI, new IDCListenerS139S0100000_42(this, 0));
        if (wl()) {
            i = 2;
        } else {
            i = 4;
        }
        C94036aaW c94036aaW7 = this.LJLIL;
        o.LJI(c94036aaW7);
        RecyclerView recyclerView = c94036aaW7.LJLJJI;
        o.LJIIIIZZ(recyclerView, "binding.gifListView");
        if (wl()) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(i, 1);
            staggeredGridLayoutManager.LLJJIII(0);
            gridLayoutManager = staggeredGridLayoutManager;
        } else {
            getContext();
            gridLayoutManager = new GridLayoutManager(i);
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        C94052aam c94052aam = new C94052aam(wl(), i);
        this.LJLJJL = c94052aam;
        c94052aam.LJLILLLLZI = new C93419aQZ(this);
        c94052aam.LJLJI = new C93420aQa(this);
        C94036aaW c94036aaW8 = this.LJLIL;
        o.LJI(c94036aaW8);
        c94036aaW8.LJLJJI.setHasFixedSize(true);
        C94036aaW c94036aaW9 = this.LJLIL;
        o.LJI(c94036aaW9);
        RecyclerView recyclerView2 = c94036aaW9.LJLJJI;
        o.LJIIIIZZ(recyclerView2, "binding.gifListView");
        recyclerView2.setItemAnimator(null);
        C94036aaW c94036aaW10 = this.LJLIL;
        o.LJI(c94036aaW10);
        RecyclerView recyclerView3 = c94036aaW10.LJLJJI;
        o.LJIIIIZZ(recyclerView3, "binding.gifListView");
        C94052aam c94052aam2 = this.LJLJJL;
        if (c94052aam2 != null) {
            recyclerView3.setAdapter(c94052aam2);
            C94036aaW c94036aaW11 = this.LJLIL;
            o.LJI(c94036aaW11);
            RecyclerView recyclerView4 = c94036aaW11.LJLJJI;
            if (wl()) {
                c94201adB = new C94053aan();
            } else {
                c94201adB = new C94201adB();
            }
            recyclerView4.LJII(c94201adB, -1);
            C94036aaW c94036aaW12 = this.LJLIL;
            o.LJI(c94036aaW12);
            c94036aaW12.LJLJJI.LJIIJJI(this.LJLJJLL);
            C79863Bm c79863Bm = vl().LJLJJI;
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner2, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C94736alo(c79863Bm, viewLifecycleOwner2, Lifecycle.State.CREATED, null, this), 3);
            C79863Bm c79863Bm2 = vl().LJLJJLL;
            LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner3, "viewLifecycleOwner");
            Lifecycle.State state = Lifecycle.State.STARTED;
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new C94738alq(c79863Bm2, viewLifecycleOwner3, state, null, this), 3);
            C79863Bm c79863Bm3 = vl().LJLJLJ;
            LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner4, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4), null, null, new C94740als(c79863Bm3, viewLifecycleOwner4, state, null, this), 3);
            C79883Bo c79883Bo = vl().LJLL;
            LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner5, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner5), null, null, new C94742alu(c79883Bo, viewLifecycleOwner5, state, null, this), 3);
            return;
        }
        o.LJIJI("adapter");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.duo, viewGroup, false);
        int i = R.id.av8;
        TextView textView = (TextView) LLLLIILL.findViewById(R.id.av8);
        if (textView != null) {
            i = R.id.cvq;
            TextView textView2 = (TextView) LLLLIILL.findViewById(R.id.cvq);
            if (textView2 != null) {
                i = R.id.nn5;
                RecyclerView recyclerView = (RecyclerView) LLLLIILL.findViewById(R.id.nn5);
                if (recyclerView != null) {
                    i = R.id.nn6;
                    TextView textView3 = (TextView) LLLLIILL.findViewById(R.id.nn6);
                    if (textView3 != null) {
                        i = R.id.g8a;
                        FrameLayout frameLayout = (FrameLayout) LLLLIILL.findViewById(R.id.g8a);
                        if (frameLayout != null) {
                            i = R.id.jet;
                            ConstraintLayout constraintLayout = (ConstraintLayout) LLLLIILL.findViewById(R.id.jet);
                            if (constraintLayout != null) {
                                i = R.id.jih;
                                C94097abV c94097abV = (C94097abV) LLLLIILL.findViewById(R.id.jih);
                                if (c94097abV != null) {
                                    FrameLayout frameLayout2 = (FrameLayout) LLLLIILL;
                                    this.LJLIL = new C94036aaW(frameLayout2, textView, textView2, recyclerView, textView3, frameLayout, constraintLayout, c94097abV);
                                    try {
                                        ViewTreeLifecycleOwner.set(frameLayout2, getViewLifecycleOwner());
                                        ViewTreeViewModelStoreOwner.set(frameLayout2, this);
                                        C10A.LIZIZ(frameLayout2, this);
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
                                    return frameLayout2;
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
