package com.ss.android.ugc.aweme.ecommerce.us.osp.module.payment;

import X.B1O;
import X.B1S;
import X.B23;
import X.C16880lQ;
import X.C221108m2;
import X.C26508Aam;
import X.C27949Ay1;
import X.C28002Ays;
import X.C28125B2b;
import X.C45804HyK;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70918RsQ;
import X.C73156SnQ;
import X.C78685UuP;
import X.C78946Uyc;
import X.ORZ;
import X.OUP;
import X.TBT;
import X.TBV;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
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
public final class USPaymentInfoVH extends ECJediViewHolder {
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public PaymentInfo LJLJI;
    public Boolean LJLJJI;
    public B1S LJLJJL;
    public B1O LJLJJLL;
    public boolean LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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
        C73156SnQ.LJIIIIZZ(this, L(), new TBT() { // from class: X.AxV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getPageStatus();
            }
        }, new AqS186S0100000_4(this, 258));
        View view = this.LJLIL;
        this.LJLJJLL = new B1O(this);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.hjn);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) view.findViewById(R.id.hjn)).setAdapter(this.LJLJJLL);
        C73156SnQ.LJIIIIZZ(this, L(), new TBT() { // from class: X.B08
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((OrderSubmitState) obj).getCheckPayment());
            }
        }, new AqS186S0100000_4(this, 99));
        C73156SnQ.LJIIIIZZ(this, L(), new TBV() { // from class: X.B09
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getUserPaymentInfo();
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((OrderSubmitState) obj).setUserPaymentInfo((PaymentInfo) obj2);
            }
        }, new AqS186S0100000_4(this, 100));
    }

    public USPaymentInfoVH(View view) {
        super(view);
        this.LJLIL = view;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 131));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        boolean z;
        int i;
        int i2;
        PaymentMethod paymentMethod;
        String str;
        String str2;
        C28002Ays item = (C28002Ays) obj;
        o.LJIIIZ(item, "item");
        this.LJLJI = item.LIZIZ;
        this.LJLJJI = item.LIZ;
        boolean z2 = true;
        if (!this.LJLJL) {
            this.LJLJL = true;
            C27949Ay1.LJJIFFI(C27949Ay1.LIZ, "payment_method", L().fw0(false), null, null, null, null, null, 2044);
        }
        ArrayList arrayList = new ArrayList();
        List<PaymentMethod> list = item.LIZLLL;
        if (list != null) {
            arrayList.addAll(list);
        }
        List<PaymentMethod> list2 = item.LJ;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList = item.LIZJ;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        List list3 = null;
        if (z) {
            CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList2 = item.LIZJ;
            if (copyOnWriteArrayList2 != null) {
                paymentMethod = (PaymentMethod) ORZ.LJLLLL(copyOnWriteArrayList2);
            } else {
                paymentMethod = null;
            }
            C27949Ay1 c27949Ay1 = C27949Ay1.LIZ;
            HashMap<String, Object> fw0 = L().fw0(false);
            if (paymentMethod != null) {
                str = paymentMethod.LJIIL();
                str2 = paymentMethod.extraInfo;
            } else {
                str = null;
                str2 = null;
            }
            C27949Ay1.LJJIFFI(c27949Ay1, "add_new_payment", fw0, null, str, Boolean.valueOf(C78685UuP.LJJJZ(str2)), null, null, 1852);
            View findViewById = this.LJLIL.findViewById(R.id.au5);
            o.LJIIIIZZ(findViewById, "view.btnAddPaymentMethod");
            OUP.LJJLIIIJ(findViewById);
            View findViewById2 = this.LJLIL.findViewById(R.id.au5);
            o.LJIIIIZZ(findViewById2, "view.btnAddPaymentMethod");
            C16880lQ.LJIIJ(new Au2S14S0200000_4(this, paymentMethod, 25), findViewById2);
        } else {
            C45804HyK.LJJIJIIJIL(this.LJLIL.findViewById(R.id.au5));
        }
        B1O b1o = this.LJLJJLL;
        if (b1o != null) {
            CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList3 = item.LIZJ;
            if (copyOnWriteArrayList3 != null) {
                list3 = ORZ.LLILLL(copyOnWriteArrayList3, 4);
            }
            b1o.LJLIL.clear();
            if (list3 != null) {
                b1o.LJLIL.addAll(list3);
            }
            b1o.notifyDataSetChanged();
        }
        if (item.LIZJ == null || !(!r4.isEmpty())) {
            z2 = false;
        }
        if (z2) {
            int min = Math.min(item.LIZJ.size(), 4);
            List<PaymentMethod> list4 = item.LJ;
            if (list4 != null) {
                i = list4.size();
            } else {
                i = 0;
            }
            List<PaymentMethod> list5 = item.LIZLLL;
            if (list5 != null) {
                i2 = list5.size();
            } else {
                i2 = 0;
            }
            int size = PaymentCacheHelper.LJ().size() + i + i2;
            if (size > min || size > 4) {
                View findViewById3 = this.LJLIL.findViewById(R.id.n_9);
                o.LJIIIIZZ(findViewById3, "view.view_all");
                OUP.LJJLIIIJ(findViewById3);
                C78946Uyc.LJJIIJZLJL(this.LJLIL, new C70918RsQ(0), C28125B2b.LJLIL, B23.LJLIL);
                View findViewById4 = this.LJLIL.findViewById(R.id.n_9);
                o.LJIIIIZZ(findViewById4, "view.view_all");
                C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 63, 42), findViewById4);
                return;
            }
            C45804HyK.LJJIJIIJIL(this.LJLIL.findViewById(R.id.n_9));
            return;
        }
        C45804HyK.LJJIJIIJIL(this.LJLIL.findViewById(R.id.n_9));
    }
}
