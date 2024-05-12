package com.ss.android.ugc.gamora.editor.sticker.nature;

import X.AML;
import X.AbstractC029409q;
import X.AbstractC030309z;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.C0A6;
import X.C10A;
import X.C110614Vt;
import X.C141335gf;
import X.C145995oB;
import X.C1557569j;
import X.C1557669k;
import X.C1557969n;
import X.C1558169p;
import X.C1558369r;
import X.C1558469s;
import X.C1558669u;
import X.C156426By;
import X.C157166Eu;
import X.C163896bx;
import X.C163936c1;
import X.C164116cJ;
import X.C16880lQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C40141hq;
import X.C47918IrK;
import X.C62822Ol8;
import X.C73140SnA;
import X.C73157SnR;
import X.C73165SnZ;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C76800UCe;
import X.C78496UrM;
import X.C90903hW;
import X.C9KF;
import X.FMX;
import X.InterfaceC151715xP;
import X.InterfaceC153045zY;
import X.InterfaceC163906by;
import X.InterfaceC164126cK;
import X.InterfaceC61312at;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.SY4;
import X.TBW;
import X.TMG;
import X.W1T;
import X.XKQ;
import X.XKX;
import Y.ACListenerS22S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS38S0100000_2;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.gamora.editor.sticker.nature.EditSelectNatureSpeciesDialogFragment;
import com.ss.android.ugc.gamora.editor.sticker.nature.model.NatureSpeciesModel;
import com.ss.android.ugc.gamora.editor.sticker.nature.viewmodel.NatureViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditSelectNatureSpeciesDialogFragment extends DialogFragment implements InterfaceC151715xP, InterfaceC163906by {
    public static NatureViewModel LJLLLLLL;
    public boolean LJLIL;
    public View LJLILLLLZI;
    public RecyclerView LJLJI;
    public SY4 LJLJJI;
    public C252709vu LJLJJL;
    public TuxTextView LJLJJLL;
    public C73305Spp LJLJL;
    public ConstraintLayout LJLJLJ;
    public ConstraintLayout LJLJLLL;
    public RecyclerView LJLL;
    public C1557969n LJLLJ;
    public C1557669k LJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 493));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(C163896bx.LJLIL);

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        Dialog dialog;
        Window window;
        if (!this.LJLIL && (dialog = getDialog()) != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(0);
        }
        super.onStop();
    }

    public final ConstraintLayout vl() {
        ConstraintLayout constraintLayout = this.LJLJLJ;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        o.LJIJI("noResultPage");
        throw null;
    }

    public final void wl() {
        ConstraintLayout constraintLayout = this.LJLJLLL;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
            vl().setVisibility(8);
            C73305Spp c73305Spp = this.LJLJL;
            if (c73305Spp != null) {
                c73305Spp.setVisibility(0);
                C73305Spp c73305Spp2 = this.LJLJL;
                if (c73305Spp2 != null) {
                    c73305Spp2.LJFF();
                    Context context = getContext();
                    if (context != null) {
                        if (C47918IrK.LIZ(context)) {
                            NatureViewModel natureViewModel = LJLLLLLL;
                            if (natureViewModel != null) {
                                XKQ xkq = natureViewModel.LJLLI;
                                if (xkq != null) {
                                    xkq.LIZIZ(null);
                                }
                                natureViewModel.LJLLI = XKX.LIZLLL(ViewModelKt.getViewModelScope(natureViewModel), null, null, new C163936c1(natureViewModel, null), 3);
                                return;
                            }
                            o.LJIJI("natureViewModel");
                            throw null;
                        }
                        ConstraintLayout constraintLayout2 = this.LJLJLLL;
                        if (constraintLayout2 != null) {
                            constraintLayout2.setVisibility(8);
                            vl().setVisibility(8);
                            C73305Spp c73305Spp3 = this.LJLJL;
                            if (c73305Spp3 != null) {
                                c73305Spp3.setVisibility(0);
                                C73305Spp c73305Spp4 = this.LJLJL;
                                if (c73305Spp4 != null) {
                                    C73306Spq c73306Spq = new C73306Spq();
                                    C73312Spw.LJI(c73306Spq, new AqS152S0100000_2(this, 492));
                                    c73305Spp4.setStatus(c73306Spq);
                                    return;
                                }
                                o.LJIJI("loadingIcon");
                                throw null;
                            }
                            o.LJIJI("loadingIcon");
                            throw null;
                        }
                        o.LJIJI("resultPage");
                        throw null;
                    }
                    return;
                }
                o.LJIJI("loadingIcon");
                throw null;
            }
            o.LJIJI("loadingIcon");
            throw null;
        }
        o.LJIJI("resultPage");
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        View view = getView();
        if (view != null) {
            view.postDelayed(new ARunnableS38S0100000_2(this, 109), 50L);
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.hk);
        AObserverS70S0100000_2 aObserverS70S0100000_2 = new AObserverS70S0100000_2(this, 314);
        NatureViewModel natureViewModel = LJLLLLLL;
        if (natureViewModel != null) {
            natureViewModel.LJLL.observe(this, aObserverS70S0100000_2);
            AObserverS70S0100000_2 aObserverS70S0100000_22 = new AObserverS70S0100000_2(this, 312);
            NatureViewModel natureViewModel2 = LJLLLLLL;
            if (natureViewModel2 != null) {
                natureViewModel2.LJLJJI.observe(this, aObserverS70S0100000_22);
                AObserverS70S0100000_2 aObserverS70S0100000_23 = new AObserverS70S0100000_2(this, 313);
                NatureViewModel natureViewModel3 = LJLLLLLL;
                if (natureViewModel3 != null) {
                    natureViewModel3.LJLILLLLZI.observe(this, aObserverS70S0100000_23);
                    AObserverS70S0100000_2 aObserverS70S0100000_24 = new AObserverS70S0100000_2(this, 315);
                    NatureViewModel natureViewModel4 = LJLLLLLL;
                    if (natureViewModel4 != null) {
                        natureViewModel4.LJLJJLL.observe(this, aObserverS70S0100000_24);
                        AObserverS70S0100000_2 aObserverS70S0100000_25 = new AObserverS70S0100000_2(this, 316);
                        NatureViewModel natureViewModel5 = LJLLLLLL;
                        if (natureViewModel5 != null) {
                            natureViewModel5.LJLJLJ.observe(this, aObserverS70S0100000_25);
                            return;
                        } else {
                            o.LJIJI("natureViewModel");
                            throw null;
                        }
                    }
                    o.LJIJI("natureViewModel");
                    throw null;
                }
                o.LJIJI("natureViewModel");
                throw null;
            }
            o.LJIJI("natureViewModel");
            throw null;
        }
        o.LJIJI("natureViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        o.LJIIIIZZ(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        C1557969n c1557969n = this.LJLLJ;
        if (c1557969n != null) {
            C1557569j c1557569j = c1557969n.LIZ;
            c1557569j.getEditPreviewApi().Ml(true);
            InterfaceC153045zY value = c1557569j.getEditPreviewApi().Kh().getValue();
            if (value != null) {
                value.pause();
            }
        }
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
            window.setGravity(80);
        }
        onCreateDialog.setCanceledOnTouchOutside(true);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        this.LJLIL = true;
        C1557969n c1557969n = this.LJLLJ;
        if (c1557969n != null) {
            C1557569j c1557569j = c1557969n.LIZ;
            c1557569j.getEditPreviewApi().Ml(false);
            InterfaceC153045zY value = c1557569j.getEditPreviewApi().Kh().getValue();
            if (value != null) {
                value.play();
            }
        }
        vl().setVisibility(8);
        ConstraintLayout constraintLayout = this.LJLJLLL;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
            super.onDismiss(dialog);
        } else {
            o.LJIJI("resultPage");
            throw null;
        }
    }

    @Override // X.InterfaceC163906by
    public final void h1(NatureSpeciesModel selectedNatureSpeciesModel, int i) {
        boolean z;
        C1558369r c1558369r;
        o.LJIIIZ(selectedNatureSpeciesModel, "selectedNatureSpeciesModel");
        String str = selectedNatureSpeciesModel.speciesName;
        Integer valueOf = Integer.valueOf(i + 1);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZLLL("name", str);
        c145995oB.LIZJ(valueOf, "order");
        FMX.LJIIL("add_nature_sticker", c145995oB.LIZ);
        C1557969n c1557969n = this.LJLLJ;
        if (c1557969n != null) {
            InterfaceC164126cK interfaceC164126cK = (InterfaceC164126cK) c1557969n.LIZ.LJLJI.getValue();
            if (interfaceC164126cK != null) {
                C164116cJ.LIZ(interfaceC164126cK, false, 0L, 6);
            }
            c1557969n.LIZ.LLJJI();
            if (c1557969n.LIZ.LLJJ().LJLL != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C1558169p LLJJ = c1557969n.LIZ.LLJJ();
                LLJJ.getClass();
                LLJJ.LLI = selectedNatureSpeciesModel;
                C156426By c156426By = LLJJ.LJLL;
                if ((c156426By instanceof C1558369r) && (c1558369r = (C1558369r) c156426By) != null) {
                    C1558469s c1558469s = c1558369r.LLIIIZ;
                    String natureSpecies = selectedNatureSpeciesModel.speciesName;
                    c1558469s.getClass();
                    o.LJIIIZ(natureSpecies, "natureSpecies");
                    c1558469s.LJLJJI.setText(natureSpecies);
                }
            } else {
                C1557569j c1557569j = c1557969n.LIZ;
                c1557569j.LLJJ().LJJIJIIJI(c1557569j.getEditPreviewApi().Kh().getValue(), c1557569j.getEditPreviewApi());
                c1557569j.LLJJ().LJJIL(selectedNatureSpeciesModel, new C1558669u(0), true, false);
            }
            TuxSheet tuxSheet = c1557969n.LIZ.LJLZ;
            if (tuxSheet != null) {
                tuxSheet.dismiss();
            } else {
                o.LJIJI("tuxSheet");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (getContext() != null) {
            final C40141hq c40141hq = new C40141hq();
            RecyclerView recyclerView = this.LJLJI;
            if (recyclerView != null) {
                c40141hq.LIZIZ(recyclerView);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                linearLayoutManager.LLJJIII(0);
                RecyclerView recyclerView2 = this.LJLL;
                if (recyclerView2 != null) {
                    recyclerView2.setLayoutManager(linearLayoutManager);
                    LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager() { // from class: com.ss.android.ugc.gamora.editor.sticker.nature.EditSelectNatureSpeciesDialogFragment$initSpeciesList$CentralLayoutManager
                    };
                    linearLayoutManager2.LLJJIII(0);
                    RecyclerView recyclerView3 = this.LJLJI;
                    if (recyclerView3 != null) {
                        recyclerView3.setLayoutManager(linearLayoutManager2);
                        RecyclerView recyclerView4 = this.LJLJI;
                        if (recyclerView4 != null) {
                            recyclerView4.LJII(new AbstractC030309z() { // from class: X.4gL
                                @Override // X.AbstractC030309z
                                public final void LJ(Rect rect, View view2, RecyclerView recyclerView5, C0AC c0ac) {
                                    T28.LJ(rect, "outRect", view2, "view", recyclerView5, "parent", c0ac, "state");
                                    rect.left = 16;
                                    rect.right = 16;
                                }
                            }, -1);
                            RecyclerView recyclerView5 = this.LJLJI;
                            if (recyclerView5 != null) {
                                recyclerView5.LJIIJJI(new C0A6() { // from class: X.6bw
                                    public View LJLIL;

                                    @Override // X.C0A6
                                    public final void LJIILL(RecyclerView recyclerView6, int i, int i2) {
                                        o.LJIIIZ(recyclerView6, "recyclerView");
                                    }

                                    @Override // X.C0A6
                                    public final void LJIILJJIL(int i, RecyclerView recyclerView6) {
                                        View findViewById;
                                        View findViewById2;
                                        o.LJIIIZ(recyclerView6, "recyclerView");
                                        RecyclerView recyclerView7 = EditSelectNatureSpeciesDialogFragment.this.LJLJI;
                                        if (recyclerView7 != null) {
                                            if (recyclerView7.getChildCount() != 0) {
                                                if (i == 1) {
                                                    if (this.LJLIL == null) {
                                                        RecyclerView recyclerView8 = EditSelectNatureSpeciesDialogFragment.this.LJLJI;
                                                        if (recyclerView8 != null) {
                                                            View childAt = recyclerView8.getChildAt(0);
                                                            this.LJLIL = childAt;
                                                            if (childAt == null || (findViewById2 = childAt.findViewById(R.id.k9n)) == null) {
                                                                return;
                                                            }
                                                            findViewById2.setAlpha(0.8f);
                                                            return;
                                                        }
                                                        o.LJIJI("speciesRecyclerView");
                                                        throw null;
                                                    }
                                                    return;
                                                }
                                                if (i != 0) {
                                                    return;
                                                }
                                                AbstractC28951Br abstractC28951Br = c40141hq;
                                                RecyclerView recyclerView9 = EditSelectNatureSpeciesDialogFragment.this.LJLJI;
                                                if (recyclerView9 != null) {
                                                    View LJFF = abstractC28951Br.LJFF(recyclerView9.getLayoutManager());
                                                    View view2 = this.LJLIL;
                                                    if (view2 != null && (findViewById = view2.findViewById(R.id.k9n)) != null) {
                                                        findViewById.setAlpha(0.8f);
                                                    }
                                                    View view3 = this.LJLIL;
                                                    if (view3 != null) {
                                                        C163916bz.LIZ(view3, false);
                                                    }
                                                    View view4 = this.LJLIL;
                                                    if (view4 != null) {
                                                        view4.setBackground(null);
                                                    }
                                                    View view5 = this.LJLIL;
                                                    if (view5 != null) {
                                                        EditSelectNatureSpeciesDialogFragment editSelectNatureSpeciesDialogFragment = EditSelectNatureSpeciesDialogFragment.this;
                                                        if (editSelectNatureSpeciesDialogFragment.LJLJI != null) {
                                                            int LJJJJJ = RecyclerView.LJJJJJ(view5);
                                                            RecyclerView recyclerView10 = editSelectNatureSpeciesDialogFragment.LJLL;
                                                            if (recyclerView10 != null) {
                                                                View findViewById3 = recyclerView10.getChildAt(LJJJJJ).findViewById(R.id.cf6);
                                                                C110614Vt c110614Vt = new C110614Vt();
                                                                c110614Vt.LIZIZ = Integer.valueOf(R.attr.gp);
                                                                c110614Vt.LIZJ = C61328O5c.LIZJ(3);
                                                                Context context = findViewById3.getContext();
                                                                o.LJIIIIZZ(context, "dotItem.context");
                                                                findViewById3.setBackground(c110614Vt.LIZ(context));
                                                            } else {
                                                                o.LJIJI("dotRecyclerView");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("speciesRecyclerView");
                                                            throw null;
                                                        }
                                                    }
                                                    if (LJFF != null) {
                                                        View findViewById4 = LJFF.findViewById(R.id.k9n);
                                                        if (findViewById4 != null) {
                                                            findViewById4.setAlpha(1.0f);
                                                        }
                                                        if (LJFF != null) {
                                                            EditSelectNatureSpeciesDialogFragment editSelectNatureSpeciesDialogFragment2 = EditSelectNatureSpeciesDialogFragment.this;
                                                            if (editSelectNatureSpeciesDialogFragment2.LJLJI != null) {
                                                                int LJJJJIZL = RecyclerView.LJJJJIZL(LJFF);
                                                                RecyclerView recyclerView11 = editSelectNatureSpeciesDialogFragment2.LJLL;
                                                                if (recyclerView11 != null) {
                                                                    View findViewById5 = recyclerView11.getChildAt(LJJJJIZL).findViewById(R.id.cf6);
                                                                    C110614Vt c110614Vt2 = new C110614Vt();
                                                                    c110614Vt2.LIZIZ = Integer.valueOf(R.attr.go);
                                                                    c110614Vt2.LIZJ = C61328O5c.LIZJ(3);
                                                                    Context context2 = findViewById5.getContext();
                                                                    o.LJIIIIZZ(context2, "dotItem.context");
                                                                    findViewById5.setBackground(c110614Vt2.LIZ(context2));
                                                                    C163916bz.LIZ(LJFF, true);
                                                                } else {
                                                                    o.LJIJI("dotRecyclerView");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("speciesRecyclerView");
                                                                throw null;
                                                            }
                                                        }
                                                    }
                                                    this.LJLIL = LJFF;
                                                    return;
                                                }
                                                o.LJIJI("speciesRecyclerView");
                                                throw null;
                                            }
                                            return;
                                        }
                                        o.LJIJI("speciesRecyclerView");
                                        throw null;
                                    }
                                });
                                RecyclerView recyclerView6 = this.LJLJI;
                                if (recyclerView6 != null) {
                                    recyclerView6.setAdapter((AbstractC029409q) this.LJLLI.getValue());
                                    RecyclerView recyclerView7 = this.LJLL;
                                    if (recyclerView7 != null) {
                                        recyclerView7.setAdapter((AbstractC029409q) this.LJLLILLLL.getValue());
                                        C252709vu c252709vu = this.LJLJJL;
                                        if (c252709vu != null) {
                                            C235119Kp c235119Kp = new C235119Kp();
                                            C9KF c9kf = new C9KF();
                                            String string = getString(R.string.ikp);
                                            o.LJIIIIZZ(string, "getString(R.string.natur…r_species_results_header)");
                                            c9kf.LIZJ = string;
                                            c235119Kp.LIZJ = c9kf;
                                            c252709vu.setNavActions(c235119Kp);
                                            C1557669k c1557669k = this.LJLLL;
                                            if (c1557669k != null) {
                                                C252709vu c252709vu2 = this.LJLJJL;
                                                if (c252709vu2 != null) {
                                                    C235119Kp c235119Kp2 = new C235119Kp();
                                                    C234529Ii LIZJ = s1.LIZJ();
                                                    LIZJ.LIZJ = R.raw.icon_x_mark_small;
                                                    LIZJ.LIZ = c1557669k;
                                                    c235119Kp2.LIZIZ(LIZJ);
                                                    c252709vu2.setNavActions(c235119Kp2);
                                                } else {
                                                    o.LJIJI("tuxNavBar");
                                                    throw null;
                                                }
                                            }
                                            SY4 sy4 = this.LJLJJI;
                                            if (sy4 != null) {
                                                C16880lQ.LJJIZ(sy4, new ACListenerS22S0100000_2(this, 160));
                                                TuxTextView tuxTextView = this.LJLJJLL;
                                                if (tuxTextView != null) {
                                                    C16880lQ.LJJJJI(tuxTextView, new ACListenerS22S0100000_2(this, 161));
                                                    wl();
                                                    return;
                                                } else {
                                                    o.LJIJI("retryBtn");
                                                    throw null;
                                                }
                                            }
                                            o.LJIJI("selectBtn");
                                            throw null;
                                        }
                                        o.LJIJI("tuxNavBar");
                                        throw null;
                                    }
                                    o.LJIJI("dotRecyclerView");
                                    throw null;
                                }
                                o.LJIJI("speciesRecyclerView");
                                throw null;
                            }
                            o.LJIJI("speciesRecyclerView");
                            throw null;
                        }
                        o.LJIJI("speciesRecyclerView");
                        throw null;
                    }
                    o.LJIJI("speciesRecyclerView");
                    throw null;
                }
                o.LJIJI("dotRecyclerView");
                throw null;
            }
            o.LJIJI("speciesRecyclerView");
            throw null;
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.arp, viewGroup, false, "inflater.inflate(R.layou…pecies, container, false)");
        this.LJLILLLLZI = LIZIZ;
        View findViewById = LIZIZ.findViewById(R.id.k9r);
        o.LJIIIIZZ(findViewById, "thisView.findViewById(R.id.species_recycler_view)");
        this.LJLJI = (RecyclerView) findViewById;
        View view = this.LJLILLLLZI;
        C29S c29s = null;
        if (view != null) {
            View findViewById2 = view.findViewById(R.id.gwb);
            o.LJIIIIZZ(findViewById2, "thisView.findViewById(R.id.nature_select_species)");
            this.LJLJJI = (SY4) findViewById2;
            View view2 = this.LJLILLLLZI;
            if (view2 != null) {
                View findViewById3 = view2.findViewById(R.id.g8l);
                o.LJIIIIZZ(findViewById3, "thisView.findViewById(R.id.loading_icon)");
                C73305Spp c73305Spp = (C73305Spp) findViewById3;
                this.LJLJL = c73305Spp;
                c73305Spp.LJFF();
                View view3 = this.LJLILLLLZI;
                if (view3 != null) {
                    View findViewById4 = view3.findViewById(R.id.luy);
                    o.LJIIIIZZ(findViewById4, "thisView.findViewById(R.id.tux_nav_bar)");
                    this.LJLJJL = (C252709vu) findViewById4;
                    View view4 = this.LJLILLLLZI;
                    if (view4 != null) {
                        View findViewById5 = view4.findViewById(R.id.h2e);
                        o.LJIIIIZZ(findViewById5, "thisView.findViewById(R.id.no_result_page)");
                        this.LJLJLJ = (ConstraintLayout) findViewById5;
                        View view5 = this.LJLILLLLZI;
                        if (view5 != null) {
                            View findViewById6 = view5.findViewById(R.id.cf9);
                            o.LJIIIIZZ(findViewById6, "thisView.findViewById(R.id.dot_recycler_view)");
                            this.LJLL = (RecyclerView) findViewById6;
                            View view6 = this.LJLILLLLZI;
                            if (view6 != null) {
                                View findViewById7 = view6.findViewById(R.id.izi);
                                o.LJIIIIZZ(findViewById7, "thisView.findViewById(R.id.result_page)");
                                this.LJLJLLL = (ConstraintLayout) findViewById7;
                                View view7 = this.LJLILLLLZI;
                                if (view7 != null) {
                                    View findViewById8 = view7.findViewById(R.id.izn);
                                    o.LJIIIIZZ(findViewById8, "thisView.findViewById(R.id.retry_Btn)");
                                    TuxTextView tuxTextView = (TuxTextView) findViewById8;
                                    this.LJLJJLL = tuxTextView;
                                    C110614Vt c110614Vt = new C110614Vt();
                                    c110614Vt.LIZIZ = Integer.valueOf(R.attr.cl);
                                    c110614Vt.LIZLLL = 1;
                                    c110614Vt.LJ = Integer.valueOf(R.attr.dz);
                                    TuxTextView tuxTextView2 = this.LJLJJLL;
                                    if (tuxTextView2 != null) {
                                        Context context = tuxTextView2.getContext();
                                        o.LJIIIIZZ(context, "retryBtn.context");
                                        tuxTextView.setBackground(c110614Vt.LIZ(context));
                                        View view8 = this.LJLILLLLZI;
                                        if (view8 != null) {
                                            try {
                                                ViewTreeLifecycleOwner.set(view8, getViewLifecycleOwner());
                                                ViewTreeViewModelStoreOwner.set(view8, this);
                                                C10A.LIZIZ(view8, this);
                                                ActivityC45651qj mo49getActivity = mo49getActivity();
                                                if (mo49getActivity instanceof C29S) {
                                                    c29s = (C29S) mo49getActivity;
                                                }
                                                C90903hW.LIZ(c29s);
                                                C3C5.m7constructorimpl(C76800UCe.LIZ);
                                            } catch (Throwable th) {
                                                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                            }
                                            return view8;
                                        }
                                        o.LJIJI("thisView");
                                        throw null;
                                    }
                                    o.LJIJI("retryBtn");
                                    throw null;
                                }
                                o.LJIJI("thisView");
                                throw null;
                            }
                            o.LJIJI("thisView");
                            throw null;
                        }
                        o.LJIJI("thisView");
                        throw null;
                    }
                    o.LJIJI("thisView");
                    throw null;
                }
                o.LJIJI("thisView");
                throw null;
            }
            o.LJIJI("thisView");
            throw null;
        }
        o.LJIJI("thisView");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
