package com.ss.android.ugc.aweme.ecommerce.global.osp.module.payment;

import X.B1N;
import X.B1T;
import X.B25;
import X.C16880lQ;
import X.C221108m2;
import X.C26508Aam;
import X.C27937Axp;
import X.C27949Ay1;
import X.C28002Ays;
import X.C28126B2c;
import X.C45804HyK;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70918RsQ;
import X.C73156SnQ;
import X.C78685UuP;
import X.C78946Uyc;
import X.ORY;
import X.ORZ;
import X.OUP;
import X.TBT;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BillingAddressData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GlobalPaymentInfoVH extends ECJediViewHolder {
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public PaymentInfo LJLJI;
    public Boolean LJLJJI;
    public B1T LJLJJL;
    public B1N LJLJJLL;
    public boolean LJLJL;
    public final int LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    public final OrderSubmitViewModel L() {
        return (OrderSubmitViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C26508Aam.LIZ(this.LJLIL, false);
        View view = this.LJLIL;
        this.LJLJJLL = new B1N(this);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.hjn);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) view.findViewById(R.id.hjn)).setAdapter(this.LJLJJLL);
        C73156SnQ.LJIIIIZZ(this, L(), new TBT() { // from class: X.B07
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((OrderSubmitState) obj).getCheckPayment());
            }
        }, new AqS186S0100000_4(this, 95));
    }

    public GlobalPaymentInfoVH(View view) {
        super(view);
        int i;
        this.LJLIL = view;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 89));
        C27937Axp.LIZ.getClass();
        Integer num = C27937Axp.LIZ()._paymentCount;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 3;
        }
        this.LJLJLJ = i;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        boolean z;
        PaymentMethod paymentMethod;
        String str;
        String str2;
        String str3;
        String str4;
        List list;
        PaymentMethod paymentMethod2;
        String str5;
        String str6;
        C28002Ays item = (C28002Ays) obj;
        o.LJIIIZ(item, "item");
        this.LJLJI = item.LIZIZ;
        this.LJLJJI = item.LIZ;
        if (!this.LJLJL) {
            this.LJLJL = true;
            C27949Ay1.LJJIFFI(C27949Ay1.LIZ, "payment_method", L().fw0(false), null, null, null, null, null, 2044);
        }
        ArrayList arrayList = new ArrayList();
        List<PaymentMethod> list2 = item.LIZLLL;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        List<PaymentMethod> list3 = item.LJ;
        if (list3 != null) {
            arrayList.addAll(list3);
        }
        CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList = item.LIZJ;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        String str7 = null;
        if (z) {
            CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList2 = item.LIZJ;
            if (copyOnWriteArrayList2 != null) {
                paymentMethod2 = (PaymentMethod) ORZ.LJLLLL(copyOnWriteArrayList2);
            } else {
                paymentMethod2 = null;
            }
            C27949Ay1 c27949Ay1 = C27949Ay1.LIZ;
            HashMap<String, Object> fw0 = L().fw0(false);
            if (paymentMethod2 != null) {
                str5 = paymentMethod2.LJIIL();
                str6 = paymentMethod2.extraInfo;
            } else {
                str5 = null;
                str6 = null;
            }
            C27949Ay1.LJJIFFI(c27949Ay1, "add_new_payment", fw0, null, str5, Boolean.valueOf(C78685UuP.LJJJZ(str6)), null, null, 1852);
            View findViewById = this.LJLIL.findViewById(R.id.au5);
            o.LJIIIIZZ(findViewById, "view.btnAddPaymentMethod");
            OUP.LJJLIIIJ(findViewById);
            View findViewById2 = this.LJLIL.findViewById(R.id.au5);
            o.LJIIIIZZ(findViewById2, "view.btnAddPaymentMethod");
            C16880lQ.LJIIJ(new Au2S14S0200000_4(this, paymentMethod2, 33), findViewById2);
            C45804HyK.LJJIJIIJIL(this.LJLIL.findViewById(R.id.g0z));
        } else {
            C45804HyK.LJJIJIIJIL(this.LJLIL.findViewById(R.id.au5));
        }
        B1N b1n = this.LJLJJLL;
        if (b1n != null) {
            CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList3 = item.LIZJ;
            if (copyOnWriteArrayList3 != null) {
                list = ORZ.LLILLL(copyOnWriteArrayList3, this.LJLJLJ);
            } else {
                list = null;
            }
            b1n.LJLIL.clear();
            if (list != null) {
                b1n.LJLIL.addAll(list);
            }
            b1n.notifyDataSetChanged();
        }
        if (item.LIZJ != null && (!r5.isEmpty())) {
            this.LJLIL.findViewById(R.id.lym).getClass();
            View findViewById3 = this.LJLIL.findViewById(R.id.lym);
            o.LJIIIIZZ(findViewById3, "view.tvViewMore");
            OUP.LJJLIIIJ(findViewById3);
            C78946Uyc.LJJIIJZLJL(this.LJLIL, new C70918RsQ(0), C28126B2c.LJLIL, B25.LJLIL);
            View findViewById4 = this.LJLIL.findViewById(R.id.lym);
            o.LJIIIIZZ(findViewById4, "view.tvViewMore");
            C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 87, 42), findViewById4);
        }
        PaymentInfo paymentInfo = this.LJLJI;
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            BillingAddressData billingAddressData = item.LJII;
            String[] strArr = new String[5];
            if (billingAddressData != null) {
                str = billingAddressData.getBillingAddressLine();
            } else {
                str = null;
            }
            strArr[0] = str;
            if (billingAddressData != null) {
                str2 = billingAddressData.getBillingCity();
            } else {
                str2 = null;
            }
            strArr[1] = str2;
            if (billingAddressData != null) {
                str3 = billingAddressData.getBillingState();
            } else {
                str3 = null;
            }
            strArr[2] = str3;
            if (billingAddressData != null) {
                str4 = billingAddressData.getBillingCountryRegionCode();
            } else {
                str4 = null;
            }
            strArr[3] = str4;
            if (billingAddressData != null) {
                str7 = billingAddressData.getBillingPostalCode();
            }
            strArr[4] = str7;
            String LLD = ORZ.LLD(ORY.LJJIJLIJ(strArr), ",", null, null, null, 62);
            if (LLD.length() == 0) {
                C45804HyK.LJJIJIIJIL(this.LJLIL.findViewById(R.id.g0z));
                return;
            }
            C27949Ay1.LIZ.LJIIJ(paymentMethod, L().fw0(false));
            View findViewById5 = this.LJLIL.findViewById(R.id.g0z);
            o.LJIIIIZZ(findViewById5, "view.llOSPBillingAddress");
            C16880lQ.LJIIJ(new Au2S14S0200000_4(this, paymentMethod, 34), findViewById5);
            View findViewById6 = this.LJLIL.findViewById(R.id.g0z);
            o.LJIIIIZZ(findViewById6, "view.llOSPBillingAddress");
            OUP.LJJLIIIJ(findViewById6);
            ((TextView) this.LJLIL.findViewById(R.id.lvk)).setText(LLD);
            ((TextView) this.LJLIL.findViewById(R.id.lvk)).setLineSpacing(C45804HyK.LJJ(16), C45804HyK.LJJ(0));
        }
    }
}
