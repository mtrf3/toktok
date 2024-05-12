package com.ss.android.ugc.aweme.ecommerce.base.osp.module.address;

import X.C16880lQ;
import X.C1XY;
import X.C221108m2;
import X.C26508Aam;
import X.C26559Abb;
import X.C26566Abi;
import X.C27949Ay1;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7MY;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S10S0300000_4;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressVH extends ECJediViewHolder {
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public String LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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
        C26508Aam.LIZ(this.LJLIL, true);
    }

    public AddressVH(View view) {
        super(view);
        this.LJLIL = view;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 22));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        String str;
        C26566Abi item = (C26566Abi) obj;
        o.LJIIIZ(item, "item");
        if (item.LJI) {
            str = "edit_shipping";
        } else {
            str = "add_new_shipping";
        }
        if (!o.LJ(str, this.LJLJI)) {
            C27949Ay1.LJJIFFI(C27949Ay1.LIZ, str, L().fw0(false), null, null, null, null, null, 2044);
            this.LJLJI = str;
        }
        View view = this.LJLIL;
        if (item.LJI) {
            view.findViewById(R.id.e2e).setVisibility(0);
            _$_findCachedViewById(R.id.k8n).setVisibility(0);
            view.findViewById(R.id.h1m).setVisibility(8);
            View view2 = this.LJLIL;
            if (C1XY.LJJ()) {
                ((ImageView) ((C26559Abb) view2.findViewById(R.id.e2e))._$_findCachedViewById(R.id.i13)).setVisibility(8);
                String str2 = ((C26566Abi) getItem()).LJIILIIL;
                if (str2 == null || str2.length() == 0) {
                    view2.findViewById(R.id.x8).setVisibility(8);
                } else {
                    view2.findViewById(R.id.x8).setVisibility(0);
                    ((TextView) view2.findViewById(R.id.x8)).setText(((C26566Abi) getItem()).LJIILIIL);
                    View findViewById = view2.findViewById(R.id.e2e);
                    ViewGroup.LayoutParams layoutParams = view2.findViewById(R.id.e2e).getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = C7MY.LIZIZ(37);
                    findViewById.setLayoutParams(layoutParams2);
                }
                ((TuxTextView) ((C26559Abb) view2.findViewById(R.id.e2e))._$_findCachedViewById(R.id.gvv)).setTuxFont(52);
                ((TuxTextView) ((C26559Abb) view2.findViewById(R.id.e2e))._$_findCachedViewById(R.id.x4)).setTuxFont(51);
                _$_findCachedViewById(R.id.k8n).setVisibility(8);
            }
            ((C26559Abb) view.findViewById(R.id.e2e)).setAddressInfo(item);
            View has_address_layout = view.findViewById(R.id.e2e);
            o.LJIIIIZZ(has_address_layout, "has_address_layout");
            C16880lQ.LJIIJ(new Au2S10S0300000_4(item, this, view, 11), has_address_layout);
            return;
        }
        view.findViewById(R.id.x8).setVisibility(8);
        view.findViewById(R.id.e2e).setVisibility(8);
        _$_findCachedViewById(R.id.k8n).setVisibility(8);
        view.findViewById(R.id.h1m).setVisibility(0);
        View no_address_layout = view.findViewById(R.id.h1m);
        o.LJIIIIZZ(no_address_layout, "no_address_layout");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 92, 42), no_address_layout);
    }
}
