package com.ss.android.ugc.aweme.ecommerce.base.sku.widget;

import X.C70057ReX;
import X.C70158RgA;
import X.C70282RiA;
import X.C73156SnQ;
import X.C78565UsT;
import X.MBB;
import X.TBT;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuWidget extends SkuPanelBaseWidget {
    public final BaseSkuFragment LJLIL;
    public final int LJLILLLLZI;
    public LinearLayout LJLJI;
    public C70282RiA LJLJJI;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget, com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void initSubscribe() {
        super.initSubscribe();
        C70282RiA c70282RiA = this.LJLJJI;
        if (c70282RiA != null) {
            c70282RiA.setCheckedChangeListener(new C70057ReX(this));
            C73156SnQ.LJIIIIZZ(this, getMViewModel(), new TBT() { // from class: X.RgZ
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((SkuState) obj).getKeyBoardVisibility();
                }
            }, new AqS194S0100000_12(this, 108));
            C73156SnQ.LJII(this, getMViewModel(), new TBT() { // from class: X.RgE
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((SkuState) obj).getSkuDataState();
                }
            }, new TBT() { // from class: X.RgB
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((SkuState) obj).getForceRefresh();
                }
            }, new IDqS436S0100000_12(this, 9));
            C78565UsT.LJJIJ(getMViewModel(), MBB.INSTANCE, new C70158RgA(this, null));
            C73156SnQ.LJIIIIZZ(this, getMViewModel(), new TBT() { // from class: X.ReL
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((SkuState) obj).getLocalSizeSalePropList();
                }
            }, new AqS194S0100000_12(this, 109));
            return;
        }
        o.LJIJI("specListLayout");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void initView() {
        super.initView();
        this.LJLJI = (LinearLayout) findView(R.id.k3w);
        Context context = getContainer().getContext();
        o.LJIIIIZZ(context, "container.context");
        C70282RiA c70282RiA = new C70282RiA(context, null, 0);
        this.LJLJJI = c70282RiA;
        c70282RiA.setId(R.id.bo9);
        LinearLayout linearLayout = this.LJLJI;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            LinearLayout linearLayout2 = this.LJLJI;
            if (linearLayout2 != null) {
                C70282RiA c70282RiA2 = this.LJLJJI;
                if (c70282RiA2 != null) {
                    linearLayout2.addView(c70282RiA2);
                    return;
                } else {
                    o.LJIJI("specListLayout");
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

    public SkuWidget(BaseSkuFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLJJL = new LinkedHashMap();
        this.LJLIL = fragment;
        this.LJLILLLLZI = R.layout.a7r;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer LIZ(int r7, android.view.ViewGroup r8, java.lang.String r9) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel r3 = r6.getMViewModel()
            kotlin.jvm.internal.AqS162S0100000_12 r5 = new kotlin.jvm.internal.AqS162S0100000_12
            r0 = 511(0x1ff, float:7.16E-43)
            r5.<init>(r6, r0)
            r3.getClass()
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r3.LJLLL
            r2 = 0
            if (r0 == 0) goto L75
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase r0 = r0.baseInfo
            if (r0 == 0) goto L75
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide r1 = r0.sizeGuide
            if (r1 == 0) goto L76
            java.lang.String r0 = r1.showSalePropId
        L22:
            boolean r0 = r3.Yv0(r7, r9, r0)
            if (r0 == 0) goto L71
            r0 = 2131559574(0x7f0d0496, float:1.8744496E38)
            r4 = 0
            android.view.View r3 = X.C28289B8j.LIZ(r8, r0, r8, r4)
            r0 = 2131376170(0x7f0a382a, float:1.8372508E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r1 == 0) goto L3f
            java.lang.String r2 = r1.skuSizeGuideButtonText
            if (r2 == 0) goto L72
        L3f:
            r0.setText(r2)
            X.RsS r2 = new X.RsS
            r2.<init>()
            X.Rga r1 = X.C70184Rga.LJLIL
            X.Rd9 r0 = X.C69971Rd9.LJLIL
            X.C78946Uyc.LJJIIJZLJL(r3, r2, r1, r0)
            com.ss.android.ugc.aweme.utils.Au2S20S0100000_12 r2 = new com.ss.android.ugc.aweme.utils.Au2S20S0100000_12
            r1 = 53
            r0 = 42
            r2.<init>(r5, r1, r0)
            X.C16880lQ.LJIIJ(r2, r3)
            X.05p r1 = new X.05p
            r0 = -2
            r1.<init>(r0, r0)
            r1.endToEnd = r4
            r1.topToTop = r4
            r1.bottomToBottom = r4
            r8.addView(r3, r1)
            int r0 = r3.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L71:
            return r2
        L72:
            java.lang.String r2 = r1.skuSizeGuideTitle
            goto L3f
        L75:
            r1 = r2
        L76:
            r0 = r2
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuWidget.LIZ(int, android.view.ViewGroup, java.lang.String):java.lang.Integer");
    }
}
