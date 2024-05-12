package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.B21;
import X.B2I;
import X.C117114ih;
import X.C26597AcD;
import X.C26706Ady;
import X.C27162AlK;
import X.C28114B1q;
import X.C45804HyK;
import X.C5H3;
import X.EnumC28119B1v;
import X.SD6;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.INormalElementStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class NormalElementViewHolder extends ECJediViewHolder implements c {
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

    private final INormalElementStyle getDynamicStyle() {
        return (INormalElementStyle) this.dynamicStyle$delegate.getValue();
    }

    public final PaymentViewModel getViewModel() {
        return (PaymentViewModel) this.viewModel$delegate.getValue();
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(B21 item) {
        C117114ih c117114ih;
        int i;
        o.LJIIIZ(item, "item");
        if (this.adapter.LJZL(this.latestItemPositionInternal + 1, false) != null) {
            boolean z = this.adapter.LJZL(this.latestItemPositionInternal + 1, false) instanceof B2I;
            if (this.adapter.LJZL(this.latestItemPositionInternal + 1, false) instanceof C28114B1q) {
                i = C27162AlK.LJIIIZ;
            } else {
                i = C27162AlK.LJIIIIZZ;
            }
            c117114ih = new C117114ih(i, 0, 0, 0, false, 0, z, 254);
        } else {
            c117114ih = new C117114ih(C27162AlK.LJIIIIZZ, 0, 0, 0, false, 0, true, 254);
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        itemView.setTag(R.id.bn_, c117114ih);
        this.itemView.setPadding(getDynamicStyle().getPaddingStart(), this.itemView.getPaddingTop(), C45804HyK.LJJI(16), this.itemView.getPaddingBottom());
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.element.NormalElement");
        SD6 sd6 = (SD6) view;
        sd6.setFocusChange(new AqS135S0200000_4(this, sd6, 42));
        sd6.setOnValueChange(new AqS135S0200000_4(this, item, 43));
        sd6.setOnVerify(new AqS108S0300000_4(this, item, sd6, 12));
        sd6.setOnErrorClear(new AqS154S0100000_4(item, 226));
        sd6.setOnFocusChange(new AqS135S0200000_4(this, sd6, 44));
        ElementDTO elementDTO = item.LIZ;
        PaymentMethod paymentMethod = item.LIZIZ;
        PaymentViewModel viewModel = getViewModel();
        PaymentMethod paymentMethod2 = item.LIZIZ;
        String str = item.LIZ.id;
        if (str == null) {
            str = "";
        }
        sd6.LIZ(elementDTO, paymentMethod, viewModel.Lv0(paymentMethod2, str), item.LIZJ);
        if (o.LJ(item.LIZ.id, "eg_ccdc_global_cvv")) {
            sd6.getInputView().setInputType(2);
            sd6.getInputView().setMaxLength(4);
        } else {
            sd6.getInputView().setInputType(1);
            sd6.getInputView().setMaxLength(Integer.MAX_VALUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setEmailHintVisibleIfIsInputEmail(boolean z) {
        Integer num = ((B2I) getItem()).LIZ.styleType;
        int ordinal = EnumC28119B1v.Email.ordinal();
        if (num == null || num.intValue() != ordinal) {
            return;
        }
        PaymentViewModel viewModel = getViewModel();
        viewModel.getClass();
        viewModel.setState(new AqS9S0010000_4(z, 0));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NormalElementViewHolder(android.view.ViewGroup r4, X.C26597AcD r5) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "adapter"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3._$_findViewCache = r0
            X.SD6 r2 = new X.SD6
            android.content.Context r1 = r4.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1)
            r3.<init>(r2)
            r3.adapter = r5
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel.class
            X.Prg r2 = X.C65352Pkq.LIZ(r0)
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4
            r0 = 40
            r1.<init>(r3, r2, r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.viewModel$delegate = r0
            kotlin.jvm.internal.AqS154S0100000_4 r1 = new kotlin.jvm.internal.AqS154S0100000_4
            r0 = 225(0xe1, float:3.15E-43)
            r1.<init>(r3, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.dynamicStyle$delegate = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.NormalElementViewHolder.<init>(android.view.ViewGroup, X.AcD):void");
    }
}
