package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment;

import X.AMD;
import X.AML;
import X.AbstractC029409q;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C141335gf;
import X.C157166Eu;
import X.C16880lQ;
import X.C212608Wa;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C25903AEp;
import X.C26518Aaw;
import X.C27380Aoq;
import X.C27403ApD;
import X.C29S;
import X.C3C5;
import X.C47261Igj;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71312Rym;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C79045V0n;
import X.C90903hW;
import X.InterfaceC151715xP;
import X.InterfaceC61312at;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC74236TBo;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.KL2;
import X.TBT;
import X.TBW;
import X.TMG;
import X.W1T;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerState;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS2S0112000_4;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.AqS64S0400000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RegionPicker extends Fragment implements InterfaceC151715xP, AMD<C25903AEp> {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final C62822Ol8 LJLILLLLZI;
    public final lifecycleAwareLazy LJLJI;
    public final C62822Ol8 LJLJJI;
    public boolean LJLJJL;
    public final AqS154S0100000_4 LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C25903AEp LJLIL = new C25903AEp();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    public RegionPicker() {
        C65776Prg LIZ = C65352Pkq.LIZ(DistrictPickerWrapperViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 83));
        C65776Prg LIZ2 = C65352Pkq.LIZ(DistrictPickerViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ2, 312);
        this.LJLJI = new lifecycleAwareLazy(this, aqS154S0100000_4, new AqS64S0400000_4(this, aqS154S0100000_4, LIZ2, C26518Aaw.INSTANCE, 9));
        this.LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 311));
        this.LJLJJLL = new AqS154S0100000_4(this, 310);
    }

    public final DistrictPickerViewModel wl() {
        return (DistrictPickerViewModel) this.LJLJI.getValue();
    }

    public final DistrictPickerWrapperViewModel xl() {
        return (DistrictPickerWrapperViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        int i;
        List<Fragment> LJJJJLI;
        List<Fragment> LJJJJLI2;
        super.onDestroy();
        FragmentManager fragmentManager = getFragmentManager();
        int i2 = 0;
        if (fragmentManager != null && (LJJJJLI2 = fragmentManager.LJJJJLI()) != null) {
            i = LJJJJLI2.size();
        } else {
            i = 0;
        }
        FragmentManager fragmentManager2 = getFragmentManager();
        if (fragmentManager2 != null && (LJJJJLI = fragmentManager2.LJJJJLI()) != null) {
            for (Fragment fragment : LJJJJLI) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    if (o.LJ(fragment, this) && i2 == i - 1) {
                        Al("return");
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.LJJLL(new C27403ApD(this.LJLJJLL));
        }
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C27380Aoq c27380Aoq = xl().LJLJJLL;
        if (c27380Aoq != null) {
            c27380Aoq.LIZLLL = SystemClock.elapsedRealtime();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        FragmentManager fragmentManager;
        int i;
        List<Fragment> LJJJJLI;
        List<Fragment> LJJJJLI2;
        super.onStop();
        if (ActivityStack.isAppBackGround() && (fragmentManager = getFragmentManager()) != null) {
            List<Fragment> LJJJJLI3 = fragmentManager.LJJJJLI();
            int i2 = 0;
            if (LJJJJLI3 == null || LJJJJLI3.isEmpty()) {
                return;
            }
            FragmentManager fragmentManager2 = getFragmentManager();
            if (fragmentManager2 != null && (LJJJJLI2 = fragmentManager2.LJJJJLI()) != null) {
                i = LJJJJLI2.size();
            } else {
                i = 0;
            }
            FragmentManager fragmentManager3 = getFragmentManager();
            if (fragmentManager3 == null || (LJJJJLI = fragmentManager3.LJJJJLI()) == null) {
                return;
            }
            for (Fragment fragment : LJJJJLI) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    if (o.LJ(fragment, this) && i2 == i - 1) {
                        Al("close");
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    @Override // X.AMD
    public final /* bridge */ /* synthetic */ C25903AEp getViewModelFactory() {
        return this.LJLIL;
    }

    public final void Al(String str) {
        C73157SnR.LJIIJJI(wl(), new AqS58S1100000_4(this, str, 17));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            DistrictPickerViewModel wl = wl();
            int i = arguments.getInt("parent_id");
            C212608Wa c212608Wa = wl.LJLJLLL;
            InterfaceC74236TBo<Object>[] interfaceC74236TBoArr = DistrictPickerViewModel.LJLLILLLL;
            c212608Wa.LIZIZ(interfaceC74236TBoArr[1], wl, Integer.valueOf(i));
            wl().LJLJJLL = arguments.getStringArray("geoname_ids");
            wl().LJLJL = (OrderSKUDTO) arguments.getParcelable("order_sku");
            DistrictPickerViewModel wl2 = wl();
            wl2.LJLJLJ.LIZIZ(interfaceC74236TBoArr[0], wl2, Integer.valueOf(arguments.getInt("number_of_remaining_level", Integer.MAX_VALUE)));
            this.LJLJJL = arguments.getBoolean("show_back_icon");
        }
        DistrictPickerViewModel wl3 = wl();
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (arrayList = arguments2.getParcelableArrayList("current_selected_region_list")) == null) {
            arrayList = new ArrayList();
        }
        wl3.getClass();
        wl3.LJLL = new ArrayList<>(arrayList);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer LJI;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View doneButton = _$_findCachedViewById(R.id.cey);
        o.LJIIIIZZ(doneButton, "doneButton");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 95, 42), doneButton);
        ((RecyclerView) _$_findCachedViewById(R.id.isf)).setAdapter((AbstractC029409q) this.LJLJJI.getValue());
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isf);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        Context context = getContext();
        int i = 0;
        if (context != null) {
            ((RecyclerView) _$_findCachedViewById(R.id.isf)).LJII(new C71312Rym(KL2.LIZJ(context, 16.0f), AnonymousClass636.LJIIIIZZ(R.attr.dz, context), 2, 0), -1);
        }
        C235119Kp c235119Kp = new C235119Kp();
        if (!this.LJLJJL) {
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
            LIZJ.LIZIZ(new AqS154S0100000_4(this, 1185));
            c235119Kp.LIZLLL(LIZJ);
        }
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_x_mark;
        LIZJ2.LIZIZ(new AqS154S0100000_4(this, 1186));
        c235119Kp.LIZIZ(LIZJ2);
        c235119Kp.LIZLLL = true;
        Context context2 = getContext();
        if (context2 != null && (LJI = C79045V0n.LJI(R.attr.cr, context2)) != null) {
            i = LJI.intValue();
        }
        c235119Kp.LIZJ(i);
        ((C252709vu) _$_findCachedViewById(R.id.l9j)).setNavActions(c235119Kp);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.LJ(new C27403ApD(this.LJLJJLL));
        }
        C73156SnQ.LJIIIIZZ(this, wl(), new TBT() { // from class: X.AaW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((DistrictPickerState) obj).getSelectedDistrict();
            }
        }, new AqS186S0100000_4(this, 294));
        C73156SnQ.LJIIIIZZ(this, wl(), new TBT() { // from class: X.ApB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((DistrictPickerState) obj).getDistrictList();
            }
        }, new AqS186S0100000_4(this, 286));
        C73156SnQ.LJIIIIZZ(this, wl(), new TBT() { // from class: X.ApA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((DistrictPickerState) obj).getStatus());
            }
        }, new AqS186S0100000_4(this, 288));
        DistrictPickerViewModel wl = wl();
        getContext();
        wl.Iv0();
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return (Animation) C73157SnR.LJIIJJI(xl(), new AqS2S0112000_4(this, i, z, i2, 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a6_, viewGroup, false);
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
