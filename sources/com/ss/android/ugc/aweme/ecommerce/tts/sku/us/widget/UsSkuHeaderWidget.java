package com.ss.android.ugc.aweme.ecommerce.tts.sku.us.widget;

import X.C16880lQ;
import X.C73156SnQ;
import X.C7MY;
import X.TBT;
import Y.ACListenerS32S0100000_12;
import Y.ARunnableS6S0201000_3;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class UsSkuHeaderWidget extends SkuPanelBaseWidget {
    public final SkuPanelFragment LJLIL;
    public final int LJLILLLLZI;
    public float LJLJI;
    public final Map<Integer, View> LJLJJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget, com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void initSubscribe() {
        super.initSubscribe();
        SkuPanelViewModel mViewModel = getMViewModel();
        C73156SnQ.LJIIIIZZ(this, mViewModel, new TBT() { // from class: X.Rjk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getCurrentImage();
            }
        }, new AqS194S0100000_12(this, 122));
        C73156SnQ.LJIIIIZZ(this, mViewModel, new TBT() { // from class: X.Rjm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getCurrentPrice();
            }
        }, new AqS194S0100000_12(this, 123));
        C73156SnQ.LJIIIIZZ(this, mViewModel, new TBT() { // from class: X.Rjn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getOriginalPrice();
            }
        }, new AqS194S0100000_12(this, 124));
        C73156SnQ.LJIIIIZZ(this, mViewModel, new TBT() { // from class: X.Rjf
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getProductTitle();
            }
        }, new AqS194S0100000_12(this, 125));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void initView() {
        super.initView();
        View view = this.contentView;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 54), view);
        }
        C16880lQ.LJJIJLIJ((SmartImageView) _$_findCachedViewById(R.id.k3i), new ACListenerS32S0100000_12(this, 55));
        TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.k2q);
        int LIZIZ = C7MY.LIZIZ(10);
        if (tuxIconView != null) {
            Object parent = tuxIconView.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            view2.post(new ARunnableS6S0201000_3(LIZIZ, tuxIconView, view2, 2));
        }
        View sku_close_btn = _$_findCachedViewById(R.id.k2q);
        o.LJIIIIZZ(sku_close_btn, "sku_close_btn");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 29, 42), sku_close_btn);
    }

    @Override // com.bytedance.widget.Widget
    public final int getLayoutId() {
        return this.LJLILLLLZI;
    }

    public UsSkuHeaderWidget(SkuPanelFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLJJI = new LinkedHashMap();
        this.LJLIL = fragment;
        this.LJLILLLLZI = R.layout.a9o;
        this.LJLJI = 1.0f;
    }
}
