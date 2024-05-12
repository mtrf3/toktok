package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.ActivityC45651qj;
import X.B0C;
import X.B0D;
import X.B0H;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C27993Ayj;
import X.C29S;
import X.C3C5;
import X.C66822jm;
import X.C76800UCe;
import X.C79234V7u;
import X.C90903hW;
import X.EO3;
import X.InterfaceC60061Nhh;
import X.InterfaceC67352kd;
import X.InterfaceC71003Rtn;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.ecommerce.ab.EComLiveDegradeExperiment;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.router.Strategy;
import com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.IDqS429S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentHalfFragment extends CommerceBottomSheetDialogFragment implements InterfaceC60061Nhh {
    public EnterParams LJLIL;
    public InterfaceC88473Ynt<? super PaymentInfo, ? super Boolean, ? super Map<String, ? extends Object>, C76800UCe> LJLILLLLZI;
    public InterfaceC88472Yns<? super PaymentMethod, C76800UCe> LJLJI;
    public String LJLJJI;
    public InterfaceC88472Yns<? super InterfaceC67352kd<? super C27993Ayj>, ? extends Object> LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    public PaymentHalfFragment() {
        super(false, 1, null);
        this.LJLIL = new EnterParams(null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        this.LJLILLLLZI = B0C.LJLIL;
        this.LJLJI = B0H.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final boolean downgrade() {
        EComLiveDegradeExperiment.LIZ.getClass();
        return EComLiveDegradeExperiment.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, X.InterfaceC71003Rtn
    public final InterfaceC71003Rtn preTrackNode() {
        return TrackNodeStore.LIZLLL(this, this.LJLJJI);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        EO3.LIZIZ(this);
        EventCenter.LJ().LIZIZ("ec_payment_change", this);
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.DialogFragment
    /* renamed from: vl, reason: merged with bridge method [inline-methods] */
    public final B0D getDialog() {
        Dialog dialog = super.getDialog();
        if (dialog instanceof B0D) {
            return (B0D) dialog;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        o.LJI(context);
        B0D b0d = new B0D(context, getTheme());
        Strategy theStrategy = getTheStrategy();
        if (theStrategy != null) {
            b0d.LJLJLLL = theStrategy;
        }
        return b0d;
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_payment_change")) {
            dismissAllowingStateLoss();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        PaymentFragment paymentFragment = new PaymentFragment();
        C66822jm.LIZ.erase("PAYMENT_STATE");
        paymentFragment.setRefresh(this.LJLJJL);
        paymentFragment.setOnBottomButtonClick(new IDqS429S0100000_4(this, 4));
        paymentFragment.setOnCheckPaymentMethod(new AqS170S0100000_4(this, 275));
        paymentFragment.setPreNodeId(C79234V7u.LJJIJ(view));
        EnterParams enterParams = this.LJLIL;
        enterParams.LIZ = true;
        paymentFragment.setEnterParams(enterParams);
        paymentFragment.setOnRegionPanelStatus(new AqS135S0200000_4(this, view, 38));
        paymentFragment.setOnCloseClick(new AqS154S0100000_4(this, 204));
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(childFragmentManager);
        c1b3.LJIIIIZZ(_$_findCachedViewById(R.id.dm3).getId(), 1, paymentFragment, null);
        c1b3.LJI();
        EO3.LIZLLL("payment_method");
        EO3.LIZJ(this, "payment_method");
        EventCenter.LJ().LIZJ("ec_payment_change", this);
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
}
