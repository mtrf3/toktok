package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.AML;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C27164AlM;
import X.C29542Bic;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76542zS;
import X.C76800UCe;
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
import X.TBW;
import android.app.Dialog;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.UserTrustItem;
import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.UserTrustItemDescriptionChunk;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.usertrust.UserTrustItemAdapter;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SecurePaymentDetailDialogFragment extends CommerceBottomSheetDialogFragment implements InterfaceC151715xP {
    public static final /* synthetic */ int LJLJLJ = 0;
    public PaymentMethodsData LJLIL;
    public HashMap<String, Object> LJLILLLLZI;
    public UserTrustItemAdapter LJLJI;
    public Integer LJLJJI;
    public String LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public SecurePaymentDetailDialogFragment() {
        super(false, 1, null);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 205));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C27164AlM c27164AlM = (C27164AlM) this.LJLJJLL.getValue();
        c27164AlM.getClass();
        c27164AlM.LIZLLL = SystemClock.elapsedRealtime();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C27164AlM c27164AlM = (C27164AlM) this.LJLJJLL.getValue();
        c27164AlM.getClass();
        c27164AlM.LIZJ = SystemClock.elapsedRealtime() - c27164AlM.LIZLLL;
        C76542zS.LIZIZ("tiktokec_stay_page", c27164AlM.LIZ, new AqS170S0100000_4(c27164AlM, 14));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Integer num;
        UserTrustItem userTrustItem;
        List<UserTrustItemDescriptionChunk> list;
        UserTrustItemAdapter userTrustItemAdapter;
        PaymentMethodsData paymentMethodsData;
        UserTrustItem userTrustItem2;
        List<UserTrustItemDescriptionChunk> list2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("title")) == null) {
            str = "Secure Payments";
        }
        Bundle arguments2 = getArguments();
        String str2 = null;
        if (arguments2 != null) {
            num = Integer.valueOf(arguments2.getInt("with_delivery_info"));
        } else {
            num = null;
        }
        this.LJLJJI = num;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str2 = arguments3.getString("fill_type");
        }
        this.LJLJJL = str2;
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.ghy);
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = str;
        c235119Kp.LIZJ = c9kf;
        c235119Kp.LIZLLL = true;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 13));
        c235119Kp.LIZIZ(LIZJ);
        c252709vu.setNavActions(c235119Kp);
        if (this.LJLJI == null && (paymentMethodsData = this.LJLIL) != null && (userTrustItem2 = paymentMethodsData.securePayment) != null && (list2 = userTrustItem2.description) != null) {
            this.LJLJI = new UserTrustItemAdapter(list2, R.attr.go, new AqS170S0100000_4(this, 22));
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.mxa);
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            ((RecyclerView) _$_findCachedViewById(R.id.mxa)).LJII(new C29542Bic(12), -1);
            ((RecyclerView) _$_findCachedViewById(R.id.mxa)).setAdapter(this.LJLJI);
        }
        C27164AlM c27164AlM = (C27164AlM) this.LJLJJLL.getValue();
        if (!c27164AlM.LIZIZ) {
            C76542zS.LIZ("tiktokec_enter_page", c27164AlM.LIZ);
            c27164AlM.LIZIZ = true;
        }
        PaymentMethodsData paymentMethodsData2 = this.LJLIL;
        if (paymentMethodsData2 != null && (userTrustItem = paymentMethodsData2.securePayment) != null && (list = userTrustItem.description) != null && (userTrustItemAdapter = this.LJLJI) != null) {
            userTrustItemAdapter.updateUserTrustInfo(list);
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a1v, viewGroup, false);
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
    public final InterfaceC92693kP selectSubscribe(JediViewModel jediViewModel, TBW tbw, C73165SnZ c73165SnZ, InterfaceC88471Ynr interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC92693kP selectSubscribe(JediViewModel jediViewModel, TBW tbw, TBW tbw2, C73165SnZ c73165SnZ, InterfaceC88473Ynt interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC92693kP asyncSubscribe(JediViewModel jediViewModel, TBW tbw, C73165SnZ c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC92693kP selectSubscribe(JediViewModel jediViewModel, TBW tbw, TBW tbw2, TBW tbw3, C73165SnZ c73165SnZ, InterfaceC88474Ynu interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC92693kP selectSubscribe(JediViewModel jediViewModel, TBW tbw, TBW tbw2, TBW tbw3, TBW tbw4, C73165SnZ c73165SnZ, InterfaceC88475Ynv interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
