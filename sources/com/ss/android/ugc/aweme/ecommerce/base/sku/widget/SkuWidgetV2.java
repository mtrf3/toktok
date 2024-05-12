package com.ss.android.ugc.aweme.ecommerce.base.sku.widget;

import X.C70055ReV;
import X.C70152Rg4;
import X.C70157Rg9;
import X.C73156SnQ;
import X.C78565UsT;
import X.MBB;
import X.TBT;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.core.view.speclayoutv2.SpecListLayoutV2;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuWidgetV2 extends SkuPanelBaseWidget {
    public final SkuPanelFragment LJLIL;
    public final int LJLILLLLZI;
    public LinearLayout LJLJI;
    public SpecListLayoutV2 LJLJJI;
    public final Map<Integer, View> LJLJJL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void initSubscribe() {
        super.initSubscribe();
        C70055ReV c70055ReV = new C70055ReV(this);
        C73156SnQ.LJIIIIZZ(this, getMViewModel(), new TBT() { // from class: X.Rg7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getKeyBoardVisibility();
            }
        }, new AqS194S0100000_12(this, 111));
        C73156SnQ.LJIIJ(this, getMViewModel(), new TBT() { // from class: X.Rg6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuDataState();
            }
        }, new TBT() { // from class: X.Rg8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getForceRefresh();
            }
        }, new TBT() { // from class: X.RfH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuInfo();
            }
        }, new TBT() { // from class: X.ReE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getCheckedSkuArray();
            }
        }, new C70152Rg4(this, c70055ReV));
        C78565UsT.LJJIJ(getMViewModel(), MBB.INSTANCE, new C70157Rg9(this, null));
        C73156SnQ.LJIIIIZZ(this, getMViewModel(), new TBT() { // from class: X.ReK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getLocalSizeSalePropList();
            }
        }, new AqS194S0100000_12(this, 110));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget, com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void initView() {
        super.initView();
        this.LJLJI = (LinearLayout) findView(R.id.k3w);
        Context context = getContainer().getContext();
        o.LJIIIIZZ(context, "container.context");
        SpecListLayoutV2 specListLayoutV2 = new SpecListLayoutV2(context, null, 0, 6, 0 == true ? 1 : 0);
        this.LJLJJI = specListLayoutV2;
        specListLayoutV2.setId(R.id.bo9);
        LinearLayout linearLayout = this.LJLJI;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            LinearLayout linearLayout2 = this.LJLJI;
            if (linearLayout2 != null) {
                SpecListLayoutV2 specListLayoutV22 = this.LJLJJI;
                if (specListLayoutV22 != null) {
                    linearLayout2.addView(specListLayoutV22);
                    return;
                } else {
                    o.LJIJI("specListLayoutV2");
                    throw null;
                }
            }
            o.LJIJI("skuWidgetContainer");
            throw null;
        }
        o.LJIJI("skuWidgetContainer");
        throw null;
    }

    @Override // com.bytedance.widget.Widget
    public final int getLayoutId() {
        return this.LJLILLLLZI;
    }

    public SkuWidgetV2(SkuPanelFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLJJL = new LinkedHashMap();
        this.LJLIL = fragment;
        this.LJLILLLLZI = R.layout.a7r;
    }
}
