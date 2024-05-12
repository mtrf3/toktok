package com.ss.android.ugc.aweme.favorites.business.collection;

import X.AbstractC72932td;
import X.ActivityC45651qj;
import X.C184077Kh;
import X.C191887g0;
import X.C191897g1;
import X.C191917g3;
import X.C191927g4;
import X.C191937g5;
import X.C192487gy;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C235119Kp;
import X.C252709vu;
import X.C26227ARb;
import X.C26231ARf;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73318Sq2;
import X.C73969T1h;
import X.C76800UCe;
import X.C78840Uwu;
import X.C78926UyI;
import X.C78999UzT;
import X.C8VV;
import X.C8YZ;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.FMX;
import X.InterfaceC192387go;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC61213O0r;
import X.InterfaceC64592gB;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.JBR;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OSZ;
import X.QD3;
import X.T16;
import X.TBT;
import X.TBW;
import X.UC0;
import X.X1D;
import Y.AfS55S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.FavoriteVideoListFragmentData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS46S0110000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class AllFavoriteFragment extends BasePage implements KPL, InterfaceC192387go {
    public static final C191927g4 LJLJLLL = new Object() { // from class: X.7g4
    };
    public static final int LJLL = 8;
    public Long LJLJJI;
    public final C214298b3 LJLJJLL;
    public final C5H3 LJLJL;
    public Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C5H3 LJLJJL = C221108m2.LIZIZ(C191917g3.LJLIL);

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        this.LJLJLJ.clear();
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJLJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.KPL, X.C8YZ
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage
    public int getLayout() {
        return R.layout.auv;
    }

    @Override // X.KPL, X.C8YM
    public C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.JBS
    public /* bridge */ /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.JBS
    public /* bridge */ /* synthetic */ void onNewIntent(Intent intent) {
    }

    @Override // X.InterfaceC192387go, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public AllFavoriteFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoCollectionContentViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 235);
        C191897g1 c191897g1 = C191897g1.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c191897g1, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c191897g1, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJJLL = c214298b3;
        this.LJLJL = C221108m2.LIZIZ(new C191887g0(this));
    }

    private final void Jl() {
        C78999UzT.LJFF(new C192487gy().LIZJ.LJJIJIIJIL(2).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS55S0100000_3(this, 13), new InterfaceC64592gB() { // from class: X.7g2
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }), Kl());
    }

    private final boolean Ml() {
        return ((Boolean) this.LJLJL.getValue()).booleanValue();
    }

    public final C73318Sq2 Kl() {
        return (C73318Sq2) this.LJLJJL.getValue();
    }

    public final VideoCollectionContentViewModel Ll() {
        return (VideoCollectionContentViewModel) this.LJLJJLL.getValue();
    }

    public final void Il() {
        String valueOf;
        Resources resources;
        Resources resources2;
        if (!Ml()) {
            return;
        }
        CharSequence charSequence = null;
        if (this.LJLJJI != null) {
            StringBuilder LIZ = X1D.LIZ();
            Context context = getContext();
            if (context != null && (resources2 = context.getResources()) != null) {
                charSequence = resources2.getText(R.string.gc2);
            }
            LIZ.append((Object) charSequence);
            LIZ.append(" (");
            valueOf = JBR.LJ(LIZ, this.LJLJJI, ')', LIZ);
        } else {
            Context context2 = getContext();
            if (context2 != null && (resources = context2.getResources()) != null) {
                charSequence = resources.getText(R.string.gc2);
            }
            valueOf = String.valueOf(charSequence);
        }
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.la4);
        C9KF c9kf = new C9KF();
        c9kf.LIZ(valueOf);
        c252709vu.LJIILLIIL(c9kf);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Kl().LIZLLL();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    @Override // X.InterfaceC192387go
    public void Hd(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        FMX.LJIILL("remove_unavailable_from_collection", new OSZ("collection_video", "enter_from"));
        C26227ARb c26227ARb = new C26227ARb(mo49getActivity);
        c26227ARb.LJII = false;
        c26227ARb.LJFF(mo49getActivity.getResources().getString(R.string.gcb));
        c26227ARb.LIZ(R.string.gc_);
        UC0.LIZJ(c26227ARb, new AqS107S0300000_3(aweme, this, mo49getActivity, 5));
        new C26231ARf(c26227ARb).LIZLLL();
    }

    @QD3
    public final void handleOnOperationEvent(C191937g5 e) {
        o.LJIIIZ(e, "e");
        if (e.LJLIL.operation == 3) {
            VideoCollectionContentViewModel Ll = Ll();
            Ll.getClass();
            Ll.withState(new AqS46S0110000_3(Ll, true, 18));
            Jl();
        }
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        FavoriteVideoListFragmentData favoriteVideoListFragmentData;
        Bundle arguments;
        super.onCreate(bundle);
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (favoriteVideoListFragmentData = (FavoriteVideoListFragmentData) arguments2.getParcelable("power_viewpager_default_key")) != null && (arguments = getArguments()) != null) {
            arguments.putBoolean("is_show_navbar", favoriteVideoListFragmentData.isShowNavBar);
        }
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, R> R Ql(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C212418Vh.LJIIJJI(vm1, interfaceC88472Yns);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q> void Rl(VM1 vm1, InterfaceC88472Yns<? super S1, C76800UCe> interfaceC88472Yns) {
        C212418Vh.LJIIL(vm1, interfaceC88472Yns);
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Il();
        C8VV.LIZ(this, false, new AqS134S0200000_3(this, view, 52));
        Jl();
        if (!Ml()) {
            _$_findCachedViewById(R.id.la4).setVisibility(8);
            View _$_findCachedViewById = _$_findCachedViewById(R.id.bh3);
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.bh3).getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = 0;
            _$_findCachedViewById.setLayoutParams(layoutParams2);
        } else {
            C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.la4);
            C235119Kp c235119Kp = new C235119Kp();
            C78840Uwu.LJJIZ(c235119Kp, "", new AqS153S0100000_3(this, 233));
            c252709vu.setNavActions(c235119Kp);
            view.setFitsSystemWindows(true);
        }
        C73305Spp c73305Spp = (C73305Spp) view.findViewById(R.id.kf_);
        AssemViewModel.asyncSubscribe$default(Ll(), new TBT() { // from class: X.7fl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C192027gE) obj).LJLILLLLZI;
            }
        }, null, new AqS134S0200000_3(c73305Spp, this, 53), new AqS153S0100000_3(c73305Spp, 234), new AqS134S0200000_3(c73305Spp, view.getContext(), 54), 2, null);
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.InterfaceC192387go
    public void qi(View itemView, Aweme aweme) {
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(aweme, "aweme");
        Ql(Ll(), new AqS107S0300000_3(itemView, this, aweme, 4));
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, VM2 extends AssemViewModel<S2>, S2 extends C33Q, R> R Pl(VM1 vm1, VM2 vm2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> interfaceC88471Ynr) {
        return (R) C212418Vh.LJIIJ(vm1, vm2, interfaceC88471Ynr);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, VM2 extends AssemViewModel<S2>, S2 extends C33Q, VM3 extends AssemViewModel<S3>, S3 extends C33Q, R> R Ol(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> interfaceC88473Ynt) {
        return (R) C212418Vh.LJIIIZ(vm1, vm2, vm3, interfaceC88473Ynt);
    }

    @Override // X.C8YM
    public <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    public <S extends C33Q, T> InterfaceC222288nw Hl(AssemViewModel<S> assemViewModel, TBW<S, ? extends AbstractC72932td<? extends T>> tbw, C56412MCa<C213178Yf<AbstractC72932td<T>>> c56412MCa, InterfaceC88471Ynr<? super C3C8, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super C3C8, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C212418Vh.LIZ(this, assemViewModel, tbw, c56412MCa, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    public <S extends C33Q, A, B> InterfaceC222288nw Nl(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LJI(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
