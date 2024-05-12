package com.ss.android.ugc.aweme.ecommerce.base.sku.widget;

import X.C119774mz;
import X.C70360RjQ;
import X.C73156SnQ;
import X.TBT;
import Y.IDObjectS332S0100000_12;
import Y.IDObjectS5S0101000_12;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuPanelPaymentModuleWidget extends SkuPanelBaseWidget {
    public final int LJLIL;
    public TuxTextView LJLJI;
    public C119774mz LJLJJI;
    public LinearLayout LJLJJL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final int LJLILLLLZI = R.layout.a7p;
    public final LinkedList<C70360RjQ> LJLJJLL = new LinkedList<>();

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    public final void LIZ() {
        C119774mz c119774mz = this.LJLJJI;
        if (c119774mz != null) {
            IDObjectS332S0100000_12 iDObjectS332S0100000_12 = new IDObjectS332S0100000_12(c119774mz, 9);
            ArrayList arrayList = new ArrayList();
            Iterator it = iDObjectS332S0100000_12.iterator();
            while (true) {
                IDObjectS5S0101000_12 iDObjectS5S0101000_12 = (IDObjectS5S0101000_12) it;
                if (!iDObjectS5S0101000_12.hasNext()) {
                    break;
                }
                View view = (View) iDObjectS5S0101000_12.next();
                if ((view instanceof C70360RjQ) && view != null) {
                    arrayList.add(view);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C70360RjQ c70360RjQ = (C70360RjQ) it2.next();
                if (c70360RjQ.LIZJ()) {
                    c70360RjQ.setChecked$ecommerce_transaction_release(false);
                }
            }
            return;
        }
        o.LJIJI("flInstallmentPlanContainer");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void initSubscribe() {
        super.initSubscribe();
        C73156SnQ.LJIIIIZZ(this, getMViewModel(), new TBT() { // from class: X.RjB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getPaymentModule();
            }
        }, new AqS194S0100000_12(this, 107));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void initView() {
        super.initView();
        this.LJLJJL = (LinearLayout) findView(R.id.g6_);
        this.LJLJI = (TuxTextView) findView(R.id.mde);
        this.LJLJJI = (C119774mz) findView(R.id.dee);
    }

    @Override // com.bytedance.widget.Widget
    public final int getLayoutId() {
        return this.LJLILLLLZI;
    }

    public SkuPanelPaymentModuleWidget(int i) {
        this.LJLIL = i;
    }
}
