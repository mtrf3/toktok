package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.C252989wM;
import X.C27021Aj3;
import X.C62822Ol8;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.RegionSelectHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RegionSelectItemViewHolder extends BaseViewHolder {
    public final FragmentManager LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public RegionSelectHelper LJLJI;
    public final Map<Integer, View> LJLJJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final RegionSelectHelper L() {
        if (this.LJLJI == null) {
            View view = this.itemView;
            o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.address.widget.inputitem.InputItem");
            this.LJLJI = new RegionSelectHelper((C252989wM) view, this.LJLIL, getViewModel(), false, 8, null);
        }
        return this.LJLJI;
    }

    public final AddressEditViewModel getViewModel() {
        return (AddressEditViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        RegionSelectHelper L = L();
        if (L != null) {
            L.onCreate();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        super.onDestroy();
        RegionSelectHelper regionSelectHelper = this.LJLJI;
        if (regionSelectHelper != null) {
            regionSelectHelper.onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    public final void onBind(C27021Aj3 item) {
        o.LJIIIZ(item, "item");
        super.onBind(item);
        RegionSelectHelper L = L();
        if (L != null) {
            L.onBind(item);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void onBind(Object obj) {
        onBind((C27021Aj3) obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RegionSelectItemViewHolder(android.view.ViewGroup r4, androidx.fragment.app.FragmentManager r5) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            java.util.LinkedHashMap r0 = X.C44878HjO.LIZIZ(r4, r0)
            r3.LJLJJI = r0
            android.content.Context r2 = r4.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r1 = 2131559204(0x7f0d0324, float:1.8743745E38)
            r0 = 0
            android.view.View r0 = X.C27532ArI.LIZ(r1, r2, r4, r0)
            r3.<init>(r0)
            r3.LJLIL = r5
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.class
            X.Prg r2 = X.C65352Pkq.LIZ(r0)
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4
            r0 = 10
            r1.<init>(r3, r2, r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLILLLLZI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.RegionSelectItemViewHolder.<init>(android.view.ViewGroup, androidx.fragment.app.FragmentManager):void");
    }
}
