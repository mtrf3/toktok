package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.C252989wM;
import X.C27021Aj3;
import X.C62822Ol8;
import X.InterfaceC27239AmZ;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.TextInputHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TextInputItemViewHolder extends BaseViewHolder implements InterfaceC27239AmZ {
    public final AddressEditFragment LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public TextInputHelper LJLJI;
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

    @Override // X.InterfaceC27239AmZ
    public final View getFocusView() {
        TextInputHelper textInputHelper = this.LJLJI;
        if (textInputHelper != null) {
            return textInputHelper.getFocusView();
        }
        return null;
    }

    public final AddressEditViewModel getViewModel() {
        return (AddressEditViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC27239AmZ
    public final boolean needFocus() {
        TextInputHelper textInputHelper = this.LJLJI;
        if (textInputHelper != null) {
            return textInputHelper.needFocus();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        super.onDestroy();
        TextInputHelper textInputHelper = this.LJLJI;
        if (textInputHelper != null) {
            textInputHelper.onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder
    public final void onBind(C27021Aj3 item) {
        o.LJIIIZ(item, "item");
        super.onBind(item);
        if (this.LJLJI == null) {
            View view = this.itemView;
            o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.address.widget.inputitem.InputItem");
            this.LJLJI = new TextInputHelper((C252989wM) view, this.LJLIL, getViewModel());
        }
        TextInputHelper textInputHelper = this.LJLJI;
        if (textInputHelper != null) {
            textInputHelper.onBind(item);
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
    public TextInputItemViewHolder(android.view.ViewGroup r4, com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment r5) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.LJLJJI = r0
            android.content.Context r2 = r4.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r1 = 2131559208(0x7f0d0328, float:1.8743754E38)
            r0 = 0
            android.view.View r0 = X.C27532ArI.LIZ(r1, r2, r4, r0)
            r3.<init>(r0)
            r3.LJLIL = r5
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.class
            X.Prg r2 = X.C65352Pkq.LIZ(r0)
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4
            r0 = 13
            r1.<init>(r3, r2, r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLILLLLZI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.TextInputItemViewHolder.<init>(android.view.ViewGroup, com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment):void");
    }
}
