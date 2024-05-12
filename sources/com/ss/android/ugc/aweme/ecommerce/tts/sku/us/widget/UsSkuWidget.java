package com.ss.android.ugc.aweme.ecommerce.tts.sku.us.widget;

import X.C010402i;
import X.C16880lQ;
import X.C30591Hz;
import X.C32151Nz;
import X.C45804HyK;
import X.C47261Igj;
import X.C70053ReT;
import X.C70216Rh6;
import X.C70221RhB;
import X.C70222RhC;
import X.C70232RhM;
import X.C70234RhO;
import X.C70287RiF;
import X.C70917RsP;
import X.C70918RsQ;
import X.C73156SnQ;
import X.C78946Uyc;
import X.C7MY;
import X.EnumC70012Rdo;
import X.EnumC70107RfL;
import X.InterfaceC70291RiJ;
import X.O6R;
import X.ORS;
import X.ORY;
import X.OUP;
import X.TBT;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.core.view.skc.SkuFlowLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.widget.UsSpecUiStyle;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS14S0102000_12;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS5S1102000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class UsSkuWidget extends SkuPanelBaseWidget implements InterfaceC70291RiJ {
    public final SkuPanelFragment LJLIL;
    public final int LJLILLLLZI;
    public final LinkedList<C70287RiF> LJLJI;
    public final UsSpecUiStyle LJLJJI;
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

    static {
        O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void initSubscribe() {
        super.initSubscribe();
        C73156SnQ.LJIIIIZZ(this, getMViewModel(), new TBT() { // from class: X.Rgb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getKeyBoardVisibility();
            }
        }, new AqS194S0100000_12(this, 126));
        C73156SnQ.LJII(this, getMViewModel(), new TBT() { // from class: X.RgD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuDataState();
            }
        }, new TBT() { // from class: X.RgC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getForceRefresh();
            }
        }, new IDqS436S0100000_12(this, 14));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void initView() {
        super.initView();
        View cl_select = _$_findCachedViewById(R.id.bdr);
        o.LJIIIIZZ(cl_select, "cl_select");
        OUP.LJIJJLI(cl_select);
        View cl_singleSku = _$_findCachedViewById(R.id.bds);
        o.LJIIIIZZ(cl_singleSku, "cl_singleSku");
        OUP.LJIJJLI(cl_singleSku);
        if (((ViewGroup) _$_findCachedViewById(R.id.kau)).getChildCount() > 0) {
            ((ViewGroup) _$_findCachedViewById(R.id.kau)).removeAllViews();
        }
    }

    @Override // com.bytedance.widget.Widget
    public final int getLayoutId() {
        return this.LJLILLLLZI;
    }

    public UsSkuWidget(SkuPanelFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLJJL = new LinkedHashMap();
        this.LJLIL = fragment;
        this.LJLILLLLZI = R.layout.a9m;
        this.LJLJI = new LinkedList<>();
        this.LJLJJI = new UsSpecUiStyle();
    }

    public final void LIZ(List<SaleProp> list) {
        SizeGuide sizeGuide;
        ProductBase productBase;
        C45804HyK.LJJLL(_$_findCachedViewById(R.id.bds));
        C45804HyK.LJJLL(_$_findCachedViewById(R.id.k11));
        ((TextView) _$_findCachedViewById(R.id.ltm)).setText(C70053ReT.LJFF(getContext(), list));
        ProductPackStruct productPackStruct = getMViewModel().LJLLL;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null) {
            sizeGuide = productBase.sizeGuide;
        } else {
            sizeGuide = null;
        }
        if (sizeGuide != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                if (o.LJ(sizeGuide.showSalePropId, ((SaleProp) it.next()).propId)) {
                    C45804HyK.LJJLL(_$_findCachedViewById(R.id.ltn));
                    ((TextView) _$_findCachedViewById(R.id.ltn)).setText(sizeGuide.skuSizeGuideTitle);
                    View ttv_single_size_guide = _$_findCachedViewById(R.id.ltn);
                    o.LJIIIIZZ(ttv_single_size_guide, "ttv_single_size_guide");
                    C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 30, 42), ttv_single_size_guide);
                    View ttv_single_size_guide2 = _$_findCachedViewById(R.id.ltn);
                    o.LJIIIIZZ(ttv_single_size_guide2, "ttv_single_size_guide");
                    C78946Uyc.LJJIIJZLJL(ttv_single_size_guide2, new C70918RsQ(0), C70234RhO.LJLIL, C70222RhC.LJLIL);
                    return;
                }
            }
        }
        View ttv_single_size_guide3 = _$_findCachedViewById(R.id.ltn);
        o.LJIIIIZZ(ttv_single_size_guide3, "ttv_single_size_guide");
        OUP.LJIJJLI(ttv_single_size_guide3);
    }

    public final void LIZIZ(Map<Integer, SaleProp> map) {
        SizeGuide sizeGuide;
        String[] strArr;
        List<SkuItem> list;
        String str;
        SizeGuide sizeGuide2;
        ProductBase productBase;
        ProductPackStruct productPackStruct = getMViewModel().LJLLL;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null) {
            sizeGuide = productBase.sizeGuide;
        } else {
            sizeGuide = null;
        }
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            SaleProp saleProp = (SaleProp) entry.getValue();
            C70287RiF c70287RiF = (C70287RiF) ORS.LJJLJLI(this.LJLJI);
            if (c70287RiF == null) {
                c70287RiF = new C70287RiF(getContext(), this.LJLIL, this.LJLJJI);
                View divide_line_view = c70287RiF._$_findCachedViewById(R.id.cd7);
                o.LJIIIIZZ(divide_line_view, "divide_line_view");
                divide_line_view.setVisibility(0);
            }
            C010402i c010402i = new C010402i(-1, -2);
            c70287RiF.setTextLayoutMargin(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
            c70287RiF.setLayoutParams(c010402i);
            SkuFlowLayoutManager skuFlowLayoutManager = new SkuFlowLayoutManager();
            skuFlowLayoutManager.LJLZ = C7MY.LIZIZ(16);
            c70287RiF.setLayoutManager(skuFlowLayoutManager);
            SkuPanelState skuPanelState = getMViewModel().LJLLI;
            if (skuPanelState != null) {
                strArr = skuPanelState.getCheckedSkuIds();
            } else {
                strArr = null;
            }
            ProductPackStruct productPackStruct2 = getMViewModel().LJLLL;
            if (productPackStruct2 != null) {
                list = productPackStruct2.skus;
            } else {
                list = null;
            }
            List LJIIIZ = C30591Hz.LJIIIZ(intValue, saleProp, strArr, list);
            if (sizeGuide != null) {
                str = sizeGuide.showSalePropId;
            } else {
                str = null;
            }
            if (o.LJ(str, saleProp.propId)) {
                sizeGuide2 = sizeGuide;
            } else {
                sizeGuide2 = null;
            }
            c70287RiF.LJJLJLI(saleProp.propName, LJIIIZ, intValue, sizeGuide2, false, new AqS159S0200000_12(sizeGuide, this, 30));
            c70287RiF.LJJZ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
            ((ViewGroup) _$_findCachedViewById(R.id.kau)).addView(c70287RiF);
            c70287RiF.setClickListener(this);
        }
    }

    @Override // X.InterfaceC70291RiJ
    public final void onSizeGuideClick(SizeGuide sizeGuide) {
        getMViewModel().aw0(this.LJLIL);
    }

    @Override // X.InterfaceC70291RiJ
    public final void onSizeGuideShow(View view, SizeGuide sizeGuide) {
        o.LJIIIZ(sizeGuide, "sizeGuide");
        if (view != null) {
            C78946Uyc.LJJIIJZLJL(view, new C70918RsQ(0), C70232RhM.LJLIL, C70221RhB.LJLIL);
        }
    }

    @Override // X.InterfaceC70291RiJ
    public final void onSpecChecked(int i, int i2, C70216Rh6 c70216Rh6) {
        String str;
        int i3;
        String[] strArr;
        String str2;
        SizeGuide sizeGuide;
        C70287RiF c70287RiF;
        String[] strArr2;
        List<SkuItem> list;
        String str3;
        SizeGuide sizeGuide2;
        ProductBase productBase;
        List<SaleProp> list2;
        List<SaleProp> list3;
        Image image;
        SkuPanelState skuPanelState;
        String[] checkedSkuIds;
        String str4;
        int i4 = i2;
        SkuPanelState skuPanelState2 = getMViewModel().LJLLI;
        if (skuPanelState2 != null && (checkedSkuIds = skuPanelState2.getCheckedSkuIds()) != null) {
            Object LJJJJI = ORY.LJJJJI(i, checkedSkuIds);
            if (c70216Rh6 != null) {
                str4 = c70216Rh6.LIZ;
            } else {
                str4 = null;
            }
            if (o.LJ(LJJJJI, str4)) {
                str = "cancel";
            } else {
                str = "select";
            }
        } else {
            str = null;
        }
        C78946Uyc.LJJII(this.LJLIL, new C70917RsP(), new AqS5S1102000_12(str, i, i4, c70216Rh6, 2));
        int i5 = 0;
        if (c70216Rh6 != null && c70216Rh6.LIZJ != null && (image = c70216Rh6.LIZJ) != null && (skuPanelState = getMViewModel().LJLLI) != null) {
            EnumC70012Rdo enumC70012Rdo = EnumC70012Rdo.SKU_ENTRANCE;
            EnumC70107RfL enumC70107RfL = EnumC70107RfL.SKU;
            if (o.LJ(str, "cancel")) {
                i4 = -1;
            }
            skuPanelState.setClickImageSource(new ImageSelectData(image, enumC70012Rdo, enumC70107RfL, i4));
        }
        ProductPackStruct productPackStruct = getMViewModel().LJLLL;
        if (productPackStruct != null && (list3 = productPackStruct.saleProps) != null) {
            i3 = list3.size();
        } else {
            i3 = 0;
        }
        SkuPanelState skuPanelState3 = getMViewModel().LJLLI;
        String str5 = "";
        if (skuPanelState3 == null || (strArr = skuPanelState3.getCheckedSkuIds()) == null) {
            strArr = new String[i3];
            for (int i6 = 0; i6 < i3; i6++) {
                strArr[i6] = "";
            }
        }
        if (strArr.length < i3) {
            strArr = new String[i3];
            int i7 = 0;
            do {
                strArr[i7] = "";
                i7++;
            } while (i7 < i3);
        }
        if (i < strArr.length) {
            if (o.LJ(str, "cancel")) {
                strArr[i] = "";
            } else {
                if (c70216Rh6 != null && (str2 = c70216Rh6.LIZ) != null) {
                    str5 = str2;
                }
                strArr[i] = str5;
            }
            getMViewModel().kw0(strArr);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            SkuInfo skuInfo = getMViewModel().LJLLILLLL;
            if (skuInfo != null && (list2 = skuInfo.salePropList) != null) {
                int i8 = 0;
                for (SaleProp saleProp : list2) {
                    int i9 = i8 + 1;
                    if (i8 >= 0) {
                        SaleProp saleProp2 = saleProp;
                        List<SalePropValue> list4 = saleProp2.salePropValueList;
                        if (list4 != null && list4.size() > 1) {
                            linkedHashMap.put(Integer.valueOf(i8), saleProp2);
                        }
                        i8 = i9;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            if (!linkedHashMap.isEmpty()) {
                ProductPackStruct productPackStruct2 = getMViewModel().LJLLL;
                if (productPackStruct2 != null && (productBase = productPackStruct2.baseInfo) != null) {
                    sizeGuide = productBase.sizeGuide;
                } else {
                    sizeGuide = null;
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    int intValue = ((Number) entry.getKey()).intValue();
                    SaleProp saleProp3 = (SaleProp) entry.getValue();
                    View childAt = ((ViewGroup) _$_findCachedViewById(R.id.kau)).getChildAt(i5);
                    if ((childAt instanceof C70287RiF) && (c70287RiF = (C70287RiF) childAt) != null) {
                        SkuPanelState skuPanelState4 = getMViewModel().LJLLI;
                        if (skuPanelState4 != null) {
                            strArr2 = skuPanelState4.getCheckedSkuIds();
                        } else {
                            strArr2 = null;
                        }
                        ProductPackStruct productPackStruct3 = getMViewModel().LJLLL;
                        if (productPackStruct3 != null) {
                            list = productPackStruct3.skus;
                        } else {
                            list = null;
                        }
                        List LJIIIZ = C30591Hz.LJIIIZ(intValue, saleProp3, strArr2, list);
                        if (sizeGuide != null) {
                            str3 = sizeGuide.showSalePropId;
                        } else {
                            str3 = null;
                        }
                        if (o.LJ(str3, saleProp3.propId)) {
                            sizeGuide2 = sizeGuide;
                        } else {
                            sizeGuide2 = null;
                        }
                        c70287RiF.LJJLJLI(saleProp3.propName, LJIIIZ, intValue, sizeGuide2, false, new AqS159S0200000_12(sizeGuide, this, 40));
                    }
                    i5++;
                }
            }
        }
    }

    @Override // X.InterfaceC70291RiJ
    public final void onSpecItemBind(View view, int i, int i2, C70216Rh6 c70216Rh6) {
        if (view != null) {
            C78946Uyc.LJJIIJZLJL(view, new C70918RsQ(0), new AqS162S0100000_12(c70216Rh6, 542), new AqS14S0102000_12(i, i2, c70216Rh6, 2));
        }
    }
}
