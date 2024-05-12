package com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic;

import X.AML;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C113724dE;
import X.C141335gf;
import X.C157166Eu;
import X.C16880lQ;
import X.C221108m2;
import X.C26706Ady;
import X.C26744Aea;
import X.C26755Ael;
import X.C26926AhW;
import X.C26927AhX;
import X.C26943Ahn;
import X.C29S;
import X.C3C5;
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
import X.SY4;
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
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.logistic.ILogisticStyle;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.IDqS429S0100000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class LogisticSelectFragment extends ECBaseFragment implements InterfaceC151715xP, c, InterfaceC60061Nhh {
    public static final C26927AhX Companion = new C26927AhX();
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final C5H3 adapter$delegate;
    public final InterfaceC65784Pro<C76800UCe> onBackStackChangeListener;
    public final C5H3 style$delegate;
    public final C5H3 viewModel$delegate;

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
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

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC37828Esy
    public String getPageName() {
        return "logistics";
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
        return "shipping";
    }

    @Override // X.InterfaceC73150SnK
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com_ss_android_ugc_aweme_ecommerce_base_delivery_page_logistic_LogisticSelectFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    public LogisticSelectFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(DeliveryPanelViewModel.class);
        this.viewModel$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 18));
        this.adapter$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 160));
        this.style$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 162));
        this.onBackStackChangeListener = new AqS154S0100000_4(this, 161);
    }

    private final ILogisticStyle getStyle() {
        return (ILogisticStyle) this.style$delegate.getValue();
    }

    public final LogisticAdapter getAdapter() {
        return (LogisticAdapter) this.adapter$delegate.getValue();
    }

    public final DeliveryPanelViewModel getViewModel() {
        return (DeliveryPanelViewModel) this.viewModel$delegate.getValue();
    }

    private final void initSubscribe() {
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AhQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((DeliveryPanelState) obj).getLogisticList();
            }
        }, new AqS186S0100000_4(this, 30));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AhR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((DeliveryPanelState) obj).getClaimVoucherExceptionUX();
            }
        }, new AqS186S0100000_4(this, 31));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AhO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((DeliveryPanelState) obj).getStatus());
            }
        }, new AqS186S0100000_4(this, 32));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AhT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((DeliveryPanelState) obj).getSelectedLogistic();
            }
        }, new AqS186S0100000_4(this, 33));
        C73156SnQ.LJII(this, getViewModel(), new TBT() { // from class: X.AhS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((DeliveryPanelState) obj).getAddressRenderData();
            }
        }, new TBT() { // from class: X.AhP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((DeliveryPanelState) obj).getSelectedShipToInfo();
            }
        }, new IDqS429S0100000_4(this, 1));
        C26943Ahn.LIZ.getClass();
        if (C26943Ahn.LIZ()) {
            C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.AhU
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((DeliveryPanelState) obj).getLogistics();
                }
            }, new AqS186S0100000_4(this, 29));
        }
        Boolean bool = C26744Aea.LIZ().enableSearchAddress;
        if (bool != null && !bool.booleanValue()) {
            EventCenter.LJ().LIZJ("ec_address_change", this);
            EventCenter.LJ().LIZJ("ec_address_select", this);
        }
    }

    private final void initUI() {
        String str;
        DeliveryPanelViewModel viewModel = getViewModel();
        Parcelable parcelable = viewModel.LJLJJLL;
        if (parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) {
            viewModel.LJLLI = "continue";
            viewModel.LJLLLL = 1;
        } else if (parcelable instanceof DeliveryPanelStarter.EnterParamForOrderSubmitPage) {
            viewModel.LJLLI = "save";
            viewModel.LJLLILLLL = ((DeliveryPanelStarter.EnterParamForOrderSubmitPage) parcelable).panelTitle;
            viewModel.LJLLLL = 2;
        }
        getViewModel().Pv0();
        View _$_findCachedViewById = _$_findCachedViewById(R.id.aog);
        getStyle().getBottomButtonNewRadius();
        _$_findCachedViewById.getClass();
        TextView textView = (TextView) _$_findCachedViewById(R.id.aog);
        Context context = getContext();
        if (context != null) {
            str = context.getString(getStyle().getBtnTextRes());
        } else {
            str = null;
        }
        textView.setText(str);
        withState(getViewModel(), new AqS170S0100000_4(this, 236));
        ((C113724dE) _$_findCachedViewById(R.id.aog)).setStyle(Integer.valueOf(getStyle().getBottomButtonColorStyle()));
        ((SY4) _$_findCachedViewById(R.id.aog)).setButtonVariant(0);
        View bottomButton = _$_findCachedViewById(R.id.aog);
        o.LJIIIIZZ(bottomButton, "bottomButton");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 31, 42), bottomButton);
        Context context2 = getContext();
        if (context2 != null) {
            ((RecyclerView) _$_findCachedViewById(R.id.isf)).setAdapter(getAdapter());
            ((RecyclerView) _$_findCachedViewById(R.id.isf)).setLayoutManager(new LinearLayoutManager());
            ((RecyclerView) _$_findCachedViewById(R.id.isf)).LJII(new C71312Rym(KL2.LIZJ(context2, 16.0f), AnonymousClass636.LJIIIIZZ(R.attr.dz, context2), 2, 0), -1);
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.LJ(new C26926AhW(this.onBackStackChangeListener));
        }
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Boolean bool = C26744Aea.LIZ().enableSearchAddress;
        if (bool != null && !bool.booleanValue()) {
            EventCenter.LJ().LIZIZ("ec_address_change", this);
            EventCenter.LJ().LIZIZ("ec_address_select", this);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.LJJLL(new C26926AhW(this.onBackStackChangeListener));
        }
        getViewModel().Jv0();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC27438Apm
    public boolean onDetectBlank(Map<String, String> params) {
        String str;
        int i;
        List<Object> logisticList;
        o.LJIIIZ(params, "params");
        DeliveryPanelViewModel viewModel = getViewModel();
        viewModel.getClass();
        DeliveryPanelState lv0 = viewModel.lv0();
        if (lv0.getStatus() != 0) {
            Integer num = viewModel.LJLL;
            if (num == null || (str = num.toString()) == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            params.put("biz_type", str);
            List<Object> logisticList2 = lv0.getLogisticList();
            if (logisticList2 != null) {
                i = logisticList2.size();
            } else {
                i = 0;
            }
            params.put("content_list_size", String.valueOf(i));
            if (lv0.getStatus() == 2 || lv0.getStatus() == 3) {
                params.put("blank_type", "error_status");
            } else if (viewModel.LJLJLLL == null || (logisticList = lv0.getLogisticList()) == null || logisticList.isEmpty()) {
                params.put("blank_type", "no_meta_data");
            }
            return true;
        }
        if (((ViewGroup) _$_findCachedViewById(R.id.isf)).getChildCount() > 0 && _$_findCachedViewById(R.id.isf).getHeight() > 0) {
            return false;
        }
        params.put("blank_type", "empty_view");
        return true;
    }

    @Override // X.InterfaceC60061Nhh
    public void onEvent(String eventName, String params) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(params, "params");
        Boolean bool = C26744Aea.LIZ().enableSearchAddress;
        if (bool != null && !bool.booleanValue()) {
            if (o.LJ(eventName, "ec_address_change")) {
                AddressPageStarter.AddressEvent LIZ = C26755Ael.LIZ(params);
                if (LIZ.type == 0) {
                    DeliveryPanelViewModel.Qv0(getViewModel(), getContext(), null);
                    return;
                } else {
                    withState(getViewModel(), new AqS135S0200000_4(LIZ, this, 21));
                    return;
                }
            }
            if (!o.LJ(eventName, "ec_address_select")) {
                return;
            }
            AddressPageStarter.AddressEvent LIZ2 = C26755Ael.LIZ(params);
            if (LIZ2.address == null) {
                return;
            }
            DeliveryPanelViewModel.Qv0(getViewModel(), getContext(), LIZ2.address);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        initUI();
        initSubscribe();
        getViewModel().Mv0(getContext());
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, InterfaceC88472Yns<? super PROP1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIILLIIL(c73139Sn9, interfaceC88472Yns);
    }

    public View com_ss_android_ugc_aweme_ecommerce_base_delivery_page_logistic_LogisticSelectFragment__onCreateView$___twin___(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        return C16880lQ.LLLLIILL(inflater, R.layout.zy, viewGroup, false);
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

    public static View com_ss_android_ugc_aweme_ecommerce_base_delivery_page_logistic_LogisticSelectFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(LogisticSelectFragment logisticSelectFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View com_ss_android_ugc_aweme_ecommerce_base_delivery_page_logistic_LogisticSelectFragment__onCreateView$___twin___ = logisticSelectFragment.com_ss_android_ugc_aweme_ecommerce_base_delivery_page_logistic_LogisticSelectFragment__onCreateView$___twin___(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(com_ss_android_ugc_aweme_ecommerce_base_delivery_page_logistic_LogisticSelectFragment__onCreateView$___twin___ instanceof View)) {
            com_ss_android_ugc_aweme_ecommerce_base_delivery_page_logistic_LogisticSelectFragment__onCreateView$___twin___ = null;
        }
        if (com_ss_android_ugc_aweme_ecommerce_base_delivery_page_logistic_LogisticSelectFragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(com_ss_android_ugc_aweme_ecommerce_base_delivery_page_logistic_LogisticSelectFragment__onCreateView$___twin___, logisticSelectFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(com_ss_android_ugc_aweme_ecommerce_base_delivery_page_logistic_LogisticSelectFragment__onCreateView$___twin___, logisticSelectFragment);
                C10A.LIZIZ(com_ss_android_ugc_aweme_ecommerce_base_delivery_page_logistic_LogisticSelectFragment__onCreateView$___twin___, logisticSelectFragment);
                ActivityC45651qj mo49getActivity = logisticSelectFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return com_ss_android_ugc_aweme_ecommerce_base_delivery_page_logistic_LogisticSelectFragment__onCreateView$___twin___;
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
