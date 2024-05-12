package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment;

import X.AMD;
import X.AML;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C157166Eu;
import X.C16880lQ;
import X.C1B3;
import X.C25903AEp;
import X.C27380Aoq;
import X.C27450Apy;
import X.C27457Aq5;
import X.C27458Aq6;
import X.C27462AqA;
import X.C27466AqE;
import X.C27467AqF;
import X.C29S;
import X.C3C5;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C78948Uye;
import X.C90903hW;
import X.InterfaceC151715xP;
import X.InterfaceC27469AqH;
import X.InterfaceC61312at;
import X.InterfaceC65784Pro;
import X.InterfaceC71003Rtn;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.TBT;
import X.TBW;
import X.TMG;
import X.W1T;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.aweme.ecommerce.ab.EComLiveDegradeExperiment;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerWrapperState;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS64S0400000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RegionPickerWrapper extends ECAnimDowngradeFragment implements InterfaceC151715xP, AMD<C25903AEp>, InterfaceC27469AqH {
    public static final /* synthetic */ int LJLL = 0;
    public final lifecycleAwareLazy LJLILLLLZI;
    public InterfaceC65784Pro<C76800UCe> LJLJI;
    public InterfaceC65784Pro<C76800UCe> LJLJJI;
    public InterfaceC88472Yns<? super List<Region>, C76800UCe> LJLJJL;
    public InterfaceC88472Yns<? super List<Region>, C76800UCe> LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final C25903AEp LJLIL = new C25903AEp();

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public RegionPickerWrapper() {
        C65776Prg LIZ = C65352Pkq.LIZ(DistrictPickerWrapperViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 313);
        this.LJLILLLLZI = new lifecycleAwareLazy(this, aqS154S0100000_4, new AqS64S0400000_4(this, aqS154S0100000_4, LIZ, C27450Apy.INSTANCE, 10));
        this.LJLJI = C27466AqE.LJLIL;
        this.LJLJJI = C27467AqF.LJLIL;
        this.LJLJJL = C27458Aq6.LJLIL;
        this.LJLJJLL = C27457Aq5.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment
    public final boolean downgrade() {
        EComLiveDegradeExperiment.LIZ.getClass();
        return EComLiveDegradeExperiment.LIZIZ();
    }

    public final DistrictPickerWrapperViewModel vl() {
        return (DistrictPickerWrapperViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC27469AqH
    public final boolean onBackPressed() {
        if (getChildFragmentManager().LJJJLZIJ()) {
            return true;
        }
        if (getChildFragmentManager().LJJJJLI().size() > 1) {
            getChildFragmentManager().LJJLIIIJJI();
            return true;
        }
        vl().setState(C27462AqA.LJLIL);
        return false;
    }

    @Override // X.AMD
    public final /* bridge */ /* synthetic */ C25903AEp getViewModelFactory() {
        return this.LJLIL;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments != null) {
            str = arguments.getString("page_info");
        } else {
            str = null;
        }
        this.LJLJL = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("defaultRegion");
        }
        this.LJLJLJ = str2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LaneParams LJIILJJIL;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DistrictPickerWrapperViewModel vl = vl();
        String str = this.LJLJL;
        String str2 = this.LJLJLJ;
        if (str2 == null) {
            str2 = "unKnown";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC71003Rtn LJIILIIL = C78948Uye.LJIILIIL(view);
        if (LJIILIIL != null && (LJIILJJIL = C78948Uye.LJIILJJIL(LJIILIIL, "lib_track_builtin_lane_business")) != null) {
            Object obj = LJIILJJIL.get((Object) "biz_type");
            if (obj != null) {
                linkedHashMap.put("biz_type", obj);
            }
            Object obj2 = LJIILJJIL.get((Object) "product_id");
            if (obj2 != null) {
                linkedHashMap.put("product_id", obj2);
            }
        }
        vl.LJLJJLL = new C27380Aoq(str, str2, null, null, null, false, linkedHashMap);
        C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.Aq2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj3) {
                return Boolean.valueOf(((DistrictPickerWrapperState) obj3).getDone());
            }
        }, new AqS186S0100000_4(this, 289));
        C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.Apz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj3) {
                return Boolean.valueOf(((DistrictPickerWrapperState) obj3).getClose());
            }
        }, new AqS186S0100000_4(this, BuildConfig.VERSION_CODE));
        C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.Aq7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj3) {
                return Boolean.valueOf(((DistrictPickerWrapperState) obj3).getTitleBarBack());
            }
        }, new AqS186S0100000_4(this, 291));
        C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.Aq8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj3) {
                return ((DistrictPickerWrapperState) obj3).getSelectedRegions();
            }
        }, new AqS186S0100000_4(this, 292));
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(childFragmentManager);
        Bundle arguments = getArguments();
        RegionPicker regionPicker = new RegionPicker();
        regionPicker.setArguments(arguments);
        if (arguments != null) {
            arguments.putInt("parent_id", R.id.dm3);
        }
        c1b3.LJIIIIZZ(R.id.dm3, 1, regionPicker, null);
        c1b3.LJ(null);
        c1b3.LJI();
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.yz, viewGroup, false);
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
