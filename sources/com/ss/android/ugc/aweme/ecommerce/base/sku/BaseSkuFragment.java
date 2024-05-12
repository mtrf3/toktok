package com.ss.android.ugc.aweme.ecommerce.base.sku;

import X.AMD;
import X.AML;
import X.AbstractC26082ALm;
import X.C157166Eu;
import X.C16880lQ;
import X.C1AU;
import X.C221108m2;
import X.C27162AlK;
import X.C27445Apt;
import X.C27446Apu;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70858RrS;
import X.C73140SnA;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C78915Uy7;
import X.DialogC27440Apo;
import X.EnumC27447Apv;
import X.InterfaceC151715xP;
import X.InterfaceC61312at;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.TBW;
import X.TMG;
import X.W1T;
import Y.ACListenerS24S0100000_4;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.ss.android.ugc.aweme.ecommerce.ab.EComLiveDegradeExperiment;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS64S0400000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class BaseSkuFragment extends CommerceBottomSheetDialogFragment implements InterfaceC151715xP, AMD<ViewModelProvider.Factory> {
    public Integer LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public KeyBoardVisibilityUtil LJLJI;
    public final lifecycleAwareLazy LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, X.InterfaceC37828Esy
    public final String getPageName() {
        return "sku";
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

    public BaseSkuFragment() {
        super(false, 1, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 304));
        C65776Prg LIZ = C65352Pkq.LIZ(SkuPanelViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 303);
        this.LJLJJI = new lifecycleAwareLazy(this, aqS154S0100000_4, new AqS64S0400000_4(this, aqS154S0100000_4, LIZ, C27446Apu.INSTANCE, 8));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final boolean downgrade() {
        EComLiveDegradeExperiment.LIZ.getClass();
        return EComLiveDegradeExperiment.LIZ().getPageAnimDegrade();
    }

    @Override // X.AMD
    public final ViewModelProvider.Factory getViewModelFactory() {
        return (ViewModelProvider.Factory) this.LJLILLLLZI.getValue();
    }

    public final SkuPanelViewModel vl() {
        return (SkuPanelViewModel) this.LJLJJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment
    public final Integer getDialogHeight() {
        return Integer.valueOf((int) (vl().Tv0().LJIL() * C27162AlK.LIZIZ));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.LJLJI;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.LIZ();
        }
        this.LJLJI = null;
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS params) {
        o.LJIIIZ(params, "params");
        SkuPanelStarter.SkuEnterParams skuEnterParams = vl().LJLLJ;
        if (skuEnterParams != null) {
            Integer pdpPageType = skuEnterParams.getPdpPageType();
            int value = EnumC27447Apv.SEMI_PDP.getValue();
            if (pdpPageType != null && pdpPageType.intValue() == value) {
                return;
            }
        }
        C78915Uy7.LJJIL(params, new AqS170S0100000_4(this, 322));
        SkuPanelViewModel vl = vl();
        vl.getClass();
        C78915Uy7.LJJIL(params, new AqS178S0100000_12(vl, 459));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        View view;
        View findViewById;
        ViewParent parent;
        C1AU c1au;
        super.onActivityCreated(bundle);
        Context context = getContext();
        Object obj = null;
        if ((context instanceof C1AU) && (c1au = (C1AU) context) != null) {
            this.LJLJI = new KeyBoardVisibilityUtil(c1au, 240, C27445Apt.LJLIL);
        }
        View view2 = getView();
        if (view2 != null && (parent = view2.getParent()) != null) {
            obj = parent.getParent();
        }
        if ((obj instanceof View) && (view = (View) obj) != null && (findViewById = view.findViewById(R.id.liz)) != null) {
            C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 55), findViewById);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        return new DialogC27440Apo(requireContext, getTheme());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, X.InterfaceC27438Apm
    public final boolean onDetectBlank(Map<String, String> params) {
        ViewGroup viewGroup;
        o.LJIIIZ(params, "params");
        if (vl().onDetectBlank(params)) {
            return true;
        }
        View view = getView();
        if (view == null || (viewGroup = (ViewGroup) view.findViewById(R.id.bo9)) == null || viewGroup.getChildCount() <= 0 || viewGroup.getHeight() <= 0) {
            params.put("blank_type", "empty_view");
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
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
