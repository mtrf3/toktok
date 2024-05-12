package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.core.view.skc.SkuFlowLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf.DefaultTtfSkcStyle;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf.ITtfSkcStyle;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rhb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70247Rhb extends ConstraintLayout implements InterfaceC70268Rhw {
    public final TuxTextView LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final C70261Rhp LJLJI;
    public final TuxTextView LJLJJI;
    public ITtfSkcStyle LJLJJL;
    public View LJLJJLL;
    public final java.util.Map<Integer, View> LJLJL;

    public /* synthetic */ C70247Rhb() {
        throw null;
    }

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public TuxTextView getDescTextView() {
        return this.LJLILLLLZI;
    }

    public final View getSizeGuideView() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC70268Rhw
    public C70261Rhp getSkuChooseGroupView() {
        return this.LJLJI;
    }

    public final ITtfSkcStyle getSkuStyle() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC70268Rhw
    public TuxTextView getTitleTextView() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC70268Rhw
    public final void LJJIII(SaleProp saleProp) {
        SalePropValue salePropValue;
        int selectIndex = getSkuChooseGroupView().getSelectIndex();
        List<SalePropValue> list = saleProp.salePropValueList;
        if (list != null) {
            salePropValue = (SalePropValue) ORZ.LJLLLLLL(selectIndex, list);
        } else {
            salePropValue = null;
        }
        if (salePropValue != null && selectIndex >= 0 && selectIndex < saleProp.salePropValueList.size()) {
            getTitleTextView().setText(saleProp.propName);
            this.LJLJJI.setText(": ");
            getDescTextView().setText(salePropValue.propValue);
        } else {
            getTitleTextView().setText(saleProp.propName);
            this.LJLJJI.setText(": ");
            getDescTextView().setText(getContext().getString(R.string.sly));
        }
    }

    public final void setSizeGuideView(View view) {
        this.LJLJJLL = view;
    }

    public final void setSkuStyle(ITtfSkcStyle iTtfSkcStyle) {
        o.LJIIIZ(iTtfSkcStyle, "<set-?>");
        this.LJLJJL = iTtfSkcStyle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70247Rhb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJL = new LinkedHashMap();
        this.LJLJJL = new DefaultTtfSkcStyle();
        C27531ArH.LIZ(R.layout.a7f, context, this, true);
        View findViewById = findViewById(R.id.k2t);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.sku_container_title)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = findViewById(R.id.k2u);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.sku_container_title_colon)");
        this.LJLJJI = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.k2s);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.sku_container_desc)");
        this.LJLILLLLZI = (TuxTextView) findViewById3;
        View findViewById4 = findViewById(R.id.k2p);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.sku_choose_container)");
        this.LJLJI = (C70261Rhp) findViewById4;
        setClipChildren(false);
    }

    public final void LJJLL(SizeGuide sizeGuide, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        TextView textView;
        C018905p c018905p;
        o.LJIIIZ(sizeGuide, "sizeGuide");
        if (this.LJLJJLL == null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            View LIZ = C27531ArH.LIZ(R.layout.a7d, context, this, false);
            C16880lQ.LJIIJ(new Au2S20S0100000_12((InterfaceC65784Pro) interfaceC65784Pro, 81), LIZ);
            int generateViewId = View.generateViewId();
            LIZ.setId(generateViewId);
            C018905p c018905p2 = new C018905p(-2, -2);
            c018905p2.startToEnd = R.id.k2v;
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.k2v).getLayoutParams();
            if ((layoutParams instanceof C018905p) && (c018905p = (C018905p) layoutParams) != null) {
                c018905p.endToStart = generateViewId;
            }
            c018905p2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
            c018905p2.endToEnd = 0;
            c018905p2.topToTop = 0;
            LIZ.setLayoutParams(c018905p2);
            ((ViewGroup) _$_findCachedViewById(R.id.bs8)).addView(LIZ);
            this.LJLJJLL = LIZ;
            C78946Uyc.LJJIIJZLJL(LIZ, new C70920RsS(), C70250Rhe.LJLIL, C70249Rhd.LJLIL);
        }
        View view = this.LJLJJLL;
        if (view == null || (textView = (TextView) view.findViewById(R.id.k1r)) == null) {
            return;
        }
        textView.setText(sizeGuide.skuSizeGuideTitle);
    }

    public final void LJJLJLI(SaleProp prop, List<SaleProp> list, SkcInfo skcInfo, int i) {
        int i2;
        boolean z;
        SkuFlowLayoutManager skuFlowLayoutManager;
        int firstSpecMarginTop;
        SkuFlowLayoutManager skuFlowLayoutManager2;
        List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc> list2;
        o.LJIIIZ(prop, "prop");
        int i3 = 0;
        if (skcInfo != null && (list2 = skcInfo.skcList) != null) {
            i2 = list2.size();
        } else {
            i2 = 0;
        }
        if (i2 <= 1) {
            z = true;
        } else {
            z = false;
        }
        String str = prop.propId;
        String str2 = null;
        if (skcInfo != null) {
            str2 = skcInfo.skcPropertyId;
        }
        if (o.LJ(str, str2)) {
            C70261Rhp skuChooseGroupView = getSkuChooseGroupView();
            int LIZIZ = C7MY.LIZIZ(10);
            int LIZIZ2 = C7MY.LIZIZ(10);
            skuChooseGroupView.LJLILLLLZI = LIZIZ;
            skuChooseGroupView.LJLIL = LIZIZ2;
            C0A2 layoutManager = skuChooseGroupView.LJLJL.getLayoutManager();
            if ((layoutManager instanceof SkuFlowLayoutManager) && (skuFlowLayoutManager2 = (SkuFlowLayoutManager) layoutManager) != null) {
                skuFlowLayoutManager2.LJLZ = LIZIZ2;
                skuFlowLayoutManager2.LJZ();
            }
            if (z) {
                setVisibility(8);
            }
        } else if (!o.LJ(prop.hasImage, Boolean.TRUE)) {
            C70261Rhp skuChooseGroupView2 = getSkuChooseGroupView();
            int LIZIZ3 = C7MY.LIZIZ(8);
            int LIZIZ4 = C7MY.LIZIZ(8);
            skuChooseGroupView2.LJLILLLLZI = LIZIZ3;
            skuChooseGroupView2.LJLIL = LIZIZ4;
            C0A2 layoutManager2 = skuChooseGroupView2.LJLJL.getLayoutManager();
            if ((layoutManager2 instanceof SkuFlowLayoutManager) && (skuFlowLayoutManager = (SkuFlowLayoutManager) layoutManager2) != null) {
                skuFlowLayoutManager.LJLZ = LIZIZ4;
                skuFlowLayoutManager.LJZ();
            }
        }
        if (getVisibility() != 8) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (i == 0 || z) {
                firstSpecMarginTop = this.LJLJJL.getFirstSpecMarginTop();
            } else {
                firstSpecMarginTop = C7MY.LIZIZ(24);
            }
            layoutParams.topMargin = firstSpecMarginTop;
            if (list != null) {
                i3 = list.size();
            }
            if (i == i3 - 1) {
                layoutParams.bottomMargin = C7MY.LIZIZ(24);
            }
            setLayoutParams(layoutParams);
        }
        this.LJLJJI.setText(": ");
        getDescTextView().setText(getContext().getString(R.string.sly));
    }
}
