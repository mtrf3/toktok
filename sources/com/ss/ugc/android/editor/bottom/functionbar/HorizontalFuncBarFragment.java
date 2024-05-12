package com.ss.ugc.android.editor.bottom.functionbar;

import X.ActivityC45651qj;
import X.AnonymousClass523;
import X.C04270Et;
import X.C04330Ez;
import X.C10A;
import X.C1280550v;
import X.C1286353b;
import X.C1291054w;
import X.C1296757b;
import X.C134855Qz;
import X.C141335gf;
import X.C150135ur;
import X.C162476Zf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C53D;
import X.C53E;
import X.C53G;
import X.C53I;
import X.C53J;
import X.C53K;
import X.C56T;
import X.C5BA;
import X.C5G0;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.EnumC127484zQ;
import X.InterfaceC88475Ynv;
import Y.ACListenerS22S0100000_2;
import Y.AObserverS70S0100000_2;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.ugc.android.editor.base.viewmodel.FunctionBarViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.IDqS427S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class HorizontalFuncBarFragment extends Fragment {
    public boolean LJLIL;
    public RecyclerView LJLILLLLZI;
    public RecyclerView LJLJI;
    public C1296757b LJLJJI;
    public C1296757b LJLJJL;
    public C53G LJLJJLL;
    public View LJLJL;
    public C53I LJLJLJ;
    public boolean LJLJLLL;
    public ImageView LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public final MutableLiveData<Boolean> LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C53D LJLLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
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

    public HorizontalFuncBarFragment() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Boolean.FALSE);
        this.LJLLJ = mutableLiveData;
        this.LJLLL = C221108m2.LIZIZ(C53E.LJLIL);
        this.LJLLLL = new C53D(this);
    }

    public final FunctionBarViewModel wl() {
        return (FunctionBarViewModel) this.LJLLL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        boolean z2 = C1280550v.LIZ().LIZJ;
        boolean z3 = C5G0.LIZIZ;
        if (!z2 || !z3) {
            return;
        }
        if (wl().getCurrentItem() == null) {
            z = true;
        } else {
            z = false;
        }
        this.LJLIL = z;
        this.LJLJLJ = C1291054w.LIZ().LJLIL;
        EnumC127484zQ enumC127484zQ = EnumC127484zQ.ENABLE_MENU_HIERARCHY_OPTIMIZATION;
        Boolean bool = Boolean.FALSE;
        this.LJLLI = ((Boolean) C5BA.LIZ(enumC127484zQ, bool)).booleanValue();
        boolean booleanValue = ((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_TRANSITION_ANIM_ON_BOTTOM_MENU, bool)).booleanValue();
        if (this.LJLLI || booleanValue) {
            this.LJLLILLLL = true;
        }
        wl().getRootFuncListState().observe(this, new AObserverS70S0100000_2(this, 190));
        wl().getInsertItemState().observe(this, new AObserverS70S0100000_2(this, 191));
        wl().getRemoveItemState().observe(this, new AObserverS70S0100000_2(this, 192));
        wl().getUpdateItemState().observe(this, new AObserverS70S0100000_2(this, 193));
        wl().getReplaceItemState().observe(this, new AObserverS70S0100000_2(this, 194));
        wl().getExpendChildListState().observe(this, new AObserverS70S0100000_2(this, 195));
        wl().getUpdateListState().observe(this, new AObserverS70S0100000_2(this, 196));
        wl().getBackToRootStateChanged().observe(this, new AObserverS70S0100000_2(this, 197));
    }

    public final void xl(List<AnonymousClass523> list) {
        List<AnonymousClass523> LIZLLL = C1286353b.LIZ.LIZLLL(list);
        C1296757b c1296757b = this.LJLJJI;
        if (c1296757b != null) {
            c1296757b.LJLIL.clear();
            c1296757b.LJLIL.addAll(LIZLLL);
            c1296757b.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int i;
        int i2;
        C53J c53j;
        int i3;
        int i4;
        RecyclerView recyclerView;
        int i5;
        Drawable drawable;
        ImageView imageView;
        RecyclerView recyclerView2;
        ViewGroup.LayoutParams layoutParams;
        int i6;
        int i7;
        int i8;
        View _$_findCachedViewById;
        o.LJIIIZ(view, "view");
        C53I c53i = this.LJLJLJ;
        if (c53i != null && (i8 = c53i.LIZ) != 0 && (_$_findCachedViewById = _$_findCachedViewById(R.id.dpx)) != null) {
            _$_findCachedViewById.setBackground(C04270Et.LIZIZ(requireContext(), i8));
        }
        if (this.LJLJLJ != null) {
            view.getLayoutParams().height = C134855Qz.LIZ(r0.LJIIJJI);
        }
        this.LJLILLLLZI = (RecyclerView) view.findViewById(R.id.ioo);
        this.LJLJI = (RecyclerView) view.findViewById(R.id.knm);
        RecyclerView recyclerView3 = this.LJLILLLLZI;
        if (recyclerView3 != null) {
            recyclerView3.setOverScrollMode(2);
        }
        View findViewById = view.findViewById(R.id.eyt);
        C53I c53i2 = this.LJLJLJ;
        if (c53i2 != null) {
            ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            int i9 = c53i2.LJ;
            if (i9 != 0) {
                layoutParams2.width = C134855Qz.LIZ(i9);
            }
            int i10 = c53i2.LJFF;
            if (i10 != 0) {
                layoutParams2.height = C134855Qz.LIZ(i10);
            }
            if (c53i2.LJIIJ != 0) {
                findViewById.setBackground(C04270Et.LIZIZ(requireContext(), c53i2.LJIIJ));
            }
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                int i11 = c53i2.LJI;
                if (i11 > 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart(C134855Qz.LIZ(i11));
                }
                int i12 = c53i2.LJII;
                if (i12 > 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(C134855Qz.LIZ(i12));
                }
                int i13 = c53i2.LJIIIIZZ;
                if (i13 > 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C134855Qz.LIZ(i13);
                }
                int i14 = c53i2.LJIIIZ;
                if (i14 > 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = C134855Qz.LIZ(i14);
                }
                findViewById.setLayoutParams(layoutParams2);
            }
        }
        this.LJLJL = findViewById;
        C53I c53i3 = this.LJLJLJ;
        if (c53i3 != null) {
            z = c53i3.LJJII;
        } else {
            z = false;
        }
        this.LJLJLLL = z;
        if (findViewById != null) {
            if (this.LJLIL || z) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            findViewById.setVisibility(i7);
            C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 91), findViewById);
        }
        ViewGroup.LayoutParams layoutParams3 = null;
        if (!this.LJLIL) {
            RecyclerView recyclerView4 = this.LJLILLLLZI;
            if (recyclerView4 != null) {
                layoutParams = recyclerView4.getLayoutParams();
            } else {
                layoutParams = null;
            }
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams;
            C53I c53i4 = this.LJLJLJ;
            if (c53i4 != null) {
                int i15 = C53K.LIZ[c53i4.LJIJJLI.ordinal()];
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 == 3) {
                            i6 = 5;
                        } else {
                            throw new C162476Zf();
                        }
                    } else {
                        i6 = 17;
                    }
                } else {
                    i6 = 3;
                }
                layoutParams4.gravity = i6;
            }
        }
        C53I c53i5 = this.LJLJLJ;
        if (c53i5 != null) {
            i = c53i5.LJIJJ;
        } else {
            i = 0;
        }
        if (i != 0 && (recyclerView2 = this.LJLILLLLZI) != null) {
            recyclerView2.LJII(new C150135ur(i), -1);
        }
        C53I c53i6 = this.LJLJLJ;
        if (c53i6 != null) {
            i2 = c53i6.LIZIZ;
        } else {
            i2 = 0;
        }
        ImageView imageView2 = (ImageView) view.findViewById(R.id.ezg);
        this.LJLL = imageView2;
        if (i2 != 0 && imageView2 != null) {
            imageView2.setImageDrawable(C04270Et.LIZIZ(imageView2.getContext(), i2));
        }
        C53I c53i7 = this.LJLJLJ;
        if (c53i7 != null && (drawable = c53i7.LIZJ) != null && (imageView = this.LJLL) != null) {
            imageView.setImageDrawable(drawable);
        }
        C53I c53i8 = this.LJLJLJ;
        if (c53i8 != null && (i5 = c53i8.LIZLLL) != 0) {
            int LIZIZ = C04330Ez.LIZIZ(requireContext(), i5);
            View view2 = this.LJLJL;
            if (view2 != null) {
                view2.setBackgroundColor(LIZIZ);
            }
        }
        RecyclerView recyclerView5 = this.LJLILLLLZI;
        if (recyclerView5 != null) {
            getContext();
            recyclerView5.setLayoutManager(new LinearLayoutManager(0, false));
        }
        if (this.LJLJJI == null) {
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            C1296757b c1296757b = new C1296757b(requireActivity);
            c1296757b.LJLJJL = new IDqS427S0100000_2(this, 4);
            c1296757b.LJLJI = this.LJLLLL;
            this.LJLJJI = c1296757b;
        }
        RecyclerView recyclerView6 = this.LJLILLLLZI;
        if (recyclerView6 != null) {
            recyclerView6.setAdapter(this.LJLJJI);
        }
        new C56T(this.LJLILLLLZI, new AqS184S0100000_2(this, 57));
        if (((Boolean) C5BA.LIZ(EnumC127484zQ.DEFAULT_EDIT_MODE, Boolean.FALSE)).booleanValue() && (_$_findCachedViewById(R.id.gbv).getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.LayoutParams layoutParams5 = _$_findCachedViewById(R.id.gbv).getLayoutParams();
            o.LJII(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams5).setMarginStart(C134855Qz.LIZ(4.0f));
            ViewGroup.LayoutParams layoutParams6 = _$_findCachedViewById(R.id.gbv).getLayoutParams();
            o.LJII(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams6).setMarginEnd(C134855Qz.LIZ(4.0f));
        }
        if (this.LJLLILLLL) {
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.kn5);
            if (_$_findCachedViewById2 != null) {
                _$_findCachedViewById2.setVisibility(0);
            }
            RecyclerView recyclerView7 = this.LJLJI;
            if (recyclerView7 != null) {
                recyclerView7.setOverScrollMode(2);
            }
            RecyclerView recyclerView8 = this.LJLJI;
            if (recyclerView8 != null) {
                getContext();
                recyclerView8.setLayoutManager(new LinearLayoutManager(0, false));
            }
            ActivityC45651qj requireActivity2 = requireActivity();
            o.LJIIIIZZ(requireActivity2, "requireActivity()");
            C1296757b c1296757b2 = new C1296757b(requireActivity2);
            c1296757b2.LJLJJL = new IDqS427S0100000_2(this, 5);
            c1296757b2.LJLJI = this.LJLLLL;
            this.LJLJJL = c1296757b2;
            RecyclerView recyclerView9 = this.LJLJI;
            if (recyclerView9 != null) {
                recyclerView9.setAdapter(c1296757b2);
            }
            new C56T(this.LJLJI, new AqS184S0100000_2(this, 58));
            C53I c53i9 = this.LJLJLJ;
            if (c53i9 != null && (i4 = c53i9.LJIJJ) != 0 && (recyclerView = this.LJLJI) != null) {
                recyclerView.LJII(new C150135ur(i4), -1);
            }
            _$_findCachedViewById(R.id.gbv).setTranslationY(0.0f);
            _$_findCachedViewById(R.id.kn5).setTranslationY(C134855Qz.LIZ(82.0f));
            C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.kn3), new ACListenerS22S0100000_2(this, 92));
            RecyclerView recyclerView10 = this.LJLJI;
            if (recyclerView10 != null) {
                layoutParams3 = recyclerView10.getLayoutParams();
            }
            o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) layoutParams3;
            C53I c53i10 = this.LJLJLJ;
            if (c53i10 != null) {
                int i16 = C53K.LIZ[c53i10.LJIJJLI.ordinal()];
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            i3 = 5;
                        } else {
                            throw new C162476Zf();
                        }
                    } else {
                        i3 = 17;
                    }
                } else {
                    i3 = 3;
                }
                layoutParams7.gravity = i3;
            }
            C53I c53i11 = this.LJLJLJ;
            if (c53i11 != null && (c53j = c53i11.LJJIIJ) != null) {
                Drawable drawable2 = c53j.LIZ;
                if (drawable2 != null) {
                    ((ImageView) _$_findCachedViewById(R.id.kn4)).setImageDrawable(drawable2);
                }
                if (c53j.LIZIZ != 0) {
                    _$_findCachedViewById(R.id.kn3).setBackground(C04270Et.LIZIZ(requireContext(), c53j.LIZIZ));
                }
                ViewGroup.LayoutParams layoutParams8 = _$_findCachedViewById(R.id.kn3).getLayoutParams();
                int i17 = c53j.LIZJ;
                if (i17 != 0) {
                    layoutParams8.width = C134855Qz.LIZ(i17);
                }
                int i18 = c53j.LIZLLL;
                if (i18 != 0) {
                    layoutParams8.height = C134855Qz.LIZ(i18);
                }
                if (layoutParams8 instanceof ViewGroup.MarginLayoutParams) {
                    int i19 = c53j.LJ;
                    if (i19 > 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams8).setMarginStart(C134855Qz.LIZ(i19));
                    }
                    int i20 = c53j.LJFF;
                    if (i20 > 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams8).setMarginEnd(C134855Qz.LIZ(i20));
                    }
                    int i21 = c53j.LJI;
                    if (i21 > 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = C134855Qz.LIZ(i21);
                    }
                    int i22 = c53j.LJII;
                    if (i22 > 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin = C134855Qz.LIZ(i22);
                    }
                    _$_findCachedViewById(R.id.kn3).setLayoutParams(layoutParams8);
                    return;
                }
                return;
            }
            return;
        }
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.kn5);
        if (_$_findCachedViewById3 == null) {
            return;
        }
        _$_findCachedViewById3.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.arr, viewGroup, false);
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

    public final void vl(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<AnonymousClass523> list, int i, Boolean bool) {
        boolean z;
        C53I c53i;
        InterfaceC88475Ynv<? super RecyclerView, ? super RecyclerView.ViewHolder, ? super ArrayList<AnonymousClass523>, ? super Integer, ? super Boolean, C76800UCe> interfaceC88475Ynv;
        if (o.LJ(bool, Boolean.TRUE)) {
            z = false;
        } else {
            z = this.LJLIL;
        }
        if (recyclerView != null && (c53i = this.LJLJLJ) != null && (interfaceC88475Ynv = c53i.LJIL) != null) {
            o.LJII(list, "null cannot be cast to non-null type java.util.ArrayList<com.ss.ugc.android.editor.base.functions.FunctionItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.ss.ugc.android.editor.base.functions.FunctionItem> }");
            interfaceC88475Ynv.invoke(recyclerView, viewHolder, list, Integer.valueOf(i), Boolean.valueOf(z));
        }
    }
}
