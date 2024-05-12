package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment;

import X.AbstractC029409q;
import X.AbstractC030109x;
import X.AbstractC27419ApT;
import X.AbstractC28931Bp;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C27405ApF;
import X.C27407ApH;
import X.C27415ApP;
import X.C27416ApQ;
import X.C29S;
import X.C3C5;
import X.C47261Igj;
import X.C62822Ol8;
import X.C71312Rym;
import X.C76800UCe;
import X.C78565UsT;
import X.C90903hW;
import X.ORZ;
import X.OUP;
import Y.ARunnableS8S0101000_4;
import Y.IDTListenerS114S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DistrictPage extends Fragment {
    public final boolean LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final Handler LJLJI;
    public final C27416ApQ LJLJJI;
    public final String LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final Map<Integer, View> LJLJLJ;

    public DistrictPage() {
        this(false);
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    public final DistrictVm xl() {
        return (DistrictVm) this.LJLILLLLZI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((RecyclerView) _$_findCachedViewById(R.id.isf)).setAdapter(null);
        ((RecyclerView) _$_findCachedViewById(R.id.lu)).setAdapter(null);
        FragmentManager fragmentManager = getFragmentManager();
        o.LJI(fragmentManager);
        List<Fragment> LJJJJLI = fragmentManager.LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "fragmentManager!!.fragments");
        int LJJI = C47261Igj.LJJI(LJJJJLI);
        if (!LJJJJLI.contains(this)) {
            this.LJLJI.post(new ARunnableS8S0101000_4(LJJI, this, 2));
        } else if (o.LJ(this, ORZ.LLFF(LJJJJLI))) {
            xl().iv0(LJJI, "return");
        }
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    public final int wl() {
        return requireFragmentManager().LJJJJLI().indexOf(this);
    }

    public DistrictPage(boolean z) {
        this.LJLJLJ = new LinkedHashMap();
        this.LJLIL = z;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 309));
        this.LJLJI = new Handler(C16880lQ.LLJJJJ());
        C27416ApQ c27416ApQ = new C27416ApQ();
        c27416ApQ.setHasStableIds(true);
        this.LJLJJI = c27416ApQ;
        this.LJLJJL = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0275, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Dl(X.InterfaceC67352kd<? super X.C76800UCe> r25) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage.Dl(X.2kd):java.lang.Object");
    }

    public final void vl(int i) {
        AbstractC029409q adapter = ((RecyclerView) _$_findCachedViewById(R.id.isf)).getAdapter();
        o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictAdapter");
        AbstractC27419ApT abstractC27419ApT = (AbstractC27419ApT) adapter;
        if (i < abstractC27419ApT.getItemCount()) {
            abstractC27419ApT.LJZ(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        AbstractC030109x itemAnimator = ((RecyclerView) _$_findCachedViewById(R.id.lu)).getItemAnimator();
        o.LJII(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((AbstractC28931Bp) itemAnimator).LJI = false;
        ((RecyclerView) _$_findCachedViewById(R.id.lu)).setAdapter(this.LJLJJI);
        ((RecyclerView) _$_findCachedViewById(R.id.lu)).setNestedScrollingEnabled(false);
        ((RecyclerView) _$_findCachedViewById(R.id.lu)).setHasFixedSize(true);
        C27415ApP c27415ApP = new C27415ApP(new AqS170S0100000_4(this, 334));
        ((RecyclerView) _$_findCachedViewById(R.id.isf)).setAdapter(c27415ApP);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isf);
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        recyclerView.LJII(new C71312Rym(0.0f, AnonymousClass636.LJIIIIZZ(R.attr.dz, requireContext), 2, 0), -1);
        _$_findCachedViewById(R.id.isf).setOnTouchListener(new IDTListenerS114S0100000_4(this, 4));
        ((RecyclerView) _$_findCachedViewById(R.id.isf)).LJIIJJI(new C27407ApH(this, c27415ApP));
        C78565UsT.LJJIJIIJIL(this, new C27405ApF(this, null));
        C27416ApQ c27416ApQ = this.LJLJJI;
        AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(this, c27415ApP, 57);
        c27416ApQ.getClass();
        c27416ApQ.LJLJL = aqS135S0200000_4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Al(com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District r16, boolean r17, X.InterfaceC67352kd<? super java.lang.Boolean> r18) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage.Al(com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District, boolean, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Gl(com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictData r11, int r12, X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage.Gl(com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictData, int, X.2kd):java.lang.Object");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        if (viewGroup != null) {
            view = OUP.LJIL(R.layout.yu, viewGroup, false);
        } else {
            view = null;
        }
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                C10A.LIZIZ(view, this);
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
        return view;
    }
}
