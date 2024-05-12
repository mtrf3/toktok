package com.ss.android.ugc.aweme.ecommerce.core.view.speclayoutv2;

import X.C16880lQ;
import X.C26706Ady;
import X.C27533ArJ;
import X.C45804HyK;
import X.C62850Ola;
import X.C70053ReT;
import X.C70240RhU;
import X.C70241RhV;
import X.C70918RsQ;
import X.C76800UCe;
import X.C78946Uyc;
import X.InterfaceC65784Pro;
import X.OUP;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class SingleSpecLayoutV2 extends FrameLayout implements c {
    public Map<Integer, View> _$_findViewCache;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SingleSpecLayoutV2(Context context) {
        this(context, null, 0, 6, 0 == true ? 1 : 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SingleSpecLayoutV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        o.LJIIIZ(context, "context");
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    private final boolean showSizeGuide(SizeGuide sizeGuide, List<SaleProp> list) {
        String str;
        for (SaleProp saleProp : list) {
            if (sizeGuide != null) {
                str = sizeGuide.showSalePropId;
            } else {
                str = null;
            }
            if (o.LJ(str, saleProp.propId)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleSpecLayoutV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C62850Ola.LJFF(context, "context");
        C27533ArJ.LIZ(R.layout.a7v, context, this, true);
    }

    public final void initSingleSkuView(List<SaleProp> list, SizeGuide sizeGuide, InterfaceC65784Pro<C76800UCe> openSizeGuide) {
        o.LJIIIZ(openSizeGuide, "openSizeGuide");
        if (list == null || list.isEmpty()) {
            return;
        }
        C45804HyK.LJJLL(_$_findCachedViewById(R.id.k11));
        TextView textView = (TextView) _$_findCachedViewById(R.id.ltm);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        textView.setText(C70053ReT.LJFF(context, list));
        if (sizeGuide != null && showSizeGuide(sizeGuide, list)) {
            C45804HyK.LJJLL(_$_findCachedViewById(R.id.ltn));
            ((TextView) _$_findCachedViewById(R.id.ltn)).setText(sizeGuide.skuSizeGuideTitle);
            View ttv_single_size_guide = _$_findCachedViewById(R.id.ltn);
            o.LJIIIIZZ(ttv_single_size_guide, "ttv_single_size_guide");
            C16880lQ.LJIIJ(new Au2S20S0100000_12((InterfaceC65784Pro) openSizeGuide, 27), ttv_single_size_guide);
            View ttv_single_size_guide2 = _$_findCachedViewById(R.id.ltn);
            o.LJIIIIZZ(ttv_single_size_guide2, "ttv_single_size_guide");
            C78946Uyc.LJJIIJZLJL(ttv_single_size_guide2, new C70918RsQ(0), C70241RhV.LJLIL, C70240RhU.LJLIL);
            return;
        }
        View ttv_single_size_guide3 = _$_findCachedViewById(R.id.ltn);
        o.LJIIIIZZ(ttv_single_size_guide3, "ttv_single_size_guide");
        OUP.LJIJJLI(ttv_single_size_guide3);
    }

    public /* synthetic */ SingleSpecLayoutV2(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
