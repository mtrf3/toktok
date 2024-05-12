package com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder;

import X.AnonymousClass636;
import X.C19N;
import X.C221108m2;
import X.C26338AVi;
import X.C26513Aar;
import X.C27021Aj3;
import X.C32151Nz;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.EnumC26514Aas;
import X.O6R;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class BaseViewHolder extends ECJediViewHolder {
    public Map<Integer, View> _$_findViewCache;
    public final C5H3 viewModel$delegate;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final AddressEditViewModel getViewModel() {
        return (AddressEditViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewHolder(View view) {
        super(view);
        o.LJIIIZ(view, "view");
        this._$_findViewCache = new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(AddressEditViewModel.class);
        this.viewModel$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 7));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(C27021Aj3 item) {
        int i;
        o.LJIIIZ(item, "item");
        EnumC26514Aas enumC26514Aas = item.LJ;
        if (enumC26514Aas == null) {
            i = -1;
        } else {
            i = C26513Aar.LIZ[enumC26514Aas.ordinal()];
        }
        int i2 = R.attr.cl;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                if (!getViewModel().Xv0()) {
                    View view = this.itemView;
                    Integer LIZIZ = C19N.LIZIZ(view, "itemView.context", R.attr.cl);
                    if (LIZIZ != null) {
                        i2 = LIZIZ.intValue();
                    }
                    view.setBackgroundColor(i2);
                } else {
                    this.itemView.setBackgroundResource(R.drawable.aav);
                }
                View itemView = this.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                C26338AVi.LJIIIZ(itemView, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), 23);
                return;
            }
            View view2 = this.itemView;
            Context context = view2.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            view2.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, context));
            return;
        }
        if (!getViewModel().Xv0()) {
            View view3 = this.itemView;
            Integer LIZIZ2 = C19N.LIZIZ(view3, "itemView.context", R.attr.cl);
            if (LIZIZ2 != null) {
                i2 = LIZIZ2.intValue();
            }
            view3.setBackgroundColor(i2);
            return;
        }
        this.itemView.setBackgroundResource(R.drawable.aaw);
    }
}
