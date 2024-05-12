package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.B1F;
import X.B1J;
import X.C26597AcD;
import X.C26706Ady;
import X.C45804HyK;
import X.C5H3;
import X.C78857UxB;
import X.UC0;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IPaymentFragmentStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentMethodView;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import java.util.Map;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS50S0400000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class PaymentMethodViewHolder extends ECJediViewHolder implements c {
    public Map<Integer, View> _$_findViewCache;
    public final C26597AcD adapter;
    public final LifecycleOwner lifecycleOwner;
    public final C5H3 viewModel$delegate;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PaymentViewModel getViewModel() {
        return (PaymentViewModel) this.viewModel$delegate.getValue();
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(B1J item) {
        String str;
        String str2;
        BindInfo bindInfo;
        o.LJIIIZ(item, "item");
        IPaymentFragmentStyle iPaymentFragmentStyle = (IPaymentFragmentStyle) UC0.LJIIJJI(this, "payment_method", null, null, null, 14);
        this.itemView.setPadding(C45804HyK.LJJI(16), this.itemView.getPaddingTop(), C45804HyK.LJJI(16), this.itemView.getPaddingBottom());
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentMethodView");
        PaymentMethodView paymentMethodView = (PaymentMethodView) view;
        paymentMethodView.setPaymentLogger(getViewModel().LJLL);
        paymentMethodView.setPaymentMethod(item.LIZ);
        paymentMethodView.setGetBindUrl(new AqS186S0100000_4(this, 80));
        paymentMethodView.setRemoveBindMethod(new B1F(getViewModel()));
        paymentMethodView.setTrackParams(getViewModel().LJLZ);
        paymentMethodView.setPaySource(this.adapter.LJLJL.paySource);
        paymentMethodView.setOnCheckedListener(new AqS50S0400000_4(item, paymentMethodView, this, iPaymentFragmentStyle, 9));
        withState(getViewModel(), new AqS50S0400000_4(item, paymentMethodView, this, iPaymentFragmentStyle, 10));
        BindInfo bindInfo2 = item.LIZ.bindInfo;
        if (bindInfo2 != null) {
            str = bindInfo2.buttonText;
        } else {
            str = null;
        }
        if (C78857UxB.LJJJIL(str)) {
            BindInfo bindInfo3 = item.LIZ.bindInfo;
            if (bindInfo3 != null) {
                str2 = bindInfo3.schema;
            } else {
                str2 = null;
            }
            if ((str2 == null || str2.length() == 0) && (bindInfo = item.LIZ.bindInfo) != null && o.LJ(bindInfo.needPrefetchActivateUrl, Boolean.TRUE)) {
                getViewModel().Rv0(item.LIZ, true, null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r6 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0021, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void openCCDCPage(java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.PaymentMethodViewHolder.openCCDCPage(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PaymentMethodViewHolder(android.view.ViewGroup r8, X.C26597AcD r9, androidx.lifecycle.LifecycleOwner r10) {
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
            r7._$_findViewCache = r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentMethodView r1 = new com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentMethodView
            android.content.Context r2 = r8.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = r3
            r1.<init>(r2, r3, r4, r5, r6)
            r7.<init>(r1)
            r7.adapter = r9
            r7.lifecycleOwner = r10
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel.class
            X.Prg r2 = X.C65352Pkq.LIZ(r0)
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4
            r0 = 41
            r1.<init>(r7, r2, r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r7.viewModel$delegate = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.PaymentMethodViewHolder.<init>(android.view.ViewGroup, X.AcD, androidx.lifecycle.LifecycleOwner):void");
    }
}
