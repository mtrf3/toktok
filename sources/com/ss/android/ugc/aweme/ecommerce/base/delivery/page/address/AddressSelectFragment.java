package com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address;

import X.AMD;
import X.AML;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C141335gf;
import X.C157166Eu;
import X.C16880lQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26059AKp;
import X.C26589Ac5;
import X.C26706Ady;
import X.C26732AeO;
import X.C26747Aed;
import X.C26878Agk;
import X.C27090AkA;
import X.C29S;
import X.C3C5;
import X.C45804HyK;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71312Rym;
import X.C73139Sn9;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C78840Uwu;
import X.C79045V0n;
import X.C90903hW;
import X.InterfaceC151715xP;
import X.InterfaceC60061Nhh;
import X.InterfaceC61312at;
import X.InterfaceC65784Pro;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.InterfaceC92693kP;
import X.KL2;
import X.SC5;
import X.TBT;
import X.TBW;
import X.TMF;
import X.TMG;
import X.W1T;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.ss.android.ugc.aweme.ecommerce.ab.EComLiveDegradeExperiment;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.dynamicstyle.address.IAddressSelectFragmentStyle;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.event.ZipcodeLocateAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS64S0400000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class AddressSelectFragment extends ECAnimDowngradeFragment implements InterfaceC151715xP, AMD<ViewModelProvider.Factory>, c, InterfaceC60061Nhh {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final C5H3 adapter$delegate;
    public final C5H3 deliveryPanelViewModel$delegate;
    public final C5H3 dynamicStyle$delegate;
    public final InterfaceC65784Pro<C76800UCe> onBackStackChangeListener;
    public final lifecycleAwareLazy viewModel$delegate;
    public final C5H3 viewModelFactory$delegate;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
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

    @Override // X.InterfaceC73141SnB
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment, X.InterfaceC37828Esy
    public String getPageName() {
        return "logistics_address";
    }

    @Override // X.InterfaceC73149SnJ
    /* renamed from: getReceiver, reason: avoid collision after fix types in other method */
    public AML getReceiver2() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    public final String getSubPageName() {
        return "choose_your_location";
    }

    @Override // X.InterfaceC73150SnK
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com_ss_android_ugc_aweme_ecommerce_base_delivery_page_address_AddressSelectFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    public AddressSelectFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(DeliveryPanelViewModel.class);
        this.deliveryPanelViewModel$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 16));
        C65776Prg LIZ2 = C65352Pkq.LIZ(AddressSelectViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ2, 158);
        this.viewModel$delegate = new lifecycleAwareLazy(this, aqS154S0100000_4, new AqS64S0400000_4(this, aqS154S0100000_4, LIZ2, C26747Aed.INSTANCE, 5));
        this.adapter$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 153));
        this.onBackStackChangeListener = new AqS154S0100000_4(this, 157);
        this.dynamicStyle$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 154));
        this.viewModelFactory$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 159));
    }

    private final IAddressSelectFragmentStyle getDynamicStyle() {
        return (IAddressSelectFragmentStyle) this.dynamicStyle$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment
    public boolean downgrade() {
        EComLiveDegradeExperiment.LIZ.getClass();
        return EComLiveDegradeExperiment.LIZIZ();
    }

    public final C26589Ac5 getAdapter() {
        return (C26589Ac5) this.adapter$delegate.getValue();
    }

    public final DeliveryPanelViewModel getDeliveryPanelViewModel() {
        return (DeliveryPanelViewModel) this.deliveryPanelViewModel$delegate.getValue();
    }

    public final AddressSelectViewModel getViewModel() {
        return (AddressSelectViewModel) this.viewModel$delegate.getValue();
    }

    @Override // X.AMD
    public ViewModelProvider.Factory getViewModelFactory() {
        return (ViewModelProvider.Factory) this.viewModelFactory$delegate.getValue();
    }

    private final void initData() {
        DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage;
        getViewModel().LJLJJLL = getDeliveryPanelViewModel().LJLJLLL;
        getViewModel().LJLJL = C27090AkA.LJLJJL;
        Parcelable parcelable = getDeliveryPanelViewModel().LJLJJLL;
        if ((parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) && (enterParamForProductDetailPage = (DeliveryPanelStarter.EnterParamForProductDetailPage) parcelable) != null) {
            getViewModel().LJLJLJ = enterParamForProductDetailPage;
        }
    }

    private final void initList() {
        withState(getDeliveryPanelViewModel(), new AqS170S0100000_4(this, 229));
    }

    private final void initSubscribe() {
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AeX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AddressSelectState) obj).getSelectedAddress();
            }
        }, new AqS186S0100000_4(this, 27));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AeY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AddressSelectState) obj).getRenderDataList();
            }
        }, new AqS186S0100000_4(this, 28));
        C26059AKp.LIZ().LIZJ("ec_address_select", this);
        C26059AKp.LIZ().LIZJ("ec_zipcode_locate_address", this);
    }

    private final void initUI() {
        int i;
        Integer LJI;
        ((RecyclerView) _$_findCachedViewById(R.id.isf)).setAdapter(getAdapter());
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isf);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        Context context = getContext();
        if (context != null) {
            ((RecyclerView) _$_findCachedViewById(R.id.isf)).LJII(new C71312Rym(KL2.LIZJ(context, 16.0f), AnonymousClass636.LJIIIIZZ(R.attr.dz, context), 2, 0), -1);
        }
        if (getDynamicStyle().getBottomShowButton()) {
            C45804HyK.LJJLL(_$_findCachedViewById(R.id.b8v));
            C45804HyK.LJJLL(_$_findCachedViewById(R.id.buu));
        } else {
            C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.b8v));
            C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.buu));
        }
        String string = getString(getDynamicStyle().getNavigationTitleRes());
        o.LJIIIIZZ(string, "getString(dynamicStyle.navigationTitleRes)");
        C235119Kp c235119Kp = new C235119Kp();
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS154S0100000_4(this, 156));
        Context context2 = getContext();
        if (context2 != null && (LJI = C79045V0n.LJI(R.attr.cr, context2)) != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        c235119Kp.LIZJ(i);
        if (getDynamicStyle().getNavigatinShowCloseIcon()) {
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark;
            LIZJ.LIZIZ(new AqS154S0100000_4(this, 155));
            c235119Kp.LIZIZ(LIZJ);
        }
        ((C252709vu) _$_findCachedViewById(R.id.l9j)).setNavActions(c235119Kp);
        View continueButton = _$_findCachedViewById(R.id.buu);
        o.LJIIIIZZ(continueButton, "continueButton");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 29, 42), continueButton);
        View changeLocationButton = _$_findCachedViewById(R.id.b8v);
        o.LJIIIIZZ(changeLocationButton, "changeLocationButton");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 30, 42), changeLocationButton);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.LJ(new C26878Agk(this.onBackStackChangeListener));
        }
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.ECAnimDowngradeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.LJJLL(new C26878Agk(this.onBackStackChangeListener));
        }
        C26059AKp.LIZ().LIZIZ("ec_address_select", this);
        C26059AKp.LIZ().LIZIZ("ec_zipcode_locate_address", this);
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    @Override // X.InterfaceC60061Nhh
    public void onEvent(String str, String str2) {
        ZipcodeLocateAddress LIZ;
        Integer num;
        if (SC5.LIZIZ(str, "eventName", str2, "params", str, "ec_address_select")) {
            withState(getViewModel(), new AqS170S0100000_4(this, 231));
            return;
        }
        if (!o.LJ(str, "ec_zipcode_locate_address") || (num = (LIZ = C26732AeO.LIZ(str2)).type) == null || num.intValue() != 1) {
            return;
        }
        DeliveryPanelViewModel deliveryPanelViewModel = getDeliveryPanelViewModel();
        Context context = getContext();
        List<Region> list = LIZ.regions;
        String str3 = LIZ.zipcode;
        if (str3 == null) {
            str3 = null;
        }
        deliveryPanelViewModel.getClass();
        deliveryPanelViewModel.setState(new AqS170S0100000_4(list, 1644));
        deliveryPanelViewModel.Mv0(context);
        C27090AkA.LJLJJL = str3;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        initData();
        initUI();
        initList();
        initSubscribe();
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, InterfaceC88472Yns<? super PROP1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIILLIIL(c73139Sn9, interfaceC88472Yns);
    }

    public View com_ss_android_ugc_aweme_ecommerce_base_delivery_page_address_AddressSelectFragment__onCreateView$___twin___(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        return C16880lQ.LLLLIILL(inflater, R.layout.ya, viewGroup, false);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> interfaceC88471Ynr) {
        return (R) C73157SnR.LJIIJ(vm1, vm2, interfaceC88471Ynr);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, InterfaceC88471Ynr<? super PROP1, ? super PROP2, ? extends R> interfaceC88471Ynr) {
        return (R) C73157SnR.LJIILL(c73139Sn9, c73139Sn92, interfaceC88471Ynr);
    }

    public static View com_ss_android_ugc_aweme_ecommerce_base_delivery_page_address_AddressSelectFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(AddressSelectFragment addressSelectFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View com_ss_android_ugc_aweme_ecommerce_base_delivery_page_address_AddressSelectFragment__onCreateView$___twin___ = addressSelectFragment.com_ss_android_ugc_aweme_ecommerce_base_delivery_page_address_AddressSelectFragment__onCreateView$___twin___(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(com_ss_android_ugc_aweme_ecommerce_base_delivery_page_address_AddressSelectFragment__onCreateView$___twin___ instanceof View)) {
            com_ss_android_ugc_aweme_ecommerce_base_delivery_page_address_AddressSelectFragment__onCreateView$___twin___ = null;
        }
        if (com_ss_android_ugc_aweme_ecommerce_base_delivery_page_address_AddressSelectFragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(com_ss_android_ugc_aweme_ecommerce_base_delivery_page_address_AddressSelectFragment__onCreateView$___twin___, addressSelectFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(com_ss_android_ugc_aweme_ecommerce_base_delivery_page_address_AddressSelectFragment__onCreateView$___twin___, addressSelectFragment);
                C10A.LIZIZ(com_ss_android_ugc_aweme_ecommerce_base_delivery_page_address_AddressSelectFragment__onCreateView$___twin___, addressSelectFragment);
                ActivityC45651qj mo49getActivity = addressSelectFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return com_ss_android_ugc_aweme_ecommerce_base_delivery_page_address_AddressSelectFragment__onCreateView$___twin___;
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> interfaceC88473Ynt) {
        return (R) C73157SnR.LJIIIZ(vm1, vm2, vm3, interfaceC88473Ynt);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, InterfaceC88473Ynt<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> interfaceC88473Ynt) {
        return (R) C73157SnR.LJIILJJIL(c73139Sn9, c73139Sn92, c73139Sn93, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, InterfaceC88474Ynu<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> interfaceC88474Ynu) {
        return (R) C73157SnR.LJIIIIZZ(vm1, vm2, vm3, vm4, interfaceC88474Ynu);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, C73139Sn9<S4, PROP4> c73139Sn94, InterfaceC88474Ynu<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> interfaceC88474Ynu) {
        return (R) C73157SnR.LJIILIIL(c73139Sn9, c73139Sn92, c73139Sn93, c73139Sn94, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, VM5 extends JediViewModel<S5>, S5 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, InterfaceC88475Ynv<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> interfaceC88475Ynv) {
        return (R) C73157SnR.LJII(vm1, vm2, vm3, vm4, vm5, interfaceC88475Ynv);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, M5 extends C73139Sn9<S5, PROP5>, PROP5 extends InterfaceC61312at, S5 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, C73139Sn9<S4, PROP4> c73139Sn94, C73139Sn9<S5, PROP5> c73139Sn95, InterfaceC88475Ynv<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> interfaceC88475Ynv) {
        return (R) C73157SnR.LJIIL(c73139Sn9, c73139Sn92, c73139Sn93, c73139Sn94, c73139Sn95, interfaceC88475Ynv);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }

    public <S extends InterfaceC61312at, A, B, C, D, E> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C73165SnZ<TMF> c73165SnZ, InterfaceC88476Ynw<? super AML, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C73157SnR.LJFF(this, jediViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c73165SnZ, interfaceC88476Ynw);
    }
}