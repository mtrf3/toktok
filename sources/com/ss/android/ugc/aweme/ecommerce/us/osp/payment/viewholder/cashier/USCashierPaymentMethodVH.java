package com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.cashier;

import X.B1J;
import X.C26597AcD;
import X.C62822Ol8;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.us.osp.payment.view.USCashierPaymentMethodView;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USCashierPaymentMethodVH extends ECJediViewHolder {
    public final C26597AcD LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final Map<Integer, View> LJLJJI;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PaymentViewModel getViewModel() {
        return (PaymentViewModel) this.LJLJI.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        USCashierPaymentMethodView uSCashierPaymentMethodView;
        B1J item = (B1J) obj;
        o.LJIIIZ(item, "item");
        View view = this.itemView;
        if ((view instanceof USCashierPaymentMethodView) && (uSCashierPaymentMethodView = (USCashierPaymentMethodView) view) != null) {
            uSCashierPaymentMethodView.setPaymentLogger(getViewModel().LJLL);
            uSCashierPaymentMethodView.setPaymentMethod(item.LIZ);
            uSCashierPaymentMethodView.setTrackParams(getViewModel().LJLZ);
            uSCashierPaymentMethodView.setPaySource(this.LJLIL.LJLJL.paySource);
            uSCashierPaymentMethodView.setOnCheckedListener(new AqS108S0300000_4(item, uSCashierPaymentMethodView, this, 35));
            withState(getViewModel(), new AqS108S0300000_4(item, uSCashierPaymentMethodView, this, 36));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public USCashierPaymentMethodVH(android.view.ViewGroup r8, X.C26597AcD r9, androidx.lifecycle.LifecycleOwner r10) {
        /*
            r7 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "adapter"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "lifecycleOwner"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r7.LJLJJI = r0
            com.ss.android.ugc.aweme.ecommerce.us.osp.payment.view.USCashierPaymentMethodView r1 = new com.ss.android.ugc.aweme.ecommerce.us.osp.payment.view.USCashierPaymentMethodView
            android.content.Context r2 = r8.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = r3
            r1.<init>(r2, r3, r4, r5, r6)
            r7.<init>(r1)
            r7.LJLIL = r9
            r7.LJLILLLLZI = r10
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel.class
            X.Prg r2 = X.C65352Pkq.LIZ(r0)
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4
            r0 = 137(0x89, float:1.92E-43)
            r1.<init>(r7, r2, r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r7.LJLJI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.cashier.USCashierPaymentMethodVH.<init>(android.view.ViewGroup, X.AcD, androidx.lifecycle.LifecycleOwner):void");
    }
}
