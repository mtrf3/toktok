package com.ss.android.ugc.aweme.paidseries.broadcaster.before.fragment;

import X.A5D;
import X.A5I;
import X.A5K;
import X.A5W;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73969T1h;
import X.C76800UCe;
import X.C78496UrM;
import X.C78926UyI;
import X.C8IC;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
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
import X.SY4;
import X.T16;
import X.TBT;
import X.TBW;
import X.W5F;
import X.W5U;
import Y.ACListenerS24S0100000_4;
import Y.AfS56S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.PaidContentImageSettings;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.viewmodel.PaidSeriesAddedSeriesViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidSeriesAddedListFragment extends Fragment implements KPL {
    public static final /* synthetic */ int LJLZ = 0;
    public C252709vu LJLILLLLZI;
    public TuxTextView LJLJI;
    public ViewGroup LJLJJI;
    public ViewGroup LJLJJL;
    public C73305Spp LJLJJLL;
    public SmartImageView LJLJL;
    public TuxTextView LJLJLJ;
    public RecyclerView LJLJLLL;
    public SY4 LJLL;
    public C8IC LJLLI;
    public final C214298b3 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(A5W.LJLIL);
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 645));

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

    public PaidSeriesAddedListFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PaidSeriesAddedSeriesViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 646);
        A5K a5k = A5K.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), a5k, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), a5k, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLLJ = c214298b3;
        this.LJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 644));
        this.LJLLLL = C221108m2.LIZIZ(new A5I(this));
    }

    public final PaidSeriesAddedSeriesViewModel Al() {
        return (PaidSeriesAddedSeriesViewModel) this.LJLLJ.getValue();
    }

    public final long getRoomId() {
        return ((Number) this.LJLLL.getValue()).longValue();
    }

    public final A5D vl() {
        return (A5D) this.LJLLILLLL.getValue();
    }

    public final INetworkStandardUIService xl() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-networkStandardUiService>(...)");
        return (INetworkStandardUIService) value;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        wl();
    }

    public final void wl() {
        PaidSeriesAddedSeriesViewModel Al = Al();
        Al.disposeOnClear(Al.gv0().LIZLLL().getLivePaidSeriesList(getRoomId()).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS56S0100000_4(Al, 94), new AfS56S0100000_4(Al, 95)));
    }

    public final void Dl(int i) {
        C252709vu c252709vu;
        Context context = getContext();
        if (context != null && (c252709vu = this.LJLILLLLZI) != null) {
            C235119Kp c235119Kp = new C235119Kp();
            C9KF c9kf = new C9KF();
            String string = context.getString(R.string.qhx, Integer.valueOf(i));
            o.LJIIIIZZ(string, "context.getString(\n     …                        )");
            c9kf.LIZJ = string;
            c235119Kp.LIZJ = c9kf;
            c252709vu.setNavActions(c235119Kp);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context context;
        o.LJIIIZ(view, "view");
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c73305Spp != null && (context = c73305Spp.getContext()) != null) {
            Dl(0);
            TuxTextView tuxTextView = this.LJLJI;
            if (tuxTextView != null) {
                tuxTextView.setText(context.getString(R.string.qhe, "tiktok.com/series"));
            }
        }
        PaidContentImageSettings.LIZ.getClass();
        W5F LJIIIIZZ = W5U.LJIIIIZZ(PaidContentImageSettings.LIZ().sellingSeriesGuidanceImage.light);
        LJIIIIZZ.LJJIIJ = this.LJLJL;
        C16880lQ.LLJJJ(LJIIIIZZ);
        C73305Spp c73305Spp2 = this.LJLJJLL;
        if (c73305Spp2 != null) {
            c73305Spp2.LJFF();
        }
        SY4 sy4 = this.LJLL;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS24S0100000_4(this, 115));
        }
        C8YN.LJII(this, Al(), new TBT() { // from class: X.A5U
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((A5R) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 168), 4);
        C8YN.LJII(this, Al(), new TBT() { // from class: X.A5N
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((A5R) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 169), 4);
        C8YN.LJII(this, Al(), new TBT() { // from class: X.A5V
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((A5R) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 170), 4);
        AssemViewModel.asyncSubscribe$default(Al(), new TBT() { // from class: X.A5P
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((A5R) obj).LJLJJL;
            }
        }, null, new AqS170S0100000_4(this, 523), new AqS154S0100000_4(this, 647), new AqS170S0100000_4(this, 524), 2, null);
        AssemViewModel.asyncSubscribe$default(Al(), new TBT() { // from class: X.A5Q
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((A5R) obj).LJLJJI;
            }
        }, null, new AqS170S0100000_4(this, 525), new AqS154S0100000_4(this, 648), new AqS170S0100000_4(this, 526), 2, null);
        AssemViewModel.asyncSubscribe$default(Al(), new TBT() { // from class: X.A5S
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((A5R) obj).LJLJJLL;
            }
        }, null, new AqS170S0100000_4(this, 527), new AqS154S0100000_4(this, 649), new AqS170S0100000_4(this, 528), 2, null);
        AssemViewModel.asyncSubscribe$default(Al(), new TBT() { // from class: X.A5T
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((A5R) obj).LJLJL;
            }
        }, null, new AqS170S0100000_4(this, 529), new AqS154S0100000_4(this, 650), new AqS170S0100000_4(this, 530), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.ai7, viewGroup, false, "inflater.inflate(\n      …         false,\n        )");
        this.LJLILLLLZI = (C252709vu) LIZIZ.findViewById(R.id.hh4);
        this.LJLJI = (TuxTextView) LIZIZ.findViewById(R.id.hh6);
        this.LJLJJI = (ViewGroup) LIZIZ.findViewById(R.id.hh5);
        this.LJLJJL = (ViewGroup) LIZIZ.findViewById(R.id.hh2);
        this.LJLJJLL = (C73305Spp) LIZIZ.findViewById(R.id.hh8);
        this.LJLJL = (SmartImageView) LIZIZ.findViewById(R.id.hh3);
        this.LJLJLJ = (TuxTextView) LIZIZ.findViewById(R.id.hh1);
        this.LJLJLLL = (RecyclerView) LIZIZ.findViewById(R.id.hh_);
        this.LJLL = (SY4) LIZIZ.findViewById(R.id.hh0);
        this.LJLLI = (C8IC) LIZIZ.findViewById(R.id.hh9);
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
