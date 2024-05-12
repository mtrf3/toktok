package com.ss.android.ugc.aweme.ecommerce.base.osp.subpage;

import X.AMD;
import X.AML;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C157166Eu;
import X.C16880lQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C25903AEp;
import X.C26607AcN;
import X.C27949Ay1;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73140SnA;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C79045V0n;
import X.C90903hW;
import X.C9KF;
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
import X.OPS;
import X.T5T;
import X.TBW;
import X.TMG;
import X.W1T;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.ab.EComLiveDegradeExperiment;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonOrder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MessageEditDialogFragment extends CommerceBottomSheetDialogFragment implements InterfaceC151715xP, AMD<C25903AEp> {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final C62822Ol8 LJLIL;
    public final long LJLILLLLZI;
    public final C25903AEp LJLJI;
    public String LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final View _$_findCachedViewById(int i) {
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public MessageEditDialogFragment() {
        super(false, 1, null);
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 46));
        this.LJLILLLLZI = SystemClock.elapsedRealtime();
        this.LJLJI = new C25903AEp();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final boolean downgrade() {
        EComLiveDegradeExperiment.LIZ.getClass();
        return EComLiveDegradeExperiment.LIZIZ();
    }

    public final OrderSubmitViewModel getViewModel() {
        return (OrderSubmitViewModel) this.LJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int i;
        BillInfoData billInfoData;
        AddonOrder addonOrder;
        List<PackedSku> packedSkus;
        super.onDestroy();
        boolean z = getViewModel().LLI;
        HashMap<String, Object> fw0 = getViewModel().fw0(true);
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - this.LJLILLLLZI);
        OrderSubmitViewModel viewModel = getViewModel();
        if (viewModel != null && (billInfoData = viewModel.LJZ) != null && (addonOrder = billInfoData.getAddonOrder()) != null && (packedSkus = addonOrder.getPackedSkus()) != null) {
            i = packedSkus.size();
        } else {
            i = 0;
        }
        C27949Ay1.LJJIIZ(z, "return", null, null, fw0, valueOf, "message", "order_submit", null, null, Integer.valueOf(i), getViewModel().iw0(), 780);
        C27949Ay1.LJJJJ();
    }

    public final void vl() {
        ((TextView) _$_findCachedViewById(R.id.ghw)).setText(getString(R.string.r9r, Integer.valueOf(((TextView) _$_findCachedViewById(R.id.ghv)).length())));
    }

    @Override // X.AMD
    public final /* bridge */ /* synthetic */ C25903AEp getViewModelFactory() {
        return this.LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String str;
        String string;
        Integer LJI;
        o.LJIIIZ(view, "view");
        setKeyboardUtilListener(new AqS170S0100000_4(this, 283));
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.ghy);
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string2 = getString(R.string.r_9);
        o.LJIIIIZZ(string2, "getString(R.string.shop_order_page_message)");
        c9kf.LIZJ = string2;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 227));
        c235119Kp.LIZIZ(LIZJ);
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.cr, context)) != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        c235119Kp.LIZJ(i);
        c252709vu.setNavActions(c235119Kp);
        C27949Ay1.LJIJI("save", "confirm", getViewModel().fw0(false), "message", null, null, null, 4080);
        ((C252709vu) _$_findCachedViewById(R.id.ghy)).LJIILJJIL(true);
        View message_panel_save_button = _$_findCachedViewById(R.id.ghx);
        o.LJIIIIZZ(message_panel_save_button, "message_panel_save_button");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 37, 42), message_panel_save_button);
        OPS.LIZ((T5T) _$_findCachedViewById(R.id.ghv), 200);
        ((TextView) _$_findCachedViewById(R.id.ghv)).addTextChangedListener(new C26607AcN(this));
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments == null || (str = arguments.getString("message")) == null) {
            str = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("main_order_id")) != null) {
            str2 = string;
        }
        this.LJLJJI = str2;
        ((TextView) _$_findCachedViewById(R.id.ghv)).setText(str);
        vl();
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C27949Ay1.LJIJJLI(Boolean.FALSE, getViewModel().fw0(true), "message", "order_submit", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097136);
        getViewModel().xw0();
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a_3, viewGroup, false);
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
