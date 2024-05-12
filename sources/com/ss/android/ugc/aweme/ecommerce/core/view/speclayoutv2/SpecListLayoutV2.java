package com.ss.android.ugc.aweme.ecommerce.core.view.speclayoutv2;

import X.AnonymousClass636;
import X.C010402i;
import X.C16880lQ;
import X.C26706Ady;
import X.C32I;
import X.C47261Igj;
import X.C62850Ola;
import X.C69972RdA;
import X.C70058ReY;
import X.C70105RfJ;
import X.C70216Rh6;
import X.C70242RhW;
import X.C70243RhX;
import X.C70244RhY;
import X.C70246Rha;
import X.C70248Rhc;
import X.C70252Rhg;
import X.C70253Rhh;
import X.C70288RiG;
import X.C70289RiH;
import X.C70920RsS;
import X.C78946Uyc;
import X.C78996UzQ;
import X.C7MY;
import X.InterfaceC70059ReZ;
import X.InterfaceC70062Rec;
import X.InterfaceC70245RhZ;
import X.ORS;
import X.ORZ;
import X.OUP;
import X.RWJ;
import Y.ACListenerS46S0200000_12;
import Y.ARunnableS15S0201000_12;
import Y.IDObjectS326S0100000_1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.core.utils.ScrollTopLinearLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.core.view.skc.SkuFlowLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.GlobalSkuVH;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class SpecListLayoutV2 extends LinearLayout implements c {
    public Map<Integer, View> _$_findViewCache;
    public boolean firstInitData;
    public TuxTextView noticeTextView;
    public final LinkedList<C70248Rhc> scrapSpecLayouts;
    public SingleSpecLayoutV2 singleSpecLayoutView;
    public InterfaceC70062Rec transaction;
    public static final C70244RhY Companion = new C70244RhY();
    public static final int NORMAL_BOTTOM_MARGIN = C7MY.LIZIZ(32);
    public static final int LAST_BOTTOM_MARGIN = C7MY.LIZIZ(24);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpecListLayoutV2(Context context) {
        this(context, null, 0, 6, 0 == true ? 1 : 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpecListLayoutV2(Context context, AttributeSet attributeSet) {
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

    public final List<View> getSpecLayoutList() {
        return ORZ.LLJI(new IDObjectS326S0100000_1(this, 6));
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showSingleSpecView(List<SaleProp> list, SizeGuide sizeGuide) {
        if (this.singleSpecLayoutView == null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            this.singleSpecLayoutView = new SingleSpecLayoutV2(context, null, 0, 6, 0 == true ? 1 : 0);
        }
        SingleSpecLayoutV2 singleSpecLayoutV2 = this.singleSpecLayoutView;
        if (C78996UzQ.LJJIIJZLJL(singleSpecLayoutV2)) {
            C78996UzQ.LJI();
        }
        removeView(singleSpecLayoutV2);
        addView(this.singleSpecLayoutView);
        SingleSpecLayoutV2 singleSpecLayoutV22 = this.singleSpecLayoutView;
        if (singleSpecLayoutV22 != null) {
            singleSpecLayoutV22.initSingleSkuView(list, sizeGuide, new AqS159S0200000_12(this, sizeGuide, 27));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecListLayoutV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C62850Ola.LJFF(context, "context");
        this.scrapSpecLayouts = new LinkedList<>();
        this.firstInitData = true;
        setOrientation(1);
    }

    private final C70248Rhc getSpecLayoutView(int i, ISpecListLayoutStyle iSpecListLayoutStyle, int i2) {
        C70248Rhc c70248Rhc = (C70248Rhc) ORS.LJJLJLI(this.scrapSpecLayouts);
        if (c70248Rhc == null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            c70248Rhc = new C70248Rhc(context);
        }
        c70248Rhc.setLayoutParams(new C010402i(-1, -2));
        int i3 = 0;
        if (iSpecListLayoutStyle.getShowDividerLine()) {
            OUP.LJJJJI(0, c70248Rhc);
        } else {
            if (i >= 0 && i < i2 - 1) {
                GlobalSkuVH.Companion.getClass();
                i3 = GlobalSkuVH.NORMAL_BOTTOM_MARGIN;
            }
            if (i == i2 - 1) {
                GlobalSkuVH.Companion.getClass();
                i3 = GlobalSkuVH.LAST_BOTTOM_MARGIN;
            }
            OUP.LJJJJI(i3, c70248Rhc);
        }
        return c70248Rhc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void tryShowLowStockHintView(boolean r7, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem> r8, java.util.List<java.lang.String> r9) {
        /*
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            com.bytedance.tux.input.TuxTextView r0 = r6.noticeTextView
            r3 = 0
            r4 = 0
            if (r0 != 0) goto L25
            com.bytedance.tux.input.TuxTextView r2 = new com.bytedance.tux.input.TuxTextView
            android.content.Context r1 = r6.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r0 = 6
            r2.<init>(r1, r4, r0, r3)
            r0 = 51
            r2.setTuxFont(r0)
            r0 = 2130968670(0x7f04005e, float:1.7546E38)
            r2.setTextColorRes(r0)
            r6.noticeTextView = r2
        L25:
            com.bytedance.tux.input.TuxTextView r1 = r6.noticeTextView
            boolean r0 = X.C78996UzQ.LJJIIJZLJL(r1)
            if (r0 == 0) goto L30
            X.C78996UzQ.LJI()
        L30:
            r6.removeView(r1)
            com.bytedance.tux.input.TuxTextView r0 = r6.noticeTextView
            r6.addView(r0)
            com.bytedance.tux.input.TuxTextView r5 = r6.noticeTextView
            if (r5 != 0) goto L93
        L3c:
            if (r9 == 0) goto L48
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r0 = r9.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 != 0) goto L4a
        L48:
            java.lang.String[] r0 = new java.lang.String[r3]
        L4a:
            java.lang.String r0 = X.C63122Opy.LIZ(r0)
            if (r8 != 0) goto L52
            X.OQg r8 = X.C61878OQg.INSTANCE
        L52:
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem r1 = X.RXW.LIZJ(r0, r8)
            if (r1 == 0) goto L82
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice r0 = r1.purchaseNotice
            if (r0 == 0) goto L84
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice r0 = r1.purchaseNotice
            java.lang.String r4 = r0.desc
        L60:
            boolean r0 = X.C78685UuP.LJJJZ(r4)
            if (r0 == 0) goto L77
            com.bytedance.tux.input.TuxTextView r0 = r6.noticeTextView
            if (r0 != 0) goto L73
        L6a:
            com.bytedance.tux.input.TuxTextView r0 = r6.noticeTextView
            if (r0 != 0) goto L6f
        L6e:
            return
        L6f:
            r0.setVisibility(r3)
            goto L6e
        L73:
            r0.setText(r4)
            goto L6a
        L77:
            com.bytedance.tux.input.TuxTextView r1 = r6.noticeTextView
            if (r1 != 0) goto L7c
            goto L6e
        L7c:
            r0 = 8
            r1.setVisibility(r0)
            goto L6e
        L82:
            r0 = r4
            goto L88
        L84:
            if (r1 == 0) goto L82
            java.lang.String r0 = r1.lowStockWarning
        L88:
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L60
            if (r1 == 0) goto L60
            java.lang.String r4 = r1.lowStockWarning
            goto L60
        L93:
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r0 = -2
            r2.<init>(r1, r0)
            r0 = 24
            int r0 = X.C7MY.LIZIZ(r0)
            r2.bottomMargin = r0
            r5.setLayoutParams(r2)
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.view.speclayoutv2.SpecListLayoutV2.tryShowLowStockHintView(boolean, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindData(RWJ vo, C70243RhX params, InterfaceC70059ReZ interfaceC70059ReZ) {
        int i;
        InterfaceC70062Rec c70105RfJ;
        String str;
        o.LJIIIZ(vo, "vo");
        o.LJIIIZ(params, "params");
        LinkedList<C70248Rhc> linkedList = this.scrapSpecLayouts;
        while (true) {
            i = 0;
            if (getChildCount() <= 0) {
                break;
            }
            View childAt = getChildAt(0);
            C16880lQ.LJLLL(childAt, this);
            if (childAt instanceof C70248Rhc) {
                linkedList.add(childAt);
            }
        }
        List<SaleProp> list = vo.LIZ;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.firstInitData) {
            SkcInfo skcInfo = vo.LIZIZ;
            if (skcInfo == null || (str = skcInfo.skcPropertyId) == null || ujb.o.LJJJJJL(str)) {
                c70105RfJ = new C70105RfJ(interfaceC70059ReZ);
            } else {
                c70105RfJ = new C70058ReY(interfaceC70059ReZ);
            }
            this.transaction = c70105RfJ;
            c70105RfJ.onSpecListLayoutBind(this, vo);
            this.firstInitData = false;
        }
        List<List<C70216Rh6>> arrayList = new ArrayList<>();
        if (params.LIZ.getFoldSingleSpec()) {
            ArrayList arrayList2 = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i2 = 0;
            for (SaleProp saleProp : vo.LIZ) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    SaleProp saleProp2 = saleProp;
                    List<SalePropValue> list2 = saleProp2.salePropValueList;
                    if (list2 != null && list2.size() == 1) {
                        arrayList2.add(saleProp2);
                    } else {
                        List<SalePropValue> list3 = saleProp2.salePropValueList;
                        if (list3 != null && list3.size() > 1) {
                            linkedHashMap.put(Integer.valueOf(i2), saleProp2);
                        }
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            if (arrayList2.size() >= 1) {
                showSingleSpecView(arrayList2, vo.LJ);
            }
            if (!linkedHashMap.isEmpty()) {
                showNormalSpecLayouts(linkedHashMap, vo.LJ, vo.LIZIZ, vo.LIZJ, vo.LJFF, arrayList, params);
            }
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (SaleProp saleProp3 : vo.LIZ) {
                int i4 = i + 1;
                if (i >= 0) {
                    linkedHashMap2.put(Integer.valueOf(i), saleProp3);
                    i = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            showNormalSpecLayouts(linkedHashMap2, vo.LJ, vo.LIZIZ, vo.LIZJ, vo.LJFF, arrayList, params);
        }
        tryShowLowStockHintView(params.LIZ.getShowLowStockView(), vo.LIZJ, vo.LJFF);
    }

    public /* synthetic */ SpecListLayoutV2(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final List<C70216Rh6> genItemInfoList(int i, SaleProp saleProp, SkcInfo skcInfo, List<SkuItem> list, List<String> list2) {
        String str;
        C70216Rh6 c70216Rh6;
        boolean z;
        String[] strArr;
        String[] strArr2;
        Image image;
        List<Skc> list3;
        Skc skc;
        ArrayList arrayList = new ArrayList();
        List<SalePropValue> list4 = saleProp.salePropValueList;
        if (list4 != null && !list4.isEmpty()) {
            int i2 = 0;
            for (SalePropValue salePropValue : list4) {
                int i3 = i2 + 1;
                Object obj = null;
                if (i2 >= 0) {
                    SalePropValue salePropValue2 = salePropValue;
                    if (salePropValue2.propValueId != null && salePropValue2.propValue != null) {
                        if (skcInfo != null) {
                            str = skcInfo.skcPropertyId;
                        } else {
                            str = null;
                        }
                        boolean LJ = o.LJ(str, saleProp.propId);
                        if (i == 0 && o.LJ(saleProp.hasImage, Boolean.TRUE)) {
                            String str2 = salePropValue2.propValueId;
                            String str3 = salePropValue2.propValue;
                            if (LJ) {
                                if (skcInfo != null && (list3 = skcInfo.skcList) != null && (skc = (Skc) ORZ.LJLLLLLL(i2, list3)) != null) {
                                    image = skc.colorBlockImage;
                                } else {
                                    image = null;
                                }
                            } else {
                                image = salePropValue2.image;
                            }
                            c70216Rh6 = new C70216Rh6(str2, str3, image, LJ);
                        } else {
                            c70216Rh6 = new C70216Rh6(salePropValue2.propValueId, salePropValue2.propValue, null, false);
                        }
                        InterfaceC70062Rec interfaceC70062Rec = this.transaction;
                        if (interfaceC70062Rec != null) {
                            if (list2 != null && (strArr2 = (String[]) list2.toArray(new String[0])) != null) {
                                Object[] copyOf = Arrays.copyOf(strArr2, strArr2.length);
                                o.LJIIIIZZ(copyOf, "copyOf(this, size)");
                                strArr = (String[]) copyOf;
                            } else {
                                strArr = null;
                            }
                            z = interfaceC70062Rec.LLLLLLZ(strArr, i, salePropValue2.propValueId, list);
                        } else {
                            z = false;
                        }
                        c70216Rh6.LJ = z;
                        if (list2 != null) {
                            obj = ORZ.LJLLLLLL(i, list2);
                        }
                        c70216Rh6.LJFF = o.LJ(obj, salePropValue2.propValueId);
                        arrayList.add(c70216Rh6);
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return arrayList;
    }

    private final void showNormalSpecLayouts(Map<Integer, SaleProp> map, SizeGuide sizeGuide, SkcInfo skcInfo, List<SkuItem> list, List<String> list2, List<List<C70216Rh6>> list3, C70243RhX c70243RhX) {
        String str;
        SizeGuide sizeGuide2;
        String str2;
        int i;
        String str3;
        List<SalePropValue> list4;
        InterfaceC70245RhZ c70288RiG;
        boolean z;
        boolean z2;
        List<C70216Rh6> list5;
        boolean z3;
        boolean z4;
        for (Map.Entry<Integer, SaleProp> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            SaleProp value = entry.getValue();
            C70248Rhc specLayoutView = getSpecLayoutView(intValue, c70243RhX.LIZ, map.size());
            specLayoutView.setSpecListener(this.transaction);
            List<C70216Rh6> genItemInfoList = genItemInfoList(intValue, value, skcInfo, list, list2);
            list3.add(genItemInfoList);
            if (sizeGuide != null) {
                str = sizeGuide.showSalePropId;
            } else {
                str = null;
            }
            if (o.LJ(str, value.propId)) {
                sizeGuide2 = sizeGuide;
            } else {
                sizeGuide2 = null;
            }
            ISpecListLayoutStyle iSpecListLayoutStyle = c70243RhX.LIZ;
            if (skcInfo != null) {
                str2 = skcInfo.skcPropertyId;
            } else {
                str2 = null;
            }
            C70242RhW c70242RhW = new C70242RhW(iSpecListLayoutStyle, o.LJ(str2, value.propId), c70243RhX.LIZ.getForceFlowLayout(), c70243RhX.LIZ.getImageItemCountAdapt(), c70243RhX.LIZIZ);
            specLayoutView.LJLJJI = genItemInfoList;
            specLayoutView.LJLJJL = intValue;
            specLayoutView.LJLILLLLZI = -1;
            ISpecListLayoutStyle iSpecListLayoutStyle2 = c70242RhW.LIZ;
            ((TextView) specLayoutView.LIZ(R.id.k9f)).setText(value.propName);
            ((TuxTextView) specLayoutView.LIZ(R.id.k9f)).setTuxFont(iSpecListLayoutStyle2.getGroupTitleFont());
            TextView textView = (TextView) specLayoutView.LIZ(R.id.k9f);
            Context context = specLayoutView.getContext();
            o.LJIIIIZZ(context, "context");
            textView.setTextColor(AnonymousClass636.LJIIIIZZ(iSpecListLayoutStyle2.getGroupTitleColor(), context));
            String string = specLayoutView.getContext().getString(R.string.sly);
            o.LJIIIIZZ(string, "context.getString(R.stri…_us_option_please_select)");
            if (genItemInfoList != null) {
                int i2 = 0;
                for (C70216Rh6 c70216Rh6 : genItemInfoList) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C70216Rh6 c70216Rh62 = c70216Rh6;
                        if (c70216Rh62.LJFF) {
                            specLayoutView.LJLILLLLZI = i2;
                            string = c70216Rh62.LIZIZ;
                        }
                        i2 = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            if (iSpecListLayoutStyle2.getGroupValueVisibility() == 0) {
                specLayoutView.LIZ(R.id.k9h).setVisibility(0);
                specLayoutView.LIZ(R.id.k9e).setVisibility(0);
                ((TextView) specLayoutView.LIZ(R.id.k9h)).setText(string);
                ((TuxTextView) specLayoutView.LIZ(R.id.k9h)).setTuxFont(iSpecListLayoutStyle2.getGroupValueFont());
                TextView textView2 = (TextView) specLayoutView.LIZ(R.id.k9h);
                Context context2 = specLayoutView.getContext();
                o.LJIIIIZZ(context2, "context");
                textView2.setTextColor(AnonymousClass636.LJIIIIZZ(iSpecListLayoutStyle2.getGroupValueColor(), context2));
            } else {
                specLayoutView.LIZ(R.id.k9h).setVisibility(8);
                specLayoutView.LIZ(R.id.k9e).setVisibility(8);
            }
            if (value.showType == 1 || c70242RhW.LIZJ) {
                if (!(((RecyclerView) specLayoutView.LIZ(R.id.k9c)).getLayoutManager() instanceof SkuFlowLayoutManager)) {
                    SkuFlowLayoutManager skuFlowLayoutManager = new SkuFlowLayoutManager();
                    if (c70242RhW.LIZIZ) {
                        skuFlowLayoutManager.LJLZ = C7MY.LIZIZ(10);
                    } else {
                        skuFlowLayoutManager.LJLZ = iSpecListLayoutStyle2.getSpecVerticalMargin();
                    }
                    ((RecyclerView) specLayoutView.LIZ(R.id.k9c)).setLayoutManager(skuFlowLayoutManager);
                }
            } else if (!(((RecyclerView) specLayoutView.LIZ(R.id.k9c)).getLayoutManager() instanceof ScrollTopLinearLayoutManager)) {
                RecyclerView recyclerView = (RecyclerView) specLayoutView.LIZ(R.id.k9c);
                Context context3 = specLayoutView.getContext();
                o.LJIIIIZZ(context3, "context");
                ScrollTopLinearLayoutManager scrollTopLinearLayoutManager = new ScrollTopLinearLayoutManager(context3);
                scrollTopLinearLayoutManager.LLJJIII(0);
                recyclerView.setLayoutManager(scrollTopLinearLayoutManager);
            }
            View divide_line_view = specLayoutView.LIZ(R.id.cd7);
            o.LJIIIIZZ(divide_line_view, "divide_line_view");
            if (iSpecListLayoutStyle2.getShowDividerLine()) {
                i = 0;
            } else {
                i = 8;
            }
            divide_line_view.setVisibility(i);
            if (sizeGuide2 != null) {
                View commerce_size_guide_container = specLayoutView.LIZ(R.id.bo8);
                o.LJIIIIZZ(commerce_size_guide_container, "commerce_size_guide_container");
                commerce_size_guide_container.setVisibility(0);
                ((ViewGroup) specLayoutView.LIZ(R.id.bo8)).removeAllViews();
                ViewGroup commerce_size_guide_container2 = (ViewGroup) specLayoutView.LIZ(R.id.bo8);
                o.LJIIIIZZ(commerce_size_guide_container2, "commerce_size_guide_container");
                View createSizeGuideView = iSpecListLayoutStyle2.createSizeGuideView(commerce_size_guide_container2, sizeGuide2);
                if (createSizeGuideView != null) {
                    createSizeGuideView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    C78946Uyc.LJJIIJZLJL(createSizeGuideView, new C70920RsS(), C70246Rha.LJLIL, C69972RdA.LJLIL);
                    C16880lQ.LJIIJ(new ACListenerS46S0200000_12(specLayoutView, sizeGuide2, 56), createSizeGuideView);
                    ((ViewGroup) specLayoutView.LIZ(R.id.bo8)).addView(createSizeGuideView);
                }
            } else {
                View commerce_size_guide_container3 = specLayoutView.LIZ(R.id.bo8);
                o.LJIIIIZZ(commerce_size_guide_container3, "commerce_size_guide_container");
                commerce_size_guide_container3.setVisibility(8);
            }
            int i4 = specLayoutView.LJLILLLLZI;
            List<C70216Rh6> list6 = specLayoutView.LJLJJI;
            if (list6 != null) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(list6, 10));
                int i5 = 0;
                for (C70216Rh6 c70216Rh63 : list6) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        C70216Rh6 c70216Rh64 = c70216Rh63;
                        if (c70216Rh64.LIZLLL) {
                            String str4 = c70216Rh64.LIZ;
                            Image image = c70216Rh64.LIZJ;
                            String str5 = c70216Rh64.LIZIZ;
                            boolean z5 = c70216Rh64.LJ;
                            if (i5 == i4) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            c70288RiG = new C70253Rhh(str4, image, str5, z5, z4);
                        } else if (c70216Rh64.LIZJ != null) {
                            if (c70242RhW.LIZLLL && (list5 = specLayoutView.LJLJJI) != null && list5.size() > 6) {
                                Image image2 = c70216Rh64.LIZJ;
                                String str6 = c70216Rh64.LIZIZ;
                                boolean z6 = c70216Rh64.LJ;
                                if (i5 == i4) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                c70288RiG = new C70252Rhg(image2, str6, z6, z3);
                            } else {
                                Image image3 = c70216Rh64.LIZJ;
                                String str7 = c70216Rh64.LIZIZ;
                                boolean z7 = c70216Rh64.LJ;
                                if (i5 == i4) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                c70288RiG = new C70289RiH(image3, str7, z7, z2);
                            }
                        } else {
                            String str8 = c70216Rh64.LIZIZ;
                            boolean z8 = c70216Rh64.LJ;
                            if (i5 == i4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c70288RiG = new C70288RiG(str8, z8, z);
                        }
                        c70288RiG.LJLJLJ(c70242RhW.LIZ.getSpecItemStyle());
                        c70288RiG.LJJLIIIIJ(c70242RhW.LJFF);
                        arrayList.add(c70288RiG);
                        i5 = i6;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                str3 = null;
                specLayoutView.LJLJLLL.submitList(arrayList, new ARunnableS15S0201000_12(i4, specLayoutView, c70242RhW, 2));
            } else {
                str3 = null;
            }
            specLayoutView.LJLJLLL.setListener(specLayoutView);
            if (specLayoutView.LJLL) {
                InterfaceC70059ReZ interfaceC70059ReZ = specLayoutView.LJLIL;
                if (interfaceC70059ReZ != null) {
                    interfaceC70059ReZ.onSpecLayoutBind(specLayoutView, intValue, specLayoutView.LJLJJI);
                }
                specLayoutView.LJLL = false;
            }
            addView(specLayoutView);
            String str9 = value.propId;
            if (skcInfo != null) {
                str3 = skcInfo.skcPropertyId;
            }
            if (o.LJ(str9, str3) && (list4 = value.salePropValueList) != null && list4.size() == 1) {
                specLayoutView.setVisibility(8);
            }
        }
    }
}
