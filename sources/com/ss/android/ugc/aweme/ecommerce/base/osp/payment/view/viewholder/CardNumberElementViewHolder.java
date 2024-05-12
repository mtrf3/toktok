package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.B2I;
import X.C117114ih;
import X.C26597AcD;
import X.C27162AlK;
import X.C28114B1q;
import X.C28123B1z;
import X.C45804HyK;
import X.C62822Ol8;
import X.SD1;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CardNumberElementViewHolder extends ECJediViewHolder {
    public final C26597AcD LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final Map<Integer, View> LJLJI;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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
        return (PaymentViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        C117114ih c117114ih;
        int i;
        C28123B1z item = (C28123B1z) obj;
        o.LJIIIZ(item, "item");
        this.itemView.setPadding(C45804HyK.LJJI(16), this.itemView.getPaddingTop(), C45804HyK.LJJI(16), this.itemView.getPaddingBottom());
        if (this.LJLIL.LJZL(this.latestItemPositionInternal + 1, false) != null) {
            boolean z = this.LJLIL.LJZL(this.latestItemPositionInternal + 1, false) instanceof B2I;
            if (this.LJLIL.LJZL(this.latestItemPositionInternal + 1, false) instanceof C28114B1q) {
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
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.element.CardNumberElement");
        SD1 sd1 = (SD1) view;
        sd1.setFocusChange(new AqS135S0200000_4(this, sd1, 122));
        sd1.setOnPaymentMethodIdentify(new AqS135S0200000_4(this, item, 123));
        sd1.setOnValueChange(new AqS108S0300000_4(sd1, this, item, 24));
        sd1.setOnVerify(new AqS108S0300000_4(sd1, this, item, 25));
        sd1.setOnErrorClear(new AqS154S0100000_4(item, 1002));
        sd1.setRequestOcr(new AqS154S0100000_4(this, 1003));
        sd1.setPaymentLogger(getViewModel().LJLL);
        ElementDTO elementDTO = item.LIZ;
        PaymentMethod paymentMethod = item.LIZIZ;
        PaymentViewModel viewModel = getViewModel();
        PaymentMethod paymentMethod2 = item.LIZIZ;
        String str = item.LIZ.id;
        if (str == null) {
            str = "";
        }
        sd1.LIZ(elementDTO, paymentMethod, viewModel.Lv0(paymentMethod2, str), item.LIZJ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CardNumberElementViewHolder(android.view.ViewGroup r4, X.C26597AcD r5) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "adapter"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.LJLJI = r0
            X.SD1 r2 = new X.SD1
            android.content.Context r1 = r4.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1)
            r3.<init>(r2)
            r3.LJLIL = r5
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel.class
            X.Prg r2 = X.C65352Pkq.LIZ(r0)
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4
            r0 = 37
            r1.<init>(r3, r2, r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLILLLLZI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.CardNumberElementViewHolder.<init>(android.view.ViewGroup, X.AcD):void");
    }
}
