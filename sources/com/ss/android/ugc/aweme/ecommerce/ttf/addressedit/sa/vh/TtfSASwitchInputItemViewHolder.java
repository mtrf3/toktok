package com.ss.android.ugc.aweme.ecommerce.ttf.addressedit.sa.vh;

import X.AI8;
import X.C1FJ;
import X.C26338AVi;
import X.C44878HjO;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SwitchInputItemViewHolder;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class TtfSASwitchInputItemViewHolder extends SwitchInputItemViewHolder {
    public final Map<Integer, View> LJLJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SwitchInputItemViewHolder, com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SwitchInputItemViewHolder, com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SwitchInputItemViewHolder, com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.BaseViewHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtfSASwitchInputItemViewHolder(ViewGroup viewGroup) {
        super(viewGroup);
        this.LJLJI = C44878HjO.LIZIZ(viewGroup, "parent");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SwitchInputItemViewHolder
    public final void L(AI8 ai8) {
        C26338AVi.LJI(ai8, C1FJ.LIZIZ(0), C1FJ.LIZIZ(0), C1FJ.LIZIZ(0), C1FJ.LIZIZ(0), false, 16);
    }
}
