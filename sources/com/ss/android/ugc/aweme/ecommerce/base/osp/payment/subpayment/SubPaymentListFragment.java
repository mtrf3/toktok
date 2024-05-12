package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C27593AsH;
import X.C27739Aud;
import X.C29S;
import X.C3C5;
import X.C65330PkU;
import X.C65352Pkq;
import X.C66822jm;
import X.C76542zS;
import X.C76800UCe;
import X.C79057V0z;
import X.C8VV;
import X.C90903hW;
import X.C9KF;
import X.InterfaceC27499Aql;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS50S0400000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SubPaymentListFragment extends Fragment implements InterfaceC27499Aql {
    public C27593AsH LJLIL;
    public boolean LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public String LJLILLLLZI = "";

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // X.InterfaceC27499Aql
    public final boolean enableDragClose() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        super.onDestroy();
        if (ActivityStack.isAppBackGround()) {
            str = "close";
        } else {
            str = "return";
        }
        C27593AsH c27593AsH = this.LJLIL;
        if (c27593AsH != null) {
            c27593AsH.LIZJ(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PaymentMethod paymentMethod;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        EnterParams enterParams = null;
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), C79057V0z.LJJIFFI(C66822jm.LIZ, "sub_payment_list_parent_payment_method"), C65330PkU.LIZJ(C65352Pkq.LIZLLL(PaymentMethod.class)));
            if (!(fromJson instanceof PaymentMethod)) {
                fromJson = null;
            }
            paymentMethod = (PaymentMethod) fromJson;
        } catch (s unused) {
            paymentMethod = null;
        }
        try {
            Object fromJson2 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), C79057V0z.LJJIFFI(C66822jm.LIZ, "sub_payment_list_enter_params"), C65330PkU.LIZJ(C65352Pkq.LIZLLL(EnterParams.class)));
            if (!(fromJson2 instanceof EnterParams)) {
                fromJson2 = null;
            }
            enterParams = (EnterParams) fromJson2;
        } catch (s unused2) {
        }
        if (paymentMethod == null || enterParams == null) {
            return;
        }
        C27593AsH c27593AsH = new C27593AsH(enterParams, this.LJLJI);
        C76542zS.LIZ("tiktokec_enter_page", c27593AsH.LIZ);
        c27593AsH.LIZIZ = System.currentTimeMillis();
        this.LJLIL = c27593AsH;
        C8VV.LIZ(this, false, new AqS50S0400000_4(this, paymentMethod, enterParams, c27593AsH, 6));
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwf);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 1265));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        String string = getResources().getString(R.string.fey);
        o.LJIIIIZZ(string, "resources.getString(R.st…sum_payment_method_title)");
        LIZLLL.LIZJ = string;
        c235119Kp.LIZJ = LIZLLL;
        c235119Kp.LIZLLL = true;
        c252709vu.setNavActions(c235119Kp);
        ((RecyclerView) _$_findCachedViewById(R.id.hqs)).setNestedScrollingEnabled(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a1y, viewGroup, false);
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
