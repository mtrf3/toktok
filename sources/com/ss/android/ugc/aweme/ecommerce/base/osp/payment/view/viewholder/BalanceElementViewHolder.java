package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.B17;
import X.C117114ih;
import X.C26597AcD;
import X.C26706Ady;
import X.C28120B1w;
import X.C45804HyK;
import X.C5H3;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IBalanceElementStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class BalanceElementViewHolder extends ECJediViewHolder implements c {
    public Map<Integer, View> _$_findViewCache;
    public final C26597AcD adapter;
    public final C5H3 dynamicStyle$delegate;
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

    private final IBalanceElementStyle getDynamicStyle() {
        return (IBalanceElementStyle) this.dynamicStyle$delegate.getValue();
    }

    private final PaymentViewModel getViewModel() {
        return (PaymentViewModel) this.viewModel$delegate.getValue();
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(C28120B1w item) {
        IBalanceElementStyle dynamicStyle;
        List<InstallmentPlan> list;
        o.LJIIIZ(item, "item");
        this.itemView.setPadding(C45804HyK.LJJI(16), this.itemView.getPaddingTop(), C45804HyK.LJJI(16), this.itemView.getPaddingBottom());
        InstallmentInfo installmentInfo = item.LIZIZ.installmentInfo;
        if ((installmentInfo == null || ((list = installmentInfo.installmentPlans) != null && list.isEmpty())) && ((dynamicStyle = getDynamicStyle()) == null || dynamicStyle.getShowDividerLine())) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            itemView.setTag(R.id.bn_, new C117114ih(0, 0, 0, 0, true, C45804HyK.LJJI(16), false, 319));
        }
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.element.BalanceElement");
        B17 b17 = (B17) view;
        b17.setHasCheckedPaymentMethod(item.LIZLLL);
        b17.setTrackParams(getViewModel().LJLZ);
        b17.setPaymentLogger(getViewModel().LJLL);
        b17.setPaySource(this.adapter.LJLJL.paySource);
        ElementDTO elementDTO = item.LIZ;
        PaymentMethod paymentMethod = item.LIZIZ;
        PaymentViewModel viewModel = getViewModel();
        PaymentMethod paymentMethod2 = item.LIZIZ;
        String str = item.LIZ.id;
        if (str == null) {
            str = "";
        }
        b17.LIZ(elementDTO, paymentMethod, viewModel.Lv0(paymentMethod2, str), item.LIZJ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BalanceElementViewHolder(android.view.ViewGroup r4, X.C26597AcD r5) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "adapter"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3._$_findViewCache = r0
            X.B17 r2 = new X.B17
            android.content.Context r1 = r4.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1)
            r3.<init>(r2)
            r3.adapter = r5
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel.class
            X.Prg r2 = X.C65352Pkq.LIZ(r0)
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4
            r0 = 36
            r1.<init>(r3, r2, r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.viewModel$delegate = r0
            kotlin.jvm.internal.AqS154S0100000_4 r1 = new kotlin.jvm.internal.AqS154S0100000_4
            r0 = 224(0xe0, float:3.14E-43)
            r1.<init>(r3, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.dynamicStyle$delegate = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.BalanceElementViewHolder.<init>(android.view.ViewGroup, X.AcD):void");
    }
}
