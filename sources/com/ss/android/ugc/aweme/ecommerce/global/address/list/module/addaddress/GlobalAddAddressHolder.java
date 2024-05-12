package com.ss.android.ugc.aweme.ecommerce.global.address.list.module.addaddress;

import X.C16880lQ;
import X.C1FL;
import X.C221108m2;
import X.C26508Aam;
import X.C26620Aca;
import X.C44878HjO;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70918RsQ;
import X.C78946Uyc;
import X.C78948Uye;
import X.InterfaceC71003Rtn;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GlobalAddAddressHolder extends ECJediViewHolder {
    public final C62822Ol8 LJLIL;
    public boolean LJLILLLLZI;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalAddAddressHolder(ViewGroup viewGroup) {
        super(C1FL.LIZIZ(viewGroup, R.layout.z2, viewGroup, false, "from(parent.context).inf…_add_item, parent, false)"));
        this.LJLJI = C44878HjO.LIZIZ(viewGroup, "parent");
        C65776Prg LIZ = C65352Pkq.LIZ(AddressListViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 85));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object item) {
        boolean z;
        o.LJIIIZ(item, "item");
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        if (this.latestItemPositionInternal != ((ArrayList) ((AddressListViewModel) this.LJLIL.getValue()).LJLLI).size()) {
            z = true;
        } else {
            z = false;
        }
        C26508Aam.LIZ(itemView, z);
        if (!this.LJLILLLLZI) {
            this.LJLILLLLZI = true;
            View itemView2 = this.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            InterfaceC71003Rtn LJIILIIL = C78948Uye.LJIILIIL(itemView2);
            if (LJIILIIL != null) {
                C78946Uyc.LJJII(LJIILIIL, new C70918RsQ(0), C26620Aca.LJLIL);
            }
        }
        View itemView3 = this.itemView;
        o.LJIIIIZZ(itemView3, "itemView");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 72, 42), itemView3);
    }
}
