package com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.cashier;

import X.B21;
import X.C45804HyK;
import X.C62822Ol8;
import X.SD6;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USCashierNormalElementVH extends ECJediViewHolder {
    public final C62822Ol8 LJLIL;
    public final Map<Integer, View> LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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
        return (PaymentViewModel) this.LJLIL.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public USCashierNormalElementVH(android.view.ViewGroup r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            java.util.LinkedHashMap r0 = X.C44878HjO.LIZIZ(r4, r0)
            r3.LJLILLLLZI = r0
            X.SD6 r2 = new X.SD6
            android.content.Context r1 = r4.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1)
            r3.<init>(r2)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel.class
            X.Prg r2 = X.C65352Pkq.LIZ(r0)
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4
            r0 = 136(0x88, float:1.9E-43)
            r1.<init>(r3, r2, r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLIL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.cashier.USCashierNormalElementVH.<init>(android.view.ViewGroup):void");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        SD6 sd6;
        B21 item = (B21) obj;
        o.LJIIIZ(item, "item");
        this.itemView.setPadding(C45804HyK.LJJI(48), this.itemView.getPaddingTop(), C45804HyK.LJJI(16), C45804HyK.LJJI(12));
        View view = this.itemView;
        if ((view instanceof SD6) && (sd6 = (SD6) view) != null) {
            sd6.setOnValueChange(new AqS135S0200000_4(this, item, 198));
            sd6.setOnVerify(new AqS108S0300000_4(this, item, sd6, 34));
            sd6.setOnErrorClear(new AqS154S0100000_4(item, 1141));
            sd6.setOnFocusChange(new AqS135S0200000_4(this, sd6, 199));
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
                sd6.getInputView().setInputTextEncrypted(true);
            } else {
                sd6.getInputView().setInputType(1);
                sd6.getInputView().setMaxLength(Integer.MAX_VALUE);
            }
        }
    }
}
