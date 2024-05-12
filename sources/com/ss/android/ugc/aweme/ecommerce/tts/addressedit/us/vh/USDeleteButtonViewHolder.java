package com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh;

import X.C16880lQ;
import X.C62822Ol8;
import X.C70918RsQ;
import X.C78946Uyc;
import X.C78948Uye;
import X.InterfaceC71003Rtn;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USDeleteButtonViewHolder extends ECJediViewHolder {
    public boolean LJLIL;
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

    public final AddressEditViewModel getViewModel() {
        return (AddressEditViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object item) {
        o.LJIIIZ(item, "item");
        if (!getViewModel().LLJILJIL) {
            return;
        }
        if (!this.LJLIL) {
            this.LJLIL = true;
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            InterfaceC71003Rtn LJIILIIL = C78948Uye.LJIILIIL(itemView);
            if (LJIILIIL != null) {
                C78946Uyc.LJJII(LJIILIIL, new C70918RsQ(0), new AqS170S0100000_4(this, 1624));
            }
        }
        View delete_btn_layout = _$_findCachedViewById(R.id.c6a);
        o.LJIIIIZZ(delete_btn_layout, "delete_btn_layout");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 119, 42), delete_btn_layout);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public USDeleteButtonViewHolder(android.view.ViewGroup r4, com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment r5) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.LJLJI = r0
            android.content.Context r2 = r4.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r1 = 2131559191(0x7f0d0317, float:1.874372E38)
            r0 = 0
            android.view.View r0 = X.C27532ArI.LIZ(r1, r2, r4, r0)
            r3.<init>(r0)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.class
            X.Prg r2 = X.C65352Pkq.LIZ(r0)
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4
            r0 = 111(0x6f, float:1.56E-43)
            r1.<init>(r3, r2, r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLILLLLZI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USDeleteButtonViewHolder.<init>(android.view.ViewGroup, com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment):void");
    }
}
