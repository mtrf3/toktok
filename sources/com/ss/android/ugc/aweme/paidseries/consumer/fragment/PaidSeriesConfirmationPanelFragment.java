package com.ss.android.ugc.aweme.paidseries.consumer.fragment;

import X.A54;
import X.A56;
import X.A59;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C25663A5j;
import X.C25664A5k;
import X.C25668A5o;
import X.C25669A5p;
import X.C29822Bn8;
import X.C29S;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C76800UCe;
import X.C78496UrM;
import X.C78926UyI;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBT;
import X.TBW;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.paidseries.consumer.viewmodel.PaidSeriesConfirmationPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class PaidSeriesConfirmationPanelFragment extends Fragment implements KPL {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public RecyclerView LJLIL;
    public C73305Spp LJLILLLLZI;
    public TuxTextView LJLJI;
    public A54 LJLJJI;
    public final C214298b3 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 653));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 651));

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public PaidSeriesConfirmationPanelFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(PaidSeriesConfirmationPanelViewModel.class);
        this.LJLJL = new C214298b3(LIZ, new AqS154S0100000_4(LIZ, 654), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C25668A5o.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LJLJLJ = C221108m2.LIZIZ(C25663A5j.LJLIL);
        this.LJLJLLL = C221108m2.LIZIZ(C25664A5k.LJLIL);
        this.LJLL = C221108m2.LIZIZ(C25669A5p.LJLIL);
    }

    public final PaidSeriesConfirmationPanelViewModel vl() {
        return (PaidSeriesConfirmationPanelViewModel) this.LJLJL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            String LIZ = C29822Bn8.LIZ(context, R.string.qi0, "context.resources.getStr…descbold_purchasedseries)");
            String string = context.getResources().getString(R.string.qhz, LIZ);
            o.LJIIIIZZ(string, "context.resources.getStr…dSeriesStr,\n            )");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            spannableStringBuilder.setSpan(new StyleSpan(1), s.LJJLIIIJL(string, LIZ, 0, false, 6), LIZ.length() + s.LJJLIIIJL(string, LIZ, 0, false, 6), 18);
            TuxTextView tuxTextView = this.LJLJI;
            if (tuxTextView != null) {
                tuxTextView.setText(spannableStringBuilder);
            }
        }
        A56 a56 = new A56(R.attr.eb, R.string.qhc, R.string.qhj, A59.NOBUTTON, vl(), false);
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        this.LJLJJI = new A54(a56, this, requireContext);
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView != null) {
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
        }
        RecyclerView recyclerView2 = this.LJLIL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LJLJJI);
        }
        vl().gv0(((Number) this.LJLJJLL.getValue()).longValue(), ((Number) this.LJLJJL.getValue()).longValue());
        C73305Spp c73305Spp = this.LJLILLLLZI;
        if (c73305Spp != null) {
            c73305Spp.LJFF();
        }
        AssemViewModel.asyncSubscribe$default(vl(), new TBT() { // from class: X.A5n
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25666A5m) obj).LJLIL;
            }
        }, null, new AqS170S0100000_4(this, 539), new AqS154S0100000_4(this, 652), new AqS170S0100000_4(this, 540), 2, null);
        C8YN.LJII(this, vl(), new TBT() { // from class: X.A5l
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25666A5m) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 171), 4);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.aib, viewGroup, false, "inflater.inflate(\n      …         false,\n        )");
        this.LJLIL = (RecyclerView) LIZIZ.findViewById(R.id.ig9);
        this.LJLILLLLZI = (C73305Spp) LIZIZ.findViewById(R.id.hh8);
        this.LJLJI = (TuxTextView) LIZIZ.findViewById(R.id.bra);
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
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
        return LIZIZ;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
