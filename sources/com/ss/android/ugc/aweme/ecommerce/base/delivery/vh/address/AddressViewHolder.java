package com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.address;

import X.C16880lQ;
import X.C26508Aam;
import X.C26610AcQ;
import X.C47261Igj;
import X.C62822Ol8;
import X.C73156SnQ;
import X.C78685UuP;
import X.TBT;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS167S0200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressViewHolder extends ECJediViewHolder {
    public final int LJLIL;
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

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        boolean z;
        boolean z2;
        ReachableAddress item = (ReachableAddress) obj;
        o.LJIIIZ(item, "item");
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        boolean z3 = false;
        if (this.latestItemPositionInternal != this.LJLIL - 1) {
            z = true;
        } else {
            z = false;
        }
        C26508Aam.LIZ(itemView, z);
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.widget.AddressInfoCard");
        C26610AcQ c26610AcQ = (C26610AcQ) view;
        c26610AcQ.setHasPrefix(false);
        Boolean bool = item.reachable;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        c26610AcQ.setReachable(z2);
        c26610AcQ.setSuffixType(3);
        Address address = item.address;
        if (address != null) {
            String LIZLLL = address.LIZLLL("name");
            String str = "";
            if (LIZLLL == null) {
                LIZLLL = "";
            }
            c26610AcQ.setNameText(LIZLLL);
            List LJJIJIIJI = C47261Igj.LJJIJIIJI(address.LIZLLL("phone"), address.LIZLLL("alternate_phone"));
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : LJJIJIIJI) {
                if (C78685UuP.LJJJZ((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            c26610AcQ.setPhoneList(arrayList);
            String LIZLLL2 = address.LIZLLL("email");
            if (LIZLLL2 == null) {
                LIZLLL2 = "";
            }
            c26610AcQ.setEmailText(LIZLLL2);
            c26610AcQ.setAddressDetailText(address.LIZ());
            c26610AcQ.setRegionText(Address.LIZIZ(address, false, 3));
            String LIZLLL3 = address.LIZLLL("zipcode");
            if (LIZLLL3 != null) {
                str = LIZLLL3;
            }
            c26610AcQ.setZipcodeText(str);
            C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 55), c26610AcQ);
            Boolean bool2 = item.reachable;
            if (bool2 != null) {
                z3 = bool2.booleanValue();
            }
            c26610AcQ.setClickable(z3);
            C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.AeV
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj3) {
                    return ((AddressSelectState) obj3).getSelectedAddress();
                }
            }, new AqS167S0200000_4(c26610AcQ, address, 35));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AddressViewHolder(android.view.ViewGroup r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            java.util.LinkedHashMap r0 = X.C44878HjO.LIZIZ(r5, r0)
            r4.LJLJI = r0
            X.AcQ r3 = new X.AcQ
            android.content.Context r2 = r5.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r1 = 0
            r0 = 0
            r3.<init>(r2, r0, r1)
            r4.<init>(r3)
            r4.LJLIL = r6
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel.class
            X.Prg r2 = X.C65352Pkq.LIZ(r0)
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4
            r0 = 20
            r1.<init>(r4, r2, r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r4.LJLILLLLZI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.address.AddressViewHolder.<init>(android.view.ViewGroup, int):void");
    }
}
